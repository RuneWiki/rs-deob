import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class149 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public int field1894 = -1;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    private int field1898 = 0;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
    public boolean field1895 = true;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field1903 = 128;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lm;")
    public static class242 field1887 = new class242();

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Las;")
    public static class359 field1902;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lfb;II)V")
    public final void method1024(class341 arg0, int arg1, int arg2) {
        int var4 = -96 / ((78 - arg1) / 46);
        field1896++;
        while (true) {
            int var5 = arg0.method2233((byte) 104);
            if (var5 == 0) {
                return;
            }
            this.method1029(var5, arg2, arg0, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method1025(int arg0) {
        if (arg0 != 64) {
            method1030(true, false);
        }
        field1902 = null;
        field1887 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    private final void method1026(int arg0, int arg1) {
        field1893++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        int var5 = -120 / ((arg0 + 56) / 51);
        double var6 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var3;
        if (var6 < var3) {
            var10 = var6;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var3;
        if (var3 < var6) {
            var12 = var6;
        }
        if (var12 < var8) {
            var12 = var8;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var10 + var12) / 2.0D;
        if (var10 != var12) {
            if (var18 < 0.5D) {
                var16 = (var12 - var10) / (var10 + var12);
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var10) / (2.0D - var12 - var10);
            }
            if (var3 == var12) {
                var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
                var14 = (var8 - var3) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var3 - var6) / (var12 - var10) + 4.0D;
            }
        }
        this.field1901 = (int) (var16 * 256.0D);
        this.field1900 = (int) (var18 * 256.0D);
        double var20 = var14 / 6.0D;
        if (var18 > 0.5D) {
            this.field1888 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field1888 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field1900 < 0) {
            this.field1900 = 0;
        } else if (this.field1900 > 255) {
            this.field1900 = 255;
        }
        if (this.field1901 < 0) {
            this.field1901 = 0;
        } else if (this.field1901 > 255) {
            this.field1901 = 255;
        }
        if (this.field1888 < 1) {
            this.field1888 = 1;
        }
        this.field1899 = (int) ((double) this.field1888 * var20);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)V")
    public static final void method1027(int arg0, int arg1) {
        field1891++;
        class440 var2 = class186.method1241(arg1, 10, (byte) 56);
        var2.method2749(13828096);
        int var3 = 83 / ((-arg0 - 28) / 52);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILps;)V")
    public static final void method1028(int arg0, class162 arg1) {
        field1889++;
        boolean var2 = false;
        if (class231.field3179 == arg1.field2115 || arg1.field2148 == -1 || arg1.field2151 != 0) {
            var2 = true;
        } else {
            class233 var3 = class73.method597(arg1.field2148, -1);
            if (var3.field3237 || arg1.field2132 + 1 > var3.field3248[arg1.field2144]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field2115 - arg1.field2172;
            int var5 = class231.field3179 - arg1.field2172;
            int var6 = arg1.field2134 * 128 + (arg1.method1091((byte) -113) * 64);
            int var7 = arg1.field2180 * 128 + (arg1.method1091((byte) -101) * 64);
            int var8 = arg1.field2153 * 128 + (arg1.method1091((byte) -123) * 64);
            int var9 = arg1.field2158 * 128 + arg1.method1091((byte) 78) * 64;
            arg1.field5921 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
            arg1.field5930 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field2200 = 0;
        if (arg1.field2149 == 0) {
            arg1.method1093(8192, 16383);
        }
        if (arg0 != 128) {
            field1887 = null;
        }
        if (arg1.field2149 == 1) {
            arg1.method1093(12288, 16383);
        }
        if (arg1.field2149 == 2) {
            arg1.method1093(0, arg0 + 16255);
        }
        if (arg1.field2149 == 3) {
            arg1.method1093(4096, 16383);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILfb;B)V")
    private final void method1029(int arg0, int arg1, class341 arg2, byte arg3) {
        field1897++;
        if (arg0 == 1) {
            this.field1898 = arg2.method2249(32767);
            this.method1026(82, this.field1898);
        } else if (arg0 == 2) {
            this.field1894 = arg2.method2239(-1076227960);
            if (this.field1894 == 65535) {
                this.field1894 = -1;
            }
        } else if (arg0 == 3) {
            this.field1903 = arg2.method2239(arg3 ^ 0x4025EF4D);
        } else if (arg0 == 4) {
            this.field1895 = false;
        }
        if (arg3 != -59) {
            this.field1903 = 16;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZ)V")
    public static final void method1030(boolean arg0, boolean arg1) {
        field1890++;
        if (arg0 && class200.field2758 != null) {
            class20.field337 = class200.field2758.field5547;
        } else {
            class20.field337 = -1;
        }
        class31.field512 = 0;
        class394.field5730 = null;
        class123.field1585 = null;
        class200.field2758 = null;
        class200.method1320();
        class200.field2763.method1574(-32166);
        class86.field1201 = null;
        class222.field3067 = -1;
        if (!arg1) {
            method1027(-75, 97);
        }
        class268.field3965 = null;
        class248.field3655 = -1;
        class407.field5928 = null;
        class377.field5518 = null;
        class125.field1618 = null;
        class163.field2222 = null;
        class386.field5638 = null;
        class200.field2766 = null;
        class351.field5212 = null;
        class117.field1524 = null;
        class186.method1242((byte) -107);
        class36.field555 = null;
        class350.method2314(128, 64, 2);
        class124.method884(64, 64, 11479);
        class398.method2555(94, 64);
        class143.method992(23, 64);
    }
}
