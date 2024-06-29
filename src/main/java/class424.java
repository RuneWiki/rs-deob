import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class424 {

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lsd;")
    public static class74 field6110 = new class74(90, 6);

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "J")
    public static long field6128 = 0L;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Lec;")
    public static class40 field6129 = new class40("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public int field6103;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public int field6116;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public int field6119;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public int field6121;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "Lws;")
    public static class158 field6127;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Lhm;")
    public static class304 field6126;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public static int[] field6109;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "[[I")
    public int[][] field6118;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIIZIIZ)V", line = 4)
    public final void method2522(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field6106++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg1 - this.field6121;
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var10 = arg2 - this.field6116;
        if (arg0) {
            this.method2534(-29);
        }
        for (int var11 = var10; var11 < (arg5 + var10); var11++) {
            if (var11 >= 0 && this.field6103 > var11) {
                for (int var12 = var9; var12 < (arg4 + var9); var12++) {
                    if (var12 >= 0 && var12 < this.field6119) {
                        this.method2533(var11, var12, var8, 107);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 52)
    public static void method2523(int arg0) {
        field6109 = null;
        field6126 = null;
        field6110 = null;
        field6127 = null;
        field6129 = null;
        int var1 = -102 % ((arg0 - 75) / 37);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V", line = 66)
    public final void method2524(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field6116;
        int var5 = arg2 - this.field6121;
        field6114++;
        if (arg0) {
            this.method2532(-96, true, 105, 51, -80, 30, false);
        }
        this.field6118[var4][var5] = class292.method1841(this.field6118[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V", line = 80)
    public final void method2525(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field6121;
        int var5 = arg0 - this.field6116;
        field6107++;
        this.field6118[var5][var4] = class292.method1841(this.field6118[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIZIII)Z", line = 92)
    public final boolean method2526(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field6105++;
        if (arg4) {
            return false;
        }
        if (arg6 == 1) {
            if (arg5 == arg7 && arg1 == arg2) {
                return true;
            }
        } else if (arg7 <= arg5 && (arg7 + arg6 - 1) >= arg5 && arg2 >= arg2 && arg2 + arg6 - 1 >= arg2) {
            return true;
        }
        int var9 = arg7 - this.field6116;
        int var10 = arg1 - this.field6121;
        int var11 = arg5 - this.field6116;
        int var12 = arg2 - this.field6121;
        if (arg6 == 1) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field6118[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field6118[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field6118[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field6118[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field6118[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field6118[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field6118[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field6118[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field6118[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field6118[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field6118[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var9 - 1;
            int var14 = arg6 + var10 - 1;
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if ((var11 - arg6) == var9 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 + 1 == var10 && (this.field6118[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 - arg6) == var10 && (this.field6118[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 - arg6 == var9 && var12 >= var10 && var14 >= var12 && (this.field6118[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field6118[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 + 1 == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 + 1) == var10 && (this.field6118[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg6) == var10 && (this.field6118[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 >= var9 && var11 <= var13 && var12 - arg6 == var10) {
                        return true;
                    }
                    if (var11 - arg6 == var9 && var10 <= var12 && var14 >= var12 && (this.field6118[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14 && (this.field6118[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if ((var11 - arg6) == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var14 && (this.field6118[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 - arg6 == var10 && (this.field6118[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg6 == var9 && var10 <= var12 && var14 >= var12 && (this.field6118[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 - arg6) == var10 && (this.field6118[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - arg6 == var9 && var10 <= var12 && var12 <= var14 && (this.field6118[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field6118[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 - arg6) == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 - arg6 == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 + 1 == var10 && (this.field6118[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var12 <= var14 && (this.field6118[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 - arg6 == var10) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10 && (this.field6118[var11][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var11 && var13 >= var11 && var12 - arg6 == var10 && (this.field6118[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg6) == var9 && var12 >= var10 && var12 <= var14 && (this.field6118[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12 && (this.field6118[var9][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIBIII)Z", line = 459)
    public final boolean method2527(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -120) {
            this.field6119 = 107;
        }
        field6102++;
        if (arg6 == 1) {
            if (arg0 == arg3 && arg1 == arg5) {
                return true;
            }
        } else if (arg0 <= arg3 && arg3 <= (arg6 + arg0 - 1) && arg1 <= arg1 && (arg6 + arg1 - 1) >= arg1) {
            return true;
        }
        int var9 = arg3 - this.field6116;
        int var10 = arg0 - this.field6116;
        int var11 = arg1 - this.field6121;
        int var12 = arg5 - this.field6121;
        if (arg6 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field6118[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field6118[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field6118[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field6118[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field6118[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field6118[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 + 1 == var10 && var11 == var12 && (this.field6118[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field6118[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 == var10 && (var11 + 1) == var12 && (this.field6118[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field6118[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var10 && var11 == var12 && (this.field6118[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field6118[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg6 - 1;
            int var14 = arg6 + var12 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var14 && (this.field6118[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var11 - arg6 == var12 && (this.field6118[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - arg6) == var10 && var12 <= var11 && var11 <= var14 && (this.field6118[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var11 - arg6 == var12 && (this.field6118[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - arg6 == var10 && var12 <= var11 && var11 <= var14 && (this.field6118[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var11 + 1) == var12 && (this.field6118[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 + 1) == var10 && var11 >= var12 && var14 >= var11 && (this.field6118[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var11 + 1 == var12 && (this.field6118[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 >= var10 && var9 <= var13 && var11 + 1 == var12 && (this.field6118[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var9 && var9 <= var13 && (var11 - arg6) == var12 && (this.field6118[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg6) == var10 && var12 <= var11 && var14 >= var11 && (this.field6118[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var11 >= var12 && var11 <= var14 && (this.field6118[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIB)V", line = 650)
    private final void method2528(int arg0, int arg1, int arg2, byte arg3) {
        field6113++;
        if (arg3 >= 106) {
            this.field6118[arg2][arg1] = class444.method2618(this.field6118[arg2][arg1], ~arg0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIII)Z", line = 661)
    public final boolean method2529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6111++;
        int var11 = arg7 + arg2;
        int var12 = arg5 + arg9;
        int var13 = arg1 + arg8;
        int var14 = arg4 + arg6;
        if (arg7 == var13 && (arg3 & 0x2) == 0) {
            int var15 = arg5 <= arg4 ? arg4 : arg5;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field6118[var13 - this.field6116 - 1][var15 - this.field6121] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg8 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg4 >= arg5 ? arg4 : arg5;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field6118[arg8 - this.field6116][var17 - this.field6121] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg5 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg7 <= arg8 ? arg8 : arg7;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field6118[var19 - this.field6116][var14 - this.field6121 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg8 < arg7 ? arg7 : arg8;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field6118[var21 - this.field6116][arg4 - this.field6121] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        int var23 = -119 % ((6 - arg0) / 63);
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIII)Z", line = 757)
    public final boolean method2530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6115++;
        if (arg2 > 1) {
            return class390.method2348(arg8, arg5, arg0, arg1, arg3, arg6, arg2, 61, arg2) ? true : this.method2529(-105, arg6, arg2, arg4, arg1, arg3, arg8, arg0, arg5, arg2);
        }
        int var10 = arg5 + arg6 - 1;
        int var11 = arg8 + arg1 - 1;
        if (arg0 >= arg5 && arg0 <= var10 && arg1 <= arg3 && arg3 <= var11) {
            return true;
        } else if ((arg5 - 1) == arg0 && arg1 <= arg3 && arg3 <= var11 && (this.field6118[arg0 - this.field6116][arg3 - this.field6121] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg1 <= arg3 && arg3 <= var11 && (this.field6118[arg0 - this.field6116][arg3 - this.field6121] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else {
            int var12 = -109 % ((-arg7 - 6) / 44);
            if (arg1 - 1 == arg3 && arg0 >= arg5 && var10 >= arg0 && (this.field6118[arg0 - this.field6116][arg3 - this.field6121] & 0x2) == 0 && (arg4 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg3 && arg5 <= arg0 && arg0 <= var10 && (this.field6118[arg0 - this.field6116][arg3 - this.field6121] & 0x20) == 0 && (arg4 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZBIIIIIZ)V", line = 802)
    public final void method2531(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field6123++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        if (arg0) {
            var9 |= 0x40000000;
        }
        int var10 = arg3 - this.field6116;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg5;
            arg5 = arg4;
            arg4 = var11;
        }
        int var12 = arg6 - this.field6121;
        int var13 = var10;
        int var14 = 35 % ((21 - arg1) / 44);
        while (var13 < (var10 + arg5)) {
            if (var13 >= 0 && var13 < this.field6103) {
                for (int var15 = var12; var15 < arg4 + var12; var15++) {
                    if (var15 >= 0 && var15 < this.field6119) {
                        this.method2528(var9, var15, var13, (byte) 118);
                    }
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZIIIIZ)V", line = 854)
    public final void method2532(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 != 4194304) {
            return;
        }
        int var8 = arg2 - this.field6121;
        int var9 = arg4 - this.field6116;
        field6104++;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method2528(128, var8, var9, (byte) 117);
                this.method2528(8, var8, var9 - 1, (byte) 126);
            }
            if (arg0 == 1) {
                this.method2528(2, var8, var9, (byte) 120);
                this.method2528(32, var8 + 1, var9, (byte) 124);
            }
            if (arg0 == 2) {
                this.method2528(8, var8, var9, (byte) 110);
                this.method2528(128, var8, var9 + 1, (byte) 124);
            }
            if (arg0 == 3) {
                this.method2528(32, var8, var9, (byte) 123);
                this.method2528(2, var8 - 1, var9, (byte) 111);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method2528(1, var8, var9, (byte) 118);
                this.method2528(16, var8 + 1, var9 + -1, (byte) 124);
            }
            if (arg0 == 1) {
                this.method2528(4, var8, var9, (byte) 124);
                this.method2528(64, var8 + 1, var9 + 1, (byte) 119);
            }
            if (arg0 == 2) {
                this.method2528(16, var8, var9, (byte) 122);
                this.method2528(1, var8 - 1, var9 + 1, (byte) 123);
            }
            if (arg0 == 3) {
                this.method2528(64, var8, var9, (byte) 120);
                this.method2528(4, var8 - 1, var9 + -1, (byte) 111);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method2528(130, var8, var9, (byte) 116);
                this.method2528(8, var8, var9 - 1, (byte) 126);
                this.method2528(32, var8 + 1, var9, (byte) 109);
            }
            if (arg0 == 1) {
                this.method2528(10, var8, var9, (byte) 110);
                this.method2528(32, var8 + 1, var9, (byte) 115);
                this.method2528(128, var8, var9 + 1, (byte) 122);
            }
            if (arg0 == 2) {
                this.method2528(40, var8, var9, (byte) 124);
                this.method2528(128, var8, var9 + 1, (byte) 114);
                this.method2528(2, var8 - 1, var9, (byte) 110);
            }
            if (arg0 == 3) {
                this.method2528(160, var8, var9, (byte) 126);
                this.method2528(2, var8 - 1, var9, (byte) 108);
                this.method2528(8, var8, var9 - 1, (byte) 122);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method2528(65536, var8, var9, (byte) 127);
                    this.method2528(4096, var8, var9 - 1, (byte) 116);
                }
                if (arg0 == 1) {
                    this.method2528(1024, var8, var9, (byte) 116);
                    this.method2528(16384, var8 + 1, var9, (byte) 113);
                }
                if (arg0 == 2) {
                    this.method2528(4096, var8, var9, (byte) 113);
                    this.method2528(65536, var8, var9 + 1, (byte) 119);
                }
                if (arg0 == 3) {
                    this.method2528(16384, var8, var9, (byte) 122);
                    this.method2528(1024, var8 - 1, var9, (byte) 127);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method2528(512, var8, var9, (byte) 112);
                    this.method2528(8192, var8 + 1, var9 + -1, (byte) 116);
                }
                if (arg0 == 1) {
                    this.method2528(2048, var8, var9, (byte) 112);
                    this.method2528(32768, var8 + 1, var9 - -1, (byte) 110);
                }
                if (arg0 == 2) {
                    this.method2528(8192, var8, var9, (byte) 123);
                    this.method2528(512, var8 - 1, var9 - -1, (byte) 107);
                }
                if (arg0 == 3) {
                    this.method2528(32768, var8, var9, (byte) 122);
                    this.method2528(2048, var8 - 1, var9 + -1, (byte) 126);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method2528(66560, var8, var9, (byte) 124);
                    this.method2528(4096, var8, var9 - 1, (byte) 116);
                    this.method2528(16384, var8 + 1, var9, (byte) 121);
                }
                if (arg0 == 1) {
                    this.method2528(5120, var8, var9, (byte) 113);
                    this.method2528(16384, var8 + 1, var9, (byte) 117);
                    this.method2528(65536, var8, var9 + 1, (byte) 112);
                }
                if (arg0 == 2) {
                    this.method2528(20480, var8, var9, (byte) 107);
                    this.method2528(65536, var8, var9 + 1, (byte) 116);
                    this.method2528(1024, var8 - 1, var9, (byte) 115);
                }
                if (arg0 == 3) {
                    this.method2528(81920, var8, var9, (byte) 119);
                    this.method2528(1024, var8 - 1, var9, (byte) 124);
                    this.method2528(4096, var8, var9 - 1, (byte) 124);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method2528(536870912, var8, var9, (byte) 122);
                this.method2528(33554432, var8, var9 - 1, (byte) 112);
            }
            if (arg0 == 1) {
                this.method2528(8388608, var8, var9, (byte) 116);
                this.method2528(134217728, var8 + 1, var9, (byte) 119);
            }
            if (arg0 == 2) {
                this.method2528(33554432, var8, var9, (byte) 113);
                this.method2528(536870912, var8, var9 + 1, (byte) 112);
            }
            if (arg0 == 3) {
                this.method2528(134217728, var8, var9, (byte) 109);
                this.method2528(8388608, var8 - 1, var9, (byte) 113);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method2528(4194304, var8, var9, (byte) 109);
                this.method2528(67108864, var8 + 1, var9 - 1, (byte) 118);
            }
            if (arg0 == 1) {
                this.method2528(16777216, var8, var9, (byte) 112);
                this.method2528(268435456, var8 + 1, var9 - -1, (byte) 110);
            }
            if (arg0 == 2) {
                this.method2528(67108864, var8, var9, (byte) 121);
                this.method2528(4194304, var8 - 1, var9 + 1, (byte) 124);
            }
            if (arg0 == 3) {
                this.method2528(268435456, var8, var9, (byte) 123);
                this.method2528(16777216, var8 - 1, var9 + -1, (byte) 113);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2528(545259520, var8, var9, (byte) 112);
            this.method2528(33554432, var8, var9 - 1, (byte) 113);
            this.method2528(134217728, var8 + 1, var9, (byte) 112);
        }
        if (arg0 == 1) {
            this.method2528(41943040, var8, var9, (byte) 118);
            this.method2528(134217728, var8 + 1, var9, (byte) 121);
            this.method2528(536870912, var8, var9 + 1, (byte) 115);
        }
        if (arg0 == 2) {
            this.method2528(167772160, var8, var9, (byte) 114);
            this.method2528(536870912, var8, var9 + 1, (byte) 118);
            this.method2528(8388608, var8 - 1, var9, (byte) 127);
        }
        if (arg0 == 3) {
            this.method2528(671088640, var8, var9, (byte) 116);
            this.method2528(8388608, var8 - 1, var9, (byte) 121);
            this.method2528(33554432, var8, var9 - 1, (byte) 120);
            return;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V", line = 1157)
    private final void method2533(int arg0, int arg1, int arg2, int arg3) {
        this.field6118[arg0][arg1] = class292.method1841(this.field6118[arg0][arg1], arg2);
        int var5 = -27 / ((-arg3 - 4) / 44);
        field6108++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 1168)
    public final void method2534(int arg0) {
        for (int var2 = 0; var2 < this.field6103; var2++) {
            for (int var3 = 0; var3 < this.field6119; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field6103 - 5 || var3 >= (this.field6119 - 5)) {
                    this.field6118[var2][var3] = -1;
                } else {
                    this.field6118[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 == -2) {
            field6122++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)V", line = 1202)
    public final void method2535(int arg0, int arg1, int arg2) {
        field6112++;
        int var4 = arg2 - this.field6121;
        int var5 = arg1 - this.field6116;
        if (arg0 >= -9) {
            field6117 = -56;
        }
        this.field6118[var5][var4] = class444.method2618(this.field6118[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 1217)
    public static final void method2536(int arg0) {
        if (arg0 > -2) {
            return;
        }
        if (class140.field1690 <= 0) {
            class249.field3503 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class36.field447.length; var2++) {
                if (class36.field447[var2].startsWith("--> ")) {
                    int var10000 = ~class140.field1690;
                    var1++;
                    if (var10000 == ~var1) {
                        class249.field3503 = class36.field447[var2].substring(4);
                        break;
                    }
                }
            }
        }
        field6120++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIZZI)V", line = 1250)
    public final void method2537(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = arg3 - this.field6116;
        int var9 = arg1 - this.field6121;
        field6124++;
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method2533(var8, var9, 128, -120);
                this.method2533(var8 - 1, var9, 8, arg2 ^ 0x34);
            }
            if (arg0 == 1) {
                this.method2533(var8, var9, 2, -74);
                this.method2533(var8, var9 + 1, 32, 114);
            }
            if (arg0 == 2) {
                this.method2533(var8, var9, 8, 85);
                this.method2533(var8 + 1, var9, 128, -50);
            }
            if (arg0 == 3) {
                this.method2533(var8, var9, 32, 64);
                this.method2533(var8, var9 - 1, 2, -97);
            }
        }
        if (arg2 == arg6 || arg6 == 3) {
            if (arg0 == 0) {
                this.method2533(var8, var9, 1, arg2 ^ 0xFFFFFFB0);
                this.method2533(var8 - 1, var9 + 1, 16, 42);
            }
            if (arg0 == 1) {
                this.method2533(var8, var9, 4, 85);
                this.method2533(var8 + 1, var9 + 1, 64, -74);
            }
            if (arg0 == 2) {
                this.method2533(var8, var9, 16, -70);
                this.method2533(var8 + 1, var9 - 1, 1, -88);
            }
            if (arg0 == 3) {
                this.method2533(var8, var9, 64, 113);
                this.method2533(var8 - 1, var9 - 1, 4, -123);
            }
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                this.method2533(var8, var9, 130, 68);
                this.method2533(var8 - 1, var9, 8, -62);
                this.method2533(var8, var9 + 1, 32, 94);
            }
            if (arg0 == 1) {
                this.method2533(var8, var9, 10, 45);
                this.method2533(var8, var9 + 1, 32, arg2 - 63);
                this.method2533(var8 + 1, var9, 128, arg2 - 69);
            }
            if (arg0 == 2) {
                this.method2533(var8, var9, 40, -119);
                this.method2533(var8 + 1, var9, 128, 43);
                this.method2533(var8, var9 - 1, 2, 64);
            }
            if (arg0 == 3) {
                this.method2533(var8, var9, 160, 116);
                this.method2533(var8, var9 - 1, 2, 94);
                this.method2533(var8 - 1, var9, 8, 46);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method2533(var8, var9, 65536, -62);
                    this.method2533(var8 - 1, var9, 4096, 99);
                }
                if (arg0 == 1) {
                    this.method2533(var8, var9, 1024, 85);
                    this.method2533(var8, var9 + 1, 16384, -92);
                }
                if (arg0 == 2) {
                    this.method2533(var8, var9, 4096, arg2 ^ 0xFFFFFF92);
                    this.method2533(var8 + 1, var9, 65536, 120);
                }
                if (arg0 == 3) {
                    this.method2533(var8, var9, 16384, -50);
                    this.method2533(var8, var9 - 1, 1024, arg2 ^ 0xFFFFFFA0);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method2533(var8, var9, 512, arg2 ^ 0x79);
                    this.method2533(var8 - 1, var9 + 1, 8192, 95);
                }
                if (arg0 == 1) {
                    this.method2533(var8, var9, 2048, -70);
                    this.method2533(var8 + 1, var9 + 1, 32768, 72);
                }
                if (arg0 == 2) {
                    this.method2533(var8, var9, 8192, -68);
                    this.method2533(var8 + 1, var9 + -1, 512, 110);
                }
                if (arg0 == 3) {
                    this.method2533(var8, var9, 32768, 109);
                    this.method2533(var8 - 1, var9 - 1, 2048, arg2 ^ 0xFFFFFFCC);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method2533(var8, var9, 66560, arg2 ^ 0x54);
                    this.method2533(var8 - 1, var9, 4096, 123);
                    this.method2533(var8, var9 + 1, 16384, 60);
                }
                if (arg0 == 1) {
                    this.method2533(var8, var9, 5120, 95);
                    this.method2533(var8, var9 + 1, 16384, -107);
                    this.method2533(var8 + 1, var9, 65536, arg2 + 81);
                }
                if (arg0 == 2) {
                    this.method2533(var8, var9, 20480, 125);
                    this.method2533(var8 + 1, var9, 65536, arg2 + 98);
                    this.method2533(var8, var9 - 1, 1024, -125);
                }
                if (arg0 == 3) {
                    this.method2533(var8, var9, 81920, -64);
                    this.method2533(var8, var9 - 1, 1024, 52);
                    this.method2533(var8 - 1, var9, 4096, 127);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method2533(var8, var9, 536870912, arg2 ^ 0xFFFFFFA3);
                this.method2533(var8 - 1, var9, 33554432, 115);
            }
            if (arg0 == 1) {
                this.method2533(var8, var9, 8388608, arg2 ^ 0x70);
                this.method2533(var8, var9 + 1, 134217728, 88);
            }
            if (arg0 == 2) {
                this.method2533(var8, var9, 33554432, -104);
                this.method2533(var8 + 1, var9, 536870912, arg2 + 114);
            }
            if (arg0 == 3) {
                this.method2533(var8, var9, 134217728, -100);
                this.method2533(var8, var9 - 1, 8388608, 40);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method2533(var8, var9, 4194304, 45);
                this.method2533(var8 - 1, var9 - -1, 67108864, 114);
            }
            if (arg0 == 1) {
                this.method2533(var8, var9, 16777216, 42);
                this.method2533(var8 + 1, var9 + 1, 268435456, 108);
            }
            if (arg0 == 2) {
                this.method2533(var8, var9, 67108864, -121);
                this.method2533(var8 + 1, var9 - 1, 4194304, arg2 + 68);
            }
            if (arg0 == 3) {
                this.method2533(var8, var9, 268435456, -120);
                this.method2533(var8 - 1, var9 + -1, 16777216, 63);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2533(var8, var9, 545259520, 42);
            this.method2533(var8 - 1, var9, 33554432, -101);
            this.method2533(var8, var9 + 1, 134217728, 65);
        }
        if (arg0 == 1) {
            this.method2533(var8, var9, 41943040, 88);
            this.method2533(var8, var9 + 1, 134217728, -109);
            this.method2533(var8 + 1, var9, 536870912, -104);
        }
        if (arg0 == 2) {
            this.method2533(var8, var9, 167772160, 58);
            this.method2533(var8 + 1, var9, 536870912, -83);
            this.method2533(var8, var9 - 1, 8388608, 81);
        }
        if (arg0 == 3) {
            this.method2533(var8, var9, 671088640, 59);
            this.method2533(var8, var9 - 1, 8388608, 83);
            this.method2533(var8 - 1, var9, 33554432, 69);
            return;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)V", line = 1565)
    public final void method2538(int arg0, byte arg1, int arg2) {
        if (arg1 != -108) {
            this.field6118 = null;
        }
        int var4 = arg2 - this.field6116;
        field6130++;
        int var5 = arg0 - this.field6121;
        this.field6118[var4][var5] = class444.method2618(this.field6118[var4][var5], -262145);
    }
}
