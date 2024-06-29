import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class37 {

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    private int field679;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[[I")
    public int[][] field653;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lke;")
    public static class256 field652 = class316.method2202("www)2wtqa", 27626);

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Z")
    public static boolean field654 = false;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "J")
    public static long field668 = 0L;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "Lke;")
    public static class256 field680 = class316.method2202("Fertigkeit: ", 27626);

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lke;")
    public static class256 field660 = class316.method2202("showVideoAd", 27626);

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lhd;")
    public static class319 field661;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[[[B")
    public static byte[][][] field651;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 6)
    public final void method269(int arg0) {
        field657++;
        for (int var2 = arg0; var2 < this.field673; var2++) {
            for (int var3 = 0; var3 < this.field679; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field673 - 5) <= var2 || this.field679 - 5 <= var3) {
                    this.field653[var2][var3] = 16777215;
                } else {
                    this.field653[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIZ)Z", line = 35)
    public final boolean method270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field662++;
        if (arg3 > 1) {
            return this.method277(arg2, -124, arg1, arg3, arg5, arg4, arg7, arg6, arg3) ? true : this.method287(arg0, arg4, arg7, arg3, arg3, 126, arg1, arg5, arg2, arg6);
        }
        int var10 = arg7 + arg4 - 1;
        int var11 = arg1 + arg5 - 1;
        if (arg7 <= arg2 && var10 >= arg2 && arg6 >= arg1 && arg6 <= var11) {
            return true;
        } else if ((arg7 - 1) == arg2 && arg1 <= arg6 && var11 >= arg6 && (this.field653[arg2 - this.field676][arg6 - this.field655] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg2 && arg1 <= arg6 && arg6 <= var11 && (this.field653[arg2 - this.field676][arg6 - this.field655] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg6 && arg2 >= arg7 && arg2 <= var10 && (this.field653[arg2 - this.field676][arg6 - this.field655] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            if (!arg8) {
                this.method289(-118, -61, -79, -91, false, true);
            }
            return var11 + 1 == arg6 && arg7 <= arg2 && var10 >= arg2 && (this.field653[arg2 - this.field676][arg6 - this.field655] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)Z", line = 77)
    public final boolean method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 32) {
            this.method289(109, -66, 44, 74, false, true);
        }
        field656++;
        if (arg5 == 1) {
            if (arg3 == arg6 && arg2 == arg7) {
                return true;
            }
        } else if (arg3 >= arg6 && (arg6 + arg5 - 1) >= arg3 && arg7 >= arg7 && arg7 - (1 - arg5) >= arg7) {
            return true;
        }
        int var9 = arg6 - this.field676;
        int var10 = arg7 - this.field655;
        int var11 = arg3 - this.field676;
        int var12 = arg2 - this.field655;
        if (arg5 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field653[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field653[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field653[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field653[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field653[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field653[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field653[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field653[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field653[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field653[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field653[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field653[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg5 - 1;
            int var14 = arg5 + var9 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var13 && (this.field653[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && (var10 - arg5) == var12 && (this.field653[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var11 - arg5) == var9 && var10 >= var12 && var10 <= var13 && (this.field653[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var14 && (var10 - arg5) == var12 && (this.field653[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - arg5) == var9 && var10 >= var12 && var10 <= var13 && (this.field653[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && (var10 + 1) == var12 && (this.field653[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var9 && var12 <= var10 && var13 >= var10 && (this.field653[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && var10 + 1 == var12 && (this.field653[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 <= var11 && var11 <= var14 && (var10 + 1) == var12 && (this.field653[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var14 >= var11 && var10 - arg5 == var12 && (this.field653[var11][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg5) == var9 && var12 <= var10 && var13 >= var10 && (this.field653[var14][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var13 && (this.field653[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V", line = 270)
    public final void method272(int arg0, int arg1, int arg2) {
        field678++;
        int var4 = arg2 - this.field676;
        int var5 = arg0 - this.field655;
        this.field653[var4][var5] = class100.method721(this.field653[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZIIBI)V", line = 280)
    public final void method273(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        field663++;
        int var7 = arg2 - this.field676;
        int var8 = arg0 - this.field655;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method284(var7, 128, 128, var8);
                this.method284(var7 - 1, 128, 8, var8);
            }
            if (arg3 == 1) {
                this.method284(var7, 128, 2, var8);
                this.method284(var7, 128, 32, var8 + 1);
            }
            if (arg3 == 2) {
                this.method284(var7, 128, 8, var8);
                this.method284(var7 + 1, 128, 128, var8);
            }
            if (arg3 == 3) {
                this.method284(var7, 128, 32, var8);
                this.method284(var7, 128, 2, var8 - 1);
            }
        }
        if (arg4 >= -111) {
            this.method283(9, -86, 90, -116, true, 14, (byte) 114);
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method284(var7, 128, 1, var8);
                this.method284(var7 - 1, 128, 16, var8 + 1);
            }
            if (arg3 == 1) {
                this.method284(var7, 128, 4, var8);
                this.method284(var7 + 1, 128, 64, var8 + 1);
            }
            if (arg3 == 2) {
                this.method284(var7, 128, 16, var8);
                this.method284(var7 + 1, 128, 1, var8 - 1);
            }
            if (arg3 == 3) {
                this.method284(var7, 128, 64, var8);
                this.method284(var7 - 1, 128, 4, var8 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method284(var7, 128, 130, var8);
                this.method284(var7 - 1, 128, 8, var8);
                this.method284(var7, 128, 32, var8 + 1);
            }
            if (arg3 == 1) {
                this.method284(var7, 128, 10, var8);
                this.method284(var7, 128, 32, var8 + 1);
                this.method284(var7 + 1, 128, 128, var8);
            }
            if (arg3 == 2) {
                this.method284(var7, 128, 40, var8);
                this.method284(var7 + 1, 128, 128, var8);
                this.method284(var7, 128, 2, var8 - 1);
            }
            if (arg3 == 3) {
                this.method284(var7, 128, 160, var8);
                this.method284(var7, 128, 2, var8 - 1);
                this.method284(var7 - 1, 128, 8, var8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method284(var7, 128, 65536, var8);
                this.method284(var7 - 1, 128, 4096, var8);
            }
            if (arg3 == 1) {
                this.method284(var7, 128, 1024, var8);
                this.method284(var7, 128, 16384, var8 + 1);
            }
            if (arg3 == 2) {
                this.method284(var7, 128, 4096, var8);
                this.method284(var7 + 1, 128, 65536, var8);
            }
            if (arg3 == 3) {
                this.method284(var7, 128, 16384, var8);
                this.method284(var7, 128, 1024, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method284(var7, 128, 512, var8);
                this.method284(var7 - 1, 128, 8192, var8 + 1);
            }
            if (arg3 == 1) {
                this.method284(var7, 128, 2048, var8);
                this.method284(var7 + 1, 128, 32768, var8 + 1);
            }
            if (arg3 == 2) {
                this.method284(var7, 128, 8192, var8);
                this.method284(var7 + 1, 128, 512, var8 - 1);
            }
            if (arg3 == 3) {
                this.method284(var7, 128, 32768, var8);
                this.method284(var7 - 1, 128, 2048, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method284(var7, 128, 66560, var8);
            this.method284(var7 - 1, 128, 4096, var8);
            this.method284(var7, 128, 16384, var8 + 1);
        }
        if (arg3 == 1) {
            this.method284(var7, 128, 5120, var8);
            this.method284(var7, 128, 16384, var8 + 1);
            this.method284(var7 + 1, 128, 65536, var8);
        }
        if (arg3 == 2) {
            this.method284(var7, 128, 20480, var8);
            this.method284(var7 + 1, 128, 65536, var8);
            this.method284(var7, 128, 1024, var8 - 1);
        }
        if (arg3 == 3) {
            this.method284(var7, 128, 81920, var8);
            this.method284(var7, 128, 1024, var8 - 1);
            this.method284(var7 - 1, 128, 4096, var8);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIIIII)Z", line = 489)
    public final boolean method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field681++;
        if (arg4 == 1) {
            if (arg3 == arg5 && arg2 == arg6) {
                return true;
            }
        } else if (arg3 <= arg5 && arg5 <= (arg3 + arg4 - 1) && arg6 >= arg6 && arg6 <= (arg4 + arg6 - 1)) {
            return true;
        }
        int var9 = arg3 - this.field676;
        int var10 = arg5 - this.field676;
        int var11 = arg2 - this.field655;
        int var12 = arg6 - this.field655;
        if (arg1 != -24872) {
            return true;
        }
        if (arg4 == 1) {
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field653[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field653[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field653[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field653[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field653[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field653[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field653[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field653[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field653[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field653[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field653[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field653[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field653[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field653[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field653[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field653[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field653[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field653[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field653[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field653[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var9 - 1;
            int var14 = var11 + arg4 - 1;
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if (var10 - arg4 == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11 && (this.field653[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 - arg4 == var11 && (this.field653[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 <= var10 && var13 >= var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 - arg4 == var9 && var12 >= var11 && var14 >= var12 && (this.field653[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var14 >= var12 && (this.field653[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 + 1) == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11 && (this.field653[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg4) == var11 && (this.field653[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 >= var9 && var13 >= var10 && (var12 - arg4) == var11) {
                        return true;
                    }
                    if ((var10 - arg4) == var9 && var12 >= var11 && var12 <= var14 && (this.field653[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12 && (this.field653[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if (var10 - arg4 == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14 && (this.field653[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 - arg4) == var11 && (this.field653[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - arg4) == var9 && var12 >= var11 && var12 <= var14 && (this.field653[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 - arg4) == var11 && (this.field653[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - arg4) == var9 && var12 >= var11 && var14 >= var12 && (this.field653[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field653[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 - arg4 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 - arg4) == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11 && (this.field653[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14 && (this.field653[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 - arg4 == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11 && (this.field653[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var9 && var10 <= var13 && (var12 - arg4) == var11 && (this.field653[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var10 - arg4) == var9 && var12 >= var11 && var12 <= var14 && (this.field653[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 <= var12 && var14 >= var12 && (this.field653[var9][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V", line = 859)
    public final void method275(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field655;
        field664++;
        int var5 = arg0 - this.field676;
        this.field653[var5][var4] = class150.method1123(this.field653[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 871)
    public static final void method276(int arg0) {
        if (class114.field2014 < 128) {
            class114.field2014 = 128;
        }
        int var1 = class75.field1435 >> 7;
        if (class114.field2014 > 383) {
            class114.field2014 = 383;
        }
        int var2 = class40.field734 >> 7;
        class289.field5001 &= 0x7FF;
        field677++;
        int var3 = 0;
        int var4 = class297.method2080(class75.field1435, arg0 ^ 0xFFFFFF8C, class255.field4377, class40.field734);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class255.field4377;
                    if (var7 < 3 && (class308.field5296[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - (class118.field2090[var7][var5][var6] - (class189.field3488[var7][var5][var6] & 0xFF) * 8);
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class180.field3193 < var9) {
            class180.field3193 += (var9 - class180.field3193) / 24;
        } else if (var9 < class180.field3193) {
            class180.field3193 += (var9 - class180.field3193) / 80;
        }
        if (arg0 != -1) {
            field652 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIII)Z", line = 942)
    private final boolean method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field669++;
        if ((arg6 + arg5) <= arg0 || (arg0 + arg8) <= arg6) {
            return false;
        } else if (arg1 >= -108) {
            return true;
        } else {
            return (arg2 + arg4) > arg7 && arg2 < (arg3 + arg7);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZIIZI)V", line = 970)
    public final void method278(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field658++;
        if (arg4) {
            this.field679 = -28;
        }
        int var7 = 256;
        int var8 = arg5 - this.field676;
        if (arg1) {
            var7 += 131072;
        }
        int var9 = arg0 - this.field655;
        for (int var10 = var8; var10 < (arg3 + var8); var10++) {
            if (var10 >= 0 && this.field673 > var10) {
                for (int var11 = var9; var11 < (arg2 + var9); var11++) {
                    if (var11 >= 0 && this.field679 > var11) {
                        this.method285(var10, 3382, var11, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V", line = 1017)
    public final void method279(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field655;
        int var5 = 36 / ((arg0 + 76) / 50);
        field667++;
        int var6 = arg2 - this.field676;
        this.field653[var6][var4] = class100.method721(this.field653[var6][var4], 2097152);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 1034)
    public static void method280(int arg0) {
        field651 = (byte[][][]) null;
        field661 = null;
        field680 = null;
        if (arg0 != 8) {
            method281(25, -53, (byte) 27, -50);
        }
        field652 = null;
        field660 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIBI)V", line = 1054)
    public static final void method281(int arg0, int arg1, byte arg2, int arg3) {
        field674++;
        class188 var4 = client.method832(arg1, 25767, arg0);
        if (var4 != null && var4.field3421 != null) {
            class119 var5 = new class119();
            var5.field2116 = var4;
            var5.field2114 = var4.field3421;
            class91.method678((byte) -88, var5);
        }
        class173.field3079 = arg3;
        class96.field1710 = arg0;
        class170.field3024 = arg1;
        class320.field5489 = true;
        class64.method500(var4, (byte) -117);
        if (arg2 != -79) {
            method281(94, -20, (byte) -95, 31);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lng;BLng;)V", line = 1083)
    public static final void method282(class138 arg0, byte arg1, class138 arg2) {
        field666++;
        class166.field2945 = arg2;
        class303.field5245 = arg0;
        int var3 = -96 % ((arg1 + 27) / 47);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIZIB)V", line = 1098)
    public final void method283(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        int var8 = arg2 - this.field655;
        int var9 = arg0 - this.field676;
        int var10 = 256;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg3;
            arg3 = arg5;
            arg5 = var11;
        }
        field682++;
        if (arg4) {
            var10 += 131072;
        }
        for (int var12 = var9; var12 < (arg3 + var9); var12++) {
            if (var12 >= 0 && this.field673 > var12) {
                for (int var13 = var8; var13 < arg5 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field679) {
                        this.method284(var12, 128, var10, var13);
                    }
                }
            }
        }
        if (arg6 != 35) {
            this.field676 = -24;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V", line = 1147)
    private final void method284(int arg0, int arg1, int arg2, int arg3) {
        this.field653[arg0][arg3] = class150.method1123(this.field653[arg0][arg3], ~arg2);
        field665++;
        if (arg1 != 128) {
            this.method274(20, -36, 43, 49, 77, -63, -123, -127);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIII)V", line = 1158)
    private final void method285(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 3382) {
            field654 = true;
        }
        field671++;
        this.field653[arg0][arg2] = class100.method721(this.field653[arg0][arg2], arg3);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)Lbf;", line = 1171)
    public static final class223 method286(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        return var3 == null || var3.field4628 == null ? null : var3.field4628;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1183)
    private final boolean method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field672++;
        if (arg5 <= 72) {
            return false;
        }
        int var11 = arg8 + arg3;
        int var12 = arg4 + arg9;
        int var13 = arg6 + arg7;
        int var14 = arg1 + arg2;
        if (arg2 <= arg8 && arg8 < var14) {
            if (arg6 == var12 && (arg0 & 0x4) == 0) {
                int var15 = arg8;
                int var16 = var11 > var14 ? var14 : var11;
                while (var15 < var16) {
                    if ((this.field653[var15 - this.field676][var12 - this.field655 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg9 == var13 && (arg0 & 0x1) == 0) {
                int var17 = arg8;
                int var18 = var11 > var14 ? var14 : var11;
                while (var17 < var18) {
                    if ((this.field653[var17 - this.field676][arg9 - this.field655] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg2 && var11 <= var14) {
            if (arg6 == var12 && (arg0 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var11; var19++) {
                    if ((this.field653[var19 - this.field676][var12 - this.field655 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var13 && (arg0 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var11; var20++) {
                    if ((this.field653[var20 - this.field676][arg9 - this.field655] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg9 >= arg6 && var13 > arg9) {
            if (arg2 == var11 && (arg0 & 0x8) == 0) {
                int var21 = var13 < var12 ? var13 : var12;
                for (int var22 = arg9; var22 < var21; var22++) {
                    if ((this.field653[var11 - this.field676 - 1][var22 - this.field655] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var14 && (arg0 & 0x2) == 0) {
                int var23 = arg9;
                int var24 = var13 < var12 ? var13 : var12;
                while (var23 < var24) {
                    if ((this.field653[arg8 - this.field676][var23 - this.field655] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg6 < var12 && var12 <= var13) {
            if (arg2 == var11 && (arg0 & 0x8) == 0) {
                for (int var25 = arg6; var25 < var12; var25++) {
                    if ((this.field653[var11 - this.field676 - 1][var25 - this.field655] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var14 && (arg0 & 0x2) == 0) {
                for (int var26 = arg6; var26 < var12; var26++) {
                    if ((this.field653[arg8 - this.field676][var26 - this.field655] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIII)I", line = 1345)
    public static final int method288(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field675++;
        if (arg2 != -1) {
            return 99;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(II)V", line = 1379)
    public class37(int arg0, int arg1) {
        this.field673 = arg0;
        this.field676 = 0;
        this.field655 = 0;
        this.field679 = arg1;
        this.field653 = new int[this.field673][this.field679];
        this.method269(0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIZZ)V", line = 1393)
    public final void method289(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        int var7 = arg0 - this.field676;
        int var8 = arg3 - this.field655;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method285(var7, 3382, var8, 128);
                this.method285(var7 - 1, 3382, var8, 8);
            }
            if (arg1 == 1) {
                this.method285(var7, 3382, var8, 2);
                this.method285(var7, 3382, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method285(var7, 3382, var8, 8);
                this.method285(var7 + 1, 3382, var8, 128);
            }
            if (arg1 == 3) {
                this.method285(var7, 3382, var8, 32);
                this.method285(var7, 3382, var8 - 1, 2);
            }
        }
        field670++;
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method285(var7, 3382, var8, 1);
                this.method285(var7 - 1, 3382, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method285(var7, 3382, var8, 4);
                this.method285(var7 + 1, 3382, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method285(var7, 3382, var8, 16);
                this.method285(var7 + 1, 3382, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method285(var7, 3382, var8, 64);
                this.method285(var7 - 1, 3382, var8 - 1, 4);
            }
        }
        if (!arg4) {
            this.method275(-47, -120, -13);
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method285(var7, 3382, var8, 130);
                this.method285(var7 - 1, 3382, var8, 8);
                this.method285(var7, 3382, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method285(var7, 3382, var8, 10);
                this.method285(var7, 3382, var8 + 1, 32);
                this.method285(var7 + 1, 3382, var8, 128);
            }
            if (arg1 == 2) {
                this.method285(var7, 3382, var8, 40);
                this.method285(var7 + 1, 3382, var8, 128);
                this.method285(var7, 3382, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method285(var7, 3382, var8, 160);
                this.method285(var7, 3382, var8 - 1, 2);
                this.method285(var7 - 1, 3382, var8, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method285(var7, 3382, var8, 65536);
                this.method285(var7 - 1, 3382, var8, 4096);
            }
            if (arg1 == 1) {
                this.method285(var7, 3382, var8, 1024);
                this.method285(var7, 3382, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method285(var7, 3382, var8, 4096);
                this.method285(var7 + 1, 3382, var8, 65536);
            }
            if (arg1 == 3) {
                this.method285(var7, 3382, var8, 16384);
                this.method285(var7, 3382, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method285(var7, 3382, var8, 512);
                this.method285(var7 - 1, 3382, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method285(var7, 3382, var8, 2048);
                this.method285(var7 + 1, 3382, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method285(var7, 3382, var8, 8192);
                this.method285(var7 + 1, 3382, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method285(var7, 3382, var8, 32768);
                this.method285(var7 - 1, 3382, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method285(var7, 3382, var8, 66560);
            this.method285(var7 - 1, 3382, var8, 4096);
            this.method285(var7, 3382, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method285(var7, 3382, var8, 5120);
            this.method285(var7, 3382, var8 + 1, 16384);
            this.method285(var7 + 1, 3382, var8, 65536);
        }
        if (arg1 == 2) {
            this.method285(var7, 3382, var8, 20480);
            this.method285(var7 + 1, 3382, var8, 65536);
            this.method285(var7, 3382, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method285(var7, 3382, var8, 81920);
            this.method285(var7, 3382, var8 - 1, 1024);
            this.method285(var7 - 1, 3382, var8, 4096);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIIII)Z", line = 1602)
    public final boolean method290(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field659++;
        if (arg1 == arg3 && arg2 == arg4) {
            return true;
        }
        int var6 = arg4 - this.field655;
        int var7 = arg1 - this.field676;
        if (var7 < 0 || var7 >= this.field673 || var6 < 0 || var6 >= this.field679) {
            return false;
        }
        int var8 = arg3 - this.field676;
        if (arg0 != 36) {
            field661 = (class319) null;
        }
        int var9;
        if (var7 > var8) {
            var9 = var7 - var8;
        } else {
            var9 = var8 - var7;
        }
        int var10 = arg2 - this.field655;
        int var11;
        if (var6 > var10) {
            var11 = var6 - var10;
        } else {
            var11 = var10 - var6;
        }
        if (var9 <= var11) {
            int var12 = var9 * 65536 / var11;
            int var13 = 32768;
            while (var6 != var10) {
                if (var6 > var10) {
                    if ((this.field653[var8][var10] & 0x12C0102) != 0) {
                        return false;
                    }
                    var10++;
                } else if (var6 < var10) {
                    if ((this.field653[var8][var10] & 0x12C0120) != 0) {
                        return false;
                    }
                    var10--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var8 < var7) {
                        if ((this.field653[var8][var10] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field653[var8][var10] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var9;
            int var15 = 32768;
            while (var7 != var8) {
                if (var8 < var7) {
                    if ((this.field653[var8][var10] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var7 < var8) {
                    if ((this.field653[var8][var10] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 > var10) {
                        if ((this.field653[var8][var10] & 0x12C0102) != 0) {
                            return false;
                        }
                        var10++;
                    } else if (var6 < var10) {
                        if ((this.field653[var8][var10] & 0x12C0120) != 0) {
                            return false;
                        }
                        var10--;
                    }
                }
            }
        }
        return (this.field653[var7][var6] & 0x1240100) == 0;
    }
}
