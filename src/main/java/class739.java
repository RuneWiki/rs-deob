import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class739 {

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lqk;")
    public static class1 field10178 = new class1(51, 6);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public int field10176;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field10177;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field10182;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public int field10183;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field10192;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public int field10195;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public int field10196;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public static int field10197;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field10198;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field10199;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "[[I")
    public int[][] field10184;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)I")
    public static final int method4086(int arg0, byte arg1, int arg2) {
        field10179++;
        double var3 = Math.log((double) arg2) / Math.log(2.0D);
        double var5 = Math.log((double) arg0) / Math.log(2.0D);
        double var7 = var5 + (var3 - var5) * Math.random();
        return arg1 > -113 ? -16 : (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIIBI)Z")
    public final boolean method4087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 <= 68) {
            this.field10184 = null;
        }
        field10187++;
        if (arg0 == 1) {
            if (arg1 == arg3 && arg4 == arg7) {
                return true;
            }
        } else if (arg3 >= arg1 && arg0 + arg1 - 1 >= arg3 && arg7 >= arg7 && arg0 + arg7 - 1 >= arg7) {
            return true;
        }
        int var9 = arg1 - this.field10176;
        int var10 = arg4 - this.field10196;
        int var11 = arg7 - this.field10196;
        int var12 = arg3 - this.field10176;
        if (arg0 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field10184[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field10184[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field10184[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field10184[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field10184[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field10184[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field10184[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field10184[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field10184[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field10184[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field10184[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field10184[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var9 - 1;
            int var14 = var10 - (1 - arg0);
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var14 && (this.field10184[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 - arg0) == var10 && (this.field10184[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - arg0) == var9 && var10 <= var11 && var14 >= var11 && (this.field10184[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 - arg0 == var10 && (this.field10184[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - arg0) == var9 && var10 <= var11 && var11 <= var14 && (this.field10184[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 + 1) == var10 && (this.field10184[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var14 && (this.field10184[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10 && (this.field10184[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 <= var12 && var12 <= var13 && (var11 + 1) == var10 && (this.field10184[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var9 && var13 >= var12 && (var11 - arg0) == var10 && (this.field10184[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg0 == var9 && var11 >= var10 && var11 <= var14 && (this.field10184[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 >= var10 && var14 >= var11 && (this.field10184[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIBIZI)V")
    public final void method4088(int arg0, boolean arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        field10192++;
        if (arg3 != 30) {
            return;
        }
        int var8 = arg6 - this.field10196;
        int var9 = arg0 - this.field10176;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method4102(var8, (byte) 125, 128, var9);
                this.method4102(var8, (byte) 122, 8, var9 - 1);
            }
            if (arg4 == 1) {
                this.method4102(var8, (byte) 123, 2, var9);
                this.method4102(var8 + 1, (byte) 124, 32, var9);
            }
            if (arg4 == 2) {
                this.method4102(var8, (byte) -67, 8, var9);
                this.method4102(var8, (byte) -118, 128, var9 + 1);
            }
            if (arg4 == 3) {
                this.method4102(var8, (byte) 126, 32, var9);
                this.method4102(var8 - 1, (byte) -57, 2, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method4102(var8, (byte) 125, 1, var9);
                this.method4102(var8 + 1, (byte) 122, 16, var9 - 1);
            }
            if (arg4 == 1) {
                this.method4102(var8, (byte) 123, 4, var9);
                this.method4102(var8 + 1, (byte) -39, 64, var9 + 1);
            }
            if (arg4 == 2) {
                this.method4102(var8, (byte) 124, 16, var9);
                this.method4102(var8 - 1, (byte) -91, 1, var9 + 1);
            }
            if (arg4 == 3) {
                this.method4102(var8, (byte) -69, 64, var9);
                this.method4102(var8 - 1, (byte) -62, 4, var9 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method4102(var8, (byte) 126, 130, var9);
                this.method4102(var8, (byte) 123, 8, var9 - 1);
                this.method4102(var8 + 1, (byte) -103, 32, var9);
            }
            if (arg4 == 1) {
                this.method4102(var8, (byte) 9, 10, var9);
                this.method4102(var8 + 1, (byte) 4, 32, var9);
                this.method4102(var8, (byte) 127, 128, var9 + 1);
            }
            if (arg4 == 2) {
                this.method4102(var8, (byte) 121, 40, var9);
                this.method4102(var8, (byte) 123, 128, var9 + 1);
                this.method4102(var8 - 1, (byte) 123, 2, var9);
            }
            if (arg4 == 3) {
                this.method4102(var8, (byte) 8, 160, var9);
                this.method4102(var8 - 1, (byte) -127, 2, var9);
                this.method4102(var8, (byte) 127, 8, var9 - 1);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    this.method4102(var8, (byte) 124, 65536, var9);
                    this.method4102(var8, (byte) -61, 4096, var9 - 1);
                }
                if (arg4 == 1) {
                    this.method4102(var8, (byte) 123, 1024, var9);
                    this.method4102(var8 + 1, (byte) -47, 16384, var9);
                }
                if (arg4 == 2) {
                    this.method4102(var8, (byte) -25, 4096, var9);
                    this.method4102(var8, (byte) -31, 65536, var9 + 1);
                }
                if (arg4 == 3) {
                    this.method4102(var8, (byte) -117, 16384, var9);
                    this.method4102(var8 - 1, (byte) -124, 1024, var9);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg4 == 0) {
                    this.method4102(var8, (byte) 127, 512, var9);
                    this.method4102(var8 + 1, (byte) 17, 8192, var9 - 1);
                }
                if (arg4 == 1) {
                    this.method4102(var8, (byte) 121, 2048, var9);
                    this.method4102(var8 + 1, (byte) 19, 32768, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method4102(var8, (byte) 121, 8192, var9);
                    this.method4102(var8 - 1, (byte) -114, 512, var9 + 1);
                }
                if (arg4 == 3) {
                    this.method4102(var8, (byte) 125, 32768, var9);
                    this.method4102(var8 - 1, (byte) -20, 2048, var9 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    this.method4102(var8, (byte) 122, 66560, var9);
                    this.method4102(var8, (byte) 126, 4096, var9 - 1);
                    this.method4102(var8 + 1, (byte) -13, 16384, var9);
                }
                if (arg4 == 1) {
                    this.method4102(var8, (byte) -28, 5120, var9);
                    this.method4102(var8 + 1, (byte) 33, 16384, var9);
                    this.method4102(var8, (byte) -45, 65536, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method4102(var8, (byte) -118, 20480, var9);
                    this.method4102(var8, (byte) 122, 65536, var9 + 1);
                    this.method4102(var8 - 1, (byte) -88, 1024, var9);
                }
                if (arg4 == 3) {
                    this.method4102(var8, (byte) 124, 81920, var9);
                    this.method4102(var8 - 1, (byte) -67, 1024, var9);
                    this.method4102(var8, (byte) 121, 4096, var9 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method4102(var8, (byte) -10, 536870912, var9);
                this.method4102(var8, (byte) -24, 33554432, var9 - 1);
            }
            if (arg4 == 1) {
                this.method4102(var8, (byte) 33, 8388608, var9);
                this.method4102(var8 + 1, (byte) -125, 134217728, var9);
            }
            if (arg4 == 2) {
                this.method4102(var8, (byte) -70, 33554432, var9);
                this.method4102(var8, (byte) -111, 536870912, var9 + 1);
            }
            if (arg4 == 3) {
                this.method4102(var8, (byte) -97, 134217728, var9);
                this.method4102(var8 - 1, (byte) 23, 8388608, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method4102(var8, (byte) -93, 4194304, var9);
                this.method4102(var8 + 1, (byte) 123, 67108864, var9 - 1);
            }
            if (arg4 == 1) {
                this.method4102(var8, (byte) 125, 16777216, var9);
                this.method4102(var8 + 1, (byte) -103, 268435456, var9 + 1);
            }
            if (arg4 == 2) {
                this.method4102(var8, (byte) 121, 67108864, var9);
                this.method4102(var8 - 1, (byte) 123, 4194304, var9 + 1);
            }
            if (arg4 == 3) {
                this.method4102(var8, (byte) 9, 268435456, var9);
                this.method4102(var8 - 1, (byte) 122, 16777216, var9 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method4102(var8, (byte) 9, 545259520, var9);
            this.method4102(var8, (byte) -49, 33554432, var9 - 1);
            this.method4102(var8 + 1, (byte) 124, 134217728, var9);
        }
        if (arg4 == 1) {
            this.method4102(var8, (byte) 125, 41943040, var9);
            this.method4102(var8 + 1, (byte) 127, 134217728, var9);
            this.method4102(var8, (byte) -6, 536870912, var9 + 1);
        }
        if (arg4 == 2) {
            this.method4102(var8, (byte) 124, 167772160, var9);
            this.method4102(var8, (byte) -63, 536870912, var9 + 1);
            this.method4102(var8 - 1, (byte) 123, 8388608, var9);
        }
        if (arg4 == 3) {
            this.method4102(var8, (byte) -33, 671088640, var9);
            this.method4102(var8 - 1, (byte) 124, 8388608, var9);
            this.method4102(var8, (byte) 121, 33554432, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public final void method4089(int arg0) {
        field10198++;
        int var2 = 0;
        if (arg0 != -1) {
            return;
        }
        while (var2 < this.field10183) {
            for (int var3 = 0; var3 < this.field10195; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field10183 - 5) <= var2 || this.field10195 - 5 <= var3) {
                    this.field10184[var2][var3] = -1;
                } else {
                    this.field10184[var2][var3] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method4090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10194++;
        if (arg3 == 1) {
            if (arg6 == arg7 && arg0 == arg1) {
                return true;
            }
        } else if (arg7 >= arg6 && arg6 + arg3 - 1 >= arg7 && arg0 >= arg0 && (arg0 + arg3 - 1) >= arg0) {
            return true;
        }
        int var9 = arg6 - this.field10176;
        int var10 = arg7 - this.field10176;
        int var11 = arg1 - this.field10196;
        if (arg5 != 32768) {
            return false;
        }
        int var12 = arg0 - this.field10196;
        if (arg3 == 1) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field10184[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field10184[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field10184[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field10184[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field10184[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field10184[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field10184[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field10184[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field10184[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field10184[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field10184[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg3 - 1;
            int var14 = var11 + arg3 - 1;
            if (arg4 == 0) {
                if (arg2 == 0) {
                    if (var10 - arg3 == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field10184[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg3) == var11 && (this.field10184[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 <= var10 && var13 >= var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 - arg3 == var9 && var12 >= var11 && var12 <= var14 && (this.field10184[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12 && (this.field10184[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 + 1) == var11 && (this.field10184[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg3 == var11 && (this.field10184[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg3) == var11) {
                        return true;
                    }
                    if ((var10 - arg3) == var9 && var11 <= var12 && var14 >= var12 && (this.field10184[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 >= var11 && var14 >= var12 && (this.field10184[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    if ((var10 - arg3) == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14 && (this.field10184[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 - arg3 == var11 && (this.field10184[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var10 - arg3) == var9 && var12 >= var11 && var14 >= var12 && (this.field10184[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg3 == var11 && (this.field10184[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - arg3 == var9 && var11 <= var12 && var14 >= var12 && (this.field10184[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field10184[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 - arg3) == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 - arg3 == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field10184[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14 && (this.field10184[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 - arg3 == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field10184[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var9 && var10 <= var13 && var12 - arg3 == var11 && (this.field10184[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg3 == var9 && var12 >= var11 && var12 <= var14 && (this.field10184[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14 && (this.field10184[var9][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method4091(String arg0, int arg1, String arg2, int arg3) {
        field10197++;
        class531.field7316 = arg1;
        class284.field4094 = arg3;
        class115.method837(arg0, false, arg2, -3);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIIZII)V")
    public final void method4092(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field10182++;
        int var8 = arg0;
        if (arg4) {
            var8 = arg0 | 0x20000;
        }
        int var9 = arg6 - this.field10196;
        int var10 = arg3 - this.field10176;
        if (arg1) {
            var8 |= 0x40000000;
        }
        for (int var11 = var10; var11 < (arg5 + var10); var11++) {
            if (var11 >= 0 && this.field10183 > var11) {
                for (int var12 = var9; var12 < (var9 + arg2); var12++) {
                    if (var12 >= 0 && this.field10195 > var12) {
                        this.method4100(var11, var8, 64, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIIBIII)Z")
    public final boolean method4093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field10188++;
        int var11 = arg3 + arg5;
        int var12 = arg2 + arg9;
        int var13 = arg1 + arg7;
        int var14 = arg0 + arg8;
        if (arg6 != -33) {
            this.field10183 = 38;
        }
        if (arg3 == var13 && (arg4 & 0x2) == 0) {
            int var15 = arg9 <= arg0 ? arg0 : arg9;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field10184[var13 - this.field10176 - 1][var15 - this.field10196] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg4 & 0x8) == 0) {
            int var17 = arg0 >= arg9 ? arg0 : arg9;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field10184[arg7 - this.field10176][var17 - this.field10196] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg9 == var14 && (arg4 & 0x1) == 0) {
            int var19 = arg7 < arg3 ? arg3 : arg7;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field10184[var19 - this.field10176][var14 - this.field10196 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg0 == var12 && (arg4 & 0x4) == 0) {
            int var21 = arg3 <= arg7 ? arg7 : arg3;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field10184[var21 - this.field10176][arg0 - this.field10196] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
    public final void method4094(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field10176;
        int var5 = arg2 - this.field10196;
        field10191++;
        this.field10184[var4][var5] = class613.method3544(this.field10184[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZIZII)V")
    public final void method4095(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field10199++;
        int var8 = arg6 - this.field10176;
        int var9 = arg3 - this.field10196;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method4100(var8, 128, 64, var9);
                this.method4100(var8 - 1, 8, 64, var9);
            }
            if (arg5 == 1) {
                this.method4100(var8, 2, 64, var9);
                this.method4100(var8, 32, 64, var9 + 1);
            }
            if (arg5 == 2) {
                this.method4100(var8, 8, 64, var9);
                this.method4100(var8 + 1, 128, 64, var9);
            }
            if (arg5 == 3) {
                this.method4100(var8, 32, 64, var9);
                this.method4100(var8, 2, 64, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method4100(var8, 1, 64, var9);
                this.method4100(var8 - 1, 16, 64, var9 + 1);
            }
            if (arg5 == 1) {
                this.method4100(var8, 4, 64, var9);
                this.method4100(var8 + 1, 64, 64, var9 + 1);
            }
            if (arg5 == 2) {
                this.method4100(var8, 16, 64, var9);
                this.method4100(var8 + 1, 1, 64, var9 - 1);
            }
            if (arg5 == 3) {
                this.method4100(var8, 64, 64, var9);
                this.method4100(var8 - 1, 4, 64, var9 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method4100(var8, 130, 64, var9);
                this.method4100(var8 - 1, 8, 64, var9);
                this.method4100(var8, 32, 64, var9 + 1);
            }
            if (arg5 == 1) {
                this.method4100(var8, 10, 64, var9);
                this.method4100(var8, 32, 64, var9 + 1);
                this.method4100(var8 + 1, 128, 64, var9);
            }
            if (arg5 == 2) {
                this.method4100(var8, 40, 64, var9);
                this.method4100(var8 + 1, 128, 64, var9);
                this.method4100(var8, 2, 64, var9 - 1);
            }
            if (arg5 == 3) {
                this.method4100(var8, 160, 64, var9);
                this.method4100(var8, 2, 64, var9 - 1);
                this.method4100(var8 - 1, 8, 64, var9);
            }
        }
        if (arg1 < 14) {
            method4091(null, -1, null, -61);
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg5 == 0) {
                    this.method4100(var8, 65536, 64, var9);
                    this.method4100(var8 - 1, 4096, 64, var9);
                }
                if (arg5 == 1) {
                    this.method4100(var8, 1024, 64, var9);
                    this.method4100(var8, 16384, 64, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method4100(var8, 4096, 64, var9);
                    this.method4100(var8 + 1, 65536, 64, var9);
                }
                if (arg5 == 3) {
                    this.method4100(var8, 16384, 64, var9);
                    this.method4100(var8, 1024, 64, var9 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg5 == 0) {
                    this.method4100(var8, 512, 64, var9);
                    this.method4100(var8 - 1, 8192, 64, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method4100(var8, 2048, 64, var9);
                    this.method4100(var8 + 1, 32768, 64, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method4100(var8, 8192, 64, var9);
                    this.method4100(var8 + 1, 512, 64, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method4100(var8, 32768, 64, var9);
                    this.method4100(var8 - 1, 2048, 64, var9 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg5 == 0) {
                    this.method4100(var8, 66560, 64, var9);
                    this.method4100(var8 - 1, 4096, 64, var9);
                    this.method4100(var8, 16384, 64, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method4100(var8, 5120, 64, var9);
                    this.method4100(var8, 16384, 64, var9 + 1);
                    this.method4100(var8 + 1, 65536, 64, var9);
                }
                if (arg5 == 2) {
                    this.method4100(var8, 20480, 64, var9);
                    this.method4100(var8 + 1, 65536, 64, var9);
                    this.method4100(var8, 1024, 64, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method4100(var8, 81920, 64, var9);
                    this.method4100(var8, 1024, 64, var9 - 1);
                    this.method4100(var8 - 1, 4096, 64, var9);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method4100(var8, 536870912, 64, var9);
                this.method4100(var8 - 1, 33554432, 64, var9);
            }
            if (arg5 == 1) {
                this.method4100(var8, 8388608, 64, var9);
                this.method4100(var8, 134217728, 64, var9 + 1);
            }
            if (arg5 == 2) {
                this.method4100(var8, 33554432, 64, var9);
                this.method4100(var8 + 1, 536870912, 64, var9);
            }
            if (arg5 == 3) {
                this.method4100(var8, 134217728, 64, var9);
                this.method4100(var8, 8388608, 64, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method4100(var8, 4194304, 64, var9);
                this.method4100(var8 - 1, 67108864, 64, var9 + 1);
            }
            if (arg5 == 1) {
                this.method4100(var8, 16777216, 64, var9);
                this.method4100(var8 + 1, 268435456, 64, var9 + 1);
            }
            if (arg5 == 2) {
                this.method4100(var8, 67108864, 64, var9);
                this.method4100(var8 + 1, 4194304, 64, var9 - 1);
            }
            if (arg5 == 3) {
                this.method4100(var8, 268435456, 64, var9);
                this.method4100(var8 - 1, 16777216, 64, var9 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method4100(var8, 545259520, 64, var9);
            this.method4100(var8 - 1, 33554432, 64, var9);
            this.method4100(var8, 134217728, 64, var9 + 1);
        }
        if (arg5 == 1) {
            this.method4100(var8, 41943040, 64, var9);
            this.method4100(var8, 134217728, 64, var9 + 1);
            this.method4100(var8 + 1, 536870912, 64, var9);
        }
        if (arg5 == 2) {
            this.method4100(var8, 167772160, 64, var9);
            this.method4100(var8 + 1, 536870912, 64, var9);
            this.method4100(var8, 8388608, 64, var9 - 1);
        }
        if (arg5 == 3) {
            this.method4100(var8, 671088640, 64, var9);
            this.method4100(var8, 8388608, 64, var9 - 1);
            this.method4100(var8 - 1, 33554432, 64, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(III)V")
    public final void method4096(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field10176;
        if (arg2 == 6936) {
            field10181++;
            int var5 = arg0 - this.field10196;
            this.field10184[var4][var5] = class407.method2490(this.field10184[var4][var5], -2097153);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method4097(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field10193++;
        if (arg3 > 1) {
            return class615.method3550(arg3, arg0, arg4, 18, arg2, arg3, arg8, arg6, arg1) ? true : this.method4093(arg4, arg6, arg3, arg1, arg7, arg3, (byte) -33, arg8, arg2, arg0);
        }
        int var10 = arg8 + arg6 - 1;
        int var11 = arg2 + arg4 - 1;
        if (arg1 >= arg8 && var10 >= arg1 && arg4 <= arg0 && var11 >= arg0) {
            return true;
        } else if ((arg8 - 1) == arg1 && arg0 >= arg4 && var11 >= arg0 && (this.field10184[arg1 - this.field10176][arg0 - this.field10196] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg1 && arg0 >= arg4 && var11 >= arg0 && (this.field10184[arg1 - this.field10176][arg0 - this.field10196] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg0 && arg1 >= arg8 && arg1 <= var10 && (this.field10184[arg1 - this.field10176][arg0 - this.field10196] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else if (var11 + 1 == arg0 && arg8 <= arg1 && var10 >= arg1 && (this.field10184[arg1 - this.field10176][arg0 - this.field10196] & 0x20) == 0 && (arg7 & 0x1) == 0) {
            return true;
        } else {
            int var12 = 35 % ((28 - arg5) / 51);
            return false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static void method4098(int arg0) {
        if (arg0 != 2883842) {
            field10178 = null;
        }
        field10178 = null;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(III)V")
    public final void method4099(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field10196;
        int var5 = arg1 - this.field10176;
        if (arg2 == -1) {
            field10177++;
            this.field10184[var5][var4] = class407.method2490(this.field10184[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)V")
    private final void method4100(int arg0, int arg1, int arg2, int arg3) {
        this.field10184[arg0][arg3] = class613.method3544(this.field10184[arg0][arg3], arg1);
        field10186++;
        if (arg2 != 64) {
            this.method4099(-65, -41, -39);
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(III)V")
    public final void method4101(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field10176;
        field10180++;
        int var5 = arg1 - this.field10196;
        if (arg0 == -8906) {
            this.field10184[var4][var5] = class613.method3544(this.field10184[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBII)V")
    private final void method4102(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = -2 / ((77 - arg1) / 44);
        this.field10184[arg3][arg0] = class407.method2490(this.field10184[arg3][arg0], ~arg2);
        field10190++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIZIIZ)V")
    public final void method4103(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field10185++;
        int var9 = 256;
        if (arg4) {
            var9 |= 0x20000;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        if (arg7) {
            var9 |= 0x40000000;
        }
        if (arg6 != 26276) {
            field10178 = null;
        }
        int var11 = arg1 - this.field10196;
        int var12 = arg0 - this.field10176;
        for (int var13 = var12; var13 < var12 + arg2; var13++) {
            if (var13 >= 0 && var13 < this.field10183) {
                for (int var14 = var11; var14 < var11 + arg3; var14++) {
                    if (var14 >= 0 && this.field10195 > var14) {
                        this.method4102(var14, (byte) 122, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILjava/lang/String;)Lwo;")
    public static final class326 method4104(int arg0, int arg1, String arg2) {
        field10189++;
        class326 var3;
        try {
            var3 = (class326) Class.forName("bc").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class220();
        }
        var3.field4585 = arg1;
        var3.field4584 = arg2;
        if (arg0 != 1) {
            field10178 = null;
        }
        return var3;
    }
}
