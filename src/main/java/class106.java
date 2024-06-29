import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class106 extends class95 {

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    private int field1864 = -32768;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    private int field1882 = 0;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    private int field1888 = 0;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "Z")
    private boolean field1891 = false;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    private int field1868;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    private int field1895;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    private int field1857;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    private int field1881;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "Ljb;")
    private class256 field1887;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "Lpj;")
    private static class237 field1872 = class33.method353("Loading title screen )2 ", 84);

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Lpj;")
    public static class237 field1869 = field1872;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static volatile int field1880 = -1;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "Lgk;")
    public static class154 field1894 = null;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "D")
    private double field1860;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "D")
    public double field1865;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "D")
    public double field1870;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "D")
    private double field1871;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "D")
    private double field1876;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "D")
    private double field1877;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "D")
    private double field1878;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "D")
    public double field1884;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "[I")
    public static int[] field1886;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "[Lgj;")
    public static class225[] field1867;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Lqk;")
    private final class201 method789(boolean arg0) {
        field1866++;
        class49 var2 = class190.method1288(this.field1881, (byte) 113);
        class201 var3 = var2.method453((byte) 66, this.field1882);
        if (var3 == null) {
            return null;
        } else {
            var3.method184(this.field1889);
            return arg0 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method790(byte arg0) {
        field1867 = null;
        field1886 = null;
        field1894 = null;
        field1869 = null;
        int var1 = -10 / ((arg0 - 30) / 35);
        field1872 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1879++;
        class201 var11 = this.method789(false);
        if (var11 != null) {
            var11.method183(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1864 = var11.method176();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
    public final void method791(byte arg0, int arg1) {
        this.field1870 += (double) arg1 * this.field1860;
        this.field1891 = true;
        this.field1865 += this.field1877 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1876;
        this.field1876 += (double) arg1 * this.field1877;
        this.field1884 += (double) arg1 * this.field1878;
        field1885++;
        this.field1875 = (int) (Math.atan2(this.field1878, this.field1860) * 325.949D) + 1024 & 0x7FF;
        if (arg0 <= 51) {
            this.field1865 = -0.9445855173982143D;
        }
        this.field1889 = (int) (Math.atan2(this.field1876, this.field1871) * 325.949D) & 0x7FF;
        if (this.field1887 == null) {
            return;
        }
        this.field1888 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1888 <= this.field1887.field4383[this.field1882]) {
                        return;
                    }
                    this.field1888 -= this.field1887.field4383[this.field1882];
                    this.field1882++;
                } while (this.field1887.field4416.length > this.field1882);
                this.field1882 -= this.field1887.field4393;
            } while (this.field1882 >= 0 && this.field1887.field4416.length > this.field1882);
            this.field1882 = 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()I")
    public final int method176() {
        field1861++;
        return this.field1864;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIII)V")
    public final void method792(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (!this.field1891) {
            double var6 = (double) (arg2 - this.field1895);
            double var8 = (double) (arg4 - this.field1857);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1884 = (double) this.field1890 * var6 / var10 + (double) this.field1895;
            this.field1870 = (double) this.field1890 * var8 / var10 + (double) this.field1857;
            this.field1865 = (double) this.field1868;
        }
        field1883++;
        if (arg1 < 40) {
            this.method791((byte) 69, 79);
        }
        double var12 = (double) (this.field1859 + 1 - arg0);
        this.field1860 = ((double) arg4 - this.field1870) / var12;
        this.field1878 = ((double) arg2 - this.field1884) / var12;
        this.field1871 = Math.sqrt(this.field1878 * this.field1878 + this.field1860 * this.field1860);
        if (!this.field1891) {
            this.field1876 = -this.field1871 * Math.tan((double) this.field1874 * 0.02454369D);
        }
        this.field1877 = ((double) arg3 - this.field1865 - (this.field1876 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1868 = arg4;
        this.field1874 = arg7;
        this.field1893 = arg9;
        this.field1895 = arg2;
        this.field1891 = false;
        this.field1859 = arg6;
        this.field1857 = arg3;
        this.field1881 = arg0;
        this.field1890 = arg8;
        this.field1892 = arg1;
        this.field1863 = arg5;
        this.field1858 = arg10;
        int var12 = class190.method1288(this.field1881, (byte) 101).field1054;
        if (var12 == -1) {
            this.field1887 = null;
        } else {
            this.field1887 = class256.method1732(var12, true);
        }
    }
}
