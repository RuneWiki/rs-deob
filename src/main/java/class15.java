import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 {

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[[I")
    public int[][] field276;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field280 = 0;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
    public static int[] field274 = new int[2048];

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Z")
    public static boolean field278 = false;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Lva;")
    public static class121 field291 = class107.method797(" @cya@", -10983);

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lva;")
    public static class121 field279 = class107.method797("titlebox", -10983);

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Lbb;")
    public static class9 field294 = new class9();

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "Lbb;")
    public static class9 field297 = new class9();

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "Lva;")
    public static class121 field300 = class107.method797("*6n", -10983);

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field302 = 0;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Lva;")
    public static class121 field303 = class107.method797("l", -10983);

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "Lva;")
    private static class121 field301 = class107.method797("Loaded interfaces", -10983);

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Lva;")
    public static class121 field298 = field301;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "Lr;")
    public static class100 field299;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V", line = 3)
    public final void method112(byte arg0, int arg1, int arg2) {
        if (arg0 <= 91) {
            this.method113(-43, -96, false, -108, 77, 11, -46);
        }
        int var4 = arg1 - this.field296;
        field284++;
        int var5 = arg2 - this.field285;
        this.field276[var4][var5] = class90.method614(this.field276[var4][var5], 14680063);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZIIII)V", line = 18)
    public final void method113(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg1 - this.field285;
        if (~arg3 == arg0 || arg3 == 3) {
            int var9 = arg5;
            arg5 = arg6;
            arg6 = var9;
        }
        field275++;
        int var10 = arg4 - this.field296;
        int var11 = 256;
        if (arg2) {
            var11 += 131072;
        }
        for (int var12 = var10; var12 < arg5 + var10; var12++) {
            if (var12 >= 0 && var12 < this.field281) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && this.field277 > var13) {
                        this.method115((byte) -108, var13, var12, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIZI)V", line = 66)
    public final void method114(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg3 - this.field296;
        int var9 = 256;
        int var10 = arg4 - this.field285;
        field272++;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg6;
            arg6 = arg2;
            arg2 = var11;
        }
        if (arg5) {
            var9 += 131072;
        }
        if (arg1 != -19742) {
            return;
        }
        for (int var12 = var8; var12 < arg6 + var8; var12++) {
            if (var12 >= 0 && this.field281 > var12) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && this.field277 > var13) {
                        this.method116((byte) -104, var12, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIII)V", line = 116)
    private final void method115(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -108) {
            field304 = -32;
        }
        this.field276[arg2][arg1] = class59.method430(this.field276[arg2][arg1], arg3);
        field271++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(BIII)V", line = 138)
    private final void method116(byte arg0, int arg1, int arg2, int arg3) {
        this.field276[arg1][arg3] = class90.method614(this.field276[arg1][arg3], 16777215 - arg2);
        field288++;
        if (arg0 != -104) {
            field278 = true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIBI)Z", line = 149)
    public final boolean method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var9 = arg5 + arg1 - 1;
        field273++;
        int var10 = arg2 + arg0 - 1;
        if (arg6 != 64) {
            return false;
        } else if (arg5 <= arg4 && arg4 <= var9 && arg3 >= arg0 && arg3 <= var10) {
            return true;
        } else if (arg5 - 1 == arg4 && arg3 >= arg0 && var10 >= arg3 && (this.field276[arg4 - this.field296][arg3 - this.field285] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg0 <= arg3 && var10 >= arg3 && (this.field276[arg4 - this.field296][arg3 - this.field285] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg3 && arg4 >= arg5 && var9 >= arg4 && (this.field276[arg4 - this.field296][arg3 - this.field285] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg5 <= arg4 && var9 >= arg4 && (this.field276[arg4 - this.field296][arg3 - this.field285] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIIIIII)Z", line = 187)
    public final boolean method118(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field293++;
        if (arg3 == arg5 && arg1 == arg6) {
            return true;
        }
        int var8 = arg3 - this.field296;
        int var9 = arg5 - this.field296;
        int var10 = arg6 - this.field285;
        int var11 = 40 % ((arg0 + 52) / 37);
        int var12 = arg1 - this.field285;
        if (arg4 == 0) {
            if (arg2 == 0) {
                if (var9 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var12 && (this.field276[var8][var12] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var12 && (this.field276[var8][var12] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var9 && var10 + 1 == var12) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var9 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var12 && (this.field276[var8][var12] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var12 && (this.field276[var8][var12] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var9 && var10 - 1 == var12) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                if (var9 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var12) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var12 && (this.field276[var8][var12] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var9 - 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var12) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var12 && (this.field276[var8][var12] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var9 - 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var12 && (this.field276[var8][var12] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var12) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var9 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var12 && (this.field276[var8][var12] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var12) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var8 == var9 && var10 + 1 == var12 && (this.field276[var8][var12] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var12 && (this.field276[var8][var12] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var12 && (this.field276[var8][var12] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIIIII)V", line = 372)
    public final void method119(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field296;
        int var8 = arg5 - this.field285;
        field289++;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method116((byte) -104, var7, 128, var8);
                this.method116((byte) -104, var7 - 1, 8, var8);
            }
            if (arg2 == 1) {
                this.method116((byte) -104, var7, 2, var8);
                this.method116((byte) -104, var7, 32, var8 + 1);
            }
            if (arg2 == 2) {
                this.method116((byte) -104, var7, 8, var8);
                this.method116((byte) -104, var7 + 1, 128, var8);
            }
            if (arg2 == 3) {
                this.method116((byte) -104, var7, 32, var8);
                this.method116((byte) -104, var7, 2, var8 - 1);
            }
        }
        if (arg3 != -157) {
            field301 = null;
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method116((byte) -104, var7, 1, var8);
                this.method116((byte) -104, var7 - 1, 16, var8 + 1);
            }
            if (arg2 == 1) {
                this.method116((byte) -104, var7, 4, var8);
                this.method116((byte) -104, var7 + 1, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method116((byte) -104, var7, 16, var8);
                this.method116((byte) -104, var7 + 1, 1, var8 - 1);
            }
            if (arg2 == 3) {
                this.method116((byte) -104, var7, 64, var8);
                this.method116((byte) -104, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method116((byte) -104, var7, 130, var8);
                this.method116((byte) -104, var7 - 1, 8, var8);
                this.method116((byte) -104, var7, 32, var8 + 1);
            }
            if (arg2 == 1) {
                this.method116((byte) -104, var7, 10, var8);
                this.method116((byte) -104, var7, 32, var8 + 1);
                this.method116((byte) -104, var7 + 1, 128, var8);
            }
            if (arg2 == 2) {
                this.method116((byte) -104, var7, 40, var8);
                this.method116((byte) -104, var7 + 1, 128, var8);
                this.method116((byte) -104, var7, 2, var8 - 1);
            }
            if (arg2 == 3) {
                this.method116((byte) -104, var7, 160, var8);
                this.method116((byte) -104, var7, 2, var8 - 1);
                this.method116((byte) -104, var7 - 1, 8, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method116((byte) -104, var7, 65536, var8);
                this.method116((byte) -104, var7 - 1, 4096, var8);
            }
            if (arg2 == 1) {
                this.method116((byte) -104, var7, 1024, var8);
                this.method116((byte) -104, var7, 16384, var8 + 1);
            }
            if (arg2 == 2) {
                this.method116((byte) -104, var7, 4096, var8);
                this.method116((byte) -104, var7 + 1, 65536, var8);
            }
            if (arg2 == 3) {
                this.method116((byte) -104, var7, 16384, var8);
                this.method116((byte) -104, var7, 1024, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method116((byte) -104, var7, 512, var8);
                this.method116((byte) -104, var7 - 1, 8192, var8 + 1);
            }
            if (arg2 == 1) {
                this.method116((byte) -104, var7, 2048, var8);
                this.method116((byte) -104, var7 + 1, 32768, var8 + 1);
            }
            if (arg2 == 2) {
                this.method116((byte) -104, var7, 8192, var8);
                this.method116((byte) -104, var7 + 1, 512, var8 - 1);
            }
            if (arg2 == 3) {
                this.method116((byte) -104, var7, 32768, var8);
                this.method116((byte) -104, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method116((byte) -104, var7, 66560, var8);
            this.method116((byte) -104, var7 - 1, 4096, var8);
            this.method116((byte) -104, var7, 16384, var8 + 1);
        }
        if (arg2 == 1) {
            this.method116((byte) -104, var7, 5120, var8);
            this.method116((byte) -104, var7, 16384, var8 + 1);
            this.method116((byte) -104, var7 + 1, 65536, var8);
        }
        if (arg2 == 2) {
            this.method116((byte) -104, var7, 20480, var8);
            this.method116((byte) -104, var7 + 1, 65536, var8);
            this.method116((byte) -104, var7, 1024, var8 - 1);
        }
        if (arg2 == 3) {
            this.method116((byte) -104, var7, 81920, var8);
            this.method116((byte) -104, var7, 1024, var8 - 1);
            this.method116((byte) -104, var7 - 1, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)Z", line = 584)
    public final boolean method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field286++;
        if (arg2 == arg3 && arg4 == arg5) {
            return true;
        }
        int var8 = arg5 - this.field285;
        int var9 = arg3 - this.field296;
        int var10 = arg4 - this.field285;
        int var11 = arg2 - this.field296;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var9 + 1 == var11 && var8 == var10 && (this.field276[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field276[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field276[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field276[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field276[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field276[var11][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 + 1 == var11 && var8 == var10 && (this.field276[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field276[var11][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 != 1) {
            this.method116((byte) 121, 11, 21, 56);
        }
        if (arg6 == 8) {
            if (var9 == var11 && var10 + 1 == var8 && (this.field276[var11][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var10 - 1 == var8 && (this.field276[var11][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var11 && var8 == var10 && (this.field276[var11][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var11 && var8 == var10 && (this.field276[var11][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 691)
    public static void method121(boolean arg0) {
        field298 = null;
        field279 = null;
        field303 = null;
        field300 = null;
        field274 = null;
        field297 = null;
        field299 = null;
        field301 = null;
        if (arg0) {
            field291 = null;
            field294 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 717)
    public static final void method122(int arg0) {
        for (int var1 = 0; var1 < class50.field1191; var1++) {
            int var10002 = class118.field2680[var1]--;
            if (class118.field2680[var1] >= -10) {
                class68 var3 = class90.field2039[var1];
                if (var3 == null) {
                    var3 = class68.method481(class125.field2844, class78.field1804[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class118.field2680[var1] += var3.method480();
                    class90.field2039[var1] = var3;
                }
                if (class118.field2680[var1] < 0) {
                    class87 var4 = var3.method479().method603(class56.field1304);
                    class74 var5 = class74.method513(var4, 100, class107.field2445);
                    var5.method511(class114.field2598[var1] - 1);
                    class99.field2200.method250(var5);
                    class118.field2680[var1] = -100;
                }
            } else {
                class50.field1191--;
                for (int var2 = var1; var2 < class50.field1191; var2++) {
                    class78.field1804[var2] = class78.field1804[var2 + 1];
                    class90.field2039[var2] = class90.field2039[var2 + 1];
                    class114.field2598[var2] = class114.field2598[var2 + 1];
                    class118.field2680[var2] = class118.field2680[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != 256) {
            field297 = null;
        }
        if (class85.field1957 > 0) {
            class85.field1957 -= 20;
            if (class85.field1957 < 0) {
                class85.field1957 = 0;
            }
            if (class85.field1957 == 0 && class61.field1477 != 0 && class57.field1323 != -1) {
                class18.method154(class61.field1477, class57.field1323, class128.field2956, 0, 0, (byte) -106, false);
            }
        }
        field292++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)Lub;", line = 801)
    public static final class117 method123(boolean arg0) {
        field283++;
        class117 var1 = new class117(class64.field1547, class107.field2450, class86.field1973, class28.field701, class57.field1320);
        if (arg0) {
            field302 = 48;
        }
        class1.method5((byte) 113);
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 824)
    public final void method124(int arg0) {
        field295++;
        if (arg0 > -102) {
            return;
        }
        for (int var2 = 0; var2 < this.field281; var2++) {
            for (int var3 = 0; var3 < this.field277; var3++) {
                if (var2 == 0 || var3 == 0 || this.field281 - 1 == var2 || this.field277 - 1 == var3) {
                    this.field276[var2][var3] = 16777215;
                } else {
                    this.field276[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V", line = 858)
    public final void method125(int arg0, int arg1, int arg2) {
        if (arg1 > -121) {
            this.method117(98, 54, -99, -124, 2, -63, (byte) -49, 39);
        }
        int var4 = arg2 - this.field285;
        int var5 = arg0 - this.field296;
        this.field276[var5][var4] = class59.method430(this.field276[var5][var4], 2097152);
        field287++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZIB)V", line = 880)
    public final void method126(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        int var7 = arg1 - this.field296;
        int var8 = 81 % ((71 - arg5) / 40);
        int var9 = arg2 - this.field285;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method115((byte) -108, var9, var7, 128);
                this.method115((byte) -108, var9, var7 - 1, 8);
            }
            if (arg4 == 1) {
                this.method115((byte) -108, var9, var7, 2);
                this.method115((byte) -108, var9 + 1, var7, 32);
            }
            if (arg4 == 2) {
                this.method115((byte) -108, var9, var7, 8);
                this.method115((byte) -108, var9, var7 + 1, 128);
            }
            if (arg4 == 3) {
                this.method115((byte) -108, var9, var7, 32);
                this.method115((byte) -108, var9 - 1, var7, 2);
            }
        }
        field270++;
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method115((byte) -108, var9, var7, 1);
                this.method115((byte) -108, var9 + 1, var7 + -1, 16);
            }
            if (arg4 == 1) {
                this.method115((byte) -108, var9, var7, 4);
                this.method115((byte) -108, var9 + 1, var7 + 1, 64);
            }
            if (arg4 == 2) {
                this.method115((byte) -108, var9, var7, 16);
                this.method115((byte) -108, var9 - 1, var7 + 1, 1);
            }
            if (arg4 == 3) {
                this.method115((byte) -108, var9, var7, 64);
                this.method115((byte) -108, var9 - 1, var7 + -1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method115((byte) -108, var9, var7, 130);
                this.method115((byte) -108, var9, var7 - 1, 8);
                this.method115((byte) -108, var9 + 1, var7, 32);
            }
            if (arg4 == 1) {
                this.method115((byte) -108, var9, var7, 10);
                this.method115((byte) -108, var9 + 1, var7, 32);
                this.method115((byte) -108, var9, var7 + 1, 128);
            }
            if (arg4 == 2) {
                this.method115((byte) -108, var9, var7, 40);
                this.method115((byte) -108, var9, var7 + 1, 128);
                this.method115((byte) -108, var9 - 1, var7, 2);
            }
            if (arg4 == 3) {
                this.method115((byte) -108, var9, var7, 160);
                this.method115((byte) -108, var9 - 1, var7, 2);
                this.method115((byte) -108, var9, var7 - 1, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method115((byte) -108, var9, var7, 65536);
                this.method115((byte) -108, var9, var7 - 1, 4096);
            }
            if (arg4 == 1) {
                this.method115((byte) -108, var9, var7, 1024);
                this.method115((byte) -108, var9 + 1, var7, 16384);
            }
            if (arg4 == 2) {
                this.method115((byte) -108, var9, var7, 4096);
                this.method115((byte) -108, var9, var7 + 1, 65536);
            }
            if (arg4 == 3) {
                this.method115((byte) -108, var9, var7, 16384);
                this.method115((byte) -108, var9 - 1, var7, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method115((byte) -108, var9, var7, 512);
                this.method115((byte) -108, var9 + 1, var7 - 1, 8192);
            }
            if (arg4 == 1) {
                this.method115((byte) -108, var9, var7, 2048);
                this.method115((byte) -108, var9 + 1, var7 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method115((byte) -108, var9, var7, 8192);
                this.method115((byte) -108, var9 - 1, var7 - -1, 512);
            }
            if (arg4 == 3) {
                this.method115((byte) -108, var9, var7, 32768);
                this.method115((byte) -108, var9 - 1, var7 + -1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method115((byte) -108, var9, var7, 66560);
            this.method115((byte) -108, var9, var7 - 1, 4096);
            this.method115((byte) -108, var9 + 1, var7, 16384);
        }
        if (arg4 == 1) {
            this.method115((byte) -108, var9, var7, 5120);
            this.method115((byte) -108, var9 + 1, var7, 16384);
            this.method115((byte) -108, var9, var7 + 1, 65536);
        }
        if (arg4 == 2) {
            this.method115((byte) -108, var9, var7, 20480);
            this.method115((byte) -108, var9, var7 + 1, 65536);
            this.method115((byte) -108, var9 - 1, var7, 1024);
        }
        if (arg4 == 3) {
            this.method115((byte) -108, var9, var7, 81920);
            this.method115((byte) -108, var9 - 1, var7, 1024);
            this.method115((byte) -108, var9, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(II)V", line = 1111)
    public class15(int arg0, int arg1) {
        this.field281 = arg0;
        this.field277 = arg1;
        this.field276 = new int[this.field281][this.field277];
        this.field285 = 0;
        this.field296 = 0;
        this.method124(-120);
    }
}
