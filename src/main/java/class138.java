import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class138 {

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    private int field2514;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    private int field2530;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "[[I")
    public int[][] field2512;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    private int field2532;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    public static boolean field2510 = false;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[[S")
    public static short[][] field2518 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2508 = -1;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field2513 = 0;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "Loc;")
    public static class151 field2535 = class137.method873(2, "(Y<)4col>");

    @OriginalMember(owner = "client!n", name = "l", descriptor = "D")
    public static double field2517;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public static final void method876(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1400 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2523++;
        if (arg2 == arg3 && arg0 == arg5) {
            return true;
        }
        int var8 = arg5 - this.field2528;
        int var9 = arg0 - this.field2528;
        if (arg4 != 30754) {
            this.field2514 = 92;
        }
        int var10 = arg3 - this.field2532;
        int var11 = arg2 - this.field2532;
        if (arg1 == 0) {
            if (arg6 == 0) {
                if (var10 - 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2512[var11][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2512[var11][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 == var11 && var9 + 1 == var8) {
                    return true;
                }
                if (var10 - 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 + 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2512[var11][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2512[var11][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 == var11 && var9 - 1 == var8) {
                    return true;
                }
                if (var10 - 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg6 == 0) {
                if (var10 - 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2512[var11][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2512[var11][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2512[var11][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 - 1 == var11 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2512[var11][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var10 == var11 && var9 + 1 == var8 && (this.field2512[var11][var8] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var9 - 1 == var8 && (this.field2512[var11][var8] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var11 && var8 == var9 && (this.field2512[var11][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method878(int arg0) {
        field2518 = null;
        field2535 = null;
        if (arg0 >= -127) {
            method887(75, -38, null, -125, null, 89, -68);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static final void method879(byte arg0) {
        class121.field2172.method1317((byte) 113);
        if (arg0 > 72) {
            field2506++;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lod;")
    public static final class152 method880(byte arg0, int arg1) {
        class152 var2 = (class152) class216.field3770.method1318((byte) -54, (long) arg1);
        field2515++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 85 % ((arg0 + 18) / 55);
        byte[] var4 = class25.field540.method1208(class165.method1064((byte) 109, arg1), (byte) -120, class237.method1542(arg1, -1984272022));
        class152 var5 = new class152();
        if (var4 != null) {
            var5.method1005(true, new class229(var4));
        }
        class216.field3770.method1324(var5, 18373, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V")
    public final void method881(int arg0, byte arg1, int arg2) {
        if (arg1 != -1) {
            this.field2514 = 99;
        }
        int var4 = arg2 - this.field2532;
        field2522++;
        int var5 = arg0 - this.field2528;
        this.field2512[var4][var5] = class73.method479(this.field2512[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsd;Z)V")
    public static final void method882(class192 arg0, boolean arg1) {
        field2533++;
        class130.field2387 = arg0;
        if (arg1) {
            method876(-85, 108, -14);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Ldc;")
    public static final class37 method883(int arg0, int arg1) {
        field2524++;
        class37 var2 = (class37) class141.field2556.method1318((byte) -118, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class163.field2952.method1208(arg0, (byte) 114, 28);
        int var4 = 23 % ((38 - arg1) / 61);
        class37 var5 = new class37();
        if (var3 != null) {
            var5.method275(-1, new class229(var3));
        }
        class141.field2556.method1324(var5, 18373, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V")
    public final void method884(int arg0, int arg1, int arg2) {
        field2525++;
        if (arg1 <= 41) {
            field2535 = null;
        }
        int var4 = arg2 - this.field2532;
        int var5 = arg0 - this.field2528;
        this.field2512[var4][var5] = class73.method479(this.field2512[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIZI)V")
    public final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg1 - this.field2528;
        field2527++;
        int var9 = arg4 - this.field2532;
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg3;
            arg3 = arg6;
            arg6 = var10;
        }
        int var11 = 256;
        if (arg5) {
            var11 += 131072;
        }
        if (arg0 != -29049) {
            this.field2532 = 126;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field2530) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && this.field2514 > var13) {
                        this.method890(var12, var11, var13, 29254);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
    public final void method886(byte arg0) {
        for (int var2 = 0; var2 < this.field2530; var2++) {
            for (int var3 = 0; var3 < this.field2514; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field2530 - 5 || var3 >= this.field2514 - 5) {
                    this.field2512[var2][var3] = 16777215;
                } else {
                    this.field2512[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 <= 116) {
            this.method886((byte) 35);
        }
        field2520++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILwd;ILhh;II)V")
    public static final void method887(int arg0, int arg1, class232 arg2, int arg3, class84 arg4, int arg5, int arg6) {
        field2529++;
        if (arg4 == null) {
            return;
        }
        int var7 = class94.field1761 + class121.field2178 & 0x7FF;
        int var8 = arg6 * arg6 + arg0 * arg0;
        int var9 = Math.max(arg2.field4215 / 2, arg2.field4216 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class61.field1191[var7];
        int var11 = var10 * 256 / (class151.field2693 + 256);
        int var12 = -96 / ((arg1 - 21) / 42);
        int var13 = class61.field1208[var7];
        int var14 = var13 * 256 / (class151.field2693 + 256);
        int var15 = arg0 * var11 + arg6 * var14 >> 16;
        int var16 = arg0 * var14 - arg6 * var11 >> 16;
        arg4.method541(arg2.field4215 / 2 + arg5 + var15 - arg4.field1588 / 2, arg2.field4216 / 2 + arg3 + -var16 + -(arg4.field1592 / 2), arg2.field4145, arg2.field4218);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2509++;
        int var9 = arg2 + arg6 - 1;
        int var10 = arg0 + arg3 - 1;
        if (arg0 <= arg7 && arg7 <= var10 && arg4 >= arg6 && var9 >= arg4) {
            return true;
        } else if (arg0 - 1 == arg7 && arg6 <= arg4 && var9 >= arg4 && (this.field2512[arg7 - this.field2532][arg4 - this.field2528] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (arg1 != 27377) {
            return false;
        } else if (var10 + 1 == arg7 && arg6 <= arg4 && arg4 <= var9 && (this.field2512[arg7 - this.field2532][arg4 - this.field2528] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg4 && arg0 <= arg7 && arg7 <= var10 && (this.field2512[arg7 - this.field2532][arg4 - this.field2528] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg4 && arg7 >= arg0 && arg7 <= var10 && (this.field2512[arg7 - this.field2532][arg4 - this.field2528] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZIIII)V")
    public final void method889(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field2532;
        int var8 = arg0 - this.field2528;
        int var9 = 256;
        if (arg1) {
            var9 += 131072;
        }
        if (arg5 < 112) {
            field2510 = true;
        }
        for (int var10 = var7; var10 < arg4 + var7; var10++) {
            if (var10 >= 0 && this.field2530 > var10) {
                for (int var11 = var8; var11 < arg3 + var8; var11++) {
                    if (var11 >= 0 && this.field2514 > var11) {
                        this.method896(var9, 1, var11, var10);
                    }
                }
            }
        }
        field2516++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V")
    private final void method890(int arg0, int arg1, int arg2, int arg3) {
        this.field2512[arg0][arg2] = class26.method206(this.field2512[arg0][arg2], ~arg1);
        field2531++;
        if (arg3 != 29254) {
            method882(null, false);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lnd;II)V")
    public static final void method891(class142 arg0, int arg1, int arg2) {
        if (arg2 != 8) {
            method882(null, false);
        }
        field2507++;
        if (class222.field3851 == null) {
            class120.method730(0, 255, null, arg2 - 105, 255, (byte) 0, true);
            class144.field2605[arg1] = arg0;
        } else {
            class222.field3851.field4101 = arg1 * 8 + 5;
            int var3 = class222.field3851.method1437(425528536);
            int var4 = class222.field3851.method1437(arg2 + 425528528);
            arg0.method911(var3, var4, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(III)V")
    public final void method892(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2532;
        if (arg2 != 7735) {
            this.field2512 = null;
        }
        field2526++;
        int var5 = arg1 - this.field2528;
        this.field2512[var4][var5] = class26.method206(this.field2512[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(II)V")
    public class138(int arg0, int arg1) {
        this.field2514 = arg1;
        this.field2530 = arg0;
        this.field2512 = new int[this.field2530][this.field2514];
        this.field2528 = 0;
        this.field2532 = 0;
        this.method886((byte) 124);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIZII)V")
    public final void method893(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field2532;
        int var8 = arg2 - this.field2528;
        field2521++;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method890(var7, 128, var8, 29254);
                this.method890(var7 - 1, 8, var8, 29254);
            }
            if (arg0 == 1) {
                this.method890(var7, 2, var8, 29254);
                this.method890(var7, 32, var8 + 1, 29254);
            }
            if (arg0 == 2) {
                this.method890(var7, 8, var8, 29254);
                this.method890(var7 + 1, 128, var8, 29254);
            }
            if (arg0 == 3) {
                this.method890(var7, 32, var8, 29254);
                this.method890(var7, 2, var8 - 1, 29254);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method890(var7, 1, var8, arg5 ^ 0xFFFF8DBA);
                this.method890(var7 - 1, 16, var8 + 1, 29254);
            }
            if (arg0 == 1) {
                this.method890(var7, 4, var8, 29254);
                this.method890(var7 + 1, 64, var8 + 1, 29254);
            }
            if (arg0 == 2) {
                this.method890(var7, 16, var8, 29254);
                this.method890(var7 + 1, 1, var8 - 1, 29254);
            }
            if (arg0 == 3) {
                this.method890(var7, 64, var8, 29254);
                this.method890(var7 - 1, 4, var8 - 1, arg5 + 29258);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method890(var7, 130, var8, 29254);
                this.method890(var7 - 1, 8, var8, 29254);
                this.method890(var7, 32, var8 + 1, arg5 ^ 0xFFFF8DBA);
            }
            if (arg0 == 1) {
                this.method890(var7, 10, var8, 29254);
                this.method890(var7, 32, var8 + 1, arg5 ^ 0xFFFF8DBA);
                this.method890(var7 + 1, 128, var8, arg5 ^ 0xFFFF8DBA);
            }
            if (arg0 == 2) {
                this.method890(var7, 40, var8, arg5 ^ 0xFFFF8DBA);
                this.method890(var7 + 1, 128, var8, 29254);
                this.method890(var7, 2, var8 - 1, arg5 ^ 0xFFFF8DBA);
            }
            if (arg0 == 3) {
                this.method890(var7, 160, var8, 29254);
                this.method890(var7, 2, var8 - 1, 29254);
                this.method890(var7 - 1, 8, var8, arg5 + 29258);
            }
        }
        if (arg5 != -4) {
            method880((byte) -16, 40);
        }
        if (!arg3) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method890(var7, 65536, var8, arg5 + 29258);
                this.method890(var7 - 1, 4096, var8, 29254);
            }
            if (arg0 == 1) {
                this.method890(var7, 1024, var8, arg5 ^ 0xFFFF8DBA);
                this.method890(var7, 16384, var8 + 1, 29254);
            }
            if (arg0 == 2) {
                this.method890(var7, 4096, var8, 29254);
                this.method890(var7 + 1, 65536, var8, arg5 + 29258);
            }
            if (arg0 == 3) {
                this.method890(var7, 16384, var8, 29254);
                this.method890(var7, 1024, var8 - 1, 29254);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method890(var7, 512, var8, 29254);
                this.method890(var7 - 1, 8192, var8 + 1, 29254);
            }
            if (arg0 == 1) {
                this.method890(var7, 2048, var8, 29254);
                this.method890(var7 + 1, 32768, var8 + 1, arg5 ^ 0xFFFF8DBA);
            }
            if (arg0 == 2) {
                this.method890(var7, 8192, var8, 29254);
                this.method890(var7 + 1, 512, var8 - 1, 29254);
            }
            if (arg0 == 3) {
                this.method890(var7, 32768, var8, 29254);
                this.method890(var7 - 1, 2048, var8 - 1, arg5 + 29258);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method890(var7, 66560, var8, 29254);
            this.method890(var7 - 1, 4096, var8, 29254);
            this.method890(var7, 16384, var8 + 1, arg5 + 29258);
        }
        if (arg0 == 1) {
            this.method890(var7, 5120, var8, 29254);
            this.method890(var7, 16384, var8 + 1, 29254);
            this.method890(var7 + 1, 65536, var8, 29254);
        }
        if (arg0 == 2) {
            this.method890(var7, 20480, var8, 29254);
            this.method890(var7 + 1, 65536, var8, arg5 + 29258);
            this.method890(var7, 1024, var8 - 1, arg5 + 29258);
        }
        if (arg0 == 3) {
            this.method890(var7, 81920, var8, arg5 ^ 0xFFFF8DBA);
            this.method890(var7, 1024, var8 - 1, 29254);
            this.method890(var7 - 1, 4096, var8, arg5 ^ 0xFFFF8DBA);
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIBZI)V")
    public final void method894(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field2534++;
        if (arg3 != -76) {
            return;
        }
        int var7 = arg5 - this.field2528;
        int var8 = arg1 - this.field2532;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method896(128, arg3 + 77, var7, var8);
                this.method896(8, 1, var7, var8 - 1);
            }
            if (arg0 == 1) {
                this.method896(2, 1, var7, var8);
                this.method896(32, arg3 + 77, var7 + 1, var8);
            }
            if (arg0 == 2) {
                this.method896(8, arg3 + 77, var7, var8);
                this.method896(128, arg3 ^ 0xFFFFFFB5, var7, var8 + 1);
            }
            if (arg0 == 3) {
                this.method896(32, 1, var7, var8);
                this.method896(2, 1, var7 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method896(1, 1, var7, var8);
                this.method896(16, 1, var7 + 1, var8 + -1);
            }
            if (arg0 == 1) {
                this.method896(4, 1, var7, var8);
                this.method896(64, 1, var7 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method896(16, 1, var7, var8);
                this.method896(1, 1, var7 - 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method896(64, 1, var7, var8);
                this.method896(4, 1, var7 - 1, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method896(130, arg3 + 77, var7, var8);
                this.method896(8, 1, var7, var8 - 1);
                this.method896(32, 1, var7 + 1, var8);
            }
            if (arg0 == 1) {
                this.method896(10, 1, var7, var8);
                this.method896(32, 1, var7 + 1, var8);
                this.method896(128, 1, var7, var8 + 1);
            }
            if (arg0 == 2) {
                this.method896(40, arg3 + 77, var7, var8);
                this.method896(128, arg3 + 77, var7, var8 + 1);
                this.method896(2, 1, var7 - 1, var8);
            }
            if (arg0 == 3) {
                this.method896(160, 1, var7, var8);
                this.method896(2, 1, var7 - 1, var8);
                this.method896(8, arg3 + 77, var7, var8 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method896(65536, 1, var7, var8);
                this.method896(4096, 1, var7, var8 - 1);
            }
            if (arg0 == 1) {
                this.method896(1024, arg3 ^ 0xFFFFFFB5, var7, var8);
                this.method896(16384, 1, var7 + 1, var8);
            }
            if (arg0 == 2) {
                this.method896(4096, 1, var7, var8);
                this.method896(65536, 1, var7, var8 + 1);
            }
            if (arg0 == 3) {
                this.method896(16384, arg3 + 77, var7, var8);
                this.method896(1024, 1, var7 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method896(512, 1, var7, var8);
                this.method896(8192, arg3 ^ 0xFFFFFFB5, var7 + 1, var8 + -1);
            }
            if (arg0 == 1) {
                this.method896(2048, 1, var7, var8);
                this.method896(32768, arg3 ^ 0xFFFFFFB5, var7 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method896(8192, 1, var7, var8);
                this.method896(512, 1, var7 - 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method896(32768, 1, var7, var8);
                this.method896(2048, arg3 ^ 0xFFFFFFB5, var7 - 1, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method896(66560, 1, var7, var8);
            this.method896(4096, 1, var7, var8 - 1);
            this.method896(16384, 1, var7 + 1, var8);
        }
        if (arg0 == 1) {
            this.method896(5120, 1, var7, var8);
            this.method896(16384, 1, var7 + 1, var8);
            this.method896(65536, arg3 ^ 0xFFFFFFB5, var7, var8 + 1);
        }
        if (arg0 == 2) {
            this.method896(20480, 1, var7, var8);
            this.method896(65536, 1, var7, var8 + 1);
            this.method896(1024, 1, var7 - 1, var8);
        }
        if (arg0 == 3) {
            this.method896(81920, 1, var7, var8);
            this.method896(1024, 1, var7 - 1, var8);
            this.method896(4096, 1, var7, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIBIII)Z")
    public final boolean method895(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2511++;
        if (arg2 == arg4 && arg0 == arg1) {
            return true;
        }
        if (arg3 != 0) {
            method882(null, true);
        }
        int var8 = arg4 - this.field2532;
        int var9 = arg0 - this.field2528;
        int var10 = arg2 - this.field2532;
        int var11 = arg1 - this.field2528;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field2512[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field2512[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field2512[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field2512[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field2512[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field2512[var8][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field2512[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field2512[var8][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var10 && var9 + 1 == var11 && (this.field2512[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var9 - 1 == var11 && (this.field2512[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field2512[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field2512[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IIII)V")
    private final void method896(int arg0, int arg1, int arg2, int arg3) {
        this.field2512[arg3][arg2] = class73.method479(this.field2512[arg3][arg2], arg0);
        field2519++;
        if (arg1 != 1) {
            this.method892(-27, -6, 53);
        }
    }
}
