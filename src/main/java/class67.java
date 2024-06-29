import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class67 {

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Lbj;")
    public static class131 field1004 = new class131(32);

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Lbj;")
    public static class131 field1008 = new class131(64);

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "[[B")
    public static byte[][] field1014;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "[[I")
    public int[][] field1016;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)V")
    public final void method516(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field993;
        int var5 = arg2 - this.field1009;
        field1007++;
        if (arg1 < -54) {
            this.field1016[var4][var5] = class393.method2487(this.field1016[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IBI)V")
    public final void method517(int arg0, byte arg1, int arg2) {
        field1002++;
        int var4 = arg0 - this.field1009;
        int var5 = arg2 - this.field993;
        if (arg1 > -2) {
            field1008 = null;
        }
        this.field1016[var5][var4] = class387.method2454(this.field1016[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)V")
    public final void method518(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field993;
        int var5 = arg0 - this.field1009;
        field1003++;
        this.field1016[var4][var5] = class387.method2454(this.field1016[var4][var5], -262145);
        if (arg2 <= 78) {
            this.method524(15, 21, -56, false, 78, true, -96, -50);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIZI)Z")
    public final boolean method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field992++;
        if (arg7 == 1) {
            if (arg4 == arg5 && arg1 == arg3) {
                return true;
            }
        } else if (arg4 >= arg5 && arg5 + arg7 - 1 >= arg4 && arg3 <= arg3 && (arg7 + arg3 - 1) >= arg3) {
            return true;
        }
        int var9 = arg3 - this.field1009;
        int var10 = arg4 - this.field993;
        int var11 = arg5 - this.field993;
        int var12 = arg1 - this.field1009;
        if (arg7 == 1) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field1016[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field1016[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field1016[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field1016[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field1016[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field1016[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field1016[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field1016[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field1016[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var9 - 1) == var12 && (this.field1016[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field1016[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = arg7 + var12 - 1;
            if (arg0 == 0) {
                if (arg2 == 0) {
                    if ((var10 - arg7) == var11 && var9 >= var12 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 + 1 == var12 && (this.field1016[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 - arg7 == var12 && (this.field1016[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 - arg7 == var11 && var9 >= var12 && var9 <= var14 && (this.field1016[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14 && (this.field1016[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 + 1) == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12 && (this.field1016[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg7) == var12 && (this.field1016[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 <= var10 && var10 <= var13 && var9 - arg7 == var12) {
                        return true;
                    }
                    if ((var10 - arg7) == var11 && var12 <= var9 && var9 <= var14 && (this.field1016[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var14 >= var9 && (this.field1016[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    if ((var10 - arg7) == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9 && (this.field1016[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg7 == var12 && (this.field1016[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - arg7 == var11 && var12 <= var9 && var9 <= var14 && (this.field1016[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 - arg7 == var12 && (this.field1016[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 - arg7) == var11 && var9 >= var12 && var14 >= var9 && (this.field1016[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12 && (this.field1016[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 - arg7) == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 - arg7 == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12 && (this.field1016[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 <= var9 && var9 <= var14 && (this.field1016[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 - arg7) == var12) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12 && (this.field1016[var10][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && var9 - arg7 == var12 && (this.field1016[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg7) == var11 && var12 <= var9 && var9 <= var14 && (this.field1016[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14 && (this.field1016[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return arg6 ? false : false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method520(int arg0) {
        field1014 = null;
        if (arg0 != 15922) {
            field999 = 98;
        }
        field1004 = null;
        field1008 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
    private final void method521(int arg0, int arg1, int arg2, int arg3) {
        field1010++;
        this.field1016[arg2][arg0] = class393.method2487(this.field1016[arg2][arg0], arg3);
        if (arg1 != -14850) {
            method520(-106);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIZIIIZ)V")
    public final void method522(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg5 - this.field993;
        field1005++;
        int var9 = arg0 - this.field1009;
        if (~arg3 == arg1) {
            if (arg4 == 0) {
                this.method531(true, var9, var8, 128);
                this.method531(true, var9, var8 - 1, 8);
            }
            if (arg4 == 1) {
                this.method531(true, var9, var8, 2);
                this.method531(true, var9 + 1, var8, 32);
            }
            if (arg4 == 2) {
                this.method531(true, var9, var8, 8);
                this.method531(true, var9, var8 + 1, 128);
            }
            if (arg4 == 3) {
                this.method531(true, var9, var8, 32);
                this.method531(true, var9 - 1, var8, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method531(true, var9, var8, 1);
                this.method531(true, var9 + 1, var8 - 1, 16);
            }
            if (arg4 == 1) {
                this.method531(true, var9, var8, 4);
                this.method531(true, var9 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method531(true, var9, var8, 16);
                this.method531(true, var9 - 1, var8 - -1, 1);
            }
            if (arg4 == 3) {
                this.method531(true, var9, var8, 64);
                this.method531(true, var9 - 1, var8 + -1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method531(true, var9, var8, 130);
                this.method531(true, var9, var8 - 1, 8);
                this.method531(true, var9 + 1, var8, 32);
            }
            if (arg4 == 1) {
                this.method531(true, var9, var8, 10);
                this.method531(true, var9 + 1, var8, 32);
                this.method531(true, var9, var8 + 1, 128);
            }
            if (arg4 == 2) {
                this.method531(true, var9, var8, 40);
                this.method531(true, var9, var8 + 1, 128);
                this.method531(true, var9 - 1, var8, 2);
            }
            if (arg4 == 3) {
                this.method531(true, var9, var8, 160);
                this.method531(true, var9 - 1, var8, 2);
                this.method531(true, var9, var8 - 1, 8);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg4 == 0) {
                    this.method531(true, var9, var8, 65536);
                    this.method531(true, var9, var8 - 1, 4096);
                }
                if (arg4 == 1) {
                    this.method531(true, var9, var8, 1024);
                    this.method531(true, var9 + 1, var8, 16384);
                }
                if (arg4 == 2) {
                    this.method531(true, var9, var8, 4096);
                    this.method531(true, var9, var8 + 1, 65536);
                }
                if (arg4 == 3) {
                    this.method531(true, var9, var8, 16384);
                    this.method531(true, var9 - 1, var8, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg4 == 0) {
                    this.method531(true, var9, var8, 512);
                    this.method531(true, var9 + 1, var8 + -1, 8192);
                }
                if (arg4 == 1) {
                    this.method531(true, var9, var8, 2048);
                    this.method531(true, var9 + 1, var8 + 1, 32768);
                }
                if (arg4 == 2) {
                    this.method531(true, var9, var8, 8192);
                    this.method531(true, var9 - 1, var8 + 1, 512);
                }
                if (arg4 == 3) {
                    this.method531(true, var9, var8, 32768);
                    this.method531(true, var9 - 1, var8 - 1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg4 == 0) {
                    this.method531(true, var9, var8, 66560);
                    this.method531(true, var9, var8 - 1, 4096);
                    this.method531(true, var9 + 1, var8, 16384);
                }
                if (arg4 == 1) {
                    this.method531(true, var9, var8, 5120);
                    this.method531(true, var9 + 1, var8, 16384);
                    this.method531(true, var9, var8 + 1, 65536);
                }
                if (arg4 == 2) {
                    this.method531(true, var9, var8, 20480);
                    this.method531(true, var9, var8 + 1, 65536);
                    this.method531(true, var9 - 1, var8, 1024);
                }
                if (arg4 == 3) {
                    this.method531(true, var9, var8, 81920);
                    this.method531(true, var9 - 1, var8, 1024);
                    this.method531(true, var9, var8 - 1, 4096);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method531(true, var9, var8, 536870912);
                this.method531(true, var9, var8 - 1, 33554432);
            }
            if (arg4 == 1) {
                this.method531(true, var9, var8, 8388608);
                this.method531(true, var9 + 1, var8, 134217728);
            }
            if (arg4 == 2) {
                this.method531(true, var9, var8, 33554432);
                this.method531(true, var9, var8 + 1, 536870912);
            }
            if (arg4 == 3) {
                this.method531(true, var9, var8, 134217728);
                this.method531(true, var9 - 1, var8, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method531(true, var9, var8, 4194304);
                this.method531(true, var9 + 1, var8 - 1, 67108864);
            }
            if (arg4 == 1) {
                this.method531(true, var9, var8, 16777216);
                this.method531(true, var9 + 1, var8 - -1, 268435456);
            }
            if (arg4 == 2) {
                this.method531(true, var9, var8, 67108864);
                this.method531(true, var9 - 1, var8 + 1, 4194304);
            }
            if (arg4 == 3) {
                this.method531(true, var9, var8, 268435456);
                this.method531(true, var9 - 1, var8 - 1, 16777216);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method531(true, var9, var8, 545259520);
            this.method531(true, var9, var8 - 1, 33554432);
            this.method531(true, var9 + 1, var8, 134217728);
        }
        if (arg4 == 1) {
            this.method531(true, var9, var8, 41943040);
            this.method531(true, var9 + 1, var8, 134217728);
            this.method531(true, var9, var8 + 1, 536870912);
        }
        if (arg4 == 2) {
            this.method531(true, var9, var8, 167772160);
            this.method531(true, var9, var8 + 1, 536870912);
            this.method531(true, var9 - 1, var8, 8388608);
        }
        if (arg4 == 3) {
            this.method531(true, var9, var8, 671088640);
            this.method531(true, var9 - 1, var8, 8388608);
            this.method531(true, var9, var8 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIB)V")
    public final void method523(int arg0, int arg1, byte arg2) {
        field1000++;
        int var4 = arg1 - this.field993;
        int var5 = arg0 - this.field1009;
        if (arg2 >= -12) {
            this.method521(81, 9, -103, -77);
        }
        this.field1016[var4][var5] = class393.method2487(this.field1016[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIZIZII)V")
    public final void method524(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1012++;
        if (arg2 != 31483) {
            this.field1013 = 48;
        }
        int var9 = 256;
        if (arg3) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field1009;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg7;
            arg7 = arg0;
            arg0 = var11;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        int var12 = arg4 - this.field993;
        for (int var13 = var12; var13 < (arg7 + var12); var13++) {
            if (var13 >= 0 && var13 < this.field1013) {
                for (int var14 = var10; var14 < (var10 + arg0); var14++) {
                    if (var14 >= 0 && var14 < this.field995) {
                        this.method531(true, var14, var13, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIZIIII)V")
    public final void method525(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1011++;
        int var8 = arg6 - this.field1009;
        int var9 = arg1 - this.field993;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method521(var8, -14850, var9, 128);
                this.method521(var8, arg4 - 40971, var9 + -1, 8);
            }
            if (arg5 == 1) {
                this.method521(var8, arg4 - 40971, var9, 2);
                this.method521(var8 + 1, -14850, var9, 32);
            }
            if (arg5 == 2) {
                this.method521(var8, -14850, var9, 8);
                this.method521(var8, -14850, var9 + 1, 128);
            }
            if (arg5 == 3) {
                this.method521(var8, arg4 ^ 0xFFFFA3F7, var9, 32);
                this.method521(var8 - 1, -14850, var9, 2);
            }
        }
        if (arg4 != 26121) {
            this.method530(120, -109, -88, 74, (byte) 44, 44, 41, 123, -39);
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method521(var8, arg4 - 40971, var9, 1);
                this.method521(var8 + 1, -14850, var9 + -1, 16);
            }
            if (arg5 == 1) {
                this.method521(var8, -14850, var9, 4);
                this.method521(var8 + 1, -14850, var9 + 1, 64);
            }
            if (arg5 == 2) {
                this.method521(var8, arg4 - 40971, var9, 16);
                this.method521(var8 - 1, arg4 + -40971, var9 + 1, 1);
            }
            if (arg5 == 3) {
                this.method521(var8, -14850, var9, 64);
                this.method521(var8 - 1, -14850, var9 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method521(var8, arg4 ^ 0xFFFFA3F7, var9, 130);
                this.method521(var8, -14850, var9 - 1, 8);
                this.method521(var8 + 1, -14850, var9, 32);
            }
            if (arg5 == 1) {
                this.method521(var8, arg4 - 40971, var9, 10);
                this.method521(var8 + 1, -14850, var9, 32);
                this.method521(var8, -14850, var9 + 1, 128);
            }
            if (arg5 == 2) {
                this.method521(var8, -14850, var9, 40);
                this.method521(var8, -14850, var9 + 1, 128);
                this.method521(var8 - 1, arg4 + -40971, var9, 2);
            }
            if (arg5 == 3) {
                this.method521(var8, -14850, var9, 160);
                this.method521(var8 - 1, -14850, var9, 2);
                this.method521(var8, -14850, var9 - 1, 8);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method521(var8, -14850, var9, 65536);
                    this.method521(var8, -14850, var9 - 1, 4096);
                }
                if (arg5 == 1) {
                    this.method521(var8, -14850, var9, 1024);
                    this.method521(var8 + 1, -14850, var9, 16384);
                }
                if (arg5 == 2) {
                    this.method521(var8, -14850, var9, 4096);
                    this.method521(var8, -14850, var9 + 1, 65536);
                }
                if (arg5 == 3) {
                    this.method521(var8, arg4 ^ 0xFFFFA3F7, var9, 16384);
                    this.method521(var8 - 1, -14850, var9, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method521(var8, -14850, var9, 512);
                    this.method521(var8 + 1, -14850, var9 + -1, 8192);
                }
                if (arg5 == 1) {
                    this.method521(var8, -14850, var9, 2048);
                    this.method521(var8 + 1, -14850, var9 + 1, 32768);
                }
                if (arg5 == 2) {
                    this.method521(var8, -14850, var9, 8192);
                    this.method521(var8 - 1, -14850, var9 + 1, 512);
                }
                if (arg5 == 3) {
                    this.method521(var8, -14850, var9, 32768);
                    this.method521(var8 - 1, -14850, var9 + -1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method521(var8, arg4 - 40971, var9, 66560);
                    this.method521(var8, -14850, var9 - 1, 4096);
                    this.method521(var8 + 1, arg4 ^ 0xFFFFA3F7, var9, 16384);
                }
                if (arg5 == 1) {
                    this.method521(var8, -14850, var9, 5120);
                    this.method521(var8 + 1, -14850, var9, 16384);
                    this.method521(var8, arg4 ^ 0xFFFFA3F7, var9 + 1, 65536);
                }
                if (arg5 == 2) {
                    this.method521(var8, -14850, var9, 20480);
                    this.method521(var8, -14850, var9 + 1, 65536);
                    this.method521(var8 - 1, arg4 + -40971, var9, 1024);
                }
                if (arg5 == 3) {
                    this.method521(var8, -14850, var9, 81920);
                    this.method521(var8 - 1, -14850, var9, 1024);
                    this.method521(var8, arg4 ^ 0xFFFFA3F7, var9 - 1, 4096);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method521(var8, arg4 - 40971, var9, 536870912);
                this.method521(var8, -14850, var9 - 1, 33554432);
            }
            if (arg5 == 1) {
                this.method521(var8, -14850, var9, 8388608);
                this.method521(var8 + 1, arg4 ^ 0xFFFFA3F7, var9, 134217728);
            }
            if (arg5 == 2) {
                this.method521(var8, -14850, var9, 33554432);
                this.method521(var8, arg4 - 40971, var9 - -1, 536870912);
            }
            if (arg5 == 3) {
                this.method521(var8, -14850, var9, 134217728);
                this.method521(var8 - 1, arg4 + -40971, var9, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method521(var8, -14850, var9, 4194304);
                this.method521(var8 + 1, -14850, var9 - 1, 67108864);
            }
            if (arg5 == 1) {
                this.method521(var8, -14850, var9, 16777216);
                this.method521(var8 + 1, -14850, var9 + 1, 268435456);
            }
            if (arg5 == 2) {
                this.method521(var8, -14850, var9, 67108864);
                this.method521(var8 - 1, arg4 + -40971, var9 + 1, 4194304);
            }
            if (arg5 == 3) {
                this.method521(var8, -14850, var9, 268435456);
                this.method521(var8 - 1, -14850, var9 - 1, 16777216);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method521(var8, arg4 ^ 0xFFFFA3F7, var9, 545259520);
            this.method521(var8, -14850, var9 - 1, 33554432);
            this.method521(var8 + 1, -14850, var9, 134217728);
        }
        if (arg5 == 1) {
            this.method521(var8, -14850, var9, 41943040);
            this.method521(var8 + 1, -14850, var9, 134217728);
            this.method521(var8, -14850, var9 + 1, 536870912);
        }
        if (arg5 == 2) {
            this.method521(var8, -14850, var9, 167772160);
            this.method521(var8, -14850, var9 + 1, 536870912);
            this.method521(var8 - 1, -14850, var9, 8388608);
        }
        if (arg5 == 3) {
            this.method521(var8, -14850, var9, 671088640);
            this.method521(var8 - 1, -14850, var9, 8388608);
            this.method521(var8, arg4 ^ 0xFFFFA3F7, var9 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBIIIIIIII)Z")
    public final boolean method526(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field994++;
        if (arg1 != -113) {
            return false;
        }
        int var11 = arg2 + arg7;
        int var12 = arg6 + arg9;
        int var13 = arg3 + arg4;
        int var14 = arg0 + arg5;
        if (arg7 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg5 >= arg6 ? arg5 : arg6;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field1016[var13 - this.field993 - 1][var15 - this.field1009] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg3 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg5 < arg6 ? arg6 : arg5;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field1016[arg3 - this.field993][var17 - this.field1009] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg3 < arg7 ? arg7 : arg3;
            int var20 = var11 < var13 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field1016[var19 - this.field993][var14 - this.field1009 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg5 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg7 > arg3 ? arg7 : arg3;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field1016[var21 - this.field993][arg5 - this.field1009] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method527(String arg0, byte arg1) {
        field998++;
        long var2 = 0L;
        if (arg1 > -121) {
            method520(27);
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1006++;
        if (arg5 != -28301) {
            field999 = 22;
        }
        if (arg4 == 1) {
            if (arg6 == arg7 && arg0 == arg2) {
                return true;
            }
        } else if (arg6 >= arg7 && arg4 + arg7 - 1 >= arg6 && arg0 <= arg0 && (arg4 + arg0 - 1) >= arg0) {
            return true;
        }
        int var9 = arg7 - this.field993;
        int var10 = arg2 - this.field1009;
        int var11 = arg0 - this.field1009;
        int var12 = arg6 - this.field993;
        if (arg4 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field1016[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field1016[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field1016[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field1016[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field1016[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field1016[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field1016[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field1016[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field1016[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field1016[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field1016[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field1016[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var9 - 1;
            int var14 = arg4 + var10 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14 && (this.field1016[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 - arg4 == var10 && (this.field1016[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - arg4 == var9 && var11 >= var10 && var14 >= var11 && (this.field1016[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 - arg4 == var10 && (this.field1016[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - arg4) == var9 && var11 >= var10 && var11 <= var14 && (this.field1016[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 + 1 == var10 && (this.field1016[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 + 1 == var9 && var11 >= var10 && var14 >= var11 && (this.field1016[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10 && (this.field1016[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10 && (this.field1016[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var9 && var12 <= var13 && (var11 - arg4) == var10 && (this.field1016[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg4 == var9 && var11 >= var10 && var14 >= var11 && (this.field1016[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 >= var10 && var14 >= var11 && (this.field1016[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZIIIII)V")
    public final void method529(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field996++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field993;
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var10 = arg5 - this.field1009;
        for (int var11 = var9; var11 < arg3 + var9; var11++) {
            if (var11 >= 0 && this.field1013 > var11) {
                for (int var12 = var10; var12 < (arg6 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field995) {
                        this.method521(var12, -14850, var11, var8);
                    }
                }
            }
        }
        if (arg2 >= -10) {
            this.field1013 = 78;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIBIIII)Z")
    public final boolean method530(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field1001++;
        if (arg5 > 1) {
            return class204.method1329(arg0, false, arg1, arg7, arg5, arg5, arg3, arg6, arg8) ? true : this.method526(arg1, (byte) -113, arg5, arg6, arg0, arg8, arg7, arg3, arg2, arg5);
        }
        int var10 = arg6 + arg0 - 1;
        int var11 = arg1 + arg8 - 1;
        if (arg6 <= arg3 && arg3 <= var10 && arg8 <= arg7 && arg7 <= var11) {
            return true;
        }
        if (arg4 != -113) {
            this.method518(113, 1, (byte) 44);
        }
        if ((arg6 - 1) == arg3 && arg7 >= arg8 && arg7 <= var11 && (this.field1016[arg3 - this.field993][arg7 - this.field1009] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg3 && arg7 >= arg8 && arg7 <= var11 && (this.field1016[arg3 - this.field993][arg7 - this.field1009] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg7 && arg3 >= arg6 && arg3 <= var10 && (this.field1016[arg3 - this.field993][arg7 - this.field1009] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg7 && arg6 <= arg3 && var10 >= arg3 && (this.field1016[arg3 - this.field993][arg7 - this.field1009] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIII)V")
    private final void method531(boolean arg0, int arg1, int arg2, int arg3) {
        field997++;
        if (!arg0) {
            this.method524(-58, 89, -51, true, -72, true, 24, -74);
        }
        this.field1016[arg2][arg1] = class387.method2454(this.field1016[arg2][arg1], ~arg3);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public final void method532(byte arg0) {
        if (arg0 != -95) {
            method520(27);
        }
        field1015++;
        for (int var2 = 0; var2 < this.field1013; var2++) {
            for (int var3 = 0; var3 < this.field995; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1013 - 5 || (this.field995 - 5) <= var3) {
                    this.field1016[var2][var3] = -1;
                } else {
                    this.field1016[var2][var3] = 2097152;
                }
            }
        }
    }
}
