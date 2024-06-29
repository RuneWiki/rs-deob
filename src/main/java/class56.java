import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class56 {

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    private int field880;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "[[I")
    public int[][] field879;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "Z")
    public static boolean field903 = false;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field901 = 0;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "[Lai;")
    public static class126[] field900;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 7)
    public static void method408(int arg0) {
        if (arg0 >= -53) {
            field900 = (class126[]) null;
        }
        field900 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIBII)Z", line = 21)
    private final boolean method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field899++;
        int var11 = arg4 + arg8;
        int var12 = arg0 + arg6;
        if (arg7 != 67) {
            return false;
        }
        int var13 = arg1 + arg5;
        int var14 = arg2 + arg3;
        if (arg1 <= arg4 && var13 > arg4) {
            if (arg2 == var12 && (arg9 & 0x4) == 0) {
                int var15 = arg4;
                int var16 = var13 < var11 ? var13 : var11;
                while (var16 > var15) {
                    if ((this.field879[var15 - this.field880][var12 - this.field885 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg6 == var14 && (arg9 & 0x1) == 0) {
                int var17 = arg4;
                int var18 = var11 > var13 ? var13 : var11;
                while (var17 < var18) {
                    if ((this.field879[var17 - this.field880][arg6 - this.field885] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg1 < var11 && var11 <= var13) {
            if (arg2 == var12 && (arg9 & 0x4) == 0) {
                for (int var19 = arg1; var19 < var11; var19++) {
                    if ((this.field879[var19 - this.field880][var12 - this.field885 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var14 && (arg9 & 0x1) == 0) {
                for (int var20 = arg1; var20 < var11; var20++) {
                    if ((this.field879[var20 - this.field880][arg6 - this.field885] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg2 <= arg6 && var14 > arg6) {
            if (arg1 == var11 && (arg9 & 0x8) == 0) {
                int var21 = arg6;
                int var22 = var12 <= var14 ? var12 : var14;
                while (var22 > var21) {
                    if ((this.field879[var11 - this.field880 - 1][var21 - this.field885] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg4 == var13 && (arg9 & 0x2) == 0) {
                int var23 = arg6;
                int var24 = var14 < var12 ? var14 : var12;
                while (var24 > var23) {
                    if ((this.field879[arg4 - this.field880][var23 - this.field885] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var12 > arg2 && var14 >= var12) {
            if (arg1 == var11 && (arg9 & 0x8) == 0) {
                for (int var25 = arg2; var25 < var12; var25++) {
                    if ((this.field879[var11 - this.field880 - 1][var25 - this.field885] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var13 && (arg9 & 0x2) == 0) {
                for (int var26 = arg2; var26 < var12; var26++) {
                    if ((this.field879[arg4 - this.field880][var26 - this.field885] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIIIIII)Z", line = 184)
    public final boolean method410(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field894++;
        if (arg5 == 1) {
            if (arg0 == arg6 && arg3 == arg4) {
                return true;
            }
        } else if (arg0 >= arg6 && (arg6 + arg5 - 1) >= arg0 && arg4 <= arg4 && arg4 <= (arg4 + arg5 - 1)) {
            return true;
        }
        int var9 = arg3 - this.field885;
        if (arg1 < 39) {
            return true;
        }
        int var10 = arg0 - this.field880;
        int var11 = arg4 - this.field885;
        int var12 = arg6 - this.field880;
        if (arg5 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field879[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field879[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field879[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field879[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field879[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field879[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field879[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field879[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 == var12 && var11 + 1 == var9 && (this.field879[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field879[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field879[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field879[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var12 - 1;
            int var14 = arg5 + var9 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var10 + 1 == var12 && var11 >= var9 && var11 <= var14 && (this.field879[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 - arg5 == var9 && (this.field879[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var10 - arg5) == var12 && var11 >= var9 && var14 >= var11 && (this.field879[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 - arg5 == var9 && (this.field879[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 - arg5) == var12 && var9 <= var11 && var14 >= var11 && (this.field879[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var11 + 1 == var9 && (this.field879[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11 && (this.field879[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field879[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var12 <= var10 && var13 >= var10 && var11 + 1 == var9 && (this.field879[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && (var11 - arg5) == var9 && (this.field879[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg5 == var12 && var9 <= var11 && var14 >= var11 && (this.field879[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11 && (this.field879[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIII)Z", line = 379)
    private final boolean method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field898++;
        if (arg2 < (arg0 + arg1) && arg1 < arg2 + arg4) {
            if (arg8 != 2) {
                this.method424(1, -119, -50, 80, (byte) -102);
            }
            return arg5 + arg7 > arg6 && arg7 < (arg3 + arg6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIIIZI)V", line = 400)
    public final void method412(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field880;
        field895++;
        if (arg0 != -81) {
            return;
        }
        int var8 = arg2 - this.field885;
        int var9 = 256;
        if (arg4) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < (arg5 + var7); var10++) {
            if (var10 >= 0 && var10 < this.field884) {
                for (int var11 = var8; var11 < var8 + arg1; var11++) {
                    if (var11 >= 0 && this.field907 > var11) {
                        this.method416(var10, var11, (byte) 116, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)I", line = 442)
    public static final int method413(int arg0, int arg1, int arg2) {
        int var3 = 0;
        if (arg2 < 59) {
            method417(-91, -19, -81, -4, -71, 111, 70, -128, -121, 76, -88, -8, 68, 6, 91, 120, 55, -85, 30, 23);
        }
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        field896++;
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 470)
    public final void method414(int arg0) {
        for (int var2 = 0; var2 < this.field884; var2++) {
            for (int var3 = 0; var3 < this.field907; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field884 - 5) <= var2 || var3 >= this.field907 - 5) {
                    this.field879[var2][var3] = 16777215;
                } else {
                    this.field879[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 == -17697) {
            field890++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V", line = 501)
    private final void method415(int arg0, int arg1, int arg2) {
        field882++;
        int var4 = arg2 - this.field880;
        if (arg1 != 0) {
            field893 = -5;
        }
        int var5 = arg0 - this.field885;
        this.field879[var4][var5] = class94.method673(this.field879[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBI)V", line = 514)
    private final void method416(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= 115) {
            field905++;
            this.field879[arg0][arg1] = class94.method673(this.field879[arg0][arg1], arg3);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 528)
    private static final void method417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class298 var20 = new class298(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class60.field946[var21][arg1][arg2] == null) {
                    class60.field946[var21][arg1][arg2] = new class272(var21, arg1, arg2);
                }
            }
            class60.field946[arg0][arg1][arg2].field4235 = var20;
        } else if (arg3 == 1) {
            class298 var22 = new class298(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class60.field946[var23][arg1][arg2] == null) {
                    class60.field946[var23][arg1][arg2] = new class272(var23, arg1, arg2);
                }
            }
            class60.field946[arg0][arg1][arg2].field4235 = var22;
        } else {
            class194 var24 = new class194(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class60.field946[var25][arg1][arg2] == null) {
                    class60.field946[var25][arg1][arg2] = new class272(var25, arg1, arg2);
                }
            }
            class60.field946[arg0][arg1][arg2].field4222 = var24;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZIIII)V", line = 578)
    public final void method418(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field885;
        field889++;
        int var9 = arg3 - this.field880;
        int var10 = 256;
        if (arg2) {
            var10 += 131072;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg0;
            arg0 = arg6;
            arg6 = var11;
        }
        if (arg4 > -104) {
            this.method412((byte) 55, 60, 57, -128, true, 7);
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field884) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field907) {
                        this.method419(var10, var13, (byte) -27, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIBI)V", line = 635)
    private final void method419(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -27) {
            this.field884 = 22;
        }
        field886++;
        this.field879[arg3][arg1] = class280.method2001(this.field879[arg3][arg1], ~arg0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIZII)V", line = 646)
    public final void method420(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field885;
        int var8 = arg5 - this.field880;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method419(128, var7, (byte) -27, var8);
                this.method419(8, var7, (byte) -27, var8 - 1);
            }
            if (arg2 == 1) {
                this.method419(2, var7, (byte) -27, var8);
                this.method419(32, var7 + 1, (byte) -27, var8);
            }
            if (arg2 == 2) {
                this.method419(8, var7, (byte) -27, var8);
                this.method419(128, var7, (byte) -27, var8 + 1);
            }
            if (arg2 == 3) {
                this.method419(32, var7, (byte) -27, var8);
                this.method419(2, var7 - 1, (byte) -27, var8);
            }
        }
        if (arg4 <= 31) {
            field892 = 60;
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method419(1, var7, (byte) -27, var8);
                this.method419(16, var7 + 1, (byte) -27, var8 - 1);
            }
            if (arg2 == 1) {
                this.method419(4, var7, (byte) -27, var8);
                this.method419(64, var7 + 1, (byte) -27, var8 + 1);
            }
            if (arg2 == 2) {
                this.method419(16, var7, (byte) -27, var8);
                this.method419(1, var7 - 1, (byte) -27, var8 + 1);
            }
            if (arg2 == 3) {
                this.method419(64, var7, (byte) -27, var8);
                this.method419(4, var7 - 1, (byte) -27, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method419(130, var7, (byte) -27, var8);
                this.method419(8, var7, (byte) -27, var8 - 1);
                this.method419(32, var7 + 1, (byte) -27, var8);
            }
            if (arg2 == 1) {
                this.method419(10, var7, (byte) -27, var8);
                this.method419(32, var7 + 1, (byte) -27, var8);
                this.method419(128, var7, (byte) -27, var8 + 1);
            }
            if (arg2 == 2) {
                this.method419(40, var7, (byte) -27, var8);
                this.method419(128, var7, (byte) -27, var8 + 1);
                this.method419(2, var7 - 1, (byte) -27, var8);
            }
            if (arg2 == 3) {
                this.method419(160, var7, (byte) -27, var8);
                this.method419(2, var7 - 1, (byte) -27, var8);
                this.method419(8, var7, (byte) -27, var8 - 1);
            }
        }
        field883++;
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method419(65536, var7, (byte) -27, var8);
                this.method419(4096, var7, (byte) -27, var8 - 1);
            }
            if (arg2 == 1) {
                this.method419(1024, var7, (byte) -27, var8);
                this.method419(16384, var7 + 1, (byte) -27, var8);
            }
            if (arg2 == 2) {
                this.method419(4096, var7, (byte) -27, var8);
                this.method419(65536, var7, (byte) -27, var8 + 1);
            }
            if (arg2 == 3) {
                this.method419(16384, var7, (byte) -27, var8);
                this.method419(1024, var7 - 1, (byte) -27, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method419(512, var7, (byte) -27, var8);
                this.method419(8192, var7 + 1, (byte) -27, var8 - 1);
            }
            if (arg2 == 1) {
                this.method419(2048, var7, (byte) -27, var8);
                this.method419(32768, var7 + 1, (byte) -27, var8 + 1);
            }
            if (arg2 == 2) {
                this.method419(8192, var7, (byte) -27, var8);
                this.method419(512, var7 - 1, (byte) -27, var8 + 1);
            }
            if (arg2 == 3) {
                this.method419(32768, var7, (byte) -27, var8);
                this.method419(2048, var7 - 1, (byte) -27, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method419(66560, var7, (byte) -27, var8);
            this.method419(4096, var7, (byte) -27, var8 - 1);
            this.method419(16384, var7 + 1, (byte) -27, var8);
        }
        if (arg2 == 1) {
            this.method419(5120, var7, (byte) -27, var8);
            this.method419(16384, var7 + 1, (byte) -27, var8);
            this.method419(65536, var7, (byte) -27, var8 + 1);
        }
        if (arg2 == 2) {
            this.method419(20480, var7, (byte) -27, var8);
            this.method419(65536, var7, (byte) -27, var8 + 1);
            this.method419(1024, var7 - 1, (byte) -27, var8);
        }
        if (arg2 == 3) {
            this.method419(81920, var7, (byte) -27, var8);
            this.method419(1024, var7 - 1, (byte) -27, var8);
            this.method419(4096, var7, (byte) -27, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(III)V", line = 859)
    public final void method421(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field880;
        int var5 = arg1 - this.field885;
        this.field879[var4][var5] = class280.method2001(this.field879[var4][var5], -262145);
        if (arg2 <= 59) {
            this.field907 = -49;
        }
        field888++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBIIIII)Z", line = 875)
    public final boolean method422(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field906++;
        if (arg7 == 1) {
            if (arg0 == arg6 && arg1 == arg3) {
                return true;
            }
        } else if (arg6 <= arg0 && arg7 + arg6 - 1 >= arg0 && arg1 >= arg1 && arg1 <= arg7 + arg1 - 1) {
            return true;
        }
        int var9 = arg6 - this.field880;
        int var10 = arg0 - this.field880;
        int var11 = arg3 - this.field885;
        if (arg2 >= -37) {
            this.method416(45, -68, (byte) 13, 120);
        }
        int var12 = arg1 - this.field885;
        if (arg7 == 1) {
            if (arg4 == 0) {
                if (arg5 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field879[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field879[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field879[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field879[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field879[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field879[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field879[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field879[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field879[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field879[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field879[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field879[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field879[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field879[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field879[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field879[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field879[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field879[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field879[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field879[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg7 - 1;
            int var14 = arg7 + var11 - 1;
            if (arg4 == 0) {
                if (arg5 == 0) {
                    if (var10 - arg7 == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 + 1) == var11 && (this.field879[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 - arg7) == var11 && (this.field879[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 >= var9 && var10 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 - arg7 == var9 && var11 <= var12 && var14 >= var12 && (this.field879[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12 && (this.field879[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field879[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg7 == var11 && (this.field879[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 <= var10 && var13 >= var10 && (var12 - arg7) == var11) {
                        return true;
                    }
                    if (var10 - arg7 == var9 && var11 <= var12 && var12 <= var14 && (this.field879[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14 && (this.field879[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    if (var10 - arg7 == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12 && (this.field879[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 - arg7) == var11 && (this.field879[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - arg7) == var9 && var12 >= var11 && var14 >= var12 && (this.field879[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 - arg7) == var11 && (this.field879[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg7 == var9 && var12 >= var11 && var12 <= var14 && (this.field879[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field879[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 - arg7 == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 - arg7) == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 + 1) == var11 && (this.field879[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var14 && (this.field879[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg7 == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field879[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 <= var10 && var13 >= var10 && (var12 - arg7) == var11 && (this.field879[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var10 - arg7 == var9 && var11 <= var12 && var12 <= var14 && (this.field879[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var14 && (this.field879[var9][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI[Lsj;)V", line = 1244)
    public static final void method423(boolean arg0, int arg1, class56[] arg2) {
        field902++;
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class250.field3857[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class250.field3857[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method415(var5, 0, var4);
                            }
                        }
                    }
                }
            }
            class191.field3058 += (int) (Math.random() * 5.0D) - 2;
            class100.field1644 += (int) (Math.random() * 5.0D) - 2;
            if (class100.field1644 < -8) {
                class100.field1644 = -8;
            }
            if (class100.field1644 > 8) {
                class100.field1644 = 8;
            }
            if (class191.field3058 < -16) {
                class191.field3058 = -16;
            }
            if (class191.field3058 > 16) {
                class191.field3058 = 16;
            }
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class100.field1644 >> 2 << 10;
        int var9 = class191.field3058 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        int var12 = 0;
        if (arg1 > -79) {
            method408(-103);
        }
        while (var12 < var7) {
            byte[][] var13 = class295.field4667[var12];
            if (!class265.field4126) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        byte var18 = 74;
                        int var19 = class29.field475[var12][var17 + 1][var16] - class29.field475[var12][var17 - 1][var16];
                        int var20 = class29.field475[var12][var17][var16 + 1] - class29.field475[var12][var17][var16 - 1];
                        int var21 = (int) Math.sqrt((double) (var19 * var19 + (var20 * var20) + 65536));
                        int var22 = (var19 << 8) / var21;
                        int var23 = -65536 / var21;
                        int var24 = (var20 << 8) / var21;
                        int var25 = (var22 * -50 + var23 * -10 + (var24 * -50)) / var15 + var18;
                        int var26 = (var13[var17 - 1][var16] >> 2) + (var13[var17 + 1][var16] >> 3) + (var13[var17][var16 + -1] >> 2) + (var13[var17][var16 - -1] >> 3) + (var13[var17][var16] >> 1);
                        var11[var17][var16] = var25 - var26;
                    }
                }
            } else if (class302.field4753) {
                for (int var43 = 1; var43 < 103; var43++) {
                    for (int var44 = 1; var44 < 103; var44++) {
                        byte var45 = 74;
                        int var46 = (var13[var44][var43 + 1] >> 3) + (var13[var44][var43 - 1] >> 2) + (var13[var44 + 1][var43] >> 3) + (var13[var44 - 1][var43] >> 2) + (var13[var44][var43] >> 1);
                        var11[var44][var43] = var45 - var46;
                    }
                }
            } else {
                int var27 = (int) class97.field1620[0];
                int var28 = (int) class97.field1620[2];
                int var29 = (int) class97.field1620[1];
                int var30 = (int) Math.sqrt((double) (var27 * var27 + (var29 * var29 + (var28 * var28))));
                int var31 = var30 * 1024 >> 8;
                for (int var32 = 1; var32 < 103; var32++) {
                    for (int var33 = 1; var33 < 103; var33++) {
                        byte var34 = 96;
                        int var35 = class29.field475[var12][var33 + 1][var32] - class29.field475[var12][var33 - 1][var32];
                        int var36 = class29.field475[var12][var33][var32 + 1] - class29.field475[var12][var33][var32 - 1];
                        int var37 = (int) Math.sqrt((double) (var35 * var35 + var36 * var36 + 65536));
                        int var38 = (var36 << 8) / var37;
                        int var39 = (var35 << 8) / var37;
                        int var40 = -65536 / var37;
                        int var41 = (var27 * var39 + var29 * var40 + (var28 * var38)) / var31 + var34;
                        int var42 = (var13[var33][var32 - 1] >> 2) + ((var13[var33 - 1][var32] >> 2) + (var13[var33 + 1][var32] >> 3) + (var13[var33][var32 + 1] >> 3) + (var13[var33][var32] >> 1));
                        var11[var33][var32] = var41 - ((int) ((float) var42 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class179.field2863[var47] = 0;
                class87.field1337[var47] = 0;
                class263.field4071[var47] = 0;
                class139.field2215[var47] = 0;
                class115.field1886[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class100.field1647[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class261 var52 = class263.method1869(var51 - 1, -832959923);
                            class179.field2863[var49] += var52.field4056;
                            class87.field1337[var49] += var52.field4057;
                            class263.field4071[var49] += var52.field4044;
                            class139.field2215[var49] += var52.field4059;
                            var10002 = class115.field1886[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class100.field1647[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class261 var55 = class263.method1869(var54 - 1, -832959923);
                            class179.field2863[var49] -= var55.field4056;
                            class87.field1337[var49] -= var55.field4057;
                            class263.field4071[var49] -= var55.field4044;
                            class139.field2215[var49] -= var55.field4059;
                            var10002 = class115.field1886[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 + 5;
                        if (var62 < 104) {
                            var59 += class115.field1886[var62];
                            var57 += class87.field1337[var62];
                            var56 += class179.field2863[var62];
                            var58 += class263.field4071[var62];
                            var60 += class139.field2215[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var57 -= class87.field1337[var63];
                            var58 -= class263.field4071[var63];
                            var56 -= class179.field2863[var63];
                            var60 -= class139.field2215[var63];
                            var59 -= class115.field1886[var63];
                        }
                        if (var61 >= 0 && var59 > 0) {
                            var10[var48][var61] = class185.method1390(var57 / var59, var58 / var59, (byte) 75, var56 * 256 / var60);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label773: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg0 || class34.method248(-110) || (class250.field3857[0][var64][var65] & 0x2) != 0 || (class250.field3857[var12][var64][var65] & 0x10) == 0 && class189.method1407(true, var64, var12, var65) == class273.field4247) {
                        if (var12 < class92.field1522) {
                            class92.field1522 = var12;
                        }
                        int var66 = class100.field1647[var12][var64][var65] & 0xFF;
                        int var67 = class193.field3069[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class29.field475[var12][var64][var65];
                            int var69 = class29.field475[var12][var64 + 1][var65 + 1];
                            int var70 = class29.field475[var12][var64 + 1][var65];
                            int var71 = class29.field475[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class74.field1136[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class107.method819(var67 - 1, 16173).field5026) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var70 && var68 == var69 && var68 == var71) {
                                    class151.field2426[var12][var64][var65] = class94.method673(class151.field2426[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var76;
                            if (var66 > 0) {
                                var73 = var10[var64][var65];
                                int var74 = (var73 & 0x7F) + var9;
                                if (var74 < 0) {
                                    var74 = 0;
                                } else if (var74 > 127) {
                                    var74 = 127;
                                }
                                int var75 = (var73 + var8 & 0xFC00) + (var73 & 0x380) + var74;
                                var76 = class174.field2740[class94.method676(var75, 127, 96)];
                            } else {
                                var73 = -1;
                                var76 = 0;
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65 + 1];
                            int var79 = var11[var64 + 1][var65];
                            int var80 = var11[var64][var65 + 1];
                            if (var67 == 0) {
                                method417(var12, var64, var65, 0, 0, -1, var68, var70, var69, var71, class94.method676(var73, 127, var77), class94.method676(var73, 127, var79), class94.method676(var73, 127, var78), class94.method676(var73, 127, var80), 0, 0, 0, 0, var76, 0);
                                if (class265.field4126 && var12 > 0 && var73 != -1 && class263.method1869(var66 - 1, -832959923).field4045) {
                                    class69.method530(0, 0, true, false, var64, var65, var68 - class29.field475[0][var64][var65], -class29.field475[0][var64 + 1][var65] + var70, var69 - class29.field475[0][var64 + 1][var65 + 1], -class29.field475[0][var64][var65 - -1] + var71);
                                }
                                if (class265.field4126 && !arg0 && class128.field2046 != null && var12 == 0) {
                                    for (int var96 = var64 - 1; var96 <= var64 + 1; var96++) {
                                        for (int var97 = var65 - 1; var97 <= var65 + 1; var97++) {
                                            if ((var64 != var96 || var65 != var97) && var96 >= 0 && var96 < 104 && var97 >= 0 && var97 < 104) {
                                                int var98 = class193.field3069[var12][var96][var97] & 0xFF;
                                                if (var98 != 0) {
                                                    class323 var99 = class107.method819(var98 - 1, 16173);
                                                    if (var99.field5016 != -1 && class174.field2734.method1478(255, var99.field5016) == 4) {
                                                        class128.field2046[var64][var65] = (var99.field5025 << 24) + var99.field5014;
                                                        continue label773;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var81 = class294.field4640[var12][var64][var65];
                                int var82 = class74.field1136[var12][var64][var65] + 1;
                                class323 var83 = class107.method819(var67 - 1, 16173);
                                if (class265.field4126 && !arg0 && class128.field2046 != null && var12 == 0) {
                                    if (var83.field5016 != -1 && class174.field2734.method1478(255, var83.field5016) == 4) {
                                        class128.field2046[var64][var65] = (var83.field5025 << 24) + var83.field5014;
                                    } else {
                                        label739: for (int var84 = var64 - 1; var84 <= var64 + 1; var84++) {
                                            for (int var85 = var65 - 1; var85 <= (var65 + 1); var85++) {
                                                if ((var64 != var84 || var65 != var85) && var84 >= 0 && var84 < 104 && var85 >= 0 && var85 < 104) {
                                                    int var86 = class193.field3069[var12][var84][var85] & 0xFF;
                                                    if (var86 != 0) {
                                                        class323 var87 = class107.method819(var86 - 1, 16173);
                                                        if (var87.field5016 != -1 && class174.field2734.method1478(255, var87.field5016) == 4) {
                                                            class128.field2046[var64][var65] = (var87.field5025 << 24) + var87.field5014;
                                                            break label739;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var88 = var83.field5016;
                                if (var88 >= 0 && !class174.field2734.method1486(-127, var88)) {
                                    var88 = -1;
                                }
                                int var89;
                                int var90;
                                if (var88 >= 0) {
                                    var89 = -1;
                                    var90 = class174.field2740[class231.method1668(class174.field2734.method1476(65535, var88), 86, 96)];
                                } else if (var83.field5008 == -1) {
                                    var90 = 0;
                                    var89 = -2;
                                } else {
                                    var89 = var83.field5008;
                                    int var91 = (var89 & 0x7F) + var9;
                                    if (var91 < 0) {
                                        var91 = 0;
                                    } else if (var91 > 127) {
                                        var91 = 127;
                                    }
                                    int var92 = (var8 + var89 & 0xFC00) + (var89 & 0x380) + var91;
                                    var90 = class174.field2740[class231.method1668(var92, 119, 96)];
                                }
                                if (var83.field5021 >= 0) {
                                    int var93 = var83.field5021;
                                    int var94 = (var93 & 0x7F) + var9;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var93 & 0x380) + (var93 + var8 & 0xFC00) + var94;
                                    var90 = class174.field2740[class231.method1668(var95, 90, 96)];
                                }
                                method417(var12, var64, var65, var82, var81, var88, var68, var70, var69, var71, class94.method676(var73, 127, var77), class94.method676(var73, 127, var79), class94.method676(var73, 127, var78), class94.method676(var73, 127, var80), class231.method1668(var89, 92, var77), class231.method1668(var89, 113, var79), class231.method1668(var89, 92, var78), class231.method1668(var89, 85, var80), var76, var90);
                                if (class265.field4126 && var12 > 0) {
                                    class69.method530(var82, var81, var89 == -2 || !var83.field5011, var73 == -1 || !class263.method1869(var66 - 1, -832959923).field4045, var64, var65, var68 - class29.field475[0][var64][var65], -class29.field475[0][var64 + 1][var65] + var70, var69 - class29.field475[0][var64 + 1][var65 + 1], -class29.field475[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class265.field4126) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                int[][] var102 = class29.field475[var12];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg0) {
                            class186[] var109 = class63.method459(class100.field1647[var12], (byte) 83, var11, class250.field3857, var100, var10, var12, class74.field1136[var12], var101, class128.field2046, class294.field4640[var12], class29.field475[var12], var103, class193.field3069[var12], class298.field4701[0]);
                            class148.method1148(var12, var109);
                            break;
                        }
                        class186[] var110 = class63.method459(class100.field1647[var12], (byte) 105, var11, class250.field3857, var100, var10, var12, class74.field1136[var12], var101, (int[][]) null, class294.field4640[var12], class29.field475[var12], var103, class193.field3069[var12], (int[][]) null);
                        class186[] var111 = class100.method721(var103, (byte) -104, class250.field3857, var12, var11, class29.field475[var12], class100.field1647[var12], var100, class193.field3069[var12], class74.field1136[var12], class294.field4640[var12], var101);
                        class186[] var112 = new class186[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class148.method1148(var12, var112);
                        class258.method1820(class38.field678, var103, class294.field4640[var12], class74.field1136[var12], class100.field1647[var12], var100, class29.field475[var12], var12, var101, class38.field693, class193.field3069[var12], 99);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var102[var105 + 1][var104] - var102[var105 - 1][var104];
                        int var107 = var102[var105][var104 + 1] - var102[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 + ((var107 * var107) + 65536)));
                        var101[var105][var104] = (float) var106 / var108;
                        var100[var105][var104] = -256.0F / var108;
                        var103[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class100.field1647[var12] = (byte[][]) null;
            class193.field3069[var12] = (byte[][]) null;
            class74.field1136[var12] = (byte[][]) null;
            class294.field4640[var12] = (byte[][]) null;
            class295.field4667[var12] = (byte[][]) null;
            var12++;
        }
        class127.method952(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class250.field3857[1][var115][var116] & 0x2) == 2) {
                    class125.method946(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class151.field2426[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class151.field2426[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121 = var117;
                        int var122 = var118;
                        int var123 = var117;
                        while (var122 < 104 && (class151.field2426[var117][var119][var122 + 1] & 0x1) != 0) {
                            var122++;
                        }
                        label455: while (var121 > 0) {
                            for (int var124 = var120; var124 <= var122; var124++) {
                                if ((class151.field2426[var121 - 1][var119][var124] & 0x1) == 0) {
                                    break label455;
                                }
                            }
                            var121--;
                        }
                        label444: while (var123 < 3) {
                            for (int var125 = var120; var125 <= var122; var125++) {
                                if ((class151.field2426[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label444;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var122 + 1 - var120) * (var123 + 1 - var121);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class29.field475[var123][var119][var120] - var127;
                            int var129 = class29.field475[var121][var119][var120];
                            class317.method2178(1, var119 * 128, var119 * 128, var120 * 128, var122 * 128 + 128, var128, var129);
                            for (int var130 = var121; var130 <= var123; var130++) {
                                for (int var131 = var120; var131 <= var122; var131++) {
                                    class151.field2426[var130][var119][var131] = class280.method2001(class151.field2426[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class151.field2426[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var119;
                        int var133 = var119;
                        while (var132 < 104 && (class151.field2426[var117][var132 + 1][var118] & 0x2) != 0) {
                            var132++;
                        }
                        int var134 = var117;
                        while (var133 > 0 && (class151.field2426[var117][var133 - 1][var118] & 0x2) != 0) {
                            var133--;
                        }
                        int var135 = var117;
                        label509: while (var134 > 0) {
                            for (int var136 = var133; var136 <= var132; var136++) {
                                if ((class151.field2426[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label509;
                                }
                            }
                            var134--;
                        }
                        label498: while (var135 < 3) {
                            for (int var137 = var133; var137 <= var132; var137++) {
                                if ((class151.field2426[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label498;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var135 + 1 - var134) * (var132 + 1 - var133);
                        if (var138 >= 8) {
                            int var139 = class29.field475[var134][var133][var118];
                            short var140 = 240;
                            int var141 = class29.field475[var135][var133][var118] - var140;
                            class317.method2178(2, var133 * 128, var132 * 128 + 128, var118 * 128, var118 * 128, var141, var139);
                            for (int var142 = var134; var142 <= var135; var142++) {
                                for (int var143 = var133; var143 <= var132; var143++) {
                                    class151.field2426[var142][var143][var118] = class280.method2001(class151.field2426[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class151.field2426[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145;
                        for (var145 = var118; var145 > 0 && (class151.field2426[var117][var119][var145 - 1] & 0x4) != 0; var145--) {
                        }
                        int var146 = var119;
                        int var147;
                        for (var147 = var118; var147 < 104 && (class151.field2426[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        label564: while (var144 > 0) {
                            for (int var148 = var145; var148 <= var147; var148++) {
                                if ((class151.field2426[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label564;
                                }
                            }
                            var144--;
                        }
                        label553: while (var146 < 104) {
                            for (int var149 = var145; var149 <= var147; var149++) {
                                if ((class151.field2426[var117][var146 + 1][var149] & 0x4) == 0) {
                                    break label553;
                                }
                            }
                            var146++;
                        }
                        if (((var147 + 1 - var145) * (var146 + 1 - var144)) >= 4) {
                            int var150 = class29.field475[var117][var144][var145];
                            class317.method2178(4, var144 * 128, var146 * 128 + 128, var145 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var146; var151++) {
                                for (int var152 = var145; var152 <= var147; var152++) {
                                    class151.field2426[var117][var151][var152] = class280.method2001(class151.field2426[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIB)Z", line = 2220)
    public final boolean method424(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = 63 / ((-arg4 - 5) / 44);
        field904++;
        if (arg1 == arg3 && arg0 == arg2) {
            return true;
        }
        int var7 = arg1 - this.field880;
        int var8 = arg0 - this.field885;
        if (var7 < 0 || var7 >= this.field884 || var8 < 0 || var8 >= this.field907) {
            return false;
        }
        int var9 = arg3 - this.field880;
        int var10;
        if (var7 <= var9) {
            var10 = var9 - var7;
        } else {
            var10 = var7 - var9;
        }
        int var11 = arg2 - this.field885;
        int var12;
        if (var11 < var8) {
            var12 = var8 - var11;
        } else {
            var12 = var11 - var8;
        }
        if (var10 <= var12) {
            int var13 = var10 * 65536 / var12;
            int var14 = 32768;
            while (var8 != var11) {
                if (var8 > var11) {
                    if ((this.field879[var9][var11] & 0x12C0102) != 0) {
                        return false;
                    }
                    var11++;
                } else if (var8 < var11) {
                    if ((this.field879[var9][var11] & 0x12C0120) != 0) {
                        return false;
                    }
                    var11--;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var7 > var9) {
                        if ((this.field879[var9][var11] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var7) {
                        if ((this.field879[var9][var11] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var15 = 32768;
            int var16 = var12 * 65536 / var10;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field879[var9][var11] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field879[var9][var11] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var11 < var8) {
                        if ((this.field879[var9][var11] & 0x12C0102) != 0) {
                            return false;
                        }
                        var11++;
                    } else if (var8 < var11) {
                        if ((this.field879[var9][var11] & 0x12C0120) != 0) {
                            return false;
                        }
                        var11--;
                    }
                }
            }
        }
        return (this.field879[var7][var8] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIIIIIIII)Z", line = 2373)
    public final boolean method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field897++;
        if (arg4 <= 1) {
            int var10 = arg0 + arg6 - 1;
            int var11 = arg8 + arg7 - 1;
            if (arg2 >= -39) {
                this.method415(-101, 114, -21);
            }
            if (arg6 <= arg3 && arg3 <= var10 && arg8 <= arg1 && var11 >= arg1) {
                return true;
            } else if ((arg6 - 1) == arg3 && arg8 <= arg1 && var11 >= arg1 && (this.field879[arg3 - this.field880][arg1 - this.field885] & 0x8) == 0 && (arg5 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg3 && arg8 <= arg1 && var11 >= arg1 && (this.field879[arg3 - this.field880][arg1 - this.field885] & 0x80) == 0 && (arg5 & 0x2) == 0) {
                return true;
            } else if ((arg8 - 1) == arg1 && arg3 >= arg6 && var10 >= arg3 && (this.field879[arg3 - this.field880][arg1 - this.field885] & 0x2) == 0 && (arg5 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg1 && arg3 >= arg6 && arg3 <= var10 && (this.field879[arg3 - this.field880][arg1 - this.field885] & 0x20) == 0 && (arg5 & 0x1) == 0;
            }
        } else if (this.method411(arg0, arg6, arg3, arg4, arg4, arg7, arg1, arg8, 2)) {
            return true;
        } else {
            return this.method409(arg4, arg6, arg8, arg7, arg3, arg0, arg1, (byte) 67, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(III)V", line = 2416)
    public final void method426(int arg0, int arg1, int arg2) {
        field881++;
        int var4 = arg2 - this.field885;
        int var5 = arg0 - this.field880;
        this.field879[var5][var4] = class94.method673(this.field879[var5][var4], 262144);
        if (arg1 >= -63) {
            this.field884 = -56;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZIIII)V", line = 2435)
    public final void method427(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field880;
        int var8 = arg2 - this.field885;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method416(var7, var8, (byte) 116, 128);
                this.method416(var7 - 1, var8, (byte) 127, 8);
            }
            if (arg5 == 1) {
                this.method416(var7, var8, (byte) 117, 2);
                this.method416(var7, var8 + 1, (byte) 125, 32);
            }
            if (arg5 == 2) {
                this.method416(var7, var8, (byte) 127, 8);
                this.method416(var7 + 1, var8, (byte) 122, 128);
            }
            if (arg5 == 3) {
                this.method416(var7, var8, (byte) 126, 32);
                this.method416(var7, var8 - 1, (byte) 118, 2);
            }
        }
        field887++;
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method416(var7, var8, (byte) 118, 1);
                this.method416(var7 - 1, var8 + 1, (byte) 123, 16);
            }
            if (arg5 == 1) {
                this.method416(var7, var8, (byte) 124, 4);
                this.method416(var7 + 1, var8 + 1, (byte) 126, 64);
            }
            if (arg5 == 2) {
                this.method416(var7, var8, (byte) 126, 16);
                this.method416(var7 + 1, var8 - 1, (byte) 125, 1);
            }
            if (arg5 == 3) {
                this.method416(var7, var8, (byte) 126, 64);
                this.method416(var7 - 1, var8 + -1, (byte) 124, 4);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method416(var7, var8, (byte) 116, 130);
                this.method416(var7 - 1, var8, (byte) 125, 8);
                this.method416(var7, var8 + 1, (byte) 116, 32);
            }
            if (arg5 == 1) {
                this.method416(var7, var8, (byte) 125, 10);
                this.method416(var7, var8 + 1, (byte) 121, 32);
                this.method416(var7 + 1, var8, (byte) 123, 128);
            }
            if (arg5 == 2) {
                this.method416(var7, var8, (byte) 121, 40);
                this.method416(var7 + 1, var8, (byte) 116, 128);
                this.method416(var7, var8 - 1, (byte) 118, 2);
            }
            if (arg5 == 3) {
                this.method416(var7, var8, (byte) 122, 160);
                this.method416(var7, var8 - 1, (byte) 118, 2);
                this.method416(var7 - 1, var8, (byte) 118, 8);
            }
        }
        if (arg3 > -19 || !arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method416(var7, var8, (byte) 117, 65536);
                this.method416(var7 - 1, var8, (byte) 125, 4096);
            }
            if (arg5 == 1) {
                this.method416(var7, var8, (byte) 120, 1024);
                this.method416(var7, var8 + 1, (byte) 123, 16384);
            }
            if (arg5 == 2) {
                this.method416(var7, var8, (byte) 121, 4096);
                this.method416(var7 + 1, var8, (byte) 127, 65536);
            }
            if (arg5 == 3) {
                this.method416(var7, var8, (byte) 124, 16384);
                this.method416(var7, var8 - 1, (byte) 121, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method416(var7, var8, (byte) 124, 512);
                this.method416(var7 - 1, var8 - -1, (byte) 118, 8192);
            }
            if (arg5 == 1) {
                this.method416(var7, var8, (byte) 125, 2048);
                this.method416(var7 + 1, var8 + 1, (byte) 121, 32768);
            }
            if (arg5 == 2) {
                this.method416(var7, var8, (byte) 126, 8192);
                this.method416(var7 + 1, var8 + -1, (byte) 121, 512);
            }
            if (arg5 == 3) {
                this.method416(var7, var8, (byte) 118, 32768);
                this.method416(var7 - 1, var8 + -1, (byte) 127, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method416(var7, var8, (byte) 124, 66560);
            this.method416(var7 - 1, var8, (byte) 122, 4096);
            this.method416(var7, var8 + 1, (byte) 117, 16384);
        }
        if (arg5 == 1) {
            this.method416(var7, var8, (byte) 122, 5120);
            this.method416(var7, var8 + 1, (byte) 123, 16384);
            this.method416(var7 + 1, var8, (byte) 125, 65536);
        }
        if (arg5 == 2) {
            this.method416(var7, var8, (byte) 118, 20480);
            this.method416(var7 + 1, var8, (byte) 120, 65536);
            this.method416(var7, var8 - 1, (byte) 118, 1024);
        }
        if (arg5 == 3) {
            this.method416(var7, var8, (byte) 118, 81920);
            this.method416(var7, var8 - 1, (byte) 117, 1024);
            this.method416(var7 - 1, var8, (byte) 121, 4096);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(II)V", line = 2644)
    public class56(int arg0, int arg1) {
        this.field907 = arg1;
        this.field880 = 0;
        this.field884 = arg0;
        this.field879 = new int[this.field884][this.field907];
        this.field885 = 0;
        this.method414(-17697);
    }
}
