import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class104 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public int field1819 = -1;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public int field1831 = -1;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Z")
    private boolean field1832 = false;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public int field1835 = 99;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public int field1822 = -1;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public int field1838 = -1;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Z")
    public boolean field1830 = false;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public int field1842 = 2;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public int field1827 = -1;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public int field1845 = 5;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Llc;")
    private static class143 field1820 = class66.method374(" is already on your friend list)3", -1);

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "[B")
    public static byte[] field1823 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Llc;")
    public static class143 field1818 = field1820;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Llc;")
    private static class143 field1833 = class66.method374("glow2:", -1);

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1825 = 0;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Llc;")
    public static class143 field1828 = field1833;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Llc;")
    public static class143 field1840 = field1833;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[I")
    public int[] field1824;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[I")
    public int[] field1829;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "[I")
    private int[] field1836;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "[I")
    private int[] field1843;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "[[I")
    public int[][] field1844;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILhg;ILld;)Lhg;")
    public final class150 method619(int arg0, int arg1, class150 arg2, int arg3, class104 arg4) {
        field1837++;
        int var6 = this.field1829[arg0];
        class225 var7 = class101.method604(var6 >> 16, -97);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method624(-1, arg2, arg1);
        }
        int var9 = arg4.field1829[arg1];
        class225 var10 = class101.method604(var9 >> 16, arg3 ^ 0xFFFFFFEA);
        int var11 = var9 & 0xFFFF;
        if (arg3 != 0) {
            this.method621(-88, -26, (class150) null);
        }
        if (var10 == null) {
            class150 var12 = arg2.method972(!var7.method1544(arg3 ^ 0x7F6FD68, var8), !this.field1832);
            var12.method991(var7, var8, this.field1832);
            return var12;
        } else {
            class150 var13 = arg2.method972(!var7.method1544(arg3 ^ 0x7F6FD68, var8) & !var10.method1544(arg3 ^ 0x7F6FD68, var11), !this.field1832 & !arg4.field1832);
            var13.method975(var7, var8, var10, var11, this.field1836, arg4.field1832 | this.field1832);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILhg;I)Lhg;")
    public final class150 method620(int arg0, int arg1, class150 arg2, int arg3) {
        field1841++;
        int var5 = this.field1829[arg1];
        class225 var6 = class101.method604(var5 >> 16, -68);
        int var7 = var5 & 0xFFFF;
        if (arg3 >= -56) {
            this.field1838 = 54;
        }
        if (var6 == null) {
            return arg2.method972(true, true);
        }
        int var8 = arg0 & 0x3;
        class150 var9 = arg2.method972(!var6.method1544(133627240, var7), !this.field1832);
        if (var8 == 1) {
            var9.method981();
        } else if (var8 == 2) {
            var9.method990();
        } else if (var8 == 3) {
            var9.method992();
        }
        var9.method991(var6, var7, this.field1832);
        if (var8 == 1) {
            var9.method992();
        } else if (var8 == 2) {
            var9.method990();
        } else if (var8 == 3) {
            var9.method981();
        }
        return var9;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILhg;)Lhg;")
    public final class150 method621(int arg0, int arg1, class150 arg2) {
        int var4 = -24 / ((arg1 - 35) / 48);
        int var5 = this.field1829[arg0];
        class225 var6 = class101.method604(var5 >> 16, -80);
        field1834++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method979(true, true);
        } else {
            class150 var8 = arg2.method979(!var6.method1544(133627240, var7), !this.field1832);
            var8.method991(var6, var7, this.field1832);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method622(byte arg0) {
        field1823 = null;
        field1840 = null;
        if (arg0 == 110) {
            field1818 = null;
            field1828 = null;
            field1820 = null;
            field1833 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBLh;)V")
    private final void method623(int arg0, byte arg1, class190 arg2) {
        field1846++;
        if (arg0 == 1) {
            int var13 = arg2.method1275(128);
            this.field1824 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1824[var14] = arg2.method1275(128);
            }
            this.field1829 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field1829[var15] = arg2.method1275(128);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field1829[var16] = (arg2.method1275(128) << 16) + this.field1829[var16];
            }
        } else if (arg0 == 2) {
            this.field1819 = arg2.method1275(128);
        } else if (arg0 == 3) {
            int var11 = arg2.method1265(113);
            this.field1836 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1836[var12] = arg2.method1265(115);
            }
            this.field1836[var11] = 9999999;
        } else if (arg0 == 4) {
            this.field1830 = true;
        } else if (arg0 == 5) {
            this.field1845 = arg2.method1265(120);
        } else if (arg0 == 6) {
            this.field1838 = arg2.method1275(128);
        } else if (arg0 == 7) {
            this.field1831 = arg2.method1275(128);
        } else if (arg0 == 8) {
            this.field1835 = arg2.method1265(120);
        } else if (arg0 == 9) {
            this.field1827 = arg2.method1265(121);
        } else if (arg0 == 10) {
            this.field1822 = arg2.method1265(126);
        } else if (arg0 == 11) {
            this.field1842 = arg2.method1265(127);
        } else if (arg0 == 12) {
            int var4 = arg2.method1265(117);
            this.field1843 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1843[var5] = arg2.method1275(128);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1843[var6] += arg2.method1275(128) << 16;
            }
        } else if (arg0 == 13) {
            int var7 = arg2.method1275(128);
            this.field1844 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method1265(117);
                if (var9 > 0) {
                    this.field1844[var8] = new int[var9];
                    this.field1844[var8][0] = arg2.method1282(105);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field1844[var8][var10] = arg2.method1275(128);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field1832 = true;
        }
        if (arg1 >= -59) {
            this.method620(-34, -49, (class150) null, -124);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILhg;I)Lhg;")
    public final class150 method624(int arg0, class150 arg1, int arg2) {
        field1839++;
        int var4 = this.field1829[arg2];
        class225 var5 = class101.method604(var4 >> 16, arg0 - 49);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method972(true, true);
        }
        class150 var7 = arg1.method972(!var5.method1544(133627240, var6), !this.field1832);
        if (arg0 != -1) {
            this.method623(106, (byte) 102, (class190) null);
        }
        var7.method991(var5, var6, this.field1832);
        return var7;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lh;Z)V")
    public final void method625(class190 arg0, boolean arg1) {
        if (!arg1) {
            field1823 = null;
        }
        while (true) {
            int var3 = arg0.method1265(124);
            if (var3 == 0) {
                field1847++;
                return;
            }
            this.method623(var3, (byte) -87, arg0);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZILhg;)Lhg;")
    public final class150 method626(boolean arg0, int arg1, class150 arg2) {
        field1826++;
        int var4 = this.field1829[arg1];
        class225 var5 = class101.method604(var4 >> 16, -70);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method972(true, true);
        } else if (arg0) {
            return null;
        } else {
            class225 var7 = null;
            int var8 = 0;
            if (this.field1843 != null && this.field1843.length > arg1) {
                int var9 = this.field1843[arg1];
                var7 = class101.method604(var9 >> 16, -97);
                var8 = var9 & 0xFFFF;
            }
            if (var7 == null || var8 == 65535) {
                class150 var11 = arg2.method972(!var5.method1544(133627240, var6), !this.field1832);
                var11.method991(var5, var6, this.field1832);
                return var11;
            } else {
                class150 var10 = arg2.method972(!var5.method1544(133627240, var6) & !var7.method1544(133627240, var8), !this.field1832);
                var10.method991(var5, var6, this.field1832);
                var10.method991(var7, var8, this.field1832);
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public final void method627(byte arg0) {
        if (arg0 != 28) {
            this.method624(-67, (class150) null, 114);
        }
        if (this.field1827 == -1) {
            if (this.field1836 == null) {
                this.field1827 = 0;
            } else {
                this.field1827 = 2;
            }
        }
        if (this.field1822 == -1) {
            if (this.field1836 == null) {
                this.field1822 = 0;
            } else {
                this.field1822 = 2;
            }
        }
        field1821++;
    }
}
