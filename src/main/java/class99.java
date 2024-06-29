import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    private int field2379;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[[I")
    public int[][] field2391;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    private int field2394;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    private int field2393;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lu;")
    private static class135 field2385 = class87.method676((byte) -64, "Walk here");

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lu;")
    public static class135 field2380 = class87.method676((byte) -93, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2384 = -1;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
    public static int[] field2398 = new int[99];

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lu;")
    public static class135 field2402 = class87.method676((byte) -54, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Lu;")
    public static class135 field2403 = field2385;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Lre;")
    public static class122 field2407;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "Lfc;")
    public static class39 field2401;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lae;")
    public static class6 field2397;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "[Lha;")
    public static class50[] field2406;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIZ)V")
    public final void method806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2395++;
        if (arg0 == 1 || arg0 == 3) {
            int var8 = arg4;
            arg4 = arg1;
            arg1 = var8;
        }
        int var9 = arg2 - this.field2393;
        int var10 = arg5 - this.field2394;
        int var11 = -40 / ((arg3 - 77) / 49);
        int var12 = 256;
        if (arg6) {
            var12 += 131072;
        }
        for (int var13 = var10; var13 < arg4 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field2387) {
                for (int var14 = var9; var14 < arg1 + var9; var14++) {
                    if (var14 >= 0 && this.field2379 > var14) {
                        this.method819(-1, var14, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZII)V")
    public final void method807(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field2393;
        field2396++;
        int var8 = arg0 - this.field2394;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method809(var7, 128, 1, var8);
                this.method809(var7, 8, 1, var8 - 1);
            }
            if (arg4 == 1) {
                this.method809(var7, 2, 1, var8);
                this.method809(var7 + 1, 32, 1, var8);
            }
            if (arg4 == 2) {
                this.method809(var7, 8, arg5 ^ 0xFFFFE8FF, var8);
                this.method809(var7, 128, 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method809(var7, 32, 1, var8);
                this.method809(var7 - 1, 2, 1, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method809(var7, 1, arg5 ^ 0xFFFFE8FF, var8);
                this.method809(var7 + 1, 16, 1, var8 - 1);
            }
            if (arg4 == 1) {
                this.method809(var7, 4, 1, var8);
                this.method809(var7 + 1, 64, 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method809(var7, 16, arg5 + 5891, var8);
                this.method809(var7 - 1, 1, arg5 ^ 0xFFFFE8FF, var8 + 1);
            }
            if (arg4 == 3) {
                this.method809(var7, 64, 1, var8);
                this.method809(var7 - 1, 4, arg5 + 5891, var8 + -1);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method809(var7, 130, 1, var8);
                this.method809(var7, 8, 1, var8 - 1);
                this.method809(var7 + 1, 32, 1, var8);
            }
            if (arg4 == 1) {
                this.method809(var7, 10, 1, var8);
                this.method809(var7 + 1, 32, arg5 + 5891, var8);
                this.method809(var7, 128, arg5 + 5891, var8 + 1);
            }
            if (arg4 == 2) {
                this.method809(var7, 40, arg5 + 5891, var8);
                this.method809(var7, 128, 1, var8 + 1);
                this.method809(var7 - 1, 2, arg5 ^ 0xFFFFE8FF, var8);
            }
            if (arg4 == 3) {
                this.method809(var7, 160, 1, var8);
                this.method809(var7 - 1, 2, 1, var8);
                this.method809(var7, 8, 1, var8 - 1);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg4 == 0) {
                    this.method809(var7, 65536, 1, var8);
                    this.method809(var7, 4096, 1, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method809(var7, 1024, 1, var8);
                    this.method809(var7 + 1, 16384, 1, var8);
                }
                if (arg4 == 2) {
                    this.method809(var7, 4096, 1, var8);
                    this.method809(var7, 65536, 1, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method809(var7, 16384, 1, var8);
                    this.method809(var7 - 1, 1024, 1, var8);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg4 == 0) {
                    this.method809(var7, 512, 1, var8);
                    this.method809(var7 + 1, 8192, 1, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method809(var7, 2048, 1, var8);
                    this.method809(var7 + 1, 32768, 1, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method809(var7, 8192, 1, var8);
                    this.method809(var7 - 1, 512, 1, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method809(var7, 32768, 1, var8);
                    this.method809(var7 - 1, 2048, 1, var8 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    this.method809(var7, 66560, 1, var8);
                    this.method809(var7, 4096, 1, var8 - 1);
                    this.method809(var7 + 1, 16384, 1, var8);
                }
                if (arg4 == 1) {
                    this.method809(var7, 5120, arg5 ^ 0xFFFFE8FF, var8);
                    this.method809(var7 + 1, 16384, 1, var8);
                    this.method809(var7, 65536, 1, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method809(var7, 20480, 1, var8);
                    this.method809(var7, 65536, 1, var8 + 1);
                    this.method809(var7 - 1, 1024, 1, var8);
                }
                if (arg4 == 3) {
                    this.method809(var7, 81920, 1, var8);
                    this.method809(var7 - 1, 1024, 1, var8);
                    this.method809(var7, 4096, 1, var8 - 1);
                }
            }
        }
        if (arg5 != -5890) {
            this.field2387 = -73;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2383++;
        if (arg4 == arg6 && arg2 == arg3) {
            return true;
        }
        int var8 = arg2 - this.field2393;
        int var9 = arg6 - this.field2394;
        int var10 = arg4 - this.field2394;
        int var11 = arg3 - this.field2393;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field2391[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2391[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field2391[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2391[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field2391[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2391[var10][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field2391[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2391[var10][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field2391[var10][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field2391[var10][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field2391[var10][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field2391[var10][var8] & 0x80) == 0) {
                return true;
            }
        }
        return arg1 != 1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)V")
    private final void method809(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            field2385 = null;
        }
        this.field2391[arg3][arg0] = class4.method19(this.field2391[arg3][arg0], ~arg1);
        field2381++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIIIZ)V")
    public final void method810(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg4 - this.field2393;
        int var9 = arg3 - this.field2394;
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg5;
            arg5 = arg2;
            arg2 = var10;
        }
        field2405++;
        int var11 = 256;
        if (arg6) {
            var11 += 131072;
        }
        int var12 = var9;
        if (arg1 != -38) {
            this.method813(-119, 126, -54);
        }
        while (var9 + arg5 > var12) {
            if (var12 >= 0 && this.field2387 > var12) {
                for (int var13 = var8; var13 < arg2 + var8; var13++) {
                    if (var13 >= 0 && this.field2379 > var13) {
                        this.method809(var13, var11, 1, var12);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIZIII)V")
    public final void method811(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2400++;
        if (!arg0) {
            this.method807(74, -49, -125, true, -44, 74);
        }
        int var7 = arg3 - this.field2394;
        int var8 = arg4 - this.field2393;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method819(-1, var8, 128, var7);
                this.method819(-1, var8, 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method819(-1, var8, 2, var7);
                this.method819(-1, var8 + 1, 32, var7);
            }
            if (arg5 == 2) {
                this.method819(-1, var8, 8, var7);
                this.method819(-1, var8, 128, var7 + 1);
            }
            if (arg5 == 3) {
                this.method819(-1, var8, 32, var7);
                this.method819(-1, var8 - 1, 2, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method819(-1, var8, 1, var7);
                this.method819(-1, var8 + 1, 16, var7 - 1);
            }
            if (arg5 == 1) {
                this.method819(-1, var8, 4, var7);
                this.method819(-1, var8 + 1, 64, var7 + 1);
            }
            if (arg5 == 2) {
                this.method819(-1, var8, 16, var7);
                this.method819(-1, var8 - 1, 1, var7 + 1);
            }
            if (arg5 == 3) {
                this.method819(-1, var8, 64, var7);
                this.method819(-1, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method819(-1, var8, 130, var7);
                this.method819(-1, var8, 8, var7 - 1);
                this.method819(-1, var8 + 1, 32, var7);
            }
            if (arg5 == 1) {
                this.method819(-1, var8, 10, var7);
                this.method819(-1, var8 + 1, 32, var7);
                this.method819(-1, var8, 128, var7 + 1);
            }
            if (arg5 == 2) {
                this.method819(-1, var8, 40, var7);
                this.method819(-1, var8, 128, var7 + 1);
                this.method819(-1, var8 - 1, 2, var7);
            }
            if (arg5 == 3) {
                this.method819(-1, var8, 160, var7);
                this.method819(-1, var8 - 1, 2, var7);
                this.method819(-1, var8, 8, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method819(-1, var8, 65536, var7);
                this.method819(-1, var8, 4096, var7 - 1);
            }
            if (arg5 == 1) {
                this.method819(-1, var8, 1024, var7);
                this.method819(-1, var8 + 1, 16384, var7);
            }
            if (arg5 == 2) {
                this.method819(-1, var8, 4096, var7);
                this.method819(-1, var8, 65536, var7 + 1);
            }
            if (arg5 == 3) {
                this.method819(-1, var8, 16384, var7);
                this.method819(-1, var8 - 1, 1024, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method819(-1, var8, 512, var7);
                this.method819(-1, var8 + 1, 8192, var7 - 1);
            }
            if (arg5 == 1) {
                this.method819(-1, var8, 2048, var7);
                this.method819(-1, var8 + 1, 32768, var7 + 1);
            }
            if (arg5 == 2) {
                this.method819(-1, var8, 8192, var7);
                this.method819(-1, var8 - 1, 512, var7 + 1);
            }
            if (arg5 == 3) {
                this.method819(-1, var8, 32768, var7);
                this.method819(-1, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method819(-1, var8, 66560, var7);
            this.method819(-1, var8, 4096, var7 - 1);
            this.method819(-1, var8 + 1, 16384, var7);
        }
        if (arg5 == 1) {
            this.method819(-1, var8, 5120, var7);
            this.method819(-1, var8 + 1, 16384, var7);
            this.method819(-1, var8, 65536, var7 + 1);
        }
        if (arg5 == 2) {
            this.method819(-1, var8, 20480, var7);
            this.method819(-1, var8, 65536, var7 + 1);
            this.method819(-1, var8 - 1, 1024, var7);
        }
        if (arg5 == 3) {
            this.method819(-1, var8, 81920, var7);
            this.method819(-1, var8 - 1, 1024, var7);
            this.method819(-1, var8, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZ)V")
    public final void method812(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field2393;
        int var5 = arg0 - this.field2394;
        this.field2391[var5][var4] = class4.method19(this.field2391[var5][var4], -262145);
        if (arg2) {
            this.method816((byte) 97, -65, -125, -108, -29, 16, 42, -110);
        }
        field2392++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public final void method813(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2393;
        field2399++;
        int var5 = arg1 - this.field2394;
        if (arg2 == 19661064) {
            this.field2391[var5][var4] = class44.method346(this.field2391[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -9 % ((38 - arg4) / 38);
        field2382++;
        if (arg3 == arg6 && arg0 == arg1) {
            return true;
        }
        int var9 = arg3 - this.field2394;
        int var10 = arg0 - this.field2393;
        int var11 = arg1 - this.field2393;
        int var12 = arg6 - this.field2394;
        if (arg5 == 0) {
            if (arg2 == 0) {
                if (var12 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var10 + 1 == var11 && (this.field2391[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field2391[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var9 == var12 && var10 + 1 == var11) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var12 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var10 + 1 == var11 && (this.field2391[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field2391[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var9 == var12 && var10 - 1 == var11) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                if (var12 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var10 + 1 == var11) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field2391[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var12 - 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 + 1 == var11) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field2391[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var12 - 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 + 1 == var11 && (this.field2391[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var12 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var10 + 1 == var11 && (this.field2391[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var9 == var12 && var10 + 1 == var11 && (this.field2391[var9][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var12 && var10 - 1 == var11 && (this.field2391[var9][var11] & 0x2) == 0) {
                return true;
            }
            if (var12 - 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x8) == 0) {
                return true;
            }
            if (var12 + 1 == var9 && var10 == var11 && (this.field2391[var9][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method815(int arg0) {
        field2401 = null;
        field2398 = null;
        field2406 = null;
        field2407 = null;
        field2403 = null;
        if (arg0 == -15687) {
            field2397 = null;
            field2380 = null;
            field2402 = null;
            field2385 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BIIIIIII)Z")
    public final boolean method816(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2386++;
        int var9 = 38 / ((arg0 - 38) / 34);
        int var10 = arg1 + arg4 - 1;
        int var11 = arg3 + arg6 - 1;
        if (arg2 >= arg3 && var11 >= arg2 && arg1 <= arg7 && var10 >= arg7) {
            return true;
        } else if (arg3 - 1 == arg2 && arg7 >= arg1 && arg7 <= var10 && (this.field2391[arg2 - this.field2394][arg7 - this.field2393] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var11 + 1 == arg2 && arg1 <= arg7 && var10 >= arg7 && (this.field2391[arg2 - this.field2394][arg7 - this.field2393] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg7 && arg3 <= arg2 && var11 >= arg2 && (this.field2391[arg2 - this.field2394][arg7 - this.field2393] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg2 >= arg3 && arg2 <= var11 && (this.field2391[arg2 - this.field2394][arg7 - this.field2393] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public final void method817(int arg0) {
        if (arg0 < 120) {
            this.field2391 = null;
        }
        for (int var2 = 0; var2 < this.field2387; var2++) {
            for (int var3 = 0; var3 < this.field2379; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2387 - 1 == var2 || this.field2379 - 1 == var3) {
                    this.field2391[var2][var3] = 16777215;
                } else {
                    this.field2391[var2][var3] = 16777216;
                }
            }
        }
        field2378++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)V")
    public final void method818(int arg0, int arg1, byte arg2) {
        if (arg2 <= 8) {
            this.method807(-76, -29, 72, true, -125, 9);
        }
        int var4 = arg1 - this.field2394;
        field2388++;
        int var5 = arg0 - this.field2393;
        this.field2391[var4][var5] = class44.method346(this.field2391[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(II)V")
    public class99(int arg0, int arg1) {
        this.field2379 = arg1;
        this.field2387 = arg0;
        this.field2391 = new int[this.field2387][this.field2379];
        this.field2394 = 0;
        this.field2393 = 0;
        this.method817(121);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIII)V")
    private final void method819(int arg0, int arg1, int arg2, int arg3) {
        this.field2391[arg3][arg1] = class44.method346(this.field2391[arg3][arg1], arg2);
        if (arg0 != -1) {
            this.method809(29, -75, -78, -58);
        }
        field2404++;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2398[var1] = var0 / 4;
        }
    }
}
