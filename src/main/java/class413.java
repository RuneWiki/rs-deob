import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class413 {

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Luf;")
    public static class310 field6057 = new class310(20, -1);

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Luf;")
    public static class310 field6068 = new class310(57, 2);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public int field6051;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public int field6053;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field6063;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public int field6064;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[[I")
    public int[][] field6067;

    static {
        new class83("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        new class83("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIZII)V", line = 3)
    public final void method2461(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg1 - this.field6053;
        field6062++;
        if (arg2 != -7856) {
            this.field6053 = 8;
        }
        int var9 = arg6 - this.field6063;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method2469(var8, 128, (byte) -40, var9);
                this.method2469(var8 - 1, 8, (byte) -40, var9);
            }
            if (arg3 == 1) {
                this.method2469(var8, 2, (byte) -40, var9);
                this.method2469(var8, 32, (byte) -40, var9 + 1);
            }
            if (arg3 == 2) {
                this.method2469(var8, 8, (byte) -40, var9);
                this.method2469(var8 + 1, 128, (byte) -40, var9);
            }
            if (arg3 == 3) {
                this.method2469(var8, 32, (byte) -40, var9);
                this.method2469(var8, 2, (byte) -40, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method2469(var8, 1, (byte) -40, var9);
                this.method2469(var8 - 1, 16, (byte) -40, var9 + 1);
            }
            if (arg3 == 1) {
                this.method2469(var8, 4, (byte) -40, var9);
                this.method2469(var8 + 1, 64, (byte) -40, var9 + 1);
            }
            if (arg3 == 2) {
                this.method2469(var8, 16, (byte) -40, var9);
                this.method2469(var8 + 1, 1, (byte) -40, var9 - 1);
            }
            if (arg3 == 3) {
                this.method2469(var8, 64, (byte) -40, var9);
                this.method2469(var8 - 1, 4, (byte) -40, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method2469(var8, 130, (byte) -40, var9);
                this.method2469(var8 - 1, 8, (byte) -40, var9);
                this.method2469(var8, 32, (byte) -40, var9 + 1);
            }
            if (arg3 == 1) {
                this.method2469(var8, 10, (byte) -40, var9);
                this.method2469(var8, 32, (byte) -40, var9 + 1);
                this.method2469(var8 + 1, 128, (byte) -40, var9);
            }
            if (arg3 == 2) {
                this.method2469(var8, 40, (byte) -40, var9);
                this.method2469(var8 + 1, 128, (byte) -40, var9);
                this.method2469(var8, 2, (byte) -40, var9 - 1);
            }
            if (arg3 == 3) {
                this.method2469(var8, 160, (byte) -40, var9);
                this.method2469(var8, 2, (byte) -40, var9 - 1);
                this.method2469(var8 - 1, 8, (byte) -40, var9);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method2469(var8, 65536, (byte) -40, var9);
                    this.method2469(var8 - 1, 4096, (byte) -40, var9);
                }
                if (arg3 == 1) {
                    this.method2469(var8, 1024, (byte) -40, var9);
                    this.method2469(var8, 16384, (byte) -40, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method2469(var8, 4096, (byte) -40, var9);
                    this.method2469(var8 + 1, 65536, (byte) -40, var9);
                }
                if (arg3 == 3) {
                    this.method2469(var8, 16384, (byte) -40, var9);
                    this.method2469(var8, 1024, (byte) -40, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method2469(var8, 512, (byte) -40, var9);
                    this.method2469(var8 - 1, 8192, (byte) -40, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method2469(var8, 2048, (byte) -40, var9);
                    this.method2469(var8 + 1, 32768, (byte) -40, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method2469(var8, 8192, (byte) -40, var9);
                    this.method2469(var8 + 1, 512, (byte) -40, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method2469(var8, 32768, (byte) -40, var9);
                    this.method2469(var8 - 1, 2048, (byte) -40, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method2469(var8, 66560, (byte) -40, var9);
                    this.method2469(var8 - 1, 4096, (byte) -40, var9);
                    this.method2469(var8, 16384, (byte) -40, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method2469(var8, 5120, (byte) -40, var9);
                    this.method2469(var8, 16384, (byte) -40, var9 + 1);
                    this.method2469(var8 + 1, 65536, (byte) -40, var9);
                }
                if (arg3 == 2) {
                    this.method2469(var8, 20480, (byte) -40, var9);
                    this.method2469(var8 + 1, 65536, (byte) -40, var9);
                    this.method2469(var8, 1024, (byte) -40, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method2469(var8, 81920, (byte) -40, var9);
                    this.method2469(var8, 1024, (byte) -40, var9 - 1);
                    this.method2469(var8 - 1, 4096, (byte) -40, var9);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method2469(var8, 536870912, (byte) -40, var9);
                this.method2469(var8 - 1, 33554432, (byte) -40, var9);
            }
            if (arg3 == 1) {
                this.method2469(var8, 8388608, (byte) -40, var9);
                this.method2469(var8, 134217728, (byte) -40, var9 + 1);
            }
            if (arg3 == 2) {
                this.method2469(var8, 33554432, (byte) -40, var9);
                this.method2469(var8 + 1, 536870912, (byte) -40, var9);
            }
            if (arg3 == 3) {
                this.method2469(var8, 134217728, (byte) -40, var9);
                this.method2469(var8, 8388608, (byte) -40, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method2469(var8, 4194304, (byte) -40, var9);
                this.method2469(var8 - 1, 67108864, (byte) -40, var9 + 1);
            }
            if (arg3 == 1) {
                this.method2469(var8, 16777216, (byte) -40, var9);
                this.method2469(var8 + 1, 268435456, (byte) -40, var9 + 1);
            }
            if (arg3 == 2) {
                this.method2469(var8, 67108864, (byte) -40, var9);
                this.method2469(var8 + 1, 4194304, (byte) -40, var9 - 1);
            }
            if (arg3 == 3) {
                this.method2469(var8, 268435456, (byte) -40, var9);
                this.method2469(var8 - 1, 16777216, (byte) -40, var9 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2469(var8, 545259520, (byte) -40, var9);
            this.method2469(var8 - 1, 33554432, (byte) -40, var9);
            this.method2469(var8, 134217728, (byte) -40, var9 + 1);
        }
        if (arg3 == 1) {
            this.method2469(var8, 41943040, (byte) -40, var9);
            this.method2469(var8, 134217728, (byte) -40, var9 + 1);
            this.method2469(var8 + 1, 536870912, (byte) -40, var9);
        }
        if (arg3 == 2) {
            this.method2469(var8, 167772160, (byte) -40, var9);
            this.method2469(var8 + 1, 536870912, (byte) -40, var9);
            this.method2469(var8, 8388608, (byte) -40, var9 - 1);
        }
        if (arg3 == 3) {
            this.method2469(var8, 671088640, (byte) -40, var9);
            this.method2469(var8, 8388608, (byte) -40, var9 - 1);
            this.method2469(var8 - 1, 33554432, (byte) -40, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIIZ)V", line = 315)
    public static final void method2462(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 <= 103) {
            method2462(96, false, 12, -75, false);
        }
        field6070++;
        class504.method2964(arg1, arg2, (byte) -50, class1.field10.length - 1, arg4, 0, arg0);
        class97.field1337 = 0;
        class367.field5150 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)Z", line = 328)
    public final boolean method2463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6072++;
        if (arg3 != -29353) {
            return false;
        }
        if (arg6 == 1) {
            if (arg2 == arg7 && arg0 == arg5) {
                return true;
            }
        } else if (arg2 <= arg7 && arg6 + arg2 - 1 >= arg7 && arg0 >= arg0 && arg0 <= arg0 + arg6 - 1) {
            return true;
        }
        int var9 = arg0 - this.field6063;
        int var10 = arg5 - this.field6063;
        int var11 = arg2 - this.field6053;
        int var12 = arg7 - this.field6053;
        if (arg6 == 1) {
            if (arg4 == 0) {
                if (arg1 == 0) {
                    if (var12 - 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field6067[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field6067[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field6067[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field6067[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field6067[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field6067[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field6067[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field6067[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field6067[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field6067[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var11 - 1;
            int var14 = arg6 + var10 - 1;
            if (arg4 == 0) {
                if (arg1 == 0) {
                    if ((var12 - arg6) == var11 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var9 + 1) == var10 && (this.field6067[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var9 - arg6) == var10 && (this.field6067[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 <= var12 && var12 <= var13 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var12 - arg6) == var11 && var10 <= var9 && var9 <= var14 && (this.field6067[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var14 && (this.field6067[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 + 1) == var11 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var9 + 1) == var10 && (this.field6067[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var9 - arg6 == var10 && (this.field6067[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 <= var12 && var12 <= var13 && (var9 - arg6) == var10) {
                        return true;
                    }
                    if ((var12 - arg6) == var11 && var10 <= var9 && var9 <= var14 && (this.field6067[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 >= var10 && var9 <= var14 && (this.field6067[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    if (var12 - arg6 == var11 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 <= var9 && var14 >= var9 && (this.field6067[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var9 - arg6) == var10 && (this.field6067[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var12 - arg6) == var11 && var9 >= var10 && var9 <= var14 && (this.field6067[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var9 - arg6 == var10 && (this.field6067[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - arg6) == var11 && var9 >= var10 && var9 <= var14 && (this.field6067[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 + 1 == var10 && (this.field6067[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var9 - arg6) == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 - arg6 == var11 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 + 1 == var10 && (this.field6067[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var14 && (this.field6067[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var9 - arg6 == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 <= var12 && var13 >= var12 && (var9 + 1) == var10 && (this.field6067[var12][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var12 && var13 >= var12 && var9 - arg6 == var10 && (this.field6067[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var12 - arg6) == var11 && var9 >= var10 && var14 >= var9 && (this.field6067[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var10 <= var9 && var14 >= var9 && (this.field6067[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V", line = 697)
    public static void method2464(boolean arg0) {
        field6068 = null;
        if (!arg0) {
            field6057 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIZIII)V", line = 708)
    public final void method2465(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 2883872) {
            return;
        }
        field6058++;
        int var9 = 256;
        if (arg4) {
            var9 |= 0x20000;
        }
        if (arg0) {
            var9 |= 0x40000000;
        }
        int var10 = arg7 - this.field6063;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg5;
            arg5 = arg2;
            arg2 = var11;
        }
        int var12 = arg6 - this.field6053;
        for (int var13 = var12; var13 < arg5 + var12; var13++) {
            if (var13 >= 0 && this.field6064 > var13) {
                for (int var14 = var10; var14 < (arg2 + var10); var14++) {
                    if (var14 >= 0 && var14 < this.field6051) {
                        this.method2469(var13, var9, (byte) -40, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V", line = 764)
    private final void method2466(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 96 % ((arg2 + 24) / 57);
        this.field6067[arg0][arg1] = class25.method183(this.field6067[arg0][arg1], arg3);
        field6055++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 777)
    public final void method2467(byte arg0) {
        field6054++;
        for (int var2 = 0; var2 < this.field6064; var2++) {
            for (int var3 = 0; var3 < this.field6051; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field6064 - 5) || this.field6051 - 5 <= var3) {
                    this.field6067[var2][var3] = -1;
                } else {
                    this.field6067[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != 69) {
            field6057 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IIIIIIII)Z", line = 812)
    public final boolean method2468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 32) {
            this.field6053 = 75;
        }
        field6060++;
        if (arg0 == 1) {
            if (arg3 == arg6 && arg1 == arg4) {
                return true;
            }
        } else if (arg3 >= arg6 && arg3 <= (arg0 + arg6 - 1) && arg4 <= arg4 && arg4 <= arg4 + arg0 - 1) {
            return true;
        }
        int var9 = arg4 - this.field6063;
        int var10 = arg1 - this.field6063;
        int var11 = arg6 - this.field6053;
        int var12 = arg3 - this.field6053;
        if (arg0 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field6067[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field6067[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field6067[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field6067[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field6067[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field6067[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 == var10 && (this.field6067[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = arg0 + var10 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var14 && (this.field6067[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var9 - arg0) == var10 && (this.field6067[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 - arg0 == var11 && var9 >= var10 && var9 <= var14 && (this.field6067[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var9 - arg0) == var10 && (this.field6067[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 - arg0 == var11 && var9 >= var10 && var14 >= var9 && (this.field6067[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var9 + 1) == var10 && (this.field6067[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 + 1 == var11 && var9 >= var10 && var14 >= var9 && (this.field6067[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var9 + 1) == var10 && (this.field6067[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 <= var12 && var13 >= var12 && var9 + 1 == var10 && (this.field6067[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var12 && var13 >= var12 && (var9 - arg0) == var10 && (this.field6067[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg0 == var11 && var9 >= var10 && var14 >= var9 && (this.field6067[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var14 && (this.field6067[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBI)V", line = 1002)
    private final void method2469(int arg0, int arg1, byte arg2, int arg3) {
        this.field6067[arg0][arg3] = class118.method750(this.field6067[arg0][arg3], ~arg1);
        field6065++;
        if (arg2 != -40) {
            this.field6051 = -98;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)V", line = 1014)
    public final void method2470(int arg0, int arg1, boolean arg2) {
        field6061++;
        int var4 = arg0 - this.field6053;
        int var5 = arg1 - this.field6063;
        if (arg2) {
            field6057 = null;
        }
        this.field6067[var4][var5] = class25.method183(this.field6067[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIIIIII)Z", line = 1028)
    public final boolean method2471(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6050++;
        if (arg7 > 1) {
            return class360.method2000(arg4, arg7, arg1, arg2, arg6, (byte) -37, arg3, arg5, arg7) ? true : this.method2476(arg2, arg7, arg6, arg8, arg4, arg7, arg1, arg3, arg5, (byte) 117);
        }
        if (!arg0) {
            this.method2475(83, -2, 60);
        }
        int var10 = arg3 + arg2 - 1;
        int var11 = arg5 + arg1 - 1;
        if (arg3 <= arg4 && var10 >= arg4 && arg6 >= arg1 && arg6 <= var11) {
            return true;
        } else if (arg3 - 1 == arg4 && arg6 >= arg1 && arg6 <= var11 && (this.field6067[arg4 - this.field6053][arg6 - this.field6063] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg6 >= arg1 && var11 >= arg6 && (this.field6067[arg4 - this.field6053][arg6 - this.field6063] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg6 && arg3 <= arg4 && var10 >= arg4 && (this.field6067[arg4 - this.field6053][arg6 - this.field6063] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg6 && arg4 >= arg3 && var10 >= arg4 && (this.field6067[arg4 - this.field6053][arg6 - this.field6063] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBIZZI)V", line = 1070)
    public final void method2472(int arg0, int arg1, byte arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg2 >= -84) {
            this.method2474(-56, -16, -75, false, false, false, -107);
        }
        int var8 = arg1 - this.field6063;
        int var9 = arg3 - this.field6053;
        field6049++;
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method2466(var9, var8, -91, 128);
                this.method2466(var9 - 1, var8, -94, 8);
            }
            if (arg0 == 1) {
                this.method2466(var9, var8, 77, 2);
                this.method2466(var9, var8 + 1, 120, 32);
            }
            if (arg0 == 2) {
                this.method2466(var9, var8, -122, 8);
                this.method2466(var9 + 1, var8, 69, 128);
            }
            if (arg0 == 3) {
                this.method2466(var9, var8, 87, 32);
                this.method2466(var9, var8 - 1, 98, 2);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method2466(var9, var8, -104, 1);
                this.method2466(var9 - 1, var8 + 1, -93, 16);
            }
            if (arg0 == 1) {
                this.method2466(var9, var8, 60, 4);
                this.method2466(var9 + 1, var8 - -1, -128, 64);
            }
            if (arg0 == 2) {
                this.method2466(var9, var8, -81, 16);
                this.method2466(var9 + 1, var8 + -1, -81, 1);
            }
            if (arg0 == 3) {
                this.method2466(var9, var8, -114, 64);
                this.method2466(var9 - 1, var8 + -1, -115, 4);
            }
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                this.method2466(var9, var8, 114, 130);
                this.method2466(var9 - 1, var8, 48, 8);
                this.method2466(var9, var8 + 1, 122, 32);
            }
            if (arg0 == 1) {
                this.method2466(var9, var8, 108, 10);
                this.method2466(var9, var8 + 1, -120, 32);
                this.method2466(var9 + 1, var8, 60, 128);
            }
            if (arg0 == 2) {
                this.method2466(var9, var8, -111, 40);
                this.method2466(var9 + 1, var8, -117, 128);
                this.method2466(var9, var8 - 1, -112, 2);
            }
            if (arg0 == 3) {
                this.method2466(var9, var8, 59, 160);
                this.method2466(var9, var8 - 1, 105, 2);
                this.method2466(var9 - 1, var8, 114, 8);
            }
        }
        if (arg5) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method2466(var9, var8, 80, 65536);
                    this.method2466(var9 - 1, var8, 122, 4096);
                }
                if (arg0 == 1) {
                    this.method2466(var9, var8, 47, 1024);
                    this.method2466(var9, var8 + 1, 107, 16384);
                }
                if (arg0 == 2) {
                    this.method2466(var9, var8, -102, 4096);
                    this.method2466(var9 + 1, var8, 40, 65536);
                }
                if (arg0 == 3) {
                    this.method2466(var9, var8, -108, 16384);
                    this.method2466(var9, var8 - 1, -127, 1024);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method2466(var9, var8, -86, 512);
                    this.method2466(var9 - 1, var8 + 1, -106, 8192);
                }
                if (arg0 == 1) {
                    this.method2466(var9, var8, 127, 2048);
                    this.method2466(var9 + 1, var8 + 1, -97, 32768);
                }
                if (arg0 == 2) {
                    this.method2466(var9, var8, -83, 8192);
                    this.method2466(var9 + 1, var8 - 1, -109, 512);
                }
                if (arg0 == 3) {
                    this.method2466(var9, var8, 38, 32768);
                    this.method2466(var9 - 1, var8 + -1, 118, 2048);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method2466(var9, var8, 62, 66560);
                    this.method2466(var9 - 1, var8, 78, 4096);
                    this.method2466(var9, var8 + 1, -98, 16384);
                }
                if (arg0 == 1) {
                    this.method2466(var9, var8, 66, 5120);
                    this.method2466(var9, var8 + 1, 104, 16384);
                    this.method2466(var9 + 1, var8, 94, 65536);
                }
                if (arg0 == 2) {
                    this.method2466(var9, var8, -92, 20480);
                    this.method2466(var9 + 1, var8, 99, 65536);
                    this.method2466(var9, var8 - 1, -109, 1024);
                }
                if (arg0 == 3) {
                    this.method2466(var9, var8, 123, 81920);
                    this.method2466(var9, var8 - 1, -82, 1024);
                    this.method2466(var9 - 1, var8, -98, 4096);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method2466(var9, var8, -120, 536870912);
                this.method2466(var9 - 1, var8, -93, 33554432);
            }
            if (arg0 == 1) {
                this.method2466(var9, var8, 75, 8388608);
                this.method2466(var9, var8 + 1, -112, 134217728);
            }
            if (arg0 == 2) {
                this.method2466(var9, var8, 75, 33554432);
                this.method2466(var9 + 1, var8, -123, 536870912);
            }
            if (arg0 == 3) {
                this.method2466(var9, var8, -128, 134217728);
                this.method2466(var9, var8 - 1, -96, 8388608);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method2466(var9, var8, 65, 4194304);
                this.method2466(var9 - 1, var8 + 1, -86, 67108864);
            }
            if (arg0 == 1) {
                this.method2466(var9, var8, 72, 16777216);
                this.method2466(var9 + 1, var8 + 1, 63, 268435456);
            }
            if (arg0 == 2) {
                this.method2466(var9, var8, 104, 67108864);
                this.method2466(var9 + 1, var8 + -1, 34, 4194304);
            }
            if (arg0 == 3) {
                this.method2466(var9, var8, 58, 268435456);
                this.method2466(var9 - 1, var8 + -1, -81, 16777216);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2466(var9, var8, 115, 545259520);
            this.method2466(var9 - 1, var8, -87, 33554432);
            this.method2466(var9, var8 + 1, 33, 134217728);
        }
        if (arg0 == 1) {
            this.method2466(var9, var8, 69, 41943040);
            this.method2466(var9, var8 + 1, 76, 134217728);
            this.method2466(var9 + 1, var8, 117, 536870912);
        }
        if (arg0 == 2) {
            this.method2466(var9, var8, 41, 167772160);
            this.method2466(var9 + 1, var8, -125, 536870912);
            this.method2466(var9, var8 - 1, 86, 8388608);
        }
        if (arg0 == 3) {
            this.method2466(var9, var8, -85, 671088640);
            this.method2466(var9, var8 - 1, 76, 8388608);
            this.method2466(var9 - 1, var8, 92, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 1375)
    public static final void method2473(int arg0, int arg1) {
        field6056++;
        class23.field379 = arg1;
        class9 var2 = class380.field5354;
        synchronized (class380.field5354) {
            class380.field5354.method67(-126);
            if (arg0 != 1) {
                method2464(false);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIZZZI)V", line = 1389)
    public final void method2474(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, int arg6) {
        field6048++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        if (arg4) {
            field6057 = null;
        }
        int var9 = arg0 - this.field6053;
        int var10 = arg1 - this.field6063;
        if (arg5) {
            var8 |= 0x40000000;
        }
        for (int var11 = var9; var11 < (arg6 + var9); var11++) {
            if (var11 >= 0 && this.field6064 > var11) {
                for (int var12 = var10; var12 < (arg2 + var10); var12++) {
                    if (var12 >= 0 && this.field6051 > var12) {
                        this.method2466(var11, var12, 96, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 1434)
    public final void method2475(int arg0, int arg1, int arg2) {
        field6059++;
        int var4 = arg2 - this.field6053;
        int var5 = arg1 - this.field6063;
        this.field6067[var4][var5] = class118.method750(this.field6067[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIIB)Z", line = 1454)
    public final boolean method2476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field6066++;
        if (arg9 != 117) {
            this.field6053 = 5;
        }
        int var11 = arg4 + arg5;
        int var12 = arg1 + arg2;
        int var13 = arg0 + arg7;
        int var14 = arg6 + arg8;
        if (arg4 == var13 && (arg3 & 0x2) == 0) {
            int var15 = arg6 >= arg2 ? arg6 : arg2;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field6067[var13 - this.field6053 - 1][var15 - this.field6063] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg6 >= arg2 ? arg6 : arg2;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field6067[arg7 - this.field6053][var17 - this.field6063] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg2 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg7 < arg4 ? arg4 : arg7;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field6067[var19 - this.field6053][var14 - this.field6063 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg6 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg7 >= arg4 ? arg7 : arg4;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field6067[var21 - this.field6053][arg6 - this.field6063] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V", line = 1557)
    public final void method2477(int arg0, int arg1, byte arg2) {
        int var4 = 104 / ((45 - arg2) / 52);
        field6052++;
        int var5 = arg0 - this.field6053;
        int var6 = arg1 - this.field6063;
        this.field6067[var5][var6] = class25.method183(this.field6067[var5][var6], 262144);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZII)V", line = 1580)
    public final void method2478(boolean arg0, int arg1, int arg2) {
        field6071++;
        int var4 = arg2 - this.field6053;
        int var5 = arg1 - this.field6063;
        this.field6067[var4][var5] = class118.method750(this.field6067[var4][var5], -262145);
        if (arg0) {
            this.method2465(false, -127, -30, -113, true, -26, -103, -105);
        }
    }
}
