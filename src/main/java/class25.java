import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class25 {

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[[I")
    public int[][] field501;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field494 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "[[I")
    public static int[][] field498;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIIZIII)V", line = 6)
    public final void method202(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field496;
        int var9 = arg1 - this.field487;
        field499++;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method205(var8, 2, var9, 128);
                this.method205(var8 - 1, 2, var9, 8);
            }
            if (arg2 == 1) {
                this.method205(var8, 2, var9, 2);
                this.method205(var8, 2, var9 + 1, 32);
            }
            if (arg2 == 2) {
                this.method205(var8, 2, var9, 8);
                this.method205(var8 + 1, 2, var9, 128);
            }
            if (arg2 == 3) {
                this.method205(var8, 2, var9, 32);
                this.method205(var8, 2, var9 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method205(var8, 2, var9, 1);
                this.method205(var8 - 1, 2, var9 + 1, 16);
            }
            if (arg2 == 1) {
                this.method205(var8, 2, var9, 4);
                this.method205(var8 + 1, 2, var9 + 1, 64);
            }
            if (arg2 == 2) {
                this.method205(var8, 2, var9, 16);
                this.method205(var8 + 1, 2, var9 - 1, 1);
            }
            if (arg2 == 3) {
                this.method205(var8, 2, var9, 64);
                this.method205(var8 - 1, 2, var9 - 1, 4);
            }
        }
        int var10 = -110 % ((-arg6 - 11) / 52);
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method205(var8, 2, var9, 130);
                this.method205(var8 - 1, 2, var9, 8);
                this.method205(var8, 2, var9 + 1, 32);
            }
            if (arg2 == 1) {
                this.method205(var8, 2, var9, 10);
                this.method205(var8, 2, var9 + 1, 32);
                this.method205(var8 + 1, 2, var9, 128);
            }
            if (arg2 == 2) {
                this.method205(var8, 2, var9, 40);
                this.method205(var8 + 1, 2, var9, 128);
                this.method205(var8, 2, var9 - 1, 2);
            }
            if (arg2 == 3) {
                this.method205(var8, 2, var9, 160);
                this.method205(var8, 2, var9 - 1, 2);
                this.method205(var8 - 1, 2, var9, 8);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg2 == 0) {
                    this.method205(var8, 2, var9, 65536);
                    this.method205(var8 - 1, 2, var9, 4096);
                }
                if (arg2 == 1) {
                    this.method205(var8, 2, var9, 1024);
                    this.method205(var8, 2, var9 + 1, 16384);
                }
                if (arg2 == 2) {
                    this.method205(var8, 2, var9, 4096);
                    this.method205(var8 + 1, 2, var9, 65536);
                }
                if (arg2 == 3) {
                    this.method205(var8, 2, var9, 16384);
                    this.method205(var8, 2, var9 - 1, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg2 == 0) {
                    this.method205(var8, 2, var9, 512);
                    this.method205(var8 - 1, 2, var9 + 1, 8192);
                }
                if (arg2 == 1) {
                    this.method205(var8, 2, var9, 2048);
                    this.method205(var8 + 1, 2, var9 + 1, 32768);
                }
                if (arg2 == 2) {
                    this.method205(var8, 2, var9, 8192);
                    this.method205(var8 + 1, 2, var9 - 1, 512);
                }
                if (arg2 == 3) {
                    this.method205(var8, 2, var9, 32768);
                    this.method205(var8 - 1, 2, var9 - 1, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    this.method205(var8, 2, var9, 66560);
                    this.method205(var8 - 1, 2, var9, 4096);
                    this.method205(var8, 2, var9 + 1, 16384);
                }
                if (arg2 == 1) {
                    this.method205(var8, 2, var9, 5120);
                    this.method205(var8, 2, var9 + 1, 16384);
                    this.method205(var8 + 1, 2, var9, 65536);
                }
                if (arg2 == 2) {
                    this.method205(var8, 2, var9, 20480);
                    this.method205(var8 + 1, 2, var9, 65536);
                    this.method205(var8, 2, var9 - 1, 1024);
                }
                if (arg2 == 3) {
                    this.method205(var8, 2, var9, 81920);
                    this.method205(var8, 2, var9 - 1, 1024);
                    this.method205(var8 - 1, 2, var9, 4096);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method205(var8, 2, var9, 536870912);
                this.method205(var8 - 1, 2, var9, 33554432);
            }
            if (arg2 == 1) {
                this.method205(var8, 2, var9, 8388608);
                this.method205(var8, 2, var9 + 1, 134217728);
            }
            if (arg2 == 2) {
                this.method205(var8, 2, var9, 33554432);
                this.method205(var8 + 1, 2, var9, 536870912);
            }
            if (arg2 == 3) {
                this.method205(var8, 2, var9, 134217728);
                this.method205(var8, 2, var9 - 1, 8388608);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method205(var8, 2, var9, 4194304);
                this.method205(var8 - 1, 2, var9 + 1, 67108864);
            }
            if (arg2 == 1) {
                this.method205(var8, 2, var9, 16777216);
                this.method205(var8 + 1, 2, var9 + 1, 268435456);
            }
            if (arg2 == 2) {
                this.method205(var8, 2, var9, 67108864);
                this.method205(var8 + 1, 2, var9 - 1, 4194304);
            }
            if (arg2 == 3) {
                this.method205(var8, 2, var9, 268435456);
                this.method205(var8 - 1, 2, var9 - 1, 16777216);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method205(var8, 2, var9, 545259520);
            this.method205(var8 - 1, 2, var9, 33554432);
            this.method205(var8, 2, var9 + 1, 134217728);
        }
        if (arg2 == 1) {
            this.method205(var8, 2, var9, 41943040);
            this.method205(var8, 2, var9 + 1, 134217728);
            this.method205(var8 + 1, 2, var9, 536870912);
        }
        if (arg2 == 2) {
            this.method205(var8, 2, var9, 167772160);
            this.method205(var8 + 1, 2, var9, 536870912);
            this.method205(var8, 2, var9 - 1, 8388608);
        }
        if (arg2 == 3) {
            this.method205(var8, 2, var9, 671088640);
            this.method205(var8, 2, var9 - 1, 8388608);
            this.method205(var8 - 1, 2, var9, 33554432);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V", line = 316)
    public final void method203(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field496;
        field506++;
        int var5 = arg2 - this.field487;
        this.field501[var4][var5] = class212.method1434(this.field501[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BIIII)V", line = 336)
    public static final void method204(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -49 % ((arg0 - 15) / 46);
        for (int var6 = 0; var6 < class147.field2401; var6++) {
            if ((class77.field1541[var6] + class263.field4086[var6]) > arg2 && class263.field4086[var6] < arg2 + arg3 && class215.field3444[var6] + class186.field3029[var6] > arg1 && class215.field3444[var6] < arg1 + arg4) {
                class337.field5220[var6] = true;
            }
        }
        field505++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)V", line = 358)
    private final void method205(int arg0, int arg1, int arg2, int arg3) {
        this.field501[arg0][arg2] = class61.method475(this.field501[arg0][arg2], ~arg3);
        if (arg1 != 2) {
            this.field492 = 103;
        }
        field503++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)V", line = 373)
    public final void method206(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field487;
        field491++;
        int var5 = arg2 - this.field496;
        if (arg0 != 51) {
            field489 = -107;
        }
        this.field501[var5][var4] = class61.method475(this.field501[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZIIIII)V", line = 387)
    public final void method207(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field496;
        field488++;
        int var9 = arg2 - this.field487;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method215(var9, (byte) -102, 128, var8);
                this.method215(var9, (byte) -102, 8, var8 - 1);
            }
            if (arg3 == 1) {
                this.method215(var9, (byte) -102, 2, var8);
                this.method215(var9 + 1, (byte) -102, 32, var8);
            }
            if (arg3 == 2) {
                this.method215(var9, (byte) -102, 8, var8);
                this.method215(var9, (byte) -102, 128, var8 + 1);
            }
            if (arg3 == 3) {
                this.method215(var9, (byte) -102, 32, var8);
                this.method215(var9 - 1, (byte) -102, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method215(var9, (byte) -102, 1, var8);
                this.method215(var9 + 1, (byte) -102, 16, var8 - 1);
            }
            if (arg3 == 1) {
                this.method215(var9, (byte) -102, 4, var8);
                this.method215(var9 + 1, (byte) -102, 64, var8 + 1);
            }
            if (arg3 == 2) {
                this.method215(var9, (byte) -102, 16, var8);
                this.method215(var9 - 1, (byte) -102, 1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method215(var9, (byte) -102, 64, var8);
                this.method215(var9 - 1, (byte) -102, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method215(var9, (byte) -102, 130, var8);
                this.method215(var9, (byte) -102, 8, var8 - 1);
                this.method215(var9 + 1, (byte) -102, 32, var8);
            }
            if (arg3 == 1) {
                this.method215(var9, (byte) -102, 10, var8);
                this.method215(var9 + 1, (byte) -102, 32, var8);
                this.method215(var9, (byte) -102, 128, var8 + 1);
            }
            if (arg3 == 2) {
                this.method215(var9, (byte) -102, 40, var8);
                this.method215(var9, (byte) -102, 128, var8 + 1);
                this.method215(var9 - 1, (byte) -102, 2, var8);
            }
            if (arg3 == 3) {
                this.method215(var9, (byte) -102, 160, var8);
                this.method215(var9 - 1, (byte) -102, 2, var8);
                this.method215(var9, (byte) -102, 8, var8 - 1);
            }
        }
        if (arg0) {
            if (arg4 == 0) {
                if (arg3 == 0) {
                    this.method215(var9, (byte) -102, 65536, var8);
                    this.method215(var9, (byte) -102, 4096, var8 - 1);
                }
                if (arg3 == 1) {
                    this.method215(var9, (byte) -102, 1024, var8);
                    this.method215(var9 + 1, (byte) -102, 16384, var8);
                }
                if (arg3 == 2) {
                    this.method215(var9, (byte) -102, 4096, var8);
                    this.method215(var9, (byte) -102, 65536, var8 + 1);
                }
                if (arg3 == 3) {
                    this.method215(var9, (byte) -102, 16384, var8);
                    this.method215(var9 - 1, (byte) -102, 1024, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg3 == 0) {
                    this.method215(var9, (byte) -102, 512, var8);
                    this.method215(var9 + 1, (byte) -102, 8192, var8 - 1);
                }
                if (arg3 == 1) {
                    this.method215(var9, (byte) -102, 2048, var8);
                    this.method215(var9 + 1, (byte) -102, 32768, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method215(var9, (byte) -102, 8192, var8);
                    this.method215(var9 - 1, (byte) -102, 512, var8 + 1);
                }
                if (arg3 == 3) {
                    this.method215(var9, (byte) -102, 32768, var8);
                    this.method215(var9 - 1, (byte) -102, 2048, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg3 == 0) {
                    this.method215(var9, (byte) -102, 66560, var8);
                    this.method215(var9, (byte) -102, 4096, var8 - 1);
                    this.method215(var9 + 1, (byte) -102, 16384, var8);
                }
                if (arg3 == 1) {
                    this.method215(var9, (byte) -102, 5120, var8);
                    this.method215(var9 + 1, (byte) -102, 16384, var8);
                    this.method215(var9, (byte) -102, 65536, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method215(var9, (byte) -102, 20480, var8);
                    this.method215(var9, (byte) -102, 65536, var8 + 1);
                    this.method215(var9 - 1, (byte) -102, 1024, var8);
                }
                if (arg3 == 3) {
                    this.method215(var9, (byte) -102, 81920, var8);
                    this.method215(var9 - 1, (byte) -102, 1024, var8);
                    this.method215(var9, (byte) -102, 4096, var8 - 1);
                }
            }
        }
        if (arg5 >= -48) {
            this.field492 = -107;
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method215(var9, (byte) -102, 536870912, var8);
                this.method215(var9, (byte) -102, 33554432, var8 - 1);
            }
            if (arg3 == 1) {
                this.method215(var9, (byte) -102, 8388608, var8);
                this.method215(var9 + 1, (byte) -102, 134217728, var8);
            }
            if (arg3 == 2) {
                this.method215(var9, (byte) -102, 33554432, var8);
                this.method215(var9, (byte) -102, 536870912, var8 + 1);
            }
            if (arg3 == 3) {
                this.method215(var9, (byte) -102, 134217728, var8);
                this.method215(var9 - 1, (byte) -102, 8388608, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method215(var9, (byte) -102, 4194304, var8);
                this.method215(var9 + 1, (byte) -102, 67108864, var8 - 1);
            }
            if (arg3 == 1) {
                this.method215(var9, (byte) -102, 16777216, var8);
                this.method215(var9 + 1, (byte) -102, 268435456, var8 + 1);
            }
            if (arg3 == 2) {
                this.method215(var9, (byte) -102, 67108864, var8);
                this.method215(var9 - 1, (byte) -102, 4194304, var8 + 1);
            }
            if (arg3 == 3) {
                this.method215(var9, (byte) -102, 268435456, var8);
                this.method215(var9 - 1, (byte) -102, 16777216, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method215(var9, (byte) -102, 545259520, var8);
            this.method215(var9, (byte) -102, 33554432, var8 - 1);
            this.method215(var9 + 1, (byte) -102, 134217728, var8);
        }
        if (arg3 == 1) {
            this.method215(var9, (byte) -102, 41943040, var8);
            this.method215(var9 + 1, (byte) -102, 134217728, var8);
            this.method215(var9, (byte) -102, 536870912, var8 + 1);
        }
        if (arg3 == 2) {
            this.method215(var9, (byte) -102, 167772160, var8);
            this.method215(var9, (byte) -102, 536870912, var8 + 1);
            this.method215(var9 - 1, (byte) -102, 8388608, var8);
        }
        if (arg3 == 3) {
            this.method215(var9, (byte) -102, 671088640, var8);
            this.method215(var9 - 1, (byte) -102, 8388608, var8);
            this.method215(var9, (byte) -102, 33554432, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIBIZZ)V", line = 693)
    public final void method208(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6, boolean arg7) {
        field495++;
        int var9 = 256;
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg1;
            arg1 = arg5;
            arg5 = var10;
        }
        int var11 = arg0 - this.field496;
        if (arg4 > -17) {
            field498 = (int[][]) ((int[][]) null);
        }
        if (arg7) {
            var9 |= 0x20000;
        }
        int var12 = arg3 - this.field487;
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var13 = var11; var13 < arg1 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field508) {
                for (int var14 = var12; var14 < (arg5 + var12); var14++) {
                    if (var14 >= 0 && var14 < this.field492) {
                        this.method205(var13, 2, var14, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 745)
    public static void method209(int arg0) {
        field498 = (int[][]) null;
        if (arg0 != 32) {
            method214(-41);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZIII)V", line = 758)
    public static final void method210(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class249.field3893) {
            class115.method757(arg2, arg0, arg2 + arg3, arg0 - -arg4);
            class115.method755(arg2, arg0, arg3, arg4, 0);
        } else {
            class270.method1806(arg2, arg0, arg2 + arg3, arg0 + arg4);
            class270.method1811(arg2, arg0, arg3, arg4, 0);
        }
        field497++;
        if (class196.field3152 < 100) {
            return;
        }
        if (class305.field4612 == null || class305.field4612.field4377 != arg3 || class305.field4612.field4383 != arg4) {
            class206 var5 = new class206(arg3, arg4);
            class270.method1805(var5.field3353, arg3, arg4);
            class283.method1902(0, arg3, -16708, 0, 0, class9.field199, class163.field2629, arg4, 0);
            if (class249.field3893) {
                class305.field4612 = new class137(var5);
            } else {
                class305.field4612 = var5;
            }
            if (class249.field3893) {
                class270.field4170 = null;
            } else {
                class330.field5055.method369((byte) -19);
            }
        }
        class305.field4612.method892(arg2, arg0);
        int var6 = arg2 + (class253.field3958 * arg3 / class163.field2629);
        int var7 = class99.field1752 * arg3 / class163.field2629;
        int var8 = class233.field3662 * arg4 / class9.field199 + arg0;
        int var9 = class202.field3258 * arg4 / class9.field199;
        if (!arg1) {
            field494 = -41;
        }
        int var10 = 16711680;
        if (class324.field4954 == 1) {
            var10 = 16777215;
        }
        if (class249.field3893) {
            class115.method763(var6, var8, var7, var9, var10, 128);
            class115.method756(var6, var8, var7, var9, var10);
        } else {
            class270.method1801(var6, var8, var7, var9, var10, 128);
            class270.method1802(var6, var8, var7, var9, var10);
        }
        if (class280.field4319 <= 0) {
            return;
        }
        int var11;
        if (class303.field4601 <= 10) {
            var11 = class303.field4601 * 25;
        } else {
            var11 = (20 - class303.field4601) * 25;
        }
        for (class119 var12 = (class119) class46.field943.method424(-124); var12 != null; var12 = (class119) class46.field943.method425(-32547)) {
            if (class12.field242 == var12.field2070) {
                int var13 = var12.field2076 * arg4 / class9.field199 + arg0;
                int var14 = var12.field2081 * arg3 / class163.field2629 + arg2;
                if (class249.field3893) {
                    class115.method763(var14 - 2, var13 + -2, 4, 4, 16776960, var11);
                } else {
                    class270.method1801(var14 - 2, var13 - 2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZIIIIZ)V", line = 867)
    public final void method211(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field504++;
        int var8 = arg2 - this.field496;
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        int var10 = arg4 - this.field487;
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var11 = var8; var11 < var8 + arg5; var11++) {
            if (var11 >= 0 && var11 < this.field508) {
                for (int var12 = var10; var12 < (var10 + arg3); var12++) {
                    if (var12 >= 0 && this.field492 > var12) {
                        this.method215(var12, (byte) -102, var9, var11);
                    }
                }
            }
        }
        if (!arg1) {
            this.method205(90, -69, 19, -31);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(BII)V", line = 912)
    public final void method212(byte arg0, int arg1, int arg2) {
        if (arg0 <= 68) {
            field494 = -77;
        }
        int var4 = arg1 - this.field496;
        int var5 = arg2 - this.field487;
        this.field501[var4][var5] = class212.method1434(this.field501[var4][var5], 2097152);
        field502++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)Z", line = 926)
    public final boolean method213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field486++;
        if (arg3 == arg4 && arg1 == arg2) {
            return true;
        }
        int var6 = arg4 - this.field496;
        int var7 = arg1 - this.field487;
        if (var6 < 0 || this.field508 <= var6 || var7 < 0 || var7 >= this.field492) {
            return false;
        }
        int var8 = arg3 - this.field496;
        int var9 = arg2 - this.field487;
        int var10;
        if (var8 < var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var9 < var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (var11 >= var10) {
            int var12 = 32768;
            int var13 = var10 * 65536 / var11;
            while (var7 != var9) {
                if (var7 > var9) {
                    if ((this.field501[var8][var9] & 0x2C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field501[var8][var9] & 0x2C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var6 > var8) {
                        if ((this.field501[var8][var9] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field501[var8][var9] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field501[var8][var9] & 0x2C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field501[var8][var9] & 0x2C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var9 < var7) {
                        if ((this.field501[var8][var9] & 0x2C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field501[var8][var9] & 0x2C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        if (arg0 != 7236) {
            this.field508 = -82;
        }
        return (this.field501[var6][var7] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 1080)
    public static final void method214(int arg0) {
        field493++;
        if (arg0 == 2) {
            class325.field4965.method1884(-22054);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBII)V", line = 1098)
    private final void method215(int arg0, byte arg1, int arg2, int arg3) {
        field507++;
        if (arg1 != -102) {
            this.field492 = -111;
        }
        this.field501[arg3][arg0] = class212.method1434(this.field501[arg3][arg0], arg2);
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 1113)
    public final void method216(int arg0) {
        for (int var2 = 0; var2 < this.field508; var2++) {
            for (int var3 = 0; var3 < this.field492; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field508 - 5 || this.field492 - 5 <= var3) {
                    this.field501[var2][var3] = 16777215;
                } else {
                    this.field501[var2][var3] = 2097152;
                }
            }
        }
        field500++;
        if (arg0 >= -99) {
            this.method203(7, 27, -104);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V", line = 1144)
    public class25(int arg0, int arg1) {
        this.field508 = arg0;
        this.field496 = 0;
        this.field492 = arg1;
        this.field487 = 0;
        this.field501 = new int[this.field508][this.field492];
        this.method216(-117);
    }
}
