import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class77 {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[[I")
    public int[][] field1286;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[I")
    public static int[] field1285 = new int[25];

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lgb;")
    public static class149 field1289 = new class149();

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field1303 = 0;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field1307 = 0;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Lll;")
    public static class211 field1304 = new class211(16);

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "[I")
    public static int[] field1309 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Lkf;")
    public static class184 field1308;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method606(int arg0) {
        field1304 = null;
        field1285 = null;
        field1308 = null;
        field1289 = null;
        if (arg0 < -52) {
            field1309 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public static final void method607(int arg0, int arg1) {
        field1306++;
        if (arg0 >= ~arg1 && arg1 < class214.field3309.length) {
            class214.field3309[arg1] = !class214.field3309[arg1];
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
    public final void method608(int arg0, int arg1, int arg2) {
        field1297++;
        if (arg0 < 46) {
            field1303 = -69;
        }
        int var4 = arg2 - this.field1298;
        int var5 = arg1 - this.field1299;
        this.field1286[var5][var4] = class115.method840(this.field1286[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)V")
    public static final void method609(int arg0, int arg1) {
        field1300++;
        if (class239.field3715 == arg1) {
            return;
        }
        if (class239.field3715 == 0) {
            class166.method1100(arg0 ^ 0x80A);
        }
        if (arg1 == 40) {
            class259.method1719(false);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 != 40 && field1308 != null) {
            field1308.method1242((byte) 113);
            field1308 = null;
        }
        if (arg0 != 10) {
            field1304 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class161.field2455 = 1;
            class261.field4048 = 0;
            class57.field889 = 0;
            class129.field2009 = 1;
            class244.field3788 = 0;
            class220.method1471(-1, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class119.method854(-2736);
        }
        if (arg1 == 5) {
            class84.method687(503, class90.field1459);
        } else {
            class274.method1844(-987);
        }
        boolean var3 = class239.field3715 == 5 || class239.field3715 == 10 || class239.field3715 == 28;
        if (var2 != var3) {
            if (var2) {
                class295.field4633 = class173.field2575;
                if (class259.field3985 == 0) {
                    class214.method1428(arg0 + 245, 2);
                } else {
                    class117.method847(2, false, class158.field2427, false, class173.field2575, 0, 255);
                }
                class9.field190.method1560(false, arg0 + 107);
            } else {
                class214.method1428(arg0 ^ 0xF5, 2);
                class9.field190.method1560(true, 119);
            }
        }
        class239.field3715 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIIIIIZI)V")
    public final void method610(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg3 != 4096) {
            return;
        }
        int var9 = arg2 - this.field1299;
        field1288++;
        int var10 = 256;
        int var11 = arg7 - this.field1298;
        if (arg1 == 1 || arg1 == 3) {
            int var12 = arg5;
            arg5 = arg4;
            arg4 = var12;
        }
        if (arg0) {
            var10 |= 0x20000;
        }
        if (arg6) {
            var10 |= 0x40000000;
        }
        for (int var13 = var9; var13 < arg5 + var9; var13++) {
            if (var13 >= 0 && this.field1296 > var13) {
                for (int var14 = var11; var14 < (arg4 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field1291) {
                        this.method616(var10, -87, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)V")
    public final void method611(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.method616(60, 70, -18, -67);
        }
        int var4 = arg2 - this.field1298;
        field1295++;
        int var5 = arg0 - this.field1299;
        this.field1286[var5][var4] = class3.method48(this.field1286[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public final void method612(int arg0) {
        field1301++;
        for (int var2 = 0; var2 < this.field1296; var2++) {
            for (int var3 = 0; var3 < this.field1291; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1296 - 5 || (this.field1291 - 5) <= var3) {
                    this.field1286[var2][var3] = 16777215;
                } else {
                    this.field1286[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != 2359552) {
            field1303 = 39;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIIZIII)V")
    public final void method613(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1294++;
        int var8 = arg1 - this.field1298;
        int var9 = arg4 - this.field1299;
        if (arg6 != -91) {
            this.field1299 = 41;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method614(var9, 128, 111, var8);
                this.method614(var9 - 1, 8, arg6 + 177, var8);
            }
            if (arg5 == 1) {
                this.method614(var9, 2, 96, var8);
                this.method614(var9, 32, arg6 + 211, var8 + 1);
            }
            if (arg5 == 2) {
                this.method614(var9, 8, 109, var8);
                this.method614(var9 + 1, 128, arg6 + 197, var8);
            }
            if (arg5 == 3) {
                this.method614(var9, 32, 78, var8);
                this.method614(var9, 2, 87, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method614(var9, 1, 91, var8);
                this.method614(var9 - 1, 16, 98, var8 + 1);
            }
            if (arg5 == 1) {
                this.method614(var9, 4, arg6 + 191, var8);
                this.method614(var9 + 1, 64, 91, var8 + 1);
            }
            if (arg5 == 2) {
                this.method614(var9, 16, arg6 ^ 0xFFFFFFEA, var8);
                this.method614(var9 + 1, 1, 103, var8 - 1);
            }
            if (arg5 == 3) {
                this.method614(var9, 64, 94, var8);
                this.method614(var9 - 1, 4, 78, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method614(var9, 130, arg6 ^ 0xFFFFFFEB, var8);
                this.method614(var9 - 1, 8, 115, var8);
                this.method614(var9, 32, 81, var8 + 1);
            }
            if (arg5 == 1) {
                this.method614(var9, 10, 83, var8);
                this.method614(var9, 32, 123, var8 + 1);
                this.method614(var9 + 1, 128, arg6 + 197, var8);
            }
            if (arg5 == 2) {
                this.method614(var9, 40, 113, var8);
                this.method614(var9 + 1, 128, 90, var8);
                this.method614(var9, 2, 104, var8 - 1);
            }
            if (arg5 == 3) {
                this.method614(var9, 160, 105, var8);
                this.method614(var9, 2, 96, var8 - 1);
                this.method614(var9 - 1, 8, 93, var8);
            }
        }
        if (arg0) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method614(var9, 65536, 81, var8);
                    this.method614(var9 - 1, 4096, 103, var8);
                }
                if (arg5 == 1) {
                    this.method614(var9, 1024, 108, var8);
                    this.method614(var9, 16384, 119, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method614(var9, 4096, 103, var8);
                    this.method614(var9 + 1, 65536, 91, var8);
                }
                if (arg5 == 3) {
                    this.method614(var9, 16384, 111, var8);
                    this.method614(var9, 1024, 92, var8 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method614(var9, 512, 122, var8);
                    this.method614(var9 - 1, 8192, arg6 + 195, var8 - -1);
                }
                if (arg5 == 1) {
                    this.method614(var9, 2048, 103, var8);
                    this.method614(var9 + 1, 32768, 117, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method614(var9, 8192, 98, var8);
                    this.method614(var9 + 1, 512, 87, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method614(var9, 32768, 110, var8);
                    this.method614(var9 - 1, 2048, arg6 + 183, var8 + -1);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method614(var9, 66560, 85, var8);
                    this.method614(var9 - 1, 4096, 90, var8);
                    this.method614(var9, 16384, arg6 ^ 0xFFFFFFF7, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method614(var9, 5120, arg6 + 178, var8);
                    this.method614(var9, 16384, arg6 + 209, var8 - -1);
                    this.method614(var9 + 1, 65536, 101, var8);
                }
                if (arg5 == 2) {
                    this.method614(var9, 20480, 107, var8);
                    this.method614(var9 + 1, 65536, 82, var8);
                    this.method614(var9, 1024, 89, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method614(var9, 81920, 119, var8);
                    this.method614(var9, 1024, 85, var8 - 1);
                    this.method614(var9 - 1, 4096, 122, var8);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method614(var9, 536870912, 120, var8);
                this.method614(var9 - 1, 33554432, arg6 + 195, var8);
            }
            if (arg5 == 1) {
                this.method614(var9, 8388608, 126, var8);
                this.method614(var9, 134217728, 87, var8 + 1);
            }
            if (arg5 == 2) {
                this.method614(var9, 33554432, 112, var8);
                this.method614(var9 + 1, 536870912, 95, var8);
            }
            if (arg5 == 3) {
                this.method614(var9, 134217728, 119, var8);
                this.method614(var9, 8388608, arg6 + 191, var8 + -1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method614(var9, 4194304, 111, var8);
                this.method614(var9 - 1, 67108864, 81, var8 + 1);
            }
            if (arg5 == 1) {
                this.method614(var9, 16777216, 125, var8);
                this.method614(var9 + 1, 268435456, arg6 ^ 0xFFFFFFC1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method614(var9, 67108864, 105, var8);
                this.method614(var9 + 1, 4194304, 87, var8 - 1);
            }
            if (arg5 == 3) {
                this.method614(var9, 268435456, 94, var8);
                this.method614(var9 - 1, 16777216, 80, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method614(var9, 545259520, arg6 + 181, var8);
            this.method614(var9 - 1, 33554432, arg6 + 215, var8);
            this.method614(var9, 134217728, 122, var8 + 1);
        }
        if (arg5 == 1) {
            this.method614(var9, 41943040, arg6 + 203, var8);
            this.method614(var9, 134217728, 106, var8 + 1);
            this.method614(var9 + 1, 536870912, 111, var8);
        }
        if (arg5 == 2) {
            this.method614(var9, 167772160, arg6 ^ 0xFFFFFFC8, var8);
            this.method614(var9 + 1, 536870912, arg6 ^ 0xFFFFFFD0, var8);
            this.method614(var9, 8388608, 82, var8 - 1);
        }
        if (arg5 == 3) {
            this.method614(var9, 671088640, 93, var8);
            this.method614(var9, 8388608, 118, var8 - 1);
            this.method614(var9 - 1, 33554432, 93, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
    private final void method614(int arg0, int arg1, int arg2, int arg3) {
        this.field1286[arg0][arg3] = class115.method840(this.field1286[arg0][arg3], arg1);
        if (arg2 > 77) {
            field1293++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZIZIII)V")
    public final void method615(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field1299;
        if (arg3) {
            this.field1299 = -102;
        }
        int var9 = 256;
        field1290++;
        if (arg0) {
            var9 |= 0x20000;
        }
        int var10 = arg2 - this.field1298;
        if (arg1) {
            var9 |= 0x40000000;
        }
        for (int var11 = var8; var11 < arg6 + var8; var11++) {
            if (var11 >= 0 && this.field1296 > var11) {
                for (int var12 = var10; var12 < (arg4 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field1291) {
                        this.method614(var11, var9, 96, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIII)V")
    private final void method616(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -16) {
            field1303 = -61;
        }
        this.field1286[arg2][arg3] = class3.method48(this.field1286[arg2][arg3], ~arg0);
        field1283++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZIIIZZ)V")
    public final void method617(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field1284++;
        if (!arg6) {
            field1307 = 76;
        }
        int var8 = arg4 - this.field1298;
        int var9 = arg2 - this.field1299;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method616(128, -55, var9, var8);
                this.method616(8, -78, var9 - 1, var8);
            }
            if (arg0 == 1) {
                this.method616(2, -83, var9, var8);
                this.method616(32, -117, var9, var8 + 1);
            }
            if (arg0 == 2) {
                this.method616(8, -48, var9, var8);
                this.method616(128, -39, var9 + 1, var8);
            }
            if (arg0 == 3) {
                this.method616(32, -124, var9, var8);
                this.method616(2, -41, var9, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method616(1, -110, var9, var8);
                this.method616(16, -32, var9 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method616(4, -64, var9, var8);
                this.method616(64, -113, var9 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method616(16, -51, var9, var8);
                this.method616(1, -82, var9 + 1, var8 + -1);
            }
            if (arg0 == 3) {
                this.method616(64, -20, var9, var8);
                this.method616(4, -24, var9 - 1, var8 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method616(130, -91, var9, var8);
                this.method616(8, -115, var9 - 1, var8);
                this.method616(32, -72, var9, var8 + 1);
            }
            if (arg0 == 1) {
                this.method616(10, -58, var9, var8);
                this.method616(32, -25, var9, var8 + 1);
                this.method616(128, -67, var9 + 1, var8);
            }
            if (arg0 == 2) {
                this.method616(40, -39, var9, var8);
                this.method616(128, -43, var9 + 1, var8);
                this.method616(2, -35, var9, var8 - 1);
            }
            if (arg0 == 3) {
                this.method616(160, -25, var9, var8);
                this.method616(2, -29, var9, var8 - 1);
                this.method616(8, -121, var9 - 1, var8);
            }
        }
        if (arg5) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method616(65536, -75, var9, var8);
                    this.method616(4096, -88, var9 - 1, var8);
                }
                if (arg0 == 1) {
                    this.method616(1024, -105, var9, var8);
                    this.method616(16384, -101, var9, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method616(4096, -110, var9, var8);
                    this.method616(65536, -118, var9 + 1, var8);
                }
                if (arg0 == 3) {
                    this.method616(16384, -35, var9, var8);
                    this.method616(1024, -46, var9, var8 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method616(512, -32, var9, var8);
                    this.method616(8192, -127, var9 - 1, var8 - -1);
                }
                if (arg0 == 1) {
                    this.method616(2048, -112, var9, var8);
                    this.method616(32768, -31, var9 + 1, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method616(8192, -23, var9, var8);
                    this.method616(512, -69, var9 + 1, var8 + -1);
                }
                if (arg0 == 3) {
                    this.method616(32768, -99, var9, var8);
                    this.method616(2048, -92, var9 - 1, var8 + -1);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method616(66560, -39, var9, var8);
                    this.method616(4096, -91, var9 - 1, var8);
                    this.method616(16384, -23, var9, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method616(5120, -55, var9, var8);
                    this.method616(16384, -112, var9, var8 + 1);
                    this.method616(65536, -51, var9 + 1, var8);
                }
                if (arg0 == 2) {
                    this.method616(20480, -43, var9, var8);
                    this.method616(65536, -104, var9 + 1, var8);
                    this.method616(1024, -35, var9, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method616(81920, -37, var9, var8);
                    this.method616(1024, -78, var9, var8 - 1);
                    this.method616(4096, -124, var9 - 1, var8);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method616(536870912, -91, var9, var8);
                this.method616(33554432, -66, var9 - 1, var8);
            }
            if (arg0 == 1) {
                this.method616(8388608, -124, var9, var8);
                this.method616(134217728, -29, var9, var8 + 1);
            }
            if (arg0 == 2) {
                this.method616(33554432, -26, var9, var8);
                this.method616(536870912, -25, var9 + 1, var8);
            }
            if (arg0 == 3) {
                this.method616(134217728, -40, var9, var8);
                this.method616(8388608, -35, var9, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method616(4194304, -34, var9, var8);
                this.method616(67108864, -104, var9 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method616(16777216, -43, var9, var8);
                this.method616(268435456, -106, var9 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method616(67108864, -70, var9, var8);
                this.method616(4194304, -53, var9 + 1, var8 - 1);
            }
            if (arg0 == 3) {
                this.method616(268435456, -59, var9, var8);
                this.method616(16777216, -21, var9 - 1, var8 + -1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method616(545259520, -64, var9, var8);
            this.method616(33554432, -125, var9 - 1, var8);
            this.method616(134217728, -112, var9, var8 + 1);
        }
        if (arg0 == 1) {
            this.method616(41943040, -34, var9, var8);
            this.method616(134217728, -52, var9, var8 + 1);
            this.method616(536870912, -93, var9 + 1, var8);
        }
        if (arg0 == 2) {
            this.method616(167772160, -100, var9, var8);
            this.method616(536870912, -46, var9 + 1, var8);
            this.method616(8388608, -21, var9, var8 - 1);
        }
        if (arg0 == 3) {
            this.method616(671088640, -65, var9, var8);
            this.method616(8388608, -42, var9, var8 - 1);
            this.method616(33554432, -43, var9 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)I")
    public static final int method618(int arg0, byte arg1) {
        int var2 = arg0 >>> 1;
        if (arg1 < 109) {
            method607(-62, 107);
        }
        field1292++;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
    public class77(int arg0, int arg1) {
        this.field1291 = arg1;
        this.field1296 = arg0;
        this.field1299 = 0;
        this.field1286 = new int[this.field1296][this.field1291];
        this.field1298 = 0;
        this.method612(2359552);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(III)V")
    public final void method619(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1298;
        field1302++;
        int var5 = arg0 - this.field1299;
        this.field1286[var5][var4] = class115.method840(this.field1286[var5][var4], arg2);
    }
}
