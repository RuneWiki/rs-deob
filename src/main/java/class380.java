import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class380 {

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "Lem;")
    public static class206 field5076 = new class206(108, 1);

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "Ltp;")
    public static class494 field5082 = new class494();

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public int field5066;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public int field5070;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public int field5083;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "[[I")
    public int[][] field5064;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 > -28) {
            this.field5064 = null;
        }
        field5071++;
        if (arg7 == 1) {
            if (arg0 == arg3 && arg4 == arg5) {
                return true;
            }
        } else if (arg3 >= arg0 && arg3 <= (arg0 + arg7 - 1) && arg4 <= arg4 && arg4 <= (arg4 + arg7 - 1)) {
            return true;
        }
        int var9 = arg4 - this.field5070;
        int var10 = arg3 - this.field5069;
        int var11 = arg0 - this.field5069;
        int var12 = arg5 - this.field5070;
        if (arg7 == 1) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field5064[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field5064[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field5064[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field5064[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field5064[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field5064[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field5064[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field5064[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field5064[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field5064[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field5064[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg7 - 1;
            int var14 = arg7 + var12 - 1;
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if ((var10 - arg7) == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 + 1 == var12 && (this.field5064[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 - arg7) == var12 && (this.field5064[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 - arg7 == var11 && var9 >= var12 && var9 <= var14 && (this.field5064[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9 && (this.field5064[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var11 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 + 1 == var12 && (this.field5064[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 - arg7) == var12 && (this.field5064[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg7) == var12) {
                        return true;
                    }
                    if (var10 - arg7 == var11 && var12 <= var9 && var14 >= var9 && (this.field5064[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 <= var9 && var9 <= var14 && (this.field5064[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if ((var10 - arg7) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9 && (this.field5064[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg7) == var12 && (this.field5064[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - arg7 == var11 && var9 >= var12 && var14 >= var9 && (this.field5064[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg7) == var12 && (this.field5064[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - arg7 == var11 && var9 >= var12 && var14 >= var9 && (this.field5064[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12 && (this.field5064[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 - arg7) == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 - arg7) == var11 && var9 >= var12 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12 && (this.field5064[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9 && (this.field5064[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg7) == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12 && (this.field5064[var10][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var10 && var10 <= var13 && (var9 - arg7) == var12 && (this.field5064[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg7) == var11 && var9 >= var12 && var14 >= var9 && (this.field5064[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14 && (this.field5064[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIZIZ)V")
    public final void method2173(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field5078++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg1 - this.field5070;
        if (arg4) {
            var8 |= 0x40000000;
        }
        int var10 = arg0 - this.field5069;
        int var11 = var10;
        if (arg3 <= 3) {
            return;
        }
        while (var11 < (arg2 + var10)) {
            if (var11 >= 0 && var11 < this.field5066) {
                for (int var12 = var9; var12 < arg5 + var9; var12++) {
                    if (var12 >= 0 && this.field5083 > var12) {
                        this.method2181(var8, var12, -1, var11);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method2174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5074++;
        int var11 = 116 / ((arg7 + 26) / 62);
        int var12 = arg2 + arg8;
        int var13 = arg3 + arg6;
        int var14 = arg0 + arg4;
        int var15 = arg1 + arg9;
        if (arg2 == var14 && (arg5 & 0x2) == 0) {
            int var16 = arg9 >= arg3 ? arg9 : arg3;
            int var17 = var13 < var15 ? var13 : var15;
            while (var16 < var17) {
                if ((this.field5064[var14 - this.field5069 - 1][var16 - this.field5070] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg0 == var12 && (arg5 & 0x8) == 0) {
            int var18 = arg3 <= arg9 ? arg9 : arg3;
            int var19 = var15 > var13 ? var13 : var15;
            while (var19 > var18) {
                if ((this.field5064[arg0 - this.field5069][var18 - this.field5070] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg3 == var15 && (arg5 & 0x1) == 0) {
            int var20 = arg2 <= arg0 ? arg0 : arg2;
            int var21 = var12 >= var14 ? var14 : var12;
            while (var20 < var21) {
                if ((this.field5064[var20 - this.field5069][var15 - this.field5070 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg9 == var13 && (arg5 & 0x4) == 0) {
            int var22 = arg2 <= arg0 ? arg0 : arg2;
            int var23 = var14 <= var12 ? var14 : var12;
            while (var22 < var23) {
                if ((this.field5064[var22 - this.field5069][arg9 - this.field5070] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V")
    public final void method2175(int arg0, int arg1, int arg2) {
        field5080++;
        int var4 = arg2 - this.field5070;
        int var5 = arg1 - this.field5069;
        if (arg0 != 3) {
            field5082 = null;
        }
        this.field5064[var5][var4] = class136.method950(this.field5064[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZIIIZII)V")
    public final void method2176(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field5068++;
        int var8 = arg6 - this.field5070;
        int var9 = arg3 - this.field5069;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method2181(128, var8, -1, var9);
                this.method2181(8, var8, -1, var9 - 1);
            }
            if (arg1 == 1) {
                this.method2181(2, var8, -1, var9);
                this.method2181(32, var8 + 1, -1, var9);
            }
            if (arg1 == 2) {
                this.method2181(8, var8, -1, var9);
                this.method2181(128, var8, -1, var9 + 1);
            }
            if (arg1 == 3) {
                this.method2181(32, var8, -1, var9);
                this.method2181(2, var8 - 1, -1, var9);
            }
        }
        if (arg5 > -43) {
            this.method2183(-19);
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method2181(1, var8, -1, var9);
                this.method2181(16, var8 + 1, -1, var9 + -1);
            }
            if (arg1 == 1) {
                this.method2181(4, var8, -1, var9);
                this.method2181(64, var8 + 1, -1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method2181(16, var8, -1, var9);
                this.method2181(1, var8 - 1, -1, var9 + 1);
            }
            if (arg1 == 3) {
                this.method2181(64, var8, -1, var9);
                this.method2181(4, var8 - 1, -1, var9 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method2181(130, var8, -1, var9);
                this.method2181(8, var8, -1, var9 - 1);
                this.method2181(32, var8 + 1, -1, var9);
            }
            if (arg1 == 1) {
                this.method2181(10, var8, -1, var9);
                this.method2181(32, var8 + 1, -1, var9);
                this.method2181(128, var8, -1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method2181(40, var8, -1, var9);
                this.method2181(128, var8, -1, var9 + 1);
                this.method2181(2, var8 - 1, -1, var9);
            }
            if (arg1 == 3) {
                this.method2181(160, var8, -1, var9);
                this.method2181(2, var8 - 1, -1, var9);
                this.method2181(8, var8, -1, var9 - 1);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    this.method2181(65536, var8, -1, var9);
                    this.method2181(4096, var8, -1, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method2181(1024, var8, -1, var9);
                    this.method2181(16384, var8 + 1, -1, var9);
                }
                if (arg1 == 2) {
                    this.method2181(4096, var8, -1, var9);
                    this.method2181(65536, var8, -1, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method2181(16384, var8, -1, var9);
                    this.method2181(1024, var8 - 1, -1, var9);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg1 == 0) {
                    this.method2181(512, var8, -1, var9);
                    this.method2181(8192, var8 + 1, -1, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method2181(2048, var8, -1, var9);
                    this.method2181(32768, var8 + 1, -1, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method2181(8192, var8, -1, var9);
                    this.method2181(512, var8 - 1, -1, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method2181(32768, var8, -1, var9);
                    this.method2181(2048, var8 - 1, -1, var9 + -1);
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    this.method2181(66560, var8, -1, var9);
                    this.method2181(4096, var8, -1, var9 - 1);
                    this.method2181(16384, var8 + 1, -1, var9);
                }
                if (arg1 == 1) {
                    this.method2181(5120, var8, -1, var9);
                    this.method2181(16384, var8 + 1, -1, var9);
                    this.method2181(65536, var8, -1, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method2181(20480, var8, -1, var9);
                    this.method2181(65536, var8, -1, var9 + 1);
                    this.method2181(1024, var8 - 1, -1, var9);
                }
                if (arg1 == 3) {
                    this.method2181(81920, var8, -1, var9);
                    this.method2181(1024, var8 - 1, -1, var9);
                    this.method2181(4096, var8, -1, var9 - 1);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method2181(536870912, var8, -1, var9);
                this.method2181(33554432, var8, -1, var9 - 1);
            }
            if (arg1 == 1) {
                this.method2181(8388608, var8, -1, var9);
                this.method2181(134217728, var8 + 1, -1, var9);
            }
            if (arg1 == 2) {
                this.method2181(33554432, var8, -1, var9);
                this.method2181(536870912, var8, -1, var9 + 1);
            }
            if (arg1 == 3) {
                this.method2181(134217728, var8, -1, var9);
                this.method2181(8388608, var8 - 1, -1, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method2181(4194304, var8, -1, var9);
                this.method2181(67108864, var8 + 1, -1, var9 - 1);
            }
            if (arg1 == 1) {
                this.method2181(16777216, var8, -1, var9);
                this.method2181(268435456, var8 + 1, -1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method2181(67108864, var8, -1, var9);
                this.method2181(4194304, var8 - 1, -1, var9 + 1);
            }
            if (arg1 == 3) {
                this.method2181(268435456, var8, -1, var9);
                this.method2181(16777216, var8 - 1, -1, var9 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method2181(545259520, var8, -1, var9);
            this.method2181(33554432, var8, -1, var9 - 1);
            this.method2181(134217728, var8 + 1, -1, var9);
        }
        if (arg1 == 1) {
            this.method2181(41943040, var8, -1, var9);
            this.method2181(134217728, var8 + 1, -1, var9);
            this.method2181(536870912, var8, -1, var9 + 1);
        }
        if (arg1 == 2) {
            this.method2181(167772160, var8, -1, var9);
            this.method2181(536870912, var8, -1, var9 + 1);
            this.method2181(8388608, var8 - 1, -1, var9);
        }
        if (arg1 == 3) {
            this.method2181(671088640, var8, -1, var9);
            this.method2181(8388608, var8 - 1, -1, var9);
            this.method2181(33554432, var8, -1, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBI)V")
    public static final void method2177(int arg0, byte arg1, int arg2) {
        if (arg1 <= 107) {
            method2188(32);
        }
        class668.field9391++;
        field5065++;
        class352 var3 = class290.method1786(98, class199.field2836, class358.field4748);
        var3.field4686.method2812(26, arg0);
        var3.field4686.method2860(arg2, (byte) -106);
        class602.method3388(var3, (byte) 28);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIZIZII)V")
    public final void method2178(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field5062++;
        if (arg5 != 160) {
            return;
        }
        int var8 = arg0 - this.field5069;
        int var9 = arg1 - this.field5070;
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method2180(128, var9, (byte) -102, var8);
                this.method2180(8, var9, (byte) -93, var8 - 1);
            }
            if (arg6 == 1) {
                this.method2180(2, var9, (byte) -126, var8);
                this.method2180(32, var9 + 1, (byte) -104, var8);
            }
            if (arg6 == 2) {
                this.method2180(8, var9, (byte) -102, var8);
                this.method2180(128, var9, (byte) -93, var8 + 1);
            }
            if (arg6 == 3) {
                this.method2180(32, var9, (byte) -107, var8);
                this.method2180(2, var9 - 1, (byte) -123, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method2180(1, var9, (byte) -113, var8);
                this.method2180(16, var9 + 1, (byte) -84, var8 - 1);
            }
            if (arg6 == 1) {
                this.method2180(4, var9, (byte) -112, var8);
                this.method2180(64, var9 + 1, (byte) -118, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2180(16, var9, (byte) -93, var8);
                this.method2180(1, var9 - 1, (byte) -107, var8 + 1);
            }
            if (arg6 == 3) {
                this.method2180(64, var9, (byte) -96, var8);
                this.method2180(4, var9 - 1, (byte) -118, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg6 == 0) {
                this.method2180(130, var9, (byte) -89, var8);
                this.method2180(8, var9, (byte) -85, var8 - 1);
                this.method2180(32, var9 + 1, (byte) -110, var8);
            }
            if (arg6 == 1) {
                this.method2180(10, var9, (byte) -125, var8);
                this.method2180(32, var9 + 1, (byte) -84, var8);
                this.method2180(128, var9, (byte) -88, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2180(40, var9, (byte) -128, var8);
                this.method2180(128, var9, (byte) -87, var8 + 1);
                this.method2180(2, var9 - 1, (byte) -83, var8);
            }
            if (arg6 == 3) {
                this.method2180(160, var9, (byte) -115, var8);
                this.method2180(2, var9 - 1, (byte) -124, var8);
                this.method2180(8, var9, (byte) -118, var8 - 1);
            }
        }
        if (arg4) {
            if (arg3 == 0) {
                if (arg6 == 0) {
                    this.method2180(65536, var9, (byte) -101, var8);
                    this.method2180(4096, var9, (byte) -125, var8 - 1);
                }
                if (arg6 == 1) {
                    this.method2180(1024, var9, (byte) -102, var8);
                    this.method2180(16384, var9 + 1, (byte) -100, var8);
                }
                if (arg6 == 2) {
                    this.method2180(4096, var9, (byte) -97, var8);
                    this.method2180(65536, var9, (byte) -87, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method2180(16384, var9, (byte) -118, var8);
                    this.method2180(1024, var9 - 1, (byte) -85, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg6 == 0) {
                    this.method2180(512, var9, (byte) -104, var8);
                    this.method2180(8192, var9 + 1, (byte) -115, var8 - 1);
                }
                if (arg6 == 1) {
                    this.method2180(2048, var9, (byte) -89, var8);
                    this.method2180(32768, var9 + 1, (byte) -119, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method2180(8192, var9, (byte) -105, var8);
                    this.method2180(512, var9 - 1, (byte) -94, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method2180(32768, var9, (byte) -116, var8);
                    this.method2180(2048, var9 - 1, (byte) -105, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    this.method2180(66560, var9, (byte) -114, var8);
                    this.method2180(4096, var9, (byte) -96, var8 - 1);
                    this.method2180(16384, var9 + 1, (byte) -124, var8);
                }
                if (arg6 == 1) {
                    this.method2180(5120, var9, (byte) -88, var8);
                    this.method2180(16384, var9 + 1, (byte) -104, var8);
                    this.method2180(65536, var9, (byte) -125, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method2180(20480, var9, (byte) -121, var8);
                    this.method2180(65536, var9, (byte) -97, var8 + 1);
                    this.method2180(1024, var9 - 1, (byte) -125, var8);
                }
                if (arg6 == 3) {
                    this.method2180(81920, var9, (byte) -84, var8);
                    this.method2180(1024, var9 - 1, (byte) -115, var8);
                    this.method2180(4096, var9, (byte) -84, var8 - 1);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method2180(536870912, var9, (byte) -123, var8);
                this.method2180(33554432, var9, (byte) -122, var8 - 1);
            }
            if (arg6 == 1) {
                this.method2180(8388608, var9, (byte) -97, var8);
                this.method2180(134217728, var9 + 1, (byte) -128, var8);
            }
            if (arg6 == 2) {
                this.method2180(33554432, var9, (byte) -91, var8);
                this.method2180(536870912, var9, (byte) -98, var8 + 1);
            }
            if (arg6 == 3) {
                this.method2180(134217728, var9, (byte) -109, var8);
                this.method2180(8388608, var9 - 1, (byte) -93, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method2180(4194304, var9, (byte) -97, var8);
                this.method2180(67108864, var9 + 1, (byte) -103, var8 - 1);
            }
            if (arg6 == 1) {
                this.method2180(16777216, var9, (byte) -109, var8);
                this.method2180(268435456, var9 + 1, (byte) -103, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2180(67108864, var9, (byte) -90, var8);
                this.method2180(4194304, var9 - 1, (byte) -105, var8 + 1);
            }
            if (arg6 == 3) {
                this.method2180(268435456, var9, (byte) -125, var8);
                this.method2180(16777216, var9 - 1, (byte) -126, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method2180(545259520, var9, (byte) -123, var8);
            this.method2180(33554432, var9, (byte) -112, var8 - 1);
            this.method2180(134217728, var9 + 1, (byte) -128, var8);
        }
        if (arg6 == 1) {
            this.method2180(41943040, var9, (byte) -92, var8);
            this.method2180(134217728, var9 + 1, (byte) -95, var8);
            this.method2180(536870912, var9, (byte) -100, var8 + 1);
        }
        if (arg6 == 2) {
            this.method2180(167772160, var9, (byte) -98, var8);
            this.method2180(536870912, var9, (byte) -119, var8 + 1);
            this.method2180(8388608, var9 - 1, (byte) -94, var8);
        }
        if (arg6 == 3) {
            this.method2180(671088640, var9, (byte) -116, var8);
            this.method2180(8388608, var9 - 1, (byte) -120, var8);
            this.method2180(33554432, var9, (byte) -100, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIZIIIZI)V")
    public final void method2179(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field5063++;
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        int var10 = arg3 - this.field5069;
        if (arg2) {
            var9 |= 0x40000000;
        }
        int var11 = arg1 - this.field5070;
        if (arg4 == 1 || arg4 == 3) {
            int var12 = arg5;
            arg5 = arg7;
            arg7 = var12;
        }
        if (arg0 != -2) {
            return;
        }
        for (int var13 = var10; var13 < (arg5 + var10); var13++) {
            if (var13 >= 0 && this.field5066 > var13) {
                for (int var14 = var11; var14 < (arg7 + var11); var14++) {
                    if (var14 >= 0 && this.field5083 > var14) {
                        this.method2180(var9, var14, (byte) -87, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIBI)V")
    private final void method2180(int arg0, int arg1, byte arg2, int arg3) {
        this.field5064[arg3][arg1] = class136.method950(this.field5064[arg3][arg1], ~arg0);
        if (arg2 <= -81) {
            field5067++;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)V")
    private final void method2181(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            this.method2174(90, 12, -7, 50, 59, -61, -19, -34, -26, -128);
        }
        this.field5064[arg3][arg1] = class647.method3617(this.field5064[arg3][arg1], arg0);
        field5081++;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V")
    public final void method2182(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field5070;
        field5061++;
        if (arg2 != -1) {
            this.method2178(95, -15, false, 40, true, 36, -37);
        }
        int var5 = arg1 - this.field5069;
        this.field5064[var5][var4] = class136.method950(this.field5064[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public final void method2183(int arg0) {
        field5077++;
        int var2 = 0;
        if (arg0 != 1) {
            return;
        }
        while (var2 < this.field5066) {
            for (int var3 = 0; var3 < this.field5083; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field5066 - 5) || var3 >= this.field5083 - 5) {
                    this.field5064[var2][var3] = -1;
                } else {
                    this.field5064[var2][var3] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(III)V")
    public final void method2184(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field5070;
        field5075++;
        int var5 = arg1 - this.field5069;
        this.field5064[var5][var4] = class647.method3617(this.field5064[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method2185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5079++;
        if (arg1 == 1) {
            if (arg4 == arg7 && arg2 == arg6) {
                return true;
            }
        } else if (arg4 >= arg7 && arg7 + arg1 - 1 >= arg4 && arg6 >= arg6 && arg6 <= arg1 + arg6 - 1) {
            return true;
        }
        int var9 = arg7 - this.field5069;
        int var10 = arg2 - this.field5070;
        int var11 = arg4 - this.field5069;
        int var12 = arg6 - this.field5070;
        if (arg0 >= -122) {
            this.field5064 = null;
        }
        if (arg1 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field5064[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field5064[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field5064[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field5064[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field5064[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field5064[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field5064[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field5064[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field5064[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field5064[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field5064[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field5064[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg1 - 1;
            int var14 = var10 + arg1 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var11 + 1) == var9 && var12 >= var10 && var14 >= var12 && (this.field5064[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg1) == var10 && (this.field5064[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - arg1 == var9 && var10 <= var12 && var14 >= var12 && (this.field5064[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 - arg1) == var10 && (this.field5064[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 - arg1 == var9 && var12 >= var10 && var12 <= var14 && (this.field5064[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 + 1) == var10 && (this.field5064[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12 && (this.field5064[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 + 1 == var10 && (this.field5064[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 <= var11 && var11 <= var13 && var12 + 1 == var10 && (this.field5064[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var11 && var11 <= var13 && var12 - arg1 == var10 && (this.field5064[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg1 == var9 && var10 <= var12 && var12 <= var14 && (this.field5064[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var12 >= var10 && var14 >= var12 && (this.field5064[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIZIII)Z")
    public final boolean method2186(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (arg5) {
            this.method2182(113, -74, 95);
        }
        field5073++;
        if (arg7 > 1) {
            return class576.method3291(81, arg6, arg7, arg8, arg7, arg4, arg3, arg1, arg2) ? true : this.method2174(arg8, arg3, arg6, arg1, arg4, arg0, arg7, -95, arg7, arg2);
        }
        int var10 = arg8 + arg4 - 1;
        int var11 = arg2 + arg3 - 1;
        if (arg8 <= arg6 && arg6 <= var10 && arg2 <= arg1 && arg1 <= var11) {
            return true;
        } else if ((arg8 - 1) == arg6 && arg1 >= arg2 && arg1 <= var11 && (this.field5064[arg6 - this.field5069][arg1 - this.field5070] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg6 && arg2 <= arg1 && var11 >= arg1 && (this.field5064[arg6 - this.field5069][arg1 - this.field5070] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg1 && arg6 >= arg8 && arg6 <= var10 && (this.field5064[arg6 - this.field5069][arg1 - this.field5070] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg1 && arg6 >= arg8 && var10 >= arg6 && (this.field5064[arg6 - this.field5069][arg1 - this.field5070] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)V")
    public final void method2187(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field5070;
        int var5 = arg2 - this.field5069;
        if (arg0 == 1) {
            field5072++;
            this.field5064[var5][var4] = class647.method3617(this.field5064[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
    public static void method2188(int arg0) {
        field5076 = null;
        field5082 = null;
        if (arg0 != -1) {
            field5076 = null;
        }
    }
}
