import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class220 {

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    private int field3869;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    private int field3856;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    private int field3852;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    private int field3863;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "[[I")
    public int[][] field3873;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[I")
    public static int[] field3854 = new int[128];

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "Le;")
    private static class191 field3867 = class54.method368("Type", 2047);

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "Le;")
    public static class191 field3871 = field3867;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "Le;")
    private static class191 field3875 = class54.method368("Loaded wordpack", 2047);

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Le;")
    public static class191 field3860 = field3875;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field3857 = 2301979;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "Lpk;")
    public static class66 field3872 = new class66(16);

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "Le;")
    public static class191 field3877 = class54.method368("leuchten3:", 2047);

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "Le;")
    public static class191 field3878 = class54.method368("rot:", 2047);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZIII)V")
    public final void method1489(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -6116) {
            this.method1497((byte) -73);
        }
        field3874++;
        int var7 = arg4 - this.field3852;
        int var8 = arg0 - this.field3856;
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg5 + var7; var10++) {
            if (var10 >= 0 && this.field3869 > var10) {
                for (int var11 = var8; var11 < arg1 + var8; var11++) {
                    if (var11 >= 0 && this.field3863 > var11) {
                        this.method1499(var9, -30585, var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
    private final void method1490(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 32412) {
            this.field3873[arg1][arg2] = class167.method1128(this.field3873[arg1][arg2], ~arg0);
            field3868++;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIZI)V")
    public final void method1491(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field3852;
        field3851++;
        if (arg5 > -8) {
            return;
        }
        int var8 = arg1 - this.field3856;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1499(128, -30585, var7, var8);
                this.method1499(8, -30585, var7 - 1, var8);
            }
            if (arg0 == 1) {
                this.method1499(2, -30585, var7, var8);
                this.method1499(32, -30585, var7, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1499(8, -30585, var7, var8);
                this.method1499(128, -30585, var7 + 1, var8);
            }
            if (arg0 == 3) {
                this.method1499(32, -30585, var7, var8);
                this.method1499(2, -30585, var7, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1499(1, -30585, var7, var8);
                this.method1499(16, -30585, var7 - 1, var8 - -1);
            }
            if (arg0 == 1) {
                this.method1499(4, -30585, var7, var8);
                this.method1499(64, -30585, var7 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1499(16, -30585, var7, var8);
                this.method1499(1, -30585, var7 + 1, var8 + -1);
            }
            if (arg0 == 3) {
                this.method1499(64, -30585, var7, var8);
                this.method1499(4, -30585, var7 - 1, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method1499(130, -30585, var7, var8);
                this.method1499(8, -30585, var7 - 1, var8);
                this.method1499(32, -30585, var7, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1499(10, -30585, var7, var8);
                this.method1499(32, -30585, var7, var8 + 1);
                this.method1499(128, -30585, var7 + 1, var8);
            }
            if (arg0 == 2) {
                this.method1499(40, -30585, var7, var8);
                this.method1499(128, -30585, var7 + 1, var8);
                this.method1499(2, -30585, var7, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1499(160, -30585, var7, var8);
                this.method1499(2, -30585, var7, var8 - 1);
                this.method1499(8, -30585, var7 - 1, var8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1499(65536, -30585, var7, var8);
                this.method1499(4096, -30585, var7 - 1, var8);
            }
            if (arg0 == 1) {
                this.method1499(1024, -30585, var7, var8);
                this.method1499(16384, -30585, var7, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1499(4096, -30585, var7, var8);
                this.method1499(65536, -30585, var7 + 1, var8);
            }
            if (arg0 == 3) {
                this.method1499(16384, -30585, var7, var8);
                this.method1499(1024, -30585, var7, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1499(512, -30585, var7, var8);
                this.method1499(8192, -30585, var7 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1499(2048, -30585, var7, var8);
                this.method1499(32768, -30585, var7 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1499(8192, -30585, var7, var8);
                this.method1499(512, -30585, var7 + 1, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1499(32768, -30585, var7, var8);
                this.method1499(2048, -30585, var7 - 1, var8 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1499(66560, -30585, var7, var8);
            this.method1499(4096, -30585, var7 - 1, var8);
            this.method1499(16384, -30585, var7, var8 + 1);
        }
        if (arg0 == 1) {
            this.method1499(5120, -30585, var7, var8);
            this.method1499(16384, -30585, var7, var8 + 1);
            this.method1499(65536, -30585, var7 + 1, var8);
        }
        if (arg0 == 2) {
            this.method1499(20480, -30585, var7, var8);
            this.method1499(65536, -30585, var7 + 1, var8);
            this.method1499(1024, -30585, var7, var8 - 1);
        }
        if (arg0 == 3) {
            this.method1499(81920, -30585, var7, var8);
            this.method1499(1024, -30585, var7, var8 - 1);
            this.method1499(4096, -30585, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBI)V")
    public final void method1492(int arg0, byte arg1, int arg2) {
        field3876++;
        int var4 = arg2 - this.field3856;
        int var5 = arg0 - this.field3852;
        if (arg1 != -24) {
            this.field3869 = 111;
        }
        this.field3873[var5][var4] = class167.method1128(this.field3873[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
    public final void method1493(int arg0, int arg1, int arg2) {
        field3855++;
        int var4 = arg0 - this.field3852;
        int var5 = arg2 - this.field3856;
        this.field3873[var4][var5] = class217.method1476(this.field3873[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIZII)V")
    public final void method1494(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field3852;
        if (arg6 == 1 || arg6 == 3) {
            int var9 = arg1;
            arg1 = arg5;
            arg5 = var9;
        }
        if (arg3 != 3) {
            return;
        }
        field3858++;
        int var10 = arg2 - this.field3856;
        int var11 = 256;
        if (arg4) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < (arg1 + var8); var12++) {
            if (var12 >= 0 && this.field3869 > var12) {
                for (int var13 = var10; var13 < (arg5 + var10); var13++) {
                    if (var13 >= 0 && var13 < this.field3863) {
                        this.method1490(var11, var12, var13, 32412);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method1495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3859++;
        if (arg7 != 3) {
            field3867 = null;
        }
        int var11 = arg0 + arg4;
        int var12 = arg3 + arg9;
        int var13 = arg1 + arg8;
        int var14 = arg2 + arg6;
        if (arg1 <= arg0 && var13 > arg0) {
            if (arg2 == var12 && (arg5 & 0x4) == 0) {
                int var15 = arg0;
                int var16 = var13 >= var11 ? var11 : var13;
                while (var15 < var16) {
                    if ((this.field3873[var15 - this.field3852][var12 - this.field3856 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg3 == var14 && (arg5 & 0x1) == 0) {
                int var17 = arg0;
                int var18 = var13 >= var11 ? var11 : var13;
                while (var18 > var17) {
                    if ((this.field3873[var17 - this.field3852][arg3 - this.field3856] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg1 && var11 <= var13) {
            if (arg2 == var12 && (arg5 & 0x4) == 0) {
                for (int var19 = arg1; var19 < var11; var19++) {
                    if ((this.field3873[var19 - this.field3852][var12 - this.field3856 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var14 && (arg5 & 0x1) == 0) {
                for (int var20 = arg1; var20 < var11; var20++) {
                    if ((this.field3873[var20 - this.field3852][arg3 - this.field3856] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg2 <= arg3 && arg3 < var14) {
            if (arg1 == var11 && (arg5 & 0x8) == 0) {
                int var21 = arg3;
                int var22 = var14 < var12 ? var14 : var12;
                while (var22 > var21) {
                    if ((this.field3873[var11 - this.field3852 - 1][var21 - this.field3856] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg0 == var13 && (arg5 & 0x2) == 0) {
                int var23 = arg3;
                int var24 = var14 >= var12 ? var12 : var14;
                while (var23 < var24) {
                    if ((this.field3873[arg0 - this.field3852][var23 - this.field3856] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var12 > arg2 && var12 <= var14) {
            if (arg1 == var11 && (arg5 & 0x8) == 0) {
                for (int var25 = arg2; var25 < var12; var25++) {
                    if ((this.field3873[var11 - this.field3852 - 1][var25 - this.field3856] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var13 && (arg5 & 0x2) == 0) {
                for (int var26 = arg2; var26 < var12; var26++) {
                    if ((this.field3873[arg0 - this.field3852][var26 - this.field3856] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3850++;
        if (arg5 == 1) {
            if (arg2 == arg4 && arg1 == arg3) {
                return true;
            }
        } else if (arg4 <= arg2 && arg2 <= (arg4 + arg5 - 1) && arg1 >= arg1 && arg1 <= (arg1 + arg5 - 1)) {
            return true;
        }
        int var9 = arg4 - this.field3852;
        int var10 = arg3 - this.field3856;
        if (arg7 != -5591) {
            this.method1495(-36, -50, -112, 7, 75, -63, 87, -72, -107, 98);
        }
        int var11 = arg2 - this.field3852;
        int var12 = arg1 - this.field3856;
        if (arg5 == 1) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field3873[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field3873[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field3873[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field3873[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field3873[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field3873[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field3873[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field3873[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field3873[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field3873[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var9 - 1;
            int var14 = var10 + arg5 - 1;
            if (arg6 == 0) {
                if (arg0 == 0) {
                    if ((var11 - arg5) == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field3873[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var12 - arg5 == var10 && (this.field3873[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - arg5) == var9 && var10 <= var12 && var14 >= var12 && (this.field3873[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14 && (this.field3873[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 + 1) == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field3873[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 - arg5 == var10 && (this.field3873[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg5) == var10) {
                        return true;
                    }
                    if (var11 - arg5 == var9 && var10 <= var12 && var12 <= var14 && (this.field3873[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var14 && (this.field3873[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    if (var11 - arg5 == var9 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14 && (this.field3873[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg5) == var10 && (this.field3873[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg5 == var9 && var12 >= var10 && var14 >= var12 && (this.field3873[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg5) == var10 && (this.field3873[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - arg5 == var9 && var10 <= var12 && var12 <= var14 && (this.field3873[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 + 1) == var10 && (this.field3873[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 - arg5 == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 - arg5 == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 + 1) == var10 && (this.field3873[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field3873[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 - arg5) == var10) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field3873[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var13 && (var12 - arg5) == var10 && (this.field3873[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg5 == var9 && var10 <= var12 && var14 >= var12 && (this.field3873[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14 && (this.field3873[var9][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public final void method1497(byte arg0) {
        if (arg0 != -12) {
            return;
        }
        for (int var2 = 0; var2 < this.field3869; var2++) {
            for (int var3 = 0; var3 < this.field3863; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3869 - 5 || (this.field3863 - 5) <= var3) {
                    this.field3873[var2][var3] = 16777215;
                } else {
                    this.field3873[var2][var3] = 16777216;
                }
            }
        }
        field3862++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3866++;
        if (arg2 > 1) {
            return this.method1504(-120, arg3, arg7, arg0, arg5, arg2, arg4, arg2, arg6) ? true : this.method1495(arg0, arg5, arg6, arg3, arg2, arg8, arg4, 3, arg7, arg2);
        }
        int var10 = arg5 + arg7 - 1;
        int var11 = arg6 + arg4 - 1;
        if (arg0 >= arg5 && var10 >= arg0 && arg3 >= arg6 && var11 >= arg3) {
            return true;
        } else if ((arg1 + arg5) == arg0 && arg6 <= arg3 && arg3 <= var11 && (this.field3873[arg0 - this.field3852][arg3 - this.field3856] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg6 <= arg3 && var11 >= arg3 && (this.field3873[arg0 - this.field3852][arg3 - this.field3856] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg3 && arg0 >= arg5 && arg0 <= var10 && (this.field3873[arg0 - this.field3852][arg3 - this.field3856] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg3 && arg5 <= arg0 && arg0 <= var10 && (this.field3873[arg0 - this.field3852][arg3 - this.field3856] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIII)V")
    private final void method1499(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -30585) {
            this.method1497((byte) -70);
        }
        field3849++;
        this.field3873[arg2][arg3] = class217.method1476(this.field3873[arg2][arg3], arg0);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static void method1500(byte arg0) {
        field3872 = null;
        field3878 = null;
        field3860 = null;
        field3877 = null;
        field3871 = null;
        field3854 = null;
        field3875 = null;
        field3867 = null;
        if (arg0 != -105) {
            field3877 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method1501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 19661064) {
            this.field3873 = null;
        }
        field3853++;
        if (arg2 == 1) {
            if (arg1 == arg3 && arg5 == arg7) {
                return true;
            }
        } else if (arg3 >= arg1 && arg2 + arg1 - 1 >= arg3 && arg5 <= arg5 && arg5 <= (arg5 + arg2 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field3852;
        int var10 = arg7 - this.field3856;
        int var11 = arg3 - this.field3852;
        int var12 = arg5 - this.field3856;
        if (arg2 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field3873[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field3873[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field3873[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field3873[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field3873[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field3873[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field3873[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var9 - 1;
            int var14 = var10 + arg2 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var14 && (this.field3873[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 - arg2) == var10 && (this.field3873[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - arg2) == var9 && var12 >= var10 && var14 >= var12 && (this.field3873[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 - arg2 == var10 && (this.field3873[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - arg2 == var9 && var10 <= var12 && var12 <= var14 && (this.field3873[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10 && (this.field3873[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 + 1 == var9 && var10 <= var12 && var12 <= var14 && (this.field3873[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field3873[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 >= var9 && var13 >= var11 && var12 + 1 == var10 && (this.field3873[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var11 && var11 <= var13 && (var12 - arg2) == var10 && (this.field3873[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg2) == var9 && var10 <= var12 && var14 >= var12 && (this.field3873[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var12 >= var10 && var12 <= var14 && (this.field3873[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BII)V")
    public final void method1502(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3852;
        int var5 = arg1 - this.field3856;
        if (arg0 <= 49) {
            field3854 = null;
        }
        field3861++;
        this.field3873[var4][var5] = class217.method1476(this.field3873[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
    public static final void method1503(int arg0, int arg1, int arg2) {
        class117.field1926++;
        field3865++;
        class53.field963.method1096(159, 0);
        class53.field963.method1602(arg2, false);
        if (arg1 != 22298) {
            field3857 = -1;
        }
        class53.field963.method1557(arg0, arg1 - 22204);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIIIIIII)Z")
    private final boolean method1504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 > -65) {
            field3860 = null;
        }
        field3864++;
        if ((arg2 + arg4) > arg3 && arg4 < (arg3 + arg5)) {
            return arg1 < (arg8 + arg6) && (arg1 + arg7) > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIIZI)V")
    public final void method1505(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg1 - this.field3856;
        int var8 = arg0 - this.field3852;
        if (arg5 <= 81) {
            this.field3869 = 20;
        }
        field3870++;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1490(128, var8, var7, 32412);
                this.method1490(8, var8 - 1, var7, 32412);
            }
            if (arg2 == 1) {
                this.method1490(2, var8, var7, 32412);
                this.method1490(32, var8, var7 + 1, 32412);
            }
            if (arg2 == 2) {
                this.method1490(8, var8, var7, 32412);
                this.method1490(128, var8 + 1, var7, 32412);
            }
            if (arg2 == 3) {
                this.method1490(32, var8, var7, 32412);
                this.method1490(2, var8, var7 - 1, 32412);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1490(1, var8, var7, 32412);
                this.method1490(16, var8 - 1, var7 + 1, 32412);
            }
            if (arg2 == 1) {
                this.method1490(4, var8, var7, 32412);
                this.method1490(64, var8 + 1, var7 + 1, 32412);
            }
            if (arg2 == 2) {
                this.method1490(16, var8, var7, 32412);
                this.method1490(1, var8 + 1, var7 + -1, 32412);
            }
            if (arg2 == 3) {
                this.method1490(64, var8, var7, 32412);
                this.method1490(4, var8 - 1, var7 + -1, 32412);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method1490(130, var8, var7, 32412);
                this.method1490(8, var8 - 1, var7, 32412);
                this.method1490(32, var8, var7 + 1, 32412);
            }
            if (arg2 == 1) {
                this.method1490(10, var8, var7, 32412);
                this.method1490(32, var8, var7 + 1, 32412);
                this.method1490(128, var8 + 1, var7, 32412);
            }
            if (arg2 == 2) {
                this.method1490(40, var8, var7, 32412);
                this.method1490(128, var8 + 1, var7, 32412);
                this.method1490(2, var8, var7 - 1, 32412);
            }
            if (arg2 == 3) {
                this.method1490(160, var8, var7, 32412);
                this.method1490(2, var8, var7 - 1, 32412);
                this.method1490(8, var8 - 1, var7, 32412);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1490(65536, var8, var7, 32412);
                this.method1490(4096, var8 - 1, var7, 32412);
            }
            if (arg2 == 1) {
                this.method1490(1024, var8, var7, 32412);
                this.method1490(16384, var8, var7 + 1, 32412);
            }
            if (arg2 == 2) {
                this.method1490(4096, var8, var7, 32412);
                this.method1490(65536, var8 + 1, var7, 32412);
            }
            if (arg2 == 3) {
                this.method1490(16384, var8, var7, 32412);
                this.method1490(1024, var8, var7 - 1, 32412);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1490(512, var8, var7, 32412);
                this.method1490(8192, var8 - 1, var7 + 1, 32412);
            }
            if (arg2 == 1) {
                this.method1490(2048, var8, var7, 32412);
                this.method1490(32768, var8 + 1, var7 + 1, 32412);
            }
            if (arg2 == 2) {
                this.method1490(8192, var8, var7, 32412);
                this.method1490(512, var8 + 1, var7 + -1, 32412);
            }
            if (arg2 == 3) {
                this.method1490(32768, var8, var7, 32412);
                this.method1490(2048, var8 - 1, var7 + -1, 32412);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1490(66560, var8, var7, 32412);
            this.method1490(4096, var8 - 1, var7, 32412);
            this.method1490(16384, var8, var7 + 1, 32412);
        }
        if (arg2 == 1) {
            this.method1490(5120, var8, var7, 32412);
            this.method1490(16384, var8, var7 + 1, 32412);
            this.method1490(65536, var8 + 1, var7, 32412);
        }
        if (arg2 == 2) {
            this.method1490(20480, var8, var7, 32412);
            this.method1490(65536, var8 + 1, var7, 32412);
            this.method1490(1024, var8, var7 - 1, 32412);
        }
        if (arg2 == 3) {
            this.method1490(81920, var8, var7, 32412);
            this.method1490(1024, var8, var7 - 1, 32412);
            this.method1490(4096, var8 - 1, var7, 32412);
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V")
    public class220(int arg0, int arg1) {
        this.field3869 = arg0;
        this.field3856 = 0;
        this.field3852 = 0;
        this.field3863 = arg1;
        this.field3873 = new int[this.field3869][this.field3863];
        this.method1497((byte) -12);
    }
}
