import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class159 extends class73 implements class438 {

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "B")
    private byte field2126;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "S")
    private short field2132;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "Z")
    private boolean field2117;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "B")
    private byte field2113;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "B")
    private byte field2129;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "Z")
    private boolean field2127;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "Z")
    private boolean field2135;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Lr;")
    private class520 field2108;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Lk;")
    private class88 field2119;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "[Lvq;")
    public static class433[] field2115 = new class433[14];

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "Lfo;")
    public static class22 field2123 = new class22(13, 6);

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "B")
    public static byte field2122;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "Led;")
    private class115 field2136;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILqa;IB)Z", line = 4)
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        ++field2124;
        if (arg3 != 77) {
            this.field2135 = false;
        }
        class520 var5 = this.method928(120, arg1, 131072);
        if (var5 != null) {
            class105 var6 = arg1.method1038();
            var6.method613(super.field856, super.field851, super.field850);
            return var5.method1963(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILqa;)Lr;", line = 29)
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        ++field2130;
        if (arg0 != -127) {
            this.field2127 = true;
        }
        return this.method928(arg0 ^ -50, arg2, arg1);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lqa;Lih;IIIIZIIIII)V", line = 42)
    public class159(class167 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class544.method3198(arg10, arg11, 256));
        this.field2126 = (byte) arg2;
        this.field2132 = (short) arg1.field2010;
        super.field856 = arg3;
        this.field2117 = arg1.field2028 != 0 && !arg6;
        this.field2113 = (byte) arg10;
        this.field2129 = (byte) arg11;
        this.field2127 = arg6;
        super.field850 = arg5;
        this.field2135 = arg0.method1007() && arg1.field2078 && !this.field2127 && ~class94.field1158.method131(false, class239.field3499) != -1;
        class342 var13 = this.method930(arg0, 2048, true, this.field2135);
        if (var13 != null) {
            this.field2108 = var13.field4999;
            this.field2119 = var13.field5001;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILqa;I)Lr;", line = 70)
    private final class520 method928(int arg0, class167 arg1, int arg2) {
        ++field2112;
        if (this.field2108 != null && ~arg1.method1026(this.field2108.method1950(), arg2) == -1) {
            return this.field2108;
        } else if (arg0 < 67) {
            return null;
        } else {
            class342 var4 = this.method930(arg1, arg2, true, false);
            return var4 != null ? var4.field4999 : null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLqa;)Led;", line = 92)
    public final class115 method157(byte arg0, class167 arg1) {
        ++field2137;
        if (this.field2136 == null) {
            this.field2136 = class411.method2443(-27621, super.field851, super.field856, super.field850, this.method928(98, arg1, 0));
        }
        int var3 = 96 % ((14 - arg0) / 48);
        return this.field2136;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)I", line = 108)
    public final int method171(boolean arg0) {
        ++field2125;
        if (!arg0) {
            this.method169(-58, (class167) null);
        }
        return this.field2113;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)I", line = 119)
    public final int method251(int arg0) {
        ++field2118;
        if (arg0 != 5530) {
            this.field2132 = 34;
        }
        return this.field2108 == null ? 0 : this.field2108.method1954();
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)I", line = 132)
    public final int method173(int arg0) {
        ++field2128;
        if (arg0 < 30) {
            this.method157((byte) -16, (class167) null);
        }
        return 65535 & this.field2132;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 144)
    public final void method154(byte arg0) {
        if (arg0 != -74) {
            method929(-43, 104);
        }
        ++field2109;
        if (this.field2108 != null) {
            this.field2108.method1961();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lqa;B)V", line = 158)
    public final void method158(class167 arg0, byte arg1) {
        ++field2116;
        Object var3 = null;
        class88 var5;
        if (this.field2119 == null && this.field2135) {
            class342 var4 = this.method930(arg0, 262144, true, true);
            var5 = var4 != null ? var4.field5001 : null;
        } else {
            var5 = this.field2119;
            this.field2119 = null;
        }
        if (var5 != null) {
            class253.method1607(var5, this.field2126, super.field856, super.field850, (boolean[]) null);
        }
        if (arg1 >= -76) {
            this.method171(false);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z", line = 187)
    public static final boolean method929(int arg0, int arg1) {
        ++field2114;
        if (class43.field521[arg1]) {
            return true;
        } else if (!class145.field1879.method3474(arg0 + -76, arg1)) {
            return false;
        } else {
            int var2 = class145.field1879.method3462(arg1, -107);
            if (~var2 == -1) {
                class43.field521[arg1] = true;
                return true;
            } else {
                if (class251.field3650[arg1] == null) {
                    class251.field3650[arg1] = new class311[var2];
                }
                for (int var3 = arg0; ~var3 > ~var2; ++var3) {
                    if (class251.field3650[arg1][var3] == null) {
                        byte[] var4 = class145.field1879.method3486((byte) -87, var3, arg1);
                        if (var4 != null) {
                            class311 var5 = class251.field3650[arg1][var3] = new class311();
                            var5.field4667 = (arg1 << 16) + var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method1917(128, new class428(var4));
                        }
                    }
                }
                class43.field521[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)I", line = 244)
    public final int method170(int arg0) {
        ++field2111;
        return arg0 != -5527 ? -3 : this.field2129;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lqa;IZZ)Lrp;", line = 258)
    private final class342 method930(class167 arg0, int arg1, boolean arg2, boolean arg3) {
        ++field2121;
        class158 var5 = class312.field4690.method2004(false, this.field2132 & 65535);
        if (!arg2) {
            this.field2136 = null;
        }
        class543 var6;
        class543 var7;
        if (!this.field2127) {
            var6 = class562.field8337[this.field2126];
            if (~this.field2126 > -4) {
                var7 = class562.field8337[this.field2126 + 1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class287.field4219[this.field2126];
            var7 = class562.field8337[0];
        }
        return var5.method918(super.field851, super.field856, var6, super.field850, 0, this.field2113, arg3, arg1, this.field2129, var7, arg0);
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V", line = 295)
    public static void method931(int arg0) {
        field2115 = null;
        field2123 = null;
        if (arg0 >= -119) {
            method929(49, 51);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILqa;)Llb;", line = 306)
    public final class239 method169(int arg0, class167 arg1) {
        ++field2110;
        if (this.field2108 == null) {
            return null;
        } else {
            class105 var3 = arg1.method1038();
            if (arg0 != -911932384) {
                this.method169(122, (class167) null);
            }
            var3.method613(super.field857 + super.field856, super.field851, super.field850 + super.field845);
            class239 var4 = null;
            if (this.field2117) {
                var4 = class210.method1365(false, 1);
            }
            this.field2108.method1965(var3, var4 != null ? var4.field3503[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)Z", line = 334)
    public final boolean method162(int arg0) {
        ++field2134;
        if (arg0 != -177) {
            this.method162(116);
        }
        return this.field2135;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lqa;Z)V", line = 346)
    public final void method166(class167 arg0, boolean arg1) {
        ++field2131;
        if (!arg1) {
            this.field2108 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lqa;B)V", line = 356)
    public final void method174(class167 arg0, byte arg1) {
        if (arg1 != 2) {
            this.field2117 = false;
        }
        ++field2133;
        Object var3 = null;
        class88 var5;
        if (this.field2119 == null && this.field2135) {
            class342 var4 = this.method930(arg0, 262144, true, true);
            var5 = var4 == null ? null : var4.field5001;
        } else {
            var5 = this.field2119;
            this.field2119 = null;
        }
        if (var5 != null) {
            class639.method3698(var5, this.field2126, super.field856, super.field850, (boolean[]) null);
        }
    }
}
