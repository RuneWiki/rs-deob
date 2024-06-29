import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class405 {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lpfa;")
    public static class299 field5120 = new class299();

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public int field5116;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field5122;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public int field5123;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public int field5131;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "[[I")
    public int[][] field5137;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V")
    private final void method2251(int arg0, int arg1, int arg2, int arg3) {
        this.field5137[arg1][arg2] = class683.method3840(this.field5137[arg1][arg2], arg3);
        if (arg0 != -8311) {
            this.method2262(-112, -125, 94);
        }
        field5118++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIZIIZ)V")
    public final void method2252(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field5140++;
        int var8 = arg4 - this.field5131;
        int var9 = arg2 - this.field5122;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method2255(true, var9, 128, var8);
                this.method2255(true, var9, 8, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2255(true, var9, 2, var8);
                this.method2255(true, var9 + 1, 32, var8);
            }
            if (arg0 == 2) {
                this.method2255(true, var9, 8, var8);
                this.method2255(true, var9, 128, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2255(true, var9, 32, var8);
                this.method2255(true, var9 - 1, 2, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method2255(true, var9, 1, var8);
                this.method2255(true, var9 + 1, 16, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2255(true, var9, 4, var8);
                this.method2255(true, var9 + 1, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2255(true, var9, 16, var8);
                this.method2255(true, var9 - 1, 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2255(true, var9, 64, var8);
                this.method2255(true, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg1 != -1) {
            this.field5123 = 14;
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method2255(true, var9, 130, var8);
                this.method2255(true, var9, 8, var8 - 1);
                this.method2255(true, var9 + 1, 32, var8);
            }
            if (arg0 == 1) {
                this.method2255(true, var9, 10, var8);
                this.method2255(true, var9 + 1, 32, var8);
                this.method2255(true, var9, 128, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2255(true, var9, 40, var8);
                this.method2255(true, var9, 128, var8 + 1);
                this.method2255(true, var9 - 1, 2, var8);
            }
            if (arg0 == 3) {
                this.method2255(true, var9, 160, var8);
                this.method2255(true, var9 - 1, 2, var8);
                this.method2255(true, var9, 8, var8 - 1);
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method2255(true, var9, 65536, var8);
                    this.method2255(true, var9, 4096, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method2255(true, var9, 1024, var8);
                    this.method2255(true, var9 + 1, 16384, var8);
                }
                if (arg0 == 2) {
                    this.method2255(true, var9, 4096, var8);
                    this.method2255(true, var9, 65536, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method2255(true, var9, 16384, var8);
                    this.method2255(true, var9 - 1, 1024, var8);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method2255(true, var9, 512, var8);
                    this.method2255(true, var9 + 1, 8192, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method2255(true, var9, 2048, var8);
                    this.method2255(true, var9 + 1, 32768, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method2255(true, var9, 8192, var8);
                    this.method2255(true, var9 - 1, 512, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method2255(true, var9, 32768, var8);
                    this.method2255(true, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method2255(true, var9, 66560, var8);
                    this.method2255(true, var9, 4096, var8 - 1);
                    this.method2255(true, var9 + 1, 16384, var8);
                }
                if (arg0 == 1) {
                    this.method2255(true, var9, 5120, var8);
                    this.method2255(true, var9 + 1, 16384, var8);
                    this.method2255(true, var9, 65536, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method2255(true, var9, 20480, var8);
                    this.method2255(true, var9, 65536, var8 + 1);
                    this.method2255(true, var9 - 1, 1024, var8);
                }
                if (arg0 == 3) {
                    this.method2255(true, var9, 81920, var8);
                    this.method2255(true, var9 - 1, 1024, var8);
                    this.method2255(true, var9, 4096, var8 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method2255(true, var9, 536870912, var8);
                this.method2255(true, var9, 33554432, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2255(true, var9, 8388608, var8);
                this.method2255(true, var9 + 1, 134217728, var8);
            }
            if (arg0 == 2) {
                this.method2255(true, var9, 33554432, var8);
                this.method2255(true, var9, 536870912, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2255(true, var9, 134217728, var8);
                this.method2255(true, var9 - 1, 8388608, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method2255(true, var9, 4194304, var8);
                this.method2255(true, var9 + 1, 67108864, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2255(true, var9, 16777216, var8);
                this.method2255(true, var9 + 1, 268435456, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2255(true, var9, 67108864, var8);
                this.method2255(true, var9 - 1, 4194304, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2255(true, var9, 268435456, var8);
                this.method2255(true, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2255(true, var9, 545259520, var8);
            this.method2255(true, var9, 33554432, var8 - 1);
            this.method2255(true, var9 + 1, 134217728, var8);
        }
        if (arg0 == 1) {
            this.method2255(true, var9, 41943040, var8);
            this.method2255(true, var9 + 1, 134217728, var8);
            this.method2255(true, var9, 536870912, var8 + 1);
        }
        if (arg0 == 2) {
            this.method2255(true, var9, 167772160, var8);
            this.method2255(true, var9, 536870912, var8 + 1);
            this.method2255(true, var9 - 1, 8388608, var8);
        }
        if (arg0 == 3) {
            this.method2255(true, var9, 671088640, var8);
            this.method2255(true, var9 - 1, 8388608, var8);
            this.method2255(true, var9, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public final void method2253(boolean arg0) {
        field5125++;
        if (!arg0) {
            this.field5122 = -12;
        }
        for (int var2 = 0; var2 < this.field5123; var2++) {
            for (int var3 = 0; var3 < this.field5116; var3++) {
                if (var2 == 0 || var3 == 0 || this.field5123 - 5 <= var2 || var3 >= (this.field5116 - 5)) {
                    this.field5137[var2][var3] = -1;
                } else {
                    this.field5137[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5121++;
        if (arg5 == 1) {
            if (arg3 == arg4 && arg2 == arg6) {
                return true;
            }
        } else if (arg3 <= arg4 && (arg5 + arg3 - 1) >= arg4 && arg6 >= arg6 && arg6 <= (arg6 + arg5 - 1)) {
            return true;
        }
        int var9 = arg6 - this.field5122;
        if (arg0 <= 64) {
            return false;
        }
        int var10 = arg2 - this.field5122;
        int var11 = arg3 - this.field5131;
        int var12 = arg4 - this.field5131;
        if (arg5 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field5137[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field5137[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field5137[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field5137[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field5137[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field5137[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field5137[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field5137[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field5137[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field5137[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field5137[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field5137[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var11 - 1;
            int var14 = arg5 + var10 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var12 + 1) == var11 && var10 <= var9 && var9 <= var14 && (this.field5137[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 - arg5 == var10 && (this.field5137[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var12 - arg5) == var11 && var10 <= var9 && var9 <= var14 && (this.field5137[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 - arg5 == var10 && (this.field5137[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var12 - arg5 == var11 && var9 >= var10 && var9 <= var14 && (this.field5137[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 + 1 == var10 && (this.field5137[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var12 + 1 == var11 && var9 >= var10 && var14 >= var9 && (this.field5137[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var9 + 1) == var10 && (this.field5137[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field5137[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var12 <= var13 && (var9 - arg5) == var10 && (this.field5137[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg5 == var11 && var9 >= var10 && var14 >= var9 && (this.field5137[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 >= var10 && var9 <= var14 && (this.field5137[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIII)V")
    private final void method2255(boolean arg0, int arg1, int arg2, int arg3) {
        this.field5137[arg3][arg1] = class702.method3949(this.field5137[arg3][arg1], ~arg2);
        field5117++;
        if (!arg0) {
            this.field5131 = 10;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBIIIIIIII)Z")
    public final boolean method2256(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5115++;
        if (arg1 != -93) {
            return true;
        }
        int var11 = arg4 + arg5;
        int var12 = arg7 + arg8;
        int var13 = arg0 + arg9;
        int var14 = arg2 + arg3;
        if (arg4 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg8 <= arg2 ? arg2 : arg8;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field5137[var13 - this.field5131 - 1][var15 - this.field5122] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg8 <= arg2 ? arg2 : arg8;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field5137[arg0 - this.field5131][var17 - this.field5122] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg8 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg0 >= arg4 ? arg0 : arg4;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field5137[var19 - this.field5131][var14 - this.field5122 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg4 > arg0 ? arg4 : arg0;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field5137[var21 - this.field5131][arg2 - this.field5122] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIZZZII)V")
    public final void method2257(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        field5138++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field5122;
        if (arg3) {
            var9 |= 0x40000000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg0;
            arg0 = arg7;
            arg7 = var11;
        }
        int var12 = arg6 - this.field5131;
        for (int var13 = var12; var13 < (arg0 + var12); var13++) {
            if (var13 >= 0 && var13 < this.field5123) {
                for (int var14 = var10; var14 < var10 + arg7; var14++) {
                    if (var14 >= 0 && this.field5116 > var14) {
                        this.method2255(true, var14, var9, var13);
                    }
                }
            }
        }
        if (arg4) {
            method2268(-105, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method2258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -1) {
            return false;
        }
        field5119++;
        if (arg2 == 1) {
            if (arg3 == arg5 && arg0 == arg7) {
                return true;
            }
        } else if (arg5 <= arg3 && (arg5 + arg2 - 1) >= arg3 && arg0 <= arg0 && (arg0 + arg2 - 1) >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field5122;
        int var10 = arg3 - this.field5131;
        int var11 = arg7 - this.field5122;
        int var12 = arg5 - this.field5131;
        if (arg2 == 1) {
            if (arg1 == 0) {
                if (arg4 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field5137[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field5137[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field5137[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field5137[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field5137[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field5137[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field5137[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field5137[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field5137[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field5137[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field5137[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var12 - 1;
            int var14 = var11 - (1 - arg2);
            if (arg1 == 0) {
                if (arg4 == 0) {
                    if (var10 - arg2 == var12 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11 && (this.field5137[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 - arg2) == var11 && (this.field5137[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 >= var12 && var13 >= var10 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - arg2) == var12 && var11 <= var9 && var14 >= var9 && (this.field5137[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field5137[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 + 1 == var11 && (this.field5137[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 - arg2) == var11 && (this.field5137[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 >= var12 && var13 >= var10 && var9 - arg2 == var11) {
                        return true;
                    }
                    if (var10 - arg2 == var12 && var11 <= var9 && var14 >= var9 && (this.field5137[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14 && (this.field5137[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    if ((var10 - arg2) == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var14 >= var9 && (this.field5137[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 - arg2 == var11 && (this.field5137[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 - arg2 == var12 && var11 <= var9 && var14 >= var9 && (this.field5137[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 - arg2) == var11 && (this.field5137[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 - arg2) == var12 && var11 <= var9 && var14 >= var9 && (this.field5137[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11 && (this.field5137[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 - arg2) == var11) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 - arg2 == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 + 1) == var11 && (this.field5137[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14 && (this.field5137[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 - arg2 == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11 && (this.field5137[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var10 <= var13 && (var9 - arg2) == var11 && (this.field5137[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg2) == var12 && var11 <= var9 && var14 >= var9 && (this.field5137[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14 && (this.field5137[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBIIIII)Z")
    public final boolean method2259(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5124++;
        if (arg0 > 1) {
            return class217.method1414(arg0, arg2, arg4, arg0, arg6, arg8, (byte) 97, arg5, arg7) ? true : this.method2256(arg4, (byte) -93, arg8, arg7, arg5, arg0, arg1, arg0, arg2, arg6);
        }
        int var10 = arg6 + arg4 - 1;
        if (arg3 != 33) {
            this.field5131 = 14;
        }
        int var11 = arg7 + arg8 - 1;
        if (arg5 >= arg4 && var10 >= arg5 && arg8 <= arg2 && arg2 <= var11) {
            return true;
        } else if ((arg4 - 1) == arg5 && arg2 >= arg8 && arg2 <= var11 && (this.field5137[arg5 - this.field5131][arg2 - this.field5122] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg5 && arg8 <= arg2 && arg2 <= var11 && (this.field5137[arg5 - this.field5131][arg2 - this.field5122] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg2 && arg4 <= arg5 && var10 >= arg5 && (this.field5137[arg5 - this.field5131][arg2 - this.field5122] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg2 && arg5 >= arg4 && arg5 <= var10 && (this.field5137[arg5 - this.field5131][arg2 - this.field5122] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public final void method2260(int arg0, int arg1, int arg2) {
        field5130++;
        if (arg2 != 128) {
            this.method2253(true);
        }
        int var4 = arg0 - this.field5131;
        int var5 = arg1 - this.field5122;
        this.field5137[var4][var5] = class702.method3949(this.field5137[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
    public final void method2261(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field5122;
        field5129++;
        if (arg2 != 1) {
            method2265((byte) 28);
        }
        int var5 = arg0 - this.field5131;
        this.field5137[var5][var4] = class683.method3840(this.field5137[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(III)V")
    public final void method2262(int arg0, int arg1, int arg2) {
        field5136++;
        if (arg1 != -1) {
            this.method2267((byte) -47, 124, -77);
        }
        int var4 = arg0 - this.field5131;
        int var5 = arg2 - this.field5122;
        this.field5137[var4][var5] = class683.method3840(this.field5137[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZZIIII)V")
    public final void method2263(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field5131;
        field5132++;
        if (arg4 < 41) {
            this.field5116 = 22;
        }
        int var9 = arg6 - this.field5122;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method2251(-8311, var8, var9, 128);
                this.method2251(-8311, var8 - 1, var9, 8);
            }
            if (arg0 == 1) {
                this.method2251(-8311, var8, var9, 2);
                this.method2251(-8311, var8, var9 + 1, 32);
            }
            if (arg0 == 2) {
                this.method2251(-8311, var8, var9, 8);
                this.method2251(-8311, var8 + 1, var9, 128);
            }
            if (arg0 == 3) {
                this.method2251(-8311, var8, var9, 32);
                this.method2251(-8311, var8, var9 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method2251(-8311, var8, var9, 1);
                this.method2251(-8311, var8 - 1, var9 + 1, 16);
            }
            if (arg0 == 1) {
                this.method2251(-8311, var8, var9, 4);
                this.method2251(-8311, var8 + 1, var9 - -1, 64);
            }
            if (arg0 == 2) {
                this.method2251(-8311, var8, var9, 16);
                this.method2251(-8311, var8 + 1, var9 + -1, 1);
            }
            if (arg0 == 3) {
                this.method2251(-8311, var8, var9, 64);
                this.method2251(-8311, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method2251(-8311, var8, var9, 130);
                this.method2251(-8311, var8 - 1, var9, 8);
                this.method2251(-8311, var8, var9 + 1, 32);
            }
            if (arg0 == 1) {
                this.method2251(-8311, var8, var9, 10);
                this.method2251(-8311, var8, var9 + 1, 32);
                this.method2251(-8311, var8 + 1, var9, 128);
            }
            if (arg0 == 2) {
                this.method2251(-8311, var8, var9, 40);
                this.method2251(-8311, var8 + 1, var9, 128);
                this.method2251(-8311, var8, var9 - 1, 2);
            }
            if (arg0 == 3) {
                this.method2251(-8311, var8, var9, 160);
                this.method2251(-8311, var8, var9 - 1, 2);
                this.method2251(-8311, var8 - 1, var9, 8);
            }
        }
        if (arg2) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method2251(-8311, var8, var9, 65536);
                    this.method2251(-8311, var8 - 1, var9, 4096);
                }
                if (arg0 == 1) {
                    this.method2251(-8311, var8, var9, 1024);
                    this.method2251(-8311, var8, var9 + 1, 16384);
                }
                if (arg0 == 2) {
                    this.method2251(-8311, var8, var9, 4096);
                    this.method2251(-8311, var8 + 1, var9, 65536);
                }
                if (arg0 == 3) {
                    this.method2251(-8311, var8, var9, 16384);
                    this.method2251(-8311, var8, var9 - 1, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method2251(-8311, var8, var9, 512);
                    this.method2251(-8311, var8 - 1, var9 + 1, 8192);
                }
                if (arg0 == 1) {
                    this.method2251(-8311, var8, var9, 2048);
                    this.method2251(-8311, var8 + 1, var9 + 1, 32768);
                }
                if (arg0 == 2) {
                    this.method2251(-8311, var8, var9, 8192);
                    this.method2251(-8311, var8 + 1, var9 - 1, 512);
                }
                if (arg0 == 3) {
                    this.method2251(-8311, var8, var9, 32768);
                    this.method2251(-8311, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method2251(-8311, var8, var9, 66560);
                    this.method2251(-8311, var8 - 1, var9, 4096);
                    this.method2251(-8311, var8, var9 + 1, 16384);
                }
                if (arg0 == 1) {
                    this.method2251(-8311, var8, var9, 5120);
                    this.method2251(-8311, var8, var9 + 1, 16384);
                    this.method2251(-8311, var8 + 1, var9, 65536);
                }
                if (arg0 == 2) {
                    this.method2251(-8311, var8, var9, 20480);
                    this.method2251(-8311, var8 + 1, var9, 65536);
                    this.method2251(-8311, var8, var9 - 1, 1024);
                }
                if (arg0 == 3) {
                    this.method2251(-8311, var8, var9, 81920);
                    this.method2251(-8311, var8, var9 - 1, 1024);
                    this.method2251(-8311, var8 - 1, var9, 4096);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method2251(-8311, var8, var9, 536870912);
                this.method2251(-8311, var8 - 1, var9, 33554432);
            }
            if (arg0 == 1) {
                this.method2251(-8311, var8, var9, 8388608);
                this.method2251(-8311, var8, var9 + 1, 134217728);
            }
            if (arg0 == 2) {
                this.method2251(-8311, var8, var9, 33554432);
                this.method2251(-8311, var8 + 1, var9, 536870912);
            }
            if (arg0 == 3) {
                this.method2251(-8311, var8, var9, 134217728);
                this.method2251(-8311, var8, var9 - 1, 8388608);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method2251(-8311, var8, var9, 4194304);
                this.method2251(-8311, var8 - 1, var9 - -1, 67108864);
            }
            if (arg0 == 1) {
                this.method2251(-8311, var8, var9, 16777216);
                this.method2251(-8311, var8 + 1, var9 + 1, 268435456);
            }
            if (arg0 == 2) {
                this.method2251(-8311, var8, var9, 67108864);
                this.method2251(-8311, var8 + 1, var9 - 1, 4194304);
            }
            if (arg0 == 3) {
                this.method2251(-8311, var8, var9, 268435456);
                this.method2251(-8311, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2251(-8311, var8, var9, 545259520);
            this.method2251(-8311, var8 - 1, var9, 33554432);
            this.method2251(-8311, var8, var9 + 1, 134217728);
        }
        if (arg0 == 1) {
            this.method2251(-8311, var8, var9, 41943040);
            this.method2251(-8311, var8, var9 + 1, 134217728);
            this.method2251(-8311, var8 + 1, var9, 536870912);
        }
        if (arg0 == 2) {
            this.method2251(-8311, var8, var9, 167772160);
            this.method2251(-8311, var8 + 1, var9, 536870912);
            this.method2251(-8311, var8, var9 - 1, 8388608);
        }
        if (arg0 == 3) {
            this.method2251(-8311, var8, var9, 671088640);
            this.method2251(-8311, var8, var9 - 1, 8388608);
            this.method2251(-8311, var8 - 1, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method2264(int arg0) {
        class116.method905(class748.field10451.field10422.method2332((byte) -81), 29);
        field5133++;
        int var1 = (class450.field5953 >> 12) + (class332.field4232 >> 3);
        int var2 = (class447.field5936 >> 3) + (class318.field4121 >> 12);
        class472.field6329 = class380.field4847.field5796 = 0;
        class380.field4847.method4040(8, -111, 8);
        byte var3 = 18;
        if (arg0 != -1) {
            return;
        }
        class739.field10307 = new int[var3][4];
        class731.field10169 = new int[var3];
        class385.field4921 = new byte[var3][];
        class201.field2708 = new int[var3];
        class256.field3258 = new byte[var3][];
        class412.field5243 = new byte[var3][];
        class480.field6528 = new int[var3];
        class470.field6312 = new int[var3];
        class393.field4990 = new int[var3];
        class33.field545 = new byte[var3][];
        class273.field3430 = new byte[var3][];
        class222.field2975 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class409.field5183 >> 4)) / 8; var5 <= (((class409.field5183 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class543.field7597 >> 4)) / 8; var8 <= ((var2 + (class543.field7597 >> 4)) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class201.field2708[var4] = var9;
                class222.field2975[var4] = class238.field3094.method3161((byte) -115, "m" + var5 + "_" + var8);
                class480.field6528[var4] = class238.field3094.method3161((byte) -111, "l" + var5 + "_" + var8);
                class470.field6312[var4] = class238.field3094.method3161((byte) -62, "n" + var5 + "_" + var8);
                class731.field10169[var4] = class238.field3094.method3161((byte) -56, "um" + var5 + "_" + var8);
                class393.field4990[var4] = class238.field3094.method3161((byte) -36, "ul" + var5 + "_" + var8);
                if (class470.field6312[var4] == -1) {
                    class222.field2975[var4] = -1;
                    class480.field6528[var4] = -1;
                    class731.field10169[var4] = -1;
                    class393.field4990[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class470.field6312.length; var6++) {
            class470.field6312[var6] = -1;
            class222.field2975[var6] = -1;
            class480.field6528[var6] = -1;
            class731.field10169[var6] = -1;
            class393.field4990[var6] = -1;
        }
        byte var7;
        if (class27.field484 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class295.method1773((byte) -107, false, var1, var7, var2);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method2265(byte arg0) {
        if (arg0 != 85) {
            field5120 = null;
        }
        field5120 = null;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(III)Z")
    public static final boolean method2266(int arg0, int arg1, int arg2) {
        if (arg0 != 880) {
            method2268(115, (byte) 84);
        }
        field5134++;
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)V")
    public final void method2267(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field5131;
        field5139++;
        int var5 = arg1 - this.field5122;
        this.field5137[var4][var5] = class702.method3949(this.field5137[var4][var5], -2097153);
        if (arg0 != 104) {
            method2268(18, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)I")
    public static final int method2268(int arg0, byte arg1) {
        field5128++;
        return arg1 == 75 ? arg0 >>> 8 : -45;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBIZZII)V")
    public final void method2269(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field5135++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field5122;
        if (arg4) {
            var8 |= 0x40000000;
        }
        int var10 = arg5 - this.field5131;
        for (int var11 = var10; var11 < (arg6 + var10); var11++) {
            if (var11 >= 0 && var11 < this.field5123) {
                for (int var12 = var9; var12 < arg0 + var9; var12++) {
                    if (var12 >= 0 && this.field5116 > var12) {
                        this.method2251(-8311, var11, var12, var8);
                    }
                }
            }
        }
        if (arg1 <= 89) {
            this.field5131 = 80;
        }
    }
}
