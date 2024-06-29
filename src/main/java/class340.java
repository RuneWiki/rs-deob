import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class340 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public int field4827;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public int field4832;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    public int field4837;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "[[I")
    public int[][] field4822;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2077(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4833++;
        if (arg3 == 1) {
            if (arg4 == arg7 && arg0 == arg5) {
                return true;
            }
        } else if (arg4 >= arg7 && arg3 + arg7 - 1 >= arg4 && arg5 >= arg5 && (arg3 + arg5 - 1) >= arg5) {
            return true;
        }
        int var9 = arg4 - this.field4824;
        int var10 = arg0 - this.field4837;
        int var11 = -60 % ((arg6 - 25) / 40);
        int var12 = arg7 - this.field4824;
        int var13 = arg5 - this.field4837;
        if (arg3 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var9 + 1 == var12 && var10 == var13 && (this.field4822[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var13 - 1) == var10 && (this.field4822[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - 1 == var12 && var10 == var13 && (this.field4822[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var13 - 1) == var10 && (this.field4822[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - 1) == var12 && var10 == var13 && (this.field4822[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var13 + 1) == var10 && (this.field4822[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 + 1) == var12 && var10 == var13 && (this.field4822[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var13 + 1) == var10 && (this.field4822[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var12 && var13 + 1 == var10 && (this.field4822[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var13 - 1 == var10 && (this.field4822[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var13 && (this.field4822[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 == var13 && (this.field4822[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg3 + var12 - 1;
            int var15 = arg3 + var10 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var12 && var13 >= var10 && var13 <= var15 && (this.field4822[var12][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var14 >= var9 && var13 - arg3 == var10 && (this.field4822[var9][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - arg3 == var12 && var10 <= var13 && var15 >= var13 && (this.field4822[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var14 >= var9 && (var13 - arg3) == var10 && (this.field4822[var9][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - arg3 == var12 && var10 <= var13 && var15 >= var13 && (this.field4822[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var14 >= var9 && var13 + 1 == var10 && (this.field4822[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 + 1) == var12 && var13 >= var10 && var15 >= var13 && (this.field4822[var12][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var14 && var13 + 1 == var10 && (this.field4822[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 >= var12 && var14 >= var9 && (var13 + 1) == var10 && (this.field4822[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var12 && var14 >= var9 && var13 - arg3 == var10 && (this.field4822[var9][var15] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg3) == var12 && var13 >= var10 && var13 <= var15 && (this.field4822[var14][var13] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var13 >= var10 && var13 <= var15 && (this.field4822[var12][var13] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method2078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4820++;
        int var11 = arg2 + arg4;
        int var12 = arg3 + arg0;
        int var13 = arg9 + arg6;
        if (arg1 < 35) {
            this.field4824 = -24;
        }
        int var14 = arg5 + arg7;
        if (arg4 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg3 <= arg7 ? arg7 : arg3;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field4822[var13 - this.field4824 - 1][var15 - this.field4837] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg3 > arg7 ? arg3 : arg7;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field4822[arg9 - this.field4824][var17 - this.field4837] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg9 >= arg4 ? arg9 : arg4;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field4822[var19 - this.field4824][var14 - (this.field4837 + 1)] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg4 > arg9 ? arg4 : arg9;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field4822[var21 - this.field4824][arg7 - this.field4837] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZIIIIZI)V")
    public final void method2079(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field4824;
        field4819++;
        int var9 = arg1 - this.field4837;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method2092(-101, var9, var8, 128);
                this.method2092(126, var9, var8 - 1, 8);
            }
            if (arg2 == 1) {
                this.method2092(-104, var9, var8, 2);
                this.method2092(-112, var9 + 1, var8, 32);
            }
            if (arg2 == 2) {
                this.method2092(-110, var9, var8, 8);
                this.method2092(126, var9, var8 + 1, 128);
            }
            if (arg2 == 3) {
                this.method2092(17, var9, var8, 32);
                this.method2092(127, var9 - 1, var8, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method2092(127, var9, var8, 1);
                this.method2092(126, var9 + 1, var8 + -1, 16);
            }
            if (arg2 == 1) {
                this.method2092(-55, var9, var8, 4);
                this.method2092(-102, var9 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method2092(-80, var9, var8, 16);
                this.method2092(-4, var9 - 1, var8 + 1, 1);
            }
            if (arg2 == 3) {
                this.method2092(127, var9, var8, 64);
                this.method2092(126, var9 - 1, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method2092(22, var9, var8, 130);
                this.method2092(126, var9, var8 - 1, 8);
                this.method2092(-77, var9 + 1, var8, 32);
            }
            if (arg2 == 1) {
                this.method2092(127, var9, var8, 10);
                this.method2092(126, var9 + 1, var8, 32);
                this.method2092(-12, var9, var8 + 1, 128);
            }
            if (arg2 == 2) {
                this.method2092(127, var9, var8, 40);
                this.method2092(-91, var9, var8 + 1, 128);
                this.method2092(127, var9 - 1, var8, 2);
            }
            if (arg2 == 3) {
                this.method2092(126, var9, var8, 160);
                this.method2092(127, var9 - 1, var8, 2);
                this.method2092(127, var9, var8 - 1, 8);
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    this.method2092(127, var9, var8, 65536);
                    this.method2092(-79, var9, var8 - 1, 4096);
                }
                if (arg2 == 1) {
                    this.method2092(-21, var9, var8, 1024);
                    this.method2092(-111, var9 + 1, var8, 16384);
                }
                if (arg2 == 2) {
                    this.method2092(126, var9, var8, 4096);
                    this.method2092(126, var9, var8 + 1, 65536);
                }
                if (arg2 == 3) {
                    this.method2092(-80, var9, var8, 16384);
                    this.method2092(-125, var9 - 1, var8, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg2 == 0) {
                    this.method2092(126, var9, var8, 512);
                    this.method2092(-69, var9 + 1, var8 - 1, 8192);
                }
                if (arg2 == 1) {
                    this.method2092(126, var9, var8, 2048);
                    this.method2092(-31, var9 + 1, var8 - -1, 32768);
                }
                if (arg2 == 2) {
                    this.method2092(126, var9, var8, 8192);
                    this.method2092(126, var9 - 1, var8 + 1, 512);
                }
                if (arg2 == 3) {
                    this.method2092(19, var9, var8, 32768);
                    this.method2092(126, var9 - 1, var8 + -1, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    this.method2092(126, var9, var8, 66560);
                    this.method2092(127, var9, var8 - 1, 4096);
                    this.method2092(-73, var9 + 1, var8, 16384);
                }
                if (arg2 == 1) {
                    this.method2092(126, var9, var8, 5120);
                    this.method2092(127, var9 + 1, var8, 16384);
                    this.method2092(127, var9, var8 + 1, 65536);
                }
                if (arg2 == 2) {
                    this.method2092(-92, var9, var8, 20480);
                    this.method2092(-77, var9, var8 + 1, 65536);
                    this.method2092(-126, var9 - 1, var8, 1024);
                }
                if (arg2 == 3) {
                    this.method2092(-60, var9, var8, 81920);
                    this.method2092(-67, var9 - 1, var8, 1024);
                    this.method2092(127, var9, var8 - 1, 4096);
                }
            }
        }
        if (arg3 < 121 || !arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method2092(-68, var9, var8, 536870912);
                this.method2092(3, var9, var8 - 1, 33554432);
            }
            if (arg2 == 1) {
                this.method2092(-118, var9, var8, 8388608);
                this.method2092(126, var9 + 1, var8, 134217728);
            }
            if (arg2 == 2) {
                this.method2092(-117, var9, var8, 33554432);
                this.method2092(-35, var9, var8 + 1, 536870912);
            }
            if (arg2 == 3) {
                this.method2092(127, var9, var8, 134217728);
                this.method2092(127, var9 - 1, var8, 8388608);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method2092(127, var9, var8, 4194304);
                this.method2092(-8, var9 + 1, var8 + -1, 67108864);
            }
            if (arg2 == 1) {
                this.method2092(-70, var9, var8, 16777216);
                this.method2092(-55, var9 + 1, var8 + 1, 268435456);
            }
            if (arg2 == 2) {
                this.method2092(29, var9, var8, 67108864);
                this.method2092(8, var9 - 1, var8 - -1, 4194304);
            }
            if (arg2 == 3) {
                this.method2092(7, var9, var8, 268435456);
                this.method2092(23, var9 - 1, var8 + -1, 16777216);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method2092(126, var9, var8, 545259520);
            this.method2092(127, var9, var8 - 1, 33554432);
            this.method2092(127, var9 + 1, var8, 134217728);
        }
        if (arg2 == 1) {
            this.method2092(127, var9, var8, 41943040);
            this.method2092(127, var9 + 1, var8, 134217728);
            this.method2092(-65, var9, var8 + 1, 536870912);
        }
        if (arg2 == 2) {
            this.method2092(126, var9, var8, 167772160);
            this.method2092(127, var9, var8 + 1, 536870912);
            this.method2092(126, var9 - 1, var8, 8388608);
        }
        if (arg2 == 3) {
            this.method2092(-10, var9, var8, 671088640);
            this.method2092(-11, var9 - 1, var8, 8388608);
            this.method2092(127, var9, var8 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
    public final void method2080(int arg0, int arg1, int arg2) {
        field4831++;
        int var4 = arg1 - this.field4824;
        int var5 = arg2 - this.field4837;
        this.field4822[var4][var5] = class194.method1380(this.field4822[var4][var5], -2097153);
        if (arg0 != 2726) {
            this.method2080(16, -85, -73);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IBI)V")
    public final void method2081(int arg0, byte arg1, int arg2) {
        if (arg1 != 56) {
            this.method2083(-46, 17, 78);
        }
        int var4 = arg2 - this.field4824;
        field4817++;
        int var5 = arg0 - this.field4837;
        this.field4822[var4][var5] = class694.method3895(this.field4822[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZIIZIZI)V")
    public final void method2082(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field4837;
        int var9 = arg2 - this.field4824;
        field4834++;
        if (arg6 == 0) {
            if (arg1 == 0) {
                this.method2085(var9, 128, var8, -1);
                this.method2085(var9 - 1, 8, var8, -1);
            }
            if (arg1 == 1) {
                this.method2085(var9, 2, var8, -1);
                this.method2085(var9, 32, var8 + 1, -1);
            }
            if (arg1 == 2) {
                this.method2085(var9, 8, var8, -1);
                this.method2085(var9 + 1, 128, var8, -1);
            }
            if (arg1 == 3) {
                this.method2085(var9, 32, var8, -1);
                this.method2085(var9, 2, var8 - 1, -1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg1 == 0) {
                this.method2085(var9, 1, var8, -1);
                this.method2085(var9 - 1, 16, var8 + 1, -1);
            }
            if (arg1 == 1) {
                this.method2085(var9, 4, var8, -1);
                this.method2085(var9 + 1, 64, var8 + 1, -1);
            }
            if (arg1 == 2) {
                this.method2085(var9, 16, var8, -1);
                this.method2085(var9 + 1, 1, var8 - 1, -1);
            }
            if (arg1 == 3) {
                this.method2085(var9, 64, var8, -1);
                this.method2085(var9 - 1, 4, var8 - 1, -1);
            }
        }
        if (arg6 == 2) {
            if (arg1 == 0) {
                this.method2085(var9, 130, var8, -1);
                this.method2085(var9 - 1, 8, var8, -1);
                this.method2085(var9, 32, var8 + 1, -1);
            }
            if (arg1 == 1) {
                this.method2085(var9, 10, var8, -1);
                this.method2085(var9, 32, var8 + 1, -1);
                this.method2085(var9 + 1, 128, var8, -1);
            }
            if (arg1 == 2) {
                this.method2085(var9, 40, var8, -1);
                this.method2085(var9 + 1, 128, var8, -1);
                this.method2085(var9, 2, var8 - 1, -1);
            }
            if (arg1 == 3) {
                this.method2085(var9, 160, var8, -1);
                this.method2085(var9, 2, var8 - 1, -1);
                this.method2085(var9 - 1, 8, var8, -1);
            }
        }
        if (arg0) {
            if (arg6 == 0) {
                if (arg1 == 0) {
                    this.method2085(var9, 65536, var8, -1);
                    this.method2085(var9 - 1, 4096, var8, -1);
                }
                if (arg1 == 1) {
                    this.method2085(var9, 1024, var8, -1);
                    this.method2085(var9, 16384, var8 + 1, -1);
                }
                if (arg1 == 2) {
                    this.method2085(var9, 4096, var8, -1);
                    this.method2085(var9 + 1, 65536, var8, -1);
                }
                if (arg1 == 3) {
                    this.method2085(var9, 16384, var8, -1);
                    this.method2085(var9, 1024, var8 - 1, -1);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg1 == 0) {
                    this.method2085(var9, 512, var8, -1);
                    this.method2085(var9 - 1, 8192, var8 + 1, -1);
                }
                if (arg1 == 1) {
                    this.method2085(var9, 2048, var8, -1);
                    this.method2085(var9 + 1, 32768, var8 + 1, -1);
                }
                if (arg1 == 2) {
                    this.method2085(var9, 8192, var8, -1);
                    this.method2085(var9 + 1, 512, var8 - 1, -1);
                }
                if (arg1 == 3) {
                    this.method2085(var9, 32768, var8, -1);
                    this.method2085(var9 - 1, 2048, var8 - 1, -1);
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    this.method2085(var9, 66560, var8, -1);
                    this.method2085(var9 - 1, 4096, var8, -1);
                    this.method2085(var9, 16384, var8 + 1, -1);
                }
                if (arg1 == 1) {
                    this.method2085(var9, 5120, var8, -1);
                    this.method2085(var9, 16384, var8 + 1, -1);
                    this.method2085(var9 + 1, 65536, var8, -1);
                }
                if (arg1 == 2) {
                    this.method2085(var9, 20480, var8, -1);
                    this.method2085(var9 + 1, 65536, var8, -1);
                    this.method2085(var9, 1024, var8 - 1, -1);
                }
                if (arg1 == 3) {
                    this.method2085(var9, 81920, var8, -1);
                    this.method2085(var9, 1024, var8 - 1, -1);
                    this.method2085(var9 - 1, 4096, var8, -1);
                }
            }
        }
        if (!arg5 || !arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg1 == 0) {
                this.method2085(var9, 536870912, var8, -1);
                this.method2085(var9 - 1, 33554432, var8, -1);
            }
            if (arg1 == 1) {
                this.method2085(var9, 8388608, var8, -1);
                this.method2085(var9, 134217728, var8 + 1, -1);
            }
            if (arg1 == 2) {
                this.method2085(var9, 33554432, var8, -1);
                this.method2085(var9 + 1, 536870912, var8, -1);
            }
            if (arg1 == 3) {
                this.method2085(var9, 134217728, var8, -1);
                this.method2085(var9, 8388608, var8 - 1, -1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg1 == 0) {
                this.method2085(var9, 4194304, var8, -1);
                this.method2085(var9 - 1, 67108864, var8 + 1, -1);
            }
            if (arg1 == 1) {
                this.method2085(var9, 16777216, var8, -1);
                this.method2085(var9 + 1, 268435456, var8 + 1, -1);
            }
            if (arg1 == 2) {
                this.method2085(var9, 67108864, var8, -1);
                this.method2085(var9 + 1, 4194304, var8 - 1, -1);
            }
            if (arg1 == 3) {
                this.method2085(var9, 268435456, var8, -1);
                this.method2085(var9 - 1, 16777216, var8 - 1, -1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method2085(var9, 545259520, var8, -1);
            this.method2085(var9 - 1, 33554432, var8, -1);
            this.method2085(var9, 134217728, var8 + 1, -1);
        }
        if (arg1 == 1) {
            this.method2085(var9, 41943040, var8, -1);
            this.method2085(var9, 134217728, var8 + 1, -1);
            this.method2085(var9 + 1, 536870912, var8, -1);
        }
        if (arg1 == 2) {
            this.method2085(var9, 167772160, var8, -1);
            this.method2085(var9 + 1, 536870912, var8, -1);
            this.method2085(var9, 8388608, var8 - 1, -1);
        }
        if (arg1 == 3) {
            this.method2085(var9, 671088640, var8, -1);
            this.method2085(var9, 8388608, var8 - 1, -1);
            this.method2085(var9 - 1, 33554432, var8, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V")
    public final void method2083(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4837;
        if (arg1 >= 92) {
            field4836++;
            int var5 = arg0 - this.field4824;
            this.field4822[var5][var4] = class194.method1380(this.field4822[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2084(int arg0, String arg1) {
        if (arg0 != 1) {
            return -66;
        }
        field4818++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class406.method2404(arg1.charAt(var4), false) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)V")
    private final void method2085(int arg0, int arg1, int arg2, int arg3) {
        this.field4822[arg0][arg2] = class194.method1380(this.field4822[arg0][arg2], ~arg1);
        field4826++;
        if (arg3 != -1) {
            this.method2086(56, 85, 98, false, 41, -48, true, -53);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIZIIZI)V")
    public final void method2086(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field4829++;
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        if (arg7 == 1 || arg7 == 3) {
            int var10 = arg5;
            arg5 = arg1;
            arg1 = var10;
        }
        int var11 = arg4 - this.field4837;
        int var12 = arg0 - this.field4824;
        int var13 = 28 % ((arg2 - 13) / 47);
        for (int var14 = var12; var14 < var12 + arg5; var14++) {
            if (var14 >= 0 && this.field4827 > var14) {
                for (int var15 = var11; var15 < arg1 + var11; var15++) {
                    if (var15 >= 0 && this.field4832 > var15) {
                        this.method2085(var14, var9, var15, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BII)V")
    public final void method2087(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4837;
        int var5 = arg1 - this.field4824;
        field4838++;
        if (arg0 != 51) {
            this.field4822 = null;
        }
        this.field4822[var5][var4] = class694.method3895(this.field4822[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I")
    public static final int method2088(int arg0) {
        field4839++;
        return arg0 == 0 ? class213.field3130 : 16;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZIZIIII)V")
    public final void method2089(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4821++;
        int var8 = 92 / ((arg3 + 31) / 50);
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        int var10 = arg6 - this.field4824;
        if (arg0) {
            var9 |= 0x40000000;
        }
        int var11 = arg1 - this.field4837;
        for (int var12 = var10; var12 < (arg4 + var10); var12++) {
            if (var12 >= 0 && var12 < this.field4827) {
                for (int var13 = var11; var13 < arg5 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field4832) {
                        this.method2092(-126, var13, var12, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIZIIII)Z")
    public final boolean method2090(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field4828++;
        if (arg0 > 1) {
            return class68.method660(arg7, true, arg5, arg8, arg2, arg3, arg0, arg1, arg0) ? true : this.method2078(arg0, 73, arg0, arg8, arg1, arg3, arg2, arg5, arg6, arg7);
        } else if (arg4) {
            int var10 = arg7 + arg2 - 1;
            int var11 = arg5 + arg3 - 1;
            if (arg1 >= arg7 && var10 >= arg1 && arg5 <= arg8 && var11 >= arg8) {
                return true;
            } else if (arg7 - 1 == arg1 && arg8 >= arg5 && var11 >= arg8 && (this.field4822[arg1 - this.field4824][arg8 - this.field4837] & 0x8) == 0 && (arg6 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg1 && arg8 >= arg5 && arg8 <= var11 && (this.field4822[arg1 - this.field4824][arg8 - this.field4837] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if ((arg5 - 1) == arg8 && arg7 <= arg1 && var10 >= arg1 && (this.field4822[arg1 - this.field4824][arg8 - this.field4837] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg8 && arg1 >= arg7 && arg1 <= var10 && (this.field4822[arg1 - this.field4824][arg8 - this.field4837] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)[I")
    public static final int[] method2091(int arg0) {
        if (arg0 > -110) {
            method2088(102);
        }
        field4830++;
        return new int[] { class278.field4008, class274.field3843, class172.field2587 };
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IIII)V")
    private final void method2092(int arg0, int arg1, int arg2, int arg3) {
        this.field4822[arg2][arg1] = class694.method3895(this.field4822[arg2][arg1], arg3);
        field4823++;
        int var5 = -86 / ((arg0 - 78) / 48);
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
    public final void method2093(int arg0) {
        field4835++;
        int var2 = -82 / ((arg0 - 56) / 60);
        for (int var3 = 0; var3 < this.field4827; var3++) {
            for (int var4 = 0; var4 < this.field4832; var4++) {
                if (var3 == 0 || var4 == 0 || (this.field4827 - 5) <= var3 || (this.field4832 - 5) <= var4) {
                    this.field4822[var3][var4] = -1;
                } else {
                    this.field4822[var3][var4] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method2094(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 > -16) {
            return false;
        }
        field4825++;
        if (arg0 == 1) {
            if (arg5 == arg6 && arg3 == arg7) {
                return true;
            }
        } else if (arg6 <= arg5 && arg5 <= arg0 + arg6 - 1 && arg3 >= arg3 && arg0 + arg3 - 1 >= arg3) {
            return true;
        }
        int var9 = arg5 - this.field4824;
        int var10 = arg6 - this.field4824;
        int var11 = arg3 - this.field4837;
        int var12 = arg7 - this.field4837;
        if (arg0 == 1) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field4822[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field4822[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 == var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field4822[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field4822[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 == var10 && (var11 - 1) == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field4822[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field4822[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field4822[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field4822[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var10 && (var11 + 1) == var12 && (this.field4822[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var11 - 1) == var12 && (this.field4822[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field4822[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg0 - 1;
            int var14 = var12 + arg0 - 1;
            if (arg2 == 0) {
                if (arg4 == 0) {
                    if ((var9 - arg0) == var10 && var11 >= var12 && var14 >= var11) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var11 + 1) == var12 && (this.field4822[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var11 - arg0 == var12 && (this.field4822[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 >= var10 && var9 <= var13 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var9 - arg0) == var10 && var12 <= var11 && var14 >= var11 && (this.field4822[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var14 && (this.field4822[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 + 1 == var10 && var11 >= var12 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var11 + 1) == var12 && (this.field4822[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var11 - arg0 == var12 && (this.field4822[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 >= var10 && var13 >= var9 && var11 - arg0 == var12) {
                        return true;
                    }
                    if ((var9 - arg0) == var10 && var12 <= var11 && var14 >= var11 && (this.field4822[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var14 && (this.field4822[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    if (var9 - arg0 == var10 && var11 >= var12 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 <= var11 && var14 >= var11 && (this.field4822[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var11 - arg0) == var12 && (this.field4822[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var9 - arg0) == var10 && var12 <= var11 && var11 <= var14 && (this.field4822[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var11 - arg0 == var12 && (this.field4822[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var9 - arg0) == var10 && var11 >= var12 && var11 <= var14 && (this.field4822[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var11 + 1) == var12 && (this.field4822[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var11 - arg0) == var12) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 - arg0 == var10 && var11 >= var12 && var11 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var11 + 1) == var12 && (this.field4822[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 >= var12 && var11 <= var14 && (this.field4822[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var11 - arg0) == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 >= var10 && var13 >= var9 && (var11 + 1) == var12 && (this.field4822[var9][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var9 && var9 <= var13 && (var11 - arg0) == var12 && (this.field4822[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg0 == var10 && var12 <= var11 && var14 >= var11 && (this.field4822[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 >= var12 && var14 >= var11 && (this.field4822[var10][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
