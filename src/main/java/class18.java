import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class18 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[I")
    public static int[] field168 = new int[14];

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "J")
    public static long field183 = -1L;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lch;")
    public static class151 field172 = new class151("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "Lap;")
    public static class310 field192 = new class310(30, -1);

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "Z")
    public static boolean field193 = false;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "[I")
    public static int[] field194;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "[I")
    public static int[] field195;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "[[I")
    public int[][] field176;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method112(int arg0) {
        field195 = null;
        field168 = null;
        field192 = null;
        if (arg0 > 57) {
            field194 = null;
            field172 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public final void method113(int arg0, int arg1, int arg2) {
        field174++;
        int var4 = arg1 - this.field187;
        int var5 = arg2 - this.field182;
        this.field176[var5][var4] = class88.method739(this.field176[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIBIIIIII)Z")
    public final boolean method114(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field177++;
        int var11 = arg4 + arg8;
        if (arg3 > -4) {
            field168 = null;
        }
        int var12 = arg2 + arg9;
        int var13 = arg0 + arg5;
        int var14 = arg1 + arg7;
        if (arg8 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg1 < arg9 ? arg9 : arg1;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field176[var13 - this.field182 - 1][var15 - this.field187] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg1 >= arg9 ? arg1 : arg9;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field176[arg5 - this.field182][var17 - this.field187] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg9 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg5 >= arg8 ? arg5 : arg8;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field176[var19 - this.field182][var14 - this.field187 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg1 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg8 > arg5 ? arg8 : arg5;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field176[var21 - this.field182][arg1 - this.field187] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZIZI)V")
    public final void method115(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field187;
        field191++;
        int var9 = arg1 - this.field182;
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method119(var9, 128, var8, 1);
                this.method119(var9 - 1, 8, var8, arg4 ^ 0x20000001);
            }
            if (arg0 == 1) {
                this.method119(var9, 2, var8, 1);
                this.method119(var9, 32, var8 + 1, 1);
            }
            if (arg0 == 2) {
                this.method119(var9, 8, var8, 1);
                this.method119(var9 + 1, 128, var8, 1);
            }
            if (arg0 == 3) {
                this.method119(var9, 32, var8, 1);
                this.method119(var9, 2, var8 - 1, arg4 + -536870911);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method119(var9, 1, var8, 1);
                this.method119(var9 - 1, 16, var8 + 1, arg4 + -536870911);
            }
            if (arg0 == 1) {
                this.method119(var9, 4, var8, 1);
                this.method119(var9 + 1, 64, var8 + 1, arg4 ^ 0x20000001);
            }
            if (arg0 == 2) {
                this.method119(var9, 16, var8, arg4 - 536870911);
                this.method119(var9 + 1, 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method119(var9, 64, var8, 1);
                this.method119(var9 - 1, 4, var8 - 1, 1);
            }
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                this.method119(var9, 130, var8, 1);
                this.method119(var9 - 1, 8, var8, 1);
                this.method119(var9, 32, var8 + 1, 1);
            }
            if (arg0 == 1) {
                this.method119(var9, 10, var8, 1);
                this.method119(var9, 32, var8 + 1, 1);
                this.method119(var9 + 1, 128, var8, 1);
            }
            if (arg0 == 2) {
                this.method119(var9, 40, var8, 1);
                this.method119(var9 + 1, 128, var8, 1);
                this.method119(var9, 2, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method119(var9, 160, var8, 1);
                this.method119(var9, 2, var8 - 1, 1);
                this.method119(var9 - 1, 8, var8, 1);
            }
        }
        if (arg5) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method119(var9, 65536, var8, 1);
                    this.method119(var9 - 1, 4096, var8, 1);
                }
                if (arg0 == 1) {
                    this.method119(var9, 1024, var8, 1);
                    this.method119(var9, 16384, var8 + 1, 1);
                }
                if (arg0 == 2) {
                    this.method119(var9, 4096, var8, 1);
                    this.method119(var9 + 1, 65536, var8, 1);
                }
                if (arg0 == 3) {
                    this.method119(var9, 16384, var8, 1);
                    this.method119(var9, 1024, var8 - 1, 1);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method119(var9, 512, var8, arg4 ^ 0x20000001);
                    this.method119(var9 - 1, 8192, var8 + 1, 1);
                }
                if (arg0 == 1) {
                    this.method119(var9, 2048, var8, 1);
                    this.method119(var9 + 1, 32768, var8 + 1, arg4 ^ 0x20000001);
                }
                if (arg0 == 2) {
                    this.method119(var9, 8192, var8, 1);
                    this.method119(var9 + 1, 512, var8 - 1, arg4 ^ 0x20000001);
                }
                if (arg0 == 3) {
                    this.method119(var9, 32768, var8, 1);
                    this.method119(var9 - 1, 2048, var8 - 1, arg4 + -536870911);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method119(var9, 66560, var8, 1);
                    this.method119(var9 - 1, 4096, var8, 1);
                    this.method119(var9, 16384, var8 + 1, arg4 ^ 0x20000001);
                }
                if (arg0 == 1) {
                    this.method119(var9, 5120, var8, 1);
                    this.method119(var9, 16384, var8 + 1, arg4 + -536870911);
                    this.method119(var9 + 1, 65536, var8, arg4 - 536870911);
                }
                if (arg0 == 2) {
                    this.method119(var9, 20480, var8, arg4 - 536870911);
                    this.method119(var9 + 1, 65536, var8, 1);
                    this.method119(var9, 1024, var8 - 1, 1);
                }
                if (arg0 == 3) {
                    this.method119(var9, 81920, var8, 1);
                    this.method119(var9, 1024, var8 - 1, 1);
                    this.method119(var9 - 1, 4096, var8, arg4 ^ 0x20000001);
                }
            }
        }
        if (arg3) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method119(var9, 536870912, var8, arg4 ^ 0x20000001);
                    this.method119(var9 - 1, 33554432, var8, 1);
                }
                if (arg0 == 1) {
                    this.method119(var9, 8388608, var8, arg4 ^ 0x20000001);
                    this.method119(var9, 134217728, var8 + 1, arg4 ^ 0x20000001);
                }
                if (arg0 == 2) {
                    this.method119(var9, 33554432, var8, arg4 ^ 0x20000001);
                    this.method119(var9 + 1, 536870912, var8, arg4 ^ 0x20000001);
                }
                if (arg0 == 3) {
                    this.method119(var9, 134217728, var8, 1);
                    this.method119(var9, 8388608, var8 - 1, 1);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method119(var9, 4194304, var8, 1);
                    this.method119(var9 - 1, 67108864, var8 + 1, 1);
                }
                if (arg0 == 1) {
                    this.method119(var9, 16777216, var8, 1);
                    this.method119(var9 + 1, 268435456, var8 + 1, 1);
                }
                if (arg0 == 2) {
                    this.method119(var9, 67108864, var8, 1);
                    this.method119(var9 + 1, 4194304, var8 - 1, arg4 ^ 0x20000001);
                }
                if (arg0 == 3) {
                    this.method119(var9, 268435456, var8, arg4 - 536870911);
                    this.method119(var9 - 1, 16777216, var8 - 1, 1);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method119(var9, 545259520, var8, 1);
                    this.method119(var9 - 1, 33554432, var8, 1);
                    this.method119(var9, 134217728, var8 + 1, 1);
                }
                if (arg0 == 1) {
                    this.method119(var9, 41943040, var8, 1);
                    this.method119(var9, 134217728, var8 + 1, arg4 + -536870911);
                    this.method119(var9 + 1, 536870912, var8, 1);
                }
                if (arg0 == 2) {
                    this.method119(var9, 167772160, var8, 1);
                    this.method119(var9 + 1, 536870912, var8, 1);
                    this.method119(var9, 8388608, var8 - 1, 1);
                }
                if (arg0 == 3) {
                    this.method119(var9, 671088640, var8, 1);
                    this.method119(var9, 8388608, var8 - 1, 1);
                    this.method119(var9 - 1, 33554432, var8, 1);
                }
            }
        }
        if (arg4 != 536870912) {
            method112(-47);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILtq;ILjava/awt/Canvas;)Lvc;")
    public static final class89 method116(int arg0, class248 arg1, int arg2, Canvas arg3) {
        if (arg0 != -7869) {
            method112(114);
        }
        field189++;
        return new class460(arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIZZBI)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, byte arg6, int arg7) {
        field181++;
        int var9 = 256;
        if (arg4) {
            var9 |= 0x20000;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        int var10 = arg7 - this.field182;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg1;
            arg1 = arg0;
            arg0 = var11;
        }
        int var12 = arg2 - this.field187;
        for (int var13 = var10; var13 < (arg1 + var10); var13++) {
            if (var13 >= 0 && var13 < this.field179) {
                for (int var15 = var12; var15 < (arg0 + var12); var15++) {
                    if (var15 >= 0 && var15 < this.field180) {
                        this.method119(var13, var9, var15, 1);
                    }
                }
            }
        }
        int var14 = -88 % ((4 - arg6) / 55);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public final void method118(int arg0) {
        field185++;
        for (int var2 = 0; var2 < this.field179; var2++) {
            for (int var3 = 0; var3 < this.field180; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field179 - 5) || var3 >= (this.field180 - 5)) {
                    this.field176[var2][var3] = -1;
                } else {
                    this.field176[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != 3174) {
            this.field179 = -17;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V")
    private final void method119(int arg0, int arg1, int arg2, int arg3) {
        this.field176[arg0][arg2] = class88.method739(this.field176[arg0][arg2], ~arg1);
        if (arg3 != 1) {
            this.method117(-109, 50, -8, 63, false, false, (byte) -93, -15);
        }
        field188++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILem;)V")
    public static final void method120(int arg0, int arg1, int arg2, class390 arg3) {
        class52 var4 = class360.method2214(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field758 = arg3;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIBIII)Z")
    public final boolean method121(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field167++;
        if (arg1 == 1) {
            if (arg0 == arg5 && arg2 == arg7) {
                return true;
            }
        } else if (arg0 >= arg5 && arg0 <= (arg5 + arg1 - 1) && arg7 <= arg7 && arg7 <= (arg1 + arg7 - 1)) {
            return true;
        }
        int var9 = arg7 - this.field187;
        int var10 = arg5 - this.field182;
        int var11 = arg2 - this.field187;
        int var12 = arg0 - this.field182;
        if (arg4 != -113) {
            return true;
        }
        if (arg1 == 1) {
            if (arg3 == 0) {
                if (arg6 == 0) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field176[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field176[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var12 - 1 == var10 && var9 == var11 && (this.field176[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field176[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field176[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field176[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field176[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field176[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field176[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field176[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field176[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field176[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field176[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field176[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field176[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field176[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field176[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field176[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var10 && var9 == var11 && (this.field176[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field176[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg1 - 1;
            int var14 = arg1 + var11 - 1;
            if (arg3 == 0) {
                if (arg6 == 0) {
                    if (var12 - arg1 == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 + 1 == var11 && (this.field176[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 - arg1 == var11 && (this.field176[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 >= var10 && var13 >= var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 - arg1 == var10 && var9 >= var11 && var14 >= var9 && (this.field176[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9 && (this.field176[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field176[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 - arg1 == var11 && (this.field176[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 <= var12 && var12 <= var13 && var9 - arg1 == var11) {
                        return true;
                    }
                    if (var12 - arg1 == var10 && var9 >= var11 && var9 <= var14 && (this.field176[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14 && (this.field176[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    if (var12 - arg1 == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var14 >= var9 && (this.field176[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 - arg1) == var11 && (this.field176[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - arg1 == var10 && var11 <= var9 && var9 <= var14 && (this.field176[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var9 - arg1 == var11 && (this.field176[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - arg1) == var10 && var9 >= var11 && var9 <= var14 && (this.field176[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 + 1) == var11 && (this.field176[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 - arg1) == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 - arg1) == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 + 1) == var11 && (this.field176[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9 && (this.field176[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 - arg1) == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var12 >= var10 && var13 >= var12 && (var9 + 1) == var11 && (this.field176[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var12 && var12 <= var13 && var9 - arg1 == var11 && (this.field176[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg1 == var10 && var9 >= var11 && var9 <= var14 && (this.field176[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14 && (this.field176[var10][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V")
    public final void method122(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field187;
        int var5 = arg1 - this.field182;
        if (arg2) {
            this.field180 = 38;
        }
        field190++;
        this.field176[var5][var4] = class142.method1024(this.field176[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIII)V")
    private final void method123(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 10) {
            this.field180 = 105;
        }
        this.field176[arg3][arg0] = class142.method1024(this.field176[arg3][arg0], arg1);
        field186++;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
    public final void method124(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field182;
        if (arg0 != 25617) {
            field195 = null;
        }
        int var5 = arg2 - this.field187;
        field170++;
        this.field176[var4][var5] = class88.method739(this.field176[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BII)V")
    public final void method125(byte arg0, int arg1, int arg2) {
        if (arg0 != -78) {
            field194 = null;
        }
        field169++;
        int var4 = arg1 - this.field182;
        int var5 = arg2 - this.field187;
        this.field176[var4][var5] = class142.method1024(this.field176[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLvh;)V")
    public static final void method126(byte arg0, class84 arg1) {
        for (int var2 = 0; var2 < class163.field2372; var2++) {
            int var3 = class441.field6265[var2];
            class39 var4 = class112.field1570[var3];
            int var5 = arg1.method1172((byte) 82);
            if ((var5 & 0x40) != 0) {
                var5 += arg1.method1172((byte) -124) << 8;
            }
            class22.method166(var4, var5, (byte) -22, arg1, var3);
        }
        if (arg0 <= 123) {
            method120(-80, 79, -24, (class390) null);
        }
        field171++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIBIII)Z")
    public final boolean method127(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 <= 5) {
            this.method127(-4, -37, -79, 40, -50, (byte) -36, -18, -5, 120);
        }
        field175++;
        if (arg7 > 1) {
            return class312.method1987(arg7, arg7, arg3, arg1, (byte) 119, arg8, arg6, arg2, arg4) ? true : this.method114(arg8, arg2, arg7, (byte) -6, arg7, arg1, arg0, arg3, arg4, arg6);
        }
        int var10 = arg1 + arg8 - 1;
        int var11 = arg2 + arg3 - 1;
        if (arg1 <= arg4 && var10 >= arg4 && arg2 <= arg6 && arg6 <= var11) {
            return true;
        } else if (arg1 - 1 == arg4 && arg2 <= arg6 && arg6 <= var11 && (this.field176[arg4 - this.field182][arg6 - this.field187] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg4 && arg2 <= arg6 && var11 >= arg6 && (this.field176[arg4 - this.field182][arg6 - this.field187] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if ((arg2 - 1) == arg6 && arg4 >= arg1 && var10 >= arg4 && (this.field176[arg4 - this.field182][arg6 - this.field187] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg6 && arg1 <= arg4 && var10 >= arg4 && (this.field176[arg4 - this.field182][arg6 - this.field187] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZIIIIIZ)V")
    public final void method128(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg4 - this.field182;
        field184++;
        int var9 = arg2 - this.field187;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method123(var9, 128, 123, var8);
                this.method123(var9, 8, 71, var8 - 1);
            }
            if (arg3 == 1) {
                this.method123(var9, 2, 122, var8);
                this.method123(var9 + 1, 32, 34, var8);
            }
            if (arg3 == 2) {
                this.method123(var9, 8, 37, var8);
                this.method123(var9, 128, 27, var8 + 1);
            }
            if (arg3 == 3) {
                this.method123(var9, 32, 33, var8);
                this.method123(var9 - 1, 2, 49, var8);
            }
        }
        if (arg1 > -98) {
            return;
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method123(var9, 1, 74, var8);
                this.method123(var9 + 1, 16, 114, var8 - 1);
            }
            if (arg3 == 1) {
                this.method123(var9, 4, 61, var8);
                this.method123(var9 + 1, 64, 28, var8 + 1);
            }
            if (arg3 == 2) {
                this.method123(var9, 16, 18, var8);
                this.method123(var9 - 1, 1, 28, var8 + 1);
            }
            if (arg3 == 3) {
                this.method123(var9, 64, 80, var8);
                this.method123(var9 - 1, 4, 61, var8 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method123(var9, 130, 26, var8);
                this.method123(var9, 8, 49, var8 - 1);
                this.method123(var9 + 1, 32, 93, var8);
            }
            if (arg3 == 1) {
                this.method123(var9, 10, 42, var8);
                this.method123(var9 + 1, 32, 101, var8);
                this.method123(var9, 128, 82, var8 + 1);
            }
            if (arg3 == 2) {
                this.method123(var9, 40, 49, var8);
                this.method123(var9, 128, 23, var8 + 1);
                this.method123(var9 - 1, 2, 73, var8);
            }
            if (arg3 == 3) {
                this.method123(var9, 160, 48, var8);
                this.method123(var9 - 1, 2, 104, var8);
                this.method123(var9, 8, 26, var8 - 1);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method123(var9, 65536, 26, var8);
                    this.method123(var9, 4096, 53, var8 - 1);
                }
                if (arg3 == 1) {
                    this.method123(var9, 1024, 29, var8);
                    this.method123(var9 + 1, 16384, 41, var8);
                }
                if (arg3 == 2) {
                    this.method123(var9, 4096, 29, var8);
                    this.method123(var9, 65536, 22, var8 + 1);
                }
                if (arg3 == 3) {
                    this.method123(var9, 16384, 12, var8);
                    this.method123(var9 - 1, 1024, 122, var8);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method123(var9, 512, 79, var8);
                    this.method123(var9 + 1, 8192, 41, var8 - 1);
                }
                if (arg3 == 1) {
                    this.method123(var9, 2048, 44, var8);
                    this.method123(var9 + 1, 32768, 94, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method123(var9, 8192, 14, var8);
                    this.method123(var9 - 1, 512, 121, var8 + 1);
                }
                if (arg3 == 3) {
                    this.method123(var9, 32768, 94, var8);
                    this.method123(var9 - 1, 2048, 44, var8 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method123(var9, 66560, 77, var8);
                    this.method123(var9, 4096, 31, var8 - 1);
                    this.method123(var9 + 1, 16384, 100, var8);
                }
                if (arg3 == 1) {
                    this.method123(var9, 5120, 46, var8);
                    this.method123(var9 + 1, 16384, 51, var8);
                    this.method123(var9, 65536, 117, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method123(var9, 20480, 49, var8);
                    this.method123(var9, 65536, 58, var8 + 1);
                    this.method123(var9 - 1, 1024, 38, var8);
                }
                if (arg3 == 3) {
                    this.method123(var9, 81920, 69, var8);
                    this.method123(var9 - 1, 1024, 106, var8);
                    this.method123(var9, 4096, 75, var8 - 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method123(var9, 536870912, 93, var8);
                this.method123(var9, 33554432, 109, var8 - 1);
            }
            if (arg3 == 1) {
                this.method123(var9, 8388608, 73, var8);
                this.method123(var9 + 1, 134217728, 117, var8);
            }
            if (arg3 == 2) {
                this.method123(var9, 33554432, 96, var8);
                this.method123(var9, 536870912, 53, var8 + 1);
            }
            if (arg3 == 3) {
                this.method123(var9, 134217728, 55, var8);
                this.method123(var9 - 1, 8388608, 81, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method123(var9, 4194304, 69, var8);
                this.method123(var9 + 1, 67108864, 67, var8 - 1);
            }
            if (arg3 == 1) {
                this.method123(var9, 16777216, 113, var8);
                this.method123(var9 + 1, 268435456, 99, var8 + 1);
            }
            if (arg3 == 2) {
                this.method123(var9, 67108864, 113, var8);
                this.method123(var9 - 1, 4194304, 32, var8 + 1);
            }
            if (arg3 == 3) {
                this.method123(var9, 268435456, 12, var8);
                this.method123(var9 - 1, 16777216, 65, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method123(var9, 545259520, 94, var8);
            this.method123(var9, 33554432, 53, var8 - 1);
            this.method123(var9 + 1, 134217728, 119, var8);
        }
        if (arg3 == 1) {
            this.method123(var9, 41943040, 70, var8);
            this.method123(var9 + 1, 134217728, 21, var8);
            this.method123(var9, 536870912, 109, var8 + 1);
        }
        if (arg3 == 2) {
            this.method123(var9, 167772160, 73, var8);
            this.method123(var9, 536870912, 54, var8 + 1);
            this.method123(var9 - 1, 8388608, 75, var8);
        }
        if (arg3 == 3) {
            this.method123(var9, 671088640, 12, var8);
            this.method123(var9 - 1, 8388608, 50, var8);
            this.method123(var9, 33554432, 117, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field173++;
        if (arg1 == 1) {
            if (arg0 == arg2 && arg3 == arg6) {
                return true;
            }
        } else if (arg2 >= arg0 && arg2 <= arg1 + arg0 - 1 && arg3 <= arg3 && arg3 <= (arg1 + arg3 - 1)) {
            return true;
        }
        int var9 = arg2 - this.field182;
        if (arg5 != -1) {
            return false;
        }
        int var10 = arg0 - this.field182;
        int var11 = arg3 - this.field187;
        int var12 = arg6 - this.field187;
        if (arg1 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field176[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field176[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field176[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field176[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field176[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field176[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 + 1 == var10 && var11 == var12 && (this.field176[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field176[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 == var10 && (var11 + 1) == var12 && (this.field176[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field176[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var10 && var11 == var12 && (this.field176[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field176[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var10 - 1;
            int var14 = arg1 + var12 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var14 && (this.field176[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var11 - arg1 == var12 && (this.field176[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - arg1 == var10 && var11 >= var12 && var14 >= var11 && (this.field176[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var11 - arg1) == var12 && (this.field176[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var9 - arg1) == var10 && var12 <= var11 && var14 >= var11 && (this.field176[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var11 + 1) == var12 && (this.field176[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var9 + 1) == var10 && var11 >= var12 && var11 <= var14 && (this.field176[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var11 + 1) == var12 && (this.field176[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var10 <= var9 && var9 <= var13 && (var11 + 1) == var12 && (this.field176[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var10 && var13 >= var9 && (var11 - arg1) == var12 && (this.field176[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg1 == var10 && var11 >= var12 && var11 <= var14 && (this.field176[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var12 <= var11 && var14 >= var11 && (this.field176[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZIIIZI)V")
    public final void method130(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field178++;
        int var8 = 256;
        if (arg5) {
            var8 |= 0x20000;
        }
        if (arg0) {
            var8 |= 0x40000000;
        }
        int var9 = arg4 - this.field187;
        int var10 = arg6 - this.field182;
        if (!arg1) {
            field193 = true;
        }
        for (int var11 = var10; var11 < arg3 + var10; var11++) {
            if (var11 >= 0 && this.field179 > var11) {
                for (int var12 = var9; var12 < arg2 + var9; var12++) {
                    if (var12 >= 0 && this.field180 > var12) {
                        this.method123(var12, var8, 118, var11);
                    }
                }
            }
        }
    }
}
