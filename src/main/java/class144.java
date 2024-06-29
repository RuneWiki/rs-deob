import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class144 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    private int field2387 = 0;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    private int field2413;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    private int field2398;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    private int field2414;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[[I")
    public int[][] field2392;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2390 = 0;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "Lok;")
    public static class146 field2415 = class235.method1724(-12908, "Hierhin gehen");

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "[J")
    public static long[] field2417 = new long[200];

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Lhf;")
    public static class195 field2393 = new class195(128);

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lok;")
    public static class146 field2419 = class235.method1724(-12908, ":clanreq:");

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "Loh;")
    public static class15 field2406;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Loh;")
    public static class15 field2416;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lhe;")
    public static class90 field2395;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "Ljava/awt/Frame;")
    public static Frame field2418;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
    public static int[] field2389;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V", line = 8)
    public final void method1057(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2387;
        int var5 = arg2 - this.field2398;
        field2401++;
        this.field2392[var4][var5] = class82.method582(this.field2392[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIIIII)Z", line = 18)
    private final boolean method1058(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2396++;
        if ((arg5 + arg8) <= arg7 || arg3 + arg7 <= arg8) {
            return false;
        } else if (arg0 < arg2 + arg4 && arg4 < arg0 + arg6) {
            if (arg1 != 51) {
                this.field2392 = (int[][]) ((int[][]) null);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIIIIII)Z", line = 36)
    private final boolean method1059(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2391++;
        int var11 = arg4 + arg8;
        int var12 = arg0 + arg2;
        int var13 = arg3 + arg9;
        if (arg1 > -107) {
            return false;
        }
        int var14 = arg5 + arg6;
        if (arg4 >= arg3 && arg4 < var13) {
            if (arg6 == var12 && (arg7 & 0x4) == 0) {
                int var15 = arg4;
                int var16 = var13 >= var11 ? var11 : var13;
                while (var16 > var15) {
                    if ((this.field2392[var15 - this.field2387][var12 - this.field2398 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg0 == var14 && (arg7 & 0x1) == 0) {
                int var17 = arg4;
                int var18 = var11 > var13 ? var13 : var11;
                while (var18 > var17) {
                    if ((this.field2392[var17 - this.field2387][arg0 - this.field2398] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg3 && var11 <= var13) {
            if (arg6 == var12 && (arg7 & 0x4) == 0) {
                for (int var19 = arg3; var19 < var11; var19++) {
                    if ((this.field2392[var19 - this.field2387][var12 - (this.field2398 + 1)] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg7 & 0x1) == 0) {
                for (int var20 = arg3; var20 < var11; var20++) {
                    if ((this.field2392[var20 - this.field2387][arg0 - this.field2398] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg6 <= arg0 && var14 > arg0) {
            if (arg3 == var11 && (arg7 & 0x8) == 0) {
                int var21 = arg0;
                int var22 = var14 < var12 ? var14 : var12;
                while (var21 < var22) {
                    if ((this.field2392[var11 - this.field2387 - 1][var21 - this.field2398] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg4 == var13 && (arg7 & 0x2) == 0) {
                int var23 = var12 > var14 ? var14 : var12;
                for (int var24 = arg0; var24 < var23; var24++) {
                    if ((this.field2392[arg4 - this.field2387][var24 - this.field2398] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg6 < var12 && var14 >= var12) {
            if (arg3 == var11 && (arg7 & 0x8) == 0) {
                for (int var25 = arg6; var25 < var12; var25++) {
                    if ((this.field2392[var11 - this.field2387 - 1][var25 - this.field2398] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var13 && (arg7 & 0x2) == 0) {
                for (int var26 = arg6; var26 < var12; var26++) {
                    if ((this.field2392[arg4 - this.field2387][var26 - this.field2398] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V", line = 200)
    private final void method1060(int arg0, int arg1, int arg2, int arg3) {
        field2408++;
        this.field2392[arg0][arg2] = class138.method1013(this.field2392[arg0][arg2], arg1);
        int var5 = 80 / ((48 - arg3) / 45);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIB)Z", line = 217)
    public final boolean method1061(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        int var9 = 56 % ((arg7 + 3) / 44);
        field2400++;
        if (arg2 == 1) {
            if (arg4 == arg5 && arg0 == arg1) {
                return true;
            }
        } else if (arg5 >= arg4 && arg4 + arg2 - 1 >= arg5 && arg1 >= arg1 && arg1 <= (arg2 + arg1 - 1)) {
            return true;
        }
        int var10 = arg1 - this.field2398;
        int var11 = arg0 - this.field2398;
        int var12 = arg5 - this.field2387;
        int var13 = arg4 - this.field2387;
        if (arg2 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var12 + 1) == var13 && var10 == var11 && (this.field2392[var13][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 - 1) == var11 && (this.field2392[var13][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var12 - 1) == var13 && var10 == var11 && (this.field2392[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 - 1) == var11 && (this.field2392[var13][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - 1) == var13 && var10 == var11 && (this.field2392[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 + 1) == var11 && (this.field2392[var13][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 + 1) == var13 && var10 == var11 && (this.field2392[var13][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 + 1) == var11 && (this.field2392[var13][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var12 == var13 && (var10 + 1) == var11 && (this.field2392[var13][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 == var13 && var10 - 1 == var11 && (this.field2392[var13][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var13 && var10 == var11 && (this.field2392[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var13 && var10 == var11 && (this.field2392[var13][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var11 + arg2 - 1;
            int var15 = arg2 + var13 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var12 + 1 == var13 && var10 >= var11 && var14 >= var10 && (this.field2392[var13][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var13 && var15 >= var12 && var10 - arg2 == var11 && (this.field2392[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - arg2 == var13 && var10 >= var11 && var14 >= var10 && (this.field2392[var15][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var13 <= var12 && var12 <= var15 && var10 - arg2 == var11 && (this.field2392[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - arg2) == var13 && var11 <= var10 && var14 >= var10 && (this.field2392[var15][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var13 && var15 >= var12 && var10 + 1 == var11 && (this.field2392[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 + 1 == var13 && var10 >= var11 && var14 >= var10 && (this.field2392[var13][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var13 && var15 >= var12 && var10 + 1 == var11 && (this.field2392[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var13 <= var12 && var15 >= var12 && var10 + 1 == var11 && (this.field2392[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var13 && var12 <= var15 && (var10 - arg2) == var11 && (this.field2392[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg2 == var13 && var10 >= var11 && var14 >= var10 && (this.field2392[var15][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var13 && var11 <= var10 && var14 >= var10 && (this.field2392[var13][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 406)
    public final void method1062(boolean arg0) {
        field2388++;
        if (arg0) {
            field2393 = (class195) null;
        }
        for (int var2 = 0; var2 < this.field2414; var2++) {
            for (int var3 = 0; var3 < this.field2413; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2414 - 5 <= var2 || this.field2413 - 5 <= var3) {
                    this.field2392[var2][var3] = 16777215;
                } else {
                    this.field2392[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZBIIII)V", line = 444)
    public final void method1063(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2394++;
        int var7 = arg2 - this.field2398;
        int var8 = arg3 - this.field2387;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method1068(128, var8, (byte) 38, var7);
                this.method1068(8, var8 - 1, (byte) 38, var7);
            }
            if (arg5 == 1) {
                this.method1068(2, var8, (byte) 38, var7);
                this.method1068(32, var8, (byte) 38, var7 + 1);
            }
            if (arg5 == 2) {
                this.method1068(8, var8, (byte) 38, var7);
                this.method1068(128, var8 + 1, (byte) 38, var7);
            }
            if (arg5 == 3) {
                this.method1068(32, var8, (byte) 38, var7);
                this.method1068(2, var8, (byte) 38, var7 - 1);
            }
        }
        if (arg1 != 67) {
            return;
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method1068(1, var8, (byte) 38, var7);
                this.method1068(16, var8 - 1, (byte) 38, var7 + 1);
            }
            if (arg5 == 1) {
                this.method1068(4, var8, (byte) 38, var7);
                this.method1068(64, var8 + 1, (byte) 38, var7 + 1);
            }
            if (arg5 == 2) {
                this.method1068(16, var8, (byte) 38, var7);
                this.method1068(1, var8 + 1, (byte) 38, var7 - 1);
            }
            if (arg5 == 3) {
                this.method1068(64, var8, (byte) 38, var7);
                this.method1068(4, var8 - 1, (byte) 38, var7 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method1068(130, var8, (byte) 38, var7);
                this.method1068(8, var8 - 1, (byte) 38, var7);
                this.method1068(32, var8, (byte) 38, var7 + 1);
            }
            if (arg5 == 1) {
                this.method1068(10, var8, (byte) 38, var7);
                this.method1068(32, var8, (byte) 38, var7 + 1);
                this.method1068(128, var8 + 1, (byte) 38, var7);
            }
            if (arg5 == 2) {
                this.method1068(40, var8, (byte) 38, var7);
                this.method1068(128, var8 + 1, (byte) 38, var7);
                this.method1068(2, var8, (byte) 38, var7 - 1);
            }
            if (arg5 == 3) {
                this.method1068(160, var8, (byte) 38, var7);
                this.method1068(2, var8, (byte) 38, var7 - 1);
                this.method1068(8, var8 - 1, (byte) 38, var7);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method1068(65536, var8, (byte) 38, var7);
                this.method1068(4096, var8 - 1, (byte) 38, var7);
            }
            if (arg5 == 1) {
                this.method1068(1024, var8, (byte) 38, var7);
                this.method1068(16384, var8, (byte) 38, var7 + 1);
            }
            if (arg5 == 2) {
                this.method1068(4096, var8, (byte) 38, var7);
                this.method1068(65536, var8 + 1, (byte) 38, var7);
            }
            if (arg5 == 3) {
                this.method1068(16384, var8, (byte) 38, var7);
                this.method1068(1024, var8, (byte) 38, var7 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method1068(512, var8, (byte) 38, var7);
                this.method1068(8192, var8 - 1, (byte) 38, var7 + 1);
            }
            if (arg5 == 1) {
                this.method1068(2048, var8, (byte) 38, var7);
                this.method1068(32768, var8 + 1, (byte) 38, var7 + 1);
            }
            if (arg5 == 2) {
                this.method1068(8192, var8, (byte) 38, var7);
                this.method1068(512, var8 + 1, (byte) 38, var7 - 1);
            }
            if (arg5 == 3) {
                this.method1068(32768, var8, (byte) 38, var7);
                this.method1068(2048, var8 - 1, (byte) 38, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1068(66560, var8, (byte) 38, var7);
            this.method1068(4096, var8 - 1, (byte) 38, var7);
            this.method1068(16384, var8, (byte) 38, var7 + 1);
        }
        if (arg5 == 1) {
            this.method1068(5120, var8, (byte) 38, var7);
            this.method1068(16384, var8, (byte) 38, var7 + 1);
            this.method1068(65536, var8 + 1, (byte) 38, var7);
        }
        if (arg5 == 2) {
            this.method1068(20480, var8, (byte) 38, var7);
            this.method1068(65536, var8 + 1, (byte) 38, var7);
            this.method1068(1024, var8, (byte) 38, var7 - 1);
        }
        if (arg5 == 3) {
            this.method1068(81920, var8, (byte) 38, var7);
            this.method1068(1024, var8, (byte) 38, var7 - 1);
            this.method1068(4096, var8 - 1, (byte) 38, var7);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)V", line = 651)
    public final void method1064(int arg0, int arg1, int arg2) {
        if (arg2 == -25873) {
            field2403++;
            int var4 = arg0 - this.field2398;
            int var5 = arg1 - this.field2387;
            this.field2392[var5][var4] = class138.method1013(this.field2392[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZBIII)V", line = 669)
    public final void method1065(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field2387;
        field2402++;
        int var8 = arg5 - this.field2398;
        if (arg2 >= -88) {
            field2406 = (class15) null;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method1060(var7, 128, var8, 115);
                this.method1060(var7 - 1, 8, var8, 107);
            }
            if (arg3 == 1) {
                this.method1060(var7, 2, var8, -20);
                this.method1060(var7, 32, var8 + 1, 113);
            }
            if (arg3 == 2) {
                this.method1060(var7, 8, var8, 119);
                this.method1060(var7 + 1, 128, var8, 112);
            }
            if (arg3 == 3) {
                this.method1060(var7, 32, var8, -114);
                this.method1060(var7, 2, var8 - 1, -70);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method1060(var7, 1, var8, -96);
                this.method1060(var7 - 1, 16, var8 + 1, -108);
            }
            if (arg3 == 1) {
                this.method1060(var7, 4, var8, -73);
                this.method1060(var7 + 1, 64, var8 + 1, -67);
            }
            if (arg3 == 2) {
                this.method1060(var7, 16, var8, 109);
                this.method1060(var7 + 1, 1, var8 - 1, -114);
            }
            if (arg3 == 3) {
                this.method1060(var7, 64, var8, -102);
                this.method1060(var7 - 1, 4, var8 - 1, 100);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method1060(var7, 130, var8, -46);
                this.method1060(var7 - 1, 8, var8, 102);
                this.method1060(var7, 32, var8 + 1, 102);
            }
            if (arg3 == 1) {
                this.method1060(var7, 10, var8, -127);
                this.method1060(var7, 32, var8 + 1, 122);
                this.method1060(var7 + 1, 128, var8, -24);
            }
            if (arg3 == 2) {
                this.method1060(var7, 40, var8, -9);
                this.method1060(var7 + 1, 128, var8, -10);
                this.method1060(var7, 2, var8 - 1, -43);
            }
            if (arg3 == 3) {
                this.method1060(var7, 160, var8, -4);
                this.method1060(var7, 2, var8 - 1, 94);
                this.method1060(var7 - 1, 8, var8, -36);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method1060(var7, 65536, var8, 111);
                this.method1060(var7 - 1, 4096, var8, -108);
            }
            if (arg3 == 1) {
                this.method1060(var7, 1024, var8, -94);
                this.method1060(var7, 16384, var8 + 1, -21);
            }
            if (arg3 == 2) {
                this.method1060(var7, 4096, var8, 124);
                this.method1060(var7 + 1, 65536, var8, 94);
            }
            if (arg3 == 3) {
                this.method1060(var7, 16384, var8, 99);
                this.method1060(var7, 1024, var8 - 1, -37);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method1060(var7, 512, var8, 107);
                this.method1060(var7 - 1, 8192, var8 + 1, 109);
            }
            if (arg3 == 1) {
                this.method1060(var7, 2048, var8, 0);
                this.method1060(var7 + 1, 32768, var8 + 1, 123);
            }
            if (arg3 == 2) {
                this.method1060(var7, 8192, var8, -64);
                this.method1060(var7 + 1, 512, var8 - 1, 102);
            }
            if (arg3 == 3) {
                this.method1060(var7, 32768, var8, -70);
                this.method1060(var7 - 1, 2048, var8 - 1, 114);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1060(var7, 66560, var8, 114);
            this.method1060(var7 - 1, 4096, var8, 107);
            this.method1060(var7, 16384, var8 + 1, 104);
        }
        if (arg3 == 1) {
            this.method1060(var7, 5120, var8, -12);
            this.method1060(var7, 16384, var8 + 1, 107);
            this.method1060(var7 + 1, 65536, var8, -80);
        }
        if (arg3 == 2) {
            this.method1060(var7, 20480, var8, -72);
            this.method1060(var7 + 1, 65536, var8, 108);
            this.method1060(var7, 1024, var8 - 1, 119);
        }
        if (arg3 == 3) {
            this.method1060(var7, 81920, var8, -14);
            this.method1060(var7, 1024, var8 - 1, -23);
            this.method1060(var7 - 1, 4096, var8, -70);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)Z", line = 870)
    public final boolean method1066(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2399++;
        if (arg0 == arg1 && arg2 == arg4) {
            return true;
        }
        if (arg3 <= 114) {
            field2393 = (class195) null;
        }
        int var6 = arg0 - this.field2387;
        int var7 = arg4 - this.field2398;
        if (var6 < 0 || this.field2414 <= var6 || var7 < 0 || var7 >= this.field2413) {
            return false;
        }
        int var8 = arg2 - this.field2398;
        int var9 = arg1 - this.field2387;
        int var10;
        if (var6 > var9) {
            var10 = var6 - var9;
        } else {
            var10 = var9 - var6;
        }
        int var11;
        if (var8 >= var7) {
            var11 = var8 - var7;
        } else {
            var11 = var7 - var8;
        }
        if (var10 <= var11) {
            int var12 = 32768;
            int var13 = var10 * 65536 / var11;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field2392[var9][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var7 < var8) {
                    if ((this.field2392[var9][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var6 > var9) {
                        if ((this.field2392[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field2392[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var9) {
                if (var6 > var9) {
                    if ((this.field2392[var9][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var6) {
                    if ((this.field2392[var9][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 < var7) {
                        if ((this.field2392[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field2392[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field2392[var6][var7] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)Z", line = 1027)
    public final boolean method1067(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2407++;
        if (arg4 == 1) {
            if (arg1 == arg3 && arg5 == arg7) {
                return true;
            }
        } else if (arg3 >= arg1 && (arg4 + arg1 - 1) >= arg3 && arg5 >= arg5 && arg5 <= (arg5 + arg4 - 1)) {
            return true;
        }
        if (arg2 != 160) {
            return true;
        }
        int var9 = arg5 - this.field2398;
        int var10 = arg3 - this.field2387;
        int var11 = arg7 - this.field2398;
        int var12 = arg1 - this.field2387;
        if (arg4 == 1) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field2392[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field2392[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field2392[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field2392[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field2392[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field2392[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field2392[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field2392[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field2392[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field2392[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field2392[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg4 - 1;
            int var14 = arg4 + var11 - 1;
            if (arg6 == 0) {
                if (arg0 == 0) {
                    if (var10 - arg4 == var12 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 + 1 == var11 && (this.field2392[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 - arg4 == var11 && (this.field2392[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var12 <= var10 && var10 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 - arg4) == var12 && var11 <= var9 && var14 >= var9 && (this.field2392[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field2392[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 + 1) == var11 && (this.field2392[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 - arg4 == var11 && (this.field2392[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var12 <= var10 && var13 >= var10 && (var9 - arg4) == var11) {
                        return true;
                    }
                    if (var10 - arg4 == var12 && var9 >= var11 && var14 >= var9 && (this.field2392[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 <= var9 && var14 >= var9 && (this.field2392[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    if ((var10 - arg4) == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14 && (this.field2392[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 - arg4 == var11 && (this.field2392[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - arg4) == var12 && var11 <= var9 && var14 >= var9 && (this.field2392[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 - arg4 == var11 && (this.field2392[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - arg4) == var12 && var11 <= var9 && var9 <= var14 && (this.field2392[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field2392[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 - arg4) == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 - arg4) == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field2392[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var14 >= var9 && (this.field2392[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 - arg4) == var11) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11 && (this.field2392[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && (var9 - arg4) == var11 && (this.field2392[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var10 - arg4 == var12 && var9 >= var11 && var9 <= var14 && (this.field2392[var13][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9 && (this.field2392[var12][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBI)V", line = 1407)
    private final void method1068(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 38) {
            this.method1059(-38, (byte) -127, -26, -123, 78, -17, -16, 30, -122, -74);
        }
        this.field2392[arg1][arg3] = class82.method582(this.field2392[arg1][arg3], ~arg0);
        field2411++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 1421)
    public static void method1069(int arg0) {
        field2389 = null;
        if (arg0 <= 0) {
            method1074((byte) 26, (class47) null);
        }
        field2395 = null;
        field2419 = null;
        field2417 = null;
        field2415 = null;
        field2406 = null;
        field2393 = null;
        field2418 = null;
        field2416 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIIZII)V", line = 1454)
    public final void method1070(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field2387;
        field2397++;
        int var8 = 256;
        int var9 = arg2 - this.field2398;
        if (arg3) {
            var8 += 131072;
        }
        for (int var10 = var7; var10 < (arg1 + var7); var10++) {
            if (var10 >= 0 && this.field2414 > var10) {
                for (int var11 = var9; var11 < (var9 + arg5); var11++) {
                    if (var11 >= 0 && var11 < this.field2413) {
                        this.method1060(var10, var8, var11, -56);
                    }
                }
            }
        }
        if (arg0 >= -74) {
            this.method1071(-52, false, (byte) -45, -47, 33, 15, -83);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZBIIII)V", line = 1499)
    public final void method1071(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2412++;
        int var8 = arg0 - this.field2398;
        if (arg6 == 1 || arg6 == 3) {
            int var9 = arg5;
            arg5 = arg4;
            arg4 = var9;
        }
        int var10 = arg3 - this.field2387;
        int var11 = 256;
        if (arg2 < 40) {
            this.field2414 = -45;
        }
        if (arg1) {
            var11 += 131072;
        }
        for (int var12 = var10; var12 < (arg5 + var10); var12++) {
            if (var12 >= 0 && var12 < this.field2414) {
                for (int var13 = var8; var13 < (arg4 + var8); var13++) {
                    if (var13 >= 0 && var13 < this.field2413) {
                        this.method1068(var11, var12, (byte) 38, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIBIII)Z", line = 1549)
    public final boolean method1072(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field2405++;
        if (arg1 <= 1) {
            int var10 = arg2 + arg4 - 1;
            int var11 = arg0 + arg7 - 1;
            if (arg0 <= arg8 && var11 >= arg8 && arg6 >= arg2 && arg6 <= var10) {
                return true;
            }
            if (arg5 >= -54) {
                this.method1070((byte) -44, 91, 6, true, 110, 46);
            }
            if (arg0 - 1 == arg8 && arg6 >= arg2 && arg6 <= var10 && (this.field2392[arg8 - this.field2387][arg6 - this.field2398] & 0x8) == 0 && (arg3 & 0x8) == 0) {
                return true;
            } else if ((var11 + 1) == arg8 && arg2 <= arg6 && var10 >= arg6 && (this.field2392[arg8 - this.field2387][arg6 - this.field2398] & 0x80) == 0 && (arg3 & 0x2) == 0) {
                return true;
            } else if (arg2 - 1 == arg6 && arg0 <= arg8 && arg8 <= var11 && (this.field2392[arg8 - this.field2387][arg6 - this.field2398] & 0x2) == 0 && (arg3 & 0x4) == 0) {
                return true;
            } else {
                return (var10 + 1) == arg6 && arg8 >= arg0 && arg8 <= var11 && (this.field2392[arg8 - this.field2387][arg6 - this.field2398] & 0x20) == 0 && (arg3 & 0x1) == 0;
            }
        } else if (this.method1058(arg6, (byte) 51, arg4, arg1, arg2, arg7, arg1, arg8, arg0)) {
            return true;
        } else {
            return this.method1059(arg6, (byte) -125, arg1, arg0, arg8, arg4, arg2, arg3, arg1, arg7);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)V", line = 1606)
    public final void method1073(byte arg0, int arg1, int arg2) {
        if (arg0 <= 122) {
            field2393 = (class195) null;
        }
        int var4 = arg1 - this.field2387;
        field2409++;
        int var5 = arg2 - this.field2398;
        this.field2392[var4][var5] = class138.method1013(this.field2392[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLwe;)Ldf;", line = 1622)
    public static final class159 method1074(byte arg0, class47 arg1) {
        field2410++;
        if (arg0 > -45) {
            field2416 = (class15) null;
        }
        return new class159(arg1.method343(26167), arg1.method343(26167), arg1.method343(26167), arg1.method343(26167), arg1.method343(26167), arg1.method343(26167), arg1.method343(26167), arg1.method343(26167), arg1.method389((byte) 5), arg1.method368(32));
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V", line = 1633)
    public class144(int arg0, int arg1) {
        this.field2413 = arg1;
        this.field2398 = 0;
        this.field2414 = arg0;
        this.field2392 = new int[this.field2414][this.field2413];
        this.method1062(false);
    }
}
