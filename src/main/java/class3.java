import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    private int field39 = 0;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "[[I")
    public int[][] field45;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lkh;")
    public static class117 field25 = class224.method1450((byte) 117, "<br>(X");

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Leh;")
    public static class53 field46 = new class53(50);

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public static int field47 = -1;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Ls;")
    public static class197 field42;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lvf;")
    public static class235 field37;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBII)V")
    private final void method10(int arg0, byte arg1, int arg2, int arg3) {
        this.field45[arg2][arg3] = class209.method1370(this.field45[arg2][arg3], ~arg0);
        if (arg1 != -96) {
            this.field45 = null;
        }
        field22++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIBI)Z")
    public final boolean method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 <= 65) {
            this.field45 = null;
        }
        field36++;
        if (arg5 == 1) {
            if (arg4 == arg7 && arg0 == arg2) {
                return true;
            }
        } else if (arg4 <= arg7 && arg7 <= arg4 + arg5 - 1 && arg0 >= arg0 && arg0 + arg5 - 1 >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field31;
        int var10 = arg4 - this.field39;
        int var11 = arg7 - this.field39;
        int var12 = arg2 - this.field31;
        if (arg5 == 1) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field45[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field45[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field45[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field45[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field45[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field45[var10][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field45[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field45[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field45[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field45[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field45[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg5 - 1;
            int var14 = var12 + arg5 - 1;
            if (arg3 == 0) {
                if (arg1 == 0) {
                    if (var11 - arg5 == var10 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var9 + 1 == var12 && (this.field45[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var9 - arg5 == var12 && (this.field45[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 >= var10 && var13 >= var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var11 - arg5 == var10 && var9 >= var12 && var14 >= var9 && (this.field45[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 <= var9 && var9 <= var14 && (this.field45[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 + 1 == var10 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var9 + 1 == var12 && (this.field45[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var9 - arg5 == var12 && (this.field45[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 <= var11 && var13 >= var11 && var9 - arg5 == var12) {
                        return true;
                    }
                    if (var11 - arg5 == var10 && var9 >= var12 && var14 >= var9 && (this.field45[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 <= var9 && var14 >= var9 && (this.field45[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    if (var11 - arg5 == var10 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 >= var12 && var9 <= var14 && (this.field45[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var9 - arg5 == var12 && (this.field45[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - arg5 == var10 && var12 <= var9 && var9 <= var14 && (this.field45[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var9 - arg5 == var12 && (this.field45[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - arg5 == var10 && var9 >= var12 && var14 >= var9 && (this.field45[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var9 + 1 == var12 && (this.field45[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var9 - arg5 == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 - arg5 == var10 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var9 + 1 == var12 && (this.field45[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 >= var12 && var14 >= var9 && (this.field45[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var9 - arg5 == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var11 >= var10 && var13 >= var11 && var9 + 1 == var12 && (this.field45[var11][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 <= var11 && var11 <= var13 && var9 - arg5 == var12 && (this.field45[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg5 == var10 && var9 >= var12 && var9 <= var14 && (this.field45[var13][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var12 <= var9 && var9 <= var14 && (this.field45[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIZIII)V")
    public final void method12(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field44++;
        int var8 = arg4 - this.field39;
        int var9 = arg1 - this.field31;
        int var10 = 256;
        int var11 = 95 % ((38 - arg0) / 48);
        if (arg3) {
            var10 += 131072;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg2;
            arg2 = arg6;
            arg6 = var12;
        }
        for (int var13 = var8; var13 < arg2 + var8; var13++) {
            if (var13 >= 0 && var13 < this.field29) {
                for (int var14 = var9; var14 < arg6 + var9; var14++) {
                    if (var14 >= 0 && var14 < this.field41) {
                        this.method10(var10, (byte) -96, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method13(byte arg0) {
        field46 = null;
        field25 = null;
        field42 = null;
        field37 = null;
        int var1 = -26 / ((arg0 - 5) / 52);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZIIIB)V")
    public final void method14(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        field33++;
        if (arg5 != -46) {
            return;
        }
        int var7 = arg3 - this.field39;
        int var8 = arg2 - this.field31;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method10(128, (byte) -96, var7, var8);
                this.method10(8, (byte) -96, var7 - 1, var8);
            }
            if (arg4 == 1) {
                this.method10(2, (byte) -96, var7, var8);
                this.method10(32, (byte) -96, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method10(8, (byte) -96, var7, var8);
                this.method10(128, (byte) -96, var7 + 1, var8);
            }
            if (arg4 == 3) {
                this.method10(32, (byte) -96, var7, var8);
                this.method10(2, (byte) -96, var7, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method10(1, (byte) -96, var7, var8);
                this.method10(16, (byte) -96, var7 - 1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method10(4, (byte) -96, var7, var8);
                this.method10(64, (byte) -96, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method10(16, (byte) -96, var7, var8);
                this.method10(1, (byte) -96, var7 + 1, var8 + -1);
            }
            if (arg4 == 3) {
                this.method10(64, (byte) -96, var7, var8);
                this.method10(4, (byte) -96, var7 - 1, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method10(130, (byte) -96, var7, var8);
                this.method10(8, (byte) -96, var7 - 1, var8);
                this.method10(32, (byte) -96, var7, var8 + 1);
            }
            if (arg4 == 1) {
                this.method10(10, (byte) -96, var7, var8);
                this.method10(32, (byte) -96, var7, var8 + 1);
                this.method10(128, (byte) -96, var7 + 1, var8);
            }
            if (arg4 == 2) {
                this.method10(40, (byte) -96, var7, var8);
                this.method10(128, (byte) -96, var7 + 1, var8);
                this.method10(2, (byte) -96, var7, var8 - 1);
            }
            if (arg4 == 3) {
                this.method10(160, (byte) -96, var7, var8);
                this.method10(2, (byte) -96, var7, var8 - 1);
                this.method10(8, (byte) -96, var7 - 1, var8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method10(65536, (byte) -96, var7, var8);
                this.method10(4096, (byte) -96, var7 - 1, var8);
            }
            if (arg4 == 1) {
                this.method10(1024, (byte) -96, var7, var8);
                this.method10(16384, (byte) -96, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method10(4096, (byte) -96, var7, var8);
                this.method10(65536, (byte) -96, var7 + 1, var8);
            }
            if (arg4 == 3) {
                this.method10(16384, (byte) -96, var7, var8);
                this.method10(1024, (byte) -96, var7, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method10(512, (byte) -96, var7, var8);
                this.method10(8192, (byte) -96, var7 - 1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method10(2048, (byte) -96, var7, var8);
                this.method10(32768, (byte) -96, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method10(8192, (byte) -96, var7, var8);
                this.method10(512, (byte) -96, var7 + 1, var8 + -1);
            }
            if (arg4 == 3) {
                this.method10(32768, (byte) -96, var7, var8);
                this.method10(2048, (byte) -96, var7 - 1, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method10(66560, (byte) -96, var7, var8);
            this.method10(4096, (byte) -96, var7 - 1, var8);
            this.method10(16384, (byte) -96, var7, var8 + 1);
        }
        if (arg4 == 1) {
            this.method10(5120, (byte) -96, var7, var8);
            this.method10(16384, (byte) -96, var7, var8 + 1);
            this.method10(65536, (byte) -96, var7 + 1, var8);
        }
        if (arg4 == 2) {
            this.method10(20480, (byte) -96, var7, var8);
            this.method10(65536, (byte) -96, var7 + 1, var8);
            this.method10(1024, (byte) -96, var7, var8 - 1);
        }
        if (arg4 == 3) {
            this.method10(81920, (byte) -96, var7, var8);
            this.method10(1024, (byte) -96, var7, var8 - 1);
            this.method10(4096, (byte) -96, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public final void method15(int arg0, int arg1, int arg2) {
        field19++;
        int var4 = arg2 - this.field31;
        int var5 = arg1 - this.field39;
        this.field45[var5][var4] = class40.method352(this.field45[var5][var4], 2097152);
        if (arg0 != -3) {
            this.field45 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
    public final void method16(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field31;
        int var5 = arg1 - this.field39;
        field35++;
        this.field45[var5][var4] = class40.method352(this.field45[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public final void method17(int arg0) {
        field23++;
        for (int var2 = 0; var2 < this.field29; var2++) {
            for (int var3 = 0; var3 < this.field41; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field29 - 5 || var3 >= this.field41 - 5) {
                    this.field45[var2][var3] = 16777215;
                } else {
                    this.field45[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 != -1) {
            this.field41 = 82;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field31;
        if (arg2 == 81) {
            field26++;
            int var5 = arg0 - this.field39;
            this.field45[var5][var4] = class209.method1370(this.field45[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIIII)V")
    public static final void method19(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field30++;
        int var7 = arg2;
        int var8 = arg1 * arg1;
        int var9 = arg2 * arg2;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var8 << 2;
        int var15 = var9 - (var12 - 1) * var10;
        if (arg0 != 95) {
            method24((byte) -73);
        }
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = ((arg2 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var16;
        if (class159.field2910 <= arg5 && arg5 <= class224.field4040) {
            int var20 = class119.method843(class240.field4355, -109, arg1 + arg4, class146.field2678);
            int var21 = class119.method843(class240.field4355, arg0 - 216, arg4 - arg1, class146.field2678);
            class114.method762(var21, 89, var20, arg3, class167.field3030[arg5]);
        }
        int var22 = (arg2 - 1) * var14;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var15 += var19;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            var7--;
            int var23 = arg5 - var7;
            if (var15 < 0) {
                var13 += var17;
                var17 += var16;
                var6++;
                var15 += var19;
                var19 += var16;
            }
            var15 += -var18;
            int var24 = arg5 + var7;
            var18 -= var14;
            var13 += -var22;
            var22 -= var14;
            if (var24 >= class159.field2910 && var23 <= class224.field4040) {
                int var25 = class119.method843(class240.field4355, -111, arg4 + var6, class146.field2678);
                int var26 = class119.method843(class240.field4355, -112, arg4 - var6, class146.field2678);
                if (var23 >= class159.field2910) {
                    class114.method762(var26, 70, var25, arg3, class167.field3030[var23]);
                }
                if (class224.field4040 >= var24) {
                    class114.method762(var26, 117, var25, arg3, class167.field3030[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)V")
    private final void method20(int arg0, int arg1, int arg2, int arg3) {
        field43++;
        if (arg0 != -31003) {
            this.method15(37, 53, 127);
        }
        this.field45[arg3][arg2] = class40.method352(this.field45[arg3][arg2], arg1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg2 + arg9;
        int var12 = arg0 + arg7;
        field40++;
        int var13 = arg4 + arg8;
        int var14 = arg6 + arg1;
        int var15 = 12 % ((37 - arg5) / 61);
        if (arg0 >= arg8 && arg0 < var13) {
            if (arg6 == var11 && (arg3 & 0x4) == 0) {
                int var16 = arg0;
                int var17 = var13 < var12 ? var13 : var12;
                while (var16 < var17) {
                    if ((this.field45[var16 - this.field39][var11 - this.field31 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var16++;
                }
            } else if (arg9 == var14 && (arg3 & 0x1) == 0) {
                int var18 = var13 < var12 ? var13 : var12;
                for (int var19 = arg0; var19 < var18; var19++) {
                    if ((this.field45[var19 - this.field39][arg9 - this.field31] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (var12 > arg8 && var12 <= var13) {
            if (arg6 == var11 && (arg3 & 0x4) == 0) {
                for (int var20 = arg8; var20 < var12; var20++) {
                    if ((this.field45[var20 - this.field39][var11 - this.field31 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var14 && (arg3 & 0x1) == 0) {
                for (int var21 = arg8; var21 < var12; var21++) {
                    if ((this.field45[var21 - this.field39][arg9 - this.field31] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg9 >= arg6 && arg9 < var14) {
            if (arg8 == var12 && (arg3 & 0x8) == 0) {
                int var22 = arg9;
                int var23 = var14 >= var11 ? var11 : var14;
                while (var23 > var22) {
                    if ((this.field45[var12 - this.field39 - 1][var22 - this.field31] & 0x8) == 0) {
                        return true;
                    }
                    var22++;
                }
            } else if (arg0 == var13 && (arg3 & 0x2) == 0) {
                int var24 = var11 <= var14 ? var11 : var14;
                for (int var25 = arg9; var25 < var24; var25++) {
                    if ((this.field45[arg0 - this.field39][var25 - this.field31] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var11 > arg6 && var14 >= var11) {
            if (arg8 == var12 && (arg3 & 0x8) == 0) {
                for (int var26 = arg6; var26 < var11; var26++) {
                    if ((this.field45[var12 - this.field39 - 1][var26 - this.field31] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var13 && (arg3 & 0x2) == 0) {
                for (int var27 = arg6; var27 < var11; var27++) {
                    if ((this.field45[arg0 - this.field39][var27 - this.field31] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field20++;
        if (arg2 > 1) {
            return this.method28(arg8, arg7, arg2, arg5, arg3, arg1, arg4, 40, arg2) ? true : this.method21(arg8, arg1, arg2, arg6, arg7, -72, arg3, arg2, arg5, arg4);
        }
        int var10 = arg5 + arg7 - 1;
        int var11 = arg1 + arg3 - 1;
        if (arg5 <= arg8 && var10 >= arg8 && arg3 <= arg4 && arg4 <= var11) {
            return true;
        } else if (arg5 - 1 == arg8 && arg3 <= arg4 && var11 >= arg4 && (this.field45[arg8 - this.field39][arg4 - this.field31] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg8 && arg4 >= arg3 && var11 >= arg4 && (this.field45[arg8 - this.field39][arg4 - this.field31] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else {
            int var12 = 91 / ((-arg0 - 5) / 37);
            if (arg3 - 1 == arg4 && arg5 <= arg8 && var10 >= arg8 && (this.field45[arg8 - this.field39][arg4 - this.field31] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg4 && arg5 <= arg8 && var10 >= arg8 && (this.field45[arg8 - this.field39][arg4 - this.field31] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZIIBI)V")
    public final void method23(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        field28++;
        int var7 = arg5 - this.field39;
        int var8 = arg0 - this.field31;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method20(-31003, 128, var8, var7);
                this.method20(-31003, 8, var8, var7 - 1);
            }
            if (arg2 == 1) {
                this.method20(arg4 ^ 0xFFFF86BB, 2, var8, var7);
                this.method20(-31003, 32, var8 + 1, var7);
            }
            if (arg2 == 2) {
                this.method20(arg4 - 31097, 8, var8, var7);
                this.method20(arg4 ^ 0xFFFF86BB, 128, var8, var7 + 1);
            }
            if (arg2 == 3) {
                this.method20(arg4 ^ 0xFFFF86BB, 32, var8, var7);
                this.method20(-31003, 2, var8 - 1, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method20(-31003, 1, var8, var7);
                this.method20(-31003, 16, var8 + 1, var7 + -1);
            }
            if (arg2 == 1) {
                this.method20(-31003, 4, var8, var7);
                this.method20(-31003, 64, var8 + 1, var7 + 1);
            }
            if (arg2 == 2) {
                this.method20(arg4 ^ 0xFFFF86BB, 16, var8, var7);
                this.method20(-31003, 1, var8 - 1, var7 + 1);
            }
            if (arg2 == 3) {
                this.method20(arg4 ^ 0xFFFF86BB, 64, var8, var7);
                this.method20(arg4 - 31097, 4, var8 - 1, var7 - 1);
            }
        }
        if (arg4 != 94) {
            this.method22(-57, 82, 123, -10, 56, -75, -106, -128, -93);
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method20(-31003, 130, var8, var7);
                this.method20(-31003, 8, var8, var7 - 1);
                this.method20(-31003, 32, var8 + 1, var7);
            }
            if (arg2 == 1) {
                this.method20(-31003, 10, var8, var7);
                this.method20(arg4 - 31097, 32, var8 + 1, var7);
                this.method20(-31003, 128, var8, var7 + 1);
            }
            if (arg2 == 2) {
                this.method20(-31003, 40, var8, var7);
                this.method20(-31003, 128, var8, var7 + 1);
                this.method20(arg4 ^ 0xFFFF86BB, 2, var8 - 1, var7);
            }
            if (arg2 == 3) {
                this.method20(-31003, 160, var8, var7);
                this.method20(arg4 ^ 0xFFFF86BB, 2, var8 - 1, var7);
                this.method20(-31003, 8, var8, var7 - 1);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method20(-31003, 65536, var8, var7);
                this.method20(-31003, 4096, var8, var7 - 1);
            }
            if (arg2 == 1) {
                this.method20(arg4 - 31097, 1024, var8, var7);
                this.method20(arg4 ^ 0xFFFF86BB, 16384, var8 + 1, var7);
            }
            if (arg2 == 2) {
                this.method20(-31003, 4096, var8, var7);
                this.method20(arg4 ^ 0xFFFF86BB, 65536, var8, var7 + 1);
            }
            if (arg2 == 3) {
                this.method20(arg4 ^ 0xFFFF86BB, 16384, var8, var7);
                this.method20(-31003, 1024, var8 - 1, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method20(arg4 - 31097, 512, var8, var7);
                this.method20(-31003, 8192, var8 + 1, var7 - 1);
            }
            if (arg2 == 1) {
                this.method20(-31003, 2048, var8, var7);
                this.method20(arg4 - 31097, 32768, var8 + 1, var7 + 1);
            }
            if (arg2 == 2) {
                this.method20(arg4 - 31097, 8192, var8, var7);
                this.method20(-31003, 512, var8 - 1, var7 - -1);
            }
            if (arg2 == 3) {
                this.method20(-31003, 32768, var8, var7);
                this.method20(-31003, 2048, var8 - 1, var7 + -1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method20(arg4 - 31097, 66560, var8, var7);
            this.method20(-31003, 4096, var8, var7 - 1);
            this.method20(-31003, 16384, var8 + 1, var7);
        }
        if (arg2 == 1) {
            this.method20(-31003, 5120, var8, var7);
            this.method20(-31003, 16384, var8 + 1, var7);
            this.method20(-31003, 65536, var8, var7 + 1);
        }
        if (arg2 == 2) {
            this.method20(-31003, 20480, var8, var7);
            this.method20(-31003, 65536, var8, var7 + 1);
            this.method20(-31003, 1024, var8 - 1, var7);
        }
        if (arg2 == 3) {
            this.method20(-31003, 81920, var8, var7);
            this.method20(arg4 - 31097, 1024, var8 - 1, var7);
            this.method20(-31003, 4096, var8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
    public static final void method24(byte arg0) {
        int var1 = -122 % ((arg0 + 66) / 58);
        field24++;
        try {
            if (class125.field2335 == 0) {
                if (class207.field3717 != null) {
                    class207.field3717.method748((byte) -84);
                    class207.field3717 = null;
                }
                class228.field4098 = 0;
                class231.field4154 = false;
                class125.field2335 = 1;
                class27.field673 = null;
            }
            if (class125.field2335 == 1) {
                if (class27.field673 == null) {
                    class27.field673 = class130.field2397.method894((byte) -84, class42.field943, class201.field3648);
                }
                if (class27.field673.field1262 == 2) {
                    throw new IOException();
                }
                if (class27.field673.field1262 == 1) {
                    class207.field3717 = new class111((Socket) class27.field673.field1259, class130.field2397);
                    class125.field2335 = 2;
                    class27.field673 = null;
                }
            }
            if (class125.field2335 == 2) {
                long var2 = class221.field3991 = class13.field404.method813((byte) 93);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class105.field1911.field2643 = 0;
                class105.field1911.method1002(false, 14);
                class105.field1911.method1002(false, var4);
                class207.field3717.method750(0, class105.field1911.field2613, -7115, 2);
                class18.field511.field2643 = 0;
                class125.field2335 = 3;
            }
            if (class125.field2335 == 3) {
                if (class84.field1569 != null) {
                    class84.field1569.method217((byte) 33);
                }
                if (class229.field4128 != null) {
                    class229.field4128.method217((byte) 33);
                }
                int var5 = class207.field3717.method747(1715);
                if (class84.field1569 != null) {
                    class84.field1569.method217((byte) 33);
                }
                if (class229.field4128 != null) {
                    class229.field4128.method217((byte) 33);
                }
                if (var5 != 0) {
                    class28.method241(var5, (byte) -67);
                    return;
                }
                class18.field511.field2643 = 0;
                class125.field2335 = 4;
            }
            if (class125.field2335 == 4) {
                if (class18.field511.field2643 < 8) {
                    int var6 = class207.field3717.method751(10364);
                    if (var6 > 8 - class18.field511.field2643) {
                        var6 = 8 - class18.field511.field2643;
                    }
                    if (var6 > 0) {
                        class207.field3717.method753(var6, class18.field511.field2643, -1, class18.field511.field2613);
                        class18.field511.field2643 += var6;
                    }
                }
                if (class18.field511.field2643 == 8) {
                    class18.field511.field2643 = 0;
                    class55.field1121 = class18.field511.method1012((byte) -85);
                    class125.field2335 = 5;
                }
            }
            if (class125.field2335 == 5) {
                class105.field1911.field2643 = 0;
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class55.field1121 >> 32), (int) class55.field1121 };
                class105.field1911.method1002(false, 10);
                class105.field1911.method1024(-28, var7[0]);
                class105.field1911.method1024(-126, var7[1]);
                class105.field1911.method1024(-51, var7[2]);
                class105.field1911.method1024(-111, var7[3]);
                class105.field1911.method1000((byte) 117, class13.field404.method813((byte) 93));
                class105.field1911.method1027(32768, class13.field402);
                class105.field1911.method1028(class13.field405, (byte) -29, class53.field1087);
                class104.field1906.field2643 = 0;
                if (class150.field2736 == 40) {
                    class104.field1906.method1002(false, 18);
                } else {
                    class104.field1906.method1002(false, 16);
                }
                class104.field1906.method1002(false, class105.field1911.field2643 + class200.method1334(0, class5.field78) + 141);
                class104.field1906.method1024(-51, 499);
                class104.field1906.method1002(false, class167.field3021 ? 1 : 0);
                class32.method282(class104.field1906, -25);
                class104.field1906.method1027(32768, class5.field78);
                class104.field1906.method1024(-116, class182.field3288);
                class104.field1906.method1024(-54, class79.field1489.field317);
                class104.field1906.method1024(-28, class218.field3965.field317);
                class104.field1906.method1024(-38, class93.field1706.field317);
                class104.field1906.method1024(-36, class69.field1313.field317);
                class104.field1906.method1024(-98, class216.field3935.field317);
                class104.field1906.method1024(-117, class78.field1486.field317);
                class104.field1906.method1024(-81, class117.field2187.field317);
                class104.field1906.method1024(-34, class78.field1483.field317);
                class104.field1906.method1024(-113, class172.field3108.field317);
                class104.field1906.method1024(-29, class61.field1222.field317);
                class104.field1906.method1024(-79, class6.field101.field317);
                class104.field1906.method1024(-35, class5.field80.field317);
                class104.field1906.method1024(-121, class23.field580.field317);
                class104.field1906.method1024(-51, class140.field2552.field317);
                class104.field1906.method1024(-114, class23.field589.field317);
                class104.field1906.method1024(-105, class78.field1479.field317);
                class104.field1906.method1024(-98, class215.field3900.field317);
                class104.field1906.method1024(-29, class71.field1376.field317);
                class104.field1906.method1024(-67, class171.field3092.field317);
                class104.field1906.method1024(-119, class112.field2104.field317);
                class104.field1906.method1024(-101, class103.field1877.field317);
                class104.field1906.method1024(-59, class28.field694.field317);
                class104.field1906.method1024(-106, class73.field1395.field317);
                class104.field1906.method1024(-124, class222.field4012.field317);
                class104.field1906.method1024(-125, class179.field3251.field317);
                class104.field1906.method1024(-115, class175.field3158.field317);
                class104.field1906.method1024(-96, class32.field750.field317);
                class104.field1906.method1047(class105.field1911.field2643, 0, (byte) -54, class105.field1911.field2613);
                class207.field3717.method750(0, class104.field1906.field2613, -7115, class104.field1906.field2643);
                class105.field1911.method402(var7, (byte) 92);
                for (int var8 = 0; var8 < 4; var8++) {
                    var7[var8] += 50;
                }
                class18.field511.method402(var7, (byte) 92);
                class125.field2335 = 6;
            }
            if (class125.field2335 == 6 && class207.field3717.method751(10364) > 0) {
                int var9 = class207.field3717.method747(1715);
                if (var9 == 21 && class150.field2736 == 20) {
                    class125.field2335 = 7;
                } else if (var9 == 2) {
                    class125.field2335 = 9;
                } else if (var9 == 15 && class150.field2736 == 40) {
                    class201.method1337(0);
                    return;
                } else if (var9 == 23 && class114.field2130 < 1) {
                    class125.field2335 = 0;
                    class114.field2130++;
                } else {
                    class28.method241(var9, (byte) -67);
                    return;
                }
            }
            if (class125.field2335 == 7 && class207.field3717.method751(10364) > 0) {
                class81.field1512 = class207.field3717.method747(1715) * 60 + 180;
                class125.field2335 = 8;
            }
            if (class125.field2335 == 8) {
                class228.field4098 = 0;
                class159.method1133(class237.field4282, class179.field3247, 93, class36.method316((byte) -34, new class117[] { class42.method358(class81.field1512 / 60, (byte) 34), class48.field1015 }));
                if (--class81.field1512 <= 0) {
                    class125.field2335 = 0;
                }
            } else {
                if (class125.field2335 == 9 && class207.field3717.method751(10364) >= 9) {
                    class172.field3106 = class207.field3717.method747(1715);
                    class157.field2863 = class207.field3717.method747(1715);
                    class198.field3548 = class207.field3717.method747(1715);
                    if (class198.field3548 == 1) {
                        try {
                            class77.field1467.method787(class130.field2397.field2423, 0);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class205.field3692.method787(class130.field2397.field2423, 0);
                        } catch (Throwable var10) {
                        }
                    }
                    class67.field1292 = class207.field3717.method747(1715);
                    class61.field1235 = class207.field3717.method747(1715) == 1;
                    class72.field1387 = class207.field3717.method747(1715);
                    class72.field1387 <<= 0x8;
                    class72.field1387 += class207.field3717.method747(1715);
                    class196.field3507 = class207.field3717.method747(1715);
                    class207.field3717.method753(1, 0, -1, class18.field511.field2613);
                    class18.field511.field2643 = 0;
                    class195.field3487 = class18.field511.method404(255);
                    class207.field3717.method753(2, 0, -1, class18.field511.field2613);
                    class18.field511.field2643 = 0;
                    class30.field722 = class18.field511.method1049((byte) 102);
                    class125.field2335 = 10;
                }
                if (class125.field2335 != 10) {
                    class228.field4098++;
                    if (class228.field4098 > 2000) {
                        if (class114.field2130 < 1) {
                            class125.field2335 = 0;
                            class114.field2130++;
                            if (class42.field943 == class36.field844) {
                                class42.field943 = class182.field3295;
                            } else {
                                class42.field943 = class36.field844;
                            }
                        } else {
                            class28.method241(-3, (byte) -67);
                        }
                    }
                } else if (class207.field3717.method751(10364) >= class30.field722) {
                    class18.field511.field2643 = 0;
                    class207.field3717.method753(class30.field722, 0, -1, class18.field511.field2613);
                    class20.method180(2047);
                    class150.field2733 = -1;
                    class122.method853(false, -1);
                    class195.field3487 = -1;
                }
            }
        } catch (IOException var12) {
            if (class114.field2130 < 1) {
                if (class42.field943 == class36.field844) {
                    class42.field943 = class182.field3295;
                } else {
                    class42.field943 = class36.field844;
                }
                class125.field2335 = 0;
                class114.field2130++;
            } else {
                class28.method241(-2, (byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)V")
    public static final void method25(int arg0, int arg1, int arg2) {
        class78.field1487 = true;
        class182.field3291 = arg0;
        class26.field661 = arg1;
        class95.field1739 = arg2;
        field47 = -1;
        class217.field3951 = -1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZII)V")
    public final void method26(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field39;
        field38++;
        int var8 = arg1 - this.field31;
        int var9 = 256;
        if (arg3) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg5 + var7; var10++) {
            if (var10 >= 0 && var10 < this.field29) {
                for (int var11 = var8; var11 < arg4 + var8; var11++) {
                    if (var11 >= 0 && this.field41 > var11) {
                        this.method20(-31003, var9, var11, var10);
                    }
                }
            }
        }
        if (arg2 != -1) {
            this.method22(37, 106, -121, -98, -36, 73, 86, -53, -76);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -124 / ((-arg0 - 2) / 38);
        field32++;
        if (arg2 == 1) {
            if (arg1 == arg7 && arg4 == arg5) {
                return true;
            }
        } else if (arg1 <= arg7 && arg1 + arg2 - 1 >= arg7 && arg4 <= arg4 && arg4 <= arg2 + arg4 - 1) {
            return true;
        }
        int var10 = arg7 - this.field39;
        int var11 = arg5 - this.field31;
        int var12 = arg1 - this.field39;
        int var13 = arg4 - this.field31;
        if (arg2 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var10 + 1 == var12 && var11 == var13 && (this.field45[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var13 - 1 == var11 && (this.field45[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var12 && var11 == var13 && (this.field45[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var13 - 1 == var11 && (this.field45[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var12 && var11 == var13 && (this.field45[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var13 + 1 == var11 && (this.field45[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 + 1 == var12 && var11 == var13 && (this.field45[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var13 + 1 == var11 && (this.field45[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var12 && var13 + 1 == var11 && (this.field45[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var13 - 1 == var11 && (this.field45[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var11 == var13 && (this.field45[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 == var13 && (this.field45[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var12 + arg2 - 1;
            int var15 = arg2 + var11 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var10 + 1 == var12 && var13 >= var11 && var15 >= var13 && (this.field45[var12][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var14 >= var10 && var13 - arg2 == var11 && (this.field45[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - arg2 == var12 && var11 <= var13 && var13 <= var15 && (this.field45[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var14 && var13 - arg2 == var11 && (this.field45[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - arg2 == var12 && var13 >= var11 && var15 >= var13 && (this.field45[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var14 && var13 + 1 == var11 && (this.field45[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 + 1 == var12 && var13 >= var11 && var13 <= var15 && (this.field45[var12][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var14 >= var10 && var13 + 1 == var11 && (this.field45[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 >= var12 && var14 >= var10 && var13 + 1 == var11 && (this.field45[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var12 && var14 >= var10 && var13 - arg2 == var11 && (this.field45[var10][var15] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg2 == var12 && var11 <= var13 && var13 <= var15 && (this.field45[var14][var13] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 <= var13 && var15 >= var13 && (this.field45[var12][var13] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIIIIIII)Z")
    private final boolean method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 40) {
            this.method14(23, false, -111, 19, 54, (byte) 97);
        }
        field34++;
        if (arg0 < arg3 + arg1 && arg3 < arg0 + arg2) {
            return arg4 + arg5 > arg6 && arg4 < arg6 + arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V")
    public class3(int arg0, int arg1) {
        this.field29 = arg0;
        this.field41 = arg1;
        this.field31 = 0;
        this.field45 = new int[this.field29][this.field41];
        this.method17(-1);
    }
}
