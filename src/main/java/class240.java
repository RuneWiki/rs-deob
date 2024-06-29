import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class240 {

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!tea", name = "u", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!tea", name = "v", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!tea", name = "w", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!tea", name = "x", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!tea", name = "y", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!tea", name = "A", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "[Lnn;")
    public static class417[] field3494;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "[[I")
    public int[][] field3488;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIZIIIZ)V", line = 3)
    public final void method1586(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field3482;
        int var9 = arg3 - this.field3500;
        field3487++;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method1598(0, 128, var9, var8);
                this.method1598(0, 8, var9 - 1, var8);
            }
            if (arg5 == 1) {
                this.method1598(0, 2, var9, var8);
                this.method1598(0, 32, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1598(0, 8, var9, var8);
                this.method1598(0, 128, var9 + 1, var8);
            }
            if (arg5 == 3) {
                this.method1598(0, 32, var9, var8);
                this.method1598(0, 2, var9, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method1598(0, 1, var9, var8);
                this.method1598(0, 16, var9 - 1, var8 + 1);
            }
            if (arg5 == 1) {
                this.method1598(0, 4, var9, var8);
                this.method1598(0, 64, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1598(0, 16, var9, var8);
                this.method1598(0, 1, var9 + 1, var8 + -1);
            }
            if (arg5 == 3) {
                this.method1598(0, 64, var9, var8);
                this.method1598(0, 4, var9 - 1, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method1598(0, 130, var9, var8);
                this.method1598(0, 8, var9 - 1, var8);
                this.method1598(0, 32, var9, var8 + 1);
            }
            if (arg5 == 1) {
                this.method1598(0, 10, var9, var8);
                this.method1598(0, 32, var9, var8 + 1);
                this.method1598(0, 128, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method1598(0, 40, var9, var8);
                this.method1598(0, 128, var9 + 1, var8);
                this.method1598(0, 2, var9, var8 - 1);
            }
            if (arg5 == 3) {
                this.method1598(0, 160, var9, var8);
                this.method1598(0, 2, var9, var8 - 1);
                this.method1598(0, 8, var9 - 1, var8);
            }
        }
        if (arg1 >= -57) {
            return;
        }
        if (arg2) {
            if (arg4 == 0) {
                if (arg5 == 0) {
                    this.method1598(0, 65536, var9, var8);
                    this.method1598(0, 4096, var9 - 1, var8);
                }
                if (arg5 == 1) {
                    this.method1598(0, 1024, var9, var8);
                    this.method1598(0, 16384, var9, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1598(0, 4096, var9, var8);
                    this.method1598(0, 65536, var9 + 1, var8);
                }
                if (arg5 == 3) {
                    this.method1598(0, 16384, var9, var8);
                    this.method1598(0, 1024, var9, var8 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg5 == 0) {
                    this.method1598(0, 512, var9, var8);
                    this.method1598(0, 8192, var9 - 1, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method1598(0, 2048, var9, var8);
                    this.method1598(0, 32768, var9 + 1, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1598(0, 8192, var9, var8);
                    this.method1598(0, 512, var9 + 1, var8 + -1);
                }
                if (arg5 == 3) {
                    this.method1598(0, 32768, var9, var8);
                    this.method1598(0, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    this.method1598(0, 66560, var9, var8);
                    this.method1598(0, 4096, var9 - 1, var8);
                    this.method1598(0, 16384, var9, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method1598(0, 5120, var9, var8);
                    this.method1598(0, 16384, var9, var8 + 1);
                    this.method1598(0, 65536, var9 + 1, var8);
                }
                if (arg5 == 2) {
                    this.method1598(0, 20480, var9, var8);
                    this.method1598(0, 65536, var9 + 1, var8);
                    this.method1598(0, 1024, var9, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method1598(0, 81920, var9, var8);
                    this.method1598(0, 1024, var9, var8 - 1);
                    this.method1598(0, 4096, var9 - 1, var8);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method1598(0, 536870912, var9, var8);
                this.method1598(0, 33554432, var9 - 1, var8);
            }
            if (arg5 == 1) {
                this.method1598(0, 8388608, var9, var8);
                this.method1598(0, 134217728, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1598(0, 33554432, var9, var8);
                this.method1598(0, 536870912, var9 + 1, var8);
            }
            if (arg5 == 3) {
                this.method1598(0, 134217728, var9, var8);
                this.method1598(0, 8388608, var9, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method1598(0, 4194304, var9, var8);
                this.method1598(0, 67108864, var9 - 1, var8 + 1);
            }
            if (arg5 == 1) {
                this.method1598(0, 16777216, var9, var8);
                this.method1598(0, 268435456, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1598(0, 67108864, var9, var8);
                this.method1598(0, 4194304, var9 + 1, var8 + -1);
            }
            if (arg5 == 3) {
                this.method1598(0, 268435456, var9, var8);
                this.method1598(0, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1598(0, 545259520, var9, var8);
            this.method1598(0, 33554432, var9 - 1, var8);
            this.method1598(0, 134217728, var9, var8 + 1);
        }
        if (arg5 == 1) {
            this.method1598(0, 41943040, var9, var8);
            this.method1598(0, 134217728, var9, var8 + 1);
            this.method1598(0, 536870912, var9 + 1, var8);
        }
        if (arg5 == 2) {
            this.method1598(0, 167772160, var9, var8);
            this.method1598(0, 536870912, var9 + 1, var8);
            this.method1598(0, 8388608, var9, var8 - 1);
        }
        if (arg5 == 3) {
            this.method1598(0, 671088640, var9, var8);
            this.method1598(0, 8388608, var9, var8 - 1);
            this.method1598(0, 33554432, var9 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILvd;)V", line = 312)
    public static final void method1587(int arg0, class39 arg1) {
        int var2 = 14 % ((arg0 + 7) / 50);
        class99.field1415 = arg1;
        field3479++;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIII)Z", line = 322)
    public static final boolean method1588(int arg0, int arg1, int arg2, int arg3) {
        class122.field1656.method767(arg1, arg0, arg3, class640.field8984);
        field3486++;
        if (arg2 > -73) {
            field3489 = -75;
        }
        int var4 = class640.field8984[2];
        if (var4 < 50) {
            return false;
        } else {
            class640.field8984[0] = class640.field8984[0] * class413.field6212 / var4 + class622.field8733;
            class640.field8984[1] = class516.field7342 + (class640.field8984[1] * class548.field7822 / var4);
            class640.field8984[2] = var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZIIIIZI)V", line = 343)
    public final void method1589(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3490++;
        int var8 = 256;
        int var9 = 26 % ((arg6 + 37) / 55);
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg5) {
            var8 |= 0x40000000;
        }
        int var10 = arg1 - this.field3500;
        int var11 = arg3 - this.field3482;
        for (int var12 = var10; var12 < (arg2 + var10); var12++) {
            if (var12 >= 0 && var12 < this.field3496) {
                for (int var13 = var11; var13 < arg4 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field3492) {
                        this.method1591(0, var8, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V", line = 385)
    public final void method1590(byte arg0) {
        field3503++;
        int var2 = 78 % ((arg0 - 59) / 58);
        for (int var3 = 0; var3 < this.field3496; var3++) {
            for (int var4 = 0; var4 < this.field3492; var4++) {
                if (var3 == 0 || var4 == 0 || var3 >= this.field3496 - 5 || this.field3492 - 5 <= var4) {
                    this.field3488[var3][var4] = -1;
                } else {
                    this.field3488[var3][var4] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(IIII)V", line = 416)
    private final void method1591(int arg0, int arg1, int arg2, int arg3) {
        this.field3488[arg3][arg2] = class625.method3600(this.field3488[arg3][arg2], arg1);
        field3484++;
        if (arg0 != 0) {
            this.field3500 = 97;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIIIIII)Z", line = 429)
    public final boolean method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3483++;
        int var11 = arg2 + arg7;
        int var12 = arg1 + arg4;
        int var13 = arg3 + arg9;
        if (arg0 != -10783) {
            return false;
        }
        int var14 = arg5 + arg6;
        if (arg2 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg5 < arg4 ? arg4 : arg5;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field3488[var13 - this.field3500 - 1][var15 - this.field3482] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg3 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg5 < arg4 ? arg4 : arg5;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field3488[arg3 - this.field3500][var17 - this.field3482] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg4 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg3 < arg2 ? arg2 : arg3;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field3488[var19 - this.field3500][var14 - this.field3482 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg5 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg2 <= arg3 ? arg3 : arg2;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field3488[var21 - this.field3500][arg5 - this.field3482] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/lang/String;IBZJIZIIIZJLjava/lang/String;)V", line = 525)
    public static final void method1593(String arg0, int arg1, byte arg2, boolean arg3, long arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, boolean arg10, long arg11, String arg12) {
        int var15 = 40 % ((arg2 - 55) / 51);
        field3481++;
        if (!class483.field6967 && class68.field969 < 500) {
            int var16 = arg5 == -1 ? class389.field5865 : arg5;
            class342 var17 = new class342(arg0, arg12, var16, arg8, arg7, arg4, arg1, arg9, arg10, arg3, arg11, arg6);
            class305.method1929(0, var17);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V", line = 545)
    public static final void method1594(boolean arg0) {
        field3491++;
        if (!arg0) {
            class344.field4987 = -1;
            class567.field8049 = 0;
            class445.field6615 = -1;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIB)V", line = 559)
    public final void method1595(int arg0, int arg1, byte arg2) {
        if (arg2 >= -125) {
            this.field3482 = -97;
        }
        field3493++;
        int var4 = arg0 - this.field3482;
        int var5 = arg1 - this.field3500;
        this.field3488[var5][var4] = class625.method3600(this.field3488[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIIIII)Z", line = 572)
    public final boolean method1596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3497++;
        if (arg6 > 1) {
            return class387.method2493(arg0, arg6, arg1, arg4, arg7, 117, arg5, arg6, arg8) ? true : this.method1592(-10783, arg6, arg7, arg0, arg8, arg5, arg4, arg6, arg2, arg1);
        }
        int var10 = arg0 + arg1 - 1;
        int var11 = arg4 + arg5 - 1;
        if (arg7 >= arg0 && var10 >= arg7 && arg5 <= arg8 && var11 >= arg8) {
            return true;
        }
        if (arg3 != -16001) {
            this.field3500 = 43;
        }
        if (arg0 - 1 == arg7 && arg5 <= arg8 && arg8 <= var11 && (this.field3488[arg7 - this.field3500][arg8 - this.field3482] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg7 && arg5 <= arg8 && var11 >= arg8 && (this.field3488[arg7 - this.field3500][arg8 - this.field3482] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if ((arg5 - 1) == arg8 && arg0 <= arg7 && arg7 <= var10 && (this.field3488[arg7 - this.field3500][arg8 - this.field3482] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg8 && arg0 <= arg7 && arg7 <= var10 && (this.field3488[arg7 - this.field3500][arg8 - this.field3482] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)V", line = 624)
    public final void method1597(int arg0, int arg1, int arg2) {
        field3498++;
        int var4 = arg0 - this.field3500;
        int var5 = arg2 - this.field3482;
        int var6 = -121 / ((arg1 - 32) / 49);
        this.field3488[var4][var5] = class625.method3600(this.field3488[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(IIII)V", line = 639)
    private final void method1598(int arg0, int arg1, int arg2, int arg3) {
        field3499++;
        if (arg0 == 0) {
            this.field3488[arg2][arg3] = class493.method2943(this.field3488[arg2][arg3], ~arg1);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIIII)Z", line = 650)
    public final boolean method1599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3502++;
        if (arg5 == 1) {
            if (arg4 == arg7 && arg0 == arg1) {
                return true;
            }
        } else if (arg4 >= arg7 && arg4 <= arg7 + arg5 - 1 && arg1 <= arg1 && arg1 <= (arg1 + arg5 - 1)) {
            return true;
        }
        int var9 = arg7 - this.field3500;
        int var10 = arg1 - this.field3482;
        int var11 = arg4 - this.field3500;
        int var12 = arg0 - this.field3482;
        if (arg3 != -16752) {
            return true;
        }
        if (arg5 == 1) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3488[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3488[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3488[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3488[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3488[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field3488[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3488[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3488[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field3488[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field3488[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field3488[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg5 - 1;
            int var14 = arg5 + var12 - 1;
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if ((var11 - arg5) == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field3488[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg5 == var12 && (this.field3488[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 <= var11 && var13 >= var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 - arg5 == var9 && var12 <= var10 && var10 <= var14 && (this.field3488[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 >= var12 && var14 >= var10 && (this.field3488[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 + 1 == var9 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12 && (this.field3488[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 - arg5) == var12 && (this.field3488[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 >= var9 && var11 <= var13 && (var10 - arg5) == var12) {
                        return true;
                    }
                    if ((var11 - arg5) == var9 && var10 >= var12 && var14 >= var10 && (this.field3488[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14 && (this.field3488[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if (var11 - arg5 == var9 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14 && (this.field3488[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 - arg5 == var12 && (this.field3488[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - arg5) == var9 && var10 >= var12 && var10 <= var14 && (this.field3488[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 - arg5) == var12 && (this.field3488[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - arg5 == var9 && var12 <= var10 && var10 <= var14 && (this.field3488[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 + 1 == var12 && (this.field3488[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg5 == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 - arg5 == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12 && (this.field3488[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 <= var10 && var14 >= var10 && (this.field3488[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg5 == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12 && (this.field3488[var11][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var11 && var13 >= var11 && (var10 - arg5) == var12 && (this.field3488[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg5 == var9 && var10 >= var12 && var14 >= var10 && (this.field3488[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var12 <= var10 && var14 >= var10 && (this.field3488[var9][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(Z)V", line = 1028)
    public static void method1600(boolean arg0) {
        if (arg0) {
            field3494 = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(III)V", line = 1040)
    public final void method1601(int arg0, int arg1, int arg2) {
        field3480++;
        int var4 = arg2 - this.field3482;
        int var5 = arg0 - this.field3500;
        this.field3488[var5][var4] = class493.method2943(this.field3488[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIZZI)V", line = 1050)
    public final void method1602(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field3501++;
        if (arg0 != 1073741824) {
            return;
        }
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        int var10 = arg7 - this.field3482;
        if (arg5) {
            var9 |= 0x40000000;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg2;
            arg2 = arg1;
            arg1 = var11;
        }
        int var12 = arg4 - this.field3500;
        for (int var13 = var12; var13 < var12 + arg2; var13++) {
            if (var13 >= 0 && this.field3496 > var13) {
                for (int var14 = var10; var14 < (arg1 + var10); var14++) {
                    if (var14 >= 0 && var14 < this.field3492) {
                        this.method1598(0, var9, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(III)V", line = 1104)
    public final void method1603(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field3500;
        int var5 = arg1 - this.field3482;
        if (arg2 != 1) {
            this.method1603(18, 32, -42);
        }
        field3504++;
        this.field3488[var4][var5] = class493.method2943(this.field3488[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILka;IZLria;I)V", line = 1121)
    public static final void method1604(int arg0, class473 arg1, int arg2, boolean arg3, class286 arg4, int arg5) {
        field3495++;
        if (arg1 != null) {
            arg4.method1829(arg1.method256(), arg1.method236(), arg5, arg1.method239(), arg1.method250(), arg3, arg1.method258(), arg1.method253(), arg1.method246(), arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIZIZI)V", line = 1147)
    public final void method1605(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field3482;
        field3485++;
        int var9 = arg0 - this.field3500;
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method1591(0, 128, var8, var9);
                this.method1591(0, 8, var8, var9 - 1);
            }
            if (arg6 == 1) {
                this.method1591(0, 2, var8, var9);
                this.method1591(0, 32, var8 + 1, var9);
            }
            if (arg6 == 2) {
                this.method1591(arg1 - 6437, 8, var8, var9);
                this.method1591(0, 128, var8, var9 + 1);
            }
            if (arg6 == 3) {
                this.method1591(arg1 ^ 0x1925, 32, var8, var9);
                this.method1591(0, 2, var8 - 1, var9);
            }
        }
        if (arg1 != 6437) {
            this.field3482 = -39;
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method1591(0, 1, var8, var9);
                this.method1591(arg1 - 6437, 16, var8 + 1, var9 + -1);
            }
            if (arg6 == 1) {
                this.method1591(0, 4, var8, var9);
                this.method1591(0, 64, var8 + 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method1591(arg1 - 6437, 16, var8, var9);
                this.method1591(0, 1, var8 - 1, var9 + 1);
            }
            if (arg6 == 3) {
                this.method1591(0, 64, var8, var9);
                this.method1591(0, 4, var8 - 1, var9 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                this.method1591(0, 130, var8, var9);
                this.method1591(arg1 - 6437, 8, var8, var9 - 1);
                this.method1591(0, 32, var8 + 1, var9);
            }
            if (arg6 == 1) {
                this.method1591(0, 10, var8, var9);
                this.method1591(arg1 - 6437, 32, var8 + 1, var9);
                this.method1591(arg1 ^ 0x1925, 128, var8, var9 + 1);
            }
            if (arg6 == 2) {
                this.method1591(0, 40, var8, var9);
                this.method1591(0, 128, var8, var9 + 1);
                this.method1591(0, 2, var8 - 1, var9);
            }
            if (arg6 == 3) {
                this.method1591(0, 160, var8, var9);
                this.method1591(0, 2, var8 - 1, var9);
                this.method1591(0, 8, var8, var9 - 1);
            }
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    this.method1591(arg1 ^ 0x1925, 65536, var8, var9);
                    this.method1591(0, 4096, var8, var9 - 1);
                }
                if (arg6 == 1) {
                    this.method1591(0, 1024, var8, var9);
                    this.method1591(arg1 ^ 0x1925, 16384, var8 + 1, var9);
                }
                if (arg6 == 2) {
                    this.method1591(arg1 ^ 0x1925, 4096, var8, var9);
                    this.method1591(arg1 - 6437, 65536, var8, var9 + 1);
                }
                if (arg6 == 3) {
                    this.method1591(0, 16384, var8, var9);
                    this.method1591(0, 1024, var8 - 1, var9);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg6 == 0) {
                    this.method1591(0, 512, var8, var9);
                    this.method1591(0, 8192, var8 + 1, var9 + -1);
                }
                if (arg6 == 1) {
                    this.method1591(0, 2048, var8, var9);
                    this.method1591(0, 32768, var8 + 1, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method1591(arg1 - 6437, 8192, var8, var9);
                    this.method1591(0, 512, var8 - 1, var9 - -1);
                }
                if (arg6 == 3) {
                    this.method1591(0, 32768, var8, var9);
                    this.method1591(0, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    this.method1591(arg1 ^ 0x1925, 66560, var8, var9);
                    this.method1591(0, 4096, var8, var9 - 1);
                    this.method1591(0, 16384, var8 + 1, var9);
                }
                if (arg6 == 1) {
                    this.method1591(0, 5120, var8, var9);
                    this.method1591(0, 16384, var8 + 1, var9);
                    this.method1591(0, 65536, var8, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method1591(0, 20480, var8, var9);
                    this.method1591(0, 65536, var8, var9 + 1);
                    this.method1591(arg1 - 6437, 1024, var8 - 1, var9);
                }
                if (arg6 == 3) {
                    this.method1591(0, 81920, var8, var9);
                    this.method1591(arg1 - 6437, 1024, var8 - 1, var9);
                    this.method1591(0, 4096, var8, var9 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method1591(0, 536870912, var8, var9);
                this.method1591(arg1 - 6437, 33554432, var8, var9 - 1);
            }
            if (arg6 == 1) {
                this.method1591(arg1 ^ 0x1925, 8388608, var8, var9);
                this.method1591(0, 134217728, var8 + 1, var9);
            }
            if (arg6 == 2) {
                this.method1591(0, 33554432, var8, var9);
                this.method1591(arg1 ^ 0x1925, 536870912, var8, var9 + 1);
            }
            if (arg6 == 3) {
                this.method1591(arg1 ^ 0x1925, 134217728, var8, var9);
                this.method1591(0, 8388608, var8 - 1, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method1591(0, 4194304, var8, var9);
                this.method1591(0, 67108864, var8 + 1, var9 - 1);
            }
            if (arg6 == 1) {
                this.method1591(0, 16777216, var8, var9);
                this.method1591(0, 268435456, var8 + 1, var9 - -1);
            }
            if (arg6 == 2) {
                this.method1591(0, 67108864, var8, var9);
                this.method1591(0, 4194304, var8 - 1, var9 + 1);
            }
            if (arg6 == 3) {
                this.method1591(arg1 ^ 0x1925, 268435456, var8, var9);
                this.method1591(0, 16777216, var8 - 1, var9 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method1591(0, 545259520, var8, var9);
            this.method1591(0, 33554432, var8, var9 - 1);
            this.method1591(0, 134217728, var8 + 1, var9);
        }
        if (arg6 == 1) {
            this.method1591(0, 41943040, var8, var9);
            this.method1591(0, 134217728, var8 + 1, var9);
            this.method1591(0, 536870912, var8, var9 + 1);
        }
        if (arg6 == 2) {
            this.method1591(0, 167772160, var8, var9);
            this.method1591(arg1 ^ 0x1925, 536870912, var8, var9 + 1);
            this.method1591(0, 8388608, var8 - 1, var9);
        }
        if (arg6 == 3) {
            this.method1591(arg1 ^ 0x1925, 671088640, var8, var9);
            this.method1591(0, 8388608, var8 - 1, var9);
            this.method1591(arg1 ^ 0x1925, 33554432, var8, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(IIIIIIII)Z", line = 1464)
    public final boolean method1606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3478++;
        if (arg0 == 1) {
            if (arg2 == arg4 && arg1 == arg6) {
                return true;
            }
        } else if (arg2 <= arg4 && arg4 <= arg0 + arg2 - 1 && arg1 >= arg1 && arg1 <= arg0 + arg1 - 1) {
            return true;
        }
        int var9 = arg1 - this.field3482;
        int var10 = arg2 - this.field3500;
        int var11 = arg4 - this.field3500;
        int var12 = arg6 - this.field3482;
        if (arg5 != 671744) {
            return false;
        }
        if (arg0 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field3488[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field3488[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field3488[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field3488[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field3488[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field3488[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field3488[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field3488[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field3488[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var9 - 1) == var12 && (this.field3488[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field3488[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field3488[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg0 - 1;
            int var14 = var12 + arg0 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var10 && var12 <= var9 && var14 >= var9 && (this.field3488[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var9 - arg0 == var12 && (this.field3488[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - arg0) == var10 && var12 <= var9 && var9 <= var14 && (this.field3488[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var9 - arg0 == var12 && (this.field3488[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg0) == var10 && var9 >= var12 && var9 <= var14 && (this.field3488[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var9 + 1 == var12 && (this.field3488[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 + 1) == var10 && var9 >= var12 && var14 >= var9 && (this.field3488[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var9 + 1) == var12 && (this.field3488[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 <= var11 && var13 >= var11 && var9 + 1 == var12 && (this.field3488[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var11 && var13 >= var11 && (var9 - arg0) == var12 && (this.field3488[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg0) == var10 && var9 >= var12 && var9 <= var14 && (this.field3488[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 >= var12 && var14 >= var9 && (this.field3488[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
