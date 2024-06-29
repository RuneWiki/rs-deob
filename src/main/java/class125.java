import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class125 extends class208 {

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    private int field2048 = 0;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "Z")
    private boolean field2068 = false;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    private int field2037 = 0;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    private int field2060 = -32768;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    private int field2061;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    private int field2044;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    private int field2064;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    private int field2065;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    private int field2054;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    private int field2062;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "Lqa;")
    private class254 field2058;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field2056 = 100;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field2063 = 50;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Lsc;")
    private static class181 field2045 = class149.method967(255, "Loaded interfaces");

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Lsc;")
    public static class181 field2041 = field2045;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Lsc;")
    public static class181 field2051 = class149.method967(255, "hitmarks");

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public static int field2071 = -1;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    public static int field2072 = 0;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "Lsc;")
    private static class181 field2075 = class149.method967(255, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Lsc;")
    public static class181 field2053 = field2075;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "D")
    private double field2035;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "D")
    public double field2047;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "D")
    private double field2052;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "D")
    private double field2057;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "D")
    public double field2069;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "D")
    private double field2073;

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "D")
    public double field2077;

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "D")
    private double field2079;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    private int field2067;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
    public final void method807(int arg0, byte arg1) {
        this.field2077 += this.field2079 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2035;
        int var3 = -71 / ((68 - arg1) / 58);
        this.field2069 += (double) arg0 * this.field2073;
        field2038++;
        this.field2068 = true;
        this.field2047 += (double) arg0 * this.field2052;
        this.field2035 += (double) arg0 * this.field2079;
        this.field2034 = (int) (Math.atan2(this.field2073, this.field2052) * 325.949D) + 1024 & 0x7FF;
        this.field2067 = (int) (Math.atan2(this.field2035, this.field2057) * 325.949D) & 0x7FF;
        if (this.field2058 == null) {
            return;
        }
        this.field2048 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2058.field4456[this.field2037] >= this.field2048) {
                        return;
                    }
                    this.field2048 -= this.field2058.field4456[this.field2037];
                    this.field2037++;
                } while (this.field2058.field4431.length > this.field2037);
                this.field2037 -= this.field2058.field4424;
            } while (this.field2037 >= 0 && this.field2058.field4431.length > this.field2037);
            this.field2037 = 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method808(byte arg0) {
        int var1 = 92 % ((arg0 + 29) / 57);
        field2051 = null;
        field2041 = null;
        field2045 = null;
        field2053 = null;
        field2075 = null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Lnb;")
    private final class249 method809(int arg0) {
        field2055++;
        if (arg0 <= 76) {
            method812(-12, 15);
        }
        class97 var2 = class259.method1760(this.field2065, -18270);
        class249 var3 = var2.method642(128, this.field2037);
        if (var3 == null) {
            return null;
        } else {
            var3.method1599(this.field2067);
            return var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public static final void method810(int arg0) {
        field2039++;
        if (arg0 != 16776960) {
            field2045 = null;
        }
        class188.field3324.method1790(0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZ)V")
    public static final void method811(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2043++;
        class17.method157(arg0, arg2, arg0 + arg3, arg1 + arg2);
        class17.method156(arg0, arg2, arg3, arg1, 0);
        if (class109.field1787 < 100) {
            return;
        }
        if (class2.field63 == null || class2.field63.field1757 != arg3 || class2.field63.field1756 != arg1) {
            class48 var5 = new class48(arg3, arg1);
            class17.method148(var5.field747, arg3, arg1);
            class96.method634(0, 0, class222.field3840, arg1, 0, (byte) -15, arg3, class62.field967, 0);
            class2.field63 = var5;
            class90.field1438.method385(0);
        }
        class2.field63.method329(arg0, arg2);
        if (arg4) {
            return;
        }
        int var6 = class18.field322 * arg3 / class62.field967 + arg0;
        int var7 = arg2 + (class43.field671 * arg1 / class222.field3840);
        int var8 = class73.field1169 * arg1 / class222.field3840;
        int var9 = class80.field1288 * arg3 / class62.field967;
        class17.method164(var6, var7, var9, var8, 16711680, 128);
        class17.method155(var6, var7, var9, var8, 16711680);
        if (class80.field1294 <= 0 || (class80.field1294 % 10) >= 5) {
            return;
        }
        for (class111 var10 = (class111) class98.field1581.method1686((byte) -83); var10 != null; var10 = (class111) class98.field1581.method1683(140)) {
            if (client.field2704 == var10.field1828) {
                int var11 = arg0 + (var10.field1817 * arg3 / class62.field967);
                int var12 = var10.field1818 * arg1 / class222.field3840 + arg2;
                class17.method156(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
    public static final int method812(int arg0, int arg1) {
        field2070++;
        int var2 = 21 % ((6 - arg1) / 48);
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class249 var11 = this.method809(122);
        field2078++;
        if (var11 != null) {
            var11.method194(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2060 = var11.method190();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
    public final int method190() {
        field2050++;
        return this.field2060;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public static final void method813(byte arg0) {
        field2074++;
        int var1 = -41 % ((37 - arg0) / 49);
        while (true) {
            class247 var2 = class194.field3398;
            class131 var3;
            synchronized (class194.field3398) {
                var3 = (class131) class217.field3724.method1688((byte) 27);
            }
            if (var3 == null) {
                return;
            }
            var3.field2161.method597(var3.field2168, 255, (int) var3.field606, false, var3.field2165);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IIIII)V")
    public final void method814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2068) {
            double var6 = (double) (arg1 - this.field2044);
            double var8 = (double) (arg3 - this.field2062);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2047 = (double) this.field2064 * var6 / var10 + (double) this.field2044;
            this.field2077 = (double) this.field2061;
            this.field2069 = (double) this.field2064 * var8 / var10 + (double) this.field2062;
        }
        field2059++;
        double var12 = (double) (this.field2042 + 1 - arg4);
        this.field2052 = ((double) arg1 - this.field2047) / var12;
        this.field2073 = ((double) arg3 - this.field2069) / var12;
        if (arg2 <= 108) {
            return;
        }
        this.field2057 = Math.sqrt(this.field2073 * this.field2073 + this.field2052 * this.field2052);
        if (!this.field2068) {
            this.field2035 = -this.field2057 * Math.tan((double) this.field2054 * 0.02454369D);
        }
        this.field2079 = ((double) arg0 - this.field2077 - this.field2035 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BB)I")
    public static final int method815(byte arg0, byte arg1) {
        field2036++;
        if (arg0 >= 65 && arg0 <= 90) {
            return arg0 - 65;
        } else if (arg0 >= 97 && arg0 <= 122) {
            return arg0 + 26 - 97;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return arg0 + 52 - 48;
        } else if (arg0 == 43) {
            return 62;
        } else if (arg0 == 42) {
            return 62;
        } else if (arg0 == 47) {
            return 63;
        } else {
            if (arg1 != 69) {
                field2041 = null;
            }
            return arg0 == 45 ? 63 : -1;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2061 = arg4;
        this.field2044 = arg3;
        this.field2064 = arg8;
        this.field2049 = arg9;
        this.field2076 = arg5;
        this.field2068 = false;
        this.field2042 = arg6;
        this.field2065 = arg0;
        this.field2066 = arg1;
        this.field2040 = arg10;
        this.field2054 = arg7;
        this.field2062 = arg2;
        int var12 = class259.method1760(this.field2065, -18270).field1563;
        if (var12 == -1) {
            this.field2058 = null;
        } else {
            this.field2058 = class128.method827(var12, 114);
        }
    }
}
