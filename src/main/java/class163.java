import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class163 {

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    private int field2738;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    private int field2749;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[[I")
    public int[][] field2743;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "Lve;")
    public static class255 field2759 = class87.method607(111, "Angreifen");

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "[J")
    public static long[] field2757 = new long[100];

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Lve;")
    public static class255 field2756 = class87.method607(122, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lth;")
    public static class78 field2754 = new class78();

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Lve;")
    private static class255 field2764 = class87.method607(100, "wave2:");

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "Lve;")
    public static class255 field2765 = field2764;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "Lve;")
    public static class255 field2763 = field2764;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    public static int[] field2744;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZIII)V", line = 7)
    public final void method1174(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2737++;
        int var7 = arg3 - this.field2738;
        int var8 = -120 / ((arg0 - 77) / 48);
        int var9 = arg5 - this.field2751;
        int var10 = 256;
        if (arg2) {
            var10 += 131072;
        }
        for (int var11 = var9; var11 < (arg4 + var9); var11++) {
            if (var11 >= 0 && this.field2758 > var11) {
                for (int var12 = var7; var12 < arg1 + var7; var12++) {
                    if (var12 >= 0 && this.field2749 > var12) {
                        this.method1191(var10, var11, -126, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIBI)Z", line = 46)
    public final boolean method1175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field2740++;
        if (arg2 == 1) {
            if (arg1 == arg3 && arg5 == arg7) {
                return true;
            }
        } else if (arg1 <= arg3 && arg3 <= arg1 + arg2 - 1 && arg5 <= arg5 && arg5 <= arg2 + arg5 - 1) {
            return true;
        }
        int var9 = arg7 - this.field2738;
        int var10 = arg3 - this.field2751;
        int var11 = arg1 - this.field2751;
        if (arg6 > -35) {
            this.method1177((byte) -18);
        }
        int var12 = arg5 - this.field2738;
        if (arg2 == 1) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2743[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2743[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2743[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2743[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2743[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2743[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2743[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2743[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field2743[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field2743[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field2743[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var9 - 1;
            int var14 = arg2 + var11 - 1;
            if (arg4 == 0) {
                if (arg0 == 0) {
                    if (var10 - arg2 == var11 && var9 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && (var12 + 1) == var9 && (this.field2743[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && var12 - arg2 == var9 && (this.field2743[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 >= var11 && var14 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 - arg2) == var11 && var9 <= var12 && var12 <= var13 && (this.field2743[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var13 >= var12 && (this.field2743[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 + 1 == var11 && var9 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && (var12 + 1) == var9 && (this.field2743[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && (var12 - arg2) == var9 && (this.field2743[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 <= var10 && var14 >= var10 && var12 - arg2 == var9) {
                        return true;
                    }
                    if (var10 - arg2 == var11 && var12 >= var9 && var12 <= var13 && (this.field2743[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var13 >= var12 && (this.field2743[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    if ((var10 - arg2) == var11 && var9 <= var12 && var12 <= var13) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var12 <= var13 && (this.field2743[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && (var12 - arg2) == var9 && (this.field2743[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - arg2) == var11 && var9 <= var12 && var13 >= var12 && (this.field2743[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var12 <= var13) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && var12 - arg2 == var9 && (this.field2743[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - arg2) == var11 && var12 >= var9 && var12 <= var13 && (this.field2743[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && var12 + 1 == var9 && (this.field2743[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var13) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && var12 - arg2 == var9) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 - arg2 == var11 && var12 >= var9 && var12 <= var13) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && var12 + 1 == var9 && (this.field2743[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var13 >= var12 && (this.field2743[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && (var12 - arg2) == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 <= var10 && var14 >= var10 && var12 + 1 == var9 && (this.field2743[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var14 >= var10 && (var12 - arg2) == var9 && (this.field2743[var10][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var10 - arg2) == var11 && var12 >= var9 && var13 >= var12 && (this.field2743[var14][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 <= var12 && var12 <= var13 && (this.field2743[var11][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILrg;)[Ldm;", line = 413)
    public static final class273[] method1176(int arg0, int arg1, class88 arg2) {
        int var3 = 119 % ((arg1 + 46) / 61);
        field2753++;
        return class305.method2119(arg0, arg2, 81) ? class18.method96(2) : null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 428)
    public final void method1177(byte arg0) {
        field2735++;
        int var2 = 0;
        if (arg0 >= -5) {
            this.method1190(-77, 69, 7);
        }
        while (var2 < this.field2758) {
            for (int var3 = 0; var3 < this.field2749; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field2758 - 5 || var3 >= this.field2749 - 5) {
                    this.field2743[var2][var3] = 16777215;
                } else {
                    this.field2743[var2][var3] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZIIIIII)Z", line = 465)
    private final boolean method1178(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2736++;
        if ((arg1 + arg6) > arg7 && arg4 + arg7 > arg6) {
            if (arg2) {
                this.method1177((byte) 29);
            }
            return (arg3 + arg8) > arg5 && (arg5 + arg0) > arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 482)
    public static void method1179(int arg0) {
        field2757 = null;
        field2764 = null;
        if (arg0 != -7155) {
            return;
        }
        field2754 = null;
        field2756 = null;
        field2744 = null;
        field2763 = null;
        field2759 = null;
        field2765 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBIIIIIII)Z", line = 502)
    private final boolean method1180(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2747++;
        int var11 = arg0 + arg3;
        int var12 = arg1 + arg8;
        int var13 = arg4 + arg5;
        int var14 = arg6 + arg7;
        if (arg2 > -9) {
            field2765 = (class255) null;
        }
        if (arg1 >= arg4 && arg1 < var13) {
            if (arg6 == var11 && (arg9 & 0x4) == 0) {
                int var15 = arg1;
                int var16 = var12 <= var13 ? var12 : var13;
                while (var15 < var16) {
                    if ((this.field2743[var15 - this.field2751][var11 - this.field2738 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg0 == var14 && (arg9 & 0x1) == 0) {
                int var17 = arg1;
                int var18 = var12 > var13 ? var13 : var12;
                while (var17 < var18) {
                    if ((this.field2743[var17 - this.field2751][arg0 - this.field2738] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg4 < var12 && var13 >= var12) {
            if (arg6 == var11 && (arg9 & 0x4) == 0) {
                for (int var19 = arg4; var19 < var12; var19++) {
                    if ((this.field2743[var19 - this.field2751][var11 - this.field2738 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg9 & 0x1) == 0) {
                for (int var20 = arg4; var20 < var12; var20++) {
                    if ((this.field2743[var20 - this.field2751][arg0 - this.field2738] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg0 >= arg6 && var14 > arg0) {
            if (arg4 == var12 && (arg9 & 0x8) == 0) {
                int var21 = arg0;
                int var22 = var11 > var14 ? var14 : var11;
                while (var21 < var22) {
                    if ((this.field2743[var12 - this.field2751 - 1][var21 - this.field2738] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg1 == var13 && (arg9 & 0x2) == 0) {
                int var23 = var14 < var11 ? var14 : var11;
                for (int var24 = arg0; var24 < var23; var24++) {
                    if ((this.field2743[arg1 - this.field2751][var24 - this.field2738] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var11 > arg6 && var11 <= var14) {
            if (arg4 == var12 && (arg9 & 0x8) == 0) {
                for (int var25 = arg6; var25 < var11; var25++) {
                    if ((this.field2743[var12 - this.field2751 - 1][var25 - this.field2738] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var13 && (arg9 & 0x2) == 0) {
                for (int var26 = arg6; var26 < var11; var26++) {
                    if ((this.field2743[arg1 - this.field2751][var26 - this.field2738] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZII)V", line = 665)
    public final void method1181(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field2738;
        int var8 = arg1 - this.field2751;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1183(128, -10, var7, var8);
                this.method1183(8, -10, var7, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1183(2, arg4 ^ 0x9, var7, var8);
                this.method1183(32, -10, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method1183(8, arg4 ^ 0x9, var7, var8);
                this.method1183(128, arg4 ^ 0x9, var7, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1183(32, -10, var7, var8);
                this.method1183(2, -10, var7 - 1, var8);
            }
        }
        field2760++;
        if (arg4 != -1) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1183(1, -10, var7, var8);
                this.method1183(16, -10, var7 + 1, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1183(4, -10, var7, var8);
                this.method1183(64, -10, var7 + 1, var8 - -1);
            }
            if (arg5 == 2) {
                this.method1183(16, -10, var7, var8);
                this.method1183(1, -10, var7 - 1, var8 - -1);
            }
            if (arg5 == 3) {
                this.method1183(64, -10, var7, var8);
                this.method1183(4, -10, var7 - 1, var8 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method1183(130, arg4 ^ 0x9, var7, var8);
                this.method1183(8, -10, var7, var8 - 1);
                this.method1183(32, -10, var7 + 1, var8);
            }
            if (arg5 == 1) {
                this.method1183(10, -10, var7, var8);
                this.method1183(32, -10, var7 + 1, var8);
                this.method1183(128, -10, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1183(40, arg4 ^ 0x9, var7, var8);
                this.method1183(128, -10, var7, var8 + 1);
                this.method1183(2, -10, var7 - 1, var8);
            }
            if (arg5 == 3) {
                this.method1183(160, arg4 ^ 0x9, var7, var8);
                this.method1183(2, -10, var7 - 1, var8);
                this.method1183(8, -10, var7, var8 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1183(65536, -10, var7, var8);
                this.method1183(4096, -10, var7, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1183(1024, arg4 ^ 0x9, var7, var8);
                this.method1183(16384, arg4 ^ 0x9, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method1183(4096, -10, var7, var8);
                this.method1183(65536, arg4 ^ 0x9, var7, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1183(16384, -10, var7, var8);
                this.method1183(1024, -10, var7 - 1, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1183(512, arg4 ^ 0x9, var7, var8);
                this.method1183(8192, -10, var7 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method1183(2048, arg4 ^ 0x9, var7, var8);
                this.method1183(32768, -10, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1183(8192, arg4 ^ 0x9, var7, var8);
                this.method1183(512, -10, var7 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1183(32768, -10, var7, var8);
                this.method1183(2048, -10, var7 - 1, var8 + -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1183(66560, -10, var7, var8);
            this.method1183(4096, -10, var7, var8 - 1);
            this.method1183(16384, -10, var7 + 1, var8);
        }
        if (arg5 == 1) {
            this.method1183(5120, arg4 - 9, var7, var8);
            this.method1183(16384, arg4 - 9, var7 + 1, var8);
            this.method1183(65536, arg4 ^ 0x9, var7, var8 + 1);
        }
        if (arg5 == 2) {
            this.method1183(20480, -10, var7, var8);
            this.method1183(65536, -10, var7, var8 + 1);
            this.method1183(1024, -10, var7 - 1, var8);
        }
        if (arg5 == 3) {
            this.method1183(81920, -10, var7, var8);
            this.method1183(1024, -10, var7 - 1, var8);
            this.method1183(4096, -10, var7, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIZII)Z", line = 877)
    public final boolean method1182(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2746++;
        if (arg1 == 1) {
            if (arg2 == arg6 && arg3 == arg7) {
                return true;
            }
        } else if (arg6 <= arg2 && arg2 <= (arg6 + arg1 - 1) && arg3 >= arg3 && arg3 <= arg3 + arg1 - 1) {
            return true;
        }
        int var9 = arg6 - this.field2751;
        int var10 = arg7 - this.field2738;
        int var11 = arg2 - this.field2751;
        int var12 = arg3 - this.field2738;
        if (arg1 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2743[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2743[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2743[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2743[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field2743[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2743[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2743[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2743[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field2743[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field2743[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field2743[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field2743[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var9 - 1;
            int var14 = arg1 + var10 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var9 && var12 >= var10 && var14 >= var12 && (this.field2743[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 - arg1) == var10 && (this.field2743[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg1 == var9 && var12 >= var10 && var12 <= var14 && (this.field2743[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg1) == var10 && (this.field2743[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - arg1) == var9 && var12 >= var10 && var14 >= var12 && (this.field2743[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 + 1 == var10 && (this.field2743[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12 && (this.field2743[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field2743[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 >= var9 && var13 >= var11 && var12 + 1 == var10 && (this.field2743[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var11 && var13 >= var11 && var12 - arg1 == var10 && (this.field2743[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg1) == var9 && var10 <= var12 && var12 <= var14 && (this.field2743[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12 && (this.field2743[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return arg5;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V", line = 1070)
    private final void method1183(int arg0, int arg1, int arg2, int arg3) {
        this.field2743[arg3][arg2] = class154.method1134(this.field2743[arg3][arg2], ~arg0);
        field2741++;
        if (arg1 != -10) {
            field2763 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBIIIIIII)Z", line = 1083)
    public final boolean method1184(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 25 % ((-arg1 - 50) / 47);
        field2762++;
        if (arg8 <= 1) {
            int var11 = arg3 + arg7 - 1;
            int var12 = arg0 + arg6 - 1;
            if (arg5 >= arg3 && arg5 <= var11 && arg2 >= arg6 && arg2 <= var12) {
                return true;
            } else if ((arg3 - 1) == arg5 && arg6 <= arg2 && arg2 <= var12 && (this.field2743[arg5 - this.field2751][arg2 - this.field2738] & 0x8) == 0 && (arg4 & 0x8) == 0) {
                return true;
            } else if ((var11 + 1) == arg5 && arg2 >= arg6 && arg2 <= var12 && (this.field2743[arg5 - this.field2751][arg2 - this.field2738] & 0x80) == 0 && (arg4 & 0x2) == 0) {
                return true;
            } else if (arg6 - 1 == arg2 && arg5 >= arg3 && var11 >= arg5 && (this.field2743[arg5 - this.field2751][arg2 - this.field2738] & 0x2) == 0 && (arg4 & 0x4) == 0) {
                return true;
            } else {
                return var12 + 1 == arg2 && arg5 >= arg3 && var11 >= arg5 && (this.field2743[arg5 - this.field2751][arg2 - this.field2738] & 0x20) == 0 && (arg4 & 0x1) == 0;
            }
        } else if (this.method1178(arg8, arg7, false, arg6, arg8, arg2, arg3, arg5, arg0)) {
            return true;
        } else {
            return this.method1180(arg2, arg5, (byte) -71, arg8, arg3, arg7, arg6, arg0, arg8, arg4);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)V", line = 1131)
    public final void method1185(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field2738;
        int var5 = arg1 - this.field2751;
        field2739++;
        this.field2743[var5][var4] = class264.method1836(this.field2743[var5][var4], 2097152);
        if (arg2 != 127) {
            this.field2749 = 111;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIZZ)V", line = 1150)
    public final void method1186(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        if (arg6) {
            this.method1178(-118, -112, true, 1, 16, -63, 43, 41, -18);
        }
        int var8 = arg4 - this.field2751;
        int var9 = arg1 - this.field2738;
        field2748++;
        int var10 = 256;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg2;
            arg2 = arg0;
            arg0 = var11;
        }
        if (arg5) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < arg2 + var8; var12++) {
            if (var12 >= 0 && this.field2758 > var12) {
                for (int var13 = var9; var13 < (arg0 + var9); var13++) {
                    if (var13 >= 0 && var13 < this.field2749) {
                        this.method1183(var10, -10, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)V", line = 1202)
    public final void method1187(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field2750 = -1;
        }
        field2745++;
        int var4 = arg2 - this.field2751;
        int var5 = arg1 - this.field2738;
        this.field2743[var4][var5] = class154.method1134(this.field2743[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIBI)Z", line = 1223)
    public final boolean method1188(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2734++;
        if (arg0 == arg2 && arg1 == arg4) {
            return true;
        }
        int var6 = arg4 - this.field2738;
        int var7 = arg0 - this.field2751;
        if (var7 < 0 || var7 >= this.field2758 || var6 < 0 || var6 >= this.field2749) {
            return false;
        }
        int var8 = arg2 - this.field2751;
        if (arg3 <= 106) {
            this.field2751 = 5;
        }
        int var9;
        if (var7 <= var8) {
            var9 = var8 - var7;
        } else {
            var9 = var7 - var8;
        }
        int var10 = arg1 - this.field2738;
        int var11;
        if (var6 <= var10) {
            var11 = var10 - var6;
        } else {
            var11 = var6 - var10;
        }
        if (var9 > var11) {
            int var12 = var11 * 65536 / var9;
            int var13 = 32768;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field2743[var8][var10] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var7) {
                    if ((this.field2743[var8][var10] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 > var10) {
                        if ((this.field2743[var8][var10] & 0x12C0102) != 0) {
                            return false;
                        }
                        var10++;
                    } else if (var6 < var10) {
                        if ((this.field2743[var8][var10] & 0x12C0120) != 0) {
                            return false;
                        }
                        var10--;
                    }
                }
            }
        } else {
            int var14 = var9 * 65536 / var11;
            int var15 = 32768;
            while (var6 != var10) {
                if (var6 > var10) {
                    if ((this.field2743[var8][var10] & 0x12C0102) != 0) {
                        return false;
                    }
                    var10++;
                } else if (var10 > var6) {
                    if ((this.field2743[var8][var10] & 0x12C0120) != 0) {
                        return false;
                    }
                    var10--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 > var8) {
                        if ((this.field2743[var8][var10] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field2743[var8][var10] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field2743[var7][var6] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V", line = 1376)
    public static final void method1189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2742++;
        int var8 = class198.method1425(class11.field156, false, arg0, class261.field4427);
        if (arg6 != 2048) {
            method1189(47, 41, -9, -71, 62, 72, 0, -100);
        }
        int var9 = class198.method1425(class11.field156, false, arg2, class261.field4427);
        int var10 = class198.method1425(class30.field473, false, arg1, class125.field2082);
        int var11 = class198.method1425(class30.field473, false, arg4, class125.field2082);
        int var12 = class198.method1425(class11.field156, false, arg0 + arg5, class261.field4427);
        int var13 = class198.method1425(class11.field156, false, arg2 - arg5, class261.field4427);
        for (int var14 = var8; var14 < var12; var14++) {
            class30.method170(var11, class250.field4213[var14], var10, arg7, -30310);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class30.method170(var11, class250.field4213[var15], var10, arg7, arg6 - 32358);
        }
        int var16 = class198.method1425(class30.field473, false, arg1 + arg5, class125.field2082);
        int var17 = class198.method1425(class30.field473, false, arg4 - arg5, class125.field2082);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class250.field4213[var18];
            class30.method170(var16, var19, var10, arg7, arg6 ^ 0xFFFF819A);
            class30.method170(var17, var19, var16, arg3, -30310);
            class30.method170(var11, var19, var17, arg7, -30310);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 1427)
    public final void method1190(int arg0, int arg1, int arg2) {
        field2755++;
        int var4 = arg1 - this.field2738;
        int var5 = arg0 - this.field2751;
        this.field2743[var5][var4] = class264.method1836(this.field2743[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIII)V", line = 1442)
    private final void method1191(int arg0, int arg1, int arg2, int arg3) {
        this.field2743[arg1][arg3] = class264.method1836(this.field2743[arg1][arg3], arg0);
        field2761++;
        if (arg2 > -31) {
            this.method1183(-22, 37, -3, 120);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIBZ)V", line = 1473)
    public final void method1192(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        int var7 = arg1 - this.field2738;
        int var8 = arg2 - this.field2751;
        if (arg4 > -108) {
            method1179(56);
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method1191(128, var8, -52, var7);
                this.method1191(8, var8 - 1, -38, var7);
            }
            if (arg0 == 1) {
                this.method1191(2, var8, -127, var7);
                this.method1191(32, var8, -38, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1191(8, var8, -96, var7);
                this.method1191(128, var8 + 1, -82, var7);
            }
            if (arg0 == 3) {
                this.method1191(32, var8, -122, var7);
                this.method1191(2, var8, -94, var7 - 1);
            }
        }
        field2752++;
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method1191(1, var8, -91, var7);
                this.method1191(16, var8 - 1, -57, var7 + 1);
            }
            if (arg0 == 1) {
                this.method1191(4, var8, -65, var7);
                this.method1191(64, var8 + 1, -43, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1191(16, var8, -62, var7);
                this.method1191(1, var8 + 1, -89, var7 + -1);
            }
            if (arg0 == 3) {
                this.method1191(64, var8, -50, var7);
                this.method1191(4, var8 - 1, -56, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method1191(130, var8, -88, var7);
                this.method1191(8, var8 - 1, -105, var7);
                this.method1191(32, var8, -57, var7 + 1);
            }
            if (arg0 == 1) {
                this.method1191(10, var8, -96, var7);
                this.method1191(32, var8, -117, var7 + 1);
                this.method1191(128, var8 + 1, -57, var7);
            }
            if (arg0 == 2) {
                this.method1191(40, var8, -32, var7);
                this.method1191(128, var8 + 1, -79, var7);
                this.method1191(2, var8, -119, var7 - 1);
            }
            if (arg0 == 3) {
                this.method1191(160, var8, -124, var7);
                this.method1191(2, var8, -60, var7 - 1);
                this.method1191(8, var8 - 1, -125, var7);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method1191(65536, var8, -123, var7);
                this.method1191(4096, var8 - 1, -122, var7);
            }
            if (arg0 == 1) {
                this.method1191(1024, var8, -121, var7);
                this.method1191(16384, var8, -116, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1191(4096, var8, -59, var7);
                this.method1191(65536, var8 + 1, -87, var7);
            }
            if (arg0 == 3) {
                this.method1191(16384, var8, -97, var7);
                this.method1191(1024, var8, -69, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method1191(512, var8, -113, var7);
                this.method1191(8192, var8 - 1, -48, var7 + 1);
            }
            if (arg0 == 1) {
                this.method1191(2048, var8, -99, var7);
                this.method1191(32768, var8 + 1, -50, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1191(8192, var8, -66, var7);
                this.method1191(512, var8 + 1, -43, var7 - 1);
            }
            if (arg0 == 3) {
                this.method1191(32768, var8, -97, var7);
                this.method1191(2048, var8 - 1, -119, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1191(66560, var8, -49, var7);
            this.method1191(4096, var8 - 1, -104, var7);
            this.method1191(16384, var8, -114, var7 + 1);
        }
        if (arg0 == 1) {
            this.method1191(5120, var8, -101, var7);
            this.method1191(16384, var8, -120, var7 + 1);
            this.method1191(65536, var8 + 1, -56, var7);
        }
        if (arg0 == 2) {
            this.method1191(20480, var8, -107, var7);
            this.method1191(65536, var8 + 1, -75, var7);
            this.method1191(1024, var8, -99, var7 - 1);
        }
        if (arg0 == 3) {
            this.method1191(81920, var8, -100, var7);
            this.method1191(1024, var8, -103, var7 - 1);
            this.method1191(4096, var8 - 1, -76, var7);
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V", line = 1685)
    public class163(int arg0, int arg1) {
        this.field2758 = arg0;
        this.field2738 = 0;
        this.field2751 = 0;
        this.field2749 = arg1;
        this.field2743 = new int[this.field2758][this.field2749];
        this.method1177((byte) -77);
    }
}
