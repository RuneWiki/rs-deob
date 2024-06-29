import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class716 {

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field9999 = 104;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public int field10002;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field10003;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public int field10004;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field10005;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public static int field10008;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public static int field10009;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
    public static int field10011;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public int field10013;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field9990;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public int field9992;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field9993;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field9994;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field9997;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field9998;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "[[I")
    public int[][] field9991;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static final void method3983(byte arg0) {
        if (class678.field9563 != -1) {
            class462.method2807((byte) -126, -1, class678.field9563, -1, false);
            class678.field9563 = -1;
        }
        field10005++;
        if (arg0 >= -112) {
            method3983((byte) -10);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIBIII)Z")
    public final boolean method3984(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field10006++;
        if (arg3 > 1) {
            return class78.method779(arg6, 1275, arg8, arg1, arg3, arg0, arg4, arg3, arg7) ? true : this.method3990((byte) 68, arg7, arg6, arg1, arg3, arg0, arg4, arg8, arg3, arg2);
        }
        if (arg5 != 89) {
            this.field10002 = -55;
        }
        int var10 = arg4 + arg6 - 1;
        int var11 = arg7 + arg8 - 1;
        if (arg0 >= arg4 && arg0 <= var10 && arg1 >= arg7 && arg1 <= var11) {
            return true;
        } else if ((arg4 - 1) == arg0 && arg1 >= arg7 && arg1 <= var11 && (this.field9991[arg0 - this.field9992][arg1 - this.field10004] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg1 >= arg7 && arg1 <= var11 && (this.field9991[arg0 - this.field9992][arg1 - this.field10004] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg1 && arg4 <= arg0 && var10 >= arg0 && (this.field9991[arg0 - this.field9992][arg1 - this.field10004] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg1 && arg0 >= arg4 && arg0 <= var10 && (this.field9991[arg0 - this.field9992][arg1 - this.field10004] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
    private final void method3985(int arg0, int arg1, int arg2, int arg3) {
        this.field9991[arg0][arg3] = class164.method1221(this.field9991[arg0][arg3], arg2);
        if (arg1 != 16) {
            this.method3993(true, false, -100, -33, false, -21, -48);
        }
        field9996++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIIIIIIZ)V")
    public final void method3986(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field10009++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg4;
            arg4 = arg6;
            arg6 = var10;
        }
        int var11 = arg5 - this.field9992;
        if (arg0) {
            var9 |= 0x40000000;
        }
        int var12 = arg2 - this.field10004;
        for (int var13 = var11; var13 < arg4 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field10013) {
                for (int var14 = var12; var14 < (arg6 + var12); var14++) {
                    if (var14 >= 0 && var14 < this.field10002) {
                        this.method3992(-9065, var13, var14, var9);
                    }
                }
            }
        }
        if (arg3 >= -43) {
            this.field10013 = -90;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V")
    public final void method3987(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field10004;
        field9994++;
        int var5 = arg1 - this.field9992;
        if (arg2 != 512) {
            this.field10002 = 4;
        }
        this.field9991[var5][var4] = class164.method1221(this.field9991[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3988(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field9999 = -40;
        }
        field10008++;
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V")
    public final void method3989(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field9992;
        int var5 = 14 % ((3 - arg1) / 49);
        int var6 = arg2 - this.field10004;
        field10007++;
        this.field9991[var4][var6] = class555.method3246(this.field9991[var4][var6], -2097153);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIIIIIIIII)Z")
    public final boolean method3990(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field10010++;
        int var11 = arg5 + arg8;
        int var12 = arg3 + arg4;
        int var13 = arg2 + arg6;
        int var14 = arg1 + arg7;
        if (arg0 != 68) {
            this.field10002 = 44;
        }
        if (arg5 == var13 && (arg9 & 0x2) == 0) {
            int var15 = arg3 <= arg1 ? arg1 : arg3;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field9991[var13 - this.field9992 - 1][var15 - this.field10004] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg6 == var11 && (arg9 & 0x8) == 0) {
            int var17 = arg1 < arg3 ? arg3 : arg1;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field9991[arg6 - this.field9992][var17 - this.field10004] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg6 < arg5 ? arg5 : arg6;
            int var20 = var11 < var13 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field9991[var19 - this.field9992][var14 - this.field10004 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg1 == var12 && (arg9 & 0x4) == 0) {
            int var21 = arg6 >= arg5 ? arg6 : arg5;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field9991[var21 - this.field9992][arg1 - this.field10004] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method3991(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field9990++;
        if (arg0 == 1) {
            if (arg4 == arg6 && arg1 == arg7) {
                return true;
            }
        } else if (arg6 >= arg4 && (arg0 + arg4 - 1) >= arg6 && arg1 >= arg1 && arg1 + arg0 - 1 >= arg1) {
            return true;
        }
        int var9 = arg7 - this.field10004;
        int var10 = arg1 - this.field10004;
        int var11 = arg6 - this.field9992;
        if (arg3 <= 72) {
            return true;
        }
        int var12 = arg4 - this.field9992;
        if (arg0 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field9991[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field9991[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field9991[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field9991[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field9991[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field9991[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field9991[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field9991[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field9991[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field9991[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field9991[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field9991[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var12 - 1;
            int var14 = arg0 + var9 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field9991[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 - arg0 == var9 && (this.field9991[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var11 - arg0) == var12 && var10 >= var9 && var14 >= var10 && (this.field9991[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 - arg0 == var9 && (this.field9991[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 - arg0 == var12 && var9 <= var10 && var10 <= var14 && (this.field9991[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 + 1) == var9 && (this.field9991[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 + 1 == var12 && var10 >= var9 && var14 >= var10 && (this.field9991[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 + 1 == var9 && (this.field9991[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 >= var12 && var11 <= var13 && var10 + 1 == var9 && (this.field9991[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var12 && var11 <= var13 && (var10 - arg0) == var9 && (this.field9991[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg0 == var12 && var9 <= var10 && var10 <= var14 && (this.field9991[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 <= var10 && var10 <= var14 && (this.field9991[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIII)V")
    private final void method3992(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -9065) {
            this.method3996(-113, (byte) 124, 110);
        }
        field10003++;
        this.field9991[arg1][arg2] = class555.method3246(this.field9991[arg1][arg2], ~arg3);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZIIZII)V")
    public final void method3993(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field10001++;
        int var8 = 256;
        if (arg4) {
            var8 |= 0x20000;
        }
        int var9 = arg3 - this.field9992;
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var10 = arg2 - this.field10004;
        if (arg0) {
            this.method3997(true, 104, (byte) 14, -10, false, 49, 98);
        }
        for (int var11 = var9; var11 < arg6 + var9; var11++) {
            if (var11 >= 0 && var11 < this.field10013) {
                for (int var12 = var10; var12 < (arg5 + var10); var12++) {
                    if (var12 >= 0 && this.field10002 > var12) {
                        this.method3985(var11, 16, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public final void method3994(boolean arg0) {
        field9995++;
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field10013; var2++) {
            for (int var3 = 0; var3 < this.field10002; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field10013 - 5) <= var2 || this.field10002 - 5 <= var3) {
                    this.field9991[var2][var3] = -1;
                } else {
                    this.field9991[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIZ)V")
    public final void method3995(int arg0, int arg1, boolean arg2) {
        field9993++;
        if (!arg2) {
            this.field9991 = null;
        }
        int var4 = arg0 - this.field10004;
        int var5 = arg1 - this.field9992;
        this.field9991[var5][var4] = class164.method1221(this.field9991[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBI)V")
    public final void method3996(int arg0, byte arg1, int arg2) {
        field10000++;
        int var4 = arg2 - this.field10004;
        if (arg1 >= 104) {
            int var5 = arg0 - this.field9992;
            this.field9991[var5][var4] = class555.method3246(this.field9991[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIBIZII)V")
    public final void method3997(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg1 - this.field9992;
        int var9 = arg5 - this.field10004;
        field10011++;
        if (arg2 >= -95) {
            this.field9991 = null;
        }
        if (arg6 == 0) {
            if (arg3 == 0) {
                this.method3992(-9065, var8, var9, 128);
                this.method3992(-9065, var8 - 1, var9, 8);
            }
            if (arg3 == 1) {
                this.method3992(-9065, var8, var9, 2);
                this.method3992(-9065, var8, var9 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3992(-9065, var8, var9, 8);
                this.method3992(-9065, var8 + 1, var9, 128);
            }
            if (arg3 == 3) {
                this.method3992(-9065, var8, var9, 32);
                this.method3992(-9065, var8, var9 - 1, 2);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg3 == 0) {
                this.method3992(-9065, var8, var9, 1);
                this.method3992(-9065, var8 - 1, var9 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3992(-9065, var8, var9, 4);
                this.method3992(-9065, var8 + 1, var9 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3992(-9065, var8, var9, 16);
                this.method3992(-9065, var8 + 1, var9 + -1, 1);
            }
            if (arg3 == 3) {
                this.method3992(-9065, var8, var9, 64);
                this.method3992(-9065, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg6 == 2) {
            if (arg3 == 0) {
                this.method3992(-9065, var8, var9, 130);
                this.method3992(-9065, var8 - 1, var9, 8);
                this.method3992(-9065, var8, var9 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3992(-9065, var8, var9, 10);
                this.method3992(-9065, var8, var9 + 1, 32);
                this.method3992(-9065, var8 + 1, var9, 128);
            }
            if (arg3 == 2) {
                this.method3992(-9065, var8, var9, 40);
                this.method3992(-9065, var8 + 1, var9, 128);
                this.method3992(-9065, var8, var9 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3992(-9065, var8, var9, 160);
                this.method3992(-9065, var8, var9 - 1, 2);
                this.method3992(-9065, var8 - 1, var9, 8);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg3 == 0) {
                    this.method3992(-9065, var8, var9, 65536);
                    this.method3992(-9065, var8 - 1, var9, 4096);
                }
                if (arg3 == 1) {
                    this.method3992(-9065, var8, var9, 1024);
                    this.method3992(-9065, var8, var9 + 1, 16384);
                }
                if (arg3 == 2) {
                    this.method3992(-9065, var8, var9, 4096);
                    this.method3992(-9065, var8 + 1, var9, 65536);
                }
                if (arg3 == 3) {
                    this.method3992(-9065, var8, var9, 16384);
                    this.method3992(-9065, var8, var9 - 1, 1024);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg3 == 0) {
                    this.method3992(-9065, var8, var9, 512);
                    this.method3992(-9065, var8 - 1, var9 - -1, 8192);
                }
                if (arg3 == 1) {
                    this.method3992(-9065, var8, var9, 2048);
                    this.method3992(-9065, var8 + 1, var9 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method3992(-9065, var8, var9, 8192);
                    this.method3992(-9065, var8 + 1, var9 - 1, 512);
                }
                if (arg3 == 3) {
                    this.method3992(-9065, var8, var9, 32768);
                    this.method3992(-9065, var8 - 1, var9 - 1, 2048);
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    this.method3992(-9065, var8, var9, 66560);
                    this.method3992(-9065, var8 - 1, var9, 4096);
                    this.method3992(-9065, var8, var9 + 1, 16384);
                }
                if (arg3 == 1) {
                    this.method3992(-9065, var8, var9, 5120);
                    this.method3992(-9065, var8, var9 + 1, 16384);
                    this.method3992(-9065, var8 + 1, var9, 65536);
                }
                if (arg3 == 2) {
                    this.method3992(-9065, var8, var9, 20480);
                    this.method3992(-9065, var8 + 1, var9, 65536);
                    this.method3992(-9065, var8, var9 - 1, 1024);
                }
                if (arg3 == 3) {
                    this.method3992(-9065, var8, var9, 81920);
                    this.method3992(-9065, var8, var9 - 1, 1024);
                    this.method3992(-9065, var8 - 1, var9, 4096);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg6 == 0) {
            if (arg3 == 0) {
                this.method3992(-9065, var8, var9, 536870912);
                this.method3992(-9065, var8 - 1, var9, 33554432);
            }
            if (arg3 == 1) {
                this.method3992(-9065, var8, var9, 8388608);
                this.method3992(-9065, var8, var9 + 1, 134217728);
            }
            if (arg3 == 2) {
                this.method3992(-9065, var8, var9, 33554432);
                this.method3992(-9065, var8 + 1, var9, 536870912);
            }
            if (arg3 == 3) {
                this.method3992(-9065, var8, var9, 134217728);
                this.method3992(-9065, var8, var9 - 1, 8388608);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg3 == 0) {
                this.method3992(-9065, var8, var9, 4194304);
                this.method3992(-9065, var8 - 1, var9 + 1, 67108864);
            }
            if (arg3 == 1) {
                this.method3992(-9065, var8, var9, 16777216);
                this.method3992(-9065, var8 + 1, var9 + 1, 268435456);
            }
            if (arg3 == 2) {
                this.method3992(-9065, var8, var9, 67108864);
                this.method3992(-9065, var8 + 1, var9 - 1, 4194304);
            }
            if (arg3 == 3) {
                this.method3992(-9065, var8, var9, 268435456);
                this.method3992(-9065, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3992(-9065, var8, var9, 545259520);
            this.method3992(-9065, var8 - 1, var9, 33554432);
            this.method3992(-9065, var8, var9 + 1, 134217728);
        }
        if (arg3 == 1) {
            this.method3992(-9065, var8, var9, 41943040);
            this.method3992(-9065, var8, var9 + 1, 134217728);
            this.method3992(-9065, var8 + 1, var9, 536870912);
        }
        if (arg3 == 2) {
            this.method3992(-9065, var8, var9, 167772160);
            this.method3992(-9065, var8 + 1, var9, 536870912);
            this.method3992(-9065, var8, var9 - 1, 8388608);
        }
        if (arg3 == 3) {
            this.method3992(-9065, var8, var9, 671088640);
            this.method3992(-9065, var8, var9 - 1, 8388608);
            this.method3992(-9065, var8 - 1, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method3998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9997++;
        if (arg4 == arg6) {
            if (arg5 == arg7 && arg0 == arg1) {
                return true;
            }
        } else if (arg7 <= arg5 && (arg4 + arg7 - 1) >= arg5 && arg0 <= arg0 && arg0 + arg4 - 1 >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field10004;
        int var10 = arg5 - this.field9992;
        int var11 = arg1 - this.field10004;
        int var12 = arg7 - this.field9992;
        if (arg4 == 1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field9991[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field9991[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field9991[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field9991[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field9991[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field9991[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field9991[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field9991[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field9991[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field9991[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field9991[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var12 - 1;
            int var14 = var11 + arg4 - 1;
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var10 - arg4 == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field9991[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 - arg4 == var11 && (this.field9991[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 >= var12 && var13 >= var10 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - arg4) == var12 && var9 >= var11 && var9 <= var14 && (this.field9991[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field9991[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 + 1 == var11 && (this.field9991[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 - arg4 == var11 && (this.field9991[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 >= var12 && var10 <= var13 && var9 - arg4 == var11) {
                        return true;
                    }
                    if ((var10 - arg4) == var12 && var11 <= var9 && var14 >= var9 && (this.field9991[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 >= var11 && var9 <= var14 && (this.field9991[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var10 - arg4 == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 <= var9 && var14 >= var9 && (this.field9991[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 - arg4 == var11 && (this.field9991[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - arg4 == var12 && var9 >= var11 && var9 <= var14 && (this.field9991[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 - arg4 == var11 && (this.field9991[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - arg4) == var12 && var9 >= var11 && var9 <= var14 && (this.field9991[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field9991[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 - arg4 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 - arg4) == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field9991[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field9991[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 - arg4) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var12 <= var10 && var13 >= var10 && var9 + 1 == var11 && (this.field9991[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var10 <= var13 && (var9 - arg4) == var11 && (this.field9991[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg4 == var12 && var11 <= var9 && var9 <= var14 && (this.field9991[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 >= var11 && var14 >= var9 && (this.field9991[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIZIIIZ)V")
    public final void method3999(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field9992;
        field9998++;
        int var9 = arg4 - this.field10004;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method3985(var8, 16, 128, var9);
                this.method3985(var8 - 1, 16, 8, var9);
            }
            if (arg3 == 1) {
                this.method3985(var8, 16, 2, var9);
                this.method3985(var8, 16, 32, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3985(var8, 16, 8, var9);
                this.method3985(var8 + 1, 16, 128, var9);
            }
            if (arg3 == 3) {
                this.method3985(var8, 16, 32, var9);
                this.method3985(var8, 16, 2, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method3985(var8, 16, 1, var9);
                this.method3985(var8 - 1, 16, 16, var9 + 1);
            }
            if (arg3 == 1) {
                this.method3985(var8, 16, 4, var9);
                this.method3985(var8 + 1, 16, 64, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3985(var8, 16, 16, var9);
                this.method3985(var8 + 1, 16, 1, var9 - 1);
            }
            if (arg3 == 3) {
                this.method3985(var8, 16, 64, var9);
                this.method3985(var8 - 1, 16, 4, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method3985(var8, 16, 130, var9);
                this.method3985(var8 - 1, 16, 8, var9);
                this.method3985(var8, 16, 32, var9 + 1);
            }
            if (arg3 == 1) {
                this.method3985(var8, 16, 10, var9);
                this.method3985(var8, 16, 32, var9 + 1);
                this.method3985(var8 + 1, 16, 128, var9);
            }
            if (arg3 == 2) {
                this.method3985(var8, 16, 40, var9);
                this.method3985(var8 + 1, 16, 128, var9);
                this.method3985(var8, 16, 2, var9 - 1);
            }
            if (arg3 == 3) {
                this.method3985(var8, 16, 160, var9);
                this.method3985(var8, 16, 2, var9 - 1);
                this.method3985(var8 - 1, 16, 8, var9);
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method3985(var8, 16, 65536, var9);
                    this.method3985(var8 - 1, 16, 4096, var9);
                }
                if (arg3 == 1) {
                    this.method3985(var8, 16, 1024, var9);
                    this.method3985(var8, 16, 16384, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method3985(var8, 16, 4096, var9);
                    this.method3985(var8 + 1, 16, 65536, var9);
                }
                if (arg3 == 3) {
                    this.method3985(var8, 16, 16384, var9);
                    this.method3985(var8, 16, 1024, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method3985(var8, 16, 512, var9);
                    this.method3985(var8 - 1, 16, 8192, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method3985(var8, 16, 2048, var9);
                    this.method3985(var8 + 1, 16, 32768, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method3985(var8, 16, 8192, var9);
                    this.method3985(var8 + 1, 16, 512, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method3985(var8, 16, 32768, var9);
                    this.method3985(var8 - 1, 16, 2048, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method3985(var8, 16, 66560, var9);
                    this.method3985(var8 - 1, 16, 4096, var9);
                    this.method3985(var8, 16, 16384, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method3985(var8, 16, 5120, var9);
                    this.method3985(var8, 16, 16384, var9 + 1);
                    this.method3985(var8 + 1, 16, 65536, var9);
                }
                if (arg3 == 2) {
                    this.method3985(var8, 16, 20480, var9);
                    this.method3985(var8 + 1, 16, 65536, var9);
                    this.method3985(var8, 16, 1024, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method3985(var8, 16, 81920, var9);
                    this.method3985(var8, 16, 1024, var9 - 1);
                    this.method3985(var8 - 1, 16, 4096, var9);
                }
            }
        }
        int var10 = 100 / ((58 - arg1) / 45);
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method3985(var8, 16, 536870912, var9);
                this.method3985(var8 - 1, 16, 33554432, var9);
            }
            if (arg3 == 1) {
                this.method3985(var8, 16, 8388608, var9);
                this.method3985(var8, 16, 134217728, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3985(var8, 16, 33554432, var9);
                this.method3985(var8 + 1, 16, 536870912, var9);
            }
            if (arg3 == 3) {
                this.method3985(var8, 16, 134217728, var9);
                this.method3985(var8, 16, 8388608, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method3985(var8, 16, 4194304, var9);
                this.method3985(var8 - 1, 16, 67108864, var9 + 1);
            }
            if (arg3 == 1) {
                this.method3985(var8, 16, 16777216, var9);
                this.method3985(var8 + 1, 16, 268435456, var9 + 1);
            }
            if (arg3 == 2) {
                this.method3985(var8, 16, 67108864, var9);
                this.method3985(var8 + 1, 16, 4194304, var9 - 1);
            }
            if (arg3 == 3) {
                this.method3985(var8, 16, 268435456, var9);
                this.method3985(var8 - 1, 16, 16777216, var9 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3985(var8, 16, 545259520, var9);
            this.method3985(var8 - 1, 16, 33554432, var9);
            this.method3985(var8, 16, 134217728, var9 + 1);
        }
        if (arg3 == 1) {
            this.method3985(var8, 16, 41943040, var9);
            this.method3985(var8, 16, 134217728, var9 + 1);
            this.method3985(var8 + 1, 16, 536870912, var9);
        }
        if (arg3 == 2) {
            this.method3985(var8, 16, 167772160, var9);
            this.method3985(var8 + 1, 16, 536870912, var9);
            this.method3985(var8, 16, 8388608, var9 - 1);
        }
        if (arg3 == 3) {
            this.method3985(var8, 16, 671088640, var9);
            this.method3985(var8, 16, 8388608, var9 - 1);
            this.method3985(var8 - 1, 16, 33554432, var9);
            return;
        }
    }
}
