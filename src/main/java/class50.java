import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class50 {

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    private int field804 = 0;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    private int field781;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "[[I")
    public int[][] field793;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field777 = -1;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Lma;")
    public static class5 field796 = class12.method119("Schlie-8en", (byte) 69);

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lpg;")
    public static class295 field787;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Loi;")
    public static class32 field795;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field805++;
        int var7 = 0;
        class39.method280(arg5, false);
        int var8 = arg5 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class294.field4956 <= arg0 && class101.field1505 >= arg0) {
            int[] var15 = class137.field2032[arg0];
            int var16 = class76.method533(class57.field899, arg4 - arg5, true, class301.field5073);
            int var17 = class76.method533(class57.field899, arg4 + arg5, true, class301.field5073);
            int var18 = class76.method533(class57.field899, arg4 - var8, true, class301.field5073);
            int var19 = class76.method533(class57.field899, arg4 + var8, true, class301.field5073);
            class239.method1690(var16, 23267, var18, var15, arg2);
            class239.method1690(var18, 23267, var19, var15, arg1);
            class239.method1690(var19, 23267, var17, var15, arg2);
        }
        while (var7 < var9) {
            var13 += 2;
            var12 += var13;
            var14 += 2;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class248.field4101[var11] = var7;
            }
            var7++;
            var10 += var14;
            if (var10 >= 0) {
                var9--;
                int var20 = arg0 - var9;
                var10 -= var9 << 1;
                int var21 = arg0 + var9;
                if (class294.field4956 <= var21 && class101.field1505 >= var20) {
                    if (var9 < var8) {
                        int var22 = class248.field4101[var9];
                        int var23 = class76.method533(class57.field899, arg4 + var7, true, class301.field5073);
                        int var24 = class76.method533(class57.field899, arg4 - var7, true, class301.field5073);
                        int var25 = class76.method533(class57.field899, arg4 + var22, true, class301.field5073);
                        int var26 = class76.method533(class57.field899, arg4 - var22, true, class301.field5073);
                        if (var21 <= class101.field1505) {
                            int[] var27 = class137.field2032[var21];
                            class239.method1690(var24, 23267, var26, var27, arg2);
                            class239.method1690(var26, 23267, var25, var27, arg1);
                            class239.method1690(var25, 23267, var23, var27, arg2);
                        }
                        if (var20 >= class294.field4956) {
                            int[] var28 = class137.field2032[var20];
                            class239.method1690(var24, 23267, var26, var28, arg2);
                            class239.method1690(var26, arg3 ^ 0xFFFF9008, var25, var28, arg1);
                            class239.method1690(var25, 23267, var23, var28, arg2);
                        }
                    } else {
                        int var29 = class76.method533(class57.field899, arg4 + var7, true, class301.field5073);
                        int var30 = class76.method533(class57.field899, arg4 - var7, true, class301.field5073);
                        if (var21 <= class101.field1505) {
                            class239.method1690(var30, 23267, var29, class137.field2032[var21], arg2);
                        }
                        if (var20 >= class294.field4956) {
                            class239.method1690(var30, arg3 ^ 0xFFFF9008, var29, class137.field2032[var20], arg2);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (var32 >= class294.field4956 && class101.field1505 >= var31) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (class57.field899 <= var33 && class301.field5073 >= var34) {
                    int var35 = class76.method533(class57.field899, var33, true, class301.field5073);
                    int var36 = class76.method533(class57.field899, var34, true, class301.field5073);
                    if (var7 >= var8) {
                        if (var32 <= class101.field1505) {
                            class239.method1690(var36, 23267, var35, class137.field2032[var32], arg2);
                        }
                        if (class294.field4956 <= var31) {
                            class239.method1690(var36, arg3 ^ 0xFFFF9008, var35, class137.field2032[var31], arg2);
                        }
                    } else {
                        int var37 = var7 > var11 ? class248.field4101[var7] : var11;
                        int var38 = class76.method533(class57.field899, arg4 + var37, true, class301.field5073);
                        int var39 = class76.method533(class57.field899, arg4 - var37, true, class301.field5073);
                        if (class101.field1505 >= var32) {
                            int[] var40 = class137.field2032[var32];
                            class239.method1690(var36, arg3 ^ 0xFFFF9008, var39, var40, arg2);
                            class239.method1690(var39, 23267, var38, var40, arg1);
                            class239.method1690(var38, arg3 + 36856, var35, var40, arg2);
                        }
                        if (class294.field4956 <= var31) {
                            int[] var41 = class137.field2032[var31];
                            class239.method1690(var36, 23267, var39, var41, arg2);
                            class239.method1690(var39, 23267, var38, var41, arg1);
                            class239.method1690(var38, arg3 ^ 0xFFFF9008, var35, var41, arg2);
                        }
                    }
                }
            }
        }
        if (arg3 != -13589) {
            method381(-38);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)V", line = 195)
    public final void method367(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field804;
        int var5 = 56 % ((53 - arg0) / 53);
        field798++;
        int var6 = arg2 - this.field781;
        this.field793[var6][var4] = class264.method1820(this.field793[var6][var4], 2097152);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZIII)V", line = 207)
    public final void method368(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field804;
        int var8 = arg1 - this.field781;
        field790++;
        if (~arg4 == arg5) {
            if (arg3 == 0) {
                this.method378((byte) -112, 128, var8, var7);
                this.method378((byte) -112, 8, var8 - 1, var7);
            }
            if (arg3 == 1) {
                this.method378((byte) -112, 2, var8, var7);
                this.method378((byte) -112, 32, var8, var7 + 1);
            }
            if (arg3 == 2) {
                this.method378((byte) -112, 8, var8, var7);
                this.method378((byte) -112, 128, var8 + 1, var7);
            }
            if (arg3 == 3) {
                this.method378((byte) -112, 32, var8, var7);
                this.method378((byte) -112, 2, var8, var7 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method378((byte) -112, 1, var8, var7);
                this.method378((byte) -112, 16, var8 - 1, var7 + 1);
            }
            if (arg3 == 1) {
                this.method378((byte) -112, 4, var8, var7);
                this.method378((byte) -112, 64, var8 + 1, var7 + 1);
            }
            if (arg3 == 2) {
                this.method378((byte) -112, 16, var8, var7);
                this.method378((byte) -112, 1, var8 + 1, var7 + -1);
            }
            if (arg3 == 3) {
                this.method378((byte) -112, 64, var8, var7);
                this.method378((byte) -112, 4, var8 - 1, var7 + -1);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method378((byte) -112, 130, var8, var7);
                this.method378((byte) -112, 8, var8 - 1, var7);
                this.method378((byte) -112, 32, var8, var7 + 1);
            }
            if (arg3 == 1) {
                this.method378((byte) -112, 10, var8, var7);
                this.method378((byte) -112, 32, var8, var7 + 1);
                this.method378((byte) -112, 128, var8 + 1, var7);
            }
            if (arg3 == 2) {
                this.method378((byte) -112, 40, var8, var7);
                this.method378((byte) -112, 128, var8 + 1, var7);
                this.method378((byte) -112, 2, var8, var7 - 1);
            }
            if (arg3 == 3) {
                this.method378((byte) -112, 160, var8, var7);
                this.method378((byte) -112, 2, var8, var7 - 1);
                this.method378((byte) -112, 8, var8 - 1, var7);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method378((byte) -112, 65536, var8, var7);
                this.method378((byte) -112, 4096, var8 - 1, var7);
            }
            if (arg3 == 1) {
                this.method378((byte) -112, 1024, var8, var7);
                this.method378((byte) -112, 16384, var8, var7 + 1);
            }
            if (arg3 == 2) {
                this.method378((byte) -112, 4096, var8, var7);
                this.method378((byte) -112, 65536, var8 + 1, var7);
            }
            if (arg3 == 3) {
                this.method378((byte) -112, 16384, var8, var7);
                this.method378((byte) -112, 1024, var8, var7 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method378((byte) -112, 512, var8, var7);
                this.method378((byte) -112, 8192, var8 - 1, var7 - -1);
            }
            if (arg3 == 1) {
                this.method378((byte) -112, 2048, var8, var7);
                this.method378((byte) -112, 32768, var8 + 1, var7 - -1);
            }
            if (arg3 == 2) {
                this.method378((byte) -112, 8192, var8, var7);
                this.method378((byte) -112, 512, var8 + 1, var7 + -1);
            }
            if (arg3 == 3) {
                this.method378((byte) -112, 32768, var8, var7);
                this.method378((byte) -112, 2048, var8 - 1, var7 + -1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method378((byte) -112, 66560, var8, var7);
            this.method378((byte) -112, 4096, var8 - 1, var7);
            this.method378((byte) -112, 16384, var8, var7 + 1);
        }
        if (arg3 == 1) {
            this.method378((byte) -112, 5120, var8, var7);
            this.method378((byte) -112, 16384, var8, var7 + 1);
            this.method378((byte) -112, 65536, var8 + 1, var7);
        }
        if (arg3 == 2) {
            this.method378((byte) -112, 20480, var8, var7);
            this.method378((byte) -112, 65536, var8 + 1, var7);
            this.method378((byte) -112, 1024, var8, var7 - 1);
        }
        if (arg3 == 3) {
            this.method378((byte) -112, 81920, var8, var7);
            this.method378((byte) -112, 1024, var8, var7 - 1);
            this.method378((byte) -112, 4096, var8 - 1, var7);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZI)V", line = 426)
    private final void method369(int arg0, int arg1, boolean arg2, int arg3) {
        this.field793[arg0][arg3] = class264.method1820(this.field793[arg0][arg3], arg1);
        if (arg2) {
            this.method367((byte) 69, 57, -58);
        }
        field807++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V", line = 437)
    public final void method370(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field781;
        int var5 = arg0 - this.field804;
        field776++;
        this.field793[var4][var5] = class204.method1354(this.field793[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I", line = 449)
    public static final int method371(int arg0, byte arg1) {
        field791++;
        return arg1 <= 71 ? -52 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)Z", line = 460)
    public final boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field775++;
        if (arg2 == arg3 && arg1 == arg4) {
            return true;
        }
        int var6 = arg1 - this.field804;
        int var7 = arg3 - this.field781;
        if (var7 < 0 || this.field794 <= var7 || var6 < 0 || var6 >= this.field801) {
            return false;
        }
        int var8 = arg2 - this.field781;
        int var9 = arg4 - this.field804;
        int var10;
        if (var7 > var8) {
            var10 = var7 - var8;
        } else {
            var10 = var8 - var7;
        }
        int var11;
        if (var9 >= var6) {
            var11 = var9 - var6;
        } else {
            var11 = var6 - var9;
        }
        if (arg0 != 1137) {
            return true;
        }
        if (var10 <= var11) {
            int var12 = 32768;
            int var13 = var10 * 65536 / var11;
            while (var6 != var9) {
                if (var9 < var6) {
                    if ((this.field793[var8][var9] & 0x12C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var6 < var9) {
                    if ((this.field793[var8][var9] & 0x12C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var8 < var7) {
                        if ((this.field793[var8][var9] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field793[var8][var9] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = 32768;
            int var15 = var11 * 65536 / var10;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field793[var8][var9] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var7 < var8) {
                    if ((this.field793[var8][var9] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var9 < var6) {
                        if ((this.field793[var8][var9] & 0x12C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field793[var8][var9] & 0x12C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field793[var7][var6] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIBIIII)Z", line = 616)
    public final boolean method373(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field786++;
        if (arg2 == 1) {
            if (arg1 == arg4 && arg6 == arg7) {
                return true;
            }
        } else if (arg1 <= arg4 && arg1 + arg2 - 1 >= arg4 && arg6 >= arg6 && arg6 + arg2 - 1 >= arg6) {
            return true;
        }
        int var9 = arg6 - this.field804;
        int var10 = arg7 - this.field804;
        int var11 = arg1 - this.field781;
        int var12 = arg4 - this.field781;
        if (arg2 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field793[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field793[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field793[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field793[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field793[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field793[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field793[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field793[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field793[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field793[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field793[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field793[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var10 - 1;
            int var14 = arg2 + var11 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var12 + 1 == var11 && var9 >= var10 && var9 <= var13 && (this.field793[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var14 >= var12 && var9 - arg2 == var10 && (this.field793[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var12 - arg2) == var11 && var10 <= var9 && var13 >= var9 && (this.field793[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var14 && var9 - arg2 == var10 && (this.field793[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var12 - arg2 == var11 && var9 >= var10 && var13 >= var9 && (this.field793[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var14 && (var9 + 1) == var10 && (this.field793[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var12 + 1 == var11 && var9 >= var10 && var9 <= var13 && (this.field793[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var14 >= var12 && var9 + 1 == var10 && (this.field793[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 <= var12 && var14 >= var12 && (var9 + 1) == var10 && (this.field793[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var14 >= var12 && (var9 - arg2) == var10 && (this.field793[var12][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg2) == var11 && var10 <= var9 && var13 >= var9 && (this.field793[var14][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var10 <= var9 && var9 <= var13 && (this.field793[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        int var15 = 50 % ((arg3 + 53) / 48);
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 803)
    public static void method374(byte arg0) {
        field795 = null;
        field787 = null;
        field796 = null;
        if (arg0 < 71) {
            field787 = (class295) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 818)
    public final void method375(int arg0) {
        if (arg0 != -8823) {
            this.method373(43, -7, -85, (byte) 46, 50, -12, 74, 66);
        }
        field800++;
        for (int var2 = 0; var2 < this.field794; var2++) {
            for (int var3 = 0; var3 < this.field801; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field794 - 5) || var3 >= this.field801 - 5) {
                    this.field793[var2][var3] = 16777215;
                } else {
                    this.field793[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBIIZI)V", line = 849)
    public final void method376(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field804;
        int var8 = arg0 - this.field781;
        if (arg1 < 95) {
            return;
        }
        field779++;
        int var9 = 256;
        if (arg4) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < arg5 + var8; var10++) {
            if (var10 >= 0 && var10 < this.field794) {
                for (int var11 = var7; var11 < var7 + arg2; var11++) {
                    if (var11 >= 0 && this.field801 > var11) {
                        this.method369(var10, var9, false, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIII)Z", line = 893)
    private final boolean method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field799++;
        if (arg5 != -10796) {
            field796 = (class5) null;
        }
        if (arg3 < (arg0 + arg2) && arg3 + arg7 > arg2) {
            return (arg4 + arg6) > arg8 && arg6 < arg8 + arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BIII)V", line = 911)
    private final void method378(byte arg0, int arg1, int arg2, int arg3) {
        this.field793[arg2][arg3] = class204.method1354(this.field793[arg2][arg3], ~arg1);
        if (arg0 != -112) {
            field796 = (class5) null;
        }
        field803++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 932)
    public static final void method379(boolean arg0) {
        if (arg0) {
            class208.field3304 = class181.field2769;
            class43.field646 = class225.field3700;
            class280.field4749 = class234.field3864;
        } else {
            class208.field3304 = class88.field1318;
            class43.field646 = class174.field2665;
            class280.field4749 = class110.field1635;
        }
        class168.field2570 = class43.field646.length;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIIBI)Z", line = 949)
    private final boolean method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 != -54) {
            method381(26);
        }
        field806++;
        int var11 = arg0 + arg6;
        int var12 = arg3 + arg4;
        int var13 = arg5 + arg9;
        int var14 = arg2 + arg7;
        if (arg3 >= arg2 && var14 > arg3) {
            if (arg5 == var11 && (arg1 & 0x4) == 0) {
                int var15 = var14 >= var12 ? var12 : var14;
                for (int var16 = arg3; var16 < var15; var16++) {
                    if ((this.field793[var16 - this.field781][var11 - this.field804 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var13 && (arg1 & 0x1) == 0) {
                int var17 = arg3;
                int var18 = var12 <= var14 ? var12 : var14;
                while (var17 < var18) {
                    if ((this.field793[var17 - this.field781][arg0 - this.field804] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var12 > arg2 && var12 <= var14) {
            if (arg5 == var11 && (arg1 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var12; var19++) {
                    if ((this.field793[var19 - this.field781][var11 - this.field804 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var13 && (arg1 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var12; var20++) {
                    if ((this.field793[var20 - this.field781][arg0 - this.field804] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg5 <= arg0 && var13 > arg0) {
            if (arg2 == var12 && (arg1 & 0x8) == 0) {
                int var21 = arg0;
                int var22 = var13 < var11 ? var13 : var11;
                while (var22 > var21) {
                    if ((this.field793[var12 - this.field781 - 1][var21 - this.field804] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg3 == var14 && (arg1 & 0x2) == 0) {
                int var23 = arg0;
                int var24 = var13 >= var11 ? var11 : var13;
                while (var23 < var24) {
                    if ((this.field793[arg3 - this.field781][var23 - this.field804] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg5 < var11 && var13 >= var11) {
            if (arg2 == var12 && (arg1 & 0x8) == 0) {
                for (int var25 = arg5; var25 < var11; var25++) {
                    if ((this.field793[var12 - this.field781 - 1][var25 - this.field804] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var14 && (arg1 & 0x2) == 0) {
                for (int var26 = arg5; var26 < var11; var26++) {
                    if ((this.field793[arg3 - this.field781][var26 - this.field804] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 1113)
    public static final void method381(int arg0) {
        class31.field485 = null;
        class260.field4439 = null;
        class93.field1422 = null;
        field802++;
        if (arg0 != 1) {
            field787 = (class295) null;
        }
        class249.field4122 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIZ)V", line = 1127)
    public static final void method382(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field797++;
        if (class186.method1226(arg0, 0)) {
            if (arg2 != 16132) {
                method382(-98, -114, 82, 105, true);
            }
            class214.method1414(arg4, (byte) 113, class256.field4376[arg0], arg3, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V", line = 1143)
    public final void method383(int arg0, int arg1, int arg2) {
        field789++;
        int var4 = arg0 - this.field804;
        int var5 = arg1 - this.field781;
        if (arg2 != 16) {
            method366(85, 64, -99, 38, 103, 63, 77);
        }
        this.field793[var5][var4] = class264.method1820(this.field793[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IIIBIIII)Z", line = 1157)
    public final boolean method384(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field778++;
        if (arg6 == 1) {
            if (arg4 == arg7 && arg0 == arg1) {
                return true;
            }
        } else if (arg4 >= arg7 && arg6 + arg7 - 1 >= arg4 && arg1 <= arg1 && arg6 + arg1 - 1 >= arg1) {
            return true;
        }
        int var9 = arg4 - this.field781;
        int var10 = arg1 - this.field804;
        int var11 = arg0 - this.field804;
        int var12 = -7 / ((arg3 - 44) / 58);
        int var13 = arg7 - this.field781;
        if (arg6 == 1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    if (var9 - 1 == var13 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var13 && var10 + 1 == var11 && (this.field793[var13][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var13 && var10 - 1 == var11 && (this.field793[var13][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 == var13 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 - 1 == var13 && var10 == var11 && (this.field793[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var10 == var11 && (this.field793[var13][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var9 + 1 == var13 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var13 && var10 + 1 == var11 && (this.field793[var13][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var13 && var10 - 1 == var11 && (this.field793[var13][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 == var13 && var10 - 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var13 && var10 == var11 && (this.field793[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var10 == var11 && (this.field793[var13][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    if (var9 - 1 == var13 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var10 == var11 && (this.field793[var13][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var13 && (var10 - 1) == var11 && (this.field793[var13][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var9 - 1) == var13 && var10 == var11 && (this.field793[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var13 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var13 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var13 && var10 - 1 == var11 && (this.field793[var13][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var9 - 1) == var13 && var10 == var11 && (this.field793[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var13 && (var10 + 1) == var11 && (this.field793[var13][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var13 && (var10 - 1) == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var9 - 1) == var13 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var13 && (var10 + 1) == var11 && (this.field793[var13][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var13 && var10 == var11 && (this.field793[var13][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var13 && var10 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var13 && var10 + 1 == var11 && (this.field793[var13][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var13 && var10 - 1 == var11 && (this.field793[var13][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var13 && var10 == var11 && (this.field793[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var13 && var10 == var11 && (this.field793[var13][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg6 + var13 - 1;
            int var15 = var11 + arg6 - 1;
            if (arg2 == 0) {
                if (arg5 == 0) {
                    if ((var9 - arg6) == var13 && var10 >= var11 && var15 >= var10) {
                        return true;
                    }
                    if (var13 <= var9 && var14 >= var9 && (var10 + 1) == var11 && (this.field793[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var13 <= var9 && var9 <= var14 && (var10 - arg6) == var11 && (this.field793[var9][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var13 <= var9 && var14 >= var9 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 - arg6) == var13 && var10 >= var11 && var15 >= var10 && (this.field793[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var13 && var11 <= var10 && var10 <= var15 && (this.field793[var13][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var9 + 1 == var13 && var10 >= var11 && var15 >= var10) {
                        return true;
                    }
                    if (var9 >= var13 && var9 <= var14 && var10 + 1 == var11 && (this.field793[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var13 && var14 >= var9 && (var10 - arg6) == var11 && (this.field793[var9][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 >= var13 && var9 <= var14 && (var10 - arg6) == var11) {
                        return true;
                    }
                    if (var9 - arg6 == var13 && var10 >= var11 && var15 >= var10 && (this.field793[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var13 && var11 <= var10 && var10 <= var15 && (this.field793[var13][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    if (var9 - arg6 == var13 && var10 >= var11 && var15 >= var10) {
                        return true;
                    }
                    if (var13 <= var9 && var9 <= var14 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var10 >= var11 && var15 >= var10 && (this.field793[var13][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var13 && var9 <= var14 && var10 - arg6 == var11 && (this.field793[var9][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 - arg6 == var13 && var10 >= var11 && var10 <= var15 && (this.field793[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var13 <= var9 && var14 >= var9 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var11 <= var10 && var10 <= var15) {
                        return true;
                    }
                    if (var9 >= var13 && var9 <= var14 && (var10 - arg6) == var11 && (this.field793[var9][var15] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var9 - arg6 == var13 && var11 <= var10 && var10 <= var15 && (this.field793[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var13 <= var9 && var9 <= var14 && (var10 + 1) == var11 && (this.field793[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var13 && var10 >= var11 && var15 >= var10) {
                        return true;
                    }
                    if (var13 <= var9 && var9 <= var14 && var10 - arg6 == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 - arg6 == var13 && var10 >= var11 && var10 <= var15) {
                        return true;
                    }
                    if (var9 >= var13 && var14 >= var9 && var10 + 1 == var11 && (this.field793[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var13 && var11 <= var10 && var15 >= var10 && (this.field793[var13][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var13 <= var9 && var14 >= var9 && var10 - arg6 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 >= var13 && var9 <= var14 && var10 + 1 == var11 && (this.field793[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 >= var13 && var9 <= var14 && (var10 - arg6) == var11 && (this.field793[var9][var15] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg6 == var13 && var10 >= var11 && var10 <= var15 && (this.field793[var14][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var13 && var10 >= var11 && var10 <= var15 && (this.field793[var13][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZZIII)V", line = 1535)
    public final void method385(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            return;
        }
        int var7 = arg0 - this.field804;
        field792++;
        int var8 = arg4 - this.field781;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method369(var8, 128, arg2, var7);
                this.method369(var8 - 1, 8, false, var7);
            }
            if (arg3 == 1) {
                this.method369(var8, 2, false, var7);
                this.method369(var8, 32, false, var7 + 1);
            }
            if (arg3 == 2) {
                this.method369(var8, 8, false, var7);
                this.method369(var8 + 1, 128, false, var7);
            }
            if (arg3 == 3) {
                this.method369(var8, 32, arg2, var7);
                this.method369(var8, 2, arg2, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method369(var8, 1, false, var7);
                this.method369(var8 - 1, 16, arg2, var7 + 1);
            }
            if (arg3 == 1) {
                this.method369(var8, 4, false, var7);
                this.method369(var8 + 1, 64, arg2, var7 + 1);
            }
            if (arg3 == 2) {
                this.method369(var8, 16, false, var7);
                this.method369(var8 + 1, 1, false, var7 - 1);
            }
            if (arg3 == 3) {
                this.method369(var8, 64, false, var7);
                this.method369(var8 - 1, 4, false, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method369(var8, 130, arg2, var7);
                this.method369(var8 - 1, 8, false, var7);
                this.method369(var8, 32, false, var7 + 1);
            }
            if (arg3 == 1) {
                this.method369(var8, 10, false, var7);
                this.method369(var8, 32, false, var7 + 1);
                this.method369(var8 + 1, 128, arg2, var7);
            }
            if (arg3 == 2) {
                this.method369(var8, 40, arg2, var7);
                this.method369(var8 + 1, 128, false, var7);
                this.method369(var8, 2, false, var7 - 1);
            }
            if (arg3 == 3) {
                this.method369(var8, 160, false, var7);
                this.method369(var8, 2, false, var7 - 1);
                this.method369(var8 - 1, 8, false, var7);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method369(var8, 65536, arg2, var7);
                this.method369(var8 - 1, 4096, false, var7);
            }
            if (arg3 == 1) {
                this.method369(var8, 1024, false, var7);
                this.method369(var8, 16384, false, var7 + 1);
            }
            if (arg3 == 2) {
                this.method369(var8, 4096, arg2, var7);
                this.method369(var8 + 1, 65536, false, var7);
            }
            if (arg3 == 3) {
                this.method369(var8, 16384, false, var7);
                this.method369(var8, 1024, false, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method369(var8, 512, false, var7);
                this.method369(var8 - 1, 8192, arg2, var7 + 1);
            }
            if (arg3 == 1) {
                this.method369(var8, 2048, false, var7);
                this.method369(var8 + 1, 32768, false, var7 + 1);
            }
            if (arg3 == 2) {
                this.method369(var8, 8192, false, var7);
                this.method369(var8 + 1, 512, false, var7 - 1);
            }
            if (arg3 == 3) {
                this.method369(var8, 32768, false, var7);
                this.method369(var8 - 1, 2048, false, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method369(var8, 66560, false, var7);
            this.method369(var8 - 1, 4096, false, var7);
            this.method369(var8, 16384, false, var7 + 1);
        }
        if (arg3 == 1) {
            this.method369(var8, 5120, false, var7);
            this.method369(var8, 16384, false, var7 + 1);
            this.method369(var8 + 1, 65536, false, var7);
        }
        if (arg3 == 2) {
            this.method369(var8, 20480, arg2, var7);
            this.method369(var8 + 1, 65536, false, var7);
            this.method369(var8, 1024, false, var7 - 1);
        }
        if (arg3 == 3) {
            this.method369(var8, 81920, false, var7);
            this.method369(var8, 1024, false, var7 - 1);
            this.method369(var8 - 1, 4096, false, var7);
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 1755)
    public static final void method386(int arg0) {
        field783++;
        class182.field2774.method523(arg0 ^ 0x75);
        class208.field3294.method523(arg0 ^ 0x72);
        class238.field3928.method523(arg0 ^ 0x72);
        if (arg0 != 8) {
            method379(false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IIIIIIIII)Z", line = 1769)
    public final boolean method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field785++;
        if (arg2 <= 1) {
            int var10 = arg0 + arg3 - 1;
            int var11 = arg1 + arg4 - 1;
            if (arg8 >= arg3 && var10 >= arg8 && arg1 <= arg7 && arg7 <= var11) {
                return true;
            } else if ((arg3 - 1) == arg8 && arg7 >= arg1 && var11 >= arg7 && (this.field793[arg8 - this.field781][arg7 - this.field804] & 0x8) == 0 && (arg6 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg8 && arg1 <= arg7 && var11 >= arg7 && (this.field793[arg8 - this.field781][arg7 - this.field804] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else {
                if (arg5 >= -119) {
                    field784 = -16;
                }
                if (arg1 - 1 == arg7 && arg8 >= arg3 && arg8 <= var10 && (this.field793[arg8 - this.field781][arg7 - this.field804] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                    return true;
                } else {
                    return var11 + 1 == arg7 && arg8 >= arg3 && var10 >= arg8 && (this.field793[arg8 - this.field781][arg7 - this.field804] & 0x20) == 0 && (arg6 & 0x1) == 0;
                }
            }
        } else if (this.method377(arg0, arg2, arg3, arg8, arg4, -10796, arg1, arg2, arg7)) {
            return true;
        } else {
            return this.method380(arg7, arg6, arg3, arg8, arg2, arg1, arg2, arg0, (byte) -54, arg4);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIZ)V", line = 1817)
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field804;
        field788++;
        int var9 = arg5 - this.field781;
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg3;
            arg3 = arg1;
            arg1 = var10;
        }
        int var11 = 256;
        if (arg6) {
            var11 += 131072;
        }
        for (int var12 = var9; var12 < (var9 + arg3); var12++) {
            if (var12 >= 0 && this.field794 > var12) {
                for (int var13 = var8; var13 < arg1 + var8; var13++) {
                    if (var13 >= 0 && this.field801 > var13) {
                        this.method378((byte) -112, var11, var12, var13);
                    }
                }
            }
        }
        if (arg4 != -1) {
            this.field793 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V", line = 1864)
    public class50(int arg0, int arg1) {
        this.field801 = arg1;
        this.field794 = arg0;
        this.field781 = 0;
        this.field793 = new int[this.field794][this.field801];
        this.method375(-8823);
    }
}
