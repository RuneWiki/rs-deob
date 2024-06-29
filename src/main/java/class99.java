import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class99 {

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    private int field1478 = 0;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    private int field1472 = 0;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "[[I")
    public int[][] field1493;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field1470 = -1;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "[S")
    public static short[] field1486 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field1481 = 2;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Lff;")
    public static final class48 method666(int arg0) {
        field1480++;
        int var1 = class64.field924[0] * class284.field4603[0];
        byte[] var2 = class190.field2959[arg0];
        class48 var6;
        if (class281.field4576[0]) {
            byte[] var3 = class50.field631[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class243.method1723(class229.field3539[class205.method1411(var2[var5], 255)], class205.method1411(var3[var5] << 24, -16777216));
            }
            var6 = new class149(class15.field215, class86.field1308, class166.field2569[0], class277.field4480[0], class64.field924[0], class284.field4603[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class229.field3539[class205.method1411(var2[var8], 255)];
            }
            var6 = new class48(class15.field215, class86.field1308, class166.field2569[0], class277.field4480[0], class64.field924[0], class284.field4603[0], var7);
        }
        class115.method762((byte) -43);
        return var6;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public final void method667(byte arg0) {
        int var2 = -53 / ((-arg0 - 20) / 50);
        for (int var3 = 0; var3 < this.field1475; var3++) {
            for (int var4 = 0; var4 < this.field1489; var4++) {
                if (var3 == 0 || var4 == 0 || this.field1475 - 5 <= var3 || var4 >= (this.field1489 - 5)) {
                    this.field1493[var3][var4] = 16777215;
                } else {
                    this.field1493[var3][var4] = 2097152;
                }
            }
        }
        field1476++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BIZIIZI)V")
    public final void method668(byte arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg3 - this.field1478;
        int var9 = arg6 - this.field1472;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method670(128, var9, var8, true);
                this.method670(8, var9 - 1, var8, true);
            }
            if (arg4 == 1) {
                this.method670(2, var9, var8, true);
                this.method670(32, var9, var8 + 1, true);
            }
            if (arg4 == 2) {
                this.method670(8, var9, var8, true);
                this.method670(128, var9 + 1, var8, true);
            }
            if (arg4 == 3) {
                this.method670(32, var9, var8, true);
                this.method670(2, var9, var8 - 1, true);
            }
        }
        if (arg0 <= 88) {
            this.method673(106, 21, 107, -6, 45, true, false);
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method670(1, var9, var8, true);
                this.method670(16, var9 - 1, var8 + 1, true);
            }
            if (arg4 == 1) {
                this.method670(4, var9, var8, true);
                this.method670(64, var9 + 1, var8 + 1, true);
            }
            if (arg4 == 2) {
                this.method670(16, var9, var8, true);
                this.method670(1, var9 + 1, var8 + -1, true);
            }
            if (arg4 == 3) {
                this.method670(64, var9, var8, true);
                this.method670(4, var9 - 1, var8 - 1, true);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method670(130, var9, var8, true);
                this.method670(8, var9 - 1, var8, true);
                this.method670(32, var9, var8 + 1, true);
            }
            if (arg4 == 1) {
                this.method670(10, var9, var8, true);
                this.method670(32, var9, var8 + 1, true);
                this.method670(128, var9 + 1, var8, true);
            }
            if (arg4 == 2) {
                this.method670(40, var9, var8, true);
                this.method670(128, var9 + 1, var8, true);
                this.method670(2, var9, var8 - 1, true);
            }
            if (arg4 == 3) {
                this.method670(160, var9, var8, true);
                this.method670(2, var9, var8 - 1, true);
                this.method670(8, var9 - 1, var8, true);
            }
        }
        if (arg5) {
            if (arg1 == 0) {
                if (arg4 == 0) {
                    this.method670(65536, var9, var8, true);
                    this.method670(4096, var9 - 1, var8, true);
                }
                if (arg4 == 1) {
                    this.method670(1024, var9, var8, true);
                    this.method670(16384, var9, var8 + 1, true);
                }
                if (arg4 == 2) {
                    this.method670(4096, var9, var8, true);
                    this.method670(65536, var9 + 1, var8, true);
                }
                if (arg4 == 3) {
                    this.method670(16384, var9, var8, true);
                    this.method670(1024, var9, var8 - 1, true);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg4 == 0) {
                    this.method670(512, var9, var8, true);
                    this.method670(8192, var9 - 1, var8 + 1, true);
                }
                if (arg4 == 1) {
                    this.method670(2048, var9, var8, true);
                    this.method670(32768, var9 + 1, var8 + 1, true);
                }
                if (arg4 == 2) {
                    this.method670(8192, var9, var8, true);
                    this.method670(512, var9 + 1, var8 + -1, true);
                }
                if (arg4 == 3) {
                    this.method670(32768, var9, var8, true);
                    this.method670(2048, var9 - 1, var8 + -1, true);
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    this.method670(66560, var9, var8, true);
                    this.method670(4096, var9 - 1, var8, true);
                    this.method670(16384, var9, var8 + 1, true);
                }
                if (arg4 == 1) {
                    this.method670(5120, var9, var8, true);
                    this.method670(16384, var9, var8 + 1, true);
                    this.method670(65536, var9 + 1, var8, true);
                }
                if (arg4 == 2) {
                    this.method670(20480, var9, var8, true);
                    this.method670(65536, var9 + 1, var8, true);
                    this.method670(1024, var9, var8 - 1, true);
                }
                if (arg4 == 3) {
                    this.method670(81920, var9, var8, true);
                    this.method670(1024, var9, var8 - 1, true);
                    this.method670(4096, var9 - 1, var8, true);
                }
            }
        }
        field1483++;
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method670(536870912, var9, var8, true);
                this.method670(33554432, var9 - 1, var8, true);
            }
            if (arg4 == 1) {
                this.method670(8388608, var9, var8, true);
                this.method670(134217728, var9, var8 + 1, true);
            }
            if (arg4 == 2) {
                this.method670(33554432, var9, var8, true);
                this.method670(536870912, var9 + 1, var8, true);
            }
            if (arg4 == 3) {
                this.method670(134217728, var9, var8, true);
                this.method670(8388608, var9, var8 - 1, true);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method670(4194304, var9, var8, true);
                this.method670(67108864, var9 - 1, var8 + 1, true);
            }
            if (arg4 == 1) {
                this.method670(16777216, var9, var8, true);
                this.method670(268435456, var9 + 1, var8 + 1, true);
            }
            if (arg4 == 2) {
                this.method670(67108864, var9, var8, true);
                this.method670(4194304, var9 + 1, var8 + -1, true);
            }
            if (arg4 == 3) {
                this.method670(268435456, var9, var8, true);
                this.method670(16777216, var9 - 1, var8 + -1, true);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method670(545259520, var9, var8, true);
            this.method670(33554432, var9 - 1, var8, true);
            this.method670(134217728, var9, var8 + 1, true);
        }
        if (arg4 == 1) {
            this.method670(41943040, var9, var8, true);
            this.method670(134217728, var9, var8 + 1, true);
            this.method670(536870912, var9 + 1, var8, true);
        }
        if (arg4 == 2) {
            this.method670(167772160, var9, var8, true);
            this.method670(536870912, var9 + 1, var8, true);
            this.method670(8388608, var9, var8 - 1, true);
        }
        if (arg4 == 3) {
            this.method670(671088640, var9, var8, true);
            this.method670(8388608, var9, var8 - 1, true);
            this.method670(33554432, var9 - 1, var8, true);
            return;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZIIIIZ)V")
    public final void method669(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg3 - this.field1478;
        field1473++;
        int var9 = arg5 - this.field1472;
        int var10 = 256;
        if (arg6) {
            var10 |= 0x20000;
        }
        if (arg1) {
            var10 |= 0x40000000;
        }
        int var11 = var9;
        if (arg0 != -1) {
            this.method669(56, true, -2, -72, 10, -126, false);
        }
        while ((var9 + arg4) > var11) {
            if (var11 >= 0 && this.field1475 > var11) {
                for (int var12 = var8; var12 < (arg2 + var8); var12++) {
                    if (var12 >= 0 && this.field1489 > var12) {
                        this.method670(var10, var11, var12, true);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIZ)V")
    private final void method670(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field1493[arg1][arg2] = class243.method1723(this.field1493[arg1][arg2], arg0);
            field1492++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
    public final void method671(int arg0, int arg1, int arg2) {
        if (arg1 != -23201) {
            this.method672(113, -54, -5, 47);
        }
        field1479++;
        int var4 = arg0 - this.field1472;
        int var5 = arg2 - this.field1478;
        this.field1493[var4][var5] = class205.method1411(this.field1493[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
    private final void method672(int arg0, int arg1, int arg2, int arg3) {
        this.field1493[arg3][arg0] = class205.method1411(this.field1493[arg3][arg0], ~arg1);
        if (arg2 == -19353) {
            field1471++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIZZ)V")
    public final void method673(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        if (arg4 >= -86) {
            return;
        }
        int var8 = arg0 - this.field1478;
        field1491++;
        int var9 = arg1 - this.field1472;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method672(var8, 128, -19353, var9);
                this.method672(var8, 8, -19353, var9 - 1);
            }
            if (arg3 == 1) {
                this.method672(var8, 2, -19353, var9);
                this.method672(var8 + 1, 32, -19353, var9);
            }
            if (arg3 == 2) {
                this.method672(var8, 8, -19353, var9);
                this.method672(var8, 128, -19353, var9 + 1);
            }
            if (arg3 == 3) {
                this.method672(var8, 32, -19353, var9);
                this.method672(var8 - 1, 2, -19353, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method672(var8, 1, -19353, var9);
                this.method672(var8 + 1, 16, -19353, var9 - 1);
            }
            if (arg3 == 1) {
                this.method672(var8, 4, -19353, var9);
                this.method672(var8 + 1, 64, -19353, var9 + 1);
            }
            if (arg3 == 2) {
                this.method672(var8, 16, -19353, var9);
                this.method672(var8 - 1, 1, -19353, var9 + 1);
            }
            if (arg3 == 3) {
                this.method672(var8, 64, -19353, var9);
                this.method672(var8 - 1, 4, -19353, var9 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method672(var8, 130, -19353, var9);
                this.method672(var8, 8, -19353, var9 - 1);
                this.method672(var8 + 1, 32, -19353, var9);
            }
            if (arg3 == 1) {
                this.method672(var8, 10, -19353, var9);
                this.method672(var8 + 1, 32, -19353, var9);
                this.method672(var8, 128, -19353, var9 + 1);
            }
            if (arg3 == 2) {
                this.method672(var8, 40, -19353, var9);
                this.method672(var8, 128, -19353, var9 + 1);
                this.method672(var8 - 1, 2, -19353, var9);
            }
            if (arg3 == 3) {
                this.method672(var8, 160, -19353, var9);
                this.method672(var8 - 1, 2, -19353, var9);
                this.method672(var8, 8, -19353, var9 - 1);
            }
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    this.method672(var8, 65536, -19353, var9);
                    this.method672(var8, 4096, -19353, var9 - 1);
                }
                if (arg3 == 1) {
                    this.method672(var8, 1024, -19353, var9);
                    this.method672(var8 + 1, 16384, -19353, var9);
                }
                if (arg3 == 2) {
                    this.method672(var8, 4096, -19353, var9);
                    this.method672(var8, 65536, -19353, var9 + 1);
                }
                if (arg3 == 3) {
                    this.method672(var8, 16384, -19353, var9);
                    this.method672(var8 - 1, 1024, -19353, var9);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg3 == 0) {
                    this.method672(var8, 512, -19353, var9);
                    this.method672(var8 + 1, 8192, -19353, var9 - 1);
                }
                if (arg3 == 1) {
                    this.method672(var8, 2048, -19353, var9);
                    this.method672(var8 + 1, 32768, -19353, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method672(var8, 8192, -19353, var9);
                    this.method672(var8 - 1, 512, -19353, var9 + 1);
                }
                if (arg3 == 3) {
                    this.method672(var8, 32768, -19353, var9);
                    this.method672(var8 - 1, 2048, -19353, var9 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    this.method672(var8, 66560, -19353, var9);
                    this.method672(var8, 4096, -19353, var9 - 1);
                    this.method672(var8 + 1, 16384, -19353, var9);
                }
                if (arg3 == 1) {
                    this.method672(var8, 5120, -19353, var9);
                    this.method672(var8 + 1, 16384, -19353, var9);
                    this.method672(var8, 65536, -19353, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method672(var8, 20480, -19353, var9);
                    this.method672(var8, 65536, -19353, var9 + 1);
                    this.method672(var8 - 1, 1024, -19353, var9);
                }
                if (arg3 == 3) {
                    this.method672(var8, 81920, -19353, var9);
                    this.method672(var8 - 1, 1024, -19353, var9);
                    this.method672(var8, 4096, -19353, var9 - 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method672(var8, 536870912, -19353, var9);
                this.method672(var8, 33554432, -19353, var9 - 1);
            }
            if (arg3 == 1) {
                this.method672(var8, 8388608, -19353, var9);
                this.method672(var8 + 1, 134217728, -19353, var9);
            }
            if (arg3 == 2) {
                this.method672(var8, 33554432, -19353, var9);
                this.method672(var8, 536870912, -19353, var9 + 1);
            }
            if (arg3 == 3) {
                this.method672(var8, 134217728, -19353, var9);
                this.method672(var8 - 1, 8388608, -19353, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method672(var8, 4194304, -19353, var9);
                this.method672(var8 + 1, 67108864, -19353, var9 - 1);
            }
            if (arg3 == 1) {
                this.method672(var8, 16777216, -19353, var9);
                this.method672(var8 + 1, 268435456, -19353, var9 + 1);
            }
            if (arg3 == 2) {
                this.method672(var8, 67108864, -19353, var9);
                this.method672(var8 - 1, 4194304, -19353, var9 + 1);
            }
            if (arg3 == 3) {
                this.method672(var8, 268435456, -19353, var9);
                this.method672(var8 - 1, 16777216, -19353, var9 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method672(var8, 545259520, -19353, var9);
            this.method672(var8, 33554432, -19353, var9 - 1);
            this.method672(var8 + 1, 134217728, -19353, var9);
        }
        if (arg3 == 1) {
            this.method672(var8, 41943040, -19353, var9);
            this.method672(var8 + 1, 134217728, -19353, var9);
            this.method672(var8, 536870912, -19353, var9 + 1);
        }
        if (arg3 == 2) {
            this.method672(var8, 167772160, -19353, var9);
            this.method672(var8, 536870912, -19353, var9 + 1);
            this.method672(var8 - 1, 8388608, -19353, var9);
        }
        if (arg3 == 3) {
            this.method672(var8, 671088640, -19353, var9);
            this.method672(var8 - 1, 8388608, -19353, var9);
            this.method672(var8, 33554432, -19353, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZIIIZZI)V")
    public final void method674(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        if (!arg6) {
            this.field1478 = 49;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var9 = arg4;
            arg4 = arg7;
            arg7 = var9;
        }
        int var10 = arg3 - this.field1478;
        field1484++;
        int var11 = 256;
        if (arg1) {
            var11 |= 0x20000;
        }
        if (arg5) {
            var11 |= 0x40000000;
        }
        int var12 = arg0 - this.field1472;
        for (int var13 = var12; var13 < arg4 + var12; var13++) {
            if (var13 >= 0 && this.field1475 > var13) {
                for (int var14 = var10; var14 < var10 + arg7; var14++) {
                    if (var14 >= 0 && var14 < this.field1489) {
                        this.method672(var14, var11, -19353, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
    public static final int method675(int arg0, int arg1) {
        if (arg0 != 1) {
            return 81;
        }
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAA) >>> 1);
        field1487++;
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCD) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ)V")
    public final void method676(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field1472;
        if (!arg2) {
            int var5 = arg1 - this.field1478;
            this.field1493[var4][var5] = class243.method1723(this.field1493[var4][var5], 2097152);
            field1485++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static void method677(byte arg0) {
        int var1 = 53 / ((-arg0 - 57) / 46);
        field1486 = null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V")
    public final void method678(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1478;
        field1482++;
        int var5 = arg1 - this.field1472;
        this.field1493[var5][var4] = class243.method1723(this.field1493[var5][var4], 262144);
        int var6 = 96 % ((arg0 + 55) / 47);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(II)V")
    public class99(int arg0, int arg1) {
        this.field1475 = arg0;
        this.field1489 = arg1;
        this.field1493 = new int[this.field1475][this.field1489];
        this.method667((byte) -120);
    }
}
