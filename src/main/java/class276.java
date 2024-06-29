import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class276 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    private int field4268 = 0;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    private int field4267;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    private int field4278;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[[I")
    public int[][] field4272;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "S")
    public static short field4270 = 205;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[S")
    public static short[] field4274;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V")
    public final void method1838(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field4277++;
            int var4 = arg0 - this.field4267;
            int var5 = arg1 - this.field4268;
            this.field4272[var4][var5] = class54.method339(this.field4272[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
    private final void method1839(int arg0, int arg1, int arg2, int arg3) {
        field4271++;
        int var5 = 97 / ((arg0 + 32) / 56);
        this.field4272[arg1][arg3] = class235.method1572(this.field4272[arg1][arg3], ~arg2);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIIIZZ)V")
    public final void method1840(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = arg3 - this.field4267;
        if (!arg1) {
            this.field4284 = 14;
        }
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var10 = arg2 - this.field4268;
        field4275++;
        for (int var11 = var8; var11 < (arg0 + var8); var11++) {
            if (var11 >= 0 && var11 < this.field4284) {
                for (int var12 = var10; var12 < (arg4 + var10); var12++) {
                    if (var12 >= 0 && this.field4278 > var12) {
                        this.method1842((byte) 121, var9, var12, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public final void method1841(byte arg0) {
        if (arg0 < 89) {
            return;
        }
        for (int var2 = 0; var2 < this.field4284; var2++) {
            for (int var3 = 0; var3 < this.field4278; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field4284 - 5 || (this.field4278 - 5) <= var3) {
                    this.field4272[var2][var3] = 16777215;
                } else {
                    this.field4272[var2][var3] = 2097152;
                }
            }
        }
        field4266++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIII)V")
    private final void method1842(byte arg0, int arg1, int arg2, int arg3) {
        field4276++;
        this.field4272[arg3][arg2] = class54.method339(this.field4272[arg3][arg2], arg1);
        if (arg0 != 121) {
            this.method1842((byte) 30, -39, -110, -110);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIIZZII)V")
    public final void method1843(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field4267;
        int var9 = arg2 - this.field4268;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method1839(-118, var8, 128, var9);
                this.method1839(61, var8 - 1, 8, var9);
            }
            if (arg5 == 1) {
                this.method1839(98, var8, 2, var9);
                this.method1839(-88, var8, 32, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1839(-99, var8, 8, var9);
                this.method1839(arg0 ^ 0x3F, var8 + 1, 128, var9);
            }
            if (arg5 == 3) {
                this.method1839(arg0 ^ 0xFFFFFFC9, var8, 32, var9);
                this.method1839(-102, var8, 2, var9 - 1);
            }
        }
        field4273++;
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method1839(62, var8, 1, var9);
                this.method1839(arg0 ^ 0x1D, var8 - 1, 16, var9 + 1);
            }
            if (arg5 == 1) {
                this.method1839(-115, var8, 4, var9);
                this.method1839(arg0 ^ 0xFFFFFFDA, var8 + 1, 64, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1839(arg0 ^ 0xFFFFFFA7, var8, 16, var9);
                this.method1839(39, var8 + 1, 1, var9 - 1);
            }
            if (arg5 == 3) {
                this.method1839(arg0 ^ 0x3B, var8, 64, var9);
                this.method1839(arg0 ^ 0x39, var8 - 1, 4, var9 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method1839(arg0 ^ 0xFFFFFFDC, var8, 130, var9);
                this.method1839(-89, var8 - 1, 8, var9);
                this.method1839(-91, var8, 32, var9 + 1);
            }
            if (arg5 == 1) {
                this.method1839(-92, var8, 10, var9);
                this.method1839(arg0 + 171, var8, 32, var9 + 1);
                this.method1839(arg0 ^ 0xFFFFFFDB, var8 + 1, 128, var9);
            }
            if (arg5 == 2) {
                this.method1839(-91, var8, 40, var9);
                this.method1839(31, var8 + 1, 128, var9);
                this.method1839(45, var8, 2, var9 - 1);
            }
            if (arg5 == 3) {
                this.method1839(-127, var8, 160, var9);
                this.method1839(arg0 + 12, var8, 2, var9 - 1);
                this.method1839(125, var8 - 1, 8, var9);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    this.method1839(116, var8, 65536, var9);
                    this.method1839(-113, var8 - 1, 4096, var9);
                }
                if (arg5 == 1) {
                    this.method1839(-89, var8, 1024, var9);
                    this.method1839(arg0 ^ 0x8, var8, 16384, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method1839(arg0 + 161, var8, 4096, var9);
                    this.method1839(arg0 ^ 0xFFFFFFD4, var8 + 1, 65536, var9);
                }
                if (arg5 == 3) {
                    this.method1839(75, var8, 16384, var9);
                    this.method1839(63, var8, 1024, var9 - 1);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg5 == 0) {
                    this.method1839(-113, var8, 512, var9);
                    this.method1839(-121, var8 - 1, 8192, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method1839(arg0 ^ 0xFFFFFFCC, var8, 2048, var9);
                    this.method1839(60, var8 + 1, 32768, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method1839(83, var8, 8192, var9);
                    this.method1839(108, var8 + 1, 512, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method1839(arg0 + 126, var8, 32768, var9);
                    this.method1839(-90, var8 - 1, 2048, var9 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    this.method1839(113, var8, 66560, var9);
                    this.method1839(arg0 + 10, var8 + -1, 4096, var9);
                    this.method1839(-118, var8, 16384, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method1839(arg0 ^ 0xFFFFFFAA, var8, 5120, var9);
                    this.method1839(-91, var8, 16384, var9 + 1);
                    this.method1839(-118, var8 + 1, 65536, var9);
                }
                if (arg5 == 2) {
                    this.method1839(arg0 + 169, var8, 20480, var9);
                    this.method1839(-99, var8 + 1, 65536, var9);
                    this.method1839(-122, var8, 1024, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method1839(arg0 + 6, var8, 81920, var9);
                    this.method1839(-89, var8, 1024, var9 - 1);
                    this.method1839(-111, var8 - 1, 4096, var9);
                }
            }
        }
        if (arg0 != -101 || !arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method1839(-90, var8, 536870912, var9);
                this.method1839(-106, var8 - 1, 33554432, var9);
            }
            if (arg5 == 1) {
                this.method1839(-119, var8, 8388608, var9);
                this.method1839(30, var8, 134217728, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1839(29, var8, 33554432, var9);
                this.method1839(64, var8 + 1, 536870912, var9);
            }
            if (arg5 == 3) {
                this.method1839(-112, var8, 134217728, var9);
                this.method1839(117, var8, 8388608, var9 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method1839(-108, var8, 4194304, var9);
                this.method1839(56, var8 - 1, 67108864, var9 + 1);
            }
            if (arg5 == 1) {
                this.method1839(69, var8, 16777216, var9);
                this.method1839(-119, var8 + 1, 268435456, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1839(-97, var8, 67108864, var9);
                this.method1839(arg0 ^ 0xC, var8 + 1, 4194304, var9 - 1);
            }
            if (arg5 == 3) {
                this.method1839(81, var8, 268435456, var9);
                this.method1839(65, var8 - 1, 16777216, var9 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1839(71, var8, 545259520, var9);
            this.method1839(70, var8 - 1, 33554432, var9);
            this.method1839(77, var8, 134217728, var9 + 1);
        }
        if (arg5 == 1) {
            this.method1839(-121, var8, 41943040, var9);
            this.method1839(-128, var8, 134217728, var9 + 1);
            this.method1839(arg0 + 220, var8 + 1, 536870912, var9);
        }
        if (arg5 == 2) {
            this.method1839(32, var8, 167772160, var9);
            this.method1839(31, var8 + 1, 536870912, var9);
            this.method1839(116, var8, 8388608, var9 - 1);
        }
        if (arg5 == 3) {
            this.method1839(42, var8, 671088640, var9);
            this.method1839(arg0 - 22, var8, 8388608, var9 - 1);
            this.method1839(60, var8 - 1, 33554432, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lie;")
    public static final class33 method1844(Throwable arg0, String arg1) {
        class33 var2;
        if ((arg0 instanceof class33)) {
            var2 = (class33) arg0;
            var2.field508 = var2.field508 + ' ' + arg1;
        } else {
            var2 = new class33(arg0, arg1);
        }
        field4280++;
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static void method1845(boolean arg0) {
        if (arg0) {
            field4274 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public final void method1846(int arg0, int arg1, int arg2) {
        field4279++;
        int var4 = arg0 - this.field4268;
        int var5 = arg2 - this.field4267;
        this.field4272[var5][var4] = class54.method339(this.field4272[var5][var4], 262144);
        int var6 = -125 / ((37 - arg1) / 61);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
    public final void method1847(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4268;
        if (arg0 != -30176) {
            this.method1840(43, true, 93, -83, 51, true, false);
        }
        field4281++;
        int var5 = arg1 - this.field4267;
        this.field4272[var5][var4] = class235.method1572(this.field4272[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZIIIII)V")
    public final void method1848(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field4267;
        field4269++;
        int var9 = arg6 - this.field4268;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method1842((byte) 121, 128, var9, var8);
                this.method1842((byte) 121, 8, var9, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1842((byte) 121, 2, var9, var8);
                this.method1842((byte) 121, 32, var9 + 1, var8);
            }
            if (arg4 == 2) {
                this.method1842((byte) 121, 8, var9, var8);
                this.method1842((byte) 121, 128, var9, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1842((byte) 121, 32, var9, var8);
                this.method1842((byte) 121, 2, var9 - 1, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method1842((byte) 121, 1, var9, var8);
                this.method1842((byte) 121, 16, var9 + 1, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1842((byte) 121, 4, var9, var8);
                this.method1842((byte) 121, 64, var9 + 1, var8 - -1);
            }
            if (arg4 == 2) {
                this.method1842((byte) 121, 16, var9, var8);
                this.method1842((byte) 121, 1, var9 - 1, var8 - -1);
            }
            if (arg4 == 3) {
                this.method1842((byte) 121, 64, var9, var8);
                this.method1842((byte) 121, 4, var9 - 1, var8 - 1);
            }
        }
        int var10 = -14 % ((arg3 + 71) / 32);
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method1842((byte) 121, 130, var9, var8);
                this.method1842((byte) 121, 8, var9, var8 - 1);
                this.method1842((byte) 121, 32, var9 + 1, var8);
            }
            if (arg4 == 1) {
                this.method1842((byte) 121, 10, var9, var8);
                this.method1842((byte) 121, 32, var9 + 1, var8);
                this.method1842((byte) 121, 128, var9, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1842((byte) 121, 40, var9, var8);
                this.method1842((byte) 121, 128, var9, var8 + 1);
                this.method1842((byte) 121, 2, var9 - 1, var8);
            }
            if (arg4 == 3) {
                this.method1842((byte) 121, 160, var9, var8);
                this.method1842((byte) 121, 2, var9 - 1, var8);
                this.method1842((byte) 121, 8, var9, var8 - 1);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg4 == 0) {
                    this.method1842((byte) 121, 65536, var9, var8);
                    this.method1842((byte) 121, 4096, var9, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method1842((byte) 121, 1024, var9, var8);
                    this.method1842((byte) 121, 16384, var9 + 1, var8);
                }
                if (arg4 == 2) {
                    this.method1842((byte) 121, 4096, var9, var8);
                    this.method1842((byte) 121, 65536, var9, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method1842((byte) 121, 16384, var9, var8);
                    this.method1842((byte) 121, 1024, var9 - 1, var8);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg4 == 0) {
                    this.method1842((byte) 121, 512, var9, var8);
                    this.method1842((byte) 121, 8192, var9 + 1, var8 + -1);
                }
                if (arg4 == 1) {
                    this.method1842((byte) 121, 2048, var9, var8);
                    this.method1842((byte) 121, 32768, var9 + 1, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1842((byte) 121, 8192, var9, var8);
                    this.method1842((byte) 121, 512, var9 - 1, var8 - -1);
                }
                if (arg4 == 3) {
                    this.method1842((byte) 121, 32768, var9, var8);
                    this.method1842((byte) 121, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    this.method1842((byte) 121, 66560, var9, var8);
                    this.method1842((byte) 121, 4096, var9, var8 - 1);
                    this.method1842((byte) 121, 16384, var9 + 1, var8);
                }
                if (arg4 == 1) {
                    this.method1842((byte) 121, 5120, var9, var8);
                    this.method1842((byte) 121, 16384, var9 + 1, var8);
                    this.method1842((byte) 121, 65536, var9, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1842((byte) 121, 20480, var9, var8);
                    this.method1842((byte) 121, 65536, var9, var8 + 1);
                    this.method1842((byte) 121, 1024, var9 - 1, var8);
                }
                if (arg4 == 3) {
                    this.method1842((byte) 121, 81920, var9, var8);
                    this.method1842((byte) 121, 1024, var9 - 1, var8);
                    this.method1842((byte) 121, 4096, var9, var8 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method1842((byte) 121, 536870912, var9, var8);
                this.method1842((byte) 121, 33554432, var9, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1842((byte) 121, 8388608, var9, var8);
                this.method1842((byte) 121, 134217728, var9 + 1, var8);
            }
            if (arg4 == 2) {
                this.method1842((byte) 121, 33554432, var9, var8);
                this.method1842((byte) 121, 536870912, var9, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1842((byte) 121, 134217728, var9, var8);
                this.method1842((byte) 121, 8388608, var9 - 1, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method1842((byte) 121, 4194304, var9, var8);
                this.method1842((byte) 121, 67108864, var9 + 1, var8 + -1);
            }
            if (arg4 == 1) {
                this.method1842((byte) 121, 16777216, var9, var8);
                this.method1842((byte) 121, 268435456, var9 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1842((byte) 121, 67108864, var9, var8);
                this.method1842((byte) 121, 4194304, var9 - 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1842((byte) 121, 268435456, var9, var8);
                this.method1842((byte) 121, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1842((byte) 121, 545259520, var9, var8);
            this.method1842((byte) 121, 33554432, var9, var8 - 1);
            this.method1842((byte) 121, 134217728, var9 + 1, var8);
        }
        if (arg4 == 1) {
            this.method1842((byte) 121, 41943040, var9, var8);
            this.method1842((byte) 121, 134217728, var9 + 1, var8);
            this.method1842((byte) 121, 536870912, var9, var8 + 1);
        }
        if (arg4 == 2) {
            this.method1842((byte) 121, 167772160, var9, var8);
            this.method1842((byte) 121, 536870912, var9, var8 + 1);
            this.method1842((byte) 121, 8388608, var9 - 1, var8);
        }
        if (arg4 == 3) {
            this.method1842((byte) 121, 671088640, var9, var8);
            this.method1842((byte) 121, 8388608, var9 - 1, var8);
            this.method1842((byte) 121, 33554432, var9, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIIIIZI)V")
    public final void method1849(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var9 = arg3 - this.field4267;
        int var10 = arg0 - this.field4268;
        field4283++;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg7;
            arg7 = arg5;
            arg5 = var11;
        }
        int var12 = 256;
        if (arg6) {
            var12 |= 0x20000;
        }
        if (arg1) {
            var12 |= 0x40000000;
        }
        int var13 = var9;
        int var14 = -39 % ((arg4 - 6) / 58);
        while (var13 < (var9 + arg7)) {
            if (var13 >= 0 && var13 < this.field4284) {
                for (int var15 = var10; var15 < arg5 + var10; var15++) {
                    if (var15 >= 0 && var15 < this.field4278) {
                        this.method1839(-89, var13, var12, var15);
                    }
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
    public class276(int arg0, int arg1) {
        this.field4284 = arg0;
        this.field4267 = 0;
        this.field4278 = arg1;
        this.field4272 = new int[this.field4284][this.field4278];
        this.method1841((byte) 100);
    }
}
