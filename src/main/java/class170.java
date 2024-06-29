import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class170 {

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    private int field2790;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    private int field2779;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    private int field2760;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    private int field2769;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "[[I")
    public int[][] field2787;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2765 = -1;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Ldf;")
    public static class51 field2781 = class46.method233("not yet implemented", 100);

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field2780 = 0;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "Ldf;")
    public static class51 field2792 = class46.method233("Welt", 100);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
    public final void method1178(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2760;
        int var5 = arg2 - this.field2769;
        field2768++;
        this.field2787[var4][var5] = class82.method642(this.field2787[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIII)V")
    private final void method1179(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 109) {
            field2777++;
            this.field2787[arg1][arg3] = class191.method1366(this.field2787[arg1][arg3], ~arg2);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBIIIII)Z")
    public final boolean method1180(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2766++;
        if (arg4 == 1) {
            if (arg3 == arg7 && arg5 == arg6) {
                return true;
            }
        } else if (arg3 <= arg7 && arg7 <= (arg4 + arg3 - 1) && arg6 <= arg6 && arg6 <= arg6 + arg4 - 1) {
            return true;
        }
        int var9 = arg3 - this.field2760;
        int var10 = arg5 - this.field2769;
        int var11 = arg7 - this.field2760;
        int var12 = arg6 - this.field2769;
        if (arg4 == 1) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2787[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2787[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2787[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2787[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2787[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2787[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2787[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2787[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field2787[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field2787[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field2787[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var10 - 1;
            int var14 = var9 + arg4 - 1;
            if (arg0 == 0) {
                if (arg1 == 0) {
                    if ((var11 - arg4) == var9 && var12 >= var10 && var13 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && var12 + 1 == var10 && (this.field2787[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var14 && var12 - arg4 == var10 && (this.field2787[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 <= var11 && var11 <= var14 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 - arg4 == var9 && var10 <= var12 && var12 <= var13 && (this.field2787[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var13 && (this.field2787[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 + 1) == var9 && var12 >= var10 && var13 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && var12 + 1 == var10 && (this.field2787[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && var12 - arg4 == var10 && (this.field2787[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 <= var11 && var11 <= var14 && var12 - arg4 == var10) {
                        return true;
                    }
                    if (var11 - arg4 == var9 && var10 <= var12 && var13 >= var12 && (this.field2787[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var13 && (this.field2787[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    if ((var11 - arg4) == var9 && var12 >= var10 && var12 <= var13) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var14 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 <= var12 && var13 >= var12 && (this.field2787[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && (var12 - arg4) == var10 && (this.field2787[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - arg4) == var9 && var10 <= var12 && var12 <= var13 && (this.field2787[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var14 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var13 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && var12 - arg4 == var10 && (this.field2787[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - arg4 == var9 && var10 <= var12 && var13 >= var12 && (this.field2787[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var14 && (var12 + 1) == var10 && (this.field2787[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var13) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var14 && var12 - arg4 == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var11 - arg4) == var9 && var10 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && (var12 + 1) == var10 && (this.field2787[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var13 >= var12 && (this.field2787[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && var12 - arg4 == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 <= var11 && var14 >= var11 && var12 + 1 == var10 && (this.field2787[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var9 && var14 >= var11 && var12 - arg4 == var10 && (this.field2787[var11][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg4 == var9 && var12 >= var10 && var12 <= var13 && (this.field2787[var14][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var12 >= var10 && var13 >= var12 && (this.field2787[var9][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 >= -37) {
            field2785 = 101;
        }
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1181(int arg0) {
        class128.field2142.method1353(arg0 ^ 0xFFFFFFA6);
        field2774++;
        if (arg0 != 2) {
            method1181(-82);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V")
    public final void method1182(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2769;
        field2761++;
        int var5 = arg2 - this.field2760;
        this.field2787[var5][var4] = class82.method642(this.field2787[var5][var4], 2097152);
        if (arg1 <= 22) {
            this.method1190(28, 125, false, -31, -91, 14);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2776++;
        if (arg5 > 1) {
            return this.method1187(arg2, arg3, 16019, arg5, arg7, arg1, arg5, arg0, arg6) ? true : this.method1194(arg5, arg0, arg2, arg3, arg8, -8374, arg7, arg6, arg1, arg5);
        }
        int var10 = arg0 + arg3 - 1;
        int var11 = arg6 + arg1 + arg4;
        if (arg0 <= arg7 && var10 >= arg7 && arg2 >= arg6 && var11 >= arg2) {
            return true;
        } else if (arg0 - 1 == arg7 && arg2 >= arg6 && var11 >= arg2 && (this.field2787[arg7 - this.field2760][arg2 - this.field2769] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg7 && arg2 >= arg6 && arg2 <= var11 && (this.field2787[arg7 - this.field2760][arg2 - this.field2769] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg2 && arg7 >= arg0 && arg7 <= var10 && (this.field2787[arg7 - this.field2760][arg2 - this.field2769] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg2 && arg0 <= arg7 && var10 >= arg7 && (this.field2787[arg7 - this.field2760][arg2 - this.field2769] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIIIIB)V")
    public final void method1184(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2778++;
        int var7 = arg3 - this.field2760;
        int var8 = arg4 - this.field2769;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method1191(var8, (byte) 103, 128, var7);
                this.method1191(var8, (byte) 105, 8, var7 - 1);
            }
            if (arg1 == 1) {
                this.method1191(var8, (byte) 127, 2, var7);
                this.method1191(var8 + 1, (byte) 121, 32, var7);
            }
            if (arg1 == 2) {
                this.method1191(var8, (byte) 84, 8, var7);
                this.method1191(var8, (byte) 89, 128, var7 + 1);
            }
            if (arg1 == 3) {
                this.method1191(var8, (byte) 114, 32, var7);
                this.method1191(var8 - 1, (byte) 86, 2, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method1191(var8, (byte) 94, 1, var7);
                this.method1191(var8 + 1, (byte) 99, 16, var7 - 1);
            }
            if (arg1 == 1) {
                this.method1191(var8, (byte) 88, 4, var7);
                this.method1191(var8 + 1, (byte) 113, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1191(var8, (byte) 114, 16, var7);
                this.method1191(var8 - 1, (byte) 102, 1, var7 + 1);
            }
            if (arg1 == 3) {
                this.method1191(var8, (byte) 107, 64, var7);
                this.method1191(var8 - 1, (byte) 112, 4, var7 - 1);
            }
        }
        if (arg5 != -77) {
            return;
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method1191(var8, (byte) 96, 130, var7);
                this.method1191(var8, (byte) 103, 8, var7 - 1);
                this.method1191(var8 + 1, (byte) 92, 32, var7);
            }
            if (arg1 == 1) {
                this.method1191(var8, (byte) 89, 10, var7);
                this.method1191(var8 + 1, (byte) 120, 32, var7);
                this.method1191(var8, (byte) 91, 128, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1191(var8, (byte) 118, 40, var7);
                this.method1191(var8, (byte) 92, 128, var7 + 1);
                this.method1191(var8 - 1, (byte) 112, 2, var7);
            }
            if (arg1 == 3) {
                this.method1191(var8, (byte) 113, 160, var7);
                this.method1191(var8 - 1, (byte) 98, 2, var7);
                this.method1191(var8, (byte) 126, 8, var7 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method1191(var8, (byte) 89, 65536, var7);
                this.method1191(var8, (byte) 89, 4096, var7 - 1);
            }
            if (arg1 == 1) {
                this.method1191(var8, (byte) 110, 1024, var7);
                this.method1191(var8 + 1, (byte) 125, 16384, var7);
            }
            if (arg1 == 2) {
                this.method1191(var8, (byte) 75, 4096, var7);
                this.method1191(var8, (byte) 77, 65536, var7 + 1);
            }
            if (arg1 == 3) {
                this.method1191(var8, (byte) 114, 16384, var7);
                this.method1191(var8 - 1, (byte) 118, 1024, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method1191(var8, (byte) 106, 512, var7);
                this.method1191(var8 + 1, (byte) 102, 8192, var7 - 1);
            }
            if (arg1 == 1) {
                this.method1191(var8, (byte) 116, 2048, var7);
                this.method1191(var8 + 1, (byte) 92, 32768, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1191(var8, (byte) 113, 8192, var7);
                this.method1191(var8 - 1, (byte) 83, 512, var7 + 1);
            }
            if (arg1 == 3) {
                this.method1191(var8, (byte) 101, 32768, var7);
                this.method1191(var8 - 1, (byte) 98, 2048, var7 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1191(var8, (byte) 88, 66560, var7);
            this.method1191(var8, (byte) 94, 4096, var7 - 1);
            this.method1191(var8 + 1, (byte) 80, 16384, var7);
        }
        if (arg1 == 1) {
            this.method1191(var8, (byte) 90, 5120, var7);
            this.method1191(var8 + 1, (byte) 83, 16384, var7);
            this.method1191(var8, (byte) 92, 65536, var7 + 1);
        }
        if (arg1 == 2) {
            this.method1191(var8, (byte) 116, 20480, var7);
            this.method1191(var8, (byte) 119, 65536, var7 + 1);
            this.method1191(var8 - 1, (byte) 90, 1024, var7);
        }
        if (arg1 == 3) {
            this.method1191(var8, (byte) 113, 81920, var7);
            this.method1191(var8 - 1, (byte) 103, 1024, var7);
            this.method1191(var8, (byte) 81, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lg;")
    public static final class254 method1185(int arg0) {
        field2782++;
        int var1 = class221.field3837[0] * class106.field1751[0];
        byte[] var2 = class67.field1100[0];
        class254 var6;
        if (class10.field107[arg0]) {
            byte[] var3 = class231.field4032[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class82.method642(class191.method1366(-16777216, var3[var5] << 24), class139.field2327[class191.method1366(var2[var5], 255)]);
            }
            var6 = new class152(class13.field194, class122.field2078, class96.field1591[0], class125.field2123[0], class221.field3837[0], class106.field1751[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class139.field2327[class191.method1366(255, var2[var8])];
            }
            var6 = new class254(class13.field194, class122.field2078, class96.field1591[0], class125.field2123[0], class221.field3837[0], class106.field1751[0], var7);
        }
        class111.method804((byte) -14);
        return var6;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public static void method1186(int arg0) {
        field2792 = null;
        field2781 = null;
        if (arg0 != -6870) {
            method1188(50, -1, -10, 82, -20, 8, -91, -70);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIIIIIIII)Z")
    private final boolean method1187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2791++;
        if (arg2 != 16019) {
            return true;
        } else if (arg1 + arg7 > arg4 && arg7 < (arg4 + arg6)) {
            return arg8 + arg5 > arg0 && (arg0 + arg3) > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2789++;
        int var8 = arg4 + arg7;
        int var9 = arg6 - arg4;
        int var10 = arg3 - arg4;
        for (int var11 = arg7; var11 < var8; var11++) {
            class242.method1660((byte) -79, class80.field1324[var11], arg2, arg6, arg1);
        }
        for (int var12 = arg3; var12 > var10; var12--) {
            class242.method1660((byte) -79, class80.field1324[var12], arg2, arg6, arg1);
        }
        int var13 = arg1 + arg4;
        if (arg0 != -23141) {
            return;
        }
        for (int var14 = var8; var14 <= var10; var14++) {
            int[] var15 = class80.field1324[var14];
            class242.method1660((byte) -79, var15, arg2, var13, arg1);
            class242.method1660((byte) -79, var15, arg5, var9, var13);
            class242.method1660((byte) -79, var15, arg2, arg6, var9);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIZII)V")
    public final void method1189(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field2760;
        if (arg2 != 2) {
            this.field2790 = 125;
        }
        field2793++;
        int var8 = arg5 - this.field2769;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1179((byte) 122, var7, 128, var8);
                this.method1179((byte) 123, var7 - 1, 8, var8);
            }
            if (arg0 == 1) {
                this.method1179((byte) 120, var7, 2, var8);
                this.method1179((byte) 126, var7, 32, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1179((byte) 111, var7, 8, var8);
                this.method1179((byte) 125, var7 + 1, 128, var8);
            }
            if (arg0 == 3) {
                this.method1179((byte) 120, var7, 32, var8);
                this.method1179((byte) 116, var7, 2, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1179((byte) 121, var7, 1, var8);
                this.method1179((byte) 119, var7 - 1, 16, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1179((byte) 113, var7, 4, var8);
                this.method1179((byte) 122, var7 + 1, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1179((byte) 117, var7, 16, var8);
                this.method1179((byte) 114, var7 + 1, 1, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1179((byte) 120, var7, 64, var8);
                this.method1179((byte) 111, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1179((byte) 110, var7, 130, var8);
                this.method1179((byte) 117, var7 - 1, 8, var8);
                this.method1179((byte) 117, var7, 32, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1179((byte) 114, var7, 10, var8);
                this.method1179((byte) 126, var7, 32, var8 + 1);
                this.method1179((byte) 118, var7 + 1, 128, var8);
            }
            if (arg0 == 2) {
                this.method1179((byte) 119, var7, 40, var8);
                this.method1179((byte) 112, var7 + 1, 128, var8);
                this.method1179((byte) 124, var7, 2, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1179((byte) 112, var7, 160, var8);
                this.method1179((byte) 119, var7, 2, var8 - 1);
                this.method1179((byte) 111, var7 - 1, 8, var8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1179((byte) 122, var7, 65536, var8);
                this.method1179((byte) 122, var7 - 1, 4096, var8);
            }
            if (arg0 == 1) {
                this.method1179((byte) 114, var7, 1024, var8);
                this.method1179((byte) 124, var7, 16384, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1179((byte) 117, var7, 4096, var8);
                this.method1179((byte) 123, var7 + 1, 65536, var8);
            }
            if (arg0 == 3) {
                this.method1179((byte) 112, var7, 16384, var8);
                this.method1179((byte) 123, var7, 1024, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1179((byte) 124, var7, 512, var8);
                this.method1179((byte) 115, var7 - 1, 8192, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1179((byte) 111, var7, 2048, var8);
                this.method1179((byte) 121, var7 + 1, 32768, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1179((byte) 111, var7, 8192, var8);
                this.method1179((byte) 114, var7 + 1, 512, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1179((byte) 126, var7, 32768, var8);
                this.method1179((byte) 112, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1179((byte) 126, var7, 66560, var8);
            this.method1179((byte) 112, var7 - 1, 4096, var8);
            this.method1179((byte) 121, var7, 16384, var8 + 1);
        }
        if (arg0 == 1) {
            this.method1179((byte) 126, var7, 5120, var8);
            this.method1179((byte) 118, var7, 16384, var8 + 1);
            this.method1179((byte) 126, var7 + 1, 65536, var8);
        }
        if (arg0 == 2) {
            this.method1179((byte) 114, var7, 20480, var8);
            this.method1179((byte) 126, var7 + 1, 65536, var8);
            this.method1179((byte) 110, var7, 1024, var8 - 1);
        }
        if (arg0 == 3) {
            this.method1179((byte) 122, var7, 81920, var8);
            this.method1179((byte) 116, var7, 1024, var8 - 1);
            this.method1179((byte) 121, var7 - 1, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZIII)V")
    public final void method1190(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field2769;
        int var8 = arg3 - this.field2760;
        field2783++;
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < (arg0 + var8); var10++) {
            if (var10 >= 0 && this.field2779 > var10) {
                for (int var11 = var7; var11 < arg1 + var7; var11++) {
                    if (var11 >= 0 && this.field2790 > var11) {
                        this.method1191(var11, (byte) 127, var9, var10);
                    }
                }
            }
        }
        if (arg4 != 19661184) {
            this.field2769 = 53;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBII)V")
    private final void method1191(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 73) {
            field2784 = -125;
        }
        this.field2787[arg3][arg0] = class82.method642(this.field2787[arg3][arg0], arg2);
        field2767++;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public final void method1192(int arg0) {
        if (arg0 != 16777215) {
            this.method1180(52, -94, (byte) -78, -13, 30, -61, -67, -91);
        }
        for (int var2 = 0; var2 < this.field2779; var2++) {
            for (int var3 = 0; var3 < this.field2790; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2779 - 5 <= var2 || var3 >= this.field2790 - 5) {
                    this.field2787[var2][var3] = 16777215;
                } else {
                    this.field2787[var2][var3] = 16777216;
                }
            }
        }
        field2762++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
    public final void method1193(byte arg0, int arg1, int arg2) {
        field2770++;
        if (arg0 > 96) {
            int var4 = arg2 - this.field2769;
            int var5 = arg1 - this.field2760;
            this.field2787[var5][var4] = class191.method1366(this.field2787[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method1194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -8374) {
            field2786 = -82;
        }
        int var11 = arg6 + arg9;
        int var12 = arg2 + arg0;
        field2771++;
        int var13 = arg7 + arg8;
        int var14 = arg1 + arg3;
        if (arg1 <= arg6 && var14 > arg6) {
            if (arg7 == var12 && (arg4 & 0x4) == 0) {
                int var15 = var11 <= var14 ? var11 : var14;
                for (int var16 = arg6; var16 < var15; var16++) {
                    if ((this.field2787[var16 - this.field2760][var12 - this.field2769 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var13 && (arg4 & 0x1) == 0) {
                int var17 = arg6;
                int var18 = var11 > var14 ? var14 : var11;
                while (var17 < var18) {
                    if ((this.field2787[var17 - this.field2760][arg2 - this.field2769] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg1 < var11 && var14 >= var11) {
            if (arg7 == var12 && (arg4 & 0x4) == 0) {
                for (int var19 = arg1; var19 < var11; var19++) {
                    if ((this.field2787[var19 - this.field2760][var12 - this.field2769 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var13 && (arg4 & 0x1) == 0) {
                for (int var20 = arg1; var20 < var11; var20++) {
                    if ((this.field2787[var20 - this.field2760][arg2 - this.field2769] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg2 >= arg7 && var13 > arg2) {
            if (arg1 == var11 && (arg4 & 0x8) == 0) {
                int var21 = arg2;
                int var22 = var13 < var12 ? var13 : var12;
                while (var21 < var22) {
                    if ((this.field2787[var11 - this.field2760 - 1][var21 - this.field2769] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg6 == var14 && (arg4 & 0x2) == 0) {
                int var23 = arg2;
                int var24 = var12 <= var13 ? var12 : var13;
                while (var23 < var24) {
                    if ((this.field2787[arg6 - this.field2760][var23 - this.field2769] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg7 < var12 && var13 >= var12) {
            if (arg1 == var11 && (arg4 & 0x8) == 0) {
                for (int var25 = arg7; var25 < var12; var25++) {
                    if ((this.field2787[var11 - this.field2760 - 1][var25 - this.field2769] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var14 && (arg4 & 0x2) == 0) {
                for (int var26 = arg7; var26 < var12; var26++) {
                    if ((this.field2787[arg6 - this.field2760][var26 - this.field2769] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BIII)I")
    public static final int method1195(byte[] arg0, int arg1, int arg2, int arg3) {
        field2772++;
        int var4 = -1;
        int var5 = arg1;
        if (arg3 != 6915) {
            field2786 = 20;
        }
        while (arg2 > var5) {
            var4 = class34.field511[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIBIZI)V")
    public final void method1196(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg0 - this.field2760;
        int var9 = arg6 - this.field2769;
        int var10 = 256;
        if (arg5) {
            var10 += 131072;
        }
        field2764++;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg4;
            arg4 = arg2;
            arg2 = var11;
        }
        int var12 = var8;
        if (arg3 < 36) {
            return;
        }
        while (arg4 + var8 > var12) {
            if (var12 >= 0 && var12 < this.field2779) {
                for (int var13 = var9; var13 < (arg2 + var9); var13++) {
                    if (var13 >= 0 && var13 < this.field2790) {
                        this.method1179((byte) 116, var12, var10, var13);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method1197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2763++;
        if (arg2 == 1) {
            if (arg6 == arg7 && arg0 == arg4) {
                return true;
            }
        } else if (arg7 >= arg6 && arg7 <= arg6 + arg2 - 1 && arg4 >= arg4 && arg2 + arg4 - 1 >= arg4) {
            return true;
        }
        int var9 = arg7 - this.field2760;
        if (arg1 < 51) {
            field2765 = 20;
        }
        int var10 = arg6 - this.field2760;
        int var11 = arg0 - this.field2769;
        int var12 = arg4 - this.field2769;
        if (arg2 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2787[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field2787[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2787[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field2787[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2787[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field2787[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2787[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field2787[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field2787[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field2787[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field2787[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field2787[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg2 - 1;
            int var14 = arg2 + var11 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var9 + 1 == var10 && var11 <= var12 && var14 >= var12 && (this.field2787[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 - arg2 == var11 && (this.field2787[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - arg2) == var10 && var12 >= var11 && var14 >= var12 && (this.field2787[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 - arg2 == var11 && (this.field2787[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - arg2) == var10 && var12 >= var11 && var12 <= var14 && (this.field2787[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var12 + 1 == var11 && (this.field2787[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14 && (this.field2787[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11 && (this.field2787[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11 && (this.field2787[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var10 && var13 >= var9 && var12 - arg2 == var11 && (this.field2787[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg2) == var10 && var12 >= var11 && var12 <= var14 && (this.field2787[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var11 <= var12 && var12 <= var14 && (this.field2787[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(II)V")
    public class170(int arg0, int arg1) {
        this.field2790 = arg1;
        this.field2779 = arg0;
        this.field2760 = 0;
        this.field2769 = 0;
        this.field2787 = new int[this.field2779][this.field2790];
        this.method1192(16777215);
    }
}
