import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class340 {

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "[I")
    public static int[] field4166 = new int[4096];

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "Z")
    public static boolean field4172;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "[Z")
    public static boolean[] field4174;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "[I")
    public static int[] field4175;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "Ljava/awt/Frame;")
    public static Frame field4176;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "[[I")
    public int[][] field4160;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZIIZII)V")
    public final void method1958(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field4163++;
        int var8 = arg2 - this.field4157;
        int var9 = arg3 - this.field4158;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method1975(128, (byte) 84, var9, var8);
                this.method1975(8, (byte) 101, var9 - 1, var8);
            }
            if (arg0 == 1) {
                this.method1975(2, (byte) 86, var9, var8);
                this.method1975(32, (byte) 114, var9, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1975(8, (byte) 84, var9, var8);
                this.method1975(128, (byte) 106, var9 + 1, var8);
            }
            if (arg0 == 3) {
                this.method1975(32, (byte) 93, var9, var8);
                this.method1975(2, (byte) 95, var9, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method1975(1, (byte) 123, var9, var8);
                this.method1975(16, (byte) 84, var9 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1975(4, (byte) 96, var9, var8);
                this.method1975(64, (byte) 92, var9 + 1, var8 - -1);
            }
            if (arg0 == 2) {
                this.method1975(16, (byte) 118, var9, var8);
                this.method1975(1, (byte) 97, var9 + 1, var8 + -1);
            }
            if (arg0 == 3) {
                this.method1975(64, (byte) 106, var9, var8);
                this.method1975(4, (byte) 92, var9 - 1, var8 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method1975(130, (byte) 105, var9, var8);
                this.method1975(8, (byte) 87, var9 - 1, var8);
                this.method1975(32, (byte) 124, var9, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1975(10, (byte) 112, var9, var8);
                this.method1975(32, (byte) 83, var9, var8 + 1);
                this.method1975(128, (byte) 83, var9 + 1, var8);
            }
            if (arg0 == 2) {
                this.method1975(40, (byte) 120, var9, var8);
                this.method1975(128, (byte) 120, var9 + 1, var8);
                this.method1975(2, (byte) 96, var9, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1975(160, (byte) 120, var9, var8);
                this.method1975(2, (byte) 112, var9, var8 - 1);
                this.method1975(8, (byte) 106, var9 - 1, var8);
            }
        }
        if (arg4) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method1975(65536, (byte) 85, var9, var8);
                    this.method1975(4096, (byte) 124, var9 - 1, var8);
                }
                if (arg0 == 1) {
                    this.method1975(1024, (byte) 94, var9, var8);
                    this.method1975(16384, (byte) 91, var9, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1975(4096, (byte) 99, var9, var8);
                    this.method1975(65536, (byte) 102, var9 + 1, var8);
                }
                if (arg0 == 3) {
                    this.method1975(16384, (byte) 117, var9, var8);
                    this.method1975(1024, (byte) 113, var9, var8 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method1975(512, (byte) 116, var9, var8);
                    this.method1975(8192, (byte) 112, var9 - 1, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1975(2048, (byte) 85, var9, var8);
                    this.method1975(32768, (byte) 116, var9 + 1, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1975(8192, (byte) 88, var9, var8);
                    this.method1975(512, (byte) 102, var9 + 1, var8 + -1);
                }
                if (arg0 == 3) {
                    this.method1975(32768, (byte) 104, var9, var8);
                    this.method1975(2048, (byte) 87, var9 - 1, var8 + -1);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method1975(66560, (byte) 125, var9, var8);
                    this.method1975(4096, (byte) 125, var9 - 1, var8);
                    this.method1975(16384, (byte) 122, var9, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1975(5120, (byte) 95, var9, var8);
                    this.method1975(16384, (byte) 125, var9, var8 + 1);
                    this.method1975(65536, (byte) 97, var9 + 1, var8);
                }
                if (arg0 == 2) {
                    this.method1975(20480, (byte) 118, var9, var8);
                    this.method1975(65536, (byte) 90, var9 + 1, var8);
                    this.method1975(1024, (byte) 119, var9, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method1975(81920, (byte) 84, var9, var8);
                    this.method1975(1024, (byte) 107, var9, var8 - 1);
                    this.method1975(4096, (byte) 87, var9 - 1, var8);
                }
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method1975(536870912, (byte) 87, var9, var8);
                    this.method1975(33554432, (byte) 118, var9 - 1, var8);
                }
                if (arg0 == 1) {
                    this.method1975(8388608, (byte) 114, var9, var8);
                    this.method1975(134217728, (byte) 99, var9, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1975(33554432, (byte) 90, var9, var8);
                    this.method1975(536870912, (byte) 93, var9 + 1, var8);
                }
                if (arg0 == 3) {
                    this.method1975(134217728, (byte) 110, var9, var8);
                    this.method1975(8388608, (byte) 93, var9, var8 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method1975(4194304, (byte) 91, var9, var8);
                    this.method1975(67108864, (byte) 100, var9 - 1, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1975(16777216, (byte) 104, var9, var8);
                    this.method1975(268435456, (byte) 116, var9 + 1, var8 - -1);
                }
                if (arg0 == 2) {
                    this.method1975(67108864, (byte) 119, var9, var8);
                    this.method1975(4194304, (byte) 94, var9 + 1, var8 + -1);
                }
                if (arg0 == 3) {
                    this.method1975(268435456, (byte) 123, var9, var8);
                    this.method1975(16777216, (byte) 105, var9 - 1, var8 + -1);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method1975(545259520, (byte) 116, var9, var8);
                    this.method1975(33554432, (byte) 120, var9 - 1, var8);
                    this.method1975(134217728, (byte) 126, var9, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1975(41943040, (byte) 124, var9, var8);
                    this.method1975(134217728, (byte) 101, var9, var8 + 1);
                    this.method1975(536870912, (byte) 110, var9 + 1, var8);
                }
                if (arg0 == 2) {
                    this.method1975(167772160, (byte) 119, var9, var8);
                    this.method1975(536870912, (byte) 101, var9 + 1, var8);
                    this.method1975(8388608, (byte) 83, var9, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method1975(671088640, (byte) 82, var9, var8);
                    this.method1975(8388608, (byte) 120, var9, var8 - 1);
                    this.method1975(33554432, (byte) 108, var9 - 1, var8);
                }
            }
        }
        if (arg6 != 128) {
            field4175 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
    public final void method1959(int arg0, int arg1, int arg2) {
        if (arg0 != -4) {
            this.method1964(-16, 105, true, 90, (byte) 5, true, 21, 98);
        }
        int var4 = arg2 - this.field4158;
        field4148++;
        int var5 = arg1 - this.field4157;
        this.field4160[var4][var5] = class249.method1625(this.field4160[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(III)V")
    public final void method1960(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            field4168++;
            int var4 = arg0 - this.field4158;
            int var5 = arg1 - this.field4157;
            this.field4160[var4][var5] = class77.method473(this.field4160[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
    public final void method1961(byte arg0) {
        field4162++;
        for (int var2 = 0; var2 < this.field4155; var2++) {
            for (int var3 = 0; var3 < this.field4167; var3++) {
                if (var2 == 0 || var3 == 0 || this.field4155 - 5 <= var2 || (this.field4167 - 5) <= var3) {
                    this.field4160[var2][var3] = -1;
                } else {
                    this.field4160[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != -36) {
            this.method1970(true, 6, -47, false, -53, -47, -72);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZZIZI)V")
    public final void method1962(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (!arg2) {
            return;
        }
        field4153++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        int var9 = arg1 - this.field4157;
        int var10 = arg4 - this.field4158;
        if (arg5) {
            var8 |= 0x40000000;
        }
        for (int var11 = var10; var11 < (var10 + arg0); var11++) {
            if (var11 >= 0 && var11 < this.field4155) {
                for (int var12 = var9; var12 < var9 + arg6; var12++) {
                    if (var12 >= 0 && var12 < this.field4167) {
                        this.method1965(var12, var8, var11, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4170++;
        if (arg6 == 1) {
            if (arg4 == arg7 && arg1 == arg2) {
                return true;
            }
        } else if (arg7 <= arg4 && (arg6 + arg7 - 1) >= arg4 && arg1 <= arg1 && arg1 <= arg1 + arg6 - 1) {
            return true;
        }
        int var9 = arg4 - this.field4158;
        int var10 = arg1 - this.field4157;
        int var11 = arg2 - this.field4157;
        if (arg0 != -12959) {
            field4174 = null;
        }
        int var12 = arg7 - this.field4158;
        if (arg6 == 1) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field4160[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4160[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field4160[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4160[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field4160[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4160[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field4160[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field4160[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field4160[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field4160[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 == var11 && (this.field4160[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg6 - 1;
            int var14 = arg6 + var11 - 1;
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if (var9 - arg6 == var12 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11 && (this.field4160[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 - arg6 == var11 && (this.field4160[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 - arg6 == var12 && var11 <= var10 && var14 >= var10 && (this.field4160[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var14 >= var10 && (this.field4160[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var10 + 1) == var11 && (this.field4160[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var10 - arg6 == var11 && (this.field4160[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 <= var9 && var13 >= var9 && var10 - arg6 == var11) {
                        return true;
                    }
                    if (var9 - arg6 == var12 && var10 >= var11 && var10 <= var14 && (this.field4160[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 <= var10 && var14 >= var10 && (this.field4160[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if (var9 - arg6 == var12 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 <= var10 && var10 <= var14 && (this.field4160[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 - arg6) == var11 && (this.field4160[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - arg6 == var12 && var10 >= var11 && var10 <= var14 && (this.field4160[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 - arg6) == var11 && (this.field4160[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - arg6) == var12 && var11 <= var10 && var14 >= var10 && (this.field4160[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 + 1) == var11 && (this.field4160[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 - arg6) == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - arg6 == var12 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11 && (this.field4160[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14 && (this.field4160[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var10 - arg6) == var11) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var12 <= var9 && var13 >= var9 && (var10 + 1) == var11 && (this.field4160[var9][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 <= var9 && var9 <= var13 && var10 - arg6 == var11 && (this.field4160[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg6 == var12 && var10 >= var11 && var14 >= var10 && (this.field4160[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var11 <= var10 && var10 <= var14 && (this.field4160[var12][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZIBZII)V")
    public final void method1964(int arg0, int arg1, boolean arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7) {
        field4165++;
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg7;
            arg7 = arg0;
            arg0 = var10;
        }
        if (arg4 != -44) {
            return;
        }
        int var11 = arg6 - this.field4158;
        int var12 = arg1 - this.field4157;
        for (int var13 = var11; var13 < (var11 + arg7); var13++) {
            if (var13 >= 0 && var13 < this.field4155) {
                for (int var14 = var12; var14 < arg0 + var12; var14++) {
                    if (var14 >= 0 && var14 < this.field4167) {
                        this.method1975(var9, (byte) 102, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)V")
    private final void method1965(int arg0, int arg1, int arg2, int arg3) {
        field4164++;
        this.field4160[arg2][arg0] = class77.method473(this.field4160[arg2][arg0], arg1);
        if (arg3 != -1) {
            this.method1963(-36, 15, 127, 6, 107, -7, 53, 6);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1966(int arg0, char arg1, String arg2) {
        field4156++;
        int var3 = class225.method1451(arg1, arg0 - 1, arg2);
        String[] var4 = new String[arg0 + var3];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZIIIIII)Z")
    public final boolean method1967(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg1) {
            this.method1958(114, false, -94, 88, false, 78, 103);
        }
        field4169++;
        if (arg2 == 1) {
            if (arg6 == arg7 && arg0 == arg3) {
                return true;
            }
        } else if (arg7 >= arg6 && arg7 <= (arg2 + arg6 - 1) && arg0 >= arg0 && arg0 <= arg0 + arg2 - 1) {
            return true;
        }
        int var9 = arg3 - this.field4157;
        int var10 = arg6 - this.field4158;
        int var11 = arg0 - this.field4157;
        int var12 = arg7 - this.field4158;
        if (arg2 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field4160[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field4160[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field4160[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field4160[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field4160[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field4160[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 + 1 == var10 && var9 == var11 && (this.field4160[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field4160[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field4160[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field4160[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field4160[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field4160[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var10 - 1;
            int var14 = var9 - (1 - arg2);
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var12 + 1) == var10 && var11 >= var9 && var14 >= var11 && (this.field4160[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var11 - arg2 == var9 && (this.field4160[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - arg2) == var10 && var9 <= var11 && var11 <= var14 && (this.field4160[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var11 - arg2 == var9 && (this.field4160[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 - arg2 == var10 && var9 <= var11 && var11 <= var14 && (this.field4160[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var11 + 1) == var9 && (this.field4160[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 + 1) == var10 && var11 >= var9 && var14 >= var11 && (this.field4160[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var11 + 1 == var9 && (this.field4160[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var12 >= var10 && var13 >= var12 && var11 + 1 == var9 && (this.field4160[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var10 && var12 <= var13 && (var11 - arg2) == var9 && (this.field4160[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg2 == var10 && var9 <= var11 && var11 <= var14 && (this.field4160[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 <= var11 && var11 <= var14 && (this.field4160[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIBIIII)Z")
    public final boolean method1968(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field4149++;
        if (arg5 < 68) {
            this.field4155 = -118;
        }
        int var11 = arg4 + arg0;
        int var12 = arg1 + arg9;
        int var13 = arg6 + arg7;
        int var14 = arg3 + arg8;
        if (arg4 == var13 && (arg2 & 0x2) == 0) {
            int var15 = arg3 >= arg9 ? arg3 : arg9;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field4160[var13 - this.field4158 - 1][var15 - this.field4157] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg6 == var11 && (arg2 & 0x8) == 0) {
            int var17 = arg3 < arg9 ? arg9 : arg3;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field4160[arg6 - this.field4158][var17 - this.field4157] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg9 == var14 && (arg2 & 0x1) == 0) {
            int var19 = arg6 < arg4 ? arg4 : arg6;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field4160[var19 - this.field4158][var14 - this.field4157 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg2 & 0x4) == 0) {
            int var21 = arg4 > arg6 ? arg4 : arg6;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field4160[var21 - this.field4158][arg3 - this.field4157] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static void method1969(int arg0) {
        field4176 = null;
        if (arg0 == 0) {
            field4174 = null;
            field4166 = null;
            field4175 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIIZIII)V")
    public final void method1970(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field4171++;
        int var8 = arg4 - this.field4158;
        int var9 = arg6 - this.field4157;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method1965(var9, 128, var8, -1);
                this.method1965(var9, 8, var8 - 1, arg5 ^ 0xFFFFC84A);
            }
            if (arg1 == 1) {
                this.method1965(var9, 2, var8, -1);
                this.method1965(var9 + 1, 32, var8, -1);
            }
            if (arg1 == 2) {
                this.method1965(var9, 8, var8, -1);
                this.method1965(var9, 128, var8 + 1, arg5 ^ 0xFFFFC84A);
            }
            if (arg1 == 3) {
                this.method1965(var9, 32, var8, arg5 - 14262);
                this.method1965(var9 - 1, 2, var8, -1);
            }
        }
        if (arg5 != 14261) {
            this.method1961((byte) 50);
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method1965(var9, 1, var8, -1);
                this.method1965(var9 + 1, 16, var8 - 1, -1);
            }
            if (arg1 == 1) {
                this.method1965(var9, 4, var8, -1);
                this.method1965(var9 + 1, 64, var8 + 1, -1);
            }
            if (arg1 == 2) {
                this.method1965(var9, 16, var8, -1);
                this.method1965(var9 - 1, 1, var8 + 1, -1);
            }
            if (arg1 == 3) {
                this.method1965(var9, 64, var8, -1);
                this.method1965(var9 - 1, 4, var8 - 1, arg5 ^ 0xFFFFC84A);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method1965(var9, 130, var8, -1);
                this.method1965(var9, 8, var8 - 1, -1);
                this.method1965(var9 + 1, 32, var8, -1);
            }
            if (arg1 == 1) {
                this.method1965(var9, 10, var8, -1);
                this.method1965(var9 + 1, 32, var8, -1);
                this.method1965(var9, 128, var8 + 1, -1);
            }
            if (arg1 == 2) {
                this.method1965(var9, 40, var8, -1);
                this.method1965(var9, 128, var8 + 1, -1);
                this.method1965(var9 - 1, 2, var8, -1);
            }
            if (arg1 == 3) {
                this.method1965(var9, 160, var8, -1);
                this.method1965(var9 - 1, 2, var8, -1);
                this.method1965(var9, 8, var8 - 1, -1);
            }
        }
        if (arg0) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    this.method1965(var9, 65536, var8, -1);
                    this.method1965(var9, 4096, var8 - 1, -1);
                }
                if (arg1 == 1) {
                    this.method1965(var9, 1024, var8, -1);
                    this.method1965(var9 + 1, 16384, var8, -1);
                }
                if (arg1 == 2) {
                    this.method1965(var9, 4096, var8, arg5 ^ 0xFFFFC84A);
                    this.method1965(var9, 65536, var8 + 1, -1);
                }
                if (arg1 == 3) {
                    this.method1965(var9, 16384, var8, -1);
                    this.method1965(var9 - 1, 1024, var8, -1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg1 == 0) {
                    this.method1965(var9, 512, var8, -1);
                    this.method1965(var9 + 1, 8192, var8 - 1, arg5 ^ 0xFFFFC84A);
                }
                if (arg1 == 1) {
                    this.method1965(var9, 2048, var8, -1);
                    this.method1965(var9 + 1, 32768, var8 + 1, arg5 + -14262);
                }
                if (arg1 == 2) {
                    this.method1965(var9, 8192, var8, -1);
                    this.method1965(var9 - 1, 512, var8 + 1, -1);
                }
                if (arg1 == 3) {
                    this.method1965(var9, 32768, var8, arg5 - 14262);
                    this.method1965(var9 - 1, 2048, var8 - 1, -1);
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    this.method1965(var9, 66560, var8, -1);
                    this.method1965(var9, 4096, var8 - 1, -1);
                    this.method1965(var9 + 1, 16384, var8, -1);
                }
                if (arg1 == 1) {
                    this.method1965(var9, 5120, var8, arg5 - 14262);
                    this.method1965(var9 + 1, 16384, var8, arg5 - 14262);
                    this.method1965(var9, 65536, var8 + 1, -1);
                }
                if (arg1 == 2) {
                    this.method1965(var9, 20480, var8, arg5 ^ 0xFFFFC84A);
                    this.method1965(var9, 65536, var8 + 1, -1);
                    this.method1965(var9 - 1, 1024, var8, -1);
                }
                if (arg1 == 3) {
                    this.method1965(var9, 81920, var8, -1);
                    this.method1965(var9 - 1, 1024, var8, -1);
                    this.method1965(var9, 4096, var8 - 1, -1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method1965(var9, 536870912, var8, -1);
                this.method1965(var9, 33554432, var8 - 1, -1);
            }
            if (arg1 == 1) {
                this.method1965(var9, 8388608, var8, -1);
                this.method1965(var9 + 1, 134217728, var8, -1);
            }
            if (arg1 == 2) {
                this.method1965(var9, 33554432, var8, -1);
                this.method1965(var9, 536870912, var8 + 1, -1);
            }
            if (arg1 == 3) {
                this.method1965(var9, 134217728, var8, -1);
                this.method1965(var9 - 1, 8388608, var8, arg5 - 14262);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method1965(var9, 4194304, var8, -1);
                this.method1965(var9 + 1, 67108864, var8 - 1, arg5 ^ 0xFFFFC84A);
            }
            if (arg1 == 1) {
                this.method1965(var9, 16777216, var8, -1);
                this.method1965(var9 + 1, 268435456, var8 + 1, -1);
            }
            if (arg1 == 2) {
                this.method1965(var9, 67108864, var8, arg5 ^ 0xFFFFC84A);
                this.method1965(var9 - 1, 4194304, var8 + 1, -1);
            }
            if (arg1 == 3) {
                this.method1965(var9, 268435456, var8, -1);
                this.method1965(var9 - 1, 16777216, var8 - 1, -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1965(var9, 545259520, var8, -1);
            this.method1965(var9, 33554432, var8 - 1, arg5 + -14262);
            this.method1965(var9 + 1, 134217728, var8, -1);
        }
        if (arg1 == 1) {
            this.method1965(var9, 41943040, var8, arg5 ^ 0xFFFFC84A);
            this.method1965(var9 + 1, 134217728, var8, arg5 ^ 0xFFFFC84A);
            this.method1965(var9, 536870912, var8 + 1, -1);
        }
        if (arg1 == 2) {
            this.method1965(var9, 167772160, var8, -1);
            this.method1965(var9, 536870912, var8 + 1, -1);
            this.method1965(var9 - 1, 8388608, var8, -1);
        }
        if (arg1 == 3) {
            this.method1965(var9, 671088640, var8, -1);
            this.method1965(var9 - 1, 8388608, var8, -1);
            this.method1965(var9, 33554432, var8 - 1, arg5 ^ 0xFFFFC84A);
            return;
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)Z")
    public static final boolean method1971(int arg0) {
        field4161++;
        class295 var1 = (class295) class403.field5363.method3591(arg0 + arg0);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field3746; var2++) {
            if (var1.field3742[var2] != null && var1.field3742[var2].field4144 == 0) {
                return false;
            }
            if (var1.field3741[var2] != null && var1.field3741[var2].field4144 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIBIIIIII)Z")
    public final boolean method1972(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4150++;
        if (arg7 > 1) {
            return class332.method1918(arg1, (byte) -122, arg8, arg0, arg6, arg5, arg7, arg7, arg3) ? true : this.method1968(arg7, arg7, arg4, arg6, arg3, (byte) 85, arg8, arg0, arg5, arg1);
        }
        if (arg2 != -79) {
            this.method1973((byte) 44, 45, -13);
        }
        int var10 = arg0 + arg8 - 1;
        int var11 = arg6 - (1 - arg5);
        if (arg8 <= arg3 && var10 >= arg3 && arg6 <= arg1 && arg1 <= var11) {
            return true;
        } else if ((arg8 - 1) == arg3 && arg1 >= arg6 && var11 >= arg1 && (this.field4160[arg3 - this.field4158][arg1 - this.field4157] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg3 && arg1 >= arg6 && arg1 <= var11 && (this.field4160[arg3 - this.field4158][arg1 - this.field4157] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg1 && arg8 <= arg3 && var10 >= arg3 && (this.field4160[arg3 - this.field4158][arg1 - this.field4157] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg1 && arg3 >= arg8 && var10 >= arg3 && (this.field4160[arg3 - this.field4158][arg1 - this.field4157] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)V")
    public final void method1973(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4157;
        field4154++;
        int var5 = arg2 - this.field4158;
        this.field4160[var5][var4] = class249.method1625(this.field4160[var5][var4], -262145);
        if (arg0 != -89) {
            this.method1975(-53, (byte) 7, -2, -96);
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(III)V")
    public final void method1974(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4157;
        field4151++;
        int var5 = arg1 - this.field4158;
        this.field4160[var5][var4] = class77.method473(this.field4160[var5][var4], 262144);
        if (arg2 != -15175) {
            this.method1965(64, -1, -20, 1);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBII)V")
    private final void method1975(int arg0, byte arg1, int arg2, int arg3) {
        field4152++;
        this.field4160[arg2][arg3] = class249.method1625(this.field4160[arg2][arg3], ~arg0);
        if (arg1 <= 80) {
            field4174 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4166[var0] = class511.method2824(var0, (byte) -89);
        }
        field4172 = false;
        field4174 = new boolean[8];
        field4173 = 0;
        field4175 = new int[8];
    }
}
