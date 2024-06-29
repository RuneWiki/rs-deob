import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class370 {

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field4980 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public int field4975;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "[[I")
    public int[][] field4979;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIB)Z", line = 10)
    public final boolean method2132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field4971++;
        if (arg0 == 1) {
            if (arg2 == arg3 && arg1 == arg6) {
                return true;
            }
        } else if (arg2 <= arg3 && arg0 + arg2 - 1 >= arg3 && arg1 <= arg1 && arg1 <= arg0 + arg1 - 1) {
            return true;
        }
        int var9 = arg1 - this.field4975;
        int var10 = arg6 - this.field4975;
        int var11 = arg2 - this.field4978;
        int var12 = arg3 - this.field4978;
        if (arg7 <= 13) {
            field4980 = -81;
        }
        if (arg0 == 1) {
            if (arg5 == 0) {
                if (arg4 == 0) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4979[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field4979[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4979[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field4979[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                    if (var12 - 1 == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field4979[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field4979[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4979[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field4979[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field4979[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field4979[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field4979[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg0 - 1;
            int var14 = arg0 + var10 - 1;
            if (arg5 == 0) {
                if (arg4 == 0) {
                    if ((var12 - arg0) == var11 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var9 + 1) == var10 && (this.field4979[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 - arg0 == var10 && (this.field4979[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 <= var12 && var12 <= var13 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var12 - arg0) == var11 && var9 >= var10 && var9 <= var14 && (this.field4979[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 >= var10 && var9 <= var14 && (this.field4979[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var9 + 1 == var10 && (this.field4979[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var9 - arg0) == var10 && (this.field4979[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 >= var11 && var13 >= var12 && (var9 - arg0) == var10) {
                        return true;
                    }
                    if (var12 - arg0 == var11 && var9 >= var10 && var14 >= var9 && (this.field4979[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 >= var10 && var14 >= var9 && (this.field4979[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    if (var12 - arg0 == var11 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 >= var10 && var14 >= var9 && (this.field4979[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 - arg0) == var10 && (this.field4979[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - arg0) == var11 && var10 <= var9 && var14 >= var9 && (this.field4979[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var9 - arg0) == var10 && (this.field4979[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - arg0 == var11 && var9 >= var10 && var9 <= var14 && (this.field4979[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field4979[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 - arg0 == var10) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var12 - arg0) == var11 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var9 + 1 == var10 && (this.field4979[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var14 && (this.field4979[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 - arg0) == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field4979[var12][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var12 && var12 <= var13 && var9 - arg0 == var10 && (this.field4979[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var12 - arg0) == var11 && var10 <= var9 && var14 >= var9 && (this.field4979[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var10 <= var9 && var14 >= var9 && (this.field4979[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V", line = 373)
    public final void method2133(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4975;
        field4976++;
        int var5 = arg1 - this.field4978;
        if (arg2 != 15395) {
            this.method2134(-118, false, 0, -42, true, -1, -28);
        }
        this.field4979[var5][var4] = class242.method1474(this.field4979[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIIZII)V", line = 387)
    public final void method2134(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field4975;
        int var9 = arg2 - this.field4978;
        if (arg5 != 20480) {
            this.field4978 = -50;
        }
        field4973++;
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method2143(128, -2, var9, var8);
                this.method2143(8, -2, var9 - 1, var8);
            }
            if (arg6 == 1) {
                this.method2143(2, -2, var9, var8);
                this.method2143(32, arg5 - 20482, var9, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2143(8, -2, var9, var8);
                this.method2143(128, -2, var9 + 1, var8);
            }
            if (arg6 == 3) {
                this.method2143(32, -2, var9, var8);
                this.method2143(2, arg5 ^ 0xFFFFAFFE, var9, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method2143(1, -2, var9, var8);
                this.method2143(16, -2, var9 - 1, var8 + 1);
            }
            if (arg6 == 1) {
                this.method2143(4, -2, var9, var8);
                this.method2143(64, -2, var9 + 1, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2143(16, -2, var9, var8);
                this.method2143(1, -2, var9 + 1, var8 + -1);
            }
            if (arg6 == 3) {
                this.method2143(64, -2, var9, var8);
                this.method2143(4, -2, var9 - 1, var8 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                this.method2143(130, -2, var9, var8);
                this.method2143(8, -2, var9 - 1, var8);
                this.method2143(32, -2, var9, var8 + 1);
            }
            if (arg6 == 1) {
                this.method2143(10, -2, var9, var8);
                this.method2143(32, -2, var9, var8 + 1);
                this.method2143(128, arg5 - 20482, var9 + 1, var8);
            }
            if (arg6 == 2) {
                this.method2143(40, -2, var9, var8);
                this.method2143(128, arg5 - 20482, var9 + 1, var8);
                this.method2143(2, -2, var9, var8 - 1);
            }
            if (arg6 == 3) {
                this.method2143(160, -2, var9, var8);
                this.method2143(2, arg5 - 20482, var9, var8 - 1);
                this.method2143(8, -2, var9 - 1, var8);
            }
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    this.method2143(65536, -2, var9, var8);
                    this.method2143(4096, -2, var9 - 1, var8);
                }
                if (arg6 == 1) {
                    this.method2143(1024, -2, var9, var8);
                    this.method2143(16384, -2, var9, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method2143(4096, -2, var9, var8);
                    this.method2143(65536, arg5 ^ 0xFFFFAFFE, var9 + 1, var8);
                }
                if (arg6 == 3) {
                    this.method2143(16384, -2, var9, var8);
                    this.method2143(1024, arg5 ^ 0xFFFFAFFE, var9, var8 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg6 == 0) {
                    this.method2143(512, -2, var9, var8);
                    this.method2143(8192, -2, var9 - 1, var8 + 1);
                }
                if (arg6 == 1) {
                    this.method2143(2048, arg5 ^ 0xFFFFAFFE, var9, var8);
                    this.method2143(32768, -2, var9 + 1, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method2143(8192, -2, var9, var8);
                    this.method2143(512, -2, var9 + 1, var8 - 1);
                }
                if (arg6 == 3) {
                    this.method2143(32768, arg5 - 20482, var9, var8);
                    this.method2143(2048, -2, var9 - 1, var8 + -1);
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    this.method2143(66560, -2, var9, var8);
                    this.method2143(4096, arg5 ^ 0xFFFFAFFE, var9 - 1, var8);
                    this.method2143(16384, arg5 - 20482, var9, var8 + 1);
                }
                if (arg6 == 1) {
                    this.method2143(5120, -2, var9, var8);
                    this.method2143(16384, -2, var9, var8 + 1);
                    this.method2143(65536, arg5 - 20482, var9 + 1, var8);
                }
                if (arg6 == 2) {
                    this.method2143(20480, arg5 - 20482, var9, var8);
                    this.method2143(65536, arg5 - 20482, var9 + 1, var8);
                    this.method2143(1024, -2, var9, var8 - 1);
                }
                if (arg6 == 3) {
                    this.method2143(81920, -2, var9, var8);
                    this.method2143(1024, arg5 ^ 0xFFFFAFFE, var9, var8 - 1);
                    this.method2143(4096, -2, var9 - 1, var8);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method2143(536870912, -2, var9, var8);
                this.method2143(33554432, -2, var9 - 1, var8);
            }
            if (arg6 == 1) {
                this.method2143(8388608, -2, var9, var8);
                this.method2143(134217728, -2, var9, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2143(33554432, arg5 - 20482, var9, var8);
                this.method2143(536870912, arg5 - 20482, var9 + 1, var8);
            }
            if (arg6 == 3) {
                this.method2143(134217728, arg5 - 20482, var9, var8);
                this.method2143(8388608, arg5 ^ 0xFFFFAFFE, var9, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method2143(4194304, -2, var9, var8);
                this.method2143(67108864, arg5 - 20482, var9 + -1, var8 + 1);
            }
            if (arg6 == 1) {
                this.method2143(16777216, -2, var9, var8);
                this.method2143(268435456, -2, var9 + 1, var8 + 1);
            }
            if (arg6 == 2) {
                this.method2143(67108864, arg5 - 20482, var9, var8);
                this.method2143(4194304, -2, var9 + 1, var8 + -1);
            }
            if (arg6 == 3) {
                this.method2143(268435456, arg5 - 20482, var9, var8);
                this.method2143(16777216, -2, var9 - 1, var8 + -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method2143(545259520, arg5 ^ 0xFFFFAFFE, var9, var8);
            this.method2143(33554432, -2, var9 - 1, var8);
            this.method2143(134217728, -2, var9, var8 + 1);
        }
        if (arg6 == 1) {
            this.method2143(41943040, -2, var9, var8);
            this.method2143(134217728, -2, var9, var8 + 1);
            this.method2143(536870912, -2, var9 + 1, var8);
        }
        if (arg6 == 2) {
            this.method2143(167772160, -2, var9, var8);
            this.method2143(536870912, -2, var9 + 1, var8);
            this.method2143(8388608, -2, var9, var8 - 1);
        }
        if (arg6 == 3) {
            this.method2143(671088640, -2, var9, var8);
            this.method2143(8388608, -2, var9, var8 - 1);
            this.method2143(33554432, -2, var9 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIII)Z", line = 696)
    public final boolean method2135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4987++;
        if (arg3 > 1) {
            return class204.method1235(arg8, arg0 - 30503, arg3, arg7, arg3, arg1, arg4, arg6, arg5) ? true : this.method2142(arg3, (byte) 14, arg5, arg8, arg4, arg3, arg1, arg6, arg2, arg7);
        }
        if (arg0 != 0) {
            this.field4985 = 111;
        }
        int var10 = arg4 + arg7 - 1;
        int var11 = arg8 + arg5 - 1;
        if (arg4 <= arg6 && arg6 <= var10 && arg1 >= arg5 && arg1 <= var11) {
            return true;
        } else if ((arg4 - 1) == arg6 && arg1 >= arg5 && var11 >= arg1 && (this.field4979[arg6 - this.field4978][arg1 - this.field4975] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg6 && arg5 <= arg1 && arg1 <= var11 && (this.field4979[arg6 - this.field4978][arg1 - this.field4975] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg1 && arg4 <= arg6 && var10 >= arg6 && (this.field4979[arg6 - this.field4978][arg1 - this.field4975] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg1 && arg4 <= arg6 && arg6 <= var10 && (this.field4979[arg6 - this.field4978][arg1 - this.field4975] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)V", line = 737)
    public final void method2136(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4975;
        int var5 = arg2 - this.field4978;
        field4988++;
        this.field4979[var5][var4] = class435.method2605(this.field4979[var5][var4], -2097153);
        if (arg0 <= 32) {
            field4980 = -85;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I", line = 750)
    public static final int method2137(int arg0) {
        field4969++;
        if (arg0 != -5950) {
            field4980 = 57;
        }
        return 16;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 762)
    public final void method2138(byte arg0) {
        field4983++;
        if (arg0 >= -73) {
            this.field4966 = -20;
        }
        for (int var2 = 0; var2 < this.field4985; var2++) {
            for (int var3 = 0; var3 < this.field4966; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field4985 - 5) || (this.field4966 - 5) <= var3) {
                    this.field4979[var2][var3] = -1;
                } else {
                    this.field4979[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)Z", line = 793)
    public final boolean method2139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4967++;
        if (arg6 == 1) {
            if (arg2 == arg5 && arg3 == arg7) {
                return true;
            }
        } else if (arg2 >= arg5 && arg2 <= arg5 + arg6 - 1 && arg3 <= arg3 && arg3 <= (arg6 + arg3 - 1)) {
            return true;
        }
        if (arg1 != -1) {
            this.field4966 = -36;
        }
        int var9 = arg3 - this.field4975;
        int var10 = arg5 - this.field4978;
        int var11 = arg2 - this.field4978;
        int var12 = arg7 - this.field4975;
        if (arg6 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field4979[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field4979[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field4979[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field4979[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field4979[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field4979[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field4979[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field4979[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field4979[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field4979[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field4979[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field4979[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var10 - 1;
            int var14 = var12 + arg6 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var11 + 1) == var10 && var9 >= var12 && var14 >= var9 && (this.field4979[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 - arg6) == var12 && (this.field4979[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var11 - arg6) == var10 && var9 >= var12 && var14 >= var9 && (this.field4979[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 - arg6) == var12 && (this.field4979[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - arg6) == var10 && var9 >= var12 && var14 >= var9 && (this.field4979[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 + 1) == var12 && (this.field4979[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 + 1 == var10 && var9 >= var12 && var9 <= var14 && (this.field4979[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var9 + 1) == var12 && (this.field4979[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var10 <= var11 && var13 >= var11 && var9 + 1 == var12 && (this.field4979[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var10 && var11 <= var13 && (var9 - arg6) == var12 && (this.field4979[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg6 == var10 && var9 >= var12 && var9 <= var14 && (this.field4979[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 >= var12 && var14 >= var9 && (this.field4979[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(CI)C", line = 985)
    public static final char method2140(char arg0, int arg1) {
        field4982++;
        int var2 = 1 % (-arg1 / 45);
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIZIZI)V", line = 1381)
    public final void method2141(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field4984++;
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        int var10 = arg0 - this.field4975;
        if (arg1 != 131072) {
            return;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg2;
            arg2 = arg3;
            arg3 = var11;
        }
        if (arg4) {
            var9 |= 0x40000000;
        }
        int var12 = arg7 - this.field4978;
        for (int var13 = var12; var13 < arg2 + var12; var13++) {
            if (var13 >= 0 && this.field4985 > var13) {
                for (int var14 = var10; var14 < arg3 + var10; var14++) {
                    if (var14 >= 0 && this.field4966 > var14) {
                        this.method2148(var13, arg1 - 131071, var9, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBIIIIIIII)Z", line = 1433)
    public final boolean method2142(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4974++;
        int var11 = arg0 + arg7;
        if (arg1 != 14) {
            this.method2139(-90, -113, 84, -35, 108, -64, 3, 114);
        }
        int var12 = arg5 + arg6;
        int var13 = arg4 + arg9;
        int var14 = arg2 + arg3;
        if (arg7 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg6 <= arg2 ? arg2 : arg6;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field4979[var13 - (this.field4978 + 1)][var15 - this.field4975] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg4 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg2 >= arg6 ? arg2 : arg6;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field4979[arg4 - this.field4978][var17 - this.field4975] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg7 > arg4 ? arg7 : arg4;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field4979[var19 - this.field4978][var14 - (this.field4975 + 1)] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg4 < arg7 ? arg7 : arg4;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field4979[var21 - this.field4978][arg2 - this.field4975] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)V", line = 1527)
    private final void method2143(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == -2) {
            this.field4979[arg2][arg3] = class242.method1474(this.field4979[arg2][arg3], arg0);
            field4970++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZIIIZ)V", line = 1542)
    public final void method2144(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4986++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg3 - this.field4978;
        int var10 = arg5 - this.field4975;
        if (arg2) {
            var8 |= 0x40000000;
        }
        if (arg4 != 1073741824) {
            return;
        }
        for (int var11 = var9; var11 < (arg1 + var9); var11++) {
            if (var11 >= 0 && this.field4985 > var11) {
                for (int var12 = var10; var12 < (var10 + arg0); var12++) {
                    if (var12 >= 0 && var12 < this.field4966) {
                        this.method2143(var8, -2, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V", line = 1588)
    public final void method2145(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4975;
        int var5 = arg1 - this.field4978;
        if (arg2 == 0) {
            field4968++;
            this.field4979[var5][var4] = class242.method1474(this.field4979[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIIIIZ)V", line = 1603)
    public final void method2146(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 != 134217728) {
            return;
        }
        field4972++;
        int var8 = arg4 - this.field4978;
        int var9 = arg2 - this.field4975;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method2148(var8, 1, 128, var9);
                this.method2148(var8 - 1, 1, 8, var9);
            }
            if (arg0 == 1) {
                this.method2148(var8, arg3 - 134217727, 2, var9);
                this.method2148(var8, 1, 32, var9 + 1);
            }
            if (arg0 == 2) {
                this.method2148(var8, 1, 8, var9);
                this.method2148(var8 + 1, 1, 128, var9);
            }
            if (arg0 == 3) {
                this.method2148(var8, 1, 32, var9);
                this.method2148(var8, 1, 2, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method2148(var8, 1, 1, var9);
                this.method2148(var8 - 1, 1, 16, var9 + 1);
            }
            if (arg0 == 1) {
                this.method2148(var8, 1, 4, var9);
                this.method2148(var8 + 1, 1, 64, var9 + 1);
            }
            if (arg0 == 2) {
                this.method2148(var8, 1, 16, var9);
                this.method2148(var8 + 1, arg3 ^ 0x8000001, 1, var9 - 1);
            }
            if (arg0 == 3) {
                this.method2148(var8, 1, 64, var9);
                this.method2148(var8 - 1, arg3 ^ 0x8000001, 4, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method2148(var8, 1, 130, var9);
                this.method2148(var8 - 1, arg3 ^ 0x8000001, 8, var9);
                this.method2148(var8, 1, 32, var9 + 1);
            }
            if (arg0 == 1) {
                this.method2148(var8, arg3 - 134217727, 10, var9);
                this.method2148(var8, 1, 32, var9 + 1);
                this.method2148(var8 + 1, 1, 128, var9);
            }
            if (arg0 == 2) {
                this.method2148(var8, 1, 40, var9);
                this.method2148(var8 + 1, arg3 ^ 0x8000001, 128, var9);
                this.method2148(var8, 1, 2, var9 - 1);
            }
            if (arg0 == 3) {
                this.method2148(var8, 1, 160, var9);
                this.method2148(var8, 1, 2, var9 - 1);
                this.method2148(var8 - 1, 1, 8, var9);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method2148(var8, 1, 65536, var9);
                    this.method2148(var8 - 1, arg3 + -134217727, 4096, var9);
                }
                if (arg0 == 1) {
                    this.method2148(var8, 1, 1024, var9);
                    this.method2148(var8, arg3 - 134217727, 16384, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method2148(var8, 1, 4096, var9);
                    this.method2148(var8 + 1, 1, 65536, var9);
                }
                if (arg0 == 3) {
                    this.method2148(var8, 1, 16384, var9);
                    this.method2148(var8, arg3 - 134217727, 1024, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method2148(var8, 1, 512, var9);
                    this.method2148(var8 - 1, 1, 8192, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method2148(var8, arg3 ^ 0x8000001, 2048, var9);
                    this.method2148(var8 + 1, 1, 32768, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method2148(var8, 1, 8192, var9);
                    this.method2148(var8 + 1, arg3 ^ 0x8000001, 512, var9 - 1);
                }
                if (arg0 == 3) {
                    this.method2148(var8, 1, 32768, var9);
                    this.method2148(var8 - 1, 1, 2048, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method2148(var8, 1, 66560, var9);
                    this.method2148(var8 - 1, arg3 ^ 0x8000001, 4096, var9);
                    this.method2148(var8, arg3 ^ 0x8000001, 16384, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method2148(var8, 1, 5120, var9);
                    this.method2148(var8, 1, 16384, var9 + 1);
                    this.method2148(var8 + 1, arg3 + -134217727, 65536, var9);
                }
                if (arg0 == 2) {
                    this.method2148(var8, 1, 20480, var9);
                    this.method2148(var8 + 1, 1, 65536, var9);
                    this.method2148(var8, 1, 1024, var9 - 1);
                }
                if (arg0 == 3) {
                    this.method2148(var8, 1, 81920, var9);
                    this.method2148(var8, 1, 1024, var9 - 1);
                    this.method2148(var8 - 1, 1, 4096, var9);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method2148(var8, 1, 536870912, var9);
                this.method2148(var8 - 1, 1, 33554432, var9);
            }
            if (arg0 == 1) {
                this.method2148(var8, 1, 8388608, var9);
                this.method2148(var8, arg3 - 134217727, 134217728, var9 + 1);
            }
            if (arg0 == 2) {
                this.method2148(var8, 1, 33554432, var9);
                this.method2148(var8 + 1, 1, 536870912, var9);
            }
            if (arg0 == 3) {
                this.method2148(var8, 1, 134217728, var9);
                this.method2148(var8, 1, 8388608, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method2148(var8, arg3 ^ 0x8000001, 4194304, var9);
                this.method2148(var8 - 1, 1, 67108864, var9 + 1);
            }
            if (arg0 == 1) {
                this.method2148(var8, 1, 16777216, var9);
                this.method2148(var8 + 1, 1, 268435456, var9 + 1);
            }
            if (arg0 == 2) {
                this.method2148(var8, 1, 67108864, var9);
                this.method2148(var8 + 1, 1, 4194304, var9 - 1);
            }
            if (arg0 == 3) {
                this.method2148(var8, arg3 - 134217727, 268435456, var9);
                this.method2148(var8 - 1, arg3 ^ 0x8000001, 16777216, var9 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2148(var8, arg3 - 134217727, 545259520, var9);
            this.method2148(var8 - 1, 1, 33554432, var9);
            this.method2148(var8, 1, 134217728, var9 + 1);
        }
        if (arg0 == 1) {
            this.method2148(var8, arg3 - 134217727, 41943040, var9);
            this.method2148(var8, 1, 134217728, var9 + 1);
            this.method2148(var8 + 1, 1, 536870912, var9);
        }
        if (arg0 == 2) {
            this.method2148(var8, 1, 167772160, var9);
            this.method2148(var8 + 1, 1, 536870912, var9);
            this.method2148(var8, 1, 8388608, var9 - 1);
        }
        if (arg0 == 3) {
            this.method2148(var8, 1, 671088640, var9);
            this.method2148(var8, 1, 8388608, var9 - 1);
            this.method2148(var8 - 1, arg3 ^ 0x8000001, 33554432, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)V", line = 1924)
    public final void method2147(int arg0, int arg1, int arg2) {
        field4981++;
        if (arg2 != 31625) {
            this.field4975 = -78;
        }
        int var4 = arg1 - this.field4978;
        int var5 = arg0 - this.field4975;
        this.field4979[var4][var5] = class435.method2605(this.field4979[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIII)V", line = 1948)
    private final void method2148(int arg0, int arg1, int arg2, int arg3) {
        this.field4979[arg0][arg3] = class435.method2605(this.field4979[arg0][arg3], ~arg2);
        field4977++;
        if (arg1 != 1) {
            field4980 = 76;
        }
    }
}
