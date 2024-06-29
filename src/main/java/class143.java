import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class143 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "[[I")
    public int[][] field1833;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI)V")
    public final void method770(int arg0, byte arg1, int arg2) {
        field1835++;
        int var4 = arg0 - this.field1839;
        int var5 = arg2 - this.field1822;
        if (arg1 != -61) {
            this.method775(85, 13, -41, -98, 32, 38, -85, -48);
        }
        this.field1833[var5][var4] = method783(this.field1833[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public final void method771(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1822;
        if (arg0 != 25949) {
            this.field1825 = -92;
        }
        field1843++;
        int var5 = arg1 - this.field1839;
        this.field1833[var4][var5] = class292.method1790(this.field1833[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1827++;
        if (arg4 == 1) {
            if (arg2 == arg6 && arg1 == arg7) {
                return true;
            }
        } else if (arg2 <= arg6 && arg2 + arg4 - 1 >= arg6 && arg7 >= arg7 && arg4 + arg7 - 1 >= arg7) {
            return true;
        }
        int var9 = arg2 - this.field1822;
        int var10 = arg7 - this.field1839;
        if (arg3 != 0) {
            return false;
        }
        int var11 = arg6 - this.field1822;
        int var12 = arg1 - this.field1839;
        if (arg4 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field1833[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field1833[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field1833[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field1833[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field1833[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1833[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1833[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field1833[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field1833[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field1833[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field1833[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field1833[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var9 - 1;
            int var14 = var12 + arg4 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var9 && var10 >= var12 && var14 >= var10 && (this.field1833[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 - arg4) == var12 && (this.field1833[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var11 - arg4) == var9 && var12 <= var10 && var14 >= var10 && (this.field1833[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var10 - arg4 == var12 && (this.field1833[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - arg4 == var9 && var12 <= var10 && var10 <= var14 && (this.field1833[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field1833[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var9 && var12 <= var10 && var10 <= var14 && (this.field1833[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 + 1 == var12 && (this.field1833[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field1833[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var13 && (var10 - arg4) == var12 && (this.field1833[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg4 == var9 && var10 >= var12 && var14 >= var10 && (this.field1833[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 >= var12 && var14 >= var10 && (this.field1833[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)V")
    public final void method773(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field1839;
        int var5 = arg1 - this.field1822;
        if (arg2 < 85) {
            this.field1839 = -56;
        }
        field1826++;
        this.field1833[var5][var4] = class292.method1790(this.field1833[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([BIIII[BIIB)V")
    public static final void method774(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, byte arg8) {
        field1834++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg0[var10001] += arg5[arg4++];
                int var14 = arg3++;
                arg0[var14] += arg5[arg4++];
                int var15 = arg3++;
                arg0[var15] += arg5[arg4++];
                int var16 = arg3++;
                arg0[var16] += arg5[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg0[var10001] += arg5[arg4++];
            }
            arg4 += arg2;
            arg3 += arg6;
        }
        if (arg8 < -44) {
            ;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1842++;
        if (arg0 == 1) {
            if (arg2 == arg5 && arg4 == arg7) {
                return true;
            }
        } else if (arg5 >= arg2 && arg5 <= (arg0 + arg2 - 1) && arg7 >= arg7 && arg7 <= arg7 - (1 - arg0)) {
            return true;
        }
        int var9 = arg7 - this.field1839;
        int var10 = arg5 - this.field1822;
        int var11 = arg2 - this.field1822;
        int var12 = arg4 - this.field1839;
        if (arg0 == 1) {
            if (arg6 == 0) {
                if (arg1 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field1833[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field1833[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field1833[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field1833[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field1833[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field1833[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field1833[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field1833[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field1833[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var9 - 1) == var12 && (this.field1833[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field1833[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = arg0 + var12 - 1;
            if (arg6 == 0) {
                if (arg1 == 0) {
                    if ((var10 - arg0) == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 + 1) == var12 && (this.field1833[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg0) == var12 && (this.field1833[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 <= var10 && var10 <= var13 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 - arg0) == var11 && var9 >= var12 && var14 >= var9 && (this.field1833[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14 && (this.field1833[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12 && (this.field1833[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg0) == var12 && (this.field1833[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg0) == var12) {
                        return true;
                    }
                    if ((var10 - arg0) == var11 && var9 >= var12 && var14 >= var9 && (this.field1833[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 <= var9 && var14 >= var9 && (this.field1833[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    if ((var10 - arg0) == var11 && var9 >= var12 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9 && (this.field1833[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 - arg0 == var12 && (this.field1833[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - arg0 == var11 && var12 <= var9 && var9 <= var14 && (this.field1833[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg0 == var12 && (this.field1833[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - arg0 == var11 && var9 >= var12 && var9 <= var14 && (this.field1833[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12 && (this.field1833[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg0) == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 - arg0) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 + 1 == var12 && (this.field1833[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14 && (this.field1833[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 - arg0 == var12) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12 && (this.field1833[var10][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var10 && var10 <= var13 && (var9 - arg0) == var12 && (this.field1833[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg0) == var11 && var9 >= var12 && var14 >= var9 && (this.field1833[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14 && (this.field1833[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 != 18906) {
            this.method772(22, -36, -76, -40, 18, -126, 53, -94);
        }
        return false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
    private final void method776(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 107) {
            this.field1833[arg3][arg0] = class292.method1790(this.field1833[arg3][arg0], arg2);
            field1830++;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZIZII)V")
    public final void method777(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1828++;
        int var8 = arg5 - this.field1822;
        int var9 = arg6 - this.field1839;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method781(31763, 128, var8, var9);
                this.method781(31763, 8, var8 - 1, var9);
            }
            if (arg0 == 1) {
                this.method781(31763, 2, var8, var9);
                this.method781(31763, 32, var8, var9 + 1);
            }
            if (arg0 == 2) {
                this.method781(31763, 8, var8, var9);
                this.method781(arg1 + 31761, 128, var8 + 1, var9);
            }
            if (arg0 == 3) {
                this.method781(arg1 ^ 0x7C11, 32, var8, var9);
                this.method781(31763, 2, var8, var9 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method781(31763, 1, var8, var9);
                this.method781(31763, 16, var8 - 1, var9 - -1);
            }
            if (arg0 == 1) {
                this.method781(arg1 + 31761, 4, var8, var9);
                this.method781(31763, 64, var8 + 1, var9 + 1);
            }
            if (arg0 == 2) {
                this.method781(arg1 + 31761, 16, var8, var9);
                this.method781(31763, 1, var8 + 1, var9 + -1);
            }
            if (arg0 == 3) {
                this.method781(31763, 64, var8, var9);
                this.method781(31763, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg1 == arg3) {
            if (arg0 == 0) {
                this.method781(31763, 130, var8, var9);
                this.method781(arg1 ^ 0x7C11, 8, var8 - 1, var9);
                this.method781(arg1 ^ 0x7C11, 32, var8, var9 + 1);
            }
            if (arg0 == 1) {
                this.method781(31763, 10, var8, var9);
                this.method781(31763, 32, var8, var9 + 1);
                this.method781(31763, 128, var8 + 1, var9);
            }
            if (arg0 == 2) {
                this.method781(31763, 40, var8, var9);
                this.method781(31763, 128, var8 + 1, var9);
                this.method781(31763, 2, var8, var9 - 1);
            }
            if (arg0 == 3) {
                this.method781(31763, 160, var8, var9);
                this.method781(31763, 2, var8, var9 - 1);
                this.method781(31763, 8, var8 - 1, var9);
            }
        }
        if (arg4) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method781(arg1 + 31761, 65536, var8, var9);
                    this.method781(arg1 ^ 0x7C11, 4096, var8 - 1, var9);
                }
                if (arg0 == 1) {
                    this.method781(arg1 + 31761, 1024, var8, var9);
                    this.method781(31763, 16384, var8, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method781(31763, 4096, var8, var9);
                    this.method781(31763, 65536, var8 + 1, var9);
                }
                if (arg0 == 3) {
                    this.method781(31763, 16384, var8, var9);
                    this.method781(arg1 + 31761, 1024, var8, var9 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method781(31763, 512, var8, var9);
                    this.method781(31763, 8192, var8 - 1, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method781(31763, 2048, var8, var9);
                    this.method781(31763, 32768, var8 + 1, var9 - -1);
                }
                if (arg0 == 2) {
                    this.method781(arg1 ^ 0x7C11, 8192, var8, var9);
                    this.method781(31763, 512, var8 + 1, var9 + -1);
                }
                if (arg0 == 3) {
                    this.method781(31763, 32768, var8, var9);
                    this.method781(31763, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method781(arg1 ^ 0x7C11, 66560, var8, var9);
                    this.method781(31763, 4096, var8 - 1, var9);
                    this.method781(31763, 16384, var8, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method781(31763, 5120, var8, var9);
                    this.method781(31763, 16384, var8, var9 + 1);
                    this.method781(31763, 65536, var8 + 1, var9);
                }
                if (arg0 == 2) {
                    this.method781(arg1 + 31761, 20480, var8, var9);
                    this.method781(31763, 65536, var8 + 1, var9);
                    this.method781(31763, 1024, var8, var9 - 1);
                }
                if (arg0 == 3) {
                    this.method781(31763, 81920, var8, var9);
                    this.method781(31763, 1024, var8, var9 - 1);
                    this.method781(31763, 4096, var8 - 1, var9);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method781(31763, 536870912, var8, var9);
                this.method781(31763, 33554432, var8 - 1, var9);
            }
            if (arg0 == 1) {
                this.method781(arg1 ^ 0x7C11, 8388608, var8, var9);
                this.method781(31763, 134217728, var8, var9 + 1);
            }
            if (arg0 == 2) {
                this.method781(arg1 ^ 0x7C11, 33554432, var8, var9);
                this.method781(31763, 536870912, var8 + 1, var9);
            }
            if (arg0 == 3) {
                this.method781(31763, 134217728, var8, var9);
                this.method781(31763, 8388608, var8, var9 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method781(arg1 ^ 0x7C11, 4194304, var8, var9);
                this.method781(31763, 67108864, var8 - 1, var9 + 1);
            }
            if (arg0 == 1) {
                this.method781(arg1 ^ 0x7C11, 16777216, var8, var9);
                this.method781(31763, 268435456, var8 + 1, var9 + 1);
            }
            if (arg0 == 2) {
                this.method781(31763, 67108864, var8, var9);
                this.method781(31763, 4194304, var8 + 1, var9 + -1);
            }
            if (arg0 == 3) {
                this.method781(31763, 268435456, var8, var9);
                this.method781(31763, 16777216, var8 - 1, var9 + -1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method781(31763, 545259520, var8, var9);
            this.method781(31763, 33554432, var8 - 1, var9);
            this.method781(arg1 ^ 0x7C11, 134217728, var8, var9 + 1);
        }
        if (arg0 == 1) {
            this.method781(31763, 41943040, var8, var9);
            this.method781(arg1 ^ 0x7C11, 134217728, var8, var9 + 1);
            this.method781(31763, 536870912, var8 + 1, var9);
        }
        if (arg0 == 2) {
            this.method781(31763, 167772160, var8, var9);
            this.method781(31763, 536870912, var8 + 1, var9);
            this.method781(arg1 ^ 0x7C11, 8388608, var8, var9 - 1);
        }
        if (arg0 == 3) {
            this.method781(31763, 671088640, var8, var9);
            this.method781(31763, 8388608, var8, var9 - 1);
            this.method781(31763, 33554432, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIB)V")
    public final void method778(int arg0, int arg1, byte arg2) {
        field1838++;
        if (arg2 != 107) {
            this.field1839 = 7;
        }
        int var4 = arg1 - this.field1822;
        int var5 = arg0 - this.field1839;
        this.field1833[var4][var5] = method783(this.field1833[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZIIIZ)V")
    public final void method779(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1823++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field1822;
        int var10 = arg3 - this.field1839;
        if (arg0 <= 23) {
            this.method776(41, 87, 104, 120);
        }
        if (arg2) {
            var8 |= 0x40000000;
        }
        for (int var11 = var9; var11 < (arg1 + var9); var11++) {
            if (var11 >= 0 && var11 < this.field1825) {
                for (int var12 = var10; var12 < (arg5 + var10); var12++) {
                    if (var12 >= 0 && this.field1841 > var12) {
                        this.method776(var12, 107, var8, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)Z")
    public static final boolean method780(int arg0, int arg1, int arg2) {
        if (arg2 == -10181) {
            field1831++;
            return class136.method715(arg1, arg0, 122) & (class83.method468(true, arg0, arg1) | (arg0 & 0x2000) != 0 | class168.method1001(arg1, arg2 ^ 0x27C4, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIII)V")
    private final void method781(int arg0, int arg1, int arg2, int arg3) {
        field1829++;
        if (arg0 != 31763) {
            this.field1825 = -16;
        }
        this.field1833[arg2][arg3] = method783(this.field1833[arg2][arg3], ~arg1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIZIIZI)V")
    public final void method782(byte arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field1822;
        int var9 = arg6 - this.field1839;
        field1824++;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method776(var9, 107, 128, var8);
                this.method776(var9, 107, 8, var8 - 1);
            }
            if (arg1 == 1) {
                this.method776(var9, 107, 2, var8);
                this.method776(var9 + 1, 107, 32, var8);
            }
            if (arg1 == 2) {
                this.method776(var9, 107, 8, var8);
                this.method776(var9, 107, 128, var8 + 1);
            }
            if (arg1 == 3) {
                this.method776(var9, 107, 32, var8);
                this.method776(var9 - 1, 107, 2, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method776(var9, 107, 1, var8);
                this.method776(var9 + 1, 107, 16, var8 - 1);
            }
            if (arg1 == 1) {
                this.method776(var9, 107, 4, var8);
                this.method776(var9 + 1, 107, 64, var8 + 1);
            }
            if (arg1 == 2) {
                this.method776(var9, 107, 16, var8);
                this.method776(var9 - 1, 107, 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method776(var9, 107, 64, var8);
                this.method776(var9 - 1, 107, 4, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method776(var9, 107, 130, var8);
                this.method776(var9, 107, 8, var8 - 1);
                this.method776(var9 + 1, 107, 32, var8);
            }
            if (arg1 == 1) {
                this.method776(var9, 107, 10, var8);
                this.method776(var9 + 1, 107, 32, var8);
                this.method776(var9, 107, 128, var8 + 1);
            }
            if (arg1 == 2) {
                this.method776(var9, 107, 40, var8);
                this.method776(var9, 107, 128, var8 + 1);
                this.method776(var9 - 1, 107, 2, var8);
            }
            if (arg1 == 3) {
                this.method776(var9, 107, 160, var8);
                this.method776(var9 - 1, 107, 2, var8);
                this.method776(var9, 107, 8, var8 - 1);
            }
        }
        int var10 = 24 % ((arg0 - 66) / 52);
        if (arg5) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method776(var9, 107, 65536, var8);
                    this.method776(var9, 107, 4096, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method776(var9, 107, 1024, var8);
                    this.method776(var9 + 1, 107, 16384, var8);
                }
                if (arg1 == 2) {
                    this.method776(var9, 107, 4096, var8);
                    this.method776(var9, 107, 65536, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method776(var9, 107, 16384, var8);
                    this.method776(var9 - 1, 107, 1024, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method776(var9, 107, 512, var8);
                    this.method776(var9 + 1, 107, 8192, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method776(var9, 107, 2048, var8);
                    this.method776(var9 + 1, 107, 32768, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method776(var9, 107, 8192, var8);
                    this.method776(var9 - 1, 107, 512, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method776(var9, 107, 32768, var8);
                    this.method776(var9 - 1, 107, 2048, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method776(var9, 107, 66560, var8);
                    this.method776(var9, 107, 4096, var8 - 1);
                    this.method776(var9 + 1, 107, 16384, var8);
                }
                if (arg1 == 1) {
                    this.method776(var9, 107, 5120, var8);
                    this.method776(var9 + 1, 107, 16384, var8);
                    this.method776(var9, 107, 65536, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method776(var9, 107, 20480, var8);
                    this.method776(var9, 107, 65536, var8 + 1);
                    this.method776(var9 - 1, 107, 1024, var8);
                }
                if (arg1 == 3) {
                    this.method776(var9, 107, 81920, var8);
                    this.method776(var9 - 1, 107, 1024, var8);
                    this.method776(var9, 107, 4096, var8 - 1);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method776(var9, 107, 536870912, var8);
                this.method776(var9, 107, 33554432, var8 - 1);
            }
            if (arg1 == 1) {
                this.method776(var9, 107, 8388608, var8);
                this.method776(var9 + 1, 107, 134217728, var8);
            }
            if (arg1 == 2) {
                this.method776(var9, 107, 33554432, var8);
                this.method776(var9, 107, 536870912, var8 + 1);
            }
            if (arg1 == 3) {
                this.method776(var9, 107, 134217728, var8);
                this.method776(var9 - 1, 107, 8388608, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method776(var9, 107, 4194304, var8);
                this.method776(var9 + 1, 107, 67108864, var8 - 1);
            }
            if (arg1 == 1) {
                this.method776(var9, 107, 16777216, var8);
                this.method776(var9 + 1, 107, 268435456, var8 + 1);
            }
            if (arg1 == 2) {
                this.method776(var9, 107, 67108864, var8);
                this.method776(var9 - 1, 107, 4194304, var8 + 1);
            }
            if (arg1 == 3) {
                this.method776(var9, 107, 268435456, var8);
                this.method776(var9 - 1, 107, 16777216, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method776(var9, 107, 545259520, var8);
            this.method776(var9, 107, 33554432, var8 - 1);
            this.method776(var9 + 1, 107, 134217728, var8);
        }
        if (arg1 == 1) {
            this.method776(var9, 107, 41943040, var8);
            this.method776(var9 + 1, 107, 134217728, var8);
            this.method776(var9, 107, 536870912, var8 + 1);
        }
        if (arg1 == 2) {
            this.method776(var9, 107, 167772160, var8);
            this.method776(var9, 107, 536870912, var8 + 1);
            this.method776(var9 - 1, 107, 8388608, var8);
        }
        if (arg1 == 3) {
            this.method776(var9, 107, 671088640, var8);
            this.method776(var9 - 1, 107, 8388608, var8);
            this.method776(var9, 107, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I")
    public static int method783(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1832++;
        if (arg8 > 1) {
            return class113.method610(74, arg8, arg5, arg8, arg3, arg6, arg0, arg4, arg2) ? true : this.method786(arg5, arg6, arg4, arg0, arg8, arg8, (byte) 83, arg3, arg1, arg2);
        }
        int var10 = arg6 - (1 - arg0);
        int var11 = arg3 + arg4 - 1;
        if (arg6 <= arg2 && arg2 <= var10 && arg3 <= arg5 && arg5 <= var11) {
            return true;
        } else if (arg6 - 1 == arg2 && arg5 >= arg3 && arg5 <= var11 && (this.field1833[arg2 - this.field1822][arg5 - this.field1839] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg2 && arg5 >= arg3 && var11 >= arg5 && (this.field1833[arg2 - this.field1822][arg5 - this.field1839] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else {
            if (arg7 != 8) {
                this.field1833 = null;
            }
            if (arg3 - 1 == arg5 && arg6 <= arg2 && arg2 <= var10 && (this.field1833[arg2 - this.field1822][arg5 - this.field1839] & 0x2) == 0 && (arg1 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg5 && arg2 >= arg6 && var10 >= arg2 && (this.field1833[arg2 - this.field1822][arg5 - this.field1839] & 0x20) == 0 && (arg1 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method785(int arg0) {
        field1840++;
        int var2 = 0;
        if (arg0 != 2097152) {
            this.field1833 = null;
        }
        while (this.field1825 > var2) {
            for (int var3 = 0; var3 < this.field1841; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field1825 - 5) <= var2 || this.field1841 - 5 <= var3) {
                    this.field1833[var2][var3] = -1;
                } else {
                    this.field1833[var2][var3] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIBIII)Z")
    public final boolean method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field1837++;
        int var11 = arg5 + arg9;
        if (arg6 != 83) {
            this.method782((byte) -34, -36, false, -75, 9, true, 17);
        }
        int var12 = arg0 + arg4;
        int var13 = arg1 + arg3;
        int var14 = arg2 + arg7;
        if (arg9 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg7 < arg0 ? arg0 : arg7;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field1833[var13 - this.field1822 - 1][var15 - this.field1839] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg7 >= arg0 ? arg7 : arg0;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field1833[arg1 - this.field1822][var17 - this.field1839] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg0 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg9 > arg1 ? arg9 : arg1;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field1833[var19 - this.field1822][var14 - this.field1839 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg1 < arg9 ? arg9 : arg1;
            int var22 = var11 < var13 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field1833[var21 - this.field1822][arg7 - this.field1839] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIZIIBII)V")
    public final void method787(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1836++;
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        int var10 = -27 / ((13 - arg5) / 62);
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg3;
            arg3 = arg6;
            arg6 = var11;
        }
        int var12 = arg1 - this.field1822;
        int var13 = arg7 - this.field1839;
        if (arg2) {
            var9 |= 0x40000000;
        }
        for (int var14 = var12; var14 < (arg3 + var12); var14++) {
            if (var14 >= 0 && var14 < this.field1825) {
                for (int var15 = var13; var15 < (arg6 + var13); var15++) {
                    if (var15 >= 0 && this.field1841 > var15) {
                        this.method781(31763, var9, var14, var15);
                    }
                }
            }
        }
    }
}
