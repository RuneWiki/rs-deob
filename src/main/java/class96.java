import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class96 {

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[[I")
    public int[][] field1349;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "[I")
    public static int[] field1358 = new int[100];

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field1346 = 0;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field1364 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Lph;")
    public static class361 field1355;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 6)
    public final void method744(boolean arg0) {
        if (arg0) {
            this.field1347 = 113;
        }
        for (int var2 = 0; var2 < this.field1348; var2++) {
            for (int var3 = 0; var3 < this.field1363; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1348 - 5 <= var2 || this.field1363 - 5 <= var3) {
                    this.field1349[var2][var3] = 16777215;
                } else {
                    this.field1349[var2][var3] = 2097152;
                }
            }
        }
        field1361++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBII)V", line = 36)
    private final void method745(int arg0, byte arg1, int arg2, int arg3) {
        this.field1349[arg0][arg2] = class287.method2076(this.field1349[arg0][arg2], ~arg3);
        field1366++;
        if (arg1 != 10) {
            this.field1349 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIIIZII)V", line = 59)
    public final void method746(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = -118 % ((arg6 - 5) / 45);
        int var9 = arg2 - this.field1347;
        int var10 = arg5 - this.field1342;
        field1337++;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method745(var9, (byte) 10, var10, 128);
                this.method745(var9 - 1, (byte) 10, var10, 8);
            }
            if (arg1 == 1) {
                this.method745(var9, (byte) 10, var10, 2);
                this.method745(var9, (byte) 10, var10 + 1, 32);
            }
            if (arg1 == 2) {
                this.method745(var9, (byte) 10, var10, 8);
                this.method745(var9 + 1, (byte) 10, var10, 128);
            }
            if (arg1 == 3) {
                this.method745(var9, (byte) 10, var10, 32);
                this.method745(var9, (byte) 10, var10 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method745(var9, (byte) 10, var10, 1);
                this.method745(var9 - 1, (byte) 10, var10 + 1, 16);
            }
            if (arg1 == 1) {
                this.method745(var9, (byte) 10, var10, 4);
                this.method745(var9 + 1, (byte) 10, var10 + 1, 64);
            }
            if (arg1 == 2) {
                this.method745(var9, (byte) 10, var10, 16);
                this.method745(var9 + 1, (byte) 10, var10 - 1, 1);
            }
            if (arg1 == 3) {
                this.method745(var9, (byte) 10, var10, 64);
                this.method745(var9 - 1, (byte) 10, var10 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method745(var9, (byte) 10, var10, 130);
                this.method745(var9 - 1, (byte) 10, var10, 8);
                this.method745(var9, (byte) 10, var10 + 1, 32);
            }
            if (arg1 == 1) {
                this.method745(var9, (byte) 10, var10, 10);
                this.method745(var9, (byte) 10, var10 + 1, 32);
                this.method745(var9 + 1, (byte) 10, var10, 128);
            }
            if (arg1 == 2) {
                this.method745(var9, (byte) 10, var10, 40);
                this.method745(var9 + 1, (byte) 10, var10, 128);
                this.method745(var9, (byte) 10, var10 - 1, 2);
            }
            if (arg1 == 3) {
                this.method745(var9, (byte) 10, var10, 160);
                this.method745(var9, (byte) 10, var10 - 1, 2);
                this.method745(var9 - 1, (byte) 10, var10, 8);
            }
        }
        if (arg4) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method745(var9, (byte) 10, var10, 65536);
                    this.method745(var9 - 1, (byte) 10, var10, 4096);
                }
                if (arg1 == 1) {
                    this.method745(var9, (byte) 10, var10, 1024);
                    this.method745(var9, (byte) 10, var10 + 1, 16384);
                }
                if (arg1 == 2) {
                    this.method745(var9, (byte) 10, var10, 4096);
                    this.method745(var9 + 1, (byte) 10, var10, 65536);
                }
                if (arg1 == 3) {
                    this.method745(var9, (byte) 10, var10, 16384);
                    this.method745(var9, (byte) 10, var10 - 1, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method745(var9, (byte) 10, var10, 512);
                    this.method745(var9 - 1, (byte) 10, var10 + 1, 8192);
                }
                if (arg1 == 1) {
                    this.method745(var9, (byte) 10, var10, 2048);
                    this.method745(var9 + 1, (byte) 10, var10 + 1, 32768);
                }
                if (arg1 == 2) {
                    this.method745(var9, (byte) 10, var10, 8192);
                    this.method745(var9 + 1, (byte) 10, var10 - 1, 512);
                }
                if (arg1 == 3) {
                    this.method745(var9, (byte) 10, var10, 32768);
                    this.method745(var9 - 1, (byte) 10, var10 - 1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method745(var9, (byte) 10, var10, 66560);
                    this.method745(var9 - 1, (byte) 10, var10, 4096);
                    this.method745(var9, (byte) 10, var10 + 1, 16384);
                }
                if (arg1 == 1) {
                    this.method745(var9, (byte) 10, var10, 5120);
                    this.method745(var9, (byte) 10, var10 + 1, 16384);
                    this.method745(var9 + 1, (byte) 10, var10, 65536);
                }
                if (arg1 == 2) {
                    this.method745(var9, (byte) 10, var10, 20480);
                    this.method745(var9 + 1, (byte) 10, var10, 65536);
                    this.method745(var9, (byte) 10, var10 - 1, 1024);
                }
                if (arg1 == 3) {
                    this.method745(var9, (byte) 10, var10, 81920);
                    this.method745(var9, (byte) 10, var10 - 1, 1024);
                    this.method745(var9 - 1, (byte) 10, var10, 4096);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method745(var9, (byte) 10, var10, 536870912);
                this.method745(var9 - 1, (byte) 10, var10, 33554432);
            }
            if (arg1 == 1) {
                this.method745(var9, (byte) 10, var10, 8388608);
                this.method745(var9, (byte) 10, var10 + 1, 134217728);
            }
            if (arg1 == 2) {
                this.method745(var9, (byte) 10, var10, 33554432);
                this.method745(var9 + 1, (byte) 10, var10, 536870912);
            }
            if (arg1 == 3) {
                this.method745(var9, (byte) 10, var10, 134217728);
                this.method745(var9, (byte) 10, var10 - 1, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method745(var9, (byte) 10, var10, 4194304);
                this.method745(var9 - 1, (byte) 10, var10 + 1, 67108864);
            }
            if (arg1 == 1) {
                this.method745(var9, (byte) 10, var10, 16777216);
                this.method745(var9 + 1, (byte) 10, var10 + 1, 268435456);
            }
            if (arg1 == 2) {
                this.method745(var9, (byte) 10, var10, 67108864);
                this.method745(var9 + 1, (byte) 10, var10 - 1, 4194304);
            }
            if (arg1 == 3) {
                this.method745(var9, (byte) 10, var10, 268435456);
                this.method745(var9 - 1, (byte) 10, var10 - 1, 16777216);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method745(var9, (byte) 10, var10, 545259520);
            this.method745(var9 - 1, (byte) 10, var10, 33554432);
            this.method745(var9, (byte) 10, var10 + 1, 134217728);
        }
        if (arg1 == 1) {
            this.method745(var9, (byte) 10, var10, 41943040);
            this.method745(var9, (byte) 10, var10 + 1, 134217728);
            this.method745(var9 + 1, (byte) 10, var10, 536870912);
        }
        if (arg1 == 2) {
            this.method745(var9, (byte) 10, var10, 167772160);
            this.method745(var9 + 1, (byte) 10, var10, 536870912);
            this.method745(var9, (byte) 10, var10 - 1, 8388608);
        }
        if (arg1 == 3) {
            this.method745(var9, (byte) 10, var10, 671088640);
            this.method745(var9, (byte) 10, var10 - 1, 8388608);
            this.method745(var9 - 1, (byte) 10, var10, 33554432);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)Z", line = 366)
    private final boolean method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1343++;
        int var11 = arg3 + arg9;
        int var12 = arg7 + arg5;
        int var13 = arg4 + arg8;
        if (arg0 != 0) {
            method760((byte) -76, 82);
        }
        int var14 = arg1 + arg6;
        if (arg4 == var11 && (arg2 & 0x2) == 0) {
            int var15 = var14 <= var12 ? var14 : var12;
            for (int var16 = arg1 >= arg7 ? arg1 : arg7; var16 < var15; var16++) {
                if ((this.field1349[var11 - this.field1347 - 1][var16 - this.field1342] & 0x8) == 0) {
                    return true;
                }
            }
        } else if (arg9 == var13 && (arg2 & 0x8) == 0) {
            int var17 = arg7 <= arg1 ? arg1 : arg7;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field1349[arg9 - this.field1347][var17 - this.field1342] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg2 & 0x1) == 0) {
            int var19 = var13 >= var11 ? var11 : var13;
            for (int var20 = arg9 >= arg4 ? arg9 : arg4; var20 < var19; var20++) {
                if ((this.field1349[var20 - this.field1347][var14 - this.field1342 - 1] & 0x2) == 0) {
                    return true;
                }
            }
        } else if (arg1 == var12 && (arg2 & 0x4) == 0) {
            int var21 = arg9 < arg4 ? arg4 : arg9;
            int var22 = var11 > var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field1349[var21 - this.field1347][arg1 - this.field1342] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIZIZI)V", line = 456)
    public final void method748(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field1342;
        int var9 = arg0 - this.field1347;
        field1357++;
        int var10 = arg6;
        if (arg5) {
            var10 = arg6 | 0x20000;
        }
        if (arg3) {
            var10 |= 0x40000000;
        }
        for (int var11 = var9; var11 < (arg2 + var9); var11++) {
            if (var11 >= 0 && var11 < this.field1348) {
                for (int var12 = var8; var12 < (arg1 + var8); var12++) {
                    if (var12 >= 0 && this.field1363 > var12) {
                        this.method754(var10, var12, -2149, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 498)
    public static void method749(int arg0) {
        if (arg0 != -3) {
            method753((byte) 40, -21);
        }
        field1355 = null;
        field1358 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZBIIIZII)V", line = 516)
    public final void method750(boolean arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var9 = arg4 - this.field1342;
        field1338++;
        int var10 = 256;
        if (arg7 == 1 || arg7 == 3) {
            int var11 = arg6;
            arg6 = arg2;
            arg2 = var11;
        }
        int var12 = arg3 - this.field1347;
        if (arg0) {
            var10 |= 0x20000;
        }
        if (arg5) {
            var10 |= 0x40000000;
        }
        int var13 = -118 % ((arg1 - 69) / 47);
        for (int var14 = var12; var14 < arg6 + var12; var14++) {
            if (var14 >= 0 && this.field1348 > var14) {
                for (int var15 = var9; var15 < (arg2 + var9); var15++) {
                    if (var15 >= 0 && this.field1363 > var15) {
                        this.method745(var14, (byte) 10, var15, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)Z", line = 572)
    public final boolean method751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1352++;
        if (arg0 == arg5) {
            if (arg3 == arg4 && arg6 == arg7) {
                return true;
            }
        } else if (arg3 <= arg4 && (arg0 + arg3 - 1) >= arg4 && arg7 >= arg7 && arg0 + arg7 - 1 >= arg7) {
            return true;
        }
        int var9 = arg7 - this.field1342;
        int var10 = arg4 - this.field1347;
        int var11 = arg6 - this.field1342;
        int var12 = arg3 - this.field1347;
        if (arg0 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field1349[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1349[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1349[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1349[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field1349[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field1349[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1349[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field1349[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field1349[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field1349[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field1349[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field1349[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = var12 + arg0 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var13 && (this.field1349[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var14 >= var10 && (var9 - arg0) == var11 && (this.field1349[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var10 - arg0) == var12 && var9 >= var11 && var9 <= var13 && (this.field1349[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var14 && (var9 - arg0) == var11 && (this.field1349[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 - arg0) == var12 && var11 <= var9 && var9 <= var13 && (this.field1349[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var14 >= var10 && (var9 + 1) == var11 && (this.field1349[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 + 1 == var12 && var9 >= var11 && var9 <= var13 && (this.field1349[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var14 && (var9 + 1) == var11 && (this.field1349[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 >= var12 && var10 <= var14 && (var9 + 1) == var11 && (this.field1349[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var10 && var14 >= var10 && (var9 - arg0) == var11 && (this.field1349[var10][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg0) == var12 && var9 >= var11 && var9 <= var13 && (this.field1349[var14][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 >= var11 && var13 >= var9 && (this.field1349[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)V", line = 756)
    public final void method752(byte arg0, int arg1, int arg2) {
        field1344++;
        int var4 = arg1 - this.field1347;
        int var5 = arg2 - this.field1342;
        this.field1349[var4][var5] = class81.method666(this.field1349[var4][var5], 262144);
        if (arg0 != -24) {
            method761(104, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[B", line = 769)
    public static final byte[] method753(byte arg0, int arg1) {
        if (arg0 != -24) {
            method758(-50, (byte) 35, 93, -14);
        }
        field1367++;
        class14 var2 = (class14) class200.field2936.method551(0, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class127.method943((byte) -126, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class14(var3);
            class200.field2936.method547((long) arg1, -1, var2);
        }
        return var2.field208;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 822)
    private final void method754(int arg0, int arg1, int arg2, int arg3) {
        field1362++;
        this.field1349[arg3][arg1] = class81.method666(this.field1349[arg3][arg1], arg0);
        if (arg2 != -2149) {
            field1346 = 73;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZIIIZZ)V", line = 835)
    public final void method755(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = arg0 - this.field1347;
        field1354++;
        int var9 = arg4 - this.field1342;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method754(128, var9, -2149, var8);
                this.method754(8, var9, -2149, var8 - 1);
            }
            if (arg2 == 1) {
                this.method754(2, var9, -2149, var8);
                this.method754(32, var9 + 1, -2149, var8);
            }
            if (arg2 == 2) {
                this.method754(8, var9, -2149, var8);
                this.method754(128, var9, -2149, var8 + 1);
            }
            if (arg2 == 3) {
                this.method754(32, var9, -2149, var8);
                this.method754(2, var9 - 1, -2149, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method754(1, var9, -2149, var8);
                this.method754(16, var9 + 1, -2149, var8 - 1);
            }
            if (arg2 == 1) {
                this.method754(4, var9, -2149, var8);
                this.method754(64, var9 + 1, -2149, var8 - -1);
            }
            if (arg2 == 2) {
                this.method754(16, var9, -2149, var8);
                this.method754(1, var9 - 1, -2149, var8 + 1);
            }
            if (arg2 == 3) {
                this.method754(64, var9, -2149, var8);
                this.method754(4, var9 - 1, -2149, var8 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method754(130, var9, -2149, var8);
                this.method754(8, var9, -2149, var8 - 1);
                this.method754(32, var9 + 1, -2149, var8);
            }
            if (arg2 == 1) {
                this.method754(10, var9, -2149, var8);
                this.method754(32, var9 + 1, -2149, var8);
                this.method754(128, var9, -2149, var8 + 1);
            }
            if (arg2 == 2) {
                this.method754(40, var9, -2149, var8);
                this.method754(128, var9, -2149, var8 + 1);
                this.method754(2, var9 - 1, -2149, var8);
            }
            if (arg2 == 3) {
                this.method754(160, var9, -2149, var8);
                this.method754(2, var9 - 1, -2149, var8);
                this.method754(8, var9, -2149, var8 - 1);
            }
        }
        if (arg5) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    this.method754(65536, var9, -2149, var8);
                    this.method754(4096, var9, -2149, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method754(1024, var9, -2149, var8);
                    this.method754(16384, var9 + 1, -2149, var8);
                }
                if (arg2 == 2) {
                    this.method754(4096, var9, -2149, var8);
                    this.method754(65536, var9, -2149, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method754(16384, var9, -2149, var8);
                    this.method754(1024, var9 - 1, -2149, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg2 == 0) {
                    this.method754(512, var9, -2149, var8);
                    this.method754(8192, var9 + 1, -2149, var8 + -1);
                }
                if (arg2 == 1) {
                    this.method754(2048, var9, -2149, var8);
                    this.method754(32768, var9 + 1, -2149, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method754(8192, var9, -2149, var8);
                    this.method754(512, var9 - 1, -2149, var8 - -1);
                }
                if (arg2 == 3) {
                    this.method754(32768, var9, -2149, var8);
                    this.method754(2048, var9 - 1, -2149, var8 + -1);
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    this.method754(66560, var9, -2149, var8);
                    this.method754(4096, var9, -2149, var8 - 1);
                    this.method754(16384, var9 + 1, -2149, var8);
                }
                if (arg2 == 1) {
                    this.method754(5120, var9, -2149, var8);
                    this.method754(16384, var9 + 1, -2149, var8);
                    this.method754(65536, var9, -2149, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method754(20480, var9, -2149, var8);
                    this.method754(65536, var9, -2149, var8 + 1);
                    this.method754(1024, var9 - 1, -2149, var8);
                }
                if (arg2 == 3) {
                    this.method754(81920, var9, -2149, var8);
                    this.method754(1024, var9 - 1, -2149, var8);
                    this.method754(4096, var9, -2149, var8 - 1);
                }
            }
        }
        if (arg6) {
            this.method757(-51, -17, false);
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method754(536870912, var9, -2149, var8);
                this.method754(33554432, var9, -2149, var8 - 1);
            }
            if (arg2 == 1) {
                this.method754(8388608, var9, -2149, var8);
                this.method754(134217728, var9 + 1, -2149, var8);
            }
            if (arg2 == 2) {
                this.method754(33554432, var9, -2149, var8);
                this.method754(536870912, var9, -2149, var8 + 1);
            }
            if (arg2 == 3) {
                this.method754(134217728, var9, -2149, var8);
                this.method754(8388608, var9 - 1, -2149, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method754(4194304, var9, -2149, var8);
                this.method754(67108864, var9 + 1, -2149, var8 - 1);
            }
            if (arg2 == 1) {
                this.method754(16777216, var9, -2149, var8);
                this.method754(268435456, var9 + 1, -2149, var8 + 1);
            }
            if (arg2 == 2) {
                this.method754(67108864, var9, -2149, var8);
                this.method754(4194304, var9 - 1, -2149, var8 + 1);
            }
            if (arg2 == 3) {
                this.method754(268435456, var9, -2149, var8);
                this.method754(16777216, var9 - 1, -2149, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method754(545259520, var9, -2149, var8);
            this.method754(33554432, var9, -2149, var8 - 1);
            this.method754(134217728, var9 + 1, -2149, var8);
        }
        if (arg2 == 1) {
            this.method754(41943040, var9, -2149, var8);
            this.method754(134217728, var9 + 1, -2149, var8);
            this.method754(536870912, var9, -2149, var8 + 1);
        }
        if (arg2 == 2) {
            this.method754(167772160, var9, -2149, var8);
            this.method754(536870912, var9, -2149, var8 + 1);
            this.method754(8388608, var9 - 1, -2149, var8);
        }
        if (arg2 == 3) {
            this.method754(671088640, var9, -2149, var8);
            this.method754(8388608, var9 - 1, -2149, var8);
            this.method754(33554432, var9, -2149, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V", line = 1140)
    public final void method756(int arg0, int arg1, int arg2) {
        field1341++;
        int var4 = arg0 - this.field1347;
        int var5 = arg2 - this.field1342;
        this.field1349[var4][var5] = class81.method666(this.field1349[var4][var5], 2097152);
        if (arg1 != 2961) {
            this.method746(true, -7, -80, -49, false, -82, 106);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)V", line = 1155)
    public final void method757(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field1347;
        int var5 = arg1 - this.field1342;
        if (!arg2) {
            this.field1348 = -87;
        }
        this.field1349[var4][var5] = class287.method2076(this.field1349[var4][var5], -262145);
        field1339++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IBII)Lmn;", line = 1172)
    public static final class110 method758(int arg0, byte arg1, int arg2, int arg3) {
        field1350++;
        int var4 = arg3 | arg0 << 8;
        class110 var5 = (class110) class119.field1683.method551(0, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class290.field4386.method2513((byte) -84, class290.field4386.method2519((byte) -31, var4));
        if (var6 == null) {
            int var7 = arg2 + 65536 << 8 | arg3;
            class110 var8 = (class110) class119.field1683.method551(0, (long) var7 << 16);
            if (var8 != null) {
                return var8;
            }
            byte[] var9 = class290.field4386.method2513((byte) -84, class290.field4386.method2519((byte) 117, var7));
            if (var9 == null) {
                int var11 = arg3 | 0xFFFF00;
                class110 var12 = (class110) class119.field1683.method551(0, (long) var11 << 16);
                if (var12 != null) {
                    return var12;
                }
                byte[] var13 = class290.field4386.method2513((byte) -84, class290.field4386.method2519((byte) 75, var11));
                int var14 = 4 % ((11 - arg1) / 32);
                if (var13 == null) {
                    return null;
                } else if (var13.length <= 1) {
                    return null;
                } else {
                    class110 var15 = class35.method262(var13, (byte) -125);
                    var15.field1597 = arg3;
                    class119.field1683.method547((long) var11 << 16, -1, var15);
                    return var15;
                }
            } else if (var9.length > 1) {
                class110 var10 = class35.method262(var9, (byte) -125);
                var10.field1597 = arg3;
                class119.field1683.method547((long) var7 << 16, -1, var10);
                return var10;
            } else {
                return null;
            }
        } else if (var6.length > 1) {
            class110 var16 = class35.method262(var6, (byte) -124);
            var16.field1597 = arg3;
            class119.field1683.method547((long) var4 << 16, -1, var16);
            return var16;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIIIIIII)Z", line = 1240)
    public final boolean method759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1340++;
        if (arg1 != -1140146928) {
            method762(48, -30);
        }
        if (arg6 == 1) {
            if (arg0 == arg4 && arg2 == arg7) {
                return true;
            }
        } else if (arg0 >= arg4 && arg4 + arg6 - 1 >= arg0 && arg7 >= arg7 && arg7 + arg6 - 1 >= arg7) {
            return true;
        }
        int var9 = arg2 - this.field1342;
        int var10 = arg0 - this.field1347;
        int var11 = arg7 - this.field1342;
        int var12 = arg4 - this.field1347;
        if (arg6 == 1) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field1349[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field1349[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field1349[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field1349[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field1349[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field1349[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field1349[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field1349[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field1349[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var9 && (this.field1349[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field1349[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var12 - 1;
            int var14 = var9 + arg6 - 1;
            if (arg3 == 0) {
                if (arg5 == 0) {
                    if (var10 - arg6 == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 + 1) == var9 && (this.field1349[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var11 - arg6) == var9 && (this.field1349[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 <= var10 && var10 <= var13 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var10 - arg6) == var12 && var9 <= var11 && var11 <= var14 && (this.field1349[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14 && (this.field1349[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 + 1) == var12 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field1349[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var11 - arg6 == var9 && (this.field1349[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 >= var12 && var13 >= var10 && (var11 - arg6) == var9) {
                        return true;
                    }
                    if (var10 - arg6 == var12 && var9 <= var11 && var11 <= var14 && (this.field1349[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14 && (this.field1349[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    if ((var10 - arg6) == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11 && (this.field1349[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var11 - arg6) == var9 && (this.field1349[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - arg6 == var12 && var11 >= var9 && var11 <= var14 && (this.field1349[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 - arg6 == var9 && (this.field1349[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg6 == var12 && var9 <= var11 && var11 <= var14 && (this.field1349[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 + 1) == var9 && (this.field1349[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var11 - arg6 == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 - arg6) == var12 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field1349[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 <= var11 && var14 >= var11 && (this.field1349[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 - arg6) == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 >= var12 && var13 >= var10 && (var11 + 1) == var9 && (this.field1349[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && (var11 - arg6) == var9 && (this.field1349[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg6) == var12 && var9 <= var11 && var14 >= var11 && (this.field1349[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 <= var11 && var14 >= var11 && (this.field1349[var12][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(BI)V", line = 1608)
    public static final void method760(byte arg0, int arg1) {
        field1351++;
        int var2 = -23 / ((15 - arg0) / 37);
        if (arg1 == -1 || !class121.field1709[arg1]) {
            return;
        }
        class3.field104.method2517(0, arg1);
        if (class119.field1677[arg1] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class119.field1677[arg1].length; var4++) {
            if (class119.field1677[arg1][var4] != null) {
                if (class119.field1677[arg1][var4].field5554 == 2) {
                    var3 = false;
                } else {
                    class119.field1677[arg1][var4] = null;
                }
            }
        }
        if (var3) {
            class119.field1677[arg1] = null;
        }
        class121.field1709[arg1] = false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)I", line = 1657)
    public static final int method761(int arg0, byte arg1) {
        if (arg1 >= -9) {
            field1364 = 25;
        }
        field1345++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 1676)
    public static final void method762(int arg0, int arg1) {
        class222.method1630(class222.field3339, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        field1353++;
        class222.method1625(-50.0F, -60.0F, -50.0F);
        class222.method1621(class222.field3338, arg0, false);
        class222.method1623();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)Z", line = 1695)
    public final boolean method763(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1359++;
        if (arg1 == arg2 && arg0 == arg4) {
            return true;
        }
        int var6 = arg4 - this.field1342;
        int var7 = arg1 - this.field1347;
        if (var7 < 0 || this.field1348 <= var7 || var6 < 0 || this.field1363 <= var6) {
            return false;
        }
        int var8 = arg2 - this.field1347;
        int var9 = arg0 - this.field1342;
        if (var8 < 0 || var8 >= this.field1348 || var9 < 0 || var9 >= this.field1363) {
            return false;
        }
        if (arg3 != 2883848) {
            field1358 = (int[]) null;
        }
        int var10;
        if (var8 < var7) {
            var10 = var7 - var8;
        } else {
            var10 = var8 - var7;
        }
        int var11;
        if (var9 >= var6) {
            var11 = var9 - var6;
        } else {
            var11 = var6 - var9;
        }
        if (var11 >= var10) {
            int var12 = 32768;
            int var13 = var10 * 65536 / var11;
            while (var6 != var9) {
                if (var9 < var6) {
                    if ((this.field1349[var8][var9] & 0x2C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var6 < var9) {
                    if ((this.field1349[var8][var9] & 0x2C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var7 > var8) {
                        if ((this.field1349[var8][var9] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field1349[var8][var9] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = 32768;
            int var15 = var11 * 65536 / var10;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field1349[var8][var9] & 0x2C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var7) {
                    if ((this.field1349[var8][var9] & 0x2C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var6 > var9) {
                        if ((this.field1349[var8][var9] & 0x2C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field1349[var8][var9] & 0x2C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field1349[var7][var6] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(II)V", line = 1847)
    public class96(int arg0, int arg1) {
        this.field1348 = arg0;
        this.field1347 = 0;
        this.field1363 = arg1;
        this.field1342 = 0;
        this.field1349 = new int[this.field1348][this.field1363];
        this.method744(false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIII)Z", line = 1871)
    public final boolean method764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1356++;
        if (arg6 > 1) {
            return class89.method712(arg6, arg1, arg3, arg5, arg6, arg0, arg7, arg4, (byte) -95) ? true : this.method747(0, arg5, arg2, arg1, arg7, arg6, arg4, arg0, arg6, arg3);
        }
        int var10 = arg5 + arg4 - 1;
        int var11 = arg3 + arg1 - 1;
        if (arg3 <= arg7 && var11 >= arg7 && arg0 >= arg5 && var10 >= arg0) {
            return true;
        } else if ((arg3 - 1) == arg7 && arg0 >= arg5 && var10 >= arg0 && (this.field1349[arg7 - this.field1347][arg0 - this.field1342] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var11 + 1 == arg7 && arg5 <= arg0 && var10 >= arg0 && (this.field1349[arg7 - this.field1347][arg0 - this.field1342] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else {
            int var12 = 124 % ((arg8 - 50) / 34);
            if (arg5 - 1 == arg0 && arg7 >= arg3 && arg7 <= var11 && (this.field1349[arg7 - this.field1347][arg0 - this.field1342] & 0x2) == 0 && (arg2 & 0x4) == 0) {
                return true;
            } else {
                return var10 + 1 == arg0 && arg7 >= arg3 && arg7 <= var11 && (this.field1349[arg7 - this.field1347][arg0 - this.field1342] & 0x20) == 0 && (arg2 & 0x1) == 0;
            }
        }
    }
}
