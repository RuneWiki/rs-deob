import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    private int field1809 = 0;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    private int field1819 = 0;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "[[I")
    public int[][] field1829;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1804 = 127;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lic;")
    private static class59 field1821 = class59.method433(0, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lic;")
    public static class59 field1801 = field1821;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lwd;")
    private static class157 field1826 = new class157(8);

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1833 = 0;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Lic;")
    public static class59 field1834 = class59.method433(0, "Texturen geladen)3");

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lmd;")
    public static class87 field1832;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static final void method600(boolean arg0) {
        field1827++;
        if (!class34.field907) {
            return;
        }
        class159 var1 = class76.method632(class2.field37, 128, class149.field3267);
        if (var1 != null && var1.field3542 != null) {
            class139 var2 = new class139();
            var2.field3096 = var1.field3542;
            var2.field3104 = var1;
            class125.method948(var2, -30164);
        }
        class34.field907 = false;
        class42.method320(arg0, var1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method601(int arg0) {
        class99.field2461 = null;
        class41.field1063 = null;
        field1810++;
        if (arg0 != 0) {
            method612(-64, null);
        }
        class142.field3120 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
    private final void method602(int arg0, int arg1, int arg2, int arg3) {
        field1820++;
        if (arg0 > -71) {
            this.method620(4, -95, 30);
        }
        this.field1829[arg1][arg3] = class24.method156(this.field1829[arg1][arg3], ~arg2);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIIIII)V")
    public final void method603(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field1809;
        int var9 = arg2 - this.field1819;
        field1816++;
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg4;
            arg4 = arg6;
            arg6 = var10;
        }
        int var11 = 256;
        if (arg1) {
            var11 += 131072;
        }
        if (arg0 != -24696) {
            return;
        }
        for (int var12 = var8; var12 < arg4 + var8; var12++) {
            if (var12 >= 0 && this.field1813 > var12) {
                for (int var13 = var9; var13 < var9 + arg6; var13++) {
                    if (var13 >= 0 && this.field1806 > var13) {
                        this.method602(-114, var12, var11, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1812++;
        if (arg2 == arg6 && arg0 == arg4) {
            return true;
        }
        if (arg3 != -1) {
            this.field1806 = 88;
        }
        int var8 = arg0 - this.field1819;
        int var9 = arg2 - this.field1809;
        int var10 = arg4 - this.field1819;
        int var11 = arg6 - this.field1809;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field1829[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field1829[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field1829[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 - 1 == var10 && (this.field1829[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 - 1 == var9 && var8 == var10 && (this.field1829[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field1829[var9][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var11 + 1 == var9 && var8 == var10 && (this.field1829[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var8 + 1 == var10 && (this.field1829[var9][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var9 == var11 && var8 + 1 == var10 && (this.field1829[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var8 - 1 == var10 && (this.field1829[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var8 == var10 && (this.field1829[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var8 == var10 && (this.field1829[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIIII)V")
    public final void method605(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field1819;
        int var8 = arg3 - this.field1809;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method609(11050, var7, 128, var8);
                this.method609(arg4 + 7551, var7, 8, var8 - 1);
            }
            if (arg1 == 1) {
                this.method609(11050, var7, 2, var8);
                this.method609(11050, var7 + 1, 32, var8);
            }
            if (arg1 == 2) {
                this.method609(arg4 ^ 0x2681, var7, 8, var8);
                this.method609(11050, var7, 128, var8 + 1);
            }
            if (arg1 == 3) {
                this.method609(11050, var7, 32, var8);
                this.method609(11050, var7 - 1, 2, var8);
            }
        }
        field1822++;
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method609(11050, var7, 1, var8);
                this.method609(11050, var7 + 1, 16, var8 - 1);
            }
            if (arg1 == 1) {
                this.method609(arg4 + 7551, var7, 4, var8);
                this.method609(11050, var7 + 1, 64, var8 + 1);
            }
            if (arg1 == 2) {
                this.method609(11050, var7, 16, var8);
                this.method609(arg4 ^ 0x2681, var7 - 1, 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method609(11050, var7, 64, var8);
                this.method609(arg4 ^ 0x2681, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg4 != 3499) {
            this.field1809 = 30;
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method609(arg4 + 7551, var7, 130, var8);
                this.method609(11050, var7, 8, var8 - 1);
                this.method609(arg4 + 7551, var7 + 1, 32, var8);
            }
            if (arg1 == 1) {
                this.method609(11050, var7, 10, var8);
                this.method609(arg4 ^ 0x2681, var7 + 1, 32, var8);
                this.method609(11050, var7, 128, var8 + 1);
            }
            if (arg1 == 2) {
                this.method609(arg4 ^ 0x2681, var7, 40, var8);
                this.method609(11050, var7, 128, var8 + 1);
                this.method609(11050, var7 - 1, 2, var8);
            }
            if (arg1 == 3) {
                this.method609(11050, var7, 160, var8);
                this.method609(arg4 + 7551, var7 + -1, 2, var8);
                this.method609(11050, var7, 8, var8 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method609(arg4 + 7551, var7, 65536, var8);
                this.method609(11050, var7, 4096, var8 - 1);
            }
            if (arg1 == 1) {
                this.method609(arg4 ^ 0x2681, var7, 1024, var8);
                this.method609(arg4 + 7551, var7 - -1, 16384, var8);
            }
            if (arg1 == 2) {
                this.method609(11050, var7, 4096, var8);
                this.method609(11050, var7, 65536, var8 + 1);
            }
            if (arg1 == 3) {
                this.method609(11050, var7, 16384, var8);
                this.method609(arg4 ^ 0x2681, var7 - 1, 1024, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method609(11050, var7, 512, var8);
                this.method609(arg4 ^ 0x2681, var7 + 1, 8192, var8 - 1);
            }
            if (arg1 == 1) {
                this.method609(11050, var7, 2048, var8);
                this.method609(11050, var7 + 1, 32768, var8 + 1);
            }
            if (arg1 == 2) {
                this.method609(11050, var7, 8192, var8);
                this.method609(arg4 ^ 0x2681, var7 - 1, 512, var8 + 1);
            }
            if (arg1 == 3) {
                this.method609(11050, var7, 32768, var8);
                this.method609(11050, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method609(11050, var7, 66560, var8);
            this.method609(11050, var7, 4096, var8 - 1);
            this.method609(11050, var7 + 1, 16384, var8);
        }
        if (arg1 == 1) {
            this.method609(11050, var7, 5120, var8);
            this.method609(arg4 + 7551, var7 - -1, 16384, var8);
            this.method609(11050, var7, 65536, var8 + 1);
        }
        if (arg1 == 2) {
            this.method609(11050, var7, 20480, var8);
            this.method609(11050, var7, 65536, var8 + 1);
            this.method609(11050, var7 - 1, 1024, var8);
        }
        if (arg1 == 3) {
            this.method609(11050, var7, 81920, var8);
            this.method609(11050, var7 - 1, 1024, var8);
            this.method609(11050, var7, 4096, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljf;I)V")
    public static final void method606(class68 arg0, int arg1) {
        arg0.field1698 = 0;
        int var2 = arg0.field1707 - class23.field561;
        field1814++;
        if (arg0.field1694 == 0) {
            arg0.field1702 = 1024;
        }
        int var3 = arg0.field1750 * 128 + arg0.field1712 * 64;
        if (arg0.field1694 == 1) {
            arg0.field1702 = 1536;
        }
        int var4 = arg0.field1755 * 128 + arg0.field1712 * 64;
        if (arg1 >= -44) {
            method606(null, 77);
        }
        if (arg0.field1694 == 2) {
            arg0.field1702 = 0;
        }
        arg0.field1751 += (var4 - arg0.field1751) / var2;
        if (arg0.field1694 == 3) {
            arg0.field1702 = 512;
        }
        arg0.field1730 += (var3 - arg0.field1730) / var2;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZIIIII)V")
    public final void method607(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1819;
        int var8 = arg1 - this.field1809;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method602(-113, var8, 128, var7);
                this.method602(-127, var8 - 1, 8, var7);
            }
            if (arg2 == 1) {
                this.method602(-117, var8, 2, var7);
                this.method602(-75, var8, 32, var7 + 1);
            }
            if (arg2 == 2) {
                this.method602(-117, var8, 8, var7);
                this.method602(-117, var8 + 1, 128, var7);
            }
            if (arg2 == 3) {
                this.method602(-121, var8, 32, var7);
                this.method602(-117, var8, 2, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method602(-93, var8, 1, var7);
                this.method602(-89, var8 - 1, 16, var7 + 1);
            }
            if (arg2 == 1) {
                this.method602(-128, var8, 4, var7);
                this.method602(-81, var8 + 1, 64, var7 + 1);
            }
            if (arg2 == 2) {
                this.method602(-79, var8, 16, var7);
                this.method602(-79, var8 + 1, 1, var7 - 1);
            }
            if (arg2 == 3) {
                this.method602(-121, var8, 64, var7);
                this.method602(-89, var8 - 1, 4, var7 - 1);
            }
        }
        field1803++;
        int var9 = -128 / ((arg3 - 50) / 42);
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method602(-104, var8, 130, var7);
                this.method602(-104, var8 - 1, 8, var7);
                this.method602(-81, var8, 32, var7 + 1);
            }
            if (arg2 == 1) {
                this.method602(-72, var8, 10, var7);
                this.method602(-114, var8, 32, var7 + 1);
                this.method602(-111, var8 + 1, 128, var7);
            }
            if (arg2 == 2) {
                this.method602(-74, var8, 40, var7);
                this.method602(-76, var8 + 1, 128, var7);
                this.method602(-113, var8, 2, var7 - 1);
            }
            if (arg2 == 3) {
                this.method602(-88, var8, 160, var7);
                this.method602(-85, var8, 2, var7 - 1);
                this.method602(-82, var8 - 1, 8, var7);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method602(-85, var8, 65536, var7);
                this.method602(-77, var8 - 1, 4096, var7);
            }
            if (arg2 == 1) {
                this.method602(-82, var8, 1024, var7);
                this.method602(-72, var8, 16384, var7 + 1);
            }
            if (arg2 == 2) {
                this.method602(-105, var8, 4096, var7);
                this.method602(-82, var8 + 1, 65536, var7);
            }
            if (arg2 == 3) {
                this.method602(-81, var8, 16384, var7);
                this.method602(-83, var8, 1024, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method602(-84, var8, 512, var7);
                this.method602(-114, var8 - 1, 8192, var7 + 1);
            }
            if (arg2 == 1) {
                this.method602(-90, var8, 2048, var7);
                this.method602(-123, var8 + 1, 32768, var7 + 1);
            }
            if (arg2 == 2) {
                this.method602(-79, var8, 8192, var7);
                this.method602(-78, var8 + 1, 512, var7 - 1);
            }
            if (arg2 == 3) {
                this.method602(-103, var8, 32768, var7);
                this.method602(-72, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method602(-116, var8, 66560, var7);
            this.method602(-121, var8 - 1, 4096, var7);
            this.method602(-82, var8, 16384, var7 + 1);
        }
        if (arg2 == 1) {
            this.method602(-123, var8, 5120, var7);
            this.method602(-113, var8, 16384, var7 + 1);
            this.method602(-94, var8 + 1, 65536, var7);
        }
        if (arg2 == 2) {
            this.method602(-108, var8, 20480, var7);
            this.method602(-124, var8 + 1, 65536, var7);
            this.method602(-106, var8, 1024, var7 - 1);
        }
        if (arg2 == 3) {
            this.method602(-93, var8, 81920, var7);
            this.method602(-81, var8, 1024, var7 - 1);
            this.method602(-104, var8 - 1, 4096, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lpc;B)V")
    public static final void method608(class107 arg0, byte arg1) {
        field1815++;
        if (class136.field3021) {
            class15.method83(arg1 + 14, arg0);
            return;
        }
        if (class41.field1065 == 1 && class3.field68 >= 715 && class81.field2005 >= 453) {
            class90.field2289 = !class90.field2289;
            if (class90.field2289) {
                class100.method808(1);
            } else {
                class18.method92(255, class90.field2294, false, class90.field2274, field1832, (byte) 99);
            }
        }
        if (class64.field1635 == 5) {
            return;
        }
        class64.field1631++;
        if (class64.field1635 != 10) {
            return;
        }
        if (class52.field1300 != 2 && class136.field3013 == 0) {
            if (class41.field1065 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 35;
                byte var5 = 100;
                if (var2 <= class3.field68 && var2 + var5 >= class3.field68 && var3 <= class81.field2005 && class81.field2005 <= var3 + var4) {
                    class6.method32((byte) 96);
                    return;
                }
            }
            if (class54.field1337 != null) {
                class6.method32((byte) 96);
            }
        }
        int var6 = class3.field68;
        if (arg1 != -14) {
            method608(null, (byte) -32);
        }
        int var7 = class81.field2005;
        int var8 = class41.field1065;
        if (class16.field305 == 0) {
            short var17 = 302;
            short var18 = 291;
            boolean var19 = false;
            if (var8 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                class134.field2978 = 0;
                class16.field305 = 3;
            }
            if (class96.field2432 != 0) {
                while (class87.method713(arg1 + 110)) {
                    if (class23.field564 == 84) {
                        var19 = true;
                        break;
                    }
                }
            }
            short var20 = 462;
            if (var19 || var8 == 1 && var20 - 75 <= var6 && var6 <= var20 + 75 && var18 - 20 <= var7 && var7 <= var18 + 20) {
                class90.field2297 = class31.field839;
                class90.field2296 = class31.field822;
                class134.field2978 = 0;
                class90.field2286 = class155.field3371;
                class16.field305 = 2;
            }
        } else if (class16.field305 == 2) {
            short var11 = 231;
            short var12 = 302;
            short var13 = 321;
            int var21 = var11 + 30;
            if (var8 == 1 && var7 >= var21 - 15 && var7 < var21) {
                class134.field2978 = 0;
            }
            var21 += 15;
            if (var8 == 1 && var21 - 15 <= var7 && var21 > var7) {
                class134.field2978 = 1;
            }
            var21 += 15;
            if (var8 == 1 && var6 >= var12 - 75 && var12 + 75 >= var6 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                class90.field2295 = class90.field2295.method448(true).method459(28452);
                if (class90.field2295.method437((byte) 52) == 0) {
                    class81.method666(class31.field796, class31.field849, -128, class19.field374);
                    return;
                }
                if (class90.field2290.method437((byte) 52) == 0) {
                    class81.method666(class31.field818, class31.field835, -115, class130.field2919);
                    return;
                }
                class81.method666(class31.field792, class31.field826, arg1 ^ 0x5E, class89.field2260);
                class89.method737(20, arg1 ^ 0xFFFFFF72);
                return;
            }
            short var14 = 462;
            if (var8 == 1 && var14 - 75 <= var6 && var14 + 75 >= var6 && var13 - 20 <= var7 && var13 + 20 >= var7) {
                class90.field2295 = class90.field2294;
                class16.field305 = 0;
                class90.field2290 = class90.field2294;
            }
            while (true) {
                while (class87.method713(arg1 + 126)) {
                    boolean var15 = false;
                    for (int var16 = 0; class131.field2937.method437((byte) 52) > var16; var16++) {
                        if (class118.field2749 == class131.field2937.method425((byte) 105, var16)) {
                            var15 = true;
                            break;
                        }
                    }
                    if (class134.field2978 == 0) {
                        if (class23.field564 == 85 && class90.field2295.method437((byte) 52) > 0) {
                            class90.field2295 = class90.field2295.method427((byte) 41, class90.field2295.method437((byte) 52) - 1, 0);
                        }
                        if (class23.field564 == 84 || class23.field564 == 80) {
                            class134.field2978 = 1;
                        }
                        if (var15 && class90.field2295.method437((byte) 52) < 12) {
                            class90.field2295 = class90.field2295.method420(class118.field2749, 114);
                        }
                    } else if (class134.field2978 == 1) {
                        if (class23.field564 == 85 && class90.field2290.method437((byte) 52) > 0) {
                            class90.field2290 = class90.field2290.method427((byte) 41, class90.field2290.method437((byte) 52) - 1, 0);
                        }
                        if (class23.field564 == 84 || class23.field564 == 80) {
                            class134.field2978 = 0;
                        }
                        if (class96.field2432 != 0 && class23.field564 == 84) {
                            class90.field2295 = class90.field2295.method448(true).method459(28452);
                            if (class90.field2295.method437((byte) 52) == 0) {
                                class81.method666(class31.field796, class31.field849, arg1 ^ 0x5B, class19.field374);
                                return;
                            }
                            if (class90.field2290.method437((byte) 52) == 0) {
                                class81.method666(class31.field818, class31.field835, -120, class130.field2919);
                                return;
                            }
                            class81.method666(class31.field792, class31.field826, -103, class89.field2260);
                            class89.method737(20, arg1 + 142);
                            return;
                        }
                        if (var15 && class90.field2290.method437((byte) 52) < 20) {
                            class90.field2290 = class90.field2290.method420(class118.field2749, arg1 ^ 0xFFFFFF9A);
                        }
                    }
                }
                return;
            }
        } else if (class16.field305 == 3) {
            short var9 = 321;
            short var10 = 382;
            if (var8 == 1 && var10 - 75 <= var6 && var10 + 75 >= var6 && var7 >= var9 - 20 && var9 + 20 >= var7) {
                class16.field305 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIII)V")
    private final void method609(int arg0, int arg1, int arg2, int arg3) {
        field1824++;
        if (arg0 == 11050) {
            this.field1829[arg3][arg1] = class52.method392(this.field1829[arg3][arg1], arg2);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Z")
    public static final boolean method610(byte arg0) {
        long var1 = class29.method235(-329);
        field1807++;
        int var3 = (int) (var1 - class103.field2504);
        if (var3 > 200) {
            var3 = 200;
        }
        class40.field1036 += var3;
        class103.field2504 = var1;
        if (class5.field106 == 0 && class4.field97 == 0 && class81.field2012 == 0 && class44.field1135 == 0) {
            return true;
        } else if (class98.field2447 == null) {
            return false;
        } else {
            try {
                int var4 = 39 % ((arg0 - 60) / 49);
                if (class40.field1036 > 30000) {
                    throw new IOException();
                }
                while (class4.field97 < 20 && class44.field1135 > 0) {
                    class35 var5 = (class35) class87.field2181.method37(-1);
                    class157 var6 = new class157(4);
                    var6.method1205(1, 8584);
                    var6.method1209((int) var5.field2736, (byte) 125);
                    class98.field2447.method306(4, 0, 15731, var6.field3473);
                    class22.field512.method38(var5, (byte) 108, var5.field2736);
                    class4.field97++;
                    class44.field1135--;
                }
                while (class5.field106 < 20 && class81.field2012 > 0) {
                    class35 var7 = (class35) class85.field2139.method824(false);
                    class157 var8 = new class157(4);
                    var8.method1205(0, 8584);
                    var8.method1209((int) var7.field2736, (byte) 122);
                    class98.field2447.method306(4, 0, 15731, var8.field3473);
                    var7.method387((byte) -69);
                    class33.field887.method38(var7, (byte) 117, var7.field2736);
                    class81.field2012--;
                    class5.field106++;
                }
                for (int var9 = 0; var9 < 100; var9++) {
                    int var10 = class98.field2447.method305((byte) 107);
                    if (var10 < 0) {
                        throw new IOException();
                    }
                    if (var10 == 0) {
                        break;
                    }
                    class40.field1036 = 0;
                    byte var11 = 0;
                    if (class65.field1643 == null) {
                        var11 = 8;
                    } else if (class8.field164 == 0) {
                        var11 = 1;
                    }
                    if (var11 > 0) {
                        int var12 = var11 - field1826.field3457;
                        if (var12 > var10) {
                            var12 = var10;
                        }
                        class98.field2447.method309(field1826.field3457, (byte) 70, var12, field1826.field3473);
                        if (class137.field3049 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                field1826.field3473[field1826.field3457 + var13] = (byte) class125.method958(field1826.field3473[field1826.field3457 + var13], class137.field3049);
                            }
                        }
                        field1826.field3457 += var12;
                        if (field1826.field3457 < var11) {
                            break;
                        }
                        if (class65.field1643 == null) {
                            field1826.field3457 = 0;
                            int var14 = field1826.method1194(false);
                            int var15 = field1826.method1161((byte) 60);
                            long var16 = (long) ((var14 << 16) + var15);
                            int var18 = field1826.method1194(false);
                            int var19 = field1826.method1175((byte) -104);
                            class35 var20 = (class35) class22.field512.method35(var16, 105);
                            class148.field3252 = true;
                            if (var20 == null) {
                                var20 = (class35) class33.field887.method35(var16, 105);
                                class148.field3252 = false;
                            }
                            if (var20 == null) {
                                throw new IOException();
                            }
                            class65.field1643 = var20;
                            int var21 = var18 == 0 ? 5 : 9;
                            class51.field1275 = new class157(class65.field1643.field927 + var19 + var21);
                            class51.field1275.method1205(var18, 8584);
                            class51.field1275.method1195(var19, 852);
                            field1826.field3457 = 0;
                            class8.field164 = 8;
                        } else if (class8.field164 == 0) {
                            if (field1826.field3473[0] == -1) {
                                class8.field164 = 1;
                                field1826.field3457 = 0;
                            } else {
                                class65.field1643 = null;
                            }
                        }
                    } else {
                        int var22 = class51.field1275.field3473.length - class65.field1643.field927;
                        int var23 = 512 - class8.field164;
                        if (var22 - class51.field1275.field3457 < var23) {
                            var23 = var22 - class51.field1275.field3457;
                        }
                        if (var10 < var23) {
                            var23 = var10;
                        }
                        class98.field2447.method309(class51.field1275.field3457, (byte) 56, var23, class51.field1275.field3473);
                        if (class137.field3049 != 0) {
                            for (int var24 = 0; var24 < var23; var24++) {
                                class51.field1275.field3473[class51.field1275.field3457 + var24] = (byte) class125.method958(class51.field1275.field3473[class51.field1275.field3457 + var24], class137.field3049);
                            }
                        }
                        class51.field1275.field3457 += var23;
                        class8.field164 += var23;
                        if (class51.field1275.field3457 == var22) {
                            if (class65.field1643.field2736 == 16711935L) {
                                class80.field2000 = class51.field1275;
                                for (int var26 = 0; var26 < 256; var26++) {
                                    class87 var27 = class99.field2451[var26];
                                    if (var27 != null) {
                                        class80.field2000.field3457 = var26 * 8 + 5;
                                        int var28 = class80.field2000.method1175((byte) -107);
                                        int var29 = class80.field2000.method1175((byte) -88);
                                        var27.method720(var28, (byte) -112, var29);
                                    }
                                }
                            } else {
                                class114.field2702.reset();
                                class114.field2702.update(class51.field1275.field3473, 0, var22);
                                int var25 = (int) class114.field2702.getValue();
                                if (class65.field1643.field921 != var25) {
                                    try {
                                        class98.field2447.method308(19401);
                                    } catch (Exception var31) {
                                    }
                                    class137.field3049 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class91.field2324++;
                                    class98.field2447 = null;
                                    return false;
                                }
                                class91.field2324 = 0;
                                field1833 = 0;
                                class65.field1643.field930.method715((byte) -96, class51.field1275.field3473, class148.field3252, (class65.field1643.field2736 & 0xFF0000L) == 16711680L, (int) (class65.field1643.field2736 & 0xFFFFL));
                            }
                            class65.field1643.method929(115);
                            class65.field1643 = null;
                            class51.field1275 = null;
                            if (class148.field3252) {
                                class4.field97--;
                            } else {
                                class5.field106--;
                            }
                            class8.field164 = 0;
                        } else {
                            if (class8.field164 != 512) {
                                break;
                            }
                            class8.field164 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    class98.field2447.method308(19401);
                } catch (Exception var30) {
                }
                field1833++;
                class98.field2447 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V")
    public final void method611(byte arg0, int arg1, int arg2) {
        if (arg0 != 35) {
            method606(null, -71);
        }
        int var4 = arg1 - this.field1809;
        int var5 = arg2 - this.field1819;
        field1808++;
        this.field1829[var4][var5] = class52.method392(this.field1829[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILdd;)V")
    public static final void method612(int arg0, class26 arg1) {
        field1811++;
        if (arg0 <= -39) {
            class108.field2614 = arg1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1802++;
        int var9 = arg3 + arg0 - 1;
        int var10 = arg6 + arg2 - 1;
        if (arg3 <= arg1 && arg1 <= var9 && arg6 <= arg5 && arg5 <= var10) {
            return true;
        } else if (arg3 - 1 == arg1 && arg6 <= arg5 && var10 >= arg5 && (this.field1829[arg1 - this.field1809][arg5 - this.field1819] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else {
            if (arg7 != -26273) {
                this.method613(-20, -67, 52, 20, -76, 115, -48, 4);
            }
            if (var9 + 1 == arg1 && arg5 >= arg6 && arg5 <= var10 && (this.field1829[arg1 - this.field1809][arg5 - this.field1819] & 0x80) == 0 && (arg4 & 0x2) == 0) {
                return true;
            } else if (arg6 - 1 == arg5 && arg3 <= arg1 && arg1 <= var9 && (this.field1829[arg1 - this.field1809][arg5 - this.field1819] & 0x2) == 0 && (arg4 & 0x4) == 0) {
                return true;
            } else {
                return var10 + 1 == arg5 && arg1 >= arg3 && var9 >= arg1 && (this.field1829[arg1 - this.field1809][arg5 - this.field1819] & 0x20) == 0 && (arg4 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIB)Z")
    public final boolean method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1805++;
        if (arg3 == arg4 && arg1 == arg2) {
            return true;
        }
        int var8 = arg4 - this.field1809;
        if (arg6 != 87) {
            return true;
        }
        int var9 = arg1 - this.field1819;
        int var10 = arg3 - this.field1809;
        int var11 = arg2 - this.field1819;
        if (arg0 == 0) {
            if (arg5 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1829[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1829[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1829[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1829[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1829[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1829[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1829[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1829[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1829[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1829[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1829[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIZ)V")
    public final void method615(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field1809;
        int var8 = 256;
        field1823++;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = -93 % ((45 - arg3) / 46);
        int var10 = arg2 - this.field1819;
        for (int var11 = var7; var11 < arg0 + var7; var11++) {
            if (var11 >= 0 && var11 < this.field1813) {
                for (int var12 = var10; var12 < var10 + arg1; var12++) {
                    if (var12 >= 0 && this.field1806 > var12) {
                        this.method609(11050, var12, var8, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method616(int arg0) {
        field1826 = null;
        if (arg0 >= 53) {
            field1832 = null;
            field1801 = null;
            field1821 = null;
            field1834 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public final void method617(int arg0) {
        for (int var2 = 0; var2 < this.field1813; var2++) {
            for (int var3 = 0; var3 < this.field1806; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1813 - 5 <= var2 || var3 >= this.field1806 - 5) {
                    this.field1829[var2][var3] = 16777215;
                } else {
                    this.field1829[var2][var3] = 16777216;
                }
            }
        }
        field1825++;
        if (arg0 < 80) {
            field1826 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public final void method618(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1819;
        field1830++;
        if (arg0 == 1) {
            int var5 = arg1 - this.field1809;
            this.field1829[var5][var4] = class24.method156(this.field1829[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lfd;IZ)V")
    public static final void method619(class40 arg0, int arg1, boolean arg2) {
        if (class98.field2447 != null) {
            try {
                class98.field2447.method308(19401);
            } catch (Exception var8) {
            }
            class98.field2447 = null;
        }
        class98.field2447 = arg0;
        class49.method382(arg2, (byte) -90);
        field1828++;
        class8.field164 = 0;
        class65.field1643 = null;
        class51.field1275 = null;
        field1826.field3457 = 0;
        while (true) {
            class35 var3 = (class35) class22.field512.method37(-1);
            if (var3 == null) {
                while (true) {
                    class35 var4 = (class35) class33.field887.method37(-1);
                    if (var4 == null) {
                        if (arg1 != 4) {
                            return;
                        }
                        if (class137.field3049 != 0) {
                            try {
                                class157 var5 = new class157(4);
                                var5.method1205(4, 8584);
                                var5.method1205(class137.field3049, 8584);
                                var5.method1206(0, true);
                                class98.field2447.method306(4, 0, arg1 + 15727, var5.field3473);
                            } catch (IOException var7) {
                                try {
                                    class98.field2447.method308(19401);
                                } catch (Exception var6) {
                                }
                                class98.field2447 = null;
                                field1833++;
                            }
                        }
                        class40.field1036 = 0;
                        class103.field2504 = class29.method235(arg1 ^ 0xFFFFFEB3);
                        return;
                    }
                    class85.field2139.method828(var4, arg1 - 100);
                    class61.field1557.method38(var4, (byte) 111, var4.field2736);
                    class81.field2012++;
                    class5.field106--;
                }
            }
            class87.field2181.method38(var3, (byte) 115, var3.field2736);
            class44.field1135++;
            class4.field97--;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
    public final void method620(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1809;
        field1818++;
        int var5 = arg1 - this.field1819;
        this.field1829[var4][var5] = class52.method392(this.field1829[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(II)V")
    public class73(int arg0, int arg1) {
        this.field1813 = arg0;
        this.field1806 = arg1;
        this.field1829 = new int[this.field1813][this.field1806];
        this.method617(81);
    }
}
