import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class31 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    private int field443 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    private int field440 = 0;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "[[I")
    public int[][] field460;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field455 = -1;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)Llf;")
    public static final class217 method191(int arg0, byte arg1) {
        class217 var2 = (class217) class61.field968.method122((long) arg0, (byte) 108);
        if (arg1 != 35) {
            method207(38);
        }
        field447++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class262.field3969.method1973(1, class30.method190(-616323832, arg0), class247.method1551(1, arg0));
        class217 var4 = new class217();
        if (var3 != null) {
            var4.method1399(arg1 - 3, new class248(var3));
        }
        class61.field968.method119((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIII)V")
    private final void method192(byte arg0, int arg1, int arg2, int arg3) {
        this.field460[arg2][arg3] = class94.method598(this.field460[arg2][arg3], ~arg1);
        if (arg0 != 58) {
            this.method203(-38, true, 36, false, -77, -67, -39);
        }
        field453++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lpj;")
    public static final class255 method193(int arg0) {
        field442++;
        class179 var1 = new class179(class162.field2494, class256.field3915, class10.field139[0], class273.field4104[0], class220.field3315[0], class82.field1312[0], class10.field129[0], class183.field2775);
        class82.method537(arg0 ^ arg0);
        return var1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZI)V")
    private final void method194(int arg0, int arg1, boolean arg2, int arg3) {
        this.field460[arg0][arg1] = class63.method428(this.field460[arg0][arg1], arg3);
        if (!arg2) {
            this.field440 = 23;
        }
        field458++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZZIII)V")
    public final void method195(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field443;
        int var9 = 256;
        int var10 = arg5 - this.field440;
        field444++;
        if (arg3) {
            var9 |= 0x20000;
        }
        if (arg2) {
            var9 |= 0x40000000;
        }
        for (int var11 = var8; var11 < arg6 + var8; var11++) {
            if (var11 >= 0 && this.field441 > var11) {
                for (int var12 = var10; var12 < (arg4 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field459) {
                        this.method194(var11, var12, true, var9);
                    }
                }
            }
        }
        if (arg1 != 3445) {
            method198(57);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public final void method196(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field443;
        field445++;
        int var5 = arg1 - this.field440;
        this.field460[var4][var5] = class63.method428(this.field460[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZBZII)V")
    public final void method197(int arg0, int arg1, int arg2, boolean arg3, byte arg4, boolean arg5, int arg6, int arg7) {
        int var9 = arg2 - this.field443;
        int var10 = arg0 - this.field440;
        field461++;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg1;
            arg1 = arg7;
            arg7 = var11;
        }
        int var12 = 256;
        if (arg3) {
            var12 |= 0x20000;
        }
        if (arg5) {
            var12 |= 0x40000000;
        }
        for (int var13 = var9; var13 < (arg1 + var9); var13++) {
            if (var13 >= 0 && var13 < this.field441) {
                for (int var15 = var10; var15 < (arg7 + var10); var15++) {
                    if (var15 >= 0 && this.field459 > var15) {
                        this.method192((byte) 58, var12, var13, var15);
                    }
                }
            }
        }
        int var14 = 25 % ((arg4 + 24) / 62);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static final void method198(int arg0) {
        if (arg0 != -2) {
            method207(45);
        }
        if (class284.field4244 != null) {
            class200 var1 = class284.field4244;
            synchronized (class284.field4244) {
                class284.field4244 = null;
            }
        }
        field446++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZBIIZ)V")
    public final void method199(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field443;
        field451++;
        int var9 = arg4 - this.field440;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method192((byte) 58, 128, var8, var9);
                this.method192((byte) 58, 8, var8 - 1, var9);
            }
            if (arg1 == 1) {
                this.method192((byte) 58, 2, var8, var9);
                this.method192((byte) 58, 32, var8, var9 + 1);
            }
            if (arg1 == 2) {
                this.method192((byte) 58, 8, var8, var9);
                this.method192((byte) 58, 128, var8 + 1, var9);
            }
            if (arg1 == 3) {
                this.method192((byte) 58, 32, var8, var9);
                this.method192((byte) 58, 2, var8, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method192((byte) 58, 1, var8, var9);
                this.method192((byte) 58, 16, var8 - 1, var9 + 1);
            }
            if (arg1 == 1) {
                this.method192((byte) 58, 4, var8, var9);
                this.method192((byte) 58, 64, var8 + 1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method192((byte) 58, 16, var8, var9);
                this.method192((byte) 58, 1, var8 + 1, var9 + -1);
            }
            if (arg1 == 3) {
                this.method192((byte) 58, 64, var8, var9);
                this.method192((byte) 58, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method192((byte) 58, 130, var8, var9);
                this.method192((byte) 58, 8, var8 - 1, var9);
                this.method192((byte) 58, 32, var8, var9 + 1);
            }
            if (arg1 == 1) {
                this.method192((byte) 58, 10, var8, var9);
                this.method192((byte) 58, 32, var8, var9 + 1);
                this.method192((byte) 58, 128, var8 + 1, var9);
            }
            if (arg1 == 2) {
                this.method192((byte) 58, 40, var8, var9);
                this.method192((byte) 58, 128, var8 + 1, var9);
                this.method192((byte) 58, 2, var8, var9 - 1);
            }
            if (arg1 == 3) {
                this.method192((byte) 58, 160, var8, var9);
                this.method192((byte) 58, 2, var8, var9 - 1);
                this.method192((byte) 58, 8, var8 - 1, var9);
            }
        }
        if (arg2) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method192((byte) 58, 65536, var8, var9);
                    this.method192((byte) 58, 4096, var8 - 1, var9);
                }
                if (arg1 == 1) {
                    this.method192((byte) 58, 1024, var8, var9);
                    this.method192((byte) 58, 16384, var8, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method192((byte) 58, 4096, var8, var9);
                    this.method192((byte) 58, 65536, var8 + 1, var9);
                }
                if (arg1 == 3) {
                    this.method192((byte) 58, 16384, var8, var9);
                    this.method192((byte) 58, 1024, var8, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method192((byte) 58, 512, var8, var9);
                    this.method192((byte) 58, 8192, var8 - 1, var9 - -1);
                }
                if (arg1 == 1) {
                    this.method192((byte) 58, 2048, var8, var9);
                    this.method192((byte) 58, 32768, var8 + 1, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method192((byte) 58, 8192, var8, var9);
                    this.method192((byte) 58, 512, var8 + 1, var9 + -1);
                }
                if (arg1 == 3) {
                    this.method192((byte) 58, 32768, var8, var9);
                    this.method192((byte) 58, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method192((byte) 58, 66560, var8, var9);
                    this.method192((byte) 58, 4096, var8 - 1, var9);
                    this.method192((byte) 58, 16384, var8, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method192((byte) 58, 5120, var8, var9);
                    this.method192((byte) 58, 16384, var8, var9 + 1);
                    this.method192((byte) 58, 65536, var8 + 1, var9);
                }
                if (arg1 == 2) {
                    this.method192((byte) 58, 20480, var8, var9);
                    this.method192((byte) 58, 65536, var8 + 1, var9);
                    this.method192((byte) 58, 1024, var8, var9 - 1);
                }
                if (arg1 == 3) {
                    this.method192((byte) 58, 81920, var8, var9);
                    this.method192((byte) 58, 1024, var8, var9 - 1);
                    this.method192((byte) 58, 4096, var8 - 1, var9);
                }
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method192((byte) 58, 536870912, var8, var9);
                    this.method192((byte) 58, 33554432, var8 - 1, var9);
                }
                if (arg1 == 1) {
                    this.method192((byte) 58, 8388608, var8, var9);
                    this.method192((byte) 58, 134217728, var8, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method192((byte) 58, 33554432, var8, var9);
                    this.method192((byte) 58, 536870912, var8 + 1, var9);
                }
                if (arg1 == 3) {
                    this.method192((byte) 58, 134217728, var8, var9);
                    this.method192((byte) 58, 8388608, var8, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method192((byte) 58, 4194304, var8, var9);
                    this.method192((byte) 58, 67108864, var8 - 1, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method192((byte) 58, 16777216, var8, var9);
                    this.method192((byte) 58, 268435456, var8 + 1, var9 - -1);
                }
                if (arg1 == 2) {
                    this.method192((byte) 58, 67108864, var8, var9);
                    this.method192((byte) 58, 4194304, var8 + 1, var9 + -1);
                }
                if (arg1 == 3) {
                    this.method192((byte) 58, 268435456, var8, var9);
                    this.method192((byte) 58, 16777216, var8 - 1, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method192((byte) 58, 545259520, var8, var9);
                    this.method192((byte) 58, 33554432, var8 - 1, var9);
                    this.method192((byte) 58, 134217728, var8, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method192((byte) 58, 41943040, var8, var9);
                    this.method192((byte) 58, 134217728, var8, var9 + 1);
                    this.method192((byte) 58, 536870912, var8 + 1, var9);
                }
                if (arg1 == 2) {
                    this.method192((byte) 58, 167772160, var8, var9);
                    this.method192((byte) 58, 536870912, var8 + 1, var9);
                    this.method192((byte) 58, 8388608, var8, var9 - 1);
                }
                if (arg1 == 3) {
                    this.method192((byte) 58, 671088640, var8, var9);
                    this.method192((byte) 58, 8388608, var8, var9 - 1);
                    this.method192((byte) 58, 33554432, var8 - 1, var9);
                }
            }
        }
        if (arg3 <= 59) {
            method207(-42);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)V")
    public final void method200(int arg0, byte arg1, int arg2) {
        int var4 = -37 / ((arg1 + 18) / 63);
        int var5 = arg0 - this.field440;
        int var6 = arg2 - this.field443;
        field449++;
        this.field460[var6][var5] = class94.method598(this.field460[var6][var5], -262145);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        int var2 = 0;
        if (!arg0) {
            method191(-84, (byte) 3);
        }
        while (var2 < this.field441) {
            for (int var3 = 0; var3 < this.field459; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field441 - 5) || this.field459 - 5 <= var3) {
                    this.field460[var2][var3] = 16777215;
                } else {
                    this.field460[var2][var3] = 2097152;
                }
            }
            var2++;
        }
        field457++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public static final void method202(int arg0, int arg1, int arg2, int arg3) {
        class270 var4 = class33.field487[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class183 var5 = var4.field4073;
        if (var5 != null) {
            var5.field2767 = var5.field2767 * arg3 / 16;
            var5.field2763 = var5.field2763 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIZIII)V")
    public final void method203(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field443;
        int var9 = arg4 - this.field440;
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method194(var8, var9, true, 128);
                this.method194(var8 - 1, var9, true, 8);
            }
            if (arg6 == 1) {
                this.method194(var8, var9, true, 2);
                this.method194(var8, var9 + 1, true, 32);
            }
            if (arg6 == 2) {
                this.method194(var8, var9, true, 8);
                this.method194(var8 + 1, var9, true, 128);
            }
            if (arg6 == 3) {
                this.method194(var8, var9, true, 32);
                this.method194(var8, var9 - 1, true, 2);
            }
        }
        if (arg2 != 8) {
            return;
        }
        field456++;
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method194(var8, var9, true, 1);
                this.method194(var8 - 1, var9 + 1, true, 16);
            }
            if (arg6 == 1) {
                this.method194(var8, var9, true, 4);
                this.method194(var8 + 1, var9 + 1, true, 64);
            }
            if (arg6 == 2) {
                this.method194(var8, var9, true, 16);
                this.method194(var8 + 1, var9 - 1, true, 1);
            }
            if (arg6 == 3) {
                this.method194(var8, var9, true, 64);
                this.method194(var8 - 1, var9 + -1, true, 4);
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                this.method194(var8, var9, true, 130);
                this.method194(var8 - 1, var9, true, 8);
                this.method194(var8, var9 + 1, true, 32);
            }
            if (arg6 == 1) {
                this.method194(var8, var9, true, 10);
                this.method194(var8, var9 + 1, true, 32);
                this.method194(var8 + 1, var9, true, 128);
            }
            if (arg6 == 2) {
                this.method194(var8, var9, true, 40);
                this.method194(var8 + 1, var9, true, 128);
                this.method194(var8, var9 - 1, true, 2);
            }
            if (arg6 == 3) {
                this.method194(var8, var9, true, 160);
                this.method194(var8, var9 - 1, true, 2);
                this.method194(var8 - 1, var9, true, 8);
            }
        }
        if (arg1) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    this.method194(var8, var9, true, 65536);
                    this.method194(var8 - 1, var9, true, 4096);
                }
                if (arg6 == 1) {
                    this.method194(var8, var9, true, 1024);
                    this.method194(var8, var9 + 1, true, 16384);
                }
                if (arg6 == 2) {
                    this.method194(var8, var9, true, 4096);
                    this.method194(var8 + 1, var9, true, 65536);
                }
                if (arg6 == 3) {
                    this.method194(var8, var9, true, 16384);
                    this.method194(var8, var9 - 1, true, 1024);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg6 == 0) {
                    this.method194(var8, var9, true, 512);
                    this.method194(var8 - 1, var9 + 1, true, 8192);
                }
                if (arg6 == 1) {
                    this.method194(var8, var9, true, 2048);
                    this.method194(var8 + 1, var9 + 1, true, 32768);
                }
                if (arg6 == 2) {
                    this.method194(var8, var9, true, 8192);
                    this.method194(var8 + 1, var9 - 1, true, 512);
                }
                if (arg6 == 3) {
                    this.method194(var8, var9, true, 32768);
                    this.method194(var8 - 1, var9 + -1, true, 2048);
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    this.method194(var8, var9, true, 66560);
                    this.method194(var8 - 1, var9, true, 4096);
                    this.method194(var8, var9 + 1, true, 16384);
                }
                if (arg6 == 1) {
                    this.method194(var8, var9, true, 5120);
                    this.method194(var8, var9 + 1, true, 16384);
                    this.method194(var8 + 1, var9, true, 65536);
                }
                if (arg6 == 2) {
                    this.method194(var8, var9, true, 20480);
                    this.method194(var8 + 1, var9, true, 65536);
                    this.method194(var8, var9 - 1, true, 1024);
                }
                if (arg6 == 3) {
                    this.method194(var8, var9, true, 81920);
                    this.method194(var8, var9 - 1, true, 1024);
                    this.method194(var8 - 1, var9, true, 4096);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method194(var8, var9, true, 536870912);
                this.method194(var8 - 1, var9, true, 33554432);
            }
            if (arg6 == 1) {
                this.method194(var8, var9, true, 8388608);
                this.method194(var8, var9 + 1, true, 134217728);
            }
            if (arg6 == 2) {
                this.method194(var8, var9, true, 33554432);
                this.method194(var8 + 1, var9, true, 536870912);
            }
            if (arg6 == 3) {
                this.method194(var8, var9, true, 134217728);
                this.method194(var8, var9 - 1, true, 8388608);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method194(var8, var9, true, 4194304);
                this.method194(var8 - 1, var9 + 1, true, 67108864);
            }
            if (arg6 == 1) {
                this.method194(var8, var9, true, 16777216);
                this.method194(var8 + 1, var9 - -1, true, 268435456);
            }
            if (arg6 == 2) {
                this.method194(var8, var9, true, 67108864);
                this.method194(var8 + 1, var9 + -1, true, 4194304);
            }
            if (arg6 == 3) {
                this.method194(var8, var9, true, 268435456);
                this.method194(var8 - 1, var9 + -1, true, 16777216);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method194(var8, var9, true, 545259520);
            this.method194(var8 - 1, var9, true, 33554432);
            this.method194(var8, var9 + 1, true, 134217728);
        }
        if (arg6 == 1) {
            this.method194(var8, var9, true, 41943040);
            this.method194(var8, var9 + 1, true, 134217728);
            this.method194(var8 + 1, var9, true, 536870912);
        }
        if (arg6 == 2) {
            this.method194(var8, var9, true, 167772160);
            this.method194(var8 + 1, var9, true, 536870912);
            this.method194(var8, var9 - 1, true, 8388608);
        }
        if (arg6 == 3) {
            this.method194(var8, var9, true, 671088640);
            this.method194(var8, var9 - 1, true, 8388608);
            this.method194(var8 - 1, var9, true, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)V")
    public static final void method204(boolean arg0, int arg1) {
        class210.field3158.method1780(arg1, arg0);
        class71.field1127.method1780(arg1, arg0);
        field454++;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public static final void method205(int arg0) {
        class139.field2040 = null;
        class118.field1784 = null;
        class157.field2359 = null;
        class70.field1108 = null;
        class39.field523 = null;
        field448++;
        class106.field1634 = null;
        class57.field909 = null;
        class43.field695 = null;
        int var1 = -8 % ((-arg0 - 68) / 38);
        class143.field2102 = null;
        class243.field3644 = null;
        class293.field4620 = null;
        class20.field226 = null;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(II)V")
    public class31(int arg0, int arg1) {
        this.field459 = arg1;
        this.field441 = arg0;
        this.field460 = new int[this.field441][this.field459];
        this.method201(true);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)V")
    public final void method206(int arg0, int arg1, int arg2) {
        field452++;
        int var4 = arg0 - this.field440;
        int var5 = arg1 - this.field443;
        this.field460[var5][var4] = class63.method428(this.field460[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public static final void method207(int arg0) {
        field450++;
        class204.field3067.method1775(27147);
        if (arg0 != 720896) {
            field455 = -30;
        }
    }
}
