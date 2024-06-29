import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class303 {

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    private int field4722;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    private int field4717;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    private int field4718;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "[[I")
    public int[][] field4732;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    private int field4721;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "[S")
    public static short[] field4724 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Ltb;")
    public static class220 field4728 = null;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "[[B")
    public static byte[][] field4723;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V", line = 5)
    public final void method2060(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4717;
        field4733++;
        int var5 = arg2 - this.field4721;
        if (arg0 > 81) {
            this.field4732[var4][var5] = class222.method1577(this.field4732[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZIIZII)V", line = 27)
    public final void method2061(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field4717;
        field4734++;
        int var9 = 39 / ((34 - arg6) / 49);
        int var10 = arg2 - this.field4721;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method2064(var10, 128, var8, (byte) -84);
                this.method2064(var10, 8, var8 - 1, (byte) -84);
            }
            if (arg3 == 1) {
                this.method2064(var10, 2, var8, (byte) -84);
                this.method2064(var10 + 1, 32, var8, (byte) -84);
            }
            if (arg3 == 2) {
                this.method2064(var10, 8, var8, (byte) -84);
                this.method2064(var10, 128, var8 + 1, (byte) -84);
            }
            if (arg3 == 3) {
                this.method2064(var10, 32, var8, (byte) -84);
                this.method2064(var10 - 1, 2, var8, (byte) -84);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method2064(var10, 1, var8, (byte) -84);
                this.method2064(var10 + 1, 16, var8 - 1, (byte) -84);
            }
            if (arg3 == 1) {
                this.method2064(var10, 4, var8, (byte) -84);
                this.method2064(var10 + 1, 64, var8 + 1, (byte) -84);
            }
            if (arg3 == 2) {
                this.method2064(var10, 16, var8, (byte) -84);
                this.method2064(var10 - 1, 1, var8 + 1, (byte) -84);
            }
            if (arg3 == 3) {
                this.method2064(var10, 64, var8, (byte) -84);
                this.method2064(var10 - 1, 4, var8 - 1, (byte) -84);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method2064(var10, 130, var8, (byte) -84);
                this.method2064(var10, 8, var8 - 1, (byte) -84);
                this.method2064(var10 + 1, 32, var8, (byte) -84);
            }
            if (arg3 == 1) {
                this.method2064(var10, 10, var8, (byte) -84);
                this.method2064(var10 + 1, 32, var8, (byte) -84);
                this.method2064(var10, 128, var8 + 1, (byte) -84);
            }
            if (arg3 == 2) {
                this.method2064(var10, 40, var8, (byte) -84);
                this.method2064(var10, 128, var8 + 1, (byte) -84);
                this.method2064(var10 - 1, 2, var8, (byte) -84);
            }
            if (arg3 == 3) {
                this.method2064(var10, 160, var8, (byte) -84);
                this.method2064(var10 - 1, 2, var8, (byte) -84);
                this.method2064(var10, 8, var8 - 1, (byte) -84);
            }
        }
        if (arg1) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    this.method2064(var10, 65536, var8, (byte) -84);
                    this.method2064(var10, 4096, var8 - 1, (byte) -84);
                }
                if (arg3 == 1) {
                    this.method2064(var10, 1024, var8, (byte) -84);
                    this.method2064(var10 + 1, 16384, var8, (byte) -84);
                }
                if (arg3 == 2) {
                    this.method2064(var10, 4096, var8, (byte) -84);
                    this.method2064(var10, 65536, var8 + 1, (byte) -84);
                }
                if (arg3 == 3) {
                    this.method2064(var10, 16384, var8, (byte) -84);
                    this.method2064(var10 - 1, 1024, var8, (byte) -84);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg3 == 0) {
                    this.method2064(var10, 512, var8, (byte) -84);
                    this.method2064(var10 + 1, 8192, var8 - 1, (byte) -84);
                }
                if (arg3 == 1) {
                    this.method2064(var10, 2048, var8, (byte) -84);
                    this.method2064(var10 + 1, 32768, var8 + 1, (byte) -84);
                }
                if (arg3 == 2) {
                    this.method2064(var10, 8192, var8, (byte) -84);
                    this.method2064(var10 - 1, 512, var8 + 1, (byte) -84);
                }
                if (arg3 == 3) {
                    this.method2064(var10, 32768, var8, (byte) -84);
                    this.method2064(var10 - 1, 2048, var8 - 1, (byte) -84);
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    this.method2064(var10, 66560, var8, (byte) -84);
                    this.method2064(var10, 4096, var8 - 1, (byte) -84);
                    this.method2064(var10 + 1, 16384, var8, (byte) -84);
                }
                if (arg3 == 1) {
                    this.method2064(var10, 5120, var8, (byte) -84);
                    this.method2064(var10 + 1, 16384, var8, (byte) -84);
                    this.method2064(var10, 65536, var8 + 1, (byte) -84);
                }
                if (arg3 == 2) {
                    this.method2064(var10, 20480, var8, (byte) -84);
                    this.method2064(var10, 65536, var8 + 1, (byte) -84);
                    this.method2064(var10 - 1, 1024, var8, (byte) -84);
                }
                if (arg3 == 3) {
                    this.method2064(var10, 81920, var8, (byte) -84);
                    this.method2064(var10 - 1, 1024, var8, (byte) -84);
                    this.method2064(var10, 4096, var8 - 1, (byte) -84);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method2064(var10, 536870912, var8, (byte) -84);
                this.method2064(var10, 33554432, var8 - 1, (byte) -84);
            }
            if (arg3 == 1) {
                this.method2064(var10, 8388608, var8, (byte) -84);
                this.method2064(var10 + 1, 134217728, var8, (byte) -84);
            }
            if (arg3 == 2) {
                this.method2064(var10, 33554432, var8, (byte) -84);
                this.method2064(var10, 536870912, var8 + 1, (byte) -84);
            }
            if (arg3 == 3) {
                this.method2064(var10, 134217728, var8, (byte) -84);
                this.method2064(var10 - 1, 8388608, var8, (byte) -84);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method2064(var10, 4194304, var8, (byte) -84);
                this.method2064(var10 + 1, 67108864, var8 - 1, (byte) -84);
            }
            if (arg3 == 1) {
                this.method2064(var10, 16777216, var8, (byte) -84);
                this.method2064(var10 + 1, 268435456, var8 + 1, (byte) -84);
            }
            if (arg3 == 2) {
                this.method2064(var10, 67108864, var8, (byte) -84);
                this.method2064(var10 - 1, 4194304, var8 + 1, (byte) -84);
            }
            if (arg3 == 3) {
                this.method2064(var10, 268435456, var8, (byte) -84);
                this.method2064(var10 - 1, 16777216, var8 - 1, (byte) -84);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2064(var10, 545259520, var8, (byte) -84);
            this.method2064(var10, 33554432, var8 - 1, (byte) -84);
            this.method2064(var10 + 1, 134217728, var8, (byte) -84);
        }
        if (arg3 == 1) {
            this.method2064(var10, 41943040, var8, (byte) -84);
            this.method2064(var10 + 1, 134217728, var8, (byte) -84);
            this.method2064(var10, 536870912, var8 + 1, (byte) -84);
        }
        if (arg3 == 2) {
            this.method2064(var10, 167772160, var8, (byte) -84);
            this.method2064(var10, 536870912, var8 + 1, (byte) -84);
            this.method2064(var10 - 1, 8388608, var8, (byte) -84);
        }
        if (arg3 == 3) {
            this.method2064(var10, 671088640, var8, (byte) -84);
            this.method2064(var10 - 1, 8388608, var8, (byte) -84);
            this.method2064(var10, 33554432, var8 - 1, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)Z", line = 334)
    public final boolean method2062(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4716++;
        if (arg0 == arg3 && arg2 == arg4) {
            return true;
        }
        if (arg1 != 65536) {
            field4728 = (class220) null;
        }
        int var6 = arg0 - this.field4717;
        int var7 = arg2 - this.field4721;
        if (var6 < 0 || this.field4718 <= var6 || var7 < 0 || this.field4722 <= var7) {
            return false;
        }
        int var8 = arg3 - this.field4717;
        int var9 = arg4 - this.field4721;
        int var10;
        if (var8 >= var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var9 >= var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 > var11) {
            int var12 = 32768;
            int var13 = var11 * 65536 / var10;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field4732[var8][var9] & 0x2C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var6) {
                    if ((this.field4732[var8][var9] & 0x2C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var7 > var9) {
                        if ((this.field4732[var8][var9] & 0x2C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field4732[var8][var9] & 0x2C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field4732[var8][var9] & 0x2C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field4732[var8][var9] & 0x2C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 > var8) {
                        if ((this.field4732[var8][var9] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field4732[var8][var9] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field4732[var6][var7] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIZZI)V", line = 492)
    public final void method2063(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field4721;
        field4726++;
        int var9 = arg3 - this.field4717;
        if (arg0 != -3) {
            this.field4721 = 73;
        }
        int var10 = 256;
        if (arg5) {
            var10 |= 0x20000;
        }
        if (arg4) {
            var10 |= 0x40000000;
        }
        for (int var11 = var9; var11 < arg1 + var9; var11++) {
            if (var11 >= 0 && var11 < this.field4718) {
                for (int var12 = var8; var12 < arg6 + var8; var12++) {
                    if (var12 >= 0 && this.field4722 > var12) {
                        this.method2064(var12, var10, var11, (byte) -84);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIB)V", line = 540)
    private final void method2064(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -84) {
            method2071(-125);
        }
        this.field4732[arg2][arg0] = class222.method1577(this.field4732[arg2][arg0], arg1);
        field4725++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBZIIIZI)V", line = 559)
    public final void method2065(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var9 = arg7 - this.field4721;
        int var10 = arg5 - this.field4717;
        int var11 = 30 % ((39 - arg1) / 46);
        if (arg4 == 1 || arg4 == 3) {
            int var12 = arg0;
            arg0 = arg3;
            arg3 = var12;
        }
        int var13 = 256;
        field4720++;
        if (arg2) {
            var13 |= 0x20000;
        }
        if (arg6) {
            var13 |= 0x40000000;
        }
        for (int var14 = var10; var14 < arg0 + var10; var14++) {
            if (var14 >= 0 && var14 < this.field4718) {
                for (int var15 = var9; var15 < (arg3 + var9); var15++) {
                    if (var15 >= 0 && this.field4722 > var15) {
                        this.method2067(var13, var14, -399, var15);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IZIIZII)V", line = 613)
    public final void method2066(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field4721;
        field4735++;
        int var9 = arg6 - this.field4717;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method2067(128, var9, arg2 ^ 0xFFFFFE51, var8);
                this.method2067(8, var9 - 1, -399, var8);
            }
            if (arg0 == 1) {
                this.method2067(2, var9, -399, var8);
                this.method2067(32, var9, -399, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2067(8, var9, -399, var8);
                this.method2067(128, var9 + 1, -399, var8);
            }
            if (arg0 == 3) {
                this.method2067(32, var9, -399, var8);
                this.method2067(2, var9, arg2 - 431, var8 + -1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method2067(1, var9, -399, var8);
                this.method2067(16, var9 - 1, arg2 + -431, var8 + 1);
            }
            if (arg0 == 1) {
                this.method2067(4, var9, -399, var8);
                this.method2067(64, var9 + 1, -399, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2067(16, var9, -399, var8);
                this.method2067(1, var9 + 1, -399, var8 + -1);
            }
            if (arg0 == 3) {
                this.method2067(64, var9, arg2 ^ 0xFFFFFE51, var8);
                this.method2067(4, var9 - 1, -399, var8 - 1);
            }
        }
        if (arg2 != 32) {
            return;
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method2067(130, var9, -399, var8);
                this.method2067(8, var9 - 1, -399, var8);
                this.method2067(32, var9, -399, var8 + 1);
            }
            if (arg0 == 1) {
                this.method2067(10, var9, -399, var8);
                this.method2067(32, var9, -399, var8 + 1);
                this.method2067(128, var9 + 1, arg2 ^ 0xFFFFFE51, var8);
            }
            if (arg0 == 2) {
                this.method2067(40, var9, -399, var8);
                this.method2067(128, var9 + 1, -399, var8);
                this.method2067(2, var9, arg2 - 431, var8 + -1);
            }
            if (arg0 == 3) {
                this.method2067(160, var9, arg2 ^ 0xFFFFFE51, var8);
                this.method2067(2, var9, -399, var8 - 1);
                this.method2067(8, var9 - 1, -399, var8);
            }
        }
        if (arg1) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method2067(65536, var9, -399, var8);
                    this.method2067(4096, var9 - 1, -399, var8);
                }
                if (arg0 == 1) {
                    this.method2067(1024, var9, -399, var8);
                    this.method2067(16384, var9, -399, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method2067(4096, var9, -399, var8);
                    this.method2067(65536, var9 + 1, -399, var8);
                }
                if (arg0 == 3) {
                    this.method2067(16384, var9, -399, var8);
                    this.method2067(1024, var9, -399, var8 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method2067(512, var9, arg2 - 431, var8);
                    this.method2067(8192, var9 - 1, -399, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method2067(2048, var9, -399, var8);
                    this.method2067(32768, var9 + 1, -399, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method2067(8192, var9, -399, var8);
                    this.method2067(512, var9 + 1, arg2 + -431, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method2067(32768, var9, -399, var8);
                    this.method2067(2048, var9 - 1, -399, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method2067(66560, var9, -399, var8);
                    this.method2067(4096, var9 - 1, arg2 ^ 0xFFFFFE51, var8);
                    this.method2067(16384, var9, arg2 - 431, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method2067(5120, var9, -399, var8);
                    this.method2067(16384, var9, -399, var8 + 1);
                    this.method2067(65536, var9 + 1, -399, var8);
                }
                if (arg0 == 2) {
                    this.method2067(20480, var9, -399, var8);
                    this.method2067(65536, var9 + 1, arg2 ^ 0xFFFFFE51, var8);
                    this.method2067(1024, var9, arg2 ^ 0xFFFFFE51, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method2067(81920, var9, arg2 ^ 0xFFFFFE51, var8);
                    this.method2067(1024, var9, -399, var8 - 1);
                    this.method2067(4096, var9 - 1, -399, var8);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method2067(536870912, var9, arg2 - 431, var8);
                this.method2067(33554432, var9 - 1, -399, var8);
            }
            if (arg0 == 1) {
                this.method2067(8388608, var9, -399, var8);
                this.method2067(134217728, var9, arg2 - 431, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2067(33554432, var9, arg2 ^ 0xFFFFFE51, var8);
                this.method2067(536870912, var9 + 1, -399, var8);
            }
            if (arg0 == 3) {
                this.method2067(134217728, var9, -399, var8);
                this.method2067(8388608, var9, -399, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method2067(4194304, var9, -399, var8);
                this.method2067(67108864, var9 - 1, -399, var8 + 1);
            }
            if (arg0 == 1) {
                this.method2067(16777216, var9, arg2 - 431, var8);
                this.method2067(268435456, var9 + 1, arg2 + -431, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2067(67108864, var9, -399, var8);
                this.method2067(4194304, var9 + 1, -399, var8 - 1);
            }
            if (arg0 == 3) {
                this.method2067(268435456, var9, -399, var8);
                this.method2067(16777216, var9 - 1, -399, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2067(545259520, var9, arg2 - 431, var8);
            this.method2067(33554432, var9 - 1, -399, var8);
            this.method2067(134217728, var9, arg2 ^ 0xFFFFFE51, var8 + 1);
        }
        if (arg0 == 1) {
            this.method2067(41943040, var9, -399, var8);
            this.method2067(134217728, var9, -399, var8 + 1);
            this.method2067(536870912, var9 + 1, -399, var8);
        }
        if (arg0 == 2) {
            this.method2067(167772160, var9, arg2 ^ 0xFFFFFE51, var8);
            this.method2067(536870912, var9 + 1, -399, var8);
            this.method2067(8388608, var9, -399, var8 - 1);
        }
        if (arg0 == 3) {
            this.method2067(671088640, var9, arg2 ^ 0xFFFFFE51, var8);
            this.method2067(8388608, var9, arg2 - 431, var8 + -1);
            this.method2067(33554432, var9 - 1, -399, var8);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)V", line = 922)
    private final void method2067(int arg0, int arg1, int arg2, int arg3) {
        this.field4732[arg1][arg3] = class270.method1860(this.field4732[arg1][arg3], ~arg0);
        if (arg2 != -399) {
            field4723 = (byte[][]) ((byte[][]) null);
        }
        field4731++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 938)
    public final void method2068(byte arg0) {
        for (int var2 = 0; var2 < this.field4718; var2++) {
            for (int var3 = 0; var3 < this.field4722; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field4718 - 5) || var3 >= this.field4722 - 5) {
                    this.field4732[var2][var3] = 16777215;
                } else {
                    this.field4732[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != -50) {
            this.method2063(-56, 64, -46, 47, false, true, 24);
        }
        field4719++;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V", line = 967)
    public final void method2069(int arg0, int arg1, int arg2) {
        field4715++;
        int var4 = arg1 - this.field4717;
        int var5 = arg0 - this.field4721;
        this.field4732[var4][var5] = class222.method1577(this.field4732[var4][var5], 262144);
        int var6 = -40 % ((19 - arg2) / 36);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZII)V", line = 985)
    public final void method2070(boolean arg0, int arg1, int arg2) {
        field4729++;
        if (arg0) {
            int var4 = arg2 - this.field4721;
            int var5 = arg1 - this.field4717;
            this.field4732[var5][var4] = class270.method1860(this.field4732[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 999)
    public static void method2071(int arg0) {
        if (arg0 < 45) {
            method2072(-81, (byte[]) null, true);
        }
        field4728 = null;
        field4723 = (byte[][]) null;
        field4724 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 1014)
    public static final Object method2072(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 != -7948) {
            field4724 = (short[]) null;
        }
        field4727++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class202.field3036) {
            try {
                class139 var3 = (class139) Class.forName("kg").getDeclaredConstructor().newInstance();
                var3.method1006(14, arg1);
                return var3;
            } catch (Throwable var5) {
                class202.field3036 = true;
            }
        }
        return arg2 ? class29.method248(arg1, true) : arg1;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(II)V", line = 1049)
    public class303(int arg0, int arg1) {
        this.field4722 = arg1;
        this.field4717 = 0;
        this.field4718 = arg0;
        this.field4732 = new int[this.field4718][this.field4722];
        this.field4721 = 0;
        this.method2068((byte) -50);
    }
}
