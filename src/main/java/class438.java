import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class438 {

    @OriginalMember(owner = "client!mja", name = "v", descriptor = "Lgq;")
    public static class538 field6277 = new class538(2);

    @OriginalMember(owner = "client!mja", name = "B", descriptor = "Ljava/lang/String;")
    public static String field6283 = null;

    @OriginalMember(owner = "client!mja", name = "w", descriptor = "Lada;")
    public static class171 field6278 = new class171();

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!mja", name = "d", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!mja", name = "e", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!mja", name = "f", descriptor = "I")
    public int field6261;

    @OriginalMember(owner = "client!mja", name = "g", descriptor = "I")
    public int field6262;

    @OriginalMember(owner = "client!mja", name = "h", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!mja", name = "i", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!mja", name = "j", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!mja", name = "k", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!mja", name = "l", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!mja", name = "m", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!mja", name = "n", descriptor = "I")
    public int field6269;

    @OriginalMember(owner = "client!mja", name = "o", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!mja", name = "p", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!mja", name = "q", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!mja", name = "r", descriptor = "I")
    public int field6273;

    @OriginalMember(owner = "client!mja", name = "s", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!mja", name = "t", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!mja", name = "u", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!mja", name = "y", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!mja", name = "A", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "Lha;")
    public static class66 field6281;

    @OriginalMember(owner = "client!mja", name = "x", descriptor = "[[I")
    public int[][] field6279;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method2640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6272++;
        int var11 = arg4 + arg7;
        if (arg3 >= -9) {
            this.field6279 = null;
        }
        int var12 = arg9 + arg2;
        int var13 = arg0 + arg5;
        int var14 = arg1 + arg6;
        if (arg4 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg9 > arg6 ? arg9 : arg6;
            int var16 = var12 < var14 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field6279[var13 - this.field6269 - 1][var15 - this.field6262] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg9 <= arg6 ? arg6 : arg9;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field6279[arg0 - this.field6269][var17 - this.field6262] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg9 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg0 < arg4 ? arg4 : arg0;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field6279[var19 - this.field6269][var14 - this.field6262 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg6 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg4 <= arg0 ? arg0 : arg4;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field6279[var21 - this.field6269][arg6 - this.field6262] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(I)V")
    public static void method2641(int arg0) {
        field6281 = null;
        field6277 = null;
        field6278 = null;
        field6283 = null;
        if (arg0 < 27) {
            method2652((char) 65484, true);
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIIIZZ)V")
    public final void method2642(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field6258++;
        int var8 = 256;
        if (arg5) {
            var8 |= 0x20000;
        }
        int var9 = arg0 - this.field6269;
        if (arg6) {
            var8 |= 0x40000000;
        }
        int var10 = arg4 - this.field6262;
        if (arg3 != -1) {
            return;
        }
        for (int var11 = var9; var11 < var9 + arg2; var11++) {
            if (var11 >= 0 && this.field6273 > var11) {
                for (int var12 = var10; var12 < var10 + arg1; var12++) {
                    if (var12 >= 0 && var12 < this.field6261) {
                        this.method2646(var8, var11, var12, (byte) -38);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIII)V")
    private final void method2643(int arg0, int arg1, int arg2, int arg3) {
        field6265++;
        this.field6279[arg3][arg2] = class111.method773(this.field6279[arg3][arg2], ~arg1);
        if (arg0 != 0) {
            this.field6273 = 7;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6264++;
        if (arg5 == 1) {
            if (arg3 == arg6 && arg2 == arg7) {
                return true;
            }
        } else if (arg6 <= arg3 && (arg6 + arg5 - 1) >= arg3 && arg2 <= arg2 && arg2 + arg5 - 1 >= arg2) {
            return true;
        }
        int var9 = arg7 - this.field6262;
        int var10 = arg6 - this.field6269;
        int var11 = arg2 - this.field6262;
        if (arg4 != -12354) {
            this.field6273 = -6;
        }
        int var12 = arg3 - this.field6269;
        if (arg5 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var12 + 1 == var10 && var9 == var11 && (this.field6279[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field6279[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field6279[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field6279[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field6279[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field6279[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field6279[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field6279[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 == var12 && var11 + 1 == var9 && (this.field6279[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field6279[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field6279[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field6279[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var10 - 1;
            int var14 = var9 + arg5 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var12 + 1 == var10 && var9 <= var11 && var11 <= var14 && (this.field6279[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var11 - arg5 == var9 && (this.field6279[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var12 - arg5) == var10 && var9 <= var11 && var14 >= var11 && (this.field6279[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var11 - arg5 == var9 && (this.field6279[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var12 - arg5) == var10 && var11 >= var9 && var11 <= var14 && (this.field6279[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var11 + 1 == var9 && (this.field6279[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var12 + 1 == var10 && var11 >= var9 && var11 <= var14 && (this.field6279[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var11 + 1) == var9 && (this.field6279[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 <= var12 && var12 <= var13 && (var11 + 1) == var9 && (this.field6279[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var10 && var12 <= var13 && (var11 - arg5) == var9 && (this.field6279[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg5) == var10 && var11 >= var9 && var11 <= var14 && (this.field6279[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var11 >= var9 && var11 <= var14 && (this.field6279[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIILjava/awt/Canvas;)Lrs;")
    public static final class677 method2645(int arg0, int arg1, int arg2, Canvas arg3) {
        field6260++;
        try {
            if (arg2 != 0) {
                field6266 = -104;
            }
            Class var4 = Class.forName("tea");
            class677 var5 = (class677) var4.getDeclaredConstructor().newInstance();
            var5.method909(arg1, arg3, (byte) -121, arg0);
            return var5;
        } catch (Throwable var7) {
            class124 var6 = new class124();
            var6.method909(arg1, arg3, (byte) 68, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIB)V")
    private final void method2646(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -38) {
            this.method2648(-23, 46, 87, 122, false, -14, false);
        }
        field6271++;
        this.field6279[arg1][arg2] = class281.method1904(this.field6279[arg1][arg2], arg0);
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method2647(byte arg0, String arg1) {
        if (arg0 != 67) {
            field6278 = null;
        }
        field6280++;
        return class219.field3121.containsKey(arg1);
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIIZIZ)V")
    public final void method2648(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field6274++;
        int var8 = arg1 - this.field6262;
        int var9 = arg0 - this.field6269;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method2643(0, 128, var8, var9);
                this.method2643(0, 8, var8, var9 - 1);
            }
            if (arg5 == 1) {
                this.method2643(0, 2, var8, var9);
                this.method2643(0, 32, var8 + 1, var9);
            }
            if (arg5 == 2) {
                this.method2643(0, 8, var8, var9);
                this.method2643(0, 128, var8, var9 + 1);
            }
            if (arg5 == 3) {
                this.method2643(arg2, 32, var8, var9);
                this.method2643(0, 2, var8 - 1, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method2643(0, 1, var8, var9);
                this.method2643(0, 16, var8 + 1, var9 + -1);
            }
            if (arg5 == 1) {
                this.method2643(0, 4, var8, var9);
                this.method2643(arg2, 64, var8 + 1, var9 + 1);
            }
            if (arg5 == 2) {
                this.method2643(0, 16, var8, var9);
                this.method2643(0, 1, var8 - 1, var9 - -1);
            }
            if (arg5 == 3) {
                this.method2643(arg2, 64, var8, var9);
                this.method2643(0, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg2 != 0) {
            return;
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method2643(0, 130, var8, var9);
                this.method2643(0, 8, var8, var9 - 1);
                this.method2643(0, 32, var8 + 1, var9);
            }
            if (arg5 == 1) {
                this.method2643(0, 10, var8, var9);
                this.method2643(0, 32, var8 + 1, var9);
                this.method2643(0, 128, var8, var9 + 1);
            }
            if (arg5 == 2) {
                this.method2643(0, 40, var8, var9);
                this.method2643(0, 128, var8, var9 + 1);
                this.method2643(0, 2, var8 - 1, var9);
            }
            if (arg5 == 3) {
                this.method2643(0, 160, var8, var9);
                this.method2643(arg2, 2, var8 - 1, var9);
                this.method2643(arg2, 8, var8, var9 - 1);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method2643(0, 65536, var8, var9);
                    this.method2643(0, 4096, var8, var9 - 1);
                }
                if (arg5 == 1) {
                    this.method2643(0, 1024, var8, var9);
                    this.method2643(arg2, 16384, var8 + 1, var9);
                }
                if (arg5 == 2) {
                    this.method2643(0, 4096, var8, var9);
                    this.method2643(arg2, 65536, var8, var9 + 1);
                }
                if (arg5 == 3) {
                    this.method2643(0, 16384, var8, var9);
                    this.method2643(0, 1024, var8 - 1, var9);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method2643(0, 512, var8, var9);
                    this.method2643(arg2, 8192, var8 + 1, var9 + -1);
                }
                if (arg5 == 1) {
                    this.method2643(0, 2048, var8, var9);
                    this.method2643(0, 32768, var8 + 1, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method2643(0, 8192, var8, var9);
                    this.method2643(0, 512, var8 - 1, var9 - -1);
                }
                if (arg5 == 3) {
                    this.method2643(0, 32768, var8, var9);
                    this.method2643(0, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method2643(0, 66560, var8, var9);
                    this.method2643(0, 4096, var8, var9 - 1);
                    this.method2643(0, 16384, var8 + 1, var9);
                }
                if (arg5 == 1) {
                    this.method2643(arg2, 5120, var8, var9);
                    this.method2643(0, 16384, var8 + 1, var9);
                    this.method2643(arg2, 65536, var8, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method2643(0, 20480, var8, var9);
                    this.method2643(0, 65536, var8, var9 + 1);
                    this.method2643(0, 1024, var8 - 1, var9);
                }
                if (arg5 == 3) {
                    this.method2643(0, 81920, var8, var9);
                    this.method2643(0, 1024, var8 - 1, var9);
                    this.method2643(0, 4096, var8, var9 - 1);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method2643(arg2, 536870912, var8, var9);
                this.method2643(arg2, 33554432, var8, var9 - 1);
            }
            if (arg5 == 1) {
                this.method2643(0, 8388608, var8, var9);
                this.method2643(0, 134217728, var8 + 1, var9);
            }
            if (arg5 == 2) {
                this.method2643(0, 33554432, var8, var9);
                this.method2643(arg2, 536870912, var8, var9 + 1);
            }
            if (arg5 == 3) {
                this.method2643(0, 134217728, var8, var9);
                this.method2643(0, 8388608, var8 - 1, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method2643(0, 4194304, var8, var9);
                this.method2643(0, 67108864, var8 + 1, var9 + -1);
            }
            if (arg5 == 1) {
                this.method2643(arg2, 16777216, var8, var9);
                this.method2643(0, 268435456, var8 + 1, var9 + 1);
            }
            if (arg5 == 2) {
                this.method2643(0, 67108864, var8, var9);
                this.method2643(0, 4194304, var8 - 1, var9 + 1);
            }
            if (arg5 == 3) {
                this.method2643(0, 268435456, var8, var9);
                this.method2643(0, 16777216, var8 - 1, var9 + -1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2643(0, 545259520, var8, var9);
            this.method2643(0, 33554432, var8, var9 - 1);
            this.method2643(0, 134217728, var8 + 1, var9);
        }
        if (arg5 == 1) {
            this.method2643(arg2, 41943040, var8, var9);
            this.method2643(0, 134217728, var8 + 1, var9);
            this.method2643(arg2, 536870912, var8, var9 + 1);
        }
        if (arg5 == 2) {
            this.method2643(0, 167772160, var8, var9);
            this.method2643(0, 536870912, var8, var9 + 1);
            this.method2643(0, 8388608, var8 - 1, var9);
        }
        if (arg5 == 3) {
            this.method2643(0, 671088640, var8, var9);
            this.method2643(0, 8388608, var8 - 1, var9);
            this.method2643(0, 33554432, var8, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIZIIZI)V")
    public final void method2649(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg0 - this.field6269;
        if (arg4 != -1) {
            this.method2649(10, 78, true, 123, 106, true, -116);
        }
        field6256++;
        int var9 = arg6 - this.field6262;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method2646(128, var8, var9, (byte) -38);
                this.method2646(8, var8 - 1, var9, (byte) -38);
            }
            if (arg1 == 1) {
                this.method2646(2, var8, var9, (byte) -38);
                this.method2646(32, var8, var9 + 1, (byte) -38);
            }
            if (arg1 == 2) {
                this.method2646(8, var8, var9, (byte) -38);
                this.method2646(128, var8 + 1, var9, (byte) -38);
            }
            if (arg1 == 3) {
                this.method2646(32, var8, var9, (byte) -38);
                this.method2646(2, var8, var9 - 1, (byte) -38);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method2646(1, var8, var9, (byte) -38);
                this.method2646(16, var8 - 1, var9 + 1, (byte) -38);
            }
            if (arg1 == 1) {
                this.method2646(4, var8, var9, (byte) -38);
                this.method2646(64, var8 + 1, var9 - -1, (byte) -38);
            }
            if (arg1 == 2) {
                this.method2646(16, var8, var9, (byte) -38);
                this.method2646(1, var8 + 1, var9 + -1, (byte) -38);
            }
            if (arg1 == 3) {
                this.method2646(64, var8, var9, (byte) -38);
                this.method2646(4, var8 - 1, var9 + -1, (byte) -38);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method2646(130, var8, var9, (byte) -38);
                this.method2646(8, var8 - 1, var9, (byte) -38);
                this.method2646(32, var8, var9 + 1, (byte) -38);
            }
            if (arg1 == 1) {
                this.method2646(10, var8, var9, (byte) -38);
                this.method2646(32, var8, var9 + 1, (byte) -38);
                this.method2646(128, var8 + 1, var9, (byte) -38);
            }
            if (arg1 == 2) {
                this.method2646(40, var8, var9, (byte) -38);
                this.method2646(128, var8 + 1, var9, (byte) -38);
                this.method2646(2, var8, var9 - 1, (byte) -38);
            }
            if (arg1 == 3) {
                this.method2646(160, var8, var9, (byte) -38);
                this.method2646(2, var8, var9 - 1, (byte) -38);
                this.method2646(8, var8 - 1, var9, (byte) -38);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method2646(65536, var8, var9, (byte) -38);
                    this.method2646(4096, var8 - 1, var9, (byte) -38);
                }
                if (arg1 == 1) {
                    this.method2646(1024, var8, var9, (byte) -38);
                    this.method2646(16384, var8, var9 + 1, (byte) -38);
                }
                if (arg1 == 2) {
                    this.method2646(4096, var8, var9, (byte) -38);
                    this.method2646(65536, var8 + 1, var9, (byte) -38);
                }
                if (arg1 == 3) {
                    this.method2646(16384, var8, var9, (byte) -38);
                    this.method2646(1024, var8, var9 - 1, (byte) -38);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method2646(512, var8, var9, (byte) -38);
                    this.method2646(8192, var8 - 1, var9 + 1, (byte) -38);
                }
                if (arg1 == 1) {
                    this.method2646(2048, var8, var9, (byte) -38);
                    this.method2646(32768, var8 + 1, var9 + 1, (byte) -38);
                }
                if (arg1 == 2) {
                    this.method2646(8192, var8, var9, (byte) -38);
                    this.method2646(512, var8 + 1, var9 - 1, (byte) -38);
                }
                if (arg1 == 3) {
                    this.method2646(32768, var8, var9, (byte) -38);
                    this.method2646(2048, var8 - 1, var9 + -1, (byte) -38);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method2646(66560, var8, var9, (byte) -38);
                    this.method2646(4096, var8 - 1, var9, (byte) -38);
                    this.method2646(16384, var8, var9 + 1, (byte) -38);
                }
                if (arg1 == 1) {
                    this.method2646(5120, var8, var9, (byte) -38);
                    this.method2646(16384, var8, var9 + 1, (byte) -38);
                    this.method2646(65536, var8 + 1, var9, (byte) -38);
                }
                if (arg1 == 2) {
                    this.method2646(20480, var8, var9, (byte) -38);
                    this.method2646(65536, var8 + 1, var9, (byte) -38);
                    this.method2646(1024, var8, var9 - 1, (byte) -38);
                }
                if (arg1 == 3) {
                    this.method2646(81920, var8, var9, (byte) -38);
                    this.method2646(1024, var8, var9 - 1, (byte) -38);
                    this.method2646(4096, var8 - 1, var9, (byte) -38);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method2646(536870912, var8, var9, (byte) -38);
                this.method2646(33554432, var8 - 1, var9, (byte) -38);
            }
            if (arg1 == 1) {
                this.method2646(8388608, var8, var9, (byte) -38);
                this.method2646(134217728, var8, var9 + 1, (byte) -38);
            }
            if (arg1 == 2) {
                this.method2646(33554432, var8, var9, (byte) -38);
                this.method2646(536870912, var8 + 1, var9, (byte) -38);
            }
            if (arg1 == 3) {
                this.method2646(134217728, var8, var9, (byte) -38);
                this.method2646(8388608, var8, var9 - 1, (byte) -38);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method2646(4194304, var8, var9, (byte) -38);
                this.method2646(67108864, var8 - 1, var9 + 1, (byte) -38);
            }
            if (arg1 == 1) {
                this.method2646(16777216, var8, var9, (byte) -38);
                this.method2646(268435456, var8 + 1, var9 + 1, (byte) -38);
            }
            if (arg1 == 2) {
                this.method2646(67108864, var8, var9, (byte) -38);
                this.method2646(4194304, var8 + 1, var9 + -1, (byte) -38);
            }
            if (arg1 == 3) {
                this.method2646(268435456, var8, var9, (byte) -38);
                this.method2646(16777216, var8 - 1, var9 + -1, (byte) -38);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method2646(545259520, var8, var9, (byte) -38);
            this.method2646(33554432, var8 - 1, var9, (byte) -38);
            this.method2646(134217728, var8, var9 + 1, (byte) -38);
        }
        if (arg1 == 1) {
            this.method2646(41943040, var8, var9, (byte) -38);
            this.method2646(134217728, var8, var9 + 1, (byte) -38);
            this.method2646(536870912, var8 + 1, var9, (byte) -38);
        }
        if (arg1 == 2) {
            this.method2646(167772160, var8, var9, (byte) -38);
            this.method2646(536870912, var8 + 1, var9, (byte) -38);
            this.method2646(8388608, var8, var9 - 1, (byte) -38);
        }
        if (arg1 == 3) {
            this.method2646(671088640, var8, var9, (byte) -38);
            this.method2646(8388608, var8, var9 - 1, (byte) -38);
            this.method2646(33554432, var8 - 1, var9, (byte) -38);
            return;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(III)V")
    public final void method2650(int arg0, int arg1, int arg2) {
        field6268++;
        if (arg2 != -1) {
            method2641(-70);
        }
        int var4 = arg0 - this.field6262;
        int var5 = arg1 - this.field6269;
        this.field6279[var5][var4] = class281.method1904(this.field6279[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z)V")
    public final void method2651(boolean arg0) {
        field6257++;
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field6273; var2++) {
            for (int var3 = 0; var3 < this.field6261; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field6273 - 5) || var3 >= (this.field6261 - 5)) {
                    this.field6279[var2][var3] = -1;
                } else {
                    this.field6279[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(CZ)Z")
    public static final boolean method2652(char arg0, boolean arg1) {
        field6263++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (arg1) {
            return true;
        } else if (class385.method2353(46, arg0)) {
            return true;
        } else {
            char[] var2 = class399.field5661;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class630.field8902;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method2653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 15 % ((arg0 + 69) / 32);
        field6276++;
        if (arg1 == 1) {
            if (arg4 == arg6 && arg5 == arg7) {
                return true;
            }
        } else if (arg6 >= arg4 && arg1 + arg4 - 1 >= arg6 && arg7 >= arg7 && arg7 <= arg7 - (1 - arg1)) {
            return true;
        }
        int var10 = arg5 - this.field6262;
        int var11 = arg4 - this.field6269;
        int var12 = arg7 - this.field6262;
        int var13 = arg6 - this.field6269;
        if (arg1 == 1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var13 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && var12 + 1 == var10 && (this.field6279[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var13 && var12 - 1 == var10 && (this.field6279[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 == var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var13 - 1 == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var13 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && (var12 + 1) == var10 && (this.field6279[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var12 - 1) == var10 && (this.field6279[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 == var13 && (var12 - 1) == var10) {
                        return true;
                    }
                    if ((var13 - 1) == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var13 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var13 && var12 - 1 == var10 && (this.field6279[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var13 - 1 == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && var12 - 1 == var10 && (this.field6279[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var13 - 1) == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var12 + 1) == var10 && (this.field6279[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && var12 - 1 == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var13 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var11 == var13 && var12 + 1 == var10 && (this.field6279[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 == var13 && (var12 + 1) == var10 && (this.field6279[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var13 && (var12 - 1) == var10 && (this.field6279[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var13 - 1 == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var13 + 1 == var11 && var10 == var12 && (this.field6279[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var11 + arg1 - 1;
            int var15 = var10 + arg1 - 1;
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var13 - arg1 == var11 && var12 >= var10 && var12 <= var15) {
                        return true;
                    }
                    if (var11 <= var13 && var14 >= var13 && var12 + 1 == var10 && (this.field6279[var13][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var13 >= var11 && var14 >= var13 && (var12 - arg1) == var10 && (this.field6279[var13][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var13 >= var11 && var13 <= var14 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var13 - arg1 == var11 && var12 >= var10 && var12 <= var15 && (this.field6279[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var12 >= var10 && var15 >= var12 && (this.field6279[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var13 + 1 == var11 && var12 >= var10 && var15 >= var12) {
                        return true;
                    }
                    if (var13 >= var11 && var13 <= var14 && var12 + 1 == var10 && (this.field6279[var13][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var13 <= var14 && var12 - arg1 == var10 && (this.field6279[var13][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var13 >= var11 && var14 >= var13 && var12 - arg1 == var10) {
                        return true;
                    }
                    if ((var13 - arg1) == var11 && var12 >= var10 && var15 >= var12 && (this.field6279[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 <= var12 && var15 >= var12 && (this.field6279[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if ((var13 - arg1) == var11 && var12 >= var10 && var15 >= var12) {
                        return true;
                    }
                    if (var13 >= var11 && var14 >= var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var12 >= var10 && var15 >= var12 && (this.field6279[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var14 >= var13 && var12 - arg1 == var10 && (this.field6279[var13][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var13 - arg1 == var11 && var12 >= var10 && var15 >= var12 && (this.field6279[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var14 >= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var13 + 1 == var11 && var12 >= var10 && var12 <= var15) {
                        return true;
                    }
                    if (var11 <= var13 && var14 >= var13 && (var12 - arg1) == var10 && (this.field6279[var13][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var13 - arg1 == var11 && var12 >= var10 && var15 >= var12 && (this.field6279[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var13 >= var11 && var13 <= var14 && (var12 + 1) == var10 && (this.field6279[var13][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var10 <= var12 && var15 >= var12) {
                        return true;
                    }
                    if (var13 >= var11 && var14 >= var13 && (var12 - arg1) == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var13 - arg1) == var11 && var12 >= var10 && var15 >= var12) {
                        return true;
                    }
                    if (var13 >= var11 && var13 <= var14 && var12 + 1 == var10 && (this.field6279[var13][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var11 && var12 >= var10 && var15 >= var12 && (this.field6279[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var13 && var14 >= var13 && var12 - arg1 == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 <= var13 && var13 <= var14 && var12 + 1 == var10 && (this.field6279[var13][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var13 >= var11 && var14 >= var13 && (var12 - arg1) == var10 && (this.field6279[var13][var15] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var13 - arg1) == var11 && var10 <= var12 && var12 <= var15 && (this.field6279[var14][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var13 + 1) == var11 && var12 >= var10 && var12 <= var15 && (this.field6279[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IZZIIIII)V")
    public final void method2654(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6282++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        int var10 = arg7 - this.field6269;
        if (arg2) {
            var9 |= 0x40000000;
        }
        int var11 = arg5 - this.field6262;
        if (arg4 == 1 || arg4 == 3) {
            int var12 = arg3;
            arg3 = arg6;
            arg6 = var12;
        }
        int var13 = 124 % ((arg0 + 20) / 51);
        for (int var14 = var10; var14 < arg3 + var10; var14++) {
            if (var14 >= 0 && this.field6273 > var14) {
                for (int var15 = var11; var15 < arg6 + var11; var15++) {
                    if (var15 >= 0 && var15 < this.field6261) {
                        this.method2643(0, var9, var15, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IBIIIIIII)Z")
    public final boolean method2655(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6270++;
        if (arg4 > 1) {
            return class509.method2977(arg4, arg4, arg2, arg3, arg6, arg7, false, arg0, arg8) ? true : this.method2640(arg7, arg2, arg4, -127, arg8, arg6, arg0, arg4, arg5, arg3);
        }
        int var10 = arg7 + arg6 - 1;
        int var11 = arg0 + arg2 - 1;
        if (arg7 <= arg8 && var10 >= arg8 && arg0 <= arg3 && arg3 <= var11) {
            return true;
        } else if (arg1 >= -101) {
            return false;
        } else if ((arg7 - 1) == arg8 && arg3 >= arg0 && var11 >= arg3 && (this.field6279[arg8 - this.field6269][arg3 - this.field6262] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg8 && arg0 <= arg3 && arg3 <= var11 && (this.field6279[arg8 - this.field6269][arg3 - this.field6262] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if ((arg0 - 1) == arg3 && arg7 <= arg8 && arg8 <= var10 && (this.field6279[arg8 - this.field6269][arg3 - this.field6262] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg3 && arg7 <= arg8 && arg8 <= var10 && (this.field6279[arg8 - this.field6269][arg3 - this.field6262] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIZ)V")
    public final void method2656(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field6262;
        int var5 = arg1 - this.field6269;
        field6259++;
        this.field6279[var5][var4] = class111.method773(this.field6279[var5][var4], -2097153);
        if (!arg2) {
            this.field6262 = -122;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IZI)V")
    public final void method2657(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field6269;
        if (arg1) {
            field6278 = null;
        }
        field6267++;
        int var5 = arg0 - this.field6262;
        this.field6279[var4][var5] = class281.method1904(this.field6279[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "(III)V")
    public final void method2658(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field6262;
        int var5 = arg0 - this.field6269;
        field6275++;
        this.field6279[var5][var4] = class111.method773(this.field6279[var5][var4], arg1);
    }
}
