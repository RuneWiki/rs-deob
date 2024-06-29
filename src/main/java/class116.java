import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class116 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    private int field2070 = 0;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    private int field2077 = 0;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "[[I")
    public int[][] field2085;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2068 = 20;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "Lv;")
    public static class147 field2088 = new class147(64);

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field2091 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lkk;")
    public static class223 field2072;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "[Lal;")
    public static class221[] field2093;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIBIIIII)Z")
    public final boolean method920(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2066++;
        if (arg3 == 1) {
            if (arg1 == arg4 && arg0 == arg7) {
                return true;
            }
        } else if (arg4 >= arg1 && arg4 <= arg1 + arg3 - 1 && arg7 >= arg7 && arg3 + arg7 - 1 >= arg7) {
            return true;
        }
        int var9 = arg1 - this.field2070;
        int var10 = arg4 - this.field2070;
        int var11 = arg0 - this.field2077;
        int var12 = arg7 - this.field2077;
        if (arg3 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field2085[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field2085[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field2085[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field2085[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field2085[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field2085[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field2085[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field2085[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field2085[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field2085[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field2085[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field2085[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg3 - 1;
            int var14 = arg3 + var9 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var10 + 1 == var9 && var11 <= var12 && var13 >= var12 && (this.field2085[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var14 >= var10 && (var12 - arg3) == var11 && (this.field2085[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - arg3 == var9 && var12 >= var11 && var12 <= var13 && (this.field2085[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var14 && var12 - arg3 == var11 && (this.field2085[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg3 == var9 && var12 >= var11 && var12 <= var13 && (this.field2085[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var14 >= var10 && (var12 + 1) == var11 && (this.field2085[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var13 && (this.field2085[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var14 && (var12 + 1) == var11 && (this.field2085[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 <= var10 && var14 >= var10 && (var12 + 1) == var11 && (this.field2085[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var9 && var14 >= var10 && var12 - arg3 == var11 && (this.field2085[var10][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg3) == var9 && var11 <= var12 && var12 <= var13 && (this.field2085[var14][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var12 >= var11 && var12 <= var13 && (this.field2085[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg2 != -103) {
            this.method931(10, 104, 27);
        }
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIIIII)V")
    public static final void method921(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0) {
            method921(false, -76, -84, -54, 15, 44);
        }
        int var9 = arg3 + 1;
        class182.method1311(arg1, arg5, arg0, class66.field1254[arg3], arg4);
        field2090++;
        int var8 = arg2 - 1;
        class182.method1311(arg1, arg5, arg0, class66.field1254[arg2], arg4);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class66.field1254[var6];
            var7[arg4] = var7[arg5] = arg1;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIZIII)V")
    public final void method922(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field2077;
        int var8 = arg1 - this.field2070;
        if (arg4 != -7889) {
            return;
        }
        field2086++;
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < arg5 + var8; var10++) {
            if (var10 >= 0 && this.field2083 > var10) {
                for (int var11 = var7; var11 < arg3 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field2069) {
                        this.method925(var9, var10, var11, -105);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)V")
    public final void method923(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field2070;
        int var5 = arg1 - this.field2077;
        field2087++;
        if (arg2 > -1) {
            field2091 = -105;
        }
        this.field2085[var4][var5] = class189.method1350(this.field2085[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method924(Component arg0, int arg1) {
        field2073++;
        Method var2 = class129.field2331;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        int var3 = 27 % ((-arg1 - 46) / 52);
        arg0.addKeyListener(class173.field3059);
        arg0.addFocusListener(class173.field3059);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
    private final void method925(int arg0, int arg1, int arg2, int arg3) {
        field2078++;
        int var5 = 89 % ((arg3 - 64) / 57);
        this.field2085[arg1][arg2] = class177.method1290(this.field2085[arg1][arg2], arg0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2080++;
        if (arg4 == 1) {
            if (arg3 == arg7 && arg0 == arg1) {
                return true;
            }
        } else if (arg3 <= arg7 && arg7 <= (arg3 + arg4 - 1) && arg0 >= arg0 && (arg0 + arg4 - 1) >= arg0) {
            return true;
        }
        int var9 = arg1 - this.field2077;
        int var10 = arg0 - this.field2077;
        int var11 = arg7 - this.field2070;
        int var12 = arg3 - this.field2070;
        if (arg4 == 1) {
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field2085[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field2085[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field2085[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field2085[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field2085[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field2085[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field2085[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field2085[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field2085[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field2085[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field2085[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var12 - 1;
            int var14 = arg4 + var9 - 1;
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if (var11 - arg4 == var12 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 + 1 == var9 && (this.field2085[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 - arg4) == var9 && (this.field2085[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 <= var11 && var11 <= var13 && (var10 + 1) == var9) {
                        return true;
                    }
                    if ((var11 - arg4) == var12 && var10 >= var9 && var14 >= var10 && (this.field2085[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14 && (this.field2085[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 + 1 == var12 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 + 1) == var9 && (this.field2085[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 - arg4) == var9 && (this.field2085[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 >= var12 && var11 <= var13 && (var10 - arg4) == var9) {
                        return true;
                    }
                    if (var11 - arg4 == var12 && var9 <= var10 && var14 >= var10 && (this.field2085[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var14 >= var10 && (this.field2085[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if ((var11 - arg4) == var12 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field2085[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 - arg4) == var9 && (this.field2085[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - arg4 == var12 && var10 >= var9 && var14 >= var10 && (this.field2085[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 - arg4) == var9 && (this.field2085[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - arg4) == var12 && var10 >= var9 && var10 <= var14 && (this.field2085[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 + 1) == var9 && (this.field2085[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var10 - arg4 == var9) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 - arg4 == var12 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 + 1) == var9 && (this.field2085[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field2085[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 - arg4) == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var12 <= var11 && var13 >= var11 && var10 + 1 == var9 && (this.field2085[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var12 && var13 >= var11 && (var10 - arg4) == var9 && (this.field2085[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg4 == var12 && var9 <= var10 && var14 >= var10 && (this.field2085[var13][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 <= var10 && var14 >= var10 && (this.field2085[var12][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 != 19661064) {
            this.method933(-7, -43, 77);
        }
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIIII)V")
    public final void method927(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field2077;
        int var8 = arg4 - this.field2070;
        field2071++;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method930(var7, 128, arg2 + 124, var8);
                this.method930(var7, 8, -22, var8 - 1);
            }
            if (arg3 == 1) {
                this.method930(var7, 2, arg2 ^ 0x6F, var8);
                this.method930(var7 + 1, 32, arg2 ^ 0x52, var8);
            }
            if (arg3 == 2) {
                this.method930(var7, 8, arg2 ^ 0x33, var8);
                this.method930(var7, 128, arg2 + 130, var8 - -1);
            }
            if (arg3 == 3) {
                this.method930(var7, 32, 122, var8);
                this.method930(var7 - 1, 2, arg2 - 29, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method930(var7, 1, 122, var8);
                this.method930(var7 + 1, 16, -54, var8 - 1);
            }
            if (arg3 == 1) {
                this.method930(var7, 4, 34, var8);
                this.method930(var7 + 1, 64, arg2 + 129, var8 + 1);
            }
            if (arg3 == 2) {
                this.method930(var7, 16, -99, var8);
                this.method930(var7 - 1, 1, -53, var8 + 1);
            }
            if (arg3 == 3) {
                this.method930(var7, 64, arg2 - 83, var8);
                this.method930(var7 - 1, 4, 127, var8 - 1);
            }
        }
        if (~arg0 == arg2) {
            if (arg3 == 0) {
                this.method930(var7, 130, 120, var8);
                this.method930(var7, 8, 123, var8 - 1);
                this.method930(var7 + 1, 32, 123, var8);
            }
            if (arg3 == 1) {
                this.method930(var7, 10, -27, var8);
                this.method930(var7 + 1, 32, 123, var8);
                this.method930(var7, 128, arg2 ^ 0xFFFFFF83, var8 + 1);
            }
            if (arg3 == 2) {
                this.method930(var7, 40, 126, var8);
                this.method930(var7, 128, -118, var8 + 1);
                this.method930(var7 - 1, 2, arg2 ^ 0x7D, var8);
            }
            if (arg3 == 3) {
                this.method930(var7, 160, -14, var8);
                this.method930(var7 - 1, 2, 6, var8);
                this.method930(var7, 8, arg2 ^ 0xFFFFFF80, var8 - 1);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method930(var7, 65536, 121, var8);
                this.method930(var7, 4096, arg2 ^ 0x1E, var8 - 1);
            }
            if (arg3 == 1) {
                this.method930(var7, 1024, arg2 - 95, var8);
                this.method930(var7 + 1, 16384, arg2 ^ 0xFFFFFF80, var8);
            }
            if (arg3 == 2) {
                this.method930(var7, 4096, 12, var8);
                this.method930(var7, 65536, 120, var8 + 1);
            }
            if (arg3 == 3) {
                this.method930(var7, 16384, 122, var8);
                this.method930(var7 - 1, 1024, -77, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method930(var7, 512, 125, var8);
                this.method930(var7 + 1, 8192, -62, var8 - 1);
            }
            if (arg3 == 1) {
                this.method930(var7, 2048, 127, var8);
                this.method930(var7 + 1, 32768, arg2 - 5, var8 + 1);
            }
            if (arg3 == 2) {
                this.method930(var7, 8192, 125, var8);
                this.method930(var7 - 1, 512, -8, var8 + 1);
            }
            if (arg3 == 3) {
                this.method930(var7, 32768, 127, var8);
                this.method930(var7 - 1, 2048, -33, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method930(var7, 66560, -13, var8);
            this.method930(var7, 4096, -89, var8 - 1);
            this.method930(var7 + 1, 16384, -120, var8);
        }
        if (arg3 == 1) {
            this.method930(var7, 5120, arg2 - 105, var8);
            this.method930(var7 + 1, 16384, arg2 ^ 0xFFFFFF82, var8);
            this.method930(var7, 65536, arg2 + 129, var8 - -1);
        }
        if (arg3 == 2) {
            this.method930(var7, 20480, -60, var8);
            this.method930(var7, 65536, 125, var8 + 1);
            this.method930(var7 - 1, 1024, 122, var8);
        }
        if (arg3 == 3) {
            this.method930(var7, 81920, 25, var8);
            this.method930(var7 - 1, 1024, 121, var8);
            this.method930(var7, 4096, 122, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIIIIIIII)Z")
    public final boolean method928(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2076++;
        if (arg5 > 1) {
            return this.method934(arg5, arg5, arg8, arg4, arg1, arg3, arg7, arg2, (byte) -127) ? true : this.method938(arg5, -113, arg8, arg7, arg2, arg1, arg5, arg3, arg6, arg4);
        }
        int var10 = 91 % ((-arg0 - 2) / 47);
        int var11 = arg8 + arg1 - 1;
        int var12 = arg2 + arg7 - 1;
        if (arg8 <= arg3 && var11 >= arg3 && arg2 <= arg4 && arg4 <= var12) {
            return true;
        } else if ((arg8 - 1) == arg3 && arg2 <= arg4 && var12 >= arg4 && (this.field2085[arg3 - this.field2070][arg4 - this.field2077] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var11 + 1 == arg3 && arg4 >= arg2 && var12 >= arg4 && (this.field2085[arg3 - this.field2070][arg4 - this.field2077] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg4 && arg3 >= arg8 && var11 >= arg3 && (this.field2085[arg3 - this.field2070][arg4 - this.field2077] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var12 + 1 == arg4 && arg3 >= arg8 && arg3 <= var11 && (this.field2085[arg3 - this.field2070][arg4 - this.field2077] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method929(int arg0) {
        if (arg0 != 3003) {
            field2072 = null;
        }
        field2088 = null;
        field2093 = null;
        field2072 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIII)V")
    private final void method930(int arg0, int arg1, int arg2, int arg3) {
        this.field2085[arg3][arg0] = class189.method1350(this.field2085[arg3][arg0], ~arg1);
        field2067++;
        int var5 = 32 / ((arg2 - 82) / 38);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public final void method931(int arg0, int arg1, int arg2) {
        field2081++;
        int var4 = arg2 - this.field2070;
        if (arg1 < 22) {
            this.method922(0, 40, false, 41, -75, -98);
        }
        int var5 = arg0 - this.field2077;
        this.field2085[var4][var5] = class177.method1290(this.field2085[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIIBI)V")
    public final void method932(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg0 - this.field2077;
        field2089++;
        int var8 = arg2 - this.field2070;
        int var9 = 120 % ((36 - arg4) / 38);
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method925(128, var8, var7, -76);
                this.method925(8, var8 - 1, var7, 126);
            }
            if (arg5 == 1) {
                this.method925(2, var8, var7, 121);
                this.method925(32, var8, var7 + 1, -59);
            }
            if (arg5 == 2) {
                this.method925(8, var8, var7, -8);
                this.method925(128, var8 + 1, var7, 127);
            }
            if (arg5 == 3) {
                this.method925(32, var8, var7, 123);
                this.method925(2, var8, var7 - 1, -74);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method925(1, var8, var7, 121);
                this.method925(16, var8 - 1, var7 + 1, 126);
            }
            if (arg5 == 1) {
                this.method925(4, var8, var7, -98);
                this.method925(64, var8 + 1, var7 + 1, 125);
            }
            if (arg5 == 2) {
                this.method925(16, var8, var7, 127);
                this.method925(1, var8 + 1, var7 + -1, 124);
            }
            if (arg5 == 3) {
                this.method925(64, var8, var7, 127);
                this.method925(4, var8 - 1, var7 - 1, 5);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method925(130, var8, var7, -61);
                this.method925(8, var8 - 1, var7, 123);
                this.method925(32, var8, var7 + 1, -1);
            }
            if (arg5 == 1) {
                this.method925(10, var8, var7, 123);
                this.method925(32, var8, var7 + 1, -122);
                this.method925(128, var8 + 1, var7, -74);
            }
            if (arg5 == 2) {
                this.method925(40, var8, var7, 122);
                this.method925(128, var8 + 1, var7, -46);
                this.method925(2, var8, var7 - 1, 4);
            }
            if (arg5 == 3) {
                this.method925(160, var8, var7, -121);
                this.method925(2, var8, var7 - 1, 126);
                this.method925(8, var8 - 1, var7, 126);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method925(65536, var8, var7, -78);
                this.method925(4096, var8 - 1, var7, -90);
            }
            if (arg5 == 1) {
                this.method925(1024, var8, var7, 127);
                this.method925(16384, var8, var7 + 1, -30);
            }
            if (arg5 == 2) {
                this.method925(4096, var8, var7, -18);
                this.method925(65536, var8 + 1, var7, -42);
            }
            if (arg5 == 3) {
                this.method925(16384, var8, var7, -38);
                this.method925(1024, var8, var7 - 1, -13);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method925(512, var8, var7, 6);
                this.method925(8192, var8 - 1, var7 + 1, -115);
            }
            if (arg5 == 1) {
                this.method925(2048, var8, var7, -1);
                this.method925(32768, var8 + 1, var7 - -1, -98);
            }
            if (arg5 == 2) {
                this.method925(8192, var8, var7, 123);
                this.method925(512, var8 + 1, var7 + -1, -19);
            }
            if (arg5 == 3) {
                this.method925(32768, var8, var7, 122);
                this.method925(2048, var8 - 1, var7 + -1, 125);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method925(66560, var8, var7, 125);
            this.method925(4096, var8 - 1, var7, 121);
            this.method925(16384, var8, var7 + 1, 125);
        }
        if (arg5 == 1) {
            this.method925(5120, var8, var7, 127);
            this.method925(16384, var8, var7 + 1, 122);
            this.method925(65536, var8 + 1, var7, -73);
        }
        if (arg5 == 2) {
            this.method925(20480, var8, var7, -125);
            this.method925(65536, var8 + 1, var7, -88);
            this.method925(1024, var8, var7 - 1, -2);
        }
        if (arg5 == 3) {
            this.method925(81920, var8, var7, -94);
            this.method925(1024, var8, var7 - 1, -128);
            this.method925(4096, var8 - 1, var7, 127);
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)V")
    public final void method933(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2070;
        field2075++;
        int var5 = arg2 - this.field2077;
        this.field2085[var4][var5] = class177.method1290(this.field2085[var4][var5], 2097152);
        if (arg0 != 0) {
            this.method938(-4, -82, 123, 1, -97, 34, -26, -110, -78, -128);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIB)Z")
    private final boolean method934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg8 > -126) {
            this.method931(30, -16, 87);
        }
        field2074++;
        if (arg5 < arg2 + arg4 && arg1 + arg5 > arg2) {
            return arg3 < (arg6 + arg7) && (arg3 + arg0) > arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public final void method935(int arg0) {
        for (int var2 = 0; var2 < this.field2083; var2++) {
            for (int var3 = 0; var3 < this.field2069; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field2083 - 5) <= var2 || var3 >= this.field2069 - 5) {
                    this.field2085[var2][var3] = 16777215;
                } else {
                    this.field2085[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 == 1) {
            field2092++;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Z")
    public static final boolean method936(int arg0, int arg1) {
        field2084++;
        if (arg0 <= arg1 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZIIIII)V")
    public final void method937(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg1) {
            this.method934(118, -38, -126, -10, -3, -30, -63, -37, (byte) -103);
        }
        field2082++;
        int var8 = arg5 - this.field2077;
        if (arg2 == 1 || arg2 == 3) {
            int var9 = arg4;
            arg4 = arg3;
            arg3 = var9;
        }
        int var10 = 256;
        if (arg0) {
            var10 += 131072;
        }
        int var11 = arg6 - this.field2070;
        for (int var12 = var11; var12 < var11 + arg4; var12++) {
            if (var12 >= 0 && this.field2083 > var12) {
                for (int var13 = var8; var13 < (arg3 + var8); var13++) {
                    if (var13 >= 0 && var13 < this.field2069) {
                        this.method930(var13, var10, 121, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg9 + arg0;
        int var12 = arg6 + arg7;
        field2079++;
        if (arg1 > -106) {
            return true;
        }
        int var13 = arg2 + arg5;
        int var14 = arg3 + arg4;
        if (arg2 <= arg7 && arg7 < var13) {
            if (arg4 == var11 && (arg8 & 0x4) == 0) {
                int var15 = arg7;
                int var16 = var13 >= var12 ? var12 : var13;
                while (var15 < var16) {
                    if ((this.field2085[var15 - this.field2070][var11 - this.field2077 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg9 == var14 && (arg8 & 0x1) == 0) {
                int var17 = arg7;
                int var18 = var13 < var12 ? var13 : var12;
                while (var18 > var17) {
                    if ((this.field2085[var17 - this.field2070][arg9 - this.field2077] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg2 < var12 && var13 >= var12) {
            if (arg4 == var11 && (arg8 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var12; var19++) {
                    if ((this.field2085[var19 - this.field2070][var11 - this.field2077 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var14 && (arg8 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var12; var20++) {
                    if ((this.field2085[var20 - this.field2070][arg9 - this.field2077] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg4 <= arg9 && arg9 < var14) {
            if (arg2 == var12 && (arg8 & 0x8) == 0) {
                int var21 = var14 < var11 ? var14 : var11;
                for (int var22 = arg9; var22 < var21; var22++) {
                    if ((this.field2085[var12 - this.field2070 - 1][var22 - this.field2077] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var13 && (arg8 & 0x2) == 0) {
                int var23 = var11 > var14 ? var14 : var11;
                for (int var24 = arg9; var24 < var23; var24++) {
                    if ((this.field2085[arg7 - this.field2070][var24 - this.field2077] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var11 > arg4 && var11 <= var14) {
            if (arg2 == var12 && (arg8 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var11; var25++) {
                    if ((this.field2085[var12 - this.field2070 - 1][var25 - this.field2077] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var13 && (arg8 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var11; var26++) {
                    if ((this.field2085[arg7 - this.field2070][var26 - this.field2077] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(II)V")
    public class116(int arg0, int arg1) {
        this.field2083 = arg0;
        this.field2069 = arg1;
        this.field2085 = new int[this.field2083][this.field2069];
        this.method935(1);
    }
}
