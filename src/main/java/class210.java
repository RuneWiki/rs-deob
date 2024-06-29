import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class210 {

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    private int field3867 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    private int field3845;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    private int field3848;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[[I")
    public int[][] field3853;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field3856 = 2301979;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static volatile int field3843 = 0;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field3841 = 50;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Lmb;")
    public static class132 field3859 = class166.method1092("Fps:", 113);

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "Lmb;")
    private static class132 field3864 = class166.method1092(" seconds)3", 116);

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public static int field3862 = -1;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Lmb;")
    public static class132 field3868 = field3864;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "B")
    public static byte field3837;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Log;")
    public static class159 field3854;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIZ)V")
    public final void method1293(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg2 - this.field3867;
        field3857++;
        int var8 = arg4 - this.field3861;
        if (~arg1 == arg0) {
            if (arg3 == 0) {
                this.method1299(var7, 128, var8, -70);
                this.method1299(var7 - 1, 8, var8, -15);
            }
            if (arg3 == 1) {
                this.method1299(var7, 2, var8, -100);
                this.method1299(var7, 32, var8 + 1, -35);
            }
            if (arg3 == 2) {
                this.method1299(var7, 8, var8, arg0 ^ 0x6D);
                this.method1299(var7 + 1, 128, var8, -26);
            }
            if (arg3 == 3) {
                this.method1299(var7, 32, var8, -40);
                this.method1299(var7, 2, var8 - 1, -81);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method1299(var7, 1, var8, -80);
                this.method1299(var7 - 1, 16, var8 + 1, -5);
            }
            if (arg3 == 1) {
                this.method1299(var7, 4, var8, -19);
                this.method1299(var7 + 1, 64, var8 + 1, -64);
            }
            if (arg3 == 2) {
                this.method1299(var7, 16, var8, -47);
                this.method1299(var7 + 1, 1, var8 - 1, -112);
            }
            if (arg3 == 3) {
                this.method1299(var7, 64, var8, arg0 ^ 0x6E);
                this.method1299(var7 - 1, 4, var8 - 1, arg0 ^ 0x4A);
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                this.method1299(var7, 130, var8, -111);
                this.method1299(var7 - 1, 8, var8, -43);
                this.method1299(var7, 32, var8 + 1, arg0 ^ 0x34);
            }
            if (arg3 == 1) {
                this.method1299(var7, 10, var8, arg0 - 62);
                this.method1299(var7, 32, var8 + 1, -21);
                this.method1299(var7 + 1, 128, var8, -110);
            }
            if (arg3 == 2) {
                this.method1299(var7, 40, var8, -70);
                this.method1299(var7 + 1, 128, var8, arg0 - 120);
                this.method1299(var7, 2, var8 - 1, -21);
            }
            if (arg3 == 3) {
                this.method1299(var7, 160, var8, -101);
                this.method1299(var7, 2, var8 - 1, -57);
                this.method1299(var7 - 1, 8, var8, arg0 - 96);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method1299(var7, 65536, var8, -40);
                this.method1299(var7 - 1, 4096, var8, arg0 - 86);
            }
            if (arg3 == 1) {
                this.method1299(var7, 1024, var8, -40);
                this.method1299(var7, 16384, var8 + 1, -71);
            }
            if (arg3 == 2) {
                this.method1299(var7, 4096, var8, arg0 - 38);
                this.method1299(var7 + 1, 65536, var8, -119);
            }
            if (arg3 == 3) {
                this.method1299(var7, 16384, var8, arg0 - 33);
                this.method1299(var7, 1024, var8 - 1, arg0 + -56);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method1299(var7, 512, var8, arg0 - 10);
                this.method1299(var7 - 1, 8192, var8 + 1, arg0 + -36);
            }
            if (arg3 == 1) {
                this.method1299(var7, 2048, var8, -96);
                this.method1299(var7 + 1, 32768, var8 + 1, arg0 + -30);
            }
            if (arg3 == 2) {
                this.method1299(var7, 8192, var8, arg0 - 24);
                this.method1299(var7 + 1, 512, var8 - 1, -18);
            }
            if (arg3 == 3) {
                this.method1299(var7, 32768, var8, -112);
                this.method1299(var7 - 1, 2048, var8 - 1, -85);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1299(var7, 66560, var8, -94);
            this.method1299(var7 - 1, 4096, var8, arg0 - 27);
            this.method1299(var7, 16384, var8 + 1, -128);
        }
        if (arg3 == 1) {
            this.method1299(var7, 5120, var8, arg0 - 7);
            this.method1299(var7, 16384, var8 + 1, -82);
            this.method1299(var7 + 1, 65536, var8, -109);
        }
        if (arg3 == 2) {
            this.method1299(var7, 20480, var8, -123);
            this.method1299(var7 + 1, 65536, var8, arg0 - 56);
            this.method1299(var7, 1024, var8 - 1, -51);
        }
        if (arg3 == 3) {
            this.method1299(var7, 81920, var8, arg0 ^ 0x3D);
            this.method1299(var7, 1024, var8 - 1, arg0 + -84);
            this.method1299(var7 - 1, 4096, var8, -5);
            return;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
    public static final void method1294(int arg0, int arg1) {
        if (class39.field633 == 0) {
            class34.field556.method155(true, arg1);
        } else {
            class52.field881 = arg1;
        }
        field3839++;
        int var2 = 47 % ((-arg0 - 62) / 60);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIZB)V")
    public final void method1295(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var7 = arg3 - this.field3861;
        field3860++;
        int var8 = 256;
        int var9 = arg1 - this.field3867;
        if (arg4) {
            var8 += 131072;
        }
        if (arg5 != -58) {
            return;
        }
        for (int var10 = var9; var10 < var9 + arg0; var10++) {
            if (var10 >= 0 && this.field3848 > var10) {
                for (int var11 = var7; var11 < arg2 + var7; var11++) {
                    if (var11 >= 0 && this.field3845 > var11) {
                        this.method1299(var10, var8, var11, arg5 + 36);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3852++;
        if (arg5 > -104) {
            this.field3845 = 15;
        }
        int var9 = arg4 + arg3 - 1;
        int var10 = arg2 + arg0 - 1;
        if (arg7 >= arg4 && arg7 <= var9 && arg6 >= arg2 && var10 >= arg6) {
            return true;
        } else if (arg4 - 1 == arg7 && arg6 >= arg2 && var10 >= arg6 && (this.field3853[arg7 - this.field3867][arg6 - this.field3861] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg6 >= arg2 && var10 >= arg6 && (this.field3853[arg7 - this.field3867][arg6 - this.field3861] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg6 && arg7 >= arg4 && var9 >= arg7 && (this.field3853[arg7 - this.field3867][arg6 - this.field3861] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg6 && arg4 <= arg7 && arg7 <= var9 && (this.field3853[arg7 - this.field3867][arg6 - this.field3861] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
    private final void method1297(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 8192) {
            field3854 = null;
        }
        this.field3853[arg2][arg3] = class75.method450(this.field3853[arg2][arg3], ~arg1);
        field3866++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZIIII)V")
    public final void method1298(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3858++;
        int var8 = arg3 - this.field3867;
        int var9 = arg0 - this.field3861;
        int var10 = 256;
        if (arg2) {
            var10 += 131072;
        }
        if (arg6 != 6229) {
            return;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg1;
            arg1 = arg4;
            arg4 = var11;
        }
        for (int var12 = var8; var12 < arg1 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field3848) {
                for (int var13 = var9; var13 < arg4 + var9; var13++) {
                    if (var13 >= 0 && this.field3845 > var13) {
                        this.method1297(8192, var10, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIII)V")
    private final void method1299(int arg0, int arg1, int arg2, int arg3) {
        this.field3853[arg0][arg2] = class219.method1368(this.field3853[arg0][arg2], arg1);
        field3844++;
        if (arg3 > -4) {
            method1309(false, 92);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1300(byte arg0) {
        field3868 = null;
        field3864 = null;
        field3859 = null;
        if (arg0 != 78) {
            field3864 = null;
        }
        field3854 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method1301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3840++;
        if (arg1 != 22532) {
            return true;
        } else if (arg4 == arg5 && arg3 == arg6) {
            return true;
        } else {
            int var8 = arg5 - this.field3867;
            int var9 = arg6 - this.field3861;
            int var10 = arg3 - this.field3861;
            int var11 = arg4 - this.field3867;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var8 + 1 == var11 && var9 == var10 && (this.field3853[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var11 && var9 - 1 == var10 && (this.field3853[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var8 - 1 == var11 && var9 == var10 && (this.field3853[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var11 && var9 - 1 == var10 && (this.field3853[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var8 - 1 == var11 && var9 == var10 && (this.field3853[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var11 && var9 + 1 == var10 && (this.field3853[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var8 + 1 == var11 && var9 == var10 && (this.field3853[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var11 && var9 + 1 == var10 && (this.field3853[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var8 == var11 && var9 + 1 == var10 && (this.field3853[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field3853[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var8 - 1 == var11 && var9 == var10 && (this.field3853[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field3853[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIB)V")
    public final void method1302(int arg0, int arg1, byte arg2) {
        field3846++;
        int var4 = arg0 - this.field3867;
        int var5 = arg1 - this.field3861;
        if (arg2 > -94) {
            field3868 = null;
        }
        this.field3853[var4][var5] = class219.method1368(this.field3853[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIBIII)V")
    public final void method1303(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field3867;
        field3842++;
        int var8 = arg5 - this.field3861;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method1297(8192, 128, var7, var8);
                this.method1297(8192, 8, var7 - 1, var8);
            }
            if (arg1 == 1) {
                this.method1297(8192, 2, var7, var8);
                this.method1297(8192, 32, var7, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1297(8192, 8, var7, var8);
                this.method1297(8192, 128, var7 + 1, var8);
            }
            if (arg1 == 3) {
                this.method1297(8192, 32, var7, var8);
                this.method1297(8192, 2, var7, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method1297(8192, 1, var7, var8);
                this.method1297(8192, 16, var7 - 1, var8 + 1);
            }
            if (arg1 == 1) {
                this.method1297(8192, 4, var7, var8);
                this.method1297(8192, 64, var7 + 1, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1297(8192, 16, var7, var8);
                this.method1297(8192, 1, var7 + 1, var8 + -1);
            }
            if (arg1 == 3) {
                this.method1297(8192, 64, var7, var8);
                this.method1297(8192, 4, var7 - 1, var8 + -1);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method1297(8192, 130, var7, var8);
                this.method1297(8192, 8, var7 - 1, var8);
                this.method1297(8192, 32, var7, var8 + 1);
            }
            if (arg1 == 1) {
                this.method1297(8192, 10, var7, var8);
                this.method1297(8192, 32, var7, var8 + 1);
                this.method1297(8192, 128, var7 + 1, var8);
            }
            if (arg1 == 2) {
                this.method1297(8192, 40, var7, var8);
                this.method1297(8192, 128, var7 + 1, var8);
                this.method1297(8192, 2, var7, var8 - 1);
            }
            if (arg1 == 3) {
                this.method1297(8192, 160, var7, var8);
                this.method1297(8192, 2, var7, var8 - 1);
                this.method1297(8192, 8, var7 - 1, var8);
            }
        }
        if (arg0) {
            if (arg4 == 0) {
                if (arg1 == 0) {
                    this.method1297(8192, 65536, var7, var8);
                    this.method1297(8192, 4096, var7 - 1, var8);
                }
                if (arg1 == 1) {
                    this.method1297(8192, 1024, var7, var8);
                    this.method1297(8192, 16384, var7, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method1297(8192, 4096, var7, var8);
                    this.method1297(8192, 65536, var7 + 1, var8);
                }
                if (arg1 == 3) {
                    this.method1297(8192, 16384, var7, var8);
                    this.method1297(8192, 1024, var7, var8 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg1 == 0) {
                    this.method1297(8192, 512, var7, var8);
                    this.method1297(8192, 8192, var7 - 1, var8 + 1);
                }
                if (arg1 == 1) {
                    this.method1297(8192, 2048, var7, var8);
                    this.method1297(8192, 32768, var7 + 1, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method1297(8192, 8192, var7, var8);
                    this.method1297(8192, 512, var7 + 1, var8 + -1);
                }
                if (arg1 == 3) {
                    this.method1297(8192, 32768, var7, var8);
                    this.method1297(8192, 2048, var7 - 1, var8 + -1);
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    this.method1297(8192, 66560, var7, var8);
                    this.method1297(8192, 4096, var7 - 1, var8);
                    this.method1297(8192, 16384, var7, var8 + 1);
                }
                if (arg1 == 1) {
                    this.method1297(8192, 5120, var7, var8);
                    this.method1297(8192, 16384, var7, var8 + 1);
                    this.method1297(8192, 65536, var7 + 1, var8);
                }
                if (arg1 == 2) {
                    this.method1297(8192, 20480, var7, var8);
                    this.method1297(8192, 65536, var7 + 1, var8);
                    this.method1297(8192, 1024, var7, var8 - 1);
                }
                if (arg1 == 3) {
                    this.method1297(8192, 81920, var7, var8);
                    this.method1297(8192, 1024, var7, var8 - 1);
                    this.method1297(8192, 4096, var7 - 1, var8);
                }
            }
        }
        if (arg2 <= 92) {
            field3864 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIB)V")
    public final void method1304(int arg0, int arg1, byte arg2) {
        int var4 = -39 % ((52 - arg2) / 49);
        field3847++;
        int var5 = arg0 - this.field3861;
        int var6 = arg1 - this.field3867;
        this.field3853[var6][var5] = class219.method1368(this.field3853[var6][var5], 2097152);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public final void method1305(boolean arg0) {
        field3838++;
        for (int var2 = 0; var2 < this.field3848; var2++) {
            for (int var3 = 0; var3 < this.field3845; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3848 - 5 <= var2 || var3 >= this.field3845 - 5) {
                    this.field3853[var2][var3] = 16777215;
                } else {
                    this.field3853[var2][var3] = 16777216;
                }
            }
        }
        if (!arg0) {
            this.method1302(-41, 122, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method1306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3849++;
        if (arg5 == arg6 && arg0 == arg2) {
            return true;
        }
        int var8 = arg5 - this.field3867;
        int var9 = arg2 - this.field3861;
        int var10 = arg6 - this.field3867;
        int var11 = arg0 - this.field3861;
        if (arg1 == 0) {
            if (arg4 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field3853[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field3853[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field3853[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field3853[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field3853[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field3853[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field3853[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field3853[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field3853[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field3853[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field3853[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        if (arg3 != 1) {
            field3869 = -45;
        }
        return false;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIILhg;)V")
    public static final void method1307(int arg0, int arg1, int arg2, int arg3, int arg4, class84 arg5) {
        if (arg4 != 1024) {
            field3843 = -9;
        }
        field3863++;
        class77 var6 = new class77();
        var6.field1335 = arg5.field1429;
        var6.field1325 = arg5.field1412;
        var6.field1319 = arg2 * 128;
        var6.field1332 = arg0 * 128;
        var6.field1329 = arg5.field1464;
        int var7 = arg5.field1434;
        int var8 = arg5.field1440;
        var6.field1330 = arg5.field1407;
        var6.field1324 = arg3;
        var6.field1312 = arg5.field1410 * 128;
        if (arg1 == 1 || arg1 == 3) {
            var7 = arg5.field1440;
            var8 = arg5.field1434;
        }
        var6.field1337 = (arg2 + var7) * 128;
        var6.field1311 = (arg0 + var8) * 128;
        if (arg5.field1413 != null) {
            var6.field1327 = arg5;
            var6.method482(-90);
        }
        class90.field1585.method120(0, var6);
        if (var6.field1330 != null) {
            var6.field1331 = (int) (Math.random() * (double) (var6.field1325 - var6.field1335)) + var6.field1335;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V")
    public class210(int arg0, int arg1) {
        this.field3845 = arg1;
        this.field3861 = 0;
        this.field3848 = arg0;
        this.field3853 = new int[this.field3848][this.field3845];
        this.method1305(true);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZ)V")
    public final void method1308(int arg0, int arg1, boolean arg2) {
        field3851++;
        int var4 = arg1 - this.field3867;
        int var5 = arg0 - this.field3861;
        this.field3853[var4][var5] = class75.method450(this.field3853[var4][var5], -262145);
        if (!arg2) {
            this.method1296(-90, -73, 123, 53, 87, 21, 31, 94);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)Lej;")
    public static final class55 method1309(boolean arg0, int arg1) {
        field3855++;
        class55 var2 = (class55) class137.field2572.method777(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (!arg0) {
            method1307(-59, 14, 96, -21, -37, null);
        }
        byte[] var3 = class78.field1348.method1079(class39.method277((byte) -88, arg1), -23, class2.method2(255, arg1));
        class55 var4 = new class55();
        if (var3 != null) {
            var4.method379(new class112(var3), false);
        }
        class137.field2572.method774((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lpb;ILpb;)I")
    public static final int method1310(class165 arg0, int arg1, class165 arg2) {
        field3865++;
        int var3 = 0;
        if (arg0.method1070(class65.field1073, false)) {
            var3++;
        }
        int var4 = 74 % ((arg1 + 3) / 59);
        if (arg2.method1070(class238.field4294, false)) {
            var3++;
        }
        if (arg2.method1070(class240.field4318, false)) {
            var3++;
        }
        if (arg2.method1070(class62.field1046, false)) {
            var3++;
        }
        if (arg2.method1070(class11.field152, false)) {
            var3++;
        }
        if (arg2.method1070(class214.field3910, false)) {
            var3++;
        }
        arg2.method1070(class101.field1903, false);
        arg2.method1070(class72.field1213, false);
        arg2.method1070(class103.field1934, false);
        arg2.method1070(class182.field3342, false);
        arg2.method1070(class1.field6, false);
        return var3;
    }
}
