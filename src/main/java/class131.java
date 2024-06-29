import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class131 extends class431 implements class529 {

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Z")
    private boolean field1885;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "B")
    private byte field1880;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "B")
    private byte field1891;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "S")
    private short field1904;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "Z")
    private boolean field1894;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Z")
    private boolean field1882;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "B")
    private byte field1898;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "Z")
    private boolean field1895;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lt;")
    public class471 field1879;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "Lba;")
    private class263 field1900;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "Lfs;")
    public static class387 field1907;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "[Lta;")
    public static class142[] field1899;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lya;II)Lt;", line = 7)
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        int var4 = -4 / ((arg2 - 54) / 56);
        ++field1893;
        return this.method1004(arg0, 1, arg1);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILfs;BIZII)V", line = 18)
    public static final void method1002(int arg0, class387 arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class498.field7403 = arg0;
        if (arg2 == -89) {
            class372.field5534 = 1;
            ++field1884;
            class470.field6941 = arg5;
            class445.field6586 = arg6;
            class127.field1852 = arg1;
            class479.field7048 = arg4;
            class206.field2999 = class77.field1041.method2807(0) / arg3;
            if (class206.field2999 < 1) {
                class206.field2999 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V", line = 41)
    public final void method29(int arg0) {
        this.field1894 = false;
        int var2 = 108 / ((57 - arg0) / 44);
        ++field1905;
        if (this.field1879 != null) {
            this.field1879.method465(this.field1879.method459() & -65537);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Z", line = 56)
    public final boolean method30(int arg0) {
        ++field1909;
        if (arg0 != 10869) {
            this.field1891 = -44;
        }
        return this.field1895;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lya;Lrd;IIIIIZIIIIIIZ)V", line = 67)
    public class131(class38 arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3208 == 1, class383.method2334(true, arg13, arg12));
        this.field1885 = ~arg1.field3200 != -1 && !arg7;
        this.field1880 = (byte) arg13;
        this.field1891 = (byte) arg3;
        this.field1904 = (short) arg1.field3217;
        this.field1894 = arg14;
        this.field1882 = arg7;
        this.field1898 = (byte) arg12;
        this.field1895 = arg0.method297() && arg1.field3193 && !this.field1882 && ~class478.field7044.method1536(class65.field802, (byte) -28) != -1;
        int var16 = 2048;
        if (this.field1894) {
            var16 |= 65536;
        }
        class101 var17 = this.method1008((byte) 10, var16, arg0, this.field1895);
        if (var17 != null) {
            this.field1879 = var17.field1418;
            this.field1900 = var17.field1416;
            if (this.field1894) {
                this.field1879 = this.field1879.method458((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIIFII)[I", line = 102)
    public static final int[] method1003(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7) {
        ++field1883;
        if (arg3 > -15) {
            field1907 = null;
        }
        int[] var8 = new int[arg6];
        class424 var9 = new class424();
        var9.field6263 = arg4;
        var9.field6265 = arg2;
        var9.field6250 = arg7;
        var9.field6264 = arg1;
        var9.field6251 = arg0;
        var9.field6258 = (int) (arg5 * 4096.0F);
        var9.method269(false);
        class258.method1662(1, 9188, arg6);
        var9.method2592(var8, (byte) 116, 0);
        return var8;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILfi;BZLya;I)V", line = 127)
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        ++field1896;
        if (arg3 == -99) {
            if (arg2 instanceof class420) {
                class420 var8 = (class420) arg2;
                if (this.field1879 != null && var8.field6209 != null) {
                    this.field1879.method437(var8.field6209, arg1, arg6, arg0, arg4);
                }
            } else {
                if (arg2 instanceof class131) {
                    class131 var9 = (class131) arg2;
                    if (this.field1879 != null && var9.field1879 != null) {
                        this.field1879.method437(var9.field1879, arg1, arg6, arg0, arg4);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)I", line = 157)
    public final int method890(int arg0) {
        if (arg0 != -25430) {
            this.method39(-12);
        }
        ++field1887;
        return this.field1879 == null ? 0 : this.field1879.method463();
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILya;I)Z", line = 168)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field1890;
        class471 var5 = this.method1004(arg2, 1, 131072);
        if (arg1 != 0) {
            this.field1904 = -96;
        }
        if (var5 != null) {
            class122 var6 = arg2.method362();
            var6.method249(super.field6335, super.field6327, super.field6334);
            return var5.method443(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 190)
    public final void method39(int arg0) {
        if (this.field1879 != null) {
            this.field1879.method441();
        }
        if (arg0 < -18) {
            ++field1886;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lya;II)Lt;", line = 211)
    private final class471 method1004(class38 arg0, int arg1, int arg2) {
        ++field1906;
        if (this.field1879 != null && ~arg0.method335(this.field1879.method459(), arg2) == -1) {
            return this.field1879;
        } else {
            class101 var4 = this.method1008((byte) 10, arg2, arg0, false);
            if (arg1 != 1) {
                this.field1885 = false;
            }
            return var4 == null ? null : var4.field1418;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(Lya;I)Lfk;", line = 233)
    public final class462 method38(class38 arg0, int arg1) {
        ++field1902;
        if (this.field1879 == null) {
            return null;
        } else {
            class122 var3 = arg0.method362();
            var3.method249(super.field6335, super.field6327, super.field6334);
            class462 var4 = null;
            if (this.field1885) {
                var4 = class482.method2908(1, (byte) -95);
            }
            this.field1879.method457(var3, var4 == null ? null : var4.field6800[0], 0);
            if (arg1 > -87) {
                this.field1894 = true;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lya;I)V", line = 260)
    public final void method35(class38 arg0, int arg1) {
        ++field1897;
        if (arg1 < 53) {
            field1907 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)I", line = 274)
    public final int method1005(int arg0) {
        if (arg0 != 20922) {
            return -29;
        } else {
            ++field1881;
            return this.field1879 == null ? 15 : this.field1879.method470() / 4;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)I", line = 285)
    public final int method22(byte arg0) {
        if (arg0 != -70) {
            field1907 = null;
        }
        ++field1888;
        return this.field1880;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I", line = 296)
    public final int method27(int arg0) {
        ++field1903;
        int var2 = -85 / ((arg0 - 39) / 41);
        return this.field1898;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lya;I)V", line = 308)
    public final void method31(class38 arg0, int arg1) {
        ++field1892;
        Object var3 = null;
        class263 var5;
        if (this.field1900 == null && this.field1895) {
            class101 var4 = this.method1008((byte) 10, 262144, arg0, true);
            var5 = var4 != null ? var4.field1416 : null;
        } else {
            var5 = this.field1900;
            this.field1900 = null;
        }
        if (var5 != null) {
            class452.method2728(var5, this.field1891, super.field6335, super.field6334, (boolean[]) null);
        }
        if (arg1 != -12694) {
            this.method39(62);
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Z", line = 337)
    public final boolean method32(byte arg0) {
        if (arg0 <= 104) {
            return false;
        } else {
            ++field1889;
            return this.field1894;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;ILiv;)I", line = 350)
    public static final int method1006(String arg0, int arg1, class65 arg2) {
        ++field1908;
        int var3 = arg2.field827;
        byte[] var4 = class279.method1791(arg0, arg1 ^ 17952);
        arg2.method630((byte) -8, var4.length);
        arg2.field827 += class425.field6285.method2622(var4, arg2.field827, (byte) 40, arg1, arg2.field783, var4.length);
        return -var3 + arg2.field827;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLya;)V", line = 370)
    public final void method26(boolean arg0, class38 arg1) {
        ++field1901;
        Object var3 = null;
        class263 var5;
        if (this.field1900 == null && this.field1895) {
            class101 var4 = this.method1008((byte) 10, 262144, arg1, true);
            var5 = var4 == null ? null : var4.field1416;
        } else {
            var5 = this.field1900;
            this.field1900 = null;
        }
        if (var5 != null) {
            class465.method2785(var5, this.field1891, super.field6335, super.field6334, (boolean[]) null);
        }
        if (!arg0) {
            method1007(-128);
        }
    }

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V", line = 399)
    public static void method1007(int arg0) {
        if (arg0 < -73) {
            field1907 = null;
            field1899 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BILya;Z)Lmg;", line = 413)
    private final class101 method1008(byte arg0, int arg1, class38 arg2, boolean arg3) {
        ++field1878;
        if (arg0 != 10) {
            return null;
        } else {
            class222 var5 = class384.field5645.method786(this.field1904 & 65535, 0);
            class142 var6;
            class142 var7;
            if (!this.field1882) {
                if (~this.field1891 <= -4) {
                    var6 = null;
                } else {
                    var6 = class283.field4115[this.field1891 + 1];
                }
                var7 = class283.field4115[this.field1891];
            } else {
                var6 = class283.field4115[0];
                var7 = class52.field578[this.field1891];
            }
            return var5.method1514(arg2, super.field6335, arg0 + -7, arg1, super.field6327, arg3, ~this.field1898 != -12 ? this.field1880 : this.field1880 + 4, var6, super.field6334, ~this.field1898 != -12 ? this.field1898 : 10, var7);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)I", line = 443)
    public final int method28(boolean arg0) {
        if (!arg0) {
            this.method26(true, (class38) null);
        }
        ++field1877;
        return 65535 & this.field1904;
    }
}
