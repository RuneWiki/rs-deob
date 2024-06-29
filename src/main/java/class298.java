import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class298 {

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!pfa", name = "p", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!pfa", name = "q", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!pfa", name = "s", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!pfa", name = "t", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!pfa", name = "u", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!pfa", name = "v", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!pfa", name = "w", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "[[I")
    public int[][] field3994;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIIIII)Z", line = 4)
    public final boolean method1774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != -1) {
            this.method1787(33, false, 107, -45, 14, true, -5);
        }
        field4000++;
        int var11 = arg6 + arg7;
        int var12 = arg4 + arg8;
        int var13 = arg0 + arg5;
        int var14 = arg2 + arg1;
        if (arg7 == var13 && (arg9 & 0x2) == 0) {
            int var15 = arg4 > arg2 ? arg4 : arg2;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field3994[var13 - this.field3999 - 1][var15 - this.field4003] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg9 & 0x8) == 0) {
            int var17 = arg4 <= arg2 ? arg2 : arg4;
            int var18 = var12 < var14 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field3994[arg0 - this.field3999][var17 - this.field4003] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg4 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg7 > arg0 ? arg7 : arg0;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field3994[var19 - this.field3999][var14 - this.field4003 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg9 & 0x4) == 0) {
            int var21 = arg0 >= arg7 ? arg0 : arg7;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field3994[var21 - this.field3999][arg2 - this.field4003] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZBZIII)V", line = 99)
    public final void method1775(int arg0, boolean arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = -67 / ((arg2 + 41) / 59);
        int var9 = arg6 - this.field4003;
        field4010++;
        int var10 = arg4 - this.field3999;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1778(var10, var9, 128, 33);
                this.method1778(var10 - 1, var9, 8, 91);
            }
            if (arg5 == 1) {
                this.method1778(var10, var9, 2, 52);
                this.method1778(var10, var9 + 1, 32, 60);
            }
            if (arg5 == 2) {
                this.method1778(var10, var9, 8, 104);
                this.method1778(var10 + 1, var9, 128, 39);
            }
            if (arg5 == 3) {
                this.method1778(var10, var9, 32, 83);
                this.method1778(var10, var9 - 1, 2, 126);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1778(var10, var9, 1, 84);
                this.method1778(var10 - 1, var9 + 1, 16, 80);
            }
            if (arg5 == 1) {
                this.method1778(var10, var9, 4, 118);
                this.method1778(var10 + 1, var9 + 1, 64, 75);
            }
            if (arg5 == 2) {
                this.method1778(var10, var9, 16, 60);
                this.method1778(var10 + 1, var9 + -1, 1, 125);
            }
            if (arg5 == 3) {
                this.method1778(var10, var9, 64, 86);
                this.method1778(var10 - 1, var9 - 1, 4, 67);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method1778(var10, var9, 130, 109);
                this.method1778(var10 - 1, var9, 8, 105);
                this.method1778(var10, var9 + 1, 32, 83);
            }
            if (arg5 == 1) {
                this.method1778(var10, var9, 10, 42);
                this.method1778(var10, var9 + 1, 32, 112);
                this.method1778(var10 + 1, var9, 128, 34);
            }
            if (arg5 == 2) {
                this.method1778(var10, var9, 40, 78);
                this.method1778(var10 + 1, var9, 128, 99);
                this.method1778(var10, var9 - 1, 2, 30);
            }
            if (arg5 == 3) {
                this.method1778(var10, var9, 160, 66);
                this.method1778(var10, var9 - 1, 2, 30);
                this.method1778(var10 - 1, var9, 8, 86);
            }
        }
        if (arg1) {
            if (arg0 == 0) {
                if (arg5 == 0) {
                    this.method1778(var10, var9, 65536, 76);
                    this.method1778(var10 - 1, var9, 4096, 41);
                }
                if (arg5 == 1) {
                    this.method1778(var10, var9, 1024, 94);
                    this.method1778(var10, var9 + 1, 16384, 29);
                }
                if (arg5 == 2) {
                    this.method1778(var10, var9, 4096, 50);
                    this.method1778(var10 + 1, var9, 65536, 118);
                }
                if (arg5 == 3) {
                    this.method1778(var10, var9, 16384, 41);
                    this.method1778(var10, var9 - 1, 1024, 69);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg5 == 0) {
                    this.method1778(var10, var9, 512, 34);
                    this.method1778(var10 - 1, var9 - -1, 8192, 98);
                }
                if (arg5 == 1) {
                    this.method1778(var10, var9, 2048, 76);
                    this.method1778(var10 + 1, var9 + 1, 32768, 60);
                }
                if (arg5 == 2) {
                    this.method1778(var10, var9, 8192, 100);
                    this.method1778(var10 + 1, var9 + -1, 512, 31);
                }
                if (arg5 == 3) {
                    this.method1778(var10, var9, 32768, 92);
                    this.method1778(var10 - 1, var9 + -1, 2048, 111);
                }
            }
            if (arg0 == 2) {
                if (arg5 == 0) {
                    this.method1778(var10, var9, 66560, 88);
                    this.method1778(var10 - 1, var9, 4096, 99);
                    this.method1778(var10, var9 + 1, 16384, 101);
                }
                if (arg5 == 1) {
                    this.method1778(var10, var9, 5120, 92);
                    this.method1778(var10, var9 + 1, 16384, 54);
                    this.method1778(var10 + 1, var9, 65536, 113);
                }
                if (arg5 == 2) {
                    this.method1778(var10, var9, 20480, 93);
                    this.method1778(var10 + 1, var9, 65536, 115);
                    this.method1778(var10, var9 - 1, 1024, 34);
                }
                if (arg5 == 3) {
                    this.method1778(var10, var9, 81920, 37);
                    this.method1778(var10, var9 - 1, 1024, 112);
                    this.method1778(var10 - 1, var9, 4096, 34);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1778(var10, var9, 536870912, 71);
                this.method1778(var10 - 1, var9, 33554432, 86);
            }
            if (arg5 == 1) {
                this.method1778(var10, var9, 8388608, 99);
                this.method1778(var10, var9 + 1, 134217728, 89);
            }
            if (arg5 == 2) {
                this.method1778(var10, var9, 33554432, 91);
                this.method1778(var10 + 1, var9, 536870912, 55);
            }
            if (arg5 == 3) {
                this.method1778(var10, var9, 134217728, 82);
                this.method1778(var10, var9 - 1, 8388608, 117);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1778(var10, var9, 4194304, 78);
                this.method1778(var10 - 1, var9 + 1, 67108864, 106);
            }
            if (arg5 == 1) {
                this.method1778(var10, var9, 16777216, 39);
                this.method1778(var10 + 1, var9 + 1, 268435456, 34);
            }
            if (arg5 == 2) {
                this.method1778(var10, var9, 67108864, 31);
                this.method1778(var10 + 1, var9 - 1, 4194304, 65);
            }
            if (arg5 == 3) {
                this.method1778(var10, var9, 268435456, 79);
                this.method1778(var10 - 1, var9 + -1, 16777216, 58);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1778(var10, var9, 545259520, 79);
            this.method1778(var10 - 1, var9, 33554432, 51);
            this.method1778(var10, var9 + 1, 134217728, 53);
        }
        if (arg5 == 1) {
            this.method1778(var10, var9, 41943040, 83);
            this.method1778(var10, var9 + 1, 134217728, 42);
            this.method1778(var10 + 1, var9, 536870912, 39);
        }
        if (arg5 == 2) {
            this.method1778(var10, var9, 167772160, 105);
            this.method1778(var10 + 1, var9, 536870912, 118);
            this.method1778(var10, var9 - 1, 8388608, 60);
        }
        if (arg5 == 3) {
            this.method1778(var10, var9, 671088640, 77);
            this.method1778(var10, var9 - 1, 8388608, 106);
            this.method1778(var10 - 1, var9, 33554432, 111);
            return;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIII)Z", line = 410)
    public final boolean method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3995++;
        if (arg6 == 1) {
            if (arg0 == arg7 && arg2 == arg3) {
                return true;
            }
        } else if (arg0 >= arg7 && arg0 <= arg7 + arg6 - 1 && arg3 <= arg3 && arg3 <= (arg3 + arg6 - 1)) {
            return true;
        }
        int var9 = arg7 - this.field3999;
        int var10 = arg2 - this.field4003;
        int var11 = arg3 - this.field4003;
        if (arg5 != 17761) {
            this.method1784(39, (byte) -56, -52);
        }
        int var12 = arg0 - this.field3999;
        if (arg6 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field3994[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field3994[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field3994[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field3994[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field3994[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field3994[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field3994[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field3994[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field3994[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field3994[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field3994[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field3994[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var9 - 1;
            int var14 = var10 + arg6 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var12 + 1 == var9 && var11 >= var10 && var14 >= var11 && (this.field3994[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 - arg6 == var10 && (this.field3994[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var12 - arg6) == var9 && var11 >= var10 && var11 <= var14 && (this.field3994[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 - arg6 == var10 && (this.field3994[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - arg6 == var9 && var10 <= var11 && var14 >= var11 && (this.field3994[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 + 1) == var10 && (this.field3994[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var14 && (this.field3994[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var11 + 1 == var10 && (this.field3994[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field3994[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var9 && var12 <= var13 && (var11 - arg6) == var10 && (this.field3994[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg6 == var9 && var11 >= var10 && var14 >= var11 && (this.field3994[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 <= var11 && var14 >= var11 && (this.field3994[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIIII)Z", line = 597)
    public final boolean method1777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4009++;
        if (arg4 > 1) {
            return class551.method3134(arg1, arg0, -126, arg2, arg8, arg7, arg5, arg4, arg4) ? true : this.method1774(arg1, arg8, arg5, -1, arg2, arg0, arg4, arg7, arg4, arg6);
        }
        int var10 = arg1 + arg0 - 1;
        int var11 = arg5 + arg8 - 1;
        if (arg1 <= arg7 && var10 >= arg7 && arg2 >= arg5 && arg2 <= var11) {
            return true;
        } else if ((arg1 - 1) == arg7 && arg2 >= arg5 && var11 >= arg2 && (this.field3994[arg7 - this.field3999][arg2 - this.field4003] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg7 && arg5 <= arg2 && var11 >= arg2 && (this.field3994[arg7 - this.field3999][arg2 - this.field4003] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg2 && arg1 <= arg7 && var10 >= arg7 && (this.field3994[arg7 - this.field3999][arg2 - this.field4003] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else if (arg3 == 14672) {
            return (var11 + 1) == arg2 && arg1 <= arg7 && arg7 <= var10 && (this.field3994[arg7 - this.field3999][arg2 - this.field4003] & 0x20) == 0 && (arg6 & 0x1) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIII)V", line = 642)
    private final void method1778(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 28) {
            this.method1776(30, 97, -75, -102, 18, -47, -86, 19);
        }
        this.field3994[arg0][arg1] = class321.method1919(this.field3994[arg0][arg1], ~arg2);
        field3998++;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III)V", line = 653)
    public final void method1779(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3999;
        field4011++;
        int var5 = arg0 - this.field4003;
        if (arg1 != 23254) {
            this.method1783(-47, true, false, 44, -19, -64, (byte) -46);
        }
        this.field3994[var4][var5] = class344.method2020(this.field3994[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V", line = 679)
    public static final void method1780(int arg0) {
        field4008++;
        class262 var1 = class552.field7810;
        synchronized (class552.field7810) {
            class552.field7810.method1575((byte) 29);
            if (arg0 != 1) {
                field3990 = 11;
            }
        }
        class262 var2 = class407.field5741;
        synchronized (class407.field5741) {
            class407.field5741.method1575((byte) 80);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "([FIII[FIIFIII)V", line = 701)
    public static final void method1781(float[] arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, float arg7, int arg8, int arg9, int arg10) {
        if (arg10 < 101) {
            field3990 = 104;
        }
        int var11 = arg5 - arg3;
        int var12 = arg1 - arg6;
        int var13 = arg8 - arg9;
        field4004++;
        float var14 = arg4[2] * (float) var11 + arg4[1] * (float) var12 + arg4[0] * (float) var13;
        float var15 = arg4[5] * (float) var11 + arg4[3] * (float) var13 + arg4[4] * (float) var12;
        float var16 = arg4[8] * (float) var11 + arg4[6] * (float) var13 + arg4[7] * (float) var12;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg7 + 0.5F;
        if (arg2 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg2 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg2 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg0[0] = var18;
        arg0[1] = var19;
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(III)V", line = 754)
    public final void method1782(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4003;
        if (arg1 >= 28) {
            int var5 = arg2 - this.field3999;
            field4001++;
            this.field3994[var5][var4] = class321.method1919(this.field3994[var5][var4], -2097153);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZZIIIB)V", line = 768)
    public final void method1783(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = arg0 - this.field4003;
        if (arg6 < 63) {
            this.field4007 = 59;
        }
        field4002++;
        int var9 = arg4 - this.field3999;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method1785(var9, 128, (byte) -25, var8);
                this.method1785(var9 - 1, 8, (byte) -23, var8);
            }
            if (arg3 == 1) {
                this.method1785(var9, 2, (byte) -96, var8);
                this.method1785(var9, 32, (byte) -89, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1785(var9, 8, (byte) -54, var8);
                this.method1785(var9 + 1, 128, (byte) -114, var8);
            }
            if (arg3 == 3) {
                this.method1785(var9, 32, (byte) -104, var8);
                this.method1785(var9, 2, (byte) -20, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method1785(var9, 1, (byte) -119, var8);
                this.method1785(var9 - 1, 16, (byte) -68, var8 + 1);
            }
            if (arg3 == 1) {
                this.method1785(var9, 4, (byte) -99, var8);
                this.method1785(var9 + 1, 64, (byte) -45, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1785(var9, 16, (byte) -49, var8);
                this.method1785(var9 + 1, 1, (byte) -73, var8 - 1);
            }
            if (arg3 == 3) {
                this.method1785(var9, 64, (byte) -53, var8);
                this.method1785(var9 - 1, 4, (byte) -82, var8 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method1785(var9, 130, (byte) -52, var8);
                this.method1785(var9 - 1, 8, (byte) -33, var8);
                this.method1785(var9, 32, (byte) -26, var8 + 1);
            }
            if (arg3 == 1) {
                this.method1785(var9, 10, (byte) -53, var8);
                this.method1785(var9, 32, (byte) -112, var8 + 1);
                this.method1785(var9 + 1, 128, (byte) -71, var8);
            }
            if (arg3 == 2) {
                this.method1785(var9, 40, (byte) -72, var8);
                this.method1785(var9 + 1, 128, (byte) -113, var8);
                this.method1785(var9, 2, (byte) -111, var8 - 1);
            }
            if (arg3 == 3) {
                this.method1785(var9, 160, (byte) -90, var8);
                this.method1785(var9, 2, (byte) -45, var8 - 1);
                this.method1785(var9 - 1, 8, (byte) -95, var8);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method1785(var9, 65536, (byte) -30, var8);
                    this.method1785(var9 - 1, 4096, (byte) -126, var8);
                }
                if (arg3 == 1) {
                    this.method1785(var9, 1024, (byte) -102, var8);
                    this.method1785(var9, 16384, (byte) -92, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method1785(var9, 4096, (byte) -105, var8);
                    this.method1785(var9 + 1, 65536, (byte) -39, var8);
                }
                if (arg3 == 3) {
                    this.method1785(var9, 16384, (byte) -111, var8);
                    this.method1785(var9, 1024, (byte) -106, var8 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method1785(var9, 512, (byte) -128, var8);
                    this.method1785(var9 - 1, 8192, (byte) -60, var8 + 1);
                }
                if (arg3 == 1) {
                    this.method1785(var9, 2048, (byte) -78, var8);
                    this.method1785(var9 + 1, 32768, (byte) -81, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method1785(var9, 8192, (byte) -50, var8);
                    this.method1785(var9 + 1, 512, (byte) -92, var8 - 1);
                }
                if (arg3 == 3) {
                    this.method1785(var9, 32768, (byte) -85, var8);
                    this.method1785(var9 - 1, 2048, (byte) -27, var8 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method1785(var9, 66560, (byte) -49, var8);
                    this.method1785(var9 - 1, 4096, (byte) -27, var8);
                    this.method1785(var9, 16384, (byte) -72, var8 + 1);
                }
                if (arg3 == 1) {
                    this.method1785(var9, 5120, (byte) -83, var8);
                    this.method1785(var9, 16384, (byte) -95, var8 + 1);
                    this.method1785(var9 + 1, 65536, (byte) -110, var8);
                }
                if (arg3 == 2) {
                    this.method1785(var9, 20480, (byte) -72, var8);
                    this.method1785(var9 + 1, 65536, (byte) -36, var8);
                    this.method1785(var9, 1024, (byte) -27, var8 - 1);
                }
                if (arg3 == 3) {
                    this.method1785(var9, 81920, (byte) -26, var8);
                    this.method1785(var9, 1024, (byte) -112, var8 - 1);
                    this.method1785(var9 - 1, 4096, (byte) -108, var8);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method1785(var9, 536870912, (byte) -67, var8);
                this.method1785(var9 - 1, 33554432, (byte) -84, var8);
            }
            if (arg3 == 1) {
                this.method1785(var9, 8388608, (byte) -24, var8);
                this.method1785(var9, 134217728, (byte) -107, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1785(var9, 33554432, (byte) -86, var8);
                this.method1785(var9 + 1, 536870912, (byte) -24, var8);
            }
            if (arg3 == 3) {
                this.method1785(var9, 134217728, (byte) -46, var8);
                this.method1785(var9, 8388608, (byte) -47, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method1785(var9, 4194304, (byte) -50, var8);
                this.method1785(var9 - 1, 67108864, (byte) -123, var8 + 1);
            }
            if (arg3 == 1) {
                this.method1785(var9, 16777216, (byte) -39, var8);
                this.method1785(var9 + 1, 268435456, (byte) -103, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1785(var9, 67108864, (byte) -41, var8);
                this.method1785(var9 + 1, 4194304, (byte) -34, var8 - 1);
            }
            if (arg3 == 3) {
                this.method1785(var9, 268435456, (byte) -33, var8);
                this.method1785(var9 - 1, 16777216, (byte) -79, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1785(var9, 545259520, (byte) -70, var8);
            this.method1785(var9 - 1, 33554432, (byte) -66, var8);
            this.method1785(var9, 134217728, (byte) -36, var8 + 1);
        }
        if (arg3 == 1) {
            this.method1785(var9, 41943040, (byte) -29, var8);
            this.method1785(var9, 134217728, (byte) -96, var8 + 1);
            this.method1785(var9 + 1, 536870912, (byte) -72, var8);
        }
        if (arg3 == 2) {
            this.method1785(var9, 167772160, (byte) -112, var8);
            this.method1785(var9 + 1, 536870912, (byte) -93, var8);
            this.method1785(var9, 8388608, (byte) -114, var8 - 1);
        }
        if (arg3 == 3) {
            this.method1785(var9, 671088640, (byte) -66, var8);
            this.method1785(var9, 8388608, (byte) -124, var8 - 1);
            this.method1785(var9 - 1, 33554432, (byte) -117, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IBI)V", line = 1073)
    public final void method1784(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field4003;
        field3997++;
        if (arg1 != -14) {
            this.method1782(92, -7, 34);
        }
        int var5 = arg0 - this.field3999;
        this.field3994[var5][var4] = class344.method2020(this.field3994[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIBI)V", line = 1092)
    private final void method1785(int arg0, int arg1, byte arg2, int arg3) {
        field3996++;
        if (arg2 >= -17) {
            this.method1782(105, 35, 75);
        }
        this.field3994[arg0][arg3] = class344.method2020(this.field3994[arg0][arg3], arg1);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZII)V", line = 1108)
    public final void method1786(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4003;
        field3989++;
        int var5 = arg1 - this.field3999;
        if (arg0) {
            this.method1783(0, false, false, 89, 74, -95, (byte) -85);
        }
        this.field3994[var5][var4] = class321.method1919(this.field3994[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZIIIZI)V", line = 1121)
    public final void method1787(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3992++;
        int var8 = 256;
        if (arg5) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field3999;
        if (arg0 != 0) {
            this.method1784(-43, (byte) 16, 91);
        }
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var10 = arg6 - this.field4003;
        for (int var11 = var9; var11 < var9 + arg4; var11++) {
            if (var11 >= 0 && var11 < this.field4007) {
                for (int var12 = var10; var12 < (var10 + arg3); var12++) {
                    if (var12 >= 0 && var12 < this.field4006) {
                        this.method1785(var11, var8, (byte) -51, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V", line = 1168)
    public final void method1788(byte arg0) {
        field4005++;
        int var2 = 0;
        if (arg0 != -99) {
            return;
        }
        while (this.field4007 > var2) {
            for (int var3 = 0; var3 < this.field4006; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field4007 - 5 || var3 >= (this.field4006 - 5)) {
                    this.field3994[var2][var3] = -1;
                } else {
                    this.field3994[var2][var3] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZIIIZII)V", line = 1199)
    public final void method1789(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3993++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg0;
            arg0 = arg3;
            arg3 = var10;
        }
        int var11 = arg4 - this.field4003;
        int var12 = arg7 - this.field3999;
        for (int var13 = var12; var13 < (arg0 + var12); var13++) {
            if (var13 >= 0 && var13 < this.field4007) {
                for (int var14 = var11; var14 < (arg3 + var11); var14++) {
                    if (var14 >= 0 && this.field4006 > var14) {
                        this.method1778(var13, var14, var9, 75);
                    }
                }
            }
        }
        if (arg6 != 131072) {
            this.method1776(-71, -69, -92, -110, 104, -115, 29, -10);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIBIIIII)Z", line = 1256)
    public final boolean method1790(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3991++;
        if (arg3 == 1) {
            if (arg1 == arg6 && arg0 == arg4) {
                return true;
            }
        } else if (arg1 <= arg6 && arg6 <= arg1 + arg3 - 1 && arg0 <= arg0 && arg0 + arg3 - 1 >= arg0) {
            return true;
        }
        int var9 = arg4 - this.field4003;
        int var10 = -104 / ((arg2 - 45) / 41);
        int var11 = arg1 - this.field3999;
        int var12 = arg0 - this.field4003;
        int var13 = arg6 - this.field3999;
        if (arg3 == 1) {
            if (arg7 == 0) {
                if (arg5 == 0) {
                    if (var13 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var11 == var13 && (var12 + 1) == var9 && (this.field3994[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var13 && var12 - 1 == var9 && (this.field3994[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 == var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var13 - 1) == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var13 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var11 == var13 && (var12 + 1) == var9 && (this.field3994[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var12 - 1) == var9 && (this.field3994[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 == var13 && var12 - 1 == var9) {
                        return true;
                    }
                    if (var13 - 1 == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg5 == 0) {
                    if ((var13 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var11 == var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var12 - 1) == var9 && (this.field3994[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var13 - 1) == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var11 == var13 && (var12 - 1) == var9 && (this.field3994[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var13 - 1) == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var13 && var12 + 1 == var9 && (this.field3994[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var11 == var13 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var13 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var11 == var13 && var12 + 1 == var9 && (this.field3994[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var13 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var11 == var13 && var12 + 1 == var9 && (this.field3994[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var13 && var12 - 1 == var9 && (this.field3994[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var13 - 1 == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var13 + 1 == var11 && var9 == var12 && (this.field3994[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var11 + arg3 - 1;
            int var15 = arg3 + var9 - 1;
            if (arg7 == 0) {
                if (arg5 == 0) {
                    if ((var13 - arg3) == var11 && var9 <= var12 && var15 >= var12) {
                        return true;
                    }
                    if (var13 >= var11 && var14 >= var13 && var12 + 1 == var9 && (this.field3994[var13][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var13 <= var14 && var12 - arg3 == var9 && (this.field3994[var13][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 <= var13 && var14 >= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var13 - arg3 == var11 && var12 >= var9 && var15 >= var12 && (this.field3994[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var12 >= var9 && var15 >= var12 && (this.field3994[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var13 + 1) == var11 && var12 >= var9 && var15 >= var12) {
                        return true;
                    }
                    if (var13 >= var11 && var14 >= var13 && var12 + 1 == var9 && (this.field3994[var13][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var13 >= var11 && var13 <= var14 && (var12 - arg3) == var9 && (this.field3994[var13][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var13 >= var11 && var14 >= var13 && (var12 - arg3) == var9) {
                        return true;
                    }
                    if (var13 - arg3 == var11 && var9 <= var12 && var12 <= var15 && (this.field3994[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var9 <= var12 && var12 <= var15 && (this.field3994[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg5 == 0) {
                    if (var13 - arg3 == var11 && var12 >= var9 && var12 <= var15) {
                        return true;
                    }
                    if (var11 <= var13 && var14 >= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var9 <= var12 && var12 <= var15 && (this.field3994[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var13 <= var14 && (var12 - arg3) == var9 && (this.field3994[var13][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var13 - arg3) == var11 && var12 >= var9 && var12 <= var15 && (this.field3994[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var14 >= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var12 >= var9 && var12 <= var15) {
                        return true;
                    }
                    if (var13 >= var11 && var13 <= var14 && var12 - arg3 == var9 && (this.field3994[var13][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var13 - arg3 == var11 && var12 >= var9 && var15 >= var12 && (this.field3994[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var13 <= var14 && var12 + 1 == var9 && (this.field3994[var13][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var12 >= var9 && var12 <= var15) {
                        return true;
                    }
                    if (var13 >= var11 && var14 >= var13 && (var12 - arg3) == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var13 - arg3) == var11 && var12 >= var9 && var12 <= var15) {
                        return true;
                    }
                    if (var11 <= var13 && var13 <= var14 && (var12 + 1) == var9 && (this.field3994[var13][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var9 <= var12 && var12 <= var15 && (this.field3994[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var14 >= var13 && (var12 - arg3) == var9) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var13 >= var11 && var14 >= var13 && var12 + 1 == var9 && (this.field3994[var13][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var13 >= var11 && var14 >= var13 && (var12 - arg3) == var9 && (this.field3994[var13][var15] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var13 - arg3) == var11 && var9 <= var12 && var15 >= var12 && (this.field3994[var14][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var13 + 1) == var11 && var12 >= var9 && var12 <= var15 && (this.field3994[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
