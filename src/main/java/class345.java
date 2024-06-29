import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class345 {

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    private int field5354 = 0;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    private int field5345 = 0;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    private int field5351;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    private int field5358;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "[[I")
    public int[][] field5357;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[Lrj;")
    public static class269[] field5347;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 5)
    private final void method2383(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 26 / ((-arg2 - 31) / 46);
        this.field5357[arg3][arg1] = class261.method1835(this.field5357[arg3][arg1], arg0);
        field5344++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V", line = 21)
    public final void method2384(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.method2389((byte) -105, -74, 95);
        }
        field5349++;
        int var4 = arg0 - this.field5345;
        int var5 = arg1 - this.field5354;
        this.field5357[var4][var5] = class149.method1117(this.field5357[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V", line = 45)
    private final void method2385(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -1869148958) {
            field5359++;
            this.field5357[arg0][arg3] = class149.method1117(this.field5357[arg0][arg3], ~arg1);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 57)
    public final void method2386(int arg0) {
        field5356++;
        for (int var2 = 0; var2 < this.field5358; var2++) {
            for (int var3 = 0; var3 < this.field5351; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field5358 - 5) || var3 >= this.field5351 - 5) {
                    this.field5357[var2][var3] = 16777215;
                } else {
                    this.field5357[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != 12908) {
            this.method2388((byte) -83, 10, -81, -35, false, -59, false);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 90)
    public static void method2387(byte arg0) {
        int var1 = -14 % ((-arg0 - 63) / 42);
        field5347 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BIIIZIZ)V", line = 98)
    public final void method2388(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field5354;
        field5348++;
        int var9 = arg3 - this.field5345;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method2385(var9, 128, -1869148958, var8);
                this.method2385(var9 - 1, 8, -1869148958, var8);
            }
            if (arg1 == 1) {
                this.method2385(var9, 2, -1869148958, var8);
                this.method2385(var9, 32, -1869148958, var8 + 1);
            }
            if (arg1 == 2) {
                this.method2385(var9, 8, -1869148958, var8);
                this.method2385(var9 + 1, 128, -1869148958, var8);
            }
            if (arg1 == 3) {
                this.method2385(var9, 32, -1869148958, var8);
                this.method2385(var9, 2, -1869148958, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method2385(var9, 1, -1869148958, var8);
                this.method2385(var9 - 1, 16, -1869148958, var8 + 1);
            }
            if (arg1 == 1) {
                this.method2385(var9, 4, -1869148958, var8);
                this.method2385(var9 + 1, 64, -1869148958, var8 + 1);
            }
            if (arg1 == 2) {
                this.method2385(var9, 16, -1869148958, var8);
                this.method2385(var9 + 1, 1, -1869148958, var8 - 1);
            }
            if (arg1 == 3) {
                this.method2385(var9, 64, -1869148958, var8);
                this.method2385(var9 - 1, 4, -1869148958, var8 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method2385(var9, 130, -1869148958, var8);
                this.method2385(var9 - 1, 8, -1869148958, var8);
                this.method2385(var9, 32, -1869148958, var8 + 1);
            }
            if (arg1 == 1) {
                this.method2385(var9, 10, -1869148958, var8);
                this.method2385(var9, 32, -1869148958, var8 + 1);
                this.method2385(var9 + 1, 128, -1869148958, var8);
            }
            if (arg1 == 2) {
                this.method2385(var9, 40, -1869148958, var8);
                this.method2385(var9 + 1, 128, -1869148958, var8);
                this.method2385(var9, 2, -1869148958, var8 - 1);
            }
            if (arg1 == 3) {
                this.method2385(var9, 160, -1869148958, var8);
                this.method2385(var9, 2, -1869148958, var8 - 1);
                this.method2385(var9 - 1, 8, -1869148958, var8);
            }
        }
        int var10 = -92 % ((arg0 + 7) / 60);
        if (arg4) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method2385(var9, 65536, -1869148958, var8);
                    this.method2385(var9 - 1, 4096, -1869148958, var8);
                }
                if (arg1 == 1) {
                    this.method2385(var9, 1024, -1869148958, var8);
                    this.method2385(var9, 16384, -1869148958, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method2385(var9, 4096, -1869148958, var8);
                    this.method2385(var9 + 1, 65536, -1869148958, var8);
                }
                if (arg1 == 3) {
                    this.method2385(var9, 16384, -1869148958, var8);
                    this.method2385(var9, 1024, -1869148958, var8 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method2385(var9, 512, -1869148958, var8);
                    this.method2385(var9 - 1, 8192, -1869148958, var8 + 1);
                }
                if (arg1 == 1) {
                    this.method2385(var9, 2048, -1869148958, var8);
                    this.method2385(var9 + 1, 32768, -1869148958, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method2385(var9, 8192, -1869148958, var8);
                    this.method2385(var9 + 1, 512, -1869148958, var8 - 1);
                }
                if (arg1 == 3) {
                    this.method2385(var9, 32768, -1869148958, var8);
                    this.method2385(var9 - 1, 2048, -1869148958, var8 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method2385(var9, 66560, -1869148958, var8);
                    this.method2385(var9 - 1, 4096, -1869148958, var8);
                    this.method2385(var9, 16384, -1869148958, var8 + 1);
                }
                if (arg1 == 1) {
                    this.method2385(var9, 5120, -1869148958, var8);
                    this.method2385(var9, 16384, -1869148958, var8 + 1);
                    this.method2385(var9 + 1, 65536, -1869148958, var8);
                }
                if (arg1 == 2) {
                    this.method2385(var9, 20480, -1869148958, var8);
                    this.method2385(var9 + 1, 65536, -1869148958, var8);
                    this.method2385(var9, 1024, -1869148958, var8 - 1);
                }
                if (arg1 == 3) {
                    this.method2385(var9, 81920, -1869148958, var8);
                    this.method2385(var9, 1024, -1869148958, var8 - 1);
                    this.method2385(var9 - 1, 4096, -1869148958, var8);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method2385(var9, 536870912, -1869148958, var8);
                this.method2385(var9 - 1, 33554432, -1869148958, var8);
            }
            if (arg1 == 1) {
                this.method2385(var9, 8388608, -1869148958, var8);
                this.method2385(var9, 134217728, -1869148958, var8 + 1);
            }
            if (arg1 == 2) {
                this.method2385(var9, 33554432, -1869148958, var8);
                this.method2385(var9 + 1, 536870912, -1869148958, var8);
            }
            if (arg1 == 3) {
                this.method2385(var9, 134217728, -1869148958, var8);
                this.method2385(var9, 8388608, -1869148958, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method2385(var9, 4194304, -1869148958, var8);
                this.method2385(var9 - 1, 67108864, -1869148958, var8 + 1);
            }
            if (arg1 == 1) {
                this.method2385(var9, 16777216, -1869148958, var8);
                this.method2385(var9 + 1, 268435456, -1869148958, var8 + 1);
            }
            if (arg1 == 2) {
                this.method2385(var9, 67108864, -1869148958, var8);
                this.method2385(var9 + 1, 4194304, -1869148958, var8 - 1);
            }
            if (arg1 == 3) {
                this.method2385(var9, 268435456, -1869148958, var8);
                this.method2385(var9 - 1, 16777216, -1869148958, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method2385(var9, 545259520, -1869148958, var8);
            this.method2385(var9 - 1, 33554432, -1869148958, var8);
            this.method2385(var9, 134217728, -1869148958, var8 + 1);
        }
        if (arg1 == 1) {
            this.method2385(var9, 41943040, -1869148958, var8);
            this.method2385(var9, 134217728, -1869148958, var8 + 1);
            this.method2385(var9 + 1, 536870912, -1869148958, var8);
        }
        if (arg1 == 2) {
            this.method2385(var9, 167772160, -1869148958, var8);
            this.method2385(var9 + 1, 536870912, -1869148958, var8);
            this.method2385(var9, 8388608, -1869148958, var8 - 1);
        }
        if (arg1 == 3) {
            this.method2385(var9, 671088640, -1869148958, var8);
            this.method2385(var9, 8388608, -1869148958, var8 - 1);
            this.method2385(var9 - 1, 33554432, -1869148958, var8);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)V", line = 403)
    public final void method2389(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field5354;
        field5350++;
        int var5 = arg2 - this.field5345;
        if (arg0 == -102) {
            this.field5357[var5][var4] = class261.method1835(this.field5357[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)Z", line = 417)
    public final boolean method2390(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5360++;
        if (arg1 != 28329) {
            this.field5358 = 39;
        }
        if (arg2 == arg3 && arg0 == arg4) {
            return true;
        }
        int var6 = arg3 - this.field5345;
        int var7 = arg4 - this.field5354;
        if (var6 < 0 || var6 >= this.field5358 || var7 < 0 || var7 >= this.field5351) {
            return false;
        }
        int var8 = arg2 - this.field5345;
        int var9;
        if (var6 > var8) {
            var9 = var6 - var8;
        } else {
            var9 = var8 - var6;
        }
        int var10 = arg0 - this.field5354;
        int var11;
        if (var10 >= var7) {
            var11 = var10 - var7;
        } else {
            var11 = var7 - var10;
        }
        if (var11 >= var9) {
            int var12 = var9 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var10) {
                if (var7 > var10) {
                    if ((this.field5357[var8][var10] & 0x2C0102) != 0) {
                        return false;
                    }
                    var10++;
                } else if (var7 < var10) {
                    if ((this.field5357[var8][var10] & 0x2C0120) != 0) {
                        return false;
                    }
                    var10--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var8 < var6) {
                        if ((this.field5357[var8][var10] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var6) {
                        if ((this.field5357[var8][var10] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var9;
            int var15 = 32768;
            while (var6 != var8) {
                if (var8 < var6) {
                    if ((this.field5357[var8][var10] & 0x2C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field5357[var8][var10] & 0x2C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 > var10) {
                        if ((this.field5357[var8][var10] & 0x2C0102) != 0) {
                            return false;
                        }
                        var10++;
                    } else if (var7 < var10) {
                        if ((this.field5357[var8][var10] & 0x2C0120) != 0) {
                            return false;
                        }
                        var10--;
                    }
                }
            }
        }
        return (this.field5357[var6][var7] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIIIIIIZ)V", line = 572)
    public final void method2391(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field5353++;
        int var9 = 256;
        int var10 = arg1 - this.field5345;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg5;
            arg5 = arg6;
            arg6 = var11;
        }
        if (arg7) {
            var9 |= 0x20000;
        }
        int var12 = arg2 - this.field5354;
        if (arg0) {
            var9 |= 0x40000000;
        }
        for (int var13 = var10; var13 < arg5 + var10; var13++) {
            if (var13 >= 0 && this.field5358 > var13) {
                for (int var14 = var12; var14 < arg6 + var12; var14++) {
                    if (var14 >= 0 && this.field5351 > var14) {
                        this.method2385(var13, var9, -1869148958, var14);
                    }
                }
            }
        }
        if (arg4 != 65536) {
            this.field5354 = -127;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmn;I)V", line = 626)
    public static final void method2392(class161 arg0, int arg1) {
        field5362++;
        int var2 = arg0.field2598;
        if (var2 == 324) {
            if (class65.field937 == -1) {
                class304.field4656 = arg0.field2445;
                class65.field937 = arg0.field2589;
            }
            if (class212.field3257.field4553) {
                arg0.field2589 = class65.field937;
            } else {
                arg0.field2589 = class304.field4656;
            }
        } else if (var2 == 325) {
            if (class65.field937 == -1) {
                class304.field4656 = arg0.field2445;
                class65.field937 = arg0.field2589;
            }
            if (class212.field3257.field4553) {
                arg0.field2589 = class304.field4656;
            } else {
                arg0.field2589 = class65.field937;
            }
        } else if (var2 == 327) {
            arg0.field2622 = 150;
            arg0.field2473 = (int) (Math.sin((double) class233.field3542 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2481 = 5;
            arg0.field2444 = -1;
        } else {
            if (arg1 != 5) {
                method2393((class95) null, (byte) -39, (class95) null);
            }
            if (var2 == 328) {
                if (class39.field575.field4218 == null) {
                    arg0.field2444 = 0;
                } else {
                    arg0.field2622 = 150;
                    arg0.field2473 = (int) (Math.sin((double) class233.field3542 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field2481 = 5;
                    arg0.field2444 = ((int) class49.method374(class39.field575.field4218, -1) << 11) + 2047;
                    arg0.field2494 = class39.field575.field4765;
                    arg0.field2532 = class39.field575.field4695;
                    arg0.field2470 = 0;
                    arg0.field2460 = class39.field575.field4743;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljd;BLjd;)V", line = 703)
    public static final void method2393(class95 arg0, byte arg1, class95 arg2) {
        if (arg1 >= -95) {
            field5347 = (class269[]) null;
        }
        field5363++;
        class170.field2741 = arg2;
        class332.field5189 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZIIIIZ)V", line = 719)
    public final void method2394(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg4 - this.field5345;
        field5346++;
        int var9 = arg0 - this.field5354;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2383(128, var9, -88, var8);
                this.method2383(8, var9, 71, var8 - 1);
            }
            if (arg5 == 1) {
                this.method2383(2, var9, -83, var8);
                this.method2383(32, var9 + 1, -121, var8);
            }
            if (arg5 == 2) {
                this.method2383(8, var9, arg3 - 17653, var8);
                this.method2383(128, var9, 55, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2383(32, var9, -124, var8);
                this.method2383(2, var9 - 1, -94, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2383(1, var9, -122, var8);
                this.method2383(16, var9 + 1, 60, var8 - 1);
            }
            if (arg5 == 1) {
                this.method2383(4, var9, -82, var8);
                this.method2383(64, var9 + 1, 72, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2383(16, var9, arg3 ^ 0xFFFFBBFA, var8);
                this.method2383(1, var9 - 1, 86, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2383(64, var9, arg3 ^ 0xFFFFBBFF, var8);
                this.method2383(4, var9 - 1, -119, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method2383(130, var9, 126, var8);
                this.method2383(8, var9, -110, var8 - 1);
                this.method2383(32, var9 + 1, 114, var8);
            }
            if (arg5 == 1) {
                this.method2383(10, var9, arg3 - 17443, var8);
                this.method2383(32, var9 + 1, 117, var8);
                this.method2383(128, var9, arg3 - 17410, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2383(40, var9, 100, var8);
                this.method2383(128, var9, -93, var8 + 1);
                this.method2383(2, var9 - 1, arg3 + -17629, var8);
            }
            if (arg5 == 3) {
                this.method2383(160, var9, -123, var8);
                this.method2383(2, var9 - 1, arg3 + -17408, var8);
                this.method2383(8, var9, 20, var8 - 1);
            }
        }
        if (arg3 != 17530) {
            this.field5357 = (int[][]) ((int[][]) null);
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method2383(65536, var9, -91, var8);
                    this.method2383(4096, var9, arg3 - 17617, var8 + -1);
                }
                if (arg5 == 1) {
                    this.method2383(1024, var9, 58, var8);
                    this.method2383(16384, var9 + 1, 57, var8);
                }
                if (arg5 == 2) {
                    this.method2383(4096, var9, 120, var8);
                    this.method2383(65536, var9, arg3 ^ 0xFFFFBBFE, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method2383(16384, var9, 71, var8);
                    this.method2383(1024, var9 - 1, 63, var8);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method2383(512, var9, -128, var8);
                    this.method2383(8192, var9 + 1, -100, var8 + -1);
                }
                if (arg5 == 1) {
                    this.method2383(2048, var9, -90, var8);
                    this.method2383(32768, var9 + 1, -116, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2383(8192, var9, 54, var8);
                    this.method2383(512, var9 - 1, -123, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method2383(32768, var9, -96, var8);
                    this.method2383(2048, var9 - 1, 112, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method2383(66560, var9, arg3 ^ 0x4417, var8);
                    this.method2383(4096, var9, 56, var8 - 1);
                    this.method2383(16384, var9 + 1, 64, var8);
                }
                if (arg5 == 1) {
                    this.method2383(5120, var9, -87, var8);
                    this.method2383(16384, var9 + 1, arg3 + -17488, var8);
                    this.method2383(65536, var9, -105, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2383(20480, var9, -83, var8);
                    this.method2383(65536, var9, arg3 ^ 0xFFFFBBE2, var8 + 1);
                    this.method2383(1024, var9 - 1, 111, var8);
                }
                if (arg5 == 3) {
                    this.method2383(81920, var9, -123, var8);
                    this.method2383(1024, var9 - 1, -126, var8);
                    this.method2383(4096, var9, arg3 ^ 0xFFFFBBCA, var8 - 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2383(536870912, var9, 45, var8);
                this.method2383(33554432, var9, -90, var8 - 1);
            }
            if (arg5 == 1) {
                this.method2383(8388608, var9, arg3 ^ 0x441C, var8);
                this.method2383(134217728, var9 + 1, 86, var8);
            }
            if (arg5 == 2) {
                this.method2383(33554432, var9, -121, var8);
                this.method2383(536870912, var9, -102, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2383(134217728, var9, 29, var8);
                this.method2383(8388608, var9 - 1, arg3 ^ 0x4433, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2383(4194304, var9, 127, var8);
                this.method2383(67108864, var9 + 1, arg3 + -17632, var8 - 1);
            }
            if (arg5 == 1) {
                this.method2383(16777216, var9, -95, var8);
                this.method2383(268435456, var9 + 1, arg3 ^ 0xFFFFBBEE, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2383(67108864, var9, -119, var8);
                this.method2383(4194304, var9 - 1, arg3 ^ 0x446F, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2383(268435456, var9, -107, var8);
                this.method2383(16777216, var9 - 1, arg3 + -17609, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2383(545259520, var9, -105, var8);
            this.method2383(33554432, var9, arg3 - 17645, var8 + -1);
            this.method2383(134217728, var9 + 1, 90, var8);
        }
        if (arg5 == 1) {
            this.method2383(41943040, var9, -119, var8);
            this.method2383(134217728, var9 + 1, -115, var8);
            this.method2383(536870912, var9, 55, var8 + 1);
        }
        if (arg5 == 2) {
            this.method2383(167772160, var9, 42, var8);
            this.method2383(536870912, var9, -87, var8 + 1);
            this.method2383(8388608, var9 - 1, 59, var8);
        }
        if (arg5 == 3) {
            this.method2383(671088640, var9, 86, var8);
            this.method2383(8388608, var9 - 1, -107, var8);
            this.method2383(33554432, var9, arg3 ^ 0xFFFFBBEC, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(III)V", line = 1031)
    public final void method2395(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field5345;
        field5355++;
        if (arg1 >= -106) {
            this.method2386(14);
        }
        int var5 = arg0 - this.field5354;
        this.field5357[var4][var5] = class261.method1835(this.field5357[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(II)V", line = 1042)
    public class345(int arg0, int arg1) {
        this.field5351 = arg1;
        this.field5358 = arg0;
        this.field5357 = new int[this.field5358][this.field5351];
        this.method2386(12908);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIIIIIZ)V", line = 1057)
    public final void method2396(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg3 - this.field5345;
        field5361++;
        int var9 = arg4 - this.field5354;
        int var10 = 256;
        if (arg6) {
            var10 |= 0x20000;
        }
        if (arg0) {
            var10 |= 0x40000000;
        }
        if (arg2 != -16161) {
            method2387((byte) 12);
        }
        for (int var11 = var8; var11 < (arg1 + var8); var11++) {
            if (var11 >= 0 && var11 < this.field5358) {
                for (int var12 = var9; var12 < var9 + arg5; var12++) {
                    if (var12 >= 0 && var12 < this.field5351) {
                        this.method2383(var10, var12, 53, var11);
                    }
                }
            }
        }
    }
}
