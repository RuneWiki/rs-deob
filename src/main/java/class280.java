import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class280 {

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "[Lfi;")
    public static class8[] field4114 = new class8[5];

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "Z")
    public static boolean field4130;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field4129;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public int field4120;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "Lde;")
    public static class364 field4126;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "[Lwc;")
    public static class64[] field4131;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "[[I")
    public int[][] field4115;

    static {
        for (int var0 = 0; var0 < field4114.length; var0++) {
            field4114[var0] = new class8();
        }
        field4127 = 0;
        new class357(64);
        field4130 = false;
        field4129 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZIZIII)V", line = 4)
    public final void method1840(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field4107++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        int var9 = arg0 - this.field4110;
        int var10 = arg6 - this.field4106;
        if (arg3) {
            var8 |= 0x40000000;
        }
        if (arg5 != 1) {
            field4114 = null;
        }
        for (int var11 = var9; var11 < arg2 + var9; var11++) {
            if (var11 >= 0 && this.field4112 > var11) {
                for (int var12 = var10; var12 < var10 + arg4; var12++) {
                    if (var12 >= 0 && this.field4120 > var12) {
                        this.method1842((byte) -100, var12, var11, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIII)Z", line = 48)
    public final boolean method1841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4121++;
        if (arg0 > 1) {
            return class122.method877(1, arg4, arg0, arg8, arg3, arg0, arg5, arg1, arg2) ? true : this.method1853(arg4, arg3, 32768, arg7, arg0, arg2, arg1, arg5, arg0, arg8);
        }
        int var10 = arg5 + arg4 - 1;
        int var11 = arg1 + arg8 - 1;
        if (arg5 <= arg3 && var10 >= arg3 && arg8 <= arg2 && var11 >= arg2) {
            return true;
        } else if ((arg5 + arg6) == arg3 && arg8 <= arg2 && var11 >= arg2 && (this.field4115[arg3 - this.field4110][arg2 - this.field4106] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg3 && arg2 >= arg8 && var11 >= arg2 && (this.field4115[arg3 - this.field4110][arg2 - this.field4106] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg2 && arg5 <= arg3 && arg3 <= var10 && (this.field4115[arg3 - this.field4110][arg2 - this.field4106] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg2 && arg5 <= arg3 && var10 >= arg3 && (this.field4115[arg3 - this.field4110][arg2 - this.field4106] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BIII)V", line = 86)
    private final void method1842(byte arg0, int arg1, int arg2, int arg3) {
        field4123++;
        this.field4115[arg2][arg1] = class258.method1708(this.field4115[arg2][arg1], arg3);
        if (arg0 != -100) {
            this.field4110 = -102;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V", line = 97)
    private final void method1843(int arg0, int arg1, int arg2, int arg3) {
        field4124++;
        if (arg0 != 1) {
            this.field4115 = null;
        }
        this.field4115[arg3][arg2] = class394.method2529(this.field4115[arg3][arg2], ~arg1);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZIZIBI)V", line = 111)
    public final void method1844(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        field4108++;
        int var8 = arg0 - this.field4110;
        int var9 = arg6 - this.field4106;
        int var10 = 92 / ((arg5 + 35) / 60);
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method1843(1, 128, var9, var8);
                this.method1843(1, 8, var9, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1843(1, 2, var9, var8);
                this.method1843(1, 32, var9 + 1, var8);
            }
            if (arg2 == 2) {
                this.method1843(1, 8, var9, var8);
                this.method1843(1, 128, var9, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1843(1, 32, var9, var8);
                this.method1843(1, 2, var9 - 1, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method1843(1, 1, var9, var8);
                this.method1843(1, 16, var9 + 1, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1843(1, 4, var9, var8);
                this.method1843(1, 64, var9 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1843(1, 16, var9, var8);
                this.method1843(1, 1, var9 - 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1843(1, 64, var9, var8);
                this.method1843(1, 4, var9 - 1, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method1843(1, 130, var9, var8);
                this.method1843(1, 8, var9, var8 - 1);
                this.method1843(1, 32, var9 + 1, var8);
            }
            if (arg2 == 1) {
                this.method1843(1, 10, var9, var8);
                this.method1843(1, 32, var9 + 1, var8);
                this.method1843(1, 128, var9, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1843(1, 40, var9, var8);
                this.method1843(1, 128, var9, var8 + 1);
                this.method1843(1, 2, var9 - 1, var8);
            }
            if (arg2 == 3) {
                this.method1843(1, 160, var9, var8);
                this.method1843(1, 2, var9 - 1, var8);
                this.method1843(1, 8, var9, var8 - 1);
            }
        }
        if (arg3) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    this.method1843(1, 65536, var9, var8);
                    this.method1843(1, 4096, var9, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method1843(1, 1024, var9, var8);
                    this.method1843(1, 16384, var9 + 1, var8);
                }
                if (arg2 == 2) {
                    this.method1843(1, 4096, var9, var8);
                    this.method1843(1, 65536, var9, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method1843(1, 16384, var9, var8);
                    this.method1843(1, 1024, var9 - 1, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg2 == 0) {
                    this.method1843(1, 512, var9, var8);
                    this.method1843(1, 8192, var9 + 1, var8 + -1);
                }
                if (arg2 == 1) {
                    this.method1843(1, 2048, var9, var8);
                    this.method1843(1, 32768, var9 + 1, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method1843(1, 8192, var9, var8);
                    this.method1843(1, 512, var9 - 1, var8 - -1);
                }
                if (arg2 == 3) {
                    this.method1843(1, 32768, var9, var8);
                    this.method1843(1, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    this.method1843(1, 66560, var9, var8);
                    this.method1843(1, 4096, var9, var8 - 1);
                    this.method1843(1, 16384, var9 + 1, var8);
                }
                if (arg2 == 1) {
                    this.method1843(1, 5120, var9, var8);
                    this.method1843(1, 16384, var9 + 1, var8);
                    this.method1843(1, 65536, var9, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method1843(1, 20480, var9, var8);
                    this.method1843(1, 65536, var9, var8 + 1);
                    this.method1843(1, 1024, var9 - 1, var8);
                }
                if (arg2 == 3) {
                    this.method1843(1, 81920, var9, var8);
                    this.method1843(1, 1024, var9 - 1, var8);
                    this.method1843(1, 4096, var9, var8 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method1843(1, 536870912, var9, var8);
                this.method1843(1, 33554432, var9, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1843(1, 8388608, var9, var8);
                this.method1843(1, 134217728, var9 + 1, var8);
            }
            if (arg2 == 2) {
                this.method1843(1, 33554432, var9, var8);
                this.method1843(1, 536870912, var9, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1843(1, 134217728, var9, var8);
                this.method1843(1, 8388608, var9 - 1, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method1843(1, 4194304, var9, var8);
                this.method1843(1, 67108864, var9 + 1, var8 + -1);
            }
            if (arg2 == 1) {
                this.method1843(1, 16777216, var9, var8);
                this.method1843(1, 268435456, var9 + 1, var8 - -1);
            }
            if (arg2 == 2) {
                this.method1843(1, 67108864, var9, var8);
                this.method1843(1, 4194304, var9 - 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1843(1, 268435456, var9, var8);
                this.method1843(1, 16777216, var9 - 1, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1843(1, 545259520, var9, var8);
            this.method1843(1, 33554432, var9, var8 - 1);
            this.method1843(1, 134217728, var9 + 1, var8);
        }
        if (arg2 == 1) {
            this.method1843(1, 41943040, var9, var8);
            this.method1843(1, 134217728, var9 + 1, var8);
            this.method1843(1, 536870912, var9, var8 + 1);
        }
        if (arg2 == 2) {
            this.method1843(1, 167772160, var9, var8);
            this.method1843(1, 536870912, var9, var8 + 1);
            this.method1843(1, 8388608, var9 - 1, var8);
        }
        if (arg2 == 3) {
            this.method1843(1, 671088640, var9, var8);
            this.method1843(1, 8388608, var9 - 1, var8);
            this.method1843(1, 33554432, var9, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lfb;II)V", line = 423)
    public static final void method1845(class341 arg0, int arg1, int arg2) {
        if (class136.field1767 != null) {
            try {
                class136.field1767.method2419(arg1 ^ 0x1615, 0L);
                class136.field1767.method2420(24, -1, arg2, arg0.field5042);
            } catch (Exception var3) {
            }
        }
        if (arg1 != 5653) {
            method1845((class341) null, 44, -23);
        }
        field4117++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIII)Z", line = 445)
    public final boolean method1846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4111++;
        if (arg2 == 1) {
            if (arg0 == arg3 && arg1 == arg6) {
                return true;
            }
        } else if (arg3 <= arg0 && arg0 <= arg2 + arg3 - 1 && arg6 >= arg6 && arg6 <= arg2 + arg6 - 1) {
            return true;
        }
        int var9 = arg6 - this.field4106;
        int var10 = arg1 - this.field4106;
        int var11 = arg0 - this.field4110;
        int var12 = arg3 - this.field4110;
        int var13 = -102 % ((-arg4 - 48) / 41);
        if (arg2 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field4115[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field4115[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field4115[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field4115[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4115[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4115[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4115[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field4115[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field4115[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field4115[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field4115[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field4115[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var12 + arg2 - 1;
            int var15 = var10 + arg2 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var15 && (this.field4115[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var14 >= var11 && var9 - arg2 == var10 && (this.field4115[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - arg2 == var12 && var10 <= var9 && var9 <= var15 && (this.field4115[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var14 && (var9 - arg2) == var10 && (this.field4115[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg2) == var12 && var9 >= var10 && var15 >= var9 && (this.field4115[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var14 >= var11 && var9 + 1 == var10 && (this.field4115[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var15 && (this.field4115[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var14 && var9 + 1 == var10 && (this.field4115[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 >= var12 && var11 <= var14 && var9 + 1 == var10 && (this.field4115[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var12 && var14 >= var11 && var9 - arg2 == var10 && (this.field4115[var11][var15] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg2) == var12 && var9 >= var10 && var9 <= var15 && (this.field4115[var14][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var10 <= var9 && var9 <= var15 && (this.field4115[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBIZIIZ)V", line = 635)
    public final void method1847(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field4128++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field4110;
        int var11 = arg6 - this.field4106;
        if (arg2 != 28) {
            this.method1855(93, -40, -26);
        }
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg3;
            arg3 = arg0;
            arg0 = var12;
        }
        if (arg4) {
            var9 |= 0x40000000;
        }
        for (int var13 = var10; var13 < arg3 + var10; var13++) {
            if (var13 >= 0 && this.field4112 > var13) {
                for (int var14 = var11; var14 < (arg0 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field4120) {
                        this.method1843(1, var9, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 689)
    public static void method1848(int arg0) {
        field4114 = null;
        int var1 = 52 % ((arg0 - 36) / 53);
        field4126 = null;
        field4131 = null;
        field4129 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V", line = 713)
    public final void method1849(int arg0, int arg1, int arg2) {
        field4116++;
        int var4 = arg2 - this.field4106;
        if (arg1 != 66560) {
            this.field4120 = 77;
        }
        int var5 = arg0 - this.field4110;
        this.field4115[var5][var4] = class394.method2529(this.field4115[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 730)
    public final void method1850(boolean arg0) {
        if (arg0) {
            field4114 = null;
        }
        for (int var2 = 0; var2 < this.field4112; var2++) {
            for (int var3 = 0; var3 < this.field4120; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field4112 - 5) <= var2 || var3 >= this.field4120 - 5) {
                    this.field4115[var2][var3] = -1;
                } else {
                    this.field4115[var2][var3] = 2097152;
                }
            }
        }
        field4104++;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)V", line = 767)
    public final void method1851(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4106;
        field4105++;
        int var5 = arg2 - this.field4110;
        this.field4115[var5][var4] = class258.method1708(this.field4115[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIIIII)Z", line = 777)
    public final boolean method1852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 1) {
            this.field4112 = -66;
        }
        field4122++;
        if (arg4 == 1) {
            if (arg1 == arg6 && arg0 == arg2) {
                return true;
            }
        } else if (arg1 <= arg6 && arg6 <= arg1 + arg4 - 1 && arg0 >= arg0 && (arg0 + arg4 - 1) >= arg0) {
            return true;
        }
        int var9 = arg1 - this.field4110;
        int var10 = arg6 - this.field4110;
        int var11 = arg0 - this.field4106;
        int var12 = arg2 - this.field4106;
        if (arg4 == 1) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field4115[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field4115[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field4115[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field4115[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var10 && var11 - 1 == var12) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field4115[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field4115[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field4115[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field4115[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var10 && (var11 + 1) == var12 && (this.field4115[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field4115[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field4115[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var9 - 1;
            int var14 = arg4 + var12 - 1;
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if ((var10 - arg4) == var9 && var12 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var11 + 1 == var12 && (this.field4115[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var11 - arg4 == var12 && (this.field4115[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 >= var9 && var10 <= var13 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var10 - arg4) == var9 && var11 >= var12 && var11 <= var14 && (this.field4115[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 <= var11 && var11 <= var14 && (this.field4115[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 + 1) == var9 && var12 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var11 + 1 == var12 && (this.field4115[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var11 - arg4 == var12 && (this.field4115[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 <= var10 && var10 <= var13 && (var11 - arg4) == var12) {
                        return true;
                    }
                    if ((var10 - arg4) == var9 && var11 >= var12 && var14 >= var11 && (this.field4115[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 <= var11 && var14 >= var11 && (this.field4115[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if (var10 - arg4 == var9 && var12 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 >= var12 && var14 >= var11 && (this.field4115[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var11 - arg4 == var12 && (this.field4115[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - arg4) == var9 && var12 <= var11 && var11 <= var14 && (this.field4115[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var11 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var11 - arg4) == var12 && (this.field4115[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - arg4 == var9 && var11 >= var12 && var14 >= var11 && (this.field4115[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var11 + 1 == var12 && (this.field4115[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var11 - arg4 == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - arg4 == var9 && var12 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var11 + 1) == var12 && (this.field4115[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 >= var12 && var14 >= var11 && (this.field4115[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var11 - arg4) == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 >= var9 && var13 >= var10 && (var11 + 1) == var12 && (this.field4115[var10][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var10 && var10 <= var13 && var11 - arg4 == var12 && (this.field4115[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg4 == var9 && var12 <= var11 && var14 >= var11 && (this.field4115[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 >= var12 && var14 >= var11 && (this.field4115[var9][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1150)
    public final boolean method1853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4113++;
        if (arg2 != 32768) {
            return true;
        }
        int var11 = arg1 + arg4;
        int var12 = arg5 + arg8;
        int var13 = arg0 + arg7;
        int var14 = arg6 + arg9;
        if (arg1 == var13 && (arg3 & 0x2) == 0) {
            int var15 = arg9 >= arg5 ? arg9 : arg5;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field4115[var13 - this.field4110 - 1][var15 - this.field4106] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg9 < arg5 ? arg5 : arg9;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field4115[arg7 - this.field4110][var17 - this.field4106] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg5 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg7 >= arg1 ? arg7 : arg1;
            int var20 = var11 < var13 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field4115[var19 - this.field4110][var14 - this.field4106 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg9 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg7 < arg1 ? arg1 : arg7;
            int var22 = var13 > var11 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field4115[var21 - this.field4110][arg9 - this.field4106] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZIIIIZZ)V", line = 1245)
    public final void method1854(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = arg1 - this.field4106;
        if (!arg5) {
            this.method1849(-105, 13, 49);
        }
        field4119++;
        int var9 = arg3 - this.field4110;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1842((byte) -100, var8, var9, 128);
                this.method1842((byte) -100, var8, var9 - 1, 8);
            }
            if (arg4 == 1) {
                this.method1842((byte) -100, var8, var9, 2);
                this.method1842((byte) -100, var8 + 1, var9, 32);
            }
            if (arg4 == 2) {
                this.method1842((byte) -100, var8, var9, 8);
                this.method1842((byte) -100, var8, var9 + 1, 128);
            }
            if (arg4 == 3) {
                this.method1842((byte) -100, var8, var9, 32);
                this.method1842((byte) -100, var8 - 1, var9, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1842((byte) -100, var8, var9, 1);
                this.method1842((byte) -100, var8 + 1, var9 + -1, 16);
            }
            if (arg4 == 1) {
                this.method1842((byte) -100, var8, var9, 4);
                this.method1842((byte) -100, var8 + 1, var9 - -1, 64);
            }
            if (arg4 == 2) {
                this.method1842((byte) -100, var8, var9, 16);
                this.method1842((byte) -100, var8 - 1, var9 + 1, 1);
            }
            if (arg4 == 3) {
                this.method1842((byte) -100, var8, var9, 64);
                this.method1842((byte) -100, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method1842((byte) -100, var8, var9, 130);
                this.method1842((byte) -100, var8, var9 - 1, 8);
                this.method1842((byte) -100, var8 + 1, var9, 32);
            }
            if (arg4 == 1) {
                this.method1842((byte) -100, var8, var9, 10);
                this.method1842((byte) -100, var8 + 1, var9, 32);
                this.method1842((byte) -100, var8, var9 + 1, 128);
            }
            if (arg4 == 2) {
                this.method1842((byte) -100, var8, var9, 40);
                this.method1842((byte) -100, var8, var9 + 1, 128);
                this.method1842((byte) -100, var8 - 1, var9, 2);
            }
            if (arg4 == 3) {
                this.method1842((byte) -100, var8, var9, 160);
                this.method1842((byte) -100, var8 - 1, var9, 2);
                this.method1842((byte) -100, var8, var9 - 1, 8);
            }
        }
        if (arg0) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    this.method1842((byte) -100, var8, var9, 65536);
                    this.method1842((byte) -100, var8, var9 - 1, 4096);
                }
                if (arg4 == 1) {
                    this.method1842((byte) -100, var8, var9, 1024);
                    this.method1842((byte) -100, var8 + 1, var9, 16384);
                }
                if (arg4 == 2) {
                    this.method1842((byte) -100, var8, var9, 4096);
                    this.method1842((byte) -100, var8, var9 + 1, 65536);
                }
                if (arg4 == 3) {
                    this.method1842((byte) -100, var8, var9, 16384);
                    this.method1842((byte) -100, var8 - 1, var9, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg4 == 0) {
                    this.method1842((byte) -100, var8, var9, 512);
                    this.method1842((byte) -100, var8 + 1, var9 + -1, 8192);
                }
                if (arg4 == 1) {
                    this.method1842((byte) -100, var8, var9, 2048);
                    this.method1842((byte) -100, var8 + 1, var9 + 1, 32768);
                }
                if (arg4 == 2) {
                    this.method1842((byte) -100, var8, var9, 8192);
                    this.method1842((byte) -100, var8 - 1, var9 + 1, 512);
                }
                if (arg4 == 3) {
                    this.method1842((byte) -100, var8, var9, 32768);
                    this.method1842((byte) -100, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    this.method1842((byte) -100, var8, var9, 66560);
                    this.method1842((byte) -100, var8, var9 - 1, 4096);
                    this.method1842((byte) -100, var8 + 1, var9, 16384);
                }
                if (arg4 == 1) {
                    this.method1842((byte) -100, var8, var9, 5120);
                    this.method1842((byte) -100, var8 + 1, var9, 16384);
                    this.method1842((byte) -100, var8, var9 + 1, 65536);
                }
                if (arg4 == 2) {
                    this.method1842((byte) -100, var8, var9, 20480);
                    this.method1842((byte) -100, var8, var9 + 1, 65536);
                    this.method1842((byte) -100, var8 - 1, var9, 1024);
                }
                if (arg4 == 3) {
                    this.method1842((byte) -100, var8, var9, 81920);
                    this.method1842((byte) -100, var8 - 1, var9, 1024);
                    this.method1842((byte) -100, var8, var9 - 1, 4096);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1842((byte) -100, var8, var9, 536870912);
                this.method1842((byte) -100, var8, var9 - 1, 33554432);
            }
            if (arg4 == 1) {
                this.method1842((byte) -100, var8, var9, 8388608);
                this.method1842((byte) -100, var8 + 1, var9, 134217728);
            }
            if (arg4 == 2) {
                this.method1842((byte) -100, var8, var9, 33554432);
                this.method1842((byte) -100, var8, var9 + 1, 536870912);
            }
            if (arg4 == 3) {
                this.method1842((byte) -100, var8, var9, 134217728);
                this.method1842((byte) -100, var8 - 1, var9, 8388608);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1842((byte) -100, var8, var9, 4194304);
                this.method1842((byte) -100, var8 + 1, var9 + -1, 67108864);
            }
            if (arg4 == 1) {
                this.method1842((byte) -100, var8, var9, 16777216);
                this.method1842((byte) -100, var8 + 1, var9 + 1, 268435456);
            }
            if (arg4 == 2) {
                this.method1842((byte) -100, var8, var9, 67108864);
                this.method1842((byte) -100, var8 - 1, var9 + 1, 4194304);
            }
            if (arg4 == 3) {
                this.method1842((byte) -100, var8, var9, 268435456);
                this.method1842((byte) -100, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1842((byte) -100, var8, var9, 545259520);
            this.method1842((byte) -100, var8, var9 - 1, 33554432);
            this.method1842((byte) -100, var8 + 1, var9, 134217728);
        }
        if (arg4 == 1) {
            this.method1842((byte) -100, var8, var9, 41943040);
            this.method1842((byte) -100, var8 + 1, var9, 134217728);
            this.method1842((byte) -100, var8, var9 + 1, 536870912);
        }
        if (arg4 == 2) {
            this.method1842((byte) -100, var8, var9, 167772160);
            this.method1842((byte) -100, var8, var9 + 1, 536870912);
            this.method1842((byte) -100, var8 - 1, var9, 8388608);
        }
        if (arg4 == 3) {
            this.method1842((byte) -100, var8, var9, 671088640);
            this.method1842((byte) -100, var8 - 1, var9, 8388608);
            this.method1842((byte) -100, var8, var9 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)V", line = 1567)
    public final void method1855(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4110;
        int var5 = arg1 - this.field4106;
        field4103++;
        this.field4115[var4][var5] = class394.method2529(this.field4115[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBI)V", line = 1588)
    public final void method1856(int arg0, byte arg1, int arg2) {
        field4109++;
        int var4 = arg0 - this.field4106;
        int var5 = arg2 - this.field4110;
        if (arg1 >= 60) {
            this.field4115[var5][var4] = class258.method1708(this.field4115[var5][var4], 2097152);
        }
    }
}
