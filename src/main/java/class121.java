import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class121 {

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    private int field2976 = 0;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    private int field2957;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "[[I")
    public int[][] field2964;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lwb;")
    public static class130 field2966 = class26.method212("Ausw-=hlen", -32376);

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lwb;")
    private static class130 field2973 = class26.method212("Unexpected server response", -32376);

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lwb;")
    public static class130 field2967 = field2973;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field2962 = 0;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field2977 = -1;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIZIZ)V", line = 5)
    public final void method921(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var7 = arg2 - this.field2976;
        int var8 = arg0 - this.field2960;
        field2956++;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method930(var7, var8, -1984, 128);
                this.method930(var7, var8 - 1, -1984, 8);
            }
            if (arg4 == 1) {
                this.method930(var7, var8, -1984, 2);
                this.method930(var7 + 1, var8, -1984, 32);
            }
            if (arg4 == 2) {
                this.method930(var7, var8, -1984, 8);
                this.method930(var7, var8 + 1, -1984, 128);
            }
            if (arg4 == 3) {
                this.method930(var7, var8, -1984, 32);
                this.method930(var7 - 1, var8, -1984, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method930(var7, var8, -1984, 1);
                this.method930(var7 + 1, var8 + -1, -1984, 16);
            }
            if (arg4 == 1) {
                this.method930(var7, var8, -1984, 4);
                this.method930(var7 + 1, var8 - -1, -1984, 64);
            }
            if (arg4 == 2) {
                this.method930(var7, var8, -1984, 16);
                this.method930(var7 - 1, var8 + 1, -1984, 1);
            }
            if (arg4 == 3) {
                this.method930(var7, var8, -1984, 64);
                this.method930(var7 - 1, var8 + -1, -1984, 4);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method930(var7, var8, -1984, 130);
                this.method930(var7, var8 - 1, -1984, 8);
                this.method930(var7 + 1, var8, -1984, 32);
            }
            if (arg4 == 1) {
                this.method930(var7, var8, -1984, 10);
                this.method930(var7 + 1, var8, -1984, 32);
                this.method930(var7, var8 + 1, -1984, 128);
            }
            if (arg4 == 2) {
                this.method930(var7, var8, -1984, 40);
                this.method930(var7, var8 + 1, -1984, 128);
                this.method930(var7 - 1, var8, -1984, 2);
            }
            if (arg4 == 3) {
                this.method930(var7, var8, -1984, 160);
                this.method930(var7 - 1, var8, -1984, 2);
                this.method930(var7, var8 - 1, -1984, 8);
            }
        }
        if (!arg5) {
            field2962 = 20;
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method930(var7, var8, -1984, 65536);
                this.method930(var7, var8 - 1, -1984, 4096);
            }
            if (arg4 == 1) {
                this.method930(var7, var8, -1984, 1024);
                this.method930(var7 + 1, var8, -1984, 16384);
            }
            if (arg4 == 2) {
                this.method930(var7, var8, -1984, 4096);
                this.method930(var7, var8 + 1, -1984, 65536);
            }
            if (arg4 == 3) {
                this.method930(var7, var8, -1984, 16384);
                this.method930(var7 - 1, var8, -1984, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method930(var7, var8, -1984, 512);
                this.method930(var7 + 1, var8 + -1, -1984, 8192);
            }
            if (arg4 == 1) {
                this.method930(var7, var8, -1984, 2048);
                this.method930(var7 + 1, var8 - -1, -1984, 32768);
            }
            if (arg4 == 2) {
                this.method930(var7, var8, -1984, 8192);
                this.method930(var7 - 1, var8 + 1, -1984, 512);
            }
            if (arg4 == 3) {
                this.method930(var7, var8, -1984, 32768);
                this.method930(var7 - 1, var8 + -1, -1984, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method930(var7, var8, -1984, 66560);
            this.method930(var7, var8 - 1, -1984, 4096);
            this.method930(var7 + 1, var8, -1984, 16384);
        }
        if (arg4 == 1) {
            this.method930(var7, var8, -1984, 5120);
            this.method930(var7 + 1, var8, -1984, 16384);
            this.method930(var7, var8 + 1, -1984, 65536);
        }
        if (arg4 == 2) {
            this.method930(var7, var8, -1984, 20480);
            this.method930(var7, var8 + 1, -1984, 65536);
            this.method930(var7 - 1, var8, -1984, 1024);
        }
        if (arg4 == 3) {
            this.method930(var7, var8, -1984, 81920);
            this.method930(var7 - 1, var8, -1984, 1024);
            this.method930(var7, var8 - 1, -1984, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBII)V", line = 211)
    private final void method922(int arg0, byte arg1, int arg2, int arg3) {
        field2961++;
        if (arg1 == 39) {
            this.field2964[arg3][arg0] = class129.method950(this.field2964[arg3][arg0], arg2);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIB)Z", line = 222)
    public final boolean method923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2958++;
        int var9 = arg4 + arg6 - 1;
        int var10 = arg5 + arg2 - 1;
        if (arg3 >= arg5 && arg3 <= var10 && arg6 <= arg0 && arg0 <= var9) {
            return true;
        } else if (arg5 - 1 == arg3 && arg0 >= arg6 && arg0 <= var9 && (this.field2964[arg3 - this.field2960][arg0 - this.field2976] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else {
            int var11 = 72 % ((arg7 - 53) / 37);
            if (var10 + 1 == arg3 && arg6 <= arg0 && var9 >= arg0 && (this.field2964[arg3 - this.field2960][arg0 - this.field2976] & 0x80) == 0 && (arg1 & 0x2) == 0) {
                return true;
            } else if (arg6 - 1 == arg0 && arg3 >= arg5 && arg3 <= var10 && (this.field2964[arg3 - this.field2960][arg0 - this.field2976] & 0x2) == 0 && (arg1 & 0x4) == 0) {
                return true;
            } else {
                return var9 + 1 == arg0 && arg3 >= arg5 && arg3 <= var10 && (this.field2964[arg3 - this.field2960][arg0 - this.field2976] & 0x20) == 0 && (arg1 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIIII)V", line = 258)
    public final void method924(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field2960;
        field2969++;
        if (arg4 != 0) {
            field2977 = 3;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var9 = arg1;
            arg1 = arg0;
            arg0 = var9;
        }
        int var10 = 256;
        if (arg2) {
            var10 += 131072;
        }
        int var11 = arg3 - this.field2976;
        for (int var12 = var8; var12 < arg1 + var8; var12++) {
            if (var12 >= 0 && this.field2959 > var12) {
                for (int var13 = var11; var13 < arg0 + var11; var13++) {
                    if (var13 >= 0 && this.field2957 > var13) {
                        this.method922(var13, (byte) 39, var10, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIZIII)V", line = 310)
    public final void method925(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2963++;
        if (!arg3) {
            this.method921(-17, 0, 116, false, 59, true);
        }
        int var8 = arg5 - this.field2960;
        int var9 = 256;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg1;
            arg1 = var10;
        }
        if (arg0) {
            var9 += 131072;
        }
        int var11 = arg6 - this.field2976;
        for (int var12 = var8; var12 < arg2 + var8; var12++) {
            if (var12 >= 0 && this.field2959 > var12) {
                for (int var13 = var11; var13 < arg1 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field2957) {
                        this.method930(var13, var12, -1984, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)V", line = 362)
    public final void method926(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field2976;
        if (arg1 == 48) {
            int var5 = arg2 - this.field2960;
            field2975++;
            this.field2964[var5][var4] = class129.method950(this.field2964[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 378)
    public static void method927(int arg0) {
        field2966 = null;
        if (arg0 != 16777216) {
            field2967 = null;
        }
        field2967 = null;
        field2973 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)Z", line = 391)
    public final boolean method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2955++;
        if (arg4 == arg6 && arg1 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field2960;
        int var9 = arg1 - this.field2976;
        int var10 = arg4 - this.field2960;
        int var11 = arg3 - this.field2976;
        if (arg2 == 0) {
            if (arg0 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field2964[var10][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field2964[var10][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field2964[var10][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field2964[var10][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field2964[var10][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field2964[var10][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field2964[var10][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field2964[var10][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field2964[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field2964[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field2964[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return arg5 == 19398914 ? false : false;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIIIIII)Z", line = 578)
    public final boolean method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2972++;
        if (arg4 == arg5 && arg1 == arg2) {
            return true;
        }
        int var8 = arg1 - this.field2976;
        int var9 = arg2 - this.field2976;
        int var10 = arg4 - this.field2960;
        int var11 = arg5 - this.field2960;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2964[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2964[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2964[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2964[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2964[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2964[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2964[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2964[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 != 128) {
            this.method929(70, -80, -113, -10, -13, -110, 100);
        }
        if (arg6 == 8) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field2964[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field2964[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field2964[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field2964[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V", line = 669)
    private final void method930(int arg0, int arg1, int arg2, int arg3) {
        field2970++;
        this.field2964[arg1][arg0] = class32.method257(this.field2964[arg1][arg0], 16777215 - arg3);
        if (arg2 != -1984) {
            this.method922(-16, (byte) -58, -26, 97);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 691)
    public final void method931(int arg0) {
        field2968++;
        for (int var2 = 0; var2 < this.field2959; var2++) {
            for (int var3 = 0; var3 < this.field2957; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2959 - 1 == var2 || this.field2957 - 1 == var3) {
                    this.field2964[var2][var3] = 16777215;
                } else {
                    this.field2964[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 >= -43) {
            this.method926(7, (byte) -117, -99);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V", line = 729)
    public final void method932(int arg0, int arg1, int arg2) {
        if (arg2 > 103) {
            field2971++;
            int var4 = arg0 - this.field2976;
            int var5 = arg1 - this.field2960;
            this.field2964[var5][var4] = class32.method257(this.field2964[var5][var4], 14680063);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIBIZI)V", line = 753)
    public final void method933(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field2976;
        int var8 = arg3 - this.field2960;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method922(var7, (byte) 39, 128, var8);
                this.method922(var7, (byte) 39, 8, var8 - 1);
            }
            if (arg5 == 1) {
                this.method922(var7, (byte) 39, 2, var8);
                this.method922(var7 + 1, (byte) 39, 32, var8);
            }
            if (arg5 == 2) {
                this.method922(var7, (byte) 39, 8, var8);
                this.method922(var7, (byte) 39, 128, var8 + 1);
            }
            if (arg5 == 3) {
                this.method922(var7, (byte) 39, 32, var8);
                this.method922(var7 - 1, (byte) 39, 2, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method922(var7, (byte) 39, 1, var8);
                this.method922(var7 + 1, (byte) 39, 16, var8 - 1);
            }
            if (arg5 == 1) {
                this.method922(var7, (byte) 39, 4, var8);
                this.method922(var7 + 1, (byte) 39, 64, var8 + 1);
            }
            if (arg5 == 2) {
                this.method922(var7, (byte) 39, 16, var8);
                this.method922(var7 - 1, (byte) 39, 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method922(var7, (byte) 39, 64, var8);
                this.method922(var7 - 1, (byte) 39, 4, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method922(var7, (byte) 39, 130, var8);
                this.method922(var7, (byte) 39, 8, var8 - 1);
                this.method922(var7 + 1, (byte) 39, 32, var8);
            }
            if (arg5 == 1) {
                this.method922(var7, (byte) 39, 10, var8);
                this.method922(var7 + 1, (byte) 39, 32, var8);
                this.method922(var7, (byte) 39, 128, var8 + 1);
            }
            if (arg5 == 2) {
                this.method922(var7, (byte) 39, 40, var8);
                this.method922(var7, (byte) 39, 128, var8 + 1);
                this.method922(var7 - 1, (byte) 39, 2, var8);
            }
            if (arg5 == 3) {
                this.method922(var7, (byte) 39, 160, var8);
                this.method922(var7 - 1, (byte) 39, 2, var8);
                this.method922(var7, (byte) 39, 8, var8 - 1);
            }
        }
        if (arg4) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    this.method922(var7, (byte) 39, 65536, var8);
                    this.method922(var7, (byte) 39, 4096, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method922(var7, (byte) 39, 1024, var8);
                    this.method922(var7 + 1, (byte) 39, 16384, var8);
                }
                if (arg5 == 2) {
                    this.method922(var7, (byte) 39, 4096, var8);
                    this.method922(var7, (byte) 39, 65536, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method922(var7, (byte) 39, 16384, var8);
                    this.method922(var7 - 1, (byte) 39, 1024, var8);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg5 == 0) {
                    this.method922(var7, (byte) 39, 512, var8);
                    this.method922(var7 + 1, (byte) 39, 8192, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method922(var7, (byte) 39, 2048, var8);
                    this.method922(var7 + 1, (byte) 39, 32768, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method922(var7, (byte) 39, 8192, var8);
                    this.method922(var7 - 1, (byte) 39, 512, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method922(var7, (byte) 39, 32768, var8);
                    this.method922(var7 - 1, (byte) 39, 2048, var8 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    this.method922(var7, (byte) 39, 66560, var8);
                    this.method922(var7, (byte) 39, 4096, var8 - 1);
                    this.method922(var7 + 1, (byte) 39, 16384, var8);
                }
                if (arg5 == 1) {
                    this.method922(var7, (byte) 39, 5120, var8);
                    this.method922(var7 + 1, (byte) 39, 16384, var8);
                    this.method922(var7, (byte) 39, 65536, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method922(var7, (byte) 39, 20480, var8);
                    this.method922(var7, (byte) 39, 65536, var8 + 1);
                    this.method922(var7 - 1, (byte) 39, 1024, var8);
                }
                if (arg5 == 3) {
                    this.method922(var7, (byte) 39, 81920, var8);
                    this.method922(var7 - 1, (byte) 39, 1024, var8);
                    this.method922(var7, (byte) 39, 4096, var8 - 1);
                }
            }
        }
        field2974++;
        int var9 = 87 % ((82 - arg2) / 44);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V", line = 976)
    public class121(int arg0, int arg1) {
        this.field2959 = arg0;
        this.field2957 = arg1;
        this.field2960 = 0;
        this.field2964 = new int[this.field2959][this.field2957];
        this.method931(-124);
    }
}
