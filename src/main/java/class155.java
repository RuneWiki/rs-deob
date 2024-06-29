import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class155 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    private int field3579 = 0;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    private int field3578;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    private int field3593;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[[I")
    public int[][] field3591;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lja;")
    public static class62 field3582 = class30.method243(43, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Lja;")
    private static class62 field3596 = class30.method243(43, "Please reload this page)3");

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[[[B")
    public static byte[][][] field3581 = new byte[4][104][104];

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field3602 = 0;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "J")
    public static volatile long field3600 = 0L;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[Lja;")
    public static class62[] field3597 = new class62[200];

    @OriginalMember(owner = "client!we", name = "C", descriptor = "[I")
    public static int[] field3605 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!we", name = "E", descriptor = "Lja;")
    private static class62 field3607 = class30.method243(43, "Existing User");

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lja;")
    public static class62 field3587 = field3607;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "[Z")
    public static boolean[] field3604 = new boolean[5];

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Lja;")
    public static class62 field3609 = field3596;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIIIII)V")
    public final void method1200(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 21698) {
            return;
        }
        int var7 = arg1 - this.field3578;
        field3606++;
        int var8 = arg5 - this.field3579;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1212(128, var8, var7, false);
                this.method1212(8, var8 - 1, var7, false);
            }
            if (arg2 == 1) {
                this.method1212(2, var8, var7, false);
                this.method1212(32, var8, var7 + 1, false);
            }
            if (arg2 == 2) {
                this.method1212(8, var8, var7, false);
                this.method1212(128, var8 + 1, var7, false);
            }
            if (arg2 == 3) {
                this.method1212(32, var8, var7, false);
                this.method1212(2, var8, var7 - 1, false);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1212(1, var8, var7, false);
                this.method1212(16, var8 - 1, var7 - -1, false);
            }
            if (arg2 == 1) {
                this.method1212(4, var8, var7, false);
                this.method1212(64, var8 + 1, var7 + 1, false);
            }
            if (arg2 == 2) {
                this.method1212(16, var8, var7, false);
                this.method1212(1, var8 + 1, var7 + -1, false);
            }
            if (arg2 == 3) {
                this.method1212(64, var8, var7, false);
                this.method1212(4, var8 - 1, var7 + -1, false);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method1212(130, var8, var7, false);
                this.method1212(8, var8 - 1, var7, false);
                this.method1212(32, var8, var7 + 1, false);
            }
            if (arg2 == 1) {
                this.method1212(10, var8, var7, false);
                this.method1212(32, var8, var7 + 1, false);
                this.method1212(128, var8 + 1, var7, false);
            }
            if (arg2 == 2) {
                this.method1212(40, var8, var7, false);
                this.method1212(128, var8 + 1, var7, false);
                this.method1212(2, var8, var7 - 1, false);
            }
            if (arg2 == 3) {
                this.method1212(160, var8, var7, false);
                this.method1212(2, var8, var7 - 1, false);
                this.method1212(8, var8 - 1, var7, false);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1212(65536, var8, var7, false);
                this.method1212(4096, var8 - 1, var7, false);
            }
            if (arg2 == 1) {
                this.method1212(1024, var8, var7, false);
                this.method1212(16384, var8, var7 + 1, false);
            }
            if (arg2 == 2) {
                this.method1212(4096, var8, var7, false);
                this.method1212(65536, var8 + 1, var7, false);
            }
            if (arg2 == 3) {
                this.method1212(16384, var8, var7, false);
                this.method1212(1024, var8, var7 - 1, false);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1212(512, var8, var7, false);
                this.method1212(8192, var8 - 1, var7 + 1, false);
            }
            if (arg2 == 1) {
                this.method1212(2048, var8, var7, false);
                this.method1212(32768, var8 + 1, var7 - -1, false);
            }
            if (arg2 == 2) {
                this.method1212(8192, var8, var7, false);
                this.method1212(512, var8 + 1, var7 - 1, false);
            }
            if (arg2 == 3) {
                this.method1212(32768, var8, var7, false);
                this.method1212(2048, var8 - 1, var7 + -1, false);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1212(66560, var8, var7, false);
            this.method1212(4096, var8 - 1, var7, false);
            this.method1212(16384, var8, var7 + 1, false);
        }
        if (arg2 == 1) {
            this.method1212(5120, var8, var7, false);
            this.method1212(16384, var8, var7 + 1, false);
            this.method1212(65536, var8 + 1, var7, false);
        }
        if (arg2 == 2) {
            this.method1212(20480, var8, var7, false);
            this.method1212(65536, var8 + 1, var7, false);
            this.method1212(1024, var8, var7 - 1, false);
        }
        if (arg2 == 3) {
            this.method1212(81920, var8, var7, false);
            this.method1212(1024, var8, var7 - 1, false);
            this.method1212(4096, var8 - 1, var7, false);
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public final void method1201(byte arg0) {
        field3586++;
        int var2 = 0;
        if (arg0 != 63) {
            return;
        }
        while (this.field3593 > var2) {
            for (int var3 = 0; var3 < this.field3589; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3593 - 5 <= var2 || var3 >= this.field3589 - 5) {
                    this.field3591[var2][var3] = 16777215;
                } else {
                    this.field3591[var2][var3] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    public final void method1202(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field3578;
        field3595++;
        if (arg1 > -97) {
            field3609 = null;
        }
        int var5 = arg2 - this.field3579;
        this.field3591[var5][var4] = class85.method660(this.field3591[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)V")
    public final void method1203(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field3579;
        if (arg1 != 103) {
            field3598 = 13;
        }
        field3592++;
        int var5 = arg0 - this.field3578;
        this.field3591[var4][var5] = class24.method192(this.field3591[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBZIIII)V")
    public final void method1204(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field3579;
        if (arg1 < 42) {
            return;
        }
        int var9 = 256;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg6;
            arg6 = arg5;
            arg5 = var10;
        }
        if (arg2) {
            var9 += 131072;
        }
        int var11 = arg0 - this.field3578;
        for (int var12 = var8; var12 < arg6 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field3593) {
                for (int var13 = var11; var13 < arg5 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field3589) {
                        this.method1212(var9, var12, var13, false);
                    }
                }
            }
        }
        field3608++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZBI)V")
    public final void method1205(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        int var7 = arg5 - this.field3579;
        int var8 = arg1 - this.field3578;
        field3610++;
        if (arg4 != -20) {
            field3598 = 40;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1214(128, var8, (byte) 108, var7);
                this.method1214(8, var8, (byte) 107, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1214(2, var8, (byte) 95, var7);
                this.method1214(32, var8 + 1, (byte) 107, var7);
            }
            if (arg0 == 2) {
                this.method1214(8, var8, (byte) 113, var7);
                this.method1214(128, var8, (byte) 120, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1214(32, var8, (byte) 123, var7);
                this.method1214(2, var8 - 1, (byte) 100, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1214(1, var8, (byte) 107, var7);
                this.method1214(16, var8 + 1, (byte) 112, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1214(4, var8, (byte) 102, var7);
                this.method1214(64, var8 + 1, (byte) 106, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1214(16, var8, (byte) 122, var7);
                this.method1214(1, var8 - 1, (byte) 105, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1214(64, var8, (byte) 103, var7);
                this.method1214(4, var8 - 1, (byte) 111, var7 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method1214(130, var8, (byte) 108, var7);
                this.method1214(8, var8, (byte) 116, var7 - 1);
                this.method1214(32, var8 + 1, (byte) 97, var7);
            }
            if (arg0 == 1) {
                this.method1214(10, var8, (byte) 117, var7);
                this.method1214(32, var8 + 1, (byte) 112, var7);
                this.method1214(128, var8, (byte) 127, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1214(40, var8, (byte) 126, var7);
                this.method1214(128, var8, (byte) 98, var7 + 1);
                this.method1214(2, var8 - 1, (byte) 96, var7);
            }
            if (arg0 == 3) {
                this.method1214(160, var8, (byte) 107, var7);
                this.method1214(2, var8 - 1, (byte) 99, var7);
                this.method1214(8, var8, (byte) 117, var7 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1214(65536, var8, (byte) 99, var7);
                this.method1214(4096, var8, (byte) 123, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1214(1024, var8, (byte) 95, var7);
                this.method1214(16384, var8 + 1, (byte) 99, var7);
            }
            if (arg0 == 2) {
                this.method1214(4096, var8, (byte) 112, var7);
                this.method1214(65536, var8, (byte) 105, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1214(16384, var8, (byte) 98, var7);
                this.method1214(1024, var8 - 1, (byte) 102, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1214(512, var8, (byte) 124, var7);
                this.method1214(8192, var8 + 1, (byte) 125, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1214(2048, var8, (byte) 120, var7);
                this.method1214(32768, var8 + 1, (byte) 100, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1214(8192, var8, (byte) 113, var7);
                this.method1214(512, var8 - 1, (byte) 121, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1214(32768, var8, (byte) 103, var7);
                this.method1214(2048, var8 - 1, (byte) 122, var7 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1214(66560, var8, (byte) 108, var7);
            this.method1214(4096, var8, (byte) 113, var7 - 1);
            this.method1214(16384, var8 + 1, (byte) 103, var7);
        }
        if (arg0 == 1) {
            this.method1214(5120, var8, (byte) 95, var7);
            this.method1214(16384, var8 + 1, (byte) 113, var7);
            this.method1214(65536, var8, (byte) 119, var7 + 1);
        }
        if (arg0 == 2) {
            this.method1214(20480, var8, (byte) 126, var7);
            this.method1214(65536, var8, (byte) 109, var7 + 1);
            this.method1214(1024, var8 - 1, (byte) 99, var7);
        }
        if (arg0 == 3) {
            this.method1214(81920, var8, (byte) 126, var7);
            this.method1214(1024, var8 - 1, (byte) 95, var7);
            this.method1214(4096, var8, (byte) 104, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(III)V")
    public final void method1206(int arg0, int arg1, int arg2) {
        field3583++;
        int var4 = arg2 - this.field3578;
        int var5 = arg1 - this.field3579;
        if (arg0 > -111) {
            field3582 = null;
        }
        this.field3591[var5][var4] = class85.method660(this.field3591[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZIZI)V")
    public final void method1207(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field3578;
        field3580++;
        int var9 = 256;
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg2;
            arg2 = arg0;
            arg0 = var10;
        }
        if (!arg5) {
            return;
        }
        int var11 = arg4 - this.field3579;
        if (arg3) {
            var9 += 131072;
        }
        for (int var12 = var11; var12 < arg2 + var11; var12++) {
            if (var12 >= 0 && var12 < this.field3593) {
                for (int var13 = var8; var13 < arg0 + var8; var13++) {
                    if (var13 >= 0 && this.field3589 > var13) {
                        this.method1214(var9, var13, (byte) 98, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method1208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3584++;
        if (arg2 == arg5 && arg1 == arg3) {
            return true;
        }
        int var8 = arg1 - this.field3578;
        int var9 = arg5 - this.field3579;
        int var10 = arg3 - this.field3578;
        if (arg6 != 19134) {
            this.method1212(-68, -47, -25, true);
        }
        int var11 = arg2 - this.field3579;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field3591[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field3591[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field3591[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field3591[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field3591[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field3591[var9][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field3591[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field3591[var9][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var9 == var11 && var8 + 1 == var10 && (this.field3591[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var8 - 1 == var10 && (this.field3591[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var8 == var10 && (this.field3591[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var8 == var10 && (this.field3591[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIBIII)Z")
    public final boolean method1209(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3590++;
        if (arg0 == arg2 && arg1 == arg5) {
            return true;
        }
        int var8 = arg5 - this.field3578;
        int var9 = arg0 - this.field3579;
        int var10 = arg2 - this.field3579;
        int var11 = arg1 - this.field3578;
        if (arg3 != 90) {
            return false;
        }
        if (arg4 == 0) {
            if (arg6 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field3591[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field3591[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field3591[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field3591[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 2) {
            if (arg6 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field3591[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field3591[var10][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field3591[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field3591[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var9 == var10 && var8 + 1 == var11 && (this.field3591[var10][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var8 - 1 == var11 && (this.field3591[var10][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field3591[var10][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1210(int arg0) {
        field3605 = null;
        field3607 = null;
        field3582 = null;
        field3609 = null;
        field3604 = null;
        field3581 = null;
        field3587 = null;
        field3596 = null;
        if (arg0 != 1) {
            field3607 = null;
        }
        field3597 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIILka;I[B[Lwe;BII)V")
    public static final void method1211(int arg0, int arg1, int arg2, int arg3, class69 arg4, int arg5, byte[] arg6, class155[] arg7, byte arg8, int arg9, int arg10) {
        field3594++;
        int var11 = -1;
        class128 var12 = new class128(arg6);
        if (arg8 != -107) {
            field3587 = null;
        }
        while (true) {
            int var13 = var12.method1001((byte) -86);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1001((byte) -60);
                if (var15 == 0) {
                    break;
                }
                int var16 = var12.method1025(255);
                var14 += var15 - 1;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var14 >> 6 & 0x3F;
                int var20 = var16 >> 2;
                int var21 = var16 & 0x3;
                if (arg3 == var18 && arg10 <= var19 && var19 < arg10 + 8 && var17 >= arg2 && var17 < arg2 + 8) {
                    class65 var22 = class84.method653(arg8 + 113, var11);
                    int var23 = arg5 + class72.method606(var19 & 0x7, var22.field1612, arg0, var21, 1, var17 & 0x7, var22.field1615);
                    int var24 = class116.method940(arg8 ^ 0x6A, var19 & 0x7, var22.field1612, var22.field1615, var17 & 0x7, var21, arg0) + arg1;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg9;
                        if ((field3581[1][var23][var24] & 0x2) == 2) {
                            var25 = arg9 - 1;
                        }
                        class155 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg7[var25];
                        }
                        class26.method208(arg9, 95, var26, var24, var23, arg0 + var21 & 0x3, var11, arg4, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZ)V")
    private final void method1212(int arg0, int arg1, int arg2, boolean arg3) {
        field3599++;
        if (arg3) {
            field3581 = null;
        }
        this.field3591[arg1][arg2] = class24.method192(this.field3591[arg1][arg2], ~arg0);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(II)V")
    public class155(int arg0, int arg1) {
        this.field3589 = arg1;
        this.field3578 = 0;
        this.field3593 = arg0;
        this.field3591 = new int[this.field3593][this.field3589];
        this.method1201((byte) 63);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3588++;
        int var9 = arg7 + arg5 - 1;
        int var10 = arg0 + arg2 - 1;
        if (arg6 >= arg7 && var9 >= arg6 && arg3 >= arg0 && arg3 <= var10) {
            return true;
        } else if (arg7 - 1 == arg6 && arg3 >= arg0 && var10 >= arg3 && (this.field3591[arg6 - this.field3579][arg3 - this.field3578] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (arg1 + var9 == arg6 && arg0 <= arg3 && arg3 <= var10 && (this.field3591[arg6 - this.field3579][arg3 - this.field3578] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg3 && arg6 >= arg7 && arg6 <= var9 && (this.field3591[arg6 - this.field3579][arg3 - this.field3578] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg6 >= arg7 && arg6 <= var9 && (this.field3591[arg6 - this.field3579][arg3 - this.field3578] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBI)V")
    private final void method1214(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= 94) {
            field3585++;
            this.field3591[arg3][arg1] = class85.method660(this.field3591[arg3][arg1], arg0);
        }
    }
}
