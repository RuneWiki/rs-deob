import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class570 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lmu;")
    public static class303 field7827 = new class303(22, 0);

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "F")
    public static float field7849;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public int field7831;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public int field7835;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public int field7837;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public int field7847;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[[I")
    public int[][] field7832;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
    private final void method3291(int arg0, int arg1, int arg2, int arg3) {
        this.field7832[arg2][arg3] = class263.method1762(this.field7832[arg2][arg3], ~arg0);
        if (arg1 > -120) {
            this.method3307(-18, true, false, 122, 119, -54, 18, -57);
        }
        field7846++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIII)V")
    private final void method3292(int arg0, int arg1, int arg2, int arg3) {
        this.field7832[arg0][arg2] = class418.method2577(this.field7832[arg0][arg2], arg1);
        if (arg3 != -6496) {
            this.method3292(20, -107, -63, 115);
        }
        field7842++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method3293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7834++;
        int var9 = 64 % ((-arg7 - 11) / 37);
        if (arg2 == 1) {
            if (arg0 == arg4 && arg1 == arg5) {
                return true;
            }
        } else if (arg4 <= arg0 && arg4 + arg2 - 1 >= arg0 && arg5 <= arg5 && (arg2 + arg5 - 1) >= arg5) {
            return true;
        }
        int var10 = arg5 - this.field7835;
        int var11 = arg1 - this.field7835;
        int var12 = arg0 - this.field7847;
        int var13 = arg4 - this.field7847;
        if (arg2 == 1) {
            if (arg6 == 0) {
                if (arg3 == 0) {
                    if ((var12 - 1) == var13 && var10 == var11) {
                        return true;
                    }
                    if (var12 == var13 && var10 + 1 == var11 && (this.field7832[var13][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 == var13 && var10 - 1 == var11 && (this.field7832[var13][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var12 == var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var12 + 1) == var13 && var10 == var11) {
                        return true;
                    }
                    if (var12 == var13 && (var10 + 1) == var11 && (this.field7832[var13][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 - 1) == var11 && (this.field7832[var13][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 == var13 && (var10 - 1) == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    if ((var12 - 1) == var13 && var10 == var11) {
                        return true;
                    }
                    if (var12 == var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 - 1) == var11 && (this.field7832[var13][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - 1) == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 == var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var13 && var10 == var11) {
                        return true;
                    }
                    if (var12 == var13 && var10 - 1 == var11 && (this.field7832[var13][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - 1 == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 == var13 && var10 + 1 == var11 && (this.field7832[var13][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var13 && var10 == var11) {
                        return true;
                    }
                    if (var12 == var13 && var10 - 1 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 - 1) == var13 && var10 == var11) {
                        return true;
                    }
                    if (var12 == var13 && var10 + 1 == var11 && (this.field7832[var13][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var12 == var13 && (var10 + 1) == var11 && (this.field7832[var13][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 == var13 && var10 - 1 == var11 && (this.field7832[var13][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var13 && var10 == var11 && (this.field7832[var13][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg2 + var13 - 1;
            int var15 = arg2 + var11 - 1;
            if (arg6 == 0) {
                if (arg3 == 0) {
                    if (var12 - arg2 == var13 && var10 >= var11 && var15 >= var10) {
                        return true;
                    }
                    if (var12 >= var13 && var14 >= var12 && var10 + 1 == var11 && (this.field7832[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var13 && var12 <= var14 && var10 - arg2 == var11 && (this.field7832[var12][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var13 <= var12 && var12 <= var14 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var12 - arg2 == var13 && var11 <= var10 && var10 <= var15 && (this.field7832[var14][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var13 && var10 >= var11 && var10 <= var15 && (this.field7832[var13][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 + 1 == var13 && var10 >= var11 && var10 <= var15) {
                        return true;
                    }
                    if (var12 >= var13 && var14 >= var12 && (var10 + 1) == var11 && (this.field7832[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var13 <= var12 && var14 >= var12 && (var10 - arg2) == var11 && (this.field7832[var12][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 >= var13 && var12 <= var14 && var10 - arg2 == var11) {
                        return true;
                    }
                    if ((var12 - arg2) == var13 && var10 >= var11 && var10 <= var15 && (this.field7832[var14][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var13 && var10 >= var11 && var15 >= var10 && (this.field7832[var13][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    if ((var12 - arg2) == var13 && var10 >= var11 && var15 >= var10) {
                        return true;
                    }
                    if (var12 >= var13 && var12 <= var14 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var13 && var11 <= var10 && var15 >= var10 && (this.field7832[var13][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var13 <= var12 && var12 <= var14 && var10 - arg2 == var11 && (this.field7832[var12][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - arg2) == var13 && var10 >= var11 && var15 >= var10 && (this.field7832[var14][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var13 && var12 <= var14 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var13 && var10 >= var11 && var15 >= var10) {
                        return true;
                    }
                    if (var13 <= var12 && var12 <= var14 && var10 - arg2 == var11 && (this.field7832[var12][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - arg2 == var13 && var11 <= var10 && var15 >= var10 && (this.field7832[var14][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var13 <= var12 && var14 >= var12 && var10 + 1 == var11 && (this.field7832[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var13 && var10 >= var11 && var15 >= var10) {
                        return true;
                    }
                    if (var12 >= var13 && var12 <= var14 && var10 - arg2 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 - arg2) == var13 && var11 <= var10 && var15 >= var10) {
                        return true;
                    }
                    if (var13 <= var12 && var12 <= var14 && var10 + 1 == var11 && (this.field7832[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var13 && var10 >= var11 && var10 <= var15 && (this.field7832[var13][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var13 && var12 <= var14 && (var10 - arg2) == var11) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var13 <= var12 && var12 <= var14 && var10 + 1 == var11 && (this.field7832[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var13 <= var12 && var14 >= var12 && (var10 - arg2) == var11 && (this.field7832[var12][var15] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg2 == var13 && var11 <= var10 && var10 <= var15 && (this.field7832[var14][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var13 && var11 <= var10 && var15 >= var10 && (this.field7832[var13][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
    public final void method3294(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field7835;
        if (arg2 != 1) {
            this.method3308(113, 9, 32, -49, -123, false, false);
        }
        field7838++;
        int var5 = arg1 - this.field7847;
        this.field7832[var5][var4] = class418.method2577(this.field7832[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method3295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != -28388) {
            this.method3302(-75, -117, 49, -113, 42, -115, 105, -59);
        }
        field7843++;
        int var11 = arg5 + arg3;
        int var12 = arg6 + arg7;
        int var13 = arg1 + arg9;
        int var14 = arg8 + arg4;
        if (arg5 == var13 && (arg2 & 0x2) == 0) {
            int var15 = arg8 < arg7 ? arg7 : arg8;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field7832[var13 - this.field7847 - 1][var15 - this.field7835] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg2 & 0x8) == 0) {
            int var17 = arg8 >= arg7 ? arg8 : arg7;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field7832[arg1 - this.field7847][var17 - this.field7835] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg2 & 0x1) == 0) {
            int var19 = arg5 > arg1 ? arg5 : arg1;
            int var20 = var11 < var13 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field7832[var19 - this.field7847][var14 - this.field7835 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg8 == var12 && (arg2 & 0x4) == 0) {
            int var21 = arg1 < arg5 ? arg5 : arg1;
            int var22 = var11 < var13 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field7832[var21 - this.field7847][arg8 - this.field7835] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILha;IIZI)V")
    public static final void method3296(int arg0, class59 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field7836++;
        arg1.method303(arg2, arg5, arg2 + arg3, arg0 + arg5);
        arg1.method624(arg3, (byte) -125, arg2, arg5, arg0, -16777216);
        if (class362.field5203 < 100) {
            return;
        }
        float var6 = (float) class489.field6789 / (float) class489.field6781;
        int var7 = arg3;
        int var8 = arg0;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg0 - var8) / 2 + arg5;
        int var10 = (arg3 - var7) / 2 + arg2;
        if (class283.field3954 == null || arg3 != class283.field3954.method1626() || arg0 != class283.field3954.method1619()) {
            class489.method2879(class489.field6788, class489.field6789 + class489.field6785, class489.field6788 - -class489.field6781, class489.field6785, var10, var9, var7 + var10, var8 + var9);
            class489.method2876(arg1);
            class283.field3954 = arg1.method231(var10, var9, var7, var8, false);
        }
        class283.field3954.method2925(var10, var9);
        int var11 = class160.field2571 * var7 / class489.field6781;
        int var12 = class117.field1989 * var8 / class489.field6789;
        int var13 = var10 + (class654.field8986 * var7 / class489.field6781);
        if (!arg4) {
            method3296(44, null, -27, -91, true, -26);
        }
        int var14 = var9 - var12 - (class659.field9029 * var8 / class489.field6789 + -var8);
        int var15 = -1996554240;
        if (class582.field7970 == class204.field2938) {
            var15 = -1996488705;
        }
        arg1.method217(var13, var14, var11, var12, var15, 1);
        arg1.method288(var13, var14, var11, var12, var15, 0);
        if (class505.field7035 <= 0) {
            return;
        }
        int var16;
        if (class723.field9806 <= 50) {
            var16 = class723.field9806 * 5;
        } else {
            var16 = 500 - (class723.field9806 * 5);
        }
        for (class710 var17 = (class710) class489.field6776.method1269(4); var17 != null; var17 = (class710) class489.field6776.method1264((byte) 126)) {
            class553 var18 = class489.field6760.method2136(var17.field9629, (byte) 71);
            if (class112.method998(var18, -4)) {
                if (class443.field6305 == var17.field9629) {
                    int var19 = var17.field9634 * var7 / class489.field6781 + var10;
                    int var20 = (class489.field6789 - var17.field9633) * var8 / class489.field6789 + var9;
                    arg1.method624(4, (byte) -125, var19 - 2, var20 + -2, 4, var16 << 24 | 0xFFFF00);
                } else if (class699.field9460 != -1 && class699.field9460 == var18.field7641) {
                    int var21 = var10 + (var17.field9634 * var7 / class489.field6781);
                    int var22 = var9 + ((class489.field6789 - var17.field9633) * var8 / class489.field6789);
                    arg1.method624(4, (byte) -125, var21 - 2, var22 + -2, 4, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BII)V")
    public final void method3297(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field7835;
        int var5 = arg1 - this.field7847;
        field7840++;
        if (arg0 == -52) {
            this.field7832[var5][var4] = class263.method1762(this.field7832[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public final void method3298(int arg0) {
        int var2 = 0;
        if (arg0 != 700) {
            this.method3307(120, true, false, 4, -12, 14, -33, -109);
        }
        while (this.field7831 > var2) {
            for (int var3 = 0; var3 < this.field7837; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field7831 - 5 || (this.field7837 - 5) <= var3) {
                    this.field7832[var2][var3] = -1;
                } else {
                    this.field7832[var2][var3] = 2097152;
                }
            }
            var2++;
        }
        field7845++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(BII)V")
    public final void method3299(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field7847;
        field7841++;
        int var5 = arg1 - this.field7835;
        int var6 = -79 % ((arg0 - 66) / 39);
        this.field7832[var4][var5] = class263.method1762(this.field7832[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(IIII)V")
    public static final void method3300(int arg0, int arg1, int arg2, int arg3) {
        field7833++;
        String var4 = "tele " + arg2 + "," + (arg3 >> 6) + "," + (arg0 >> 6) + "," + (arg3 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        if (arg1 != 2) {
            method3300(-25, -23, 24, 63);
        }
        class549.method3162(var4, true, false, (byte) -79);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBIIIIIII)Z")
    public final boolean method3301(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7830++;
        if (arg3 > 1) {
            return class555.method3192(arg5, arg2, -1, arg3, arg0, arg7, arg8, arg3, arg4) ? true : this.method3295(-28388, arg8, arg6, arg3, arg4, arg0, arg3, arg7, arg2, arg5);
        }
        int var10 = 64 % ((2 - arg1) / 45);
        int var11 = arg5 + arg8 - 1;
        int var12 = arg2 - (1 - arg4);
        if (arg0 >= arg8 && var11 >= arg0 && arg7 >= arg2 && arg7 <= var12) {
            return true;
        } else if ((arg8 - 1) == arg0 && arg2 <= arg7 && arg7 <= var12 && (this.field7832[arg0 - this.field7847][arg7 - this.field7835] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var11 + 1 == arg0 && arg2 <= arg7 && arg7 <= var12 && (this.field7832[arg0 - this.field7847][arg7 - this.field7835] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg7 && arg0 >= arg8 && var11 >= arg0 && (this.field7832[arg0 - this.field7847][arg7 - this.field7835] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var12 + 1 == arg7 && arg0 >= arg8 && arg0 <= var11 && (this.field7832[arg0 - this.field7847][arg7 - this.field7835] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method3302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7848++;
        if (arg5 != 1) {
            this.field7837 = -59;
        }
        if (arg7 == 1) {
            if (arg2 == arg3 && arg0 == arg1) {
                return true;
            }
        } else if (arg3 <= arg2 && arg2 <= (arg7 + arg3 - 1) && arg0 <= arg0 && arg0 <= (arg0 + arg7 - 1)) {
            return true;
        }
        int var9 = arg2 - this.field7847;
        int var10 = arg3 - this.field7847;
        int var11 = arg0 - this.field7835;
        int var12 = arg1 - this.field7835;
        if (arg7 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field7832[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field7832[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field7832[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field7832[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field7832[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field7832[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 + 1 == var10 && var11 == var12 && (this.field7832[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field7832[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 == var10 && (var11 + 1) == var12 && (this.field7832[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field7832[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field7832[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field7832[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var10 - 1;
            int var14 = var12 - (1 - arg7);
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var9 + 1) == var10 && var12 <= var11 && var14 >= var11 && (this.field7832[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var11 - arg7) == var12 && (this.field7832[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var9 - arg7) == var10 && var12 <= var11 && var14 >= var11 && (this.field7832[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var11 - arg7 == var12 && (this.field7832[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 - arg7 == var10 && var11 >= var12 && var14 >= var11 && (this.field7832[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var11 + 1 == var12 && (this.field7832[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var14 && (this.field7832[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var11 + 1) == var12 && (this.field7832[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 <= var9 && var13 >= var9 && var11 + 1 == var12 && (this.field7832[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var10 && var9 <= var13 && var11 - arg7 == var12 && (this.field7832[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg7 == var10 && var11 >= var12 && var11 <= var14 && (this.field7832[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var12 <= var11 && var11 <= var14 && (this.field7832[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIZIZI)V")
    public final void method3303(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (!arg3) {
            this.field7847 = 116;
        }
        field7828++;
        int var8 = 256;
        if (arg5) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field7847;
        int var10 = arg2 - this.field7835;
        if (arg0) {
            var8 |= 0x40000000;
        }
        for (int var11 = var9; var11 < arg1 + var9; var11++) {
            if (var11 >= 0 && this.field7831 > var11) {
                for (int var12 = var10; var12 < (arg6 + var10); var12++) {
                    if (var12 >= 0 && this.field7837 > var12) {
                        this.method3292(var11, var8, var12, -6496);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIIIZI)V")
    public final void method3304(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field7829++;
        int var8 = arg2 - this.field7847;
        if (arg6 != 29216) {
            return;
        }
        int var9 = arg4 - this.field7835;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method3291(128, arg6 ^ 0xFFFF8DA5, var8, var9);
                this.method3291(8, arg6 - 29342, var8 + -1, var9);
            }
            if (arg1 == 1) {
                this.method3291(2, -122, var8, var9);
                this.method3291(32, -124, var8, var9 + 1);
            }
            if (arg1 == 2) {
                this.method3291(8, -127, var8, var9);
                this.method3291(128, -127, var8 + 1, var9);
            }
            if (arg1 == 3) {
                this.method3291(32, -125, var8, var9);
                this.method3291(2, arg6 ^ 0xFFFF8DA0, var8, var9 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method3291(1, -123, var8, var9);
                this.method3291(16, -127, var8 - 1, var9 + 1);
            }
            if (arg1 == 1) {
                this.method3291(4, -123, var8, var9);
                this.method3291(64, -128, var8 + 1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method3291(16, -122, var8, var9);
                this.method3291(1, -125, var8 + 1, var9 + -1);
            }
            if (arg1 == 3) {
                this.method3291(64, -127, var8, var9);
                this.method3291(4, arg6 ^ 0xFFFF8DA0, var8 - 1, var9 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method3291(130, -122, var8, var9);
                this.method3291(8, -123, var8 - 1, var9);
                this.method3291(32, -124, var8, var9 + 1);
            }
            if (arg1 == 1) {
                this.method3291(10, -123, var8, var9);
                this.method3291(32, -122, var8, var9 + 1);
                this.method3291(128, -127, var8 + 1, var9);
            }
            if (arg1 == 2) {
                this.method3291(40, -122, var8, var9);
                this.method3291(128, -123, var8 + 1, var9);
                this.method3291(2, -127, var8, var9 - 1);
            }
            if (arg1 == 3) {
                this.method3291(160, -127, var8, var9);
                this.method3291(2, -128, var8, var9 - 1);
                this.method3291(8, arg6 - 29343, var8 + -1, var9);
            }
        }
        if (arg0) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method3291(65536, arg6 ^ 0xFFFF8DA7, var8, var9);
                    this.method3291(4096, -127, var8 - 1, var9);
                }
                if (arg1 == 1) {
                    this.method3291(1024, arg6 ^ 0xFFFF8DA0, var8, var9);
                    this.method3291(16384, -122, var8, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method3291(4096, -124, var8, var9);
                    this.method3291(65536, -121, var8 + 1, var9);
                }
                if (arg1 == 3) {
                    this.method3291(16384, -128, var8, var9);
                    this.method3291(1024, -125, var8, var9 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method3291(512, -125, var8, var9);
                    this.method3291(8192, -128, var8 - 1, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method3291(2048, arg6 ^ 0xFFFF8DA7, var8, var9);
                    this.method3291(32768, -128, var8 + 1, var9 - -1);
                }
                if (arg1 == 2) {
                    this.method3291(8192, -125, var8, var9);
                    this.method3291(512, -123, var8 + 1, var9 - 1);
                }
                if (arg1 == 3) {
                    this.method3291(32768, arg6 ^ 0xFFFF8DA7, var8, var9);
                    this.method3291(2048, -123, var8 - 1, var9 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method3291(66560, arg6 - 29342, var8, var9);
                    this.method3291(4096, -121, var8 - 1, var9);
                    this.method3291(16384, -127, var8, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method3291(5120, -127, var8, var9);
                    this.method3291(16384, -125, var8, var9 + 1);
                    this.method3291(65536, -123, var8 + 1, var9);
                }
                if (arg1 == 2) {
                    this.method3291(20480, arg6 - 29339, var8, var9);
                    this.method3291(65536, -124, var8 + 1, var9);
                    this.method3291(1024, -125, var8, var9 - 1);
                }
                if (arg1 == 3) {
                    this.method3291(81920, -123, var8, var9);
                    this.method3291(1024, arg6 - 29339, var8, var9 - 1);
                    this.method3291(4096, arg6 - 29340, var8 + -1, var9);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method3291(536870912, -125, var8, var9);
                this.method3291(33554432, -128, var8 - 1, var9);
            }
            if (arg1 == 1) {
                this.method3291(8388608, arg6 - 29338, var8, var9);
                this.method3291(134217728, arg6 - 29339, var8, var9 + 1);
            }
            if (arg1 == 2) {
                this.method3291(33554432, -123, var8, var9);
                this.method3291(536870912, -122, var8 + 1, var9);
            }
            if (arg1 == 3) {
                this.method3291(134217728, -128, var8, var9);
                this.method3291(8388608, -127, var8, var9 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method3291(4194304, -121, var8, var9);
                this.method3291(67108864, -121, var8 - 1, var9 + 1);
            }
            if (arg1 == 1) {
                this.method3291(16777216, -126, var8, var9);
                this.method3291(268435456, -124, var8 + 1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method3291(67108864, -122, var8, var9);
                this.method3291(4194304, -126, var8 + 1, var9 + -1);
            }
            if (arg1 == 3) {
                this.method3291(268435456, -122, var8, var9);
                this.method3291(16777216, -126, var8 - 1, var9 + -1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method3291(545259520, -124, var8, var9);
            this.method3291(33554432, -123, var8 - 1, var9);
            this.method3291(134217728, -123, var8, var9 + 1);
        }
        if (arg1 == 1) {
            this.method3291(41943040, -123, var8, var9);
            this.method3291(134217728, arg6 ^ 0xFFFF8DA0, var8, var9 + 1);
            this.method3291(536870912, -121, var8 + 1, var9);
        }
        if (arg1 == 2) {
            this.method3291(167772160, -127, var8, var9);
            this.method3291(536870912, -124, var8 + 1, var9);
            this.method3291(8388608, -128, var8, var9 - 1);
        }
        if (arg1 == 3) {
            this.method3291(671088640, -126, var8, var9);
            this.method3291(8388608, -121, var8, var9 - 1);
            this.method3291(33554432, -126, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)V")
    public final void method3305(int arg0, int arg1, byte arg2) {
        if (arg2 > -32) {
            this.field7831 = 85;
        }
        int var4 = arg0 - this.field7835;
        field7825++;
        int var5 = arg1 - this.field7847;
        this.field7832[var5][var4] = class418.method2577(this.field7832[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static void method3306(int arg0) {
        field7827 = null;
        if (arg0 != 2) {
            field7849 = 0.7198636F;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZZIIIII)V")
    public final void method3307(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7826++;
        if (arg6 <= 52) {
            return;
        }
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        int var10 = arg3 - this.field7847;
        int var11 = arg4 - this.field7835;
        if (arg1) {
            var9 |= 0x40000000;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg7;
            arg7 = arg5;
            arg5 = var12;
        }
        for (int var13 = var10; var13 < (arg7 + var10); var13++) {
            if (var13 >= 0 && var13 < this.field7831) {
                for (int var14 = var11; var14 < (arg5 + var11); var14++) {
                    if (var14 >= 0 && this.field7837 > var14) {
                        this.method3291(var9, -122, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIZZ)V")
    public final void method3308(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field7839++;
        int var8 = 49 / ((arg2 - 6) / 46);
        int var9 = arg0 - this.field7835;
        int var10 = arg1 - this.field7847;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method3292(var10, 128, var9, -6496);
                this.method3292(var10 - 1, 8, var9, -6496);
            }
            if (arg4 == 1) {
                this.method3292(var10, 2, var9, -6496);
                this.method3292(var10, 32, var9 + 1, -6496);
            }
            if (arg4 == 2) {
                this.method3292(var10, 8, var9, -6496);
                this.method3292(var10 + 1, 128, var9, -6496);
            }
            if (arg4 == 3) {
                this.method3292(var10, 32, var9, -6496);
                this.method3292(var10, 2, var9 - 1, -6496);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method3292(var10, 1, var9, -6496);
                this.method3292(var10 - 1, 16, var9 + 1, -6496);
            }
            if (arg4 == 1) {
                this.method3292(var10, 4, var9, -6496);
                this.method3292(var10 + 1, 64, var9 + 1, -6496);
            }
            if (arg4 == 2) {
                this.method3292(var10, 16, var9, -6496);
                this.method3292(var10 + 1, 1, var9 - 1, -6496);
            }
            if (arg4 == 3) {
                this.method3292(var10, 64, var9, -6496);
                this.method3292(var10 - 1, 4, var9 - 1, -6496);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method3292(var10, 130, var9, -6496);
                this.method3292(var10 - 1, 8, var9, -6496);
                this.method3292(var10, 32, var9 + 1, -6496);
            }
            if (arg4 == 1) {
                this.method3292(var10, 10, var9, -6496);
                this.method3292(var10, 32, var9 + 1, -6496);
                this.method3292(var10 + 1, 128, var9, -6496);
            }
            if (arg4 == 2) {
                this.method3292(var10, 40, var9, -6496);
                this.method3292(var10 + 1, 128, var9, -6496);
                this.method3292(var10, 2, var9 - 1, -6496);
            }
            if (arg4 == 3) {
                this.method3292(var10, 160, var9, -6496);
                this.method3292(var10, 2, var9 - 1, -6496);
                this.method3292(var10 - 1, 8, var9, -6496);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg4 == 0) {
                    this.method3292(var10, 65536, var9, -6496);
                    this.method3292(var10 - 1, 4096, var9, -6496);
                }
                if (arg4 == 1) {
                    this.method3292(var10, 1024, var9, -6496);
                    this.method3292(var10, 16384, var9 + 1, -6496);
                }
                if (arg4 == 2) {
                    this.method3292(var10, 4096, var9, -6496);
                    this.method3292(var10 + 1, 65536, var9, -6496);
                }
                if (arg4 == 3) {
                    this.method3292(var10, 16384, var9, -6496);
                    this.method3292(var10, 1024, var9 - 1, -6496);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg4 == 0) {
                    this.method3292(var10, 512, var9, -6496);
                    this.method3292(var10 - 1, 8192, var9 + 1, -6496);
                }
                if (arg4 == 1) {
                    this.method3292(var10, 2048, var9, -6496);
                    this.method3292(var10 + 1, 32768, var9 + 1, -6496);
                }
                if (arg4 == 2) {
                    this.method3292(var10, 8192, var9, -6496);
                    this.method3292(var10 + 1, 512, var9 - 1, -6496);
                }
                if (arg4 == 3) {
                    this.method3292(var10, 32768, var9, -6496);
                    this.method3292(var10 - 1, 2048, var9 - 1, -6496);
                }
            }
            if (arg3 == 2) {
                if (arg4 == 0) {
                    this.method3292(var10, 66560, var9, -6496);
                    this.method3292(var10 - 1, 4096, var9, -6496);
                    this.method3292(var10, 16384, var9 + 1, -6496);
                }
                if (arg4 == 1) {
                    this.method3292(var10, 5120, var9, -6496);
                    this.method3292(var10, 16384, var9 + 1, -6496);
                    this.method3292(var10 + 1, 65536, var9, -6496);
                }
                if (arg4 == 2) {
                    this.method3292(var10, 20480, var9, -6496);
                    this.method3292(var10 + 1, 65536, var9, -6496);
                    this.method3292(var10, 1024, var9 - 1, -6496);
                }
                if (arg4 == 3) {
                    this.method3292(var10, 81920, var9, -6496);
                    this.method3292(var10, 1024, var9 - 1, -6496);
                    this.method3292(var10 - 1, 4096, var9, -6496);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method3292(var10, 536870912, var9, -6496);
                this.method3292(var10 - 1, 33554432, var9, -6496);
            }
            if (arg4 == 1) {
                this.method3292(var10, 8388608, var9, -6496);
                this.method3292(var10, 134217728, var9 + 1, -6496);
            }
            if (arg4 == 2) {
                this.method3292(var10, 33554432, var9, -6496);
                this.method3292(var10 + 1, 536870912, var9, -6496);
            }
            if (arg4 == 3) {
                this.method3292(var10, 134217728, var9, -6496);
                this.method3292(var10, 8388608, var9 - 1, -6496);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method3292(var10, 4194304, var9, -6496);
                this.method3292(var10 - 1, 67108864, var9 + 1, -6496);
            }
            if (arg4 == 1) {
                this.method3292(var10, 16777216, var9, -6496);
                this.method3292(var10 + 1, 268435456, var9 + 1, -6496);
            }
            if (arg4 == 2) {
                this.method3292(var10, 67108864, var9, -6496);
                this.method3292(var10 + 1, 4194304, var9 - 1, -6496);
            }
            if (arg4 == 3) {
                this.method3292(var10, 268435456, var9, -6496);
                this.method3292(var10 - 1, 16777216, var9 - 1, -6496);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method3292(var10, 545259520, var9, -6496);
            this.method3292(var10 - 1, 33554432, var9, -6496);
            this.method3292(var10, 134217728, var9 + 1, -6496);
        }
        if (arg4 == 1) {
            this.method3292(var10, 41943040, var9, -6496);
            this.method3292(var10, 134217728, var9 + 1, -6496);
            this.method3292(var10 + 1, 536870912, var9, -6496);
        }
        if (arg4 == 2) {
            this.method3292(var10, 167772160, var9, -6496);
            this.method3292(var10 + 1, 536870912, var9, -6496);
            this.method3292(var10, 8388608, var9 - 1, -6496);
        }
        if (arg4 == 3) {
            this.method3292(var10, 671088640, var9, -6496);
            this.method3292(var10, 8388608, var9 - 1, -6496);
            this.method3292(var10 - 1, 33554432, var9, -6496);
            return;
        }
    }
}
