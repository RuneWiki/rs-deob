import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class131 {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    private int field2723 = 0;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    private int field2718;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[[I")
    public int[][] field2736;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lig;")
    public static class84 field2732 = null;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Lrf;")
    private static class163 field2731 = class53.method392(87, "glow2:");

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lrf;")
    public static class163 field2720 = field2731;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lrf;")
    public static class163 field2741 = field2731;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lpb;")
    public static class141 field2735 = new class141();

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Lge;")
    public static class65 field2742 = new class65(4096);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Lrf;")
    private static class163 field2746 = class53.method392(-57, "cyan:");

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Lrf;")
    public static class163 field2744 = field2746;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Lrf;")
    public static class163 field2743 = field2746;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    public static int[] field2745;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIIIII)V")
    public final void method863(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2719++;
        int var8 = arg6 - this.field2737;
        if (arg3 != -12583) {
            field2742 = null;
        }
        int var9 = 256;
        if (arg1) {
            var9 += 131072;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg2;
            arg2 = arg0;
            arg0 = var10;
        }
        int var11 = arg4 - this.field2723;
        for (int var12 = var8; var12 < arg2 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field2715) {
                for (int var13 = var11; var13 < arg0 + var11; var13++) {
                    if (var13 >= 0 && this.field2718 > var13) {
                        this.method877(var9, var13, (byte) -51, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZIII)V")
    public final void method864(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2726++;
        int var7 = arg5 - this.field2737;
        if (arg4 != -4) {
            return;
        }
        int var8 = arg0 - this.field2723;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method877(128, var8, (byte) -117, var7);
                this.method877(8, var8, (byte) -42, var7 - 1);
            }
            if (arg1 == 1) {
                this.method877(2, var8, (byte) -67, var7);
                this.method877(32, var8 + 1, (byte) -93, var7);
            }
            if (arg1 == 2) {
                this.method877(8, var8, (byte) -107, var7);
                this.method877(128, var8, (byte) -80, var7 + 1);
            }
            if (arg1 == 3) {
                this.method877(32, var8, (byte) -100, var7);
                this.method877(2, var8 - 1, (byte) -34, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method877(1, var8, (byte) -101, var7);
                this.method877(16, var8 + 1, (byte) -115, var7 - 1);
            }
            if (arg1 == 1) {
                this.method877(4, var8, (byte) -71, var7);
                this.method877(64, var8 + 1, (byte) -77, var7 + 1);
            }
            if (arg1 == 2) {
                this.method877(16, var8, (byte) -35, var7);
                this.method877(1, var8 - 1, (byte) -46, var7 + 1);
            }
            if (arg1 == 3) {
                this.method877(64, var8, (byte) -67, var7);
                this.method877(4, var8 - 1, (byte) -126, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method877(130, var8, (byte) -43, var7);
                this.method877(8, var8, (byte) -102, var7 - 1);
                this.method877(32, var8 + 1, (byte) -85, var7);
            }
            if (arg1 == 1) {
                this.method877(10, var8, (byte) -29, var7);
                this.method877(32, var8 + 1, (byte) -110, var7);
                this.method877(128, var8, (byte) -113, var7 + 1);
            }
            if (arg1 == 2) {
                this.method877(40, var8, (byte) -103, var7);
                this.method877(128, var8, (byte) -93, var7 + 1);
                this.method877(2, var8 - 1, (byte) -11, var7);
            }
            if (arg1 == 3) {
                this.method877(160, var8, (byte) -122, var7);
                this.method877(2, var8 - 1, (byte) -108, var7);
                this.method877(8, var8, (byte) -113, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method877(65536, var8, (byte) -28, var7);
                this.method877(4096, var8, (byte) -110, var7 - 1);
            }
            if (arg1 == 1) {
                this.method877(1024, var8, (byte) -17, var7);
                this.method877(16384, var8 + 1, (byte) -77, var7);
            }
            if (arg1 == 2) {
                this.method877(4096, var8, (byte) -114, var7);
                this.method877(65536, var8, (byte) -108, var7 + 1);
            }
            if (arg1 == 3) {
                this.method877(16384, var8, (byte) -93, var7);
                this.method877(1024, var8 - 1, (byte) -106, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method877(512, var8, (byte) -72, var7);
                this.method877(8192, var8 + 1, (byte) -25, var7 - 1);
            }
            if (arg1 == 1) {
                this.method877(2048, var8, (byte) -119, var7);
                this.method877(32768, var8 + 1, (byte) -39, var7 + 1);
            }
            if (arg1 == 2) {
                this.method877(8192, var8, (byte) -87, var7);
                this.method877(512, var8 - 1, (byte) -65, var7 + 1);
            }
            if (arg1 == 3) {
                this.method877(32768, var8, (byte) -7, var7);
                this.method877(2048, var8 - 1, (byte) -91, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method877(66560, var8, (byte) -84, var7);
            this.method877(4096, var8, (byte) -61, var7 - 1);
            this.method877(16384, var8 + 1, (byte) -124, var7);
        }
        if (arg1 == 1) {
            this.method877(5120, var8, (byte) -23, var7);
            this.method877(16384, var8 + 1, (byte) -102, var7);
            this.method877(65536, var8, (byte) -15, var7 + 1);
        }
        if (arg1 == 2) {
            this.method877(20480, var8, (byte) -76, var7);
            this.method877(65536, var8, (byte) -103, var7 + 1);
            this.method877(1024, var8 - 1, (byte) -52, var7);
        }
        if (arg1 == 3) {
            this.method877(81920, var8, (byte) -68, var7);
            this.method877(1024, var8 - 1, (byte) -80, var7);
            this.method877(4096, var8, (byte) -37, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
    public final void method865(int arg0, int arg1, int arg2) {
        field2722++;
        int var4 = arg2 - this.field2723;
        int var5 = arg1 - this.field2737;
        this.field2736[var5][var4] = class133.method887(this.field2736[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILfa;)V")
    public static final void method866(int arg0, class52 arg1) {
        if (class26.field484 != null) {
            try {
                class26.field484.method964(0L, 255);
                class26.field484.method956(arg1.field1054, arg1.field1033, (byte) -86, 24);
            } catch (Exception var2) {
            }
        }
        field2717++;
        arg1.field1033 += arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    private final void method867(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -1) {
            this.field2736[arg0][arg1] = class150.method971(this.field2736[arg0][arg1], arg3);
            field2739++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
    public final void method868(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2723;
        int var5 = arg0 - this.field2737;
        this.field2736[var5][var4] = class150.method971(this.field2736[var5][var4], arg1);
        field2727++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIBIII)V")
    public final void method869(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field2737;
        field2730++;
        int var8 = arg3 - this.field2723;
        int var9 = 256;
        if (arg0) {
            var9 += 131072;
        }
        if (arg2 != 52) {
            return;
        }
        for (int var10 = var7; var10 < arg4 + var7; var10++) {
            if (var10 >= 0 && var10 < this.field2715) {
                for (int var11 = var8; var11 < var8 + arg5; var11++) {
                    if (var11 >= 0 && var11 < this.field2718) {
                        this.method867(var10, var11, arg2 - 53, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg4 + arg0 - 1;
        field2728++;
        int var10 = arg3 + arg5 - 1;
        if (arg3 <= arg7 && var10 >= arg7 && arg2 >= arg0 && arg2 <= var9) {
            return true;
        } else if (arg3 - 1 == arg7 && arg0 <= arg2 && var9 >= arg2 && (this.field2736[arg7 - this.field2737][arg2 - this.field2723] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else {
            if (arg1 != 2) {
                this.field2736 = null;
            }
            if (var10 + 1 == arg7 && arg0 <= arg2 && var9 >= arg2 && (this.field2736[arg7 - this.field2737][arg2 - this.field2723] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if (arg0 - 1 == arg2 && arg3 <= arg7 && arg7 <= var10 && (this.field2736[arg7 - this.field2737][arg2 - this.field2723] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return var9 + 1 == arg2 && arg3 <= arg7 && var10 >= arg7 && (this.field2736[arg7 - this.field2737][arg2 - this.field2723] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public final void method871(byte arg0) {
        field2733++;
        int var2 = 0;
        if (arg0 != 88) {
            this.method879(-39, 87, 92, -29, true, 41);
        }
        while (this.field2715 > var2) {
            for (int var3 = 0; var3 < this.field2718; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field2715 - 5 || this.field2718 - 5 <= var3) {
                    this.field2736[var2][var3] = 16777215;
                } else {
                    this.field2736[var2][var3] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method872(int arg0) {
        field2732 = null;
        field2741 = null;
        field2745 = null;
        field2742 = null;
        field2744 = null;
        field2720 = null;
        field2743 = null;
        field2731 = null;
        if (arg0 != -1) {
            method872(77);
        }
        field2746 = null;
        field2735 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lke;")
    public static final class100 method873(int arg0, int arg1) {
        field2724++;
        class100 var2 = (class100) class186.field3706.method401((long) arg0, (byte) -73);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class49.field955.method1235(arg0, (byte) -64, 14);
        if (arg1 != 6031) {
            return null;
        }
        class100 var4 = new class100();
        if (var3 != null) {
            var4.method686(95, new class52(var3));
        }
        class186.field3706.method398(var4, (long) arg0, (byte) 99);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2725++;
        if (arg3 == arg5 && arg2 == arg4) {
            return true;
        }
        int var8 = arg2 - this.field2723;
        int var9 = arg3 - this.field2737;
        int var10 = arg5 - this.field2737;
        int var11 = arg4 - this.field2723;
        if (arg1 == 0) {
            if (arg0 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2736[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2736[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2736[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2736[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2736[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2736[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2736[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2736[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg6 != 1) {
            return false;
        }
        if (arg1 == 9) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field2736[var9][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field2736[var9][var8] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field2736[var9][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)V")
    public final void method875(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field2737;
        field2716++;
        if (!arg2) {
            field2743 = null;
        }
        int var5 = arg0 - this.field2723;
        this.field2736[var4][var5] = class150.method971(this.field2736[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)I")
    public static final int method876(int arg0, boolean arg1) {
        field2721++;
        if (arg1) {
            field2745 = null;
        }
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBI)V")
    private final void method877(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > -6) {
            this.field2715 = -115;
        }
        field2734++;
        this.field2736[arg3][arg1] = class133.method887(this.field2736[arg3][arg1], ~arg0);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2738++;
        if (arg1 == arg3 && arg4 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field2737;
        int var9 = arg4 - this.field2723;
        int var10 = arg3 - this.field2737;
        int var11 = arg5 - this.field2723;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field2736[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field2736[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field2736[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field2736[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field2736[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field2736[var8][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field2736[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field2736[var8][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 > -58) {
            this.field2723 = -106;
        }
        if (arg6 == 8) {
            if (var8 == var10 && var9 + 1 == var11 && (this.field2736[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var9 - 1 == var11 && (this.field2736[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field2736[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field2736[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZI)V")
    public final void method879(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 != 14928) {
            field2741 = null;
        }
        int var7 = arg5 - this.field2737;
        field2729++;
        int var8 = arg3 - this.field2723;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method867(var7, var8, -1, 128);
                this.method867(var7 - 1, var8, -1, 8);
            }
            if (arg2 == 1) {
                this.method867(var7, var8, -1, 2);
                this.method867(var7, var8 + 1, -1, 32);
            }
            if (arg2 == 2) {
                this.method867(var7, var8, -1, 8);
                this.method867(var7 + 1, var8, -1, 128);
            }
            if (arg2 == 3) {
                this.method867(var7, var8, -1, 32);
                this.method867(var7, var8 - 1, arg0 + -14929, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method867(var7, var8, -1, 1);
                this.method867(var7 - 1, var8 - -1, arg0 ^ 0xFFFFC5AF, 16);
            }
            if (arg2 == 1) {
                this.method867(var7, var8, -1, 4);
                this.method867(var7 + 1, var8 + 1, -1, 64);
            }
            if (arg2 == 2) {
                this.method867(var7, var8, arg0 - 14929, 16);
                this.method867(var7 + 1, var8 - 1, -1, 1);
            }
            if (arg2 == 3) {
                this.method867(var7, var8, -1, 64);
                this.method867(var7 - 1, var8 - 1, -1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method867(var7, var8, -1, 130);
                this.method867(var7 - 1, var8, -1, 8);
                this.method867(var7, var8 + 1, arg0 + -14929, 32);
            }
            if (arg2 == 1) {
                this.method867(var7, var8, -1, 10);
                this.method867(var7, var8 + 1, -1, 32);
                this.method867(var7 + 1, var8, -1, 128);
            }
            if (arg2 == 2) {
                this.method867(var7, var8, -1, 40);
                this.method867(var7 + 1, var8, -1, 128);
                this.method867(var7, var8 - 1, -1, 2);
            }
            if (arg2 == 3) {
                this.method867(var7, var8, arg0 - 14929, 160);
                this.method867(var7, var8 - 1, arg0 ^ 0xFFFFC5AF, 2);
                this.method867(var7 - 1, var8, -1, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method867(var7, var8, -1, 65536);
                this.method867(var7 - 1, var8, -1, 4096);
            }
            if (arg2 == 1) {
                this.method867(var7, var8, -1, 1024);
                this.method867(var7, var8 + 1, -1, 16384);
            }
            if (arg2 == 2) {
                this.method867(var7, var8, -1, 4096);
                this.method867(var7 + 1, var8, -1, 65536);
            }
            if (arg2 == 3) {
                this.method867(var7, var8, arg0 - 14929, 16384);
                this.method867(var7, var8 - 1, -1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method867(var7, var8, arg0 - 14929, 512);
                this.method867(var7 - 1, var8 + 1, -1, 8192);
            }
            if (arg2 == 1) {
                this.method867(var7, var8, arg0 ^ 0xFFFFC5AF, 2048);
                this.method867(var7 + 1, var8 + 1, arg0 - 14929, 32768);
            }
            if (arg2 == 2) {
                this.method867(var7, var8, -1, 8192);
                this.method867(var7 + 1, var8 + -1, -1, 512);
            }
            if (arg2 == 3) {
                this.method867(var7, var8, -1, 32768);
                this.method867(var7 - 1, var8 + -1, arg0 - 14929, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method867(var7, var8, arg0 - 14929, 66560);
            this.method867(var7 - 1, var8, -1, 4096);
            this.method867(var7, var8 + 1, -1, 16384);
        }
        if (arg2 == 1) {
            this.method867(var7, var8, -1, 5120);
            this.method867(var7, var8 + 1, arg0 ^ 0xFFFFC5AF, 16384);
            this.method867(var7 + 1, var8, -1, 65536);
        }
        if (arg2 == 2) {
            this.method867(var7, var8, -1, 20480);
            this.method867(var7 + 1, var8, -1, 65536);
            this.method867(var7, var8 - 1, -1, 1024);
        }
        if (arg2 == 3) {
            this.method867(var7, var8, -1, 81920);
            this.method867(var7, var8 - 1, -1, 1024);
            this.method867(var7 - 1, var8, -1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(II)V")
    public class131(int arg0, int arg1) {
        this.field2718 = arg1;
        this.field2737 = 0;
        this.field2715 = arg0;
        this.field2736 = new int[this.field2715][this.field2718];
        this.method871((byte) 88);
    }
}
