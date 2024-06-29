import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class123 extends class469 implements class534 {

    @OriginalMember(owner = "client!cw", name = "M", descriptor = "Z")
    private boolean field1937;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "S")
    private short field1920;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "Z")
    private boolean field1924;

    @OriginalMember(owner = "client!cw", name = "K", descriptor = "B")
    private byte field1935;

    @OriginalMember(owner = "client!cw", name = "S", descriptor = "B")
    private byte field1943;

    @OriginalMember(owner = "client!cw", name = "L", descriptor = "B")
    private byte field1936;

    @OriginalMember(owner = "client!cw", name = "Q", descriptor = "Z")
    private boolean field1941;

    @OriginalMember(owner = "client!cw", name = "U", descriptor = "Lia;")
    private class424 field1945;

    @OriginalMember(owner = "client!cw", name = "H", descriptor = "Lka;")
    private class336 field1932;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!cw", name = "B", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!cw", name = "C", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!cw", name = "E", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!cw", name = "F", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!cw", name = "G", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!cw", name = "I", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!cw", name = "J", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!cw", name = "N", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!cw", name = "O", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!cw", name = "P", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!cw", name = "R", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!cw", name = "T", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!cw", name = "D", descriptor = "Lem;")
    private class154 field1928;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)Z")
    public final boolean method547(int arg0) {
        int var2 = -47 / ((arg0 - -73) / 39);
        ++field1931;
        return this.field1941;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(Lqa;B)Lem;")
    public final class154 method562(class167 arg0, byte arg1) {
        ++field1923;
        if (arg1 > -117) {
            return null;
        } else {
            if (this.field1928 == null) {
                this.field1928 = class332.method2104(super.field6801, this.method909(0, (byte) 75, arg0), super.field6806, super.field6807, 126);
            }
            return this.field1928;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBLqa;)Lka;")
    private final class336 method909(int arg0, byte arg1, class167 arg2) {
        int var4 = 104 % ((14 - arg1) / 35);
        ++field1933;
        if (this.field1932 != null && arg2.method252(this.field1932.method1166(), arg0) == 0) {
            return this.field1932;
        } else {
            class335 var5 = this.method912(false, arg2, arg0, (byte) -66);
            return var5 == null ? null : var5.field4960;
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
    public final void method548(int arg0) {
        if (this.field1932 != null) {
            this.field1932.method1162();
        }
        ++field1942;
        int var2 = -20 % ((-37 - arg0) / 34);
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)I")
    public final int method561(byte arg0) {
        ++field1934;
        return arg0 != -85 ? -51 : 65535 & this.field1920;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILqa;)Lnj;")
    public final class166 method554(int arg0, class167 arg1) {
        ++field1926;
        if (this.field1932 == null) {
            return null;
        } else {
            class15 var3 = arg1.method312();
            var3.method47(super.field6807 - -super.field6811, super.field6801, super.field6812 + super.field6806);
            class166 var4 = null;
            if (this.field1937) {
                var4 = class392.method2363(arg0 ^ 3317, 1);
            }
            this.field1932.method1142(var3, var4 == null ? null : var4.field2497[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILqa;I)Lka;")
    public final class336 method550(int arg0, class167 arg1, int arg2) {
        ++field1930;
        return arg0 != -14322 ? null : this.method909(arg2, (byte) -112, arg1);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        ++field1922;
        class336 var5 = this.method909(131072, (byte) -37, arg3);
        if (var5 != null) {
            class15 var6 = arg3.method312();
            var6.method47(super.field6807, super.field6801, super.field6806);
            return var5.method1131(arg1, arg0, var6, false);
        } else {
            return arg2 <= 42 ? false : false;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)I")
    public final int method559(byte arg0) {
        if (arg0 < 3) {
            this.method909(-4, (byte) 91, (class167) null);
        }
        ++field1918;
        return this.field1936;
    }

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "(I)I")
    public final int method910(int arg0) {
        ++field1940;
        if (arg0 != 8) {
            this.field1928 = null;
        }
        return this.field1932 == null ? 0 : this.field1932.method1130();
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)I")
    public final int method560(int arg0) {
        if (arg0 != -29863) {
            this.method910(-68);
        }
        ++field1927;
        return this.field1943;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLqa;)V")
    public final void method557(byte arg0, class167 arg1) {
        int var3 = 1 / ((13 - arg0) / 59);
        ++field1919;
        Object var4 = null;
        class424 var6;
        if (this.field1945 == null && this.field1941) {
            class335 var5 = this.method912(true, arg1, 262144, (byte) -66);
            var6 = var5 == null ? null : var5.field4962;
        } else {
            var6 = this.field1945;
            this.field1945 = null;
        }
        if (var6 != null) {
            class354.method2211(var6, this.field1935, super.field6807, super.field6806, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IC)Z")
    public static final boolean method911(int arg0, char arg1) {
        if (arg0 != -23219) {
            method911(-40, (char) 65485);
        }
        ++field1925;
        if ((~arg1 >= -1 || arg1 >= 128) && (~arg1 > -161 || arg1 > 255)) {
            if (arg1 != 0) {
                char[] var2 = class79.field1284;
                for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                    char var4 = var2[var3];
                    if (~arg1 == ~var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqa;Lku;IIIIZIIIII)V")
    public class123(class167 arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class444.method2623(3795, arg11, arg10));
        this.field1937 = arg1.field3872 != 0 && !arg6;
        this.field1920 = (short) arg1.field3882;
        this.field1924 = arg6;
        this.field1935 = (byte) arg2;
        super.field6806 = arg5;
        this.field1943 = (byte) arg11;
        this.field1936 = (byte) arg10;
        super.field6807 = arg3;
        this.field1941 = arg0.method346() && arg1.field3929 && !this.field1924 && class220.field3371.method1213((byte) -35, class74.field1211) != 0;
        class335 var13 = this.method912(this.field1941, arg0, 2048, (byte) -66);
        if (var13 != null) {
            this.field1945 = var13.field4962;
            this.field1932 = var13.field4960;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lqa;B)V")
    public final void method552(class167 arg0, byte arg1) {
        if (arg1 <= -119) {
            ++field1938;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lqa;I)V")
    public final void method551(class167 arg0, int arg1) {
        ++field1939;
        Object var3 = null;
        if (arg1 < 62) {
            this.method557((byte) 85, (class167) null);
        }
        class424 var5;
        if (this.field1945 == null && this.field1941) {
            class335 var4 = this.method912(true, arg0, 262144, (byte) -66);
            var5 = var4 == null ? null : var4.field4962;
        } else {
            var5 = this.field1945;
            this.field1945 = null;
        }
        if (var5 != null) {
            class359.method2231(var5, this.field1935, super.field6807, super.field6806, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZLqa;IB)Lso;")
    private final class335 method912(boolean arg0, class167 arg1, int arg2, byte arg3) {
        ++field1929;
        class261 var5 = class277.field4139.method569((byte) 97, this.field1920 & 65535);
        if (arg3 != -66) {
            this.method548(20);
        }
        class24 var6;
        class24 var7;
        if (this.field1924) {
            var6 = class477.field6942[this.field1935];
            var7 = class393.field5594[0];
        } else {
            if (this.field1935 >= 3) {
                var7 = null;
            } else {
                var7 = class393.field5594[this.field1935 + 1];
            }
            var6 = class393.field5594[this.field1935];
        }
        return var5.method1691(var7, arg1, arg3 + 147, super.field6807, var6, this.field1936, arg2, super.field6801, super.field6806, arg0, this.field1943);
    }
}
