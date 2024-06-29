import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class8 {

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    private int field93;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "[[I")
    public int[][] field89;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "[I")
    public static int[] field90 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIII)V", line = 4)
    private final void method41(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field90 = (int[]) null;
        }
        this.field89[arg1][arg2] = class335.method2339(this.field89[arg1][arg2], ~arg3);
        field82++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIII)V", line = 15)
    public static final void method42(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field79++;
        class96.method697((byte) 115, class331.field4902[arg0], arg4, arg2 - arg3, arg2 + arg3);
        int var5 = 0;
        if (arg1) {
            method53(true, (byte[]) null, -35, 71, -41, (class8[]) null);
        }
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class331.field4902[arg0 - var6];
                int[] var10 = class331.field4902[arg0 + var6];
                int var11 = arg2 - var5;
                int var12 = arg2 + var5;
                class96.method697((byte) 115, var10, arg4, var11, var12);
                class96.method697((byte) 115, var9, arg4, var11, var12);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class331.field4902[arg0 + var5];
            int[] var16 = class331.field4902[arg0 - var5];
            class96.method697((byte) 115, var15, arg4, var14, var13);
            class96.method697((byte) 115, var16, arg4, var14, var13);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V", line = 72)
    public final void method43(int arg0, int arg1, int arg2) {
        int var4 = 91 % ((arg1 - 53) / 51);
        int var5 = arg0 - this.field86;
        field78++;
        int var6 = arg2 - this.field80;
        this.field89[var6][var5] = class80.method568(this.field89[var6][var5], 262144);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZIIIII)V", line = 85)
    public final void method44(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field86;
        field75++;
        int var9 = 256;
        int var10 = arg6 - this.field80;
        if (arg0) {
            var9 |= 0x20000;
        }
        if (arg1) {
            var9 |= 0x40000000;
        }
        for (int var11 = var10; var11 < (var10 + arg3); var11++) {
            if (var11 >= 0 && this.field93 > var11) {
                for (int var12 = var8; var12 < (arg2 + var8); var12++) {
                    if (var12 >= 0 && this.field76 > var12) {
                        this.method58(var9, var12, var11, -1);
                    }
                }
            }
        }
        if (arg5 != -32566) {
            this.method57(0, -98, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZIIZ)V", line = 130)
    public final void method45(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        int var9 = arg1 - this.field86;
        if (arg3 != 3) {
            return;
        }
        field74++;
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg6;
            arg6 = arg2;
            arg2 = var10;
        }
        int var11 = arg5 - this.field80;
        int var12 = 256;
        if (arg4) {
            var12 |= 0x20000;
        }
        if (arg7) {
            var12 |= 0x40000000;
        }
        for (int var13 = var11; var13 < (arg6 + var11); var13++) {
            if (var13 >= 0 && this.field93 > var13) {
                for (int var14 = var9; var14 < (arg2 + var9); var14++) {
                    if (var14 >= 0 && this.field76 > var14) {
                        this.method41(true, var13, var14, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIIZII)V", line = 185)
    public final void method46(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field80;
        field96++;
        int var9 = arg6 - this.field86;
        if (arg5 < 120) {
            this.field89 = (int[][]) ((int[][]) null);
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method41(true, var8, var9, 128);
                this.method41(true, var8 - 1, var9, 8);
            }
            if (arg0 == 1) {
                this.method41(true, var8, var9, 2);
                this.method41(true, var8, var9 + 1, 32);
            }
            if (arg0 == 2) {
                this.method41(true, var8, var9, 8);
                this.method41(true, var8 + 1, var9, 128);
            }
            if (arg0 == 3) {
                this.method41(true, var8, var9, 32);
                this.method41(true, var8, var9 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method41(true, var8, var9, 1);
                this.method41(true, var8 - 1, var9 + 1, 16);
            }
            if (arg0 == 1) {
                this.method41(true, var8, var9, 4);
                this.method41(true, var8 + 1, var9 + 1, 64);
            }
            if (arg0 == 2) {
                this.method41(true, var8, var9, 16);
                this.method41(true, var8 + 1, var9 + -1, 1);
            }
            if (arg0 == 3) {
                this.method41(true, var8, var9, 64);
                this.method41(true, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method41(true, var8, var9, 130);
                this.method41(true, var8 - 1, var9, 8);
                this.method41(true, var8, var9 + 1, 32);
            }
            if (arg0 == 1) {
                this.method41(true, var8, var9, 10);
                this.method41(true, var8, var9 + 1, 32);
                this.method41(true, var8 + 1, var9, 128);
            }
            if (arg0 == 2) {
                this.method41(true, var8, var9, 40);
                this.method41(true, var8 + 1, var9, 128);
                this.method41(true, var8, var9 - 1, 2);
            }
            if (arg0 == 3) {
                this.method41(true, var8, var9, 160);
                this.method41(true, var8, var9 - 1, 2);
                this.method41(true, var8 - 1, var9, 8);
            }
        }
        if (arg4) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method41(true, var8, var9, 65536);
                    this.method41(true, var8 - 1, var9, 4096);
                }
                if (arg0 == 1) {
                    this.method41(true, var8, var9, 1024);
                    this.method41(true, var8, var9 + 1, 16384);
                }
                if (arg0 == 2) {
                    this.method41(true, var8, var9, 4096);
                    this.method41(true, var8 + 1, var9, 65536);
                }
                if (arg0 == 3) {
                    this.method41(true, var8, var9, 16384);
                    this.method41(true, var8, var9 - 1, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method41(true, var8, var9, 512);
                    this.method41(true, var8 - 1, var9 + 1, 8192);
                }
                if (arg0 == 1) {
                    this.method41(true, var8, var9, 2048);
                    this.method41(true, var8 + 1, var9 - -1, 32768);
                }
                if (arg0 == 2) {
                    this.method41(true, var8, var9, 8192);
                    this.method41(true, var8 + 1, var9 + -1, 512);
                }
                if (arg0 == 3) {
                    this.method41(true, var8, var9, 32768);
                    this.method41(true, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method41(true, var8, var9, 66560);
                    this.method41(true, var8 - 1, var9, 4096);
                    this.method41(true, var8, var9 + 1, 16384);
                }
                if (arg0 == 1) {
                    this.method41(true, var8, var9, 5120);
                    this.method41(true, var8, var9 + 1, 16384);
                    this.method41(true, var8 + 1, var9, 65536);
                }
                if (arg0 == 2) {
                    this.method41(true, var8, var9, 20480);
                    this.method41(true, var8 + 1, var9, 65536);
                    this.method41(true, var8, var9 - 1, 1024);
                }
                if (arg0 == 3) {
                    this.method41(true, var8, var9, 81920);
                    this.method41(true, var8, var9 - 1, 1024);
                    this.method41(true, var8 - 1, var9, 4096);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method41(true, var8, var9, 536870912);
                this.method41(true, var8 - 1, var9, 33554432);
            }
            if (arg0 == 1) {
                this.method41(true, var8, var9, 8388608);
                this.method41(true, var8, var9 + 1, 134217728);
            }
            if (arg0 == 2) {
                this.method41(true, var8, var9, 33554432);
                this.method41(true, var8 + 1, var9, 536870912);
            }
            if (arg0 == 3) {
                this.method41(true, var8, var9, 134217728);
                this.method41(true, var8, var9 - 1, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method41(true, var8, var9, 4194304);
                this.method41(true, var8 - 1, var9 + 1, 67108864);
            }
            if (arg0 == 1) {
                this.method41(true, var8, var9, 16777216);
                this.method41(true, var8 + 1, var9 - -1, 268435456);
            }
            if (arg0 == 2) {
                this.method41(true, var8, var9, 67108864);
                this.method41(true, var8 + 1, var9 + -1, 4194304);
            }
            if (arg0 == 3) {
                this.method41(true, var8, var9, 268435456);
                this.method41(true, var8 - 1, var9 - 1, 16777216);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method41(true, var8, var9, 545259520);
            this.method41(true, var8 - 1, var9, 33554432);
            this.method41(true, var8, var9 + 1, 134217728);
        }
        if (arg0 == 1) {
            this.method41(true, var8, var9, 41943040);
            this.method41(true, var8, var9 + 1, 134217728);
            this.method41(true, var8 + 1, var9, 536870912);
        }
        if (arg0 == 2) {
            this.method41(true, var8, var9, 167772160);
            this.method41(true, var8 + 1, var9, 536870912);
            this.method41(true, var8, var9 - 1, 8388608);
        }
        if (arg0 == 3) {
            this.method41(true, var8, var9, 671088640);
            this.method41(true, var8, var9 - 1, 8388608);
            this.method41(true, var8 - 1, var9, 33554432);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIII)Z", line = 503)
    public final boolean method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field94++;
        if (arg3 <= 1) {
            int var10 = arg4 + arg6 - 1;
            int var11 = arg5 + arg7 - 1;
            if (arg8 >= arg5 && var11 >= arg8 && arg4 <= arg0 && arg0 <= var10) {
                return true;
            } else if (arg1 + arg5 == arg8 && arg4 <= arg0 && arg0 <= var10 && (this.field89[arg8 - this.field80][arg0 - this.field86] & 0x8) == 0 && (arg2 & 0x8) == 0) {
                return true;
            } else if ((var11 + 1) == arg8 && arg0 >= arg4 && arg0 <= var10 && (this.field89[arg8 - this.field80][arg0 - this.field86] & 0x80) == 0 && (arg2 & 0x2) == 0) {
                return true;
            } else if ((arg4 - 1) == arg0 && arg5 <= arg8 && arg8 <= var11 && (this.field89[arg8 - this.field80][arg0 - this.field86] & 0x2) == 0 && (arg2 & 0x4) == 0) {
                return true;
            } else {
                return var10 + 1 == arg0 && arg8 >= arg5 && arg8 <= var11 && (this.field89[arg8 - this.field80][arg0 - this.field86] & 0x20) == 0 && (arg2 & 0x1) == 0;
            }
        } else if (class231.method1648(arg0, arg5, arg6, arg3, arg4, arg7, -111, arg8, arg3)) {
            return true;
        } else {
            return this.method55(arg6, arg3, arg8, arg7, -107, arg3, arg0, arg5, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 544)
    public static void method48(int arg0) {
        if (arg0 != 4624) {
            method49(-61, -128, (long[]) null, -26, (int[]) null);
        }
        field90 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[JI[I)V", line = 554)
    public static final void method49(int arg0, int arg1, long[] arg2, int arg3, int[] arg4) {
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var9;
            for (int var10 = arg3; var10 < arg1; var10++) {
                if (arg2[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var9;
            method49(arg0, var6 - 1, arg2, arg3, arg4);
            method49(1, arg1, arg2, var6 + 1, arg4);
        }
        field73++;
        if (arg0 != 1) {
            field88 = -111;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZZIII)V", line = 609)
    public final void method50(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field85++;
        if (arg1 != -21665) {
            field90 = (int[]) null;
        }
        int var8 = arg0 - this.field86;
        int var9 = arg4 - this.field80;
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method58(128, var8, var9, arg1 + 21664);
                this.method58(8, var8, var9 - 1, -1);
            }
            if (arg6 == 1) {
                this.method58(2, var8, var9, -1);
                this.method58(32, var8 + 1, var9, -1);
            }
            if (arg6 == 2) {
                this.method58(8, var8, var9, -1);
                this.method58(128, var8, var9 + 1, arg1 + 21664);
            }
            if (arg6 == 3) {
                this.method58(32, var8, var9, -1);
                this.method58(2, var8 - 1, var9, -1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method58(1, var8, var9, -1);
                this.method58(16, var8 + 1, var9 + -1, -1);
            }
            if (arg6 == 1) {
                this.method58(4, var8, var9, -1);
                this.method58(64, var8 + 1, var9 - -1, arg1 ^ 0x54A0);
            }
            if (arg6 == 2) {
                this.method58(16, var8, var9, arg1 + 21664);
                this.method58(1, var8 - 1, var9 + 1, -1);
            }
            if (arg6 == 3) {
                this.method58(64, var8, var9, -1);
                this.method58(4, var8 - 1, var9 + -1, -1);
            }
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                this.method58(130, var8, var9, arg1 + 21664);
                this.method58(8, var8, var9 - 1, -1);
                this.method58(32, var8 + 1, var9, -1);
            }
            if (arg6 == 1) {
                this.method58(10, var8, var9, arg1 ^ 0x54A0);
                this.method58(32, var8 + 1, var9, -1);
                this.method58(128, var8, var9 + 1, arg1 ^ 0x54A0);
            }
            if (arg6 == 2) {
                this.method58(40, var8, var9, -1);
                this.method58(128, var8, var9 + 1, -1);
                this.method58(2, var8 - 1, var9, -1);
            }
            if (arg6 == 3) {
                this.method58(160, var8, var9, -1);
                this.method58(2, var8 - 1, var9, -1);
                this.method58(8, var8, var9 - 1, -1);
            }
        }
        if (arg2) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    this.method58(65536, var8, var9, -1);
                    this.method58(4096, var8, var9 - 1, -1);
                }
                if (arg6 == 1) {
                    this.method58(1024, var8, var9, -1);
                    this.method58(16384, var8 + 1, var9, -1);
                }
                if (arg6 == 2) {
                    this.method58(4096, var8, var9, -1);
                    this.method58(65536, var8, var9 + 1, -1);
                }
                if (arg6 == 3) {
                    this.method58(16384, var8, var9, -1);
                    this.method58(1024, var8 - 1, var9, -1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg6 == 0) {
                    this.method58(512, var8, var9, -1);
                    this.method58(8192, var8 + 1, var9 + -1, arg1 ^ 0x54A0);
                }
                if (arg6 == 1) {
                    this.method58(2048, var8, var9, -1);
                    this.method58(32768, var8 + 1, var9 - -1, -1);
                }
                if (arg6 == 2) {
                    this.method58(8192, var8, var9, -1);
                    this.method58(512, var8 - 1, var9 - -1, -1);
                }
                if (arg6 == 3) {
                    this.method58(32768, var8, var9, -1);
                    this.method58(2048, var8 - 1, var9 + -1, -1);
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    this.method58(66560, var8, var9, arg1 ^ 0x54A0);
                    this.method58(4096, var8, var9 - 1, -1);
                    this.method58(16384, var8 + 1, var9, -1);
                }
                if (arg6 == 1) {
                    this.method58(5120, var8, var9, -1);
                    this.method58(16384, var8 + 1, var9, -1);
                    this.method58(65536, var8, var9 + 1, arg1 ^ 0x54A0);
                }
                if (arg6 == 2) {
                    this.method58(20480, var8, var9, -1);
                    this.method58(65536, var8, var9 + 1, arg1 ^ 0x54A0);
                    this.method58(1024, var8 - 1, var9, arg1 + 21664);
                }
                if (arg6 == 3) {
                    this.method58(81920, var8, var9, -1);
                    this.method58(1024, var8 - 1, var9, -1);
                    this.method58(4096, var8, var9 - 1, -1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method58(536870912, var8, var9, -1);
                this.method58(33554432, var8, var9 - 1, -1);
            }
            if (arg6 == 1) {
                this.method58(8388608, var8, var9, -1);
                this.method58(134217728, var8 + 1, var9, arg1 ^ 0x54A0);
            }
            if (arg6 == 2) {
                this.method58(33554432, var8, var9, arg1 ^ 0x54A0);
                this.method58(536870912, var8, var9 + 1, -1);
            }
            if (arg6 == 3) {
                this.method58(134217728, var8, var9, -1);
                this.method58(8388608, var8 - 1, var9, arg1 ^ 0x54A0);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method58(4194304, var8, var9, -1);
                this.method58(67108864, var8 + 1, var9 + -1, -1);
            }
            if (arg6 == 1) {
                this.method58(16777216, var8, var9, -1);
                this.method58(268435456, var8 + 1, var9 - -1, -1);
            }
            if (arg6 == 2) {
                this.method58(67108864, var8, var9, -1);
                this.method58(4194304, var8 - 1, var9 + 1, -1);
            }
            if (arg6 == 3) {
                this.method58(268435456, var8, var9, -1);
                this.method58(16777216, var8 - 1, var9 + -1, arg1 + 21664);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method58(545259520, var8, var9, -1);
            this.method58(33554432, var8, var9 - 1, arg1 + 21664);
            this.method58(134217728, var8 + 1, var9, -1);
        }
        if (arg6 == 1) {
            this.method58(41943040, var8, var9, -1);
            this.method58(134217728, var8 + 1, var9, arg1 ^ 0x54A0);
            this.method58(536870912, var8, var9 + 1, arg1 + 21664);
        }
        if (arg6 == 2) {
            this.method58(167772160, var8, var9, -1);
            this.method58(536870912, var8, var9 + 1, -1);
            this.method58(8388608, var8 - 1, var9, arg1 + 21664);
        }
        if (arg6 == 3) {
            this.method58(671088640, var8, var9, arg1 ^ 0x54A0);
            this.method58(8388608, var8 - 1, var9, -1);
            this.method58(33554432, var8, var9 - 1, arg1 ^ 0x54A0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIBIII)Z", line = 914)
    public final boolean method51(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field97++;
        if (arg4 > -19) {
            this.method46(-67, false, 86, 30, false, 33, -107);
        }
        if (arg6 == 1) {
            if (arg3 == arg5 && arg0 == arg2) {
                return true;
            }
        } else if (arg3 <= arg5 && arg5 <= (arg3 + arg6 - 1) && arg0 >= arg0 && arg0 <= arg0 + arg6 - 1) {
            return true;
        }
        int var9 = arg0 - this.field86;
        int var10 = arg5 - this.field80;
        int var11 = arg2 - this.field86;
        int var12 = arg3 - this.field80;
        if (arg6 == 1) {
            if (arg7 == 0) {
                if (arg1 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field89[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field89[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field89[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field89[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field89[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field89[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field89[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field89[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg1 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field89[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field89[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field89[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field89[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field89[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field89[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field89[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field89[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field89[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field89[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field89[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field89[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 - (1 - arg6);
            int var14 = arg6 + var11 - 1;
            if (arg7 == 0) {
                if (arg1 == 0) {
                    if ((var10 - arg6) == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field89[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 - arg6 == var11 && (this.field89[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 - arg6 == var12 && var11 <= var9 && var9 <= var14 && (this.field89[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14 && (this.field89[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11 && (this.field89[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 - arg6) == var11 && (this.field89[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 <= var10 && var13 >= var10 && var9 - arg6 == var11) {
                        return true;
                    }
                    if (var10 - arg6 == var12 && var11 <= var9 && var14 >= var9 && (this.field89[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9 && (this.field89[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg1 == 0) {
                    if (var10 - arg6 == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9 && (this.field89[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 - arg6) == var11 && (this.field89[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - arg6 == var12 && var9 >= var11 && var9 <= var14 && (this.field89[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 - arg6 == var11 && (this.field89[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - arg6) == var12 && var11 <= var9 && var14 >= var9 && (this.field89[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 + 1) == var11 && (this.field89[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 - arg6) == var11) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 - arg6) == var12 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11 && (this.field89[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14 && (this.field89[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 - arg6) == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11 && (this.field89[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 <= var10 && var13 >= var10 && (var9 - arg6) == var11 && (this.field89[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg6 == var12 && var9 >= var11 && var9 <= var14 && (this.field89[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 >= var11 && var9 <= var14 && (this.field89[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)Z", line = 1287)
    public final boolean method52(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field91++;
        if (arg3 == arg4 && arg1 == arg2) {
            return true;
        }
        int var6 = arg1 - this.field86;
        int var7 = arg3 - this.field80;
        if (var7 < 0 || this.field93 <= var7 || var6 < 0 || this.field76 <= var6) {
            return false;
        }
        int var8 = arg4 - this.field80;
        int var9 = arg2 - this.field86;
        if (var8 < 0 || var8 >= this.field93 || var9 < 0 || this.field76 <= var9) {
            return false;
        } else if (arg0 == 65536) {
            int var10;
            if (var6 > var9) {
                var10 = var6 - var9;
            } else {
                var10 = var9 - var6;
            }
            int var11;
            if (var7 <= var8) {
                var11 = var8 - var7;
            } else {
                var11 = var7 - var8;
            }
            if (var11 > var10) {
                int var12 = 32768;
                int var13 = var10 * 65536 / var11;
                while (var7 != var8) {
                    if (var7 > var8) {
                        if ((this.field89[var8][var9] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field89[var8][var9] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                    var12 += var13;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var6 > var9) {
                            if ((this.field89[var8][var9] & 0x2C0102) != 0) {
                                return false;
                            }
                            var9++;
                        } else if (var9 > var6) {
                            if ((this.field89[var8][var9] & 0x2C0120) != 0) {
                                return false;
                            }
                            var9--;
                        }
                    }
                }
            } else {
                int var14 = var11 * 65536 / var10;
                int var15 = 32768;
                while (var6 != var9) {
                    if (var6 > var9) {
                        if ((this.field89[var8][var9] & 0x2C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field89[var8][var9] & 0x2C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        var15 -= 65536;
                        if (var7 > var8) {
                            if ((this.field89[var8][var9] & 0x2C0108) != 0) {
                                return false;
                            }
                            var8++;
                        } else if (var8 > var7) {
                            if ((this.field89[var8][var9] & 0x2C0180) != 0) {
                                return false;
                            }
                            var8--;
                        }
                    }
                }
            }
            return (this.field89[var7][var6] & 0x240100) == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z[BIII[Lch;)V", line = 1446)
    public static final void method53(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4, class8[] arg5) {
        field83++;
        class299 var6 = new class299(arg1);
        int var7 = 37 / ((arg2 - 45) / 50);
        int var8 = -1;
        while (true) {
            int var9 = var6.method2065(126);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var6.method2046((byte) 98);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var6.method2096((byte) -122);
                int var15 = var14 & 0x3;
                int var16 = var14 >> 2;
                int var17 = var13 + arg4;
                int var18 = var12 + arg3;
                int var19 = var10 >> 12;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class8 var20 = null;
                    if (!arg0) {
                        int var21 = var19;
                        if ((class9.field101[1][var17][var18] & 0x2) == 2) {
                            var21 = var19 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg5[var21];
                        }
                    }
                    class171.method1259(var15, var19, var8, var19, var17, 4, arg0, var18, var20, !arg0, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIII)Z", line = 1528)
    public final boolean method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field95++;
        if (arg3 != 1024) {
            this.field89 = (int[][]) ((int[][]) null);
        }
        if (arg7 == 1) {
            if (arg0 == arg1 && arg2 == arg4) {
                return true;
            }
        } else if (arg1 <= arg0 && arg0 <= arg1 + arg7 - 1 && arg2 <= arg2 && (arg7 + arg2 - 1) >= arg2) {
            return true;
        }
        int var9 = arg4 - this.field86;
        int var10 = arg1 - this.field80;
        int var11 = arg0 - this.field80;
        int var12 = arg2 - this.field86;
        if (arg7 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field89[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field89[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field89[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field89[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field89[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field89[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field89[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field89[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field89[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field89[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field89[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field89[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg7 - 1;
            int var14 = arg7 + var9 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field89[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 - arg7) == var9 && (this.field89[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - arg7 == var10 && var12 >= var9 && var12 <= var14 && (this.field89[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 - arg7 == var9 && (this.field89[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 - arg7) == var10 && var9 <= var12 && var12 <= var14 && (this.field89[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 + 1 == var9 && (this.field89[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12 && (this.field89[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 + 1 == var9 && (this.field89[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field89[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var11 && var11 <= var13 && var12 - arg7 == var9 && (this.field89[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg7 == var10 && var12 >= var9 && var12 <= var14 && (this.field89[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var12 >= var9 && var14 >= var12 && (this.field89[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1719)
    private final boolean method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field81++;
        int var11 = arg2 + arg5;
        int var12 = arg3 + arg7;
        int var13 = arg1 + arg6;
        int var14 = arg9 + arg0;
        int var15 = 52 % ((arg4 + 50) / 46);
        if (arg2 == var12 && (arg8 & 0x2) == 0) {
            int var16 = arg6 <= arg9 ? arg9 : arg6;
            int var17 = var14 <= var13 ? var14 : var13;
            while (var17 > var16) {
                if ((this.field89[var12 - this.field80 - 1][var16 - this.field86] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg7 == var11 && (arg8 & 0x8) == 0) {
            int var18 = arg6 > arg9 ? arg6 : arg9;
            int var19 = var13 >= var14 ? var14 : var13;
            while (var19 > var18) {
                if ((this.field89[arg7 - this.field80][var18 - this.field86] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg6 == var14 && (arg8 & 0x1) == 0) {
            int var20 = arg2 > arg7 ? arg2 : arg7;
            int var21 = var12 <= var11 ? var12 : var11;
            while (var21 > var20) {
                if ((this.field89[var20 - this.field80][var14 - this.field86 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg9 == var13 && (arg8 & 0x4) == 0) {
            int var22 = var12 > var11 ? var11 : var12;
            for (int var23 = arg2 <= arg7 ? arg7 : arg2; var23 < var22; var23++) {
                if ((this.field89[var23 - this.field80][arg9 - this.field86] & 0x20) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 1811)
    public final void method56(int arg0) {
        if (arg0 != 11736) {
            return;
        }
        field84++;
        for (int var2 = 0; var2 < this.field93; var2++) {
            for (int var3 = 0; var3 < this.field76; var3++) {
                if (var2 == 0 || var3 == 0 || this.field93 - 5 <= var2 || var3 >= this.field76 - 5) {
                    this.field89[var2][var3] = 16777215;
                } else {
                    this.field89[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIB)V", line = 1842)
    public final void method57(int arg0, int arg1, byte arg2) {
        field77++;
        int var4 = arg0 - this.field80;
        if (arg2 >= -70) {
            this.field80 = -103;
        }
        int var5 = arg1 - this.field86;
        this.field89[var4][var5] = class80.method568(this.field89[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)V", line = 1857)
    private final void method58(int arg0, int arg1, int arg2, int arg3) {
        this.field89[arg2][arg1] = class80.method568(this.field89[arg2][arg1], arg0);
        field87++;
        if (arg3 != -1) {
            this.field93 = 78;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V", line = 1869)
    public final void method59(int arg0, int arg1, int arg2) {
        field92++;
        int var4 = arg2 - this.field86;
        int var5 = arg1 - this.field80;
        this.field89[var5][var4] = class335.method2339(this.field89[var5][var4], -262145);
        if (arg0 <= 0) {
            this.field86 = 118;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(II)V", line = 1884)
    public class8(int arg0, int arg1) {
        this.field93 = arg0;
        this.field86 = 0;
        this.field80 = 0;
        this.field76 = arg1;
        this.field89 = new int[this.field93][this.field76];
        this.method56(11736);
    }
}
