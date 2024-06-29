import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class468 {

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Lkr;")
    public static class645 field6960;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public int field6938;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public int field6943;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field6947;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public int field6949;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "[[I")
    public int[][] field6941;

    static {
        new class474("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field6960 = new class645(5000);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V", line = 3)
    public final void method2858(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field6949;
        int var5 = arg0 - this.field6943;
        field6957++;
        if (arg2 != -9207) {
            this.field6949 = 15;
        }
        this.field6941[var4][var5] = class283.method1834(this.field6941[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIBII)Z", line = 24)
    public final boolean method2859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field6958++;
        int var11 = arg0 + arg1;
        int var12 = arg6 + arg9;
        int var13 = arg5 + arg2;
        int var14 = arg4 + arg8;
        if (arg0 == var13 && (arg3 & 0x2) == 0) {
            int var15 = arg6 <= arg4 ? arg4 : arg6;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field6941[var13 - this.field6949 - 1][var15 - this.field6943] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg4 >= arg6 ? arg4 : arg6;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field6941[arg5 - this.field6949][var17 - this.field6943] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg5 < arg0 ? arg0 : arg5;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field6941[var19 - this.field6949][var14 - this.field6943 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg0 <= arg5 ? arg5 : arg0;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field6941[var21 - this.field6949][arg4 - this.field6943] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return arg7 != -70;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBIIIIII)Z", line = 118)
    public final boolean method2860(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6944++;
        if (arg8 > 1) {
            return class170.method980(arg5, 10, arg8, arg1, arg0, arg4, arg6, arg3, arg8) ? true : this.method2859(arg6, arg8, arg3, arg7, arg4, arg5, arg1, (byte) -70, arg0, arg8);
        }
        int var10 = 73 % ((arg2 + 16) / 44);
        int var11 = arg3 + arg5 - 1;
        int var12 = arg0 + arg4 - 1;
        if (arg5 <= arg6 && arg6 <= var11 && arg4 <= arg1 && arg1 <= var12) {
            return true;
        } else if (arg5 - 1 == arg6 && arg1 >= arg4 && var12 >= arg1 && (this.field6941[arg6 - this.field6949][arg1 - this.field6943] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg6 && arg1 >= arg4 && var12 >= arg1 && (this.field6941[arg6 - this.field6949][arg1 - this.field6943] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg1 && arg6 >= arg5 && var11 >= arg6 && (this.field6941[arg6 - this.field6949][arg1 - this.field6943] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var12 + 1 == arg1 && arg6 >= arg5 && arg6 <= var11 && (this.field6941[arg6 - this.field6949][arg1 - this.field6943] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BZIZIII)V", line = 166)
    public final void method2861(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field6949;
        field6948++;
        int var9 = arg4 - this.field6943;
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method2865((byte) 117, 128, var9, var8);
                this.method2865((byte) 127, 8, var9, var8 - 1);
            }
            if (arg5 == 1) {
                this.method2865((byte) 121, 2, var9, var8);
                this.method2865((byte) 126, 32, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method2865((byte) 123, 8, var9, var8);
                this.method2865((byte) 126, 128, var9, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2865((byte) 122, 32, var9, var8);
                this.method2865((byte) 122, 2, var9 - 1, var8);
            }
        }
        int var10 = 42 % ((-arg0 - 16) / 43);
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method2865((byte) 118, 1, var9, var8);
                this.method2865((byte) 123, 16, var9 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method2865((byte) 122, 4, var9, var8);
                this.method2865((byte) 123, 64, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2865((byte) 118, 16, var9, var8);
                this.method2865((byte) 125, 1, var9 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2865((byte) 127, 64, var9, var8);
                this.method2865((byte) 126, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                this.method2865((byte) 119, 130, var9, var8);
                this.method2865((byte) 117, 8, var9, var8 - 1);
                this.method2865((byte) 124, 32, var9 + 1, var8);
            }
            if (arg5 == 1) {
                this.method2865((byte) 118, 10, var9, var8);
                this.method2865((byte) 121, 32, var9 + 1, var8);
                this.method2865((byte) 127, 128, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2865((byte) 119, 40, var9, var8);
                this.method2865((byte) 118, 128, var9, var8 + 1);
                this.method2865((byte) 127, 2, var9 - 1, var8);
            }
            if (arg5 == 3) {
                this.method2865((byte) 122, 160, var9, var8);
                this.method2865((byte) 118, 2, var9 - 1, var8);
                this.method2865((byte) 122, 8, var9, var8 - 1);
            }
        }
        if (arg1) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    this.method2865((byte) 118, 65536, var9, var8);
                    this.method2865((byte) 118, 4096, var9, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method2865((byte) 118, 1024, var9, var8);
                    this.method2865((byte) 126, 16384, var9 + 1, var8);
                }
                if (arg5 == 2) {
                    this.method2865((byte) 124, 4096, var9, var8);
                    this.method2865((byte) 121, 65536, var9, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method2865((byte) 126, 16384, var9, var8);
                    this.method2865((byte) 124, 1024, var9 - 1, var8);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg5 == 0) {
                    this.method2865((byte) 117, 512, var9, var8);
                    this.method2865((byte) 117, 8192, var9 + 1, var8 + -1);
                }
                if (arg5 == 1) {
                    this.method2865((byte) 123, 2048, var9, var8);
                    this.method2865((byte) 125, 32768, var9 + 1, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2865((byte) 119, 8192, var9, var8);
                    this.method2865((byte) 120, 512, var9 - 1, var8 - -1);
                }
                if (arg5 == 3) {
                    this.method2865((byte) 122, 32768, var9, var8);
                    this.method2865((byte) 126, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    this.method2865((byte) 120, 66560, var9, var8);
                    this.method2865((byte) 120, 4096, var9, var8 - 1);
                    this.method2865((byte) 124, 16384, var9 + 1, var8);
                }
                if (arg5 == 1) {
                    this.method2865((byte) 118, 5120, var9, var8);
                    this.method2865((byte) 125, 16384, var9 + 1, var8);
                    this.method2865((byte) 124, 65536, var9, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2865((byte) 126, 20480, var9, var8);
                    this.method2865((byte) 117, 65536, var9, var8 + 1);
                    this.method2865((byte) 121, 1024, var9 - 1, var8);
                }
                if (arg5 == 3) {
                    this.method2865((byte) 120, 81920, var9, var8);
                    this.method2865((byte) 124, 1024, var9 - 1, var8);
                    this.method2865((byte) 123, 4096, var9, var8 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method2865((byte) 123, 536870912, var9, var8);
                this.method2865((byte) 124, 33554432, var9, var8 - 1);
            }
            if (arg5 == 1) {
                this.method2865((byte) 117, 8388608, var9, var8);
                this.method2865((byte) 123, 134217728, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method2865((byte) 117, 33554432, var9, var8);
                this.method2865((byte) 117, 536870912, var9, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2865((byte) 117, 134217728, var9, var8);
                this.method2865((byte) 121, 8388608, var9 - 1, var8);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method2865((byte) 121, 4194304, var9, var8);
                this.method2865((byte) 126, 67108864, var9 + 1, var8 - 1);
            }
            if (arg5 == 1) {
                this.method2865((byte) 121, 16777216, var9, var8);
                this.method2865((byte) 119, 268435456, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2865((byte) 121, 67108864, var9, var8);
                this.method2865((byte) 125, 4194304, var9 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2865((byte) 120, 268435456, var9, var8);
                this.method2865((byte) 122, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2865((byte) 120, 545259520, var9, var8);
            this.method2865((byte) 126, 33554432, var9, var8 - 1);
            this.method2865((byte) 121, 134217728, var9 + 1, var8);
        }
        if (arg5 == 1) {
            this.method2865((byte) 127, 41943040, var9, var8);
            this.method2865((byte) 120, 134217728, var9 + 1, var8);
            this.method2865((byte) 126, 536870912, var9, var8 + 1);
        }
        if (arg5 == 2) {
            this.method2865((byte) 117, 167772160, var9, var8);
            this.method2865((byte) 125, 536870912, var9, var8 + 1);
            this.method2865((byte) 125, 8388608, var9 - 1, var8);
        }
        if (arg5 == 3) {
            this.method2865((byte) 124, 671088640, var9, var8);
            this.method2865((byte) 118, 8388608, var9 - 1, var8);
            this.method2865((byte) 121, 33554432, var9, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIZIZB)V", line = 476)
    public final void method2862(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, byte arg6) {
        field6942++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field6949;
        if (arg5) {
            var8 |= 0x40000000;
        }
        int var10 = arg0 - this.field6943;
        int var11 = var9;
        if (arg6 != 58) {
            this.method2870(false);
        }
        while (var11 < (var9 + arg2)) {
            if (var11 >= 0 && var11 < this.field6947) {
                for (int var12 = var10; var12 < arg1 + var10; var12++) {
                    if (var12 >= 0 && var12 < this.field6938) {
                        this.method2865((byte) 120, var8, var12, var11);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZIZIIZ)V", line = 527)
    public final void method2863(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field6946++;
        int var9 = 256;
        if (!arg2) {
            return;
        }
        if (arg7) {
            var9 |= 0x20000;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg3;
            arg3 = arg0;
            arg0 = var10;
        }
        int var11 = arg6 - this.field6949;
        int var12 = arg5 - this.field6943;
        if (arg4) {
            var9 |= 0x40000000;
        }
        for (int var13 = var11; var13 < (arg3 + var11); var13++) {
            if (var13 >= 0 && this.field6947 > var13) {
                for (int var14 = var12; var14 < (arg0 + var12); var14++) {
                    if (var14 >= 0 && this.field6938 > var14) {
                        this.method2866(0, var14, var13, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZIBIIZ)V", line = 582)
    public final void method2864(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field6943;
        int var9 = arg0 - this.field6949;
        if (arg3 < 67) {
            this.method2864(92, true, 66, (byte) 15, 83, 10, true);
        }
        field6953++;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method2866(0, var8, var9, 128);
                this.method2866(0, var8, var9 - 1, 8);
            }
            if (arg4 == 1) {
                this.method2866(0, var8, var9, 2);
                this.method2866(0, var8 + 1, var9, 32);
            }
            if (arg4 == 2) {
                this.method2866(0, var8, var9, 8);
                this.method2866(0, var8, var9 + 1, 128);
            }
            if (arg4 == 3) {
                this.method2866(0, var8, var9, 32);
                this.method2866(0, var8 - 1, var9, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method2866(0, var8, var9, 1);
                this.method2866(0, var8 + 1, var9 + -1, 16);
            }
            if (arg4 == 1) {
                this.method2866(0, var8, var9, 4);
                this.method2866(0, var8 + 1, var9 - -1, 64);
            }
            if (arg4 == 2) {
                this.method2866(0, var8, var9, 16);
                this.method2866(0, var8 - 1, var9 + 1, 1);
            }
            if (arg4 == 3) {
                this.method2866(0, var8, var9, 64);
                this.method2866(0, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method2866(0, var8, var9, 130);
                this.method2866(0, var8, var9 - 1, 8);
                this.method2866(0, var8 + 1, var9, 32);
            }
            if (arg4 == 1) {
                this.method2866(0, var8, var9, 10);
                this.method2866(0, var8 + 1, var9, 32);
                this.method2866(0, var8, var9 + 1, 128);
            }
            if (arg4 == 2) {
                this.method2866(0, var8, var9, 40);
                this.method2866(0, var8, var9 + 1, 128);
                this.method2866(0, var8 - 1, var9, 2);
            }
            if (arg4 == 3) {
                this.method2866(0, var8, var9, 160);
                this.method2866(0, var8 - 1, var9, 2);
                this.method2866(0, var8, var9 - 1, 8);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg4 == 0) {
                    this.method2866(0, var8, var9, 65536);
                    this.method2866(0, var8, var9 - 1, 4096);
                }
                if (arg4 == 1) {
                    this.method2866(0, var8, var9, 1024);
                    this.method2866(0, var8 + 1, var9, 16384);
                }
                if (arg4 == 2) {
                    this.method2866(0, var8, var9, 4096);
                    this.method2866(0, var8, var9 + 1, 65536);
                }
                if (arg4 == 3) {
                    this.method2866(0, var8, var9, 16384);
                    this.method2866(0, var8 - 1, var9, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg4 == 0) {
                    this.method2866(0, var8, var9, 512);
                    this.method2866(0, var8 + 1, var9 + -1, 8192);
                }
                if (arg4 == 1) {
                    this.method2866(0, var8, var9, 2048);
                    this.method2866(0, var8 + 1, var9 + 1, 32768);
                }
                if (arg4 == 2) {
                    this.method2866(0, var8, var9, 8192);
                    this.method2866(0, var8 - 1, var9 + 1, 512);
                }
                if (arg4 == 3) {
                    this.method2866(0, var8, var9, 32768);
                    this.method2866(0, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    this.method2866(0, var8, var9, 66560);
                    this.method2866(0, var8, var9 - 1, 4096);
                    this.method2866(0, var8 + 1, var9, 16384);
                }
                if (arg4 == 1) {
                    this.method2866(0, var8, var9, 5120);
                    this.method2866(0, var8 + 1, var9, 16384);
                    this.method2866(0, var8, var9 + 1, 65536);
                }
                if (arg4 == 2) {
                    this.method2866(0, var8, var9, 20480);
                    this.method2866(0, var8, var9 + 1, 65536);
                    this.method2866(0, var8 - 1, var9, 1024);
                }
                if (arg4 == 3) {
                    this.method2866(0, var8, var9, 81920);
                    this.method2866(0, var8 - 1, var9, 1024);
                    this.method2866(0, var8, var9 - 1, 4096);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method2866(0, var8, var9, 536870912);
                this.method2866(0, var8, var9 - 1, 33554432);
            }
            if (arg4 == 1) {
                this.method2866(0, var8, var9, 8388608);
                this.method2866(0, var8 + 1, var9, 134217728);
            }
            if (arg4 == 2) {
                this.method2866(0, var8, var9, 33554432);
                this.method2866(0, var8, var9 + 1, 536870912);
            }
            if (arg4 == 3) {
                this.method2866(0, var8, var9, 134217728);
                this.method2866(0, var8 - 1, var9, 8388608);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method2866(0, var8, var9, 4194304);
                this.method2866(0, var8 + 1, var9 + -1, 67108864);
            }
            if (arg4 == 1) {
                this.method2866(0, var8, var9, 16777216);
                this.method2866(0, var8 + 1, var9 + 1, 268435456);
            }
            if (arg4 == 2) {
                this.method2866(0, var8, var9, 67108864);
                this.method2866(0, var8 - 1, var9 + 1, 4194304);
            }
            if (arg4 == 3) {
                this.method2866(0, var8, var9, 268435456);
                this.method2866(0, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method2866(0, var8, var9, 545259520);
            this.method2866(0, var8, var9 - 1, 33554432);
            this.method2866(0, var8 + 1, var9, 134217728);
        }
        if (arg4 == 1) {
            this.method2866(0, var8, var9, 41943040);
            this.method2866(0, var8 + 1, var9, 134217728);
            this.method2866(0, var8, var9 + 1, 536870912);
        }
        if (arg4 == 2) {
            this.method2866(0, var8, var9, 167772160);
            this.method2866(0, var8, var9 + 1, 536870912);
            this.method2866(0, var8 - 1, var9, 8388608);
        }
        if (arg4 == 3) {
            this.method2866(0, var8, var9, 671088640);
            this.method2866(0, var8 - 1, var9, 8388608);
            this.method2866(0, var8, var9 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BIII)V", line = 890)
    private final void method2865(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 116) {
            field6945++;
            this.field6941[arg3][arg2] = class283.method1834(this.field6941[arg3][arg2], arg1);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII)V", line = 901)
    private final void method2866(int arg0, int arg1, int arg2, int arg3) {
        this.field6941[arg2][arg1] = class643.method3659(this.field6941[arg2][arg1], ~arg3);
        field6939++;
        if (arg0 != 0) {
            method2868(true);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)V", line = 914)
    public final void method2867(int arg0, int arg1, int arg2) {
        field6940++;
        int var4 = 44 % ((-arg1 - 7) / 55);
        int var5 = arg0 - this.field6949;
        int var6 = arg2 - this.field6943;
        this.field6941[var5][var6] = class643.method3659(this.field6941[var5][var6], -2097153);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 927)
    public static void method2868(boolean arg0) {
        if (!arg0) {
            method2868(false);
        }
        field6960 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 946)
    public static final String method2869(String arg0, byte arg1) {
        field6959++;
        StringBuffer var2 = new StringBuffer();
        int var3 = 51 / ((arg1 + 12) / 46);
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 == '%' && var4 > var5 + 2) {
                char var7 = arg0.charAt(var5 + 1);
                boolean var8 = false;
                int var9;
                if (var7 >= '0' && var7 <= '9') {
                    var9 = var7 - '0';
                } else if (var7 >= 'a' && var7 <= 'f') {
                    var9 = var7 + '\n' - 97;
                } else {
                    if (var7 < 'A' || var7 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var9 = var7 - 55;
                }
                char var10 = arg0.charAt(var5 + 2);
                int var11 = var9 * 16;
                int var12;
                if (var10 >= '0' && var10 <= '9') {
                    var12 = var10 + var11 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var12 = var10 + var11 - 87;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var12 = var10 + var11 + 10 - 65;
                }
                var5 += 2;
                if (var12 != 0 && class351.method2231((byte) var12, 119)) {
                    var2.append(class247.method1635(16, (byte) var12));
                }
            } else if (var6 == '+') {
                var2.append(' ');
            } else {
                var2.append(var6);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V", line = 1023)
    public final void method2870(boolean arg0) {
        for (int var2 = 0; var2 < this.field6947; var2++) {
            for (int var3 = 0; var3 < this.field6938; var3++) {
                if (var2 == 0 || var3 == 0 || this.field6947 - 5 <= var2 || var3 >= this.field6938 - 5) {
                    this.field6941[var2][var3] = -1;
                } else {
                    this.field6941[var2][var3] = 2097152;
                }
            }
        }
        field6955++;
        if (!arg0) {
            field6960 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(III)V", line = 1056)
    public final void method2871(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field6943;
        field6951++;
        int var5 = arg1 - this.field6949;
        this.field6941[var5][var4] = class283.method1834(this.field6941[var5][var4], 262144);
        if (arg0 != -1) {
            this.field6943 = -53;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBIIIIII)Z", line = 1071)
    public final boolean method2872(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -23) {
            this.method2859(-73, 16, 37, -24, 95, -2, -121, (byte) 117, 58, 49);
        }
        field6950++;
        if (arg5 == 1) {
            if (arg0 == arg3 && arg2 == arg6) {
                return true;
            }
        } else if (arg3 <= arg0 && arg0 <= arg3 + arg5 - 1 && arg6 >= arg6 && (arg5 + arg6 - 1) >= arg6) {
            return true;
        }
        int var9 = arg3 - this.field6949;
        int var10 = arg2 - this.field6943;
        int var11 = arg0 - this.field6949;
        int var12 = arg6 - this.field6943;
        if (arg5 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field6941[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field6941[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field6941[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field6941[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field6941[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field6941[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field6941[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field6941[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field6941[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field6941[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field6941[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field6941[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var9 - 1;
            int var14 = arg5 + var10 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var9 && var12 >= var10 && var14 >= var12 && (this.field6941[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg5) == var10 && (this.field6941[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - arg5 == var9 && var10 <= var12 && var12 <= var14 && (this.field6941[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg5) == var10 && (this.field6941[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg5) == var9 && var12 >= var10 && var14 >= var12 && (this.field6941[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10 && (this.field6941[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 + 1 == var9 && var10 <= var12 && var12 <= var14 && (this.field6941[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 + 1) == var10 && (this.field6941[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 >= var9 && var13 >= var11 && var12 + 1 == var10 && (this.field6941[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var11 && var11 <= var13 && var12 - arg5 == var10 && (this.field6941[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg5 == var9 && var10 <= var12 && var14 >= var12 && (this.field6941[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14 && (this.field6941[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIII)Z", line = 1260)
    public final boolean method2873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 <= 46) {
            this.method2874(-16, -12, -14);
        }
        field6954++;
        if (arg7 == 1) {
            if (arg3 == arg6 && arg4 == arg5) {
                return true;
            }
        } else if (arg3 >= arg6 && arg3 <= (arg6 + arg7 - 1) && arg4 <= arg4 && arg7 + arg4 - 1 >= arg4) {
            return true;
        }
        int var9 = arg3 - this.field6949;
        int var10 = arg4 - this.field6943;
        int var11 = arg6 - this.field6949;
        int var12 = arg5 - this.field6943;
        if (arg7 == 1) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field6941[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field6941[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field6941[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field6941[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field6941[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field6941[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field6941[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field6941[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field6941[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field6941[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field6941[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg7 - 1;
            int var14 = var12 + arg7 - 1;
            if (arg0 == 0) {
                if (arg2 == 0) {
                    if ((var9 - arg7) == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field6941[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 - arg7) == var12 && (this.field6941[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 - arg7 == var11 && var10 >= var12 && var14 >= var10 && (this.field6941[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var14 >= var10 && (this.field6941[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 + 1) == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12 && (this.field6941[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 - arg7) == var12 && (this.field6941[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 <= var9 && var9 <= var13 && (var10 - arg7) == var12) {
                        return true;
                    }
                    if (var9 - arg7 == var11 && var10 >= var12 && var10 <= var14 && (this.field6941[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field6941[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    if (var9 - arg7 == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field6941[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg7 == var12 && (this.field6941[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - arg7 == var11 && var10 >= var12 && var14 >= var10 && (this.field6941[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 - arg7 == var12 && (this.field6941[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - arg7) == var11 && var10 >= var12 && var14 >= var10 && (this.field6941[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var10 + 1) == var12 && (this.field6941[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 - arg7) == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 - arg7 == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var10 + 1) == var12 && (this.field6941[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var14 >= var10 && (this.field6941[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 - arg7) == var12) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 >= var11 && var13 >= var9 && (var10 + 1) == var12 && (this.field6941[var9][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var9 <= var13 && (var10 - arg7) == var12 && (this.field6941[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var9 - arg7) == var11 && var12 <= var10 && var14 >= var10 && (this.field6941[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field6941[var11][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(III)V", line = 1636)
    public final void method2874(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field6943;
        field6952++;
        if (arg2 <= -48) {
            int var5 = arg1 - this.field6949;
            this.field6941[var5][var4] = class643.method3659(this.field6941[var5][var4], -262145);
        }
    }
}
