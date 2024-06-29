import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class72 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field886 = -1;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field895 = "Connection lost.";

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Lne;")
    public static class172 field897 = null;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "[I")
    public static int[] field894 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "[[I")
    public int[][] field889;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BIIZIZI)V", line = 7)
    public final void method447(byte arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field896;
        field907++;
        int var9 = arg6 - this.field911;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method454(128, var8, (byte) -31, var9);
                this.method454(8, var8 - 1, (byte) -31, var9);
            }
            if (arg1 == 1) {
                this.method454(2, var8, (byte) -31, var9);
                this.method454(32, var8, (byte) -31, var9 + 1);
            }
            if (arg1 == 2) {
                this.method454(8, var8, (byte) -31, var9);
                this.method454(128, var8 + 1, (byte) -31, var9);
            }
            if (arg1 == 3) {
                this.method454(32, var8, (byte) -31, var9);
                this.method454(2, var8, (byte) -31, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method454(1, var8, (byte) -31, var9);
                this.method454(16, var8 - 1, (byte) -31, var9 + 1);
            }
            if (arg1 == 1) {
                this.method454(4, var8, (byte) -31, var9);
                this.method454(64, var8 + 1, (byte) -31, var9 + 1);
            }
            if (arg1 == 2) {
                this.method454(16, var8, (byte) -31, var9);
                this.method454(1, var8 + 1, (byte) -31, var9 - 1);
            }
            if (arg1 == 3) {
                this.method454(64, var8, (byte) -31, var9);
                this.method454(4, var8 - 1, (byte) -31, var9 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method454(130, var8, (byte) -31, var9);
                this.method454(8, var8 - 1, (byte) -31, var9);
                this.method454(32, var8, (byte) -31, var9 + 1);
            }
            if (arg1 == 1) {
                this.method454(10, var8, (byte) -31, var9);
                this.method454(32, var8, (byte) -31, var9 + 1);
                this.method454(128, var8 + 1, (byte) -31, var9);
            }
            if (arg1 == 2) {
                this.method454(40, var8, (byte) -31, var9);
                this.method454(128, var8 + 1, (byte) -31, var9);
                this.method454(2, var8, (byte) -31, var9 - 1);
            }
            if (arg1 == 3) {
                this.method454(160, var8, (byte) -31, var9);
                this.method454(2, var8, (byte) -31, var9 - 1);
                this.method454(8, var8 - 1, (byte) -31, var9);
            }
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    this.method454(65536, var8, (byte) -31, var9);
                    this.method454(4096, var8 - 1, (byte) -31, var9);
                }
                if (arg1 == 1) {
                    this.method454(1024, var8, (byte) -31, var9);
                    this.method454(16384, var8, (byte) -31, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method454(4096, var8, (byte) -31, var9);
                    this.method454(65536, var8 + 1, (byte) -31, var9);
                }
                if (arg1 == 3) {
                    this.method454(16384, var8, (byte) -31, var9);
                    this.method454(1024, var8, (byte) -31, var9 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg1 == 0) {
                    this.method454(512, var8, (byte) -31, var9);
                    this.method454(8192, var8 - 1, (byte) -31, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method454(2048, var8, (byte) -31, var9);
                    this.method454(32768, var8 + 1, (byte) -31, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method454(8192, var8, (byte) -31, var9);
                    this.method454(512, var8 + 1, (byte) -31, var9 - 1);
                }
                if (arg1 == 3) {
                    this.method454(32768, var8, (byte) -31, var9);
                    this.method454(2048, var8 - 1, (byte) -31, var9 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    this.method454(66560, var8, (byte) -31, var9);
                    this.method454(4096, var8 - 1, (byte) -31, var9);
                    this.method454(16384, var8, (byte) -31, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method454(5120, var8, (byte) -31, var9);
                    this.method454(16384, var8, (byte) -31, var9 + 1);
                    this.method454(65536, var8 + 1, (byte) -31, var9);
                }
                if (arg1 == 2) {
                    this.method454(20480, var8, (byte) -31, var9);
                    this.method454(65536, var8 + 1, (byte) -31, var9);
                    this.method454(1024, var8, (byte) -31, var9 - 1);
                }
                if (arg1 == 3) {
                    this.method454(81920, var8, (byte) -31, var9);
                    this.method454(1024, var8, (byte) -31, var9 - 1);
                    this.method454(4096, var8 - 1, (byte) -31, var9);
                }
            }
        }
        if (arg0 > -70 || !arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method454(536870912, var8, (byte) -31, var9);
                this.method454(33554432, var8 - 1, (byte) -31, var9);
            }
            if (arg1 == 1) {
                this.method454(8388608, var8, (byte) -31, var9);
                this.method454(134217728, var8, (byte) -31, var9 + 1);
            }
            if (arg1 == 2) {
                this.method454(33554432, var8, (byte) -31, var9);
                this.method454(536870912, var8 + 1, (byte) -31, var9);
            }
            if (arg1 == 3) {
                this.method454(134217728, var8, (byte) -31, var9);
                this.method454(8388608, var8, (byte) -31, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method454(4194304, var8, (byte) -31, var9);
                this.method454(67108864, var8 - 1, (byte) -31, var9 + 1);
            }
            if (arg1 == 1) {
                this.method454(16777216, var8, (byte) -31, var9);
                this.method454(268435456, var8 + 1, (byte) -31, var9 + 1);
            }
            if (arg1 == 2) {
                this.method454(67108864, var8, (byte) -31, var9);
                this.method454(4194304, var8 + 1, (byte) -31, var9 - 1);
            }
            if (arg1 == 3) {
                this.method454(268435456, var8, (byte) -31, var9);
                this.method454(16777216, var8 - 1, (byte) -31, var9 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method454(545259520, var8, (byte) -31, var9);
            this.method454(33554432, var8 - 1, (byte) -31, var9);
            this.method454(134217728, var8, (byte) -31, var9 + 1);
        }
        if (arg1 == 1) {
            this.method454(41943040, var8, (byte) -31, var9);
            this.method454(134217728, var8, (byte) -31, var9 + 1);
            this.method454(536870912, var8 + 1, (byte) -31, var9);
        }
        if (arg1 == 2) {
            this.method454(167772160, var8, (byte) -31, var9);
            this.method454(536870912, var8 + 1, (byte) -31, var9);
            this.method454(8388608, var8, (byte) -31, var9 - 1);
        }
        if (arg1 == 3) {
            this.method454(671088640, var8, (byte) -31, var9);
            this.method454(8388608, var8, (byte) -31, var9 - 1);
            this.method454(33554432, var8 - 1, (byte) -31, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Lqa;", line = 313)
    public static final class133 method448(byte arg0, int arg1) {
        field898++;
        class133 var2 = (class133) class377.field5696.method1660(2, (long) arg1);
        if (arg0 >= -42) {
            field894 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class219.field3624.method2771(0, arg1, 3);
        } else {
            var3 = class211.field3375.method2771(0, arg1 & 0x7FFF, 3);
        }
        class133 var4 = new class133();
        if (var3 != null) {
            var4.method980(-1, new class186(var3));
        }
        if (arg1 >= 32768) {
            var4.method978(119);
        }
        class377.field5696.method1655(false, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIZI)V", line = 346)
    public final void method449(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field888++;
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var10 = arg2 - this.field896;
        if (arg7 == 1 || arg7 == 3) {
            int var11 = arg4;
            arg4 = arg3;
            arg3 = var11;
        }
        int var12 = arg5 - this.field911;
        if (arg1 != -7022) {
            this.method458(-46, 43, 42, -32, 34, false, true);
        }
        for (int var13 = var10; var13 < (arg4 + var10); var13++) {
            if (var13 >= 0 && var13 < this.field891) {
                for (int var14 = var12; var14 < arg3 + var12; var14++) {
                    if (var14 >= 0 && var14 < this.field908) {
                        this.method450(var9, (byte) -51, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBII)V", line = 401)
    private final void method450(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -51) {
            this.field889 = null;
        }
        this.field889[arg3][arg2] = class37.method242(this.field889[arg3][arg2], ~arg0);
        field901++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 416)
    public static void method451(byte arg0) {
        field895 = null;
        if (arg0 <= 41) {
            field897 = null;
        }
        field894 = null;
        field897 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V", line = 428)
    public final void method452(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field896;
        int var5 = arg1 - this.field911;
        field892++;
        this.field889[var4][var5] = class35.method227(this.field889[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)V", line = 440)
    public final void method453(int arg0, int arg1, int arg2) {
        field893++;
        int var4 = arg2 - this.field911;
        int var5 = arg0 - this.field896;
        if (arg1 != -23274) {
            this.method457(101, -8, 91, -91, -30, -36, 58, 29, -116);
        }
        this.field889[var5][var4] = class35.method227(this.field889[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIBI)V", line = 455)
    private final void method454(int arg0, int arg1, byte arg2, int arg3) {
        this.field889[arg1][arg3] = class35.method227(this.field889[arg1][arg3], arg0);
        if (arg2 != -31) {
            this.method459(true, -41, 48, -26, -60, -43, false);
        }
        field890++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIIII)Z", line = 467)
    public final boolean method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 != 28303) {
            return true;
        }
        field905++;
        int var11 = arg4 + arg5;
        int var12 = arg7 + arg9;
        int var13 = arg2 + arg6;
        int var14 = arg1 + arg3;
        if (arg4 == var13 && (arg0 & 0x2) == 0) {
            int var15 = arg7 > arg3 ? arg7 : arg3;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field889[var13 - this.field896 - 1][var15 - this.field911] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg6 == var11 && (arg0 & 0x8) == 0) {
            int var17 = arg3 < arg7 ? arg7 : arg3;
            int var18 = var12 < var14 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field889[arg6 - this.field896][var17 - this.field911] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg0 & 0x1) == 0) {
            int var19 = arg4 <= arg6 ? arg6 : arg4;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field889[var19 - this.field896][var14 - this.field911 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg0 & 0x4) == 0) {
            int var21 = arg6 >= arg4 ? arg6 : arg4;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field889[var21 - this.field896][arg3 - this.field911] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZI)I", line = 562)
    public static final int method456(int arg0, boolean arg1, int arg2) {
        field906++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg1) {
                method461(108);
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIII)Z", line = 605)
    public final boolean method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field899++;
        if (arg2 > 1) {
            return class62.method407(arg2, arg2, true, arg4, arg6, arg0, arg8, arg1, arg7) ? true : this.method455(arg3, arg1, arg8, arg6, arg0, arg2, arg7, arg4, 28303, arg2);
        }
        int var10 = arg7 + arg8 - 1;
        int var11 = arg6 + arg1 - 1;
        if (arg7 <= arg0 && var10 >= arg0 && arg4 >= arg6 && var11 >= arg4) {
            return true;
        } else if ((arg7 - 1) == arg0 && arg4 >= arg6 && arg4 <= var11 && (this.field889[arg0 - this.field896][arg4 - this.field911] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg4 >= arg6 && arg4 <= var11 && (this.field889[arg0 - this.field896][arg4 - this.field911] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else {
            int var12 = 23 % ((-arg5 - 52) / 37);
            if ((arg6 - 1) == arg4 && arg0 >= arg7 && var10 >= arg0 && (this.field889[arg0 - this.field896][arg4 - this.field911] & 0x2) == 0 && (arg3 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg4 && arg7 <= arg0 && var10 >= arg0 && (this.field889[arg0 - this.field896][arg4 - this.field911] & 0x20) == 0 && (arg3 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIZZ)V", line = 643)
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field909++;
        int var8 = arg1 - this.field896;
        int var9 = arg2 - this.field911;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method450(128, (byte) -51, var9, var8);
                this.method450(8, (byte) -51, var9, var8 - 1);
            }
            if (arg3 == 1) {
                this.method450(2, (byte) -51, var9, var8);
                this.method450(32, (byte) -51, var9 + 1, var8);
            }
            if (arg3 == 2) {
                this.method450(8, (byte) -51, var9, var8);
                this.method450(128, (byte) -51, var9, var8 + 1);
            }
            if (arg3 == 3) {
                this.method450(32, (byte) -51, var9, var8);
                this.method450(2, (byte) -51, var9 - 1, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method450(1, (byte) -51, var9, var8);
                this.method450(16, (byte) -51, var9 + 1, var8 + -1);
            }
            if (arg3 == 1) {
                this.method450(4, (byte) -51, var9, var8);
                this.method450(64, (byte) -51, var9 + 1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method450(16, (byte) -51, var9, var8);
                this.method450(1, (byte) -51, var9 - 1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method450(64, (byte) -51, var9, var8);
                this.method450(4, (byte) -51, var9 - 1, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method450(130, (byte) -51, var9, var8);
                this.method450(8, (byte) -51, var9, var8 - 1);
                this.method450(32, (byte) -51, var9 + 1, var8);
            }
            if (arg3 == 1) {
                this.method450(10, (byte) -51, var9, var8);
                this.method450(32, (byte) -51, var9 + 1, var8);
                this.method450(128, (byte) -51, var9, var8 + 1);
            }
            if (arg3 == 2) {
                this.method450(40, (byte) -51, var9, var8);
                this.method450(128, (byte) -51, var9, var8 + 1);
                this.method450(2, (byte) -51, var9 - 1, var8);
            }
            if (arg3 == 3) {
                this.method450(160, (byte) -51, var9, var8);
                this.method450(2, (byte) -51, var9 - 1, var8);
                this.method450(8, (byte) -51, var9, var8 - 1);
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg3 == 0) {
                    this.method450(65536, (byte) -51, var9, var8);
                    this.method450(4096, (byte) -51, var9, var8 - 1);
                }
                if (arg3 == 1) {
                    this.method450(1024, (byte) -51, var9, var8);
                    this.method450(16384, (byte) -51, var9 + 1, var8);
                }
                if (arg3 == 2) {
                    this.method450(4096, (byte) -51, var9, var8);
                    this.method450(65536, (byte) -51, var9, var8 + 1);
                }
                if (arg3 == 3) {
                    this.method450(16384, (byte) -51, var9, var8);
                    this.method450(1024, (byte) -51, var9 - 1, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg3 == 0) {
                    this.method450(512, (byte) -51, var9, var8);
                    this.method450(8192, (byte) -51, var9 + 1, var8 - 1);
                }
                if (arg3 == 1) {
                    this.method450(2048, (byte) -51, var9, var8);
                    this.method450(32768, (byte) -51, var9 + 1, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method450(8192, (byte) -51, var9, var8);
                    this.method450(512, (byte) -51, var9 - 1, var8 + 1);
                }
                if (arg3 == 3) {
                    this.method450(32768, (byte) -51, var9, var8);
                    this.method450(2048, (byte) -51, var9 - 1, var8 + -1);
                }
            }
            if (arg4 == 2) {
                if (arg3 == 0) {
                    this.method450(66560, (byte) -51, var9, var8);
                    this.method450(4096, (byte) -51, var9, var8 - 1);
                    this.method450(16384, (byte) -51, var9 + 1, var8);
                }
                if (arg3 == 1) {
                    this.method450(5120, (byte) -51, var9, var8);
                    this.method450(16384, (byte) -51, var9 + 1, var8);
                    this.method450(65536, (byte) -51, var9, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method450(20480, (byte) -51, var9, var8);
                    this.method450(65536, (byte) -51, var9, var8 + 1);
                    this.method450(1024, (byte) -51, var9 - 1, var8);
                }
                if (arg3 == 3) {
                    this.method450(81920, (byte) -51, var9, var8);
                    this.method450(1024, (byte) -51, var9 - 1, var8);
                    this.method450(4096, (byte) -51, var9, var8 - 1);
                }
            }
        }
        if (arg0 != 0) {
            this.field908 = 64;
        }
        if (!arg6) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method450(536870912, (byte) -51, var9, var8);
                this.method450(33554432, (byte) -51, var9, var8 - 1);
            }
            if (arg3 == 1) {
                this.method450(8388608, (byte) -51, var9, var8);
                this.method450(134217728, (byte) -51, var9 + 1, var8);
            }
            if (arg3 == 2) {
                this.method450(33554432, (byte) -51, var9, var8);
                this.method450(536870912, (byte) -51, var9, var8 + 1);
            }
            if (arg3 == 3) {
                this.method450(134217728, (byte) -51, var9, var8);
                this.method450(8388608, (byte) -51, var9 - 1, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method450(4194304, (byte) -51, var9, var8);
                this.method450(67108864, (byte) -51, var9 + 1, var8 + -1);
            }
            if (arg3 == 1) {
                this.method450(16777216, (byte) -51, var9, var8);
                this.method450(268435456, (byte) -51, var9 + 1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method450(67108864, (byte) -51, var9, var8);
                this.method450(4194304, (byte) -51, var9 - 1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method450(268435456, (byte) -51, var9, var8);
                this.method450(16777216, (byte) -51, var9 - 1, var8 + -1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method450(545259520, (byte) -51, var9, var8);
            this.method450(33554432, (byte) -51, var9, var8 - 1);
            this.method450(134217728, (byte) -51, var9 + 1, var8);
        }
        if (arg3 == 1) {
            this.method450(41943040, (byte) -51, var9, var8);
            this.method450(134217728, (byte) -51, var9 + 1, var8);
            this.method450(536870912, (byte) -51, var9, var8 + 1);
        }
        if (arg3 == 2) {
            this.method450(167772160, (byte) -51, var9, var8);
            this.method450(536870912, (byte) -51, var9, var8 + 1);
            this.method450(8388608, (byte) -51, var9 - 1, var8);
        }
        if (arg3 == 3) {
            this.method450(671088640, (byte) -51, var9, var8);
            this.method450(8388608, (byte) -51, var9 - 1, var8);
            this.method450(33554432, (byte) -51, var9, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIZ)V", line = 944)
    public final void method459(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field885++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field896;
        int var10 = arg2 - this.field911;
        if (arg6) {
            var8 |= 0x40000000;
        }
        for (int var11 = var9; var11 < (var9 + arg3); var11++) {
            if (var11 >= 0 && var11 < this.field891) {
                for (int var13 = var10; var13 < (arg5 + var10); var13++) {
                    if (var13 >= 0 && this.field908 > var13) {
                        this.method454(var8, var11, (byte) -31, var13);
                    }
                }
            }
        }
        int var12 = 56 / ((6 - arg1) / 52);
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(III)V", line = 989)
    public final void method460(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field896;
        field900++;
        int var5 = arg2 - this.field911;
        this.field889[var4][var5] = class37.method242(this.field889[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 1003)
    public static final void method461(int arg0) {
        class345.field5316.method1764(118);
        if (arg0 > -32) {
            field894 = null;
        }
        field902++;
        class117.field1624.method1764(99);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIII)Z", line = 1023)
    public final boolean method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field904++;
        if (arg2 == 1) {
            if (arg4 == arg5 && arg1 == arg6) {
                return true;
            }
        } else if (arg5 <= arg4 && arg4 <= (arg2 + arg5 - 1) && arg6 <= arg6 && arg2 + arg6 - 1 >= arg6) {
            return true;
        }
        int var9 = arg6 - this.field911;
        int var10 = arg4 - this.field896;
        int var11 = arg5 - this.field896;
        if (arg7 <= 18) {
            this.method452(-26, 125, -84);
        }
        int var12 = arg1 - this.field911;
        if (arg2 == 1) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field889[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field889[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field889[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field889[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field889[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field889[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field889[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field889[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field889[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field889[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field889[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field889[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field889[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field889[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field889[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field889[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field889[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field889[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field889[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field889[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg2 - 1;
            int var14 = var12 + arg2 - 1;
            if (arg0 == 0) {
                if (arg3 == 0) {
                    if (var10 - arg2 == var11 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12 && (this.field889[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 - arg2) == var12 && (this.field889[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 - arg2) == var11 && var9 >= var12 && var9 <= var14 && (this.field889[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var14 >= var9 && (this.field889[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12 && (this.field889[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 - arg2 == var12 && (this.field889[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 >= var11 && var10 <= var13 && var9 - arg2 == var12) {
                        return true;
                    }
                    if ((var10 - arg2) == var11 && var12 <= var9 && var9 <= var14 && (this.field889[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9 && (this.field889[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    if ((var10 - arg2) == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9 && (this.field889[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 - arg2 == var12 && (this.field889[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - arg2 == var11 && var12 <= var9 && var9 <= var14 && (this.field889[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 - arg2) == var12 && (this.field889[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - arg2 == var11 && var9 >= var12 && var14 >= var9 && (this.field889[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12 && (this.field889[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 - arg2) == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - arg2 == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 + 1 == var12 && (this.field889[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9 && (this.field889[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 - arg2) == var12) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12 && (this.field889[var10][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var10 <= var13 && (var9 - arg2) == var12 && (this.field889[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg2 == var11 && var9 >= var12 && var9 <= var14 && (this.field889[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9 && (this.field889[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIBIIII)Z", line = 1401)
    public final boolean method463(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field887++;
        if (arg1 == 1) {
            if (arg0 == arg5 && arg6 == arg7) {
                return true;
            }
        } else if (arg5 <= arg0 && arg0 <= arg1 + arg5 - 1 && arg7 >= arg7 && (arg7 + arg1 - 1) >= arg7) {
            return true;
        }
        int var9 = arg7 - this.field911;
        int var10 = arg6 - this.field911;
        int var11 = arg5 - this.field896;
        int var12 = arg0 - this.field896;
        if (arg1 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field889[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field889[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field889[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field889[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field889[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field889[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field889[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field889[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field889[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field889[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field889[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field889[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg1 - 1;
            int var14 = arg1 + var10 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var14 && (this.field889[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var9 - arg1) == var10 && (this.field889[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - arg1) == var11 && var9 >= var10 && var14 >= var9 && (this.field889[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 - arg1 == var10 && (this.field889[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - arg1 == var11 && var9 >= var10 && var14 >= var9 && (this.field889[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 + 1) == var10 && (this.field889[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var12 + 1) == var11 && var10 <= var9 && var9 <= var14 && (this.field889[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field889[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var12 >= var11 && var12 <= var13 && var9 + 1 == var10 && (this.field889[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var12 && var13 >= var12 && var9 - arg1 == var10 && (this.field889[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg1 == var11 && var9 >= var10 && var14 >= var9 && (this.field889[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var10 <= var9 && var9 <= var14 && (this.field889[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        int var15 = -80 / ((-arg3 - 75) / 47);
        return false;
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(III)V", line = 1604)
    public final void method464(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field896;
        field903++;
        int var5 = arg2 - this.field911;
        this.field889[var4][var5] = class37.method242(this.field889[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 1617)
    public final void method465(int arg0) {
        field910++;
        for (int var2 = 0; var2 < this.field891; var2++) {
            for (int var3 = 0; var3 < this.field908; var3++) {
                if (var2 == 0 || var3 == 0 || this.field891 - 5 <= var2 || var3 >= (this.field908 - 5)) {
                    this.field889[var2][var3] = -1;
                } else {
                    this.field889[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != 2097152) {
            this.field889 = null;
        }
    }
}
