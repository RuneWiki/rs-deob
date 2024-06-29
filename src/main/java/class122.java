import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class122 extends class94 {

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Z")
    private boolean field1875 = false;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    private int field1887 = -1;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    private int field1895 = 0;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    private int field1882 = 0;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    private int field1911 = -32768;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    private int field1914;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    private int field1893;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    private int field1907;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    private int field1897;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lgh;")
    private class222 field1881;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field1906 = 0;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "D")
    public double field1877;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "D")
    private double field1883;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "D")
    public double field1884;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "D")
    private double field1889;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "D")
    private double field1894;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "D")
    private double field1899;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "D")
    public double field1900;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "D")
    private double field1903;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "Lcj;")
    private class243 field1910;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "Lrg;")
    public static class70 field1901;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()I", line = 4)
    public final int method112() {
        field1888++;
        return this.field1911;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 294)
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1879 = arg10;
        this.field1914 = arg4;
        this.field1909 = arg5;
        this.field1893 = arg8;
        this.field1876 = arg1;
        this.field1875 = false;
        this.field1892 = arg9;
        this.field1907 = arg7;
        this.field1878 = arg6;
        this.field1886 = arg2;
        this.field1897 = arg0;
        this.field1885 = arg3;
        int var12 = class63.method428(false, this.field1897).field2355;
        if (var12 == -1) {
            this.field1881 = null;
        } else {
            this.field1881 = class118.method809((byte) 97, var12);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)V", line = 19)
    public final void method827(byte arg0, int arg1) {
        this.field1884 += (double) arg1 * this.field1889;
        this.field1877 += (double) arg1 * this.field1883;
        this.field1875 = true;
        if (this.field1907 == -1) {
            this.field1900 += (double) arg1 * this.field1899;
        } else {
            this.field1900 += this.field1903 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1899;
            this.field1899 += (double) arg1 * this.field1903;
        }
        field1904++;
        this.field1912 = (int) (Math.atan2(this.field1889, this.field1883) * 325.949D) + 1024 & 0x7FF;
        if (arg0 > -70) {
            return;
        }
        this.field1902 = (int) (Math.atan2(this.field1899, this.field1894) * 325.949D) & 0x7FF;
        if (this.field1881 == null) {
            return;
        }
        this.field1895 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1881.field3522[this.field1882] >= this.field1895) {
                        return;
                    }
                    this.field1895 -= this.field1881.field3522[this.field1882];
                    this.field1882++;
                    if (this.field1882 >= this.field1881.field3529.length) {
                        this.field1882 -= this.field1881.field3540;
                        if (this.field1882 < 0 || this.field1882 >= this.field1881.field3529.length) {
                            this.field1882 = 0;
                        }
                    }
                    this.field1887 = this.field1882 + 1;
                } while (this.field1887 < this.field1881.field3529.length);
                this.field1887 -= this.field1881.field3540;
            } while (this.field1887 >= 0 && this.field1887 < this.field1881.field3529.length);
            this.field1887 = -1;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V", line = 76)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1908++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)Lg;", line = 88)
    private final class295 method828(boolean arg0) {
        class148 var2 = class63.method428(arg0, this.field1897);
        class295 var3 = var2.method1047(-36, this.field1895, this.field1887, this.field1882);
        field1880++;
        if (var3 == null) {
            return null;
        } else {
            var3.method956(this.field1902);
            return var3;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IIIII)V", line = 102)
    public final void method829(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1898++;
        if (!this.field1875) {
            double var6 = (double) (arg4 - this.field1885);
            double var8 = (double) (arg2 - this.field1886);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1884 = (double) this.field1893 * var8 / var10 + (double) this.field1886;
            this.field1877 = (double) this.field1893 * var6 / var10 + (double) this.field1885;
            this.field1900 = (double) this.field1914;
        }
        if (arg3 != -17567) {
            return;
        }
        double var12 = (double) (this.field1878 + 1 - arg0);
        this.field1883 = ((double) arg4 - this.field1877) / var12;
        this.field1889 = ((double) arg2 - this.field1884) / var12;
        this.field1894 = Math.sqrt(this.field1889 * this.field1889 + this.field1883 * this.field1883);
        if (this.field1907 == -1) {
            this.field1899 = ((double) arg1 - this.field1900) / var12;
        } else {
            if (!this.field1875) {
                this.field1899 = -this.field1894 * Math.tan((double) this.field1907 * 0.02454369D);
            }
            this.field1903 = ((double) arg1 - this.field1900 - (this.field1899 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIIIJILcj;)V", line = 144)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class243 arg10) {
        class295 var13 = this.method828(false);
        field1896++;
        if (var13 != null) {
            var13.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1910);
            this.field1911 = var13.method112();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILwf;)Lng;", line = 169)
    public static final class245 method830(int arg0, int arg1, class306 arg2) {
        field1891++;
        if (class46.method317((byte) 84, arg2, arg1)) {
            return arg0 > -72 ? (class245) null : class311.method2138((byte) 3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V", line = 186)
    public static void method831(int arg0) {
        if (arg0 >= -77) {
            field1906 = -116;
        }
        field1901 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 202)
    public static final void method832(byte arg0) {
        field1905++;
        for (int var1 = 0; var1 < class142.field2248; var1++) {
            int var2 = class105.field1619[var1];
            class82 var3 = class64.field966[var2];
            int var4 = class230.field3713.method2043((byte) -114);
            if ((var4 & 0x2) != 0) {
                var4 += class230.field3713.method2043((byte) -109) << 8;
            }
            client.method894(var2, true, var4, var3);
        }
        if (arg0 != 14) {
            method834((byte) 102, (class120) null);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Z", line = 233)
    public static final boolean method833(int arg0, int arg1) {
        int var2 = 14 % ((-arg0 - 68) / 44);
        field1890++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLnb;)V", line = 254)
    public static final void method834(byte arg0, class120 arg1) {
        if (arg0 > 2) {
            class121.method822((byte) 57, arg1, 200000);
            field1913++;
        }
    }
}
