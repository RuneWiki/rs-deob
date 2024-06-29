import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class40 {

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "F")
    public static float field439;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "J")
    public static long field441;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "[I")
    public static int[] field427;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[[I")
    public int[][] field443;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V", line = 5)
    private final void method215(int arg0, int arg1, int arg2, int arg3) {
        field438++;
        int var5 = 52 % ((arg2 - 7) / 60);
        this.field443[arg0][arg3] = class239.method1507(this.field443[arg0][arg3], ~arg1);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V", line = 15)
    public final void method216(int arg0, int arg1, int arg2) {
        field435++;
        int var4 = arg0 - this.field447;
        int var5 = arg2 - this.field436;
        this.field443[var5][var4] = class170.method1067(this.field443[var5][var4], 262144);
        if (arg1 > -40) {
            this.field447 = 44;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)V", line = 29)
    public final void method217(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field436;
        int var5 = 23 % ((arg1 - 7) / 35);
        int var6 = arg0 - this.field447;
        field446++;
        this.field443[var4][var6] = class239.method1507(this.field443[var4][var6], -2097153);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIZZI)V", line = 47)
    public final void method218(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = arg0 - this.field447;
        int var9 = arg1 - this.field436;
        field425++;
        if (arg6 == 0) {
            if (arg3 == 0) {
                this.method219(128, var8, var9, false);
                this.method219(8, var8, var9 - 1, false);
            }
            if (arg3 == 1) {
                this.method219(2, var8, var9, false);
                this.method219(32, var8 + 1, var9, false);
            }
            if (arg3 == 2) {
                this.method219(8, var8, var9, false);
                this.method219(128, var8, var9 + 1, false);
            }
            if (arg3 == 3) {
                this.method219(32, var8, var9, false);
                this.method219(2, var8 - 1, var9, false);
            }
        }
        if (arg2 != 25) {
            this.field442 = 72;
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg3 == 0) {
                this.method219(1, var8, var9, false);
                this.method219(16, var8 + 1, var9 + -1, false);
            }
            if (arg3 == 1) {
                this.method219(4, var8, var9, false);
                this.method219(64, var8 + 1, var9 + 1, false);
            }
            if (arg3 == 2) {
                this.method219(16, var8, var9, false);
                this.method219(1, var8 - 1, var9 + 1, false);
            }
            if (arg3 == 3) {
                this.method219(64, var8, var9, false);
                this.method219(4, var8 - 1, var9 + -1, false);
            }
        }
        if (arg6 == 2) {
            if (arg3 == 0) {
                this.method219(130, var8, var9, false);
                this.method219(8, var8, var9 - 1, false);
                this.method219(32, var8 + 1, var9, false);
            }
            if (arg3 == 1) {
                this.method219(10, var8, var9, false);
                this.method219(32, var8 + 1, var9, false);
                this.method219(128, var8, var9 + 1, false);
            }
            if (arg3 == 2) {
                this.method219(40, var8, var9, false);
                this.method219(128, var8, var9 + 1, false);
                this.method219(2, var8 - 1, var9, false);
            }
            if (arg3 == 3) {
                this.method219(160, var8, var9, false);
                this.method219(2, var8 - 1, var9, false);
                this.method219(8, var8, var9 - 1, false);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg3 == 0) {
                    this.method219(65536, var8, var9, false);
                    this.method219(4096, var8, var9 - 1, false);
                }
                if (arg3 == 1) {
                    this.method219(1024, var8, var9, false);
                    this.method219(16384, var8 + 1, var9, false);
                }
                if (arg3 == 2) {
                    this.method219(4096, var8, var9, false);
                    this.method219(65536, var8, var9 + 1, false);
                }
                if (arg3 == 3) {
                    this.method219(16384, var8, var9, false);
                    this.method219(1024, var8 - 1, var9, false);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg3 == 0) {
                    this.method219(512, var8, var9, false);
                    this.method219(8192, var8 + 1, var9 + -1, false);
                }
                if (arg3 == 1) {
                    this.method219(2048, var8, var9, false);
                    this.method219(32768, var8 + 1, var9 - -1, false);
                }
                if (arg3 == 2) {
                    this.method219(8192, var8, var9, false);
                    this.method219(512, var8 - 1, var9 + 1, false);
                }
                if (arg3 == 3) {
                    this.method219(32768, var8, var9, false);
                    this.method219(2048, var8 - 1, var9 + -1, false);
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    this.method219(66560, var8, var9, false);
                    this.method219(4096, var8, var9 - 1, false);
                    this.method219(16384, var8 + 1, var9, false);
                }
                if (arg3 == 1) {
                    this.method219(5120, var8, var9, false);
                    this.method219(16384, var8 + 1, var9, false);
                    this.method219(65536, var8, var9 + 1, false);
                }
                if (arg3 == 2) {
                    this.method219(20480, var8, var9, false);
                    this.method219(65536, var8, var9 + 1, false);
                    this.method219(1024, var8 - 1, var9, false);
                }
                if (arg3 == 3) {
                    this.method219(81920, var8, var9, false);
                    this.method219(1024, var8 - 1, var9, false);
                    this.method219(4096, var8, var9 - 1, false);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg6 == 0) {
            if (arg3 == 0) {
                this.method219(536870912, var8, var9, false);
                this.method219(33554432, var8, var9 - 1, false);
            }
            if (arg3 == 1) {
                this.method219(8388608, var8, var9, false);
                this.method219(134217728, var8 + 1, var9, false);
            }
            if (arg3 == 2) {
                this.method219(33554432, var8, var9, false);
                this.method219(536870912, var8, var9 + 1, false);
            }
            if (arg3 == 3) {
                this.method219(134217728, var8, var9, false);
                this.method219(8388608, var8 - 1, var9, false);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg3 == 0) {
                this.method219(4194304, var8, var9, false);
                this.method219(67108864, var8 + 1, var9 + -1, false);
            }
            if (arg3 == 1) {
                this.method219(16777216, var8, var9, false);
                this.method219(268435456, var8 + 1, var9 + 1, false);
            }
            if (arg3 == 2) {
                this.method219(67108864, var8, var9, false);
                this.method219(4194304, var8 - 1, var9 + 1, false);
            }
            if (arg3 == 3) {
                this.method219(268435456, var8, var9, false);
                this.method219(16777216, var8 - 1, var9 + -1, false);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method219(545259520, var8, var9, false);
            this.method219(33554432, var8, var9 - 1, false);
            this.method219(134217728, var8 + 1, var9, false);
        }
        if (arg3 == 1) {
            this.method219(41943040, var8, var9, false);
            this.method219(134217728, var8 + 1, var9, false);
            this.method219(536870912, var8, var9 + 1, false);
        }
        if (arg3 == 2) {
            this.method219(167772160, var8, var9, false);
            this.method219(536870912, var8, var9 + 1, false);
            this.method219(8388608, var8 - 1, var9, false);
        }
        if (arg3 == 3) {
            this.method219(671088640, var8, var9, false);
            this.method219(8388608, var8 - 1, var9, false);
            this.method219(33554432, var8, var9 - 1, false);
            return;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZ)V", line = 349)
    private final void method219(int arg0, int arg1, int arg2, boolean arg3) {
        field428++;
        if (arg3) {
            field439 = -1.885492F;
        }
        this.field443[arg2][arg1] = class170.method1067(this.field443[arg2][arg1], arg0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIII)Z", line = 360)
    public final boolean method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field424++;
        if (arg1 == 1) {
            if (arg6 == arg7 && arg0 == arg4) {
                return true;
            }
        } else if (arg7 <= arg6 && arg6 <= arg1 + arg7 - 1 && arg4 >= arg4 && (arg1 + arg4 - 1) >= arg4) {
            return true;
        }
        int var9 = arg7 - this.field436;
        int var10 = arg6 - this.field436;
        if (arg5 < 69) {
            this.field442 = -125;
        }
        int var11 = arg0 - this.field447;
        int var12 = arg4 - this.field447;
        if (arg1 == 1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field443[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field443[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field443[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field443[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field443[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field443[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field443[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field443[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field443[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field443[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field443[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field443[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field443[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field443[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field443[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field443[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field443[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field443[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field443[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field443[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var9 - 1;
            int var14 = arg1 + var11 - 1;
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if ((var10 - arg1) == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 + 1) == var11 && (this.field443[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 - arg1 == var11 && (this.field443[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - arg1) == var9 && var12 >= var11 && var14 >= var12 && (this.field443[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var14 >= var12 && (this.field443[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field443[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 - arg1 == var11 && (this.field443[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 <= var10 && var13 >= var10 && var12 - arg1 == var11) {
                        return true;
                    }
                    if (var10 - arg1 == var9 && var12 >= var11 && var14 >= var12 && (this.field443[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14 && (this.field443[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if ((var10 - arg1) == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var14 && (this.field443[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg1 == var11 && (this.field443[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - arg1 == var9 && var12 >= var11 && var14 >= var12 && (this.field443[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg1 == var11 && (this.field443[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - arg1) == var9 && var11 <= var12 && var14 >= var12 && (this.field443[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11 && (this.field443[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg1 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - arg1 == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field443[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12 && (this.field443[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 - arg1 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11 && (this.field443[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var10 && var10 <= var13 && (var12 - arg1) == var11 && (this.field443[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg1) == var9 && var11 <= var12 && var12 <= var14 && (this.field443[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 <= var12 && var14 >= var12 && (this.field443[var9][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZII)V", line = 736)
    public static final void method221(boolean arg0, int arg1, int arg2) {
        field433++;
        class170.field2476 = arg1;
        class32.field370 = 3;
        if (arg2 <= 97) {
            field441 = 60L;
        }
        class231.method1429(class5.field86.field5885, (byte) -115, class5.field86.field5883);
        if (arg0) {
            class146.method914("", 0, "");
        } else {
            class124.method816(-1);
            class146.method914(class427.field6018, 0, class538.field7869);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(IIIIIIII)Z", line = 761)
    public final boolean method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field432++;
        if (arg5 == 1) {
            if (arg3 == arg6 && arg2 == arg7) {
                return true;
            }
        } else if (arg3 >= arg6 && arg3 <= arg5 + arg6 - 1 && arg2 >= arg2 && (arg5 + arg2 - 1) >= arg2) {
            return true;
        }
        int var9 = arg6 - this.field436;
        int var10 = arg3 - this.field436;
        int var11 = arg2 - this.field447;
        if (arg1 != -87) {
            return true;
        }
        int var12 = arg7 - this.field447;
        if (arg5 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field443[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field443[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field443[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field443[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field443[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field443[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field443[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field443[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 == var10 && (var11 + 1) == var12 && (this.field443[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var11 - 1) == var12 && (this.field443[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field443[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field443[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var9 - 1;
            int var14 = var12 + arg5 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var10 + 1) == var9 && var12 <= var11 && var11 <= var14 && (this.field443[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var11 - arg5 == var12 && (this.field443[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - arg5) == var9 && var12 <= var11 && var11 <= var14 && (this.field443[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var11 - arg5) == var12 && (this.field443[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - arg5 == var9 && var12 <= var11 && var11 <= var14 && (this.field443[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var11 + 1 == var12 && (this.field443[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 + 1 == var9 && var11 >= var12 && var11 <= var14 && (this.field443[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var11 + 1 == var12 && (this.field443[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 <= var10 && var10 <= var13 && (var11 + 1) == var12 && (this.field443[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var10 && var10 <= var13 && var11 - arg5 == var12 && (this.field443[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg5) == var9 && var12 <= var11 && var11 <= var14 && (this.field443[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 >= var12 && var14 >= var11 && (this.field443[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 953)
    public static void method223(int arg0) {
        if (arg0 != 1) {
            method221(false, -47, 34);
        }
        field427 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZIIIIZ)V", line = 972)
    public final void method224(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field445++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        int var10 = arg6 - this.field436;
        int var11 = arg5 - this.field447;
        if (arg2) {
            var9 |= 0x40000000;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg1;
            arg1 = arg3;
            arg3 = var12;
        }
        int var13 = var10;
        if (arg4 != 3) {
            return;
        }
        while (arg1 + var10 > var13) {
            if (var13 >= 0 && var13 < this.field431) {
                for (int var14 = var11; var14 < arg3 + var11; var14++) {
                    if (var14 >= 0 && this.field442 > var14) {
                        this.method215(var13, var9, arg4 ^ 0x40, var14);
                    }
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIBIIIII)Z", line = 1026)
    public final boolean method225(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field426++;
        if (arg1 > 1) {
            return class510.method3047(arg8, arg1, arg4, arg7, arg2, arg0, arg1, arg3 + 13, arg5) ? true : this.method232(arg7, arg1, arg2, arg3 - 195, arg4, arg0, arg5, arg1, arg8, arg6);
        }
        int var10 = arg2 + arg0 - 1;
        int var11 = arg8 + arg4 - 1;
        if (arg7 >= arg2 && arg7 <= var10 && arg5 >= arg4 && arg5 <= var11) {
            return true;
        } else if ((arg2 - 1) == arg7 && arg4 <= arg5 && arg5 <= var11 && (this.field443[arg7 - this.field436][arg5 - this.field447] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg7 && arg4 <= arg5 && var11 >= arg5 && (this.field443[arg7 - this.field436][arg5 - this.field447] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg3 != 67) {
            return true;
        } else if (arg4 - 1 == arg5 && arg7 >= arg2 && var10 >= arg7 && (this.field443[arg7 - this.field436][arg5 - this.field447] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg2 <= arg7 && arg7 <= var10 && (this.field443[arg7 - this.field436][arg5 - this.field447] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BII)V", line = 1066)
    public final void method226(byte arg0, int arg1, int arg2) {
        if (arg0 <= -75) {
            field437++;
            int var4 = arg1 - this.field447;
            int var5 = arg2 - this.field436;
            this.field443[var5][var4] = class239.method1507(this.field443[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZIZI)V", line = 1087)
    public final void method227(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field440++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field436;
        int var10 = arg4 - this.field447;
        if (arg5) {
            var8 |= 0x40000000;
        }
        int var11 = 29 / ((arg1 + 27) / 58);
        for (int var12 = var9; var12 < var9 + arg0; var12++) {
            if (var12 >= 0 && this.field431 > var12) {
                for (int var13 = var10; var13 < (arg6 + var10); var13++) {
                    if (var13 >= 0 && var13 < this.field442) {
                        this.method219(var8, var13, var12, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZIZBII)V", line = 1132)
    public final void method228(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field436;
        field430++;
        int var9 = arg6 - this.field447;
        int var10 = 115 / ((arg4 + 10) / 39);
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method215(var8, 128, 121, var9);
                this.method215(var8 - 1, 8, -91, var9);
            }
            if (arg0 == 1) {
                this.method215(var8, 2, 111, var9);
                this.method215(var8, 32, -59, var9 + 1);
            }
            if (arg0 == 2) {
                this.method215(var8, 8, -59, var9);
                this.method215(var8 + 1, 128, -116, var9);
            }
            if (arg0 == 3) {
                this.method215(var8, 32, -82, var9);
                this.method215(var8, 2, 126, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method215(var8, 1, 127, var9);
                this.method215(var8 - 1, 16, 71, var9 + 1);
            }
            if (arg0 == 1) {
                this.method215(var8, 4, 97, var9);
                this.method215(var8 + 1, 64, 95, var9 + 1);
            }
            if (arg0 == 2) {
                this.method215(var8, 16, -99, var9);
                this.method215(var8 + 1, 1, -118, var9 - 1);
            }
            if (arg0 == 3) {
                this.method215(var8, 64, 71, var9);
                this.method215(var8 - 1, 4, 71, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method215(var8, 130, 123, var9);
                this.method215(var8 - 1, 8, 70, var9);
                this.method215(var8, 32, 73, var9 + 1);
            }
            if (arg0 == 1) {
                this.method215(var8, 10, -87, var9);
                this.method215(var8, 32, -118, var9 + 1);
                this.method215(var8 + 1, 128, -56, var9);
            }
            if (arg0 == 2) {
                this.method215(var8, 40, -115, var9);
                this.method215(var8 + 1, 128, -128, var9);
                this.method215(var8, 2, 104, var9 - 1);
            }
            if (arg0 == 3) {
                this.method215(var8, 160, 124, var9);
                this.method215(var8, 2, -112, var9 - 1);
                this.method215(var8 - 1, 8, 81, var9);
            }
        }
        if (arg3) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method215(var8, 65536, -64, var9);
                    this.method215(var8 - 1, 4096, 126, var9);
                }
                if (arg0 == 1) {
                    this.method215(var8, 1024, 89, var9);
                    this.method215(var8, 16384, -126, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method215(var8, 4096, 80, var9);
                    this.method215(var8 + 1, 65536, -92, var9);
                }
                if (arg0 == 3) {
                    this.method215(var8, 16384, -95, var9);
                    this.method215(var8, 1024, -62, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method215(var8, 512, -62, var9);
                    this.method215(var8 - 1, 8192, -72, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method215(var8, 2048, -56, var9);
                    this.method215(var8 + 1, 32768, -84, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method215(var8, 8192, -121, var9);
                    this.method215(var8 + 1, 512, -123, var9 - 1);
                }
                if (arg0 == 3) {
                    this.method215(var8, 32768, -101, var9);
                    this.method215(var8 - 1, 2048, 115, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method215(var8, 66560, 92, var9);
                    this.method215(var8 - 1, 4096, 114, var9);
                    this.method215(var8, 16384, 83, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method215(var8, 5120, -97, var9);
                    this.method215(var8, 16384, 123, var9 + 1);
                    this.method215(var8 + 1, 65536, -104, var9);
                }
                if (arg0 == 2) {
                    this.method215(var8, 20480, 114, var9);
                    this.method215(var8 + 1, 65536, 73, var9);
                    this.method215(var8, 1024, 85, var9 - 1);
                }
                if (arg0 == 3) {
                    this.method215(var8, 81920, 122, var9);
                    this.method215(var8, 1024, -96, var9 - 1);
                    this.method215(var8 - 1, 4096, -83, var9);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method215(var8, 536870912, 71, var9);
                this.method215(var8 - 1, 33554432, -97, var9);
            }
            if (arg0 == 1) {
                this.method215(var8, 8388608, 91, var9);
                this.method215(var8, 134217728, 116, var9 + 1);
            }
            if (arg0 == 2) {
                this.method215(var8, 33554432, 71, var9);
                this.method215(var8 + 1, 536870912, -120, var9);
            }
            if (arg0 == 3) {
                this.method215(var8, 134217728, 93, var9);
                this.method215(var8, 8388608, 107, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method215(var8, 4194304, -100, var9);
                this.method215(var8 - 1, 67108864, 94, var9 + 1);
            }
            if (arg0 == 1) {
                this.method215(var8, 16777216, -73, var9);
                this.method215(var8 + 1, 268435456, -90, var9 + 1);
            }
            if (arg0 == 2) {
                this.method215(var8, 67108864, 97, var9);
                this.method215(var8 + 1, 4194304, -116, var9 - 1);
            }
            if (arg0 == 3) {
                this.method215(var8, 268435456, 95, var9);
                this.method215(var8 - 1, 16777216, 83, var9 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method215(var8, 545259520, -53, var9);
            this.method215(var8 - 1, 33554432, 127, var9);
            this.method215(var8, 134217728, 117, var9 + 1);
        }
        if (arg0 == 1) {
            this.method215(var8, 41943040, 74, var9);
            this.method215(var8, 134217728, 122, var9 + 1);
            this.method215(var8 + 1, 536870912, 109, var9);
        }
        if (arg0 == 2) {
            this.method215(var8, 167772160, -58, var9);
            this.method215(var8 + 1, 536870912, 78, var9);
            this.method215(var8, 8388608, 112, var9 - 1);
        }
        if (arg0 == 3) {
            this.method215(var8, 671088640, 105, var9);
            this.method215(var8, 8388608, -107, var9 - 1);
            this.method215(var8 - 1, 33554432, 80, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(III)V", line = 1438)
    public final void method229(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field447;
        field444++;
        int var5 = arg0 - this.field436;
        this.field443[var5][var4] = class170.method1067(this.field443[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I", line = 1449)
    public static final int method230(int arg0, int arg1) {
        return class429.field6048 == null ? 0 : class429.field6048[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 1453)
    public final void method231(int arg0) {
        if (arg0 != -4) {
            this.method219(-86, 100, -49, false);
        }
        for (int var2 = 0; var2 < this.field431; var2++) {
            for (int var3 = 0; var3 < this.field442; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field431 - 5 || (this.field442 - 5) <= var3) {
                    this.field443[var2][var3] = -1;
                } else {
                    this.field443[var2][var3] = 2097152;
                }
            }
        }
        field429++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1484)
    public final boolean method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field434++;
        if (arg3 >= -42) {
            this.field442 = 14;
        }
        int var11 = arg0 + arg1;
        int var12 = arg6 + arg7;
        int var13 = arg2 + arg5;
        int var14 = arg4 + arg8;
        if (arg0 == var13 && (arg9 & 0x2) == 0) {
            int var15 = arg6 <= arg4 ? arg4 : arg6;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field443[var13 - this.field436 - 1][var15 - this.field447] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg2 == var11 && (arg9 & 0x8) == 0) {
            int var17 = arg4 >= arg6 ? arg4 : arg6;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field443[arg2 - this.field436][var17 - this.field447] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg2 < arg0 ? arg0 : arg2;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field443[var19 - this.field436][var14 - (this.field447 + 1)] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg9 & 0x4) == 0) {
            int var21 = arg2 >= arg0 ? arg2 : arg0;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field443[var21 - this.field436][arg4 - this.field447] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }
}
