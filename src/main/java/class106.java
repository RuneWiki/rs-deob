import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class106 {

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    private int field1881;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    private int field1867;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "[[I")
    public int[][] field1868;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    private int field1878;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    private int field1882;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Llc;")
    public static class143 field1872 = class66.method374("Musik)2Engine vorbereitet)3", -1);

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Z")
    public static boolean field1875 = false;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1885++;
        if (arg2 >= arg4 + arg8 || arg8 >= arg2 + arg7) {
            return false;
        } else if (arg0 + arg3 > arg1 && (arg1 + arg6) > arg3) {
            return arg5 == 8391;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1873++;
        if (arg7 == 1) {
            if (arg2 == arg6 && arg0 == arg3) {
                return true;
            }
        } else if (arg2 >= arg6 && arg2 <= arg6 + arg7 - 1 && arg0 <= arg0 && arg0 <= (arg0 + arg7 - 1)) {
            return true;
        }
        if (arg1 != -1) {
            this.field1867 = -50;
        }
        int var9 = arg0 - this.field1878;
        int var10 = arg6 - this.field1882;
        int var11 = arg2 - this.field1882;
        int var12 = arg3 - this.field1878;
        if (arg7 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field1868[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field1868[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field1868[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field1868[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field1868[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field1868[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field1868[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field1868[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field1868[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field1868[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field1868[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field1868[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg7 - 1;
            int var14 = arg7 + var12 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var11 + 1) == var10 && var9 >= var12 && var14 >= var9 && (this.field1868[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var9 - arg7 == var12 && (this.field1868[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - arg7 == var10 && var9 >= var12 && var14 >= var9 && (this.field1868[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 - arg7) == var12 && (this.field1868[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - arg7) == var10 && var9 >= var12 && var14 >= var9 && (this.field1868[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 + 1) == var12 && (this.field1868[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 + 1 == var10 && var12 <= var9 && var9 <= var14 && (this.field1868[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var9 + 1) == var12 && (this.field1868[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 >= var10 && var11 <= var13 && var9 + 1 == var12 && (this.field1868[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var10 && var11 <= var13 && (var9 - arg7) == var12 && (this.field1868[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg7 == var10 && var9 >= var12 && var14 >= var9 && (this.field1868[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var12 <= var9 && var9 <= var14 && (this.field1868[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V")
    public final void method632(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1882;
        field1880++;
        int var5 = arg1 - this.field1878;
        if (arg0) {
            this.field1868[var4][var5] = class119.method729(this.field1868[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZIII)V")
    public final void method633(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1876++;
        int var7 = arg0 - this.field1882;
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1878;
        for (int var10 = var7; var10 < (arg1 + var7); var10++) {
            if (var10 >= 0 && this.field1867 > var10) {
                for (int var11 = var9; var11 < (arg3 + var9); var11++) {
                    if (var11 >= 0 && this.field1881 > var11) {
                        this.method645(var8, var10, 2, var11);
                    }
                }
            }
        }
        if (arg5 != -9666) {
            this.field1878 = 19;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILlc;Llc;I)V")
    public static final void method634(int arg0, class143 arg1, class143 arg2, int arg3) {
        field1870++;
        class21.field341 = arg2;
        class273.field4866 = arg3;
        class21.field331 = arg1;
        if (class21.field341.method876((byte) -122, class21.field342) || class21.field331.method876((byte) -122, class21.field342)) {
            class105.field1857 = 3;
        } else if (class23.field380 == -1) {
            class184.field3344 = 0;
            class289.field5068 = 0;
            class105.field1857 = -3;
            class107.field1893 = 1;
            class190 var4 = new class190(128);
            var4.method1276(844519173, 10);
            var4.method1278((int) (Math.random() * 99999.0D), (byte) 69);
            var4.method1278(522, (byte) 110);
            var4.method1243(class21.field341.method874(7), 86);
            var4.method1280(-124, (int) (Math.random() * 9.9999999E7D));
            var4.method1255(class21.field331, (byte) 0);
            var4.method1280(-120, (int) (Math.random() * 9.9999999E7D));
            var4.method1242(class51.field1012, 0, class42.field703);
            class285.field5010.field3487 = 0;
            if (arg0 >= -34) {
                field1864 = 42;
            }
            class285.field5010.method1276(844519173, 107);
            class285.field5010.method1276(844519173, var4.field3487);
            class285.field5010.method1264(var4.field3465, 0, var4.field3487, 51314336);
        } else {
            class146.method944(false);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static void method635(boolean arg0) {
        if (!arg0) {
            field1872 = null;
        }
        field1872 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBZIIII)V")
    public final void method636(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 17) {
            return;
        }
        int var8 = arg6 - this.field1882;
        if (arg0 == 1 || arg0 == 3) {
            int var9 = arg4;
            arg4 = arg5;
            arg5 = var9;
        }
        int var10 = 256;
        if (arg2) {
            var10 += 131072;
        }
        int var11 = arg3 - this.field1878;
        field1884++;
        for (int var12 = var8; var12 < var8 + arg4; var12++) {
            if (var12 >= 0 && this.field1867 > var12) {
                for (int var13 = var11; var13 < arg5 + var11; var13++) {
                    if (var13 >= 0 && this.field1881 > var13) {
                        this.method647(0, var13, var10, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZBIIII)V")
    public final void method637(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1887++;
        int var7 = arg3 - this.field1878;
        int var8 = arg2 - this.field1882;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method647(0, var7, 128, var8);
                this.method647(0, var7, 8, var8 - 1);
            }
            if (arg5 == 1) {
                this.method647(0, var7, 2, var8);
                this.method647(0, var7 + 1, 32, var8);
            }
            if (arg5 == 2) {
                this.method647(0, var7, 8, var8);
                this.method647(0, var7, 128, var8 + 1);
            }
            if (arg5 == 3) {
                this.method647(0, var7, 32, var8);
                this.method647(arg1 ^ 0x61, var7 - 1, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method647(0, var7, 1, var8);
                this.method647(0, var7 + 1, 16, var8 - 1);
            }
            if (arg5 == 1) {
                this.method647(0, var7, 4, var8);
                this.method647(0, var7 + 1, 64, var8 + 1);
            }
            if (arg5 == 2) {
                this.method647(arg1 ^ 0x61, var7, 16, var8);
                this.method647(arg1 ^ 0x61, var7 - 1, 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method647(0, var7, 64, var8);
                this.method647(0, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method647(0, var7, 130, var8);
                this.method647(0, var7, 8, var8 - 1);
                this.method647(0, var7 + 1, 32, var8);
            }
            if (arg5 == 1) {
                this.method647(arg1 - 97, var7, 10, var8);
                this.method647(0, var7 + 1, 32, var8);
                this.method647(0, var7, 128, var8 + 1);
            }
            if (arg5 == 2) {
                this.method647(0, var7, 40, var8);
                this.method647(0, var7, 128, var8 + 1);
                this.method647(0, var7 - 1, 2, var8);
            }
            if (arg5 == 3) {
                this.method647(0, var7, 160, var8);
                this.method647(0, var7 - 1, 2, var8);
                this.method647(0, var7, 8, var8 - 1);
            }
        }
        if (arg0) {
            if (arg4 == 0) {
                if (arg5 == 0) {
                    this.method647(arg1 - 97, var7, 65536, var8);
                    this.method647(arg1 ^ 0x61, var7, 4096, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method647(0, var7, 1024, var8);
                    this.method647(arg1 - 97, var7 + 1, 16384, var8);
                }
                if (arg5 == 2) {
                    this.method647(0, var7, 4096, var8);
                    this.method647(0, var7, 65536, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method647(0, var7, 16384, var8);
                    this.method647(0, var7 - 1, 1024, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg5 == 0) {
                    this.method647(arg1 ^ 0x61, var7, 512, var8);
                    this.method647(0, var7 + 1, 8192, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method647(0, var7, 2048, var8);
                    this.method647(0, var7 + 1, 32768, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method647(0, var7, 8192, var8);
                    this.method647(arg1 - 97, var7 + -1, 512, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method647(0, var7, 32768, var8);
                    this.method647(0, var7 - 1, 2048, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    this.method647(0, var7, 66560, var8);
                    this.method647(0, var7, 4096, var8 - 1);
                    this.method647(0, var7 + 1, 16384, var8);
                }
                if (arg5 == 1) {
                    this.method647(0, var7, 5120, var8);
                    this.method647(0, var7 + 1, 16384, var8);
                    this.method647(0, var7, 65536, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method647(0, var7, 20480, var8);
                    this.method647(0, var7, 65536, var8 + 1);
                    this.method647(arg1 ^ 0x61, var7 - 1, 1024, var8);
                }
                if (arg5 == 3) {
                    this.method647(arg1 ^ 0x61, var7, 81920, var8);
                    this.method647(0, var7 - 1, 1024, var8);
                    this.method647(0, var7, 4096, var8 - 1);
                }
            }
        }
        if (arg1 != 97) {
            this.method642(-35, -46, -103);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIIIIIIII)Z")
    public final boolean method638(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1886++;
        if (arg0 < 46) {
            this.method645(39, -93, 106, 104);
        }
        if (arg6 > 1) {
            return this.method630(arg4, arg5, arg1, arg8, arg3, 8391, arg6, arg6, arg7) ? true : this.method639(arg7, arg5, arg1, arg2, arg6, arg3, arg6, arg4, arg8, (byte) -119);
        }
        int var10 = arg4 + arg8 - 1;
        int var11 = arg3 + arg7 - 1;
        if (arg1 >= arg7 && var11 >= arg1 && arg5 >= arg8 && arg5 <= var10) {
            return true;
        } else if (arg7 - 1 == arg1 && arg5 >= arg8 && var10 >= arg5 && (this.field1868[arg1 - this.field1882][arg5 - this.field1878] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var11 + 1 == arg1 && arg8 <= arg5 && arg5 <= var10 && (this.field1868[arg1 - this.field1882][arg5 - this.field1878] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg5 && arg7 <= arg1 && arg1 <= var11 && (this.field1868[arg1 - this.field1882][arg5 - this.field1878] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return (var10 + 1) == arg5 && arg1 >= arg7 && arg1 <= var11 && (this.field1868[arg1 - this.field1882][arg5 - this.field1878] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIIIB)Z")
    private final boolean method639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field1877++;
        int var11 = arg2 + arg4;
        int var12 = arg1 + arg6;
        int var13 = arg0 + arg5;
        int var14 = arg7 + arg8;
        if (arg0 <= arg2 && var13 > arg2) {
            if (arg8 == var12 && (arg3 & 0x4) == 0) {
                int var15 = arg2;
                int var16 = var11 > var13 ? var13 : var11;
                while (var15 < var16) {
                    if ((this.field1868[var15 - this.field1882][var12 - this.field1878 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg1 == var14 && (arg3 & 0x1) == 0) {
                int var17 = arg2;
                int var18 = var11 <= var13 ? var11 : var13;
                while (var18 > var17) {
                    if ((this.field1868[var17 - this.field1882][arg1 - this.field1878] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg0 < var11 && var13 >= var11) {
            if (arg8 == var12 && (arg3 & 0x4) == 0) {
                for (int var19 = arg0; var19 < var11; var19++) {
                    if ((this.field1868[var19 - this.field1882][var12 - this.field1878 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var14 && (arg3 & 0x1) == 0) {
                for (int var20 = arg0; var20 < var11; var20++) {
                    if ((this.field1868[var20 - this.field1882][arg1 - this.field1878] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg1 >= arg8 && arg1 < var14) {
            if (arg0 == var11 && (arg3 & 0x8) == 0) {
                int var21 = arg1;
                int var22 = var14 < var12 ? var14 : var12;
                while (var22 > var21) {
                    if ((this.field1868[var11 - (this.field1882 + 1)][var21 - this.field1878] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg2 == var13 && (arg3 & 0x2) == 0) {
                int var23 = arg1;
                int var24 = var14 >= var12 ? var12 : var14;
                while (var23 < var24) {
                    if ((this.field1868[arg2 - this.field1882][var23 - this.field1878] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var12 > arg8 && var14 >= var12) {
            if (arg0 == var11 && (arg3 & 0x8) == 0) {
                for (int var25 = arg8; var25 < var12; var25++) {
                    if ((this.field1868[var11 - this.field1882 - 1][var25 - this.field1878] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var13 && (arg3 & 0x2) == 0) {
                for (int var26 = arg8; var26 < var12; var26++) {
                    if ((this.field1868[arg2 - this.field1882][var26 - this.field1878] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return arg9 > -99;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public final void method640(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1882;
        int var5 = arg2 - this.field1878;
        this.field1868[var4][var5] = class119.method729(this.field1868[var4][var5], arg1);
        field1883++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZIIZ)V")
    public final void method641(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        if (!arg2) {
            return;
        }
        field1874++;
        int var7 = arg4 - this.field1878;
        int var8 = arg3 - this.field1882;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method645(128, var8, 2, var7);
                this.method645(8, var8 - 1, 2, var7);
            }
            if (arg0 == 1) {
                this.method645(2, var8, 2, var7);
                this.method645(32, var8, 2, var7 + 1);
            }
            if (arg0 == 2) {
                this.method645(8, var8, 2, var7);
                this.method645(128, var8 + 1, 2, var7);
            }
            if (arg0 == 3) {
                this.method645(32, var8, 2, var7);
                this.method645(2, var8, 2, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method645(1, var8, 2, var7);
                this.method645(16, var8 - 1, 2, var7 + 1);
            }
            if (arg0 == 1) {
                this.method645(4, var8, 2, var7);
                this.method645(64, var8 + 1, 2, var7 + 1);
            }
            if (arg0 == 2) {
                this.method645(16, var8, 2, var7);
                this.method645(1, var8 + 1, 2, var7 - 1);
            }
            if (arg0 == 3) {
                this.method645(64, var8, 2, var7);
                this.method645(4, var8 - 1, 2, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method645(130, var8, 2, var7);
                this.method645(8, var8 - 1, 2, var7);
                this.method645(32, var8, 2, var7 + 1);
            }
            if (arg0 == 1) {
                this.method645(10, var8, 2, var7);
                this.method645(32, var8, 2, var7 + 1);
                this.method645(128, var8 + 1, 2, var7);
            }
            if (arg0 == 2) {
                this.method645(40, var8, 2, var7);
                this.method645(128, var8 + 1, 2, var7);
                this.method645(2, var8, 2, var7 - 1);
            }
            if (arg0 == 3) {
                this.method645(160, var8, 2, var7);
                this.method645(2, var8, 2, var7 - 1);
                this.method645(8, var8 - 1, 2, var7);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method645(65536, var8, 2, var7);
                this.method645(4096, var8 - 1, 2, var7);
            }
            if (arg0 == 1) {
                this.method645(1024, var8, 2, var7);
                this.method645(16384, var8, 2, var7 + 1);
            }
            if (arg0 == 2) {
                this.method645(4096, var8, 2, var7);
                this.method645(65536, var8 + 1, 2, var7);
            }
            if (arg0 == 3) {
                this.method645(16384, var8, 2, var7);
                this.method645(1024, var8, 2, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method645(512, var8, 2, var7);
                this.method645(8192, var8 - 1, 2, var7 + 1);
            }
            if (arg0 == 1) {
                this.method645(2048, var8, 2, var7);
                this.method645(32768, var8 + 1, 2, var7 + 1);
            }
            if (arg0 == 2) {
                this.method645(8192, var8, 2, var7);
                this.method645(512, var8 + 1, 2, var7 - 1);
            }
            if (arg0 == 3) {
                this.method645(32768, var8, 2, var7);
                this.method645(2048, var8 - 1, 2, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method645(66560, var8, 2, var7);
            this.method645(4096, var8 - 1, 2, var7);
            this.method645(16384, var8, 2, var7 + 1);
        }
        if (arg0 == 1) {
            this.method645(5120, var8, 2, var7);
            this.method645(16384, var8, 2, var7 + 1);
            this.method645(65536, var8 + 1, 2, var7);
        }
        if (arg0 == 2) {
            this.method645(20480, var8, 2, var7);
            this.method645(65536, var8 + 1, 2, var7);
            this.method645(1024, var8, 2, var7 - 1);
        }
        if (arg0 == 3) {
            this.method645(81920, var8, 2, var7);
            this.method645(1024, var8, 2, var7 - 1);
            this.method645(4096, var8 - 1, 2, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)V")
    public final void method642(int arg0, int arg1, int arg2) {
        field1869++;
        int var4 = arg1 - this.field1882;
        int var5 = arg0 - this.field1878;
        this.field1868[var4][var5] = class129.method777(this.field1868[var4][var5], -262145);
        if (arg2 != 3900) {
            this.method638((byte) 125, -104, 113, -74, -58, -68, 41, 47, 20);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIB)Lme;")
    public static final class163 method643(int arg0, int arg1, int arg2, byte arg3) {
        field1866++;
        class163 var4 = new class163();
        if (arg3 != -108) {
            field1875 = false;
        }
        var4.field2921 = arg1;
        var4.field2929 = arg2;
        class212.field3942.method1825(var4, (byte) 64, (long) arg0);
        class277.method1831((byte) 72, arg2);
        class43 var5 = class27.method186(1341, arg0);
        if (var5 != null) {
            class141.method844((byte) -126, var5);
        }
        if (class281.field4937 != null) {
            class141.method844((byte) -9, class281.field4937);
            class281.field4937 = null;
        }
        int var6 = class257.field4625;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class56.method335(true, class122.field2147[var7])) {
                class95.method561(-37, var7);
            }
        }
        if (class257.field4625 == 1) {
            class139.field2415 = false;
            class235.method1588(121, class24.field417, class52.field1023, class128.field2271, class176.field3167);
        } else {
            class235.method1588(74, class24.field417, class52.field1023, class128.field2271, class176.field3167);
            int var8 = class239.field4326.method1308(class130.field2307);
            for (int var9 = 0; var9 < class257.field4625; var9++) {
                int var10 = class239.field4326.method1308(class263.method1752(arg3 ^ 0xFFFFE4F9, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class176.field3167 = class257.field4625 * 15 + 22;
            class52.field1023 = var8 + 8;
        }
        if (var5 != null) {
            class18.method135(var5, 0, false);
        }
        class195.method1343(arg2, (byte) 13);
        if (class7.field138 != -1) {
            class114.method692(1, class7.field138, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public final void method644(byte arg0) {
        int var2 = 0;
        if (arg0 != -69) {
            this.method644((byte) 15);
        }
        while (var2 < this.field1867) {
            for (int var3 = 0; var3 < this.field1881; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1867 - 5 || this.field1881 - 5 <= var3) {
                    this.field1868[var2][var3] = 16777215;
                } else {
                    this.field1868[var2][var3] = 16777216;
                }
            }
            var2++;
        }
        field1865++;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(II)V")
    public class106(int arg0, int arg1) {
        this.field1881 = arg1;
        this.field1867 = arg0;
        this.field1868 = new int[this.field1867][this.field1881];
        this.field1878 = 0;
        this.field1882 = 0;
        this.method644((byte) -69);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V")
    private final void method645(int arg0, int arg1, int arg2, int arg3) {
        field1863++;
        if (arg2 != 2) {
            this.field1881 = -127;
        }
        this.field1868[arg1][arg3] = class119.method729(this.field1868[arg1][arg3], arg0);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1871++;
        if (arg5 == 1) {
            if (arg1 == arg6 && arg0 == arg7) {
                return true;
            }
        } else if (arg6 <= arg1 && (arg5 + arg6 - 1) >= arg1 && arg0 <= arg0 && arg0 <= (arg5 + arg0 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field1882;
        int var10 = arg6 - this.field1882;
        int var11 = arg7 - this.field1878;
        int var12 = arg0 - this.field1878;
        if (arg3 != 0) {
            this.method641(-49, -10, true, 123, -63, false);
        }
        if (arg5 == 1) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field1868[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1868[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1868[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1868[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                    if (var9 - 1 == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1868[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field1868[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1868[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1868[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field1868[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field1868[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field1868[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var10 - 1;
            int var14 = arg5 + var11 - 1;
            if (arg2 == 0) {
                if (arg4 == 0) {
                    if ((var9 - arg5) == var10 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11 && (this.field1868[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 - arg5) == var11 && (this.field1868[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 - arg5 == var10 && var11 <= var12 && var12 <= var14 && (this.field1868[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field1868[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var9 + 1) == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11 && (this.field1868[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 - arg5 == var11 && (this.field1868[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 >= var10 && var13 >= var9 && (var12 - arg5) == var11) {
                        return true;
                    }
                    if (var9 - arg5 == var10 && var11 <= var12 && var14 >= var12 && (this.field1868[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field1868[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    if (var9 - arg5 == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field1868[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var12 - arg5 == var11 && (this.field1868[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - arg5 == var10 && var12 >= var11 && var14 >= var12 && (this.field1868[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var12 - arg5) == var11 && (this.field1868[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var9 - arg5) == var10 && var11 <= var12 && var14 >= var12 && (this.field1868[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 + 1 == var11 && (this.field1868[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 - arg5) == var11) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 - arg5 == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11 && (this.field1868[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var12 <= var14 && (this.field1868[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 - arg5) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11 && (this.field1868[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 <= var9 && var9 <= var13 && (var12 - arg5) == var11 && (this.field1868[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var9 - arg5) == var10 && var12 >= var11 && var12 <= var14 && (this.field1868[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field1868[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIII)V")
    private final void method647(int arg0, int arg1, int arg2, int arg3) {
        this.field1868[arg3][arg1] = class129.method777(this.field1868[arg3][arg1], ~arg2);
        if (arg0 != 0) {
            this.field1868 = null;
        }
        field1879++;
    }
}
