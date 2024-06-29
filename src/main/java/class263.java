import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class263 {

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "Lsb;")
    public static class305 field3278 = new class305(0, -1);

    @OriginalMember(owner = "client!jw", name = "s", descriptor = "[I")
    public static int[] field3288 = new int[1000];

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!jw", name = "t", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!jw", name = "u", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "[[I")
    public int[][] field3286;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3283++;
        if (arg0 == 1) {
            if (arg4 == arg6 && arg1 == arg7) {
                return true;
            }
        } else if (arg4 <= arg6 && arg6 <= (arg0 + arg4 - 1) && arg1 >= arg1 && arg1 <= (arg1 + arg0 - 1)) {
            return true;
        }
        int var9 = arg4 - this.field3289;
        if (arg5 != 9816) {
            return true;
        }
        int var10 = arg1 - this.field3274;
        int var11 = arg6 - this.field3289;
        int var12 = arg7 - this.field3274;
        if (arg0 == 1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3286[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field3286[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3286[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3286[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3286[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field3286[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3286[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3286[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field3286[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field3286[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field3286[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var9 - 1;
            int var14 = arg0 + var12 - 1;
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if ((var11 - arg0) == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field3286[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 - arg0 == var12 && (this.field3286[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 - arg0) == var9 && var12 <= var10 && var10 <= var14 && (this.field3286[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 >= var12 && var14 >= var10 && (this.field3286[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 + 1 == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12 && (this.field3286[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 - arg0 == var12 && (this.field3286[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 <= var11 && var13 >= var11 && var10 - arg0 == var12) {
                        return true;
                    }
                    if ((var11 - arg0) == var9 && var10 >= var12 && var14 >= var10 && (this.field3286[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var14 >= var10 && (this.field3286[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var11 - arg0 == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14 && (this.field3286[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 - arg0) == var12 && (this.field3286[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var11 - arg0) == var9 && var10 >= var12 && var10 <= var14 && (this.field3286[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg0 == var12 && (this.field3286[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - arg0) == var9 && var10 >= var12 && var14 >= var10 && (this.field3286[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var10 + 1) == var12 && (this.field3286[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 - arg0) == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var11 - arg0) == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12 && (this.field3286[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 >= var12 && var14 >= var10 && (this.field3286[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 - arg0 == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12 && (this.field3286[var11][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var11 && var11 <= var13 && var10 - arg0 == var12 && (this.field3286[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg0 == var9 && var12 <= var10 && var10 <= var14 && (this.field3286[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14 && (this.field3286[var9][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)V")
    public final void method1544(int arg0, int arg1, int arg2) {
        field3270++;
        int var4 = arg0 - this.field3274;
        int var5 = arg1 - this.field3289;
        this.field3286[var5][var4] = class105.method572(this.field3286[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIII)V")
    private final void method1545(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -104) {
            this.method1548(99, 63, (byte) -94);
        }
        field3279++;
        this.field3286[arg1][arg2] = class422.method2436(this.field3286[arg1][arg2], arg0);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBIZIIZ)V")
    public final void method1546(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field3291++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        if (arg1 != 104) {
            return;
        }
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var9 = arg5 - this.field3274;
        int var10 = arg4 - this.field3289;
        for (int var11 = var10; var11 < arg0 + var10; var11++) {
            if (var11 >= 0 && this.field3287 > var11) {
                for (int var12 = var9; var12 < (var9 + arg2); var12++) {
                    if (var12 >= 0 && this.field3271 > var12) {
                        this.method1545(var8, var11, var12, arg1 - 224);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZZBIIII)V")
    public final void method1547(int arg0, boolean arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field3284++;
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        if (arg7 == 1 || arg7 == 3) {
            int var10 = arg0;
            arg0 = arg6;
            arg6 = var10;
        }
        if (arg1) {
            var9 |= 0x40000000;
        }
        int var11 = arg4 - this.field3289;
        int var12 = arg5 - this.field3274;
        if (arg3 < 72) {
            this.field3287 = -38;
        }
        for (int var13 = var11; var13 < arg0 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field3287) {
                for (int var14 = var12; var14 < (arg6 + var12); var14++) {
                    if (var14 >= 0 && var14 < this.field3271) {
                        this.method1553(28835, var13, var9, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIB)V")
    public final void method1548(int arg0, int arg1, byte arg2) {
        field3277++;
        if (arg2 == 49) {
            int var4 = arg1 - this.field3274;
            int var5 = arg0 - this.field3289;
            this.field3286[var5][var4] = class422.method2436(this.field3286[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIZZ)V")
    public final void method1549(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field3272++;
        int var8 = arg3 - this.field3274;
        int var9 = arg2 - this.field3289;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method1545(128, var9, var8, -109);
                this.method1545(8, var9 - 1, var8, -122);
            }
            if (arg1 == 1) {
                this.method1545(2, var9, var8, -105);
                this.method1545(32, var9, var8 + 1, -111);
            }
            if (arg1 == 2) {
                this.method1545(8, var9, var8, arg0 - 536871022);
                this.method1545(128, var9 + 1, var8, -127);
            }
            if (arg1 == 3) {
                this.method1545(32, var9, var8, -110);
                this.method1545(2, var9, var8 - 1, -123);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method1545(1, var9, var8, arg0 - 536871030);
                this.method1545(16, var9 - 1, var8 - -1, -111);
            }
            if (arg1 == 1) {
                this.method1545(4, var9, var8, -114);
                this.method1545(64, var9 + 1, var8 - -1, arg0 - 536871040);
            }
            if (arg1 == 2) {
                this.method1545(16, var9, var8, -106);
                this.method1545(1, var9 + 1, var8 - 1, -121);
            }
            if (arg1 == 3) {
                this.method1545(64, var9, var8, -114);
                this.method1545(4, var9 - 1, var8 + -1, -114);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method1545(130, var9, var8, -110);
                this.method1545(8, var9 - 1, var8, arg0 - 536871030);
                this.method1545(32, var9, var8 + 1, arg0 + -536871024);
            }
            if (arg1 == 1) {
                this.method1545(10, var9, var8, -110);
                this.method1545(32, var9, var8 + 1, -115);
                this.method1545(128, var9 + 1, var8, arg0 - 536871033);
            }
            if (arg1 == 2) {
                this.method1545(40, var9, var8, arg0 ^ 0xDFFFFF8A);
                this.method1545(128, var9 + 1, var8, -113);
                this.method1545(2, var9, var8 - 1, arg0 + -536871040);
            }
            if (arg1 == 3) {
                this.method1545(160, var9, var8, arg0 ^ 0xDFFFFF93);
                this.method1545(2, var9, var8 - 1, -126);
                this.method1545(8, var9 - 1, var8, arg0 - 536871040);
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg1 == 0) {
                    this.method1545(65536, var9, var8, -125);
                    this.method1545(4096, var9 - 1, var8, -118);
                }
                if (arg1 == 1) {
                    this.method1545(1024, var9, var8, -120);
                    this.method1545(16384, var9, var8 + 1, -115);
                }
                if (arg1 == 2) {
                    this.method1545(4096, var9, var8, -124);
                    this.method1545(65536, var9 + 1, var8, -110);
                }
                if (arg1 == 3) {
                    this.method1545(16384, var9, var8, arg0 ^ 0xDFFFFF95);
                    this.method1545(1024, var9, var8 - 1, arg0 + -536871036);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg1 == 0) {
                    this.method1545(512, var9, var8, arg0 - 536871033);
                    this.method1545(8192, var9 - 1, var8 + 1, -121);
                }
                if (arg1 == 1) {
                    this.method1545(2048, var9, var8, arg0 ^ 0xDFFFFF8A);
                    this.method1545(32768, var9 + 1, var8 + 1, -106);
                }
                if (arg1 == 2) {
                    this.method1545(8192, var9, var8, -120);
                    this.method1545(512, var9 + 1, var8 - 1, -124);
                }
                if (arg1 == 3) {
                    this.method1545(32768, var9, var8, -117);
                    this.method1545(2048, var9 - 1, var8 + -1, -125);
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    this.method1545(66560, var9, var8, -122);
                    this.method1545(4096, var9 - 1, var8, arg0 ^ 0xDFFFFF8A);
                    this.method1545(16384, var9, var8 + 1, -119);
                }
                if (arg1 == 1) {
                    this.method1545(5120, var9, var8, -117);
                    this.method1545(16384, var9, var8 + 1, arg0 + -536871018);
                    this.method1545(65536, var9 + 1, var8, -119);
                }
                if (arg1 == 2) {
                    this.method1545(20480, var9, var8, arg0 - 536871033);
                    this.method1545(65536, var9 + 1, var8, arg0 - 536871022);
                    this.method1545(1024, var9, var8 - 1, -106);
                }
                if (arg1 == 3) {
                    this.method1545(81920, var9, var8, arg0 ^ 0xDFFFFF87);
                    this.method1545(1024, var9, var8 - 1, arg0 + -536871037);
                    this.method1545(4096, var9 - 1, var8, arg0 ^ 0xDFFFFF84);
                }
            }
        }
        if (arg0 != 536870912) {
            field3278 = null;
        }
        if (!arg6) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method1545(536870912, var9, var8, arg0 - 536871021);
                this.method1545(33554432, var9 - 1, var8, -113);
            }
            if (arg1 == 1) {
                this.method1545(8388608, var9, var8, -112);
                this.method1545(134217728, var9, var8 + 1, -125);
            }
            if (arg1 == 2) {
                this.method1545(33554432, var9, var8, arg0 - 536871024);
                this.method1545(536870912, var9 + 1, var8, -122);
            }
            if (arg1 == 3) {
                this.method1545(134217728, var9, var8, -107);
                this.method1545(8388608, var9, var8 - 1, -127);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method1545(4194304, var9, var8, -119);
                this.method1545(67108864, var9 - 1, var8 - -1, -115);
            }
            if (arg1 == 1) {
                this.method1545(16777216, var9, var8, -128);
                this.method1545(268435456, var9 + 1, var8 + 1, arg0 - 536871023);
            }
            if (arg1 == 2) {
                this.method1545(67108864, var9, var8, -117);
                this.method1545(4194304, var9 + 1, var8 + -1, -105);
            }
            if (arg1 == 3) {
                this.method1545(268435456, var9, var8, arg0 - 536871022);
                this.method1545(16777216, var9 - 1, var8 - 1, arg0 ^ 0xDFFFFF8F);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1545(545259520, var9, var8, arg0 ^ 0xDFFFFF81);
            this.method1545(33554432, var9 - 1, var8, -124);
            this.method1545(134217728, var9, var8 + 1, -113);
        }
        if (arg1 == 1) {
            this.method1545(41943040, var9, var8, -124);
            this.method1545(134217728, var9, var8 + 1, -122);
            this.method1545(536870912, var9 + 1, var8, -118);
        }
        if (arg1 == 2) {
            this.method1545(167772160, var9, var8, -115);
            this.method1545(536870912, var9 + 1, var8, -126);
            this.method1545(8388608, var9, var8 - 1, arg0 + -536871029);
        }
        if (arg1 == 3) {
            this.method1545(671088640, var9, var8, -126);
            this.method1545(8388608, var9, var8 - 1, arg0 + -536871019);
            this.method1545(33554432, var9 - 1, var8, -109);
            return;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZIZIII)V")
    public final void method1550(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -28591) {
            return;
        }
        int var8 = arg2 - this.field3274;
        int var9 = arg4 - this.field3289;
        field3285++;
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method1553(28835, var9, 128, var8);
                this.method1553(28835, var9 - 1, 8, var8);
            }
            if (arg0 == 1) {
                this.method1553(28835, var9, 2, var8);
                this.method1553(28835, var9, 32, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1553(28835, var9, 8, var8);
                this.method1553(arg5 + 57426, var9 + 1, 128, var8);
            }
            if (arg0 == 3) {
                this.method1553(28835, var9, 32, var8);
                this.method1553(arg5 ^ 0xFFFFE0F2, var9, 2, var8 - 1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method1553(28835, var9, 1, var8);
                this.method1553(arg5 ^ 0xFFFFE0F2, var9 - 1, 16, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1553(arg5 ^ 0xFFFFE0F2, var9, 4, var8);
                this.method1553(28835, var9 + 1, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1553(28835, var9, 16, var8);
                this.method1553(28835, var9 + 1, 1, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1553(28835, var9, 64, var8);
                this.method1553(28835, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                this.method1553(arg5 + 57426, var9, 130, var8);
                this.method1553(arg5 ^ 0xFFFFE0F2, var9 - 1, 8, var8);
                this.method1553(28835, var9, 32, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1553(28835, var9, 10, var8);
                this.method1553(28835, var9, 32, var8 + 1);
                this.method1553(28835, var9 + 1, 128, var8);
            }
            if (arg0 == 2) {
                this.method1553(28835, var9, 40, var8);
                this.method1553(28835, var9 + 1, 128, var8);
                this.method1553(28835, var9, 2, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1553(arg5 ^ 0xFFFFE0F2, var9, 160, var8);
                this.method1553(28835, var9, 2, var8 - 1);
                this.method1553(28835, var9 - 1, 8, var8);
            }
        }
        if (arg3) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method1553(28835, var9, 65536, var8);
                    this.method1553(28835, var9 - 1, 4096, var8);
                }
                if (arg0 == 1) {
                    this.method1553(28835, var9, 1024, var8);
                    this.method1553(28835, var9, 16384, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1553(28835, var9, 4096, var8);
                    this.method1553(28835, var9 + 1, 65536, var8);
                }
                if (arg0 == 3) {
                    this.method1553(28835, var9, 16384, var8);
                    this.method1553(28835, var9, 1024, var8 - 1);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method1553(28835, var9, 512, var8);
                    this.method1553(28835, var9 - 1, 8192, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1553(28835, var9, 2048, var8);
                    this.method1553(arg5 + 57426, var9 + 1, 32768, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1553(28835, var9, 8192, var8);
                    this.method1553(28835, var9 + 1, 512, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method1553(arg5 ^ 0xFFFFE0F2, var9, 32768, var8);
                    this.method1553(arg5 ^ 0xFFFFE0F2, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method1553(28835, var9, 66560, var8);
                    this.method1553(28835, var9 - 1, 4096, var8);
                    this.method1553(28835, var9, 16384, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1553(28835, var9, 5120, var8);
                    this.method1553(28835, var9, 16384, var8 + 1);
                    this.method1553(28835, var9 + 1, 65536, var8);
                }
                if (arg0 == 2) {
                    this.method1553(arg5 + 57426, var9, 20480, var8);
                    this.method1553(arg5 ^ 0xFFFFE0F2, var9 + 1, 65536, var8);
                    this.method1553(arg5 ^ 0xFFFFE0F2, var9, 1024, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method1553(28835, var9, 81920, var8);
                    this.method1553(arg5 + 57426, var9, 1024, var8 - 1);
                    this.method1553(28835, var9 - 1, 4096, var8);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method1553(28835, var9, 536870912, var8);
                this.method1553(28835, var9 - 1, 33554432, var8);
            }
            if (arg0 == 1) {
                this.method1553(28835, var9, 8388608, var8);
                this.method1553(28835, var9, 134217728, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1553(28835, var9, 33554432, var8);
                this.method1553(28835, var9 + 1, 536870912, var8);
            }
            if (arg0 == 3) {
                this.method1553(arg5 ^ 0xFFFFE0F2, var9, 134217728, var8);
                this.method1553(28835, var9, 8388608, var8 - 1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method1553(arg5 + 57426, var9, 4194304, var8);
                this.method1553(28835, var9 - 1, 67108864, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1553(28835, var9, 16777216, var8);
                this.method1553(28835, var9 + 1, 268435456, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1553(28835, var9, 67108864, var8);
                this.method1553(28835, var9 + 1, 4194304, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1553(arg5 ^ 0xFFFFE0F2, var9, 268435456, var8);
                this.method1553(arg5 ^ 0xFFFFE0F2, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1553(28835, var9, 545259520, var8);
            this.method1553(28835, var9 - 1, 33554432, var8);
            this.method1553(28835, var9, 134217728, var8 + 1);
        }
        if (arg0 == 1) {
            this.method1553(arg5 + 57426, var9, 41943040, var8);
            this.method1553(28835, var9, 134217728, var8 + 1);
            this.method1553(arg5 + 57426, var9 + 1, 536870912, var8);
        }
        if (arg0 == 2) {
            this.method1553(28835, var9, 167772160, var8);
            this.method1553(arg5 ^ 0xFFFFE0F2, var9 + 1, 536870912, var8);
            this.method1553(28835, var9, 8388608, var8 - 1);
        }
        if (arg0 == 3) {
            this.method1553(28835, var9, 671088640, var8);
            this.method1553(28835, var9, 8388608, var8 - 1);
            this.method1553(28835, var9 - 1, 33554432, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZI)V")
    public final void method1551(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field3274;
        if (arg1) {
            field3288 = null;
        }
        int var5 = arg2 - this.field3289;
        field3280++;
        this.field3286[var5][var4] = class105.method572(this.field3286[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method1552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3290++;
        int var11 = arg1 + arg9;
        int var12 = arg4 + arg7;
        int var13 = arg0 + arg6;
        if (arg8 >= -27) {
            this.method1548(-21, 92, (byte) -127);
        }
        int var14 = arg3 + arg5;
        if (arg1 == var13 && (arg2 & 0x2) == 0) {
            int var15 = arg7 <= arg3 ? arg3 : arg7;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field3286[var13 - this.field3289 - 1][var15 - this.field3274] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg2 & 0x8) == 0) {
            int var17 = arg3 >= arg7 ? arg3 : arg7;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field3286[arg0 - this.field3289][var17 - this.field3274] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg2 & 0x1) == 0) {
            int var19 = arg1 > arg0 ? arg1 : arg0;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field3286[var19 - this.field3289][var14 - this.field3274 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg2 & 0x4) == 0) {
            int var21 = arg1 <= arg0 ? arg0 : arg1;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field3286[var21 - this.field3289][arg3 - this.field3274] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(IIII)V")
    private final void method1553(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 28835) {
            this.method1557((byte) 92);
        }
        field3275++;
        this.field3286[arg1][arg3] = class105.method572(this.field3286[arg1][arg3], ~arg2);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V")
    public static void method1554(byte arg0) {
        if (arg0 != 76) {
            field3278 = null;
        }
        field3288 = null;
        field3278 = null;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3281++;
        if (arg4 > 1) {
            return class248.method1461(arg1, arg4, arg3, arg0, arg8, arg7, (byte) 116, arg4, arg2) ? true : this.method1552(arg3, arg2, arg6, arg8, arg4, arg1, arg0, arg7, -120, arg4);
        }
        int var10 = arg3 + arg0 - 1;
        int var11 = arg1 + arg8 - arg5;
        if (arg3 <= arg2 && var10 >= arg2 && arg7 >= arg8 && var11 >= arg7) {
            return true;
        } else if ((arg3 - 1) == arg2 && arg7 >= arg8 && var11 >= arg7 && (this.field3286[arg2 - this.field3289][arg7 - this.field3274] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg2 && arg8 <= arg7 && var11 >= arg7 && (this.field3286[arg2 - this.field3289][arg7 - this.field3274] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if ((arg8 - 1) == arg7 && arg2 >= arg3 && var10 >= arg2 && (this.field3286[arg2 - this.field3289][arg7 - this.field3274] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg7 && arg2 >= arg3 && arg2 <= var10 && (this.field3286[arg2 - this.field3289][arg7 - this.field3274] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBI)V")
    public final void method1556(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field3289;
        field3282++;
        int var5 = arg2 - this.field3274;
        if (arg1 >= -122) {
            this.method1547(86, true, true, (byte) -52, -107, -90, -53, 38);
        }
        this.field3286[var4][var5] = class422.method2436(this.field3286[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
    public final void method1557(byte arg0) {
        field3273++;
        if (arg0 != 44) {
            this.method1550(66, true, -15, false, -3, -124, 94);
        }
        for (int var2 = 0; var2 < this.field3287; var2++) {
            for (int var3 = 0; var3 < this.field3271; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field3287 - 5) || var3 >= (this.field3271 - 5)) {
                    this.field3286[var2][var3] = -1;
                } else {
                    this.field3286[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method1558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3276++;
        if (arg5 == 1) {
            if (arg1 == arg4 && arg6 == arg7) {
                return true;
            }
        } else if (arg4 <= arg1 && arg1 <= arg4 + arg5 - 1 && arg7 >= arg7 && (arg5 + arg7 - 1) >= arg7) {
            return true;
        }
        int var9 = arg4 - this.field3289;
        int var10 = arg1 - this.field3289;
        int var11 = arg7 - this.field3274;
        int var12 = 66 / ((-arg2 - 57) / 44);
        int var13 = arg6 - this.field3274;
        if (arg5 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var10 + 1) == var9 && var11 == var13 && (this.field3286[var9][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var13 && (this.field3286[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var9 && var11 == var13 && (this.field3286[var9][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var13 && (this.field3286[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - 1) == var9 && var11 == var13 && (this.field3286[var9][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var13 && (this.field3286[var9][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 + 1 == var9 && var11 == var13 && (this.field3286[var9][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var13 && (this.field3286[var9][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var10 && var11 + 1 == var13 && (this.field3286[var9][var13] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var13 && (this.field3286[var9][var13] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var13 && (this.field3286[var9][var13] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var13 && (this.field3286[var9][var13] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var9 + arg5 - 1;
            int var15 = var13 + arg5 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var10 + 1) == var9 && var13 <= var11 && var15 >= var11 && (this.field3286[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var14 && (var11 - arg5) == var13 && (this.field3286[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - arg5) == var9 && var11 >= var13 && var11 <= var15 && (this.field3286[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var14 >= var10 && (var11 - arg5) == var13 && (this.field3286[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - arg5 == var9 && var13 <= var11 && var11 <= var15 && (this.field3286[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var14 && var11 + 1 == var13 && (this.field3286[var10][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 + 1 == var9 && var11 >= var13 && var11 <= var15 && (this.field3286[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var14 >= var10 && var11 + 1 == var13 && (this.field3286[var10][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 >= var9 && var14 >= var10 && var11 + 1 == var13 && (this.field3286[var10][var13] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var10 && var10 <= var14 && var11 - arg5 == var13 && (this.field3286[var10][var15] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg5) == var9 && var11 >= var13 && var15 >= var11 && (this.field3286[var14][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 >= var13 && var15 >= var11 && (this.field3286[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
