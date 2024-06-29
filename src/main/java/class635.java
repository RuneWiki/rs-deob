import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class635 {

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Llc;")
    public static class435 field8954 = new class435(47, 2);

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Llc;")
    public static class435 field8965 = new class435(96, -2);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public int field8950;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public int field8955;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public int field8961;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public int field8968;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[[I")
    public int[][] field8956;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBZZII)V")
    public final void method3635(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field8957++;
        int var8 = arg0 - this.field8968;
        int var9 = arg5 - this.field8950;
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method3645(128, var8, (byte) 124, var9);
                this.method3645(8, var8, (byte) 127, var9 - 1);
            }
            if (arg6 == 1) {
                this.method3645(2, var8, (byte) 123, var9);
                this.method3645(32, var8 + 1, (byte) 124, var9);
            }
            if (arg6 == 2) {
                this.method3645(8, var8, (byte) 122, var9);
                this.method3645(128, var8, (byte) 124, var9 + 1);
            }
            if (arg6 == 3) {
                this.method3645(32, var8, (byte) 123, var9);
                this.method3645(2, var8 - 1, (byte) 122, var9);
            }
        }
        if (arg2 < 44) {
            this.field8961 = -104;
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method3645(1, var8, (byte) 127, var9);
                this.method3645(16, var8 + 1, (byte) 124, var9 - 1);
            }
            if (arg6 == 1) {
                this.method3645(4, var8, (byte) 123, var9);
                this.method3645(64, var8 + 1, (byte) 124, var9 + 1);
            }
            if (arg6 == 2) {
                this.method3645(16, var8, (byte) 123, var9);
                this.method3645(1, var8 - 1, (byte) 123, var9 + 1);
            }
            if (arg6 == 3) {
                this.method3645(64, var8, (byte) 126, var9);
                this.method3645(4, var8 - 1, (byte) 125, var9 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg6 == 0) {
                this.method3645(130, var8, (byte) 126, var9);
                this.method3645(8, var8, (byte) 127, var9 - 1);
                this.method3645(32, var8 + 1, (byte) 126, var9);
            }
            if (arg6 == 1) {
                this.method3645(10, var8, (byte) 126, var9);
                this.method3645(32, var8 + 1, (byte) 124, var9);
                this.method3645(128, var8, (byte) 127, var9 + 1);
            }
            if (arg6 == 2) {
                this.method3645(40, var8, (byte) 125, var9);
                this.method3645(128, var8, (byte) 126, var9 + 1);
                this.method3645(2, var8 - 1, (byte) 122, var9);
            }
            if (arg6 == 3) {
                this.method3645(160, var8, (byte) 122, var9);
                this.method3645(2, var8 - 1, (byte) 124, var9);
                this.method3645(8, var8, (byte) 125, var9 - 1);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg6 == 0) {
                    this.method3645(65536, var8, (byte) 126, var9);
                    this.method3645(4096, var8, (byte) 124, var9 - 1);
                }
                if (arg6 == 1) {
                    this.method3645(1024, var8, (byte) 122, var9);
                    this.method3645(16384, var8 + 1, (byte) 122, var9);
                }
                if (arg6 == 2) {
                    this.method3645(4096, var8, (byte) 122, var9);
                    this.method3645(65536, var8, (byte) 125, var9 + 1);
                }
                if (arg6 == 3) {
                    this.method3645(16384, var8, (byte) 122, var9);
                    this.method3645(1024, var8 - 1, (byte) 123, var9);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg6 == 0) {
                    this.method3645(512, var8, (byte) 125, var9);
                    this.method3645(8192, var8 + 1, (byte) 123, var9 - 1);
                }
                if (arg6 == 1) {
                    this.method3645(2048, var8, (byte) 127, var9);
                    this.method3645(32768, var8 + 1, (byte) 122, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method3645(8192, var8, (byte) 125, var9);
                    this.method3645(512, var8 - 1, (byte) 124, var9 + 1);
                }
                if (arg6 == 3) {
                    this.method3645(32768, var8, (byte) 122, var9);
                    this.method3645(2048, var8 - 1, (byte) 123, var9 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg6 == 0) {
                    this.method3645(66560, var8, (byte) 127, var9);
                    this.method3645(4096, var8, (byte) 124, var9 - 1);
                    this.method3645(16384, var8 + 1, (byte) 124, var9);
                }
                if (arg6 == 1) {
                    this.method3645(5120, var8, (byte) 127, var9);
                    this.method3645(16384, var8 + 1, (byte) 125, var9);
                    this.method3645(65536, var8, (byte) 127, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method3645(20480, var8, (byte) 126, var9);
                    this.method3645(65536, var8, (byte) 122, var9 + 1);
                    this.method3645(1024, var8 - 1, (byte) 125, var9);
                }
                if (arg6 == 3) {
                    this.method3645(81920, var8, (byte) 122, var9);
                    this.method3645(1024, var8 - 1, (byte) 122, var9);
                    this.method3645(4096, var8, (byte) 123, var9 - 1);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method3645(536870912, var8, (byte) 124, var9);
                this.method3645(33554432, var8, (byte) 122, var9 - 1);
            }
            if (arg6 == 1) {
                this.method3645(8388608, var8, (byte) 127, var9);
                this.method3645(134217728, var8 + 1, (byte) 126, var9);
            }
            if (arg6 == 2) {
                this.method3645(33554432, var8, (byte) 123, var9);
                this.method3645(536870912, var8, (byte) 127, var9 + 1);
            }
            if (arg6 == 3) {
                this.method3645(134217728, var8, (byte) 122, var9);
                this.method3645(8388608, var8 - 1, (byte) 122, var9);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method3645(4194304, var8, (byte) 123, var9);
                this.method3645(67108864, var8 + 1, (byte) 124, var9 - 1);
            }
            if (arg6 == 1) {
                this.method3645(16777216, var8, (byte) 126, var9);
                this.method3645(268435456, var8 + 1, (byte) 124, var9 + 1);
            }
            if (arg6 == 2) {
                this.method3645(67108864, var8, (byte) 123, var9);
                this.method3645(4194304, var8 - 1, (byte) 122, var9 + 1);
            }
            if (arg6 == 3) {
                this.method3645(268435456, var8, (byte) 123, var9);
                this.method3645(16777216, var8 - 1, (byte) 122, var9 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method3645(545259520, var8, (byte) 127, var9);
            this.method3645(33554432, var8, (byte) 125, var9 - 1);
            this.method3645(134217728, var8 + 1, (byte) 127, var9);
        }
        if (arg6 == 1) {
            this.method3645(41943040, var8, (byte) 122, var9);
            this.method3645(134217728, var8 + 1, (byte) 126, var9);
            this.method3645(536870912, var8, (byte) 126, var9 + 1);
        }
        if (arg6 == 2) {
            this.method3645(167772160, var8, (byte) 127, var9);
            this.method3645(536870912, var8, (byte) 125, var9 + 1);
            this.method3645(8388608, var8 - 1, (byte) 122, var9);
        }
        if (arg6 == 3) {
            this.method3645(671088640, var8, (byte) 127, var9);
            this.method3645(8388608, var8 - 1, (byte) 124, var9);
            this.method3645(33554432, var8, (byte) 123, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIZIII)Z")
    public final boolean method3636(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field8967++;
        if (arg4 > 1) {
            return class176.method1270(arg2, 0, arg4, arg6, arg4, arg0, arg8, arg3, arg1) ? true : this.method3640(arg4, arg7, arg4, 2, arg0, arg6, arg1, arg3, arg8, arg2);
        }
        int var10 = arg2 + arg6 - 1;
        int var11 = arg8 + arg0 - 1;
        if (arg2 <= arg1 && var10 >= arg1 && arg3 >= arg0 && arg3 <= var11) {
            return true;
        } else if ((arg2 - 1) == arg1 && arg3 >= arg0 && arg3 <= var11 && (this.field8956[arg1 - this.field8950][arg3 - this.field8968] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg1 && arg3 >= arg0 && var11 >= arg3 && (this.field8956[arg1 - this.field8950][arg3 - this.field8968] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg3 && arg2 <= arg1 && var10 >= arg1 && (this.field8956[arg1 - this.field8950][arg3 - this.field8968] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            if (!arg5) {
                this.method3649(51, -52, (byte) -19, 67);
            }
            return var11 + 1 == arg3 && arg1 >= arg2 && var10 >= arg1 && (this.field8956[arg1 - this.field8950][arg3 - this.field8968] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method3637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8952++;
        if (arg5 == 1) {
            if (arg1 == arg2 && arg3 == arg4) {
                return true;
            }
        } else if (arg1 >= arg2 && arg1 <= arg2 + arg5 - 1 && arg3 <= arg3 && (arg3 + arg5 - 1) >= arg3) {
            return true;
        }
        if (arg6 > -108) {
            return true;
        }
        int var9 = arg2 - this.field8950;
        int var10 = arg3 - this.field8968;
        int var11 = arg4 - this.field8968;
        int var12 = arg1 - this.field8950;
        if (arg5 == 1) {
            if (arg0 == 0) {
                if (arg7 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field8956[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field8956[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field8956[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field8956[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field8956[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field8956[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field8956[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field8956[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field8956[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field8956[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field8956[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg5 - 1;
            int var14 = var11 + arg5 - 1;
            if (arg0 == 0) {
                if (arg7 == 0) {
                    if (var12 - arg5 == var9 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var10 + 1) == var11 && (this.field8956[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var10 - arg5) == var11 && (this.field8956[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 <= var12 && var13 >= var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var12 - arg5) == var9 && var10 >= var11 && var14 >= var10 && (this.field8956[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 >= var11 && var10 <= var14 && (this.field8956[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 + 1) == var9 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var10 + 1 == var11 && (this.field8956[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var10 - arg5) == var11 && (this.field8956[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 <= var12 && var12 <= var13 && (var10 - arg5) == var11) {
                        return true;
                    }
                    if ((var12 - arg5) == var9 && var10 >= var11 && var14 >= var10 && (this.field8956[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field8956[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 0) {
                    if (var12 - arg5 == var9 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field8956[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg5 == var11 && (this.field8956[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var12 - arg5 == var9 && var11 <= var10 && var10 <= var14 && (this.field8956[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var10 - arg5 == var11 && (this.field8956[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var12 - arg5 == var9 && var10 >= var11 && var14 >= var10 && (this.field8956[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var10 + 1 == var11 && (this.field8956[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg5 == var11) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var12 - arg5) == var9 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var10 + 1 == var11 && (this.field8956[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field8956[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var10 - arg5) == var11) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 <= var12 && var12 <= var13 && var10 + 1 == var11 && (this.field8956[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 >= var9 && var12 <= var13 && var10 - arg5 == var11 && (this.field8956[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var12 - arg5) == var9 && var11 <= var10 && var10 <= var14 && (this.field8956[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 <= var10 && var14 >= var10 && (this.field8956[var9][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIIIIZI)V")
    public final void method3638(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg2 != 3) {
            this.field8968 = -16;
        }
        field8966++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var10 = arg3 - this.field8950;
        int var11 = arg4 - this.field8968;
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg7;
            arg7 = arg0;
            arg0 = var12;
        }
        for (int var13 = var10; var13 < (arg7 + var10); var13++) {
            if (var13 >= 0 && var13 < this.field8955) {
                for (int var14 = var11; var14 < arg0 + var11; var14++) {
                    if (var14 >= 0 && this.field8961 > var14) {
                        this.method3645(var9, var14, (byte) 125, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
    public final void method3639(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field8968;
        field8969++;
        int var5 = arg1 - this.field8950;
        this.field8956[var5][var4] = class368.method2314(this.field8956[var5][var4], -262145);
        if (arg2 <= 28) {
            this.field8950 = -94;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method3640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8962++;
        int var11 = arg0 + arg6;
        if (arg3 != 2) {
            this.method3642(125, 16, -93);
        }
        int var12 = arg7 + arg2;
        int var13 = arg5 + arg9;
        int var14 = arg4 + arg8;
        if (arg6 == var13 && (arg1 & 0x2) == 0) {
            int var15 = arg7 <= arg4 ? arg4 : arg7;
            int var16 = var12 < var14 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field8956[var13 - this.field8950 - 1][var15 - this.field8968] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg1 & 0x8) == 0) {
            int var17 = arg4 >= arg7 ? arg4 : arg7;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field8956[arg9 - this.field8950][var17 - this.field8968] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg1 & 0x1) == 0) {
            int var19 = arg9 >= arg6 ? arg9 : arg6;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field8956[var19 - this.field8950][var14 - this.field8968 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg1 & 0x4) == 0) {
            int var21 = arg9 >= arg6 ? arg9 : arg6;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field8956[var21 - this.field8950][arg4 - this.field8968] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method3641(int arg0) {
        field8965 = null;
        if (arg0 != -2) {
            field8965 = null;
        }
        field8954 = null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
    public final void method3642(int arg0, int arg1, int arg2) {
        field8958++;
        int var4 = arg2 - this.field8950;
        int var5 = arg0 - this.field8968;
        this.field8956[var4][var5] = class368.method2314(this.field8956[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(III)V")
    public final void method3643(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field8968;
        field8970++;
        int var5 = arg0 - this.field8950;
        this.field8956[var5][var4] = class430.method2658(this.field8956[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZZIIIZ)V")
    public final void method3644(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8951++;
        int var8 = arg4 - this.field8950;
        int var9 = arg0 - this.field8968;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method3649(var8, 128, (byte) 102, var9);
                this.method3649(var8 - 1, 8, (byte) -63, var9);
            }
            if (arg3 == 1) {
                this.method3649(var8, 2, (byte) 126, var9);
                this.method3649(var8, 32, (byte) -87, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3649(var8, 8, (byte) 97, var9);
                this.method3649(var8 + 1, 128, (byte) 77, var9);
            }
            if (arg3 == 3) {
                this.method3649(var8, 32, (byte) 87, var9);
                this.method3649(var8, 2, (byte) -92, var9 - 1);
            }
        }
        if (!arg6) {
            return;
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method3649(var8, 1, (byte) -91, var9);
                this.method3649(var8 - 1, 16, (byte) -74, var9 + 1);
            }
            if (arg3 == 1) {
                this.method3649(var8, 4, (byte) -71, var9);
                this.method3649(var8 + 1, 64, (byte) -48, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3649(var8, 16, (byte) 93, var9);
                this.method3649(var8 + 1, 1, (byte) -118, var9 - 1);
            }
            if (arg3 == 3) {
                this.method3649(var8, 64, (byte) 96, var9);
                this.method3649(var8 - 1, 4, (byte) 83, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method3649(var8, 130, (byte) -100, var9);
                this.method3649(var8 - 1, 8, (byte) 98, var9);
                this.method3649(var8, 32, (byte) -50, var9 + 1);
            }
            if (arg3 == 1) {
                this.method3649(var8, 10, (byte) 112, var9);
                this.method3649(var8, 32, (byte) -78, var9 + 1);
                this.method3649(var8 + 1, 128, (byte) 87, var9);
            }
            if (arg3 == 2) {
                this.method3649(var8, 40, (byte) 84, var9);
                this.method3649(var8 + 1, 128, (byte) -110, var9);
                this.method3649(var8, 2, (byte) 119, var9 - 1);
            }
            if (arg3 == 3) {
                this.method3649(var8, 160, (byte) -52, var9);
                this.method3649(var8, 2, (byte) 119, var9 - 1);
                this.method3649(var8 - 1, 8, (byte) -90, var9);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method3649(var8, 65536, (byte) -55, var9);
                    this.method3649(var8 - 1, 4096, (byte) -87, var9);
                }
                if (arg3 == 1) {
                    this.method3649(var8, 1024, (byte) -76, var9);
                    this.method3649(var8, 16384, (byte) -106, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method3649(var8, 4096, (byte) 98, var9);
                    this.method3649(var8 + 1, 65536, (byte) -117, var9);
                }
                if (arg3 == 3) {
                    this.method3649(var8, 16384, (byte) 99, var9);
                    this.method3649(var8, 1024, (byte) 93, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method3649(var8, 512, (byte) 126, var9);
                    this.method3649(var8 - 1, 8192, (byte) 124, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method3649(var8, 2048, (byte) 79, var9);
                    this.method3649(var8 + 1, 32768, (byte) 75, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method3649(var8, 8192, (byte) -73, var9);
                    this.method3649(var8 + 1, 512, (byte) -117, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method3649(var8, 32768, (byte) -127, var9);
                    this.method3649(var8 - 1, 2048, (byte) 84, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method3649(var8, 66560, (byte) -51, var9);
                    this.method3649(var8 - 1, 4096, (byte) -93, var9);
                    this.method3649(var8, 16384, (byte) -47, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method3649(var8, 5120, (byte) -89, var9);
                    this.method3649(var8, 16384, (byte) -63, var9 + 1);
                    this.method3649(var8 + 1, 65536, (byte) 126, var9);
                }
                if (arg3 == 2) {
                    this.method3649(var8, 20480, (byte) 116, var9);
                    this.method3649(var8 + 1, 65536, (byte) 103, var9);
                    this.method3649(var8, 1024, (byte) -77, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method3649(var8, 81920, (byte) 113, var9);
                    this.method3649(var8, 1024, (byte) -96, var9 - 1);
                    this.method3649(var8 - 1, 4096, (byte) -117, var9);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method3649(var8, 536870912, (byte) 114, var9);
                this.method3649(var8 - 1, 33554432, (byte) -122, var9);
            }
            if (arg3 == 1) {
                this.method3649(var8, 8388608, (byte) 111, var9);
                this.method3649(var8, 134217728, (byte) -74, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3649(var8, 33554432, (byte) -88, var9);
                this.method3649(var8 + 1, 536870912, (byte) -122, var9);
            }
            if (arg3 == 3) {
                this.method3649(var8, 134217728, (byte) -125, var9);
                this.method3649(var8, 8388608, (byte) 100, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method3649(var8, 4194304, (byte) -115, var9);
                this.method3649(var8 - 1, 67108864, (byte) -91, var9 + 1);
            }
            if (arg3 == 1) {
                this.method3649(var8, 16777216, (byte) 125, var9);
                this.method3649(var8 + 1, 268435456, (byte) 102, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3649(var8, 67108864, (byte) 109, var9);
                this.method3649(var8 + 1, 4194304, (byte) 107, var9 - 1);
            }
            if (arg3 == 3) {
                this.method3649(var8, 268435456, (byte) 79, var9);
                this.method3649(var8 - 1, 16777216, (byte) 92, var9 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3649(var8, 545259520, (byte) 91, var9);
            this.method3649(var8 - 1, 33554432, (byte) -55, var9);
            this.method3649(var8, 134217728, (byte) 94, var9 + 1);
        }
        if (arg3 == 1) {
            this.method3649(var8, 41943040, (byte) 85, var9);
            this.method3649(var8, 134217728, (byte) -63, var9 + 1);
            this.method3649(var8 + 1, 536870912, (byte) -94, var9);
        }
        if (arg3 == 2) {
            this.method3649(var8, 167772160, (byte) -118, var9);
            this.method3649(var8 + 1, 536870912, (byte) 90, var9);
            this.method3649(var8, 8388608, (byte) -94, var9 - 1);
        }
        if (arg3 == 3) {
            this.method3649(var8, 671088640, (byte) 75, var9);
            this.method3649(var8, 8388608, (byte) -128, var9 - 1);
            this.method3649(var8 - 1, 33554432, (byte) -69, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBI)V")
    private final void method3645(int arg0, int arg1, byte arg2, int arg3) {
        this.field8956[arg3][arg1] = class368.method2314(this.field8956[arg3][arg1], ~arg0);
        if (arg2 < 121) {
            this.method3636(-22, -64, 1, -40, 29, true, 103, -80, 68);
        }
        field8960++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILqk;)V")
    public static final void method3646(int arg0, class146 arg1) {
        field8949++;
        class146 var2 = class743.method4139(arg1, (byte) 126);
        if (arg0 != 2) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class68.field1042;
            var4 = class565.field8187;
        } else {
            var4 = var2.field1997;
            var3 = var2.field2016;
        }
        class314.method1938(arg1, var3, var4, false, (byte) -91);
        class398.method2414(arg1, var4, (byte) -109, var3);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method3647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8959++;
        if (arg6 == 1) {
            if (arg2 == arg5 && arg0 == arg4) {
                return true;
            }
        } else if (arg2 >= arg5 && arg2 <= arg5 + arg6 - 1 && arg0 >= arg0 && arg0 + arg6 - 1 >= arg0) {
            return true;
        }
        int var9 = arg4 - this.field8968;
        int var10 = arg0 - this.field8968;
        int var11 = arg2 - this.field8950;
        int var12 = arg5 - this.field8950;
        if (arg7 >= -75) {
            method3646(47, null);
        }
        if (arg6 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field8956[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field8956[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field8956[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field8956[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field8956[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field8956[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field8956[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field8956[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field8956[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field8956[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var12 && var9 == var10 && (this.field8956[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field8956[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var12 - 1;
            int var14 = var9 + arg6 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field8956[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 - arg6) == var9 && (this.field8956[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - arg6) == var12 && var9 <= var10 && var10 <= var14 && (this.field8956[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 - arg6) == var9 && (this.field8956[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - arg6 == var12 && var9 <= var10 && var14 >= var10 && (this.field8956[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field8956[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var11 + 1) == var12 && var9 <= var10 && var14 >= var10 && (this.field8956[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var10 + 1) == var9 && (this.field8956[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var12 <= var11 && var13 >= var11 && (var10 + 1) == var9 && (this.field8956[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var11 && var11 <= var13 && (var10 - arg6) == var9 && (this.field8956[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg6) == var12 && var9 <= var10 && var10 <= var14 && (this.field8956[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field8956[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIIZBI)V")
    public final void method3648(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        field8964++;
        int var8 = 256;
        if (arg5 <= 111) {
            return;
        }
        if (arg0) {
            var8 |= 0x20000;
        }
        int var9 = arg6 - this.field8950;
        if (arg4) {
            var8 |= 0x40000000;
        }
        int var10 = arg3 - this.field8968;
        for (int var11 = var9; var11 < arg2 + var9; var11++) {
            if (var11 >= 0 && this.field8955 > var11) {
                for (int var12 = var10; var12 < (var10 + arg1); var12++) {
                    if (var12 >= 0 && this.field8961 > var12) {
                        this.method3649(var11, var8, (byte) 119, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIBI)V")
    private final void method3649(int arg0, int arg1, byte arg2, int arg3) {
        field8948++;
        int var5 = -88 / ((13 - arg2) / 60);
        this.field8956[arg0][arg3] = class430.method2658(this.field8956[arg0][arg3], arg1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public final void method3650(byte arg0) {
        int var2 = 0;
        if (arg0 >= -15) {
            this.field8968 = 104;
        }
        while (var2 < this.field8955) {
            for (int var3 = 0; var3 < this.field8961; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field8955 - 5) || this.field8961 - 5 <= var3) {
                    this.field8956[var2][var3] = -1;
                } else {
                    this.field8956[var2][var3] = 2097152;
                }
            }
            var2++;
        }
        field8953++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)V")
    public final void method3651(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field8950;
        field8971++;
        int var5 = arg2 - this.field8968;
        if (arg1 >= 26) {
            this.field8956[var4][var5] = class430.method2658(this.field8956[var4][var5], 2097152);
        }
    }
}
