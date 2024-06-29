import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class441 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lcp;")
    public static class470 field6098 = new class470(16);

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Lwf;")
    public static class79 field6116 = new class79(62, 4);

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Lus;")
    public static class1 field6120 = new class1(35, -2);

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "Lwf;")
    public static class79 field6122 = new class79(42, 3);

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "S")
    public static short field6124 = 1;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public int field6099;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field6101;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public int field6104;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public int field6109;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "[[I")
    public int[][] field6121;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public final void method2582(int arg0, int arg1, int arg2) {
        field6119++;
        int var4 = arg0 - this.field6101;
        int var5 = arg2 - this.field6099;
        if (arg1 == 22879) {
            this.field6121[var5][var4] = class248.method1549(this.field6121[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method2583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6118++;
        int var11 = arg4 + arg3;
        int var12 = arg7 + arg8;
        int var13 = arg1 + arg2;
        int var14 = arg0 + arg5;
        if (arg4 == var13 && (arg9 & 0x2) == 0) {
            int var15 = arg0 < arg7 ? arg7 : arg0;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field6121[var13 - this.field6099 - 1][var15 - this.field6101] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg9 & 0x8) == 0) {
            int var17 = arg7 > arg0 ? arg7 : arg0;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field6121[arg1 - this.field6099][var17 - this.field6101] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg1 < arg4 ? arg4 : arg1;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field6121[var19 - this.field6099][var14 - this.field6101 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg0 == var12 && (arg9 & 0x4) == 0) {
            int var21 = arg4 > arg1 ? arg4 : arg1;
            int var22 = var11 < var13 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field6121[var21 - this.field6099][arg0 - this.field6101] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        if (arg6 != 2883968) {
            this.field6109 = -112;
        }
        return false;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public final void method2584(int arg0) {
        for (int var2 = 0; var2 < this.field6109; var2++) {
            for (int var3 = 0; var3 < this.field6104; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field6109 - 5) || var3 >= this.field6104 - 5) {
                    this.field6121[var2][var3] = -1;
                } else {
                    this.field6121[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 > -116) {
            field6120 = null;
        }
        field6102++;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public final void method2585(int arg0, int arg1, int arg2) {
        field6114++;
        int var4 = arg1 - this.field6099;
        int var5 = arg2 - this.field6101;
        this.field6121[var4][var5] = class248.method1549(this.field6121[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6113++;
        if (arg4 == 1) {
            if (arg1 == arg6 && arg2 == arg7) {
                return true;
            }
        } else if (arg1 <= arg6 && arg6 <= arg1 - (1 - arg4) && arg7 >= arg7 && (arg4 + arg7 - 1) >= arg7) {
            return true;
        }
        int var9 = arg7 - this.field6101;
        int var10 = arg6 - this.field6099;
        if (arg5 != -19527) {
            field6124 = 43;
        }
        int var11 = arg1 - this.field6099;
        int var12 = arg2 - this.field6101;
        if (arg4 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field6121[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field6121[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field6121[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field6121[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field6121[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field6121[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field6121[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field6121[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field6121[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field6121[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field6121[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field6121[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var11 - 1;
            int var14 = var12 + arg4 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var10 + 1 == var11 && var12 <= var9 && var14 >= var9 && (this.field6121[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 - arg4 == var12 && (this.field6121[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - arg4) == var11 && var9 >= var12 && var14 >= var9 && (this.field6121[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg4 == var12 && (this.field6121[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - arg4 == var11 && var9 >= var12 && var9 <= var14 && (this.field6121[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 + 1 == var12 && (this.field6121[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14 && (this.field6121[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12 && (this.field6121[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12 && (this.field6121[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var11 && var10 <= var13 && (var9 - arg4) == var12 && (this.field6121[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg4) == var11 && var12 <= var9 && var9 <= var14 && (this.field6121[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14 && (this.field6121[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIBIIZI)V")
    public final void method2587(boolean arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg1 - this.field6101;
        field6108++;
        int var9 = arg6 - this.field6099;
        if (arg2 != -1) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method2595(var9, 128, var8, 10760);
                this.method2595(var9 - 1, 8, var8, arg2 + 10761);
            }
            if (arg3 == 1) {
                this.method2595(var9, 2, var8, 10760);
                this.method2595(var9, 32, var8 + 1, 10760);
            }
            if (arg3 == 2) {
                this.method2595(var9, 8, var8, 10760);
                this.method2595(var9 + 1, 128, var8, 10760);
            }
            if (arg3 == 3) {
                this.method2595(var9, 32, var8, 10760);
                this.method2595(var9, 2, var8 - 1, arg2 ^ 0xFFFFD5F7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method2595(var9, 1, var8, 10760);
                this.method2595(var9 - 1, 16, var8 + 1, 10760);
            }
            if (arg3 == 1) {
                this.method2595(var9, 4, var8, 10760);
                this.method2595(var9 + 1, 64, var8 + 1, 10760);
            }
            if (arg3 == 2) {
                this.method2595(var9, 16, var8, 10760);
                this.method2595(var9 + 1, 1, var8 - 1, 10760);
            }
            if (arg3 == 3) {
                this.method2595(var9, 64, var8, 10760);
                this.method2595(var9 - 1, 4, var8 - 1, 10760);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method2595(var9, 130, var8, 10760);
                this.method2595(var9 - 1, 8, var8, arg2 ^ 0xFFFFD5F7);
                this.method2595(var9, 32, var8 + 1, 10760);
            }
            if (arg3 == 1) {
                this.method2595(var9, 10, var8, 10760);
                this.method2595(var9, 32, var8 + 1, 10760);
                this.method2595(var9 + 1, 128, var8, 10760);
            }
            if (arg3 == 2) {
                this.method2595(var9, 40, var8, 10760);
                this.method2595(var9 + 1, 128, var8, 10760);
                this.method2595(var9, 2, var8 - 1, 10760);
            }
            if (arg3 == 3) {
                this.method2595(var9, 160, var8, 10760);
                this.method2595(var9, 2, var8 - 1, 10760);
                this.method2595(var9 - 1, 8, var8, 10760);
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg3 == 0) {
                    this.method2595(var9, 65536, var8, 10760);
                    this.method2595(var9 - 1, 4096, var8, 10760);
                }
                if (arg3 == 1) {
                    this.method2595(var9, 1024, var8, 10760);
                    this.method2595(var9, 16384, var8 + 1, 10760);
                }
                if (arg3 == 2) {
                    this.method2595(var9, 4096, var8, 10760);
                    this.method2595(var9 + 1, 65536, var8, arg2 + 10761);
                }
                if (arg3 == 3) {
                    this.method2595(var9, 16384, var8, 10760);
                    this.method2595(var9, 1024, var8 - 1, 10760);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg3 == 0) {
                    this.method2595(var9, 512, var8, 10760);
                    this.method2595(var9 - 1, 8192, var8 + 1, 10760);
                }
                if (arg3 == 1) {
                    this.method2595(var9, 2048, var8, 10760);
                    this.method2595(var9 + 1, 32768, var8 + 1, 10760);
                }
                if (arg3 == 2) {
                    this.method2595(var9, 8192, var8, 10760);
                    this.method2595(var9 + 1, 512, var8 - 1, 10760);
                }
                if (arg3 == 3) {
                    this.method2595(var9, 32768, var8, arg2 ^ 0xFFFFD5F7);
                    this.method2595(var9 - 1, 2048, var8 - 1, 10760);
                }
            }
            if (arg4 == 2) {
                if (arg3 == 0) {
                    this.method2595(var9, 66560, var8, 10760);
                    this.method2595(var9 - 1, 4096, var8, arg2 ^ 0xFFFFD5F7);
                    this.method2595(var9, 16384, var8 + 1, 10760);
                }
                if (arg3 == 1) {
                    this.method2595(var9, 5120, var8, 10760);
                    this.method2595(var9, 16384, var8 + 1, arg2 + 10761);
                    this.method2595(var9 + 1, 65536, var8, 10760);
                }
                if (arg3 == 2) {
                    this.method2595(var9, 20480, var8, 10760);
                    this.method2595(var9 + 1, 65536, var8, arg2 ^ 0xFFFFD5F7);
                    this.method2595(var9, 1024, var8 - 1, 10760);
                }
                if (arg3 == 3) {
                    this.method2595(var9, 81920, var8, 10760);
                    this.method2595(var9, 1024, var8 - 1, arg2 + 10761);
                    this.method2595(var9 - 1, 4096, var8, 10760);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method2595(var9, 536870912, var8, 10760);
                this.method2595(var9 - 1, 33554432, var8, 10760);
            }
            if (arg3 == 1) {
                this.method2595(var9, 8388608, var8, arg2 ^ 0xFFFFD5F7);
                this.method2595(var9, 134217728, var8 + 1, arg2 + 10761);
            }
            if (arg3 == 2) {
                this.method2595(var9, 33554432, var8, 10760);
                this.method2595(var9 + 1, 536870912, var8, 10760);
            }
            if (arg3 == 3) {
                this.method2595(var9, 134217728, var8, 10760);
                this.method2595(var9, 8388608, var8 - 1, arg2 ^ 0xFFFFD5F7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method2595(var9, 4194304, var8, arg2 ^ 0xFFFFD5F7);
                this.method2595(var9 - 1, 67108864, var8 + 1, 10760);
            }
            if (arg3 == 1) {
                this.method2595(var9, 16777216, var8, 10760);
                this.method2595(var9 + 1, 268435456, var8 + 1, arg2 + 10761);
            }
            if (arg3 == 2) {
                this.method2595(var9, 67108864, var8, 10760);
                this.method2595(var9 + 1, 4194304, var8 - 1, 10760);
            }
            if (arg3 == 3) {
                this.method2595(var9, 268435456, var8, 10760);
                this.method2595(var9 - 1, 16777216, var8 - 1, 10760);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2595(var9, 545259520, var8, 10760);
            this.method2595(var9 - 1, 33554432, var8, 10760);
            this.method2595(var9, 134217728, var8 + 1, 10760);
        }
        if (arg3 == 1) {
            this.method2595(var9, 41943040, var8, arg2 + 10761);
            this.method2595(var9, 134217728, var8 + 1, 10760);
            this.method2595(var9 + 1, 536870912, var8, 10760);
        }
        if (arg3 == 2) {
            this.method2595(var9, 167772160, var8, arg2 ^ 0xFFFFD5F7);
            this.method2595(var9 + 1, 536870912, var8, 10760);
            this.method2595(var9, 8388608, var8 - 1, arg2 + 10761);
        }
        if (arg3 == 3) {
            this.method2595(var9, 671088640, var8, 10760);
            this.method2595(var9, 8388608, var8 - 1, 10760);
            this.method2595(var9 - 1, 33554432, var8, 10760);
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZIZIZ)V")
    public final void method2588(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg1 - this.field6101;
        int var9 = arg5 - this.field6099;
        field6106++;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method2597(var9, 128, 5421, var8);
                this.method2597(var9 - 1, 8, 5421, var8);
            }
            if (arg3 == 1) {
                this.method2597(var9, 2, 5421, var8);
                this.method2597(var9, 32, 5421, var8 + 1);
            }
            if (arg3 == 2) {
                this.method2597(var9, 8, 5421, var8);
                this.method2597(var9 + 1, 128, 5421, var8);
            }
            if (arg3 == 3) {
                this.method2597(var9, 32, 5421, var8);
                this.method2597(var9, 2, 5421, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method2597(var9, 1, 5421, var8);
                this.method2597(var9 - 1, 16, 5421, var8 + 1);
            }
            if (arg3 == 1) {
                this.method2597(var9, 4, 5421, var8);
                this.method2597(var9 + 1, 64, 5421, var8 + 1);
            }
            if (arg3 == 2) {
                this.method2597(var9, 16, 5421, var8);
                this.method2597(var9 + 1, 1, 5421, var8 - 1);
            }
            if (arg3 == 3) {
                this.method2597(var9, 64, 5421, var8);
                this.method2597(var9 - 1, 4, 5421, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method2597(var9, 130, 5421, var8);
                this.method2597(var9 - 1, 8, 5421, var8);
                this.method2597(var9, 32, 5421, var8 + 1);
            }
            if (arg3 == 1) {
                this.method2597(var9, 10, 5421, var8);
                this.method2597(var9, 32, 5421, var8 + 1);
                this.method2597(var9 + 1, 128, 5421, var8);
            }
            if (arg3 == 2) {
                this.method2597(var9, 40, 5421, var8);
                this.method2597(var9 + 1, 128, 5421, var8);
                this.method2597(var9, 2, 5421, var8 - 1);
            }
            if (arg3 == 3) {
                this.method2597(var9, 160, 5421, var8);
                this.method2597(var9, 2, 5421, var8 - 1);
                this.method2597(var9 - 1, 8, 5421, var8);
            }
        }
        if (arg6) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    this.method2597(var9, 65536, 5421, var8);
                    this.method2597(var9 - 1, 4096, 5421, var8);
                }
                if (arg3 == 1) {
                    this.method2597(var9, 1024, 5421, var8);
                    this.method2597(var9, 16384, 5421, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method2597(var9, 4096, 5421, var8);
                    this.method2597(var9 + 1, 65536, 5421, var8);
                }
                if (arg3 == 3) {
                    this.method2597(var9, 16384, 5421, var8);
                    this.method2597(var9, 1024, 5421, var8 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg3 == 0) {
                    this.method2597(var9, 512, 5421, var8);
                    this.method2597(var9 - 1, 8192, 5421, var8 + 1);
                }
                if (arg3 == 1) {
                    this.method2597(var9, 2048, 5421, var8);
                    this.method2597(var9 + 1, 32768, 5421, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method2597(var9, 8192, 5421, var8);
                    this.method2597(var9 + 1, 512, 5421, var8 - 1);
                }
                if (arg3 == 3) {
                    this.method2597(var9, 32768, 5421, var8);
                    this.method2597(var9 - 1, 2048, 5421, var8 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    this.method2597(var9, 66560, 5421, var8);
                    this.method2597(var9 - 1, 4096, 5421, var8);
                    this.method2597(var9, 16384, 5421, var8 + 1);
                }
                if (arg3 == 1) {
                    this.method2597(var9, 5120, 5421, var8);
                    this.method2597(var9, 16384, 5421, var8 + 1);
                    this.method2597(var9 + 1, 65536, 5421, var8);
                }
                if (arg3 == 2) {
                    this.method2597(var9, 20480, 5421, var8);
                    this.method2597(var9 + 1, 65536, 5421, var8);
                    this.method2597(var9, 1024, 5421, var8 - 1);
                }
                if (arg3 == 3) {
                    this.method2597(var9, 81920, 5421, var8);
                    this.method2597(var9, 1024, 5421, var8 - 1);
                    this.method2597(var9 - 1, 4096, 5421, var8);
                }
            }
        }
        if (!arg2) {
            field6122 = null;
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method2597(var9, 536870912, 5421, var8);
                this.method2597(var9 - 1, 33554432, 5421, var8);
            }
            if (arg3 == 1) {
                this.method2597(var9, 8388608, 5421, var8);
                this.method2597(var9, 134217728, 5421, var8 + 1);
            }
            if (arg3 == 2) {
                this.method2597(var9, 33554432, 5421, var8);
                this.method2597(var9 + 1, 536870912, 5421, var8);
            }
            if (arg3 == 3) {
                this.method2597(var9, 134217728, 5421, var8);
                this.method2597(var9, 8388608, 5421, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method2597(var9, 4194304, 5421, var8);
                this.method2597(var9 - 1, 67108864, 5421, var8 + 1);
            }
            if (arg3 == 1) {
                this.method2597(var9, 16777216, 5421, var8);
                this.method2597(var9 + 1, 268435456, 5421, var8 + 1);
            }
            if (arg3 == 2) {
                this.method2597(var9, 67108864, 5421, var8);
                this.method2597(var9 + 1, 4194304, 5421, var8 - 1);
            }
            if (arg3 == 3) {
                this.method2597(var9, 268435456, 5421, var8);
                this.method2597(var9 - 1, 16777216, 5421, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2597(var9, 545259520, 5421, var8);
            this.method2597(var9 - 1, 33554432, 5421, var8);
            this.method2597(var9, 134217728, 5421, var8 + 1);
        }
        if (arg3 == 1) {
            this.method2597(var9, 41943040, 5421, var8);
            this.method2597(var9, 134217728, 5421, var8 + 1);
            this.method2597(var9 + 1, 536870912, 5421, var8);
        }
        if (arg3 == 2) {
            this.method2597(var9, 167772160, 5421, var8);
            this.method2597(var9 + 1, 536870912, 5421, var8);
            this.method2597(var9, 8388608, 5421, var8 - 1);
        }
        if (arg3 == 3) {
            this.method2597(var9, 671088640, 5421, var8);
            this.method2597(var9, 8388608, 5421, var8 - 1);
            this.method2597(var9 - 1, 33554432, 5421, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZIIIZ)V")
    public final void method2589(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field6123++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg4;
            arg4 = arg6;
            arg6 = var10;
        }
        int var11 = arg1 - this.field6099;
        int var12 = arg5 - this.field6101;
        for (int var13 = var11; var13 < arg4 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field6109) {
                for (int var14 = var12; var14 < (arg6 + var12); var14++) {
                    if (var14 >= 0 && var14 < this.field6104) {
                        this.method2595(var13, var9, var14, 10760);
                    }
                }
            }
        }
        if (arg0 != -4) {
            this.field6104 = -128;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method2590(int arg0) {
        field6098 = null;
        field6120 = null;
        if (arg0 < 99) {
            field6098 = null;
        }
        field6116 = null;
        field6122 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method2591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6112++;
        if (arg6 == 1) {
            if (arg3 == arg5 && arg1 == arg2) {
                return true;
            }
        } else if (arg3 <= arg5 && arg5 <= (arg3 + arg6 - 1) && arg2 <= arg2 && arg2 <= (arg2 - (1 - arg6))) {
            return true;
        }
        int var9 = arg5 - this.field6099;
        int var10 = arg2 - this.field6101;
        int var11 = arg3 - this.field6099;
        if (arg4 != 3981) {
            return true;
        }
        int var12 = arg1 - this.field6101;
        if (arg6 == 1) {
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field6121[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field6121[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field6121[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field6121[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field6121[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field6121[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field6121[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field6121[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field6121[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field6121[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field6121[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var11 - 1;
            int var14 = arg6 + var12 - 1;
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if ((var9 - arg6) == var11 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field6121[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 - arg6) == var12 && (this.field6121[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 <= var9 && var13 >= var9 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 - arg6 == var11 && var10 >= var12 && var10 <= var14 && (this.field6121[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field6121[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field6121[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 - arg6 == var12 && (this.field6121[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 <= var9 && var9 <= var13 && var10 - arg6 == var12) {
                        return true;
                    }
                    if ((var9 - arg6) == var11 && var10 >= var12 && var14 >= var10 && (this.field6121[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field6121[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if ((var9 - arg6) == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var14 && (this.field6121[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 - arg6) == var12 && (this.field6121[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - arg6 == var11 && var10 >= var12 && var14 >= var10 && (this.field6121[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg6 == var12 && (this.field6121[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 - arg6) == var11 && var12 <= var10 && var14 >= var10 && (this.field6121[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field6121[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 - arg6) == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var9 - arg6) == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 + 1 == var12 && (this.field6121[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field6121[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg6 == var12) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field6121[var9][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var11 && var13 >= var9 && (var10 - arg6) == var12 && (this.field6121[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg6 == var11 && var12 <= var10 && var10 <= var14 && (this.field6121[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field6121[var11][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIZZI)V")
    public final void method2592(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field6097++;
        int var8 = arg1;
        if (arg5) {
            var8 = arg1 | 0x20000;
        }
        int var9 = arg3 - this.field6099;
        if (arg4) {
            var8 |= 0x40000000;
        }
        int var10 = arg2 - this.field6101;
        for (int var11 = var9; var11 < (arg6 + var9); var11++) {
            if (var11 >= 0 && var11 < this.field6109) {
                for (int var12 = var10; var12 < var10 + arg0; var12++) {
                    if (var12 >= 0 && var12 < this.field6104) {
                        this.method2597(var11, var8, 5421, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)V")
    public final void method2593(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field6101;
        int var5 = arg0 - this.field6099;
        field6105++;
        this.field6121[var5][var4] = class367.method2256(this.field6121[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZZII)I")
    public static final int method2594(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field6100++;
        class456 var5 = class264.method1626(arg0 + 1, arg4, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg0 != -1) {
            field6122 = null;
        }
        for (int var7 = 0; var7 < var5.field6410.length; var7++) {
            if (var5.field6410[var7] >= 0 && class64.field834.field4918 > var5.field6410[var7]) {
                class41 var8 = class64.field834.method2129(var5.field6410[var7], false);
                int var9 = var8.method270(arg0 + 33, arg3, class408.field5734.method1541(-95, arg3).field6579);
                if (arg1) {
                    var6 += var5.field6415[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
    private final void method2595(int arg0, int arg1, int arg2, int arg3) {
        field6111++;
        this.field6121[arg0][arg2] = class367.method2256(this.field6121[arg0][arg2], ~arg1);
        if (arg3 != 10760) {
            this.field6101 = -56;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(III)V")
    public final void method2596(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field6099;
        int var5 = arg1 - this.field6101;
        field6117++;
        this.field6121[var4][var5] = class367.method2256(this.field6121[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)V")
    private final void method2597(int arg0, int arg1, int arg2, int arg3) {
        field6103++;
        if (arg2 != 5421) {
            this.field6109 = -123;
        }
        this.field6121[arg0][arg3] = class248.method1549(this.field6121[arg0][arg3], arg1);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)Ldt;")
    public static final class145 method2598(byte arg0, int arg1, int arg2) {
        field6115++;
        class145 var3 = class166.method1028(arg1, arg0 ^ 0xFFFFFFE0);
        if (arg2 == -1) {
            return var3;
        } else if (arg0 == -127) {
            return var3 == null || var3.field1943 == null || var3.field1943.length <= arg2 ? null : var3.field1943[arg2];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZIIIII)Z")
    public final boolean method2599(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6107++;
        if (arg2 > 1) {
            return class172.method1061(arg5, arg6, arg2, arg7, arg0, arg1, arg4, arg2, -113) ? true : this.method2583(arg1, arg7, arg6, arg2, arg0, arg5, 2883968, arg4, arg2, arg8);
        }
        int var10 = arg6 + arg7 - 1;
        int var11 = arg1 + arg5 - 1;
        if (arg7 <= arg0 && arg0 <= var10 && arg1 <= arg4 && var11 >= arg4) {
            return true;
        }
        if (!arg3) {
            this.field6099 = 7;
        }
        if (arg7 - 1 == arg0 && arg1 <= arg4 && arg4 <= var11 && (this.field6121[arg0 - this.field6099][arg4 - this.field6101] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg1 <= arg4 && arg4 <= var11 && (this.field6121[arg0 - this.field6099][arg4 - this.field6101] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg4 && arg0 >= arg7 && arg0 <= var10 && (this.field6121[arg0 - this.field6099][arg4 - this.field6101] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg4 && arg7 <= arg0 && var10 >= arg0 && (this.field6121[arg0 - this.field6099][arg4 - this.field6101] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }
}
