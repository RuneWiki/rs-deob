import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class127 extends class5 {

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
    private int field1887 = 0;

    @OriginalMember(owner = "client!qo", name = "U", descriptor = "Z")
    private boolean field1902 = false;

    @OriginalMember(owner = "client!qo", name = "jb", descriptor = "I")
    private int field1917 = -32768;

    @OriginalMember(owner = "client!qo", name = "sb", descriptor = "I")
    private int field1926 = 0;

    @OriginalMember(owner = "client!qo", name = "gb", descriptor = "I")
    private int field1914 = -1;

    @OriginalMember(owner = "client!qo", name = "P", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!qo", name = "fb", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!qo", name = "ub", descriptor = "I")
    private int field1928;

    @OriginalMember(owner = "client!qo", name = "O", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!qo", name = "ib", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!qo", name = "W", descriptor = "I")
    private int field1904;

    @OriginalMember(owner = "client!qo", name = "lb", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!qo", name = "Z", descriptor = "Li;")
    private class83 field1907;

    @OriginalMember(owner = "client!qo", name = "R", descriptor = "I")
    public static int field1899 = 0;

    @OriginalMember(owner = "client!qo", name = "kb", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!qo", name = "X", descriptor = "I")
    public static int field1905 = 0;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "D")
    private double field1888;

    @OriginalMember(owner = "client!qo", name = "J", descriptor = "D")
    private double field1891;

    @OriginalMember(owner = "client!qo", name = "M", descriptor = "D")
    private double field1894;

    @OriginalMember(owner = "client!qo", name = "db", descriptor = "D")
    private double field1911;

    @OriginalMember(owner = "client!qo", name = "mb", descriptor = "D")
    private double field1920;

    @OriginalMember(owner = "client!qo", name = "ob", descriptor = "D")
    private double field1922;

    @OriginalMember(owner = "client!qo", name = "qb", descriptor = "D")
    private double field1924;

    @OriginalMember(owner = "client!qo", name = "rb", descriptor = "D")
    private double field1925;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!qo", name = "N", descriptor = "I")
    private int field1895;

    @OriginalMember(owner = "client!qo", name = "Q", descriptor = "I")
    private int field1898;

    @OriginalMember(owner = "client!qo", name = "S", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!qo", name = "T", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!qo", name = "V", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!qo", name = "Y", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!qo", name = "ab", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!qo", name = "bb", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!qo", name = "cb", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!qo", name = "eb", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!qo", name = "hb", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!qo", name = "nb", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!qo", name = "pb", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!qo", name = "tb", descriptor = "Lrs;")
    private class240 field1927;

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 114)
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field1897 = arg10;
        this.field1913 = arg5;
        this.field1928 = arg7;
        this.field1896 = arg9;
        this.field1902 = false;
        this.field1916 = arg6;
        this.field1904 = arg0;
        this.field1919 = arg8;
        int var12 = class186.method1296(this.field1904, false).field4648;
        if (var12 != -1) {
            this.field1907 = class408.method2521((byte) 32, var12);
        } else {
            this.field1907 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(ILea;)Lms;", line = 16)
    public final class450 method696(int arg0, class58 arg1) {
        ++field1903;
        class116 var3 = this.method960((byte) 19, 1024, arg1);
        if (var3 == null) {
            return null;
        } else {
            class309 var4 = arg1.method210();
            var4.method1858(this.field1898);
            var4.method1865(this.field1895);
            var4.method1869((int) this.field1920, (int) this.field1911, (int) this.field1891);
            if (this.field1927 != null) {
                class174 var5 = this.field1927.method1552();
                arg1.method172(var3, var5, var4, (class153) null, 0);
            } else {
                var3.method896(var4, (class153) null, 0);
            }
            this.field1917 = var3.method889();
            if (arg0 != 0) {
                return null;
            } else {
                this.method961(128, arg1, var3);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)I", line = 49)
    public final int method23(int arg0) {
        if (arg0 > -84) {
            this.method23(36);
        }
        ++field1910;
        return this.field1917;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V", line = 62)
    public final void method959(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1906;
        if (!this.field1902) {
            double var6 = (double) (-super.field40 + arg1);
            double var8 = (double) (-super.field44 + arg0);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1891 = (double) this.field1919 * var8 / var10 + (double) super.field44;
            this.field1911 = (double) super.field45;
            this.field1920 = (double) this.field1919 * var6 / var10 + (double) super.field40;
        }
        double var12 = (double) (this.field1916 + arg3 + -arg4);
        this.field1888 = ((double) arg1 - this.field1920) / var12;
        this.field1894 = ((double) arg0 + -this.field1891) / var12;
        this.field1925 = Math.sqrt(this.field1894 * this.field1894 + this.field1888 * this.field1888);
        if (this.field1928 == -1) {
            this.field1922 = ((double) arg2 - this.field1911) / var12;
        } else {
            if (!this.field1902) {
                this.field1922 = -this.field1925 * Math.tan((double) this.field1928 * 0.02454369D);
            }
            this.field1924 = ((double) arg2 - this.field1911 - this.field1922 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)V", line = 101)
    public final void method26(byte arg0) {
        ++field1892;
        if (arg0 <= 34) {
            this.method963(-45, 50);
        }
        super.field55 = super.field41 = (short) ((int) (this.field1891 / 128.0D));
        super.field52 = super.field47 = (short) ((int) (this.field1920 / 128.0D));
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BILea;)Lts;", line = 137)
    private final class116 method960(byte arg0, int arg1, class58 arg2) {
        if (arg0 != 19) {
            this.field1902 = true;
        }
        ++field1915;
        class344 var4 = class186.method1296(this.field1904, false);
        return var4.method2088(this.field1926, this.field1914, (byte) 55, arg2, arg1, this.field1887);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILea;Lts;)V", line = 152)
    private final void method961(int arg0, class58 arg1, class116 arg2) {
        ++field1890;
        class217[] var4 = arg2.method879();
        class138[] var5 = arg2.method892();
        if ((this.field1927 == null || this.field1927.field3390) && (var4 != null || var5 != null)) {
            this.field1927 = new class240(class246.field3467);
        }
        if (arg0 != 128) {
            this.field1924 = -0.25027613561512724D;
        }
        if (this.field1927 != null) {
            this.field1927.method1560(arg1, (long) class246.field3467, var4, var5, false);
            this.field1927.method1556(super.field42, super.field52, super.field47, super.field55, super.field41);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 177)
    public final void method962(int arg0) {
        int var2 = -33 / ((arg0 - -55) / 52);
        ++field1889;
        if (this.field1927 != null) {
            this.field1927.method1554();
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILea;Lac;ZII)V", line = 190)
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        ++field1901;
        if (arg0 != 22546) {
            this.method960((byte) 68, -70, (class58) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V", line = 205)
    public final void method963(int arg0, int arg1) {
        if (arg1 >= -124) {
            this.method699(45, 11, (class58) null, (class216) null, false, -100, 70);
        }
        this.field1891 += (double) arg0 * this.field1894;
        ++field1908;
        this.field1920 += (double) arg0 * this.field1888;
        this.field1902 = true;
        if (this.field1928 == -1) {
            this.field1911 += (double) arg0 * this.field1922;
        } else {
            this.field1911 += this.field1924 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1922;
            this.field1922 += (double) arg0 * this.field1924;
        }
        this.field1895 = 16383 & 8192 + (int) (Math.atan2(this.field1888, this.field1894) * 2607.5945876176133D);
        this.field1898 = (int) (2607.5945876176133D * Math.atan2(this.field1922, this.field1925)) & 16383;
        if (this.field1907 != null) {
            this.field1887 += arg0;
            while (true) {
                do {
                    do {
                        if (this.field1907.field1144[this.field1926] >= this.field1887) {
                            return;
                        }
                        this.field1887 -= this.field1907.field1144[this.field1926];
                        ++this.field1926;
                        if (~this.field1926 <= ~this.field1907.field1145.length) {
                            this.field1926 -= this.field1907.field1164;
                            if (this.field1926 < 0 || this.field1907.field1145.length <= this.field1926) {
                                this.field1926 = 0;
                            }
                        }
                        this.field1914 = this.field1926 + 1;
                    } while (~this.field1907.field1145.length < ~this.field1914);
                    this.field1914 -= this.field1907.field1164;
                } while (~this.field1914 <= -1 && ~this.field1907.field1145.length < ~this.field1914);
                this.field1914 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "finalize", descriptor = "()V", line = 260)
    protected final void finalize() {
        if (this.field1927 != null) {
            this.field1927.method1554();
        }
        ++field1923;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Z", line = 282)
    public final boolean method697(int arg0) {
        if (arg0 < 115) {
            field1899 = 52;
        }
        ++field1893;
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V", line = 293)
    public final void method702(byte arg0) {
        if (arg0 != 46) {
            this.field1919 = -6;
        }
        ++field1912;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lea;I)V", line = 320)
    public final void method707(class58 arg0, int arg1) {
        ++field1900;
        class116 var3 = this.method960((byte) 19, 0, arg0);
        if (var3 != null) {
            class309 var4 = arg0.method210();
            var4.method1858(this.field1898);
            var4.method1865(this.field1895);
            var4.method1869((int) this.field1920, (int) this.field1911, (int) this.field1891);
            this.field1917 = var3.method889();
            this.method961(128, arg0, var3);
            if (arg1 >= -99) {
                this.method710(true, 46, (class58) null, -122);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZILea;I)Z", line = 348)
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        if (!arg0) {
            return true;
        } else {
            ++field1921;
            return false;
        }
    }
}
