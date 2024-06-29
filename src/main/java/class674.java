import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class674 {

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field9522 = 0;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field9525 = new String[8];

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
    public static int field9547 = -1;

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "[I")
    public static int[] field9548 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field9533;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field9534;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field9536;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public int field9538;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    public int field9539;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    public int field9541;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public int field9543;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "[[I")
    public int[][] field9532;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIIIIIII)Z", line = 4)
    public final boolean method3738(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9529++;
        if (arg6 == 1) {
            if (arg1 == arg4 && arg5 == arg7) {
                return true;
            }
        } else if (arg4 >= arg1 && arg1 + arg6 - 1 >= arg4 && arg7 <= arg7 && arg7 <= (arg7 + arg6 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field9538;
        int var10 = arg1 - this.field9541;
        int var11 = arg4 - this.field9541;
        if (!arg0) {
            field9547 = 32;
        }
        int var12 = arg7 - this.field9538;
        if (arg6 == 1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field9532[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9532[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9532[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field9532[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field9532[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9532[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9532[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9532[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field9532[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field9532[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field9532[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg6 - 1;
            int var14 = arg6 + var9 - 1;
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var11 - arg6 == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 + 1 == var9 && (this.field9532[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg6) == var9 && (this.field9532[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 <= var11 && var13 >= var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 - arg6) == var10 && var12 >= var9 && var14 >= var12 && (this.field9532[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field9532[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 + 1 == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 + 1 == var9 && (this.field9532[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 - arg6) == var9 && (this.field9532[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg6) == var9) {
                        return true;
                    }
                    if (var11 - arg6 == var10 && var9 <= var12 && var14 >= var12 && (this.field9532[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var14 >= var12 && (this.field9532[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var11 - arg6 == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var12 <= var14 && (this.field9532[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 - arg6 == var9 && (this.field9532[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - arg6 == var10 && var9 <= var12 && var14 >= var12 && (this.field9532[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 - arg6 == var9 && (this.field9532[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - arg6) == var10 && var12 >= var9 && var12 <= var14 && (this.field9532[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 + 1) == var9 && (this.field9532[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 - arg6) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var11 - arg6) == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 + 1) == var9 && (this.field9532[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var12 <= var14 && (this.field9532[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 - arg6 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9 && (this.field9532[var11][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var11 && var13 >= var11 && var12 - arg6 == var9 && (this.field9532[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg6 == var10 && var12 >= var9 && var12 <= var14 && (this.field9532[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 <= var12 && var14 >= var12 && (this.field9532[var10][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIZIZB)V", line = 384)
    public final void method3739(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, byte arg6) {
        field9545++;
        int var8 = arg4 - this.field9541;
        int var9 = arg1 - this.field9538;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method3742(var9, var8, 1, 128);
                this.method3742(var9, var8 - 1, 1, 8);
            }
            if (arg0 == 1) {
                this.method3742(var9, var8, 1, 2);
                this.method3742(var9 + 1, var8, 1, 32);
            }
            if (arg0 == 2) {
                this.method3742(var9, var8, 1, 8);
                this.method3742(var9, var8 + 1, 1, 128);
            }
            if (arg0 == 3) {
                this.method3742(var9, var8, 1, 32);
                this.method3742(var9 - 1, var8, 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method3742(var9, var8, 1, 1);
                this.method3742(var9 + 1, var8 + -1, 1, 16);
            }
            if (arg0 == 1) {
                this.method3742(var9, var8, 1, 4);
                this.method3742(var9 + 1, var8 - -1, 1, 64);
            }
            if (arg0 == 2) {
                this.method3742(var9, var8, 1, 16);
                this.method3742(var9 - 1, var8 + 1, 1, 1);
            }
            if (arg0 == 3) {
                this.method3742(var9, var8, 1, 64);
                this.method3742(var9 - 1, var8 - 1, 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method3742(var9, var8, 1, 130);
                this.method3742(var9, var8 - 1, 1, 8);
                this.method3742(var9 + 1, var8, 1, 32);
            }
            if (arg0 == 1) {
                this.method3742(var9, var8, 1, 10);
                this.method3742(var9 + 1, var8, 1, 32);
                this.method3742(var9, var8 + 1, 1, 128);
            }
            if (arg0 == 2) {
                this.method3742(var9, var8, 1, 40);
                this.method3742(var9, var8 + 1, 1, 128);
                this.method3742(var9 - 1, var8, 1, 2);
            }
            if (arg0 == 3) {
                this.method3742(var9, var8, 1, 160);
                this.method3742(var9 - 1, var8, 1, 2);
                this.method3742(var9, var8 - 1, 1, 8);
            }
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method3742(var9, var8, 1, 65536);
                    this.method3742(var9, var8 - 1, 1, 4096);
                }
                if (arg0 == 1) {
                    this.method3742(var9, var8, 1, 1024);
                    this.method3742(var9 + 1, var8, 1, 16384);
                }
                if (arg0 == 2) {
                    this.method3742(var9, var8, 1, 4096);
                    this.method3742(var9, var8 + 1, 1, 65536);
                }
                if (arg0 == 3) {
                    this.method3742(var9, var8, 1, 16384);
                    this.method3742(var9 - 1, var8, 1, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method3742(var9, var8, 1, 512);
                    this.method3742(var9 + 1, var8 + -1, 1, 8192);
                }
                if (arg0 == 1) {
                    this.method3742(var9, var8, 1, 2048);
                    this.method3742(var9 + 1, var8 + 1, 1, 32768);
                }
                if (arg0 == 2) {
                    this.method3742(var9, var8, 1, 8192);
                    this.method3742(var9 - 1, var8 + 1, 1, 512);
                }
                if (arg0 == 3) {
                    this.method3742(var9, var8, 1, 32768);
                    this.method3742(var9 - 1, var8 + -1, 1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method3742(var9, var8, 1, 66560);
                    this.method3742(var9, var8 - 1, 1, 4096);
                    this.method3742(var9 + 1, var8, 1, 16384);
                }
                if (arg0 == 1) {
                    this.method3742(var9, var8, 1, 5120);
                    this.method3742(var9 + 1, var8, 1, 16384);
                    this.method3742(var9, var8 + 1, 1, 65536);
                }
                if (arg0 == 2) {
                    this.method3742(var9, var8, 1, 20480);
                    this.method3742(var9, var8 + 1, 1, 65536);
                    this.method3742(var9 - 1, var8, 1, 1024);
                }
                if (arg0 == 3) {
                    this.method3742(var9, var8, 1, 81920);
                    this.method3742(var9 - 1, var8, 1, 1024);
                    this.method3742(var9, var8 - 1, 1, 4096);
                }
            }
        }
        int var10 = 22 / ((-arg6 - 19) / 56);
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method3742(var9, var8, 1, 536870912);
                this.method3742(var9, var8 - 1, 1, 33554432);
            }
            if (arg0 == 1) {
                this.method3742(var9, var8, 1, 8388608);
                this.method3742(var9 + 1, var8, 1, 134217728);
            }
            if (arg0 == 2) {
                this.method3742(var9, var8, 1, 33554432);
                this.method3742(var9, var8 + 1, 1, 536870912);
            }
            if (arg0 == 3) {
                this.method3742(var9, var8, 1, 134217728);
                this.method3742(var9 - 1, var8, 1, 8388608);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method3742(var9, var8, 1, 4194304);
                this.method3742(var9 + 1, var8 + -1, 1, 67108864);
            }
            if (arg0 == 1) {
                this.method3742(var9, var8, 1, 16777216);
                this.method3742(var9 + 1, var8 + 1, 1, 268435456);
            }
            if (arg0 == 2) {
                this.method3742(var9, var8, 1, 67108864);
                this.method3742(var9 - 1, var8 + 1, 1, 4194304);
            }
            if (arg0 == 3) {
                this.method3742(var9, var8, 1, 268435456);
                this.method3742(var9 - 1, var8 + -1, 1, 16777216);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method3742(var9, var8, 1, 545259520);
            this.method3742(var9, var8 - 1, 1, 33554432);
            this.method3742(var9 + 1, var8, 1, 134217728);
        }
        if (arg0 == 1) {
            this.method3742(var9, var8, 1, 41943040);
            this.method3742(var9 + 1, var8, 1, 134217728);
            this.method3742(var9, var8 + 1, 1, 536870912);
        }
        if (arg0 == 2) {
            this.method3742(var9, var8, 1, 167772160);
            this.method3742(var9, var8 + 1, 1, 536870912);
            this.method3742(var9 - 1, var8, 1, 8388608);
        }
        if (arg0 == 3) {
            this.method3742(var9, var8, 1, 671088640);
            this.method3742(var9 - 1, var8, 1, 8388608);
            this.method3742(var9, var8 - 1, 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIII)Z", line = 700)
    public static final boolean method3740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9520++;
        if (!class202.field2847) {
            return false;
        } else if (class416.field6031 < 100) {
            return false;
        } else if (arg3 != arg5 || arg0 != arg4) {
            for (int var9 = arg5; var9 <= arg3; var9++) {
                for (int var12 = arg0; var12 <= arg4; var12++) {
                    if (class580.field8171[arg6][var9][var12] == (-class295.field4328)) {
                        return false;
                    }
                }
            }
            int var10 = (arg5 << class310.field4593) + 1;
            if (arg1 != -3928) {
                field9528 = -12;
            }
            int var11 = (arg0 << class310.field4593) + 2;
            if (class153.method1073(1021, (arg3 + 1 - arg5) * class437.field6392, class296.field4340[arg6].method432(arg5, false, arg0), arg2, var10, (arg4 + 1 - arg0) * class437.field6392, var11)) {
                class109.field1669++;
                return true;
            } else {
                return false;
            }
        } else if (class252.method1682(arg6, arg5, (byte) 7, arg0)) {
            int var7 = arg5 << class310.field4593;
            int var8 = arg0 << class310.field4593;
            if (class153.method1073(1021, class437.field6392, class296.field4340[arg6].method432(arg5, false, arg0), arg2, var7, class437.field6392, var8)) {
                class109.field1669++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIZIIILcp;II)Z", line = 766)
    public static final boolean method3741(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, class674 arg9, int arg10, int arg11) {
        if (arg5) {
            field9548 = null;
        }
        field9533++;
        int var12 = arg10;
        int var13 = arg2;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg10 - var14;
        class178.field2537[var14][var15] = 99;
        int var17 = arg2 - var15;
        class226.field3183[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class184.field2588[var18] = arg10;
        int var35 = var18 + 1;
        class416.field6035[var18] = arg2;
        int[][] var20 = arg9.field9532;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class107.field1645 = var12;
                                    class218.field3056 = var13;
                                    return false;
                                }
                                var12 = class184.field2588[var19];
                                var13 = class416.field6035[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg9.field9541;
                                var24 = var13 - arg9.field9538;
                                if (arg3 == -4) {
                                    if (arg4 == var12 && arg1 == var13) {
                                        class218.field3056 = var13;
                                        class107.field1645 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -3) {
                                    if (class328.method2063(arg11, arg8, arg6, var12, var13, arg4, -1, arg6, arg1)) {
                                        class107.field1645 = var12;
                                        class218.field3056 = var13;
                                        return true;
                                    }
                                } else if (arg3 == -2) {
                                    if (arg9.method3750(arg6, arg8, arg4, var13, arg1, arg7, var12, arg6, arg11, (byte) -110)) {
                                        class107.field1645 = var12;
                                        class218.field3056 = var13;
                                        return true;
                                    }
                                } else if (arg3 == -1) {
                                    if (arg9.method3752(-27907, arg1, arg8, arg11, arg4, var13, var12, arg7, arg6)) {
                                        class107.field1645 = var12;
                                        class218.field3056 = var13;
                                        return true;
                                    }
                                } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                                    if (arg9.method3738(true, var12, arg3, arg0, arg4, var13, arg6, arg1)) {
                                        class218.field3056 = var13;
                                        class107.field1645 = var12;
                                        return true;
                                    }
                                } else if (arg9.method3743(arg6, arg3, var13, (byte) -112, arg4, arg1, arg0, var12)) {
                                    class107.field1645 = var12;
                                    class218.field3056 = var13;
                                    return true;
                                }
                                var26 = class226.field3183[var21][var22] + 1;
                                if (var21 > 0 && class178.field2537[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg6 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var27) {
                                            class184.field2588[var35] = var12 - 1;
                                            class416.field6035[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class178.field2537[var21 - 1][var22] = 2;
                                            class226.field3183[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg6 > var21 && class178.field2537[var21 + 1][var22] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[arg6 + var23][var24 + arg6 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg6 - 1 <= var28) {
                                            class184.field2588[var35] = var12 + 1;
                                            class416.field6035[var35] = var13;
                                            class178.field2537[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class226.field3183[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class178.field2537[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg6 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg6 - 1 <= var29) {
                                            class184.field2588[var35] = var12;
                                            class416.field6035[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class178.field2537[var21][var22 - 1] = 1;
                                            class226.field3183[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg6) && class178.field2537[var21][var22 + 1] == 0 && (var20[var23][arg6 + var24] & 0x4E240000) == 0 && (var20[arg6 + var23 - 1][arg6 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg6 - 1)) {
                                            class184.field2588[var35] = var12;
                                            class416.field6035[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class178.field2537[var21][var22 + 1] = 4;
                                            class226.field3183[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg6] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class178.field2537[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg6) {
                                            class184.field2588[var35] = var12 - 1;
                                            class416.field6035[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class178.field2537[var21 - 1][var22 - 1] = 3;
                                            class226.field3183[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg6 > var21 && var22 > 0 && class178.field2537[var21 + 1][var22 - 1] == 0 && (var20[arg6 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg6) {
                                            class184.field2588[var35] = var12 + 1;
                                            class416.field6035[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class178.field2537[var21 + 1][var22 - 1] = 9;
                                            class226.field3183[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && (128 - arg6) > var22 && class178.field2537[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg6] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg6] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class184.field2588[var35] = var12 - 1;
                                    class416.field6035[var35] = var13 + 1;
                                    class178.field2537[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class226.field3183[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg6));
                        } while (var22 >= (128 - arg6));
                    } while (class178.field2537[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg6 + var23][arg6 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][arg6 + var24] & 0x7E240000) != 0 || (var20[arg6 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class184.field2588[var35] = var12 + 1;
                class416.field6035[var35] = var13 + 1;
                class178.field2537[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class226.field3183[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V", line = 1200)
    private final void method3742(int arg0, int arg1, int arg2, int arg3) {
        field9535++;
        if (arg2 != 1) {
            this.method3752(44, -33, 99, 3, 81, -75, 35, -36, -29);
        }
        this.field9532[arg1][arg0] = class486.method2826(this.field9532[arg1][arg0], arg3);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIBIIII)Z", line = 1215)
    public final boolean method3743(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field9523++;
        if (arg0 == 1) {
            if (arg4 == arg7 && arg2 == arg5) {
                return true;
            }
        } else if (arg7 <= arg4 && arg4 <= (arg0 + arg7 - 1) && arg5 >= arg5 && arg0 + arg5 - 1 >= arg5) {
            return true;
        }
        int var9 = arg7 - this.field9541;
        int var10 = arg5 - this.field9538;
        if (arg3 > -96) {
            return true;
        }
        int var11 = arg4 - this.field9541;
        int var12 = arg2 - this.field9538;
        if (arg0 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field9532[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field9532[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field9532[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field9532[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field9532[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field9532[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field9532[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field9532[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field9532[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field9532[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field9532[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field9532[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var9 - 1;
            int var14 = arg0 + var12 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14 && (this.field9532[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 - arg0 == var12 && (this.field9532[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - arg0) == var9 && var12 <= var10 && var10 <= var14 && (this.field9532[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 - arg0 == var12 && (this.field9532[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 - arg0) == var9 && var10 >= var12 && var10 <= var14 && (this.field9532[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12 && (this.field9532[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 + 1 == var9 && var12 <= var10 && var14 >= var10 && (this.field9532[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12 && (this.field9532[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 <= var11 && var13 >= var11 && (var10 + 1) == var12 && (this.field9532[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var11 && var11 <= var13 && (var10 - arg0) == var12 && (this.field9532[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg0 == var9 && var12 <= var10 && var14 >= var10 && (this.field9532[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var12 <= var10 && var10 <= var14 && (this.field9532[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIIIIZI)V", line = 1411)
    public final void method3744(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field9538;
        field9531++;
        int var9 = arg6 - this.field9541;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3756(var8, false, 128, var9);
                this.method3756(var8, false, 8, var9 - 1);
            }
            if (arg3 == 1) {
                this.method3756(var8, false, 2, var9);
                this.method3756(var8 + 1, false, 32, var9);
            }
            if (arg3 == 2) {
                this.method3756(var8, false, 8, var9);
                this.method3756(var8, false, 128, var9 + 1);
            }
            if (arg3 == 3) {
                this.method3756(var8, false, 32, var9);
                this.method3756(var8 - 1, false, 2, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3756(var8, false, 1, var9);
                this.method3756(var8 + 1, false, 16, var9 - 1);
            }
            if (arg3 == 1) {
                this.method3756(var8, false, 4, var9);
                this.method3756(var8 + 1, false, 64, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3756(var8, false, 16, var9);
                this.method3756(var8 - 1, false, 1, var9 + 1);
            }
            if (arg3 == 3) {
                this.method3756(var8, false, 64, var9);
                this.method3756(var8 - 1, false, 4, var9 - 1);
            }
        }
        int var10 = -23 % ((-arg1 - 58) / 58);
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3756(var8, false, 130, var9);
                this.method3756(var8, false, 8, var9 - 1);
                this.method3756(var8 + 1, false, 32, var9);
            }
            if (arg3 == 1) {
                this.method3756(var8, false, 10, var9);
                this.method3756(var8 + 1, false, 32, var9);
                this.method3756(var8, false, 128, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3756(var8, false, 40, var9);
                this.method3756(var8, false, 128, var9 + 1);
                this.method3756(var8 - 1, false, 2, var9);
            }
            if (arg3 == 3) {
                this.method3756(var8, false, 160, var9);
                this.method3756(var8 - 1, false, 2, var9);
                this.method3756(var8, false, 8, var9 - 1);
            }
        }
        if (arg0) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    this.method3756(var8, false, 65536, var9);
                    this.method3756(var8, false, 4096, var9 - 1);
                }
                if (arg3 == 1) {
                    this.method3756(var8, false, 1024, var9);
                    this.method3756(var8 + 1, false, 16384, var9);
                }
                if (arg3 == 2) {
                    this.method3756(var8, false, 4096, var9);
                    this.method3756(var8, false, 65536, var9 + 1);
                }
                if (arg3 == 3) {
                    this.method3756(var8, false, 16384, var9);
                    this.method3756(var8 - 1, false, 1024, var9);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg3 == 0) {
                    this.method3756(var8, false, 512, var9);
                    this.method3756(var8 + 1, false, 8192, var9 - 1);
                }
                if (arg3 == 1) {
                    this.method3756(var8, false, 2048, var9);
                    this.method3756(var8 + 1, false, 32768, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method3756(var8, false, 8192, var9);
                    this.method3756(var8 - 1, false, 512, var9 + 1);
                }
                if (arg3 == 3) {
                    this.method3756(var8, false, 32768, var9);
                    this.method3756(var8 - 1, false, 2048, var9 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    this.method3756(var8, false, 66560, var9);
                    this.method3756(var8, false, 4096, var9 - 1);
                    this.method3756(var8 + 1, false, 16384, var9);
                }
                if (arg3 == 1) {
                    this.method3756(var8, false, 5120, var9);
                    this.method3756(var8 + 1, false, 16384, var9);
                    this.method3756(var8, false, 65536, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method3756(var8, false, 20480, var9);
                    this.method3756(var8, false, 65536, var9 + 1);
                    this.method3756(var8 - 1, false, 1024, var9);
                }
                if (arg3 == 3) {
                    this.method3756(var8, false, 81920, var9);
                    this.method3756(var8 - 1, false, 1024, var9);
                    this.method3756(var8, false, 4096, var9 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3756(var8, false, 536870912, var9);
                this.method3756(var8, false, 33554432, var9 - 1);
            }
            if (arg3 == 1) {
                this.method3756(var8, false, 8388608, var9);
                this.method3756(var8 + 1, false, 134217728, var9);
            }
            if (arg3 == 2) {
                this.method3756(var8, false, 33554432, var9);
                this.method3756(var8, false, 536870912, var9 + 1);
            }
            if (arg3 == 3) {
                this.method3756(var8, false, 134217728, var9);
                this.method3756(var8 - 1, false, 8388608, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3756(var8, false, 4194304, var9);
                this.method3756(var8 + 1, false, 67108864, var9 - 1);
            }
            if (arg3 == 1) {
                this.method3756(var8, false, 16777216, var9);
                this.method3756(var8 + 1, false, 268435456, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3756(var8, false, 67108864, var9);
                this.method3756(var8 - 1, false, 4194304, var9 + 1);
            }
            if (arg3 == 3) {
                this.method3756(var8, false, 268435456, var9);
                this.method3756(var8 - 1, false, 16777216, var9 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3756(var8, false, 545259520, var9);
            this.method3756(var8, false, 33554432, var9 - 1);
            this.method3756(var8 + 1, false, 134217728, var9);
        }
        if (arg3 == 1) {
            this.method3756(var8, false, 41943040, var9);
            this.method3756(var8 + 1, false, 134217728, var9);
            this.method3756(var8, false, 536870912, var9 + 1);
        }
        if (arg3 == 2) {
            this.method3756(var8, false, 167772160, var9);
            this.method3756(var8, false, 536870912, var9 + 1);
            this.method3756(var8 - 1, false, 8388608, var9);
        }
        if (arg3 == 3) {
            this.method3756(var8, false, 671088640, var9);
            this.method3756(var8 - 1, false, 8388608, var9);
            this.method3756(var8, false, 33554432, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIZIIZII)V", line = 1715)
    public final void method3745(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field9526++;
        int var9 = 256;
        if (arg7 != 131072) {
            this.field9543 = 22;
        }
        if (arg2) {
            var9 |= 0x20000;
        }
        int var10 = arg0 - this.field9538;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg1;
            arg1 = arg6;
            arg6 = var11;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        int var12 = arg3 - this.field9541;
        for (int var13 = var12; var13 < var12 + arg1; var13++) {
            if (var13 >= 0 && var13 < this.field9543) {
                for (int var14 = var10; var14 < arg6 + var10; var14++) {
                    if (var14 >= 0 && this.field9539 > var14) {
                        this.method3756(var14, false, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V", line = 1768)
    public final void method3746(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field9541;
        int var5 = arg2 - this.field9538;
        int var6 = 117 / ((87 - arg0) / 36);
        field9527++;
        this.field9532[var4][var5] = class486.method2826(this.field9532[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZZIIIBI)V", line = 1780)
    public final void method3747(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 <= 25) {
            this.method3750(-120, 26, 118, -32, -47, -77, -73, 47, -96, (byte) 70);
        }
        field9540++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field9541;
        int var10 = arg4 - this.field9538;
        if (arg0) {
            var8 |= 0x40000000;
        }
        for (int var11 = var9; var11 < arg6 + var9; var11++) {
            if (var11 >= 0 && this.field9543 > var11) {
                for (int var12 = var10; var12 < (arg3 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field9539) {
                        this.method3742(var12, var11, 1, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(IIII)I", line = 1825)
    public static final int method3748(int arg0, int arg1, int arg2, int arg3) {
        field9534++;
        if (class296.field4340 == null) {
            return 0;
        }
        int var4 = arg0 >> 9;
        int var5 = arg3 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > class199.field2812 - 1 || var5 > class232.field3611 - 1) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class672.field9500[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        if (arg2 <= 61) {
            field9525 = null;
        }
        return class296.field4340[var6].method442(arg0, true, arg3);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V", line = 1855)
    public final void method3749(boolean arg0) {
        if (arg0) {
            field9521 = 48;
        }
        for (int var2 = 0; var2 < this.field9543; var2++) {
            for (int var3 = 0; var3 < this.field9539; var3++) {
                if (var2 == 0 || var3 == 0 || this.field9543 - 5 <= var2 || this.field9539 - 5 <= var3) {
                    this.field9532[var2][var3] = -1;
                } else {
                    this.field9532[var2][var3] = 2097152;
                }
            }
        }
        field9530++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIIIB)Z", line = 1890)
    public final boolean method3750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field9546++;
        if (arg9 != -110) {
            return false;
        }
        int var11 = arg6 + arg7;
        int var12 = arg3 + arg0;
        int var13 = arg2 + arg8;
        int var14 = arg1 + arg4;
        if (arg6 == var13 && (arg5 & 0x2) == 0) {
            int var15 = arg4 < arg3 ? arg3 : arg4;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field9532[var13 - this.field9541 - 1][var15 - this.field9538] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg2 == var11 && (arg5 & 0x8) == 0) {
            int var17 = arg3 <= arg4 ? arg4 : arg3;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field9532[arg2 - this.field9541][var17 - this.field9538] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg5 & 0x1) == 0) {
            int var19 = arg6 <= arg2 ? arg2 : arg6;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field9532[var19 - this.field9541][var14 - this.field9538 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg5 & 0x4) == 0) {
            int var21 = arg6 <= arg2 ? arg2 : arg6;
            int var22 = var13 > var11 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field9532[var21 - this.field9541][arg4 - this.field9538] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(Z)V", line = 1991)
    public static void method3751(boolean arg0) {
        field9525 = null;
        field9548 = null;
        if (arg0) {
            method3751(true);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIII)Z", line = 2005)
    public final boolean method3752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != -27907) {
            return false;
        }
        field9524++;
        if (arg8 > 1) {
            return class328.method2063(arg3, arg2, arg8, arg6, arg5, arg4, -1, arg8, arg1) ? true : this.method3750(arg8, arg2, arg4, arg5, arg1, arg7, arg6, arg8, arg3, (byte) -110);
        }
        int var10 = arg3 + arg4 - 1;
        int var11 = arg1 + arg2 - 1;
        if (arg6 >= arg4 && arg6 <= var10 && arg1 <= arg5 && arg5 <= var11) {
            return true;
        } else if (arg4 - 1 == arg6 && arg5 >= arg1 && arg5 <= var11 && (this.field9532[arg6 - this.field9541][arg5 - this.field9538] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg6 && arg5 >= arg1 && var11 >= arg5 && (this.field9532[arg6 - this.field9541][arg5 - this.field9538] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if ((arg1 - 1) == arg5 && arg4 <= arg6 && var10 >= arg6 && (this.field9532[arg6 - this.field9541][arg5 - this.field9538] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg4 <= arg6 && arg6 <= var10 && (this.field9532[arg6 - this.field9541][arg5 - this.field9538] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)V", line = 2053)
    public final void method3753(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field9541;
        field9536++;
        if (arg0 != -20407) {
            field9548 = null;
        }
        int var5 = arg2 - this.field9538;
        this.field9532[var4][var5] = class689.method3797(this.field9532[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBI)V", line = 2069)
    public final void method3754(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field9538;
        int var5 = arg0 - this.field9541;
        field9537++;
        if (arg1 != -84) {
            this.field9541 = -43;
        }
        this.field9532[var5][var4] = class486.method2826(this.field9532[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(III)V", line = 2090)
    public final void method3755(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field9541;
        int var5 = arg1 - this.field9538;
        field9542++;
        this.field9532[var4][var5] = class689.method3797(this.field9532[var4][var5], -262145);
        if (arg2 <= 85) {
            this.method3742(-30, 126, 88, -23);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZII)V", line = 2103)
    private final void method3756(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field9543 = 48;
        }
        this.field9532[arg3][arg0] = class689.method3797(this.field9532[arg3][arg0], ~arg2);
        field9544++;
    }
}
