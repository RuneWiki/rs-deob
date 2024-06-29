import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class170 {

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    private int field3110;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    private int field3105;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[[I")
    public int[][] field3103;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static volatile int field3102 = 0;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[I")
    public static int[] field3116 = new int[25];

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field3122 = 1;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lkd;")
    public static class203 field3100;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[Lij;")
    public static class194[] field3112;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIIII)V")
    public final void method1165(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field3105;
        int var8 = arg2 - this.field3120;
        field3104++;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method1167(-1, var8, var7, 128);
                this.method1167(-1, var8 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method1167(-1, var8, var7, 2);
                this.method1167(-1, var8, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method1167(-1, var8, var7, 8);
                this.method1167(-1, var8 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method1167(-1, var8, var7, 32);
                this.method1167(-1, var8, var7 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method1167(-1, var8, var7, 1);
                this.method1167(-1, var8 - 1, var7 - -1, 16);
            }
            if (arg3 == 1) {
                this.method1167(-1, var8, var7, 4);
                this.method1167(-1, var8 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method1167(-1, var8, var7, 16);
                this.method1167(-1, var8 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method1167(-1, var8, var7, 64);
                this.method1167(-1, var8 - 1, var7 + -1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method1167(-1, var8, var7, 130);
                this.method1167(-1, var8 - 1, var7, 8);
                this.method1167(-1, var8, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method1167(-1, var8, var7, 10);
                this.method1167(-1, var8, var7 + 1, 32);
                this.method1167(-1, var8 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method1167(-1, var8, var7, 40);
                this.method1167(-1, var8 + 1, var7, 128);
                this.method1167(-1, var8, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method1167(-1, var8, var7, 160);
                this.method1167(-1, var8, var7 - 1, 2);
                this.method1167(-1, var8 - 1, var7, 8);
            }
        }
        if (arg4 >= -74) {
            this.field3103 = null;
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method1167(-1, var8, var7, 65536);
                this.method1167(-1, var8 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method1167(-1, var8, var7, 1024);
                this.method1167(-1, var8, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method1167(-1, var8, var7, 4096);
                this.method1167(-1, var8 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method1167(-1, var8, var7, 16384);
                this.method1167(-1, var8, var7 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method1167(-1, var8, var7, 512);
                this.method1167(-1, var8 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method1167(-1, var8, var7, 2048);
                this.method1167(-1, var8 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method1167(-1, var8, var7, 8192);
                this.method1167(-1, var8 + 1, var7 + -1, 512);
            }
            if (arg3 == 3) {
                this.method1167(-1, var8, var7, 32768);
                this.method1167(-1, var8 - 1, var7 + -1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1167(-1, var8, var7, 66560);
            this.method1167(-1, var8 - 1, var7, 4096);
            this.method1167(-1, var8, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method1167(-1, var8, var7, 5120);
            this.method1167(-1, var8, var7 + 1, 16384);
            this.method1167(-1, var8 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method1167(-1, var8, var7, 20480);
            this.method1167(-1, var8 + 1, var7, 65536);
            this.method1167(-1, var8, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method1167(-1, var8, var7, 81920);
            this.method1167(-1, var8, var7 - 1, 1024);
            this.method1167(-1, var8 - 1, var7, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class162.field2940[arg0][var8][var14] == -class261.field4695) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class271.field4803[arg0][arg1][arg3] + arg5;
            if (!class187.method1276(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class187.method1276(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class187.method1276(var9, var11, var13)) {
                return false;
            } else if (class187.method1276(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class224.method1579(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class187.method1276(var6 + 1, class271.field4803[arg0][arg1][arg3] + arg5, var7 + 1) && class187.method1276(var6 + 128 - 1, class271.field4803[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class187.method1276(var6 + 128 - 1, class271.field4803[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class187.method1276(var6 + 1, class271.field4803[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)V")
    private final void method1167(int arg0, int arg1, int arg2, int arg3) {
        this.field3103[arg1][arg2] = class6.method63(this.field3103[arg1][arg2], arg3);
        field3119++;
        if (arg0 != -1) {
            field3112 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3125++;
        if (arg6 >= (arg2 + arg3) || (arg0 + arg6) <= arg3) {
            return false;
        } else if (arg4 + arg8 > arg7 && arg5 + arg7 > arg4) {
            return arg1 == -5332 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZIIII)V")
    public final void method1169(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3114++;
        int var8 = arg0 - this.field3120;
        if (arg6 == 1 || arg6 == 3) {
            int var9 = arg1;
            arg1 = arg5;
            arg5 = var9;
        }
        if (arg4 != 11798) {
            field3116 = null;
        }
        int var10 = 256;
        if (arg2) {
            var10 += 131072;
        }
        int var11 = arg3 - this.field3105;
        for (int var12 = var8; var12 < (var8 + arg1); var12++) {
            if (var12 >= 0 && var12 < this.field3110) {
                for (int var13 = var11; var13 < (arg5 + var11); var13++) {
                    if (var13 >= 0 && var13 < this.field3113) {
                        this.method1179(var13, var12, var10, 87);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public final void method1170(byte arg0) {
        if (arg0 >= -126) {
            return;
        }
        for (int var2 = 0; var2 < this.field3110; var2++) {
            for (int var3 = 0; var3 < this.field3113; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3110 - 5 || var3 >= (this.field3113 - 5)) {
                    this.field3103[var2][var3] = 16777215;
                } else {
                    this.field3103[var2][var3] = 16777216;
                }
            }
        }
        field3106++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field3116 = null;
        field3100 = null;
        if (arg0 <= -26) {
            field3112 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIZ)V")
    public final void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3107++;
        int var7 = arg2 - this.field3105;
        int var8 = arg3 - this.field3120;
        if (~arg4 == arg1) {
            if (arg0 == 0) {
                this.method1179(var7, var8, 128, 96);
                this.method1179(var7, var8 - 1, 8, arg1 ^ 0xFFFFFFF3);
            }
            if (arg0 == 1) {
                this.method1179(var7, var8, 2, 79);
                this.method1179(var7 + 1, var8, 32, arg1 ^ 0xFFFFFFEF);
            }
            if (arg0 == 2) {
                this.method1179(var7, var8, 8, 72);
                this.method1179(var7, var8 + 1, 128, 60);
            }
            if (arg0 == 3) {
                this.method1179(var7, var8, 32, arg1 + 16);
                this.method1179(var7 - 1, var8, 2, 28);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1179(var7, var8, 1, 13);
                this.method1179(var7 + 1, var8 + -1, 16, 107);
            }
            if (arg0 == 1) {
                this.method1179(var7, var8, 4, arg1 + 55);
                this.method1179(var7 + 1, var8 - -1, 64, 100);
            }
            if (arg0 == 2) {
                this.method1179(var7, var8, 16, 69);
                this.method1179(var7 - 1, var8 + 1, 1, 83);
            }
            if (arg0 == 3) {
                this.method1179(var7, var8, 64, 45);
                this.method1179(var7 - 1, var8 + -1, 4, arg1 ^ 0xFFFFFFEC);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1179(var7, var8, 130, 80);
                this.method1179(var7, var8 - 1, 8, 63);
                this.method1179(var7 + 1, var8, 32, 73);
            }
            if (arg0 == 1) {
                this.method1179(var7, var8, 10, 114);
                this.method1179(var7 + 1, var8, 32, 46);
                this.method1179(var7, var8 + 1, 128, 76);
            }
            if (arg0 == 2) {
                this.method1179(var7, var8, 40, 50);
                this.method1179(var7, var8 + 1, 128, arg1 ^ 0xFFFFFFE5);
                this.method1179(var7 - 1, var8, 2, 41);
            }
            if (arg0 == 3) {
                this.method1179(var7, var8, 160, 39);
                this.method1179(var7 - 1, var8, 2, 22);
                this.method1179(var7, var8 - 1, 8, 100);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1179(var7, var8, 65536, 80);
                this.method1179(var7, var8 - 1, 4096, 68);
            }
            if (arg0 == 1) {
                this.method1179(var7, var8, 1024, arg1 + 102);
                this.method1179(var7 + 1, var8, 16384, 18);
            }
            if (arg0 == 2) {
                this.method1179(var7, var8, 4096, arg1 + 17);
                this.method1179(var7, var8 + 1, 65536, 115);
            }
            if (arg0 == 3) {
                this.method1179(var7, var8, 16384, arg1 + 81);
                this.method1179(var7 - 1, var8, 1024, 87);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1179(var7, var8, 512, 19);
                this.method1179(var7 + 1, var8 + -1, 8192, 12);
            }
            if (arg0 == 1) {
                this.method1179(var7, var8, 2048, arg1 + 116);
                this.method1179(var7 + 1, var8 + 1, 32768, 86);
            }
            if (arg0 == 2) {
                this.method1179(var7, var8, 8192, 54);
                this.method1179(var7 - 1, var8 - -1, 512, 88);
            }
            if (arg0 == 3) {
                this.method1179(var7, var8, 32768, arg1 + 73);
                this.method1179(var7 - 1, var8 - 1, 2048, 41);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1179(var7, var8, 66560, arg1 ^ 0xFFFFFFA2);
            this.method1179(var7, var8 - 1, 4096, 116);
            this.method1179(var7 + 1, var8, 16384, 111);
        }
        if (arg0 == 1) {
            this.method1179(var7, var8, 5120, 61);
            this.method1179(var7 + 1, var8, 16384, 98);
            this.method1179(var7, var8 + 1, 65536, 80);
        }
        if (arg0 == 2) {
            this.method1179(var7, var8, 20480, 109);
            this.method1179(var7, var8 + 1, 65536, 86);
            this.method1179(var7 - 1, var8, 1024, 126);
        }
        if (arg0 == 3) {
            this.method1179(var7, var8, 81920, 20);
            this.method1179(var7 - 1, var8, 1024, 19);
            this.method1179(var7, var8 - 1, 4096, 59);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public final void method1173(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3120;
        int var5 = arg0 - this.field3105;
        this.field3103[var4][var5] = class6.method63(this.field3103[var4][var5], 2097152);
        field3123++;
        if (arg1 >= -88) {
            this.field3105 = -70;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method1174(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field3115++;
        if (arg2 == 1) {
            if (arg4 == arg7 && arg0 == arg1) {
                return true;
            }
        } else if (arg4 >= arg7 && arg4 <= arg7 + arg2 - 1 && arg0 <= arg0 && (arg0 + arg2 - 1) >= arg0) {
            return true;
        }
        if (arg5 != 92) {
            return false;
        }
        int var9 = arg0 - this.field3105;
        int var10 = arg1 - this.field3105;
        int var11 = arg7 - this.field3120;
        int var12 = arg4 - this.field3120;
        if (arg2 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field3103[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3103[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field3103[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3103[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field3103[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field3103[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field3103[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field3103[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field3103[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field3103[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field3103[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field3103[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var11 - 1;
            int var14 = arg2 + var10 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var12 + 1) == var11 && var9 >= var10 && var14 >= var9 && (this.field3103[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var9 - arg2 == var10 && (this.field3103[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - arg2) == var11 && var10 <= var9 && var9 <= var14 && (this.field3103[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 - arg2 == var10 && (this.field3103[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var12 - arg2) == var11 && var9 >= var10 && var9 <= var14 && (this.field3103[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 + 1 == var10 && (this.field3103[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 + 1 == var11 && var10 <= var9 && var9 <= var14 && (this.field3103[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var9 + 1) == var10 && (this.field3103[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var12 >= var11 && var13 >= var12 && (var9 + 1) == var10 && (this.field3103[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var12 <= var13 && (var9 - arg2) == var10 && (this.field3103[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg2 == var11 && var10 <= var9 && var9 <= var14 && (this.field3103[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 >= var10 && var14 >= var9 && (this.field3103[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIBI)Z")
    public final boolean method1175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field3101++;
        if (arg8 > 1) {
            return this.method1168(arg8, -5332, arg0, arg6, arg2, arg8, arg4, arg1, arg3) ? true : this.method1176(arg0, arg4, arg8, 1, arg2, arg5, arg8, arg6, arg3, arg1);
        }
        int var10 = arg0 + arg6 - 1;
        int var11 = arg2 + arg3 - 1;
        if (arg6 <= arg4 && arg4 <= var10 && arg1 >= arg2 && arg1 <= var11) {
            return true;
        } else if (arg6 - 1 == arg4 && arg1 >= arg2 && arg1 <= var11 && (this.field3103[arg4 - this.field3120][arg1 - this.field3105] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg1 >= arg2 && arg1 <= var11 && (this.field3103[arg4 - this.field3120][arg1 - this.field3105] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if ((arg2 - 1) == arg1 && arg6 <= arg4 && arg4 <= var10 && (this.field3103[arg4 - this.field3120][arg1 - this.field3105] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else if (var11 + 1 == arg1 && arg6 <= arg4 && arg4 <= var10 && (this.field3103[arg4 - this.field3120][arg1 - this.field3105] & 0x20) == 0 && (arg5 & 0x1) == 0) {
            return true;
        } else {
            if (arg7 < 105) {
                this.field3105 = 121;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method1176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3109++;
        int var11 = arg1 + arg6;
        int var12 = arg0 + arg7;
        int var13 = arg2 + arg9;
        if (arg3 != 1) {
            return false;
        }
        int var14 = arg4 + arg8;
        if (arg1 >= arg7 && var12 > arg1) {
            if (arg4 == var13 && (arg5 & 0x4) == 0) {
                int var15 = arg1;
                int var16 = var11 <= var12 ? var11 : var12;
                while (var16 > var15) {
                    if ((this.field3103[var15 - this.field3120][var13 - this.field3105 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg9 == var14 && (arg5 & 0x1) == 0) {
                int var17 = arg1;
                int var18 = var11 > var12 ? var12 : var11;
                while (var17 < var18) {
                    if ((this.field3103[var17 - this.field3120][arg9 - this.field3105] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg7 && var11 <= var12) {
            if (arg4 == var13 && (arg5 & 0x4) == 0) {
                for (int var19 = arg7; var19 < var11; var19++) {
                    if ((this.field3103[var19 - this.field3120][var13 - this.field3105 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var14 && (arg5 & 0x1) == 0) {
                for (int var20 = arg7; var20 < var11; var20++) {
                    if ((this.field3103[var20 - this.field3120][arg9 - this.field3105] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg9 >= arg4 && arg9 < var14) {
            if (arg7 == var11 && (arg5 & 0x8) == 0) {
                int var21 = arg9;
                int var22 = var14 >= var13 ? var13 : var14;
                while (var22 > var21) {
                    if ((this.field3103[var11 - this.field3120 - 1][var21 - this.field3105] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg1 == var12 && (arg5 & 0x2) == 0) {
                int var23 = var13 > var14 ? var14 : var13;
                for (int var24 = arg9; var24 < var23; var24++) {
                    if ((this.field3103[arg1 - this.field3120][var24 - this.field3105] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var13 > arg4 && var14 >= var13) {
            if (arg7 == var11 && (arg5 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var13; var25++) {
                    if ((this.field3103[var11 - this.field3120 - 1][var25 - this.field3105] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var12 && (arg5 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var13; var26++) {
                    if ((this.field3103[arg1 - this.field3120][var26 - this.field3105] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
    public final void method1177(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3105;
        field3108++;
        int var5 = arg1 - this.field3120;
        if (arg0 != -1) {
            this.method1180(-124, -48, 22, false, 44, -1);
        }
        this.field3103[var5][var4] = class27.method220(this.field3103[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIBIII)Z")
    public final boolean method1178(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3121++;
        if (arg7 == 1) {
            if (arg1 == arg3 && arg0 == arg6) {
                return true;
            }
        } else if (arg1 >= arg3 && arg1 <= arg3 + arg7 - 1 && arg6 <= arg6 && arg6 <= (arg6 + arg7 - 1)) {
            return true;
        }
        int var9 = arg3 - this.field3120;
        int var10 = arg0 - this.field3105;
        int var11 = arg1 - this.field3120;
        int var12 = arg6 - this.field3105;
        if (arg7 == 1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field3103[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field3103[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field3103[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field3103[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field3103[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field3103[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field3103[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field3103[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field3103[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field3103[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field3103[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var9 - 1;
            int var14 = arg7 + var10 - 1;
            if (arg2 == 0) {
                if (arg5 == 0) {
                    if (var11 - arg7 == var9 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 + 1) == var10 && (this.field3103[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 - arg7) == var10 && (this.field3103[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 - arg7 == var9 && var12 >= var10 && var14 >= var12 && (this.field3103[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var14 >= var12 && (this.field3103[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field3103[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg7) == var10 && (this.field3103[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg7) == var10) {
                        return true;
                    }
                    if (var11 - arg7 == var9 && var12 >= var10 && var12 <= var14 && (this.field3103[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field3103[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    if (var11 - arg7 == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12 && (this.field3103[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 - arg7 == var10 && (this.field3103[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var11 - arg7) == var9 && var12 >= var10 && var12 <= var14 && (this.field3103[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 - arg7 == var10 && (this.field3103[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 - arg7 == var9 && var12 >= var10 && var12 <= var14 && (this.field3103[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 + 1 == var10 && (this.field3103[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 - arg7 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - arg7) == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 + 1 == var10 && (this.field3103[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var14 >= var12 && (this.field3103[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 - arg7 == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field3103[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 <= var11 && var13 >= var11 && var12 - arg7 == var10 && (this.field3103[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg7 == var9 && var12 >= var10 && var14 >= var12 && (this.field3103[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var12 >= var10 && var12 <= var14 && (this.field3103[var9][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        int var15 = 16 % ((arg4 + 16) / 55);
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIII)V")
    private final void method1179(int arg0, int arg1, int arg2, int arg3) {
        this.field3103[arg1][arg0] = class27.method220(this.field3103[arg1][arg0], ~arg2);
        field3111++;
        if (arg3 < 11) {
            this.method1177(37, -3, 91);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIZII)V")
    public final void method1180(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = 256;
        if (arg3) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field3120;
        int var9 = arg5 - this.field3105;
        if (arg4 != 1) {
            this.method1173(-96, 31, -18);
        }
        for (int var10 = var8; var10 < var8 + arg1; var10++) {
            if (var10 >= 0 && var10 < this.field3110) {
                for (int var11 = var9; var11 < (arg2 + var9); var11++) {
                    if (var11 >= 0 && this.field3113 > var11) {
                        this.method1167(arg4 ^ 0xFFFFFFFE, var10, var11, var7);
                    }
                }
            }
        }
        field3118++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLcc;)Z")
    public static final boolean method1181(byte arg0, class209 arg1) {
        field3117++;
        if (arg1 == null) {
            return false;
        } else if (arg0 == 22) {
            for (int var2 = 0; var2 < class3.field38; var2++) {
                if (arg1.method1483(class286.field5049[var2], (byte) -43)) {
                    return true;
                }
            }
            return arg1.method1483(class223.field4069.field2140, (byte) -58);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(II)V")
    public class170(int arg0, int arg1) {
        this.field3113 = arg1;
        this.field3110 = arg0;
        this.field3120 = 0;
        this.field3105 = 0;
        this.field3103 = new int[this.field3110][this.field3113];
        this.method1170((byte) -127);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)V")
    public final void method1182(int arg0, int arg1, int arg2) {
        int var4 = -72 / ((arg1 + 54) / 35);
        int var5 = arg2 - this.field3105;
        field3124++;
        int var6 = arg0 - this.field3120;
        this.field3103[var6][var5] = class6.method63(this.field3103[var6][var5], 262144);
    }
}
