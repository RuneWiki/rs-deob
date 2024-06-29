import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class154 {

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    private int field2500 = 0;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    private int field2508;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    private int field2487;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    private int field2490;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[[I")
    public int[][] field2491;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2509 = "Connection lost.";

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lui;")
    public static class98 field2492 = new class98(16);

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lui;")
    public static class98 field2511 = new class98(64);

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "F")
    public static float field2497;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V", line = 5)
    public final void method1107(int arg0, int arg1, int arg2) {
        field2507++;
        int var4 = arg1 - this.field2500;
        int var5 = arg0 - this.field2487;
        this.field2491[var5][var4] = class167.method1160(this.field2491[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)V", line = 16)
    public final void method1108(int arg0, int arg1, int arg2) {
        field2488++;
        int var4 = arg1 - this.field2487;
        int var5 = arg0 - this.field2500;
        int var6 = 123 % ((arg2 + 64) / 54);
        this.field2491[var4][var5] = class167.method1160(this.field2491[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lnm;Lnm;BLnm;Lnm;)V", line = 29)
    public static final void method1109(class221 arg0, class221 arg1, byte arg2, class221 arg3, class221 arg4) {
        class355.field5638 = arg3;
        field2504++;
        class97.field1403 = arg4;
        class120.field1772 = arg0;
        class41.field632 = arg1;
        if (arg2 >= -125) {
            method1109((class221) null, (class221) null, (byte) -49, (class221) null, (class221) null);
        }
        class167.field2627 = new class264[class41.field632.method1503(false)][];
        class296.field4914 = new boolean[class41.field632.method1503(false)];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIII)V", line = 45)
    private final void method1110(byte arg0, int arg1, int arg2, int arg3) {
        this.field2491[arg3][arg1] = class167.method1160(this.field2491[arg3][arg1], arg2);
        field2502++;
        if (arg0 >= -111) {
            this.field2491 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIIIIZ)V", line = 57)
    public final void method1111(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field2487;
        int var9 = arg5 - this.field2500;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method1110((byte) -120, var9, 128, var8);
                this.method1110((byte) -116, var9, 8, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1110((byte) -125, var9, 2, var8);
                this.method1110((byte) -119, var9 + 1, 32, var8);
            }
            if (arg0 == 2) {
                this.method1110((byte) -123, var9, 8, var8);
                this.method1110((byte) -120, var9, 128, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1110((byte) -115, var9, 32, var8);
                this.method1110((byte) -123, var9 - 1, 2, var8);
            }
        }
        field2494++;
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method1110((byte) -124, var9, 1, var8);
                this.method1110((byte) -122, var9 + 1, 16, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1110((byte) -118, var9, 4, var8);
                this.method1110((byte) -120, var9 + 1, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1110((byte) -126, var9, 16, var8);
                this.method1110((byte) -113, var9 - 1, 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1110((byte) -115, var9, 64, var8);
                this.method1110((byte) -118, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg4 > -125) {
            this.field2508 = 48;
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method1110((byte) -115, var9, 130, var8);
                this.method1110((byte) -118, var9, 8, var8 - 1);
                this.method1110((byte) -121, var9 + 1, 32, var8);
            }
            if (arg0 == 1) {
                this.method1110((byte) -118, var9, 10, var8);
                this.method1110((byte) -127, var9 + 1, 32, var8);
                this.method1110((byte) -126, var9, 128, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1110((byte) -124, var9, 40, var8);
                this.method1110((byte) -116, var9, 128, var8 + 1);
                this.method1110((byte) -127, var9 - 1, 2, var8);
            }
            if (arg0 == 3) {
                this.method1110((byte) -116, var9, 160, var8);
                this.method1110((byte) -117, var9 - 1, 2, var8);
                this.method1110((byte) -121, var9, 8, var8 - 1);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method1110((byte) -116, var9, 65536, var8);
                    this.method1110((byte) -118, var9, 4096, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1110((byte) -123, var9, 1024, var8);
                    this.method1110((byte) -120, var9 + 1, 16384, var8);
                }
                if (arg0 == 2) {
                    this.method1110((byte) -112, var9, 4096, var8);
                    this.method1110((byte) -122, var9, 65536, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1110((byte) -113, var9, 16384, var8);
                    this.method1110((byte) -127, var9 - 1, 1024, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method1110((byte) -121, var9, 512, var8);
                    this.method1110((byte) -127, var9 + 1, 8192, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1110((byte) -120, var9, 2048, var8);
                    this.method1110((byte) -120, var9 + 1, 32768, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1110((byte) -116, var9, 8192, var8);
                    this.method1110((byte) -120, var9 - 1, 512, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1110((byte) -121, var9, 32768, var8);
                    this.method1110((byte) -123, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method1110((byte) -127, var9, 66560, var8);
                    this.method1110((byte) -127, var9, 4096, var8 - 1);
                    this.method1110((byte) -118, var9 + 1, 16384, var8);
                }
                if (arg0 == 1) {
                    this.method1110((byte) -122, var9, 5120, var8);
                    this.method1110((byte) -118, var9 + 1, 16384, var8);
                    this.method1110((byte) -120, var9, 65536, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1110((byte) -112, var9, 20480, var8);
                    this.method1110((byte) -124, var9, 65536, var8 + 1);
                    this.method1110((byte) -118, var9 - 1, 1024, var8);
                }
                if (arg0 == 3) {
                    this.method1110((byte) -119, var9, 81920, var8);
                    this.method1110((byte) -124, var9 - 1, 1024, var8);
                    this.method1110((byte) -127, var9, 4096, var8 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method1110((byte) -117, var9, 536870912, var8);
                this.method1110((byte) -124, var9, 33554432, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1110((byte) -113, var9, 8388608, var8);
                this.method1110((byte) -112, var9 + 1, 134217728, var8);
            }
            if (arg0 == 2) {
                this.method1110((byte) -126, var9, 33554432, var8);
                this.method1110((byte) -117, var9, 536870912, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1110((byte) -126, var9, 134217728, var8);
                this.method1110((byte) -127, var9 - 1, 8388608, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method1110((byte) -115, var9, 4194304, var8);
                this.method1110((byte) -115, var9 + 1, 67108864, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1110((byte) -126, var9, 16777216, var8);
                this.method1110((byte) -125, var9 + 1, 268435456, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1110((byte) -112, var9, 67108864, var8);
                this.method1110((byte) -124, var9 - 1, 4194304, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1110((byte) -126, var9, 268435456, var8);
                this.method1110((byte) -127, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1110((byte) -114, var9, 545259520, var8);
            this.method1110((byte) -126, var9, 33554432, var8 - 1);
            this.method1110((byte) -119, var9 + 1, 134217728, var8);
        }
        if (arg0 == 1) {
            this.method1110((byte) -120, var9, 41943040, var8);
            this.method1110((byte) -113, var9 + 1, 134217728, var8);
            this.method1110((byte) -125, var9, 536870912, var8 + 1);
        }
        if (arg0 == 2) {
            this.method1110((byte) -113, var9, 167772160, var8);
            this.method1110((byte) -118, var9, 536870912, var8 + 1);
            this.method1110((byte) -124, var9 - 1, 8388608, var8);
        }
        if (arg0 == 3) {
            this.method1110((byte) -125, var9, 671088640, var8);
            this.method1110((byte) -112, var9 - 1, 8388608, var8);
            this.method1110((byte) -123, var9, 33554432, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIIZIIB)V", line = 366)
    public final void method1112(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        int var8 = arg5 - this.field2487;
        int var9 = arg1 - this.field2500;
        field2493++;
        if (arg6 != -125) {
            this.method1110((byte) -19, -74, -25, -81);
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1113((byte) -49, 128, var9, var8);
                this.method1113((byte) -49, 8, var9, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1113((byte) -49, 2, var9, var8);
                this.method1113((byte) -49, 32, var9 + 1, var8);
            }
            if (arg4 == 2) {
                this.method1113((byte) -49, 8, var9, var8);
                this.method1113((byte) -49, 128, var9, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1113((byte) -49, 32, var9, var8);
                this.method1113((byte) -49, 2, var9 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1113((byte) -49, 1, var9, var8);
                this.method1113((byte) -49, 16, var9 + 1, var8 + -1);
            }
            if (arg4 == 1) {
                this.method1113((byte) -49, 4, var9, var8);
                this.method1113((byte) -49, 64, var9 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1113((byte) -49, 16, var9, var8);
                this.method1113((byte) -49, 1, var9 - 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1113((byte) -49, 64, var9, var8);
                this.method1113((byte) -49, 4, var9 - 1, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method1113((byte) -49, 130, var9, var8);
                this.method1113((byte) -49, 8, var9, var8 - 1);
                this.method1113((byte) -49, 32, var9 + 1, var8);
            }
            if (arg4 == 1) {
                this.method1113((byte) -49, 10, var9, var8);
                this.method1113((byte) -49, 32, var9 + 1, var8);
                this.method1113((byte) -49, 128, var9, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1113((byte) -49, 40, var9, var8);
                this.method1113((byte) -49, 128, var9, var8 + 1);
                this.method1113((byte) -49, 2, var9 - 1, var8);
            }
            if (arg4 == 3) {
                this.method1113((byte) -49, 160, var9, var8);
                this.method1113((byte) -49, 2, var9 - 1, var8);
                this.method1113((byte) -49, 8, var9, var8 - 1);
            }
        }
        if (arg0) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    this.method1113((byte) -49, 65536, var9, var8);
                    this.method1113((byte) -49, 4096, var9, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method1113((byte) -49, 1024, var9, var8);
                    this.method1113((byte) -49, 16384, var9 + 1, var8);
                }
                if (arg4 == 2) {
                    this.method1113((byte) -49, 4096, var9, var8);
                    this.method1113((byte) -49, 65536, var9, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method1113((byte) -49, 16384, var9, var8);
                    this.method1113((byte) -49, 1024, var9 - 1, var8);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg4 == 0) {
                    this.method1113((byte) -49, 512, var9, var8);
                    this.method1113((byte) -49, 8192, var9 + 1, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method1113((byte) -49, 2048, var9, var8);
                    this.method1113((byte) -49, 32768, var9 + 1, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1113((byte) -49, 8192, var9, var8);
                    this.method1113((byte) -49, 512, var9 - 1, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method1113((byte) -49, 32768, var9, var8);
                    this.method1113((byte) -49, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    this.method1113((byte) -49, 66560, var9, var8);
                    this.method1113((byte) -49, 4096, var9, var8 - 1);
                    this.method1113((byte) -49, 16384, var9 + 1, var8);
                }
                if (arg4 == 1) {
                    this.method1113((byte) -49, 5120, var9, var8);
                    this.method1113((byte) -49, 16384, var9 + 1, var8);
                    this.method1113((byte) -49, 65536, var9, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1113((byte) -49, 20480, var9, var8);
                    this.method1113((byte) -49, 65536, var9, var8 + 1);
                    this.method1113((byte) -49, 1024, var9 - 1, var8);
                }
                if (arg4 == 3) {
                    this.method1113((byte) -49, 81920, var9, var8);
                    this.method1113((byte) -49, 1024, var9 - 1, var8);
                    this.method1113((byte) -49, 4096, var9, var8 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1113((byte) -49, 536870912, var9, var8);
                this.method1113((byte) -49, 33554432, var9, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1113((byte) -49, 8388608, var9, var8);
                this.method1113((byte) -49, 134217728, var9 + 1, var8);
            }
            if (arg4 == 2) {
                this.method1113((byte) -49, 33554432, var9, var8);
                this.method1113((byte) -49, 536870912, var9, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1113((byte) -49, 134217728, var9, var8);
                this.method1113((byte) -49, 8388608, var9 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1113((byte) -49, 4194304, var9, var8);
                this.method1113((byte) -49, 67108864, var9 + 1, var8 + -1);
            }
            if (arg4 == 1) {
                this.method1113((byte) -49, 16777216, var9, var8);
                this.method1113((byte) -49, 268435456, var9 + 1, var8 - -1);
            }
            if (arg4 == 2) {
                this.method1113((byte) -49, 67108864, var9, var8);
                this.method1113((byte) -49, 4194304, var9 - 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1113((byte) -49, 268435456, var9, var8);
                this.method1113((byte) -49, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1113((byte) -49, 545259520, var9, var8);
            this.method1113((byte) -49, 33554432, var9, var8 - 1);
            this.method1113((byte) -49, 134217728, var9 + 1, var8);
        }
        if (arg4 == 1) {
            this.method1113((byte) -49, 41943040, var9, var8);
            this.method1113((byte) -49, 134217728, var9 + 1, var8);
            this.method1113((byte) -49, 536870912, var9, var8 + 1);
        }
        if (arg4 == 2) {
            this.method1113((byte) -49, 167772160, var9, var8);
            this.method1113((byte) -49, 536870912, var9, var8 + 1);
            this.method1113((byte) -49, 8388608, var9 - 1, var8);
        }
        if (arg4 == 3) {
            this.method1113((byte) -49, 671088640, var9, var8);
            this.method1113((byte) -49, 8388608, var9 - 1, var8);
            this.method1113((byte) -49, 33554432, var9, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(BIII)V", line = 672)
    private final void method1113(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -49) {
            this.method1112(true, 110, -58, false, -36, 93, (byte) 103);
        }
        this.field2491[arg3][arg2] = class235.method1623(this.field2491[arg3][arg2], ~arg1);
        field2499++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)Z", line = 690)
    public final boolean method1114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2501++;
        if (arg2 != 29346) {
            method1115(false);
        }
        if (arg0 == arg1 && arg3 == arg4) {
            return true;
        }
        int var6 = arg3 - this.field2500;
        int var7 = arg1 - this.field2487;
        if (var7 < 0 || var7 >= this.field2508 || var6 < 0 || this.field2490 <= var6) {
            return false;
        }
        int var8 = arg0 - this.field2487;
        int var9;
        if (var7 > var8) {
            var9 = var7 - var8;
        } else {
            var9 = var8 - var7;
        }
        int var10 = arg4 - this.field2500;
        int var11;
        if (var10 >= var6) {
            var11 = var10 - var6;
        } else {
            var11 = var6 - var10;
        }
        if (var11 < var9) {
            int var12 = 32768;
            int var13 = var11 * 65536 / var9;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field2491[var8][var10] & 0x2C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var7) {
                    if ((this.field2491[var8][var10] & 0x2C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var6 > var10) {
                        if ((this.field2491[var8][var10] & 0x2C0102) != 0) {
                            return false;
                        }
                        var10++;
                    } else if (var6 < var10) {
                        if ((this.field2491[var8][var10] & 0x2C0120) != 0) {
                            return false;
                        }
                        var10--;
                    }
                }
            }
        } else {
            int var14 = 32768;
            int var15 = var9 * 65536 / var11;
            while (var6 != var10) {
                if (var6 > var10) {
                    if ((this.field2491[var8][var10] & 0x2C0102) != 0) {
                        return false;
                    }
                    var10++;
                } else if (var6 < var10) {
                    if ((this.field2491[var8][var10] & 0x2C0120) != 0) {
                        return false;
                    }
                    var10--;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var8 < var7) {
                        if ((this.field2491[var8][var10] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var7 < var8) {
                        if ((this.field2491[var8][var10] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field2491[var7][var6] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 845)
    public static final void method1115(boolean arg0) {
        class43.method331();
        class207.field3153 = new class62[8];
        class207.field3153[1] = new class194();
        class207.field3153[2] = new class348();
        field2496++;
        class207.field3153[3] = new class106();
        class207.field3153[4] = new class193();
        class207.field3153[5] = new class299();
        if (!arg0) {
            class207.field3153[6] = new class112();
            class207.field3153[7] = new class18();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BZIIIIIZ)V", line = 878)
    public final void method1116(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg5 == 1 || arg5 == 3) {
            int var9 = arg6;
            arg6 = arg4;
            arg4 = var9;
        }
        int var10 = arg3 - this.field2500;
        int var11 = 256;
        if (arg0 != 53) {
            method1120((byte) -77);
        }
        field2503++;
        if (arg7) {
            var11 |= 0x20000;
        }
        int var12 = arg2 - this.field2487;
        if (arg1) {
            var11 |= 0x40000000;
        }
        for (int var13 = var12; var13 < arg6 + var12; var13++) {
            if (var13 >= 0 && var13 < this.field2508) {
                for (int var14 = var10; var14 < (var10 + arg4); var14++) {
                    if (var14 >= 0 && this.field2490 > var14) {
                        this.method1113((byte) -49, var11, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIZZ)V", line = 930)
    public final void method1117(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = arg3 - this.field2487;
        int var9 = 256;
        field2506++;
        int var10 = arg0 - this.field2500;
        if (arg1 != -2) {
            return;
        }
        if (arg6) {
            var9 |= 0x20000;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && this.field2508 > var11) {
                for (int var12 = var10; var12 < (arg4 + var10); var12++) {
                    if (var12 >= 0 && this.field2490 > var12) {
                        this.method1110((byte) -127, var12, var9, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(III)V", line = 979)
    public final void method1118(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2500;
        int var5 = -64 / ((-arg0 - 78) / 42);
        int var6 = arg2 - this.field2487;
        field2505++;
        this.field2491[var6][var4] = class235.method1623(this.field2491[var6][var4], -262145);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 992)
    public final void method1119(int arg0) {
        if (arg0 != -16746) {
            method1115(true);
        }
        field2498++;
        for (int var2 = 0; var2 < this.field2508; var2++) {
            for (int var3 = 0; var3 < this.field2490; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field2508 - 5) || (this.field2490 - 5) <= var3) {
                    this.field2491[var2][var3] = 16777215;
                } else {
                    this.field2491[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 1023)
    public static void method1120(byte arg0) {
        field2511 = null;
        if (arg0 <= 123) {
            field2497 = 0.267634F;
        }
        field2509 = null;
        field2492 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(II)V", line = 1039)
    public class154(int arg0, int arg1) {
        this.field2508 = arg0;
        this.field2487 = 0;
        this.field2490 = arg1;
        this.field2491 = new int[this.field2508][this.field2490];
        this.method1119(-16746);
    }
}
