import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class266 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    private int field4337;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    private int field4357;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[[I")
    public int[][] field4356;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    private int field4347;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    private int field4353;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static volatile int field4354 = 0;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Z")
    public static boolean field4361 = false;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lvk;")
    public static class67 field4359 = new class67(64);

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Lck;")
    private static class119 field4363 = class298.method1987((byte) 123, "Walk here");

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "Lck;")
    public static class119 field4362 = field4363;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Lck;")
    public static class119 field4366 = class298.method1987((byte) 36, "unichrome");

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "[Z")
    public static boolean[] field4365 = new boolean[200];

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIIIIIII)Z", line = 6)
    public final boolean method1744(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4349++;
        if (arg6 == 1) {
            if (arg4 == arg7 && arg3 == arg5) {
                return true;
            }
        } else if (arg4 <= arg7 && arg7 <= (arg4 + arg6 - 1) && arg5 >= arg5 && arg5 + arg6 - 1 >= arg5) {
            return true;
        }
        int var9 = arg7 - this.field4347;
        int var10 = arg5 - this.field4353;
        int var11 = arg4 - this.field4347;
        int var12 = arg3 - this.field4353;
        if (arg6 == 1) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field4356[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4356[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field4356[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4356[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4356[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4356[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field4356[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field4356[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field4356[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field4356[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field4356[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var12 - 1;
            int var14 = arg6 + var11 - 1;
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if (var9 - arg6 == var11 && var12 <= var10 && var10 <= var13) {
                        return true;
                    }
                    if (var11 <= var9 && var14 >= var9 && var10 + 1 == var12 && (this.field4356[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var14 >= var9 && var10 - arg6 == var12 && (this.field4356[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 <= var9 && var14 >= var9 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 - arg6 == var11 && var10 >= var12 && var10 <= var13 && (this.field4356[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var13 >= var10 && (this.field4356[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 + 1 == var11 && var12 <= var10 && var13 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var14 >= var9 && (var10 + 1) == var12 && (this.field4356[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && var10 - arg6 == var12 && (this.field4356[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 <= var9 && var9 <= var14 && var10 - arg6 == var12) {
                        return true;
                    }
                    if (var9 - arg6 == var11 && var12 <= var10 && var10 <= var13 && (this.field4356[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var13 && (this.field4356[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if ((var9 - arg6) == var11 && var10 >= var12 && var13 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var14 >= var9 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var13 >= var10 && (this.field4356[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && var10 - arg6 == var12 && (this.field4356[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 - arg6 == var11 && var10 >= var12 && var13 >= var10 && (this.field4356[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var13 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && (var10 - arg6) == var12 && (this.field4356[var9][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 - arg6 == var11 && var12 <= var10 && var13 >= var10 && (this.field4356[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var14 >= var9 && var10 + 1 == var12 && (this.field4356[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var13 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && var10 - arg6 == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 - arg6 == var11 && var10 >= var12 && var13 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && var10 + 1 == var12 && (this.field4356[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var13 >= var10 && (this.field4356[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && (var10 - arg6) == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 <= var9 && var9 <= var14 && var10 + 1 == var12 && (this.field4356[var9][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var14 >= var9 && var10 - arg6 == var12 && (this.field4356[var9][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var9 - arg6) == var11 && var12 <= var10 && var10 <= var13 && (this.field4356[var14][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 <= var10 && var13 >= var10 && (this.field4356[var11][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (!arg0) {
            this.method1760(109, -75, 109, 49, -1, 41, 81, 5, 98, -97);
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)V", line = 381)
    public final void method1745(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field4347;
        int var5 = arg0 - this.field4353;
        this.field4356[var4][var5] = class156.method998(this.field4356[var4][var5], 262144);
        if (arg1 <= 6) {
            this.field4337 = -120;
        }
        field4342++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIZI)V", line = 394)
    public final void method1746(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg2 - this.field4353;
        int var8 = 36 % ((53 - arg5) / 42);
        field4339++;
        int var9 = arg1 - this.field4347;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method1754(-11363, 128, var7, var9);
                this.method1754(-11363, 8, var7, var9 - 1);
            }
            if (arg3 == 1) {
                this.method1754(-11363, 2, var7, var9);
                this.method1754(-11363, 32, var7 + 1, var9);
            }
            if (arg3 == 2) {
                this.method1754(-11363, 8, var7, var9);
                this.method1754(-11363, 128, var7, var9 + 1);
            }
            if (arg3 == 3) {
                this.method1754(-11363, 32, var7, var9);
                this.method1754(-11363, 2, var7 - 1, var9);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method1754(-11363, 1, var7, var9);
                this.method1754(-11363, 16, var7 + 1, var9 + -1);
            }
            if (arg3 == 1) {
                this.method1754(-11363, 4, var7, var9);
                this.method1754(-11363, 64, var7 + 1, var9 + 1);
            }
            if (arg3 == 2) {
                this.method1754(-11363, 16, var7, var9);
                this.method1754(-11363, 1, var7 - 1, var9 + 1);
            }
            if (arg3 == 3) {
                this.method1754(-11363, 64, var7, var9);
                this.method1754(-11363, 4, var7 - 1, var9 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method1754(-11363, 130, var7, var9);
                this.method1754(-11363, 8, var7, var9 - 1);
                this.method1754(-11363, 32, var7 + 1, var9);
            }
            if (arg3 == 1) {
                this.method1754(-11363, 10, var7, var9);
                this.method1754(-11363, 32, var7 + 1, var9);
                this.method1754(-11363, 128, var7, var9 + 1);
            }
            if (arg3 == 2) {
                this.method1754(-11363, 40, var7, var9);
                this.method1754(-11363, 128, var7, var9 + 1);
                this.method1754(-11363, 2, var7 - 1, var9);
            }
            if (arg3 == 3) {
                this.method1754(-11363, 160, var7, var9);
                this.method1754(-11363, 2, var7 - 1, var9);
                this.method1754(-11363, 8, var7, var9 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method1754(-11363, 65536, var7, var9);
                this.method1754(-11363, 4096, var7, var9 - 1);
            }
            if (arg3 == 1) {
                this.method1754(-11363, 1024, var7, var9);
                this.method1754(-11363, 16384, var7 + 1, var9);
            }
            if (arg3 == 2) {
                this.method1754(-11363, 4096, var7, var9);
                this.method1754(-11363, 65536, var7, var9 + 1);
            }
            if (arg3 == 3) {
                this.method1754(-11363, 16384, var7, var9);
                this.method1754(-11363, 1024, var7 - 1, var9);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method1754(-11363, 512, var7, var9);
                this.method1754(-11363, 8192, var7 + 1, var9 + -1);
            }
            if (arg3 == 1) {
                this.method1754(-11363, 2048, var7, var9);
                this.method1754(-11363, 32768, var7 + 1, var9 + 1);
            }
            if (arg3 == 2) {
                this.method1754(-11363, 8192, var7, var9);
                this.method1754(-11363, 512, var7 - 1, var9 - -1);
            }
            if (arg3 == 3) {
                this.method1754(-11363, 32768, var7, var9);
                this.method1754(-11363, 2048, var7 - 1, var9 + -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1754(-11363, 66560, var7, var9);
            this.method1754(-11363, 4096, var7, var9 - 1);
            this.method1754(-11363, 16384, var7 + 1, var9);
        }
        if (arg3 == 1) {
            this.method1754(-11363, 5120, var7, var9);
            this.method1754(-11363, 16384, var7 + 1, var9);
            this.method1754(-11363, 65536, var7, var9 + 1);
        }
        if (arg3 == 2) {
            this.method1754(-11363, 20480, var7, var9);
            this.method1754(-11363, 65536, var7, var9 + 1);
            this.method1754(-11363, 1024, var7 - 1, var9);
        }
        if (arg3 == 3) {
            this.method1754(-11363, 81920, var7, var9);
            this.method1754(-11363, 1024, var7 - 1, var9);
            this.method1754(-11363, 4096, var7, var9 - 1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 599)
    public static void method1747(int arg0) {
        field4362 = null;
        field4363 = null;
        field4359 = null;
        field4366 = null;
        field4365 = null;
        if (arg0 < 86) {
            field4340 = -115;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 616)
    public final void method1748(byte arg0) {
        for (int var2 = 0; var2 < this.field4357; var2++) {
            for (int var3 = 0; var3 < this.field4337; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field4357 - 5) || var3 >= (this.field4337 - 5)) {
                    this.field4356[var2][var3] = 16777215;
                } else {
                    this.field4356[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 != -68) {
            this.field4357 = 23;
        }
        field4343++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBIIIII)Z", line = 645)
    public final boolean method1749(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4346++;
        if (arg4 <= 1) {
            int var10 = -59 / ((-arg3 - 62) / 61);
            int var11 = arg0 + arg6 - 1;
            int var12 = arg2 + arg7 - 1;
            if (arg0 <= arg5 && arg5 <= var11 && arg8 >= arg2 && arg8 <= var12) {
                return true;
            } else if (arg0 - 1 == arg5 && arg8 >= arg2 && var12 >= arg8 && (this.field4356[arg5 - this.field4347][arg8 - this.field4353] & 0x8) == 0 && (arg1 & 0x8) == 0) {
                return true;
            } else if (var11 + 1 == arg5 && arg8 >= arg2 && var12 >= arg8 && (this.field4356[arg5 - this.field4347][arg8 - this.field4353] & 0x80) == 0 && (arg1 & 0x2) == 0) {
                return true;
            } else if (arg2 - 1 == arg8 && arg5 >= arg0 && arg5 <= var11 && (this.field4356[arg5 - this.field4347][arg8 - this.field4353] & 0x2) == 0 && (arg1 & 0x4) == 0) {
                return true;
            } else {
                return var12 + 1 == arg8 && arg5 >= arg0 && arg5 <= var11 && (this.field4356[arg5 - this.field4347][arg8 - this.field4353] & 0x20) == 0 && (arg1 & 0x1) == 0;
            }
        } else if (this.method1752(20634, arg5, arg2, arg4, arg4, arg0, arg7, arg8, arg6)) {
            return true;
        } else {
            return this.method1760(arg4, arg5, arg0, arg1, arg6, arg7, arg8, 32, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZIIIII)V", line = 687)
    public final void method1750(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4348++;
        if (arg5 != 0) {
            return;
        }
        int var8 = arg3 - this.field4353;
        int var9 = arg0 - this.field4347;
        int var10 = 256;
        if (arg1) {
            var10 += 131072;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg6;
            arg6 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && this.field4357 > var12) {
                for (int var13 = var8; var13 < (var8 + arg2); var13++) {
                    if (var13 >= 0 && this.field4337 > var13) {
                        this.method1758(false, var12, var10, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIZI)Z", line = 751)
    public final boolean method1751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field4350++;
        if (arg5 == 1) {
            if (arg1 == arg4 && arg0 == arg3) {
                return true;
            }
        } else if (arg4 >= arg1 && (arg1 + arg5 - 1) >= arg4 && arg3 <= arg3 && arg3 + arg5 - 1 >= arg3) {
            return true;
        }
        int var9 = arg3 - this.field4353;
        int var10 = arg0 - this.field4353;
        int var11 = arg4 - this.field4347;
        if (!arg6) {
            this.method1751(117, 38, -12, -80, 62, -121, true, 94);
        }
        int var12 = arg1 - this.field4347;
        if (arg5 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4356[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field4356[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4356[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field4356[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field4356[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4356[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4356[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4356[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field4356[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field4356[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field4356[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field4356[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var12 - 1;
            int var14 = var10 + arg5 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var12 && var10 <= var9 && var14 >= var9 && (this.field4356[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg5) == var10 && (this.field4356[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - arg5) == var12 && var9 >= var10 && var14 >= var9 && (this.field4356[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg5) == var10 && (this.field4356[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg5) == var12 && var10 <= var9 && var14 >= var9 && (this.field4356[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 + 1 == var10 && (this.field4356[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14 && (this.field4356[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field4356[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var12 <= var11 && var11 <= var13 && (var9 + 1) == var10 && (this.field4356[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var12 && var11 <= var13 && (var9 - arg5) == var10 && (this.field4356[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg5) == var12 && var10 <= var9 && var9 <= var14 && (this.field4356[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var10 <= var9 && var9 <= var14 && (this.field4356[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIII)Z", line = 936)
    private final boolean method1752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4352++;
        if ((arg5 + arg8) > arg1 && (arg1 + arg4) > arg5) {
            if (arg0 != 20634) {
                this.method1746(68, 8, -95, -91, true, -112);
            }
            return arg7 < arg2 + arg6 && arg2 < (arg7 + arg3);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB)V", line = 958)
    public final void method1753(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field4347;
        field4351++;
        if (arg2 <= 31) {
            this.method1752(-84, 119, -56, -9, -122, -56, -37, -85, 104);
        }
        int var5 = arg1 - this.field4353;
        this.field4356[var4][var5] = class156.method998(this.field4356[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V", line = 971)
    private final void method1754(int arg0, int arg1, int arg2, int arg3) {
        this.field4356[arg3][arg2] = class156.method998(this.field4356[arg3][arg2], arg1);
        field4345++;
        if (arg0 != -11363) {
            this.method1755(-75, -70, 12, -19, 24);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)Z", line = 982)
    public final boolean method1755(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4358++;
        if (arg1 == arg3 && arg2 == arg4) {
            return true;
        }
        int var6 = arg3 - this.field4347;
        int var7 = arg2 - this.field4353;
        if (var6 < 0 || var6 >= this.field4357 || var7 < 0 || var7 >= this.field4337) {
            return false;
        } else if (arg0 == 19661064) {
            int var8 = arg1 - this.field4347;
            int var9 = arg4 - this.field4353;
            int var10;
            if (var6 <= var8) {
                var10 = var8 - var6;
            } else {
                var10 = var6 - var8;
            }
            int var11;
            if (var7 <= var9) {
                var11 = var9 - var7;
            } else {
                var11 = var7 - var9;
            }
            if (var11 >= var10) {
                int var12 = var10 * 65536 / var11;
                int var13 = 32768;
                while (var7 != var9) {
                    if (var7 > var9) {
                        if ((this.field4356[var8][var9] & 0x12C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field4356[var8][var9] & 0x12C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var6 > var8) {
                            if ((this.field4356[var8][var9] & 0x12C0108) != 0) {
                                return false;
                            }
                            var8++;
                        } else if (var8 > var6) {
                            if ((this.field4356[var8][var9] & 0x12C0180) != 0) {
                                return false;
                            }
                            var8--;
                        }
                    }
                }
            } else {
                int var14 = var11 * 65536 / var10;
                int var15 = 32768;
                while (var6 != var8) {
                    if (var8 < var6) {
                        if ((this.field4356[var8][var9] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field4356[var8][var9] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        var15 -= 65536;
                        if (var9 < var7) {
                            if ((this.field4356[var8][var9] & 0x12C0102) != 0) {
                                return false;
                            }
                            var9++;
                        } else if (var9 > var7) {
                            if ((this.field4356[var8][var9] & 0x12C0120) != 0) {
                                return false;
                            }
                            var9--;
                        }
                    }
                }
            }
            return (this.field4356[var6][var7] & 0x1240100) == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIZ)V", line = 1130)
    public final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field4353;
        field4338++;
        int var8 = arg1 - this.field4347;
        int var9 = arg2;
        if (arg5) {
            var9 = arg2 + 131072;
        }
        for (int var10 = var8; var10 < arg0 + var8; var10++) {
            if (var10 >= 0 && this.field4357 > var10) {
                for (int var11 = var7; var11 < arg3 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field4337) {
                        this.method1754(-11363, var9, var11, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBZI)V", line = 1182)
    public final void method1757(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field4347;
        if (arg3 < 75) {
            this.method1754(-100, 4, -7, -36);
        }
        field4355++;
        int var8 = arg5 - this.field4353;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method1758(false, var7, 128, var8);
                this.method1758(false, var7 - 1, 8, var8);
            }
            if (arg2 == 1) {
                this.method1758(false, var7, 2, var8);
                this.method1758(false, var7, 32, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1758(false, var7, 8, var8);
                this.method1758(false, var7 + 1, 128, var8);
            }
            if (arg2 == 3) {
                this.method1758(false, var7, 32, var8);
                this.method1758(false, var7, 2, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method1758(false, var7, 1, var8);
                this.method1758(false, var7 - 1, 16, var8 + 1);
            }
            if (arg2 == 1) {
                this.method1758(false, var7, 4, var8);
                this.method1758(false, var7 + 1, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1758(false, var7, 16, var8);
                this.method1758(false, var7 + 1, 1, var8 - 1);
            }
            if (arg2 == 3) {
                this.method1758(false, var7, 64, var8);
                this.method1758(false, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method1758(false, var7, 130, var8);
                this.method1758(false, var7 - 1, 8, var8);
                this.method1758(false, var7, 32, var8 + 1);
            }
            if (arg2 == 1) {
                this.method1758(false, var7, 10, var8);
                this.method1758(false, var7, 32, var8 + 1);
                this.method1758(false, var7 + 1, 128, var8);
            }
            if (arg2 == 2) {
                this.method1758(false, var7, 40, var8);
                this.method1758(false, var7 + 1, 128, var8);
                this.method1758(false, var7, 2, var8 - 1);
            }
            if (arg2 == 3) {
                this.method1758(false, var7, 160, var8);
                this.method1758(false, var7, 2, var8 - 1);
                this.method1758(false, var7 - 1, 8, var8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method1758(false, var7, 65536, var8);
                this.method1758(false, var7 - 1, 4096, var8);
            }
            if (arg2 == 1) {
                this.method1758(false, var7, 1024, var8);
                this.method1758(false, var7, 16384, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1758(false, var7, 4096, var8);
                this.method1758(false, var7 + 1, 65536, var8);
            }
            if (arg2 == 3) {
                this.method1758(false, var7, 16384, var8);
                this.method1758(false, var7, 1024, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method1758(false, var7, 512, var8);
                this.method1758(false, var7 - 1, 8192, var8 + 1);
            }
            if (arg2 == 1) {
                this.method1758(false, var7, 2048, var8);
                this.method1758(false, var7 + 1, 32768, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1758(false, var7, 8192, var8);
                this.method1758(false, var7 + 1, 512, var8 - 1);
            }
            if (arg2 == 3) {
                this.method1758(false, var7, 32768, var8);
                this.method1758(false, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1758(false, var7, 66560, var8);
            this.method1758(false, var7 - 1, 4096, var8);
            this.method1758(false, var7, 16384, var8 + 1);
        }
        if (arg2 == 1) {
            this.method1758(false, var7, 5120, var8);
            this.method1758(false, var7, 16384, var8 + 1);
            this.method1758(false, var7 + 1, 65536, var8);
        }
        if (arg2 == 2) {
            this.method1758(false, var7, 20480, var8);
            this.method1758(false, var7 + 1, 65536, var8);
            this.method1758(false, var7, 1024, var8 - 1);
        }
        if (arg2 == 3) {
            this.method1758(false, var7, 81920, var8);
            this.method1758(false, var7, 1024, var8 - 1);
            this.method1758(false, var7 - 1, 4096, var8);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIII)V", line = 1394)
    private final void method1758(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            this.method1759(-100, 98, (byte) -112);
        }
        field4341++;
        this.field4356[arg1][arg3] = class19.method151(this.field4356[arg1][arg3], ~arg2);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(II)V", line = 1404)
    public class266(int arg0, int arg1) {
        this.field4337 = arg1;
        this.field4357 = arg0;
        this.field4356 = new int[this.field4357][this.field4337];
        this.field4347 = 0;
        this.field4353 = 0;
        this.method1748((byte) -68);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIB)V", line = 1421)
    public final void method1759(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field4353;
        field4344++;
        int var5 = arg0 - this.field4347;
        this.field4356[var5][var4] = class19.method151(this.field4356[var5][var4], -262145);
        if (arg2 > -98) {
            field4359 = (class67) null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1437)
    private final boolean method1760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg1 + arg0;
        field4360++;
        int var12 = arg6 + arg9;
        if (arg7 != 32) {
            field4359 = (class67) null;
        }
        int var13 = arg2 + arg4;
        int var14 = arg5 + arg8;
        if (arg2 <= arg1 && arg1 < var13) {
            if (arg8 == var12 && (arg3 & 0x4) == 0) {
                int var15 = arg1;
                int var16 = var13 >= var11 ? var11 : var13;
                while (var15 < var16) {
                    if ((this.field4356[var15 - this.field4347][var12 - this.field4353 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg6 == var14 && (arg3 & 0x1) == 0) {
                int var17 = arg1;
                int var18 = var11 > var13 ? var13 : var11;
                while (var18 > var17) {
                    if ((this.field4356[var17 - this.field4347][arg6 - this.field4353] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg2 && var13 >= var11) {
            if (arg8 == var12 && (arg3 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var11; var19++) {
                    if ((this.field4356[var19 - this.field4347][var12 - this.field4353 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var14 && (arg3 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var11; var20++) {
                    if ((this.field4356[var20 - this.field4347][arg6 - this.field4353] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg8 <= arg6 && var14 > arg6) {
            if (arg2 == var11 && (arg3 & 0x8) == 0) {
                int var21 = arg6;
                int var22 = var14 >= var12 ? var12 : var14;
                while (var22 > var21) {
                    if ((this.field4356[var11 - this.field4347 - 1][var21 - this.field4353] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg1 == var13 && (arg3 & 0x2) == 0) {
                int var23 = arg6;
                int var24 = var12 <= var14 ? var12 : var14;
                while (var23 < var24) {
                    if ((this.field4356[arg1 - this.field4347][var23 - this.field4353] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg8 < var12 && var12 <= var14) {
            if (arg2 == var11 && (arg3 & 0x8) == 0) {
                for (int var25 = arg8; var25 < var12; var25++) {
                    if ((this.field4356[var11 - this.field4347 - 1][var25 - this.field4353] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var13 && (arg3 & 0x2) == 0) {
                for (int var26 = arg8; var26 < var12; var26++) {
                    if ((this.field4356[arg1 - this.field4347][var26 - this.field4353] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
