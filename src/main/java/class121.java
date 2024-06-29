import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class121 extends class148 implements class395 {

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Z")
    private boolean field1885;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "B")
    private byte field1903;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "Z")
    private boolean field1887;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "Z")
    private boolean field1896;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "S")
    private short field1906;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "B")
    private byte field1897;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "B")
    private byte field1904;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "Z")
    private boolean field1888;

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "Lrc;")
    public class100 field1913;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Lsr;")
    private class135 field1889;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "Z")
    public static boolean field1908 = false;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "Lvj;")
    public static class177 field1900;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "[Lof;")
    public static class421[] field1899;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BIZLdp;II)V", line = 3)
    public static final void method1012(byte arg0, int arg1, boolean arg2, class174 arg3, int arg4, int arg5) {
        class44.field659 = arg5;
        class198.field2895 = arg2;
        class439.field6387 = 1;
        if (arg0 <= 8) {
            field1891 = -61;
        }
        class198.field2891 = 10000;
        class242.field3527 = arg3;
        class122.field1920 = arg4;
        class267.field4004 = arg1;
        ++field1911;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)I", line = 24)
    public final int method1013(boolean arg0) {
        ++field1909;
        if (arg0) {
            this.method137(-74, (class90) null);
        }
        return this.field1906 & 65535;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lja;Lfb;IIIIZIIZ)V", line = 38)
    public class121(class90 arg0, class45 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class234.method1724(arg7, arg8, -31853));
        this.field1885 = arg1.field697 != 0;
        this.field1903 = (byte) arg7;
        this.field1887 = arg9;
        this.field1896 = arg6;
        this.field1906 = (short) arg1.field733;
        this.field1897 = (byte) arg2;
        super.field2282 = (short) arg5;
        this.field1904 = (byte) arg8;
        super.field2289 = (short) arg3;
        this.field1888 = arg0.method730() && arg1.field728 && !this.field1896 && ~class238.field3438 != -1;
        int var11 = 1024;
        if (this.field1887) {
            var11 |= 32768;
        }
        class209 var12 = this.method1019(var11, 1, this.field1888, arg0);
        if (var12 != null) {
            this.field1913 = var12.field3048;
            this.field1889 = var12.field3046;
            if (this.field1887) {
                this.field1913 = this.field1913.method518((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lja;II)Lrc;", line = 73)
    private final class100 method1014(class90 arg0, int arg1, int arg2) {
        ++field1892;
        if (arg1 != 24340) {
            this.field1903 = 84;
        }
        if (this.field1913 != null && ~arg0.method677(this.field1913.method560(), arg2) == -1) {
            return this.field1913;
        } else {
            class209 var4 = this.method1019(arg2, 1, false, arg0);
            return var4 == null ? null : var4.field3048;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lmb;III)V", line = 93)
    public static final void method1015(class258 arg0, int arg1, int arg2, int arg3) {
        if (~arg0.field3868 == -1) {
            arg0.field3908 = arg0.field3870;
        } else if (arg0.field3868 == 1) {
            arg0.field3908 = (arg3 - arg0.field3758) / 2 + arg0.field3870;
        } else if (~arg0.field3868 == -3) {
            arg0.field3908 = -arg0.field3870 + -arg0.field3758 + arg3;
        } else if (arg0.field3868 != 3) {
            if (~arg0.field3868 != -5) {
                arg0.field3908 = -(arg0.field3870 * arg3 >> 14) + arg3 + -arg0.field3758;
            } else {
                arg0.field3908 = (arg0.field3870 * arg3 >> 14) + (-arg0.field3758 + arg3) / 2;
            }
        } else {
            arg0.field3908 = arg0.field3870 * arg3 >> 14;
        }
        if (arg0.field3770 == 0) {
            arg0.field3750 = arg0.field3853;
        } else if (~arg0.field3770 != -2) {
            if (arg0.field3770 == 2) {
                arg0.field3750 = arg1 - arg0.field3853 + -arg0.field3764;
            } else if (arg0.field3770 == 3) {
                arg0.field3750 = arg0.field3853 * arg1 >> 14;
            } else if (~arg0.field3770 == -5) {
                arg0.field3750 = (arg0.field3853 * arg1 >> 14) + (-arg0.field3764 + arg1) / 2;
            } else {
                arg0.field3750 = -(arg0.field3853 * arg1 >> 14) + -arg0.field3764 + arg1;
            }
        } else {
            arg0.field3750 = (-arg0.field3764 + arg1) / 2 + arg0.field3853;
        }
        ++field1882;
        if (class342.field4850 && (~client.method1815(arg0).field6033 != -1 || arg0.field3793 == 0)) {
            if (~arg0.field3908 > -1) {
                arg0.field3908 = 0;
            } else if (arg3 < arg0.field3908 - -arg0.field3758) {
                arg0.field3908 = -arg0.field3758 + arg3;
            }
            if (~arg0.field3750 <= -1) {
                if (arg1 < arg0.field3764 + arg0.field3750) {
                    arg0.field3750 = arg1 - arg0.field3764;
                }
            } else {
                arg0.field3750 = 0;
            }
        }
        int var4 = -6 / ((arg2 - -82) / 39);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ)V", line = 163)
    public static final void method1016(int arg0, int arg1, boolean arg2) {
        ++field1895;
        class221 var3 = class447.method2795(6, (byte) -49, arg1);
        var3.method1692(0);
        if (arg2) {
            field1908 = false;
        }
        var3.field3297 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)V", line = 177)
    public static void method1017(int arg0) {
        field1900 = null;
        if (arg0 == 65535) {
            field1899 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)Z", line = 189)
    public final boolean method53(byte arg0) {
        ++field1884;
        return arg0 < 58 ? false : this.field1887;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Z", line = 201)
    public final boolean method1018(byte arg0) {
        if (arg0 > -16) {
            this.method137(89, (class90) null);
        }
        ++field1914;
        return this.field1888;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLja;)Lkh;", line = 217)
    public final class69 method134(byte arg0, class90 arg1) {
        ++field1893;
        if (this.field1913 == null) {
            return null;
        } else {
            class202 var3 = arg1.method709();
            var3.method1527(super.field2289, super.field2286, super.field2282);
            if (arg0 < 90) {
                this.method1025((byte) 48, 51, (class90) null);
            }
            class69 var4 = null;
            if (this.field1885) {
                var4 = class256.method1849(1, 79);
            }
            this.field1913.method530(var3, var4 != null ? var4.field1128[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZLja;)Lob;", line = 250)
    private final class209 method1019(int arg0, int arg1, boolean arg2, class90 arg3) {
        ++field1905;
        class45 var5 = class451.method2812(104, 65535 & this.field1906);
        if (arg1 != 1) {
            return null;
        } else {
            class126 var6;
            class126 var7;
            if (!this.field1896) {
                var6 = class311.field4527[this.field1897];
                if (~this.field1897 <= -4) {
                    var7 = null;
                } else {
                    var7 = class311.field4527[this.field1897 + 1];
                }
            } else {
                var6 = class18.field262[this.field1897];
                var7 = class311.field4527[0];
            }
            return var5.method361(arg1 ^ -183837886, this.field1903, arg3, arg2, super.field2286, var7, super.field2289, this.field1904, arg0, var6, super.field2282);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILja;)V", line = 284)
    public final void method137(int arg0, class90 arg1) {
        ++field1910;
        int var3 = -127 % ((arg0 - -31) / 51);
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 293)
    public final void method54(int arg0) {
        ++field1912;
        this.field1887 = false;
        if (arg0 == 0) {
            if (this.field1913 != null) {
                this.field1913.method525(this.field1913.method560() & -32769);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)I", line = 310)
    public final int method1020(int arg0) {
        ++field1902;
        if (arg0 != 15829) {
            method1016(-26, -108, true);
        }
        return this.field1904;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lja;I)V", line = 324)
    public final void method1021(class90 arg0, int arg1) {
        ++field1886;
        Object var3 = null;
        int var4 = 29 / ((-58 - arg1) / 56);
        class135 var6;
        if (this.field1889 == null && this.field1888) {
            class209 var5 = this.method1019(131072, 1, true, arg0);
            var6 = var5 == null ? null : var5.field3046;
        } else {
            var6 = this.field1889;
            this.field1889 = null;
        }
        if (var6 != null) {
            class50.method395(var6, this.field1897, super.field2289, super.field2282, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILja;II)Z", line = 352)
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        ++field1898;
        class100 var5 = this.method1014(arg1, 24340, 65536);
        if (var5 != null) {
            class202 var6 = arg1.method709();
            var6.method1527(super.field2289, super.field2286, super.field2282);
            return var5.method574(arg3, arg0, var6, false);
        } else {
            if (arg2 != 28033) {
                this.field1906 = 125;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZLja;)V", line = 373)
    public final void method1022(boolean arg0, class90 arg1) {
        ++field1901;
        Object var3 = null;
        class135 var5;
        if (this.field1889 == null && this.field1888) {
            class209 var4 = this.method1019(131072, 1, true, arg1);
            var5 = var4 != null ? var4.field3046 : null;
        } else {
            var5 = this.field1889;
            this.field1889 = null;
        }
        if (!arg0) {
            this.field1887 = true;
        }
        if (var5 != null) {
            class365.method2332(var5, this.field1897, super.field2289, super.field2282, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 401)
    public final void method1023(int arg0) {
        if (arg0 < 40) {
            this.method1021((class90) null, 100);
        }
        if (this.field1913 != null) {
            this.field1913.method520();
        }
        ++field1890;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)I", line = 414)
    public final int method1024(int arg0) {
        ++field1907;
        return arg0 != 20691 ? 29 : this.field1903;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBZIILnf;Lja;)V", line = 439)
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        ++field1883;
        if (!(arg5 instanceof class121)) {
            if (arg5 instanceof class245) {
                class245 var8 = (class245) arg5;
                if (this.field1913 != null && var8.field3557 != null) {
                    this.field1913.method552(var8.field3557, arg3, arg0, arg4, arg2);
                }
            }
        } else {
            class121 var9 = (class121) arg5;
            if (this.field1913 != null && var9.field1913 != null) {
                this.field1913.method552(var9.field1913, arg3, arg0, arg4, arg2);
            }
        }
        if (arg1 != 47) {
            this.method134((byte) -64, (class90) null);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BILja;)Lrc;", line = 473)
    public final class100 method1025(byte arg0, int arg1, class90 arg2) {
        ++field1894;
        return arg0 != -84 ? null : this.method1014(arg2, 24340, arg1);
    }
}
