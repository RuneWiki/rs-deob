import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class4 {

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "[I")
    public static int[] field66 = new int[50];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "[[I")
    public int[][] field53;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[[Z")
    public static boolean[][] field43;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
    public final void method19(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field62;
        if (arg2 <= 16) {
            method27(-62);
        }
        int var5 = arg1 - this.field55;
        field61++;
        this.field53[var4][var5] = class311.method1970(this.field53[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIZII)V")
    public final void method20(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field62;
        int var9 = arg2 - this.field55;
        field44++;
        if (arg5 != 1) {
            return;
        }
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method33((byte) -122, var9, 128, var8);
                this.method33((byte) -128, var9, 8, var8 - 1);
            }
            if (arg6 == 1) {
                this.method33((byte) -126, var9, 2, var8);
                this.method33((byte) 16, var9 + 1, 32, var8);
            }
            if (arg6 == 2) {
                this.method33((byte) 83, var9, 8, var8);
                this.method33((byte) -124, var9, 128, var8 + 1);
            }
            if (arg6 == 3) {
                this.method33((byte) 70, var9, 32, var8);
                this.method33((byte) -122, var9 - 1, 2, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method33((byte) -120, var9, 1, var8);
                this.method33((byte) 95, var9 + 1, 16, var8 - 1);
            }
            if (arg6 == 1) {
                this.method33((byte) -125, var9, 4, var8);
                this.method33((byte) 102, var9 + 1, 64, var8 + 1);
            }
            if (arg6 == 2) {
                this.method33((byte) -116, var9, 16, var8);
                this.method33((byte) 116, var9 - 1, 1, var8 + 1);
            }
            if (arg6 == 3) {
                this.method33((byte) 114, var9, 64, var8);
                this.method33((byte) -118, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg6 == 0) {
                this.method33((byte) -116, var9, 130, var8);
                this.method33((byte) 114, var9, 8, var8 - 1);
                this.method33((byte) -126, var9 + 1, 32, var8);
            }
            if (arg6 == 1) {
                this.method33((byte) -2, var9, 10, var8);
                this.method33((byte) 4, var9 + 1, 32, var8);
                this.method33((byte) -128, var9, 128, var8 + 1);
            }
            if (arg6 == 2) {
                this.method33((byte) -117, var9, 40, var8);
                this.method33((byte) 48, var9, 128, var8 + 1);
                this.method33((byte) 24, var9 - 1, 2, var8);
            }
            if (arg6 == 3) {
                this.method33((byte) -120, var9, 160, var8);
                this.method33((byte) 47, var9 - 1, 2, var8);
                this.method33((byte) -125, var9, 8, var8 - 1);
            }
        }
        if (arg1) {
            if (arg3 == 0) {
                if (arg6 == 0) {
                    this.method33((byte) -121, var9, 65536, var8);
                    this.method33((byte) 20, var9, 4096, var8 - 1);
                }
                if (arg6 == 1) {
                    this.method33((byte) 24, var9, 1024, var8);
                    this.method33((byte) -128, var9 + 1, 16384, var8);
                }
                if (arg6 == 2) {
                    this.method33((byte) -125, var9, 4096, var8);
                    this.method33((byte) -116, var9, 65536, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method33((byte) -121, var9, 16384, var8);
                    this.method33((byte) -125, var9 - 1, 1024, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg6 == 0) {
                    this.method33((byte) -123, var9, 512, var8);
                    this.method33((byte) 65, var9 + 1, 8192, var8 - 1);
                }
                if (arg6 == 1) {
                    this.method33((byte) -120, var9, 2048, var8);
                    this.method33((byte) -116, var9 + 1, 32768, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method33((byte) 89, var9, 8192, var8);
                    this.method33((byte) -127, var9 - 1, 512, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method33((byte) 39, var9, 32768, var8);
                    this.method33((byte) 58, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    this.method33((byte) 34, var9, 66560, var8);
                    this.method33((byte) -116, var9, 4096, var8 - 1);
                    this.method33((byte) 92, var9 + 1, 16384, var8);
                }
                if (arg6 == 1) {
                    this.method33((byte) -120, var9, 5120, var8);
                    this.method33((byte) -121, var9 + 1, 16384, var8);
                    this.method33((byte) 6, var9, 65536, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method33((byte) -123, var9, 20480, var8);
                    this.method33((byte) 65, var9, 65536, var8 + 1);
                    this.method33((byte) 106, var9 - 1, 1024, var8);
                }
                if (arg6 == 3) {
                    this.method33((byte) 0, var9, 81920, var8);
                    this.method33((byte) -124, var9 - 1, 1024, var8);
                    this.method33((byte) 127, var9, 4096, var8 - 1);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method33((byte) -122, var9, 536870912, var8);
                this.method33((byte) -128, var9, 33554432, var8 - 1);
            }
            if (arg6 == 1) {
                this.method33((byte) 9, var9, 8388608, var8);
                this.method33((byte) -128, var9 + 1, 134217728, var8);
            }
            if (arg6 == 2) {
                this.method33((byte) -117, var9, 33554432, var8);
                this.method33((byte) -116, var9, 536870912, var8 + 1);
            }
            if (arg6 == 3) {
                this.method33((byte) 87, var9, 134217728, var8);
                this.method33((byte) -123, var9 - 1, 8388608, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method33((byte) 34, var9, 4194304, var8);
                this.method33((byte) 65, var9 + 1, 67108864, var8 - 1);
            }
            if (arg6 == 1) {
                this.method33((byte) 61, var9, 16777216, var8);
                this.method33((byte) -119, var9 + 1, 268435456, var8 + 1);
            }
            if (arg6 == 2) {
                this.method33((byte) -117, var9, 67108864, var8);
                this.method33((byte) 60, var9 - 1, 4194304, var8 + 1);
            }
            if (arg6 == 3) {
                this.method33((byte) -125, var9, 268435456, var8);
                this.method33((byte) -117, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method33((byte) -120, var9, 545259520, var8);
            this.method33((byte) -118, var9, 33554432, var8 - 1);
            this.method33((byte) -116, var9 + 1, 134217728, var8);
        }
        if (arg6 == 1) {
            this.method33((byte) 83, var9, 41943040, var8);
            this.method33((byte) 45, var9 + 1, 134217728, var8);
            this.method33((byte) 117, var9, 536870912, var8 + 1);
        }
        if (arg6 == 2) {
            this.method33((byte) 94, var9, 167772160, var8);
            this.method33((byte) 118, var9, 536870912, var8 + 1);
            this.method33((byte) -122, var9 - 1, 8388608, var8);
        }
        if (arg6 == 3) {
            this.method33((byte) -124, var9, 671088640, var8);
            this.method33((byte) -128, var9 - 1, 8388608, var8);
            this.method33((byte) 31, var9, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V")
    public final void method21(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field62;
        field46++;
        int var5 = arg0 - this.field55;
        if (arg2 != -118) {
            field43 = null;
        }
        this.field53[var4][var5] = class318.method2028(this.field53[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
    public final void method22(int arg0, int arg1, int arg2) {
        field52++;
        int var4 = arg1 - this.field55;
        if (arg0 <= 3) {
            this.method33((byte) -6, -19, -126, -60);
        }
        int var5 = arg2 - this.field62;
        this.field53[var5][var4] = class311.method1970(this.field53[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIB)V")
    public static final void method23(int arg0, int arg1, byte arg2) {
        field42++;
        class399 var3 = class269.method1655(6, arg1, -28);
        var3.method2583((byte) 71);
        if (arg2 > 13) {
            var3.field5842 = arg0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public final void method24(byte arg0) {
        int var2 = 0;
        if (arg0 > -108) {
            this.field49 = -106;
        }
        while (var2 < this.field63) {
            for (int var3 = 0; var3 < this.field49; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field63 - 5) || (this.field49 - 5) <= var3) {
                    this.field53[var2][var3] = -1;
                } else {
                    this.field53[var2][var3] = 2097152;
                }
            }
            var2++;
        }
        field59++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field45++;
        if (arg6 > 1) {
            return class414.method2652(arg4, -52, arg0, arg8, arg6, arg1, arg7, arg2, arg6) ? true : this.method26(arg0, arg7, arg6, arg1, arg2, arg6, arg5, arg4, arg8, true);
        }
        if (arg3 <= 78) {
            this.method37(-9, -93, -85, -104, -30, true, 91, 23);
        }
        int var10 = arg4 + arg7 - 1;
        int var11 = arg8 + arg1 - 1;
        if (arg7 <= arg0 && arg0 <= var10 && arg8 <= arg2 && var11 >= arg2) {
            return true;
        } else if ((arg7 - 1) == arg0 && arg8 <= arg2 && var11 >= arg2 && (this.field53[arg0 - this.field62][arg2 - this.field55] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg2 >= arg8 && arg2 <= var11 && (this.field53[arg0 - this.field62][arg2 - this.field55] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if ((arg8 - 1) == arg2 && arg0 >= arg7 && var10 >= arg0 && (this.field53[arg0 - this.field62][arg2 - this.field55] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg2 && arg7 <= arg0 && arg0 <= var10 && (this.field53[arg0 - this.field62][arg2 - this.field55] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIIZ)Z")
    public final boolean method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (!arg9) {
            return true;
        }
        field47++;
        int var11 = arg0 + arg2;
        int var12 = arg4 + arg5;
        int var13 = arg1 + arg7;
        int var14 = arg8 + arg3;
        if (arg0 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg8 < arg4 ? arg4 : arg8;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field53[var13 - this.field62 - 1][var15 - this.field55] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg4 <= arg8 ? arg8 : arg4;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field53[arg1 - this.field62][var17 - this.field55] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg4 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg1 < arg0 ? arg0 : arg1;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field53[var19 - this.field62][var14 - this.field55 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg8 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg0 > arg1 ? arg0 : arg1;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field53[var21 - this.field62][arg8 - this.field55] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static final void method27(int arg0) {
        field58++;
        if (arg0 != -1) {
            method23(15, -8, (byte) -44);
        }
        class190 var1 = class411.field5963;
        synchronized (class411.field5963) {
            class411.field5963.method1243(1000);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(JI)V")
    public static final void method28(long arg0, int arg1) {
        field56++;
        int var3 = -13 / ((arg1 + 26) / 63);
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class430.method2707((byte) -110, arg0 - 1L);
            class430.method2707((byte) -81, 1L);
        } else {
            class430.method2707((byte) -69, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(III)V")
    public final void method29(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field55;
        field50++;
        if (arg2 < 37) {
            this.method34(76, -53, 38, -124, 60, 54, 31, 118);
        }
        int var5 = arg1 - this.field62;
        this.field53[var5][var4] = class318.method2028(this.field53[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
    private final void method30(int arg0, int arg1, int arg2, int arg3) {
        field65++;
        this.field53[arg2][arg3] = class311.method1970(this.field53[arg2][arg3], arg1);
        if (arg0 >= -104) {
            method32((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZIIZII)V")
    public final void method31(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field48++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        int var10 = arg0 - this.field62;
        if (arg2) {
            var9 |= 0x40000000;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg1;
            arg1 = arg4;
            arg4 = var11;
        }
        int var12 = arg7 - this.field55;
        if (arg3 != -4) {
            field43 = null;
        }
        for (int var13 = var10; var13 < (arg1 + var10); var13++) {
            if (var13 >= 0 && var13 < this.field63) {
                for (int var14 = var12; var14 < arg4 + var12; var14++) {
                    if (var14 >= 0 && this.field49 > var14) {
                        this.method33((byte) -122, var14, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method32(byte arg0) {
        field66 = null;
        field43 = null;
        if (arg0 >= -125) {
            method27(-23);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIII)V")
    private final void method33(byte arg0, int arg1, int arg2, int arg3) {
        field51++;
        this.field53[arg3][arg1] = class318.method2028(this.field53[arg3][arg1], ~arg2);
        int var5 = 27 / ((-arg0 - 65) / 51);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field57++;
        if (arg0 == 1) {
            if (arg3 == arg7 && arg1 == arg4) {
                return true;
            }
        } else if (arg7 <= arg3 && arg3 <= arg0 + arg7 - 1 && arg4 <= arg4 && arg4 <= arg0 + arg4 - 1) {
            return true;
        }
        if (arg6 <= 38) {
            this.method21(43, 95, (byte) -40);
        }
        int var9 = arg4 - this.field55;
        int var10 = arg7 - this.field62;
        int var11 = arg1 - this.field55;
        int var12 = arg3 - this.field62;
        if (arg0 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var12 + 1 == var10 && var9 == var11 && (this.field53[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field53[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field53[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field53[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field53[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field53[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 + 1 == var10 && var9 == var11 && (this.field53[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field53[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field53[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field53[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var10 && var9 == var11 && (this.field53[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field53[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg0 - 1;
            int var14 = var11 + arg0 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14 && (this.field53[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 - arg0) == var11 && (this.field53[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - arg0) == var10 && var9 >= var11 && var14 >= var9 && (this.field53[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var9 - arg0 == var11 && (this.field53[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - arg0) == var10 && var9 >= var11 && var14 >= var9 && (this.field53[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field53[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9 && (this.field53[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field53[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 <= var12 && var12 <= var13 && var9 + 1 == var11 && (this.field53[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var10 && var12 <= var13 && (var9 - arg0) == var11 && (this.field53[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg0 == var10 && var9 >= var11 && var14 >= var9 && (this.field53[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 >= var11 && var14 >= var9 && (this.field53[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILti;Lti;)V")
    public static final void method35(int arg0, int arg1, int arg2, class254 arg3, class254 arg4) {
        if (class5.field79[arg0][arg1][arg2] == null) {
            class61.method403(arg0, arg1, arg2);
        }
        class5.field79[arg0][arg1][arg2].field2031 = arg3;
        class5.field79[arg0][arg1][arg2].field2044 = arg4;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BZZIIII)V")
    public final void method36(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field60++;
        int var8 = 256;
        if (arg0 != 41) {
            return;
        }
        if (arg1) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field62;
        if (arg2) {
            var8 |= 0x40000000;
        }
        int var10 = arg6 - this.field55;
        for (int var11 = var9; var11 < arg5 + var9; var11++) {
            if (var11 >= 0 && this.field63 > var11) {
                for (int var12 = var10; var12 < (arg3 + var10); var12++) {
                    if (var12 >= 0 && this.field49 > var12) {
                        this.method30(-113, var8, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIZII)Z")
    public final boolean method37(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            this.field53 = null;
        }
        field54++;
        if (arg6 == 1) {
            if (arg3 == arg7 && arg0 == arg2) {
                return true;
            }
        } else if (arg7 >= arg3 && (arg3 + arg6 - 1) >= arg7 && arg2 >= arg2 && arg2 <= arg6 + arg2 - 1) {
            return true;
        }
        int var9 = arg0 - this.field55;
        int var10 = arg3 - this.field62;
        int var11 = arg2 - this.field55;
        int var12 = arg7 - this.field62;
        if (arg6 == 1) {
            if (arg1 == 0) {
                if (arg4 == 0) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field53[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field53[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field53[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field53[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field53[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field53[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field53[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field53[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field53[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field53[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field53[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field53[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field53[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field53[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field53[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field53[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 == var12 && var11 + 1 == var9 && (this.field53[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var9 && (this.field53[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field53[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var9 == var11 && (this.field53[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg6 - 1;
            int var14 = arg6 + var9 - 1;
            if (arg1 == 0) {
                if (arg4 == 0) {
                    if (var12 - arg6 == var10 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var11 + 1) == var9 && (this.field53[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var11 - arg6) == var9 && (this.field53[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 >= var10 && var13 >= var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var12 - arg6) == var10 && var11 >= var9 && var11 <= var14 && (this.field53[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 >= var9 && var11 <= var14 && (this.field53[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var12 + 1) == var10 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && (var11 + 1) == var9 && (this.field53[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var11 - arg6 == var9 && (this.field53[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 >= var10 && var12 <= var13 && (var11 - arg6) == var9) {
                        return true;
                    }
                    if ((var12 - arg6) == var10 && var9 <= var11 && var11 <= var14 && (this.field53[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 <= var11 && var11 <= var14 && (this.field53[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    if ((var12 - arg6) == var10 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 <= var11 && var11 <= var14 && (this.field53[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var11 - arg6) == var9 && (this.field53[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 - arg6 == var10 && var11 >= var9 && var11 <= var14 && (this.field53[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var11 - arg6) == var9 && (this.field53[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - arg6 == var10 && var11 >= var9 && var14 >= var11 && (this.field53[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var11 + 1 == var9 && (this.field53[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var11 - arg6 == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 - arg6 == var10 && var9 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && (var11 + 1) == var9 && (this.field53[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 <= var11 && var11 <= var14 && (this.field53[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var11 - arg6 == var9) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 <= var12 && var12 <= var13 && var11 + 1 == var9 && (this.field53[var12][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var12 && var12 <= var13 && var11 - arg6 == var9 && (this.field53[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg6 == var10 && var9 <= var11 && var11 <= var14 && (this.field53[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var9 <= var11 && var11 <= var14 && (this.field53[var10][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZIIIZ)V")
    public final void method38(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg5 - this.field62;
        field64++;
        int var9 = arg1 - this.field55;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method30(-105, 128, var8, var9);
                this.method30(-128, 8, var8 - 1, var9);
            }
            if (arg4 == 1) {
                this.method30(-118, 2, var8, var9);
                this.method30(-118, 32, var8, var9 + 1);
            }
            if (arg4 == 2) {
                this.method30(-119, 8, var8, var9);
                this.method30(-113, 128, var8 + 1, var9);
            }
            if (arg4 == 3) {
                this.method30(-111, 32, var8, var9);
                this.method30(-128, 2, var8, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method30(-116, 1, var8, var9);
                this.method30(-110, 16, var8 - 1, var9 + 1);
            }
            if (arg4 == 1) {
                this.method30(-126, 4, var8, var9);
                this.method30(-122, 64, var8 + 1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method30(-120, 16, var8, var9);
                this.method30(-123, 1, var8 + 1, var9 + -1);
            }
            if (arg4 == 3) {
                this.method30(-115, 64, var8, var9);
                this.method30(-106, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg3 > -124) {
            this.field62 = 73;
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method30(-123, 130, var8, var9);
                this.method30(-113, 8, var8 - 1, var9);
                this.method30(-105, 32, var8, var9 + 1);
            }
            if (arg4 == 1) {
                this.method30(-116, 10, var8, var9);
                this.method30(-125, 32, var8, var9 + 1);
                this.method30(-119, 128, var8 + 1, var9);
            }
            if (arg4 == 2) {
                this.method30(-114, 40, var8, var9);
                this.method30(-126, 128, var8 + 1, var9);
                this.method30(-108, 2, var8, var9 - 1);
            }
            if (arg4 == 3) {
                this.method30(-107, 160, var8, var9);
                this.method30(-108, 2, var8, var9 - 1);
                this.method30(-116, 8, var8 - 1, var9);
            }
        }
        if (arg6) {
            if (arg0 == 0) {
                if (arg4 == 0) {
                    this.method30(-117, 65536, var8, var9);
                    this.method30(-106, 4096, var8 - 1, var9);
                }
                if (arg4 == 1) {
                    this.method30(-107, 1024, var8, var9);
                    this.method30(-118, 16384, var8, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method30(-117, 4096, var8, var9);
                    this.method30(-116, 65536, var8 + 1, var9);
                }
                if (arg4 == 3) {
                    this.method30(-112, 16384, var8, var9);
                    this.method30(-110, 1024, var8, var9 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg4 == 0) {
                    this.method30(-112, 512, var8, var9);
                    this.method30(-116, 8192, var8 - 1, var9 - -1);
                }
                if (arg4 == 1) {
                    this.method30(-128, 2048, var8, var9);
                    this.method30(-126, 32768, var8 + 1, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method30(-122, 8192, var8, var9);
                    this.method30(-127, 512, var8 + 1, var9 - 1);
                }
                if (arg4 == 3) {
                    this.method30(-113, 32768, var8, var9);
                    this.method30(-107, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg0 == 2) {
                if (arg4 == 0) {
                    this.method30(-109, 66560, var8, var9);
                    this.method30(-123, 4096, var8 - 1, var9);
                    this.method30(-105, 16384, var8, var9 + 1);
                }
                if (arg4 == 1) {
                    this.method30(-107, 5120, var8, var9);
                    this.method30(-107, 16384, var8, var9 + 1);
                    this.method30(-122, 65536, var8 + 1, var9);
                }
                if (arg4 == 2) {
                    this.method30(-111, 20480, var8, var9);
                    this.method30(-125, 65536, var8 + 1, var9);
                    this.method30(-117, 1024, var8, var9 - 1);
                }
                if (arg4 == 3) {
                    this.method30(-120, 81920, var8, var9);
                    this.method30(-111, 1024, var8, var9 - 1);
                    this.method30(-122, 4096, var8 - 1, var9);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method30(-115, 536870912, var8, var9);
                this.method30(-114, 33554432, var8 - 1, var9);
            }
            if (arg4 == 1) {
                this.method30(-120, 8388608, var8, var9);
                this.method30(-110, 134217728, var8, var9 + 1);
            }
            if (arg4 == 2) {
                this.method30(-125, 33554432, var8, var9);
                this.method30(-112, 536870912, var8 + 1, var9);
            }
            if (arg4 == 3) {
                this.method30(-121, 134217728, var8, var9);
                this.method30(-116, 8388608, var8, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method30(-106, 4194304, var8, var9);
                this.method30(-124, 67108864, var8 - 1, var9 - -1);
            }
            if (arg4 == 1) {
                this.method30(-108, 16777216, var8, var9);
                this.method30(-122, 268435456, var8 + 1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method30(-128, 67108864, var8, var9);
                this.method30(-108, 4194304, var8 + 1, var9 - 1);
            }
            if (arg4 == 3) {
                this.method30(-114, 268435456, var8, var9);
                this.method30(-128, 16777216, var8 - 1, var9 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method30(-116, 545259520, var8, var9);
            this.method30(-109, 33554432, var8 - 1, var9);
            this.method30(-120, 134217728, var8, var9 + 1);
        }
        if (arg4 == 1) {
            this.method30(-120, 41943040, var8, var9);
            this.method30(-123, 134217728, var8, var9 + 1);
            this.method30(-121, 536870912, var8 + 1, var9);
        }
        if (arg4 == 2) {
            this.method30(-112, 167772160, var8, var9);
            this.method30(-113, 536870912, var8 + 1, var9);
            this.method30(-128, 8388608, var8, var9 - 1);
        }
        if (arg4 == 3) {
            this.method30(-124, 671088640, var8, var9);
            this.method30(-124, 8388608, var8, var9 - 1);
            this.method30(-109, 33554432, var8 - 1, var9);
            return;
        }
    }
}
