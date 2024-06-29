import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class39 {

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "[Lbda;")
    public static class400[] field536 = new class400[2048];

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "Lei;")
    public static class329 field542;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "[[I")
    public int[][] field526;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BIII)V")
    private final void method328(byte arg0, int arg1, int arg2, int arg3) {
        field538++;
        this.field526[arg1][arg2] = class188.method1258(this.field526[arg1][arg2], arg3);
        int var5 = -68 % ((-arg0 - 68) / 57);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
    public final void method329(int arg0) {
        field517++;
        for (int var2 = 0; var2 < this.field533; var2++) {
            for (int var4 = 0; var4 < this.field527; var4++) {
                if (var2 == 0 || var4 == 0 || var2 >= (this.field533 - 5) || var4 >= (this.field527 - 5)) {
                    this.field526[var2][var4] = -1;
                } else {
                    this.field526[var2][var4] = 2097152;
                }
            }
        }
        int var3 = -108 / ((-arg0 - 65) / 41);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field540++;
        int var11 = arg7 + arg8;
        int var12 = arg6 + arg9;
        int var13 = arg1 + arg2;
        if (arg3 != 22700) {
            this.method343(25, 27, 90, true);
        }
        int var14 = arg4 + arg5;
        if (arg8 == var13 && (arg0 & 0x2) == 0) {
            int var15 = arg4 >= arg9 ? arg4 : arg9;
            int var16 = var12 < var14 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field526[var13 - this.field531 - 1][var15 - this.field530] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg0 & 0x8) == 0) {
            int var17 = arg9 > arg4 ? arg9 : arg4;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field526[arg1 - this.field531][var17 - this.field530] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg9 == var14 && (arg0 & 0x1) == 0) {
            int var19 = arg1 >= arg8 ? arg1 : arg8;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field526[var19 - this.field531][var14 - this.field530 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg0 & 0x4) == 0) {
            int var21 = arg8 > arg1 ? arg8 : arg1;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field526[var21 - this.field531][arg4 - this.field530] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
    public final void method331(int arg0, int arg1, int arg2) {
        field529++;
        int var4 = arg0 - this.field531;
        int var5 = arg2 - this.field530;
        this.field526[var4][var5] = class188.method1258(this.field526[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIZIZ)V")
    public final void method332(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field531;
        int var9 = arg1 - this.field530;
        field520++;
        if (arg0 < 94) {
            field536 = null;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method343(var8, var9, 128, true);
                this.method343(var8 - 1, var9, 8, true);
            }
            if (arg5 == 1) {
                this.method343(var8, var9, 2, true);
                this.method343(var8, var9 + 1, 32, true);
            }
            if (arg5 == 2) {
                this.method343(var8, var9, 8, true);
                this.method343(var8 + 1, var9, 128, true);
            }
            if (arg5 == 3) {
                this.method343(var8, var9, 32, true);
                this.method343(var8, var9 - 1, 2, true);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method343(var8, var9, 1, true);
                this.method343(var8 - 1, var9 + 1, 16, true);
            }
            if (arg5 == 1) {
                this.method343(var8, var9, 4, true);
                this.method343(var8 + 1, var9 + 1, 64, true);
            }
            if (arg5 == 2) {
                this.method343(var8, var9, 16, true);
                this.method343(var8 + 1, var9 + -1, 1, true);
            }
            if (arg5 == 3) {
                this.method343(var8, var9, 64, true);
                this.method343(var8 - 1, var9 + -1, 4, true);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method343(var8, var9, 130, true);
                this.method343(var8 - 1, var9, 8, true);
                this.method343(var8, var9 + 1, 32, true);
            }
            if (arg5 == 1) {
                this.method343(var8, var9, 10, true);
                this.method343(var8, var9 + 1, 32, true);
                this.method343(var8 + 1, var9, 128, true);
            }
            if (arg5 == 2) {
                this.method343(var8, var9, 40, true);
                this.method343(var8 + 1, var9, 128, true);
                this.method343(var8, var9 - 1, 2, true);
            }
            if (arg5 == 3) {
                this.method343(var8, var9, 160, true);
                this.method343(var8, var9 - 1, 2, true);
                this.method343(var8 - 1, var9, 8, true);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method343(var8, var9, 65536, true);
                    this.method343(var8 - 1, var9, 4096, true);
                }
                if (arg5 == 1) {
                    this.method343(var8, var9, 1024, true);
                    this.method343(var8, var9 + 1, 16384, true);
                }
                if (arg5 == 2) {
                    this.method343(var8, var9, 4096, true);
                    this.method343(var8 + 1, var9, 65536, true);
                }
                if (arg5 == 3) {
                    this.method343(var8, var9, 16384, true);
                    this.method343(var8, var9 - 1, 1024, true);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method343(var8, var9, 512, true);
                    this.method343(var8 - 1, var9 + 1, 8192, true);
                }
                if (arg5 == 1) {
                    this.method343(var8, var9, 2048, true);
                    this.method343(var8 + 1, var9 + 1, 32768, true);
                }
                if (arg5 == 2) {
                    this.method343(var8, var9, 8192, true);
                    this.method343(var8 + 1, var9 - 1, 512, true);
                }
                if (arg5 == 3) {
                    this.method343(var8, var9, 32768, true);
                    this.method343(var8 - 1, var9 - 1, 2048, true);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method343(var8, var9, 66560, true);
                    this.method343(var8 - 1, var9, 4096, true);
                    this.method343(var8, var9 + 1, 16384, true);
                }
                if (arg5 == 1) {
                    this.method343(var8, var9, 5120, true);
                    this.method343(var8, var9 + 1, 16384, true);
                    this.method343(var8 + 1, var9, 65536, true);
                }
                if (arg5 == 2) {
                    this.method343(var8, var9, 20480, true);
                    this.method343(var8 + 1, var9, 65536, true);
                    this.method343(var8, var9 - 1, 1024, true);
                }
                if (arg5 == 3) {
                    this.method343(var8, var9, 81920, true);
                    this.method343(var8, var9 - 1, 1024, true);
                    this.method343(var8 - 1, var9, 4096, true);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method343(var8, var9, 536870912, true);
                this.method343(var8 - 1, var9, 33554432, true);
            }
            if (arg5 == 1) {
                this.method343(var8, var9, 8388608, true);
                this.method343(var8, var9 + 1, 134217728, true);
            }
            if (arg5 == 2) {
                this.method343(var8, var9, 33554432, true);
                this.method343(var8 + 1, var9, 536870912, true);
            }
            if (arg5 == 3) {
                this.method343(var8, var9, 134217728, true);
                this.method343(var8, var9 - 1, 8388608, true);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method343(var8, var9, 4194304, true);
                this.method343(var8 - 1, var9 + 1, 67108864, true);
            }
            if (arg5 == 1) {
                this.method343(var8, var9, 16777216, true);
                this.method343(var8 + 1, var9 + 1, 268435456, true);
            }
            if (arg5 == 2) {
                this.method343(var8, var9, 67108864, true);
                this.method343(var8 + 1, var9 - 1, 4194304, true);
            }
            if (arg5 == 3) {
                this.method343(var8, var9, 268435456, true);
                this.method343(var8 - 1, var9 - 1, 16777216, true);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method343(var8, var9, 545259520, true);
            this.method343(var8 - 1, var9, 33554432, true);
            this.method343(var8, var9 + 1, 134217728, true);
        }
        if (arg5 == 1) {
            this.method343(var8, var9, 41943040, true);
            this.method343(var8, var9 + 1, 134217728, true);
            this.method343(var8 + 1, var9, 536870912, true);
        }
        if (arg5 == 2) {
            this.method343(var8, var9, 167772160, true);
            this.method343(var8 + 1, var9, 536870912, true);
            this.method343(var8, var9 - 1, 8388608, true);
        }
        if (arg5 == 3) {
            this.method343(var8, var9, 671088640, true);
            this.method343(var8, var9 - 1, 8388608, true);
            this.method343(var8 - 1, var9, 33554432, true);
            return;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZIBIIIZ)V")
    public final void method333(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var9 = -56 / ((arg3 - 30) / 58);
        field524++;
        int var10 = 256;
        if (arg7) {
            var10 |= 0x20000;
        }
        int var11 = arg2 - this.field530;
        int var12 = arg0 - this.field531;
        if (arg5 == 1 || arg5 == 3) {
            int var13 = arg4;
            arg4 = arg6;
            arg6 = var13;
        }
        if (arg1) {
            var10 |= 0x40000000;
        }
        for (int var14 = var12; var14 < (arg4 + var12); var14++) {
            if (var14 >= 0 && this.field533 > var14) {
                for (int var15 = var11; var15 < arg6 + var11; var15++) {
                    if (var15 >= 0 && this.field527 > var15) {
                        this.method343(var14, var15, var10, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(III)V")
    public final void method334(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field530;
        if (arg0 != 20891) {
            this.method331(-1, 95, 31);
        }
        field518++;
        int var5 = arg1 - this.field531;
        this.field526[var5][var4] = class424.method2540(this.field526[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(III)V")
    public final void method335(int arg0, int arg1, int arg2) {
        if (arg0 != 128) {
            field537 = -27;
        }
        field534++;
        int var4 = arg2 - this.field530;
        int var5 = arg1 - this.field531;
        this.field526[var5][var4] = class424.method2540(this.field526[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIZIIZI)V")
    public final void method336(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg3 - this.field530;
        field525++;
        int var9 = arg0 - this.field531;
        if (arg6 == 0) {
            if (arg1 == 0) {
                this.method328((byte) 26, var9, var8, 128);
                this.method328((byte) -126, var9 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method328((byte) 116, var9, var8, 2);
                this.method328((byte) 117, var9, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method328((byte) 67, var9, var8, 8);
                this.method328((byte) -125, var9 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method328((byte) -125, var9, var8, 32);
                this.method328((byte) -125, var9, var8 - 1, 2);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg1 == 0) {
                this.method328((byte) -127, var9, var8, 1);
                this.method328((byte) 104, var9 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method328((byte) 118, var9, var8, 4);
                this.method328((byte) 90, var9 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method328((byte) -125, var9, var8, 16);
                this.method328((byte) -126, var9 + 1, var8 + -1, 1);
            }
            if (arg1 == 3) {
                this.method328((byte) 124, var9, var8, 64);
                this.method328((byte) 24, var9 - 1, var8 + -1, 4);
            }
        }
        if (arg6 == 2) {
            if (arg1 == 0) {
                this.method328((byte) -125, var9, var8, 130);
                this.method328((byte) 71, var9 - 1, var8, 8);
                this.method328((byte) 51, var9, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method328((byte) 124, var9, var8, 10);
                this.method328((byte) -127, var9, var8 + 1, 32);
                this.method328((byte) 116, var9 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method328((byte) 8, var9, var8, 40);
                this.method328((byte) 75, var9 + 1, var8, 128);
                this.method328((byte) -128, var9, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method328((byte) 10, var9, var8, 160);
                this.method328((byte) 88, var9, var8 - 1, 2);
                this.method328((byte) -127, var9 - 1, var8, 8);
            }
        }
        if (arg4 < 65) {
            this.field531 = -39;
        }
        if (arg5) {
            if (arg6 == 0) {
                if (arg1 == 0) {
                    this.method328((byte) -128, var9, var8, 65536);
                    this.method328((byte) 81, var9 - 1, var8, 4096);
                }
                if (arg1 == 1) {
                    this.method328((byte) -127, var9, var8, 1024);
                    this.method328((byte) 86, var9, var8 + 1, 16384);
                }
                if (arg1 == 2) {
                    this.method328((byte) -125, var9, var8, 4096);
                    this.method328((byte) -127, var9 + 1, var8, 65536);
                }
                if (arg1 == 3) {
                    this.method328((byte) 108, var9, var8, 16384);
                    this.method328((byte) 54, var9, var8 - 1, 1024);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg1 == 0) {
                    this.method328((byte) -126, var9, var8, 512);
                    this.method328((byte) -125, var9 - 1, var8 + 1, 8192);
                }
                if (arg1 == 1) {
                    this.method328((byte) -125, var9, var8, 2048);
                    this.method328((byte) -127, var9 + 1, var8 + 1, 32768);
                }
                if (arg1 == 2) {
                    this.method328((byte) -128, var9, var8, 8192);
                    this.method328((byte) -125, var9 + 1, var8 + -1, 512);
                }
                if (arg1 == 3) {
                    this.method328((byte) -127, var9, var8, 32768);
                    this.method328((byte) -125, var9 - 1, var8 + -1, 2048);
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    this.method328((byte) 86, var9, var8, 66560);
                    this.method328((byte) -125, var9 - 1, var8, 4096);
                    this.method328((byte) -128, var9, var8 + 1, 16384);
                }
                if (arg1 == 1) {
                    this.method328((byte) -2, var9, var8, 5120);
                    this.method328((byte) 120, var9, var8 + 1, 16384);
                    this.method328((byte) 116, var9 + 1, var8, 65536);
                }
                if (arg1 == 2) {
                    this.method328((byte) -127, var9, var8, 20480);
                    this.method328((byte) -128, var9 + 1, var8, 65536);
                    this.method328((byte) -125, var9, var8 - 1, 1024);
                }
                if (arg1 == 3) {
                    this.method328((byte) 91, var9, var8, 81920);
                    this.method328((byte) 83, var9, var8 - 1, 1024);
                    this.method328((byte) 36, var9 - 1, var8, 4096);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg6 == 0) {
            if (arg1 == 0) {
                this.method328((byte) -127, var9, var8, 536870912);
                this.method328((byte) 83, var9 - 1, var8, 33554432);
            }
            if (arg1 == 1) {
                this.method328((byte) -128, var9, var8, 8388608);
                this.method328((byte) -127, var9, var8 + 1, 134217728);
            }
            if (arg1 == 2) {
                this.method328((byte) 88, var9, var8, 33554432);
                this.method328((byte) -128, var9 + 1, var8, 536870912);
            }
            if (arg1 == 3) {
                this.method328((byte) -126, var9, var8, 134217728);
                this.method328((byte) -6, var9, var8 - 1, 8388608);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg1 == 0) {
                this.method328((byte) -128, var9, var8, 4194304);
                this.method328((byte) 35, var9 - 1, var8 + 1, 67108864);
            }
            if (arg1 == 1) {
                this.method328((byte) 93, var9, var8, 16777216);
                this.method328((byte) -125, var9 + 1, var8 - -1, 268435456);
            }
            if (arg1 == 2) {
                this.method328((byte) 26, var9, var8, 67108864);
                this.method328((byte) 75, var9 + 1, var8 - 1, 4194304);
            }
            if (arg1 == 3) {
                this.method328((byte) 88, var9, var8, 268435456);
                this.method328((byte) -125, var9 - 1, var8 - 1, 16777216);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method328((byte) -128, var9, var8, 545259520);
            this.method328((byte) -125, var9 - 1, var8, 33554432);
            this.method328((byte) -125, var9, var8 + 1, 134217728);
        }
        if (arg1 == 1) {
            this.method328((byte) 11, var9, var8, 41943040);
            this.method328((byte) 80, var9, var8 + 1, 134217728);
            this.method328((byte) -125, var9 + 1, var8, 536870912);
        }
        if (arg1 == 2) {
            this.method328((byte) -127, var9, var8, 167772160);
            this.method328((byte) 107, var9 + 1, var8, 536870912);
            this.method328((byte) 65, var9, var8 - 1, 8388608);
        }
        if (arg1 == 3) {
            this.method328((byte) 126, var9, var8, 671088640);
            this.method328((byte) 44, var9, var8 - 1, 8388608);
            this.method328((byte) -127, var9 - 1, var8, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field528++;
        if (arg6 == 1) {
            if (arg4 == arg5 && arg2 == arg7) {
                return true;
            }
        } else if (arg4 >= arg5 && (arg5 + arg6 - 1) >= arg4 && arg7 >= arg7 && arg7 <= (arg7 - (1 - arg6))) {
            return true;
        }
        if (arg1 != 32) {
            return false;
        }
        int var9 = arg5 - this.field531;
        int var10 = arg4 - this.field531;
        int var11 = arg2 - this.field530;
        int var12 = arg7 - this.field530;
        if (arg6 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field526[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field526[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field526[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field526[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field526[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field526[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field526[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field526[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field526[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field526[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field526[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field526[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var9 - 1;
            int var14 = var11 + arg6 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14 && (this.field526[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 - arg6 == var11 && (this.field526[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - arg6 == var9 && var12 >= var11 && var12 <= var14 && (this.field526[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 - arg6) == var11 && (this.field526[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - arg6 == var9 && var12 >= var11 && var12 <= var14 && (this.field526[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 + 1) == var11 && (this.field526[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14 && (this.field526[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11 && (this.field526[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11 && (this.field526[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var10 && var13 >= var10 && var12 - arg6 == var11 && (this.field526[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg6 == var9 && var11 <= var12 && var12 <= var14 && (this.field526[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14 && (this.field526[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field521++;
        if (arg6 > 1) {
            return class181.method1222(arg2, 12, arg5, arg3, arg6, arg6, arg8, arg0, arg7) ? true : this.method330(arg1, arg8, arg5, arg4 ^ 0xFFFF824B, arg7, arg3, arg6, arg6, arg2, arg0);
        }
        int var10 = arg5 + arg8 - 1;
        int var11 = arg7 + arg3 - 1;
        if (arg4 != -9497) {
            return false;
        } else if (arg2 >= arg8 && arg2 <= var10 && arg7 <= arg0 && arg0 <= var11) {
            return true;
        } else if ((arg8 - 1) == arg2 && arg7 <= arg0 && var11 >= arg0 && (this.field526[arg2 - this.field531][arg0 - this.field530] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg2 && arg0 >= arg7 && arg0 <= var11 && (this.field526[arg2 - this.field531][arg0 - this.field530] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg0 && arg8 <= arg2 && arg2 <= var10 && (this.field526[arg2 - this.field531][arg0 - this.field530] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg0 && arg2 >= arg8 && var10 >= arg2 && (this.field526[arg2 - this.field531][arg0 - this.field530] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIZZ)V")
    public final void method339(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field523++;
        if (arg3 != 0) {
            return;
        }
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg0 - this.field531;
        int var10 = arg1 - this.field530;
        if (arg5) {
            var8 |= 0x40000000;
        }
        for (int var11 = var9; var11 < (arg4 + var9); var11++) {
            if (var11 >= 0 && this.field533 > var11) {
                for (int var12 = var10; var12 < (arg2 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field527) {
                        this.method328((byte) -128, var11, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BII)V")
    public final void method340(byte arg0, int arg1, int arg2) {
        field541++;
        int var4 = arg2 - this.field531;
        if (arg0 != 58) {
            this.field526 = null;
        }
        int var5 = arg1 - this.field530;
        this.field526[var4][var5] = class188.method1258(this.field526[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZILqa;II)V")
    public static final void method341(int arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5) {
        field519++;
        arg3.method615(arg2, arg5, arg0 + arg2, arg4 + arg5);
        arg3.method1159(-16777216, arg4, arg5, arg2, (byte) -39, arg0);
        if (class210.field2970 < 100) {
            return;
        }
        float var6 = (float) class212.field3116 / (float) class212.field3121;
        int var7 = arg0;
        int var8 = arg4;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg0 - var7) / 2 + arg2;
        int var10 = (arg4 - var8) / 2 + arg5;
        if (class626.field8830 == null || arg0 != class626.field8830.method962() || class626.field8830.method968() != arg4) {
            class212.method1427(class212.field3118, class212.field3120 + class212.field3116, class212.field3121 + class212.field3118, class212.field3120, var9, var10, var9 + var7, var10 - -var8);
            class212.method1420(arg3);
            class626.field8830 = arg3.method580(var9, var10, var7, var8, false);
        }
        class626.field8830.method953(var9, var10);
        if (arg1) {
            method344(-68);
        }
        int var11 = class621.field8756 * var7 / class212.field3121;
        int var12 = class151.field2280 * var8 / class212.field3116;
        int var13 = var9 + (class271.field3981 * var7 / class212.field3121);
        int var14 = var8 + var10 - (class485.field6859 * var8 / class212.field3116) - var12;
        int var15 = -1996554240;
        if (class78.field1412 == class640.field9282) {
            var15 = -1996488705;
        }
        arg3.method653(var13, var14, var11, var12, var15, 1);
        arg3.method638(var13, var14, var11, var12, var15, 0);
        if (class62.field856 <= 0) {
            return;
        }
        int var16;
        if (class608.field8634 <= 50) {
            var16 = class608.field8634 * 5;
        } else {
            var16 = 500 - (class608.field8634 * 5);
        }
        for (class153 var17 = (class153) class212.field3106.method427(true); var17 != null; var17 = (class153) class212.field3106.method420(false)) {
            class192 var18 = class212.field3095.method70(var17.field2298, 113);
            if (class299.method1873(var18, -124)) {
                if (class454.field6570 == var17.field2298) {
                    int var21 = var9 + (var17.field2295 * var7 / class212.field3121);
                    int var22 = (class212.field3116 - var17.field2305) * var8 / class212.field3116 + var10;
                    arg3.method1159(var16 << 24 | 0xFFFF00, 4, var22 - 2, var21 + -2, (byte) -91, 4);
                } else if (class47.field663 != -1 && class47.field663 == var18.field2769) {
                    int var19 = var17.field2295 * var7 / class212.field3121 + var9;
                    int var20 = (class212.field3116 - var17.field2305) * var8 / class212.field3116 + var10;
                    arg3.method1159(var16 << 24 | 0xFFFF00, 4, var20 - 2, var19 + -2, (byte) -58, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field532++;
        if (arg5 == 1) {
            if (arg0 == arg4 && arg1 == arg2) {
                return true;
            }
        } else if (arg0 <= arg4 && arg0 + arg5 - 1 >= arg4 && arg1 >= arg1 && arg1 <= arg1 + arg5 - 1) {
            return true;
        }
        if (arg3 != -21730) {
            return true;
        }
        int var9 = arg0 - this.field531;
        int var10 = arg1 - this.field530;
        int var11 = arg4 - this.field531;
        int var12 = arg2 - this.field530;
        if (arg5 == 1) {
            if (arg7 == 0) {
                if (arg6 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field526[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field526[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field526[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field526[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field526[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field526[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field526[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field526[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg6 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field526[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field526[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field526[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field526[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field526[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field526[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field526[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field526[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field526[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field526[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field526[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field526[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var9 - 1;
            int var14 = var12 + arg5 - 1;
            if (arg7 == 0) {
                if (arg6 == 0) {
                    if (var11 - arg5 == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12 && (this.field526[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 - arg5) == var12 && (this.field526[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 <= var11 && var13 >= var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 - arg5 == var9 && var12 <= var10 && var10 <= var14 && (this.field526[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var14 >= var10 && (this.field526[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 + 1 == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12 && (this.field526[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 - arg5) == var12 && (this.field526[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 >= var9 && var13 >= var11 && (var10 - arg5) == var12) {
                        return true;
                    }
                    if ((var11 - arg5) == var9 && var10 >= var12 && var14 >= var10 && (this.field526[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 >= var12 && var14 >= var10 && (this.field526[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg6 == 0) {
                    if (var11 - arg5 == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14 && (this.field526[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 - arg5) == var12 && (this.field526[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - arg5 == var9 && var10 >= var12 && var14 >= var10 && (this.field526[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var10 - arg5) == var12 && (this.field526[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - arg5 == var9 && var10 >= var12 && var14 >= var10 && (this.field526[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12 && (this.field526[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 - arg5) == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 - arg5 == var9 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field526[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var14 >= var10 && (this.field526[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 - arg5) == var12) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field526[var11][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var13 && var10 - arg5 == var12 && (this.field526[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg5 == var9 && var10 >= var12 && var14 >= var10 && (this.field526[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14 && (this.field526[var9][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIZ)V")
    private final void method343(int arg0, int arg1, int arg2, boolean arg3) {
        this.field526[arg0][arg1] = class424.method2540(this.field526[arg0][arg1], ~arg2);
        if (arg3) {
            field539++;
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V")
    public static void method344(int arg0) {
        field536 = null;
        if (arg0 != -1996488705) {
            method341(62, false, 53, null, 64, 67);
        }
        field542 = null;
    }
}
