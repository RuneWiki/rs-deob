import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class200 {

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    private int field3406;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    private int field3426;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    private int field3415;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    private int field3411;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "[[I")
    public int[][] field3418;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field3408 = 0;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Lul;")
    public static class51 field3405 = new class51(64);

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field3424 = 0;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "[[Z")
    public static boolean[][] field3423;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BIIII)Z", line = 4)
    public final boolean method1500(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3427++;
        if (arg1 == arg4 && arg2 == arg3) {
            return true;
        }
        int var6 = arg4 - this.field3415;
        int var7 = arg3 - this.field3426;
        if (var6 < 0 || var6 >= this.field3406 || var7 < 0 || this.field3411 <= var7) {
            return false;
        }
        int var8 = arg1 - this.field3415;
        int var9 = arg2 - this.field3426;
        int var10;
        if (var8 >= var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if (arg0 > -98) {
            return false;
        }
        int var11;
        if (var9 >= var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 <= var11) {
            int var12 = 32768;
            int var13 = var10 * 65536 / var11;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field3418[var8][var9] & 0x2C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var7) {
                    if ((this.field3418[var8][var9] & 0x2C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var6 > var8) {
                        if ((this.field3418[var8][var9] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var6) {
                        if ((this.field3418[var8][var9] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = 32768;
            int var15 = var11 * 65536 / var10;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field3418[var8][var9] & 0x2C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var6) {
                    if ((this.field3418[var8][var9] & 0x2C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var7 > var9) {
                        if ((this.field3418[var8][var9] & 0x2C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var7) {
                        if ((this.field3418[var8][var9] & 0x2C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field3418[var6][var7] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V", line = 159)
    public final void method1501(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3415;
        field3412++;
        int var5 = arg1 - this.field3426;
        if (arg0 == 15695) {
            this.field3418[var4][var5] = class144.method1159(this.field3418[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 187)
    public static void method1502(byte arg0) {
        field3405 = null;
        if (arg0 >= 107) {
            field3423 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZIIIIIZ)V", line = 199)
    public final void method1503(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 != -6783) {
            this.field3415 = -45;
        }
        int var8 = arg5 - this.field3415;
        int var9 = arg1 - this.field3426;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1507(128, arg4 ^ 0xFFFFEEED, var9, var8);
                this.method1507(8, 2924, var9, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1507(2, 2924, var9, var8);
                this.method1507(32, 2924, var9 + 1, var8);
            }
            if (arg2 == 2) {
                this.method1507(8, 2924, var9, var8);
                this.method1507(128, 2924, var9, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1507(32, 2924, var9, var8);
                this.method1507(2, 2924, var9 - 1, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1507(1, arg4 + 9707, var9, var8);
                this.method1507(16, 2924, var9 + 1, var8 + -1);
            }
            if (arg2 == 1) {
                this.method1507(4, 2924, var9, var8);
                this.method1507(64, 2924, var9 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1507(16, 2924, var9, var8);
                this.method1507(1, 2924, var9 - 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1507(64, 2924, var9, var8);
                this.method1507(4, arg4 + 9707, var9 + -1, var8 - 1);
            }
        }
        field3407++;
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method1507(130, 2924, var9, var8);
                this.method1507(8, 2924, var9, var8 - 1);
                this.method1507(32, arg4 + 9707, var9 - -1, var8);
            }
            if (arg2 == 1) {
                this.method1507(10, 2924, var9, var8);
                this.method1507(32, arg4 + 9707, var9 - -1, var8);
                this.method1507(128, 2924, var9, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1507(40, 2924, var9, var8);
                this.method1507(128, 2924, var9, var8 + 1);
                this.method1507(2, arg4 + 9707, var9 + -1, var8);
            }
            if (arg2 == 3) {
                this.method1507(160, 2924, var9, var8);
                this.method1507(2, 2924, var9 - 1, var8);
                this.method1507(8, arg4 + 9707, var9, var8 - 1);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    this.method1507(65536, 2924, var9, var8);
                    this.method1507(4096, 2924, var9, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method1507(1024, 2924, var9, var8);
                    this.method1507(16384, 2924, var9 + 1, var8);
                }
                if (arg2 == 2) {
                    this.method1507(4096, 2924, var9, var8);
                    this.method1507(65536, 2924, var9, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method1507(16384, 2924, var9, var8);
                    this.method1507(1024, 2924, var9 - 1, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg2 == 0) {
                    this.method1507(512, 2924, var9, var8);
                    this.method1507(8192, arg4 ^ 0xFFFFEEED, var9 + 1, var8 + -1);
                }
                if (arg2 == 1) {
                    this.method1507(2048, 2924, var9, var8);
                    this.method1507(32768, 2924, var9 + 1, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method1507(8192, 2924, var9, var8);
                    this.method1507(512, 2924, var9 - 1, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method1507(32768, arg4 ^ 0xFFFFEEED, var9, var8);
                    this.method1507(2048, 2924, var9 - 1, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    this.method1507(66560, 2924, var9, var8);
                    this.method1507(4096, arg4 ^ 0xFFFFEEED, var9, var8 - 1);
                    this.method1507(16384, arg4 + 9707, var9 + 1, var8);
                }
                if (arg2 == 1) {
                    this.method1507(5120, arg4 ^ 0xFFFFEEED, var9, var8);
                    this.method1507(16384, 2924, var9 + 1, var8);
                    this.method1507(65536, arg4 ^ 0xFFFFEEED, var9, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method1507(20480, 2924, var9, var8);
                    this.method1507(65536, 2924, var9, var8 + 1);
                    this.method1507(1024, 2924, var9 - 1, var8);
                }
                if (arg2 == 3) {
                    this.method1507(81920, 2924, var9, var8);
                    this.method1507(1024, arg4 + 9707, var9 + -1, var8);
                    this.method1507(4096, 2924, var9, var8 - 1);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1507(536870912, 2924, var9, var8);
                this.method1507(33554432, 2924, var9, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1507(8388608, 2924, var9, var8);
                this.method1507(134217728, 2924, var9 + 1, var8);
            }
            if (arg2 == 2) {
                this.method1507(33554432, 2924, var9, var8);
                this.method1507(536870912, 2924, var9, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1507(134217728, 2924, var9, var8);
                this.method1507(8388608, 2924, var9 - 1, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1507(4194304, 2924, var9, var8);
                this.method1507(67108864, arg4 + 9707, var9 - -1, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1507(16777216, 2924, var9, var8);
                this.method1507(268435456, 2924, var9 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1507(67108864, 2924, var9, var8);
                this.method1507(4194304, arg4 ^ 0xFFFFEEED, var9 - 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1507(268435456, 2924, var9, var8);
                this.method1507(16777216, 2924, var9 - 1, var8 + -1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1507(545259520, arg4 ^ 0xFFFFEEED, var9, var8);
            this.method1507(33554432, arg4 ^ 0xFFFFEEED, var9, var8 - 1);
            this.method1507(134217728, 2924, var9 + 1, var8);
        }
        if (arg2 == 1) {
            this.method1507(41943040, 2924, var9, var8);
            this.method1507(134217728, 2924, var9 + 1, var8);
            this.method1507(536870912, 2924, var9, var8 + 1);
        }
        if (arg2 == 2) {
            this.method1507(167772160, 2924, var9, var8);
            this.method1507(536870912, 2924, var9, var8 + 1);
            this.method1507(8388608, 2924, var9 - 1, var8);
        }
        if (arg2 == 3) {
            this.method1507(671088640, arg4 + 9707, var9, var8);
            this.method1507(8388608, 2924, var9 - 1, var8);
            this.method1507(33554432, 2924, var9, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 507)
    public final void method1504(boolean arg0) {
        field3420++;
        for (int var2 = 0; var2 < this.field3406; var2++) {
            for (int var3 = 0; var3 < this.field3411; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3406 - 5 <= var2 || var3 >= (this.field3411 - 5)) {
                    this.field3418[var2][var3] = 16777215;
                } else {
                    this.field3418[var2][var3] = 2097152;
                }
            }
        }
        if (arg0) {
            field3408 = 98;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)V", line = 538)
    public final void method1505(int arg0, int arg1, int arg2) {
        field3417++;
        if (arg2 <= 77) {
            field3405 = (class51) null;
        }
        int var4 = arg1 - this.field3426;
        int var5 = arg0 - this.field3415;
        this.field3418[var5][var4] = class144.method1159(this.field3418[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIBIILlg;I)V", line = 554)
    public static final void method1506(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class137 arg6, int arg7) {
        if (arg3 < 87) {
            field3408 = -49;
        }
        int var8 = arg0 * arg0 + arg7 * arg7;
        field3416++;
        if (var8 > arg1) {
            return;
        }
        int var9 = Math.min(arg6.field2533 / 2, arg6.field2515 / 2);
        if (var9 * var9 >= var8) {
            class56.method500(arg5, arg6, arg4, arg0, (byte) 101, class131.field2252[arg2], arg7);
            return;
        }
        var9 -= 10;
        int var10 = (int) class83.field1331 + class243.field3962 & 0x7FF;
        int var11 = class62.field962[var10];
        int var12 = var11 * 256 / (class4.field59 + 256);
        int var13 = class62.field961[var10];
        int var14 = var13 * 256 / (class4.field59 + 256);
        int var15 = arg7 * var12 + (arg0 * var14) >> 16;
        int var16 = arg7 * var14 - (arg0 * var12) >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var9);
        if (class43.field680) {
            ((class157) class36.field534[arg2]).method1252(240, 240, (arg6.field2533 / 2 + arg5 + var19) * 16, (arg6.field2515 / 2 + arg4 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class309) class36.field534[arg2]).method1878(var19 + arg6.field2533 / 2 + arg5 - 10, arg6.field2515 / 2 + arg4 + -var20 + -10, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V", line = 602)
    private final void method1507(int arg0, int arg1, int arg2, int arg3) {
        this.field3418[arg3][arg2] = class36.method319(this.field3418[arg3][arg2], ~arg0);
        field3410++;
        if (arg1 != 2924) {
            this.field3415 = -24;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIZIZ)V", line = 616)
    public final void method1508(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg3 - this.field3415;
        int var9 = arg2 - this.field3426;
        if (arg5 != 0) {
            this.field3418 = (int[][]) ((int[][]) null);
        }
        field3421++;
        int var10 = 256;
        if (arg6) {
            var10 |= 0x20000;
        }
        if (arg4) {
            var10 |= 0x40000000;
        }
        for (int var11 = var8; var11 < (var8 + arg1); var11++) {
            if (var11 >= 0 && var11 < this.field3406) {
                for (int var12 = var9; var12 < var9 + arg0; var12++) {
                    if (var12 >= 0 && this.field3411 > var12) {
                        this.method1509(arg5 ^ 0xFFFFFFD1, var11, var10, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIII)V", line = 666)
    private final void method1509(int arg0, int arg1, int arg2, int arg3) {
        field3425++;
        if (arg0 <= -25) {
            this.field3418[arg1][arg3] = class144.method1159(this.field3418[arg1][arg3], arg2);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILpi;)Lqh;", line = 683)
    public static final class325 method1510(int arg0, int arg1, class336 arg2) {
        class325 var3 = new class325(arg0, arg2.method2365(108), arg2.method2365(108), arg2.method2338((byte) 119), arg2.method2338((byte) 119), arg2.method2364(-9069) == 1, arg2.method2364(-9069));
        field3414++;
        int var4 = arg2.method2364(-9069);
        if (arg1 != 1) {
            return (class325) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field5176.method2303((byte) -124, new class254(arg2.method2364(-9069), arg2.method2364(arg1 ^ 0xFFFFDC92), arg2.method2339((byte) -46), arg2.method2339((byte) -46), arg2.method2339((byte) -46), arg2.method2339((byte) -46), arg2.method2339((byte) -46), arg2.method2339((byte) -46), arg2.method2339((byte) -46), arg2.method2339((byte) -46)));
        }
        var3.method2257(120);
        return var3;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)V", line = 712)
    public final void method1511(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3415;
        int var5 = arg1 - this.field3426;
        field3409++;
        if (arg0 != -19233) {
            this.field3406 = -114;
        }
        this.field3418[var4][var5] = class36.method319(this.field3418[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZIIZIIII)V", line = 727)
    public final void method1512(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg5 - this.field3426;
        int var10 = arg4 - this.field3415;
        field3413++;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg2;
            arg2 = arg1;
            arg1 = var11;
        }
        int var12 = 256;
        if (arg0) {
            var12 |= 0x20000;
        }
        if (arg3) {
            var12 |= 0x40000000;
        }
        for (int var13 = var10; var13 < (arg2 + var10); var13++) {
            if (var13 >= 0 && this.field3406 > var13) {
                for (int var14 = var9; var14 < arg1 + var9; var14++) {
                    if (var14 >= 0 && var14 < this.field3411) {
                        this.method1507(var12, 2924, var14, var13);
                    }
                }
            }
        }
        if (arg7 != 131072) {
            field3423 = (boolean[][]) ((boolean[][]) null);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIZIZI)V", line = 787)
    public final void method1513(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field3426;
        int var9 = arg0 - this.field3415;
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method1509(-52, var9, 128, var8);
                this.method1509(arg1 ^ 0x55D9, var9 - 1, 8, var8);
            }
            if (arg6 == 1) {
                this.method1509(-75, var9, 2, var8);
                this.method1509(-122, var9, 32, var8 + 1);
            }
            if (arg6 == 2) {
                this.method1509(arg1 + 21850, var9, 8, var8);
                this.method1509(-57, var9 + 1, 128, var8);
            }
            if (arg6 == 3) {
                this.method1509(-101, var9, 32, var8);
                this.method1509(arg1 + 21832, var9, 2, var8 - 1);
            }
        }
        field3422++;
        if (arg1 != -21952) {
            return;
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method1509(-102, var9, 1, var8);
                this.method1509(-94, var9 - 1, 16, var8 + 1);
            }
            if (arg6 == 1) {
                this.method1509(-120, var9, 4, var8);
                this.method1509(-80, var9 + 1, 64, var8 + 1);
            }
            if (arg6 == 2) {
                this.method1509(-77, var9, 16, var8);
                this.method1509(-34, var9 + 1, 1, var8 - 1);
            }
            if (arg6 == 3) {
                this.method1509(-87, var9, 64, var8);
                this.method1509(-112, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                this.method1509(-46, var9, 130, var8);
                this.method1509(-96, var9 - 1, 8, var8);
                this.method1509(-85, var9, 32, var8 + 1);
            }
            if (arg6 == 1) {
                this.method1509(arg1 ^ 0x55F6, var9, 10, var8);
                this.method1509(-45, var9, 32, var8 + 1);
                this.method1509(-64, var9 + 1, 128, var8);
            }
            if (arg6 == 2) {
                this.method1509(arg1 ^ 0x5580, var9, 40, var8);
                this.method1509(-79, var9 + 1, 128, var8);
                this.method1509(-77, var9, 2, var8 - 1);
            }
            if (arg6 == 3) {
                this.method1509(arg1 ^ 0x55EA, var9, 160, var8);
                this.method1509(-122, var9, 2, var8 - 1);
                this.method1509(-108, var9 - 1, 8, var8);
            }
        }
        if (arg3) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    this.method1509(-69, var9, 65536, var8);
                    this.method1509(-55, var9 - 1, 4096, var8);
                }
                if (arg6 == 1) {
                    this.method1509(arg1 ^ 0x55EF, var9, 1024, var8);
                    this.method1509(-101, var9, 16384, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method1509(-34, var9, 4096, var8);
                    this.method1509(-86, var9 + 1, 65536, var8);
                }
                if (arg6 == 3) {
                    this.method1509(-128, var9, 16384, var8);
                    this.method1509(arg1 + 21888, var9, 1024, var8 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg6 == 0) {
                    this.method1509(-90, var9, 512, var8);
                    this.method1509(-34, var9 - 1, 8192, var8 + 1);
                }
                if (arg6 == 1) {
                    this.method1509(-110, var9, 2048, var8);
                    this.method1509(-32, var9 + 1, 32768, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method1509(-49, var9, 8192, var8);
                    this.method1509(-58, var9 + 1, 512, var8 - 1);
                }
                if (arg6 == 3) {
                    this.method1509(-43, var9, 32768, var8);
                    this.method1509(arg1 ^ 0x55C4, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    this.method1509(-117, var9, 66560, var8);
                    this.method1509(arg1 + 21907, var9 - 1, 4096, var8);
                    this.method1509(arg1 ^ 0x559A, var9, 16384, var8 + 1);
                }
                if (arg6 == 1) {
                    this.method1509(-37, var9, 5120, var8);
                    this.method1509(-99, var9, 16384, var8 + 1);
                    this.method1509(arg1 ^ 0x55D9, var9 + 1, 65536, var8);
                }
                if (arg6 == 2) {
                    this.method1509(arg1 ^ 0x55CE, var9, 20480, var8);
                    this.method1509(-68, var9 + 1, 65536, var8);
                    this.method1509(-50, var9, 1024, var8 - 1);
                }
                if (arg6 == 3) {
                    this.method1509(-101, var9, 81920, var8);
                    this.method1509(arg1 ^ 0x5585, var9, 1024, var8 - 1);
                    this.method1509(-62, var9 - 1, 4096, var8);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method1509(-58, var9, 536870912, var8);
                this.method1509(-29, var9 - 1, 33554432, var8);
            }
            if (arg6 == 1) {
                this.method1509(-104, var9, 8388608, var8);
                this.method1509(-63, var9, 134217728, var8 + 1);
            }
            if (arg6 == 2) {
                this.method1509(-78, var9, 33554432, var8);
                this.method1509(-126, var9 + 1, 536870912, var8);
            }
            if (arg6 == 3) {
                this.method1509(arg1 ^ 0x55C1, var9, 134217728, var8);
                this.method1509(arg1 + 21875, var9, 8388608, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method1509(arg1 + 21913, var9, 4194304, var8);
                this.method1509(-84, var9 - 1, 67108864, var8 + 1);
            }
            if (arg6 == 1) {
                this.method1509(-81, var9, 16777216, var8);
                this.method1509(-124, var9 + 1, 268435456, var8 + 1);
            }
            if (arg6 == 2) {
                this.method1509(arg1 + 21845, var9, 67108864, var8);
                this.method1509(arg1 + 21854, var9 + 1, 4194304, var8 - 1);
            }
            if (arg6 == 3) {
                this.method1509(-66, var9, 268435456, var8);
                this.method1509(-63, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method1509(-70, var9, 545259520, var8);
            this.method1509(-58, var9 - 1, 33554432, var8);
            this.method1509(-98, var9, 134217728, var8 + 1);
        }
        if (arg6 == 1) {
            this.method1509(arg1 + 21871, var9, 41943040, var8);
            this.method1509(arg1 + 21914, var9, 134217728, var8 + 1);
            this.method1509(-101, var9 + 1, 536870912, var8);
        }
        if (arg6 == 2) {
            this.method1509(-73, var9, 167772160, var8);
            this.method1509(-53, var9 + 1, 536870912, var8);
            this.method1509(arg1 + 21921, var9, 8388608, var8 - 1);
        }
        if (arg6 == 3) {
            this.method1509(arg1 + 21889, var9, 671088640, var8);
            this.method1509(-31, var9, 8388608, var8 - 1);
            this.method1509(-85, var9 - 1, 33554432, var8);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(II)V", line = 1094)
    public class200(int arg0, int arg1) {
        this.field3406 = arg0;
        this.field3426 = 0;
        this.field3415 = 0;
        this.field3411 = arg1;
        this.field3418 = new int[this.field3406][this.field3411];
        this.method1504(false);
    }
}
