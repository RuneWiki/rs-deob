import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 extends class13 {

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    private int field1852 = 256;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "[I")
    private int[] field1851 = new int[16];

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "[I")
    public int[] field1862 = new int[16];

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "[I")
    private int[] field1865 = new int[16];

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "[I")
    private int[] field1855 = new int[16];

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "[I")
    public int[] field1846 = new int[16];

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "[I")
    private int[] field1842 = new int[16];

    @OriginalMember(owner = "client!lf", name = "Eb", descriptor = "[I")
    private int[] field1886 = new int[16];

    @OriginalMember(owner = "client!lf", name = "rb", descriptor = "[I")
    public int[] field1873 = new int[16];

    @OriginalMember(owner = "client!lf", name = "Fb", descriptor = "[I")
    private int[] field1887 = new int[16];

    @OriginalMember(owner = "client!lf", name = "Xb", descriptor = "[I")
    private int[] field1905 = new int[16];

    @OriginalMember(owner = "client!lf", name = "Ub", descriptor = "[[Lw;")
    private class146[][] field1902 = new class146[16][128];

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "[I")
    private int[] field1847 = new int[16];

    @OriginalMember(owner = "client!lf", name = "Sb", descriptor = "[[Lw;")
    private class146[][] field1900 = new class146[16][128];

    @OriginalMember(owner = "client!lf", name = "Hb", descriptor = "[I")
    private int[] field1889 = new int[16];

    @OriginalMember(owner = "client!lf", name = "Yb", descriptor = "[I")
    private int[] field1906 = new int[16];

    @OriginalMember(owner = "client!lf", name = "lb", descriptor = "[I")
    private int[] field1867 = new int[16];

    @OriginalMember(owner = "client!lf", name = "Wb", descriptor = "[I")
    private int[] field1904 = new int[16];

    @OriginalMember(owner = "client!lf", name = "sb", descriptor = "Lvb;")
    private class142 field1874 = new class142();

    @OriginalMember(owner = "client!lf", name = "fc", descriptor = "Lbb;")
    private class10 field1913 = new class10(this);

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "Lab;")
    private class3 field1843 = new class3(128);

    @OriginalMember(owner = "client!lf", name = "nb", descriptor = "Loa;")
    public static class98 field1869 = class38.method349(255, "An:");

    @OriginalMember(owner = "client!lf", name = "mb", descriptor = "I")
    public static int field1868 = 0;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "Loa;")
    public static class98 field1856 = class38.method349(255, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "Loa;")
    public static class98 field1864 = class38.method349(255, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!lf", name = "kb", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!lf", name = "ob", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!lf", name = "tb", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!lf", name = "ub", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!lf", name = "xb", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!lf", name = "yb", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!lf", name = "Ab", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!lf", name = "Bb", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!lf", name = "Cb", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!lf", name = "Db", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lf", name = "Gb", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!lf", name = "Ib", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!lf", name = "Jb", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!lf", name = "Kb", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!lf", name = "Lb", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!lf", name = "Mb", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!lf", name = "Nb", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!lf", name = "Ob", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!lf", name = "Pb", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!lf", name = "Qb", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!lf", name = "Rb", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!lf", name = "Tb", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!lf", name = "Zb", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!lf", name = "ac", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!lf", name = "bc", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!lf", name = "dc", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!lf", name = "ec", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!lf", name = "cc", descriptor = "J")
    private long field1910;

    @OriginalMember(owner = "client!lf", name = "hc", descriptor = "J")
    private long field1915;

    @OriginalMember(owner = "client!lf", name = "Vb", descriptor = "Loc;")
    public static class100 field1903;

    @OriginalMember(owner = "client!lf", name = "qb", descriptor = "Lwe;")
    public static class151 field1872;

    @OriginalMember(owner = "client!lf", name = "gc", descriptor = "Z")
    private boolean field1914;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "[Loc;")
    public static class100[] field1857;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    private final void method656(int arg0, int arg1) {
        field1861++;
        for (class146 var3 = (class146) this.field1913.field200.method512(91); var3 != null; var3 = (class146) this.field1913.field200.method513(arg0 - 125)) {
            if ((arg1 < 0 || var3.field3552 == arg1) && var3.field3543 < 0) {
                this.field1900[var3.field3552][var3.field3556] = null;
                var3.field3543 = 0;
            }
        }
        if (arg0 != 0) {
            this.method661((byte) -24);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Z")
    public final synchronized boolean method657(int arg0) {
        if (arg0 > -26) {
            return false;
        } else {
            field1885++;
            return this.field1874.method1137();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V")
    public final synchronized void method658(byte arg0, int arg1) {
        field1878++;
        if (arg0 != 83) {
            this.field1865 = null;
        }
        this.field1852 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public static final void method659(int arg0) {
        try {
            int var1 = 44 % ((arg0 + 11) / 61);
            Graphics var2 = class73.field1506.getGraphics();
            class3.field40.method406(32, 4, 4, var2);
        } catch (Exception var3) {
            class73.field1506.repaint();
        }
        field1882++;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public final synchronized void method660(int arg0) {
        this.field1874.method1148();
        int var2 = 106 % ((arg0 - 40) / 54);
        this.method666(false);
        field1908++;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    private final void method661(byte arg0) {
        field1877++;
        int var2 = this.field1912;
        int var3 = this.field1911;
        long var4 = this.field1910;
        while (this.field1912 == var2) {
            while (this.field1874.field3456[var3] == var2) {
                this.field1874.method1145(var3);
                int var6 = this.field1874.method1151(var3);
                if (var6 == 1) {
                    this.field1874.method1144();
                    this.field1874.method1150(var3);
                    if (this.field1874.method1140()) {
                        if (!this.field1914 || var2 == 0) {
                            this.method666(false);
                            this.field1874.method1148();
                            return;
                        }
                        this.field1874.method1143(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method687(var6, (byte) -118);
                }
                this.field1874.method1138(var3);
                this.field1874.method1150(var3);
            }
            var3 = this.field1874.method1139();
            var2 = this.field1874.field3456[var3];
            var4 = this.field1874.method1149(var2);
        }
        this.field1911 = var3;
        this.field1912 = var2;
        if (arg0 == -112) {
            this.field1910 = var4;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
    public static final byte[] method662(boolean arg0, boolean arg1, Object arg2) {
        if (!arg0) {
            method663(124, true, 36);
        }
        field1890++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class146.method1170((byte) 108, var3) : var3;
        } else if (arg2 instanceof class57) {
            class57 var4 = (class57) arg2;
            return var4.method459(65);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZI)I")
    public static final int method663(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1869 = null;
        }
        field1893++;
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
    public final synchronized void method664(int arg0) {
        field1844++;
        if (arg0 != 128) {
            this.method677(-47, -5, (byte) -37);
        }
        for (class65 var2 = (class65) this.field1843.method10((byte) 54); var2 != null; var2 = (class65) this.field1843.method14((byte) -96)) {
            var2.method975(-34);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    private final void method665(int arg0, int arg1) {
        if (arg1 != -809757783) {
            this.field1847 = null;
        }
        field1840++;
        if ((this.field1846[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var3 = (class146) this.field1913.field200.method512(arg1 + 809757870); var3 != null; var3 = (class146) this.field1913.field200.method513(-78)) {
            if (var3.field3552 == arg0 && this.field1900[arg0][var3.field3556] == null && var3.field3543 < 0) {
                var3.field3543 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    private final void method666(boolean arg0) {
        this.method678(22391, -1);
        this.method673(-1, (byte) 89);
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1887[var2] = this.field1905[var2];
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field1886[var3] = class150.method1211(this.field1905[var3], -128);
        }
        if (arg0) {
            this.method688(73, true, -85);
        }
        field1879++;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public final synchronized void method112(int arg0) {
        field1899++;
        if (this.field1874.method1137()) {
            int var2 = this.field1874.field3462 * 1000000 / class8.field194;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1915;
                if (this.field1910 - var3 >= 0L) {
                    this.field1915 = var3;
                    break;
                }
                int var5 = (int) ((this.field1910 + (long) var2 - this.field1915 - 1L) / (long) var2);
                this.field1915 += (long) var2 * (long) var5;
                this.field1913.method112(var5);
                this.method661((byte) -112);
                arg0 -= var5;
            } while (this.field1874.method1137());
        }
        this.field1913.method112(arg0);
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)I")
    public final int method667(int arg0) {
        field1866++;
        return arg0 <= 118 ? 116 : this.field1852;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lw;B)I")
    private final int method668(class146 arg0, byte arg1) {
        field1875++;
        int var3 = (arg0.field3545 * arg0.field3544 >> 12) + arg0.field3532;
        class52 var4 = arg0.field3550;
        int var5 = ((this.field1906[arg0.field3552] - 8192) * this.field1851[arg0.field3552] >> 12) + var3;
        if (var4.field1152 > 0 && (var4.field1140 > 0 || this.field1889[arg0.field3552] > 0)) {
            int var6 = var4.field1140 << 2;
            int var7 = var4.field1147 << 1;
            if (arg0.field3548 < var7) {
                var6 = arg0.field3548 * var6 / var7;
            }
            int var8 = (this.field1889[arg0.field3552] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field3541 & 0x1FF) * 0.01227184630308513D);
            var5 += (int) ((double) var8 * var9);
        }
        if (arg1 != 57) {
            this.method675(5, 77, -43, 65);
        }
        int var11 = (int) ((double) (arg0.field3531.field2603 * 256) * Math.pow(2.0D, (double) var5 * 3.255208333333333E-4D) / (double) class8.field194 + 0.5D);
        return var11 < 1 ? 1 : var11;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILw;)Z")
    public final boolean method669(int arg0, class146 arg1) {
        arg1.field3565 = class8.field194 / 100;
        field1901++;
        if (arg1.field3543 >= 0 && (arg1.field3557 == null || arg1.field3557.method863())) {
            arg1.method1171(64);
            arg1.method975(-127);
            if (arg1.field3561 > 0 && this.field1902[arg1.field3552][arg1.field3561] == arg1) {
                this.field1902[arg1.field3552][arg1.field3561] = null;
            }
            return true;
        }
        int var3 = arg1.field3544;
        if (var3 > 0) {
            int var4 = var3 - (int) (Math.pow(2.0D, (double) this.field1842[arg1.field3552] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var4 < 0) {
                var4 = 0;
            }
            arg1.field3544 = var4;
        }
        arg1.field3557.method880(this.method668(arg1, (byte) 57));
        if (arg0 != 65280) {
            return false;
        }
        class52 var5 = arg1.field3550;
        boolean var6 = false;
        arg1.field3548++;
        double var7 = (double) ((arg1.field3556 - 60 << 8) + (arg1.field3545 * arg1.field3544 >> 12)) * 5.086263020833333E-6D;
        arg1.field3541 += var5.field1152;
        if (var5.field1149 > 0) {
            if (var5.field1156 <= 0) {
                arg1.field3534 += 128;
            } else {
                arg1.field3534 += (int) (Math.pow(2.0D, (double) var5.field1156 * var7) * 128.0D + 0.5D);
            }
        }
        if (var5.field1138 != null) {
            if (var5.field1142 <= 0) {
                arg1.field3559 += 128;
            } else {
                arg1.field3559 += (int) (Math.pow(2.0D, (double) var5.field1142 * var7) * 128.0D + 0.5D);
            }
            while (var5.field1138.length - 2 > arg1.field3533 && arg1.field3559 > (var5.field1138[arg1.field3533 + 2] & 0xFF) << 8) {
                arg1.field3533 += 2;
            }
            if (var5.field1138.length - 2 == arg1.field3533 && var5.field1138[arg1.field3533 + 1] == 0) {
                var6 = true;
            }
        }
        if (arg1.field3543 >= 0 && var5.field1146 != null && (this.field1846[arg1.field3552] & 0x1) == 0 && (arg1.field3561 < 0 || this.field1902[arg1.field3552][arg1.field3561] != arg1)) {
            if (var5.field1141 <= 0) {
                arg1.field3543 += 128;
            } else {
                arg1.field3543 += (int) (Math.pow(2.0D, (double) var5.field1141 * var7) * 128.0D + 0.5D);
            }
            while (arg1.field3567 < var5.field1146.length - 2 && (var5.field1146[arg1.field3567 + 2] & 0xFF) << 8 < arg1.field3543) {
                arg1.field3567 += 2;
            }
            if (var5.field1146.length - 2 == arg1.field3567) {
                var6 = true;
            }
        }
        if (!var6) {
            arg1.field3557.method856(arg1.field3565, this.method671((byte) -88, arg1), this.method684(arg1, 16356));
            return false;
        }
        arg1.field3557.method858(arg1.field3565);
        if (arg1.field3557.method881()) {
            this.field1913.field224.method1217(arg1.field3557);
        }
        arg1.method1171(64);
        if (arg1.field3543 >= 0) {
            arg1.method975(arg0 ^ 0xFFFF0089);
            if (arg1.field3561 > 0 && this.field1902[arg1.field3552][arg1.field3561] == arg1) {
                this.field1902[arg1.field3552][arg1.field3561] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)V")
    public final synchronized void method670(int arg0) {
        field1880++;
        class65 var2 = (class65) this.field1843.method10((byte) 54);
        if (arg0 != -1819595320) {
            this.method668(null, (byte) -30);
        }
        while (var2 != null) {
            var2.method526(0);
            var2 = (class65) this.field1843.method14((byte) -96);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLw;)I")
    private final int method671(byte arg0, class146 arg1) {
        field1896++;
        class52 var3 = arg1.field3550;
        int var4 = this.field1904[arg1.field3552] * this.field1867[arg1.field3552] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg1.field3537 * var5 + 16384 >> 15;
        int var7 = this.field1852 * var6 + 128 >> 8;
        if (var3.field1149 > 0) {
            var7 = (int) (Math.pow(0.5D, (double) arg1.field3534 * 1.953125E-5D * (double) var3.field1149) * (double) var7 + 0.5D);
        }
        if (var3.field1138 != null) {
            int var8 = var3.field1138[arg1.field3533 + 1];
            int var9 = arg1.field3559;
            if (arg1.field3533 < var3.field1138.length - 2) {
                int var10 = (var3.field1138[arg1.field3533 + 2] & 0xFF) << 8;
                int var11 = (var3.field1138[arg1.field3533] & 0xFF) << 8;
                var8 += (var3.field1138[arg1.field3533 + 3] - var8) * (var9 - var11) / (var10 - var11);
            }
            var7 = var7 * var8 + 32 >> 6;
        }
        if (arg0 > -51) {
            return -32;
        }
        if (arg1.field3543 > 0 && var3.field1146 != null) {
            int var12 = arg1.field3543;
            int var13 = var3.field1146[arg1.field3567 + 1];
            if (var3.field1146.length - 2 > arg1.field3567) {
                int var14 = (var3.field1146[arg1.field3567] & 0xFF) << 8;
                int var15 = (var3.field1146[arg1.field3567 + 2] & 0xFF) << 8;
                var13 += (var3.field1146[arg1.field3567 + 3] - var13) * (-var14 + var12) / (var15 - var14);
            }
            var7 = var7 * var13 + 32 >> 6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "(I)V")
    public static final void method672(int arg0) {
        field1881++;
        if (!class141.field3453) {
            return;
        }
        class73.field1516 = null;
        class150.field3712 = null;
        class83.field1922 = null;
        class80.field1763 = null;
        class134.field3285 = null;
        class113.field2558 = null;
        class15.field301 = null;
        class83.field1924 = null;
        class83.field1925 = null;
        class46.field1068 = null;
        field1903 = null;
        class71.field1468 = null;
        class97.field2244 = null;
        class126.field2792 = null;
        class58.field1291 = null;
        class91.field2109 = null;
        class97.field2241 = null;
        class38.field936 = null;
        class132.field3161 = null;
        class48.field1089 = null;
        class78.field1708 = null;
        class52.field1157 = null;
        class112.field2514 = null;
        class79.field1730 = null;
        class102.field2359 = null;
        class3.field40 = null;
        class36.field887 = null;
        class19.field425 = null;
        class79.field1735 = null;
        class105.field2417 = null;
        class137.field3348 = null;
        class26.field637 = null;
        class123.field2747 = null;
        class115.field2590 = null;
        class127.field2852 = null;
        int var1 = -71 / ((arg0 - 29) / 37);
        class6.field108 = null;
        class5.field75 = null;
        class141.field3453 = false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
    private final void method673(int arg0, byte arg1) {
        field1871++;
        if (arg0 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method673(var3, (byte) 89);
            }
            return;
        }
        this.field1904[arg0] = 12800;
        this.field1847[arg0] = 8192;
        this.field1867[arg0] = 16383;
        this.field1906[arg0] = 8192;
        this.field1889[arg0] = 0;
        this.field1842[arg0] = 8192;
        this.method665(arg0, -809757783);
        this.method683(arg0, (byte) -122);
        this.field1846[arg0] = 0;
        this.field1855[arg0] = 32767;
        this.field1851[arg0] = 256;
        if (arg1 != 89) {
            method663(72, true, 125);
        }
        this.field1862[arg0] = 0;
        this.method676(8192, 2, arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V")
    public final synchronized void method674(byte arg0, int arg1, int arg2) {
        if (arg0 <= 45) {
            this.method688(-81, true, 10);
        }
        field1895++;
        this.method688(arg1, true, arg2);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "()Lbe;")
    public final synchronized class13 method113() {
        field1870++;
        return this.field1913;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V")
    private final void method675(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 106) {
            this.field1904 = null;
        }
        field1883++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    private final void method676(int arg0, int arg1, int arg2) {
        this.field1865[arg2] = arg0;
        field1888++;
        this.field1873[arg2] = (int) (Math.pow((double) arg1, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIB)V")
    private final void method677(int arg0, int arg1, byte arg2) {
        if (arg2 != 71) {
            this.method676(38, 66, -3);
        }
        field1898++;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V")
    private final void method678(int arg0, int arg1) {
        if (arg0 != 22391) {
            this.field1911 = -124;
        }
        field1894++;
        for (class146 var3 = (class146) this.field1913.field200.method512(-86); var3 != null; var3 = (class146) this.field1913.field200.method513(-104)) {
            if (arg1 < 0 || var3.field3552 == arg1) {
                if (var3.field3557 != null) {
                    var3.field3557.method858(class8.field194 / 100);
                    if (var3.field3557.method881()) {
                        this.field1913.field224.method1217(var3.field3557);
                    }
                    var3.method1171(arg0 - 22327);
                }
                if (var3.field3543 < 0) {
                    this.field1900[var3.field3552][var3.field3556] = null;
                }
                var3.method975(-128);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()Lbe;")
    public final synchronized class13 method110() {
        field1876++;
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "(I)V")
    public static void method679(int arg0) {
        field1864 = null;
        field1903 = null;
        field1872 = null;
        field1857 = null;
        field1869 = null;
        field1856 = null;
        if (arg0 >= -87) {
            field1856 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "([III)V")
    public final synchronized void method119(int[] arg0, int arg1, int arg2) {
        field1859++;
        if (this.field1874.method1137()) {
            int var4 = this.field1874.field3462 * 1000000 / class8.field194;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1915;
                if (this.field1910 - var5 >= 0L) {
                    this.field1915 = var5;
                    break;
                }
                int var7 = (int) (((long) var4 + this.field1910 - this.field1915 - 1L) / (long) var4);
                arg2 -= var7;
                this.field1915 += (long) var4 * (long) var7;
                this.field1913.method119(arg0, arg1, var7);
                this.method661((byte) -112);
                arg1 += var7;
            } while (this.field1874.method1137());
        }
        this.field1913.method119(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lw;ZI)V")
    public final void method680(class146 arg0, boolean arg1, int arg2) {
        field1853++;
        if (arg2 != -1) {
            field1856 = null;
        }
        int var4 = arg0.field3531.field2602.length;
        int var6;
        if (arg1 && arg0.field3531.field2606) {
            int var5 = var4 + var4 - arg0.field3531.field2604;
            var6 = (int) ((long) this.field1862[arg0.field3552] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var6 >= var7) {
                arg0.field3557.method855(true);
                var6 = var7 + var7 - var6 - 1;
            }
        } else {
            var6 = (int) ((long) this.field1862[arg0.field3552] * (long) var4 >> 6);
        }
        arg0.field3557.method877(var6);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIII)V")
    private final void method681(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field1913 = null;
        }
        class146 var5 = this.field1900[arg2][arg0];
        field1841++;
        if (var5 == null) {
            return;
        }
        this.field1900[arg2][arg0] = null;
        if ((this.field1846[arg2] & 0x2) == 0) {
            var5.field3543 = 0;
            return;
        }
        for (class146 var6 = (class146) this.field1913.field200.method512(98); var6 != null; var6 = (class146) this.field1913.field200.method513(arg3 ^ 0xFFFFFFBB)) {
            if (var5.field3552 == var6.field3552 && var6.field3543 < 0 && var5 != var6) {
                var5.field3543 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)V")
    private final void method682(int arg0, int arg1, int arg2) {
        field1863++;
        this.field1906[arg2] = arg1;
        if (arg0 <= 44) {
            this.method675(67, -96, -53, -73);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)V")
    private final void method683(int arg0, byte arg1) {
        if ((this.field1846[arg0] & 0x4) != 0) {
            for (class146 var3 = (class146) this.field1913.field200.method512(-114); var3 != null; var3 = (class146) this.field1913.field200.method513(-116)) {
                if (var3.field3552 == arg0) {
                    var3.field3553 = 0;
                }
            }
        }
        field1849++;
        int var4 = -61 / ((arg1 + 55) / 60);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lw;I)I")
    private final int method684(class146 arg0, int arg1) {
        field1845++;
        if (arg1 == 16356) {
            int var3 = this.field1847[arg0.field3552];
            return var3 >= 8192 ? 16384 - ((128 - arg0.field3558) * (-var3 + 16384) + 32 >> 6) : arg0.field3558 * var3 + 32 >> 6;
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V")
    private final void method685(boolean arg0, int arg1, int arg2) {
        field1892++;
        if (this.field1887[arg1] != arg2) {
            this.field1887[arg1] = arg2;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field1902[arg1][var4] = null;
            }
        }
        if (!arg0) {
            this.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(IIII)V")
    private final void method686(int arg0, int arg1, int arg2, int arg3) {
        this.method681(arg3, 64, arg0, 0);
        field1884++;
        if ((this.field1846[arg0] & 0x2) != 0) {
            for (class146 var5 = (class146) this.field1913.field200.method520((byte) -11); var5 != null; var5 = (class146) this.field1913.field200.method516(false)) {
                if (var5.field3552 == arg0 && var5.field3543 < 0) {
                    this.field1900[arg0][var5.field3556] = null;
                    this.field1900[arg0][arg3] = var5;
                    int var6 = (var5.field3545 * var5.field3544 >> 12) + var5.field3532;
                    var5.field3532 += arg3 - var5.field3556 << 8;
                    var5.field3544 = 4096;
                    var5.field3545 = var6 - var5.field3532;
                    var5.field3556 = arg3;
                    return;
                }
            }
        }
        class65 var7 = (class65) this.field1843.method17(-16, (long) this.field1887[arg0]);
        if (var7 == null) {
            return;
        }
        class116 var8 = var7.field1380[arg3];
        if (var8 == null) {
            return;
        }
        if (arg2 > -82) {
            this.method678(43, 18);
        }
        class146 var9 = new class146();
        var9.field3552 = arg0;
        var9.field3569 = var7;
        var9.field3531 = var8;
        var9.field3550 = var7.field1385[arg3];
        var9.field3561 = var7.field1390[arg3];
        var9.field3556 = arg3;
        var9.field3537 = var7.field1391[arg3] * var7.field1381 * arg1 * arg1 + 1024 >> 11;
        var9.field3558 = var7.field1393[arg3] & 0xFF;
        var9.field3532 = (arg3 << 8) - (var7.field1379[arg3] & 0x7FFF);
        var9.field3534 = 0;
        var9.field3533 = 0;
        var9.field3567 = 0;
        var9.field3559 = 0;
        var9.field3543 = -1;
        if (this.field1862[arg0] == 0) {
            var9.field3557 = class104.method864(var8, this.method668(var9, (byte) 57), this.method671((byte) -89, var9), this.method684(var9, 16356));
        } else {
            var9.field3557 = class104.method864(var8, this.method668(var9, (byte) 57), 0, this.method684(var9, 16356));
            this.method680(var9, var7.field1379[arg3] < 0, -1);
        }
        if (var7.field1379[arg3] < 0) {
            var9.field3557.method851(-1);
        }
        if (var9.field3561 >= 0) {
            class146 var10 = this.field1902[arg0][var9.field3561];
            if (var10 != null && var10.field3543 < 0) {
                this.field1900[arg0][var10.field3556] = null;
                var10.field3543 = 0;
            }
            this.field1902[arg0][var9.field3561] = var9;
        }
        this.field1913.field200.method508(107, var9);
        this.field1900[arg0][arg3] = var9;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(IB)V")
    private final void method687(int arg0, byte arg1) {
        field1909++;
        int var3 = arg0 & 0xF0;
        if (var3 == 128) {
            int var4 = arg0 & 0xF;
            int var5 = arg0 >> 8 & 0x7F;
            int var6 = arg0 >> 16 & 0x7F;
            this.method681(var5, var6, var4, 0);
            return;
        }
        if (arg1 > -20) {
            this.field1865 = null;
        }
        if (var3 == 144) {
            int var7 = arg0 & 0xF;
            int var8 = arg0 >> 8 & 0x7F;
            int var9 = arg0 >> 16 & 0x7F;
            if (var9 <= 0) {
                this.method681(var8, 64, var7, 0);
            } else {
                this.method686(var7, var9, -110, var8);
            }
        } else if (var3 == 160) {
            int var10 = arg0 & 0xF;
            int var11 = arg0 >> 8 & 0x7F;
            int var12 = arg0 >> 16 & 0x7F;
            this.method675(119, var12, var11, var10);
        } else if (var3 == 176) {
            int var13 = arg0 & 0xF;
            int var14 = arg0 >> 16 & 0x7F;
            int var15 = arg0 >> 8 & 0x7F;
            if (var15 == 0) {
                this.field1886[var13] = (var14 << 14) + class150.method1211(-2080769, this.field1886[var13]);
            }
            if (var15 == 32) {
                this.field1886[var13] = class150.method1211(-16257, this.field1886[var13]) + (var14 << 7);
            }
            if (var15 == 1) {
                this.field1889[var13] = (var14 << 7) + class150.method1211(-16257, this.field1889[var13]);
            }
            if (var15 == 33) {
                this.field1889[var13] = var14 + class150.method1211(-128, this.field1889[var13]);
            }
            if (var15 == 5) {
                this.field1842[var13] = (var14 << 7) + class150.method1211(-16257, this.field1842[var13]);
            }
            if (var15 == 37) {
                this.field1842[var13] = var14 + class150.method1211(-128, this.field1842[var13]);
            }
            if (var15 == 7) {
                this.field1904[var13] = class150.method1211(-16257, this.field1904[var13]) + (var14 << 7);
            }
            if (var15 == 39) {
                this.field1904[var13] = var14 + class150.method1211(this.field1904[var13], -128);
            }
            if (var15 == 10) {
                this.field1847[var13] = class150.method1211(-16257, this.field1847[var13]) + (var14 << 7);
            }
            if (var15 == 42) {
                this.field1847[var13] = class150.method1211(this.field1847[var13], -128) + var14;
            }
            if (var15 == 11) {
                this.field1867[var13] = class150.method1211(this.field1867[var13], -16257) + (var14 << 7);
            }
            if (var15 == 43) {
                this.field1867[var13] = var14 + class150.method1211(-128, this.field1867[var13]);
            }
            if (var15 == 64) {
                if (var14 < 64) {
                    this.field1846[var13] = class150.method1211(this.field1846[var13], -2);
                } else {
                    this.field1846[var13] = class94.method751(this.field1846[var13], 1);
                }
            }
            if (var15 == 65) {
                if (var14 < 64) {
                    this.method665(var13, -809757783);
                    this.field1846[var13] = class150.method1211(this.field1846[var13], -3);
                } else {
                    this.field1846[var13] = class94.method751(this.field1846[var13], 2);
                }
            }
            if (var15 == 99) {
                this.field1855[var13] = (var14 << 7) + class150.method1211(this.field1855[var13], 127);
            }
            if (var15 == 98) {
                this.field1855[var13] = var14 + class150.method1211(16256, this.field1855[var13]);
            }
            if (var15 == 101) {
                this.field1855[var13] = (var14 << 7) + (class150.method1211(127, this.field1855[var13]) + 16384);
            }
            if (var15 == 100) {
                this.field1855[var13] = class150.method1211(this.field1855[var13], 16256) + var14 + 16384;
            }
            if (var15 == 120) {
                this.method678(22391, var13);
            }
            if (var15 == 121) {
                this.method673(var13, (byte) 89);
            }
            if (var15 == 123) {
                this.method656(0, var13);
            }
            if (var15 == 6) {
                int var16 = this.field1855[var13];
                if (var16 == 16384) {
                    this.field1851[var13] = class150.method1211(this.field1851[var13], -16257) + (var14 << 7);
                }
            }
            if (var15 == 38) {
                int var17 = this.field1855[var13];
                if (var17 == 16384) {
                    this.field1851[var13] = var14 + class150.method1211(this.field1851[var13], -128);
                }
            }
            if (var15 == 16) {
                this.field1862[var13] = (var14 << 7) + class150.method1211(-16257, this.field1862[var13]);
            }
            if (var15 == 48) {
                this.field1862[var13] = class150.method1211(-128, this.field1862[var13]) + var14;
            }
            if (var15 == 81) {
                if (var14 < 64) {
                    this.method683(var13, (byte) 70);
                    this.field1846[var13] = class150.method1211(this.field1846[var13], -5);
                } else {
                    this.field1846[var13] = class94.method751(this.field1846[var13], 4);
                }
            }
            if (var15 == 17) {
                this.method676((var14 << 7) + (this.field1865[var13] & 0xFFFFC07F), 2, var13);
            }
            if (var15 == 49) {
                this.method676((this.field1865[var13] & 0xFFFFFF80) + var14, 2, var13);
            }
        } else if (var3 == 192) {
            int var18 = arg0 & 0xF;
            int var19 = arg0 >> 8 & 0x7F;
            this.method685(true, var18, this.field1886[var18] + var19);
        } else if (var3 == 208) {
            int var20 = arg0 >> 8 & 0x7F;
            int var21 = arg0 & 0xF;
            this.method677(var21, var20, (byte) 71);
        } else if (var3 == 224) {
            int var22 = arg0 & 0xF;
            int var23 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method682(79, var23, var22);
        } else {
            int var24 = arg0 & 0xFF;
            if (var24 == 255) {
                this.method666(false);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IZI)V")
    private final void method688(int arg0, boolean arg1, int arg2) {
        field1891++;
        this.field1905[arg0] = arg2;
        this.field1886[arg0] = class150.method1211(arg2, -128);
        if (arg1) {
            this.method685(arg1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "()I")
    public final synchronized int method109() {
        field1897++;
        return 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lha;IILtb;Lva;)Z")
    public final synchronized boolean method689(class50 arg0, int arg1, int arg2, class130 arg3, class141 arg4) {
        arg0.method423();
        int[] var6 = null;
        if (arg1 >= -119) {
            this.method110();
        }
        if (arg2 > 0) {
            var6 = new int[] { arg2 };
        }
        boolean var7 = true;
        for (class35 var8 = (class35) arg0.field1114.method10((byte) 54); var8 != null; var8 = (class35) arg0.field1114.method14((byte) -96)) {
            int var9 = (int) var8.field2729;
            class65 var10 = (class65) this.field1843.method17(-16, (long) var9);
            if (var10 == null) {
                var10 = class117.method933(var9, -4197, arg3);
                if (var10 == null) {
                    var7 = false;
                    continue;
                }
                this.field1843.method12(var10, -31636, (long) var9);
            }
            if (!var10.method527(-28965, var8.field860, arg4, var6)) {
                var7 = false;
            }
        }
        if (var7) {
            arg0.method422();
        }
        field1858++;
        return var7;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lha;IZ)V")
    public final synchronized void method690(class50 arg0, int arg1, boolean arg2) {
        field1848++;
        this.method660(-69);
        this.field1874.method1142(arg0.field1113);
        this.field1915 = 0L;
        this.field1914 = arg2;
        int var4 = this.field1874.method1152();
        int var5 = 0;
        if (arg1 < 78) {
            return;
        }
        while (var5 < var4) {
            this.field1874.method1145(var5);
            this.field1874.method1138(var5);
            this.field1874.method1150(var5);
            var5++;
        }
        this.field1911 = this.field1874.method1139();
        this.field1912 = this.field1874.field3456[this.field1911];
        this.field1910 = this.field1874.method1149(this.field1912);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)V")
    public static final void method691(long arg0, byte arg1) {
        if (arg1 > -65) {
            return;
        }
        field1907++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class57.method460(-52, arg0 - 1L);
            class57.method460(-35, 1L);
        } else {
            class57.method460(110, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lw;B)Z")
    public final boolean method692(class146 arg0, byte arg1) {
        field1854++;
        if (arg1 != -55) {
            this.method113();
        }
        if (arg0.field3557 != null) {
            return false;
        }
        if (arg0.field3543 >= 0) {
            arg0.method975(72);
            if (arg0.field3561 > 0 && this.field1902[arg0.field3552][arg0.field3561] == arg0) {
                this.field1902[arg0.field3552][arg0.field3561] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class82() {
        this.method666(false);
    }
}
