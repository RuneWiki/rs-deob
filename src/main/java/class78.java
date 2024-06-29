import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class78 {

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    private int field1907 = 0;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[Lte;")
    private class176[] field1902;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    private int field1892;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lgg;")
    private static class63 field1884 = class116.method911(43, "flash1:");

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lgg;")
    private static class63 field1883 = class116.method911(43, "Error connecting to server)3");

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lgg;")
    public static class63 field1891 = class116.method911(43, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lgg;")
    private static class63 field1893 = class116.method911(43, "Please contact customer support)3");

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[J")
    public static long[] field1889 = new long[32];

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lgg;")
    public static class63 field1900 = field1883;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1888 = 0;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Lgg;")
    public static class63 field1901 = field1884;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lgg;")
    public static class63 field1890 = field1884;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Lgg;")
    public static class63 field1908 = field1893;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "J")
    private long field1905;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lte;")
    private class176 field1899;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lte;")
    private class176 field1906;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IJ)Lte;")
    public final class176 method694(int arg0, long arg1) {
        field1894++;
        this.field1905 = arg1;
        class176 var4 = this.field1902[(int) ((long) (this.field1892 - 1) & arg1)];
        for (this.field1899 = var4.field3611; this.field1899 != var4; this.field1899 = this.field1899.field3611) {
            if (this.field1899.field3612 == arg1) {
                class176 var5 = this.field1899;
                this.field1899 = this.field1899.field3611;
                return var5;
            }
        }
        this.field1899 = null;
        return arg0 == -23979 ? null : null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Lte;")
    public final class176 method695(boolean arg0) {
        field1895++;
        if (this.field1899 == null) {
            return null;
        }
        class176 var2 = this.field1902[(int) (this.field1905 & (long) (this.field1892 - 1))];
        if (arg0) {
            return null;
        }
        while (this.field1899 != var2) {
            if (this.field1899.field3612 == this.field1905) {
                class176 var3 = this.field1899;
                this.field1899 = this.field1899.field3611;
                return var3;
            }
            this.field1899 = this.field1899.field3611;
        }
        this.field1899 = null;
        return null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Lte;)I")
    public final int method696(int arg0, class176[] arg1) {
        field1896++;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field1892; var4++) {
            class176 var5 = this.field1902[var4];
            for (class176 var6 = var5.field3611; var6 != var5; var6 = var6.field3611) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method697(int arg0) {
        field1893 = null;
        field1901 = null;
        field1908 = null;
        field1883 = null;
        field1889 = null;
        field1884 = null;
        field1890 = null;
        int var1 = -24 % ((arg0 - 30) / 48);
        field1891 = null;
        field1900 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(SILgg;IIJLgg;)V")
    public static final void method698(short arg0, int arg1, class63 arg2, int arg3, int arg4, long arg5, class63 arg6) {
        field1887++;
        if (arg3 != -26415 || (class188.field3796 || class166.field3404 >= 500)) {
            return;
        }
        class106.field2414[class166.field3404] = arg2;
        class84.field2003[class166.field3404] = arg6;
        class196.field3924[class166.field3404] = arg0;
        class10.field228[class166.field3404] = arg5;
        class148.field3123[class166.field3404] = arg4;
        class164.field3368[class166.field3404] = arg1;
        class166.field3404++;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Lte;")
    public final class176 method699(int arg0) {
        this.field1907 = 0;
        if (arg0 == -10679) {
            field1886++;
            return this.method701(-115);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
    public final int method700(byte arg0) {
        field1885++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -117) {
            return 94;
        }
        while (var3 < this.field1892) {
            class176 var4 = this.field1902[var3];
            class176 var5 = var4.field3611;
            while (var4 != var5) {
                var5 = var5.field3611;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)Lte;")
    public final class176 method701(int arg0) {
        field1903++;
        if (this.field1907 > 0 && this.field1902[this.field1907 - 1] != this.field1906) {
            class176 var2 = this.field1906;
            this.field1906 = var2.field3611;
            return var2;
        }
        int var3 = -36 % ((arg0 - 41) / 47);
        while (this.field1892 > this.field1907) {
            class176 var4 = this.field1902[this.field1907++].field3611;
            if (this.field1902[this.field1907 - 1] != var4) {
                this.field1906 = var4.field3611;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLte;J)V")
    public final void method702(byte arg0, class176 arg1, long arg2) {
        if (arg1.field3619 != null) {
            arg1.method1172(-41);
        }
        field1897++;
        class176 var5 = this.field1902[(int) ((long) (this.field1892 - 1) & arg2)];
        arg1.field3611 = var5;
        arg1.field3612 = arg2;
        arg1.field3619 = var5.field3619;
        arg1.field3619.field3611 = arg1;
        arg1.field3611.field3619 = arg1;
        if (arg0 <= 80) {
            field1891 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
    public class78(int arg0) {
        this.field1902 = new class176[arg0];
        this.field1892 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class176 var3 = this.field1902[var2] = new class176();
            var3.field3611 = var3;
            var3.field3619 = var3;
        }
    }
}
