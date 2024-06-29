import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 {

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    private int field2787;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    private int field2800;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    private int field2798;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "[[I")
    public int[][] field2813;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Lec;")
    private static class32 field2792 = class73.method594("Loaded sprites", true);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
    public static int[] field2781 = new int[32];

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lec;")
    public static class32 field2783 = field2792;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Lec;")
    private static class32 field2789 = class73.method594(" more options", true);

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field2797 = 0;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Lec;")
    public static class32 field2799 = field2789;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Z")
    public static boolean field2794 = false;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lec;")
    public static class32 field2811;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "Lf;")
    public static class36 field2809;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "Lec;")
    public static class32 field2810;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "Lec;")
    private static class32 field2812;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Lec;")
    public static class32 field2808;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lec;")
    public static class32 field2815;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Lec;")
    public static class32 field2817;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "[[[B")
    public static byte[][][] field2816;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZIIIB)V")
    public final void method916(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2806++;
        if (arg5 != -73) {
            method926(94, -12);
        }
        int var7 = arg3 - this.field2798;
        int var8 = arg2 - this.field2793;
        int var9 = 256;
        if (arg1) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < arg4 + var8; var10++) {
            if (var10 >= 0 && this.field2787 > var10) {
                for (int var11 = var7; var11 < var7 + arg0; var11++) {
                    if (var11 >= 0 && this.field2800 > var11) {
                        this.method931(var9, var11, (byte) 43, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2785++;
        if (arg1 == arg4 && arg5 == arg6) {
            return true;
        }
        int var8 = arg5 - this.field2798;
        int var9 = arg4 - this.field2793;
        int var10 = arg6 - this.field2798;
        int var11 = arg1 - this.field2793;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field2813[var9][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field2813[var9][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field2813[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field2813[var9][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field2813[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field2813[var9][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field2813[var9][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field2813[var9][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        int var12 = -91 / ((arg0 - 79) / 38);
        if (arg2 == 8) {
            if (var9 == var11 && var10 + 1 == var8 && (this.field2813[var9][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var10 - 1 == var8 && (this.field2813[var9][var8] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var8 == var10 && (this.field2813[var9][var8] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var8 == var10 && (this.field2813[var9][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    public final void method918(int arg0, int arg1, int arg2) {
        field2795++;
        int var4 = arg0 - this.field2798;
        int var5 = arg2 - this.field2793;
        this.field2813[var5][var4] = class41.method326(this.field2813[var5][var4], -262145);
        if (arg1 != -31858) {
            field2797 = -62;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)V")
    public final void method919(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2793;
        field2788++;
        int var5 = arg1 - this.field2798;
        if (arg2 != 0) {
            this.method918(-48, 113, 66);
        }
        this.field2813[var4][var5] = class107.method864(this.field2813[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method920(int arg0) {
        field2816 = null;
        field2812 = null;
        if (arg0 != 0) {
            return;
        }
        field2811 = null;
        field2799 = null;
        field2792 = null;
        field2781 = null;
        field2810 = null;
        field2783 = null;
        field2817 = null;
        field2815 = null;
        field2789 = null;
        field2809 = null;
        field2808 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIB)Z")
    public final boolean method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != 5) {
            field2799 = null;
        }
        field2786++;
        int var9 = arg5 + arg1 - 1;
        int var10 = arg2 + arg4 - 1;
        if (arg3 >= arg5 && var9 >= arg3 && arg4 <= arg0 && arg0 <= var10) {
            return true;
        } else if (arg5 - 1 == arg3 && arg4 <= arg0 && var10 >= arg0 && (this.field2813[arg3 - this.field2793][arg0 - this.field2798] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg3 && arg0 >= arg4 && var10 >= arg0 && (this.field2813[arg3 - this.field2793][arg0 - this.field2798] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg0 && arg5 <= arg3 && arg3 <= var9 && (this.field2813[arg3 - this.field2793][arg0 - this.field2798] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg5 <= arg3 && arg3 <= var9 && (this.field2813[arg3 - this.field2793][arg0 - this.field2798] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIIZII)V")
    public final void method922(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field2793;
        field2804++;
        int var8 = arg4 - this.field2798;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method931(128, var8, (byte) 43, var7);
                this.method931(8, var8, (byte) 43, var7 - 1);
            }
            if (arg5 == 1) {
                this.method931(2, var8, (byte) 43, var7);
                this.method931(32, var8 + 1, (byte) 43, var7);
            }
            if (arg5 == 2) {
                this.method931(8, var8, (byte) 43, var7);
                this.method931(128, var8, (byte) 43, var7 + 1);
            }
            if (arg5 == 3) {
                this.method931(32, var8, (byte) 43, var7);
                this.method931(2, var8 - 1, (byte) 43, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method931(1, var8, (byte) 43, var7);
                this.method931(16, var8 + 1, (byte) 43, var7 - 1);
            }
            if (arg5 == 1) {
                this.method931(4, var8, (byte) 43, var7);
                this.method931(64, var8 + 1, (byte) 43, var7 + 1);
            }
            if (arg5 == 2) {
                this.method931(16, var8, (byte) 43, var7);
                this.method931(1, var8 - 1, (byte) 43, var7 + 1);
            }
            if (arg5 == 3) {
                this.method931(64, var8, (byte) 43, var7);
                this.method931(4, var8 - 1, (byte) 43, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method931(130, var8, (byte) 43, var7);
                this.method931(8, var8, (byte) 43, var7 - 1);
                this.method931(32, var8 + 1, (byte) 43, var7);
            }
            if (arg5 == 1) {
                this.method931(10, var8, (byte) 43, var7);
                this.method931(32, var8 + 1, (byte) 43, var7);
                this.method931(128, var8, (byte) 43, var7 + 1);
            }
            if (arg5 == 2) {
                this.method931(40, var8, (byte) 43, var7);
                this.method931(128, var8, (byte) 43, var7 + 1);
                this.method931(2, var8 - 1, (byte) 43, var7);
            }
            if (arg5 == 3) {
                this.method931(160, var8, (byte) 43, var7);
                this.method931(2, var8 - 1, (byte) 43, var7);
                this.method931(8, var8, (byte) 43, var7 - 1);
            }
        }
        if (!arg3) {
            this.method922(true, -69, 110, false, 67, 125);
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method931(65536, var8, (byte) 43, var7);
                this.method931(4096, var8, (byte) 43, var7 - 1);
            }
            if (arg5 == 1) {
                this.method931(1024, var8, (byte) 43, var7);
                this.method931(16384, var8 + 1, (byte) 43, var7);
            }
            if (arg5 == 2) {
                this.method931(4096, var8, (byte) 43, var7);
                this.method931(65536, var8, (byte) 43, var7 + 1);
            }
            if (arg5 == 3) {
                this.method931(16384, var8, (byte) 43, var7);
                this.method931(1024, var8 - 1, (byte) 43, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method931(512, var8, (byte) 43, var7);
                this.method931(8192, var8 + 1, (byte) 43, var7 - 1);
            }
            if (arg5 == 1) {
                this.method931(2048, var8, (byte) 43, var7);
                this.method931(32768, var8 + 1, (byte) 43, var7 + 1);
            }
            if (arg5 == 2) {
                this.method931(8192, var8, (byte) 43, var7);
                this.method931(512, var8 - 1, (byte) 43, var7 + 1);
            }
            if (arg5 == 3) {
                this.method931(32768, var8, (byte) 43, var7);
                this.method931(2048, var8 - 1, (byte) 43, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method931(66560, var8, (byte) 43, var7);
            this.method931(4096, var8, (byte) 43, var7 - 1);
            this.method931(16384, var8 + 1, (byte) 43, var7);
        }
        if (arg5 == 1) {
            this.method931(5120, var8, (byte) 43, var7);
            this.method931(16384, var8 + 1, (byte) 43, var7);
            this.method931(65536, var8, (byte) 43, var7 + 1);
        }
        if (arg5 == 2) {
            this.method931(20480, var8, (byte) 43, var7);
            this.method931(65536, var8, (byte) 43, var7 + 1);
            this.method931(1024, var8 - 1, (byte) 43, var7);
        }
        if (arg5 == 3) {
            this.method931(81920, var8, (byte) 43, var7);
            this.method931(1024, var8 - 1, (byte) 43, var7);
            this.method931(4096, var8, (byte) 43, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZIZ)V")
    public final void method923(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field2793;
        field2779++;
        int var8 = arg4 - this.field2798;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method930((byte) 99, var8, var7, 128);
                this.method930((byte) 111, var8, var7 - 1, 8);
            }
            if (arg1 == 1) {
                this.method930((byte) 100, var8, var7, 2);
                this.method930((byte) 103, var8 + 1, var7, 32);
            }
            if (arg1 == 2) {
                this.method930((byte) 101, var8, var7, 8);
                this.method930((byte) 124, var8, var7 + 1, 128);
            }
            if (arg1 == 3) {
                this.method930((byte) 104, var8, var7, 32);
                this.method930((byte) 102, var8 - 1, var7, 2);
            }
        }
        if (arg3) {
            field2794 = true;
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method930((byte) 125, var8, var7, 1);
                this.method930((byte) 115, var8 + 1, var7 + -1, 16);
            }
            if (arg1 == 1) {
                this.method930((byte) 119, var8, var7, 4);
                this.method930((byte) 102, var8 + 1, var7 + 1, 64);
            }
            if (arg1 == 2) {
                this.method930((byte) 121, var8, var7, 16);
                this.method930((byte) 100, var8 - 1, var7 - -1, 1);
            }
            if (arg1 == 3) {
                this.method930((byte) 107, var8, var7, 64);
                this.method930((byte) 106, var8 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method930((byte) 114, var8, var7, 130);
                this.method930((byte) 113, var8, var7 - 1, 8);
                this.method930((byte) 105, var8 + 1, var7, 32);
            }
            if (arg1 == 1) {
                this.method930((byte) 127, var8, var7, 10);
                this.method930((byte) 109, var8 + 1, var7, 32);
                this.method930((byte) 117, var8, var7 + 1, 128);
            }
            if (arg1 == 2) {
                this.method930((byte) 122, var8, var7, 40);
                this.method930((byte) 101, var8, var7 + 1, 128);
                this.method930((byte) 102, var8 - 1, var7, 2);
            }
            if (arg1 == 3) {
                this.method930((byte) 105, var8, var7, 160);
                this.method930((byte) 117, var8 - 1, var7, 2);
                this.method930((byte) 119, var8, var7 - 1, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method930((byte) 107, var8, var7, 65536);
                this.method930((byte) 112, var8, var7 - 1, 4096);
            }
            if (arg1 == 1) {
                this.method930((byte) 98, var8, var7, 1024);
                this.method930((byte) 112, var8 + 1, var7, 16384);
            }
            if (arg1 == 2) {
                this.method930((byte) 102, var8, var7, 4096);
                this.method930((byte) 109, var8, var7 + 1, 65536);
            }
            if (arg1 == 3) {
                this.method930((byte) 106, var8, var7, 16384);
                this.method930((byte) 114, var8 - 1, var7, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method930((byte) 127, var8, var7, 512);
                this.method930((byte) 118, var8 + 1, var7 - 1, 8192);
            }
            if (arg1 == 1) {
                this.method930((byte) 124, var8, var7, 2048);
                this.method930((byte) 103, var8 + 1, var7 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method930((byte) 114, var8, var7, 8192);
                this.method930((byte) 101, var8 - 1, var7 + 1, 512);
            }
            if (arg1 == 3) {
                this.method930((byte) 106, var8, var7, 32768);
                this.method930((byte) 107, var8 - 1, var7 + -1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method930((byte) 124, var8, var7, 66560);
            this.method930((byte) 125, var8, var7 - 1, 4096);
            this.method930((byte) 123, var8 + 1, var7, 16384);
        }
        if (arg1 == 1) {
            this.method930((byte) 107, var8, var7, 5120);
            this.method930((byte) 97, var8 + 1, var7, 16384);
            this.method930((byte) 100, var8, var7 + 1, 65536);
        }
        if (arg1 == 2) {
            this.method930((byte) 113, var8, var7, 20480);
            this.method930((byte) 101, var8, var7 + 1, 65536);
            this.method930((byte) 106, var8 - 1, var7, 1024);
        }
        if (arg1 == 3) {
            this.method930((byte) 100, var8, var7, 81920);
            this.method930((byte) 108, var8 - 1, var7, 1024);
            this.method930((byte) 107, var8, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILec;)Z")
    public static final boolean method924(int arg0, class32 arg1) {
        field2780++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class2.field20; var2++) {
            if (arg1.method271((byte) 125, class14.field239[var2])) {
                return true;
            }
        }
        int var3 = -43 % ((-arg0 - 28) / 45);
        return arg1.method271((byte) 103, class20.field373.field1660);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public final void method925(int arg0) {
        for (int var2 = 0; var2 < this.field2787; var2++) {
            for (int var3 = 0; var3 < this.field2800; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2787 - 5 <= var2 || var3 >= this.field2800 - 5) {
                    this.field2813[var2][var3] = 16777215;
                } else {
                    this.field2813[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 < 51) {
            this.method918(61, -24, -32);
        }
        field2791++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Z")
    public static final boolean method926(int arg0, int arg1) {
        field2784++;
        if (arg0 != -4124) {
            method929(false);
        }
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZII)V")
    public final void method927(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field2798;
        int var9 = 256;
        if (arg4) {
            var9 += 131072;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg1;
            arg1 = arg6;
            arg6 = var10;
        }
        field2805++;
        int var11 = arg0 - this.field2793;
        if (arg3 != 19661088) {
            this.method930((byte) -96, 118, -61, -40);
        }
        for (int var12 = var11; var12 < arg1 + var11; var12++) {
            if (var12 >= 0 && this.field2787 > var12) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && this.field2800 > var13) {
                        this.method930((byte) 110, var13, var12, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)V")
    public static final void method928(byte arg0, int arg1) {
        field2790++;
        if (arg1 == -1 || !class92.field2121[arg1]) {
            return;
        }
        if (arg0 <= 67) {
            field2808 = null;
        }
        class85.field1992.method221(arg1, false);
        if (class79.field1826[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class79.field1826[arg1].length; var3++) {
            if (class79.field1826[arg1][var3] != null) {
                if (class79.field1826[arg1][var3].field756 == 2) {
                    var2 = false;
                } else {
                    class79.field1826[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class79.field1826[arg1] = null;
        }
        class92.field2121[arg1] = false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static final void method929(boolean arg0) {
        class134.field3131 = null;
        class134.field3125 = null;
        class85.field1986 = null;
        class68.field1593 = null;
        if (arg0) {
            return;
        }
        class37.field895 = null;
        class111.field2614 = null;
        class106.field2513 = null;
        class103.field2428 = null;
        class143.field3274 = null;
        field2803++;
        field2816 = null;
        class33.field699 = null;
        class31.field590 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIII)V")
    private final void method930(byte arg0, int arg1, int arg2, int arg3) {
        field2807++;
        this.field2813[arg2][arg1] = class41.method326(this.field2813[arg2][arg1], ~arg3);
        if (arg0 < 96) {
            this.field2813 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBI)V")
    private final void method931(int arg0, int arg1, byte arg2, int arg3) {
        field2801++;
        this.field2813[arg3][arg1] = class107.method864(this.field2813[arg3][arg1], arg0);
        if (arg2 != 43) {
            this.field2798 = 77;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2782++;
        if (arg4 == arg6 && arg2 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field2793;
        int var9 = arg3 - this.field2798;
        int var10 = arg2 - this.field2798;
        int var11 = arg4 - this.field2793;
        if (arg5 == 0) {
            if (arg0 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2813[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2813[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2813[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2813[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2813[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2813[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2813[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2813[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg1 != -4573) {
            field2799 = null;
        }
        if (arg5 == 9) {
            if (var8 == var11 && var10 + 1 == var9 && (this.field2813[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var10 - 1 == var9 && (this.field2813[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var10 && (this.field2813[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZ)V")
    public final void method933(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field2798;
        if (!arg2) {
            method920(-71);
        }
        field2796++;
        int var5 = arg0 - this.field2793;
        this.field2813[var5][var4] = class107.method864(this.field2813[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V")
    public class117(int arg0, int arg1) {
        this.field2787 = arg0;
        this.field2800 = arg1;
        this.field2798 = 0;
        this.field2793 = 0;
        this.field2813 = new int[this.field2787][this.field2800];
        this.method925(63);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2781[var1] = var0 - 1;
            var0 += var0;
        }
        field2811 = class73.method594("Lade Benutzeroberfl-=che )2 ", true);
        field2809 = null;
        field2810 = class73.method594("Clientscript error )2 check log for details", true);
        field2812 = class73.method594("skill)2", true);
        field2808 = class73.method594("Lade Wordpack )2 ", true);
        field2815 = field2812;
        field2817 = class73.method594("sl_button", true);
    }
}
