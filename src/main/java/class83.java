import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 extends class133 {

    @OriginalMember(owner = "client!m", name = "Vc", descriptor = "I")
    public int field1837 = 0;

    @OriginalMember(owner = "client!m", name = "Ic", descriptor = "I")
    public int field1824 = 0;

    @OriginalMember(owner = "client!m", name = "dd", descriptor = "I")
    public int field1845 = -1;

    @OriginalMember(owner = "client!m", name = "Pc", descriptor = "I")
    public int field1831 = -1;

    @OriginalMember(owner = "client!m", name = "Gc", descriptor = "I")
    public int field1822 = 0;

    @OriginalMember(owner = "client!m", name = "Jc", descriptor = "I")
    public int field1825 = 0;

    @OriginalMember(owner = "client!m", name = "Lc", descriptor = "I")
    public int field1827 = 0;

    @OriginalMember(owner = "client!m", name = "hd", descriptor = "Z")
    public boolean field1849 = false;

    @OriginalMember(owner = "client!m", name = "Rc", descriptor = "Lje;")
    private static class67 field1833 = class85.method592(255, "M");

    @OriginalMember(owner = "client!m", name = "Wc", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!m", name = "Yc", descriptor = "Lje;")
    public static class67 field1840 = class85.method592(255, "<col=ff3000>");

    @OriginalMember(owner = "client!m", name = "Tc", descriptor = "Lje;")
    public static class67 field1835 = field1833;

    @OriginalMember(owner = "client!m", name = "ld", descriptor = "Lje;")
    public static class67 field1853 = class85.method592(255, "null");

    @OriginalMember(owner = "client!m", name = "Oc", descriptor = "Lje;")
    public static class67 field1830 = field1833;

    @OriginalMember(owner = "client!m", name = "Xc", descriptor = "B")
    public static byte field1839;

    @OriginalMember(owner = "client!m", name = "Ec", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!m", name = "Fc", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!m", name = "Hc", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!m", name = "Mc", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!m", name = "Nc", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!m", name = "Qc", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!m", name = "Uc", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!m", name = "Zc", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!m", name = "cd", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!m", name = "ed", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!m", name = "fd", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!m", name = "gd", descriptor = "I")
    public int field1848;

    @OriginalMember(owner = "client!m", name = "id", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!m", name = "jd", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!m", name = "kd", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!m", name = "ad", descriptor = "Lua;")
    public static class140 field1842;

    @OriginalMember(owner = "client!m", name = "Kc", descriptor = "Lad;")
    public class5 field1826;

    @OriginalMember(owner = "client!m", name = "md", descriptor = "Lje;")
    public class67 field1854;

    @OriginalMember(owner = "client!m", name = "bd", descriptor = "Ljf;")
    public class68 field1843;

    @OriginalMember(owner = "client!m", name = "Sc", descriptor = "[I")
    public static int[] field1834;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    public static void method584(int arg0) {
        field1842 = null;
        field1853 = null;
        field1833 = null;
        field1834 = null;
        field1835 = null;
        field1840 = null;
        if (arg0 > -110) {
            method588((byte) -70);
        }
        field1830 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILfd;I)Z")
    public static final boolean method585(int arg0, class40 arg1, int arg2) {
        byte[] var3 = arg1.method261(100, arg2);
        if (arg0 != 0) {
            method586((class141) null, (byte) -99, (class40) null, (class40) null, (class40) null);
        }
        ++field1852;
        if (var3 == null) {
            return false;
        } else {
            class127.method974(126, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(B)Z")
    public final boolean method164(byte arg0) {
        int var2 = 46 % ((10 - arg0) / 57);
        ++field1836;
        return this.field1843 != null;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)Lad;")
    public final class5 method16(int arg0) {
        ++field1851;
        if (this.field1843 == null) {
            return null;
        } else {
            class93 var2 = ~super.field2991 != 0 && super.field2987 == 0 ? class49.method316(super.field2991, false) : null;
            class93 var3 = ~super.field2960 == arg0 || this.field1849 || ~super.field2960 == ~super.field2954 && var2 != null ? null : class49.method316(super.field2960, false);
            class5 var4 = this.field1843.method491(var3, super.field2973, 12, var2, super.field2975);
            if (var4 == null) {
                return null;
            } else {
                var4.method42();
                super.field2940 = var4.field2394;
                if (!this.field1849 && ~super.field2990 != 0 && super.field2941 != -1) {
                    class5 var5 = class79.method566(super.field2990, false).method1111((byte) -19, super.field2941);
                    if (var5 != null) {
                        var5.method52(0, -super.field2962, 0);
                        class5[] var6 = new class5[] { var4, var5 };
                        var4 = new class5(var6, 2);
                    }
                }
                if (!this.field1849 && this.field1826 != null) {
                    if (class34.field627 >= this.field1837) {
                        this.field1826 = null;
                    }
                    if (~this.field1825 >= ~class34.field627 && this.field1837 > class34.field627) {
                        class5 var7 = this.field1826;
                        var7.method52(this.field1846 - super.field2957, -this.field1841 + this.field1844, -super.field2963 + this.field1832);
                        if (~super.field2972 != -513) {
                            if (~super.field2972 == -1025) {
                                var7.method36();
                                var7.method36();
                            } else if (~super.field2972 == -1537) {
                                var7.method36();
                            }
                        } else {
                            var7.method36();
                            var7.method36();
                            var7.method36();
                        }
                        class5[] var8 = new class5[] { var4, var7 };
                        var4 = new class5(var8, 2);
                        if (~super.field2972 == -513) {
                            var7.method36();
                        } else if (~super.field2972 == -1025) {
                            var7.method36();
                            var7.method36();
                        } else if (super.field2972 == 1536) {
                            var7.method36();
                            var7.method36();
                            var7.method36();
                        }
                        var7.method52(super.field2957 - this.field1846, -this.field1844 + this.field1841, -this.field1832 + super.field2963);
                    }
                }
                var4.field76 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lub;BLfd;Lfd;Lfd;)Z")
    public static final boolean method586(class141 arg0, byte arg1, class40 arg2, class40 arg3, class40 arg4) {
        ++field1821;
        if (arg1 <= 108) {
            return true;
        } else {
            class46.field857 = arg3;
            class69.field1403 = arg4;
            class154.field3499 = arg0;
            class145.field3347 = arg2;
            return true;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILna;)V")
    public final void method587(int arg0, class91 arg1) {
        ++field1823;
        arg1.field2043 = 0;
        int var3 = arg1.method649(false);
        this.field1831 = arg1.method667((byte) -37);
        this.field1845 = arg1.method667((byte) -37);
        int var4 = -1;
        this.field1827 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg1.method649(false);
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg1.method649(false);
                var5[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && ~var5[0] == -65536) {
                    var4 = arg1.method641(255);
                    break;
                }
                if (var5[var6] >= 512) {
                    int var12 = class123.method961(var5[var6] + -512, arg0 + -3995).field2306;
                    if (~var12 != -1) {
                        this.field1827 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg1.method649(false);
            if (~var11 > -1 || ~var11 <= ~class151.field3457[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        if (arg0 != 5653) {
            field1842 = null;
        }
        super.field2954 = arg1.method641(255);
        if (~super.field2954 == -65536) {
            super.field2954 = -1;
        }
        super.field2984 = arg1.method641(255);
        if (~super.field2984 == -65536) {
            super.field2984 = -1;
        }
        super.field2997 = super.field2984;
        super.field2935 = arg1.method641(255);
        if (super.field2935 == 65535) {
            super.field2935 = -1;
        }
        super.field2986 = arg1.method641(255);
        if (~super.field2986 == -65536) {
            super.field2986 = -1;
        }
        super.field2945 = arg1.method641(arg0 + -5398);
        if (~super.field2945 == -65536) {
            super.field2945 = -1;
        }
        super.field2998 = arg1.method641(255);
        if (super.field2998 == 65535) {
            super.field2998 = -1;
        }
        super.field2946 = arg1.method641(arg0 ^ 5866);
        if (~super.field2946 == -65536) {
            super.field2946 = -1;
        }
        this.field1854 = class91.method674((byte) -116, arg1.method635((byte) 122)).method460(122);
        this.field1822 = arg1.method649(false);
        this.field1824 = arg1.method641(255);
        if (this.field1843 == null) {
            this.field1843 = new class68();
        }
        this.field1843.method502(var4, var5, (byte) 77, var9, var3 == 1);
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(B)V")
    public static final void method588(byte arg0) {
        ++field1820;
        class23 var1 = class64.field1263;
        synchronized (class64.field1263) {
            if (arg0 != 48) {
                field1835 = null;
            }
            class121.field2718 = class75.field1614;
            if (field1838 < 0) {
                for (int var2 = 0; var2 < 112; ++var2) {
                    class63.field1242[var2] = false;
                }
                field1838 = class152.field3490;
            } else {
                while (~field1838 != ~class152.field3490) {
                    int var3 = class68.field1367[class152.field3490];
                    class152.field3490 = 127 & class152.field3490 + 1;
                    if (~var3 > -1) {
                        class63.field1242[~var3] = false;
                    } else {
                        class63.field1242[var3] = true;
                    }
                }
            }
            class75.field1614 = class126.field2760;
        }
    }
}
