import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class89 {

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    private int field1684 = 0;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    private int field1667;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "[[I")
    public int[][] field1668;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    private int field1694;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Li;")
    private static class88 field1680 = class208.method1425(105, "Fri");

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Li;")
    public static class88 field1683 = class208.method1425(105, "sl_button");

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Li;")
    private static class88 field1673 = class208.method1425(105, "Thu");

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "Li;")
    private static class88 field1691 = class208.method1425(105, "Tue");

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Li;")
    private static class88 field1693 = class208.method1425(105, "Sun");

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Li;")
    private static class88 field1682 = class208.method1425(105, "Wed");

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Li;")
    private static class88 field1686 = class208.method1425(105, "Sat");

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Li;")
    private static class88 field1692 = class208.method1425(105, "Mon");

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "[I")
    public static int[] field1687 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[Li;")
    public static class88[] field1674 = new class88[] { field1693, field1692, field1691, field1682, field1673, field1680, field1686 };

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Lwi;")
    public static class248 field1695 = new class248();

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "[J")
    public static long[] field1697 = new long[32];

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Li;")
    private static class88 field1696 = class208.method1425(105, "Password: ");

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "Li;")
    public static class88 field1698 = field1696;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lmf;")
    public static class137 field1666;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lpf;")
    public static class169 field1676;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lbj;")
    public static class22 field1671;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "[I")
    public static int[] field1699;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1681++;
        if (arg4 == 1) {
            if (arg2 == arg6 && arg0 == arg3) {
                return true;
            }
        } else if (arg6 <= arg2 && arg2 <= arg4 + arg6 - 1 && arg3 >= arg3 && arg3 <= arg3 + arg4 - 1) {
            return true;
        }
        int var9 = 54 % ((arg7 + 6) / 55);
        int var10 = arg2 - this.field1694;
        int var11 = arg6 - this.field1694;
        int var12 = arg3 - this.field1684;
        int var13 = arg0 - this.field1684;
        if (arg4 == 1) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    if (var10 - 1 == var11 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13 && (this.field1668[var11][var13] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13 && (this.field1668[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 == var11 && var12 + 1 == var13) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 + 1 == var11 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13 && (this.field1668[var11][var13] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13 && (this.field1668[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 == var11 && var12 - 1 == var13) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    if (var10 - 1 == var11 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13 && (this.field1668[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13 && (this.field1668[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13 && (this.field1668[var11][var13] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 - 1 == var11 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13 && (this.field1668[var11][var13] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 == var11 && var12 + 1 == var13 && (this.field1668[var11][var13] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var13 && (this.field1668[var11][var13] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var12 == var13 && (this.field1668[var11][var13] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var11 + arg4 - 1;
            int var15 = var13 + arg4 - 1;
            if (arg1 == 0) {
                if (arg5 == 0) {
                    if (var10 - arg4 == var11 && var13 <= var12 && var15 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && var12 + 1 == var13 && (this.field1668[var10][var13] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var14 >= var10 && var12 - arg4 == var13 && (this.field1668[var10][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 >= var11 && var10 <= var14 && var12 + 1 == var13) {
                        return true;
                    }
                    if (var10 - arg4 == var11 && var12 >= var13 && var12 <= var15 && (this.field1668[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var13 && var15 >= var12 && (this.field1668[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 + 1 == var11 && var12 >= var13 && var12 <= var15) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && var12 + 1 == var13 && (this.field1668[var10][var13] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var14 >= var10 && var12 - arg4 == var13 && (this.field1668[var10][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 <= var10 && var10 <= var14 && var12 - arg4 == var13) {
                        return true;
                    }
                    if (var10 - arg4 == var11 && var12 >= var13 && var15 >= var12 && (this.field1668[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var13 <= var12 && var15 >= var12 && (this.field1668[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    if (var10 - arg4 == var11 && var13 <= var12 && var15 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && var12 + 1 == var13) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var13 && var15 >= var12 && (this.field1668[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && var12 - arg4 == var13 && (this.field1668[var10][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - arg4 == var11 && var13 <= var12 && var12 <= var15 && (this.field1668[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && var12 + 1 == var13) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var13 <= var12 && var12 <= var15) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && var12 - arg4 == var13 && (this.field1668[var10][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg4 == var11 && var12 >= var13 && var12 <= var15 && (this.field1668[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && var12 + 1 == var13 && (this.field1668[var10][var13] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var13 <= var12 && var12 <= var15) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && var12 - arg4 == var13) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 - arg4 == var11 && var13 <= var12 && var12 <= var15) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && var12 + 1 == var13 && (this.field1668[var10][var13] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var13 && var12 <= var15 && (this.field1668[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && var12 - arg4 == var13) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 >= var11 && var14 >= var10 && var12 + 1 == var13 && (this.field1668[var10][var13] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var10 <= var14 && var12 - arg4 == var13 && (this.field1668[var10][var15] & 0x12C0102) == 0) {
                    return true;
                }
                if (var10 - arg4 == var11 && var13 <= var12 && var15 >= var12 && (this.field1668[var14][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var13 <= var12 && var15 >= var12 && (this.field1668[var11][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIBIIIII)Z")
    private final boolean method642(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1670++;
        if (arg4 != -20) {
            return false;
        }
        int var11 = arg1 + arg6;
        int var12 = arg2 + arg0;
        int var13 = arg8 + arg3;
        int var14 = arg7 + arg5;
        if (arg8 <= arg2 && var13 > arg2) {
            if (arg7 == var11 && (arg9 & 0x4) == 0) {
                int var15 = var12 <= var13 ? var12 : var13;
                for (int var16 = arg2; var16 < var15; var16++) {
                    if ((this.field1668[var16 - this.field1694][var11 - this.field1684 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var14 && (arg9 & 0x1) == 0) {
                int var17 = arg2;
                int var18 = var13 >= var12 ? var12 : var13;
                while (var17 < var18) {
                    if ((this.field1668[var17 - this.field1694][arg1 - this.field1684] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg8 < var12 && var12 <= var13) {
            if (arg7 == var11 && (arg9 & 0x4) == 0) {
                for (int var19 = arg8; var19 < var12; var19++) {
                    if ((this.field1668[var19 - this.field1694][var11 - this.field1684 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var14 && (arg9 & 0x1) == 0) {
                for (int var20 = arg8; var20 < var12; var20++) {
                    if ((this.field1668[var20 - this.field1694][arg1 - this.field1684] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg7 <= arg1 && var14 > arg1) {
            if (arg8 == var12 && (arg9 & 0x8) == 0) {
                int var21 = arg1;
                int var22 = var14 < var11 ? var14 : var11;
                while (var21 < var22) {
                    if ((this.field1668[var12 - this.field1694 - 1][var21 - this.field1684] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg2 == var13 && (arg9 & 0x2) == 0) {
                int var23 = arg1;
                int var24 = var14 >= var11 ? var11 : var14;
                while (var23 < var24) {
                    if ((this.field1668[arg2 - this.field1694][var23 - this.field1684] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var11 > arg7 && var11 <= var14) {
            if (arg8 == var12 && (arg9 & 0x8) == 0) {
                for (int var25 = arg7; var25 < var11; var25++) {
                    if ((this.field1668[var12 - this.field1694 - 1][var25 - this.field1684] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var13 && (arg9 & 0x2) == 0) {
                for (int var26 = arg7; var26 < var11; var26++) {
                    if ((this.field1668[arg2 - this.field1694][var26 - this.field1684] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIIIII)V")
    public final void method643(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1664++;
        if (arg2 == 1 || arg2 == 3) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        int var9 = arg3 - this.field1684;
        int var10 = arg0 - this.field1694;
        int var11 = 256;
        if (arg4 != 131072) {
            field1674 = null;
        }
        if (arg1) {
            var11 += 131072;
        }
        for (int var12 = var10; var12 < arg6 + var10; var12++) {
            if (var12 >= 0 && var12 < this.field1685) {
                for (int var13 = var9; var13 < arg5 + var9; var13++) {
                    if (var13 >= 0 && this.field1667 > var13) {
                        this.method652(var12, (byte) -78, var13, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method644(byte arg0) {
        field1689++;
        if (arg0 != 15) {
            return;
        }
        for (int var2 = 0; var2 < this.field1685; var2++) {
            for (int var3 = 0; var3 < this.field1667; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1685 - 5 || this.field1667 - 5 <= var3) {
                    this.field1668[var2][var3] = 16777215;
                } else {
                    this.field1668[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIZII)V")
    public final void method645(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field1684;
        field1662++;
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1694;
        for (int var10 = var9; var10 < var9 + arg1; var10++) {
            if (var10 >= 0 && var10 < this.field1685) {
                for (int var11 = var7; var11 < arg2 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field1667) {
                        this.method654(1, var10, var8, var11);
                    }
                }
            }
        }
        if (arg0 != 64) {
            this.method642(20, -69, -76, -82, (byte) -103, -81, -54, 34, 78, -79);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZZII)V")
    public final void method646(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field1684;
        if (arg3) {
            field1695 = null;
        }
        int var8 = arg5 - this.field1694;
        field1663++;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method654(1, var8, 128, var7);
                this.method654(1, var8 - 1, 8, var7);
            }
            if (arg4 == 1) {
                this.method654(1, var8, 2, var7);
                this.method654(1, var8, 32, var7 + 1);
            }
            if (arg4 == 2) {
                this.method654(1, var8, 8, var7);
                this.method654(1, var8 + 1, 128, var7);
            }
            if (arg4 == 3) {
                this.method654(1, var8, 32, var7);
                this.method654(1, var8, 2, var7 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method654(1, var8, 1, var7);
                this.method654(1, var8 - 1, 16, var7 + 1);
            }
            if (arg4 == 1) {
                this.method654(1, var8, 4, var7);
                this.method654(1, var8 + 1, 64, var7 + 1);
            }
            if (arg4 == 2) {
                this.method654(1, var8, 16, var7);
                this.method654(1, var8 + 1, 1, var7 - 1);
            }
            if (arg4 == 3) {
                this.method654(1, var8, 64, var7);
                this.method654(1, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method654(1, var8, 130, var7);
                this.method654(1, var8 - 1, 8, var7);
                this.method654(1, var8, 32, var7 + 1);
            }
            if (arg4 == 1) {
                this.method654(1, var8, 10, var7);
                this.method654(1, var8, 32, var7 + 1);
                this.method654(1, var8 + 1, 128, var7);
            }
            if (arg4 == 2) {
                this.method654(1, var8, 40, var7);
                this.method654(1, var8 + 1, 128, var7);
                this.method654(1, var8, 2, var7 - 1);
            }
            if (arg4 == 3) {
                this.method654(1, var8, 160, var7);
                this.method654(1, var8, 2, var7 - 1);
                this.method654(1, var8 - 1, 8, var7);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method654(1, var8, 65536, var7);
                this.method654(1, var8 - 1, 4096, var7);
            }
            if (arg4 == 1) {
                this.method654(1, var8, 1024, var7);
                this.method654(1, var8, 16384, var7 + 1);
            }
            if (arg4 == 2) {
                this.method654(1, var8, 4096, var7);
                this.method654(1, var8 + 1, 65536, var7);
            }
            if (arg4 == 3) {
                this.method654(1, var8, 16384, var7);
                this.method654(1, var8, 1024, var7 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method654(1, var8, 512, var7);
                this.method654(1, var8 - 1, 8192, var7 + 1);
            }
            if (arg4 == 1) {
                this.method654(1, var8, 2048, var7);
                this.method654(1, var8 + 1, 32768, var7 + 1);
            }
            if (arg4 == 2) {
                this.method654(1, var8, 8192, var7);
                this.method654(1, var8 + 1, 512, var7 - 1);
            }
            if (arg4 == 3) {
                this.method654(1, var8, 32768, var7);
                this.method654(1, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method654(1, var8, 66560, var7);
            this.method654(1, var8 - 1, 4096, var7);
            this.method654(1, var8, 16384, var7 + 1);
        }
        if (arg4 == 1) {
            this.method654(1, var8, 5120, var7);
            this.method654(1, var8, 16384, var7 + 1);
            this.method654(1, var8 + 1, 65536, var7);
        }
        if (arg4 == 2) {
            this.method654(1, var8, 20480, var7);
            this.method654(1, var8 + 1, 65536, var7);
            this.method654(1, var8, 1024, var7 - 1);
        }
        if (arg4 == 3) {
            this.method654(1, var8, 81920, var7);
            this.method654(1, var8, 1024, var7 - 1);
            this.method654(1, var8 - 1, 4096, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public final void method647(int arg0, int arg1, int arg2) {
        field1688++;
        int var4 = arg1 - this.field1684;
        int var5 = arg2 - this.field1694;
        this.field1668[var5][var4] = class204.method1405(this.field1668[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method648(int arg0) {
        field1692 = null;
        field1682 = null;
        field1687 = null;
        field1695 = null;
        field1680 = null;
        field1697 = null;
        field1698 = null;
        field1683 = null;
        field1696 = null;
        if (arg0 != 3661) {
            method648(96);
        }
        field1674 = null;
        field1693 = null;
        field1666 = null;
        field1676 = null;
        field1671 = null;
        field1686 = null;
        field1691 = null;
        field1673 = null;
        field1699 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method649(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1679++;
        if (arg5 == 1) {
            if (arg1 == arg7 && arg4 == arg6) {
                return true;
            }
        } else if (arg1 <= arg7 && arg7 <= arg5 + arg1 - 1 && arg4 <= arg4 && arg4 <= arg4 + arg5 - 1) {
            return true;
        }
        int var9 = arg1 - this.field1694;
        int var10 = arg6 - this.field1684;
        if (arg3 <= 115) {
            field1682 = null;
        }
        int var11 = arg7 - this.field1694;
        int var12 = arg4 - this.field1684;
        if (arg5 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1668[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field1668[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field1668[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field1668[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field1668[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field1668[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1668[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field1668[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field1668[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1668[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field1668[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field1668[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var9 - 1;
            int var14 = arg5 + var10 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var9 && var10 <= var12 && var12 <= var14 && (this.field1668[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 - arg5 == var10 && (this.field1668[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg5 == var9 && var12 >= var10 && var14 >= var12 && (this.field1668[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var12 - arg5 == var10 && (this.field1668[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - arg5 == var9 && var10 <= var12 && var12 <= var14 && (this.field1668[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 + 1 == var10 && (this.field1668[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var9 && var12 >= var10 && var14 >= var12 && (this.field1668[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 + 1 == var10 && (this.field1668[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field1668[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var13 >= var11 && var12 - arg5 == var10 && (this.field1668[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg5 == var9 && var12 >= var10 && var14 >= var12 && (this.field1668[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var12 >= var10 && var14 >= var12 && (this.field1668[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIBI)Z")
    private final boolean method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field1690++;
        int var10 = -45 / ((arg7 + 53) / 44);
        if (arg6 < arg0 + arg8 && arg8 < arg2 + arg6) {
            return arg5 + arg3 > arg4 && arg1 + arg4 > arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1669++;
        if (arg0 > 1) {
            return this.method650(arg2, arg0, arg0, arg5, arg4, arg1, arg6, (byte) 116, arg7) ? true : this.method642(arg0, arg4, arg6, arg2, (byte) -20, arg5, arg0, arg1, arg7, arg8);
        }
        int var10 = arg1 + arg5 - 1;
        int var11 = arg2 + arg7 - 1;
        if (arg6 >= arg7 && arg6 <= var11 && arg1 <= arg4 && var10 >= arg4) {
            return true;
        } else if (arg7 - 1 == arg6 && arg4 >= arg1 && arg4 <= var10 && (this.field1668[arg6 - this.field1694][arg4 - this.field1684] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if (arg3 + var11 == arg6 && arg4 >= arg1 && arg4 <= var10 && (this.field1668[arg6 - this.field1694][arg4 - this.field1684] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg4 && arg7 <= arg6 && var11 >= arg6 && (this.field1668[arg6 - this.field1694][arg4 - this.field1684] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg4 && arg7 <= arg6 && var11 >= arg6 && (this.field1668[arg6 - this.field1694][arg4 - this.field1684] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBII)V")
    private final void method652(int arg0, byte arg1, int arg2, int arg3) {
        field1677++;
        this.field1668[arg0][arg2] = class70.method470(this.field1668[arg0][arg2], ~arg3);
        if (arg1 != -78) {
            field1671 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)V")
    public final void method653(int arg0, boolean arg1, int arg2) {
        field1678++;
        int var4 = arg2 - this.field1694;
        int var5 = arg0 - this.field1684;
        this.field1668[var4][var5] = class204.method1405(this.field1668[var4][var5], 2097152);
        if (arg1) {
            field1693 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
    private final void method654(int arg0, int arg1, int arg2, int arg3) {
        this.field1668[arg1][arg3] = class204.method1405(this.field1668[arg1][arg3], arg2);
        if (arg0 != 1) {
            field1695 = null;
        }
        field1675++;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
    public final void method655(int arg0, int arg1, int arg2) {
        field1665++;
        int var4 = arg0 - this.field1694;
        if (arg2 <= -58) {
            int var5 = arg1 - this.field1684;
            this.field1668[var4][var5] = class70.method470(this.field1668[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(II)V")
    public class89(int arg0, int arg1) {
        this.field1667 = arg1;
        this.field1685 = arg0;
        this.field1668 = new int[this.field1685][this.field1667];
        this.field1694 = 0;
        this.method644((byte) 15);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIIIII)V")
    public final void method656(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field1694;
        int var8 = arg3 - this.field1684;
        field1672++;
        if (arg4 != 10371) {
            this.method656(false, 89, -36, -85, 24, -80);
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method652(var7, (byte) -78, var8, 128);
                this.method652(var7 - 1, (byte) -78, var8, 8);
            }
            if (arg2 == 1) {
                this.method652(var7, (byte) -78, var8, 2);
                this.method652(var7, (byte) -78, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method652(var7, (byte) -78, var8, 8);
                this.method652(var7 + 1, (byte) -78, var8, 128);
            }
            if (arg2 == 3) {
                this.method652(var7, (byte) -78, var8, 32);
                this.method652(var7, (byte) -78, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method652(var7, (byte) -78, var8, 1);
                this.method652(var7 - 1, (byte) -78, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method652(var7, (byte) -78, var8, 4);
                this.method652(var7 + 1, (byte) -78, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method652(var7, (byte) -78, var8, 16);
                this.method652(var7 + 1, (byte) -78, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method652(var7, (byte) -78, var8, 64);
                this.method652(var7 - 1, (byte) -78, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method652(var7, (byte) -78, var8, 130);
                this.method652(var7 - 1, (byte) -78, var8, 8);
                this.method652(var7, (byte) -78, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method652(var7, (byte) -78, var8, 10);
                this.method652(var7, (byte) -78, var8 + 1, 32);
                this.method652(var7 + 1, (byte) -78, var8, 128);
            }
            if (arg2 == 2) {
                this.method652(var7, (byte) -78, var8, 40);
                this.method652(var7 + 1, (byte) -78, var8, 128);
                this.method652(var7, (byte) -78, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method652(var7, (byte) -78, var8, 160);
                this.method652(var7, (byte) -78, var8 - 1, 2);
                this.method652(var7 - 1, (byte) -78, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method652(var7, (byte) -78, var8, 65536);
                this.method652(var7 - 1, (byte) -78, var8, 4096);
            }
            if (arg2 == 1) {
                this.method652(var7, (byte) -78, var8, 1024);
                this.method652(var7, (byte) -78, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method652(var7, (byte) -78, var8, 4096);
                this.method652(var7 + 1, (byte) -78, var8, 65536);
            }
            if (arg2 == 3) {
                this.method652(var7, (byte) -78, var8, 16384);
                this.method652(var7, (byte) -78, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method652(var7, (byte) -78, var8, 512);
                this.method652(var7 - 1, (byte) -78, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method652(var7, (byte) -78, var8, 2048);
                this.method652(var7 + 1, (byte) -78, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method652(var7, (byte) -78, var8, 8192);
                this.method652(var7 + 1, (byte) -78, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method652(var7, (byte) -78, var8, 32768);
                this.method652(var7 - 1, (byte) -78, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method652(var7, (byte) -78, var8, 66560);
            this.method652(var7 - 1, (byte) -78, var8, 4096);
            this.method652(var7, (byte) -78, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method652(var7, (byte) -78, var8, 5120);
            this.method652(var7, (byte) -78, var8 + 1, 16384);
            this.method652(var7 + 1, (byte) -78, var8, 65536);
        }
        if (arg2 == 2) {
            this.method652(var7, (byte) -78, var8, 20480);
            this.method652(var7 + 1, (byte) -78, var8, 65536);
            this.method652(var7, (byte) -78, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method652(var7, (byte) -78, var8, 81920);
            this.method652(var7, (byte) -78, var8 - 1, 1024);
            this.method652(var7 - 1, (byte) -78, var8, 4096);
            return;
        }
    }
}
