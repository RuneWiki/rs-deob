import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class108 {

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    private int field1832;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    private int field1843;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[[I")
    public int[][] field1828;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    private int field1826;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field1821 = 0;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Lph;")
    private static class229 field1835 = class266.method1858("Take", 0);

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Lph;")
    public static class229 field1839 = field1835;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Lph;")
    private static class229 field1834 = class266.method1858("Loaded sprites", 0);

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "Lph;")
    public static class229 field1855 = class266.method1858(":clan:", 0);

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "Lph;")
    public static class229 field1842 = field1834;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[Lph;")
    public static class229[] field1820 = new class229[100];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "Lk;")
    public static class40 field1853;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "Z")
    public static boolean field1851;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZIIII)V", line = 4)
    public final void method810(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1847++;
        if (arg0 != 27204) {
            field1839 = (class229) null;
        }
        int var7 = arg5 - this.field1843;
        int var8 = 256;
        int var9 = arg2 - this.field1826;
        if (arg1) {
            var8 += 131072;
        }
        for (int var10 = var9; var10 < (arg3 + var9); var10++) {
            if (var10 >= 0 && var10 < this.field1832) {
                for (int var11 = var7; var11 < arg4 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field1836) {
                        this.method828(var8, -124, var11, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIBZ)V", line = 46)
    public final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        int var8 = arg2 - this.field1843;
        if (arg5 != -44) {
            return;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var9 = arg3;
            arg3 = arg1;
            arg1 = var9;
        }
        int var10 = 256;
        int var11 = arg0 - this.field1826;
        if (arg6) {
            var10 += 131072;
        }
        for (int var12 = var11; var12 < (arg3 + var11); var12++) {
            if (var12 >= 0 && var12 < this.field1832) {
                for (int var13 = var8; var13 < var8 + arg1; var13++) {
                    if (var13 >= 0 && var13 < this.field1836) {
                        this.method825(arg5 ^ 0x2B, var12, var10, var13);
                    }
                }
            }
        }
        field1833++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lsi;BLsi;)V", line = 99)
    public static final void method812(class66 arg0, byte arg1, class66 arg2) {
        class124.field2079 = arg2;
        class294.field4798 = arg0;
        field1850++;
        if (arg1 >= -70) {
            method827((class301) null, (byte) 30, (class229) null);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIII)Z", line = 115)
    private final boolean method813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1830++;
        if (arg3 != 2) {
            return false;
        } else if (arg6 + arg7 > arg0 && (arg0 + arg4) > arg7) {
            return arg5 < (arg1 + arg8) && arg2 + arg5 > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZIIBII)V", line = 133)
    public final void method814(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field1843;
        field1840++;
        int var8 = arg4 - this.field1826;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method828(128, -117, var7, var8);
                this.method828(8, -107, var7, var8 - 1);
            }
            if (arg1 == 1) {
                this.method828(2, -122, var7, var8);
                this.method828(32, -128, var7 + 1, var8);
            }
            if (arg1 == 2) {
                this.method828(8, -120, var7, var8);
                this.method828(128, -108, var7, var8 + 1);
            }
            if (arg1 == 3) {
                this.method828(32, -112, var7, var8);
                this.method828(2, -111, var7 - 1, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method828(1, -111, var7, var8);
                this.method828(16, -108, var7 + 1, var8 + -1);
            }
            if (arg1 == 1) {
                this.method828(4, -107, var7, var8);
                this.method828(64, -122, var7 + 1, var8 + 1);
            }
            if (arg1 == 2) {
                this.method828(16, -109, var7, var8);
                this.method828(1, -114, var7 - 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method828(64, -116, var7, var8);
                this.method828(4, -113, var7 - 1, var8 + -1);
            }
        }
        if (arg3 < 36) {
            method827((class301) null, (byte) -86, (class229) null);
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method828(130, -106, var7, var8);
                this.method828(8, -119, var7, var8 - 1);
                this.method828(32, -110, var7 + 1, var8);
            }
            if (arg1 == 1) {
                this.method828(10, -116, var7, var8);
                this.method828(32, -125, var7 + 1, var8);
                this.method828(128, -115, var7, var8 + 1);
            }
            if (arg1 == 2) {
                this.method828(40, -122, var7, var8);
                this.method828(128, -106, var7, var8 + 1);
                this.method828(2, -114, var7 - 1, var8);
            }
            if (arg1 == 3) {
                this.method828(160, -105, var7, var8);
                this.method828(2, -109, var7 - 1, var8);
                this.method828(8, -128, var7, var8 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method828(65536, -111, var7, var8);
                this.method828(4096, -118, var7, var8 - 1);
            }
            if (arg1 == 1) {
                this.method828(1024, -112, var7, var8);
                this.method828(16384, -107, var7 + 1, var8);
            }
            if (arg1 == 2) {
                this.method828(4096, -106, var7, var8);
                this.method828(65536, -118, var7, var8 + 1);
            }
            if (arg1 == 3) {
                this.method828(16384, -128, var7, var8);
                this.method828(1024, -127, var7 - 1, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method828(512, -110, var7, var8);
                this.method828(8192, -120, var7 + 1, var8 - 1);
            }
            if (arg1 == 1) {
                this.method828(2048, -126, var7, var8);
                this.method828(32768, -121, var7 + 1, var8 + 1);
            }
            if (arg1 == 2) {
                this.method828(8192, -110, var7, var8);
                this.method828(512, -125, var7 - 1, var8 - -1);
            }
            if (arg1 == 3) {
                this.method828(32768, -119, var7, var8);
                this.method828(2048, -107, var7 - 1, var8 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method828(66560, -113, var7, var8);
            this.method828(4096, -123, var7, var8 - 1);
            this.method828(16384, -127, var7 + 1, var8);
        }
        if (arg1 == 1) {
            this.method828(5120, -119, var7, var8);
            this.method828(16384, -119, var7 + 1, var8);
            this.method828(65536, -111, var7, var8 + 1);
        }
        if (arg1 == 2) {
            this.method828(20480, -122, var7, var8);
            this.method828(65536, -126, var7, var8 + 1);
            this.method828(1024, -115, var7 - 1, var8);
        }
        if (arg1 == 3) {
            this.method828(81920, -106, var7, var8);
            this.method828(1024, -107, var7 - 1, var8);
            this.method828(4096, -106, var7, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IIIIIIIII)Z", line = 351)
    public final boolean method815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1827++;
        if (arg0 > 1) {
            return this.method813(arg1, arg2, arg0, 2, arg0, arg3, arg5, arg8, arg7) ? true : this.method823(arg1, arg6, arg3, arg5, arg2, arg0, arg8, arg0, arg7, false);
        }
        int var10 = arg5 + arg8 - 1;
        int var11 = arg2 + arg7 - 1;
        if (arg8 <= arg1 && arg1 <= var10 && arg3 >= arg7 && arg3 <= var11) {
            return true;
        } else if (arg8 - 1 == arg1 && arg7 <= arg3 && var11 >= arg3 && (this.field1828[arg1 - this.field1826][arg3 - this.field1843] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg3 >= arg7 && var11 >= arg3 && (this.field1828[arg1 - this.field1826][arg3 - this.field1843] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if ((arg7 - 1) == arg3 && arg1 >= arg8 && var10 >= arg1 && (this.field1828[arg1 - this.field1826][arg3 - this.field1843] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            int var12 = 19 % ((-arg4 - 68) / 33);
            return (var11 + 1) == arg3 && arg1 >= arg8 && var10 >= arg1 && (this.field1828[arg1 - this.field1826][arg3 - this.field1843] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 402)
    public static void method816(boolean arg0) {
        field1853 = null;
        field1842 = null;
        if (arg0) {
            method826((class217) null, (byte) -105);
        }
        field1820 = null;
        field1839 = null;
        field1834 = null;
        field1855 = null;
        field1835 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIII)Z", line = 426)
    public final boolean method817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1831++;
        if (arg0 == 1) {
            if (arg4 == arg6 && arg2 == arg5) {
                return true;
            }
        } else if (arg6 <= arg4 && arg0 + arg6 - 1 >= arg4 && arg2 <= arg2 && (arg0 + arg2 - 1) >= arg2) {
            return true;
        }
        int var9 = arg6 - this.field1826;
        if (arg3 != 0) {
            field1853 = (class40) null;
        }
        int var10 = arg5 - this.field1843;
        int var11 = arg2 - this.field1843;
        int var12 = arg4 - this.field1826;
        if (arg0 == 1) {
            if (arg7 == 0) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field1828[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field1828[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field1828[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field1828[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field1828[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field1828[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field1828[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field1828[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field1828[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field1828[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field1828[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg0 - 1;
            int var14 = arg0 + var10 - 1;
            if (arg7 == 0) {
                if (arg1 == 0) {
                    if ((var12 - arg0) == var9 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 + 1 == var10 && (this.field1828[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 - arg0) == var10 && (this.field1828[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 - arg0) == var9 && var10 <= var11 && var11 <= var14 && (this.field1828[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var14 >= var11 && (this.field1828[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 + 1) == var10 && (this.field1828[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 - arg0) == var10 && (this.field1828[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 <= var12 && var13 >= var12 && (var11 - arg0) == var10) {
                        return true;
                    }
                    if ((var12 - arg0) == var9 && var11 >= var10 && var14 >= var11 && (this.field1828[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var14 >= var11 && (this.field1828[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg1 == 0) {
                    if (var12 - arg0 == var9 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14 && (this.field1828[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 - arg0 == var10 && (this.field1828[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - arg0 == var9 && var11 >= var10 && var14 >= var11 && (this.field1828[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 - arg0) == var10 && (this.field1828[var12][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - arg0 == var9 && var11 >= var10 && var11 <= var14 && (this.field1828[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 + 1) == var10 && (this.field1828[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 - arg0 == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 - arg0 == var9 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field1828[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var14 >= var11 && (this.field1828[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 - arg0) == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 <= var12 && var12 <= var13 && (var11 + 1) == var10 && (this.field1828[var12][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 >= var9 && var13 >= var12 && var11 - arg0 == var10 && (this.field1828[var12][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var12 - arg0 == var9 && var11 >= var10 && var11 <= var14 && (this.field1828[var13][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14 && (this.field1828[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 807)
    public final void method818(int arg0) {
        field1846++;
        int var2 = 0;
        int var3 = -70 / ((arg0 + 34) / 50);
        while (var2 < this.field1832) {
            for (int var4 = 0; var4 < this.field1836; var4++) {
                if (var2 == 0 || var4 == 0 || this.field1832 - 5 <= var2 || var4 >= this.field1836 - 5) {
                    this.field1828[var2][var4] = 16777215;
                } else {
                    this.field1828[var2][var4] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILgi;)V", line = 838)
    public static final void method819(int arg0, class306 arg1) {
        arg1.field5169 = false;
        if (arg1.field5115 != -1) {
            class312 var2 = class53.method362((byte) 109, arg1.field5115);
            if (var2 == null || var2.field5226 == null) {
                arg1.field5115 = -1;
            } else {
                arg1.field5158++;
                if (var2.field5226.length > arg1.field5175 && arg1.field5158 > var2.field5236[arg1.field5175]) {
                    arg1.field5175++;
                    arg1.field5158 = 1;
                    class176.method1265(120, class230.field3820 == arg1, arg1.field5175, arg1.field5168, var2, arg1.field5147);
                }
                if (arg1.field5175 >= var2.field5226.length) {
                    arg1.field5175 = 0;
                    arg1.field5158 = 0;
                    class176.method1265(14, class230.field3820 == arg1, arg1.field5175, arg1.field5168, var2, arg1.field5147);
                }
            }
        }
        field1822++;
        if (arg0 != 19660) {
            method816(true);
        }
        if (arg1.field5112 != -1 && class319.field5393 >= arg1.field5107) {
            int var3 = class259.method1799(arg0 ^ 0x1CE3, arg1.field5112).field4508;
            if (var3 == -1) {
                arg1.field5112 = -1;
            } else {
                class312 var4 = class53.method362((byte) 105, var3);
                if (var4 == null || var4.field5226 == null) {
                    arg1.field5112 = -1;
                } else {
                    if (arg1.field5119 < 0) {
                        arg1.field5119 = 0;
                        class176.method1265(-104, class230.field3820 == arg1, 0, arg1.field5168, var4, arg1.field5147);
                    }
                    arg1.field5097++;
                    if (var4.field5226.length > arg1.field5119 && var4.field5236[arg1.field5119] < arg1.field5097) {
                        arg1.field5119++;
                        arg1.field5097 = 1;
                        class176.method1265(24, class230.field3820 == arg1, arg1.field5119, arg1.field5168, var4, arg1.field5147);
                    }
                    if (var4.field5226.length <= arg1.field5119) {
                        arg1.field5112 = -1;
                    }
                }
            }
        }
        if (arg1.field5136 != -1 && arg1.field5135 <= 1) {
            class312 var5 = class53.method362((byte) -27, arg1.field5136);
            if (var5.field5250 == 1 && arg1.field5156 > 0 && class319.field5393 >= arg1.field5109 && arg1.field5144 < class319.field5393) {
                arg1.field5135 = 1;
                return;
            }
        }
        if (arg1.field5136 != -1 && arg1.field5135 == 0) {
            class312 var6 = class53.method362((byte) 125, arg1.field5136);
            if (var6 == null || var6.field5226 == null) {
                arg1.field5136 = -1;
            } else {
                arg1.field5172++;
                if (var6.field5226.length > arg1.field5116 && arg1.field5172 > var6.field5236[arg1.field5116]) {
                    arg1.field5116++;
                    arg1.field5172 = 1;
                    class176.method1265(97, class230.field3820 == arg1, arg1.field5116, arg1.field5168, var6, arg1.field5147);
                }
                if (arg1.field5116 >= var6.field5226.length) {
                    arg1.field5111++;
                    arg1.field5116 -= var6.field5228;
                    if (var6.field5241 <= arg1.field5111) {
                        arg1.field5136 = -1;
                    } else if (arg1.field5116 >= 0 && var6.field5226.length > arg1.field5116) {
                        class176.method1265(arg0 ^ 0x4CEE, class230.field3820 == arg1, arg1.field5116, arg1.field5168, var6, arg1.field5147);
                    } else {
                        arg1.field5136 = -1;
                    }
                }
                arg1.field5169 = var6.field5248;
            }
        }
        if (arg1.field5135 > 0) {
            arg1.field5135--;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 992)
    public final void method820(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1826;
        field1854++;
        int var5 = arg2 - this.field1843;
        if (arg0 != 0) {
            field1834 = (class229) null;
        }
        this.field1828[var4][var5] = class201.method1410(this.field1828[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BII)V", line = 1014)
    public final void method821(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1843;
        if (arg0 != 16) {
            field1851 = false;
        }
        field1844++;
        int var5 = arg1 - this.field1826;
        this.field1828[var5][var4] = class201.method1410(this.field1828[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)V", line = 1036)
    public final void method822(int arg0, int arg1, byte arg2) {
        field1848++;
        int var4 = arg1 - this.field1826;
        int var5 = arg0 - this.field1843;
        this.field1828[var4][var5] = class243.method1696(this.field1828[var4][var5], -262145);
        if (arg2 <= 110) {
            this.field1828 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIIZ)Z", line = 1052)
    private final boolean method823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg9) {
            field1835 = (class229) null;
        }
        field1838++;
        int var11 = arg0 + arg5;
        int var12 = arg2 + arg7;
        int var13 = arg3 + arg6;
        int var14 = arg4 + arg8;
        if (arg0 >= arg6 && var13 > arg0) {
            if (arg8 == var12 && (arg1 & 0x4) == 0) {
                int var15 = arg0;
                int var16 = var13 < var11 ? var13 : var11;
                while (var16 > var15) {
                    if ((this.field1828[var15 - this.field1826][var12 - this.field1843 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg2 == var14 && (arg1 & 0x1) == 0) {
                int var17 = arg0;
                int var18 = var13 < var11 ? var13 : var11;
                while (var18 > var17) {
                    if ((this.field1828[var17 - this.field1826][arg2 - this.field1843] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg6 < var11 && var11 <= var13) {
            if (arg8 == var12 && (arg1 & 0x4) == 0) {
                for (int var19 = arg6; var19 < var11; var19++) {
                    if ((this.field1828[var19 - this.field1826][var12 - this.field1843 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var14 && (arg1 & 0x1) == 0) {
                for (int var20 = arg6; var20 < var11; var20++) {
                    if ((this.field1828[var20 - this.field1826][arg2 - this.field1843] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg2 >= arg8 && var14 > arg2) {
            if (arg6 == var11 && (arg1 & 0x8) == 0) {
                int var21 = arg2;
                int var22 = var12 <= var14 ? var12 : var14;
                while (var22 > var21) {
                    if ((this.field1828[var11 - this.field1826 - 1][var21 - this.field1843] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg0 == var13 && (arg1 & 0x2) == 0) {
                int var23 = var14 >= var12 ? var12 : var14;
                for (int var24 = arg2; var24 < var23; var24++) {
                    if ((this.field1828[arg0 - this.field1826][var24 - this.field1843] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var12 > arg8 && var12 <= var14) {
            if (arg6 == var11 && (arg1 & 0x8) == 0) {
                for (int var25 = arg8; var25 < var12; var25++) {
                    if ((this.field1828[var11 - (this.field1826 + 1)][var25 - this.field1843] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var13 && (arg1 & 0x2) == 0) {
                for (int var26 = arg8; var26 < var12; var26++) {
                    if ((this.field1828[arg0 - this.field1826][var26 - this.field1843] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)Z", line = 1214)
    public final boolean method824(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1856++;
        if (arg2 == arg4 && arg0 == arg3) {
            return true;
        }
        int var6 = arg3 - this.field1843;
        int var7 = arg4 - this.field1826;
        if (var7 < 0 || var7 >= this.field1832 || var6 < 0 || var6 >= this.field1836) {
            return false;
        }
        int var8 = arg0 - this.field1843;
        int var9;
        if (var8 >= var6) {
            var9 = var8 - var6;
        } else {
            var9 = var6 - var8;
        }
        int var10 = arg2 - this.field1826;
        int var11;
        if (var10 >= var7) {
            var11 = var10 - var7;
        } else {
            var11 = var7 - var10;
        }
        if (var9 >= var11) {
            int var12 = var11 * 65536 / var9;
            int var13 = 32768;
            while (var6 != var8) {
                if (var8 < var6) {
                    if ((this.field1828[var10][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field1828[var10][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var10 < var7) {
                        if ((this.field1828[var10][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var10++;
                    } else if (var7 < var10) {
                        if ((this.field1828[var10][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var10--;
                    }
                }
            }
        } else {
            int var14 = var9 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var10) {
                if (var10 < var7) {
                    if ((this.field1828[var10][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var10++;
                } else if (var7 < var10) {
                    if ((this.field1828[var10][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var10--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 < var6) {
                        if ((this.field1828[var10][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field1828[var10][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        if ((this.field1828[var7][var6] & 0x1240100) == 0) {
            return arg1 == 1 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)V", line = 1380)
    private final void method825(int arg0, int arg1, int arg2, int arg3) {
        this.field1828[arg1][arg3] = class243.method1696(this.field1828[arg1][arg3], ~arg2);
        field1837++;
        if (arg0 != -1) {
            this.method811(-2, -22, -123, -34, 40, (byte) -81, false);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lrd;B)V", line = 1398)
    public static final void method826(class217 arg0, byte arg1) {
        field1824++;
        if (arg1 < 109) {
            return;
        }
        for (class332 var2 = (class332) class299.field4866.method1580((byte) -39); var2 != null; var2 = (class332) class299.field4866.method1579((byte) 28)) {
            if (var2.field5655 == arg0) {
                if (var2.field5662 != null) {
                    class239.field3949.method2150(var2.field5662);
                    var2.field5662 = null;
                }
                var2.method598(126);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lri;BLph;)Lph;", line = 1435)
    public static final class229 method827(class301 arg0, byte arg1, class229 arg2) {
        if (arg2.method1611(class107.field1813, 24104) != -1) {
            label63: while (true) {
                int var3 = arg2.method1611(class308.field5193, 24104);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method1611(class285.field4697, 24104);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method1611(class36.field596, 24104);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method1611(class161.field2604, 24104);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method1611(class296.field4831, 24104);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method1611(class122.field2044, 24104);
                                                        if (var8 == -1) {
                                                            break label63;
                                                        }
                                                        class229 var9 = class134.field2172;
                                                        if (class180.field2950 != null) {
                                                            var9 = class200.method1407(class180.field2950.field4124, -23345);
                                                            try {
                                                                if (class180.field2950.field4123 != null) {
                                                                    byte[] var10 = ((String) class180.field2950.field4123).getBytes("ISO-8859-1");
                                                                    var9 = class27.method184((byte) 59, var10, var10.length, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var13) {
                                                            }
                                                        }
                                                        arg2 = class248.method1746(8528, new class229[] { arg2.method1623(0, -30201, var8), var9, arg2.method1640(var8 + 4, -76) });
                                                    }
                                                }
                                                arg2 = class248.method1746(8528, new class229[] { arg2.method1623(0, -30201, var7), class287.method1970((byte) -79, class69.method539(arg0, 4, -254567536)), arg2.method1640(var7 + 2, -89) });
                                            }
                                        }
                                        arg2 = class248.method1746(8528, new class229[] { arg2.method1623(0, -30201, var6), class287.method1970((byte) -127, class69.method539(arg0, 3, -254567536)), arg2.method1640(var6 + 2, -117) });
                                    }
                                }
                                arg2 = class248.method1746(8528, new class229[] { arg2.method1623(0, -30201, var5), class287.method1970((byte) -55, class69.method539(arg0, 2, -254567536)), arg2.method1640(var5 + 2, -76) });
                            }
                        }
                        arg2 = class248.method1746(8528, new class229[] { arg2.method1623(0, -30201, var4), class287.method1970((byte) -81, class69.method539(arg0, 1, -254567536)), arg2.method1640(var4 + 2, -73) });
                    }
                }
                arg2 = class248.method1746(8528, new class229[] { arg2.method1623(0, -30201, var3), class287.method1970((byte) -100, class69.method539(arg0, 0, -254567536)), arg2.method1640(var3 + 2, -120) });
            }
        }
        int var12 = 89 % ((arg1 + 20) / 58);
        field1823++;
        return arg2;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IIII)V", line = 1530)
    private final void method828(int arg0, int arg1, int arg2, int arg3) {
        this.field1828[arg3][arg2] = class201.method1410(this.field1828[arg3][arg2], arg0);
        if (arg1 >= -104) {
            field1834 = (class229) null;
        }
        field1825++;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IIIII)V", line = 1544)
    public static final void method829(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg2; var5 < class15.field186; var5++) {
            if (arg0 < class311.field5222[var5] + class113.field1921[var5] && arg0 + arg3 > class311.field5222[var5] && arg1 < class45.field691[var5] + class300.field4875[var5] && class300.field4875[var5] < arg1 + arg4) {
                class189.field3067[var5] = true;
            }
        }
        field1819++;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IIIIIIII)Z", line = 1564)
    public final boolean method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1841++;
        if (arg4 == 1) {
            if (arg3 == arg7 && arg0 == arg2) {
                return true;
            }
        } else if (arg3 <= arg7 && arg3 + arg4 - 1 >= arg7 && arg0 <= arg0 && arg0 <= arg0 + arg4 - 1) {
            return true;
        }
        int var9 = arg2 - this.field1843;
        int var10 = arg7 - this.field1826;
        int var11 = arg0 - this.field1843;
        int var12 = arg3 - this.field1826;
        if (arg1 <= 72) {
            this.field1836 = -52;
        }
        if (arg4 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1828[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field1828[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1828[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field1828[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field1828[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field1828[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field1828[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field1828[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field1828[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var9 && (this.field1828[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field1828[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field1828[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var12 - 1;
            int var14 = var9 + arg4 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14 && (this.field1828[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 - arg4 == var9 && (this.field1828[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - arg4 == var12 && var9 <= var11 && var11 <= var14 && (this.field1828[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 - arg4 == var9 && (this.field1828[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 - arg4) == var12 && var11 >= var9 && var14 >= var11 && (this.field1828[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var11 + 1) == var9 && (this.field1828[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 + 1 == var12 && var11 >= var9 && var11 <= var14 && (this.field1828[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var11 + 1) == var9 && (this.field1828[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 >= var12 && var13 >= var10 && var11 + 1 == var9 && (this.field1828[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && (var11 - arg4) == var9 && (this.field1828[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg4) == var12 && var9 <= var11 && var11 <= var14 && (this.field1828[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var11 >= var9 && var14 >= var11 && (this.field1828[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(II)V", line = 1752)
    public class108(int arg0, int arg1) {
        this.field1836 = arg1;
        this.field1832 = arg0;
        this.field1843 = 0;
        this.field1828 = new int[this.field1832][this.field1836];
        this.field1826 = 0;
        this.method818(30);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIZZ)V", line = 1766)
    public final void method831(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        int var7 = arg3 - this.field1826;
        int var8 = arg1 - this.field1843;
        field1829++;
        if (!arg5) {
            this.field1843 = 75;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method825(-1, var7, 128, var8);
                this.method825(-1, var7 - 1, 8, var8);
            }
            if (arg0 == 1) {
                this.method825(-1, var7, 2, var8);
                this.method825(-1, var7, 32, var8 + 1);
            }
            if (arg0 == 2) {
                this.method825(-1, var7, 8, var8);
                this.method825(-1, var7 + 1, 128, var8);
            }
            if (arg0 == 3) {
                this.method825(-1, var7, 32, var8);
                this.method825(-1, var7, 2, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method825(-1, var7, 1, var8);
                this.method825(-1, var7 - 1, 16, var8 + 1);
            }
            if (arg0 == 1) {
                this.method825(-1, var7, 4, var8);
                this.method825(-1, var7 + 1, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method825(-1, var7, 16, var8);
                this.method825(-1, var7 + 1, 1, var8 - 1);
            }
            if (arg0 == 3) {
                this.method825(-1, var7, 64, var8);
                this.method825(-1, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method825(-1, var7, 130, var8);
                this.method825(-1, var7 - 1, 8, var8);
                this.method825(-1, var7, 32, var8 + 1);
            }
            if (arg0 == 1) {
                this.method825(-1, var7, 10, var8);
                this.method825(-1, var7, 32, var8 + 1);
                this.method825(-1, var7 + 1, 128, var8);
            }
            if (arg0 == 2) {
                this.method825(-1, var7, 40, var8);
                this.method825(-1, var7 + 1, 128, var8);
                this.method825(-1, var7, 2, var8 - 1);
            }
            if (arg0 == 3) {
                this.method825(-1, var7, 160, var8);
                this.method825(-1, var7, 2, var8 - 1);
                this.method825(-1, var7 - 1, 8, var8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method825(-1, var7, 65536, var8);
                this.method825(-1, var7 - 1, 4096, var8);
            }
            if (arg0 == 1) {
                this.method825(-1, var7, 1024, var8);
                this.method825(-1, var7, 16384, var8 + 1);
            }
            if (arg0 == 2) {
                this.method825(-1, var7, 4096, var8);
                this.method825(-1, var7 + 1, 65536, var8);
            }
            if (arg0 == 3) {
                this.method825(-1, var7, 16384, var8);
                this.method825(-1, var7, 1024, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method825(-1, var7, 512, var8);
                this.method825(-1, var7 - 1, 8192, var8 + 1);
            }
            if (arg0 == 1) {
                this.method825(-1, var7, 2048, var8);
                this.method825(-1, var7 + 1, 32768, var8 + 1);
            }
            if (arg0 == 2) {
                this.method825(-1, var7, 8192, var8);
                this.method825(-1, var7 + 1, 512, var8 - 1);
            }
            if (arg0 == 3) {
                this.method825(-1, var7, 32768, var8);
                this.method825(-1, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method825(-1, var7, 66560, var8);
            this.method825(-1, var7 - 1, 4096, var8);
            this.method825(-1, var7, 16384, var8 + 1);
        }
        if (arg0 == 1) {
            this.method825(-1, var7, 5120, var8);
            this.method825(-1, var7, 16384, var8 + 1);
            this.method825(-1, var7 + 1, 65536, var8);
        }
        if (arg0 == 2) {
            this.method825(-1, var7, 20480, var8);
            this.method825(-1, var7 + 1, 65536, var8);
            this.method825(-1, var7, 1024, var8 - 1);
        }
        if (arg0 == 3) {
            this.method825(-1, var7, 81920, var8);
            this.method825(-1, var7, 1024, var8 - 1);
            this.method825(-1, var7 - 1, 4096, var8);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V", line = 1973)
    public static final void method832(int arg0, int arg1) {
        field1849++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class255.field4263[arg0];
        int var3 = class293.field4788[arg0];
        int var4 = (int) class27.field409[arg0];
        int var5 = class53.field748[arg0];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        long var6 = class27.field409[arg0];
        if (var5 == 25) {
            if (var4 == 0) {
                class95.field1608 = true;
                class30.method230(class298.field4849, var2, var3);
            } else if (class27.field378 > 0 && class94.field1583[82] && class94.field1583[81]) {
                class257.method1789(0, class298.field4849, class1.field1 + var3, class1.field9 + var2);
            } else {
                class121.field2033.method37(arg1 + 87, 204);
                class121.field2033.method1180(arg1 + 127, class1.field9 + var2);
                class217.field3562++;
                class121.field2033.method1180(87, class1.field1 + var3);
            }
        }
        if (var5 == 31) {
            class121.field2033.method37(arg1 ^ 0x62, 9);
            class121.field2033.method1155(-1640531527, var4);
            class165.field2695++;
            class121.field2033.method1168(var3, (byte) -81);
            class121.field2033.method1180(arg1 ^ 0x63, var2);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 32) {
            if (class166.field2710 == 1) {
                class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, arg1 ^ 0xFFFFA100, 0, 2, false, 0);
            } else {
                boolean var8 = class226.method1568(0, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 0, var2, 0, -24320, 0, 2, false, 0);
                if (!var8) {
                    class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, -24320, 0, 2, false, 0);
                }
            }
            class256.field4281 = class220.field3613;
            class120.field2029 = class48.field697;
            class224.field3678++;
            class271.field4538 = 2;
            class43.field666 = 0;
            class121.field2033.method37(120, 150);
            class121.field2033.method1160(var4, arg1 - 1247507120);
            class121.field2033.method1170(false, class1.field1 + var3);
            class121.field2033.method1170(false, var2 + class1.field9);
        }
        if (var5 == 46) {
            class241.field3985++;
            class121.field2033.method37(14, 239);
            class121.field2033.method1168(var3, (byte) -110);
            class301 var10 = class206.method1440(var3, (byte) -68);
            if (var10.field4968 != null && var10.field4968[0][0] == 5) {
                int var11 = var10.field4968[0][1];
                class166.field2711[var11] = 1 - class166.field2711[var11];
                class198.method1395(var11, 13357);
            }
        }
        if (var5 == 4) {
            class121.field2033.method37(arg1 ^ 0x3C, 191);
            class206.field3399++;
            class121.field2033.method1155(-1640531527, var4);
            class121.field2033.method1180(90, var2);
            class121.field2033.method1165(arg1 + 3, var3);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 5) {
            class68.field1090++;
            if (class166.field2710 == 1) {
                class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, -24320, 0, 2, false, 0);
            } else {
                boolean var12 = class226.method1568(0, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 0, var2, 0, -24320, 0, 2, false, 0);
                if (!var12) {
                    class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, -24320, 0, 2, false, 0);
                }
            }
            class271.field4538 = 2;
            class256.field4281 = class220.field3613;
            class120.field2029 = class48.field697;
            class43.field666 = 0;
            class121.field2033.method37(83, 56);
            class121.field2033.method1180(arg1 ^ 0x26, class1.field1 + var3);
            class121.field2033.method1160(var2 + class1.field9, -1247507120);
            class121.field2033.method1155(-1640531527, var4);
        }
        if (var5 == 44) {
            class129.field2112++;
            class121.field2033.method37(82, 242);
            class121.field2033.method1180(46, var2);
            class121.field2033.method1180(108, var4);
            class121.field2033.method1207((byte) -2, var3);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 59) {
            class121.field2033.method37(104, 60);
            class121.field2033.method1180(arg1 ^ 0x58, var4);
            class269.field4513++;
            class121.field2033.method1170(false, var2);
            class121.field2033.method1207((byte) -2, var3);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 2) {
            class209 var14 = class114.field1931[var4];
            if (var14 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var14.field5159[0], class230.field3820.field5104[0], 1, var14.field5104[0], 0, arg1 ^ 0xFFFFA100, 0, 2, false, 0);
                class271.field4538 = 2;
                class43.field666 = 0;
                class256.field4281 = class220.field3613;
                class120.field2029 = class48.field697;
                class44.field676++;
                class121.field2033.method37(34, 59);
                class121.field2033.method1180(arg1 ^ 0x41, var4);
            }
        }
        if (var5 == 45) {
            class217 var15 = class187.field3035[var4];
            if (var15 != null) {
                class58.field815++;
                class226.method1568(1, class230.field3820.field5159[0], var15.field5159[0], class230.field3820.field5104[0], 1, var15.field5104[0], 0, -24320, 0, 2, false, 0);
                class271.field4538 = 2;
                class120.field2029 = class48.field697;
                class256.field4281 = class220.field3613;
                class43.field666 = 0;
                class121.field2033.method37(arg1 + 62, 151);
                class121.field2033.method1155(-1640531527, var4);
            }
        }
        if (var5 == 35) {
            class263.field4391++;
            boolean var16 = class226.method1568(0, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 0, var2, 0, -24320, 0, 2, false, 0);
            if (!var16) {
                class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, -24320, 0, 2, false, 0);
            }
            class43.field666 = 0;
            class256.field4281 = class220.field3613;
            class271.field4538 = 2;
            class120.field2029 = class48.field697;
            class121.field2033.method37(117, 170);
            class121.field2033.method1170(false, class1.field1 + var3);
            class121.field2033.method1170(false, class165.field2701);
            class121.field2033.method1170(false, var4);
            class121.field2033.method1207((byte) -2, class45.field689);
            class121.field2033.method1160(class1.field9 + var2, -1247507120);
        }
        if (var5 == 40) {
            class209 var18 = class114.field1931[var4];
            if (var18 != null) {
                class22.field294++;
                class226.method1568(1, class230.field3820.field5159[0], var18.field5159[0], class230.field3820.field5104[0], 1, var18.field5104[0], 0, -24320, 0, 2, false, 0);
                class271.field4538 = 2;
                class43.field666 = 0;
                class120.field2029 = class48.field697;
                class256.field4281 = class220.field3613;
                class121.field2033.method37(17, 119);
                class121.field2033.method1155(arg1 - 1640531527, var4);
            }
        }
        if (var5 == 10) {
            class75.field1262++;
            class103.method795(var6, arg1 + 3, var2, var3);
            class121.field2033.method37(65, 244);
            class121.field2033.method1170(false, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class121.field2033.method1160(class1.field1 + var3, -1247507120);
            class121.field2033.method1180(118, class1.field9 + var2);
        }
        if (var5 == 47) {
            class217 var19 = class187.field3035[var4];
            if (var19 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var19.field5159[0], class230.field3820.field5104[0], 1, var19.field5104[0], 0, arg1 - 24320, 0, 2, false, 0);
                class271.field4538 = 2;
                class256.field4281 = class220.field3613;
                class120.field2029 = class48.field697;
                class43.field666 = 0;
                class121.field2033.method37(100, 231);
                class121.field2033.method1160(var4, -1247507120);
                class233.field3854++;
                class121.field2033.method1169((byte) -74, class45.field689);
                class121.field2033.method1180(92, class165.field2701);
            }
        }
        if (var5 == 29) {
            class121.field2033.method37(117, 103);
            class277.field4602++;
            class121.field2033.method1180(31, var4);
            class121.field2033.method1207((byte) -2, var3);
            class121.field2033.method1180(49, var2);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 19) {
            class325.field5563++;
            class103.method795(var6, 3, var2, var3);
            class121.field2033.method37(15, 248);
            class121.field2033.method1155(-1640531527, class1.field1 + var3);
            class121.field2033.method1160(class1.field9 + var2, -1247507120);
            class121.field2033.method1170(false, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var5 == 58) {
            class259.field4320++;
            class103.method795(var6, 3, var2, var3);
            class121.field2033.method37(73, 99);
            class121.field2033.method1155(arg1 ^ 0x9E3779B9, class1.field9 + var2);
            class121.field2033.method1170(false, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class121.field2033.method1160(class1.field1 + var3, -1247507120);
        }
        if (var5 == 3 && class156.field2535 == null) {
            class143.method1025(var3, var2, -11981);
            class156.field2535 = class167.method1224(var2, 111, var3);
            class296.method2006(class156.field2535, 126);
        }
        if (var5 == 50) {
            class121.field2033.method37(16, 196);
            class121.field2033.method1165(3, var3);
            class121.field2033.method1180(70, class165.field2701);
            class207.field3408++;
            class121.field2033.method1169((byte) -74, class45.field689);
            class121.field2033.method1180(61, var2);
        }
        if (var5 == 8) {
            class1.field3++;
            if (class166.field2710 == 1) {
                class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, -24320, 0, 2, false, 0);
            } else {
                boolean var20 = class226.method1568(0, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 0, var2, 0, -24320, 0, 2, false, 0);
                if (!var20) {
                    class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, -24320, 0, 2, false, 0);
                }
            }
            class271.field4538 = 2;
            class120.field2029 = class48.field697;
            class256.field4281 = class220.field3613;
            class43.field666 = 0;
            class121.field2033.method37(37, 34);
            class121.field2033.method1155(arg1 ^ 0x9E3779B9, class1.field9 + var2);
            class121.field2033.method1160(var4, -1247507120);
            class121.field2033.method1160(var3 + class1.field1, -1247507120);
        }
        if (var5 == 28) {
            boolean var22 = true;
            class301 var23 = class206.method1440(var3, (byte) -68);
            if (var23.field4996 > 0) {
                var22 = class205.method1436(var23, -122);
            }
            if (var22) {
                class241.field3985++;
                class121.field2033.method37(64, 239);
                class121.field2033.method1168(var3, (byte) -72);
            }
        }
        if (var5 == 24) {
            class204.field3361++;
            class121.field2033.method37(72, 70);
            class121.field2033.method1165(3, var3);
            class121.field2033.method1170(false, var2);
            class121.field2033.method1170(false, var4);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 22) {
            class306.method2068(10606);
        }
        if (var5 == 43) {
            class209 var24 = class114.field1931[var4];
            if (var24 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var24.field5159[0], class230.field3820.field5104[0], 1, var24.field5104[0], 0, -24320, 0, 2, false, 0);
                class51.field728++;
                class256.field4281 = class220.field3613;
                class43.field666 = 0;
                class271.field4538 = 2;
                class120.field2029 = class48.field697;
                class121.field2033.method37(41, 177);
                class121.field2033.method1169((byte) -74, class45.field689);
                class121.field2033.method1155(-1640531527, class165.field2701);
                class121.field2033.method1160(var4, -1247507120);
            }
        }
        if (var5 == 48) {
            if (var4 == 0) {
                class30.method230(class298.field4849, var2, var3);
            } else if (var4 == 1) {
                if (class27.field378 > 0 && class94.field1583[82] && class94.field1583[81]) {
                    class257.method1789(0, class298.field4849, class1.field1 + var3, class1.field9 - -var2);
                } else if (class226.method1568(0, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 0, var2, 0, -24320, 0, 1, true, 0)) {
                    class121.field2033.method1188(arg1 - 122, class224.field3683);
                    class121.field2033.method1188(arg1 - 119, class176.field2891);
                    class121.field2033.method1155(-1640531527, class147.field2379);
                    class121.field2033.method1188(-81, 57);
                    class121.field2033.method1188(arg1 ^ 0xFFFFFFB0, class249.field4134);
                    class121.field2033.method1188(-96, class260.field4341);
                    class121.field2033.method1188(arg1 - 114, 89);
                    class121.field2033.method1155(-1640531527, class230.field3820.field5147);
                    class121.field2033.method1155(-1640531527, class230.field3820.field5168);
                    class121.field2033.method1188(-109, class228.field3746);
                    class121.field2033.method1188(-72, 63);
                }
            }
        }
        if (var5 == 1001) {
            class301 var25 = class206.method1440(var3, (byte) -68);
            if (var25 == null || var25.field4909[var2] < 100000) {
                class121.field2033.method37(70, 205);
                class26.field338++;
                class121.field2033.method1160(var4, arg1 - 1247507120);
            } else {
                class205.method1439(class248.method1746(8528, new class229[] { class50.method354(arg1, var25.field4909[var2]), class304.field5087, class124.method920(-84, var4).field3154 }), true, 0, class134.field2172);
            }
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 1) {
            if (var4 == 0) {
                class200.field3307 = true;
                class30.method230(class298.field4849, var2, var3);
            } else if (var4 == 1) {
                class206.field3394++;
                class121.field2033.method37(21, 29);
                class121.field2033.method1165(3, class45.field689);
                class121.field2033.method1170(false, class165.field2701);
                class121.field2033.method1160(class1.field1 + var3, -1247507120);
                class121.field2033.method1155(arg1 - 1640531527, class1.field9 + var2);
            }
        }
        if (var5 == 42) {
            class82.field1332++;
            boolean var26 = class226.method1568(0, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 0, var2, 0, -24320, 0, 2, false, 0);
            if (!var26) {
                class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, arg1 ^ 0xFFFFA100, 0, 2, false, 0);
            }
            class120.field2029 = class48.field697;
            class256.field4281 = class220.field3613;
            class43.field666 = 0;
            class271.field4538 = 2;
            class121.field2033.method37(42, 149);
            class121.field2033.method1155(arg1 ^ 0x9E3779B9, class1.field9 + var2);
            class121.field2033.method1155(-1640531527, class228.field3743);
            class121.field2033.method1170(false, class102.field1740);
            class121.field2033.method1170(false, class1.field1 + var3);
            class121.field2033.method1155(-1640531527, var4);
            class121.field2033.method1169((byte) -74, class43.field658);
        }
        if (var5 == 12) {
            class209 var28 = class114.field1931[var4];
            if (var28 != null) {
                class143.field2327++;
                class226.method1568(1, class230.field3820.field5159[0], var28.field5159[0], class230.field3820.field5104[0], 1, var28.field5104[0], 0, -24320, 0, 2, false, 0);
                class43.field666 = 0;
                class256.field4281 = class220.field3613;
                class271.field4538 = 2;
                class120.field2029 = class48.field697;
                class121.field2033.method37(arg1 ^ 0x1B, 175);
                class121.field2033.method1155(-1640531527, class228.field3743);
                class121.field2033.method1160(class102.field1740, arg1 - 1247507120);
                class121.field2033.method1155(-1640531527, var4);
                class121.field2033.method1169((byte) -74, class43.field658);
            }
        }
        if (var5 == 1005) {
            class271.field4538 = 2;
            class256.field4281 = class220.field3613;
            class120.field2029 = class48.field697;
            class43.field666 = 0;
            class26.field338++;
            class121.field2033.method37(39, 205);
            class121.field2033.method1160(var4, -1247507120);
        }
        if (var5 == 6) {
            class121.field2033.method37(82, 239);
            class241.field3985++;
            class121.field2033.method1168(var3, (byte) -66);
            class301 var29 = class206.method1440(var3, (byte) -68);
            if (var29.field4968 != null && var29.field4968[0][0] == 5) {
                int var30 = var29.field4968[0][1];
                if (class166.field2711[var30] != var29.field5035[0]) {
                    class166.field2711[var30] = var29.field5035[0];
                    class198.method1395(var30, 13357);
                }
            }
        }
        if (var5 == 14 || var5 == 1004) {
            class285.method1963(class141.field2282[arg0], var3, (byte) 6, var4, var2);
        }
        if (var5 == 34) {
            class301 var49 = class167.method1224(var2, 110, var3);
            if (var49 != null) {
                class135.method959((byte) 114);
                class190.method1325(var3, -69, class122.method911(client.method2168(var49), (byte) -26), var2);
                class317.field5381 = 0;
                class116.field1965 = class68.method538(var49, (byte) 66);
                if (class116.field1965 == null) {
                    class116.field1965 = class171.field2806;
                }
                if (var49.field5043) {
                    class205.field3388 = class248.method1746(8528, new class229[] { var49.field4913, class330.field5627 });
                } else {
                    class205.field3388 = class248.method1746(8528, new class229[] { class316.field5368, var49.field5011, class330.field5627 });
                }
            }
            return;
        }
        if (var5 == 9) {
            class209 var31 = class114.field1931[var4];
            if (var31 != null) {
                class176.field2885++;
                class226.method1568(1, class230.field3820.field5159[0], var31.field5159[0], class230.field3820.field5104[0], 1, var31.field5104[0], 0, -24320, 0, 2, false, 0);
                class120.field2029 = class48.field697;
                class43.field666 = 0;
                class256.field4281 = class220.field3613;
                class271.field4538 = 2;
                class121.field2033.method37(arg1 ^ 0x29, 203);
                class121.field2033.method1160(var4, arg1 ^ 0xB5A48D50);
            }
        }
        if (var5 == 15) {
            class217 var32 = class187.field3035[var4];
            if (var32 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var32.field5159[0], class230.field3820.field5104[0], 1, var32.field5104[0], 0, -24320, 0, 2, false, 0);
                class120.field2029 = class48.field697;
                class256.field4281 = class220.field3613;
                class139.field2266++;
                class271.field4538 = 2;
                class43.field666 = 0;
                class121.field2033.method37(49, 126);
                class121.field2033.method1160(var4, arg1 - 1247507120);
            }
        }
        if (var5 == 36 && class103.method795(var6, arg1 ^ 0x3, var2, var3)) {
            class142.field2296++;
            class121.field2033.method37(44, 118);
            class121.field2033.method1165(3, class43.field658);
            class121.field2033.method1170(false, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class121.field2033.method1160(class1.field9 + var2, -1247507120);
            class121.field2033.method1160(class102.field1740, arg1 - 1247507120);
            class121.field2033.method1155(-1640531527, class1.field1 + var3);
            class121.field2033.method1180(arg1 ^ 0x19, class228.field3743);
        }
        if (var5 == 18) {
            class217 var33 = class187.field3035[var4];
            if (var33 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var33.field5159[0], class230.field3820.field5104[0], 1, var33.field5104[0], 0, -24320, 0, 2, false, 0);
                class271.field4538 = 2;
                class256.field4281 = class220.field3613;
                class298.field4851++;
                class120.field2029 = class48.field697;
                class43.field666 = 0;
                class121.field2033.method37(15, 130);
                class121.field2033.method1155(arg1 ^ 0x9E3779B9, var4);
                class121.field2033.method1180(92, class228.field3743);
                class121.field2033.method1170(false, class102.field1740);
                class121.field2033.method1207((byte) -2, class43.field658);
            }
        }
        if (var5 == 20) {
            class206.field3396++;
            if (class166.field2710 == 1) {
                class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, -24320, 0, 2, false, 0);
            } else {
                boolean var34 = class226.method1568(0, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 0, var2, 0, -24320, 0, 2, false, 0);
                if (!var34) {
                    class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, -24320, 0, 2, false, 0);
                }
            }
            class271.field4538 = 2;
            class256.field4281 = class220.field3613;
            class120.field2029 = class48.field697;
            class43.field666 = 0;
            class121.field2033.method37(arg1 + 21, 114);
            class121.field2033.method1155(-1640531527, var3 + class1.field1);
            class121.field2033.method1170(false, var4);
            class121.field2033.method1170(false, var2 + class1.field9);
        }
        if (var5 == 37) {
            class285.field4704++;
            class121.field2033.method37(91, 85);
            class121.field2033.method1168(var3, (byte) -127);
            class121.field2033.method1169((byte) -74, class43.field658);
            class121.field2033.method1160(class102.field1740, -1247507120);
            class121.field2033.method1155(-1640531527, var4);
            class121.field2033.method1170(false, var2);
            class121.field2033.method1180(arg1 ^ 0x64, class228.field3743);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 11) {
            class209 var36 = class114.field1931[var4];
            if (var36 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var36.field5159[0], class230.field3820.field5104[0], 1, var36.field5104[0], 0, -24320, 0, 2, false, 0);
                class93.field1574++;
                class43.field666 = 0;
                class271.field4538 = 2;
                class120.field2029 = class48.field697;
                class256.field4281 = class220.field3613;
                class121.field2033.method37(101, 93);
                class121.field2033.method1160(var4, -1247507120);
            }
        }
        if (var5 == 1007) {
            class103.method795(var6, 3, var2, var3);
            class121.field2033.method37(98, 78);
            class190.field3086++;
            class121.field2033.method1180(109, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class121.field2033.method1160(class1.field9 + var2, -1247507120);
            class121.field2033.method1170(false, class1.field1 + var3);
        }
        if (var5 == 23) {
            class209 var37 = class114.field1931[var4];
            if (var37 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var37.field5159[0], class230.field3820.field5104[0], 1, var37.field5104[0], 0, arg1 ^ 0xFFFFA100, 0, 2, false, 0);
                class120.field2029 = class48.field697;
                class43.field666 = 0;
                class271.field4538 = 2;
                class320.field5402++;
                class256.field4281 = class220.field3613;
                class121.field2033.method37(25, 10);
                class121.field2033.method1170(false, var4);
            }
        }
        if (var5 == 38) {
            class209 var38 = class114.field1931[var4];
            if (var38 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var38.field5159[0], class230.field3820.field5104[0], 1, var38.field5104[0], 0, arg1 - 24320, 0, 2, false, 0);
                class43.field666 = 0;
                class271.field4538 = 2;
                class167.field2721++;
                class120.field2029 = class48.field697;
                class256.field4281 = class220.field3613;
                class121.field2033.method37(50, 236);
                class121.field2033.method1160(var4, -1247507120);
            }
        }
        if (var5 == 51) {
            class121.field2033.method37(arg1 ^ 0x37, 90);
            class121.field2033.method1155(-1640531527, var2);
            class145.field2358++;
            class121.field2033.method1170(false, var4);
            class121.field2033.method1169((byte) -74, var3);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 17) {
            class217 var39 = class187.field3035[var4];
            if (var39 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var39.field5159[0], class230.field3820.field5104[0], 1, var39.field5104[0], 0, -24320, 0, 2, false, 0);
                class77.field1282++;
                class120.field2029 = class48.field697;
                class256.field4281 = class220.field3613;
                class43.field666 = 0;
                class271.field4538 = 2;
                class121.field2033.method37(27, 187);
                class121.field2033.method1180(76, var4);
            }
        }
        if (var5 == 30) {
            class135.method959((byte) 125);
            class301 var40 = class206.method1440(var3, (byte) -68);
            class43.field658 = var3;
            class102.field1740 = var4;
            class228.field3743 = var2;
            class317.field5381 = 1;
            class296.method2006(var40, 121);
            class208.field3431 = class248.method1746(8528, new class229[] { class77.field1287, class124.method920(-84, var4).field3154, class330.field5627 });
            if (class208.field3431 == null) {
                class208.field3431 = class250.field4164;
            }
            return;
        }
        if (var5 == 21) {
            class217 var41 = class187.field3035[var4];
            if (var41 != null) {
                class124.field2074++;
                class226.method1568(1, class230.field3820.field5159[0], var41.field5159[0], class230.field3820.field5104[0], 1, var41.field5104[0], 0, -24320, 0, 2, false, 0);
                class271.field4538 = 2;
                class256.field4281 = class220.field3613;
                class120.field2029 = class48.field697;
                class43.field666 = 0;
                class121.field2033.method37(58, 200);
                class121.field2033.method1170(false, var4);
            }
        }
        if (var5 == 41) {
            if (class166.field2710 == 1) {
                class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, arg1 - 24320, 0, 2, false, 0);
            } else {
                boolean var42 = class226.method1568(0, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 0, var2, 0, -24320, 0, 2, false, 0);
                if (!var42) {
                    class226.method1568(1, class230.field3820.field5159[0], var3, class230.field3820.field5104[0], 1, var2, 0, -24320, 0, 2, false, 0);
                }
            }
            class120.field2029 = class48.field697;
            class143.field2318++;
            class43.field666 = 0;
            class256.field4281 = class220.field3613;
            class271.field4538 = 2;
            class121.field2033.method37(63, 116);
            class121.field2033.method1180(99, class1.field9 + var2);
            class121.field2033.method1180(arg1 ^ 0x60, var4);
            class121.field2033.method1160(class1.field1 + var3, arg1 ^ 0xB5A48D50);
        }
        if (var5 == 1002) {
            class256.field4281 = class220.field3613;
            class43.field666 = 0;
            class120.field2029 = class48.field697;
            class271.field4538 = 2;
            class217 var44 = class187.field3035[var4];
            if (var44 != null) {
                class313 var45 = var44.field3559;
                if (var45.field5262 != null) {
                    var45 = var45.method2118(0);
                }
                if (var45 != null) {
                    class113.field1917++;
                    class121.field2033.method37(31, 232);
                    class121.field2033.method1155(-1640531527, var45.field5272);
                }
            }
        }
        if (var5 == 49) {
            class58.field825++;
            class121.field2033.method37(arg1 ^ 0x35, 40);
            class121.field2033.method1165(3, var3);
            class121.field2033.method1180(63, var2);
            class121.field2033.method1160(var4, -1247507120);
            class121.field2033.method1155(-1640531527, class165.field2701);
            class121.field2033.method1165(3, class45.field689);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 60) {
            class103.method795(var6, 3, var2, var3);
            class121.field2033.method37(76, 107);
            class294.field4797++;
            class121.field2033.method1160(var3 + class1.field1, arg1 ^ 0xB5A48D50);
            class121.field2033.method1170(false, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class121.field2033.method1180(arg1 ^ 0x21, var2 + class1.field9);
        }
        if (var5 == 33 && class103.method795(var6, 3, var2, var3)) {
            class215.field3548++;
            class121.field2033.method37(88, 246);
            class121.field2033.method1170(false, class1.field9 + var2);
            class121.field2033.method1155(-1640531527, class165.field2701);
            class121.field2033.method1155(-1640531527, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class121.field2033.method1155(-1640531527, class1.field1 + var3);
            class121.field2033.method1168(class45.field689, (byte) -66);
        }
        if (var5 == 57) {
            class217 var46 = class187.field3035[var4];
            if (var46 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var46.field5159[0], class230.field3820.field5104[0], 1, var46.field5104[0], 0, -24320, 0, 2, false, 0);
                class24.field309++;
                class271.field4538 = 2;
                class43.field666 = 0;
                class256.field4281 = class220.field3613;
                class120.field2029 = class48.field697;
                class121.field2033.method37(79, 209);
                class121.field2033.method1160(var4, -1247507120);
            }
        }
        if (var5 == 1003) {
            class271.field4538 = 2;
            class120.field2029 = class48.field697;
            class256.field4281 = class220.field3613;
            class43.field666 = 0;
            class63.field958++;
            class121.field2033.method37(76, 230);
            class121.field2033.method1170(false, var4);
        }
        if (var5 == 13) {
            class209 var47 = class114.field1931[var4];
            if (var47 != null) {
                class226.method1568(1, class230.field3820.field5159[0], var47.field5159[0], class230.field3820.field5104[0], 1, var47.field5104[0], 0, -24320, 0, 2, false, 0);
                class317.field5377++;
                class256.field4281 = class220.field3613;
                class120.field2029 = class48.field697;
                class43.field666 = 0;
                class271.field4538 = 2;
                class121.field2033.method37(69, 135);
                class121.field2033.method1170(false, var4);
            }
        }
        if (var5 == 16) {
            class121.field2033.method37(102, 171);
            class121.field2033.method1207((byte) -2, var3);
            class313.field5280++;
            class121.field2033.method1180(47, var2);
            class121.field2033.method1170(false, var4);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 39) {
            class121.field2033.method37(arg1 ^ 0x23, 228);
            class121.field2033.method1169((byte) -74, var3);
            class121.field2033.method1160(var2, -1247507120);
            class121.field2033.method1180(arg1 + 75, var4);
            class133.field2169++;
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 26) {
            class156.field2539++;
            class121.field2033.method37(57, 75);
            class121.field2033.method1169((byte) -74, var3);
            class121.field2033.method1160(var4, -1247507120);
            class121.field2033.method1170(false, var2);
            class167.field2739 = 0;
            class205.field3390 = class206.method1440(var3, (byte) -68);
            class88.field1492 = var2;
        }
        if (var5 == 7) {
            class209 var48 = class114.field1931[var4];
            if (var48 != null) {
                class257.field4301++;
                class226.method1568(1, class230.field3820.field5159[0], var48.field5159[0], class230.field3820.field5104[0], 1, var48.field5104[0], 0, -24320, 0, 2, false, 0);
                class43.field666 = 0;
                class271.field4538 = 2;
                class120.field2029 = class48.field697;
                class256.field4281 = class220.field3613;
                class121.field2033.method37(57, 184);
                class121.field2033.method1180(120, var4);
            }
        }
        if (class317.field5381 != arg1) {
            class317.field5381 = 0;
            class296.method2006(class206.method1440(class43.field658, (byte) -68), arg1 + 125);
        }
        if (class8.field103) {
            class135.method959((byte) 119);
        }
        if (class205.field3390 != null && class167.field2739 == 0) {
            class296.method2006(class205.field3390, arg1 + 122);
        }
    }
}
