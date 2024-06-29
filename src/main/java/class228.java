import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class228 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    private int field3603;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    private int field3614;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    private int field3597;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[[I")
    public int[][] field3605;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[Lna;")
    public static class26[] field3596 = new class26[8];

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lna;")
    public static class26 field3599 = class69.method505("(U3", (byte) -119);

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "J")
    public static long field3619 = 0L;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "B")
    public static byte field3613;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lfd;")
    public static class242 field3606;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "[S")
    public static short[] field3621;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZIIII)V", line = 4)
    public final void method1520(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field3614;
        if (arg2 > -101) {
            method1530(-88, -61, -44, 72, 121);
        }
        field3618++;
        int var8 = arg3 - this.field3608;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1536((byte) 114, var8, var7, 128);
                this.method1536((byte) 122, var8, var7 - 1, 8);
            }
            if (arg0 == 1) {
                this.method1536((byte) 77, var8, var7, 2);
                this.method1536((byte) 105, var8 + 1, var7, 32);
            }
            if (arg0 == 2) {
                this.method1536((byte) 75, var8, var7, 8);
                this.method1536((byte) 38, var8, var7 + 1, 128);
            }
            if (arg0 == 3) {
                this.method1536((byte) 110, var8, var7, 32);
                this.method1536((byte) 26, var8 - 1, var7, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1536((byte) 99, var8, var7, 1);
                this.method1536((byte) 23, var8 + 1, var7 + -1, 16);
            }
            if (arg0 == 1) {
                this.method1536((byte) 52, var8, var7, 4);
                this.method1536((byte) 60, var8 + 1, var7 + 1, 64);
            }
            if (arg0 == 2) {
                this.method1536((byte) 126, var8, var7, 16);
                this.method1536((byte) 103, var8 - 1, var7 - -1, 1);
            }
            if (arg0 == 3) {
                this.method1536((byte) 125, var8, var7, 64);
                this.method1536((byte) 64, var8 - 1, var7 + -1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1536((byte) 110, var8, var7, 130);
                this.method1536((byte) 78, var8, var7 - 1, 8);
                this.method1536((byte) 45, var8 + 1, var7, 32);
            }
            if (arg0 == 1) {
                this.method1536((byte) 93, var8, var7, 10);
                this.method1536((byte) 72, var8 + 1, var7, 32);
                this.method1536((byte) 23, var8, var7 + 1, 128);
            }
            if (arg0 == 2) {
                this.method1536((byte) 33, var8, var7, 40);
                this.method1536((byte) 102, var8, var7 + 1, 128);
                this.method1536((byte) 102, var8 - 1, var7, 2);
            }
            if (arg0 == 3) {
                this.method1536((byte) 24, var8, var7, 160);
                this.method1536((byte) 122, var8 - 1, var7, 2);
                this.method1536((byte) 77, var8, var7 - 1, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1536((byte) 24, var8, var7, 65536);
                this.method1536((byte) 115, var8, var7 - 1, 4096);
            }
            if (arg0 == 1) {
                this.method1536((byte) 120, var8, var7, 1024);
                this.method1536((byte) 110, var8 + 1, var7, 16384);
            }
            if (arg0 == 2) {
                this.method1536((byte) 101, var8, var7, 4096);
                this.method1536((byte) 38, var8, var7 + 1, 65536);
            }
            if (arg0 == 3) {
                this.method1536((byte) 31, var8, var7, 16384);
                this.method1536((byte) 65, var8 - 1, var7, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1536((byte) 47, var8, var7, 512);
                this.method1536((byte) 66, var8 + 1, var7 + -1, 8192);
            }
            if (arg0 == 1) {
                this.method1536((byte) 40, var8, var7, 2048);
                this.method1536((byte) 88, var8 + 1, var7 - -1, 32768);
            }
            if (arg0 == 2) {
                this.method1536((byte) 96, var8, var7, 8192);
                this.method1536((byte) 41, var8 - 1, var7 + 1, 512);
            }
            if (arg0 == 3) {
                this.method1536((byte) 90, var8, var7, 32768);
                this.method1536((byte) 47, var8 - 1, var7 + -1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1536((byte) 51, var8, var7, 66560);
            this.method1536((byte) 82, var8, var7 - 1, 4096);
            this.method1536((byte) 68, var8 + 1, var7, 16384);
        }
        if (arg0 == 1) {
            this.method1536((byte) 112, var8, var7, 5120);
            this.method1536((byte) 89, var8 + 1, var7, 16384);
            this.method1536((byte) 48, var8, var7 + 1, 65536);
        }
        if (arg0 == 2) {
            this.method1536((byte) 126, var8, var7, 20480);
            this.method1536((byte) 25, var8, var7 + 1, 65536);
            this.method1536((byte) 46, var8 - 1, var7, 1024);
        }
        if (arg0 == 3) {
            this.method1536((byte) 39, var8, var7, 81920);
            this.method1536((byte) 113, var8 - 1, var7, 1024);
            this.method1536((byte) 86, var8, var7 - 1, 4096);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZII)V", line = 208)
    public final void method1521(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field3614;
        field3616++;
        int var8 = arg4 - this.field3608;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1525(128, (byte) -80, var7, var8);
                this.method1525(8, (byte) -80, var7 - 1, var8);
            }
            if (arg0 == 1) {
                this.method1525(2, (byte) -80, var7, var8);
                this.method1525(32, (byte) -80, var7, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1525(8, (byte) -80, var7, var8);
                this.method1525(128, (byte) -80, var7 + 1, var8);
            }
            if (arg0 == 3) {
                this.method1525(32, (byte) -80, var7, var8);
                this.method1525(2, (byte) -80, var7, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1525(1, (byte) -80, var7, var8);
                this.method1525(16, (byte) -80, var7 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1525(4, (byte) -80, var7, var8);
                this.method1525(64, (byte) -80, var7 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1525(16, (byte) -80, var7, var8);
                this.method1525(1, (byte) -80, var7 + 1, var8 + -1);
            }
            if (arg0 == 3) {
                this.method1525(64, (byte) -80, var7, var8);
                this.method1525(4, (byte) -80, var7 - 1, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method1525(130, (byte) -80, var7, var8);
                this.method1525(8, (byte) -80, var7 - 1, var8);
                this.method1525(32, (byte) -80, var7, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1525(10, (byte) -80, var7, var8);
                this.method1525(32, (byte) -80, var7, var8 + 1);
                this.method1525(128, (byte) -80, var7 + 1, var8);
            }
            if (arg0 == 2) {
                this.method1525(40, (byte) -80, var7, var8);
                this.method1525(128, (byte) -80, var7 + 1, var8);
                this.method1525(2, (byte) -80, var7, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1525(160, (byte) -80, var7, var8);
                this.method1525(2, (byte) -80, var7, var8 - 1);
                this.method1525(8, (byte) -80, var7 - 1, var8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1525(65536, (byte) -80, var7, var8);
                this.method1525(4096, (byte) -80, var7 - 1, var8);
            }
            if (arg0 == 1) {
                this.method1525(1024, (byte) -80, var7, var8);
                this.method1525(16384, (byte) -80, var7, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1525(4096, (byte) -80, var7, var8);
                this.method1525(65536, (byte) -80, var7 + 1, var8);
            }
            if (arg0 == 3) {
                this.method1525(16384, (byte) -80, var7, var8);
                this.method1525(1024, (byte) -80, var7, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1525(512, (byte) -80, var7, var8);
                this.method1525(8192, (byte) -80, var7 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1525(2048, (byte) -80, var7, var8);
                this.method1525(32768, (byte) -80, var7 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1525(8192, (byte) -80, var7, var8);
                this.method1525(512, (byte) -80, var7 + 1, var8 + -1);
            }
            if (arg0 == 3) {
                this.method1525(32768, (byte) -80, var7, var8);
                this.method1525(2048, (byte) -80, var7 - 1, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1525(66560, (byte) -80, var7, var8);
            this.method1525(4096, (byte) -80, var7 - 1, var8);
            this.method1525(16384, (byte) -80, var7, var8 + 1);
        }
        if (arg0 == 1) {
            this.method1525(5120, (byte) -80, var7, var8);
            this.method1525(16384, (byte) -80, var7, var8 + 1);
            this.method1525(65536, (byte) -80, var7 + 1, var8);
        }
        if (arg0 == 2) {
            this.method1525(20480, (byte) -80, var7, var8);
            this.method1525(65536, (byte) -80, var7 + 1, var8);
            this.method1525(1024, (byte) -80, var7, var8 - 1);
        }
        if (arg0 == 3) {
            this.method1525(81920, (byte) -80, var7, var8);
            this.method1525(1024, (byte) -80, var7, var8 - 1);
            this.method1525(4096, (byte) -80, var7 - 1, var8);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIB)Z", line = 424)
    private final boolean method1522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field3611++;
        if (arg1 + arg2 > arg7 && arg2 < arg0 + arg7) {
            if (arg8 != -125) {
                this.method1523(92, -42, true, -119, -67, -14, -88, 5);
            }
            return (arg3 + arg5) > arg4 && arg4 + arg6 > arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZIIIII)Z", line = 443)
    public final boolean method1523(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3595++;
        if (arg6 == 1) {
            if (arg1 == arg4 && arg0 == arg3) {
                return true;
            }
        } else if (arg1 <= arg4 && arg6 + arg1 - 1 >= arg4 && arg0 <= arg0 && arg0 <= (arg0 + arg6 - 1)) {
            return true;
        }
        if (arg2) {
            return false;
        }
        int var9 = arg3 - this.field3608;
        int var10 = arg4 - this.field3614;
        int var11 = arg0 - this.field3608;
        int var12 = arg1 - this.field3614;
        if (arg6 == 1) {
            if (arg5 == 0) {
                if (arg7 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3605[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3605[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3605[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field3605[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg7 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3605[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3605[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field3605[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3605[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field3605[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var9 && (this.field3605[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field3605[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var12 - 1;
            int var14 = var9 + arg6 - 1;
            if (arg5 == 0) {
                if (arg7 == 0) {
                    if ((var10 - arg6) == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 + 1) == var9 && (this.field3605[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 - arg6) == var9 && (this.field3605[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 >= var12 && var10 <= var13 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - arg6) == var12 && var9 <= var11 && var14 >= var11 && (this.field3605[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 <= var11 && var14 >= var11 && (this.field3605[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var11 + 1) == var9 && (this.field3605[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var11 - arg6) == var9 && (this.field3605[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var12 <= var10 && var13 >= var10 && var11 - arg6 == var9) {
                        return true;
                    }
                    if (var10 - arg6 == var12 && var11 >= var9 && var14 >= var11 && (this.field3605[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 <= var11 && var11 <= var14 && (this.field3605[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg7 == 0) {
                    if (var10 - arg6 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14 && (this.field3605[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var11 - arg6 == var9 && (this.field3605[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 - arg6 == var12 && var11 >= var9 && var11 <= var14 && (this.field3605[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 - arg6 == var9 && (this.field3605[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - arg6 == var12 && var9 <= var11 && var14 >= var11 && (this.field3605[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var11 + 1 == var9 && (this.field3605[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 - arg6) == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 - arg6 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var11 + 1 == var9 && (this.field3605[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var11 <= var14 && (this.field3605[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 - arg6 == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var12 <= var10 && var10 <= var13 && (var11 + 1) == var9 && (this.field3605[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var10 <= var13 && (var11 - arg6) == var9 && (this.field3605[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var10 - arg6) == var12 && var11 >= var9 && var11 <= var14 && (this.field3605[var13][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var11 >= var9 && var14 >= var11 && (this.field3605[var12][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZBIII)V", line = 809)
    public final void method1524(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field3608;
        int var8 = arg0 - this.field3614;
        field3622++;
        int var9 = 256;
        if (arg1) {
            var9 += 131072;
        }
        int var10 = var8;
        if (arg2 <= 57) {
            return;
        }
        while (var10 < (arg4 + var8)) {
            if (var10 >= 0 && var10 < this.field3597) {
                for (int var11 = var7; var11 < arg5 + var7; var11++) {
                    if (var11 >= 0 && this.field3603 > var11) {
                        this.method1525(var9, (byte) -80, var10, var11);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBII)V", line = 852)
    private final void method1525(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -80) {
            this.method1533(false, 25, 78, -38, 60, 54, 58, 117, 109);
        }
        field3600++;
        this.field3605[arg2][arg3] = class240.method1652(this.field3605[arg2][arg3], arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 866)
    public static void method1526(byte arg0) {
        if (arg0 > -123) {
            method1526((byte) -27);
        }
        field3621 = null;
        field3596 = null;
        field3599 = null;
        field3606 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)Z", line = 881)
    public final boolean method1527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3594++;
        if (arg4 == 1) {
            if (arg2 == arg6 && arg0 == arg3) {
                return true;
            }
        } else if (arg6 <= arg2 && (arg4 + arg6 - 1) >= arg2 && arg0 <= arg0 && arg0 + arg4 - 1 >= arg0) {
            return true;
        }
        if (arg7 <= 78) {
            field3599 = (class26) null;
        }
        int var9 = arg6 - this.field3614;
        int var10 = arg0 - this.field3608;
        int var11 = arg2 - this.field3614;
        int var12 = arg3 - this.field3608;
        if (arg4 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3605[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3605[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field3605[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3605[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field3605[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3605[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3605[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3605[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field3605[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field3605[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field3605[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field3605[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var9 - 1;
            int var14 = var12 + arg4 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14 && (this.field3605[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 - arg4) == var12 && (this.field3605[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var11 - arg4) == var9 && var10 >= var12 && var14 >= var10 && (this.field3605[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg4 == var12 && (this.field3605[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - arg4) == var9 && var10 >= var12 && var10 <= var14 && (this.field3605[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field3605[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14 && (this.field3605[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12 && (this.field3605[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 <= var11 && var13 >= var11 && var10 + 1 == var12 && (this.field3605[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var13 >= var11 && var10 - arg4 == var12 && (this.field3605[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg4 == var9 && var12 <= var10 && var14 >= var10 && (this.field3605[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14 && (this.field3605[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILbe;IB)V", line = 1068)
    public static final void method1528(int arg0, int arg1, class297 arg2, int arg3, byte arg4) {
        field3598++;
        if (arg4 != 59) {
            return;
        }
        if (class255.field4184) {
            class326.method2279(arg0, arg1, arg2.field4967 + arg0, arg2.field4996 + arg1);
        }
        if (class154.field2402 >= 3) {
            if (class255.field4184) {
                class148 var5 = arg2.method2100((byte) -113, false);
                if (var5 != null) {
                    var5.method876(arg0, arg1);
                }
            } else {
                class34.method295(arg0, arg1, 0, arg2.field5011, arg2.field5102);
            }
        } else if (class255.field4184) {
            ((class130) class117.field1831).method874(arg0, arg1, arg2.field4967, arg2.field4996, class117.field1831.field2320 / 2, class117.field1831.field2308 / 2, class300.field5156, 256, (class130) arg2.method2100((byte) -113, false));
        } else {
            ((class256) class117.field1831).method1750(arg0, arg1, arg2.field4967, arg2.field4996, class117.field1831.field2320 / 2, class117.field1831.field2308 / 2, class300.field5156, 256, arg2.field5011, arg2.field5102);
        }
        class139.field2123[arg3] = true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZIIIII)Z", line = 1116)
    private final boolean method1529(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3617++;
        int var11 = arg6 + arg8;
        int var12 = arg7 + arg9;
        if (!arg4) {
            return true;
        }
        int var13 = arg0 + arg2;
        int var14 = arg1 + arg5;
        if (arg6 >= arg0 && arg6 < var13) {
            if (arg1 == var12 && (arg3 & 0x4) == 0) {
                int var15 = arg6;
                int var16 = var13 >= var11 ? var11 : var13;
                while (var16 > var15) {
                    if ((this.field3605[var15 - this.field3614][var12 - (this.field3608 + 1)] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg7 == var14 && (arg3 & 0x1) == 0) {
                int var17 = arg6;
                int var18 = var11 > var13 ? var13 : var11;
                while (var18 > var17) {
                    if ((this.field3605[var17 - this.field3614][arg7 - this.field3608] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg0 && var11 <= var13) {
            if (arg1 == var12 && (arg3 & 0x4) == 0) {
                for (int var19 = arg0; var19 < var11; var19++) {
                    if ((this.field3605[var19 - this.field3614][var12 - (this.field3608 + 1)] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var14 && (arg3 & 0x1) == 0) {
                for (int var20 = arg0; var20 < var11; var20++) {
                    if ((this.field3605[var20 - this.field3614][arg7 - this.field3608] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg7 >= arg1 && var14 > arg7) {
            if (arg0 == var11 && (arg3 & 0x8) == 0) {
                int var21 = arg7;
                int var22 = var14 >= var12 ? var12 : var14;
                while (var21 < var22) {
                    if ((this.field3605[var11 - this.field3614 - 1][var21 - this.field3608] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg6 == var13 && (arg3 & 0x2) == 0) {
                int var23 = arg7;
                int var24 = var14 < var12 ? var14 : var12;
                while (var23 < var24) {
                    if ((this.field3605[arg6 - this.field3614][var23 - this.field3608] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg1 < var12 && var14 >= var12) {
            if (arg0 == var11 && (arg3 & 0x8) == 0) {
                for (int var25 = arg1; var25 < var12; var25++) {
                    if ((this.field3605[var11 - this.field3614 - 1][var25 - this.field3608] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var13 && (arg3 & 0x2) == 0) {
                for (int var26 = arg1; var26 < var12; var26++) {
                    if ((this.field3605[arg6 - this.field3614][var26 - this.field3608] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)Z", line = 1277)
    public static final boolean method1530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class72.field1111 * arg0 + class126.field1957 * arg3 >> 16;
        int var6 = class72.field1111 * arg3 - class126.field1957 * arg0 >> 16;
        int var7 = class299.field5142 * var6 + class177.field2789 * arg1 >> 16;
        int var8 = class299.field5142 * arg1 - class177.field2789 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class299.field5142 * var6 + class177.field2789 * arg2 >> 16;
        int var12 = class299.field5142 * arg2 - class177.field2789 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class312.field5336 && var13 < class312.field5336) {
            return false;
        } else if (var9 > class21.field301 && var13 > class21.field301) {
            return false;
        } else if (var10 < class273.field4571 && var14 < class273.field4571) {
            return false;
        } else {
            return var10 <= class218.field3495 || var14 <= class218.field3495;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 1343)
    public final void method1531(int arg0) {
        for (int var2 = arg0; var2 < this.field3597; var2++) {
            for (int var3 = 0; var3 < this.field3603; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3597 - 5 || this.field3603 - 5 <= var3) {
                    this.field3605[var2][var3] = 16777215;
                } else {
                    this.field3605[var2][var3] = 16777216;
                }
            }
        }
        field3615++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 1370)
    public final void method1532(int arg0, int arg1, int arg2) {
        if (arg1 == 7605) {
            field3604++;
            int var4 = arg0 - this.field3608;
            int var5 = arg2 - this.field3614;
            this.field3605[var5][var4] = class240.method1652(this.field3605[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIIIIIIII)Z", line = 1387)
    public final boolean method1533(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3607++;
        if (arg4 > 1) {
            return this.method1522(arg4, arg5, arg1, arg8, arg2, arg7, arg4, arg3, (byte) -125) ? true : this.method1529(arg1, arg7, arg5, arg6, true, arg8, arg3, arg2, arg4, arg4);
        }
        int var10 = arg5 + arg1 - 1;
        int var11 = arg8 + arg7 - 1;
        if (arg1 <= arg3 && var10 >= arg3 && arg7 <= arg2 && arg2 <= var11) {
            return true;
        }
        if (!arg0) {
            this.method1536((byte) -85, 4, 106, -39);
        }
        if (arg1 - 1 == arg3 && arg2 >= arg7 && arg2 <= var11 && (this.field3605[arg3 - this.field3614][arg2 - this.field3608] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg3 && arg7 <= arg2 && var11 >= arg2 && (this.field3605[arg3 - this.field3614][arg2 - this.field3608] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if ((arg7 - 1) == arg2 && arg1 <= arg3 && var10 >= arg3 && (this.field3605[arg3 - this.field3614][arg2 - this.field3608] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg2 && arg3 >= arg1 && var10 >= arg3 && (this.field3605[arg3 - this.field3614][arg2 - this.field3608] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)V", line = 1430)
    public final void method1534(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field3614;
        int var5 = arg0 - this.field3608;
        field3610++;
        this.field3605[var4][var5] = class4.method23(this.field3605[var4][var5], -262145);
        if (arg1 != -73) {
            this.method1537(-117, 28, -110, true, 123, -33, 13);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(II)V", line = 1443)
    public class228(int arg0, int arg1) {
        this.field3603 = arg1;
        this.field3608 = 0;
        this.field3614 = 0;
        this.field3597 = arg0;
        this.field3605 = new int[this.field3597][this.field3603];
        this.method1531(0);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IIIII)Z", line = 1458)
    public final boolean method1535(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3620++;
        if (arg3 == arg4 && arg1 == arg2) {
            return true;
        }
        int var6 = arg2 - this.field3608;
        if (arg0 != -2) {
            this.field3614 = -82;
        }
        int var7 = arg3 - this.field3614;
        if (var7 < 0 || this.field3597 <= var7 || var6 < 0 || var6 >= this.field3603) {
            return false;
        }
        int var8 = arg1 - this.field3608;
        int var9 = arg4 - this.field3614;
        int var10;
        if (var7 > var9) {
            var10 = var7 - var9;
        } else {
            var10 = var9 - var7;
        }
        int var11;
        if (var6 <= var8) {
            var11 = var8 - var6;
        } else {
            var11 = var6 - var8;
        }
        if (var10 <= var11) {
            int var12 = 32768;
            int var13 = var10 * 65536 / var11;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field3605[var9][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field3605[var9][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var9 < var7) {
                        if ((this.field3605[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var7) {
                        if ((this.field3605[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field3605[var9][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field3605[var9][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 < var6) {
                        if ((this.field3605[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field3605[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field3605[var7][var6] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIII)V", line = 1610)
    private final void method1536(byte arg0, int arg1, int arg2, int arg3) {
        field3593++;
        if (arg0 >= 18) {
            this.field3605[arg2][arg1] = class4.method23(this.field3605[arg2][arg1], ~arg3);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZIII)V", line = 1624)
    public final void method1537(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg1 - this.field3614;
        int var9 = arg6 - this.field3608;
        int var10 = 256;
        if (arg0 != 20851) {
            field3606 = (class242) null;
        }
        field3612++;
        if (arg3) {
            var10 += 131072;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg2;
            arg2 = arg5;
            arg5 = var11;
        }
        for (int var12 = var8; var12 < var8 + arg2; var12++) {
            if (var12 >= 0 && var12 < this.field3597) {
                for (int var13 = var9; var13 < (arg5 + var9); var13++) {
                    if (var13 >= 0 && this.field3603 > var13) {
                        this.method1536((byte) 32, var13, var12, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V", line = 1677)
    public final void method1538(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3608;
        if (arg2 < -3) {
            field3602++;
            int var5 = arg0 - this.field3614;
            this.field3605[var5][var4] = class240.method1652(this.field3605[var5][var4], 262144);
        }
    }
}
