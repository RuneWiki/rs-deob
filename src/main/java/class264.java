import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class264 {

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    private int field4734 = 0;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    private int field4732;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    private int field4727;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    private int field4729;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[[I")
    public int[][] field4719;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
    public static int[] field4721 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Ljd;")
    private static class85 field4713 = class221.method1499("flash2:", (byte) 108);

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Ljd;")
    public static class85 field4724 = class221.method1499("l", (byte) 120);

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Ljd;")
    public static class85 field4723 = field4713;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Ljd;")
    public static class85 field4715 = class221.method1499("Ablegen", (byte) -54);

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Ljd;")
    public static class85 field4722 = field4713;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Ljd;")
    public static class85 field4733 = class221.method1499("Starte 3D)2Softwarebibliothek)3", (byte) 99);

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field4743 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lqa;")
    public static class147 field4735;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[[[B")
    public static byte[][][] field4718;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method1809(int arg0) {
        field4715 = null;
        field4735 = null;
        field4722 = null;
        field4723 = null;
        field4718 = null;
        field4713 = null;
        field4724 = null;
        field4721 = null;
        if (arg0 >= -27) {
            method1809(-99);
        }
        field4733 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
    private final void method1810(int arg0, int arg1, int arg2, int arg3) {
        field4716++;
        if (arg1 == 1) {
            this.field4719[arg0][arg3] = class135.method899(this.field4719[arg0][arg3], ~arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBII)V")
    private final void method1811(int arg0, byte arg1, int arg2, int arg3) {
        this.field4719[arg2][arg0] = class75.method528(this.field4719[arg2][arg0], arg3);
        field4728++;
        int var5 = 109 % ((-arg1 - 9) / 47);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4731++;
        if (arg5 > 1) {
            return this.method1825(arg6, arg3 ^ 0xFFFFFFF7, arg1, arg4, arg5, arg8, arg5, arg7, arg2) ? true : this.method1821(arg5, arg7, arg4, arg6, arg2, 0, arg8, arg5, arg0, arg1);
        }
        int var10 = arg1 + arg4 - 1;
        if (arg3 != 8) {
            return false;
        }
        int var11 = arg2 + arg7 - 1;
        if (arg8 >= arg1 && var10 >= arg8 && arg2 <= arg6 && var11 >= arg6) {
            return true;
        } else if ((arg1 - 1) == arg8 && arg2 <= arg6 && var11 >= arg6 && (this.field4719[arg8 - this.field4729][arg6 - this.field4734] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg8 && arg6 >= arg2 && arg6 <= var11 && (this.field4719[arg8 - this.field4729][arg6 - this.field4734] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg6 && arg8 >= arg1 && arg8 <= var10 && (this.field4719[arg8 - this.field4729][arg6 - this.field4734] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg6 && arg8 >= arg1 && var10 >= arg8 && (this.field4719[arg8 - this.field4729][arg6 - this.field4734] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public final void method1813(int arg0) {
        field4742++;
        if (arg0 != 2949) {
            return;
        }
        for (int var2 = 0; var2 < this.field4727; var2++) {
            for (int var3 = 0; var3 < this.field4732; var3++) {
                if (var2 == 0 || var3 == 0 || this.field4727 - 5 <= var2 || this.field4732 - 5 <= var3) {
                    this.field4719[var2][var3] = 16777215;
                } else {
                    this.field4719[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZIIII)V")
    public final void method1814(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4738++;
        int var7 = 256;
        int var8 = arg2 - this.field4729;
        if (arg1) {
            var7 += 131072;
        }
        int var9 = arg0 - this.field4734;
        int var10 = -49 / ((-arg5 - 7) / 54);
        for (int var11 = var8; var11 < arg4 + var8; var11++) {
            if (var11 >= 0 && this.field4727 > var11) {
                for (int var12 = var9; var12 < var9 + arg3; var12++) {
                    if (var12 >= 0 && this.field4732 > var12) {
                        this.method1811(var12, (byte) -123, var11, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIBI)Z")
    public final boolean method1815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field4726++;
        if (arg2 == 1) {
            if (arg1 == arg3 && arg5 == arg7) {
                return true;
            }
        } else if (arg1 >= arg3 && arg1 <= arg3 - (1 - arg2) && arg5 <= arg5 && arg2 + arg5 - 1 >= arg5) {
            return true;
        }
        int var9 = arg5 - this.field4734;
        if (arg6 != 6) {
            this.method1821(115, -61, -31, 28, -102, 112, -53, -69, -46, 18);
        }
        int var10 = arg7 - this.field4734;
        int var11 = arg3 - this.field4729;
        int var12 = arg1 - this.field4729;
        if (arg2 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field4719[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field4719[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field4719[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field4719[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field4719[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field4719[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field4719[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4719[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field4719[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field4719[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field4719[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field4719[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg2 - 1;
            int var14 = arg2 + var10 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var12 + 1 == var11 && var10 <= var9 && var14 >= var9 && (this.field4719[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var9 - arg2) == var10 && (this.field4719[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - arg2) == var11 && var10 <= var9 && var14 >= var9 && (this.field4719[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var9 - arg2 == var10 && (this.field4719[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - arg2 == var11 && var9 >= var10 && var14 >= var9 && (this.field4719[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field4719[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var11 && var9 >= var10 && var9 <= var14 && (this.field4719[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 + 1) == var10 && (this.field4719[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var12 >= var11 && var13 >= var12 && (var9 + 1) == var10 && (this.field4719[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var12 && var12 <= var13 && (var9 - arg2) == var10 && (this.field4719[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg2) == var11 && var10 <= var9 && var14 >= var9 && (this.field4719[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 >= var10 && var14 >= var9 && (this.field4719[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZIZIII)V")
    public final void method1816(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field4734;
        int var8 = arg5 - this.field4729;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method1810(var8, 1, 128, var7);
                this.method1810(var8 - 1, 1, 8, var7);
            }
            if (arg1 == 1) {
                this.method1810(var8, 1, 2, var7);
                this.method1810(var8, 1, 32, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1810(var8, 1, 8, var7);
                this.method1810(var8 + 1, 1, 128, var7);
            }
            if (arg1 == 3) {
                this.method1810(var8, 1, 32, var7);
                this.method1810(var8, 1, 2, var7 - 1);
            }
        }
        field4725++;
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method1810(var8, 1, 1, var7);
                this.method1810(var8 - 1, 1, 16, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1810(var8, 1, 4, var7);
                this.method1810(var8 + 1, 1, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1810(var8, 1, 16, var7);
                this.method1810(var8 + 1, 1, 1, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1810(var8, 1, 64, var7);
                this.method1810(var8 - 1, 1, 4, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method1810(var8, 1, 130, var7);
                this.method1810(var8 - 1, 1, 8, var7);
                this.method1810(var8, 1, 32, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1810(var8, 1, 10, var7);
                this.method1810(var8, 1, 32, var7 + 1);
                this.method1810(var8 + 1, 1, 128, var7);
            }
            if (arg1 == 2) {
                this.method1810(var8, 1, 40, var7);
                this.method1810(var8 + 1, 1, 128, var7);
                this.method1810(var8, 1, 2, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1810(var8, 1, 160, var7);
                this.method1810(var8, 1, 2, var7 - 1);
                this.method1810(var8 - 1, 1, 8, var7);
            }
        }
        if (!arg0 || !arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method1810(var8, 1, 65536, var7);
                this.method1810(var8 - 1, 1, 4096, var7);
            }
            if (arg1 == 1) {
                this.method1810(var8, 1, 1024, var7);
                this.method1810(var8, 1, 16384, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1810(var8, 1, 4096, var7);
                this.method1810(var8 + 1, 1, 65536, var7);
            }
            if (arg1 == 3) {
                this.method1810(var8, 1, 16384, var7);
                this.method1810(var8, 1, 1024, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method1810(var8, 1, 512, var7);
                this.method1810(var8 - 1, 1, 8192, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1810(var8, 1, 2048, var7);
                this.method1810(var8 + 1, 1, 32768, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1810(var8, 1, 8192, var7);
                this.method1810(var8 + 1, 1, 512, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1810(var8, 1, 32768, var7);
                this.method1810(var8 - 1, 1, 2048, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1810(var8, 1, 66560, var7);
            this.method1810(var8 - 1, 1, 4096, var7);
            this.method1810(var8, 1, 16384, var7 + 1);
        }
        if (arg1 == 1) {
            this.method1810(var8, 1, 5120, var7);
            this.method1810(var8, 1, 16384, var7 + 1);
            this.method1810(var8 + 1, 1, 65536, var7);
        }
        if (arg1 == 2) {
            this.method1810(var8, 1, 20480, var7);
            this.method1810(var8 + 1, 1, 65536, var7);
            this.method1810(var8, 1, 1024, var7 - 1);
        }
        if (arg1 == 3) {
            this.method1810(var8, 1, 81920, var7);
            this.method1810(var8, 1, 1024, var7 - 1);
            this.method1810(var8 - 1, 1, 4096, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Z")
    public static final boolean method1817(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class206.field3599; var3++) {
            class260 var4 = class214.field3769[var3];
            if (var4.field4587 == 1) {
                int var5 = var4.field4605 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4598 * var5 >> 8) + var4.field4606;
                    int var7 = (var4.field4603 * var5 >> 8) + var4.field4601;
                    int var8 = (var4.field4593 * var5 >> 8) + var4.field4584;
                    int var9 = (var4.field4595 * var5 >> 8) + var4.field4585;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4587 == 2) {
                int var10 = arg0 - var4.field4605;
                if (var10 > 0) {
                    int var11 = (var4.field4598 * var10 >> 8) + var4.field4606;
                    int var12 = (var4.field4603 * var10 >> 8) + var4.field4601;
                    int var13 = (var4.field4593 * var10 >> 8) + var4.field4584;
                    int var14 = (var4.field4595 * var10 >> 8) + var4.field4585;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4587 == 3) {
                int var15 = var4.field4606 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4589 * var15 >> 8) + var4.field4605;
                    int var17 = (var4.field4588 * var15 >> 8) + var4.field4604;
                    int var18 = (var4.field4593 * var15 >> 8) + var4.field4584;
                    int var19 = (var4.field4595 * var15 >> 8) + var4.field4585;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4587 == 4) {
                int var20 = arg2 - var4.field4606;
                if (var20 > 0) {
                    int var21 = (var4.field4589 * var20 >> 8) + var4.field4605;
                    int var22 = (var4.field4588 * var20 >> 8) + var4.field4604;
                    int var23 = (var4.field4593 * var20 >> 8) + var4.field4584;
                    int var24 = (var4.field4595 * var20 >> 8) + var4.field4585;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4587 == 5) {
                int var25 = arg1 - var4.field4584;
                if (var25 > 0) {
                    int var26 = (var4.field4589 * var25 >> 8) + var4.field4605;
                    int var27 = (var4.field4588 * var25 >> 8) + var4.field4604;
                    int var28 = (var4.field4598 * var25 >> 8) + var4.field4606;
                    int var29 = (var4.field4603 * var25 >> 8) + var4.field4601;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIBIZ)V")
    public final void method1818(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        field4720++;
        int var8 = arg1 - this.field4729;
        int var9 = arg0 - this.field4734;
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg5;
            arg5 = arg3;
            arg3 = var10;
        }
        int var11 = 256;
        if (arg6) {
            var11 += 131072;
        }
        if (arg4 > -100) {
            return;
        }
        for (int var12 = var8; var12 < arg5 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field4727) {
                for (int var13 = var9; var13 < arg3 + var9; var13++) {
                    if (var13 >= 0 && this.field4732 > var13) {
                        this.method1810(var12, 1, var11, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IZIIII)V")
    public final void method1819(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field4734;
        int var8 = arg4 - this.field4729;
        if (arg5 != 0) {
            method1809(99);
        }
        field4717++;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method1811(var7, (byte) 87, var8, 128);
                this.method1811(var7, (byte) 70, var8 - 1, 8);
            }
            if (arg3 == 1) {
                this.method1811(var7, (byte) -112, var8, 2);
                this.method1811(var7 + 1, (byte) 108, var8, 32);
            }
            if (arg3 == 2) {
                this.method1811(var7, (byte) 120, var8, 8);
                this.method1811(var7, (byte) 120, var8 + 1, 128);
            }
            if (arg3 == 3) {
                this.method1811(var7, (byte) -60, var8, 32);
                this.method1811(var7 - 1, (byte) 46, var8, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method1811(var7, (byte) -93, var8, 1);
                this.method1811(var7 + 1, (byte) 83, var8 - 1, 16);
            }
            if (arg3 == 1) {
                this.method1811(var7, (byte) -61, var8, 4);
                this.method1811(var7 + 1, (byte) 73, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method1811(var7, (byte) 66, var8, 16);
                this.method1811(var7 - 1, (byte) 102, var8 + 1, 1);
            }
            if (arg3 == 3) {
                this.method1811(var7, (byte) 62, var8, 64);
                this.method1811(var7 - 1, (byte) 70, var8 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method1811(var7, (byte) 93, var8, 130);
                this.method1811(var7, (byte) 87, var8 - 1, 8);
                this.method1811(var7 + 1, (byte) 71, var8, 32);
            }
            if (arg3 == 1) {
                this.method1811(var7, (byte) -93, var8, 10);
                this.method1811(var7 + 1, (byte) 97, var8, 32);
                this.method1811(var7, (byte) 38, var8 + 1, 128);
            }
            if (arg3 == 2) {
                this.method1811(var7, (byte) 51, var8, 40);
                this.method1811(var7, (byte) 68, var8 + 1, 128);
                this.method1811(var7 - 1, (byte) -87, var8, 2);
            }
            if (arg3 == 3) {
                this.method1811(var7, (byte) 76, var8, 160);
                this.method1811(var7 - 1, (byte) -59, var8, 2);
                this.method1811(var7, (byte) -107, var8 - 1, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method1811(var7, (byte) 90, var8, 65536);
                this.method1811(var7, (byte) -83, var8 - 1, 4096);
            }
            if (arg3 == 1) {
                this.method1811(var7, (byte) 60, var8, 1024);
                this.method1811(var7 + 1, (byte) -62, var8, 16384);
            }
            if (arg3 == 2) {
                this.method1811(var7, (byte) 50, var8, 4096);
                this.method1811(var7, (byte) 110, var8 + 1, 65536);
            }
            if (arg3 == 3) {
                this.method1811(var7, (byte) 66, var8, 16384);
                this.method1811(var7 - 1, (byte) 106, var8, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method1811(var7, (byte) -75, var8, 512);
                this.method1811(var7 + 1, (byte) 114, var8 - 1, 8192);
            }
            if (arg3 == 1) {
                this.method1811(var7, (byte) 79, var8, 2048);
                this.method1811(var7 + 1, (byte) -116, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method1811(var7, (byte) -59, var8, 8192);
                this.method1811(var7 - 1, (byte) 77, var8 + 1, 512);
            }
            if (arg3 == 3) {
                this.method1811(var7, (byte) -98, var8, 32768);
                this.method1811(var7 - 1, (byte) -88, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1811(var7, (byte) -113, var8, 66560);
            this.method1811(var7, (byte) 109, var8 - 1, 4096);
            this.method1811(var7 + 1, (byte) -110, var8, 16384);
        }
        if (arg3 == 1) {
            this.method1811(var7, (byte) -76, var8, 5120);
            this.method1811(var7 + 1, (byte) 40, var8, 16384);
            this.method1811(var7, (byte) -118, var8 + 1, 65536);
        }
        if (arg3 == 2) {
            this.method1811(var7, (byte) -89, var8, 20480);
            this.method1811(var7, (byte) -89, var8 + 1, 65536);
            this.method1811(var7 - 1, (byte) -91, var8, 1024);
        }
        if (arg3 == 3) {
            this.method1811(var7, (byte) -118, var8, 81920);
            this.method1811(var7 - 1, (byte) 113, var8, 1024);
            this.method1811(var7, (byte) 74, var8 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZII)V")
    public final void method1820(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4734;
        if (!arg0) {
            this.field4734 = 14;
        }
        field4737++;
        int var5 = arg2 - this.field4729;
        this.field4719[var5][var4] = class75.method528(this.field4719[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method1821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg6 + arg7;
        field4741++;
        if (arg5 != 0) {
            return true;
        }
        int var12 = arg9 + arg2;
        int var13 = arg0 + arg3;
        int var14 = arg4 + arg1;
        if (arg6 >= arg9 && arg6 < var12) {
            if (arg4 == var13 && (arg8 & 0x4) == 0) {
                int var15 = var11 <= var12 ? var11 : var12;
                for (int var16 = arg6; var16 < var15; var16++) {
                    if ((this.field4719[var16 - this.field4729][var13 - this.field4734 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var14 && (arg8 & 0x1) == 0) {
                int var17 = arg6;
                int var18 = var12 < var11 ? var12 : var11;
                while (var18 > var17) {
                    if ((this.field4719[var17 - this.field4729][arg3 - this.field4734] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg9 < var11 && var11 <= var12) {
            if (arg4 == var13 && (arg8 & 0x4) == 0) {
                for (int var19 = arg9; var19 < var11; var19++) {
                    if ((this.field4719[var19 - this.field4729][var13 - this.field4734 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var14 && (arg8 & 0x1) == 0) {
                for (int var20 = arg9; var20 < var11; var20++) {
                    if ((this.field4719[var20 - this.field4729][arg3 - this.field4734] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg3 >= arg4 && arg3 < var14) {
            if (arg9 == var11 && (arg8 & 0x8) == 0) {
                int var21 = arg3;
                int var22 = var14 >= var13 ? var13 : var14;
                while (var21 < var22) {
                    if ((this.field4719[var11 - this.field4729 - 1][var21 - this.field4734] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg6 == var12 && (arg8 & 0x2) == 0) {
                int var23 = arg3;
                int var24 = var13 > var14 ? var14 : var13;
                while (var23 < var24) {
                    if ((this.field4719[arg6 - this.field4729][var23 - this.field4734] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg4 < var13 && var14 >= var13) {
            if (arg9 == var11 && (arg8 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var13; var25++) {
                    if ((this.field4719[var11 - this.field4729 - 1][var25 - this.field4734] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var12 && (arg8 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var13; var26++) {
                    if ((this.field4719[arg6 - this.field4729][var26 - this.field4734] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)V")
    public final void method1822(int arg0, int arg1, int arg2) {
        if (arg1 < 29) {
            this.field4732 = -9;
        }
        int var4 = arg0 - this.field4729;
        int var5 = arg2 - this.field4734;
        field4730++;
        this.field4719[var4][var5] = class135.method899(this.field4719[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4740++;
        if (arg5 == 1) {
            if (arg6 == arg7 && arg0 == arg4) {
                return true;
            }
        } else if (arg7 >= arg6 && arg7 <= (arg5 + arg6 - 1) && arg4 <= arg4 && arg4 - (1 - arg5) >= arg4) {
            return true;
        }
        int var9 = arg0 - this.field4734;
        int var10 = arg4 - this.field4734;
        if (arg3 != 11662) {
            this.method1814(-45, true, -8, -54, 59, 94);
        }
        int var11 = arg7 - this.field4729;
        int var12 = arg6 - this.field4729;
        if (arg5 == 1) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field4719[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field4719[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field4719[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field4719[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field4719[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field4719[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field4719[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field4719[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field4719[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field4719[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field4719[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg5 - 1;
            int var14 = arg5 + var9 - 1;
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if ((var11 - arg5) == var12 && var9 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 + 1) == var9 && (this.field4719[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 - arg5 == var9 && (this.field4719[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 >= var12 && var11 <= var13 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 - arg5 == var12 && var10 >= var9 && var10 <= var14 && (this.field4719[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field4719[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 + 1) == var12 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 + 1) == var9 && (this.field4719[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 - arg5 == var9 && (this.field4719[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 <= var11 && var13 >= var11 && (var10 - arg5) == var9) {
                        return true;
                    }
                    if ((var11 - arg5) == var12 && var9 <= var10 && var14 >= var10 && (this.field4719[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field4719[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if (var11 - arg5 == var12 && var9 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var10 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field4719[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 - arg5 == var9 && (this.field4719[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - arg5 == var12 && var9 <= var10 && var14 >= var10 && (this.field4719[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 - arg5 == var9 && (this.field4719[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - arg5) == var12 && var10 >= var9 && var14 >= var10 && (this.field4719[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var10 + 1) == var9 && (this.field4719[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 - arg5 == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var11 - arg5) == var12 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field4719[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var14 >= var10 && (this.field4719[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 - arg5 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var12 <= var11 && var11 <= var13 && (var10 + 1) == var9 && (this.field4719[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 <= var11 && var11 <= var13 && (var10 - arg5) == var9 && (this.field4719[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var11 - arg5) == var12 && var10 >= var9 && var10 <= var14 && (this.field4719[var13][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 <= var10 && var14 >= var10 && (this.field4719[var12][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(II)V")
    public class264(int arg0, int arg1) {
        this.field4732 = arg1;
        this.field4727 = arg0;
        this.field4729 = 0;
        this.field4719 = new int[this.field4727][this.field4732];
        this.method1813(2949);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
    public final void method1824(int arg0, int arg1, int arg2) {
        field4736++;
        int var4 = arg1 - this.field4734;
        if (arg2 <= 2) {
            this.method1824(45, 110, 55);
        }
        int var5 = arg0 - this.field4729;
        this.field4719[var5][var4] = class75.method528(this.field4719[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IIIIIIIII)Z")
    private final boolean method1825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != -1) {
            return true;
        }
        field4714++;
        if (arg2 + arg3 > arg5 && arg2 < (arg5 + arg6)) {
            return arg7 + arg8 > arg0 && (arg0 + arg4) > arg8;
        } else {
            return false;
        }
    }
}
