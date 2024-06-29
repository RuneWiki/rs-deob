import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class88 extends class169 {

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "Z")
    private boolean field1871 = false;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    private int field1866 = 0;

    @OriginalMember(owner = "client!jh", name = "mb", descriptor = "I")
    private int field1890 = 0;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    private int field1875;

    @OriginalMember(owner = "client!jh", name = "lb", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    private int field1878;

    @OriginalMember(owner = "client!jh", name = "rb", descriptor = "I")
    private int field1895;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    private int field1881;

    @OriginalMember(owner = "client!jh", name = "sb", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    private int field1867;

    @OriginalMember(owner = "client!jh", name = "pb", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    private int field1868;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "Lke;")
    private class94 field1880;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "[Lcd;")
    public static class23[] field1874 = new class23[1000];

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "[Lcd;")
    public static class23[] field1876 = new class23[500];

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "Z")
    public static boolean field1884 = false;

    @OriginalMember(owner = "client!jh", name = "hb", descriptor = "Lcd;")
    public static class23 field1885 = class54.method414("headicons_hint", -1);

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "D")
    public double field1869;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "D")
    private double field1870;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "D")
    public double field1877;

    @OriginalMember(owner = "client!jh", name = "ib", descriptor = "D")
    private double field1886;

    @OriginalMember(owner = "client!jh", name = "kb", descriptor = "D")
    private double field1888;

    @OriginalMember(owner = "client!jh", name = "nb", descriptor = "D")
    private double field1891;

    @OriginalMember(owner = "client!jh", name = "qb", descriptor = "D")
    public double field1894;

    @OriginalMember(owner = "client!jh", name = "tb", descriptor = "D")
    private double field1897;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!jh", name = "jb", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!jh", name = "ob", descriptor = "I")
    private int field1892;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(BI)V")
    public final void method582(byte arg0, int arg1) {
        this.field1871 = true;
        this.field1877 += this.field1891 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1888;
        this.field1888 += (double) arg1 * this.field1891;
        if (arg0 != 44) {
            this.field1866 = -15;
        }
        this.field1894 += (double) arg1 * this.field1886;
        this.field1869 += (double) arg1 * this.field1870;
        this.field1879 = (int) (Math.atan2(this.field1886, this.field1870) * 325.949D) + 1024 & 0x7FF;
        this.field1892 = (int) (Math.atan2(this.field1888, this.field1897) * 325.949D) & 0x7FF;
        if (this.field1880 != null) {
            this.field1890 += arg1;
            label29: while (true) {
                do {
                    do {
                        if (this.field1880.field1992[this.field1866] >= this.field1890) {
                            break label29;
                        }
                        this.field1890 -= this.field1880.field1992[this.field1866];
                        this.field1866++;
                    } while (this.field1880.field1973.length > this.field1866);
                    this.field1866 -= this.field1880.field1978;
                } while (this.field1866 >= 0 && this.field1866 < this.field1880.field1973.length);
                this.field1866 = 0;
            }
        }
        field1887++;
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
    public static void method583(int arg0) {
        field1874 = null;
        if (arg0 != 500) {
            field1876 = null;
        }
        field1885 = null;
        field1876 = null;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)Lbh;")
    public final class18 method31(int arg0) {
        class29 var2 = class82.method553((byte) 6, this.field1868);
        field1882++;
        class18 var3 = var2.method221(this.field1866, -78);
        if (var3 == null) {
            return null;
        } else {
            var3.method108(this.field1892);
            return arg0 > -101 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIB)V")
    public final void method584(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field1871) {
            double var6 = (double) (arg0 - this.field1867);
            double var8 = (double) (arg1 - this.field1875);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1869 = (double) this.field1881 * var8 / var10 + (double) this.field1875;
            this.field1894 = (double) this.field1881 * var6 / var10 + (double) this.field1867;
            this.field1877 = this.field1895;
        }
        field1872++;
        double var12 = (double) (this.field1893 + 1 - arg3);
        this.field1886 = ((double) arg0 - this.field1894) / var12;
        this.field1870 = ((double) arg1 - this.field1869) / var12;
        this.field1897 = Math.sqrt(this.field1886 * this.field1886 + this.field1870 * this.field1870);
        if (arg4 < 78) {
            this.method31(30);
        }
        if (!this.field1871) {
            this.field1888 = -this.field1897 * Math.tan((double) this.field1878 * 0.02454369D);
        }
        this.field1891 = ((double) arg2 - this.field1877 - this.field1888 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1875 = arg3;
        this.field1889 = arg9;
        this.field1878 = arg7;
        this.field1895 = arg4;
        this.field1881 = arg8;
        this.field1896 = arg1;
        this.field1867 = arg2;
        this.field1871 = false;
        this.field1893 = arg6;
        this.field1868 = arg0;
        this.field1883 = arg10;
        this.field1873 = arg5;
        int var12 = class82.method553((byte) 6, this.field1868).field636;
        if (var12 == -1) {
            this.field1880 = null;
        } else {
            this.field1880 = class20.method128(var12, (byte) 20);
        }
    }
}
