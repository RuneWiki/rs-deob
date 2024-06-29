import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class104 {

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    private int field1794;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    private int field1791;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    private int field1800;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    private int field1766;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[[I")
    public int[][] field1765;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1770 = 1;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Lbe;")
    public static class283 field1772 = class153.method941(-8, "");

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "Lbe;")
    public static class283 field1785 = class153.method941(-46, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lbe;")
    private static class283 field1771 = class153.method941(127, "red:");

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Lbe;")
    public static class283 field1776 = field1771;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "Lbe;")
    private static class283 field1786 = class153.method941(17, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1775 = 0;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "Lbe;")
    public static class283 field1777 = field1786;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lbe;")
    public static class283 field1764 = field1771;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "Ltf;")
    public static class242 field1779 = new class242(5);

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "Lbe;")
    public static class283 field1802 = class153.method941(126, "");

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field1801 = 0;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "[S")
    public static short[] field1803;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIBIIIIII)Z", line = 4)
    public final boolean method681(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1795++;
        if (arg7 > 1) {
            return this.method690(arg8, arg7, arg4, arg5, arg7, arg3, arg6, 32684, arg0) ? true : this.method700(arg0, arg6, arg7, arg8, arg7, arg1, (byte) 124, arg3, arg5, arg4);
        }
        if (arg2 >= -111) {
            this.method687(-23, -104, 69, -43, 127, 122, -111, -28);
        }
        int var10 = arg4 + arg5 - 1;
        int var11 = arg0 + arg3 - 1;
        if (arg6 >= arg4 && var10 >= arg6 && arg8 >= arg0 && arg8 <= var11) {
            return true;
        } else if ((arg4 - 1) == arg6 && arg0 <= arg8 && var11 >= arg8 && (this.field1765[arg6 - this.field1766][arg8 - this.field1791] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg6 && arg8 >= arg0 && var11 >= arg8 && (this.field1765[arg6 - this.field1766][arg8 - this.field1791] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg8 && arg4 <= arg6 && arg6 <= var10 && (this.field1765[arg6 - this.field1766][arg8 - this.field1791] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg8 && arg4 <= arg6 && arg6 <= var10 && (this.field1765[arg6 - this.field1766][arg8 - this.field1791] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 44)
    public static final void method682(int arg0) {
        field1778++;
        if (arg0 != -29443) {
            method683((byte) -10, (class172) null);
        }
        if (class121.field2017 != null) {
            class138 var1 = class121.field2017;
            synchronized (class121.field2017) {
                class121.field2017 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLek;)V", line = 61)
    public static final void method683(byte arg0, class172 arg1) {
        field1773++;
        if (class298.field5049) {
            return;
        }
        class311.method2111();
        class5.field47 = class256.method1733((byte) -53, arg1, class110.field1861);
        int var2 = class48.field655;
        int var3 = var2 * 956 / 503;
        class5.field47.method719((class115.field1945 - var3) / 2, 0, var3, var2);
        if (arg0 != 13) {
            field1779 = (class242) null;
        }
        class61.field843 = class199.method1276(class90.field1522, arg1, false);
        class61.field843.method560(class115.field1945 / 2 - (class61.field843.field1464 / 2), 18);
        class298.field5049 = true;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V", line = 86)
    private final void method684(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 2) {
            field1775 = -109;
        }
        field1781++;
        this.field1765[arg1][arg0] = class53.method337(this.field1765[arg1][arg0], arg3);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V", line = 104)
    public final void method685(int arg0, int arg1, int arg2) {
        field1797++;
        int var4 = arg1 - this.field1791;
        int var5 = arg2 - this.field1766;
        this.field1765[var5][var4] = class178.method1174(this.field1765[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 114)
    public static void method686(byte arg0) {
        field1802 = null;
        field1772 = null;
        field1777 = null;
        field1803 = null;
        field1786 = null;
        field1785 = null;
        field1776 = null;
        field1771 = null;
        int var1 = 102 / ((arg0 - 62) / 37);
        field1764 = null;
        field1779 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIII)Z", line = 143)
    public final boolean method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1780++;
        if (arg1 == 1) {
            if (arg3 == arg4 && arg2 == arg7) {
                return true;
            }
        } else if (arg4 >= arg3 && (arg3 + arg1 - 1) >= arg4 && arg7 >= arg7 && arg7 <= arg7 + arg1 - 1) {
            return true;
        }
        int var9 = arg3 - this.field1766;
        int var10 = arg2 - this.field1791;
        int var11 = arg7 - this.field1791;
        int var12 = arg4 - this.field1766;
        if (arg1 == arg5) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field1765[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field1765[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field1765[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field1765[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field1765[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field1765[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field1765[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field1765[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field1765[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field1765[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field1765[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field1765[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 - (1 - arg1);
            int var14 = arg1 + var10 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14 && (this.field1765[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 - arg1) == var10 && (this.field1765[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var12 - arg1) == var9 && var10 <= var11 && var14 >= var11 && (this.field1765[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 - arg1) == var10 && (this.field1765[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - arg1) == var9 && var10 <= var11 && var11 <= var14 && (this.field1765[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10 && (this.field1765[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 + 1 == var9 && var10 <= var11 && var14 >= var11 && (this.field1765[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field1765[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field1765[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var9 && var12 <= var13 && (var11 - arg1) == var10 && (this.field1765[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg1) == var9 && var10 <= var11 && var11 <= var14 && (this.field1765[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 <= var11 && var14 >= var11 && (this.field1765[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 330)
    public final void method688(byte arg0) {
        field1782++;
        if (arg0 != 32) {
            field1776 = (class283) null;
        }
        for (int var2 = 0; var2 < this.field1794; var2++) {
            for (int var3 = 0; var3 < this.field1800; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1794 - 5 || (this.field1800 - 5) <= var3) {
                    this.field1765[var2][var3] = 16777215;
                } else {
                    this.field1765[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZIII)V", line = 366)
    public final void method689(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field1766;
        int var8 = arg3 - this.field1791;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method684(var8, var7, 2, 128);
                this.method684(var8, var7 - 1, 2, 8);
            }
            if (arg4 == 1) {
                this.method684(var8, var7, 2, 2);
                this.method684(var8 + 1, var7, 2, 32);
            }
            if (arg4 == 2) {
                this.method684(var8, var7, arg1 + 29344, 8);
                this.method684(var8, var7 + 1, 2, 128);
            }
            if (arg4 == 3) {
                this.method684(var8, var7, arg1 ^ 0xFFFF8D60, 32);
                this.method684(var8 - 1, var7, arg1 + 29344, 2);
            }
        }
        field1793++;
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method684(var8, var7, 2, 1);
                this.method684(var8 + 1, var7 + -1, 2, 16);
            }
            if (arg4 == 1) {
                this.method684(var8, var7, arg1 + 29344, 4);
                this.method684(var8 + 1, var7 + 1, arg1 + 29344, 64);
            }
            if (arg4 == 2) {
                this.method684(var8, var7, 2, 16);
                this.method684(var8 - 1, var7 + 1, 2, 1);
            }
            if (arg4 == 3) {
                this.method684(var8, var7, 2, 64);
                this.method684(var8 - 1, var7 + -1, 2, 4);
            }
        }
        if (arg1 != -29342) {
            this.field1791 = 0;
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method684(var8, var7, arg1 + 29344, 130);
                this.method684(var8, var7 - 1, 2, 8);
                this.method684(var8 + 1, var7, 2, 32);
            }
            if (arg4 == 1) {
                this.method684(var8, var7, 2, 10);
                this.method684(var8 + 1, var7, 2, 32);
                this.method684(var8, var7 + 1, 2, 128);
            }
            if (arg4 == 2) {
                this.method684(var8, var7, 2, 40);
                this.method684(var8, var7 + 1, 2, 128);
                this.method684(var8 - 1, var7, 2, 2);
            }
            if (arg4 == 3) {
                this.method684(var8, var7, 2, 160);
                this.method684(var8 - 1, var7, 2, 2);
                this.method684(var8, var7 - 1, 2, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method684(var8, var7, 2, 65536);
                this.method684(var8, var7 - 1, arg1 + 29344, 4096);
            }
            if (arg4 == 1) {
                this.method684(var8, var7, 2, 1024);
                this.method684(var8 + 1, var7, 2, 16384);
            }
            if (arg4 == 2) {
                this.method684(var8, var7, 2, 4096);
                this.method684(var8, var7 + 1, 2, 65536);
            }
            if (arg4 == 3) {
                this.method684(var8, var7, 2, 16384);
                this.method684(var8 - 1, var7, 2, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method684(var8, var7, 2, 512);
                this.method684(var8 + 1, var7 + -1, 2, 8192);
            }
            if (arg4 == 1) {
                this.method684(var8, var7, 2, 2048);
                this.method684(var8 + 1, var7 - -1, 2, 32768);
            }
            if (arg4 == 2) {
                this.method684(var8, var7, 2, 8192);
                this.method684(var8 - 1, var7 + 1, arg1 ^ 0xFFFF8D60, 512);
            }
            if (arg4 == 3) {
                this.method684(var8, var7, 2, 32768);
                this.method684(var8 - 1, var7 + -1, arg1 + 29344, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method684(var8, var7, 2, 66560);
            this.method684(var8, var7 - 1, 2, 4096);
            this.method684(var8 + 1, var7, 2, 16384);
        }
        if (arg4 == 1) {
            this.method684(var8, var7, 2, 5120);
            this.method684(var8 + 1, var7, 2, 16384);
            this.method684(var8, var7 + 1, arg1 ^ 0xFFFF8D60, 65536);
        }
        if (arg4 == 2) {
            this.method684(var8, var7, 2, 20480);
            this.method684(var8, var7 + 1, arg1 ^ 0xFFFF8D60, 65536);
            this.method684(var8 - 1, var7, arg1 ^ 0xFFFF8D60, 1024);
        }
        if (arg4 == 3) {
            this.method684(var8, var7, 2, 81920);
            this.method684(var8 - 1, var7, arg1 ^ 0xFFFF8D60, 1024);
            this.method684(var8, var7 - 1, arg1 ^ 0xFFFF8D60, 4096);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIII)Z", line = 589)
    private final boolean method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1799++;
        if (arg2 + arg3 <= arg6 || arg2 >= arg6 + arg4) {
            return false;
        } else if (arg7 == 32684) {
            return arg0 < arg5 + arg8 && (arg0 + arg1) > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZI)V", line = 610)
    private final void method691(int arg0, int arg1, boolean arg2, int arg3) {
        field1767++;
        if (!arg2) {
            this.field1765[arg0][arg3] = class178.method1174(this.field1765[arg0][arg3], ~arg1);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)V", line = 625)
    public final void method692(int arg0, int arg1, int arg2) {
        field1768++;
        int var4 = 46 % ((-arg1 - 4) / 46);
        int var5 = arg0 - this.field1791;
        int var6 = arg2 - this.field1766;
        this.field1765[var6][var5] = class53.method337(this.field1765[var6][var5], 2097152);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)Z", line = 637)
    public final boolean method693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1787++;
        if (arg0 == arg3 && arg1 == arg2) {
            return true;
        }
        int var6 = arg1 - this.field1791;
        int var7 = arg0 - this.field1766;
        if (var7 < 0 || this.field1794 <= var7 || var6 < 0 || this.field1800 <= var6) {
            return false;
        }
        int var8 = arg2 - this.field1791;
        int var9 = arg3 - this.field1766;
        int var10;
        if (var7 > var9) {
            var10 = var7 - var9;
        } else {
            var10 = var9 - var7;
        }
        int var11;
        if (var6 <= var8) {
            var11 = var8 - var6;
        } else {
            var11 = var6 - var8;
        }
        if (var11 >= var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field1765[var9][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field1765[var9][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var7 > var9) {
                        if ((this.field1765[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field1765[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field1765[var9][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field1765[var9][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 > var8) {
                        if ((this.field1765[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field1765[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        if ((this.field1765[var7][var6] & 0x1240100) == 0) {
            if (arg4 != 28343) {
                field1784 = -104;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(III)V", line = 789)
    public final void method694(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1791;
        int var5 = arg2 - this.field1766;
        this.field1765[var5][var4] = class53.method337(this.field1765[var5][var4], arg1);
        field1798++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIZII)V", line = 803)
    public final void method695(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg2 == 1 || arg2 == 3) {
            int var8 = arg6;
            arg6 = arg1;
            arg1 = var8;
        }
        int var9 = 256;
        int var10 = arg0 - this.field1766;
        if (arg4) {
            var9 += 131072;
        }
        if (arg3 != 131072) {
            field1779 = (class242) null;
        }
        field1783++;
        int var11 = arg5 - this.field1791;
        for (int var12 = var10; var12 < arg6 + var10; var12++) {
            if (var12 >= 0 && var12 < this.field1794) {
                for (int var13 = var11; var13 < arg1 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field1800) {
                        this.method691(var12, var9, false, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZIIII)V", line = 854)
    public final void method696(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field1766;
        int var8 = arg0 - this.field1791;
        field1789++;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method691(var7, 128, false, var8);
                this.method691(var7 - 1, 8, false, var8);
            }
            if (arg4 == 1) {
                this.method691(var7, 2, false, var8);
                this.method691(var7, 32, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method691(var7, 8, false, var8);
                this.method691(var7 + 1, 128, false, var8);
            }
            if (arg4 == 3) {
                this.method691(var7, 32, false, var8);
                this.method691(var7, 2, false, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method691(var7, 1, false, var8);
                this.method691(var7 - 1, 16, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method691(var7, 4, false, var8);
                this.method691(var7 + 1, 64, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method691(var7, 16, false, var8);
                this.method691(var7 + 1, 1, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method691(var7, 64, false, var8);
                this.method691(var7 - 1, 4, false, var8 - 1);
            }
        }
        if (arg3 != 32768) {
            return;
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method691(var7, 130, false, var8);
                this.method691(var7 - 1, 8, false, var8);
                this.method691(var7, 32, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method691(var7, 10, false, var8);
                this.method691(var7, 32, false, var8 + 1);
                this.method691(var7 + 1, 128, false, var8);
            }
            if (arg4 == 2) {
                this.method691(var7, 40, false, var8);
                this.method691(var7 + 1, 128, false, var8);
                this.method691(var7, 2, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method691(var7, 160, false, var8);
                this.method691(var7, 2, false, var8 - 1);
                this.method691(var7 - 1, 8, false, var8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method691(var7, 65536, false, var8);
                this.method691(var7 - 1, 4096, false, var8);
            }
            if (arg4 == 1) {
                this.method691(var7, 1024, false, var8);
                this.method691(var7, 16384, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method691(var7, 4096, false, var8);
                this.method691(var7 + 1, 65536, false, var8);
            }
            if (arg4 == 3) {
                this.method691(var7, 16384, false, var8);
                this.method691(var7, 1024, false, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method691(var7, 512, false, var8);
                this.method691(var7 - 1, 8192, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method691(var7, 2048, false, var8);
                this.method691(var7 + 1, 32768, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method691(var7, 8192, false, var8);
                this.method691(var7 + 1, 512, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method691(var7, 32768, false, var8);
                this.method691(var7 - 1, 2048, false, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method691(var7, 66560, false, var8);
            this.method691(var7 - 1, 4096, false, var8);
            this.method691(var7, 16384, false, var8 + 1);
        }
        if (arg4 == 1) {
            this.method691(var7, 5120, false, var8);
            this.method691(var7, 16384, false, var8 + 1);
            this.method691(var7 + 1, 65536, false, var8);
        }
        if (arg4 == 2) {
            this.method691(var7, 20480, false, var8);
            this.method691(var7 + 1, 65536, false, var8);
            this.method691(var7, 1024, false, var8 - 1);
        }
        if (arg4 == 3) {
            this.method691(var7, 81920, false, var8);
            this.method691(var7, 1024, false, var8 - 1);
            this.method691(var7 - 1, 4096, false, var8);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIZIZ)V", line = 1081)
    public final void method697(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field1791;
        field1796++;
        int var8 = arg1 - this.field1766;
        if (arg5) {
            return;
        }
        int var9 = 256;
        if (arg3) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < (arg2 + var8); var10++) {
            if (var10 >= 0 && this.field1794 > var10) {
                for (int var11 = var7; var11 < (var7 + arg0); var11++) {
                    if (var11 >= 0 && this.field1800 > var11) {
                        this.method684(var11, var10, 2, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 1125)
    public static final void method698(int arg0) {
        field1792++;
        for (class183 var1 = (class183) class58.field797.method1812((byte) -114); var1 != null; var1 = (class183) class58.field797.method1813((byte) 46)) {
            if (var1.field3145) {
                var1.method1208(-24750);
            }
        }
        if (arg0 != 0) {
            method698(-43);
        }
        for (class183 var2 = (class183) class259.field4397.method1812((byte) -104); var2 != null; var2 = (class183) class259.field4397.method1813((byte) 97)) {
            if (var2.field3145) {
                var2.method1208(-24750);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIBIIIII)Z", line = 1163)
    public final boolean method699(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1788++;
        if (arg6 == 1) {
            if (arg0 == arg3 && arg4 == arg7) {
                return true;
            }
        } else if (arg3 >= arg0 && (arg0 + arg6 - 1) >= arg3 && arg7 <= arg7 && arg7 <= (arg7 - (1 - arg6))) {
            return true;
        }
        int var9 = arg0 - this.field1766;
        int var10 = arg4 - this.field1791;
        int var11 = arg3 - this.field1766;
        int var12 = arg7 - this.field1791;
        if (arg2 != 25) {
            field1784 = -39;
        }
        if (arg6 == 1) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field1765[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field1765[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field1765[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field1765[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field1765[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field1765[var9][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field1765[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field1765[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field1765[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1765[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field1765[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var9 - 1;
            int var14 = var10 + arg6 - 1;
            if (arg1 == 0) {
                if (arg5 == 0) {
                    if (var11 - arg6 == var9 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10 && (this.field1765[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 - arg6 == var10 && (this.field1765[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - arg6) == var9 && var10 <= var12 && var14 >= var12 && (this.field1765[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var14 && (this.field1765[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 + 1) == var10 && (this.field1765[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 - arg6 == var10 && (this.field1765[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg6) == var10) {
                        return true;
                    }
                    if ((var11 - arg6) == var9 && var10 <= var12 && var12 <= var14 && (this.field1765[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var14 && (this.field1765[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    if ((var11 - arg6) == var9 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14 && (this.field1765[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 - arg6 == var10 && (this.field1765[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - arg6 == var9 && var10 <= var12 && var12 <= var14 && (this.field1765[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg6) == var10 && (this.field1765[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - arg6) == var9 && var12 >= var10 && var14 >= var12 && (this.field1765[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field1765[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 - arg6 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 - arg6 == var9 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10 && (this.field1765[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 <= var12 && var12 <= var14 && (this.field1765[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg6) == var10) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field1765[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var9 && var13 >= var11 && (var12 - arg6) == var10 && (this.field1765[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var11 - arg6) == var9 && var12 >= var10 && var14 >= var12 && (this.field1765[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var12 >= var10 && var12 <= var14 && (this.field1765[var9][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIBIII)Z", line = 1537)
    private final boolean method700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field1790++;
        if (arg6 <= 118) {
            method698(59);
        }
        int var11 = arg8 + arg9;
        int var12 = arg1 + arg2;
        int var13 = arg3 + arg4;
        int var14 = arg0 + arg7;
        if (arg1 >= arg9 && var11 > arg1) {
            if (arg0 == var13 && (arg5 & 0x4) == 0) {
                int var15 = arg1;
                int var16 = var12 > var11 ? var11 : var12;
                while (var15 < var16) {
                    if ((this.field1765[var15 - this.field1766][var13 - this.field1791 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg3 == var14 && (arg5 & 0x1) == 0) {
                int var17 = var12 > var11 ? var11 : var12;
                for (int var18 = arg1; var18 < var17; var18++) {
                    if ((this.field1765[var18 - this.field1766][arg3 - this.field1791] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (var12 > arg9 && var12 <= var11) {
            if (arg0 == var13 && (arg5 & 0x4) == 0) {
                for (int var19 = arg9; var19 < var12; var19++) {
                    if ((this.field1765[var19 - this.field1766][var13 - this.field1791 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var14 && (arg5 & 0x1) == 0) {
                for (int var20 = arg9; var20 < var12; var20++) {
                    if ((this.field1765[var20 - this.field1766][arg3 - this.field1791] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg3 >= arg0 && var14 > arg3) {
            if (arg9 == var12 && (arg5 & 0x8) == 0) {
                int var21 = var14 >= var13 ? var13 : var14;
                for (int var22 = arg3; var22 < var21; var22++) {
                    if ((this.field1765[var12 - this.field1766 - 1][var22 - this.field1791] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var11 && (arg5 & 0x2) == 0) {
                int var23 = arg3;
                int var24 = var14 < var13 ? var14 : var13;
                while (var24 > var23) {
                    if ((this.field1765[arg1 - this.field1766][var23 - this.field1791] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var13 > arg0 && var14 >= var13) {
            if (arg9 == var12 && (arg5 & 0x8) == 0) {
                for (int var25 = arg0; var25 < var13; var25++) {
                    if ((this.field1765[var12 - this.field1766 - 1][var25 - this.field1791] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var11 && (arg5 & 0x2) == 0) {
                for (int var26 = arg0; var26 < var13; var26++) {
                    if ((this.field1765[arg1 - this.field1766][var26 - this.field1791] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(II)V", line = 1721)
    public class104(int arg0, int arg1) {
        this.field1794 = arg0;
        this.field1791 = 0;
        this.field1800 = arg1;
        this.field1766 = 0;
        this.field1765 = new int[this.field1794][this.field1800];
        this.method688((byte) 32);
    }
}
