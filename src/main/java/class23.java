import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class23 {

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Ljo;")
    public static class307 field362 = new class307("", 10);

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Lrl;")
    public static class672 field368 = new class672(80, 6);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[[I")
    public int[][] field351;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 3)
    public final void method374(int arg0) {
        if (arg0 != 32) {
            return;
        }
        for (int var2 = 0; var2 < this.field354; var2++) {
            for (int var3 = 0; var3 < this.field353; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field354 - 5 || this.field353 - 5 <= var3) {
                    this.field351[var2][var3] = -1;
                } else {
                    this.field351[var2][var3] = 2097152;
                }
            }
        }
        field352++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V", line = 35)
    public final void method375(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field361;
        int var5 = arg2 - this.field367;
        field369++;
        this.field351[var4][var5] = class453.method2846(this.field351[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIIIBZI)V", line = 52)
    public final void method376(boolean arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        if (arg4 != 61) {
            field368 = null;
        }
        field366++;
        int var8 = arg3 - this.field361;
        int var9 = arg6 - this.field367;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method390(1, var9, 128, var8);
                this.method390(1, var9, 8, var8 - 1);
            }
            if (arg1 == 1) {
                this.method390(arg4 ^ 0x3C, var9, 2, var8);
                this.method390(1, var9 + 1, 32, var8);
            }
            if (arg1 == 2) {
                this.method390(1, var9, 8, var8);
                this.method390(arg4 ^ 0x3C, var9, 128, var8 + 1);
            }
            if (arg1 == 3) {
                this.method390(1, var9, 32, var8);
                this.method390(arg4 - 60, var9 + -1, 2, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method390(1, var9, 1, var8);
                this.method390(1, var9 + 1, 16, var8 - 1);
            }
            if (arg1 == 1) {
                this.method390(1, var9, 4, var8);
                this.method390(1, var9 + 1, 64, var8 + 1);
            }
            if (arg1 == 2) {
                this.method390(1, var9, 16, var8);
                this.method390(1, var9 - 1, 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method390(1, var9, 64, var8);
                this.method390(1, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method390(1, var9, 130, var8);
                this.method390(1, var9, 8, var8 - 1);
                this.method390(1, var9 + 1, 32, var8);
            }
            if (arg1 == 1) {
                this.method390(arg4 ^ 0x3C, var9, 10, var8);
                this.method390(1, var9 + 1, 32, var8);
                this.method390(1, var9, 128, var8 + 1);
            }
            if (arg1 == 2) {
                this.method390(1, var9, 40, var8);
                this.method390(arg4 - 60, var9, 128, var8 + 1);
                this.method390(1, var9 - 1, 2, var8);
            }
            if (arg1 == 3) {
                this.method390(1, var9, 160, var8);
                this.method390(1, var9 - 1, 2, var8);
                this.method390(1, var9, 8, var8 - 1);
            }
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    this.method390(arg4 - 60, var9, 65536, var8);
                    this.method390(arg4 - 60, var9, 4096, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method390(arg4 - 60, var9, 1024, var8);
                    this.method390(1, var9 + 1, 16384, var8);
                }
                if (arg1 == 2) {
                    this.method390(1, var9, 4096, var8);
                    this.method390(1, var9, 65536, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method390(1, var9, 16384, var8);
                    this.method390(1, var9 - 1, 1024, var8);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg1 == 0) {
                    this.method390(arg4 - 60, var9, 512, var8);
                    this.method390(1, var9 + 1, 8192, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method390(1, var9, 2048, var8);
                    this.method390(arg4 ^ 0x3C, var9 + 1, 32768, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method390(1, var9, 8192, var8);
                    this.method390(1, var9 - 1, 512, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method390(1, var9, 32768, var8);
                    this.method390(1, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    this.method390(arg4 ^ 0x3C, var9, 66560, var8);
                    this.method390(1, var9, 4096, var8 - 1);
                    this.method390(1, var9 + 1, 16384, var8);
                }
                if (arg1 == 1) {
                    this.method390(1, var9, 5120, var8);
                    this.method390(arg4 - 60, var9 + 1, 16384, var8);
                    this.method390(arg4 ^ 0x3C, var9, 65536, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method390(arg4 ^ 0x3C, var9, 20480, var8);
                    this.method390(arg4 ^ 0x3C, var9, 65536, var8 + 1);
                    this.method390(arg4 ^ 0x3C, var9 - 1, 1024, var8);
                }
                if (arg1 == 3) {
                    this.method390(1, var9, 81920, var8);
                    this.method390(arg4 - 60, var9 + -1, 1024, var8);
                    this.method390(1, var9, 4096, var8 - 1);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method390(1, var9, 536870912, var8);
                this.method390(1, var9, 33554432, var8 - 1);
            }
            if (arg1 == 1) {
                this.method390(1, var9, 8388608, var8);
                this.method390(arg4 ^ 0x3C, var9 + 1, 134217728, var8);
            }
            if (arg1 == 2) {
                this.method390(1, var9, 33554432, var8);
                this.method390(arg4 ^ 0x3C, var9, 536870912, var8 + 1);
            }
            if (arg1 == 3) {
                this.method390(1, var9, 134217728, var8);
                this.method390(1, var9 - 1, 8388608, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method390(1, var9, 4194304, var8);
                this.method390(arg4 - 60, var9 - -1, 67108864, var8 - 1);
            }
            if (arg1 == 1) {
                this.method390(1, var9, 16777216, var8);
                this.method390(1, var9 + 1, 268435456, var8 + 1);
            }
            if (arg1 == 2) {
                this.method390(1, var9, 67108864, var8);
                this.method390(1, var9 - 1, 4194304, var8 + 1);
            }
            if (arg1 == 3) {
                this.method390(1, var9, 268435456, var8);
                this.method390(1, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method390(1, var9, 545259520, var8);
            this.method390(1, var9, 33554432, var8 - 1);
            this.method390(1, var9 + 1, 134217728, var8);
        }
        if (arg1 == 1) {
            this.method390(1, var9, 41943040, var8);
            this.method390(1, var9 + 1, 134217728, var8);
            this.method390(1, var9, 536870912, var8 + 1);
        }
        if (arg1 == 2) {
            this.method390(1, var9, 167772160, var8);
            this.method390(1, var9, 536870912, var8 + 1);
            this.method390(1, var9 - 1, 8388608, var8);
        }
        if (arg1 == 3) {
            this.method390(1, var9, 671088640, var8);
            this.method390(1, var9 - 1, 8388608, var8);
            this.method390(1, var9, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZIIZBI)V", line = 361)
    public final void method377(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        int var8 = arg2 - this.field367;
        int var9 = arg0 - this.field361;
        field365++;
        if (arg6 == 0) {
            if (arg3 == 0) {
                this.method388(var9, 128, var8, true);
                this.method388(var9 - 1, 8, var8, true);
            }
            if (arg3 == 1) {
                this.method388(var9, 2, var8, true);
                this.method388(var9, 32, var8 + 1, true);
            }
            if (arg3 == 2) {
                this.method388(var9, 8, var8, true);
                this.method388(var9 + 1, 128, var8, true);
            }
            if (arg3 == 3) {
                this.method388(var9, 32, var8, true);
                this.method388(var9, 2, var8 - 1, true);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg3 == 0) {
                this.method388(var9, 1, var8, true);
                this.method388(var9 - 1, 16, var8 + 1, true);
            }
            if (arg3 == 1) {
                this.method388(var9, 4, var8, true);
                this.method388(var9 + 1, 64, var8 + 1, true);
            }
            if (arg3 == 2) {
                this.method388(var9, 16, var8, true);
                this.method388(var9 + 1, 1, var8 - 1, true);
            }
            if (arg3 == 3) {
                this.method388(var9, 64, var8, true);
                this.method388(var9 - 1, 4, var8 - 1, true);
            }
        }
        if (arg6 == 2) {
            if (arg3 == 0) {
                this.method388(var9, 130, var8, true);
                this.method388(var9 - 1, 8, var8, true);
                this.method388(var9, 32, var8 + 1, true);
            }
            if (arg3 == 1) {
                this.method388(var9, 10, var8, true);
                this.method388(var9, 32, var8 + 1, true);
                this.method388(var9 + 1, 128, var8, true);
            }
            if (arg3 == 2) {
                this.method388(var9, 40, var8, true);
                this.method388(var9 + 1, 128, var8, true);
                this.method388(var9, 2, var8 - 1, true);
            }
            if (arg3 == 3) {
                this.method388(var9, 160, var8, true);
                this.method388(var9, 2, var8 - 1, true);
                this.method388(var9 - 1, 8, var8, true);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg3 == 0) {
                    this.method388(var9, 65536, var8, true);
                    this.method388(var9 - 1, 4096, var8, true);
                }
                if (arg3 == 1) {
                    this.method388(var9, 1024, var8, true);
                    this.method388(var9, 16384, var8 + 1, true);
                }
                if (arg3 == 2) {
                    this.method388(var9, 4096, var8, true);
                    this.method388(var9 + 1, 65536, var8, true);
                }
                if (arg3 == 3) {
                    this.method388(var9, 16384, var8, true);
                    this.method388(var9, 1024, var8 - 1, true);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg3 == 0) {
                    this.method388(var9, 512, var8, true);
                    this.method388(var9 - 1, 8192, var8 + 1, true);
                }
                if (arg3 == 1) {
                    this.method388(var9, 2048, var8, true);
                    this.method388(var9 + 1, 32768, var8 + 1, true);
                }
                if (arg3 == 2) {
                    this.method388(var9, 8192, var8, true);
                    this.method388(var9 + 1, 512, var8 - 1, true);
                }
                if (arg3 == 3) {
                    this.method388(var9, 32768, var8, true);
                    this.method388(var9 - 1, 2048, var8 - 1, true);
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    this.method388(var9, 66560, var8, true);
                    this.method388(var9 - 1, 4096, var8, true);
                    this.method388(var9, 16384, var8 + 1, true);
                }
                if (arg3 == 1) {
                    this.method388(var9, 5120, var8, true);
                    this.method388(var9, 16384, var8 + 1, true);
                    this.method388(var9 + 1, 65536, var8, true);
                }
                if (arg3 == 2) {
                    this.method388(var9, 20480, var8, true);
                    this.method388(var9 + 1, 65536, var8, true);
                    this.method388(var9, 1024, var8 - 1, true);
                }
                if (arg3 == 3) {
                    this.method388(var9, 81920, var8, true);
                    this.method388(var9, 1024, var8 - 1, true);
                    this.method388(var9 - 1, 4096, var8, true);
                }
            }
        }
        if (arg5 != 20) {
            this.method386(false, -97, 23, (byte) -111, true, 52, -76);
        }
        if (!arg1) {
            return;
        }
        if (arg6 == 0) {
            if (arg3 == 0) {
                this.method388(var9, 536870912, var8, true);
                this.method388(var9 - 1, 33554432, var8, true);
            }
            if (arg3 == 1) {
                this.method388(var9, 8388608, var8, true);
                this.method388(var9, 134217728, var8 + 1, true);
            }
            if (arg3 == 2) {
                this.method388(var9, 33554432, var8, true);
                this.method388(var9 + 1, 536870912, var8, true);
            }
            if (arg3 == 3) {
                this.method388(var9, 134217728, var8, true);
                this.method388(var9, 8388608, var8 - 1, true);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg3 == 0) {
                this.method388(var9, 4194304, var8, true);
                this.method388(var9 - 1, 67108864, var8 + 1, true);
            }
            if (arg3 == 1) {
                this.method388(var9, 16777216, var8, true);
                this.method388(var9 + 1, 268435456, var8 + 1, true);
            }
            if (arg3 == 2) {
                this.method388(var9, 67108864, var8, true);
                this.method388(var9 + 1, 4194304, var8 - 1, true);
            }
            if (arg3 == 3) {
                this.method388(var9, 268435456, var8, true);
                this.method388(var9 - 1, 16777216, var8 - 1, true);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method388(var9, 545259520, var8, true);
            this.method388(var9 - 1, 33554432, var8, true);
            this.method388(var9, 134217728, var8 + 1, true);
        }
        if (arg3 == 1) {
            this.method388(var9, 41943040, var8, true);
            this.method388(var9, 134217728, var8 + 1, true);
            this.method388(var9 + 1, 536870912, var8, true);
        }
        if (arg3 == 2) {
            this.method388(var9, 167772160, var8, true);
            this.method388(var9 + 1, 536870912, var8, true);
            this.method388(var9, 8388608, var8 - 1, true);
        }
        if (arg3 == 3) {
            this.method388(var9, 671088640, var8, true);
            this.method388(var9, 8388608, var8 - 1, true);
            this.method388(var9 - 1, 33554432, var8, true);
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V", line = 671)
    public final void method378(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field361;
        int var5 = arg1 - this.field367;
        if (arg0 != 3) {
            method383(-6, 98, 0.62558836F, -128, -0.44253606F, -0.017986149F, -39, 32);
        }
        field371++;
        this.field351[var4][var5] = class81.method769(this.field351[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BIIIIIIII)V", line = 692)
    public static final void method379(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 < 57) {
            method381(-24);
        }
        field372++;
        if (class107.method1016(arg1, (byte) 118)) {
            if (class575.field8192[arg1] == null) {
                class331.method2217(arg8, arg3, arg5, arg6, arg2, arg7, class564.field8105[arg1], -1, false, arg4);
            } else {
                class331.method2217(arg8, arg3, arg5, arg6, arg2, arg7, class575.field8192[arg1], -1, false, arg4);
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class532.field7753[var9] = true;
            }
        } else {
            class532.field7753[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)Z", line = 726)
    public final boolean method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field359++;
        int var11 = arg1 + arg7;
        int var12 = arg2 + arg8;
        int var13 = arg3 + arg9;
        if (arg5 != -1) {
            return false;
        }
        int var14 = arg0 + arg4;
        if (arg1 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg4 >= arg2 ? arg4 : arg2;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field351[var13 - this.field361 - 1][var15 - this.field367] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg3 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg4 >= arg2 ? arg4 : arg2;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field351[arg3 - this.field361][var17 - this.field367] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg2 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg3 < arg1 ? arg1 : arg3;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field351[var19 - this.field361][var14 - this.field367 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg1 <= arg3 ? arg3 : arg1;
            int var22 = var11 < var13 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field351[var21 - this.field361][arg4 - this.field367] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 820)
    public static void method381(int arg0) {
        field362 = null;
        field368 = null;
        if (arg0 != 4096) {
            field368 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZII)V", line = 831)
    public final void method382(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            int var4 = arg2 - this.field361;
            int var5 = arg1 - this.field367;
            field360++;
            this.field351[var4][var5] = class453.method2846(this.field351[var4][var5], -2097153);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIFIFFII)[F", line = 849)
    public static final float[] method383(int arg0, int arg1, float arg2, int arg3, float arg4, float arg5, int arg6, int arg7) {
        field374++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[8] = var10;
        var8[3] = 0.0F;
        var8[2] = var11;
        if (arg6 != -12160) {
            method379((byte) -94, -66, 33, -50, 79, 8, -44, 14, 77);
        }
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        var8[0] = var10;
        var8[6] = -var11;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg3 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + (arg7 * arg7)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg7) / var19;
                var15 = (float) arg1 / var19;
            }
            var13[0] = var14 * var14 * var18 + var16;
            var13[2] = var14 * var15 * var18;
            var13[7] = -var14 * var17;
            var13[6] = var14 * var15 * var18;
            var13[4] = var16;
            var13[5] = var14 * var17;
            var13[1] = var15 * var17;
            var13[3] = -var15 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[7] *= arg4;
        var9[1] *= arg5;
        var9[6] *= arg4;
        var9[8] *= arg4;
        var9[0] *= arg5;
        var9[4] *= arg2;
        var9[5] *= arg2;
        var9[2] *= arg5;
        var9[3] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIBIII)Z", line = 941)
    public final boolean method384(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field373++;
        if (arg5 > -108) {
            this.field351 = null;
        }
        if (arg4 > 1) {
            return class580.method3403(arg2, -124, arg6, arg4, arg8, arg0, arg1, arg4, arg7) ? true : this.method380(arg6, arg1, arg2, arg7, arg8, -1, arg3, arg4, arg4, arg0);
        }
        int var10 = arg7 + arg0 - 1;
        int var11 = arg6 + arg8 - 1;
        if (arg1 >= arg7 && var10 >= arg1 && arg2 >= arg8 && arg2 <= var11) {
            return true;
        } else if ((arg7 - 1) == arg1 && arg2 >= arg8 && var11 >= arg2 && (this.field351[arg1 - this.field361][arg2 - this.field367] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg2 >= arg8 && var11 >= arg2 && (this.field351[arg1 - this.field361][arg2 - this.field367] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if ((arg8 - 1) == arg2 && arg1 >= arg7 && var10 >= arg1 && (this.field351[arg1 - this.field361][arg2 - this.field367] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg2 && arg1 >= arg7 && arg1 <= var10 && (this.field351[arg1 - this.field361][arg2 - this.field367] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIII)Z", line = 986)
    public final boolean method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 121 / ((-arg4 - 56) / 62);
        field358++;
        if (arg6 == 1) {
            if (arg5 == arg7 && arg0 == arg1) {
                return true;
            }
        } else if (arg5 >= arg7 && arg7 - (1 - arg6) >= arg5 && arg0 >= arg0 && arg0 <= (arg0 + arg6 - 1)) {
            return true;
        }
        int var10 = arg7 - this.field361;
        int var11 = arg5 - this.field361;
        int var12 = arg1 - this.field367;
        int var13 = arg0 - this.field367;
        if (arg6 == 1) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    if (var11 - 1 == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var13 + 1 == var12 && (this.field351[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var13 - 1 == var12 && (this.field351[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 == var11 && var13 + 1 == var12) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var12 == var13 && (this.field351[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 == var13 && (this.field351[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 + 1) == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && (var13 + 1) == var12 && (this.field351[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var13 - 1 == var12 && (this.field351[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 == var11 && (var13 - 1) == var12) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var12 == var13 && (this.field351[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 == var13 && (this.field351[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    if ((var11 - 1) == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && (var13 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 == var13 && (this.field351[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var13 - 1 == var12 && (this.field351[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var11 - 1) == var10 && var12 == var13 && (this.field351[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var13 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var13 - 1 == var12 && (this.field351[var10][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - 1) == var10 && var12 == var13 && (this.field351[var10][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var13 + 1) == var12 && (this.field351[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var13 - 1 == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var11 - 1) == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && (var13 + 1) == var12 && (this.field351[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 == var13 && (this.field351[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var13 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 == var11 && (var13 + 1) == var12 && (this.field351[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var13 - 1) == var12 && (this.field351[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var12 == var13 && (this.field351[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var12 == var13 && (this.field351[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg6 + var10 - 1;
            int var15 = arg6 + var12 - 1;
            if (arg3 == 0) {
                if (arg2 == 0) {
                    if (var11 - arg6 == var10 && var12 <= var13 && var13 <= var15) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && var13 + 1 == var12 && (this.field351[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var13 - arg6 == var12 && (this.field351[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 <= var11 && var11 <= var14 && (var13 + 1) == var12) {
                        return true;
                    }
                    if ((var11 - arg6) == var10 && var12 <= var13 && var15 >= var13 && (this.field351[var14][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 <= var13 && var13 <= var15 && (this.field351[var10][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 + 1 == var10 && var12 <= var13 && var15 >= var13) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var13 + 1) == var12 && (this.field351[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && (var13 - arg6) == var12 && (this.field351[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 >= var10 && var11 <= var14 && (var13 - arg6) == var12) {
                        return true;
                    }
                    if (var11 - arg6 == var10 && var13 >= var12 && var13 <= var15 && (this.field351[var14][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var13 >= var12 && var15 >= var13 && (this.field351[var10][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    if (var11 - arg6 == var10 && var13 >= var12 && var15 >= var13) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && var13 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var13 >= var12 && var15 >= var13 && (this.field351[var10][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && var13 - arg6 == var12 && (this.field351[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - arg6 == var10 && var12 <= var13 && var13 <= var15 && (this.field351[var14][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && (var13 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var13 >= var12 && var13 <= var15) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && (var13 - arg6) == var12 && (this.field351[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - arg6) == var10 && var12 <= var13 && var15 >= var13 && (this.field351[var14][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var13 + 1 == var12 && (this.field351[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 <= var13 && var15 >= var13) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && (var13 - arg6) == var12) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 - arg6 == var10 && var12 <= var13 && var15 >= var13) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var13 + 1) == var12 && (this.field351[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var13 >= var12 && var15 >= var13 && (this.field351[var10][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var13 - arg6) == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var11 >= var10 && var14 >= var11 && var13 + 1 == var12 && (this.field351[var11][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var11 && var14 >= var11 && var13 - arg6 == var12 && (this.field351[var11][var15] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg6 == var10 && var13 >= var12 && var13 <= var15 && (this.field351[var14][var13] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var13 >= var12 && var15 >= var13 && (this.field351[var10][var13] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIIBZII)V", line = 1358)
    public final void method386(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        field357++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg3 != -90) {
            return;
        }
        if (arg4) {
            var8 |= 0x40000000;
        }
        int var9 = arg5 - this.field367;
        int var10 = arg2 - this.field361;
        for (int var11 = var10; var11 < (var10 + arg1); var11++) {
            if (var11 >= 0 && this.field354 > var11) {
                for (int var12 = var9; var12 < arg6 + var9; var12++) {
                    if (var12 >= 0 && this.field353 > var12) {
                        this.method390(1, var12, var8, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZZIIIII)V", line = 1403)
    public final void method387(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field356++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        int var10 = arg4 - this.field361;
        if (arg2) {
            var9 |= 0x40000000;
        }
        int var11 = arg0 - this.field367;
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg5;
            arg5 = arg3;
            arg3 = var12;
        }
        int var13 = -30 % ((15 - arg7) / 40);
        for (int var14 = var10; var14 < arg5 + var10; var14++) {
            if (var14 >= 0 && this.field354 > var14) {
                for (int var15 = var11; var15 < (arg3 + var11); var15++) {
                    if (var15 >= 0 && var15 < this.field353) {
                        this.method388(var14, var9, var15, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZ)V", line = 1457)
    private final void method388(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field351[arg0][arg2] = class453.method2846(this.field351[arg0][arg2], ~arg1);
            field363++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(III)V", line = 1469)
    public final void method389(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field361;
        int var5 = arg1 - this.field367;
        field370++;
        this.field351[var4][var5] = class81.method769(this.field351[var4][var5], 2097152);
        if (arg2 != -4906) {
            this.field351 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V", line = 1482)
    private final void method390(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            this.method387(-50, false, true, 76, 85, -88, -26, 75);
        }
        field355++;
        this.field351[arg3][arg1] = class81.method769(this.field351[arg3][arg1], arg2);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIIIIIII)Z", line = 1493)
    public final boolean method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field364++;
        if (arg0 == 1) {
            if (arg3 == arg7 && arg1 == arg5) {
                return true;
            }
        } else if (arg7 <= arg3 && (arg7 + arg0 - 1) >= arg3 && arg1 >= arg1 && arg1 + arg0 - 1 >= arg1) {
            return true;
        }
        int var9 = arg7 - this.field361;
        int var10 = arg5 - this.field367;
        if (arg4 != 12440) {
            return false;
        }
        int var11 = arg1 - this.field367;
        int var12 = arg3 - this.field361;
        if (arg0 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field351[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field351[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field351[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field351[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field351[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field351[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field351[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field351[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field351[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field351[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field351[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field351[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg0 - 1;
            int var14 = arg0 + var10 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var12 + 1) == var9 && var10 <= var11 && var14 >= var11 && (this.field351[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 - arg0) == var10 && (this.field351[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 - arg0 == var9 && var10 <= var11 && var14 >= var11 && (this.field351[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var11 - arg0 == var10 && (this.field351[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - arg0) == var9 && var10 <= var11 && var11 <= var14 && (this.field351[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var11 + 1 == var10 && (this.field351[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var12 + 1) == var9 && var10 <= var11 && var11 <= var14 && (this.field351[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 + 1) == var10 && (this.field351[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var12 >= var9 && var12 <= var13 && var11 + 1 == var10 && (this.field351[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var12 && var13 >= var12 && var11 - arg0 == var10 && (this.field351[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg0 == var9 && var11 >= var10 && var11 <= var14 && (this.field351[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 <= var11 && var14 >= var11 && (this.field351[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
