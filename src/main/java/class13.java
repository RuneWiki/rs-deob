import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class13 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "[[I")
    public int[][] field171;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Ljava/lang/String;")
    public static String field173 = null;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "[Z")
    public static boolean[] field184 = new boolean[112];

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "J")
    public static long field174 = 0L;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Lv;")
    public static class254 field172;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
    private final void method80(int arg0, int arg1, int arg2, int arg3) {
        field166++;
        if (arg2 != 8) {
            this.method88(47, 11, 42, 114);
        }
        this.field171[arg1][arg3] = class64.method498(this.field171[arg1][arg3], ~arg0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZZIIB)V")
    public final void method81(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        int var8 = arg1 - this.field175;
        field180++;
        int var9 = arg4 - this.field169;
        int var10 = 18 / ((arg6 + 63) / 37);
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method80(128, var8, 8, var9);
                this.method80(8, var8 - 1, 8, var9);
            }
            if (arg5 == 1) {
                this.method80(2, var8, 8, var9);
                this.method80(32, var8, 8, var9 + 1);
            }
            if (arg5 == 2) {
                this.method80(8, var8, 8, var9);
                this.method80(128, var8 + 1, 8, var9);
            }
            if (arg5 == 3) {
                this.method80(32, var8, 8, var9);
                this.method80(2, var8, 8, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method80(1, var8, 8, var9);
                this.method80(16, var8 - 1, 8, var9 + 1);
            }
            if (arg5 == 1) {
                this.method80(4, var8, 8, var9);
                this.method80(64, var8 + 1, 8, var9 + 1);
            }
            if (arg5 == 2) {
                this.method80(16, var8, 8, var9);
                this.method80(1, var8 + 1, 8, var9 - 1);
            }
            if (arg5 == 3) {
                this.method80(64, var8, 8, var9);
                this.method80(4, var8 - 1, 8, var9 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method80(130, var8, 8, var9);
                this.method80(8, var8 - 1, 8, var9);
                this.method80(32, var8, 8, var9 + 1);
            }
            if (arg5 == 1) {
                this.method80(10, var8, 8, var9);
                this.method80(32, var8, 8, var9 + 1);
                this.method80(128, var8 + 1, 8, var9);
            }
            if (arg5 == 2) {
                this.method80(40, var8, 8, var9);
                this.method80(128, var8 + 1, 8, var9);
                this.method80(2, var8, 8, var9 - 1);
            }
            if (arg5 == 3) {
                this.method80(160, var8, 8, var9);
                this.method80(2, var8, 8, var9 - 1);
                this.method80(8, var8 - 1, 8, var9);
            }
        }
        if (arg2) {
            if (arg0 == 0) {
                if (arg5 == 0) {
                    this.method80(65536, var8, 8, var9);
                    this.method80(4096, var8 - 1, 8, var9);
                }
                if (arg5 == 1) {
                    this.method80(1024, var8, 8, var9);
                    this.method80(16384, var8, 8, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method80(4096, var8, 8, var9);
                    this.method80(65536, var8 + 1, 8, var9);
                }
                if (arg5 == 3) {
                    this.method80(16384, var8, 8, var9);
                    this.method80(1024, var8, 8, var9 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg5 == 0) {
                    this.method80(512, var8, 8, var9);
                    this.method80(8192, var8 - 1, 8, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method80(2048, var8, 8, var9);
                    this.method80(32768, var8 + 1, 8, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method80(8192, var8, 8, var9);
                    this.method80(512, var8 + 1, 8, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method80(32768, var8, 8, var9);
                    this.method80(2048, var8 - 1, 8, var9 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg5 == 0) {
                    this.method80(66560, var8, 8, var9);
                    this.method80(4096, var8 - 1, 8, var9);
                    this.method80(16384, var8, 8, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method80(5120, var8, 8, var9);
                    this.method80(16384, var8, 8, var9 + 1);
                    this.method80(65536, var8 + 1, 8, var9);
                }
                if (arg5 == 2) {
                    this.method80(20480, var8, 8, var9);
                    this.method80(65536, var8 + 1, 8, var9);
                    this.method80(1024, var8, 8, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method80(81920, var8, 8, var9);
                    this.method80(1024, var8, 8, var9 - 1);
                    this.method80(4096, var8 - 1, 8, var9);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method80(536870912, var8, 8, var9);
                this.method80(33554432, var8 - 1, 8, var9);
            }
            if (arg5 == 1) {
                this.method80(8388608, var8, 8, var9);
                this.method80(134217728, var8, 8, var9 + 1);
            }
            if (arg5 == 2) {
                this.method80(33554432, var8, 8, var9);
                this.method80(536870912, var8 + 1, 8, var9);
            }
            if (arg5 == 3) {
                this.method80(134217728, var8, 8, var9);
                this.method80(8388608, var8, 8, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method80(4194304, var8, 8, var9);
                this.method80(67108864, var8 - 1, 8, var9 + 1);
            }
            if (arg5 == 1) {
                this.method80(16777216, var8, 8, var9);
                this.method80(268435456, var8 + 1, 8, var9 + 1);
            }
            if (arg5 == 2) {
                this.method80(67108864, var8, 8, var9);
                this.method80(4194304, var8 + 1, 8, var9 - 1);
            }
            if (arg5 == 3) {
                this.method80(268435456, var8, 8, var9);
                this.method80(16777216, var8 - 1, 8, var9 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method80(545259520, var8, 8, var9);
            this.method80(33554432, var8 - 1, 8, var9);
            this.method80(134217728, var8, 8, var9 + 1);
        }
        if (arg5 == 1) {
            this.method80(41943040, var8, 8, var9);
            this.method80(134217728, var8, 8, var9 + 1);
            this.method80(536870912, var8 + 1, 8, var9);
        }
        if (arg5 == 2) {
            this.method80(167772160, var8, 8, var9);
            this.method80(536870912, var8 + 1, 8, var9);
            this.method80(8388608, var8, 8, var9 - 1);
        }
        if (arg5 == 3) {
            this.method80(671088640, var8, 8, var9);
            this.method80(8388608, var8, 8, var9 - 1);
            this.method80(33554432, var8 - 1, 8, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZIIZ)V")
    public final void method82(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field182++;
        int var8 = arg0 - this.field169;
        if (arg5 < 8) {
            this.method87(57, -34, (byte) -13);
        }
        int var9 = arg4 - this.field175;
        int var10 = 256;
        if (arg6) {
            var10 |= 0x20000;
        }
        if (arg3) {
            var10 |= 0x40000000;
        }
        for (int var11 = var9; var11 < arg1 + var9; var11++) {
            if (var11 >= 0 && var11 < this.field167) {
                for (int var12 = var8; var12 < (var8 + arg2); var12++) {
                    if (var12 >= 0 && var12 < this.field181) {
                        this.method88(var12, var10, -2, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIZZII)V")
    public final void method83(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        if (arg6 != -3222) {
            field174 = 120L;
        }
        field177++;
        if (arg7 == 1 || arg7 == 3) {
            int var9 = arg2;
            arg2 = arg1;
            arg1 = var9;
        }
        int var10 = arg0 - this.field175;
        int var11 = 256;
        int var12 = arg3 - this.field169;
        if (arg5) {
            var11 |= 0x20000;
        }
        if (arg4) {
            var11 |= 0x40000000;
        }
        for (int var13 = var10; var13 < arg2 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field167) {
                for (int var14 = var12; var14 < arg1 + var12; var14++) {
                    if (var14 >= 0 && this.field181 > var14) {
                        this.method80(var11, var13, 8, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 > -72) {
            return;
        }
        for (int var2 = 0; var2 < this.field167; var2++) {
            for (int var3 = 0; var3 < this.field181; var3++) {
                if (var2 == 0 || var3 == 0 || this.field167 - 5 <= var2 || this.field181 - 5 <= var3) {
                    this.field171[var2][var3] = 16777215;
                } else {
                    this.field171[var2][var3] = 2097152;
                }
            }
        }
        field170++;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIZIIZ)V")
    public final void method85(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg4 - this.field169;
        int var9 = -115 / ((arg5 + 3) / 61);
        int var10 = arg0 - this.field175;
        field168++;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method88(var8, 128, -2, var10);
                this.method88(var8, 8, -2, var10 - 1);
            }
            if (arg2 == 1) {
                this.method88(var8, 2, -2, var10);
                this.method88(var8 + 1, 32, -2, var10);
            }
            if (arg2 == 2) {
                this.method88(var8, 8, -2, var10);
                this.method88(var8, 128, -2, var10 + 1);
            }
            if (arg2 == 3) {
                this.method88(var8, 32, -2, var10);
                this.method88(var8 - 1, 2, -2, var10);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method88(var8, 1, -2, var10);
                this.method88(var8 + 1, 16, -2, var10 - 1);
            }
            if (arg2 == 1) {
                this.method88(var8, 4, -2, var10);
                this.method88(var8 + 1, 64, -2, var10 + 1);
            }
            if (arg2 == 2) {
                this.method88(var8, 16, -2, var10);
                this.method88(var8 - 1, 1, -2, var10 + 1);
            }
            if (arg2 == 3) {
                this.method88(var8, 64, -2, var10);
                this.method88(var8 - 1, 4, -2, var10 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method88(var8, 130, -2, var10);
                this.method88(var8, 8, -2, var10 - 1);
                this.method88(var8 + 1, 32, -2, var10);
            }
            if (arg2 == 1) {
                this.method88(var8, 10, -2, var10);
                this.method88(var8 + 1, 32, -2, var10);
                this.method88(var8, 128, -2, var10 + 1);
            }
            if (arg2 == 2) {
                this.method88(var8, 40, -2, var10);
                this.method88(var8, 128, -2, var10 + 1);
                this.method88(var8 - 1, 2, -2, var10);
            }
            if (arg2 == 3) {
                this.method88(var8, 160, -2, var10);
                this.method88(var8 - 1, 2, -2, var10);
                this.method88(var8, 8, -2, var10 - 1);
            }
        }
        if (arg6) {
            if (arg1 == 0) {
                if (arg2 == 0) {
                    this.method88(var8, 65536, -2, var10);
                    this.method88(var8, 4096, -2, var10 - 1);
                }
                if (arg2 == 1) {
                    this.method88(var8, 1024, -2, var10);
                    this.method88(var8 + 1, 16384, -2, var10);
                }
                if (arg2 == 2) {
                    this.method88(var8, 4096, -2, var10);
                    this.method88(var8, 65536, -2, var10 + 1);
                }
                if (arg2 == 3) {
                    this.method88(var8, 16384, -2, var10);
                    this.method88(var8 - 1, 1024, -2, var10);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg2 == 0) {
                    this.method88(var8, 512, -2, var10);
                    this.method88(var8 + 1, 8192, -2, var10 - 1);
                }
                if (arg2 == 1) {
                    this.method88(var8, 2048, -2, var10);
                    this.method88(var8 + 1, 32768, -2, var10 + 1);
                }
                if (arg2 == 2) {
                    this.method88(var8, 8192, -2, var10);
                    this.method88(var8 - 1, 512, -2, var10 + 1);
                }
                if (arg2 == 3) {
                    this.method88(var8, 32768, -2, var10);
                    this.method88(var8 - 1, 2048, -2, var10 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg2 == 0) {
                    this.method88(var8, 66560, -2, var10);
                    this.method88(var8, 4096, -2, var10 - 1);
                    this.method88(var8 + 1, 16384, -2, var10);
                }
                if (arg2 == 1) {
                    this.method88(var8, 5120, -2, var10);
                    this.method88(var8 + 1, 16384, -2, var10);
                    this.method88(var8, 65536, -2, var10 + 1);
                }
                if (arg2 == 2) {
                    this.method88(var8, 20480, -2, var10);
                    this.method88(var8, 65536, -2, var10 + 1);
                    this.method88(var8 - 1, 1024, -2, var10);
                }
                if (arg2 == 3) {
                    this.method88(var8, 81920, -2, var10);
                    this.method88(var8 - 1, 1024, -2, var10);
                    this.method88(var8, 4096, -2, var10 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method88(var8, 536870912, -2, var10);
                this.method88(var8, 33554432, -2, var10 - 1);
            }
            if (arg2 == 1) {
                this.method88(var8, 8388608, -2, var10);
                this.method88(var8 + 1, 134217728, -2, var10);
            }
            if (arg2 == 2) {
                this.method88(var8, 33554432, -2, var10);
                this.method88(var8, 536870912, -2, var10 + 1);
            }
            if (arg2 == 3) {
                this.method88(var8, 134217728, -2, var10);
                this.method88(var8 - 1, 8388608, -2, var10);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method88(var8, 4194304, -2, var10);
                this.method88(var8 + 1, 67108864, -2, var10 - 1);
            }
            if (arg2 == 1) {
                this.method88(var8, 16777216, -2, var10);
                this.method88(var8 + 1, 268435456, -2, var10 + 1);
            }
            if (arg2 == 2) {
                this.method88(var8, 67108864, -2, var10);
                this.method88(var8 - 1, 4194304, -2, var10 + 1);
            }
            if (arg2 == 3) {
                this.method88(var8, 268435456, -2, var10);
                this.method88(var8 - 1, 16777216, -2, var10 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method88(var8, 545259520, -2, var10);
            this.method88(var8, 33554432, -2, var10 - 1);
            this.method88(var8 + 1, 134217728, -2, var10);
        }
        if (arg2 == 1) {
            this.method88(var8, 41943040, -2, var10);
            this.method88(var8 + 1, 134217728, -2, var10);
            this.method88(var8, 536870912, -2, var10 + 1);
        }
        if (arg2 == 2) {
            this.method88(var8, 167772160, -2, var10);
            this.method88(var8, 536870912, -2, var10 + 1);
            this.method88(var8 - 1, 8388608, -2, var10);
        }
        if (arg2 == 3) {
            this.method88(var8, 671088640, -2, var10);
            this.method88(var8 - 1, 8388608, -2, var10);
            this.method88(var8, 33554432, -2, var10 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public static void method86(int arg0) {
        field184 = null;
        int var1 = 67 % ((6 - arg0) / 53);
        field173 = null;
        field172 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIB)V")
    public final void method87(int arg0, int arg1, byte arg2) {
        if (arg2 > 31) {
            field185++;
            int var4 = arg0 - this.field175;
            int var5 = arg1 - this.field169;
            this.field171[var4][var5] = class64.method498(this.field171[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIII)V")
    private final void method88(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -2) {
            field183++;
            this.field171[arg3][arg0] = class140.method1045(this.field171[arg3][arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V")
    public final void method89(int arg0, int arg1, int arg2) {
        if (arg1 == 28117) {
            field178++;
            int var4 = arg2 - this.field169;
            int var5 = arg0 - this.field175;
            this.field171[var5][var4] = class140.method1045(this.field171[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
    public final void method90(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field175;
        field186++;
        int var5 = arg1 - this.field169;
        if (arg2 == -17873) {
            this.field171[var4][var5] = class140.method1045(this.field171[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
    public static final void method91(boolean arg0, int arg1) {
        field176++;
        int var2 = class144.field2386;
        if (arg1 == 0) {
            var2 = 1;
        }
        if (!arg0) {
            field184 = null;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class213 var20;
            if (arg1 == 0) {
                var20 = class48.field878;
            } else {
                var20 = class191.field3129[class279.field4431[var3]];
            }
            if (var20 != null && var20.method1041((byte) -109)) {
                int var21 = var20.method1226((byte) -98);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field2849 & 0x7F) == 64 && (var20.field2887 & 0x7F) == 64) {
                            int var22 = var20.field2849 >> 7;
                            int var23 = var20.field2887 >> 7;
                            if (var22 >= 0 && var22 < 104 && var23 >= 0 && var23 < 104) {
                                var10002 = class258.field4112[var22][var23]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field2849 & 0x7F) == 0 && (var20.field2887 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field2849 & 0x7F) == 64 && (var20.field2887 & 0x7F) == 64)) {
                        int var24 = var20.field2849 - (var21 * 64) >> 7;
                        int var25 = var20.field2887 - (var21 * 64) >> 7;
                        int var26 = var24 + var20.method1226((byte) -122);
                        int var27 = var25 + var20.method1226((byte) -100);
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        for (int var28 = var24; var28 < var26; var28++) {
                            for (int var29 = var25; var29 < var27; var29++) {
                                var10002 = class258.field4112[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        label217: for (int var4 = 0; var4 < var2; var4++) {
            class213 var5;
            long var6;
            if (arg1 == 0) {
                var5 = class48.field878;
                var6 = 8791798054912L;
            } else {
                var5 = class191.field3129[class279.field4431[var4]];
                var6 = (long) class279.field4431[var4] << 32;
            }
            if (var5 != null && var5.method1041((byte) -105)) {
                int var8 = var5.method1226((byte) -116);
                if (arg1 == 0 || arg1 == var8) {
                    var5.field3421 = false;
                    var5.field2824 = true;
                    if ((class104.field1595 && class144.field2386 > 200 || class144.field2386 > 50) && arg1 != 0 && var5.field2901 == var5.method1224(-1).field651) {
                        var5.field3421 = true;
                    }
                    if (var8 == 1) {
                        if ((var5.field2849 & 0x7F) == 64 && (var5.field2887 & 0x7F) == 64) {
                            int var9 = var5.field2849 >> 7;
                            int var10 = var5.field2887 >> 7;
                            if (var9 < 0 || var9 >= 104 || var10 < 0 || var10 >= 104) {
                                continue;
                            }
                            if (class258.field4112[var9][var10] > 1) {
                                var10002 = class258.field4112[var9][var10]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var5.field2849 & 0x7F) == 0 && (var5.field2887 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var5.field2849 & 0x7F) == 64 && (var5.field2887 & 0x7F) == 0) {
                        int var11 = var5.field2887 - (var8 * 64) >> 7;
                        int var12 = var5.field2849 - var8 * 64 >> 7;
                        int var13 = var8 + var11;
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        int var14 = var8 + var12;
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        if (var14 > 104) {
                            var14 = 104;
                        }
                        if (var12 < 0) {
                            var12 = 0;
                        }
                        boolean var15 = true;
                        for (int var16 = var12; var16 < var14; var16++) {
                            for (int var19 = var11; var19 < var13; var19++) {
                                if (class258.field4112[var16][var19] <= 1) {
                                    var15 = false;
                                    break;
                                }
                            }
                        }
                        if (var15) {
                            int var17 = var12;
                            while (true) {
                                if (var14 <= var17) {
                                    continue label217;
                                }
                                for (int var18 = var11; var18 < var13; var18++) {
                                    var10002 = class258.field4112[var17][var18]--;
                                }
                                var17++;
                            }
                        }
                    }
                    if (var5.field2820 == null || class207.field3336 < var5.field2855 || var5.field2853 <= class207.field3336) {
                        var5.field2824 = false;
                        var5.field2851 = class218.method1450(var5.field2887, var5.field2849, true, class92.field1448);
                        class130.method942(class92.field1448, var5.field2849, var5.field2887, var5.field2851, (var8 - 1) * 64 + 60, var5, var5.field2831, var6, var5.field2837);
                    } else {
                        var5.field2824 = false;
                        var5.field3421 = false;
                        var5.field2851 = class218.method1450(var5.field2887, var5.field2849, true, class92.field1448);
                        class113.method835(class92.field1448, var5.field2849, var5.field2887, var5.field2851, var5, var5.field2831, var6, var5.field2827, var5.field2879, var5.field2852, var5.field2873);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field179++;
        if (!arg5) {
            return;
        }
        if (arg0 == arg1) {
            class293.method1960(-121, arg2, arg6, arg3, arg7, arg1, arg4);
        } else if (class32.field540 <= arg3 - arg1 && arg1 + arg3 <= class61.field1034 && (arg2 - arg0) >= class108.field1650 && class154.field2509 >= arg0 + arg2) {
            class288.method1940(arg0, arg2, arg3, arg1, arg6, arg4, (byte) -74, arg7);
        } else {
            class153.method1109(arg2, arg6, arg3, true, arg1, arg7, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(II)V")
    public class13(int arg0, int arg1) {
        this.field167 = arg0;
        this.field175 = 0;
        this.field181 = arg1;
        this.field171 = new int[this.field167][this.field181];
        this.field169 = 0;
        this.method84(-88);
    }
}
