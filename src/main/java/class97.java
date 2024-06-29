import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class97 extends class20 {

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Z")
    private boolean field1874 = false;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    private int field1895 = -32768;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    private int field1901 = 0;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    private int field1900 = 0;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    private int field1884;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    private int field1870;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    private int field1868;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    private int field1878;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public int field1890;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    private int field1907;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "Luc;")
    private class224 field1892;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field1894 = 1;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "Lr;")
    private static class66 field1882 = class93.method641(43, "Location");

    @OriginalMember(owner = "client!b", name = "R", descriptor = "Z")
    public static boolean field1896 = false;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "Lr;")
    public static class66 field1893 = class93.method641(43, "::rect_debug");

    @OriginalMember(owner = "client!b", name = "I", descriptor = "Lr;")
    public static class66 field1887 = field1882;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Lnj;")
    public static class230 field1877 = new class230(64);

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field1906 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "D")
    private double field1871;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "D")
    public double field1872;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "D")
    private double field1876;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "D")
    private double field1879;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "D")
    public double field1880;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "D")
    private double field1885;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "D")
    public double field1888;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "D")
    private double field1891;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    private int field1903;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "Lcj;")
    public static class28 field1909;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
    public static final void method666(int arg0, int arg1) {
        if (arg1 == -1 && !class252.field4431) {
            class130.method907(16777215);
        } else if (arg1 != -1 && (class67.field1350 != arg1 || !class257.method1723(20778)) && class164.field2936 != 0 && !class252.field4431) {
            class257.method1721(false, 0, 2, arg1, class28.field405, false, class164.field2936);
        }
        if (arg0 <= 0) {
            method666(-56, -73);
        }
        class67.field1350 = arg1;
        field1910++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBIII)V")
    public final void method667(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (!this.field1874) {
            double var6 = (double) (arg0 - this.field1869);
            double var8 = (double) (arg2 - this.field1870);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1888 = (double) this.field1878 * var6 / var10 + (double) this.field1869;
            this.field1872 = (double) this.field1907;
            this.field1880 = (double) this.field1878 * var8 / var10 + (double) this.field1870;
        }
        field1873++;
        double var12 = (double) (this.field1890 - (arg4 - 1));
        this.field1891 = ((double) arg2 - this.field1880) / var12;
        this.field1879 = ((double) arg0 - this.field1888) / var12;
        this.field1885 = Math.sqrt(this.field1891 * this.field1891 + this.field1879 * this.field1879);
        if (arg1 < -2) {
            if (!this.field1874) {
                this.field1871 = -this.field1885 * Math.tan((double) this.field1868 * 0.02454369D);
            }
            this.field1876 = ((double) arg3 - this.field1872 - this.field1871 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBLha;I)V")
    public static final void method668(int arg0, int arg1, byte arg2, class63 arg3, int arg4) {
        if (class35.field517 < 3) {
            ((class168) class231.field4052).method979(arg4, arg0, arg3.field1215, arg3.field1196, class231.field4052.field4494 / 2, class231.field4052.field4496 / 2, class259.field4562, 256, arg3.field1177, arg3.field1106);
        } else {
            class235.method1538(arg4, arg0, 0, arg3.field1177, arg3.field1106);
        }
        field1881++;
        class142.field2607[arg1] = true;
        if (arg2 != -123) {
            field1877 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
    public final void method669(int arg0, boolean arg1) {
        this.field1888 += (double) arg0 * this.field1879;
        this.field1874 = true;
        if (arg1) {
            return;
        }
        this.field1880 += (double) arg0 * this.field1891;
        field1886++;
        this.field1872 += this.field1876 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1871;
        this.field1871 += (double) arg0 * this.field1876;
        this.field1889 = (int) (Math.atan2(this.field1879, this.field1891) * 325.949D) + 1024 & 0x7FF;
        this.field1903 = (int) (Math.atan2(this.field1871, this.field1885) * 325.949D) & 0x7FF;
        if (this.field1892 == null) {
            return;
        }
        this.field1900 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1900 <= this.field1892.field3834[this.field1901]) {
                        return;
                    }
                    this.field1900 -= this.field1892.field3834[this.field1901];
                    this.field1901++;
                } while (this.field1892.field3811.length > this.field1901);
                this.field1901 -= this.field1892.field3848;
            } while (this.field1901 >= 0 && this.field1892.field3811.length > this.field1901);
            this.field1901 = 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1905++;
        class262 var11 = this.method670((byte) 46);
        if (var11 != null) {
            var11.method25(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1895 = var11.method28();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Ljh;")
    private final class262 method670(byte arg0) {
        field1897++;
        int var2 = -10 % ((-arg0 - 36) / 62);
        class73 var3 = class156.method1060(this.field1884, 1);
        class262 var4 = var3.method523(this.field1901, -10);
        if (var4 == null) {
            return null;
        } else {
            var4.method1490(this.field1903);
            return var4;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static final void method671(byte arg0) {
        if (arg0 != -96) {
            field1906 = -18;
        }
        class119.field2253.method1613((byte) 94);
        class252.field4433.method1613((byte) 94);
        field1898++;
        class63.field1241.method1613((byte) 94);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
    public final int method28() {
        field1883++;
        return this.field1895;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public static void method672(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1893 = null;
        field1877 = null;
        field1882 = null;
        field1909 = null;
        field1887 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1884 = arg0;
        this.field1874 = false;
        this.field1870 = arg3;
        this.field1868 = arg7;
        this.field1875 = arg5;
        this.field1902 = arg10;
        this.field1878 = arg8;
        this.field1890 = arg6;
        this.field1899 = arg9;
        this.field1869 = arg2;
        this.field1907 = arg4;
        this.field1904 = arg1;
        int var12 = class156.method1060(this.field1884, 1).field1448;
        if (var12 == -1) {
            this.field1892 = null;
        } else {
            this.field1892 = class47.method335((byte) -36, var12);
        }
    }
}
