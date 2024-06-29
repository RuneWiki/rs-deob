import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class125 extends class168 implements class303 {

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "B")
    private byte field1928;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Z")
    private boolean field1945;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "S")
    private short field1941;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "B")
    private byte field1952;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "Z")
    private boolean field1940;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "Z")
    private boolean field1950;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "B")
    private byte field1925;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Z")
    private boolean field1944;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "Li;")
    private class197 field1943;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Le;")
    public class285 field1926;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lka;")
    public static class473 field1920 = new class473(10);

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "[I")
    public static int[] field1939 = new int[100];

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "Lrb;")
    public static class283 field1942 = new class283(78, 6);

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "Z")
    public static boolean field1954 = true;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z", line = 3)
    public final boolean method169(int arg0) {
        if (arg0 != -28206) {
            return false;
        } else {
            ++field1937;
            return this.field1940;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lza;I)V", line = 14)
    public final void method156(class295 arg0, int arg1) {
        ++field1947;
        Object var3 = null;
        class197 var5;
        if (this.field1943 == null && this.field1944) {
            class135 var4 = this.method905((byte) 46, true, 262144, arg0);
            var5 = var4 == null ? null : var4.field2053;
        } else {
            var5 = this.field1943;
            this.field1943 = null;
        }
        if (arg1 > -109) {
            method906((class319) null, (byte) -64);
        }
        if (var5 != null) {
            class161.method1135(var5, this.field1925, super.field2565, super.field2558, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V", line = 43)
    public static final void method901(int arg0, int arg1) {
        ++field1922;
        class314 var2 = class177.method1213(false, arg0, arg1);
        var2.method1811((byte) 86);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V", line = 54)
    public static void method902(byte arg0) {
        field1920 = null;
        field1942 = null;
        field1939 = null;
        if (arg0 != 0) {
            field1954 = false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILza;B)Le;", line = 68)
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        if (arg2 != -14) {
            this.method166((class295) null, 37);
        }
        ++field1921;
        return this.method908(arg0, arg1, (byte) 124);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lza;Lpm;IIIIZIIZ)V", line = 81)
    public class125(class295 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class358.method2137(arg7, (byte) 1, arg8));
        this.field1928 = (byte) arg8;
        this.field1945 = arg6;
        this.field1941 = (short) arg1.field1646;
        this.field1952 = (byte) arg7;
        super.field2565 = arg3;
        super.field2558 = arg5;
        this.field1940 = arg9;
        this.field1950 = arg1.field1697 != 0 && !arg6;
        this.field1925 = (byte) arg2;
        this.field1944 = arg0.method498() && arg1.field1614 && !this.field1945 && class76.field1075.method1593(class195.field2849, 125) != 0;
        int var11 = 2048;
        if (this.field1940) {
            var11 |= 65536;
        }
        class135 var12 = this.method905((byte) 46, this.field1944, var11, arg0);
        if (var12 != null) {
            this.field1943 = var12.field2053;
            this.field1926 = var12.field2051;
            if (this.field1940) {
                this.field1926 = this.field1926.method697((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Li;III[Z)Z", line = 116)
    public static final boolean method903(class197 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class492.field7122 != class36.field554) {
            int var6 = class348.field5000[arg1].method79(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class11 var8 = class348.field5000[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method79(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method74(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method84(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Lza;I)V", line = 153)
    public final void method166(class295 arg0, int arg1) {
        if (arg1 <= 7) {
            this.field1944 = false;
        }
        ++field1949;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;)V", line = 169)
    public static final void method904(int arg0, String arg1) {
        ++field1934;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class75.method585(arg1, arg0 ^ -2);
            if (var2 != null) {
                if (arg0 != 1) {
                    field1920 = null;
                }
                for (int var3 = 0; ~var3 > ~class399.field5724; ++var3) {
                    String var4 = class494.field7148[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class75.method585(var4, -1);
                    if (var5 != null && var5.equals(var2)) {
                        --class399.field5724;
                        for (int var6 = var3; var6 < class399.field5724; ++var6) {
                            class494.field7148[var6] = class494.field7148[var6 - -1];
                            class384.field5510[var6] = class384.field5510[var6 - -1];
                            class423.field6155[var6] = class423.field6155[var6 + 1];
                            class184.field2736[var6] = class184.field2736[var6 + 1];
                            class342.field4949[var6] = class342.field4949[var6 + 1];
                            class529.field7782[var6] = class529.field7782[var6 + 1];
                        }
                        ++class423.field6148;
                        class294.field3968 = class365.field5245;
                        class274.method1602(14, class212.field3017);
                        class17.field275.method1891(false, class515.method3047((byte) -46, arg1));
                        class17.field275.method1879(arg0 + 32766, arg1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLza;)Lql;", line = 234)
    public final class121 method171(byte arg0, class295 arg1) {
        ++field1935;
        if (this.field1926 == null) {
            return null;
        } else {
            class512 var3 = arg1.method541();
            var3.method955(super.field2565, super.field2561, super.field2558);
            class121 var4 = null;
            if (this.field1950) {
                var4 = class399.method2364(1, -29752);
            }
            this.field1926.method701(var3, var4 != null ? var4.field1878[0] : null, 0);
            if (arg0 != -96) {
                this.method171((byte) 114, (class295) null);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Llb;IZIBILza;)V", line = 267)
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        if (arg4 < 54) {
            field1954 = true;
        }
        ++field1931;
        if (arg0 instanceof class125) {
            class125 var8 = (class125) arg0;
            if (this.field1926 != null && var8.field1926 != null) {
                this.field1926.method698(var8.field1926, arg1, arg5, arg3, arg2);
            }
        } else {
            if (arg0 instanceof class425) {
                class425 var9 = (class425) arg0;
                if (this.field1926 != null && var9.field6162 != null) {
                    this.field1926.method698(var9.field6162, arg1, arg5, arg3, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 298)
    public final void method165(int arg0) {
        if (arg0 == -8698) {
            ++field1948;
            if (this.field1926 != null) {
                this.field1926.method687();
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)I", line = 313)
    public final int method170(byte arg0) {
        int var2 = 31 / ((-11 - arg0) / 47);
        ++field1936;
        return 65535 & this.field1941;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZILza;)Luo;", line = 323)
    private final class135 method905(byte arg0, boolean arg1, int arg2, class295 arg3) {
        ++field1953;
        if (arg0 != 46) {
            method906((class319) null, (byte) 67);
        }
        class103 var5 = class452.field6629.method603((byte) 114, 65535 & this.field1941);
        class11 var6;
        class11 var7;
        if (this.field1945) {
            var6 = class36.field554[this.field1925];
            var7 = class348.field5000[0];
        } else {
            if (this.field1925 >= 3) {
                var7 = null;
            } else {
                var7 = class348.field5000[this.field1925 - -1];
            }
            var6 = class348.field5000[this.field1925];
        }
        return var5.method801(this.field1952, arg2, super.field2565, false, super.field2561, var7, arg3, var6, super.field2558, this.field1928, arg1);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)Z", line = 353)
    public final boolean method160(byte arg0) {
        ++field1951;
        if (arg0 != 112) {
            this.field1926 = null;
        }
        return this.field1944;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V", line = 376)
    public final void method168(int arg0) {
        ++field1933;
        this.field1940 = false;
        int var2 = -79 / ((arg0 - 43) / 56);
        if (this.field1926 != null) {
            this.field1926.method711(-65537 & this.field1926.method671());
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBILza;)Z", line = 391)
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field1923;
        if (arg1 <= 58) {
            this.method905((byte) 121, true, 87, (class295) null);
        }
        class285 var5 = this.method908(131072, arg3, (byte) 121);
        if (var5 != null) {
            class512 var6 = arg3.method541();
            var6.method955(super.field2565, super.field2561, super.field2558);
            return var5.method684(arg2, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lsv;B)Lqd;", line = 415)
    public static final class278 method906(class319 arg0, byte arg1) {
        ++field1927;
        int var2 = -28 % ((29 - arg1) / 57);
        return new class278(arg0.method1847(27), arg0.method1847(115), arg0.method1847(48), arg0.method1847(7), arg0.method1847(102), arg0.method1847(59), arg0.method1847(58), arg0.method1847(47), arg0.method1852(1086280488), arg0.method1869(-107));
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)Lde;", line = 426)
    public static final class10 method907(int arg0, int arg1) {
        ++field1930;
        class10[] var2 = class402.method2379((byte) -20);
        int var3 = 0;
        if (arg0 != 13864) {
            method901(41, -84);
        }
        while (var3 < var2.length) {
            if (~var2[var3].field115 == ~arg1) {
                return var2[var3];
            }
            ++var3;
        }
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(ILza;B)Le;", line = 450)
    private final class285 method908(int arg0, class295 arg1, byte arg2) {
        ++field1929;
        int var4 = 60 % ((41 - arg2) / 47);
        if (this.field1926 != null && ~arg1.method459(this.field1926.method671(), arg0) == -1) {
            return this.field1926;
        } else {
            class135 var5 = this.method905((byte) 46, false, arg0, arg1);
            return var5 != null ? var5.field2051 : null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lza;I)V", line = 476)
    public final void method164(class295 arg0, int arg1) {
        if (arg1 != 1907) {
            this.method170((byte) 52);
        }
        ++field1946;
        Object var3 = null;
        class197 var5;
        if (this.field1943 == null && this.field1944) {
            class135 var4 = this.method905((byte) 46, true, 262144, arg0);
            var5 = var4 == null ? null : var4.field2053;
        } else {
            var5 = this.field1943;
            this.field1943 = null;
        }
        if (var5 != null) {
            method903(var5, this.field1925, super.field2565, super.field2558, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I", line = 504)
    public final int method159(int arg0) {
        ++field1938;
        int var2 = -9 / ((78 - arg0) / 46);
        return this.field1952;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I", line = 520)
    public final int method157(byte arg0) {
        if (arg0 != -22) {
            return 42;
        } else {
            ++field1924;
            return this.field1928;
        }
    }
}
