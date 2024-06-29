import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 extends class60 {

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "Z")
    private volatile boolean field1872 = false;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "Z")
    private boolean field1877 = false;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
    private int field1874 = -1;

    @OriginalMember(owner = "client!mc", name = "xb", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "Lb;")
    private class7 field1862;

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "Lb;")
    private class7 field1878;

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "Lwb;")
    public static class130 field1868 = class26.method212("Abbrechen", -32376);

    @OriginalMember(owner = "client!mc", name = "sb", descriptor = "I")
    public static int field1881 = 5063219;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "[I")
    public static int[] field1861 = new int[256];

    @OriginalMember(owner = "client!mc", name = "vb", descriptor = "Lwb;")
    private static class130 field1884 = class26.method212("Trade)4compete", -32376);

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    public static int field1859 = 0;

    @OriginalMember(owner = "client!mc", name = "wb", descriptor = "Lwb;")
    public static class130 field1885 = field1884;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "Lwb;")
    public static class130 field1876 = class26.method212("Musik)2Engine vorbereitet)3", -32376);

    @OriginalMember(owner = "client!mc", name = "Bb", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
    private int field1867;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!mc", name = "qb", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!mc", name = "rb", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!mc", name = "ub", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!mc", name = "yb", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!mc", name = "zb", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!mc", name = "Ab", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "Lqd;")
    public static class100 field1871;

    @OriginalMember(owner = "client!mc", name = "tb", descriptor = "Lda;")
    public static class20 field1882;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "[Z")
    private volatile boolean[] field1864;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((1 & var1) == 1) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field1861[var0] = var1;
        }
        field1890 = 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI[BILb;)V", line = 7)
    public final void method583(boolean arg0, int arg1, byte[] arg2, int arg3, class7 arg4) {
        ++field1883;
        if (arg1 == -22625) {
            if (this.field1878 != arg4) {
                if (!arg0 && this.field1874 == arg3) {
                    this.field1872 = true;
                }
                if (arg2 == null || ~arg2.length >= -3) {
                    this.field1864[arg3] = false;
                    if (this.field1877 || arg0) {
                        class45.method414(arg0, arg3, true, this.field1886, super.field1561[arg3], this, (byte) 2);
                    }
                    return;
                }
                class19.field553.reset();
                class19.field553.update(arg2, 0, arg2.length + -2);
                int var6 = (int) class19.field553.getValue();
                int var7 = ((arg2[arg2.length - 2] & 255) << 8) + (255 & arg2[arg2.length + -1]);
                if (super.field1561[arg3] != var6 || ~super.field1523[arg3] != ~var7) {
                    this.field1864[arg3] = false;
                    if (this.field1877 || arg0) {
                        class45.method414(arg0, arg3, true, this.field1886, super.field1561[arg3], this, (byte) 2);
                    }
                    return;
                }
                this.field1864[arg3] = true;
                if (arg0) {
                    super.field1564[arg3] = arg2;
                    return;
                }
            } else {
                if (this.field1872) {
                    throw new RuntimeException();
                }
                if (arg2 == null) {
                    class45.method414(true, this.field1886, true, 255, this.field1867, this, (byte) 0);
                    return;
                }
                class19.field553.reset();
                class19.field553.update(arg2, 0, arg2.length);
                int var8 = (int) class19.field553.getValue();
                if (~this.field1867 != ~var8) {
                    class45.method414(true, this.field1886, true, 255, this.field1867, this, (byte) 0);
                    return;
                }
                this.method505(arg1 + 22681, arg2);
                this.method586(arg1 ^ 2417);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(II)V", line = 103)
    public final void method509(int arg0, int arg1) {
        if (this.field1862 != null && this.field1864 != null && this.field1864[arg1]) {
            class48.method429(arg1, this, this.field1862, (byte) -94);
        } else {
            class45.method414(true, arg1, true, this.field1886, super.field1561[arg1], this, (byte) 2);
        }
        if (arg0 <= 26) {
            field1859 = 105;
        }
        ++field1879;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(Z)I", line = 127)
    public final int method584(boolean arg0) {
        ++field1863;
        if (this.field1872) {
            return 100;
        } else if (super.field1564 != null) {
            return 99;
        } else {
            int var2 = class94.method704(this.field1886, 0, 255);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return !arg0 ? -37 : var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZ[BZ)V", line = 151)
    public final void method585(int arg0, int arg1, boolean arg2, byte[] arg3, boolean arg4) {
        if (arg0 >= -30) {
            this.method583(false, 50, (byte[]) null, -64, (class7) null);
        }
        ++field1875;
        if (!arg4) {
            arg3[arg3.length + -2] = (byte) (super.field1523[arg1] >> 8);
            arg3[arg3.length + -1] = (byte) super.field1523[arg1];
            if (this.field1862 != null) {
                class29.method237(this.field1862, (byte) -83, arg1, arg3);
                this.field1864[arg1] = true;
            }
            if (arg2) {
                super.field1564[arg1] = arg3;
                return;
            }
        } else {
            if (this.field1872) {
                throw new RuntimeException();
            }
            if (this.field1878 != null) {
                class29.method237(this.field1878, (byte) -83, this.field1886, arg3);
            }
            this.method505(-82, arg3);
            this.method586(-20754);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lb;Lb;IZZZ)V", line = 194)
    public class75(class7 arg0, class7 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1886 = arg2;
        this.field1862 = arg0;
        this.field1877 = arg5;
        this.field1878 = arg1;
        class17.method142(this.field1886, this, false);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 212)
    private final void method586(int arg0) {
        this.field1864 = new boolean[super.field1564.length];
        for (int var2 = 0; ~this.field1864.length < ~var2; ++var2) {
            this.field1864[var2] = false;
        }
        ++field1889;
        if (this.field1862 == null) {
            this.field1872 = true;
        } else {
            this.field1874 = -1;
            if (arg0 != -20754) {
                this.method491(-90, -60);
            }
            for (int var3 = 0; this.field1864.length > var3; ++var3) {
                if (~super.field1538[var3] < -1) {
                    class94.method701(var3, this, this.field1862, (byte) 93);
                    this.field1874 = var3;
                }
            }
            if (~this.field1874 == 0) {
                this.field1872 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 258)
    public static final void method587(int arg0) {
        if (arg0 != -31315) {
            method589((byte) -18, (class88) null);
        }
        if (~class119.field2921 == -2) {
            if (~class105.field2558 <= -540 && ~class105.field2558 >= -574 && ~class35.field988 <= -170 && ~class35.field988 > -206 && class71.field1814[0] != -1) {
                class42.field1181 = 0;
                class20.field585 = true;
                class23.field673 = true;
            }
            if (class105.field2558 >= 569 && ~class105.field2558 >= -600 && ~class35.field988 <= -169 && class35.field988 < 205 && class71.field1814[1] != -1) {
                class42.field1181 = 1;
                class23.field673 = true;
                class20.field585 = true;
            }
            if (class105.field2558 >= 597 && ~class105.field2558 >= -628 && ~class35.field988 <= -169 && class35.field988 < 205 && class71.field1814[2] != -1) {
                class42.field1181 = 2;
                class23.field673 = true;
                class20.field585 = true;
            }
            if (~class105.field2558 <= -626 && ~class105.field2558 >= -670 && class35.field988 >= 168 && class35.field988 < 203 && ~class71.field1814[3] != 0) {
                class20.field585 = true;
                class42.field1181 = 3;
                class23.field673 = true;
            }
            if (~class105.field2558 <= -667 && ~class105.field2558 >= -697 && class35.field988 >= 168 && class35.field988 < 205 && ~class71.field1814[4] != 0) {
                class20.field585 = true;
                class23.field673 = true;
                class42.field1181 = 4;
            }
            if (~class105.field2558 <= -695 && ~class105.field2558 >= -725 && ~class35.field988 <= -169 && class35.field988 < 205 && class71.field1814[5] != -1) {
                class20.field585 = true;
                class42.field1181 = 5;
                class23.field673 = true;
            }
            if (~class105.field2558 <= -723 && ~class105.field2558 >= -757 && ~class35.field988 <= -170 && class35.field988 < 205 && class71.field1814[6] != -1) {
                class20.field585 = true;
                class42.field1181 = 6;
                class23.field673 = true;
            }
            if (class105.field2558 >= 540 && class105.field2558 <= 574 && class35.field988 >= 466 && class35.field988 < 502 && class71.field1814[7] != -1) {
                class42.field1181 = 7;
                class20.field585 = true;
                class23.field673 = true;
            }
            if (~class105.field2558 <= -573 && class105.field2558 <= 602 && class35.field988 >= 466 && ~class35.field988 > -504 && ~class71.field1814[8] != 0) {
                class42.field1181 = 8;
                class20.field585 = true;
                class23.field673 = true;
            }
            if (class105.field2558 >= 599 && ~class105.field2558 >= -630 && class35.field988 >= 466 && ~class35.field988 > -504 && ~class71.field1814[9] != 0) {
                class42.field1181 = 9;
                class23.field673 = true;
                class20.field585 = true;
            }
            if (~class105.field2558 <= -628 && ~class105.field2558 >= -672 && class35.field988 >= 467 && class35.field988 < 502 && ~class71.field1814[10] != 0) {
                class23.field673 = true;
                class20.field585 = true;
                class42.field1181 = 10;
            }
            if (class105.field2558 >= 669 && ~class105.field2558 >= -700 && ~class35.field988 <= -467 && ~class35.field988 > -504 && ~class71.field1814[11] != 0) {
                class20.field585 = true;
                class42.field1181 = 11;
                class23.field673 = true;
            }
            if (~class105.field2558 <= -697 && ~class105.field2558 >= -727 && class35.field988 >= 466 && class35.field988 < 503 && class71.field1814[12] != -1) {
                class42.field1181 = 12;
                class23.field673 = true;
                class20.field585 = true;
            }
            if (class105.field2558 >= 724 && ~class105.field2558 >= -759 && ~class35.field988 <= -467 && class35.field988 < 502 && ~class71.field1814[13] != 0) {
                class42.field1181 = 13;
                class23.field673 = true;
                class20.field585 = true;
            }
        }
        ++field1873;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V", line = 388)
    public final void method588(int arg0, byte arg1) {
        if (arg1 != -83) {
            field1890 = 109;
        }
        this.field1867 = arg0;
        ++field1865;
        if (this.field1878 != null) {
            class48.method429(this.field1886, this, this.field1878, (byte) -94);
        } else {
            class45.method414(true, this.field1886, true, 255, this.field1867, this, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLod;)V", line = 404)
    public static final void method589(byte arg0, class88 arg1) {
        ++field1866;
        int var2 = -121 % ((26 - arg0) / 40);
        if (~class130.field3128 == ~arg1.field2070 || arg1.field2115 == -1 || arg1.field2139 != 0 || arg1.field2134 - -1 > class85.method641(arg1.field2115, 12).field1108[arg1.field2112]) {
            int var3 = -arg1.field2133 + arg1.field2070;
            int var4 = arg1.field2142 * 128 - -(arg1.field2076 * 64);
            int var5 = arg1.field2076 * 64 + arg1.field2073 * 128;
            int var6 = class130.field3128 - arg1.field2133;
            int var7 = arg1.field2091 * 128 - -(arg1.field2076 * 64);
            int var8 = arg1.field2077 * 128 + arg1.field2076 * 64;
            arg1.field2071 = ((-var6 + var3) * var5 + var6 * var7) / var3;
            arg1.field2128 = ((-var6 + var3) * var4 + var6 * var8) / var3;
        }
        if (arg1.field2098 == 0) {
            arg1.field2106 = 1024;
        }
        if (~arg1.field2098 == -2) {
            arg1.field2106 = 1536;
        }
        arg1.field2136 = 0;
        if (~arg1.field2098 == -3) {
            arg1.field2106 = 0;
        }
        if (arg1.field2098 == 3) {
            arg1.field2106 = 512;
        }
        arg1.field2099 = arg1.field2106;
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)I", line = 466)
    public final int method590(int arg0) {
        if (arg0 != -18835) {
            method593((class60) null, false, (class60) null);
        }
        ++field1888;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < super.field1564.length; ++var4) {
            if (super.field1538[var4] > 0) {
                var3 += this.method595(124, var4);
                var2 += 100;
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(III)I", line = 508)
    public static final int method591(int arg0, int arg1, int arg2) {
        ++field1869;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (~arg1 > -1) {
                arg1 = 0;
            } else if (~arg1 < -128) {
                arg1 = 127;
            }
            return -arg1 + 127;
        } else {
            int var4 = (arg0 & arg2) * arg1 / 128;
            if (~var4 > -3) {
                var4 = 2;
            } else if (~var4 < -127) {
                var4 = 126;
            }
            return (arg0 & 65408) + var4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V", line = 548)
    public static void method592(int arg0) {
        field1885 = null;
        field1861 = null;
        if (arg0 >= 28) {
            field1882 = null;
            field1884 = null;
            field1876 = null;
            field1868 = null;
            field1871 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V", line = 576)
    public final void method491(int arg0, int arg1) {
        ++field1880;
        int var3 = 28 % ((71 - arg0) / 48);
        class14.method105(arg1, -9674, this.field1886);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lk;ZLk;)V", line = 586)
    public static final void method593(class60 arg0, boolean arg1, class60 arg2) {
        class112.field2755 = arg0;
        if (arg1) {
            field1861 = null;
        }
        class33.field921 = arg2;
        class51.field1352 = class112.field2755.method511(3, 3);
        ++field1860;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIBIII)V", line = 602)
    public static final void method594(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        ++field1887;
        if (~arg1 <= -2 && arg7 >= 1 && ~arg1 >= -103 && ~arg7 >= -103) {
            if (class4.field189 && class71.field1818 != arg6) {
                return;
            }
            int var8 = 0;
            if (arg0 == 0) {
                var8 = class79.field1926.method272(arg6, arg1, arg7);
            }
            boolean var9 = true;
            if (~arg0 == -2) {
                var8 = class79.field1926.method282(arg6, arg1, arg7);
            }
            if (~arg0 == -3) {
                var8 = class79.field1926.method283(arg6, arg1, arg7);
            }
            boolean var10 = false;
            if (arg0 == 3) {
                var8 = class79.field1926.method299(arg6, arg1, arg7);
            }
            boolean var11 = false;
            if (~var8 != -1) {
                int var12 = class79.field1926.method311(arg6, arg1, arg7, var8);
                int var13 = (var12 & 255) >> 6;
                int var14 = (536870258 & var8) >> 14;
                int var15 = var12 & 31;
                if (arg0 == 0) {
                    class79.field1926.method313(arg6, arg1, arg7);
                    class109 var16 = class32.method256(6, var14);
                    if (var16.field2646) {
                        class99.field2404[arg6].method921(arg1, var15, arg7, var16.field2639, var13, true);
                    }
                }
                if (arg0 == 1) {
                    class79.field1926.method281(arg6, arg1, arg7);
                }
                if (arg0 == 2) {
                    class79.field1926.method305(arg6, arg1, arg7);
                    class109 var17 = class32.method256(6, var14);
                    if (arg1 - -var17.field2647 > 103 || var17.field2647 + arg7 > 103 || arg1 - -var17.field2664 > 103 || var17.field2664 + arg7 > 103) {
                        return;
                    }
                    if (var17.field2646) {
                        class99.field2404[arg6].method925(var17.field2639, var17.field2664, var17.field2647, true, var13, arg1, arg7);
                    }
                }
                if (~arg0 == -4) {
                    class79.field1926.method312(arg6, arg1, arg7);
                    class109 var18 = class32.method256(6, var14);
                    if (var18.field2646 && var18.field2633 == 1) {
                        class99.field2404[arg6].method932(arg7, arg1, 123);
                    }
                }
            }
            if (arg2 >= 0) {
                int var19 = arg6;
                if (~arg6 > -4 && (class56.field1435[1][arg1][arg7] & 2) == 2) {
                    var19 = arg6 + 1;
                }
                class120.method918((byte) 69, class79.field1926, arg2, arg3, var19, arg7, arg1, class99.field2404[arg6], arg5, arg6);
            }
        }
        if (arg4 >= -10) {
            field1876 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(II)I", line = 721)
    private final int method595(int arg0, int arg1) {
        if (arg0 <= 112) {
            this.method595(43, 55);
        }
        ++field1870;
        if (super.field1564[arg1] != null) {
            return 100;
        } else {
            return this.field1864[arg1] ? 100 : class94.method704(arg1, 0, this.field1886);
        }
    }
}
