import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class149 {

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    private int field3694 = 0;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    private int field3699 = 0;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    private int field3677;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    private int field3690;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[[I")
    public int[][] field3675;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    public static int[] field3676 = new int[128];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3671 = 127;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Loa;")
    public static class98 field3674 = null;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Loa;")
    private static class98 field3684 = class38.method349(255, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3687 = 0;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static volatile int field3681 = -1;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Loa;")
    public static class98 field3686 = class38.method349(255, "@or2@");

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Loa;")
    public static class98 field3688 = class38.method349(255, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Loa;")
    public static class98 field3697 = field3684;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field3691 = 0;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZIII)V")
    public final void method1185(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3693++;
        int var7 = arg3 - this.field3694;
        int var8 = arg5 - this.field3699;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1193((byte) -73, var7, 128, var8);
                this.method1193((byte) -112, var7 - 1, 8, var8);
            }
            if (arg1 == 1) {
                this.method1193((byte) 112, var7, 2, var8);
                this.method1193((byte) 114, var7, 32, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1193((byte) -24, var7, 8, var8);
                this.method1193((byte) -24, var7 + 1, 128, var8);
            }
            if (arg1 == 3) {
                this.method1193((byte) 112, var7, 32, var8);
                this.method1193((byte) -33, var7, 2, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1193((byte) -93, var7, 1, var8);
                this.method1193((byte) 100, var7 - 1, 16, var8 + 1);
            }
            if (arg1 == 1) {
                this.method1193((byte) -72, var7, 4, var8);
                this.method1193((byte) -100, var7 + 1, 64, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1193((byte) 103, var7, 16, var8);
                this.method1193((byte) 126, var7 + 1, 1, var8 - 1);
            }
            if (arg1 == 3) {
                this.method1193((byte) 7, var7, 64, var8);
                this.method1193((byte) 7, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method1193((byte) -14, var7, 130, var8);
                this.method1193((byte) 125, var7 - 1, 8, var8);
                this.method1193((byte) 102, var7, 32, var8 + 1);
            }
            if (arg1 == 1) {
                this.method1193((byte) 124, var7, 10, var8);
                this.method1193((byte) -11, var7, 32, var8 + 1);
                this.method1193((byte) 104, var7 + 1, 128, var8);
            }
            if (arg1 == 2) {
                this.method1193((byte) 100, var7, 40, var8);
                this.method1193((byte) 113, var7 + 1, 128, var8);
                this.method1193((byte) 106, var7, 2, var8 - 1);
            }
            if (arg1 == 3) {
                this.method1193((byte) -125, var7, 160, var8);
                this.method1193((byte) 113, var7, 2, var8 - 1);
                this.method1193((byte) -77, var7 - 1, 8, var8);
            }
        }
        int var9 = -125 / ((arg4 - 46) / 33);
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1193((byte) -84, var7, 65536, var8);
                this.method1193((byte) -16, var7 - 1, 4096, var8);
            }
            if (arg1 == 1) {
                this.method1193((byte) 127, var7, 1024, var8);
                this.method1193((byte) -42, var7, 16384, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1193((byte) -20, var7, 4096, var8);
                this.method1193((byte) -20, var7 + 1, 65536, var8);
            }
            if (arg1 == 3) {
                this.method1193((byte) -12, var7, 16384, var8);
                this.method1193((byte) 110, var7, 1024, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1193((byte) 101, var7, 512, var8);
                this.method1193((byte) 108, var7 - 1, 8192, var8 + 1);
            }
            if (arg1 == 1) {
                this.method1193((byte) 103, var7, 2048, var8);
                this.method1193((byte) 115, var7 + 1, 32768, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1193((byte) -1, var7, 8192, var8);
                this.method1193((byte) -123, var7 + 1, 512, var8 - 1);
            }
            if (arg1 == 3) {
                this.method1193((byte) -59, var7, 32768, var8);
                this.method1193((byte) -94, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1193((byte) -107, var7, 66560, var8);
            this.method1193((byte) 119, var7 - 1, 4096, var8);
            this.method1193((byte) 109, var7, 16384, var8 + 1);
        }
        if (arg1 == 1) {
            this.method1193((byte) -18, var7, 5120, var8);
            this.method1193((byte) -99, var7, 16384, var8 + 1);
            this.method1193((byte) 112, var7 + 1, 65536, var8);
        }
        if (arg1 == 2) {
            this.method1193((byte) 127, var7, 20480, var8);
            this.method1193((byte) 110, var7 + 1, 65536, var8);
            this.method1193((byte) 101, var7, 1024, var8 - 1);
        }
        if (arg1 == 3) {
            this.method1193((byte) -67, var7, 81920, var8);
            this.method1193((byte) 97, var7, 1024, var8 - 1);
            this.method1193((byte) -59, var7 - 1, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZIIIII)Z")
    public final boolean method1186(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3695++;
        if (arg3 == arg5 && arg4 == arg6) {
            return true;
        }
        int var8 = arg4 - this.field3699;
        int var9 = arg5 - this.field3694;
        int var10 = arg3 - this.field3694;
        int var11 = arg6 - this.field3699;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var9 && var8 == var11 && (this.field3675[var9][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field3675[var9][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field3675[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field3675[var9][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field3675[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field3675[var9][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var9 && var8 == var11 && (this.field3675[var9][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field3675[var9][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (!arg1) {
            this.field3690 = -95;
        }
        if (arg0 == 8) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field3675[var9][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field3675[var9][var8] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field3675[var9][var8] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field3675[var9][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIZII)V")
    public final void method1187(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field3694;
        int var9 = arg0 - this.field3699;
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg3;
            arg3 = arg2;
            arg2 = var10;
        }
        int var11 = arg6;
        field3679++;
        if (arg4) {
            var11 = arg6 + 131072;
        }
        for (int var12 = var8; var12 < arg3 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field3690) {
                for (int var13 = var9; var13 < var9 + arg2; var13++) {
                    if (var13 >= 0 && var13 < this.field3677) {
                        this.method1196(true, var13, var12, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)V")
    public final void method1188(byte arg0, int arg1, int arg2) {
        field3698++;
        int var4 = arg2 - this.field3694;
        int var5 = arg1 - this.field3699;
        if (arg0 != -68) {
            this.method1193((byte) -97, 18, 113, 42);
        }
        this.field3675[var4][var5] = class94.method751(this.field3675[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)V")
    public final void method1189(int arg0, boolean arg1, int arg2) {
        field3683++;
        if (!arg1) {
            this.field3677 = -110;
        }
        int var4 = arg0 - this.field3699;
        int var5 = arg2 - this.field3694;
        this.field3675[var5][var4] = class150.method1211(this.field3675[var5][var4], 14680063);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIIIIII)V")
    public final void method1190(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field3699;
        int var9 = 256;
        int var10 = arg1 - this.field3694;
        if (arg0) {
            var9 += 131072;
        }
        field3689++;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg5;
            arg5 = arg2;
            arg2 = var11;
        }
        if (arg4 != 2) {
            field3691 = -40;
        }
        for (int var12 = var10; var12 < arg5 + var10; var12++) {
            if (var12 >= 0 && var12 < this.field3690) {
                for (int var13 = var8; var13 < var8 + arg2; var13++) {
                    if (var13 >= 0 && var13 < this.field3677) {
                        this.method1193((byte) -123, var12, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIZ)V")
    public final void method1191(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field3694;
        field3682++;
        int var8 = arg3 - this.field3699;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method1196(true, var8, var7, 128);
                this.method1196(true, var8, var7 - 1, 8);
            }
            if (arg2 == 1) {
                this.method1196(true, var8, var7, 2);
                this.method1196(true, var8 + 1, var7, 32);
            }
            if (arg2 == 2) {
                this.method1196(true, var8, var7, 8);
                this.method1196(true, var8, var7 + 1, 128);
            }
            if (arg2 == 3) {
                this.method1196(true, var8, var7, 32);
                this.method1196(true, var8 - 1, var7, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method1196(true, var8, var7, 1);
                this.method1196(true, var8 + 1, var7 + -1, 16);
            }
            if (arg2 == 1) {
                this.method1196(true, var8, var7, 4);
                this.method1196(true, var8 + 1, var7 - -1, 64);
            }
            if (arg2 == 2) {
                this.method1196(true, var8, var7, 16);
                this.method1196(true, var8 - 1, var7 + 1, 1);
            }
            if (arg2 == 3) {
                this.method1196(true, var8, var7, 64);
                this.method1196(true, var8 - 1, var7 + -1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method1196(true, var8, var7, 130);
                this.method1196(true, var8, var7 - 1, 8);
                this.method1196(true, var8 + 1, var7, 32);
            }
            if (arg2 == 1) {
                this.method1196(true, var8, var7, 10);
                this.method1196(true, var8 + 1, var7, 32);
                this.method1196(true, var8, var7 + 1, 128);
            }
            if (arg2 == 2) {
                this.method1196(true, var8, var7, 40);
                this.method1196(true, var8, var7 + 1, 128);
                this.method1196(true, var8 - 1, var7, 2);
            }
            if (arg2 == 3) {
                this.method1196(true, var8, var7, 160);
                this.method1196(true, var8 - 1, var7, 2);
                this.method1196(true, var8, var7 - 1, 8);
            }
        }
        if (arg5) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    this.method1196(true, var8, var7, 65536);
                    this.method1196(true, var8, var7 - 1, 4096);
                }
                if (arg2 == 1) {
                    this.method1196(true, var8, var7, 1024);
                    this.method1196(true, var8 + 1, var7, 16384);
                }
                if (arg2 == 2) {
                    this.method1196(true, var8, var7, 4096);
                    this.method1196(true, var8, var7 + 1, 65536);
                }
                if (arg2 == 3) {
                    this.method1196(true, var8, var7, 16384);
                    this.method1196(true, var8 - 1, var7, 1024);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg2 == 0) {
                    this.method1196(true, var8, var7, 512);
                    this.method1196(true, var8 + 1, var7 - 1, 8192);
                }
                if (arg2 == 1) {
                    this.method1196(true, var8, var7, 2048);
                    this.method1196(true, var8 + 1, var7 + 1, 32768);
                }
                if (arg2 == 2) {
                    this.method1196(true, var8, var7, 8192);
                    this.method1196(true, var8 - 1, var7 + 1, 512);
                }
                if (arg2 == 3) {
                    this.method1196(true, var8, var7, 32768);
                    this.method1196(true, var8 - 1, var7 - 1, 2048);
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    this.method1196(true, var8, var7, 66560);
                    this.method1196(true, var8, var7 - 1, 4096);
                    this.method1196(true, var8 + 1, var7, 16384);
                }
                if (arg2 == 1) {
                    this.method1196(true, var8, var7, 5120);
                    this.method1196(true, var8 + 1, var7, 16384);
                    this.method1196(true, var8, var7 + 1, 65536);
                }
                if (arg2 == 2) {
                    this.method1196(true, var8, var7, 20480);
                    this.method1196(true, var8, var7 + 1, 65536);
                    this.method1196(true, var8 - 1, var7, 1024);
                }
                if (arg2 == 3) {
                    this.method1196(true, var8, var7, 81920);
                    this.method1196(true, var8 - 1, var7, 1024);
                    this.method1196(true, var8, var7 - 1, 4096);
                }
            }
        }
        if (arg1 != 25549) {
            field3684 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIZI)Z")
    public final boolean method1192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field3685++;
        int var9 = arg4 + arg3 - 1;
        int var10 = arg5 + arg0 - 1;
        if (arg1 >= arg5 && var10 >= arg1 && arg7 >= arg3 && var9 >= arg7) {
            return true;
        }
        if (!arg6) {
            field3686 = null;
        }
        if (arg5 - 1 == arg1 && arg7 >= arg3 && arg7 <= var9 && (this.field3675[arg1 - this.field3694][arg7 - this.field3699] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg1 && arg3 <= arg7 && arg7 <= var9 && (this.field3675[arg1 - this.field3694][arg7 - this.field3699] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg7 && arg5 <= arg1 && var10 >= arg1 && (this.field3675[arg1 - this.field3694][arg7 - this.field3699] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg7 && arg5 <= arg1 && arg1 <= var10 && (this.field3675[arg1 - this.field3694][arg7 - this.field3699] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIII)V")
    private final void method1193(byte arg0, int arg1, int arg2, int arg3) {
        this.field3675[arg1][arg3] = class150.method1211(this.field3675[arg1][arg3], 16777215 - arg2);
        field3692++;
        int var5 = -47 / ((arg0 - 58) / 38);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static final void method1194(boolean arg0) {
        class19.field416.method440((byte) -108);
        field3680++;
        if (!arg0) {
            method1197(true);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class132.field3121[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class124.field2778[var2] = 0L;
        }
        class19.field421 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method1195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 21728) {
            field3681 = 79;
        }
        field3673++;
        if (arg4 == arg6 && arg1 == arg3) {
            return true;
        }
        int var8 = arg3 - this.field3699;
        int var9 = arg6 - this.field3694;
        int var10 = arg1 - this.field3699;
        int var11 = arg4 - this.field3694;
        if (arg5 == 0) {
            if (arg2 == 0) {
                if (var11 - 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field3675[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field3675[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var9 == var11 && var8 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var11 + 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field3675[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field3675[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var9 == var11 && var8 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                if (var11 - 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field3675[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field3675[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field3675[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var11 - 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field3675[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var9 == var11 && var8 + 1 == var10 && (this.field3675[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var8 - 1 == var10 && (this.field3675[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var8 == var10 && (this.field3675[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIII)V")
    private final void method1196(boolean arg0, int arg1, int arg2, int arg3) {
        this.field3675[arg2][arg1] = class94.method751(this.field3675[arg2][arg1], arg3);
        if (arg0) {
            field3678++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
    public static void method1197(boolean arg0) {
        field3688 = null;
        field3686 = null;
        field3676 = null;
        field3697 = null;
        field3684 = null;
        if (!arg0) {
            field3697 = null;
        }
        field3674 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public final void method1198(byte arg0) {
        for (int var2 = 0; var2 < this.field3690; var2++) {
            for (int var3 = 0; var3 < this.field3677; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3690 - 1 == var2 || this.field3677 - 1 == var3) {
                    this.field3675[var2][var3] = 16777215;
                } else {
                    this.field3675[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 != 35) {
            this.method1187(-56, -5, 45, 93, true, 98, 57);
        }
        field3696++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)I")
    public static final int method1199(int arg0, byte arg1) {
        if (arg1 > -118) {
            return 25;
        } else {
            field3672++;
            return arg0 >> 11 & 0x3F;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(II)V")
    public class149(int arg0, int arg1) {
        this.field3677 = arg1;
        this.field3690 = arg0;
        this.field3675 = new int[this.field3690][this.field3677];
        this.method1198((byte) 35);
    }
}
