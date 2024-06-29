import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class165 {

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    private int field2979;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "[[I")
    public int[][] field2976;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    private int field2953;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    private int field2957;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lr;")
    public static class66 field2951 = class93.method641(43, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field2972 = 0;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field2981 = 0;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lsg;")
    public static class247 field2954;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "[[[B")
    public static byte[][][] field2971;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBI)V")
    public final void method1109(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field2953;
        int var5 = arg0 - this.field2957;
        field2969++;
        if (arg1 <= -44) {
            this.field2976[var4][var5] = class73.method521(this.field2976[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public final void method1110(boolean arg0) {
        for (int var2 = 0; var2 < this.field2979; var2++) {
            for (int var3 = 0; var3 < this.field2967; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2979 - 5 <= var2 || (this.field2967 - 5) <= var3) {
                    this.field2976[var2][var3] = 16777215;
                } else {
                    this.field2976[var2][var3] = 16777216;
                }
            }
        }
        if (arg0) {
            method1115(-17);
        }
        field2955++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIIIIIII)Z")
    private final boolean method1111(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg1) {
            field2954 = null;
        }
        field2975++;
        if (arg0 + arg8 > arg6 && arg8 < arg6 + arg2) {
            return arg3 + arg4 > arg5 && arg3 < arg5 + arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public final void method1112(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2953;
        int var5 = arg1 - this.field2957;
        field2974++;
        this.field2976[var4][var5] = class73.method521(this.field2976[var4][var5], 262144);
        if (arg0 >= -63) {
            field2972 = -2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
    public final void method1113(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2957;
        field2962++;
        int var5 = arg0 - this.field2953;
        this.field2976[var5][var4] = class115.method767(this.field2976[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != 15856) {
            return false;
        }
        field2952++;
        if (arg2 > 1) {
            return this.method1111(arg7, true, arg2, arg1, arg4, arg3, arg5, arg2, arg8) ? true : this.method1119(arg6, arg2, arg5, arg8, arg1, arg2, false, arg4, arg7, arg3);
        }
        int var10 = arg7 + arg8 - 1;
        int var11 = arg1 + arg4 - 1;
        if (arg8 <= arg5 && var10 >= arg5 && arg1 <= arg3 && var11 >= arg3) {
            return true;
        } else if (arg8 - 1 == arg5 && arg1 <= arg3 && arg3 <= var11 && (this.field2976[arg5 - this.field2953][arg3 - this.field2957] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg5 && arg3 >= arg1 && arg3 <= var11 && (this.field2976[arg5 - this.field2953][arg3 - this.field2957] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg3 && arg8 <= arg5 && arg5 <= var10 && (this.field2976[arg5 - this.field2953][arg3 - this.field2957] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg3 && arg5 >= arg8 && arg5 <= var10 && (this.field2976[arg5 - this.field2953][arg3 - this.field2957] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method1115(int arg0) {
        if (arg0 != 2) {
            method1126(-69);
        }
        class162.field2901.method1613((byte) 94);
        field2960++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2966++;
        if (arg3 >= 1 && arg7 >= 1 && arg3 <= 102 && arg7 <= 102) {
            if (!class88.method625(24781) && (class47.field846[0][arg3][arg7] & 0x2) == 0) {
                int var8 = arg4;
                if ((class47.field846[arg4][arg3][arg7] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class105.field2030 != var8) {
                    return;
                }
            }
            int var9 = arg4;
            if (arg4 < 3 && (class47.field846[1][arg3][arg7] & 0x2) == 2) {
                var9 = arg4 + 1;
            }
            class198.method1290(class193.field3346[arg4], arg1, var9, arg4, 28, arg7, arg3);
            if (arg2 >= 0) {
                boolean var10 = class64.field1265;
                class64.field1265 = true;
                class154.method1051(class193.field3346[arg4], 1, false, arg7, arg6, arg3, arg5, var9, arg4, false, arg2);
                class64.field1265 = var10;
            }
        }
        if (arg0 != 0) {
            method1123(true);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BIII)V")
    private final void method1117(byte arg0, int arg1, int arg2, int arg3) {
        field2980++;
        this.field2976[arg3][arg1] = class73.method521(this.field2976[arg3][arg1], arg2);
        if (arg0 != -74) {
            field2951 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZIII)V")
    private final void method1118(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            field2954 = null;
        }
        field2959++;
        this.field2976[arg3][arg1] = class115.method767(this.field2976[arg3][arg1], ~arg2);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIZIII)Z")
    private final boolean method1119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        int var11 = arg9 + arg5;
        int var12 = arg1 + arg2;
        if (arg6) {
            field2972 = -65;
        }
        int var13 = arg3 + arg8;
        int var14 = arg4 + arg7;
        field2958++;
        if (arg2 >= arg3 && var13 > arg2) {
            if (arg4 == var11 && (arg0 & 0x4) == 0) {
                int var15 = arg2;
                int var16 = var13 < var12 ? var13 : var12;
                while (var16 > var15) {
                    if ((this.field2976[var15 - this.field2953][var11 - this.field2957 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg9 == var14 && (arg0 & 0x1) == 0) {
                int var17 = arg2;
                int var18 = var12 > var13 ? var13 : var12;
                while (var18 > var17) {
                    if ((this.field2976[var17 - this.field2953][arg9 - this.field2957] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var12 > arg3 && var12 <= var13) {
            if (arg4 == var11 && (arg0 & 0x4) == 0) {
                for (int var19 = arg3; var19 < var12; var19++) {
                    if ((this.field2976[var19 - this.field2953][var11 - this.field2957 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var14 && (arg0 & 0x1) == 0) {
                for (int var20 = arg3; var20 < var12; var20++) {
                    if ((this.field2976[var20 - this.field2953][arg9 - this.field2957] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg9 >= arg4 && arg9 < var14) {
            if (arg3 == var12 && (arg0 & 0x8) == 0) {
                int var21 = var14 >= var11 ? var11 : var14;
                for (int var22 = arg9; var22 < var21; var22++) {
                    if ((this.field2976[var12 - this.field2953 - 1][var22 - this.field2957] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var13 && (arg0 & 0x2) == 0) {
                int var23 = arg9;
                int var24 = var14 >= var11 ? var11 : var14;
                while (var24 > var23) {
                    if ((this.field2976[arg2 - this.field2953][var23 - this.field2957] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg4 < var11 && var11 <= var14) {
            if (arg3 == var12 && (arg0 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var11; var25++) {
                    if ((this.field2976[var12 - this.field2953 - 1][var25 - this.field2957] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var13 && (arg0 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var11; var26++) {
                    if ((this.field2976[arg2 - this.field2953][var26 - this.field2957] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIZB)V")
    public final void method1120(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        field2970++;
        int var8 = arg4 - this.field2957;
        int var9 = arg1 - this.field2953;
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg2;
            arg2 = arg0;
            arg0 = var10;
        }
        int var11 = 256;
        if (arg5) {
            var11 += 131072;
        }
        if (arg6 != 82) {
            return;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field2979) {
                for (int var13 = var8; var13 < arg0 + var8; var13++) {
                    if (var13 >= 0 && this.field2967 > var13) {
                        this.method1118(false, var13, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIIII)V")
    public final void method1121(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field2957;
        int var8 = 256;
        field2964++;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field2953;
        for (int var10 = var9; var10 < arg3 + var9; var10++) {
            if (var10 >= 0 && var10 < this.field2979) {
                for (int var11 = var7; var11 < (arg2 + var7); var11++) {
                    if (var11 >= 0 && var11 < this.field2967) {
                        this.method1117((byte) -74, var11, var8, var10);
                    }
                }
            }
        }
        if (arg0 >= -38) {
            this.field2953 = -81;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method1122(byte arg0) {
        if (arg0 >= -103) {
            method1115(-65);
        }
        field2954 = null;
        field2951 = null;
        field2971 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)I")
    public static final int method1123(boolean arg0) {
        if (arg0) {
            field2981 = 10;
        }
        field2956++;
        return 2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIZZI)V")
    public final void method1124(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field2973++;
        int var7 = arg0 - this.field2953;
        int var8 = arg2 - this.field2957;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method1118(false, var8, 128, var7);
                this.method1118(false, var8, 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method1118(false, var8, 2, var7);
                this.method1118(false, var8 + 1, 32, var7);
            }
            if (arg5 == 2) {
                this.method1118(false, var8, 8, var7);
                this.method1118(false, var8, 128, var7 + 1);
            }
            if (arg5 == 3) {
                this.method1118(!arg3, var8, 32, var7);
                this.method1118(false, var8 - 1, 2, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method1118(false, var8, 1, var7);
                this.method1118(false, var8 + 1, 16, var7 - 1);
            }
            if (arg5 == 1) {
                this.method1118(!arg3, var8, 4, var7);
                this.method1118(false, var8 + 1, 64, var7 + 1);
            }
            if (arg5 == 2) {
                this.method1118(!arg3, var8, 16, var7);
                this.method1118(false, var8 - 1, 1, var7 + 1);
            }
            if (arg5 == 3) {
                this.method1118(false, var8, 64, var7);
                this.method1118(false, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method1118(false, var8, 130, var7);
                this.method1118(false, var8, 8, var7 - 1);
                this.method1118(false, var8 + 1, 32, var7);
            }
            if (arg5 == 1) {
                this.method1118(false, var8, 10, var7);
                this.method1118(!arg3, var8 + 1, 32, var7);
                this.method1118(false, var8, 128, var7 + 1);
            }
            if (arg5 == 2) {
                this.method1118(!arg3, var8, 40, var7);
                this.method1118(!arg3, var8, 128, var7 + 1);
                this.method1118(false, var8 - 1, 2, var7);
            }
            if (arg5 == 3) {
                this.method1118(false, var8, 160, var7);
                this.method1118(false, var8 - 1, 2, var7);
                this.method1118(false, var8, 8, var7 - 1);
            }
        }
        if (!arg3 || !arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method1118(!arg3, var8, 65536, var7);
                this.method1118(false, var8, 4096, var7 - 1);
            }
            if (arg5 == 1) {
                this.method1118(!arg3, var8, 1024, var7);
                this.method1118(false, var8 + 1, 16384, var7);
            }
            if (arg5 == 2) {
                this.method1118(false, var8, 4096, var7);
                this.method1118(!arg3, var8, 65536, var7 + 1);
            }
            if (arg5 == 3) {
                this.method1118(false, var8, 16384, var7);
                this.method1118(false, var8 - 1, 1024, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method1118(false, var8, 512, var7);
                this.method1118(false, var8 + 1, 8192, var7 - 1);
            }
            if (arg5 == 1) {
                this.method1118(false, var8, 2048, var7);
                this.method1118(!arg3, var8 + 1, 32768, var7 + 1);
            }
            if (arg5 == 2) {
                this.method1118(false, var8, 8192, var7);
                this.method1118(false, var8 - 1, 512, var7 + 1);
            }
            if (arg5 == 3) {
                this.method1118(!arg3, var8, 32768, var7);
                this.method1118(false, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1118(!arg3, var8, 66560, var7);
            this.method1118(false, var8, 4096, var7 - 1);
            this.method1118(false, var8 + 1, 16384, var7);
        }
        if (arg5 == 1) {
            this.method1118(!arg3, var8, 5120, var7);
            this.method1118(!arg3, var8 + 1, 16384, var7);
            this.method1118(false, var8, 65536, var7 + 1);
        }
        if (arg5 == 2) {
            this.method1118(false, var8, 20480, var7);
            this.method1118(false, var8, 65536, var7 + 1);
            this.method1118(false, var8 - 1, 1024, var7);
        }
        if (arg5 == 3) {
            this.method1118(false, var8, 81920, var7);
            this.method1118(!arg3, var8 - 1, 1024, var7);
            this.method1118(false, var8, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIBIIIII)Z")
    public final boolean method1125(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 108) {
            field2954 = null;
        }
        field2977++;
        if (arg4 == 1) {
            if (arg1 == arg3 && arg5 == arg6) {
                return true;
            }
        } else if (arg3 <= arg1 && arg3 - (1 - arg4) >= arg1 && arg5 <= arg5 && arg5 <= arg4 + arg5 - 1) {
            return true;
        }
        int var9 = arg1 - this.field2953;
        int var10 = arg3 - this.field2953;
        int var11 = arg6 - this.field2957;
        int var12 = arg5 - this.field2957;
        if (arg4 == 1) {
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field2976[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field2976[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field2976[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field2976[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field2976[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field2976[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field2976[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field2976[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field2976[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field2976[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field2976[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var10 - 1;
            int var14 = var11 + arg4 - 1;
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if ((var9 - arg4) == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var12 + 1) == var11 && (this.field2976[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var12 - arg4) == var11 && (this.field2976[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 <= var9 && var9 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 - arg4) == var10 && var11 <= var12 && var14 >= var12 && (this.field2976[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field2976[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11 && (this.field2976[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 - arg4 == var11 && (this.field2976[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 >= var10 && var9 <= var13 && (var12 - arg4) == var11) {
                        return true;
                    }
                    if (var9 - arg4 == var10 && var11 <= var12 && var14 >= var12 && (this.field2976[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var14 >= var12 && (this.field2976[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if ((var9 - arg4) == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field2976[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 - arg4) == var11 && (this.field2976[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - arg4 == var10 && var11 <= var12 && var12 <= var14 && (this.field2976[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 - arg4 == var11 && (this.field2976[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - arg4 == var10 && var12 >= var11 && var14 >= var12 && (this.field2976[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11 && (this.field2976[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 - arg4) == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var9 - arg4) == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11 && (this.field2976[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var14 >= var12 && (this.field2976[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 - arg4 == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var10 <= var9 && var13 >= var9 && var12 + 1 == var11 && (this.field2976[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 >= var10 && var13 >= var9 && var12 - arg4 == var11 && (this.field2976[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var9 - arg4) == var10 && var11 <= var12 && var14 >= var12 && (this.field2976[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14 && (this.field2976[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)Ldh;")
    public static final class265 method1126(int arg0) {
        if (arg0 != 9662) {
            field2961 = 43;
        }
        class265 var1 = new class265(class11.field125, class54.field950, class36.field541[0], class231.field4029[0], class2.field25[0], class199.field3443[0], class44.field777[0], class136.field2517);
        class211.method1365((byte) -93);
        field2968++;
        return var1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZIIB)V")
    public final void method1127(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        int var7 = arg4 - this.field2953;
        field2965++;
        int var8 = arg1 - this.field2957;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method1117((byte) -74, var8, 128, var7);
                this.method1117((byte) -74, var8, 8, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1117((byte) -74, var8, 2, var7);
                this.method1117((byte) -74, var8 + 1, 32, var7);
            }
            if (arg0 == 2) {
                this.method1117((byte) -74, var8, 8, var7);
                this.method1117((byte) -74, var8, 128, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1117((byte) -74, var8, 32, var7);
                this.method1117((byte) -74, var8 - 1, 2, var7);
            }
        }
        int var9 = 78 % ((-arg5 - 87) / 37);
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method1117((byte) -74, var8, 1, var7);
                this.method1117((byte) -74, var8 + 1, 16, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1117((byte) -74, var8, 4, var7);
                this.method1117((byte) -74, var8 + 1, 64, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1117((byte) -74, var8, 16, var7);
                this.method1117((byte) -74, var8 - 1, 1, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1117((byte) -74, var8, 64, var7);
                this.method1117((byte) -74, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method1117((byte) -74, var8, 130, var7);
                this.method1117((byte) -74, var8, 8, var7 - 1);
                this.method1117((byte) -74, var8 + 1, 32, var7);
            }
            if (arg0 == 1) {
                this.method1117((byte) -74, var8, 10, var7);
                this.method1117((byte) -74, var8 + 1, 32, var7);
                this.method1117((byte) -74, var8, 128, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1117((byte) -74, var8, 40, var7);
                this.method1117((byte) -74, var8, 128, var7 + 1);
                this.method1117((byte) -74, var8 - 1, 2, var7);
            }
            if (arg0 == 3) {
                this.method1117((byte) -74, var8, 160, var7);
                this.method1117((byte) -74, var8 - 1, 2, var7);
                this.method1117((byte) -74, var8, 8, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method1117((byte) -74, var8, 65536, var7);
                this.method1117((byte) -74, var8, 4096, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1117((byte) -74, var8, 1024, var7);
                this.method1117((byte) -74, var8 + 1, 16384, var7);
            }
            if (arg0 == 2) {
                this.method1117((byte) -74, var8, 4096, var7);
                this.method1117((byte) -74, var8, 65536, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1117((byte) -74, var8, 16384, var7);
                this.method1117((byte) -74, var8 - 1, 1024, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method1117((byte) -74, var8, 512, var7);
                this.method1117((byte) -74, var8 + 1, 8192, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1117((byte) -74, var8, 2048, var7);
                this.method1117((byte) -74, var8 + 1, 32768, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1117((byte) -74, var8, 8192, var7);
                this.method1117((byte) -74, var8 - 1, 512, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1117((byte) -74, var8, 32768, var7);
                this.method1117((byte) -74, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1117((byte) -74, var8, 66560, var7);
            this.method1117((byte) -74, var8, 4096, var7 - 1);
            this.method1117((byte) -74, var8 + 1, 16384, var7);
        }
        if (arg0 == 1) {
            this.method1117((byte) -74, var8, 5120, var7);
            this.method1117((byte) -74, var8 + 1, 16384, var7);
            this.method1117((byte) -74, var8, 65536, var7 + 1);
        }
        if (arg0 == 2) {
            this.method1117((byte) -74, var8, 20480, var7);
            this.method1117((byte) -74, var8, 65536, var7 + 1);
            this.method1117((byte) -74, var8 - 1, 1024, var7);
        }
        if (arg0 == 3) {
            this.method1117((byte) -74, var8, 81920, var7);
            this.method1117((byte) -74, var8 - 1, 1024, var7);
            this.method1117((byte) -74, var8, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method1128(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2978++;
        if (arg4 == 1) {
            if (arg0 == arg1 && arg5 == arg6) {
                return true;
            }
        } else if (arg1 <= arg0 && arg0 <= arg1 + arg4 - 1 && arg5 >= arg5 && arg5 + arg4 - 1 >= arg5) {
            return true;
        }
        int var9 = arg0 - this.field2953;
        int var10 = arg5 - this.field2957;
        int var11 = arg6 - this.field2957;
        int var12 = -3 % ((18 - arg3) / 36);
        int var13 = arg1 - this.field2953;
        if (arg4 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var13 && var10 == var11 && (this.field2976[var13][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var13 && var10 - 1 == var11 && (this.field2976[var13][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - 1 == var13 && var10 == var11 && (this.field2976[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var13 && (var10 - 1) == var11 && (this.field2976[var13][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - 1 == var13 && var10 == var11 && (this.field2976[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var13 && var10 + 1 == var11 && (this.field2976[var13][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 + 1) == var13 && var10 == var11 && (this.field2976[var13][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var13 && (var10 + 1) == var11 && (this.field2976[var13][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 == var13 && var10 + 1 == var11 && (this.field2976[var13][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var13 && (var10 - 1) == var11 && (this.field2976[var13][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var13 && var10 == var11 && (this.field2976[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var13 && var10 == var11 && (this.field2976[var13][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg4 + var13 - 1;
            int var15 = var11 + arg4 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var9 + 1 == var13 && var11 <= var10 && var10 <= var15 && (this.field2976[var13][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var13 <= var9 && var9 <= var14 && var10 - arg4 == var11 && (this.field2976[var9][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - arg4 == var13 && var11 <= var10 && var10 <= var15 && (this.field2976[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var13 && var9 <= var14 && var10 - arg4 == var11 && (this.field2976[var9][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - arg4 == var13 && var10 >= var11 && var10 <= var15 && (this.field2976[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var13 && var9 <= var14 && var10 + 1 == var11 && (this.field2976[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 + 1) == var13 && var11 <= var10 && var10 <= var15 && (this.field2976[var13][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var13 <= var9 && var9 <= var14 && var10 + 1 == var11 && (this.field2976[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 >= var13 && var9 <= var14 && (var10 + 1) == var11 && (this.field2976[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var13 <= var9 && var9 <= var14 && (var10 - arg4) == var11 && (this.field2976[var9][var15] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg4) == var13 && var11 <= var10 && var10 <= var15 && (this.field2976[var14][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var13 && var10 >= var11 && var10 <= var15 && (this.field2976[var13][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(II)V")
    public class165(int arg0, int arg1) {
        this.field2967 = arg1;
        this.field2979 = arg0;
        this.field2976 = new int[this.field2979][this.field2967];
        this.field2953 = 0;
        this.field2957 = 0;
        this.method1110(false);
    }
}
