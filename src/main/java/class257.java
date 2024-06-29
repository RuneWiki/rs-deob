import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class257 {

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    private int field4398 = 0;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    private int field4412;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    private int field4406;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    private int field4411;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "[[I")
    public int[][] field4422;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field4401 = 0;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Lvf;")
    private static class265 field4402 = class87.method582(-46, "K");

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[S")
    public static short[] field4391 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "Lvf;")
    public static class265 field4417 = field4402;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[J")
    public static long[] field4390 = new long[32];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lvf;")
    public static class265 field4389 = field4402;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Lvf;")
    private static class265 field4410 = class87.method582(-46, "slide:");

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lvf;")
    public static class265 field4395 = field4410;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "Lvf;")
    public static class265 field4420 = field4410;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "Lfl;")
    public static class192 field4416;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lsb;")
    public static class92 field4396;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "[[I")
    public static int[][] field4407;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method1682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4409++;
        if ((arg1 + arg6) <= arg4 || arg1 >= arg4 + arg0) {
            return false;
        } else if ((arg2 + arg7) > arg3 && (arg3 + arg5) > arg7) {
            if (arg8 != 11949) {
                this.method1685(-29, 12, 73, -104, -6, 102, -10, 14, 101, (byte) 30);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILgk;)Z")
    public static final boolean method1683(int arg0, class6 arg1) {
        field4415++;
        if (arg1.field146 == 205) {
            class56.field1150 = 250;
            return true;
        } else {
            if (arg0 != 19418) {
                field4402 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method1684(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4397++;
        if (arg3 != 5) {
            return false;
        }
        if (arg5 == 1) {
            if (arg1 == arg6 && arg2 == arg4) {
                return true;
            }
        } else if (arg1 <= arg6 && arg6 <= arg1 + arg5 - 1 && arg2 >= arg2 && arg5 + arg2 - 1 >= arg2) {
            return true;
        }
        int var9 = arg6 - this.field4398;
        int var10 = arg1 - this.field4398;
        int var11 = arg4 - this.field4411;
        int var12 = arg2 - this.field4411;
        if (arg5 == 1) {
            if (arg0 == 0) {
                if (arg7 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4422[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field4422[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4422[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field4422[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                    if (var9 - 1 == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field4422[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field4422[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field4422[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4422[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field4422[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field4422[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field4422[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var11 - 1;
            int var14 = arg5 + var10 - 1;
            if (arg0 == 0) {
                if (arg7 == 0) {
                    if ((var9 - arg5) == var10 && var12 >= var11 && var12 <= var13) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && (var12 + 1) == var11 && (this.field4422[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && (var12 - arg5) == var11 && (this.field4422[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 >= var10 && var9 <= var14 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 - arg5 == var10 && var12 >= var11 && var13 >= var12 && (this.field4422[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var13 >= var12 && (this.field4422[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 + 1 == var10 && var11 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && (var12 + 1) == var11 && (this.field4422[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && var12 - arg5 == var11 && (this.field4422[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 >= var10 && var9 <= var14 && var12 - arg5 == var11) {
                        return true;
                    }
                    if (var9 - arg5 == var10 && var12 >= var11 && var13 >= var12 && (this.field4422[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var13 >= var12 && (this.field4422[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 0) {
                    if (var9 - arg5 == var10 && var12 >= var11 && var12 <= var13) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var13 >= var12 && (this.field4422[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && (var12 - arg5) == var11 && (this.field4422[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 - arg5 == var10 && var12 >= var11 && var13 >= var12 && (this.field4422[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var13 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && (var12 - arg5) == var11 && (this.field4422[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var9 - arg5) == var10 && var12 >= var11 && var13 >= var12 && (this.field4422[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && (var12 + 1) == var11 && (this.field4422[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var13 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && var12 - arg5 == var11) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var9 - arg5) == var10 && var11 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && var12 + 1 == var11 && (this.field4422[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var13 && (this.field4422[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && var12 - arg5 == var11) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 >= var10 && var14 >= var9 && (var12 + 1) == var11 && (this.field4422[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 <= var9 && var9 <= var14 && (var12 - arg5) == var11 && (this.field4422[var9][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg5 == var10 && var12 >= var11 && var13 >= var12 && (this.field4422[var14][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var12 >= var11 && var13 >= var12 && (this.field4422[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIIIB)Z")
    private final boolean method1685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field4414++;
        int var11 = arg0 + arg3;
        int var12 = arg1 + arg6;
        int var13 = arg2 + arg4;
        int var14 = arg5 + arg7;
        if (arg5 <= arg0 && arg0 < var14) {
            if (arg2 == var12 && (arg8 & 0x4) == 0) {
                int var15 = var11 > var14 ? var14 : var11;
                for (int var16 = arg0; var16 < var15; var16++) {
                    if ((this.field4422[var16 - this.field4398][var12 - this.field4411 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var13 && (arg8 & 0x1) == 0) {
                int var17 = arg0;
                int var18 = var11 <= var14 ? var11 : var14;
                while (var17 < var18) {
                    if ((this.field4422[var17 - this.field4398][arg1 - this.field4411] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg5 < var11 && var14 >= var11) {
            if (arg2 == var12 && (arg8 & 0x4) == 0) {
                for (int var19 = arg5; var19 < var11; var19++) {
                    if ((this.field4422[var19 - this.field4398][var12 - this.field4411 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var13 && (arg8 & 0x1) == 0) {
                for (int var20 = arg5; var20 < var11; var20++) {
                    if ((this.field4422[var20 - this.field4398][arg1 - this.field4411] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg1 >= arg2 && arg1 < var13) {
            if (arg5 == var11 && (arg8 & 0x8) == 0) {
                int var21 = arg1;
                int var22 = var12 <= var13 ? var12 : var13;
                while (var21 < var22) {
                    if ((this.field4422[var11 - this.field4398 - 1][var21 - this.field4411] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg0 == var14 && (arg8 & 0x2) == 0) {
                int var23 = arg1;
                int var24 = var12 > var13 ? var13 : var12;
                while (var24 > var23) {
                    if ((this.field4422[arg0 - this.field4398][var23 - this.field4411] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg2 < var12 && var12 <= var13) {
            if (arg5 == var11 && (arg8 & 0x8) == 0) {
                for (int var25 = arg2; var25 < var12; var25++) {
                    if ((this.field4422[var11 - this.field4398 - 1][var25 - this.field4411] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg8 & 0x2) == 0) {
                for (int var26 = arg2; var26 < var12; var26++) {
                    if ((this.field4422[arg0 - this.field4398][var26 - this.field4411] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        if (arg9 < 43) {
            this.method1700(-84, 76, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIZ)V")
    public final void method1686(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field4411;
        int var8 = arg4 - this.field4398;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1695(128, var8, (byte) -83, var7);
                this.method1695(8, var8 - 1, (byte) -83, var7);
            }
            if (arg1 == 1) {
                this.method1695(2, var8, (byte) -83, var7);
                this.method1695(32, var8, (byte) -83, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1695(8, var8, (byte) -83, var7);
                this.method1695(128, var8 + 1, (byte) -83, var7);
            }
            if (arg1 == 3) {
                this.method1695(32, var8, (byte) -83, var7);
                this.method1695(2, var8, (byte) -83, var7 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1695(1, var8, (byte) -83, var7);
                this.method1695(16, var8 - 1, (byte) -83, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1695(4, var8, (byte) -83, var7);
                this.method1695(64, var8 + 1, (byte) -83, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1695(16, var8, (byte) -83, var7);
                this.method1695(1, var8 + 1, (byte) -83, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1695(64, var8, (byte) -83, var7);
                this.method1695(4, var8 - 1, (byte) -83, var7 - 1);
            }
        }
        if (arg2 != -4) {
            this.method1692(true, false, -10, -56, -113, 75, -126);
        }
        field4404++;
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method1695(130, var8, (byte) -83, var7);
                this.method1695(8, var8 - 1, (byte) -83, var7);
                this.method1695(32, var8, (byte) -83, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1695(10, var8, (byte) -83, var7);
                this.method1695(32, var8, (byte) -83, var7 + 1);
                this.method1695(128, var8 + 1, (byte) -83, var7);
            }
            if (arg1 == 2) {
                this.method1695(40, var8, (byte) -83, var7);
                this.method1695(128, var8 + 1, (byte) -83, var7);
                this.method1695(2, var8, (byte) -83, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1695(160, var8, (byte) -83, var7);
                this.method1695(2, var8, (byte) -83, var7 - 1);
                this.method1695(8, var8 - 1, (byte) -83, var7);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1695(65536, var8, (byte) -83, var7);
                this.method1695(4096, var8 - 1, (byte) -83, var7);
            }
            if (arg1 == 1) {
                this.method1695(1024, var8, (byte) -83, var7);
                this.method1695(16384, var8, (byte) -83, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1695(4096, var8, (byte) -83, var7);
                this.method1695(65536, var8 + 1, (byte) -83, var7);
            }
            if (arg1 == 3) {
                this.method1695(16384, var8, (byte) -83, var7);
                this.method1695(1024, var8, (byte) -83, var7 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1695(512, var8, (byte) -83, var7);
                this.method1695(8192, var8 - 1, (byte) -83, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1695(2048, var8, (byte) -83, var7);
                this.method1695(32768, var8 + 1, (byte) -83, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1695(8192, var8, (byte) -83, var7);
                this.method1695(512, var8 + 1, (byte) -83, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1695(32768, var8, (byte) -83, var7);
                this.method1695(2048, var8 - 1, (byte) -83, var7 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1695(66560, var8, (byte) -83, var7);
            this.method1695(4096, var8 - 1, (byte) -83, var7);
            this.method1695(16384, var8, (byte) -83, var7 + 1);
        }
        if (arg1 == 1) {
            this.method1695(5120, var8, (byte) -83, var7);
            this.method1695(16384, var8, (byte) -83, var7 + 1);
            this.method1695(65536, var8 + 1, (byte) -83, var7);
        }
        if (arg1 == 2) {
            this.method1695(20480, var8, (byte) -83, var7);
            this.method1695(65536, var8 + 1, (byte) -83, var7);
            this.method1695(1024, var8, (byte) -83, var7 - 1);
        }
        if (arg1 == 3) {
            this.method1695(81920, var8, (byte) -83, var7);
            this.method1695(1024, var8, (byte) -83, var7 - 1);
            this.method1695(4096, var8 - 1, (byte) -83, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIBI)V")
    private final void method1687(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 62) {
            field4423++;
            this.field4422[arg3][arg1] = class144.method992(this.field4422[arg3][arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method1688(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4418++;
        if (arg6 == 1) {
            if (arg1 == arg7 && arg0 == arg3) {
                return true;
            }
        } else if (arg1 <= arg7 && arg7 <= arg1 + arg6 - 1 && arg3 <= arg3 && arg3 <= arg3 - (1 - arg6)) {
            return true;
        }
        int var9 = arg0 - this.field4411;
        int var10 = arg1 - this.field4398;
        if (arg5 > -95) {
            this.field4422 = null;
        }
        int var11 = arg3 - this.field4411;
        int var12 = arg7 - this.field4398;
        if (arg6 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field4422[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field4422[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field4422[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field4422[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field4422[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field4422[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field4422[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field4422[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field4422[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var9 && (this.field4422[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field4422[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field4422[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var9 - 1;
            int var14 = var10 + arg6 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var12 + 1 == var10 && var11 >= var9 && var13 >= var11 && (this.field4422[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var14 >= var12 && var11 - arg6 == var9 && (this.field4422[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 - arg6 == var10 && var11 >= var9 && var11 <= var13 && (this.field4422[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var14 && (var11 - arg6) == var9 && (this.field4422[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - arg6) == var10 && var9 <= var11 && var13 >= var11 && (this.field4422[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var14 && var11 + 1 == var9 && (this.field4422[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var12 + 1) == var10 && var11 >= var9 && var11 <= var13 && (this.field4422[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var14 && (var11 + 1) == var9 && (this.field4422[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 <= var12 && var14 >= var12 && var11 + 1 == var9 && (this.field4422[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var10 && var12 <= var14 && var11 - arg6 == var9 && (this.field4422[var12][var13] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg6 == var10 && var9 <= var11 && var13 >= var11 && (this.field4422[var14][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 <= var11 && var11 <= var13 && (this.field4422[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1689(int arg0) {
        field4391 = null;
        field4402 = null;
        field4389 = null;
        field4417 = null;
        field4420 = null;
        if (arg0 != 19661184) {
            method1697((class122) null, (byte) -122);
        }
        field4395 = null;
        field4390 = null;
        field4416 = null;
        field4407 = null;
        field4410 = null;
        field4396 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1690(boolean arg0, int arg1) {
        if (!arg0) {
            method1697((class122) null, (byte) 94);
        }
        field4403++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public final void method1691(byte arg0) {
        if (arg0 > -110) {
            field4390 = null;
        }
        for (int var2 = 0; var2 < this.field4412; var2++) {
            for (int var3 = 0; var3 < this.field4406; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field4412 - 5) || var3 >= (this.field4406 - 5)) {
                    this.field4422[var2][var3] = 16777215;
                } else {
                    this.field4422[var2][var3] = 16777216;
                }
            }
        }
        field4413++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZZIIIII)V")
    public final void method1692(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field4411;
        int var9 = arg4 - this.field4398;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg6;
            arg6 = arg3;
            arg3 = var10;
        }
        int var11 = 256;
        field4399++;
        if (arg1) {
            var11 += 131072;
        }
        int var12 = var9;
        if (!arg0) {
            return;
        }
        while (var12 < var9 + arg6) {
            if (var12 >= 0 && var12 < this.field4412) {
                for (int var13 = var8; var13 < (arg3 + var8); var13++) {
                    if (var13 >= 0 && this.field4406 > var13) {
                        this.method1695(var11, var12, (byte) -83, var13);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
    public final void method1693(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4398;
        int var5 = arg1 - this.field4411;
        field4421++;
        this.field4422[var4][var5] = class203.method1395(this.field4422[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIZB)V")
    public final void method1694(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var7 = arg2 - this.field4411;
        int var8 = arg0 - this.field4398;
        int var9 = 256;
        field4408++;
        if (arg4) {
            var9 += 131072;
        }
        int var10 = var8;
        if (arg5 > -49) {
            this.method1699(62, -22, -22);
        }
        while (var10 < arg1 + var8) {
            if (var10 >= 0 && this.field4412 > var10) {
                for (int var11 = var7; var11 < (arg3 + var7); var11++) {
                    if (var11 >= 0 && this.field4406 > var11) {
                        this.method1687(var9, var11, (byte) 62, var10);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IIBI)V")
    private final void method1695(int arg0, int arg1, byte arg2, int arg3) {
        this.field4422[arg1][arg3] = class203.method1395(this.field4422[arg1][arg3], ~arg0);
        if (arg2 != -83) {
            method1689(52);
        }
        field4419++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZIBI)V")
    public final void method1696(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg3 - this.field4398;
        field4393++;
        int var8 = arg0 - this.field4411;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1687(128, var8, (byte) 62, var7);
                this.method1687(8, var8, (byte) 62, var7 - 1);
            }
            if (arg1 == 1) {
                this.method1687(2, var8, (byte) 62, var7);
                this.method1687(32, var8 + 1, (byte) 62, var7);
            }
            if (arg1 == 2) {
                this.method1687(8, var8, (byte) 62, var7);
                this.method1687(128, var8, (byte) 62, var7 + 1);
            }
            if (arg1 == 3) {
                this.method1687(32, var8, (byte) 62, var7);
                this.method1687(2, var8 - 1, (byte) 62, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1687(1, var8, (byte) 62, var7);
                this.method1687(16, var8 + 1, (byte) 62, var7 - 1);
            }
            if (arg1 == 1) {
                this.method1687(4, var8, (byte) 62, var7);
                this.method1687(64, var8 + 1, (byte) 62, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1687(16, var8, (byte) 62, var7);
                this.method1687(1, var8 - 1, (byte) 62, var7 + 1);
            }
            if (arg1 == 3) {
                this.method1687(64, var8, (byte) 62, var7);
                this.method1687(4, var8 - 1, (byte) 62, var7 - 1);
            }
        }
        if (arg4 != -67) {
            field4396 = null;
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method1687(130, var8, (byte) 62, var7);
                this.method1687(8, var8, (byte) 62, var7 - 1);
                this.method1687(32, var8 + 1, (byte) 62, var7);
            }
            if (arg1 == 1) {
                this.method1687(10, var8, (byte) 62, var7);
                this.method1687(32, var8 + 1, (byte) 62, var7);
                this.method1687(128, var8, (byte) 62, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1687(40, var8, (byte) 62, var7);
                this.method1687(128, var8, (byte) 62, var7 + 1);
                this.method1687(2, var8 - 1, (byte) 62, var7);
            }
            if (arg1 == 3) {
                this.method1687(160, var8, (byte) 62, var7);
                this.method1687(2, var8 - 1, (byte) 62, var7);
                this.method1687(8, var8, (byte) 62, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1687(65536, var8, (byte) 62, var7);
                this.method1687(4096, var8, (byte) 62, var7 - 1);
            }
            if (arg1 == 1) {
                this.method1687(1024, var8, (byte) 62, var7);
                this.method1687(16384, var8 + 1, (byte) 62, var7);
            }
            if (arg1 == 2) {
                this.method1687(4096, var8, (byte) 62, var7);
                this.method1687(65536, var8, (byte) 62, var7 + 1);
            }
            if (arg1 == 3) {
                this.method1687(16384, var8, (byte) 62, var7);
                this.method1687(1024, var8 - 1, (byte) 62, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1687(512, var8, (byte) 62, var7);
                this.method1687(8192, var8 + 1, (byte) 62, var7 - 1);
            }
            if (arg1 == 1) {
                this.method1687(2048, var8, (byte) 62, var7);
                this.method1687(32768, var8 + 1, (byte) 62, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1687(8192, var8, (byte) 62, var7);
                this.method1687(512, var8 - 1, (byte) 62, var7 + 1);
            }
            if (arg1 == 3) {
                this.method1687(32768, var8, (byte) 62, var7);
                this.method1687(2048, var8 - 1, (byte) 62, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1687(66560, var8, (byte) 62, var7);
            this.method1687(4096, var8, (byte) 62, var7 - 1);
            this.method1687(16384, var8 + 1, (byte) 62, var7);
        }
        if (arg1 == 1) {
            this.method1687(5120, var8, (byte) 62, var7);
            this.method1687(16384, var8 + 1, (byte) 62, var7);
            this.method1687(65536, var8, (byte) 62, var7 + 1);
        }
        if (arg1 == 2) {
            this.method1687(20480, var8, (byte) 62, var7);
            this.method1687(65536, var8, (byte) 62, var7 + 1);
            this.method1687(1024, var8 - 1, (byte) 62, var7);
        }
        if (arg1 == 3) {
            this.method1687(81920, var8, (byte) 62, var7);
            this.method1687(1024, var8 - 1, (byte) 62, var7);
            this.method1687(4096, var8, (byte) 62, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lnc;B)V")
    public static final void method1697(class122 arg0, byte arg1) {
        class242 var2 = (class242) class32.field804.method1842(arg1 - 109, arg0.field2163.method1793(43));
        field4392++;
        if (arg1 != 108) {
            field4402 = null;
        }
        if (var2 == null) {
            class10.method75(0, arg0.field2536[0], arg0.field2575[0], false, class216.field3902, (class23) null, (class130) null, arg0);
        } else {
            var2.method1614(-95);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIIIIIIII)Z")
    public final boolean method1698(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4394++;
        if (arg5 > 1) {
            return this.method1682(arg5, arg8, arg7, arg6, arg4, arg5, arg1, arg3, 11949) ? true : this.method1685(arg4, arg6, arg3, arg5, arg7, arg8, arg5, arg1, arg2, (byte) 50);
        }
        int var10 = arg8 + arg1 - 1;
        int var11 = arg3 + arg7 - 1;
        if (arg4 >= arg8 && arg4 <= var10 && arg6 >= arg3 && var11 >= arg6) {
            return true;
        } else if (arg0 > -123) {
            return false;
        } else if (arg8 - 1 == arg4 && arg3 <= arg6 && var11 >= arg6 && (this.field4422[arg4 - this.field4398][arg6 - this.field4411] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg4 && arg3 <= arg6 && arg6 <= var11 && (this.field4422[arg4 - this.field4398][arg6 - this.field4411] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg6 && arg8 <= arg4 && arg4 <= var10 && (this.field4422[arg4 - this.field4398][arg6 - this.field4411] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg6 && arg4 >= arg8 && arg4 <= var10 && (this.field4422[arg4 - this.field4398][arg6 - this.field4411] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V")
    public class257(int arg0, int arg1) {
        this.field4412 = arg0;
        this.field4406 = arg1;
        this.field4411 = 0;
        this.field4422 = new int[this.field4412][this.field4406];
        this.method1691((byte) -116);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
    public final void method1699(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4398;
        field4400++;
        int var5 = arg2 - this.field4411;
        this.field4422[var4][var5] = class144.method992(this.field4422[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZ)V")
    public final void method1700(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field4398;
        int var5 = arg1 - this.field4411;
        this.field4422[var4][var5] = class144.method992(this.field4422[var4][var5], 262144);
        if (!arg2) {
            field4405++;
        }
    }
}
