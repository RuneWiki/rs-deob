import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 {

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    private int field2541;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    private int field2544;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[[I")
    public int[][] field2526;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field2524 = 0;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "[Lmf;")
    public static class89[] field2538 = new class89[256];

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lfc;")
    public static class39 field2533 = class90.method774("Benutzen Sie bitte eine andere Welt)3", -104);

    @OriginalMember(owner = "client!od", name = "m", descriptor = "[Lv;")
    public static class142[] field2525 = new class142[2048];

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lfc;")
    private static class39 field2536 = class90.method774("Enter name of friend to delete from list", -118);

    @OriginalMember(owner = "client!od", name = "J", descriptor = "Lfc;")
    public static class39 field2548 = class90.method774("Begeben Sie sich in ein freies Gebiet)1 um", -84);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Lfc;")
    public static class39 field2513 = class90.method774("rot:", -97);

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field2547 = 0;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Lfc;")
    public static class39 field2535 = class90.method774("p12_full", -97);

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "Lfc;")
    public static class39 field2555 = class90.method774("Bitte versuchen Sie)1", -95);

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lfc;")
    public static class39 field2527 = field2536;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "Lfc;")
    private static class39 field2550 = class90.method774("World", -105);

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field2534 = 0;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "Lfc;")
    public static class39 field2545 = field2550;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lfc;")
    public static class39 field2519 = field2550;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lle;")
    public static class81 field2523;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Llf;")
    public static class82 field2530;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lma;")
    public static class84 field2517;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[I")
    public static int[] field2515;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)Z", line = 4)
    public final boolean method857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2543++;
        if (arg1 <= 43) {
            this.method864(15, 57, -117, true);
        }
        if (arg5 == arg6 && arg2 == arg4) {
            return true;
        }
        int var8 = arg4 - this.field2537;
        int var9 = arg6 - this.field2531;
        int var10 = arg5 - this.field2531;
        int var11 = arg2 - this.field2537;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var9 && var8 == var11 && (this.field2526[var9][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2526[var9][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field2526[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2526[var9][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field2526[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2526[var9][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var9 && var8 == var11 && (this.field2526[var9][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2526[var9][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field2526[var9][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field2526[var9][var8] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field2526[var9][var8] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field2526[var9][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 113)
    public static final void method858(byte arg0) {
        if (arg0 < 72) {
            return;
        }
        try {
            Graphics var1 = class140.field3523.getGraphics();
            class12.field316.method129(var1, 17, 357, (byte) -125);
        } catch (Exception var2) {
            class140.field3523.repaint();
        }
        field2539++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V", line = 134)
    private final void method859(int arg0, int arg1, int arg2, int arg3) {
        field2521++;
        this.field2526[arg3][arg1] = class126.method1050(this.field2526[arg3][arg1], arg0);
        if (arg2 >= -97) {
            field2527 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBIIIII)Z", line = 155)
    public final boolean method860(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2522++;
        if (arg0 == arg2 && arg3 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field2537;
        if (arg1 != -35) {
            return true;
        }
        int var9 = arg2 - this.field2531;
        int var10 = arg5 - this.field2537;
        int var11 = arg0 - this.field2531;
        if (arg6 == 0) {
            if (arg4 == 0) {
                if (var11 - 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field2526[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field2526[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var9 == var11 && var8 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 + 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field2526[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field2526[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var9 == var11 && var8 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg4 == 0) {
                if (var11 - 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field2526[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field2526[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field2526[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var11 - 1 == var9 && var8 == var10) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field2526[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var9 == var11 && var8 + 1 == var10 && (this.field2526[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var8 - 1 == var10 && (this.field2526[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var8 == var10 && (this.field2526[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 338)
    public static void method861(byte arg0) {
        field2535 = null;
        field2555 = null;
        field2519 = null;
        field2533 = null;
        field2513 = null;
        field2538 = null;
        if (arg0 <= 36) {
            field2519 = null;
        }
        field2517 = null;
        field2545 = null;
        field2536 = null;
        field2515 = null;
        field2530 = null;
        field2525 = null;
        field2548 = null;
        field2523 = null;
        field2527 = null;
        field2550 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z", line = 372)
    public static final boolean method862(int arg0, int arg1) {
        if (arg1 != 8192) {
            return false;
        }
        field2546++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class109.field2805[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZIII)V", line = 399)
    public final void method863(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field2537;
        field2528++;
        int var8 = arg0 - this.field2531;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method864(var8, var7, 128, true);
                this.method864(var8 - 1, var7, 8, true);
            }
            if (arg5 == 1) {
                this.method864(var8, var7, 2, true);
                this.method864(var8, var7 + 1, 32, true);
            }
            if (arg5 == 2) {
                this.method864(var8, var7, 8, true);
                this.method864(var8 + 1, var7, 128, true);
            }
            if (arg5 == 3) {
                this.method864(var8, var7, 32, true);
                this.method864(var8, var7 - 1, 2, true);
            }
        }
        int var9 = -67 % ((69 - arg3) / 55);
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method864(var8, var7, 1, true);
                this.method864(var8 - 1, var7 + 1, 16, true);
            }
            if (arg5 == 1) {
                this.method864(var8, var7, 4, true);
                this.method864(var8 + 1, var7 + 1, 64, true);
            }
            if (arg5 == 2) {
                this.method864(var8, var7, 16, true);
                this.method864(var8 + 1, var7 - 1, 1, true);
            }
            if (arg5 == 3) {
                this.method864(var8, var7, 64, true);
                this.method864(var8 - 1, var7 - 1, 4, true);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method864(var8, var7, 130, true);
                this.method864(var8 - 1, var7, 8, true);
                this.method864(var8, var7 + 1, 32, true);
            }
            if (arg5 == 1) {
                this.method864(var8, var7, 10, true);
                this.method864(var8, var7 + 1, 32, true);
                this.method864(var8 + 1, var7, 128, true);
            }
            if (arg5 == 2) {
                this.method864(var8, var7, 40, true);
                this.method864(var8 + 1, var7, 128, true);
                this.method864(var8, var7 - 1, 2, true);
            }
            if (arg5 == 3) {
                this.method864(var8, var7, 160, true);
                this.method864(var8, var7 - 1, 2, true);
                this.method864(var8 - 1, var7, 8, true);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method864(var8, var7, 65536, true);
                this.method864(var8 - 1, var7, 4096, true);
            }
            if (arg5 == 1) {
                this.method864(var8, var7, 1024, true);
                this.method864(var8, var7 + 1, 16384, true);
            }
            if (arg5 == 2) {
                this.method864(var8, var7, 4096, true);
                this.method864(var8 + 1, var7, 65536, true);
            }
            if (arg5 == 3) {
                this.method864(var8, var7, 16384, true);
                this.method864(var8, var7 - 1, 1024, true);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method864(var8, var7, 512, true);
                this.method864(var8 - 1, var7 - -1, 8192, true);
            }
            if (arg5 == 1) {
                this.method864(var8, var7, 2048, true);
                this.method864(var8 + 1, var7 + 1, 32768, true);
            }
            if (arg5 == 2) {
                this.method864(var8, var7, 8192, true);
                this.method864(var8 + 1, var7 + -1, 512, true);
            }
            if (arg5 == 3) {
                this.method864(var8, var7, 32768, true);
                this.method864(var8 - 1, var7 + -1, 2048, true);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method864(var8, var7, 66560, true);
            this.method864(var8 - 1, var7, 4096, true);
            this.method864(var8, var7 + 1, 16384, true);
        }
        if (arg5 == 1) {
            this.method864(var8, var7, 5120, true);
            this.method864(var8, var7 + 1, 16384, true);
            this.method864(var8 + 1, var7, 65536, true);
        }
        if (arg5 == 2) {
            this.method864(var8, var7, 20480, true);
            this.method864(var8 + 1, var7, 65536, true);
            this.method864(var8, var7 - 1, 1024, true);
        }
        if (arg5 == 3) {
            this.method864(var8, var7, 81920, true);
            this.method864(var8, var7 - 1, 1024, true);
            this.method864(var8 - 1, var7, 4096, true);
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIZ)V", line = 611)
    private final void method864(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method858((byte) -111);
        }
        this.field2526[arg0][arg1] = class87.method747(this.field2526[arg0][arg1], ~arg2);
        field2542++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLdc;I)Lfc;", line = 636)
    public static final class39 method865(boolean arg0, class25 arg1, int arg2) {
        field2516++;
        try {
            class39 var3 = new class39();
            var3.field1046 = arg1.method324(arg0);
            if (arg2 < var3.field1046) {
                var3.field1046 = arg2;
            }
            var3.field1067 = new byte[var3.field1046];
            arg1.field710 += class153.field3768.method1109(var3.field1046, (byte) -125, var3.field1067, arg1.field710, arg1.field711, 0);
            return var3;
        } catch (Exception var4) {
            return class67.field1606;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V", line = 661)
    public final void method866(int arg0, int arg1, int arg2) {
        if (arg0 < 68) {
            this.method871(80, true, -61, -88, -119, 48, (byte) 81);
        }
        int var4 = arg1 - this.field2537;
        field2556++;
        int var5 = arg2 - this.field2531;
        this.field2526[var5][var4] = class87.method747(this.field2526[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)Z", line = 674)
    public final boolean method867(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2529++;
        int var9 = arg2 + arg0 - 1;
        int var10 = arg4 + arg7 - 1;
        if (arg6 >= arg2 && arg6 <= var9 && arg7 <= arg3 && arg3 <= var10) {
            return true;
        } else if (arg2 - 1 == arg6 && arg3 >= arg7 && arg3 <= var10 && (this.field2526[arg6 - this.field2531][arg3 - this.field2537] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var9 - arg5 == arg6 && arg3 >= arg7 && arg3 <= var10 && (this.field2526[arg6 - this.field2531][arg3 - this.field2537] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg3 && arg2 <= arg6 && arg6 <= var9 && (this.field2526[arg6 - this.field2531][arg3 - this.field2537] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg6 >= arg2 && arg6 <= var9 && (this.field2526[arg6 - this.field2531][arg3 - this.field2537] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V", line = 710)
    public final void method868(int arg0, int arg1, int arg2) {
        if (arg0 <= 21) {
            this.method863(37, -43, true, -8, -71, -45);
        }
        field2514++;
        int var4 = arg2 - this.field2537;
        int var5 = arg1 - this.field2531;
        this.field2526[var5][var4] = class126.method1050(this.field2526[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIBIZI)V", line = 724)
    public final void method869(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field2537;
        int var8 = arg1 - this.field2531;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method859(128, var7, -124, var8);
                this.method859(8, var7, -99, var8 - 1);
            }
            if (arg5 == 1) {
                this.method859(2, var7, -101, var8);
                this.method859(32, var7 + 1, -116, var8);
            }
            if (arg5 == 2) {
                this.method859(8, var7, -118, var8);
                this.method859(128, var7, -124, var8 + 1);
            }
            if (arg5 == 3) {
                this.method859(32, var7, -105, var8);
                this.method859(2, var7 - 1, -118, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method859(1, var7, -123, var8);
                this.method859(16, var7 + 1, -106, var8 + -1);
            }
            if (arg5 == 1) {
                this.method859(4, var7, -101, var8);
                this.method859(64, var7 + 1, -101, var8 + 1);
            }
            if (arg5 == 2) {
                this.method859(16, var7, -115, var8);
                this.method859(1, var7 - 1, -126, var8 + 1);
            }
            if (arg5 == 3) {
                this.method859(64, var7, -106, var8);
                this.method859(4, var7 - 1, -100, var8 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method859(130, var7, -102, var8);
                this.method859(8, var7, -113, var8 - 1);
                this.method859(32, var7 + 1, -114, var8);
            }
            if (arg5 == 1) {
                this.method859(10, var7, -126, var8);
                this.method859(32, var7 + 1, -103, var8);
                this.method859(128, var7, -120, var8 + 1);
            }
            if (arg5 == 2) {
                this.method859(40, var7, -108, var8);
                this.method859(128, var7, -105, var8 + 1);
                this.method859(2, var7 - 1, -116, var8);
            }
            if (arg5 == 3) {
                this.method859(160, var7, -102, var8);
                this.method859(2, var7 - 1, -120, var8);
                this.method859(8, var7, -116, var8 - 1);
            }
        }
        int var9 = -6 % ((arg2 + 32) / 32);
        if (arg4) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method859(65536, var7, -128, var8);
                    this.method859(4096, var7, -115, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method859(1024, var7, -118, var8);
                    this.method859(16384, var7 + 1, -122, var8);
                }
                if (arg5 == 2) {
                    this.method859(4096, var7, -117, var8);
                    this.method859(65536, var7, -100, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method859(16384, var7, -125, var8);
                    this.method859(1024, var7 - 1, -124, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method859(512, var7, -126, var8);
                    this.method859(8192, var7 + 1, -98, var8 + -1);
                }
                if (arg5 == 1) {
                    this.method859(2048, var7, -109, var8);
                    this.method859(32768, var7 + 1, -121, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method859(8192, var7, -98, var8);
                    this.method859(512, var7 - 1, -112, var8 - -1);
                }
                if (arg5 == 3) {
                    this.method859(32768, var7, -109, var8);
                    this.method859(2048, var7 - 1, -120, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method859(66560, var7, -100, var8);
                    this.method859(4096, var7, -101, var8 - 1);
                    this.method859(16384, var7 + 1, -124, var8);
                }
                if (arg5 == 1) {
                    this.method859(5120, var7, -100, var8);
                    this.method859(16384, var7 + 1, -118, var8);
                    this.method859(65536, var7, -105, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method859(20480, var7, -121, var8);
                    this.method859(65536, var7, -112, var8 + 1);
                    this.method859(1024, var7 - 1, -118, var8);
                }
                if (arg5 == 3) {
                    this.method859(81920, var7, -114, var8);
                    this.method859(1024, var7 - 1, -117, var8);
                    this.method859(4096, var7, -113, var8 - 1);
                }
            }
        }
        field2540++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Loc;ILfc;Lfc;)[Lb;", line = 946)
    public static final class8[] method870(class100 arg0, int arg1, class39 arg2, class39 arg3) {
        field2518++;
        if (arg1 != -1) {
            field2538 = null;
        }
        int var4 = arg0.method848(arg3, (byte) -48);
        int var5 = arg0.method834(arg2, false, var4);
        return class121.method1033(var4, arg1 - 21695, arg0, var5);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZIIIIB)V", line = 982)
    public final void method871(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = arg4 - this.field2531;
        int var9 = 256;
        field2549++;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg0;
            arg0 = arg2;
            arg2 = var10;
        }
        if (arg1) {
            var9 += 131072;
        }
        int var11 = arg3 - this.field2537;
        if (arg6 > -121) {
            method858((byte) -57);
        }
        for (int var12 = var8; var12 < arg0 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field2544) {
                for (int var13 = var11; var13 < arg2 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field2541) {
                        this.method864(var12, var13, var9, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZIIIII)V", line = 1033)
    public final void method872(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field2531;
        int var9 = arg2 - this.field2537;
        field2532++;
        if (arg0 >= -12) {
            return;
        }
        int var10 = 256;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg3;
            arg3 = arg5;
            arg5 = var11;
        }
        if (arg1) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < var8 + arg3; var12++) {
            if (var12 >= 0 && this.field2544 > var12) {
                for (int var13 = var9; var13 < arg5 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field2541) {
                        this.method859(var10, var13, -109, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(III)V", line = 1088)
    public final void method873(int arg0, int arg1, int arg2) {
        if (arg1 != 65536) {
            field2538 = null;
        }
        int var4 = arg0 - this.field2537;
        int var5 = arg2 - this.field2531;
        field2554++;
        this.field2526[var5][var4] = class126.method1050(this.field2526[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZI)Lfc;", line = 1101)
    public static final class39 method874(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 1;
        field2552++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = arg3; var8 < var4; var8++) {
            int var10 = arg0 % arg1;
            arg0 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class39 var9 = new class39();
        var9.field1046 = var6;
        var9.field1067 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V", line = 1165)
    public class101(int arg0, int arg1) {
        this.field2541 = arg1;
        this.field2531 = 0;
        this.field2544 = arg0;
        this.field2526 = new int[this.field2544][this.field2541];
        this.field2537 = 0;
        this.method875(16777215);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 1193)
    public final void method875(int arg0) {
        for (int var2 = 0; var2 < this.field2544; var2++) {
            for (int var3 = 0; var3 < this.field2541; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2544 - 1 == var2 || this.field2541 - 1 == var3) {
                    this.field2526[var2][var3] = 16777215;
                } else {
                    this.field2526[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 != 16777215) {
            this.method866(-122, 40, 85);
        }
        field2520++;
    }
}
