import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class213 {

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    private int field3220;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    private int field3226;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "[[I")
    public int[][] field3204;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    private int field3224;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "[J")
    public static long[] field3208 = new long[32];

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Lul;")
    public static class191 field3213;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "[I")
    public static int[] field3218;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
    public final void method1325(int arg0, int arg1, int arg2) {
        field3206++;
        int var4 = arg0 - this.field3224;
        int var5 = arg1 - this.field3226;
        this.field3204[var5][var4] = class161.method1003(this.field3204[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public final void method1326(byte arg0) {
        field3216++;
        if (arg0 >= -85) {
            this.method1338(19, 63, true, -17, 79, true, 51);
        }
        for (int var2 = 0; var2 < this.field3220; var2++) {
            for (int var3 = 0; var3 < this.field3209; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3220 - 5 || (this.field3209 - 5) <= var3) {
                    this.field3204[var2][var3] = 16777215;
                } else {
                    this.field3204[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)V")
    private final void method1327(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -79) {
            this.method1339(48, -128, 32);
        }
        this.field3204[arg3][arg2] = class161.method1003(this.field3204[arg3][arg2], arg1);
        field3222++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3215++;
        if (arg4 == 1) {
            if (arg3 == arg7 && arg1 == arg5) {
                return true;
            }
        } else if (arg7 <= arg3 && arg3 <= arg4 + arg7 - 1 && arg1 >= arg1 && arg1 <= (arg1 + arg4 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field3224;
        int var10 = arg5 - this.field3224;
        if (arg0 < 43) {
            return true;
        }
        int var11 = arg3 - this.field3226;
        int var12 = arg7 - this.field3226;
        if (arg4 == 1) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field3204[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field3204[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field3204[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field3204[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3204[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3204[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field3204[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field3204[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field3204[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field3204[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field3204[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg4 - 1;
            int var14 = arg4 + var10 - 1;
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if (var11 - arg4 == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 + 1) == var10 && (this.field3204[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 - arg4) == var10 && (this.field3204[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 <= var11 && var13 >= var11 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - arg4) == var12 && var9 >= var10 && var14 >= var9 && (this.field3204[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var14 >= var9 && (this.field3204[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 + 1) == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 + 1 == var10 && (this.field3204[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 - arg4 == var10 && (this.field3204[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 >= var12 && var11 <= var13 && var9 - arg4 == var10) {
                        return true;
                    }
                    if (var11 - arg4 == var12 && var10 <= var9 && var9 <= var14 && (this.field3204[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9 && (this.field3204[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if ((var11 - arg4) == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14 && (this.field3204[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg4) == var10 && (this.field3204[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - arg4) == var12 && var9 >= var10 && var9 <= var14 && (this.field3204[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg4) == var10 && (this.field3204[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - arg4 == var12 && var9 >= var10 && var14 >= var9 && (this.field3204[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 + 1 == var10 && (this.field3204[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 - arg4 == var10) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 - arg4 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 + 1 == var10 && (this.field3204[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14 && (this.field3204[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg4) == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field3204[var11][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 <= var11 && var13 >= var11 && var9 - arg4 == var10 && (this.field3204[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg4 == var12 && var9 >= var10 && var9 <= var14 && (this.field3204[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 >= var10 && var14 >= var9 && (this.field3204[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method1329(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field3219++;
        if (arg7 == 1) {
            if (arg4 == arg5 && arg1 == arg2) {
                return true;
            }
        } else if (arg5 <= arg4 && arg4 <= arg5 + arg7 - 1 && arg1 >= arg1 && arg1 <= arg1 + arg7 - 1) {
            return true;
        }
        int var9 = arg2 - this.field3224;
        int var10 = arg5 - this.field3226;
        int var11 = arg4 - this.field3226;
        int var12 = arg1 - this.field3224;
        if (arg7 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field3204[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field3204[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field3204[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field3204[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field3204[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field3204[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field3204[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field3204[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field3204[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field3204[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field3204[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field3204[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var10 - 1;
            int var14 = var9 - (1 - arg7);
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var10 && var9 <= var12 && var12 <= var14 && (this.field3204[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 - arg7) == var9 && (this.field3204[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg7 == var10 && var12 >= var9 && var14 >= var12 && (this.field3204[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg7) == var9 && (this.field3204[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - arg7) == var10 && var12 >= var9 && var12 <= var14 && (this.field3204[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 + 1) == var9 && (this.field3204[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 + 1) == var10 && var9 <= var12 && var14 >= var12 && (this.field3204[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 + 1 == var9 && (this.field3204[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9 && (this.field3204[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var10 && var11 <= var13 && (var12 - arg7) == var9 && (this.field3204[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg7) == var10 && var12 >= var9 && var12 <= var14 && (this.field3204[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var12 >= var9 && var14 >= var12 && (this.field3204[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        int var15 = 43 / ((arg3 + 66) / 32);
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lim;BI)Ljava/lang/String;")
    public static final String method1330(class178 arg0, byte arg1, int arg2) {
        if (arg1 != -50) {
            method1330((class178) null, (byte) 115, 27);
        }
        field3223++;
        if (!client.method2028(arg0).method1992((byte) 125, arg2) && arg0.field2641 == null) {
            return null;
        } else if (arg0.field2580 == null || arg2 >= arg0.field2580.length || arg0.field2580[arg2] == null || arg0.field2580[arg2].trim().length() == 0) {
            return class16.field288 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field2580[arg2];
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method1331(byte arg0) {
        String var1 = "www";
        if (arg0 != -58) {
            field3208 = null;
        }
        if (class241.field3789 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class258.field4165 != null) {
            var2 = "/p=" + class258.field4165;
        }
        field3225++;
        return "http://" + var1 + ".runescape.com/l=" + class129.field1799 + "/a=" + class148.field2026 + var2 + "/";
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZZLnh;Lnh;)V")
    public static final void method1332(boolean arg0, boolean arg1, class305 arg2, class305 arg3) {
        class186.field2830 = arg3;
        if (arg1) {
            field3201++;
            class116.field1668 = arg0;
            class179.field2715 = arg2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIBZIIII)V")
    public final void method1333(boolean arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 == 1 || arg7 == 3) {
            int var9 = arg4;
            arg4 = arg5;
            arg5 = var9;
        }
        if (arg2 > -82) {
            this.field3204 = null;
        }
        int var10 = 256;
        int var11 = arg1 - this.field3224;
        field3210++;
        if (arg3) {
            var10 |= 0x20000;
        }
        int var12 = arg6 - this.field3226;
        if (arg0) {
            var10 |= 0x40000000;
        }
        for (int var13 = var12; var13 < (arg4 + var12); var13++) {
            if (var13 >= 0 && this.field3220 > var13) {
                for (int var14 = var11; var14 < (arg5 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field3209) {
                        this.method1340(var13, -1, var10, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBIIIIIIII)Z")
    private final boolean method1334(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3202++;
        int var11 = arg5 + arg6;
        int var12 = arg3 + arg8;
        if (arg1 != 108) {
            this.field3204 = null;
        }
        int var13 = arg2 + arg4;
        int var14 = arg7 + arg9;
        if (arg3 == var13 && (arg0 & 0x2) == 0) {
            int var15 = arg6 > arg9 ? arg6 : arg9;
            int var16 = var11 < var14 ? var11 : var14;
            while (var16 > var15) {
                if ((this.field3204[var13 - this.field3226 - 1][var15 - this.field3224] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg2 == var12 && (arg0 & 0x8) == 0) {
            int var17 = arg9 >= arg6 ? arg9 : arg6;
            int var18 = var11 >= var14 ? var14 : var11;
            while (var18 > var17) {
                if ((this.field3204[arg2 - this.field3226][var17 - this.field3224] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg0 & 0x1) == 0) {
            int var19 = arg3 > arg2 ? arg3 : arg2;
            int var20 = var12 >= var13 ? var13 : var12;
            while (var19 < var20) {
                if ((this.field3204[var19 - this.field3226][var14 - this.field3224 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg9 == var11 && (arg0 & 0x4) == 0) {
            int var21 = arg2 < arg3 ? arg3 : arg2;
            int var22 = var12 >= var13 ? var13 : var12;
            while (var22 > var21) {
                if ((this.field3204[var21 - this.field3226][arg9 - this.field3224] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)V")
    public final void method1335(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3224;
        field3200++;
        int var5 = arg0 - this.field3226;
        this.field3204[var5][var4] = class32.method199(this.field3204[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)V")
    public static void method1336(byte arg0) {
        if (arg0 > -3) {
            field3218 = null;
        }
        field3218 = null;
        field3213 = null;
        field3208 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIIIIIIII)Z")
    public final boolean method1337(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3211++;
        if (arg5 > 1) {
            return class218.method1426(arg7, arg2, arg5, arg4, arg8, false, arg5, arg3, arg1) ? true : this.method1334(arg6, (byte) 108, arg4, arg2, arg1, arg5, arg3, arg7, arg5, arg8);
        }
        int var10 = arg1 + arg4 - 1;
        if (arg0 != -110) {
            this.field3220 = -101;
        }
        int var11 = arg7 + arg8 - 1;
        if (arg2 >= arg4 && var10 >= arg2 && arg3 >= arg8 && var11 >= arg3) {
            return true;
        } else if ((arg4 - 1) == arg2 && arg8 <= arg3 && var11 >= arg3 && (this.field3204[arg2 - this.field3226][arg3 - this.field3224] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg2 && arg3 >= arg8 && var11 >= arg3 && (this.field3204[arg2 - this.field3226][arg3 - this.field3224] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg3 && arg2 >= arg4 && arg2 <= var10 && (this.field3204[arg2 - this.field3226][arg3 - this.field3224] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg3 && arg4 <= arg2 && var10 >= arg2 && (this.field3204[arg2 - this.field3226][arg3 - this.field3224] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZIIZI)V")
    public final void method1338(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg1 - this.field3226;
        int var9 = 256;
        field3203++;
        int var10 = arg6 - this.field3224;
        if (arg5) {
            var9 |= 0x20000;
        }
        if (arg2) {
            var9 |= 0x40000000;
        }
        for (int var11 = var8; var11 < var8 + arg0; var11++) {
            if (var11 >= 0 && var11 < this.field3220) {
                for (int var12 = var10; var12 < (var10 + arg3); var12++) {
                    if (var12 >= 0 && var12 < this.field3209) {
                        this.method1327(arg4 - 115, var9, var12, var11);
                    }
                }
            }
        }
        if (arg4 != -1) {
            this.field3226 = -9;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(III)V")
    public final void method1339(int arg0, int arg1, int arg2) {
        if (arg1 == -8928) {
            field3212++;
            int var4 = arg2 - this.field3224;
            int var5 = arg0 - this.field3226;
            this.field3204[var5][var4] = class161.method1003(this.field3204[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIII)V")
    private final void method1340(int arg0, int arg1, int arg2, int arg3) {
        this.field3204[arg0][arg3] = class32.method199(this.field3204[arg0][arg3], ~arg2);
        field3221++;
        if (arg1 != -1) {
            this.field3224 = 75;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIZIIZ)V")
    public final void method1341(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg1 - this.field3224;
        field3214++;
        if (arg0 != 17607) {
            return;
        }
        int var9 = arg5 - this.field3226;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1340(var9, -1, 128, var8);
                this.method1340(var9 - 1, -1, 8, var8);
            }
            if (arg4 == 1) {
                this.method1340(var9, -1, 2, var8);
                this.method1340(var9, -1, 32, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1340(var9, arg0 - 17608, 8, var8);
                this.method1340(var9 + 1, arg0 + -17608, 128, var8);
            }
            if (arg4 == 3) {
                this.method1340(var9, arg0 - 17608, 32, var8);
                this.method1340(var9, -1, 2, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1340(var9, arg0 - 17608, 1, var8);
                this.method1340(var9 - 1, arg0 ^ 0xFFFFBB38, 16, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1340(var9, -1, 4, var8);
                this.method1340(var9 + 1, -1, 64, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1340(var9, -1, 16, var8);
                this.method1340(var9 + 1, -1, 1, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1340(var9, -1, 64, var8);
                this.method1340(var9 - 1, -1, 4, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method1340(var9, -1, 130, var8);
                this.method1340(var9 - 1, -1, 8, var8);
                this.method1340(var9, -1, 32, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1340(var9, arg0 - 17608, 10, var8);
                this.method1340(var9, arg0 ^ 0xFFFFBB38, 32, var8 + 1);
                this.method1340(var9 + 1, arg0 ^ 0xFFFFBB38, 128, var8);
            }
            if (arg4 == 2) {
                this.method1340(var9, -1, 40, var8);
                this.method1340(var9 + 1, -1, 128, var8);
                this.method1340(var9, arg0 ^ 0xFFFFBB38, 2, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1340(var9, -1, 160, var8);
                this.method1340(var9, -1, 2, var8 - 1);
                this.method1340(var9 - 1, arg0 ^ 0xFFFFBB38, 8, var8);
            }
        }
        if (arg6) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    this.method1340(var9, -1, 65536, var8);
                    this.method1340(var9 - 1, -1, 4096, var8);
                }
                if (arg4 == 1) {
                    this.method1340(var9, -1, 1024, var8);
                    this.method1340(var9, -1, 16384, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1340(var9, -1, 4096, var8);
                    this.method1340(var9 + 1, -1, 65536, var8);
                }
                if (arg4 == 3) {
                    this.method1340(var9, -1, 16384, var8);
                    this.method1340(var9, -1, 1024, var8 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg4 == 0) {
                    this.method1340(var9, -1, 512, var8);
                    this.method1340(var9 - 1, -1, 8192, var8 + 1);
                }
                if (arg4 == 1) {
                    this.method1340(var9, -1, 2048, var8);
                    this.method1340(var9 + 1, -1, 32768, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1340(var9, -1, 8192, var8);
                    this.method1340(var9 + 1, -1, 512, var8 - 1);
                }
                if (arg4 == 3) {
                    this.method1340(var9, -1, 32768, var8);
                    this.method1340(var9 - 1, -1, 2048, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    this.method1340(var9, -1, 66560, var8);
                    this.method1340(var9 - 1, -1, 4096, var8);
                    this.method1340(var9, -1, 16384, var8 + 1);
                }
                if (arg4 == 1) {
                    this.method1340(var9, -1, 5120, var8);
                    this.method1340(var9, arg0 - 17608, 16384, var8 + 1);
                    this.method1340(var9 + 1, arg0 ^ 0xFFFFBB38, 65536, var8);
                }
                if (arg4 == 2) {
                    this.method1340(var9, -1, 20480, var8);
                    this.method1340(var9 + 1, -1, 65536, var8);
                    this.method1340(var9, -1, 1024, var8 - 1);
                }
                if (arg4 == 3) {
                    this.method1340(var9, arg0 ^ 0xFFFFBB38, 81920, var8);
                    this.method1340(var9, -1, 1024, var8 - 1);
                    this.method1340(var9 - 1, -1, 4096, var8);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1340(var9, -1, 536870912, var8);
                this.method1340(var9 - 1, -1, 33554432, var8);
            }
            if (arg4 == 1) {
                this.method1340(var9, -1, 8388608, var8);
                this.method1340(var9, arg0 ^ 0xFFFFBB38, 134217728, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1340(var9, -1, 33554432, var8);
                this.method1340(var9 + 1, -1, 536870912, var8);
            }
            if (arg4 == 3) {
                this.method1340(var9, -1, 134217728, var8);
                this.method1340(var9, -1, 8388608, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1340(var9, -1, 4194304, var8);
                this.method1340(var9 - 1, -1, 67108864, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1340(var9, -1, 16777216, var8);
                this.method1340(var9 + 1, -1, 268435456, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1340(var9, -1, 67108864, var8);
                this.method1340(var9 + 1, -1, 4194304, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1340(var9, -1, 268435456, var8);
                this.method1340(var9 - 1, -1, 16777216, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1340(var9, -1, 545259520, var8);
            this.method1340(var9 - 1, -1, 33554432, var8);
            this.method1340(var9, -1, 134217728, var8 + 1);
        }
        if (arg4 == 1) {
            this.method1340(var9, -1, 41943040, var8);
            this.method1340(var9, arg0 - 17608, 134217728, var8 + 1);
            this.method1340(var9 + 1, -1, 536870912, var8);
        }
        if (arg4 == 2) {
            this.method1340(var9, -1, 167772160, var8);
            this.method1340(var9 + 1, arg0 + -17608, 536870912, var8);
            this.method1340(var9, -1, 8388608, var8 - 1);
        }
        if (arg4 == 3) {
            this.method1340(var9, -1, 671088640, var8);
            this.method1340(var9, arg0 - 17608, 8388608, var8 - 1);
            this.method1340(var9 - 1, -1, 33554432, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZIZIZI)V")
    public final void method1342(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field3205++;
        int var8 = arg6 - this.field3226;
        int var9 = arg2 - this.field3224;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1327(-109, 128, var9, var8);
                this.method1327(-100, 8, var9, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1327(-84, 2, var9, var8);
                this.method1327(-89, 32, var9 + 1, var8);
            }
            if (arg0 == 2) {
                this.method1327(-108, 8, var9, var8);
                this.method1327(-86, 128, var9, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1327(-110, 32, var9, var8);
                this.method1327(-119, 2, var9 - 1, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1327(-118, 1, var9, var8);
                this.method1327(-121, 16, var9 + 1, var8 + -1);
            }
            if (arg0 == 1) {
                this.method1327(-126, 4, var9, var8);
                this.method1327(-101, 64, var9 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1327(-89, 16, var9, var8);
                this.method1327(-112, 1, var9 - 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1327(-115, 64, var9, var8);
                this.method1327(-84, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1327(-85, 130, var9, var8);
                this.method1327(-117, 8, var9, var8 - 1);
                this.method1327(-83, 32, var9 + 1, var8);
            }
            if (arg0 == 1) {
                this.method1327(-97, 10, var9, var8);
                this.method1327(-111, 32, var9 + 1, var8);
                this.method1327(-91, 128, var9, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1327(-114, 40, var9, var8);
                this.method1327(-81, 128, var9, var8 + 1);
                this.method1327(-91, 2, var9 - 1, var8);
            }
            if (arg0 == 3) {
                this.method1327(-111, 160, var9, var8);
                this.method1327(-90, 2, var9 - 1, var8);
                this.method1327(-109, 8, var9, var8 - 1);
            }
        }
        if (arg1) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method1327(-83, 65536, var9, var8);
                    this.method1327(-115, 4096, var9, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1327(-117, 1024, var9, var8);
                    this.method1327(-88, 16384, var9 + 1, var8);
                }
                if (arg0 == 2) {
                    this.method1327(-106, 4096, var9, var8);
                    this.method1327(-109, 65536, var9, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1327(-97, 16384, var9, var8);
                    this.method1327(-93, 1024, var9 - 1, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method1327(-103, 512, var9, var8);
                    this.method1327(-120, 8192, var9 + 1, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1327(-84, 2048, var9, var8);
                    this.method1327(-87, 32768, var9 + 1, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1327(-117, 8192, var9, var8);
                    this.method1327(-104, 512, var9 - 1, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1327(-109, 32768, var9, var8);
                    this.method1327(-117, 2048, var9 - 1, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method1327(-120, 66560, var9, var8);
                    this.method1327(-113, 4096, var9, var8 - 1);
                    this.method1327(-92, 16384, var9 + 1, var8);
                }
                if (arg0 == 1) {
                    this.method1327(-122, 5120, var9, var8);
                    this.method1327(-93, 16384, var9 + 1, var8);
                    this.method1327(-82, 65536, var9, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1327(-121, 20480, var9, var8);
                    this.method1327(-106, 65536, var9, var8 + 1);
                    this.method1327(-115, 1024, var9 - 1, var8);
                }
                if (arg0 == 3) {
                    this.method1327(-100, 81920, var9, var8);
                    this.method1327(-107, 1024, var9 - 1, var8);
                    this.method1327(-84, 4096, var9, var8 - 1);
                }
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method1327(-99, 536870912, var9, var8);
                    this.method1327(-95, 33554432, var9, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1327(-111, 8388608, var9, var8);
                    this.method1327(-112, 134217728, var9 + 1, var8);
                }
                if (arg0 == 2) {
                    this.method1327(-106, 33554432, var9, var8);
                    this.method1327(-127, 536870912, var9, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1327(-88, 134217728, var9, var8);
                    this.method1327(-116, 8388608, var9 - 1, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method1327(-89, 4194304, var9, var8);
                    this.method1327(-96, 67108864, var9 + 1, var8 + -1);
                }
                if (arg0 == 1) {
                    this.method1327(-108, 16777216, var9, var8);
                    this.method1327(-86, 268435456, var9 + 1, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1327(-92, 67108864, var9, var8);
                    this.method1327(-87, 4194304, var9 - 1, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1327(-109, 268435456, var9, var8);
                    this.method1327(-97, 16777216, var9 - 1, var8 + -1);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method1327(-107, 545259520, var9, var8);
                    this.method1327(-98, 33554432, var9, var8 - 1);
                    this.method1327(-99, 134217728, var9 + 1, var8);
                }
                if (arg0 == 1) {
                    this.method1327(-96, 41943040, var9, var8);
                    this.method1327(-111, 134217728, var9 + 1, var8);
                    this.method1327(-113, 536870912, var9, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1327(-108, 167772160, var9, var8);
                    this.method1327(-121, 536870912, var9, var8 + 1);
                    this.method1327(-120, 8388608, var9 - 1, var8);
                }
                if (arg0 == 3) {
                    this.method1327(-98, 671088640, var9, var8);
                    this.method1327(-88, 8388608, var9 - 1, var8);
                    this.method1327(-127, 33554432, var9, var8 - 1);
                }
            }
        }
        if (!arg3) {
            this.method1328(-38, -70, -38, -51, 1, 17, 83, 126);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(II)V")
    public class213(int arg0, int arg1) {
        this.field3220 = arg0;
        this.field3209 = arg1;
        this.field3226 = 0;
        this.field3204 = new int[this.field3220][this.field3209];
        this.field3224 = 0;
        this.method1326((byte) -111);
    }
}
