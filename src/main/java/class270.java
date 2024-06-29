import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class270 {

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3921 = "Loading...";

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "[Z")
    public static boolean[] field3927 = new boolean[100];

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lcr;")
    public static class189 field3909 = new class189(256);

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public static int field3932 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "[I")
    public static int[] field3902;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "[Lcq;")
    public static class67[] field3931;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "[[I")
    public int[][] field3914;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method1842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3924++;
        int var11 = arg7 + arg6;
        if (arg4 != 13406) {
            this.method1848(47, -19, 101, -62, -41, -70, -88, 4);
        }
        int var12 = arg0 + arg8;
        int var13 = arg5 + arg1;
        int var14 = arg3 + arg9;
        if (arg7 == var13 && (arg2 & 0x2) == 0) {
            int var15 = arg8 > arg3 ? arg8 : arg3;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field3914[var13 - this.field3908 - 1][var15 - this.field3915] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg2 & 0x8) == 0) {
            int var17 = arg8 > arg3 ? arg8 : arg3;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field3914[arg5 - this.field3908][var17 - this.field3915] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg8 == var14 && (arg2 & 0x1) == 0) {
            int var19 = arg7 <= arg5 ? arg5 : arg7;
            int var20 = var11 < var13 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field3914[var19 - this.field3908][var14 - this.field3915 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg2 & 0x4) == 0) {
            int var21 = arg5 >= arg7 ? arg5 : arg7;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field3914[var21 - this.field3908][arg3 - this.field3915] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIB)V")
    public final void method1843(int arg0, int arg1, byte arg2) {
        field3910++;
        int var4 = arg1 - this.field3908;
        int var5 = 85 / ((arg2 - 20) / 53);
        int var6 = arg0 - this.field3915;
        this.field3914[var4][var6] = class183.method1117(this.field3914[var4][var6], -2097153);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZII)V")
    private final void method1844(int arg0, boolean arg1, int arg2, int arg3) {
        field3913++;
        this.field3914[arg0][arg2] = class351.method2313(this.field3914[arg0][arg2], arg3);
        if (arg1) {
            method1860((byte) 50);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIBI)V")
    public static final void method1845(int arg0, int arg1, byte arg2, int arg3) {
        field3920++;
        if (arg3 == 0) {
            class35.field487++;
            class185.field2507.method5(-6445, 223);
        }
        if (arg3 == 1) {
            class377.field5494++;
            class185.field2507.method5(arg2 - 6487, 69);
        }
        class185.field2507.method1326(arg1 + class7.field138, -82);
        class185.field2507.method1346(class30.field437[82] ? 1 : 0, 32767);
        class185.field2507.method1379(-94, class200.field2660 + arg0);
        class91.field1284 = false;
        if (arg2 == 42) {
            class376.field5470 = arg0;
            class59.field792 = arg1;
            class313.method2124(0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method1846(int arg0) {
        class373.method2416(3099, class202.field2708);
        field3912++;
        class8.method66(0, class202.field2708);
        if (class229.field3061 != null) {
            class229.field3061.method951(class202.field2708, (byte) -84);
        }
        if (arg0 >= -87) {
            return;
        }
        class328.field4784.method1427(0);
        class202.field2708.setBackground(Color.black);
        class75.field1066 = -1;
        class4.method30(-28172, class202.field2708);
        class328.method2183(class202.field2708, 72);
        if (class229.field3061 != null) {
            class229.field3061.method956(class202.field2708, 44);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
    public final void method1847(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3908;
        int var5 = arg1 - this.field3915;
        field3918++;
        this.field3914[var4][var5] = class351.method2313(this.field3914[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3925++;
        if (arg1 == 1) {
            if (arg4 == arg5 && arg0 == arg3) {
                return true;
            }
        } else if (arg5 >= arg4 && arg5 <= (arg1 + arg4 - 1) && arg3 >= arg3 && arg3 <= (arg1 + arg3 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field3908;
        if (arg6 != -13282) {
            return false;
        }
        int var10 = arg4 - this.field3908;
        int var11 = arg0 - this.field3915;
        int var12 = arg3 - this.field3915;
        if (arg1 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field3914[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field3914[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field3914[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field3914[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field3914[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field3914[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field3914[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field3914[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field3914[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field3914[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field3914[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field3914[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var10 - 1;
            int var14 = var11 + arg1 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var10 && var12 >= var11 && var14 >= var12 && (this.field3914[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 - arg1) == var11 && (this.field3914[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - arg1) == var10 && var12 >= var11 && var14 >= var12 && (this.field3914[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 - arg1 == var11 && (this.field3914[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - arg1) == var10 && var12 >= var11 && var14 >= var12 && (this.field3914[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11 && (this.field3914[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 + 1 == var10 && var11 <= var12 && var12 <= var14 && (this.field3914[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11 && (this.field3914[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 >= var10 && var13 >= var9 && (var12 + 1) == var11 && (this.field3914[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var10 && var13 >= var9 && var12 - arg1 == var11 && (this.field3914[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg1 == var10 && var12 >= var11 && var12 <= var14 && (this.field3914[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var11 <= var12 && var14 >= var12 && (this.field3914[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZZIII)V")
    public final void method1849(byte arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3911++;
        int var8 = arg6 - this.field3915;
        int var9 = -16 % ((48 - arg0) / 34);
        int var10 = arg5 - this.field3908;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method1844(var10, false, var8, 128);
                this.method1844(var10 - 1, false, var8, 8);
            }
            if (arg4 == 1) {
                this.method1844(var10, false, var8, 2);
                this.method1844(var10, false, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method1844(var10, false, var8, 8);
                this.method1844(var10 + 1, false, var8, 128);
            }
            if (arg4 == 3) {
                this.method1844(var10, false, var8, 32);
                this.method1844(var10, false, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method1844(var10, false, var8, 1);
                this.method1844(var10 - 1, false, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method1844(var10, false, var8, 4);
                this.method1844(var10 + 1, false, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method1844(var10, false, var8, 16);
                this.method1844(var10 + 1, false, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method1844(var10, false, var8, 64);
                this.method1844(var10 - 1, false, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method1844(var10, false, var8, 130);
                this.method1844(var10 - 1, false, var8, 8);
                this.method1844(var10, false, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method1844(var10, false, var8, 10);
                this.method1844(var10, false, var8 + 1, 32);
                this.method1844(var10 + 1, false, var8, 128);
            }
            if (arg4 == 2) {
                this.method1844(var10, false, var8, 40);
                this.method1844(var10 + 1, false, var8, 128);
                this.method1844(var10, false, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method1844(var10, false, var8, 160);
                this.method1844(var10, false, var8 - 1, 2);
                this.method1844(var10 - 1, false, var8, 8);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg4 == 0) {
                    this.method1844(var10, false, var8, 65536);
                    this.method1844(var10 - 1, false, var8, 4096);
                }
                if (arg4 == 1) {
                    this.method1844(var10, false, var8, 1024);
                    this.method1844(var10, false, var8 + 1, 16384);
                }
                if (arg4 == 2) {
                    this.method1844(var10, false, var8, 4096);
                    this.method1844(var10 + 1, false, var8, 65536);
                }
                if (arg4 == 3) {
                    this.method1844(var10, false, var8, 16384);
                    this.method1844(var10, false, var8 - 1, 1024);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg4 == 0) {
                    this.method1844(var10, false, var8, 512);
                    this.method1844(var10 - 1, false, var8 + 1, 8192);
                }
                if (arg4 == 1) {
                    this.method1844(var10, false, var8, 2048);
                    this.method1844(var10 + 1, false, var8 + 1, 32768);
                }
                if (arg4 == 2) {
                    this.method1844(var10, false, var8, 8192);
                    this.method1844(var10 + 1, false, var8 - 1, 512);
                }
                if (arg4 == 3) {
                    this.method1844(var10, false, var8, 32768);
                    this.method1844(var10 - 1, false, var8 - 1, 2048);
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    this.method1844(var10, false, var8, 66560);
                    this.method1844(var10 - 1, false, var8, 4096);
                    this.method1844(var10, false, var8 + 1, 16384);
                }
                if (arg4 == 1) {
                    this.method1844(var10, false, var8, 5120);
                    this.method1844(var10, false, var8 + 1, 16384);
                    this.method1844(var10 + 1, false, var8, 65536);
                }
                if (arg4 == 2) {
                    this.method1844(var10, false, var8, 20480);
                    this.method1844(var10 + 1, false, var8, 65536);
                    this.method1844(var10, false, var8 - 1, 1024);
                }
                if (arg4 == 3) {
                    this.method1844(var10, false, var8, 81920);
                    this.method1844(var10, false, var8 - 1, 1024);
                    this.method1844(var10 - 1, false, var8, 4096);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method1844(var10, false, var8, 536870912);
                this.method1844(var10 - 1, false, var8, 33554432);
            }
            if (arg4 == 1) {
                this.method1844(var10, false, var8, 8388608);
                this.method1844(var10, false, var8 + 1, 134217728);
            }
            if (arg4 == 2) {
                this.method1844(var10, false, var8, 33554432);
                this.method1844(var10 + 1, false, var8, 536870912);
            }
            if (arg4 == 3) {
                this.method1844(var10, false, var8, 134217728);
                this.method1844(var10, false, var8 - 1, 8388608);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method1844(var10, false, var8, 4194304);
                this.method1844(var10 - 1, false, var8 + 1, 67108864);
            }
            if (arg4 == 1) {
                this.method1844(var10, false, var8, 16777216);
                this.method1844(var10 + 1, false, var8 + 1, 268435456);
            }
            if (arg4 == 2) {
                this.method1844(var10, false, var8, 67108864);
                this.method1844(var10 + 1, false, var8 - 1, 4194304);
            }
            if (arg4 == 3) {
                this.method1844(var10, false, var8, 268435456);
                this.method1844(var10 - 1, false, var8 - 1, 16777216);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1844(var10, false, var8, 545259520);
            this.method1844(var10 - 1, false, var8, 33554432);
            this.method1844(var10, false, var8 + 1, 134217728);
        }
        if (arg4 == 1) {
            this.method1844(var10, false, var8, 41943040);
            this.method1844(var10, false, var8 + 1, 134217728);
            this.method1844(var10 + 1, false, var8, 536870912);
        }
        if (arg4 == 2) {
            this.method1844(var10, false, var8, 167772160);
            this.method1844(var10 + 1, false, var8, 536870912);
            this.method1844(var10, false, var8 - 1, 8388608);
        }
        if (arg4 == 3) {
            this.method1844(var10, false, var8, 671088640);
            this.method1844(var10, false, var8 - 1, 8388608);
            this.method1844(var10 - 1, false, var8, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method1850(int arg0) {
        int var1 = 69 / ((arg0 + 49) / 45);
        field3922++;
        if (class30.field430 != null) {
            class368 var2 = class30.field430;
            synchronized (class30.field430) {
                class30.field430 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)V")
    public final void method1851(int arg0, int arg1, int arg2) {
        field3926++;
        if (arg0 != 4096) {
            field3909 = null;
        }
        int var4 = arg2 - this.field3908;
        int var5 = arg1 - this.field3915;
        this.field3914[var4][var5] = class183.method1117(this.field3914[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public final void method1852(int arg0) {
        field3907++;
        if (arg0 != -5) {
            return;
        }
        for (int var2 = 0; var2 < this.field3930; var2++) {
            for (int var3 = 0; var3 < this.field3903; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field3930 - 5) || var3 >= this.field3903 - 5) {
                    this.field3914[var2][var3] = -1;
                } else {
                    this.field3914[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
    public static final void method1853(int arg0, int arg1) {
        field3919++;
        if (!class395.method2537((byte) -127, arg1)) {
            return;
        }
        class394[] var2 = class365.field5292[arg1];
        int var3 = 0;
        if (arg0 != 1) {
            field3927 = null;
        }
        while (var3 < var2.length) {
            class394 var4 = var2[var3];
            if (var4 != null) {
                var4.field5703 = 1;
                var4.field5645 = 0;
                var4.field5727 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZIIIZIB)V")
    public final void method1854(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte arg7) {
        field3904++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        if (arg7 != 25) {
            return;
        }
        if (arg1) {
            var9 |= 0x40000000;
        }
        int var10 = arg0 - this.field3915;
        int var11 = arg3 - this.field3908;
        if (arg2 == 1 || arg2 == 3) {
            int var12 = arg6;
            arg6 = arg4;
            arg4 = var12;
        }
        for (int var13 = var11; var13 < (arg6 + var11); var13++) {
            if (var13 >= 0 && var13 < this.field3930) {
                for (int var14 = var10; var14 < var10 + arg4; var14++) {
                    if (var14 >= 0 && this.field3903 > var14) {
                        this.method1857(-2, var13, var14, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIZII)V")
    public final void method1855(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3905++;
        int var8 = 256;
        if (arg4) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field3915;
        if (arg0) {
            var8 |= 0x40000000;
        }
        if (arg1 != 536870912) {
            this.method1844(29, false, 66, -25);
        }
        int var10 = arg6 - this.field3908;
        for (int var11 = var10; var11 < (arg5 + var10); var11++) {
            if (var11 >= 0 && this.field3930 > var11) {
                for (int var12 = var9; var12 < (var9 + arg3); var12++) {
                    if (var12 >= 0 && this.field3903 > var12) {
                        this.method1844(var11, false, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIBIIII)Z")
    public final boolean method1856(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field3916++;
        if (arg1 > 1) {
            return class369.method2396(arg6, arg7, arg8, arg2, arg1, -10954, arg1, arg5, arg3) ? true : this.method1842(arg1, arg8, arg0, arg7, 13406, arg6, arg1, arg2, arg3, arg5);
        }
        int var10 = arg6 + arg8 - 1;
        if (arg4 != 57) {
            return true;
        }
        int var11 = arg5 + arg7 - 1;
        if (arg6 <= arg2 && var10 >= arg2 && arg7 <= arg3 && arg3 <= var11) {
            return true;
        } else if (arg6 - 1 == arg2 && arg7 <= arg3 && arg3 <= var11 && (this.field3914[arg2 - this.field3908][arg3 - this.field3915] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg2 && arg7 <= arg3 && var11 >= arg3 && (this.field3914[arg2 - this.field3908][arg3 - this.field3915] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg3 && arg2 >= arg6 && arg2 <= var10 && (this.field3914[arg2 - this.field3908][arg3 - this.field3915] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg3 && arg2 >= arg6 && var10 >= arg2 && (this.field3914[arg2 - this.field3908][arg3 - this.field3915] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    private final void method1857(int arg0, int arg1, int arg2, int arg3) {
        this.field3914[arg1][arg2] = class183.method1117(this.field3914[arg1][arg2], ~arg3);
        if (arg0 == -2) {
            field3923++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIIZI)V")
    public final void method1858(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3906++;
        int var8 = arg1 - this.field3908;
        if (arg0 != -4) {
            method1860((byte) 80);
        }
        int var9 = arg6 - this.field3915;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1857(-2, var8, var9, 128);
                this.method1857(arg0 + 2, var8 - 1, var9, 8);
            }
            if (arg4 == 1) {
                this.method1857(-2, var8, var9, 2);
                this.method1857(-2, var8, var9 + 1, 32);
            }
            if (arg4 == 2) {
                this.method1857(-2, var8, var9, 8);
                this.method1857(-2, var8 + 1, var9, 128);
            }
            if (arg4 == 3) {
                this.method1857(arg0 + 2, var8, var9, 32);
                this.method1857(-2, var8, var9 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1857(-2, var8, var9, 1);
                this.method1857(-2, var8 - 1, var9 + 1, 16);
            }
            if (arg4 == 1) {
                this.method1857(-2, var8, var9, 4);
                this.method1857(-2, var8 + 1, var9 + 1, 64);
            }
            if (arg4 == 2) {
                this.method1857(-2, var8, var9, 16);
                this.method1857(-2, var8 + 1, var9 + -1, 1);
            }
            if (arg4 == 3) {
                this.method1857(-2, var8, var9, 64);
                this.method1857(-2, var8 - 1, var9 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method1857(-2, var8, var9, 130);
                this.method1857(-2, var8 - 1, var9, 8);
                this.method1857(-2, var8, var9 + 1, 32);
            }
            if (arg4 == 1) {
                this.method1857(-2, var8, var9, 10);
                this.method1857(-2, var8, var9 + 1, 32);
                this.method1857(-2, var8 + 1, var9, 128);
            }
            if (arg4 == 2) {
                this.method1857(-2, var8, var9, 40);
                this.method1857(arg0 + 2, var8 + 1, var9, 128);
                this.method1857(-2, var8, var9 - 1, 2);
            }
            if (arg4 == 3) {
                this.method1857(-2, var8, var9, 160);
                this.method1857(-2, var8, var9 - 1, 2);
                this.method1857(arg0 ^ 0x2, var8 - 1, var9, 8);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg4 == 0) {
                    this.method1857(-2, var8, var9, 65536);
                    this.method1857(-2, var8 - 1, var9, 4096);
                }
                if (arg4 == 1) {
                    this.method1857(-2, var8, var9, 1024);
                    this.method1857(arg0 + 2, var8, var9 + 1, 16384);
                }
                if (arg4 == 2) {
                    this.method1857(-2, var8, var9, 4096);
                    this.method1857(-2, var8 + 1, var9, 65536);
                }
                if (arg4 == 3) {
                    this.method1857(-2, var8, var9, 16384);
                    this.method1857(arg0 ^ 0x2, var8, var9 - 1, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg4 == 0) {
                    this.method1857(-2, var8, var9, 512);
                    this.method1857(arg0 ^ 0x2, var8 - 1, var9 + 1, 8192);
                }
                if (arg4 == 1) {
                    this.method1857(-2, var8, var9, 2048);
                    this.method1857(-2, var8 + 1, var9 - -1, 32768);
                }
                if (arg4 == 2) {
                    this.method1857(arg0 ^ 0x2, var8, var9, 8192);
                    this.method1857(-2, var8 + 1, var9 + -1, 512);
                }
                if (arg4 == 3) {
                    this.method1857(arg0 + 2, var8, var9, 32768);
                    this.method1857(-2, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg4 == 0) {
                    this.method1857(-2, var8, var9, 66560);
                    this.method1857(arg0 ^ 0x2, var8 - 1, var9, 4096);
                    this.method1857(-2, var8, var9 + 1, 16384);
                }
                if (arg4 == 1) {
                    this.method1857(-2, var8, var9, 5120);
                    this.method1857(-2, var8, var9 + 1, 16384);
                    this.method1857(arg0 + 2, var8 - -1, var9, 65536);
                }
                if (arg4 == 2) {
                    this.method1857(arg0 ^ 0x2, var8, var9, 20480);
                    this.method1857(-2, var8 + 1, var9, 65536);
                    this.method1857(arg0 + 2, var8, var9 - 1, 1024);
                }
                if (arg4 == 3) {
                    this.method1857(-2, var8, var9, 81920);
                    this.method1857(-2, var8, var9 - 1, 1024);
                    this.method1857(-2, var8 - 1, var9, 4096);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1857(-2, var8, var9, 536870912);
                this.method1857(-2, var8 - 1, var9, 33554432);
            }
            if (arg4 == 1) {
                this.method1857(-2, var8, var9, 8388608);
                this.method1857(arg0 + 2, var8, var9 + 1, 134217728);
            }
            if (arg4 == 2) {
                this.method1857(-2, var8, var9, 33554432);
                this.method1857(arg0 ^ 0x2, var8 + 1, var9, 536870912);
            }
            if (arg4 == 3) {
                this.method1857(-2, var8, var9, 134217728);
                this.method1857(-2, var8, var9 - 1, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1857(-2, var8, var9, 4194304);
                this.method1857(arg0 + 2, var8 + -1, var9 + 1, 67108864);
            }
            if (arg4 == 1) {
                this.method1857(-2, var8, var9, 16777216);
                this.method1857(-2, var8 + 1, var9 + 1, 268435456);
            }
            if (arg4 == 2) {
                this.method1857(-2, var8, var9, 67108864);
                this.method1857(-2, var8 + 1, var9 - 1, 4194304);
            }
            if (arg4 == 3) {
                this.method1857(arg0 + 2, var8, var9, 268435456);
                this.method1857(-2, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1857(arg0 + 2, var8, var9, 545259520);
            this.method1857(-2, var8 - 1, var9, 33554432);
            this.method1857(-2, var8, var9 + 1, 134217728);
        }
        if (arg4 == 1) {
            this.method1857(-2, var8, var9, 41943040);
            this.method1857(arg0 ^ 0x2, var8, var9 + 1, 134217728);
            this.method1857(arg0 ^ 0x2, var8 + 1, var9, 536870912);
        }
        if (arg4 == 2) {
            this.method1857(-2, var8, var9, 167772160);
            this.method1857(-2, var8 + 1, var9, 536870912);
            this.method1857(arg0 + 2, var8, var9 - 1, 8388608);
        }
        if (arg4 == 3) {
            this.method1857(-2, var8, var9, 671088640);
            this.method1857(-2, var8, var9 - 1, 8388608);
            this.method1857(-2, var8 - 1, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIIIII)Z")
    public final boolean method1859(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3929++;
        if (arg4 == 1) {
            if (arg5 == arg6 && arg0 == arg7) {
                return true;
            }
        } else if (arg5 >= arg6 && arg5 <= arg4 + arg6 - 1 && arg0 <= arg0 && arg4 + arg0 - 1 >= arg0) {
            return true;
        }
        if (arg2) {
            this.field3908 = -58;
        }
        int var9 = arg5 - this.field3908;
        int var10 = arg0 - this.field3915;
        int var11 = arg6 - this.field3908;
        int var12 = arg7 - this.field3915;
        if (arg4 == 1) {
            if (arg1 == 0) {
                if (arg3 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3914[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3914[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3914[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3914[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg3 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3914[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field3914[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3914[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3914[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field3914[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field3914[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field3914[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var11 - 1;
            int var14 = var12 + arg4 - 1;
            if (arg1 == 0) {
                if (arg3 == 0) {
                    if (var9 - arg4 == var11 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12 && (this.field3914[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 - arg4 == var12 && (this.field3914[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 - arg4) == var11 && var12 <= var10 && var10 <= var14 && (this.field3914[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var10 <= var14 && (this.field3914[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 + 1 == var12 && (this.field3914[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg4 == var12 && (this.field3914[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 <= var9 && var13 >= var9 && var10 - arg4 == var12) {
                        return true;
                    }
                    if ((var9 - arg4) == var11 && var12 <= var10 && var14 >= var10 && (this.field3914[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var14 >= var10 && (this.field3914[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg3 == 0) {
                    if (var9 - arg4 == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var14 >= var10 && (this.field3914[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 - arg4 == var12 && (this.field3914[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - arg4 == var11 && var12 <= var10 && var14 >= var10 && (this.field3914[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 - arg4) == var12 && (this.field3914[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - arg4) == var11 && var10 >= var12 && var10 <= var14 && (this.field3914[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12 && (this.field3914[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var10 - arg4) == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - arg4 == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field3914[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var10 <= var14 && (this.field3914[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 - arg4) == var12) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field3914[var9][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var9 <= var13 && var10 - arg4 == var12 && (this.field3914[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var9 - arg4) == var11 && var12 <= var10 && var10 <= var14 && (this.field3914[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 >= var12 && var10 <= var14 && (this.field3914[var11][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1860(byte arg0) {
        if (arg0 >= -115) {
            method1845(-61, 122, (byte) -125, 32);
        }
        field3927 = null;
        field3909 = null;
        field3902 = null;
        field3921 = null;
        field3931 = null;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)V")
    public final void method1861(int arg0, int arg1, int arg2) {
        if (arg2 == 21946) {
            int var4 = arg0 - this.field3915;
            field3928++;
            int var5 = arg1 - this.field3908;
            this.field3914[var5][var4] = class351.method2313(this.field3914[var5][var4], 2097152);
        }
    }
}
