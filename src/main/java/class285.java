import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class285 {

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "Las;")
    public static class151 field4054 = new class151(6, 0, 4, 2);

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public int field4041;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public int field4051;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "[[I")
    public int[][] field4035;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIZIZ)V")
    public final void method1857(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field4041;
        field4053++;
        int var9 = arg0 - this.field4046;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1862(128, var8, (byte) 68, var9);
                this.method1862(8, var8, (byte) 68, var9 - 1);
            }
            if (arg1 == 1) {
                this.method1862(2, var8, (byte) 68, var9);
                this.method1862(32, var8 + 1, (byte) 68, var9);
            }
            if (arg1 == 2) {
                this.method1862(8, var8, (byte) 68, var9);
                this.method1862(128, var8, (byte) 68, var9 + 1);
            }
            if (arg1 == 3) {
                this.method1862(32, var8, (byte) 68, var9);
                this.method1862(2, var8 - 1, (byte) 68, var9);
            }
        }
        if (arg3 == arg5 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1862(1, var8, (byte) 68, var9);
                this.method1862(16, var8 + 1, (byte) 68, var9 - 1);
            }
            if (arg1 == 1) {
                this.method1862(4, var8, (byte) 68, var9);
                this.method1862(64, var8 + 1, (byte) 68, var9 + 1);
            }
            if (arg1 == 2) {
                this.method1862(16, var8, (byte) 68, var9);
                this.method1862(1, var8 - 1, (byte) 68, var9 + 1);
            }
            if (arg1 == 3) {
                this.method1862(64, var8, (byte) 68, var9);
                this.method1862(4, var8 - 1, (byte) 68, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method1862(130, var8, (byte) 68, var9);
                this.method1862(8, var8, (byte) 68, var9 - 1);
                this.method1862(32, var8 + 1, (byte) 68, var9);
            }
            if (arg1 == 1) {
                this.method1862(10, var8, (byte) 68, var9);
                this.method1862(32, var8 + 1, (byte) 68, var9);
                this.method1862(128, var8, (byte) 68, var9 + 1);
            }
            if (arg1 == 2) {
                this.method1862(40, var8, (byte) 68, var9);
                this.method1862(128, var8, (byte) 68, var9 + 1);
                this.method1862(2, var8 - 1, (byte) 68, var9);
            }
            if (arg1 == 3) {
                this.method1862(160, var8, (byte) 68, var9);
                this.method1862(2, var8 - 1, (byte) 68, var9);
                this.method1862(8, var8, (byte) 68, var9 - 1);
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method1862(65536, var8, (byte) 68, var9);
                    this.method1862(4096, var8, (byte) 68, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method1862(1024, var8, (byte) 68, var9);
                    this.method1862(16384, var8 + 1, (byte) 68, var9);
                }
                if (arg1 == 2) {
                    this.method1862(4096, var8, (byte) 68, var9);
                    this.method1862(65536, var8, (byte) 68, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method1862(16384, var8, (byte) 68, var9);
                    this.method1862(1024, var8 - 1, (byte) 68, var9);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method1862(512, var8, (byte) 68, var9);
                    this.method1862(8192, var8 + 1, (byte) 68, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method1862(2048, var8, (byte) 68, var9);
                    this.method1862(32768, var8 + 1, (byte) 68, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method1862(8192, var8, (byte) 68, var9);
                    this.method1862(512, var8 - 1, (byte) 68, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method1862(32768, var8, (byte) 68, var9);
                    this.method1862(2048, var8 - 1, (byte) 68, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method1862(66560, var8, (byte) 68, var9);
                    this.method1862(4096, var8, (byte) 68, var9 - 1);
                    this.method1862(16384, var8 + 1, (byte) 68, var9);
                }
                if (arg1 == 1) {
                    this.method1862(5120, var8, (byte) 68, var9);
                    this.method1862(16384, var8 + 1, (byte) 68, var9);
                    this.method1862(65536, var8, (byte) 68, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method1862(20480, var8, (byte) 68, var9);
                    this.method1862(65536, var8, (byte) 68, var9 + 1);
                    this.method1862(1024, var8 - 1, (byte) 68, var9);
                }
                if (arg1 == 3) {
                    this.method1862(81920, var8, (byte) 68, var9);
                    this.method1862(1024, var8 - 1, (byte) 68, var9);
                    this.method1862(4096, var8, (byte) 68, var9 - 1);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1862(536870912, var8, (byte) 68, var9);
                this.method1862(33554432, var8, (byte) 68, var9 - 1);
            }
            if (arg1 == 1) {
                this.method1862(8388608, var8, (byte) 68, var9);
                this.method1862(134217728, var8 + 1, (byte) 68, var9);
            }
            if (arg1 == 2) {
                this.method1862(33554432, var8, (byte) 68, var9);
                this.method1862(536870912, var8, (byte) 68, var9 + 1);
            }
            if (arg1 == 3) {
                this.method1862(134217728, var8, (byte) 68, var9);
                this.method1862(8388608, var8 - 1, (byte) 68, var9);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1862(4194304, var8, (byte) 68, var9);
                this.method1862(67108864, var8 + 1, (byte) 68, var9 - 1);
            }
            if (arg1 == 1) {
                this.method1862(16777216, var8, (byte) 68, var9);
                this.method1862(268435456, var8 + 1, (byte) 68, var9 + 1);
            }
            if (arg1 == 2) {
                this.method1862(67108864, var8, (byte) 68, var9);
                this.method1862(4194304, var8 - 1, (byte) 68, var9 + 1);
            }
            if (arg1 == 3) {
                this.method1862(268435456, var8, (byte) 68, var9);
                this.method1862(16777216, var8 - 1, (byte) 68, var9 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1862(545259520, var8, (byte) 68, var9);
            this.method1862(33554432, var8, (byte) 68, var9 - 1);
            this.method1862(134217728, var8 + 1, (byte) 68, var9);
        }
        if (arg1 == 1) {
            this.method1862(41943040, var8, (byte) 68, var9);
            this.method1862(134217728, var8 + 1, (byte) 68, var9);
            this.method1862(536870912, var8, (byte) 68, var9 + 1);
        }
        if (arg1 == 2) {
            this.method1862(167772160, var8, (byte) 68, var9);
            this.method1862(536870912, var8, (byte) 68, var9 + 1);
            this.method1862(8388608, var8 - 1, (byte) 68, var9);
        }
        if (arg1 == 3) {
            this.method1862(671088640, var8, (byte) 68, var9);
            this.method1862(8388608, var8 - 1, (byte) 68, var9);
            this.method1862(33554432, var8, (byte) 68, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIBIIZII)V")
    public final void method1858(boolean arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4048++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field4041;
        int var11 = arg3 - this.field4046;
        if (arg0) {
            var9 |= 0x40000000;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var12 = arg7;
            arg7 = arg6;
            arg6 = var12;
        }
        if (arg2 < 31) {
            this.field4041 = -78;
        }
        for (int var13 = var11; var13 < (arg7 + var11); var13++) {
            if (var13 >= 0 && this.field4051 > var13) {
                for (int var14 = var10; var14 < (var10 + arg6); var14++) {
                    if (var14 >= 0 && this.field4044 > var14) {
                        this.method1870(var14, var13, var9, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZIZIII)V")
    public final void method1859(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field4043++;
        int var8 = arg2 - this.field4046;
        int var9 = arg4 - this.field4041;
        if (arg5 != 0) {
            this.method1862(32, -1, (byte) 23, -98);
        }
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method1870(var9, var8, 128, false);
                this.method1870(var9, var8 - 1, 8, false);
            }
            if (arg0 == 1) {
                this.method1870(var9, var8, 2, false);
                this.method1870(var9 + 1, var8, 32, false);
            }
            if (arg0 == 2) {
                this.method1870(var9, var8, 8, false);
                this.method1870(var9, var8 + 1, 128, false);
            }
            if (arg0 == 3) {
                this.method1870(var9, var8, 32, false);
                this.method1870(var9 - 1, var8, 2, false);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method1870(var9, var8, 1, false);
                this.method1870(var9 + 1, var8 + -1, 16, false);
            }
            if (arg0 == 1) {
                this.method1870(var9, var8, 4, false);
                this.method1870(var9 + 1, var8 - -1, 64, false);
            }
            if (arg0 == 2) {
                this.method1870(var9, var8, 16, false);
                this.method1870(var9 - 1, var8 - -1, 1, false);
            }
            if (arg0 == 3) {
                this.method1870(var9, var8, 64, false);
                this.method1870(var9 - 1, var8 + -1, 4, false);
            }
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                this.method1870(var9, var8, 130, false);
                this.method1870(var9, var8 - 1, 8, false);
                this.method1870(var9 + 1, var8, 32, false);
            }
            if (arg0 == 1) {
                this.method1870(var9, var8, 10, false);
                this.method1870(var9 + 1, var8, 32, false);
                this.method1870(var9, var8 + 1, 128, false);
            }
            if (arg0 == 2) {
                this.method1870(var9, var8, 40, false);
                this.method1870(var9, var8 + 1, 128, false);
                this.method1870(var9 - 1, var8, 2, false);
            }
            if (arg0 == 3) {
                this.method1870(var9, var8, 160, false);
                this.method1870(var9 - 1, var8, 2, false);
                this.method1870(var9, var8 - 1, 8, false);
            }
        }
        if (arg1) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method1870(var9, var8, 65536, false);
                    this.method1870(var9, var8 - 1, 4096, false);
                }
                if (arg0 == 1) {
                    this.method1870(var9, var8, 1024, false);
                    this.method1870(var9 + 1, var8, 16384, false);
                }
                if (arg0 == 2) {
                    this.method1870(var9, var8, 4096, false);
                    this.method1870(var9, var8 + 1, 65536, false);
                }
                if (arg0 == 3) {
                    this.method1870(var9, var8, 16384, false);
                    this.method1870(var9 - 1, var8, 1024, false);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method1870(var9, var8, 512, false);
                    this.method1870(var9 + 1, var8 + -1, 8192, false);
                }
                if (arg0 == 1) {
                    this.method1870(var9, var8, 2048, false);
                    this.method1870(var9 + 1, var8 + 1, 32768, false);
                }
                if (arg0 == 2) {
                    this.method1870(var9, var8, 8192, false);
                    this.method1870(var9 - 1, var8 - -1, 512, false);
                }
                if (arg0 == 3) {
                    this.method1870(var9, var8, 32768, false);
                    this.method1870(var9 - 1, var8 + -1, 2048, false);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method1870(var9, var8, 66560, false);
                    this.method1870(var9, var8 - 1, 4096, false);
                    this.method1870(var9 + 1, var8, 16384, false);
                }
                if (arg0 == 1) {
                    this.method1870(var9, var8, 5120, false);
                    this.method1870(var9 + 1, var8, 16384, false);
                    this.method1870(var9, var8 + 1, 65536, false);
                }
                if (arg0 == 2) {
                    this.method1870(var9, var8, 20480, false);
                    this.method1870(var9, var8 + 1, 65536, false);
                    this.method1870(var9 - 1, var8, 1024, false);
                }
                if (arg0 == 3) {
                    this.method1870(var9, var8, 81920, false);
                    this.method1870(var9 - 1, var8, 1024, false);
                    this.method1870(var9, var8 - 1, 4096, false);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method1870(var9, var8, 536870912, false);
                this.method1870(var9, var8 - 1, 33554432, false);
            }
            if (arg0 == 1) {
                this.method1870(var9, var8, 8388608, false);
                this.method1870(var9 + 1, var8, 134217728, false);
            }
            if (arg0 == 2) {
                this.method1870(var9, var8, 33554432, false);
                this.method1870(var9, var8 + 1, 536870912, false);
            }
            if (arg0 == 3) {
                this.method1870(var9, var8, 134217728, false);
                this.method1870(var9 - 1, var8, 8388608, false);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method1870(var9, var8, 4194304, false);
                this.method1870(var9 + 1, var8 + -1, 67108864, false);
            }
            if (arg0 == 1) {
                this.method1870(var9, var8, 16777216, false);
                this.method1870(var9 + 1, var8 + 1, 268435456, false);
            }
            if (arg0 == 2) {
                this.method1870(var9, var8, 67108864, false);
                this.method1870(var9 - 1, var8 - -1, 4194304, false);
            }
            if (arg0 == 3) {
                this.method1870(var9, var8, 268435456, false);
                this.method1870(var9 - 1, var8 + -1, 16777216, false);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1870(var9, var8, 545259520, false);
            this.method1870(var9, var8 - 1, 33554432, false);
            this.method1870(var9 + 1, var8, 134217728, false);
        }
        if (arg0 == 1) {
            this.method1870(var9, var8, 41943040, false);
            this.method1870(var9 + 1, var8, 134217728, false);
            this.method1870(var9, var8 + 1, 536870912, false);
        }
        if (arg0 == 2) {
            this.method1870(var9, var8, 167772160, false);
            this.method1870(var9, var8 + 1, 536870912, false);
            this.method1870(var9 - 1, var8, 8388608, false);
        }
        if (arg0 == 3) {
            this.method1870(var9, var8, 671088640, false);
            this.method1870(var9 - 1, var8, 8388608, false);
            this.method1870(var9, var8 - 1, 33554432, false);
            return;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZ)V")
    public final void method1860(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field4046;
        int var5 = arg0 - this.field4041;
        field4045++;
        this.field4035[var4][var5] = class325.method2116(this.field4035[var4][var5], 262144);
        if (arg2) {
            this.method1867(-105, true, -103);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/net/Socket;I)Lkr;")
    public static final class744 method1861(int arg0, Socket arg1, int arg2) throws IOException {
        int var3 = 36 / ((-arg2 - 42) / 36);
        field4038++;
        return new class476(arg1, arg0);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIBI)V")
    private final void method1862(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 68) {
            this.method1871((byte) -20);
        }
        this.field4035[arg3][arg1] = class325.method2116(this.field4035[arg3][arg1], arg0);
        field4055++;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BII)V")
    public final void method1863(byte arg0, int arg1, int arg2) {
        field4050++;
        if (arg0 != -47) {
            this.field4035 = null;
        }
        int var4 = arg1 - this.field4041;
        int var5 = arg2 - this.field4046;
        this.field4035[var5][var4] = class286.method1877(this.field4035[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static void method1864(int arg0) {
        field4054 = null;
        if (arg0 != -3570) {
            field4054 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIIIIIZ)Z")
    public final boolean method1865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field4047++;
        if (arg5 > 1) {
            return class427.method2601(arg2, arg6, arg5, arg3, arg1, true, arg5, arg0, arg4) ? true : this.method1866(arg1, arg2, arg5, arg3, arg6, -1, arg5, arg4, arg7, arg0);
        }
        int var10 = arg6 + arg2 - 1;
        int var11 = arg4 + arg1 - 1;
        if (arg6 <= arg0 && var10 >= arg0 && arg4 <= arg3 && arg3 <= var11) {
            return true;
        }
        if (arg8) {
            this.field4035 = null;
        }
        if (arg6 - 1 == arg0 && arg3 >= arg4 && var11 >= arg3 && (this.field4035[arg0 - this.field4046][arg3 - this.field4041] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg0 && arg4 <= arg3 && arg3 <= var11 && (this.field4035[arg0 - this.field4046][arg3 - this.field4041] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if ((arg4 - 1) == arg3 && arg6 <= arg0 && var10 >= arg0 && (this.field4035[arg0 - this.field4046][arg3 - this.field4041] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg3 && arg0 >= arg6 && arg0 <= var10 && (this.field4035[arg0 - this.field4046][arg3 - this.field4041] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method1866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4042++;
        int var11 = arg6 + arg9;
        int var12 = arg3 + arg2;
        int var13 = arg4 + arg1;
        if (arg5 != -1) {
            this.field4035 = null;
        }
        int var14 = arg7 + arg0;
        if (arg9 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg7 >= arg3 ? arg7 : arg3;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field4035[var13 - this.field4046 - 1][var15 - this.field4041] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg4 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg3 <= arg7 ? arg7 : arg3;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field4035[arg4 - this.field4046][var17 - this.field4041] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg9 <= arg4 ? arg4 : arg9;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field4035[var19 - this.field4046][var14 - this.field4041 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg4 < arg9 ? arg9 : arg4;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field4035[var21 - this.field4046][arg7 - this.field4041] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZI)V")
    public final void method1867(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field4046;
        if (arg1) {
            this.method1859(127, false, -34, false, 56, 125, 78);
        }
        field4034++;
        int var5 = arg2 - this.field4041;
        this.field4035[var4][var5] = class325.method2116(this.field4035[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V")
    public final void method1868(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4046;
        if (arg2 != 26964) {
            this.field4035 = null;
        }
        int var5 = arg0 - this.field4041;
        field4049++;
        this.field4035[var4][var5] = class286.method1877(this.field4035[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method1869(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4040++;
        if (arg7 == 1) {
            if (arg1 == arg3 && arg0 == arg4) {
                return true;
            }
        } else if (arg1 >= arg3 && (arg7 + arg3 - 1) >= arg1 && arg0 >= arg0 && (arg0 - (1 - arg7)) >= arg0) {
            return true;
        }
        int var9 = arg1 - this.field4046;
        int var10 = arg4 - this.field4041;
        int var11 = 68 % ((27 - arg5) / 58);
        int var12 = arg3 - this.field4046;
        int var13 = arg0 - this.field4041;
        if (arg7 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var9 + 1 == var12 && var10 == var13 && (this.field4035[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var13 - 1 == var10 && (this.field4035[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - 1) == var12 && var10 == var13 && (this.field4035[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var13 - 1 == var10 && (this.field4035[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - 1) == var12 && var10 == var13 && (this.field4035[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var13 + 1) == var10 && (this.field4035[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 + 1) == var12 && var10 == var13 && (this.field4035[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var13 + 1) == var10 && (this.field4035[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var12 && var13 + 1 == var10 && (this.field4035[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var13 - 1 == var10 && (this.field4035[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var13 && (this.field4035[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var13 && (this.field4035[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg7 + var12 - 1;
            int var15 = arg7 + var10 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var12 && var10 <= var13 && var13 <= var15 && (this.field4035[var12][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var14 && (var13 - arg7) == var10 && (this.field4035[var9][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - arg7 == var12 && var13 >= var10 && var15 >= var13 && (this.field4035[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var14 && (var13 - arg7) == var10 && (this.field4035[var9][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - arg7) == var12 && var13 >= var10 && var15 >= var13 && (this.field4035[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var14 >= var9 && (var13 + 1) == var10 && (this.field4035[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 + 1) == var12 && var13 >= var10 && var15 >= var13 && (this.field4035[var12][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var14 && (var13 + 1) == var10 && (this.field4035[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 >= var12 && var9 <= var14 && var13 + 1 == var10 && (this.field4035[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var9 && var9 <= var14 && (var13 - arg7) == var10 && (this.field4035[var9][var15] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg7 == var12 && var13 >= var10 && var13 <= var15 && (this.field4035[var14][var13] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 <= var13 && var15 >= var13 && (this.field4035[var12][var13] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIZ)V")
    private final void method1870(int arg0, int arg1, int arg2, boolean arg3) {
        field4037++;
        if (arg3) {
            this.field4035 = null;
        }
        this.field4035[arg1][arg0] = class286.method1877(this.field4035[arg1][arg0], ~arg2);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public final void method1871(byte arg0) {
        for (int var2 = 0; var2 < this.field4051; var2++) {
            for (int var3 = 0; var3 < this.field4044; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field4051 - 5) <= var2 || var3 >= this.field4044 - 5) {
                    this.field4035[var2][var3] = -1;
                } else {
                    this.field4035[var2][var3] = 2097152;
                }
            }
        }
        field4056++;
        if (arg0 < 74) {
            this.field4035 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4052++;
        if (arg3 == 1) {
            if (arg0 == arg2 && arg1 == arg5) {
                return true;
            }
        } else if (arg0 <= arg2 && arg0 + arg3 - 1 >= arg2 && arg5 >= arg5 && (arg3 + arg5 - 1) >= arg5) {
            return true;
        }
        int var9 = arg0 - this.field4046;
        int var10 = arg2 - this.field4046;
        if (arg7 != -1) {
            this.method1869(75, 123, 39, 102, 33, (byte) 43, -101, -7);
        }
        int var11 = arg1 - this.field4041;
        int var12 = arg5 - this.field4041;
        if (arg3 == 1) {
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4035[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field4035[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4035[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field4035[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field4035[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field4035[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field4035[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field4035[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field4035[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field4035[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field4035[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 - (1 - arg3);
            int var14 = var11 - (1 - arg3);
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if ((var10 - arg3) == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field4035[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 - arg3) == var11 && (this.field4035[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - arg3) == var9 && var12 >= var11 && var14 >= var12 && (this.field4035[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12 && (this.field4035[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field4035[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 - arg3 == var11 && (this.field4035[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 <= var10 && var13 >= var10 && var12 - arg3 == var11) {
                        return true;
                    }
                    if ((var10 - arg3) == var9 && var12 >= var11 && var14 >= var12 && (this.field4035[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14 && (this.field4035[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if ((var10 - arg3) == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 >= var11 && var14 >= var12 && (this.field4035[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 - arg3 == var11 && (this.field4035[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - arg3 == var9 && var12 >= var11 && var12 <= var14 && (this.field4035[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg3 == var11 && (this.field4035[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 - arg3) == var9 && var12 >= var11 && var12 <= var14 && (this.field4035[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field4035[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 - arg3) == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - arg3 == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 + 1) == var11 && (this.field4035[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var14 >= var12 && (this.field4035[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 - arg3) == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var10 >= var9 && var13 >= var10 && (var12 + 1) == var11 && (this.field4035[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var10 && var10 <= var13 && (var12 - arg3) == var11 && (this.field4035[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg3) == var9 && var11 <= var12 && var12 <= var14 && (this.field4035[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 <= var12 && var14 >= var12 && (this.field4035[var9][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)V")
    public static final void method1873(int arg0, int arg1) {
        field4039++;
        if (arg1 == 0) {
            class93.field1090 = arg0;
            class565.field8027.method4023((byte) 54);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZIIIZ)V")
    public final void method1874(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4036++;
        int var8 = arg3;
        if (arg2) {
            var8 = arg3 | 0x20000;
        }
        if (arg6) {
            var8 |= 0x40000000;
        }
        int var9 = arg0 - this.field4041;
        int var10 = arg5 - this.field4046;
        for (int var11 = var10; var11 < arg1 + var10; var11++) {
            if (var11 >= 0 && var11 < this.field4051) {
                for (int var12 = var9; var12 < arg4 + var9; var12++) {
                    if (var12 >= 0 && this.field4044 > var12) {
                        this.method1862(var8, var12, (byte) 68, var11);
                    }
                }
            }
        }
    }
}
