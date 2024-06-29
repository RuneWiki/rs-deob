import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class151 {

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    private int field2913;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    private int field2920;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    private int field2906;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    private int field2927;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[[I")
    public int[][] field2916;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[J")
    public static long[] field2910 = new long[200];

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field2914 = 0;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lkb;")
    private static class93 field2918 = class76.method390("Please wait)3)3)3", 0);

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Lkb;")
    public static class93 field2917 = field2918;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Lag;")
    public static class8 field2908 = new class8(5000);

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field2932 = 0;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Lkb;")
    public static class93 field2933 = class76.method390("Startseite auf (WSpielkonto wiederherstellen(W)3", 0);

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "[Z")
    public static boolean[] field2934 = new boolean[100];

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "[[[I")
    public static int[][][] field2935 = new int[4][105][105];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIII)V")
    private final void method935(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 98 / ((-arg0 - 49) / 54);
        field2931++;
        this.field2916[arg3][arg2] = class112.method607(this.field2916[arg3][arg2], arg1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIZ)V")
    public final void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg5 - this.field2906;
        int var9 = arg3 - this.field2920;
        int var10 = 256;
        field2924++;
        if (arg6) {
            var10 += 131072;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg2;
            arg2 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field2927) {
                for (int var13 = var8; var13 < arg0 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field2913) {
                        this.method942(var10, -1, var13, var12);
                    }
                }
            }
        }
        if (arg1 != -4) {
            field2914 = -25;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2911++;
        int var9 = arg3 + arg2 - 1;
        int var10 = arg6 + arg5 - 1;
        if (arg2 <= arg4 && arg4 <= var9 && arg7 >= arg6 && var10 >= arg7) {
            return true;
        } else if (arg2 - arg1 == arg4 && arg7 >= arg6 && arg7 <= var10 && (this.field2916[arg4 - this.field2920][arg7 - this.field2906] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg6 <= arg7 && var10 >= arg7 && (this.field2916[arg4 - this.field2920][arg7 - this.field2906] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg7 && arg4 >= arg2 && arg4 <= var9 && (this.field2916[arg4 - this.field2920][arg7 - this.field2906] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg2 <= arg4 && arg4 <= var9 && (this.field2916[arg4 - this.field2920][arg7 - this.field2906] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBI)V")
    public final void method938(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field2906;
        int var5 = arg2 - this.field2920;
        int var6 = -90 / ((45 - arg1) / 57);
        field2925++;
        this.field2916[var5][var4] = class91.method479(this.field2916[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    public final void method939(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2906;
        int var5 = arg0 - this.field2920;
        if (arg1 != 11243) {
            field2910 = null;
        }
        this.field2916[var5][var4] = class112.method607(this.field2916[var5][var4], 262144);
        field2928++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IBI)V")
    public final void method940(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field2920;
        int var5 = arg2 - this.field2906;
        this.field2916[var4][var5] = class112.method607(this.field2916[var4][var5], 2097152);
        field2919++;
        if (arg1 >= -82) {
            field2932 = -70;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIZ)V")
    public final void method941(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 != 5) {
            this.field2927 = 110;
        }
        int var7 = arg3 - this.field2920;
        field2930++;
        int var8 = arg2 - this.field2906;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method935((byte) -118, 128, var8, var7);
                this.method935((byte) 107, 8, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method935((byte) -118, 2, var8, var7);
                this.method935((byte) -114, 32, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method935((byte) -109, 8, var8, var7);
                this.method935((byte) -104, 128, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method935((byte) -128, 32, var8, var7);
                this.method935((byte) -117, 2, var8 - 1, var7);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method935((byte) -114, 1, var8, var7);
                this.method935((byte) -122, 16, var8 + 1, var7 + -1);
            }
            if (arg4 == 1) {
                this.method935((byte) -117, 4, var8, var7);
                this.method935((byte) 113, 64, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method935((byte) 36, 16, var8, var7);
                this.method935((byte) 105, 1, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method935((byte) -115, 64, var8, var7);
                this.method935((byte) -108, 4, var8 - 1, var7 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method935((byte) -123, 130, var8, var7);
                this.method935((byte) -109, 8, var8, var7 - 1);
                this.method935((byte) 93, 32, var8 + 1, var7);
            }
            if (arg4 == 1) {
                this.method935((byte) 69, 10, var8, var7);
                this.method935((byte) 38, 32, var8 + 1, var7);
                this.method935((byte) -112, 128, var8, var7 + 1);
            }
            if (arg4 == 2) {
                this.method935((byte) 62, 40, var8, var7);
                this.method935((byte) 16, 128, var8, var7 + 1);
                this.method935((byte) 82, 2, var8 - 1, var7);
            }
            if (arg4 == 3) {
                this.method935((byte) 64, 160, var8, var7);
                this.method935((byte) 20, 2, var8 - 1, var7);
                this.method935((byte) 28, 8, var8, var7 - 1);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method935((byte) 39, 65536, var8, var7);
                this.method935((byte) 79, 4096, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method935((byte) 104, 1024, var8, var7);
                this.method935((byte) -114, 16384, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method935((byte) -107, 4096, var8, var7);
                this.method935((byte) 86, 65536, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method935((byte) -125, 16384, var8, var7);
                this.method935((byte) 56, 1024, var8 - 1, var7);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method935((byte) 50, 512, var8, var7);
                this.method935((byte) 97, 8192, var8 + 1, var7 + -1);
            }
            if (arg4 == 1) {
                this.method935((byte) 49, 2048, var8, var7);
                this.method935((byte) -126, 32768, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method935((byte) 111, 8192, var8, var7);
                this.method935((byte) 50, 512, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method935((byte) 114, 32768, var8, var7);
                this.method935((byte) -126, 2048, var8 - 1, var7 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method935((byte) -122, 66560, var8, var7);
            this.method935((byte) -125, 4096, var8, var7 - 1);
            this.method935((byte) -103, 16384, var8 + 1, var7);
        }
        if (arg4 == 1) {
            this.method935((byte) -106, 5120, var8, var7);
            this.method935((byte) 110, 16384, var8 + 1, var7);
            this.method935((byte) -121, 65536, var8, var7 + 1);
        }
        if (arg4 == 2) {
            this.method935((byte) -109, 20480, var8, var7);
            this.method935((byte) -111, 65536, var8, var7 + 1);
            this.method935((byte) -128, 1024, var8 - 1, var7);
        }
        if (arg4 == 3) {
            this.method935((byte) 125, 81920, var8, var7);
            this.method935((byte) -109, 1024, var8 - 1, var7);
            this.method935((byte) 63, 4096, var8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
    private final void method942(int arg0, int arg1, int arg2, int arg3) {
        this.field2916[arg3][arg2] = class91.method479(this.field2916[arg3][arg2], ~arg0);
        if (arg1 != -1) {
            this.field2906 = 127;
        }
        field2922++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lkb;")
    public static final class93 method943(int arg0, byte arg1) {
        field2915++;
        if (arg1 >= -68) {
            field2910 = null;
        }
        class93 var2 = class67.method357((byte) -128, arg0);
        for (int var3 = var2.method510(80) - 3; var3 > 0; var3 -= 3) {
            var2 = class203.method1321(new class93[] { var2.method497((byte) -89, var3, 0), class4.field69, var2.method514(68, var3) }, -36);
        }
        if (var2.method510(66) > 9) {
            return class203.method1321(new class93[] { class14.field253, var2.method497((byte) -80, var2.method510(101) - 8, 0), class138.field2660, class178.field3546, var2, class64.field1028 }, 96);
        } else if (var2.method510(65) > 6) {
            return class203.method1321(new class93[] { class195.field3824, var2.method497((byte) -84, var2.method510(112) - 4, 0), class47.field752, class178.field3546, var2, class64.field1028 }, 11);
        } else {
            return class203.method1321(new class93[] { class136.field2639, var2, class121.field2247 }, -71);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2912++;
        if (arg1 == arg6 && arg4 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field2920;
        if (arg0 != -1) {
            this.field2913 = 48;
        }
        int var9 = arg4 - this.field2906;
        int var10 = arg6 - this.field2920;
        int var11 = arg5 - this.field2906;
        if (arg2 == 0) {
            if (arg3 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field2916[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field2916[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field2916[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field2916[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field2916[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field2916[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field2916[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field2916[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var9 + 1 == var11 && (this.field2916[var10][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var9 - 1 == var11 && (this.field2916[var10][var11] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field2916[var10][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZII)V")
    public final void method945(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 != 3) {
            this.field2916 = null;
        }
        int var7 = arg2 - this.field2906;
        field2907++;
        int var8 = 256;
        int var9 = arg0 - this.field2920;
        if (arg3) {
            var8 += 131072;
        }
        for (int var10 = var9; var10 < var9 + arg1; var10++) {
            if (var10 >= 0 && var10 < this.field2927) {
                for (int var11 = var7; var11 < var7 + arg4; var11++) {
                    if (var11 >= 0 && this.field2913 > var11) {
                        this.method935((byte) 104, var8, var11, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public final void method946(int arg0) {
        field2923++;
        for (int var2 = arg0; var2 < this.field2927; var2++) {
            for (int var3 = 0; var3 < this.field2913; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2927 - 5 <= var2 || this.field2913 - 5 <= var3) {
                    this.field2916[var2][var3] = 16777215;
                } else {
                    this.field2916[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIZII)V")
    public final void method947(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field2906;
        int var8 = arg4 - this.field2920;
        field2929++;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method942(128, -1, var7, var8);
                this.method942(8, -1, var7, var8 - 1);
            }
            if (arg5 == 1) {
                this.method942(2, -1, var7, var8);
                this.method942(32, -1, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method942(8, -1, var7, var8);
                this.method942(128, -1, var7, var8 + 1);
            }
            if (arg5 == 3) {
                this.method942(32, -1, var7, var8);
                this.method942(2, -1, var7 - 1, var8);
            }
        }
        if (arg1 > -54) {
            field2934 = null;
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method942(1, -1, var7, var8);
                this.method942(16, -1, var7 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method942(4, -1, var7, var8);
                this.method942(64, -1, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method942(16, -1, var7, var8);
                this.method942(1, -1, var7 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method942(64, -1, var7, var8);
                this.method942(4, -1, var7 - 1, var8 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method942(130, -1, var7, var8);
                this.method942(8, -1, var7, var8 - 1);
                this.method942(32, -1, var7 + 1, var8);
            }
            if (arg5 == 1) {
                this.method942(10, -1, var7, var8);
                this.method942(32, -1, var7 + 1, var8);
                this.method942(128, -1, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method942(40, -1, var7, var8);
                this.method942(128, -1, var7, var8 + 1);
                this.method942(2, -1, var7 - 1, var8);
            }
            if (arg5 == 3) {
                this.method942(160, -1, var7, var8);
                this.method942(2, -1, var7 - 1, var8);
                this.method942(8, -1, var7, var8 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method942(65536, -1, var7, var8);
                this.method942(4096, -1, var7, var8 - 1);
            }
            if (arg5 == 1) {
                this.method942(1024, -1, var7, var8);
                this.method942(16384, -1, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method942(4096, -1, var7, var8);
                this.method942(65536, -1, var7, var8 + 1);
            }
            if (arg5 == 3) {
                this.method942(16384, -1, var7, var8);
                this.method942(1024, -1, var7 - 1, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method942(512, -1, var7, var8);
                this.method942(8192, -1, var7 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method942(2048, -1, var7, var8);
                this.method942(32768, -1, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method942(8192, -1, var7, var8);
                this.method942(512, -1, var7 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method942(32768, -1, var7, var8);
                this.method942(2048, -1, var7 - 1, var8 + -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method942(66560, -1, var7, var8);
            this.method942(4096, -1, var7, var8 - 1);
            this.method942(16384, -1, var7 + 1, var8);
        }
        if (arg5 == 1) {
            this.method942(5120, -1, var7, var8);
            this.method942(16384, -1, var7 + 1, var8);
            this.method942(65536, -1, var7, var8 + 1);
        }
        if (arg5 == 2) {
            this.method942(20480, -1, var7, var8);
            this.method942(65536, -1, var7, var8 + 1);
            this.method942(1024, -1, var7 - 1, var8);
        }
        if (arg5 == 3) {
            this.method942(81920, -1, var7, var8);
            this.method942(1024, -1, var7 - 1, var8);
            this.method942(4096, -1, var7, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2918 = null;
        if (arg0 != -1) {
            method948(63);
        }
        field2917 = null;
        field2933 = null;
        field2935 = null;
        field2910 = null;
        field2934 = null;
        field2908 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2921++;
        if (arg2 == arg5 && arg1 == arg4) {
            return true;
        }
        int var8 = arg1 - this.field2906;
        int var9 = arg4 - this.field2906;
        int var10 = arg5 - this.field2920;
        int var11 = arg2 - this.field2920;
        if (arg3 == arg6 || arg6 == 7) {
            if (arg6 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2916[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2916[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2916[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2916[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2916[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2916[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2916[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2916[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field2916[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field2916[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field2916[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field2916[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V")
    public class151(int arg0, int arg1) {
        this.field2913 = arg1;
        this.field2920 = 0;
        this.field2906 = 0;
        this.field2927 = arg0;
        this.field2916 = new int[this.field2927][this.field2913];
        this.method946(0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static final void method950(byte arg0) {
        field2909++;
        if (class153.field3010 != null || class73.field1348 != null) {
            return;
        }
        if (arg0 < 103) {
            field2934 = null;
        }
        int var1 = class144.field2798;
        if (class121.field2241) {
            if (var1 != 1) {
                int var6 = class97.field1826;
                int var7 = class170.field3380;
                if (var6 < class184.field3622 - 10 || var6 > class184.field3622 + class44.field722 + 10 || var7 < class66.field1202 - 10 || var7 > class66.field1202 + class36.field593 + 10) {
                    class121.field2241 = false;
                    class77.method392(class184.field3622, class66.field1202, class36.field593, class44.field722, 0);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class184.field3622;
            int var9 = class57.field928;
            int var10 = class44.field722;
            int var11 = class88.field1592;
            int var12 = class66.field1202;
            int var13 = -1;
            for (int var14 = 0; var14 < class100.field1841; var14++) {
                int var15 = (class100.field1841 - var14 - 1) * 15 + var12 + 31;
                if (var11 > var8 && var8 + var10 > var11 && var15 - 13 < var9 && var9 < var15 + 3) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class117.method649(var13, 0);
            }
            class121.field2241 = false;
            class77.method392(class184.field3622, class66.field1202, class36.field593, class44.field722, 0);
            return;
        }
        if (var1 == 1 && class100.field1841 > 0) {
            int var2 = class152.field2944[class100.field1841 - 1];
            if (var2 == 26 || var2 == 42 || var2 == 7 || var2 == 40 || var2 == 36 || var2 == 41 || var2 == 1 || var2 == 29 || var2 == 4 || var2 == 2 || var2 == 6 || var2 == 1005) {
                int var3 = class53.field897[class100.field1841 - 1];
                int var4 = class112.field2084[class100.field1841 - 1];
                class65 var5 = class204.method1325(65535, var4);
                if (class191.method1234(1974910684, class178.method1173(var5, 127)) || class115.method638(true, class178.method1173(var5, 125))) {
                    class13.field236 = false;
                    class23.field356 = 0;
                    if (class153.field3010 != null) {
                        class160.method1095(0, class153.field3010);
                    }
                    class153.field3010 = class204.method1325(65535, var4);
                    class68.field1244 = class88.field1592;
                    class111.field1996 = class57.field928;
                    class63.field995 = var3;
                    class160.method1095(0, class153.field3010);
                    return;
                }
            }
        }
        if (var1 == 1 && (class188.field3680 == 1 && class100.field1841 > 2 || class27.method151(class100.field1841 - 1, (byte) -54))) {
            var1 = 2;
        }
        if (var1 == 1 && class100.field1841 > 0) {
            class117.method649(class100.field1841 - 1, 0);
        }
        if (var1 == 2 && class100.field1841 > 0) {
            class67.method360(false);
            return;
        }
    }
}
