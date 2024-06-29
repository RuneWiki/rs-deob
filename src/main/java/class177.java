import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class177 {

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    private int field3483;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    private int field3479;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    private int field3473;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "[[I")
    public int[][] field3474;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "[Z")
    public static boolean[] field3477 = new boolean[100];

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lrd;")
    public static class173 field3471 = class133.method843("RuneScape wurde aktualisiert(Q", -79);

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "J")
    public static long field3487 = 0L;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lmb;")
    public static class121 field3464;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lqf;")
    public static class165 field3470;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
    private final void method1174(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 16384) {
            this.method1188(59, -86, 119, 82, -102, -100, 13, -92);
        }
        field3475++;
        this.field3474[arg0][arg2] = class209.method1383(this.field3474[arg0][arg2], ~arg3);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIIZII)V")
    public final void method1175(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3469++;
        int var7 = arg1 - this.field3479;
        int var8 = -43 % ((arg0 + 51) / 59);
        int var9 = arg5 - this.field3472;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1178(128, (byte) -104, var7, var9);
                this.method1178(8, (byte) -104, var7, var9 - 1);
            }
            if (arg4 == 1) {
                this.method1178(2, (byte) -22, var7, var9);
                this.method1178(32, (byte) -116, var7 + 1, var9);
            }
            if (arg4 == 2) {
                this.method1178(8, (byte) -125, var7, var9);
                this.method1178(128, (byte) -51, var7, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1178(32, (byte) -95, var7, var9);
                this.method1178(2, (byte) -43, var7 - 1, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1178(1, (byte) -86, var7, var9);
                this.method1178(16, (byte) -80, var7 + 1, var9 + -1);
            }
            if (arg4 == 1) {
                this.method1178(4, (byte) -19, var7, var9);
                this.method1178(64, (byte) -26, var7 + 1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method1178(16, (byte) -98, var7, var9);
                this.method1178(1, (byte) -126, var7 - 1, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1178(64, (byte) -120, var7, var9);
                this.method1178(4, (byte) -28, var7 - 1, var9 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method1178(130, (byte) -60, var7, var9);
                this.method1178(8, (byte) -58, var7, var9 - 1);
                this.method1178(32, (byte) -115, var7 + 1, var9);
            }
            if (arg4 == 1) {
                this.method1178(10, (byte) -123, var7, var9);
                this.method1178(32, (byte) -39, var7 + 1, var9);
                this.method1178(128, (byte) -103, var7, var9 + 1);
            }
            if (arg4 == 2) {
                this.method1178(40, (byte) -22, var7, var9);
                this.method1178(128, (byte) -124, var7, var9 + 1);
                this.method1178(2, (byte) -38, var7 - 1, var9);
            }
            if (arg4 == 3) {
                this.method1178(160, (byte) -61, var7, var9);
                this.method1178(2, (byte) -123, var7 - 1, var9);
                this.method1178(8, (byte) -78, var7, var9 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1178(65536, (byte) -29, var7, var9);
                this.method1178(4096, (byte) -22, var7, var9 - 1);
            }
            if (arg4 == 1) {
                this.method1178(1024, (byte) -61, var7, var9);
                this.method1178(16384, (byte) -27, var7 + 1, var9);
            }
            if (arg4 == 2) {
                this.method1178(4096, (byte) -96, var7, var9);
                this.method1178(65536, (byte) -118, var7, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1178(16384, (byte) -72, var7, var9);
                this.method1178(1024, (byte) -65, var7 - 1, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1178(512, (byte) -104, var7, var9);
                this.method1178(8192, (byte) -25, var7 + 1, var9 + -1);
            }
            if (arg4 == 1) {
                this.method1178(2048, (byte) -118, var7, var9);
                this.method1178(32768, (byte) -21, var7 + 1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method1178(8192, (byte) -59, var7, var9);
                this.method1178(512, (byte) -31, var7 - 1, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1178(32768, (byte) -28, var7, var9);
                this.method1178(2048, (byte) -111, var7 - 1, var9 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1178(66560, (byte) -19, var7, var9);
            this.method1178(4096, (byte) -81, var7, var9 - 1);
            this.method1178(16384, (byte) -122, var7 + 1, var9);
        }
        if (arg4 == 1) {
            this.method1178(5120, (byte) -34, var7, var9);
            this.method1178(16384, (byte) -117, var7 + 1, var9);
            this.method1178(65536, (byte) -50, var7, var9 + 1);
        }
        if (arg4 == 2) {
            this.method1178(20480, (byte) -126, var7, var9);
            this.method1178(65536, (byte) -103, var7, var9 + 1);
            this.method1178(1024, (byte) -101, var7 - 1, var9);
        }
        if (arg4 == 3) {
            this.method1178(81920, (byte) -95, var7, var9);
            this.method1178(1024, (byte) -105, var7 - 1, var9);
            this.method1178(4096, (byte) -79, var7, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1176(int arg0, boolean arg1, int arg2) {
        field3467++;
        if (!arg1) {
            method1184(-49, -113, 101, 5, -81, 9, -119, 36, null, -69, false, -109L);
        }
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method1177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3480++;
        if (arg2 == arg3 && arg4 == arg6) {
            return true;
        }
        int var8 = arg2 - this.field3472;
        int var9 = arg4 - this.field3479;
        int var10 = arg6 - this.field3479;
        int var11 = arg3 - this.field3472;
        if (arg5 == 0) {
            if (arg1 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field3474[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field3474[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field3474[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field3474[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 != 14055) {
            this.field3479 = -18;
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field3474[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field3474[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field3474[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field3474[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var11 && var10 + 1 == var9 && (this.field3474[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var10 - 1 == var9 && (this.field3474[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var10 && (this.field3474[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBII)V")
    private final void method1178(int arg0, byte arg1, int arg2, int arg3) {
        this.field3474[arg3][arg2] = class21.method181(this.field3474[arg3][arg2], arg0);
        if (arg1 >= -17) {
            method1176(78, false, 126);
        }
        field3476++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZIBI)V")
    public final void method1179(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        field3485++;
        int var7 = arg3 - this.field3479;
        int var8 = arg0 - this.field3472;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1174(var8, arg4 ^ 0x406C, var7, 128);
                this.method1174(var8 - 1, 16384, var7, 8);
            }
            if (arg1 == 1) {
                this.method1174(var8, 16384, var7, 2);
                this.method1174(var8, 16384, var7 + 1, 32);
            }
            if (arg1 == 2) {
                this.method1174(var8, 16384, var7, 8);
                this.method1174(var8 + 1, 16384, var7, 128);
            }
            if (arg1 == 3) {
                this.method1174(var8, 16384, var7, 32);
                this.method1174(var8, 16384, var7 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1174(var8, 16384, var7, 1);
                this.method1174(var8 - 1, 16384, var7 + 1, 16);
            }
            if (arg1 == 1) {
                this.method1174(var8, arg4 + 16276, var7, 4);
                this.method1174(var8 + 1, 16384, var7 + 1, 64);
            }
            if (arg1 == 2) {
                this.method1174(var8, 16384, var7, 16);
                this.method1174(var8 + 1, 16384, var7 - 1, 1);
            }
            if (arg1 == 3) {
                this.method1174(var8, 16384, var7, 64);
                this.method1174(var8 - 1, 16384, var7 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method1174(var8, 16384, var7, 130);
                this.method1174(var8 - 1, 16384, var7, 8);
                this.method1174(var8, 16384, var7 + 1, 32);
            }
            if (arg1 == 1) {
                this.method1174(var8, arg4 ^ 0x406C, var7, 10);
                this.method1174(var8, 16384, var7 + 1, 32);
                this.method1174(var8 + 1, arg4 + 16276, var7, 128);
            }
            if (arg1 == 2) {
                this.method1174(var8, arg4 + 16276, var7, 40);
                this.method1174(var8 + 1, 16384, var7, 128);
                this.method1174(var8, arg4 + 16276, var7 - 1, 2);
            }
            if (arg1 == 3) {
                this.method1174(var8, arg4 ^ 0x406C, var7, 160);
                this.method1174(var8, 16384, var7 - 1, 2);
                this.method1174(var8 - 1, 16384, var7, 8);
            }
        }
        if (arg4 != 108) {
            this.method1188(42, 26, 51, -78, -79, 28, -32, 84);
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1174(var8, 16384, var7, 65536);
                this.method1174(var8 - 1, 16384, var7, 4096);
            }
            if (arg1 == 1) {
                this.method1174(var8, 16384, var7, 1024);
                this.method1174(var8, 16384, var7 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method1174(var8, 16384, var7, 4096);
                this.method1174(var8 + 1, 16384, var7, 65536);
            }
            if (arg1 == 3) {
                this.method1174(var8, 16384, var7, 16384);
                this.method1174(var8, 16384, var7 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1174(var8, 16384, var7, 512);
                this.method1174(var8 - 1, arg4 ^ 0x406C, var7 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method1174(var8, arg4 + 16276, var7, 2048);
                this.method1174(var8 + 1, arg4 ^ 0x406C, var7 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method1174(var8, arg4 + 16276, var7, 8192);
                this.method1174(var8 + 1, 16384, var7 - 1, 512);
            }
            if (arg1 == 3) {
                this.method1174(var8, 16384, var7, 32768);
                this.method1174(var8 - 1, arg4 + 16276, var7 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1174(var8, 16384, var7, 66560);
            this.method1174(var8 - 1, arg4 + 16276, var7, 4096);
            this.method1174(var8, 16384, var7 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method1174(var8, 16384, var7, 5120);
            this.method1174(var8, arg4 ^ 0x406C, var7 + 1, 16384);
            this.method1174(var8 + 1, 16384, var7, 65536);
        }
        if (arg1 == 2) {
            this.method1174(var8, 16384, var7, 20480);
            this.method1174(var8 + 1, arg4 + 16276, var7, 65536);
            this.method1174(var8, 16384, var7 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method1174(var8, 16384, var7, 81920);
            this.method1174(var8, arg4 ^ 0x406C, var7 - 1, 1024);
            this.method1174(var8 - 1, 16384, var7, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBZI)V")
    public final void method1180(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        int var7 = 256;
        if (arg4) {
            var7 += 131072;
        }
        int var8 = arg5 - this.field3472;
        int var9 = arg0 - this.field3479;
        int var10 = -33 % ((arg3 + 78) / 45);
        field3486++;
        for (int var11 = var8; var11 < var8 + arg2; var11++) {
            if (var11 >= 0 && var11 < this.field3473) {
                for (int var12 = var9; var12 < arg1 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field3483) {
                        this.method1178(var7, (byte) -128, var12, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILqf;I)V")
    public static final void method1181(int arg0, int arg1, class165 arg2, int arg3) {
        field3466++;
        if (class71.field1376 != null || class167.field3223 || (arg2 == null || class195.method1294((byte) -85, arg2) == null)) {
            return;
        }
        class71.field1376 = arg2;
        if (arg3 > -33) {
            return;
        }
        class26.field558 = class195.method1294((byte) 118, arg2);
        class148.field2823 = arg0;
        class106.field1982 = false;
        class111.field2052 = arg1;
        class24.field518 = 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    public final void method1182(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3472;
        if (arg0 > 92) {
            field3484++;
            int var5 = arg2 - this.field3479;
            this.field3474[var4][var5] = class21.method181(this.field3474[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public final void method1183(byte arg0) {
        if (arg0 != -57) {
            field3463 = -4;
        }
        for (int var2 = 0; var2 < this.field3473; var2++) {
            for (int var3 = 0; var3 < this.field3483; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3473 - 5 <= var2 || this.field3483 - 5 <= var3) {
                    this.field3474[var2][var3] = 16777215;
                } else {
                    this.field3474[var2][var3] = 16777216;
                }
            }
        }
        field3468++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIILdd;IZJ)Z")
    public static final boolean method1184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class35 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class71.field1384 || var20 >= class55.field1093) {
                    return false;
                }
                class105 var21 = class208.field4055[arg0][var13][var20];
                if (var21 != null && var21.field1972 >= 5) {
                    return false;
                }
            }
        }
        class5 var14 = new class5();
        var14.field123 = arg11;
        var14.field115 = arg0;
        var14.field111 = arg5;
        var14.field119 = arg6;
        var14.field126 = arg7;
        var14.field113 = arg8;
        var14.field107 = arg9;
        var14.field120 = arg1;
        var14.field125 = arg2;
        var14.field112 = arg1 + arg3 - 1;
        var14.field104 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class208.field4055[var18][var15][var16] == null) {
                        class208.field4055[var18][var15][var16] = new class105(var18, var15, var16);
                    }
                }
                class105 var19 = class208.field4055[arg0][var15][var16];
                var19.field1948[var19.field1972] = var14;
                var19.field1950[var19.field1972] = var17;
                var19.field1943 |= var17;
                var19.field1972++;
            }
        }
        if (arg10) {
            class172.field3345[class191.field3742++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V")
    public final void method1185(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field3472;
        field3482++;
        int var5 = arg1 - this.field3479;
        int var6 = -54 / ((-arg2 - 59) / 54);
        this.field3474[var4][var5] = class21.method181(this.field3474[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1186(int arg0) {
        field3470 = null;
        field3477 = null;
        field3471 = null;
        if (arg0 < 126) {
            field3464 = null;
        }
        field3464 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method1187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3465++;
        if (arg1 == arg4 && arg5 == arg6) {
            return true;
        } else if (arg3 >= -16) {
            return true;
        } else {
            int var8 = arg6 - this.field3479;
            int var9 = arg4 - this.field3472;
            int var10 = arg1 - this.field3472;
            int var11 = arg5 - this.field3479;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var10 + 1 == var9 && var8 == var11 && (this.field3474[var9][var8] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var8 && (this.field3474[var9][var8] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var9 && var8 == var11 && (this.field3474[var9][var8] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var8 && (this.field3474[var9][var8] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var9 && var8 == var11 && (this.field3474[var9][var8] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var8 && (this.field3474[var9][var8] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 + 1 == var9 && var8 == var11 && (this.field3474[var9][var8] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var8 && (this.field3474[var9][var8] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var10 && var11 + 1 == var8 && (this.field3474[var9][var8] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field3474[var9][var8] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field3474[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field3474[var9][var8] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3462++;
        if (arg4 < 64) {
            this.method1182(122, 107, 127);
        }
        int var9 = arg0 + arg3 - 1;
        int var10 = arg1 + arg7 - 1;
        if (arg1 <= arg2 && var10 >= arg2 && arg6 >= arg0 && var9 >= arg6) {
            return true;
        } else if (arg1 - 1 == arg2 && arg6 >= arg0 && var9 >= arg6 && (this.field3474[arg2 - this.field3472][arg6 - this.field3479] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg6 >= arg0 && arg6 <= var9 && (this.field3474[arg2 - this.field3472][arg6 - this.field3479] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg6 && arg1 <= arg2 && var10 >= arg2 && (this.field3474[arg2 - this.field3472][arg6 - this.field3479] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg6 && arg2 >= arg1 && arg2 <= var10 && (this.field3474[arg2 - this.field3472][arg6 - this.field3479] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIBZI)V")
    public final void method1189(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = arg0 - this.field3479;
        if (arg4 <= 119) {
            this.method1182(101, -88, 19);
        }
        int var9 = arg2 - this.field3472;
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg6;
            arg6 = arg3;
            arg3 = var10;
        }
        int var11 = 256;
        field3478++;
        if (arg5) {
            var11 += 131072;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field3473) {
                for (int var13 = var8; var13 < arg3 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field3483) {
                        this.method1174(var12, 16384, var13, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
    public final void method1190(int arg0, int arg1, int arg2) {
        field3481++;
        int var4 = arg1 - this.field3472;
        if (arg2 != 3213) {
            this.field3473 = 19;
        }
        int var5 = arg0 - this.field3479;
        this.field3474[var4][var5] = class209.method1383(this.field3474[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(II)V")
    public class177(int arg0, int arg1) {
        this.field3483 = arg1;
        this.field3479 = 0;
        this.field3472 = 0;
        this.field3473 = arg0;
        this.field3474 = new int[this.field3473][this.field3483];
        this.method1183((byte) -57);
    }
}
