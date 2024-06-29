import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class100 {

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    private int field1854;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    private int field1866;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    private int field1876;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    private int field1868;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "[[I")
    public int[][] field1852;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Z")
    public static boolean field1853 = false;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lai;")
    public static class10 field1865 = class44.method278("Registrierter Benutzer", 94);

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lai;")
    public static class10 field1855 = class44.method278("scrollbar", -46);

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lai;")
    public static class10 field1858 = class44.method278("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 98);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lwa;")
    public static class200 field1871 = null;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lai;")
    public static class10 field1869 = class44.method278("<col=ffff00>*V", 118);

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[I")
    public static int[] field1873 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lme;")
    public static class114 field1872;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
    public static int[] field1857;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZI)V")
    public final void method649(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field1868;
        if (arg2 != -1) {
            this.method654(-15, true, 59);
        }
        int var8 = arg0 - this.field1876;
        int var9 = 256;
        if (arg4) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < var7 + arg1; var10++) {
            if (var10 >= 0 && this.field1866 > var10) {
                for (int var11 = var8; var11 < arg5 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field1854) {
                        this.method664(var9, var10, 3047, var11);
                    }
                }
            }
        }
        field1864++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)I")
    public static final int method650(int arg0, int arg1, int arg2) {
        field1859++;
        int var3 = class87.method532(arg2 + 45365, arg0 - -91923, 4, 27) + (class87.method532(arg2 + 10294, arg0 + 37821, 2, 99) - 128 >> 1) + (class87.method532(arg2, arg0, 1, arg1 ^ 0x2B) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 != 60) {
            method650(35, 70, -121);
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZIII)V")
    public final void method651(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 57) {
            return;
        }
        int var7 = arg5 - this.field1868;
        int var8 = arg3 - this.field1876;
        field1861++;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method663(128, var8, true, var7);
                this.method663(8, var8, true, var7 - 1);
            }
            if (arg1 == 1) {
                this.method663(2, var8, true, var7);
                this.method663(32, var8 + 1, true, var7);
            }
            if (arg1 == 2) {
                this.method663(8, var8, true, var7);
                this.method663(128, var8, true, var7 + 1);
            }
            if (arg1 == 3) {
                this.method663(32, var8, true, var7);
                this.method663(2, var8 - 1, true, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method663(1, var8, true, var7);
                this.method663(16, var8 + 1, true, var7 - 1);
            }
            if (arg1 == 1) {
                this.method663(4, var8, true, var7);
                this.method663(64, var8 + 1, true, var7 + 1);
            }
            if (arg1 == 2) {
                this.method663(16, var8, true, var7);
                this.method663(1, var8 - 1, true, var7 + 1);
            }
            if (arg1 == 3) {
                this.method663(64, var8, true, var7);
                this.method663(4, var8 - 1, true, var7 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method663(130, var8, true, var7);
                this.method663(8, var8, true, var7 - 1);
                this.method663(32, var8 + 1, true, var7);
            }
            if (arg1 == 1) {
                this.method663(10, var8, true, var7);
                this.method663(32, var8 + 1, true, var7);
                this.method663(128, var8, true, var7 + 1);
            }
            if (arg1 == 2) {
                this.method663(40, var8, true, var7);
                this.method663(128, var8, true, var7 + 1);
                this.method663(2, var8 - 1, true, var7);
            }
            if (arg1 == 3) {
                this.method663(160, var8, true, var7);
                this.method663(2, var8 - 1, true, var7);
                this.method663(8, var8, true, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method663(65536, var8, true, var7);
                this.method663(4096, var8, true, var7 - 1);
            }
            if (arg1 == 1) {
                this.method663(1024, var8, true, var7);
                this.method663(16384, var8 + 1, true, var7);
            }
            if (arg1 == 2) {
                this.method663(4096, var8, true, var7);
                this.method663(65536, var8, true, var7 + 1);
            }
            if (arg1 == 3) {
                this.method663(16384, var8, true, var7);
                this.method663(1024, var8 - 1, true, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method663(512, var8, true, var7);
                this.method663(8192, var8 + 1, true, var7 - 1);
            }
            if (arg1 == 1) {
                this.method663(2048, var8, true, var7);
                this.method663(32768, var8 + 1, true, var7 + 1);
            }
            if (arg1 == 2) {
                this.method663(8192, var8, true, var7);
                this.method663(512, var8 - 1, true, var7 + 1);
            }
            if (arg1 == 3) {
                this.method663(32768, var8, true, var7);
                this.method663(2048, var8 - 1, true, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method663(66560, var8, true, var7);
            this.method663(4096, var8, true, var7 - 1);
            this.method663(16384, var8 + 1, true, var7);
        }
        if (arg1 == 1) {
            this.method663(5120, var8, true, var7);
            this.method663(16384, var8 + 1, true, var7);
            this.method663(65536, var8, true, var7 + 1);
        }
        if (arg1 == 2) {
            this.method663(20480, var8, true, var7);
            this.method663(65536, var8, true, var7 + 1);
            this.method663(1024, var8 - 1, true, var7);
        }
        if (arg1 == 3) {
            this.method663(81920, var8, true, var7);
            this.method663(1024, var8 - 1, true, var7);
            this.method663(4096, var8, true, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBIIIII)Z")
    public final boolean method652(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1850++;
        int var9 = arg6 + arg7 - 1;
        int var10 = arg3 + arg1 - 1;
        if (arg0 >= arg3 && arg0 <= var10 && arg5 >= arg6 && arg5 <= var9) {
            return true;
        }
        int var11 = -18 % ((-arg2 - 39) / 35);
        if (arg3 - 1 == arg0 && arg5 >= arg6 && arg5 <= var9 && (this.field1852[arg0 - this.field1868][arg5 - this.field1876] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg0 && arg5 >= arg6 && var9 >= arg5 && (this.field1852[arg0 - this.field1868][arg5 - this.field1876] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg5 && arg3 <= arg0 && arg0 <= var10 && (this.field1852[arg0 - this.field1868][arg5 - this.field1876] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg5 && arg3 <= arg0 && var10 >= arg0 && (this.field1852[arg0 - this.field1868][arg5 - this.field1876] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIZB)V")
    public final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        int var8 = arg4 - this.field1876;
        field1875++;
        int var9 = 256;
        int var10 = arg1 - this.field1868;
        if (arg5) {
            var9 += 131072;
        }
        int var11 = -114 % ((-arg6 - 20) / 50);
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg2;
            arg2 = arg0;
            arg0 = var12;
        }
        for (int var13 = var10; var13 < var10 + arg2; var13++) {
            if (var13 >= 0 && var13 < this.field1866) {
                for (int var14 = var8; var14 < arg0 + var8; var14++) {
                    if (var14 >= 0 && var14 < this.field1854) {
                        this.method663(var9, var14, true, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZI)V")
    public final void method654(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field1868;
        if (!arg1) {
            this.method653(-80, -8, 19, -89, -2, false, (byte) 71);
        }
        field1863++;
        int var5 = arg2 - this.field1876;
        this.field1852[var4][var5] = class66.method434(this.field1852[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(III)V")
    public final void method655(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1868;
        int var5 = arg2 - this.field1876;
        if (arg1 != -1) {
            this.method664(-8, 68, -76, 34);
        }
        field1860++;
        this.field1852[var4][var5] = class123.method861(this.field1852[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBIIIII)Z")
    public final boolean method656(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1856++;
        if (arg5 == arg6 && arg3 == arg4) {
            return true;
        }
        int var8 = arg6 - this.field1868;
        int var9 = arg3 - this.field1876;
        if (arg1 < 87) {
            this.field1854 = 16;
        }
        int var10 = arg4 - this.field1876;
        int var11 = arg5 - this.field1868;
        if (arg0 == 0) {
            if (arg2 == 0) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field1852[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field1852[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field1852[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field1852[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field1852[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field1852[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field1852[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field1852[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var11 && var10 + 1 == var9 && (this.field1852[var11][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var10 - 1 == var9 && (this.field1852[var11][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var11 && var9 == var10 && (this.field1852[var11][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(III)V")
    public final void method657(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1876;
        int var5 = arg1 - this.field1868;
        this.field1852[var5][var4] = class66.method434(this.field1852[var5][var4], arg0);
        field1874++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIIIII)Z")
    public final boolean method658(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1877++;
        if (arg2 == arg3 && arg4 == arg5) {
            return true;
        }
        int var8 = arg5 - this.field1876;
        int var9 = arg4 - this.field1876;
        int var10 = arg2 - this.field1868;
        int var11 = arg3 - this.field1868;
        int var12 = -73 / ((-arg0 - 29) / 50);
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field1852[var11][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1852[var11][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field1852[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1852[var11][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field1852[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1852[var11][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field1852[var11][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1852[var11][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field1852[var11][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field1852[var11][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var11 && var8 == var9 && (this.field1852[var11][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var11 && var8 == var9 && (this.field1852[var11][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lte;Lc;ILc;Z)V")
    public static final void method659(class177 arg0, class21 arg1, int arg2, class21 arg3, boolean arg4) {
        class124.field2381 = arg1;
        class119.field2298 = arg3;
        field1870++;
        class44.field718 = arg4;
        class125.field2390 = class124.field2381.method142(arg2, -109);
        class14.field230 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public final void method660(byte arg0) {
        int var2 = -98 % ((54 - arg0) / 49);
        for (int var3 = 0; var3 < this.field1866; var3++) {
            for (int var4 = 0; var4 < this.field1854; var4++) {
                if (var3 == 0 || var4 == 0 || var3 >= this.field1866 - 5 || this.field1854 - 5 <= var4) {
                    this.field1852[var3][var4] = 16777215;
                } else {
                    this.field1852[var3][var4] = 16777216;
                }
            }
        }
        field1851++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZBII)V")
    public final void method661(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        field1878++;
        int var7 = arg1 - this.field1876;
        int var8 = arg0 - this.field1868;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method664(128, var8, 3047, var7);
                this.method664(8, var8 - 1, 3047, var7);
            }
            if (arg5 == 1) {
                this.method664(2, var8, 3047, var7);
                this.method664(32, var8, 3047, var7 + 1);
            }
            if (arg5 == 2) {
                this.method664(8, var8, 3047, var7);
                this.method664(128, var8 + 1, 3047, var7);
            }
            if (arg5 == 3) {
                this.method664(32, var8, 3047, var7);
                this.method664(2, var8, 3047, var7 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method664(1, var8, 3047, var7);
                this.method664(16, var8 - 1, 3047, var7 + 1);
            }
            if (arg5 == 1) {
                this.method664(4, var8, 3047, var7);
                this.method664(64, var8 + 1, 3047, var7 + 1);
            }
            if (arg5 == 2) {
                this.method664(16, var8, 3047, var7);
                this.method664(1, var8 + 1, 3047, var7 - 1);
            }
            if (arg5 == 3) {
                this.method664(64, var8, 3047, var7);
                this.method664(4, var8 - 1, 3047, var7 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method664(130, var8, 3047, var7);
                this.method664(8, var8 - 1, 3047, var7);
                this.method664(32, var8, 3047, var7 + 1);
            }
            if (arg5 == 1) {
                this.method664(10, var8, 3047, var7);
                this.method664(32, var8, 3047, var7 + 1);
                this.method664(128, var8 + 1, 3047, var7);
            }
            if (arg5 == 2) {
                this.method664(40, var8, 3047, var7);
                this.method664(128, var8 + 1, 3047, var7);
                this.method664(2, var8, 3047, var7 - 1);
            }
            if (arg5 == 3) {
                this.method664(160, var8, 3047, var7);
                this.method664(2, var8, 3047, var7 - 1);
                this.method664(8, var8 - 1, 3047, var7);
            }
        }
        int var9 = 74 / ((arg3 + 1) / 57);
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method664(65536, var8, 3047, var7);
                this.method664(4096, var8 - 1, 3047, var7);
            }
            if (arg5 == 1) {
                this.method664(1024, var8, 3047, var7);
                this.method664(16384, var8, 3047, var7 + 1);
            }
            if (arg5 == 2) {
                this.method664(4096, var8, 3047, var7);
                this.method664(65536, var8 + 1, 3047, var7);
            }
            if (arg5 == 3) {
                this.method664(16384, var8, 3047, var7);
                this.method664(1024, var8, 3047, var7 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method664(512, var8, 3047, var7);
                this.method664(8192, var8 - 1, 3047, var7 + 1);
            }
            if (arg5 == 1) {
                this.method664(2048, var8, 3047, var7);
                this.method664(32768, var8 + 1, 3047, var7 + 1);
            }
            if (arg5 == 2) {
                this.method664(8192, var8, 3047, var7);
                this.method664(512, var8 + 1, 3047, var7 - 1);
            }
            if (arg5 == 3) {
                this.method664(32768, var8, 3047, var7);
                this.method664(2048, var8 - 1, 3047, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method664(66560, var8, 3047, var7);
            this.method664(4096, var8 - 1, 3047, var7);
            this.method664(16384, var8, 3047, var7 + 1);
        }
        if (arg5 == 1) {
            this.method664(5120, var8, 3047, var7);
            this.method664(16384, var8, 3047, var7 + 1);
            this.method664(65536, var8 + 1, 3047, var7);
        }
        if (arg5 == 2) {
            this.method664(20480, var8, 3047, var7);
            this.method664(65536, var8 + 1, 3047, var7);
            this.method664(1024, var8, 3047, var7 - 1);
        }
        if (arg5 == 3) {
            this.method664(81920, var8, 3047, var7);
            this.method664(1024, var8, 3047, var7 - 1);
            this.method664(4096, var8 - 1, 3047, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public static void method662(byte arg0) {
        field1871 = null;
        field1858 = null;
        field1857 = null;
        field1873 = null;
        field1865 = null;
        field1855 = null;
        if (arg0 == -54) {
            field1872 = null;
            field1869 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZI)V")
    private final void method663(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field1852[arg3][arg1] = class123.method861(this.field1852[arg3][arg1], ~arg0);
            field1867++;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
    private final void method664(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 3047) {
            field1871 = null;
        }
        this.field1852[arg1][arg3] = class66.method434(this.field1852[arg1][arg3], arg0);
        field1862++;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(II)V")
    public class100(int arg0, int arg1) {
        this.field1854 = arg1;
        this.field1866 = arg0;
        this.field1876 = 0;
        this.field1868 = 0;
        this.field1852 = new int[this.field1866][this.field1854];
        this.method660((byte) 124);
    }
}
