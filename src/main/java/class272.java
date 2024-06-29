import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class272 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field3752 = 0;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "[[I")
    public static int[][] field3765 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "Z")
    public static boolean field3774 = false;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field3775 = 1337;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "Lcs;")
    public static class351 field3768 = new class351(7, 3);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "Lpc;")
    public static class141 field3778;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[[I")
    public int[][] field3756;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V", line = 4)
    public final void method1690(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3761;
        field3753++;
        int var5 = arg2 - this.field3751;
        this.field3756[var5][var4] = class366.method2215(this.field3756[var5][var4], 262144);
        if (arg0 != 14021) {
            this.field3772 = 69;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIZII)Z", line = 23)
    public final boolean method1691(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            this.field3772 = 48;
        }
        field3763++;
        if (arg7 == 1) {
            if (arg1 == arg2 && arg0 == arg4) {
                return true;
            }
        } else if (arg2 <= arg1 && arg1 <= arg2 + arg7 - 1 && arg0 <= arg0 && arg0 <= (arg7 + arg0 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field3751;
        int var10 = arg0 - this.field3761;
        int var11 = arg4 - this.field3761;
        int var12 = arg2 - this.field3751;
        if (arg7 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field3756[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field3756[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field3756[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field3756[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field3756[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field3756[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg7 - 1;
            int var14 = arg7 + var11 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var9 + 1) == var12 && var11 <= var10 && var14 >= var10 && (this.field3756[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var10 - arg7 == var11 && (this.field3756[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 - arg7 == var12 && var11 <= var10 && var14 >= var10 && (this.field3756[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 - arg7 == var11 && (this.field3756[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 - arg7 == var12 && var10 >= var11 && var10 <= var14 && (this.field3756[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var10 + 1) == var11 && (this.field3756[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var9 + 1) == var12 && var10 >= var11 && var10 <= var14 && (this.field3756[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 + 1) == var11 && (this.field3756[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var12 <= var9 && var13 >= var9 && var10 + 1 == var11 && (this.field3756[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var9 && var9 <= var13 && var10 - arg7 == var11 && (this.field3756[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg7) == var12 && var10 >= var11 && var10 <= var14 && (this.field3756[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 >= var11 && var10 <= var14 && (this.field3756[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIZIIZ)V", line = 216)
    public final void method1692(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field3755++;
        int var8 = 256;
        if (arg0 != 0) {
            field3778 = null;
        }
        if (arg6) {
            var8 |= 0x20000;
        }
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var9 = arg2 - this.field3751;
        int var10 = arg4 - this.field3761;
        for (int var11 = var9; var11 < arg5 + var9; var11++) {
            if (var11 >= 0 && var11 < this.field3772) {
                for (int var12 = var10; var12 < var10 + arg1; var12++) {
                    if (var12 >= 0 && var12 < this.field3759) {
                        this.method1708(var11, var12, (byte) 119, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIIII)Z", line = 261)
    public final boolean method1693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3762++;
        if (arg7 > 1) {
            return class236.method1483(arg7, arg7, arg3, arg6, arg2, true, arg0, arg4, arg1) ? true : this.method1699(-3, arg7, arg7, arg1, arg6, arg3, arg5, arg0, arg4, arg2);
        }
        int var10 = arg1 + arg0 - 1;
        if (arg8 >= -67) {
            this.method1699(42, 17, 125, -120, -1, 107, -34, 105, 30, 108);
        }
        int var11 = arg6 + arg3 - 1;
        if (arg2 >= arg0 && arg2 <= var10 && arg4 >= arg6 && arg4 <= var11) {
            return true;
        } else if (arg0 - 1 == arg2 && arg4 >= arg6 && var11 >= arg4 && (this.field3756[arg2 - this.field3751][arg4 - this.field3761] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg6 <= arg4 && arg4 <= var11 && (this.field3756[arg2 - this.field3751][arg4 - this.field3761] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg4 && arg0 <= arg2 && arg2 <= var10 && (this.field3756[arg2 - this.field3751][arg4 - this.field3761] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg4 && arg2 >= arg0 && var10 >= arg2 && (this.field3756[arg2 - this.field3751][arg4 - this.field3761] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)Z", line = 303)
    public static final boolean method1694(boolean arg0, int arg1) {
        field3769++;
        if (arg0) {
            field3778 = null;
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZIIIIII)V", line = 315)
    public final void method1695(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 < 4) {
            field3774 = false;
        }
        field3766++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        int var10 = arg7 - this.field3751;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg2;
            arg2 = arg4;
            arg4 = var11;
        }
        int var12 = arg6 - this.field3761;
        if (arg0) {
            var9 |= 0x40000000;
        }
        for (int var13 = var10; var13 < (var10 + arg2); var13++) {
            if (var13 >= 0 && this.field3772 > var13) {
                for (int var14 = var12; var14 < (arg4 + var12); var14++) {
                    if (var14 >= 0 && this.field3759 > var14) {
                        this.method1697((byte) -100, var9, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 368)
    public static void method1696(int arg0) {
        field3768 = null;
        field3778 = null;
        if (arg0 != -5) {
            method1700(-110, 22, -18, 1, -49, 118, 4);
        }
        field3765 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BIII)V", line = 380)
    private final void method1697(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -100) {
            this.field3759 = -123;
        }
        field3749++;
        this.field3756[arg2][arg3] = class347.method2074(this.field3756[arg2][arg3], ~arg1);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIZIZ)V", line = 401)
    public final void method1698(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field3761;
        field3757++;
        int var9 = arg1 - this.field3751;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method1697((byte) -100, 128, var9, var8);
                this.method1697((byte) -100, 8, var9 - 1, var8);
            }
            if (arg3 == 1) {
                this.method1697((byte) -100, 2, var9, var8);
                this.method1697((byte) -100, 32, var9, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1697((byte) -100, 8, var9, var8);
                this.method1697((byte) -100, 128, var9 + 1, var8);
            }
            if (arg3 == 3) {
                this.method1697((byte) -100, 32, var9, var8);
                this.method1697((byte) -100, 2, var9, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method1697((byte) -100, 1, var9, var8);
                this.method1697((byte) -100, 16, var9 - 1, var8 + 1);
            }
            if (arg3 == 1) {
                this.method1697((byte) -100, 4, var9, var8);
                this.method1697((byte) -100, 64, var9 + 1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1697((byte) -100, 16, var9, var8);
                this.method1697((byte) -100, 1, var9 + 1, var8 + -1);
            }
            if (arg3 == 3) {
                this.method1697((byte) -100, 64, var9, var8);
                this.method1697((byte) -100, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method1697((byte) -100, 130, var9, var8);
                this.method1697((byte) -100, 8, var9 - 1, var8);
                this.method1697((byte) -100, 32, var9, var8 + 1);
            }
            if (arg3 == 1) {
                this.method1697((byte) -100, 10, var9, var8);
                this.method1697((byte) -100, 32, var9, var8 + 1);
                this.method1697((byte) -100, 128, var9 + 1, var8);
            }
            if (arg3 == 2) {
                this.method1697((byte) -100, 40, var9, var8);
                this.method1697((byte) -100, 128, var9 + 1, var8);
                this.method1697((byte) -100, 2, var9, var8 - 1);
            }
            if (arg3 == 3) {
                this.method1697((byte) -100, 160, var9, var8);
                this.method1697((byte) -100, 2, var9, var8 - 1);
                this.method1697((byte) -100, 8, var9 - 1, var8);
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method1697((byte) -100, 65536, var9, var8);
                    this.method1697((byte) -100, 4096, var9 - 1, var8);
                }
                if (arg3 == 1) {
                    this.method1697((byte) -100, 1024, var9, var8);
                    this.method1697((byte) -100, 16384, var9, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method1697((byte) -100, 4096, var9, var8);
                    this.method1697((byte) -100, 65536, var9 + 1, var8);
                }
                if (arg3 == 3) {
                    this.method1697((byte) -100, 16384, var9, var8);
                    this.method1697((byte) -100, 1024, var9, var8 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method1697((byte) -100, 512, var9, var8);
                    this.method1697((byte) -100, 8192, var9 - 1, var8 + 1);
                }
                if (arg3 == 1) {
                    this.method1697((byte) -100, 2048, var9, var8);
                    this.method1697((byte) -100, 32768, var9 + 1, var8 - -1);
                }
                if (arg3 == 2) {
                    this.method1697((byte) -100, 8192, var9, var8);
                    this.method1697((byte) -100, 512, var9 + 1, var8 - 1);
                }
                if (arg3 == 3) {
                    this.method1697((byte) -100, 32768, var9, var8);
                    this.method1697((byte) -100, 2048, var9 - 1, var8 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method1697((byte) -100, 66560, var9, var8);
                    this.method1697((byte) -100, 4096, var9 - 1, var8);
                    this.method1697((byte) -100, 16384, var9, var8 + 1);
                }
                if (arg3 == 1) {
                    this.method1697((byte) -100, 5120, var9, var8);
                    this.method1697((byte) -100, 16384, var9, var8 + 1);
                    this.method1697((byte) -100, 65536, var9 + 1, var8);
                }
                if (arg3 == 2) {
                    this.method1697((byte) -100, 20480, var9, var8);
                    this.method1697((byte) -100, 65536, var9 + 1, var8);
                    this.method1697((byte) -100, 1024, var9, var8 - 1);
                }
                if (arg3 == 3) {
                    this.method1697((byte) -100, 81920, var9, var8);
                    this.method1697((byte) -100, 1024, var9, var8 - 1);
                    this.method1697((byte) -100, 4096, var9 - 1, var8);
                }
            }
        }
        if (arg0 != 1024) {
            method1696(108);
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method1697((byte) -100, 536870912, var9, var8);
                this.method1697((byte) -100, 33554432, var9 - 1, var8);
            }
            if (arg3 == 1) {
                this.method1697((byte) -100, 8388608, var9, var8);
                this.method1697((byte) -100, 134217728, var9, var8 + 1);
            }
            if (arg3 == 2) {
                this.method1697((byte) -100, 33554432, var9, var8);
                this.method1697((byte) -100, 536870912, var9 + 1, var8);
            }
            if (arg3 == 3) {
                this.method1697((byte) -100, 134217728, var9, var8);
                this.method1697((byte) -100, 8388608, var9, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method1697((byte) -100, 4194304, var9, var8);
                this.method1697((byte) -100, 67108864, var9 - 1, var8 + 1);
            }
            if (arg3 == 1) {
                this.method1697((byte) -100, 16777216, var9, var8);
                this.method1697((byte) -100, 268435456, var9 + 1, var8 - -1);
            }
            if (arg3 == 2) {
                this.method1697((byte) -100, 67108864, var9, var8);
                this.method1697((byte) -100, 4194304, var9 + 1, var8 + -1);
            }
            if (arg3 == 3) {
                this.method1697((byte) -100, 268435456, var9, var8);
                this.method1697((byte) -100, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1697((byte) -100, 545259520, var9, var8);
            this.method1697((byte) -100, 33554432, var9 - 1, var8);
            this.method1697((byte) -100, 134217728, var9, var8 + 1);
        }
        if (arg3 == 1) {
            this.method1697((byte) -100, 41943040, var9, var8);
            this.method1697((byte) -100, 134217728, var9, var8 + 1);
            this.method1697((byte) -100, 536870912, var9 + 1, var8);
        }
        if (arg3 == 2) {
            this.method1697((byte) -100, 167772160, var9, var8);
            this.method1697((byte) -100, 536870912, var9 + 1, var8);
            this.method1697((byte) -100, 8388608, var9, var8 - 1);
        }
        if (arg3 == 3) {
            this.method1697((byte) -100, 671088640, var9, var8);
            this.method1697((byte) -100, 8388608, var9, var8 - 1);
            this.method1697((byte) -100, 33554432, var9 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIIIII)Z", line = 710)
    public final boolean method1699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3776++;
        int var11 = arg1 + arg9;
        int var12 = arg2 + arg8;
        int var13 = arg7 + arg3;
        int var14 = arg4 + arg5;
        if (arg9 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg8 <= arg4 ? arg4 : arg8;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field3756[var13 - this.field3751 - 1][var15 - this.field3761] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg4 < arg8 ? arg8 : arg4;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field3756[arg7 - this.field3751][var17 - this.field3761] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg8 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg9 > arg7 ? arg9 : arg7;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field3756[var19 - this.field3751][var14 - this.field3761 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg9 <= arg7 ? arg7 : arg9;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field3756[var21 - this.field3751][arg4 - this.field3761] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        if (arg0 != -3) {
            this.method1699(110, 106, -68, -10, 6, 101, -20, 116, -16, -50);
        }
        return false;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIII)V", line = 810)
    public static final void method1700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3760++;
        int var7 = arg4 - arg5;
        int var8 = arg0 + arg5;
        for (int var9 = arg0; var9 < var8; var9++) {
            class80.method554(class2.field16[var9], arg2 + 96, arg3, arg1, arg6);
        }
        int var10 = arg1 - arg5;
        int var11 = arg5 + arg6;
        if (arg2 != 1) {
            return;
        }
        for (int var12 = arg4; var12 > var7; var12--) {
            class80.method554(class2.field16[var12], 109, arg3, arg1, arg6);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class2.field16[var13];
            class80.method554(var14, 117, arg3, var11, arg6);
            class80.method554(var14, 107, arg3, arg1, var10);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V", line = 857)
    public final void method1701(int arg0, int arg1, byte arg2) {
        if (arg2 == 93) {
            field3764++;
            int var4 = arg0 - this.field3761;
            int var5 = arg1 - this.field3751;
            this.field3756[var5][var4] = class366.method2215(this.field3756[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(III)V", line = 874)
    public final void method1702(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3761;
        int var5 = 16 % ((66 - arg2) / 36);
        int var6 = arg0 - this.field3751;
        field3754++;
        this.field3756[var6][var4] = class347.method2074(this.field3756[var6][var4], -2097153);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(IIB)V", line = 888)
    public final void method1703(int arg0, int arg1, byte arg2) {
        if (arg2 >= 17) {
            int var4 = arg1 - this.field3751;
            field3773++;
            int var5 = arg0 - this.field3761;
            this.field3756[var4][var5] = class347.method2074(this.field3756[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 908)
    public final void method1704(boolean arg0) {
        for (int var2 = 0; var2 < this.field3772; var2++) {
            for (int var3 = 0; var3 < this.field3759; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field3772 - 5) || (this.field3759 - 5) <= var3) {
                    this.field3756[var2][var3] = -1;
                } else {
                    this.field3756[var2][var3] = 2097152;
                }
            }
        }
        if (!arg0) {
            this.field3761 = 17;
        }
        field3750++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZZIIBI)V", line = 940)
    public final void method1705(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6) {
        field3771++;
        if (arg5 != -109) {
            this.field3761 = -49;
        }
        int var8 = arg3 - this.field3751;
        int var9 = arg6 - this.field3761;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1708(var8, var9, (byte) 104, 128);
                this.method1708(var8 - 1, var9, (byte) 118, 8);
            }
            if (arg0 == 1) {
                this.method1708(var8, var9, (byte) -21, 2);
                this.method1708(var8, var9 + 1, (byte) 126, 32);
            }
            if (arg0 == 2) {
                this.method1708(var8, var9, (byte) -51, 8);
                this.method1708(var8 + 1, var9, (byte) -31, 128);
            }
            if (arg0 == 3) {
                this.method1708(var8, var9, (byte) 104, 32);
                this.method1708(var8, var9 - 1, (byte) -124, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1708(var8, var9, (byte) -126, 1);
                this.method1708(var8 - 1, var9 + 1, (byte) -55, 16);
            }
            if (arg0 == 1) {
                this.method1708(var8, var9, (byte) -102, 4);
                this.method1708(var8 + 1, var9 + 1, (byte) -24, 64);
            }
            if (arg0 == 2) {
                this.method1708(var8, var9, (byte) -121, 16);
                this.method1708(var8 + 1, var9 + -1, (byte) 123, 1);
            }
            if (arg0 == 3) {
                this.method1708(var8, var9, (byte) -73, 64);
                this.method1708(var8 - 1, var9 + -1, (byte) -128, 4);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1708(var8, var9, (byte) -72, 130);
                this.method1708(var8 - 1, var9, (byte) 115, 8);
                this.method1708(var8, var9 + 1, (byte) 114, 32);
            }
            if (arg0 == 1) {
                this.method1708(var8, var9, (byte) -117, 10);
                this.method1708(var8, var9 + 1, (byte) 124, 32);
                this.method1708(var8 + 1, var9, (byte) -62, 128);
            }
            if (arg0 == 2) {
                this.method1708(var8, var9, (byte) 111, 40);
                this.method1708(var8 + 1, var9, (byte) -56, 128);
                this.method1708(var8, var9 - 1, (byte) 113, 2);
            }
            if (arg0 == 3) {
                this.method1708(var8, var9, (byte) 97, 160);
                this.method1708(var8, var9 - 1, (byte) 103, 2);
                this.method1708(var8 - 1, var9, (byte) 108, 8);
            }
        }
        if (arg1) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method1708(var8, var9, (byte) 127, 65536);
                    this.method1708(var8 - 1, var9, (byte) 122, 4096);
                }
                if (arg0 == 1) {
                    this.method1708(var8, var9, (byte) -117, 1024);
                    this.method1708(var8, var9 + 1, (byte) -33, 16384);
                }
                if (arg0 == 2) {
                    this.method1708(var8, var9, (byte) 107, 4096);
                    this.method1708(var8 + 1, var9, (byte) -56, 65536);
                }
                if (arg0 == 3) {
                    this.method1708(var8, var9, (byte) 127, 16384);
                    this.method1708(var8, var9 - 1, (byte) 105, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method1708(var8, var9, (byte) -79, 512);
                    this.method1708(var8 - 1, var9 + 1, (byte) 114, 8192);
                }
                if (arg0 == 1) {
                    this.method1708(var8, var9, (byte) 105, 2048);
                    this.method1708(var8 + 1, var9 + 1, (byte) -91, 32768);
                }
                if (arg0 == 2) {
                    this.method1708(var8, var9, (byte) 122, 8192);
                    this.method1708(var8 + 1, var9 + -1, (byte) 108, 512);
                }
                if (arg0 == 3) {
                    this.method1708(var8, var9, (byte) -117, 32768);
                    this.method1708(var8 - 1, var9 + -1, (byte) 124, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method1708(var8, var9, (byte) -71, 66560);
                    this.method1708(var8 - 1, var9, (byte) -122, 4096);
                    this.method1708(var8, var9 + 1, (byte) 108, 16384);
                }
                if (arg0 == 1) {
                    this.method1708(var8, var9, (byte) -116, 5120);
                    this.method1708(var8, var9 + 1, (byte) 119, 16384);
                    this.method1708(var8 + 1, var9, (byte) -70, 65536);
                }
                if (arg0 == 2) {
                    this.method1708(var8, var9, (byte) 110, 20480);
                    this.method1708(var8 + 1, var9, (byte) 110, 65536);
                    this.method1708(var8, var9 - 1, (byte) 109, 1024);
                }
                if (arg0 == 3) {
                    this.method1708(var8, var9, (byte) 104, 81920);
                    this.method1708(var8, var9 - 1, (byte) 114, 1024);
                    this.method1708(var8 - 1, var9, (byte) -21, 4096);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1708(var8, var9, (byte) -104, 536870912);
                this.method1708(var8 - 1, var9, (byte) 125, 33554432);
            }
            if (arg0 == 1) {
                this.method1708(var8, var9, (byte) -100, 8388608);
                this.method1708(var8, var9 + 1, (byte) 102, 134217728);
            }
            if (arg0 == 2) {
                this.method1708(var8, var9, (byte) -33, 33554432);
                this.method1708(var8 + 1, var9, (byte) 116, 536870912);
            }
            if (arg0 == 3) {
                this.method1708(var8, var9, (byte) 104, 134217728);
                this.method1708(var8, var9 - 1, (byte) 113, 8388608);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1708(var8, var9, (byte) -82, 4194304);
                this.method1708(var8 - 1, var9 + 1, (byte) 120, 67108864);
            }
            if (arg0 == 1) {
                this.method1708(var8, var9, (byte) -47, 16777216);
                this.method1708(var8 + 1, var9 + 1, (byte) -98, 268435456);
            }
            if (arg0 == 2) {
                this.method1708(var8, var9, (byte) -61, 67108864);
                this.method1708(var8 + 1, var9 + -1, (byte) -62, 4194304);
            }
            if (arg0 == 3) {
                this.method1708(var8, var9, (byte) 103, 268435456);
                this.method1708(var8 - 1, var9 - 1, (byte) 108, 16777216);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1708(var8, var9, (byte) -108, 545259520);
            this.method1708(var8 - 1, var9, (byte) -120, 33554432);
            this.method1708(var8, var9 + 1, (byte) -102, 134217728);
        }
        if (arg0 == 1) {
            this.method1708(var8, var9, (byte) -22, 41943040);
            this.method1708(var8, var9 + 1, (byte) 112, 134217728);
            this.method1708(var8 + 1, var9, (byte) 102, 536870912);
        }
        if (arg0 == 2) {
            this.method1708(var8, var9, (byte) 96, 167772160);
            this.method1708(var8 + 1, var9, (byte) 97, 536870912);
            this.method1708(var8, var9 - 1, (byte) -97, 8388608);
        }
        if (arg0 == 3) {
            this.method1708(var8, var9, (byte) -68, 671088640);
            this.method1708(var8, var9 - 1, (byte) -61, 8388608);
            this.method1708(var8 - 1, var9, (byte) -29, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILqg;ZBIII)V", line = 1246)
    public static final void method1706(int arg0, class372 arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 31) {
            field3758 = 77;
        }
        field3770++;
        if (class345.field4718 >= 50 || arg1 == null || arg1.field5255 == null || arg6 >= arg1.field5255.length || arg1.field5255[arg6] == null) {
            return;
        }
        int var7 = arg1.field5255[arg6][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xE2) >> 5;
        int var10 = var7 & 0x1F;
        if (arg1.field5255[arg6].length > 1) {
            int var11 = (int) (Math.random() * (double) arg1.field5255[arg6].length);
            if (var11 > 0) {
                var8 = arg1.field5255[arg6][var11];
            }
        }
        if (var10 == 0) {
            if (arg2) {
                class445.method2590(10683, 0, 255, var8, var9);
            }
        } else if (class491.field6932 != 0) {
            class325.field4478[class345.field4718] = var8;
            class317.field4304[class345.field4718] = var9;
            class189.field2715[class345.field4718] = 0;
            class400.field5593[class345.field4718] = null;
            class197.field2835[class345.field4718] = 255;
            int var12 = (arg4 - 64) / 128;
            int var13 = (arg5 - 64) / 128;
            class468.field6565[class345.field4718] = (var12 << 16) + (arg0 << 24) + (var13 << 8) + var10;
            class345.field4718++;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBIIIIII)Z", line = 1318)
    public final boolean method1707(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3777++;
        if (arg3 == 1) {
            if (arg6 == arg7 && arg0 == arg4) {
                return true;
            }
        } else if (arg6 >= arg7 && (arg3 + arg7 - 1) >= arg6 && arg4 >= arg4 && (arg3 + arg4 - 1) >= arg4) {
            return true;
        }
        int var9 = arg6 - this.field3751;
        int var10 = arg4 - this.field3761;
        int var11 = arg0 - this.field3761;
        int var12 = arg7 - this.field3751;
        if (arg3 == 1) {
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field3756[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field3756[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 - 1 == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field3756[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field3756[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field3756[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field3756[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field3756[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field3756[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field3756[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field3756[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field3756[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg3 - 1;
            int var14 = arg3 + var11 - 1;
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if ((var9 - arg3) == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 + 1 == var11 && (this.field3756[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 - arg3 == var11 && (this.field3756[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 >= var12 && var9 <= var13 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 - arg3 == var12 && var11 <= var10 && var10 <= var14 && (this.field3756[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 >= var11 && var14 >= var10 && (this.field3756[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var12 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var10 + 1) == var11 && (this.field3756[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 - arg3) == var11 && (this.field3756[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 >= var12 && var9 <= var13 && var10 - arg3 == var11) {
                        return true;
                    }
                    if ((var9 - arg3) == var12 && var11 <= var10 && var14 >= var10 && (this.field3756[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var14 >= var10 && (this.field3756[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if ((var9 - arg3) == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var14 >= var10 && (this.field3756[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 - arg3) == var11 && (this.field3756[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - arg3) == var12 && var10 >= var11 && var14 >= var10 && (this.field3756[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 - arg3 == var11 && (this.field3756[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - arg3 == var12 && var10 >= var11 && var10 <= var14 && (this.field3756[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var10 + 1) == var11 && (this.field3756[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var10 - arg3 == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 - arg3) == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var10 + 1 == var11 && (this.field3756[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14 && (this.field3756[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var10 - arg3 == var11) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var12 <= var9 && var9 <= var13 && var10 + 1 == var11 && (this.field3756[var9][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 <= var9 && var13 >= var9 && (var10 - arg3) == var11 && (this.field3756[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg3 == var12 && var11 <= var10 && var14 >= var10 && (this.field3756[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14 && (this.field3756[var12][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return arg1 == 120 ? false : false;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIBI)V", line = 1695)
    private final void method1708(int arg0, int arg1, byte arg2, int arg3) {
        field3767++;
        int var5 = -14 / ((37 - arg2) / 58);
        this.field3756[arg0][arg1] = class366.method2215(this.field3756[arg0][arg1], arg3);
    }
}
