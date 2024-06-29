import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    private int field362 = 0;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[[I")
    public int[][] field371;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Z")
    public static boolean field379 = true;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field374 = 0;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Z")
    public static boolean field361 = true;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Lqh;")
    public static class201 field385;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public final void method200(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field362;
        if (arg1 <= -12) {
            int var5 = arg2 - this.field365;
            field377++;
            this.field371[var4][var5] = class220.method1495(this.field371[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method201(byte arg0) {
        if (arg0 <= 62) {
            field361 = true;
        }
        field385 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIIIII)V")
    public final void method202(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field362;
        field372++;
        int var8 = arg4 - this.field365;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method207(128, var8, var7, 126);
                this.method207(8, var8, var7 - 1, 127);
            }
            if (arg5 == 1) {
                this.method207(2, var8, var7, 126);
                this.method207(32, var8 + 1, var7, 127);
            }
            if (arg5 == 2) {
                this.method207(8, var8, var7, 127);
                this.method207(128, var8, var7 + 1, 126);
            }
            if (arg5 == 3) {
                this.method207(32, var8, var7, 127);
                this.method207(2, var8 - 1, var7, 126);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method207(1, var8, var7, 125);
                this.method207(16, var8 + 1, var7 - 1, 125);
            }
            if (arg5 == 1) {
                this.method207(4, var8, var7, 127);
                this.method207(64, var8 + 1, var7 + 1, 125);
            }
            if (arg5 == 2) {
                this.method207(16, var8, var7, 127);
                this.method207(1, var8 - 1, var7 + 1, 126);
            }
            if (arg5 == 3) {
                this.method207(64, var8, var7, 126);
                this.method207(4, var8 - 1, var7 + -1, 126);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method207(130, var8, var7, 125);
                this.method207(8, var8, var7 - 1, 127);
                this.method207(32, var8 + 1, var7, 127);
            }
            if (arg5 == 1) {
                this.method207(10, var8, var7, 125);
                this.method207(32, var8 + 1, var7, 126);
                this.method207(128, var8, var7 + 1, 125);
            }
            if (arg5 == 2) {
                this.method207(40, var8, var7, 127);
                this.method207(128, var8, var7 + 1, 127);
                this.method207(2, var8 - 1, var7, 126);
            }
            if (arg5 == 3) {
                this.method207(160, var8, var7, 125);
                this.method207(2, var8 - 1, var7, 126);
                this.method207(8, var8, var7 - 1, 127);
            }
        }
        if (arg0) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method207(65536, var8, var7, 126);
                    this.method207(4096, var8, var7 - 1, 125);
                }
                if (arg5 == 1) {
                    this.method207(1024, var8, var7, 127);
                    this.method207(16384, var8 + 1, var7, 127);
                }
                if (arg5 == 2) {
                    this.method207(4096, var8, var7, 126);
                    this.method207(65536, var8, var7 + 1, 125);
                }
                if (arg5 == 3) {
                    this.method207(16384, var8, var7, 125);
                    this.method207(1024, var8 - 1, var7, 127);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method207(512, var8, var7, 126);
                    this.method207(8192, var8 + 1, var7 + -1, 127);
                }
                if (arg5 == 1) {
                    this.method207(2048, var8, var7, 127);
                    this.method207(32768, var8 + 1, var7 + 1, 125);
                }
                if (arg5 == 2) {
                    this.method207(8192, var8, var7, 127);
                    this.method207(512, var8 - 1, var7 + 1, 125);
                }
                if (arg5 == 3) {
                    this.method207(32768, var8, var7, 126);
                    this.method207(2048, var8 - 1, var7 - 1, 125);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method207(66560, var8, var7, 126);
                    this.method207(4096, var8, var7 - 1, 126);
                    this.method207(16384, var8 + 1, var7, 126);
                }
                if (arg5 == 1) {
                    this.method207(5120, var8, var7, 125);
                    this.method207(16384, var8 + 1, var7, 127);
                    this.method207(65536, var8, var7 + 1, 126);
                }
                if (arg5 == 2) {
                    this.method207(20480, var8, var7, 125);
                    this.method207(65536, var8, var7 + 1, 125);
                    this.method207(1024, var8 - 1, var7, 125);
                }
                if (arg5 == 3) {
                    this.method207(81920, var8, var7, 127);
                    this.method207(1024, var8 - 1, var7, 126);
                    this.method207(4096, var8, var7 - 1, 127);
                }
            }
        }
        int var9 = 29 % ((26 - arg1) / 51);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != -1) {
            this.field365 = 6;
        }
        int var11 = arg6 + arg7;
        field368++;
        int var12 = arg5 + arg0;
        int var13 = arg3 + arg9;
        int var14 = arg1 + arg4;
        if (arg6 >= arg5 && arg6 < var12) {
            if (arg9 == var14 && (arg8 & 0x4) == 0) {
                int var15 = arg6;
                int var16 = var12 < var11 ? var12 : var11;
                while (var15 < var16) {
                    if ((this.field371[var15 - this.field362][var14 - this.field365 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg4 == var13 && (arg8 & 0x1) == 0) {
                int var17 = arg6;
                int var18 = var11 > var12 ? var12 : var11;
                while (var17 < var18) {
                    if ((this.field371[var17 - this.field362][arg4 - this.field365] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg5 < var11 && var11 <= var12) {
            if (arg9 == var14 && (arg8 & 0x4) == 0) {
                for (int var19 = arg5; var19 < var11; var19++) {
                    if ((this.field371[var19 - this.field362][var14 - this.field365 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var13 && (arg8 & 0x1) == 0) {
                for (int var20 = arg5; var20 < var11; var20++) {
                    if ((this.field371[var20 - this.field362][arg4 - this.field365] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg4 >= arg9 && arg4 < var13) {
            if (arg5 == var11 && (arg8 & 0x8) == 0) {
                int var21 = var13 < var14 ? var13 : var14;
                for (int var22 = arg4; var22 < var21; var22++) {
                    if ((this.field371[var11 - this.field362 - 1][var22 - this.field365] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var12 && (arg8 & 0x2) == 0) {
                int var23 = arg4;
                int var24 = var14 > var13 ? var13 : var14;
                while (var24 > var23) {
                    if ((this.field371[arg6 - this.field362][var23 - this.field365] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var14 > arg9 && var14 <= var13) {
            if (arg5 == var11 && (arg8 & 0x8) == 0) {
                for (int var25 = arg9; var25 < var14; var25++) {
                    if ((this.field371[var11 - this.field362 - 1][var25 - this.field365] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var12 && (arg8 & 0x2) == 0) {
                for (int var26 = arg9; var26 < var14; var26++) {
                    if ((this.field371[arg6 - this.field362][var26 - this.field365] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field382++;
        if (arg7 > 1) {
            return this.method212(35, arg6, arg8, arg5, arg2, arg7, arg7, arg1, arg4) ? true : this.method203(arg1, arg7, arg0, arg2, arg6, arg5, arg8, arg7, arg3, arg4);
        }
        int var10 = arg2 + arg4 - 1;
        int var11 = arg1 + arg5 - 1;
        if (arg8 >= arg5 && var11 >= arg8 && arg6 >= arg4 && var10 >= arg6) {
            return true;
        } else if ((arg5 - 1) == arg8 && arg6 >= arg4 && var10 >= arg6 && (this.field371[arg8 - this.field362][arg6 - this.field365] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var11 + 1 == arg8 && arg4 <= arg6 && var10 >= arg6 && (this.field371[arg8 - this.field362][arg6 - this.field365] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg0 + arg4 == arg6 && arg8 >= arg5 && arg8 <= var11 && (this.field371[arg8 - this.field362][arg6 - this.field365] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return (var10 + 1) == arg6 && arg8 >= arg5 && arg8 <= var11 && (this.field371[arg8 - this.field362][arg6 - this.field365] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
    public final void method205(int arg0, int arg1, int arg2) {
        field373++;
        int var4 = arg1 - this.field365;
        int var5 = arg0 - this.field362;
        if (arg2 <= -57) {
            this.field371[var5][var4] = class202.method1393(this.field371[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIIZII)V")
    public final void method206(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field365;
        field378++;
        int var8 = arg4 - this.field362;
        int var9 = 256;
        if (arg0) {
            var9 += 131072;
        }
        if (arg3) {
            field384 = 118;
        }
        for (int var10 = var8; var10 < (arg1 + var8); var10++) {
            if (var10 >= 0 && var10 < this.field366) {
                for (int var11 = var7; var11 < arg5 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field381) {
                        this.method207(var9, var11, var10, 127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
    private final void method207(int arg0, int arg1, int arg2, int arg3) {
        field370++;
        if (arg3 < 124) {
            this.method207(-119, 13, 112, -65);
        }
        this.field371[arg2][arg1] = class220.method1495(this.field371[arg2][arg1], arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IC)C")
    public static final char method208(int arg0, char arg1) {
        field380++;
        if (arg1 == 'Æ') {
            return 'E';
        }
        if (arg0 != -12330) {
            method201((byte) 113);
        }
        if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field360++;
        if (arg7 == 1) {
            if (arg1 == arg2 && arg4 == arg5) {
                return true;
            }
        } else if (arg1 <= arg2 && arg2 <= arg1 + arg7 - 1 && arg5 <= arg5 && arg5 <= arg5 + arg7 - 1) {
            return true;
        }
        int var9 = arg2 - this.field362;
        int var10 = arg4 - this.field365;
        int var11 = arg1 - this.field362;
        if (arg0 != -7593) {
            return true;
        }
        int var12 = arg5 - this.field365;
        if (arg7 == 1) {
            if (arg6 == 0) {
                if (arg3 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field371[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field371[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field371[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field371[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field371[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field371[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field371[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field371[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field371[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field371[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field371[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field371[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field371[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field371[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field371[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field371[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field371[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field371[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field371[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field371[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg7 - 1;
            int var14 = var10 + arg7 - 1;
            if (arg6 == 0) {
                if (arg3 == 0) {
                    if ((var9 - arg7) == var11 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10 && (this.field371[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 - arg7 == var10 && (this.field371[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var9 - arg7 == var11 && var10 <= var12 && var12 <= var14 && (this.field371[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var12 <= var14 && (this.field371[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 + 1) == var10 && (this.field371[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg7) == var10 && (this.field371[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg7) == var10) {
                        return true;
                    }
                    if (var9 - arg7 == var11 && var10 <= var12 && var12 <= var14 && (this.field371[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 <= var12 && var14 >= var12 && (this.field371[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    if ((var9 - arg7) == var11 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12 && (this.field371[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 - arg7 == var10 && (this.field371[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - arg7 == var11 && var12 >= var10 && var12 <= var14 && (this.field371[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 - arg7) == var10 && (this.field371[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - arg7 == var11 && var12 >= var10 && var14 >= var12 && (this.field371[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 + 1) == var10 && (this.field371[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg7) == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 - arg7) == var11 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 + 1 == var10 && (this.field371[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var12 <= var14 && (this.field371[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg7) == var10) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var9 >= var11 && var13 >= var9 && var12 + 1 == var10 && (this.field371[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var13 >= var9 && (var12 - arg7) == var10 && (this.field371[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg7 == var11 && var12 >= var10 && var14 >= var12 && (this.field371[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 >= var10 && var14 >= var12 && (this.field371[var11][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public final void method210(byte arg0) {
        if (arg0 <= 107) {
            this.method214(-78, -100, false, 22, 16, 86);
        }
        for (int var2 = 0; var2 < this.field366; var2++) {
            for (int var3 = 0; var3 < this.field381; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field366 - 5) || this.field381 - 5 <= var3) {
                    this.field371[var2][var3] = 16777215;
                } else {
                    this.field371[var2][var3] = 16777216;
                }
            }
        }
        field383++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBIIIZ)V")
    public final void method211(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field367++;
        int var8 = arg4 - this.field365;
        if (arg3 == 1 || arg3 == 3) {
            int var9 = arg5;
            arg5 = arg1;
            arg1 = var9;
        }
        int var10 = 256;
        if (arg6) {
            var10 += 131072;
        }
        int var11 = arg0 - this.field362;
        int var12 = 30 / ((arg2 - 69) / 35);
        for (int var13 = var11; var13 < (arg5 + var11); var13++) {
            if (var13 >= 0 && this.field366 > var13) {
                for (int var14 = var8; var14 < (arg1 + var8); var14++) {
                    if (var14 >= 0 && this.field381 > var14) {
                        this.method215(var14, 19136768, var10, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIIIIII)Z")
    private final boolean method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field369++;
        if (arg0 < 18) {
            this.field366 = 76;
        }
        if (arg2 < (arg3 + arg7) && arg3 < arg2 + arg5) {
            return arg4 + arg8 > arg1 && arg8 < (arg1 + arg6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIBI)Z")
    public final boolean method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field375++;
        if (arg1 == 1) {
            if (arg2 == arg5 && arg3 == arg4) {
                return true;
            }
        } else if (arg2 >= arg5 && arg2 <= (arg1 + arg5 - 1) && arg3 >= arg3 && (arg1 + arg3 - 1) >= arg3) {
            return true;
        }
        int var9 = arg5 - this.field362;
        int var10 = arg2 - this.field362;
        int var11 = arg4 - this.field365;
        int var12 = arg3 - this.field365;
        if (arg6 != 64) {
            field379 = false;
        }
        if (arg1 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field371[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field371[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field371[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field371[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field371[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field371[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field371[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field371[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field371[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field371[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field371[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field371[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 - (1 - arg1);
            int var14 = var9 - (1 - arg1);
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var13 && (this.field371[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var14 && (var12 - arg1) == var11 && (this.field371[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 - arg1 == var9 && var12 >= var11 && var12 <= var13 && (this.field371[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var14 >= var10 && var12 - arg1 == var11 && (this.field371[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 - arg1) == var9 && var11 <= var12 && var13 >= var12 && (this.field371[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var14 >= var10 && (var12 + 1) == var11 && (this.field371[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var13 && (this.field371[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var14 && var12 + 1 == var11 && (this.field371[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var10 >= var9 && var10 <= var14 && (var12 + 1) == var11 && (this.field371[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var9 && var14 >= var10 && var12 - arg1 == var11 && (this.field371[var10][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg1) == var9 && var12 >= var11 && var12 <= var13 && (this.field371[var14][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 <= var12 && var13 >= var12 && (this.field371[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZIII)V")
    public final void method214(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field363++;
        if (arg1 != -1) {
            this.method215(84, 121, -104, -69);
        }
        int var7 = arg3 - this.field365;
        int var8 = arg5 - this.field362;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method215(var7, 19136768, 128, var8);
                this.method215(var7, 19136768, 8, var8 - 1);
            }
            if (arg0 == 1) {
                this.method215(var7, arg1 ^ 0xFEDBFEFF, 2, var8);
                this.method215(var7 + 1, arg1 + 19136769, 32, var8);
            }
            if (arg0 == 2) {
                this.method215(var7, 19136768, 8, var8);
                this.method215(var7, 19136768, 128, var8 + 1);
            }
            if (arg0 == 3) {
                this.method215(var7, 19136768, 32, var8);
                this.method215(var7 - 1, arg1 + 19136769, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method215(var7, 19136768, 1, var8);
                this.method215(var7 + 1, 19136768, 16, var8 - 1);
            }
            if (arg0 == 1) {
                this.method215(var7, 19136768, 4, var8);
                this.method215(var7 + 1, 19136768, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method215(var7, 19136768, 16, var8);
                this.method215(var7 - 1, 19136768, 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method215(var7, arg1 + 19136769, 64, var8);
                this.method215(var7 - 1, arg1 ^ 0xFEDBFEFF, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method215(var7, arg1 + 19136769, 130, var8);
                this.method215(var7, 19136768, 8, var8 - 1);
                this.method215(var7 + 1, arg1 + 19136769, 32, var8);
            }
            if (arg0 == 1) {
                this.method215(var7, 19136768, 10, var8);
                this.method215(var7 + 1, 19136768, 32, var8);
                this.method215(var7, arg1 + 19136769, 128, var8 + 1);
            }
            if (arg0 == 2) {
                this.method215(var7, 19136768, 40, var8);
                this.method215(var7, 19136768, 128, var8 + 1);
                this.method215(var7 - 1, 19136768, 2, var8);
            }
            if (arg0 == 3) {
                this.method215(var7, 19136768, 160, var8);
                this.method215(var7 - 1, 19136768, 2, var8);
                this.method215(var7, 19136768, 8, var8 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method215(var7, 19136768, 65536, var8);
                this.method215(var7, 19136768, 4096, var8 - 1);
            }
            if (arg0 == 1) {
                this.method215(var7, arg1 + 19136769, 1024, var8);
                this.method215(var7 + 1, 19136768, 16384, var8);
            }
            if (arg0 == 2) {
                this.method215(var7, arg1 ^ 0xFEDBFEFF, 4096, var8);
                this.method215(var7, 19136768, 65536, var8 + 1);
            }
            if (arg0 == 3) {
                this.method215(var7, 19136768, 16384, var8);
                this.method215(var7 - 1, 19136768, 1024, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method215(var7, arg1 + 19136769, 512, var8);
                this.method215(var7 + 1, 19136768, 8192, var8 - 1);
            }
            if (arg0 == 1) {
                this.method215(var7, 19136768, 2048, var8);
                this.method215(var7 + 1, arg1 ^ 0xFEDBFEFF, 32768, var8 + 1);
            }
            if (arg0 == 2) {
                this.method215(var7, 19136768, 8192, var8);
                this.method215(var7 - 1, 19136768, 512, var8 + 1);
            }
            if (arg0 == 3) {
                this.method215(var7, arg1 ^ 0xFEDBFEFF, 32768, var8);
                this.method215(var7 - 1, 19136768, 2048, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method215(var7, 19136768, 66560, var8);
            this.method215(var7, 19136768, 4096, var8 - 1);
            this.method215(var7 + 1, 19136768, 16384, var8);
        }
        if (arg0 == 1) {
            this.method215(var7, arg1 + 19136769, 5120, var8);
            this.method215(var7 + 1, 19136768, 16384, var8);
            this.method215(var7, 19136768, 65536, var8 + 1);
        }
        if (arg0 == 2) {
            this.method215(var7, 19136768, 20480, var8);
            this.method215(var7, 19136768, 65536, var8 + 1);
            this.method215(var7 - 1, 19136768, 1024, var8);
        }
        if (arg0 == 3) {
            this.method215(var7, arg1 ^ 0xFEDBFEFF, 81920, var8);
            this.method215(var7 - 1, arg1 ^ 0xFEDBFEFF, 1024, var8);
            this.method215(var7, arg1 ^ 0xFEDBFEFF, 4096, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIII)V")
    private final void method215(int arg0, int arg1, int arg2, int arg3) {
        field376++;
        this.field371[arg3][arg0] = class202.method1393(this.field371[arg3][arg0], ~arg2);
        if (arg1 != 19136768) {
            this.field366 = -84;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)V")
    public final void method216(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field362;
        field359++;
        int var5 = arg1 - this.field365;
        this.field371[var4][var5] = class220.method1495(this.field371[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILf;B)V")
    public static final void method217(int arg0, int arg1, class36 arg2, byte arg3) {
        field364++;
        if (arg3 <= 46) {
            field374 = -94;
        }
        if (arg2.field719 == 0) {
            arg2.field607 = arg2.field631;
        } else if (arg2.field719 == 1) {
            arg2.field607 = (arg1 - arg2.field676) / 2 + arg2.field631;
        } else if (arg2.field719 == 2) {
            arg2.field607 = arg1 - arg2.field631 - arg2.field676;
        } else if (arg2.field719 == 3) {
            arg2.field607 = arg2.field631 * arg1 >> 14;
        } else if (arg2.field719 == 4) {
            arg2.field607 = (arg2.field631 * arg1 >> 14) + (arg1 - arg2.field676) / 2;
        } else {
            arg2.field607 = arg1 - arg2.field676 - (arg2.field631 * arg1 >> 14);
        }
        if (arg2.field604 == 0) {
            arg2.field606 = arg2.field695;
        } else if (arg2.field604 == 1) {
            arg2.field606 = (arg0 - arg2.field642) / 2 + arg2.field695;
        } else if (arg2.field604 == 2) {
            arg2.field606 = arg0 - arg2.field642 - arg2.field695;
        } else if (arg2.field604 == 3) {
            arg2.field606 = arg2.field695 * arg0 >> 14;
        } else if (arg2.field604 == 4) {
            arg2.field606 = (arg2.field695 * arg0 >> 14) + (arg0 - arg2.field642) / 2;
        } else {
            arg2.field606 = arg0 - (arg2.field695 * arg0 >> 14) - arg2.field642;
        }
        if (!class103.field1675) {
            return;
        }
        if (client.method1093(arg2).field1313 == 0 && arg2.field709 != 0) {
            return;
        }
        if (arg2.field606 < 0) {
            arg2.field606 = 0;
        } else if (arg2.field642 + arg2.field606 > arg0) {
            arg2.field606 = arg0 - arg2.field642;
        }
        if (arg2.field607 < 0) {
            arg2.field607 = 0;
            return;
        }
        if ((arg2.field676 + arg2.field607) > arg1) {
            arg2.field607 = arg1 - arg2.field676;
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V")
    public class22(int arg0, int arg1) {
        this.field366 = arg0;
        this.field381 = arg1;
        this.field371 = new int[this.field366][this.field381];
        this.field365 = 0;
        this.method210((byte) 123);
    }
}
