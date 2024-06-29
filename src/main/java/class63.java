import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class63 {

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Z")
    public static boolean field1288 = false;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "[I")
    public static int[] field1297;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "[I")
    public static int[] field1295;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "[I")
    public static int[] field1300;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "[I")
    public static int[] field1305;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "[I")
    public static int[] field1298;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "[I")
    public static int[] field1304;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field1293;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field1287;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Lc;")
    public static class124 field1292;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Ltn;")
    public static class60 field1296;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[[I")
    public int[][] field1283;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method548(byte arg0) {
        field1293 = null;
        field1304 = null;
        field1305 = null;
        field1298 = null;
        field1300 = null;
        field1296 = null;
        field1292 = null;
        field1295 = null;
        if (arg0 != -74) {
            field1295 = null;
        }
        field1297 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIZIII)V")
    public final void method549(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1280++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field1286;
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var10 = arg2 - this.field1301;
        if (arg5 > -94) {
            this.method549(true, 4, -103, false, 114, -111, 73);
        }
        for (int var11 = var10; var11 < var10 + arg1; var11++) {
            if (var11 >= 0 && this.field1287 > var11) {
                for (int var12 = var9; var12 < var9 + arg6; var12++) {
                    if (var12 >= 0 && this.field1273 > var12) {
                        this.method558(var8, -28121, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIB)Z")
    public final boolean method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1274++;
        if (arg0 == 1) {
            if (arg4 == arg5 && arg1 == arg3) {
                return true;
            }
        } else if (arg4 >= arg5 && (arg5 + arg0 - 1) >= arg4 && arg3 >= arg3 && arg0 + arg3 - 1 >= arg3) {
            return true;
        }
        int var9 = arg1 - this.field1286;
        int var10 = arg4 - this.field1301;
        int var11 = arg5 - this.field1301;
        int var12 = arg3 - this.field1286;
        if (arg0 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field1283[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1283[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1283[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1283[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field1283[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field1283[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1283[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field1283[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field1283[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field1283[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field1283[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field1283[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = var9 + arg0 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12 && (this.field1283[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg0) == var9 && (this.field1283[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var10 - arg0) == var11 && var12 >= var9 && var12 <= var14 && (this.field1283[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg0) == var9 && (this.field1283[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 - arg0) == var11 && var12 >= var9 && var12 <= var14 && (this.field1283[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field1283[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12 && (this.field1283[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field1283[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field1283[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var11 && var13 >= var10 && (var12 - arg0) == var9 && (this.field1283[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg0 == var11 && var12 >= var9 && var12 <= var14 && (this.field1283[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12 && (this.field1283[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg7 != 109) {
            field1297 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public final void method551(int arg0, int arg1, int arg2) {
        field1281++;
        int var4 = arg0 - this.field1286;
        int var5 = arg1 - this.field1301;
        if (arg2 != -4) {
            this.method566(21, -5, -26);
        }
        this.field1283[var5][var4] = class490.method2960(this.field1283[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
    public static final void method552(int arg0, int arg1) {
        field1275++;
        class189.field3038.method2471((byte) 98, arg0);
        if (arg1 != 128) {
            method562(-46, 6, 27, -10, -100, 6, 59, 100);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V")
    public final void method553(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1301;
        int var5 = arg1 - this.field1286;
        int var6 = 112 / ((14 - arg0) / 48);
        field1272++;
        this.field1283[var4][var5] = class418.method2558(this.field1283[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIZIIII)V")
    public final void method554(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1278++;
        int var8 = arg4 - this.field1286;
        int var9 = arg3 - this.field1301;
        if (~arg6 == arg1) {
            if (arg5 == 0) {
                this.method556(128, (byte) 112, var8, var9);
                this.method556(8, (byte) 107, var8, var9 - 1);
            }
            if (arg5 == 1) {
                this.method556(2, (byte) 127, var8, var9);
                this.method556(32, (byte) 127, var8 + 1, var9);
            }
            if (arg5 == 2) {
                this.method556(8, (byte) 125, var8, var9);
                this.method556(128, (byte) 111, var8, var9 + 1);
            }
            if (arg5 == 3) {
                this.method556(32, (byte) 108, var8, var9);
                this.method556(2, (byte) 104, var8 - 1, var9);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method556(1, (byte) 110, var8, var9);
                this.method556(16, (byte) 104, var8 + 1, var9 + -1);
            }
            if (arg5 == 1) {
                this.method556(4, (byte) 122, var8, var9);
                this.method556(64, (byte) 116, var8 + 1, var9 + 1);
            }
            if (arg5 == 2) {
                this.method556(16, (byte) 109, var8, var9);
                this.method556(1, (byte) 102, var8 - 1, var9 + 1);
            }
            if (arg5 == 3) {
                this.method556(64, (byte) 121, var8, var9);
                this.method556(4, (byte) 124, var8 - 1, var9 - 1);
            }
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                this.method556(130, (byte) 120, var8, var9);
                this.method556(8, (byte) 107, var8, var9 - 1);
                this.method556(32, (byte) 113, var8 + 1, var9);
            }
            if (arg5 == 1) {
                this.method556(10, (byte) 126, var8, var9);
                this.method556(32, (byte) 105, var8 + 1, var9);
                this.method556(128, (byte) 103, var8, var9 + 1);
            }
            if (arg5 == 2) {
                this.method556(40, (byte) 102, var8, var9);
                this.method556(128, (byte) 108, var8, var9 + 1);
                this.method556(2, (byte) 112, var8 - 1, var9);
            }
            if (arg5 == 3) {
                this.method556(160, (byte) 102, var8, var9);
                this.method556(2, (byte) 101, var8 - 1, var9);
                this.method556(8, (byte) 106, var8, var9 - 1);
            }
        }
        if (arg2) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    this.method556(65536, (byte) 126, var8, var9);
                    this.method556(4096, (byte) 118, var8, var9 - 1);
                }
                if (arg5 == 1) {
                    this.method556(1024, (byte) 115, var8, var9);
                    this.method556(16384, (byte) 104, var8 + 1, var9);
                }
                if (arg5 == 2) {
                    this.method556(4096, (byte) 110, var8, var9);
                    this.method556(65536, (byte) 123, var8, var9 + 1);
                }
                if (arg5 == 3) {
                    this.method556(16384, (byte) 112, var8, var9);
                    this.method556(1024, (byte) 119, var8 - 1, var9);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg5 == 0) {
                    this.method556(512, (byte) 111, var8, var9);
                    this.method556(8192, (byte) 124, var8 + 1, var9 + -1);
                }
                if (arg5 == 1) {
                    this.method556(2048, (byte) 114, var8, var9);
                    this.method556(32768, (byte) 108, var8 + 1, var9 - -1);
                }
                if (arg5 == 2) {
                    this.method556(8192, (byte) 125, var8, var9);
                    this.method556(512, (byte) 105, var8 - 1, var9 - -1);
                }
                if (arg5 == 3) {
                    this.method556(32768, (byte) 106, var8, var9);
                    this.method556(2048, (byte) 127, var8 - 1, var9 + -1);
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    this.method556(66560, (byte) 102, var8, var9);
                    this.method556(4096, (byte) 127, var8, var9 - 1);
                    this.method556(16384, (byte) 125, var8 + 1, var9);
                }
                if (arg5 == 1) {
                    this.method556(5120, (byte) 119, var8, var9);
                    this.method556(16384, (byte) 123, var8 + 1, var9);
                    this.method556(65536, (byte) 101, var8, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method556(20480, (byte) 110, var8, var9);
                    this.method556(65536, (byte) 116, var8, var9 + 1);
                    this.method556(1024, (byte) 122, var8 - 1, var9);
                }
                if (arg5 == 3) {
                    this.method556(81920, (byte) 121, var8, var9);
                    this.method556(1024, (byte) 124, var8 - 1, var9);
                    this.method556(4096, (byte) 108, var8, var9 - 1);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method556(536870912, (byte) 114, var8, var9);
                this.method556(33554432, (byte) 112, var8, var9 - 1);
            }
            if (arg5 == 1) {
                this.method556(8388608, (byte) 115, var8, var9);
                this.method556(134217728, (byte) 118, var8 + 1, var9);
            }
            if (arg5 == 2) {
                this.method556(33554432, (byte) 102, var8, var9);
                this.method556(536870912, (byte) 108, var8, var9 + 1);
            }
            if (arg5 == 3) {
                this.method556(134217728, (byte) 124, var8, var9);
                this.method556(8388608, (byte) 123, var8 - 1, var9);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method556(4194304, (byte) 113, var8, var9);
                this.method556(67108864, (byte) 122, var8 + 1, var9 + -1);
            }
            if (arg5 == 1) {
                this.method556(16777216, (byte) 115, var8, var9);
                this.method556(268435456, (byte) 118, var8 + 1, var9 + 1);
            }
            if (arg5 == 2) {
                this.method556(67108864, (byte) 124, var8, var9);
                this.method556(4194304, (byte) 125, var8 - 1, var9 + 1);
            }
            if (arg5 == 3) {
                this.method556(268435456, (byte) 125, var8, var9);
                this.method556(16777216, (byte) 124, var8 - 1, var9 + -1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method556(545259520, (byte) 102, var8, var9);
            this.method556(33554432, (byte) 106, var8, var9 - 1);
            this.method556(134217728, (byte) 125, var8 + 1, var9);
        }
        if (arg5 == 1) {
            this.method556(41943040, (byte) 105, var8, var9);
            this.method556(134217728, (byte) 109, var8 + 1, var9);
            this.method556(536870912, (byte) 107, var8, var9 + 1);
        }
        if (arg5 == 2) {
            this.method556(167772160, (byte) 120, var8, var9);
            this.method556(536870912, (byte) 102, var8, var9 + 1);
            this.method556(8388608, (byte) 121, var8 - 1, var9);
        }
        if (arg5 == 3) {
            this.method556(671088640, (byte) 123, var8, var9);
            this.method556(8388608, (byte) 101, var8 - 1, var9);
            this.method556(33554432, (byte) 103, var8, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public final void method555(byte arg0) {
        field1277++;
        int var2 = 0;
        if (arg0 != -101) {
            return;
        }
        while (var2 < this.field1287) {
            for (int var3 = 0; var3 < this.field1273; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1287 - 5 || this.field1273 - 5 <= var3) {
                    this.field1283[var2][var3] = -1;
                } else {
                    this.field1283[var2][var3] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBII)V")
    private final void method556(int arg0, byte arg1, int arg2, int arg3) {
        this.field1283[arg3][arg2] = class490.method2960(this.field1283[arg3][arg2], ~arg0);
        if (arg1 > 100) {
            field1270++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method557(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1302++;
        if (arg7 == 1) {
            if (arg4 == arg6 && arg0 == arg1) {
                return true;
            }
        } else if (arg4 >= arg6 && (arg6 + arg7 - 1) >= arg4 && arg0 >= arg0 && arg0 <= (arg0 + arg7 - 1)) {
            return true;
        }
        int var9 = arg4 - this.field1301;
        if (arg5 < 71) {
            this.method565(46, -114, 87, false, -81, 54, -41, 31, -40);
        }
        int var10 = arg6 - this.field1301;
        int var11 = arg1 - this.field1286;
        int var12 = arg0 - this.field1286;
        if (arg7 == 1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1283[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1283[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1283[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field1283[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                    if (var9 - 1 == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1283[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1283[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field1283[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field1283[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field1283[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field1283[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var11 == var12 && (this.field1283[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var10 - 1;
            int var14 = var11 - (1 - arg7);
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var9 - arg7 == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11 && (this.field1283[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 - arg7 == var11 && (this.field1283[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 - arg7) == var10 && var12 >= var11 && var14 >= var12 && (this.field1283[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var14 >= var12 && (this.field1283[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11 && (this.field1283[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 - arg7 == var11 && (this.field1283[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 >= var10 && var9 <= var13 && var12 - arg7 == var11) {
                        return true;
                    }
                    if (var9 - arg7 == var10 && var12 >= var11 && var12 <= var14 && (this.field1283[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var12 <= var14 && (this.field1283[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if ((var9 - arg7) == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field1283[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 - arg7) == var11 && (this.field1283[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - arg7) == var10 && var12 >= var11 && var12 <= var14 && (this.field1283[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 - arg7) == var11 && (this.field1283[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - arg7) == var10 && var11 <= var12 && var14 >= var12 && (this.field1283[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 + 1 == var11 && (this.field1283[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 - arg7) == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 - arg7) == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 + 1 == var11 && (this.field1283[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field1283[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var12 - arg7 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 <= var9 && var9 <= var13 && var12 + 1 == var11 && (this.field1283[var9][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var9 && var9 <= var13 && var12 - arg7 == var11 && (this.field1283[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg7 == var10 && var12 >= var11 && var12 <= var14 && (this.field1283[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 <= var12 && var14 >= var12 && (this.field1283[var10][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
    private final void method558(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -28121) {
            this.method566(-114, -44, -32);
        }
        field1289++;
        this.field1283[arg2][arg3] = class418.method2558(this.field1283[arg2][arg3], arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;I)Ltu;")
    public static final class233 method559(Component arg0, int arg1) {
        field1271++;
        if (arg1 != -1) {
            field1296 = null;
        }
        return new class218(arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIIIIZ)V")
    public final void method560(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1276++;
        int var8 = arg3 - this.field1301;
        int var9 = 21 % ((arg1 - 33) / 50);
        int var10 = arg2 - this.field1286;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method558(128, -28121, var8, var10);
                this.method558(8, -28121, var8 - 1, var10);
            }
            if (arg5 == 1) {
                this.method558(2, -28121, var8, var10);
                this.method558(32, -28121, var8, var10 + 1);
            }
            if (arg5 == 2) {
                this.method558(8, -28121, var8, var10);
                this.method558(128, -28121, var8 + 1, var10);
            }
            if (arg5 == 3) {
                this.method558(32, -28121, var8, var10);
                this.method558(2, -28121, var8, var10 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method558(1, -28121, var8, var10);
                this.method558(16, -28121, var8 - 1, var10 + 1);
            }
            if (arg5 == 1) {
                this.method558(4, -28121, var8, var10);
                this.method558(64, -28121, var8 + 1, var10 + 1);
            }
            if (arg5 == 2) {
                this.method558(16, -28121, var8, var10);
                this.method558(1, -28121, var8 + 1, var10 - 1);
            }
            if (arg5 == 3) {
                this.method558(64, -28121, var8, var10);
                this.method558(4, -28121, var8 - 1, var10 + -1);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method558(130, -28121, var8, var10);
                this.method558(8, -28121, var8 - 1, var10);
                this.method558(32, -28121, var8, var10 + 1);
            }
            if (arg5 == 1) {
                this.method558(10, -28121, var8, var10);
                this.method558(32, -28121, var8, var10 + 1);
                this.method558(128, -28121, var8 + 1, var10);
            }
            if (arg5 == 2) {
                this.method558(40, -28121, var8, var10);
                this.method558(128, -28121, var8 + 1, var10);
                this.method558(2, -28121, var8, var10 - 1);
            }
            if (arg5 == 3) {
                this.method558(160, -28121, var8, var10);
                this.method558(2, -28121, var8, var10 - 1);
                this.method558(8, -28121, var8 - 1, var10);
            }
        }
        if (arg6) {
            if (arg4 == 0) {
                if (arg5 == 0) {
                    this.method558(65536, -28121, var8, var10);
                    this.method558(4096, -28121, var8 - 1, var10);
                }
                if (arg5 == 1) {
                    this.method558(1024, -28121, var8, var10);
                    this.method558(16384, -28121, var8, var10 + 1);
                }
                if (arg5 == 2) {
                    this.method558(4096, -28121, var8, var10);
                    this.method558(65536, -28121, var8 + 1, var10);
                }
                if (arg5 == 3) {
                    this.method558(16384, -28121, var8, var10);
                    this.method558(1024, -28121, var8, var10 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg5 == 0) {
                    this.method558(512, -28121, var8, var10);
                    this.method558(8192, -28121, var8 - 1, var10 + 1);
                }
                if (arg5 == 1) {
                    this.method558(2048, -28121, var8, var10);
                    this.method558(32768, -28121, var8 + 1, var10 - -1);
                }
                if (arg5 == 2) {
                    this.method558(8192, -28121, var8, var10);
                    this.method558(512, -28121, var8 + 1, var10 + -1);
                }
                if (arg5 == 3) {
                    this.method558(32768, -28121, var8, var10);
                    this.method558(2048, -28121, var8 - 1, var10 + -1);
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    this.method558(66560, -28121, var8, var10);
                    this.method558(4096, -28121, var8 - 1, var10);
                    this.method558(16384, -28121, var8, var10 + 1);
                }
                if (arg5 == 1) {
                    this.method558(5120, -28121, var8, var10);
                    this.method558(16384, -28121, var8, var10 + 1);
                    this.method558(65536, -28121, var8 + 1, var10);
                }
                if (arg5 == 2) {
                    this.method558(20480, -28121, var8, var10);
                    this.method558(65536, -28121, var8 + 1, var10);
                    this.method558(1024, -28121, var8, var10 - 1);
                }
                if (arg5 == 3) {
                    this.method558(81920, -28121, var8, var10);
                    this.method558(1024, -28121, var8, var10 - 1);
                    this.method558(4096, -28121, var8 - 1, var10);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method558(536870912, -28121, var8, var10);
                this.method558(33554432, -28121, var8 - 1, var10);
            }
            if (arg5 == 1) {
                this.method558(8388608, -28121, var8, var10);
                this.method558(134217728, -28121, var8, var10 + 1);
            }
            if (arg5 == 2) {
                this.method558(33554432, -28121, var8, var10);
                this.method558(536870912, -28121, var8 + 1, var10);
            }
            if (arg5 == 3) {
                this.method558(134217728, -28121, var8, var10);
                this.method558(8388608, -28121, var8, var10 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method558(4194304, -28121, var8, var10);
                this.method558(67108864, -28121, var8 - 1, var10 + 1);
            }
            if (arg5 == 1) {
                this.method558(16777216, -28121, var8, var10);
                this.method558(268435456, -28121, var8 + 1, var10 - -1);
            }
            if (arg5 == 2) {
                this.method558(67108864, -28121, var8, var10);
                this.method558(4194304, -28121, var8 + 1, var10 - 1);
            }
            if (arg5 == 3) {
                this.method558(268435456, -28121, var8, var10);
                this.method558(16777216, -28121, var8 - 1, var10 + -1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method558(545259520, -28121, var8, var10);
            this.method558(33554432, -28121, var8 - 1, var10);
            this.method558(134217728, -28121, var8, var10 + 1);
        }
        if (arg5 == 1) {
            this.method558(41943040, -28121, var8, var10);
            this.method558(134217728, -28121, var8, var10 + 1);
            this.method558(536870912, -28121, var8 + 1, var10);
        }
        if (arg5 == 2) {
            this.method558(167772160, -28121, var8, var10);
            this.method558(536870912, -28121, var8 + 1, var10);
            this.method558(8388608, -28121, var8, var10 - 1);
        }
        if (arg5 == 3) {
            this.method558(671088640, -28121, var8, var10);
            this.method558(8388608, -28121, var8, var10 - 1);
            this.method558(33554432, -28121, var8 - 1, var10);
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 != 8388608) {
            return true;
        }
        field1282++;
        int var11 = arg1 + arg7;
        int var12 = arg6 + arg9;
        int var13 = arg0 + arg5;
        int var14 = arg2 + arg4;
        if (arg7 == var13 && (arg3 & 0x2) == 0) {
            int var15 = arg2 < arg6 ? arg6 : arg2;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field1283[var13 - this.field1301 - 1][var15 - this.field1286] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg6 <= arg2 ? arg2 : arg6;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field1283[arg0 - this.field1301][var17 - this.field1286] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg7 <= arg0 ? arg0 : arg7;
            int var20 = var11 < var13 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field1283[var19 - this.field1301][var14 - this.field1286 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg0 < arg7 ? arg7 : arg0;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field1283[var21 - this.field1301][arg2 - this.field1286] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1285++;
        int var8 = class73.method640(class216.field3415, (byte) -116, class372.field5455, arg3);
        int var9 = class73.method640(class216.field3415, (byte) -77, class372.field5455, arg6);
        int var10 = class73.method640(class43.field600, (byte) -102, class467.field6940, arg4);
        int var11 = class73.method640(class43.field600, (byte) -110, class467.field6940, arg5);
        int var12 = class73.method640(class216.field3415, (byte) -65, class372.field5455, arg0 + arg3);
        int var13 = class73.method640(class216.field3415, (byte) -95, class372.field5455, arg6 - arg0);
        int var14 = 18 / ((arg7 - 3) / 52);
        for (int var15 = var8; var15 < var12; var15++) {
            class503.method3027(var10, (byte) 127, var11, arg1, class316.field4797[var15]);
        }
        for (int var16 = var9; var16 > var13; var16--) {
            class503.method3027(var10, (byte) 127, var11, arg1, class316.field4797[var16]);
        }
        int var17 = class73.method640(class43.field600, (byte) -68, class467.field6940, arg4 + arg0);
        int var18 = class73.method640(class43.field600, (byte) -108, class467.field6940, arg5 - arg0);
        for (int var19 = var12; var19 <= var13; var19++) {
            int[] var20 = class316.field4797[var19];
            class503.method3027(var10, (byte) 127, var17, arg1, var20);
            class503.method3027(var17, (byte) 127, var18, arg2, var20);
            class503.method3027(var18, (byte) 127, var11, arg1, var20);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZZIII)V")
    public final void method563(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1290++;
        int var9 = 256;
        if (arg4) {
            var9 |= 0x20000;
        }
        int var10 = arg2 - this.field1286;
        int var11 = arg5 - this.field1301;
        if (arg3) {
            var9 |= 0x40000000;
        }
        if (arg1 == arg7 || arg1 == 3) {
            int var12 = arg6;
            arg6 = arg0;
            arg0 = var12;
        }
        for (int var13 = var11; var13 < (arg6 + var11); var13++) {
            if (var13 >= 0 && var13 < this.field1287) {
                for (int var14 = var10; var14 < (arg0 + var10); var14++) {
                    if (var14 >= 0 && this.field1273 > var14) {
                        this.method556(var9, (byte) 117, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZI)V")
    public final void method564(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field1301;
        int var5 = arg0 - this.field1286;
        field1299++;
        if (arg1) {
            field1304 = null;
        }
        this.field1283[var4][var5] = class418.method2558(this.field1283[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZIIIII)Z")
    public final boolean method565(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1291++;
        if (arg5 > 1) {
            return class202.method1391(25356, arg8, arg2, arg4, arg1, arg5, arg5, arg6, arg7) ? true : this.method561(arg8, arg5, arg7, arg0, arg2, arg6, arg4, arg1, 8388608, arg5);
        }
        int var10 = arg6 + arg8 - 1;
        int var11 = arg7 + arg2 - 1;
        if (arg1 >= arg8 && arg1 <= var10 && arg7 <= arg4 && arg4 <= var11) {
            return true;
        } else if (arg8 - 1 == arg1 && arg4 >= arg7 && var11 >= arg4 && (this.field1283[arg1 - this.field1301][arg4 - this.field1286] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg1 && arg4 >= arg7 && arg4 <= var11 && (this.field1283[arg1 - this.field1301][arg4 - this.field1286] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg3) {
            return false;
        } else if (arg7 - 1 == arg4 && arg1 >= arg8 && var10 >= arg1 && (this.field1283[arg1 - this.field1301][arg4 - this.field1286] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg4 && arg1 >= arg8 && var10 >= arg1 && (this.field1283[arg1 - this.field1301][arg4 - this.field1286] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
    public final void method566(int arg0, int arg1, int arg2) {
        field1279++;
        int var4 = arg1 - this.field1301;
        int var5 = arg2 - this.field1286;
        this.field1283[var4][var5] = class490.method2960(this.field1283[var4][var5], -262145);
        if (arg0 > -68) {
            this.method558(97, -7, 1, 19);
        }
    }

    static {
        new class309("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field1303 = 50;
        field1297 = new int[field1303];
        field1294 = 0;
        field1295 = new int[field1303];
        field1300 = new int[field1303];
        field1305 = new int[field1303];
        field1298 = new int[field1303];
        field1304 = new int[field1303];
        field1293 = new String[field1303];
    }
}
