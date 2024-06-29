import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class134 {

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Z")
    private boolean field1871 = false;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public int field1873 = 0;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public int field1880 = 0;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lkg;")
    public static class148 field1864 = new class148(100);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field1865;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    private int field1868;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "J")
    public long field1862;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lra;")
    public static class57 field1859;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Lra;")
    public static class57 field1883;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Z")
    public static boolean field1882;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "[I")
    public static int[] field1881;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIBIIII)V", line = 4)
    public static final void method799(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1876++;
        int var8 = class115.method640((byte) -74, class407.field5914, arg1, class20.field209);
        int var9 = class115.method640((byte) -86, class407.field5914, arg0, class20.field209);
        int var10 = class115.method640((byte) -123, class128.field1785, arg7, class143.field2029);
        int var11 = class115.method640((byte) -124, class128.field1785, arg2, class143.field2029);
        int var12 = class115.method640((byte) -68, class407.field5914, arg1 + arg6, class20.field209);
        int var13 = class115.method640((byte) -81, class407.field5914, arg0 - arg6, class20.field209);
        for (int var14 = var8; var14 < var12; var14++) {
            class105.method564(arg4, var10, 0, class318.field4522[var14], var11);
        }
        int var15 = 33 % ((arg3 - 18) / 53);
        for (int var16 = var9; var16 > var13; var16--) {
            class105.method564(arg4, var10, 0, class318.field4522[var16], var11);
        }
        int var17 = class115.method640((byte) -90, class128.field1785, arg6 + arg7, class143.field2029);
        int var18 = class115.method640((byte) -78, class128.field1785, arg2 - arg6, class143.field2029);
        for (int var19 = var12; var19 <= var13; var19++) {
            int[] var20 = class318.field4522[var19];
            class105.method564(arg4, var10, 0, var20, var17);
            class105.method564(arg5, var17, 0, var20, var18);
            class105.method564(arg4, var18, 0, var20, var11);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 60)
    public final void method800(int arg0) {
        field1860++;
        this.field1869 = class286.field4035[this.field1868 << 3];
        if (arg0 != 8) {
            return;
        }
        this.field1861 = (int) Math.sqrt((double) (this.field1877 * this.field1877 + this.field1879 * this.field1879 + this.field1872 * this.field1872));
        if (this.field1870 == 0) {
            this.field1870 = 1;
        }
        if (this.field1878 == 0) {
            this.field1862 = 2147483647L;
        } else if (this.field1878 == 1) {
            this.field1862 = (long) (this.field1861 * 8 / this.field1870);
            this.field1862 *= this.field1862;
        } else if (this.field1878 == 2) {
            this.field1862 = (long) (this.field1861 * 8 / this.field1870);
        }
        if (this.field1871) {
            this.field1861 *= -1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;BIII)V", line = 105)
    public static final void method801(String arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1867++;
        class119 var5 = class354.method2262(-128, arg4, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field1526 != null) {
            class191 var6 = new class191();
            var6.field2602 = var5.field1526;
            var6.field2608 = arg2;
            var6.field2600 = arg0;
            var6.field2605 = var5;
            class387.method2471(var6);
        }
        if (arg1 != -31) {
            return;
        }
        boolean var7 = true;
        if (var5.field1538 > 0) {
            var7 = class192.method1227(var5, -104);
        }
        if (!var7 || !client.method1076(var5).method31((byte) -39, arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            class140.field1982++;
            class169.field2360.method809(46, -28022);
            class169.field2360.method1361((byte) -123, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
        if (arg2 == 2) {
            class169.field2360.method809(136, -28022);
            class302.field4302++;
            class169.field2360.method1361((byte) -128, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
        if (arg2 == 3) {
            class169.field2360.method809(3, -28022);
            class16.field169++;
            class169.field2360.method1361((byte) -121, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
        if (arg2 == 4) {
            class114.field1324++;
            class169.field2360.method809(169, arg1 - 27991);
            class169.field2360.method1361((byte) -123, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
        if (arg2 == 5) {
            class397.field5788++;
            class169.field2360.method809(35, -28022);
            class169.field2360.method1361((byte) -121, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
        if (arg2 == 6) {
            class108.field1242++;
            class169.field2360.method809(107, -28022);
            class169.field2360.method1361((byte) -127, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
        if (arg2 == 7) {
            class169.field2360.method809(62, -28022);
            class206.field2812++;
            class169.field2360.method1361((byte) -121, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
        if (arg2 == 8) {
            class246.field3347++;
            class169.field2360.method809(79, -28022);
            class169.field2360.method1361((byte) -127, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
        if (arg2 == 9) {
            class169.field2360.method809(110, -28022);
            class267.field3761++;
            class169.field2360.method1361((byte) -125, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
        if (arg2 == 10) {
            class169.field2360.method809(11, arg1 ^ 0x6D6B);
            class97.field1083++;
            class169.field2360.method1361((byte) -127, arg3);
            class169.field2360.method1380(arg4, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 243)
    public static void method802(byte arg0) {
        field1881 = null;
        field1883 = null;
        field1864 = null;
        field1859 = null;
        if (arg0 <= 65) {
            field1883 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lbk;I)V", line = 259)
    public final void method803(class211 arg0, int arg1) {
        field1866++;
        if (arg1 > -59) {
            return;
        }
        while (true) {
            int var3 = arg0.method1342((byte) -127);
            if (var3 == 0) {
                return;
            }
            this.method804((byte) -95, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLbk;I)V", line = 292)
    private final void method804(byte arg0, class211 arg1, int arg2) {
        field1875++;
        if (arg2 == 1) {
            this.field1868 = arg1.method1355(32136);
        } else if (arg2 == 2) {
            arg1.method1342((byte) -126);
        } else if (arg2 == 3) {
            this.field1879 = arg1.method1336((byte) -107);
            this.field1872 = arg1.method1336((byte) -63);
            this.field1877 = arg1.method1336((byte) -113);
        } else if (arg2 == 4) {
            this.field1878 = arg1.method1342((byte) -126);
            this.field1870 = arg1.method1336((byte) -70);
        } else if (arg2 == 6) {
            this.field1863 = arg1.method1342((byte) -127);
        } else if (arg2 == 8) {
            this.field1873 = 1;
        } else if (arg2 == 9) {
            this.field1880 = 1;
        } else if (arg2 == 10) {
            this.field1871 = true;
        }
        int var4 = -10 / ((-arg0 - 30) / 42);
    }
}
