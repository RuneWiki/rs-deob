import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class223 {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    private int field3558 = 0;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    private int field3582;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    private int field3569;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    private int field3554;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[[I")
    public int[][] field3570;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "[I")
    public static int[] field3580 = new int[2];

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "[Lel;")
    public static class83[] field3566;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[[B")
    public static byte[][] field3562;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[[S")
    public static short[][] field3563;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIII)V", line = 5)
    private final void method1593(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field3569 = -18;
        }
        this.field3570[arg2][arg1] = class255.method1813(this.field3570[arg2][arg1], arg3);
        field3574++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V", line = 19)
    public final void method1594(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field3569;
        field3567++;
        int var5 = arg1 - this.field3558;
        this.field3570[var5][var4] = class217.method1563(this.field3570[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V", line = 31)
    public final void method1595(int arg0, int arg1, int arg2) {
        field3555++;
        if (arg1 == 19550) {
            int var4 = arg2 - this.field3558;
            int var5 = arg0 - this.field3569;
            this.field3570[var4][var5] = class255.method1813(this.field3570[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIZ)V", line = 46)
    public final void method1596(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = -128 / ((18 - arg2) / 45);
        int var8 = arg0 - this.field3558;
        field3556++;
        int var9 = arg4 - this.field3569;
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method1593(true, var9, var8, 128);
                this.method1593(true, var9, var8 - 1, 8);
            }
            if (arg3 == 1) {
                this.method1593(true, var9, var8, 2);
                this.method1593(true, var9 + 1, var8, 32);
            }
            if (arg3 == 2) {
                this.method1593(true, var9, var8, 8);
                this.method1593(true, var9, var8 + 1, 128);
            }
            if (arg3 == 3) {
                this.method1593(true, var9, var8, 32);
                this.method1593(true, var9 - 1, var8, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method1593(true, var9, var8, 1);
                this.method1593(true, var9 + 1, var8 - 1, 16);
            }
            if (arg3 == 1) {
                this.method1593(true, var9, var8, 4);
                this.method1593(true, var9 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method1593(true, var9, var8, 16);
                this.method1593(true, var9 - 1, var8 + 1, 1);
            }
            if (arg3 == 3) {
                this.method1593(true, var9, var8, 64);
                this.method1593(true, var9 - 1, var8 + -1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                this.method1593(true, var9, var8, 130);
                this.method1593(true, var9, var8 - 1, 8);
                this.method1593(true, var9 + 1, var8, 32);
            }
            if (arg3 == 1) {
                this.method1593(true, var9, var8, 10);
                this.method1593(true, var9 + 1, var8, 32);
                this.method1593(true, var9, var8 + 1, 128);
            }
            if (arg3 == 2) {
                this.method1593(true, var9, var8, 40);
                this.method1593(true, var9, var8 + 1, 128);
                this.method1593(true, var9 - 1, var8, 2);
            }
            if (arg3 == 3) {
                this.method1593(true, var9, var8, 160);
                this.method1593(true, var9 - 1, var8, 2);
                this.method1593(true, var9, var8 - 1, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method1593(true, var9, var8, 65536);
                this.method1593(true, var9, var8 - 1, 4096);
            }
            if (arg3 == 1) {
                this.method1593(true, var9, var8, 1024);
                this.method1593(true, var9 + 1, var8, 16384);
            }
            if (arg3 == 2) {
                this.method1593(true, var9, var8, 4096);
                this.method1593(true, var9, var8 + 1, 65536);
            }
            if (arg3 == 3) {
                this.method1593(true, var9, var8, 16384);
                this.method1593(true, var9 - 1, var8, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method1593(true, var9, var8, 512);
                this.method1593(true, var9 + 1, var8 + -1, 8192);
            }
            if (arg3 == 1) {
                this.method1593(true, var9, var8, 2048);
                this.method1593(true, var9 + 1, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method1593(true, var9, var8, 8192);
                this.method1593(true, var9 - 1, var8 + 1, 512);
            }
            if (arg3 == 3) {
                this.method1593(true, var9, var8, 32768);
                this.method1593(true, var9 - 1, var8 + -1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1593(true, var9, var8, 66560);
            this.method1593(true, var9, var8 - 1, 4096);
            this.method1593(true, var9 + 1, var8, 16384);
        }
        if (arg3 == 1) {
            this.method1593(true, var9, var8, 5120);
            this.method1593(true, var9 + 1, var8, 16384);
            this.method1593(true, var9, var8 + 1, 65536);
        }
        if (arg3 == 2) {
            this.method1593(true, var9, var8, 20480);
            this.method1593(true, var9, var8 + 1, 65536);
            this.method1593(true, var9 - 1, var8, 1024);
        }
        if (arg3 == 3) {
            this.method1593(true, var9, var8, 81920);
            this.method1593(true, var9 - 1, var8, 1024);
            this.method1593(true, var9, var8 - 1, 4096);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I", line = 256)
    public static final int method1597(int arg0, int arg1) {
        if (arg0 != 1) {
            method1597(46, 89);
        }
        field3568++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBIILd;)V", line = 275)
    public static final void method1598(int arg0, int arg1, byte arg2, int arg3, int arg4, class149 arg5) {
        field3581++;
        if (arg5.field2327 == -1 && arg5.field2315 == null) {
            return;
        }
        int var6 = 0;
        if (arg0 > arg5.field2307) {
            var6 += arg0 - arg5.field2307;
        } else if (arg5.field2328 > arg0) {
            var6 += arg5.field2328 - arg0;
        }
        if (arg5.field2318 < arg1) {
            var6 += arg1 - arg5.field2318;
        } else if (arg5.field2312 > arg1) {
            var6 += arg5.field2312 - arg1;
        }
        if (arg5.field2306 == 0 || arg5.field2306 < (var6 - 64) || class225.field3606 == 0 || arg5.field2308 != arg3) {
            if (arg5.field2305 != null) {
                class225.field3596.method1421(arg5.field2305);
                arg5.field2305 = null;
            }
            if (arg5.field2314 != null) {
                class225.field3596.method1421(arg5.field2314);
                arg5.field2314 = null;
            }
            return;
        }
        if (arg2 != -52) {
            method1604(-53, -44, 72, 11, -46);
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field2306 - var6) * class225.field3606 / arg5.field2306;
        if (arg5.field2305 != null) {
            arg5.field2305.method1534(var7);
        } else if (arg5.field2327 >= 0) {
            class49 var8 = class49.method347(class44.field693, arg5.field2327, 0);
            if (var8 != null) {
                class291 var9 = var8.method349().method2020(class13.field163);
                class215 var10 = class215.method1528(var9, 100, var7);
                var10.method1538(-1);
                class225.field3596.method1422(var10);
                arg5.field2305 = var10;
            }
        }
        if (arg5.field2314 != null) {
            arg5.field2314.method1534(var7);
            if (!arg5.field2314.method414(2)) {
                arg5.field2314 = null;
            }
        } else if (arg5.field2315 != null && (arg5.field2323 -= arg4) <= 0) {
            int var11 = (int) ((double) arg5.field2315.length * Math.random());
            class49 var12 = class49.method347(class44.field693, arg5.field2315[var11], 0);
            if (var12 != null) {
                class291 var13 = var12.method349().method2020(class13.field163);
                class215 var14 = class215.method1528(var13, 100, var7);
                var14.method1538(0);
                class225.field3596.method1422(var14);
                arg5.field2323 = (int) (Math.random() * (double) (arg5.field2322 - arg5.field2324)) + arg5.field2324;
                arg5.field2314 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIBIII)V", line = 402)
    public final void method1599(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3573++;
        int var7 = arg1 - this.field3569;
        int var8 = arg3 - this.field3558;
        int var9 = 256;
        if (arg0) {
            var9 += 131072;
        }
        if (arg2 < 70) {
            this.field3569 = -107;
        }
        for (int var10 = var8; var10 < (arg4 + var8); var10++) {
            if (var10 >= 0 && var10 < this.field3554) {
                for (int var11 = var7; var11 < (arg5 + var7); var11++) {
                    if (var11 >= 0 && var11 < this.field3582) {
                        this.method1593(true, var11, var10, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 445)
    public static void method1600(boolean arg0) {
        field3580 = null;
        field3566 = null;
        if (arg0) {
            field3563 = (short[][]) null;
            field3562 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)Z", line = 459)
    public final boolean method1601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3559++;
        if (arg0 == 1) {
            if (arg2 == arg4 && arg3 == arg5) {
                return true;
            }
        } else if (arg4 <= arg2 && arg2 <= (arg4 + arg0 - 1) && arg3 <= arg3 && (arg0 + arg3 - 1) >= arg3) {
            return true;
        }
        int var9 = arg3 - this.field3569;
        int var10 = arg4 - this.field3558;
        if (arg1 != 19661058) {
            this.field3582 = 85;
        }
        int var11 = arg5 - this.field3569;
        int var12 = arg2 - this.field3558;
        if (arg0 == 1) {
            if (arg7 == 0) {
                if (arg6 == 0) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field3570[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3570[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3570[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3570[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                    if (var12 - 1 == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg6 == 0) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field3570[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3570[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3570[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3570[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field3570[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field3570[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field3570[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg0 - 1;
            int var14 = arg0 + var10 - 1;
            if (arg7 == 0) {
                if (arg6 == 0) {
                    if ((var12 - arg0) == var10 && var11 <= var9 && var13 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var14 >= var12 && (var9 + 1) == var11 && (this.field3570[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var14 && (var9 - arg0) == var11 && (this.field3570[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 >= var10 && var12 <= var14 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 - arg0) == var10 && var9 >= var11 && var13 >= var9 && (this.field3570[var14][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 >= var11 && var9 <= var13 && (this.field3570[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 + 1) == var10 && var11 <= var9 && var13 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var14 && var9 + 1 == var11 && (this.field3570[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var14 && (var9 - arg0) == var11 && (this.field3570[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 >= var10 && var12 <= var14 && var9 - arg0 == var11) {
                        return true;
                    }
                    if ((var12 - arg0) == var10 && var9 >= var11 && var9 <= var13 && (this.field3570[var14][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var13 >= var9 && (this.field3570[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg6 == 0) {
                    if (var12 - arg0 == var10 && var11 <= var9 && var9 <= var13) {
                        return true;
                    }
                    if (var12 >= var10 && var14 >= var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var13 && (this.field3570[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var14 >= var12 && var9 - arg0 == var11 && (this.field3570[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - arg0 == var10 && var9 >= var11 && var9 <= var13 && (this.field3570[var14][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var14 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 >= var11 && var9 <= var13) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var14 && (var9 - arg0) == var11 && (this.field3570[var12][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - arg0) == var10 && var9 >= var11 && var9 <= var13 && (this.field3570[var14][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var14 && (var9 + 1) == var11 && (this.field3570[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var9 <= var13) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var14 && var9 - arg0 == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 - arg0) == var10 && var11 <= var9 && var9 <= var13) {
                        return true;
                    }
                    if (var10 <= var12 && var14 >= var12 && var9 + 1 == var11 && (this.field3570[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var13 >= var9 && (this.field3570[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var14 >= var12 && (var9 - arg0) == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var12 >= var10 && var12 <= var14 && (var9 + 1) == var11 && (this.field3570[var12][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 >= var10 && var14 >= var12 && (var9 - arg0) == var11 && (this.field3570[var12][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if (var12 - arg0 == var10 && var11 <= var9 && var9 <= var13 && (this.field3570[var14][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var9 >= var11 && var13 >= var9 && (this.field3570[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBIIIII)Z", line = 828)
    public final boolean method1602(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3565++;
        if (arg0 == 1) {
            if (arg3 == arg4 && arg5 == arg7) {
                return true;
            }
        } else if (arg3 >= arg4 && arg3 <= (arg0 + arg4 - 1) && arg5 >= arg5 && arg5 <= arg0 + arg5 - 1) {
            return true;
        }
        int var9 = arg7 - this.field3569;
        int var10 = arg3 - this.field3558;
        int var11 = arg4 - this.field3558;
        int var12 = arg5 - this.field3569;
        if (arg2 != 42) {
            method1600(false);
        }
        if (arg0 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field3570[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field3570[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field3570[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field3570[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field3570[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field3570[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field3570[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field3570[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field3570[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field3570[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field3570[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field3570[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = var9 + arg0 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field3570[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 - arg0 == var9 && (this.field3570[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var10 - arg0) == var11 && var12 >= var9 && var12 <= var14 && (this.field3570[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 - arg0 == var9 && (this.field3570[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 - arg0) == var11 && var12 >= var9 && var14 >= var12 && (this.field3570[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field3570[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field3570[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field3570[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9 && (this.field3570[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && (var12 - arg0) == var9 && (this.field3570[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg0 == var11 && var9 <= var12 && var14 >= var12 && (this.field3570[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12 && (this.field3570[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIZ)Z", line = 1022)
    public final boolean method1603(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3577++;
        if (arg1 == arg2 && arg0 == arg3) {
            return true;
        }
        if (arg4) {
            this.method1601(69, -30, 83, -101, -68, 12, -6, -14);
        }
        int var6 = arg0 - this.field3569;
        int var7 = arg2 - this.field3558;
        if (var7 < 0 || var7 >= this.field3554 || var6 < 0 || var6 >= this.field3582) {
            return false;
        }
        int var8 = arg3 - this.field3569;
        int var9 = arg1 - this.field3558;
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
        if (var11 > var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var7 > var9) {
                    if ((this.field3570[var9][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var7) {
                    if ((this.field3570[var9][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 > var8) {
                        if ((this.field3570[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var6) {
                        if ((this.field3570[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = 32768;
            int var15 = var11 * 65536 / var10;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field3570[var9][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field3570[var9][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var9 < var7) {
                        if ((this.field3570[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field3570[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field3570[var7][var6] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V", line = 1177)
    public static final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -2238) {
            return;
        }
        field3560++;
        if (arg1 < arg3) {
            class269.method1908(19, class239.field3829[arg2], arg4, arg3, arg1);
        } else {
            class269.method1908(19, class239.field3829[arg2], arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZI)V", line = 1205)
    private final void method1605(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field3580 = (int[]) null;
        }
        this.field3570[arg1][arg3] = class217.method1563(this.field3570[arg1][arg3], ~arg0);
        field3561++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIILth;Lth;IIIIJ)V", line = 1220)
    public static final void method1606(int arg0, int arg1, int arg2, int arg3, class126 arg4, class126 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class198 var12 = new class198();
        var12.field3184 = arg10;
        var12.field3174 = arg1 * 128 + 64;
        var12.field3186 = arg2 * 128 + 64;
        var12.field3182 = arg3;
        var12.field3177 = arg4;
        var12.field3176 = arg5;
        var12.field3185 = arg6;
        var12.field3173 = arg7;
        var12.field3175 = arg8;
        var12.field3181 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class205.field3312[var13][arg1][arg2] == null) {
                class205.field3312[var13][arg1][arg2] = new class308(var13, arg1, arg2);
            }
        }
        class205.field3312[arg0][arg1][arg2].field5208 = var12;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIIIIZ)V", line = 1251)
    public final void method1607(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3571++;
        int var7 = arg1 - this.field3558;
        int var8 = arg3 - this.field3569;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1605(128, var7, false, var8);
                this.method1605(8, var7 - 1, false, var8);
            }
            if (arg0 == 1) {
                this.method1605(2, var7, false, var8);
                this.method1605(32, var7, false, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1605(8, var7, false, var8);
                this.method1605(128, var7 + 1, false, var8);
            }
            if (arg0 == 3) {
                this.method1605(32, var7, false, var8);
                this.method1605(2, var7, false, var8 - 1);
            }
        }
        if (arg4 != -1) {
            this.field3570 = (int[][]) ((int[][]) null);
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1605(1, var7, false, var8);
                this.method1605(16, var7 - 1, false, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1605(4, var7, false, var8);
                this.method1605(64, var7 + 1, false, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1605(16, var7, false, var8);
                this.method1605(1, var7 + 1, false, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1605(64, var7, false, var8);
                this.method1605(4, var7 - 1, false, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method1605(130, var7, false, var8);
                this.method1605(8, var7 - 1, false, var8);
                this.method1605(32, var7, false, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1605(10, var7, false, var8);
                this.method1605(32, var7, false, var8 + 1);
                this.method1605(128, var7 + 1, false, var8);
            }
            if (arg0 == 2) {
                this.method1605(40, var7, false, var8);
                this.method1605(128, var7 + 1, false, var8);
                this.method1605(2, var7, false, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1605(160, var7, false, var8);
                this.method1605(2, var7, false, var8 - 1);
                this.method1605(8, var7 - 1, false, var8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1605(65536, var7, false, var8);
                this.method1605(4096, var7 - 1, false, var8);
            }
            if (arg0 == 1) {
                this.method1605(1024, var7, false, var8);
                this.method1605(16384, var7, false, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1605(4096, var7, false, var8);
                this.method1605(65536, var7 + 1, false, var8);
            }
            if (arg0 == 3) {
                this.method1605(16384, var7, false, var8);
                this.method1605(1024, var7, false, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1605(512, var7, false, var8);
                this.method1605(8192, var7 - 1, false, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1605(2048, var7, false, var8);
                this.method1605(32768, var7 + 1, false, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1605(8192, var7, false, var8);
                this.method1605(512, var7 + 1, false, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1605(32768, var7, false, var8);
                this.method1605(2048, var7 - 1, false, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1605(66560, var7, false, var8);
            this.method1605(4096, var7 - 1, false, var8);
            this.method1605(16384, var7, false, var8 + 1);
        }
        if (arg0 == 1) {
            this.method1605(5120, var7, false, var8);
            this.method1605(16384, var7, false, var8 + 1);
            this.method1605(65536, var7 + 1, false, var8);
        }
        if (arg0 == 2) {
            this.method1605(20480, var7, false, var8);
            this.method1605(65536, var7 + 1, false, var8);
            this.method1605(1024, var7, false, var8 - 1);
        }
        if (arg0 == 3) {
            this.method1605(81920, var7, false, var8);
            this.method1605(1024, var7, false, var8 - 1);
            this.method1605(4096, var7 - 1, false, var8);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIII)Z", line = 1466)
    public final boolean method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 32) {
            method1604(-22, 59, 112, 56, -78);
        }
        field3557++;
        if (arg5 <= 1) {
            int var10 = arg2 + arg3 - 1;
            int var11 = arg7 + arg8 - 1;
            if (arg2 <= arg0 && var10 >= arg0 && arg8 <= arg4 && arg4 <= var11) {
                return true;
            } else if (arg2 - 1 == arg0 && arg8 <= arg4 && var11 >= arg4 && (this.field3570[arg0 - this.field3558][arg4 - this.field3569] & 0x8) == 0 && (arg6 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg0 && arg8 <= arg4 && arg4 <= var11 && (this.field3570[arg0 - this.field3558][arg4 - this.field3569] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if (arg8 - 1 == arg4 && arg0 >= arg2 && arg0 <= var10 && (this.field3570[arg0 - this.field3558][arg4 - this.field3569] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg4 && arg2 <= arg0 && arg0 <= var10 && (this.field3570[arg0 - this.field3558][arg4 - this.field3569] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        } else if (this.method1610(arg5, arg7, arg4, arg2, -1, arg8, arg5, arg0, arg3)) {
            return true;
        } else {
            return this.method1611(arg3, arg1 ^ 0x1CE4, arg8, arg7, arg2, arg0, arg5, arg4, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 1510)
    public final void method1609(int arg0) {
        field3576++;
        if (arg0 != 16777215) {
            this.method1608(-86, -124, 62, 20, -84, 104, -37, -28, 7);
        }
        for (int var2 = 0; var2 < this.field3554; var2++) {
            for (int var3 = 0; var3 < this.field3582; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field3554 - 5) || (this.field3582 - 5) <= var3) {
                    this.field3570[var2][var3] = 16777215;
                } else {
                    this.field3570[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIIIIIIII)Z", line = 1542)
    private final boolean method1610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3579++;
        if (arg4 != -1) {
            return false;
        } else if ((arg3 + arg8) > arg7 && arg0 + arg7 > arg3) {
            return (arg1 + arg5) > arg2 && arg2 + arg6 > arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1561)
    private final boolean method1611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3575++;
        if (arg1 != 7364) {
            this.method1602(111, -86, (byte) 4, -20, 32, -8, 28, -25);
        }
        int var11 = arg5 + arg6;
        int var12 = arg4 + arg0;
        int var13 = arg2 + arg3;
        int var14 = arg7 + arg9;
        if (arg5 >= arg4 && arg5 < var12) {
            if (arg2 == var14 && (arg8 & 0x4) == 0) {
                int var15 = arg5;
                int var16 = var12 < var11 ? var12 : var11;
                while (var15 < var16) {
                    if ((this.field3570[var15 - this.field3558][var14 - this.field3569 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg7 == var13 && (arg8 & 0x1) == 0) {
                int var17 = arg5;
                int var18 = var12 < var11 ? var12 : var11;
                while (var17 < var18) {
                    if ((this.field3570[var17 - this.field3558][arg7 - this.field3569] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg4 < var11 && var11 <= var12) {
            if (arg2 == var14 && (arg8 & 0x4) == 0) {
                for (int var19 = arg4; var19 < var11; var19++) {
                    if ((this.field3570[var19 - this.field3558][var14 - this.field3569 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var13 && (arg8 & 0x1) == 0) {
                for (int var20 = arg4; var20 < var11; var20++) {
                    if ((this.field3570[var20 - this.field3558][arg7 - this.field3569] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg2 <= arg7 && var13 > arg7) {
            if (arg4 == var11 && (arg8 & 0x8) == 0) {
                int var21 = var14 <= var13 ? var14 : var13;
                for (int var22 = arg7; var22 < var21; var22++) {
                    if ((this.field3570[var11 - (this.field3558 + 1)][var22 - this.field3569] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var12 && (arg8 & 0x2) == 0) {
                int var23 = arg7;
                int var24 = var14 <= var13 ? var14 : var13;
                while (var24 > var23) {
                    if ((this.field3570[arg5 - this.field3558][var23 - this.field3569] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg2 < var14 && var13 >= var14) {
            if (arg4 == var11 && (arg8 & 0x8) == 0) {
                for (int var25 = arg2; var25 < var14; var25++) {
                    if ((this.field3570[var11 - this.field3558 - 1][var25 - this.field3569] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var12 && (arg8 & 0x2) == 0) {
                for (int var26 = arg2; var26 < var14; var26++) {
                    if ((this.field3570[arg5 - this.field3558][var26 - this.field3569] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(III)V", line = 1726)
    public final void method1612(int arg0, int arg1, int arg2) {
        field3578++;
        int var4 = arg2 - this.field3558;
        int var5 = arg1 - this.field3569;
        if (arg0 != -1) {
            field3563 = (short[][]) ((short[][]) null);
        }
        this.field3570[var4][var5] = class255.method1813(this.field3570[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIZIII)V", line = 1739)
    public final void method1613(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field3558;
        field3572++;
        int var9 = arg5 - this.field3569;
        int var10 = 256;
        if (arg0) {
            var10 += 131072;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg2;
            arg2 = arg4;
            arg4 = var11;
        }
        for (int var12 = var8; var12 < arg2 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field3554) {
                for (int var13 = var9; var13 < arg4 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field3582) {
                        this.method1605(var10, var12, false, var13);
                    }
                }
            }
        }
        if (arg3) {
            field3563 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V", line = 1787)
    public class223(int arg0, int arg1) {
        this.field3582 = arg1;
        this.field3569 = 0;
        this.field3554 = arg0;
        this.field3570 = new int[this.field3554][this.field3582];
        this.method1609(16777215);
    }
}
