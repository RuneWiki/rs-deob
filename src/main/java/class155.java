import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class155 extends class145 {

    @OriginalMember(owner = "client!wn", name = "Hc", descriptor = "I")
    public int field2153 = -1;

    @OriginalMember(owner = "client!wn", name = "Dc", descriptor = "I")
    public int field2149 = -1;

    @OriginalMember(owner = "client!wn", name = "sc", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!wn", name = "Ic", descriptor = "Lwl;")
    public static class452 field2154 = new class452(104, 0);

    @OriginalMember(owner = "client!wn", name = "Nc", descriptor = "I")
    public static int field2159 = 0;

    @OriginalMember(owner = "client!wn", name = "Oc", descriptor = "Ljg;")
    public static class241 field2160 = new class241(64);

    @OriginalMember(owner = "client!wn", name = "Pc", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!wn", name = "pc", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!wn", name = "qc", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!wn", name = "tc", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!wn", name = "uc", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!wn", name = "vc", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!wn", name = "wc", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!wn", name = "xc", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!wn", name = "yc", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!wn", name = "zc", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!wn", name = "Ac", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!wn", name = "Bc", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!wn", name = "Cc", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!wn", name = "Ec", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!wn", name = "Fc", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!wn", name = "Gc", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!wn", name = "Jc", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!wn", name = "Kc", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!wn", name = "Lc", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!wn", name = "Mc", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!wn", name = "rc", descriptor = "Lnk;")
    public class271 field2137;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        ++field2148;
        if (this.field2137 != null && this.method959(65536, arg2, arg3 + -108)) {
            class361 var5 = arg2.method434();
            int var6 = super.field1971.method2178(-14579);
            if (arg3 != 2) {
                return false;
            } else {
                var5.method610(var6);
                var5.method604(super.field1900, super.field1888, super.field1892);
                for (int var7 = 0; var7 < super.field2017.length; ++var7) {
                    if (super.field2017[var7] != null && super.field2017[var7].method1297(arg0, arg1, var5, ~this.field2137.field4110 == -2)) {
                        return true;
                    }
                }
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILiq;Liq;)V")
    public static final void method955(int arg0, class134 arg1, class134 arg2) {
        if (arg0 == -1) {
            ++field2141;
            class26.field329 = arg1;
            class380.field5549 = arg2;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lnk;I)V")
    public final void method956(class271 arg0, int arg1) {
        if (arg1 == 0) {
            ++field2143;
            this.field2137 = arg0;
            if (super.field2011 != null) {
                super.field2011.method2058();
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(Z)I")
    public final int method120(boolean arg0) {
        ++field2156;
        if (arg0) {
            this.field2149 = -37;
        }
        return super.field1949;
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field2144;
        if (this.field2137 != null && this.method959(1024, arg0, -100)) {
            class361 var3 = arg0.method434();
            int var4 = super.field1971.method2178(arg1 ^ -14582);
            var3.method610(var4);
            var3.method604(super.field1900, super.field1888, super.field1892);
            class433 var5 = this.method902(26647);
            class271 var6 = this.field2137.field4100 != null ? this.field2137.method1684(6) : this.field2137;
            if (class52.field684 && var6.field4139 && var5.field6374) {
                class379 var7 = super.field1955 != -1 && ~super.field1935 == -1 ? class98.method629(super.field1955, (byte) -115) : null;
                class379 var8 = ~super.field1936 == 0 || super.field1933 && var7 != null ? null : class98.method629(super.field1936, (byte) -115);
                class292 var9 = class284.method1743(var4, super.field1931, var8 == null ? var7 : var8, this.field2137.field4110, super.field1976, this.field2137.field4155 & 255, 65535 & this.field2137.field4122, var8 != null ? super.field1989 : super.field1928, arg0, this.field2137.field4148 & 255, super.field1967, super.field2017[0], super.field1939, this.field2137.field4118 & 65535, -1);
                if (var9 != null) {
                    float var10 = arg0.method413();
                    float var11 = arg0.method366();
                    arg0.method443(false);
                    arg0.method423(var10, var11 + -150.0F);
                    var9.method1282(var3, (class158) null, 0);
                    arg0.method423(var10, var11);
                    arg0.method443(true);
                }
            }
            class70 var12 = null;
            if (this.method961((byte) -108)) {
                var12 = class383.method2309(arg1 + 68, super.field2017.length);
            }
            if (arg1 != 7) {
                this.method963((byte) -27);
            }
            if (super.field2011 == null) {
                arg0.method431(super.field2017, var3, var12 != null ? var12.field899 : null, 0);
            } else {
                class439 var13 = super.field2011.method2050();
                arg0.method343(super.field2017, var13, var3, var12 == null ? null : var12.field899, 0);
            }
            this.method905(super.field2017, 1018, arg0, false);
            if (super.field2017[2] != null) {
                if (var4 != 0) {
                    super.field2017[2].method1286(var4);
                }
                super.field2017[2].method1266(-super.field2016.field464 + super.field1900, -super.field2016.field460 + super.field1888, super.field1892 - super.field2016.field473);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field2158;
            return false;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BZIIII)V")
    public final void method957(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2135;
        super.field1902 = (byte) arg5;
        if (~super.field1955 != 0 && class98.method629(super.field1955, (byte) -115).field5543 == 1) {
            super.field1955 = -1;
        }
        if (super.field1938 != -1) {
            class195 var7 = class251.method1530(super.field1938, 79);
            if (var7.field2949 && var7.field2950 != -1 && ~class98.method629(var7.field2950, (byte) -115).field5543 == -2) {
                super.field1938 = -1;
            }
        }
        if (!arg1) {
            int var8 = -super.field2019[0] + arg2;
            int var9 = -super.field2018[0] + arg3;
            if (var8 >= -8 && ~var8 >= -9 && var9 >= -8 && ~var9 >= -9) {
                if (super.field2013 < 9) {
                    ++super.field2013;
                }
                for (int var10 = super.field2013; var10 > 0; --var10) {
                    super.field2019[var10] = super.field2019[var10 + -1];
                    super.field2018[var10] = super.field2018[var10 + -1];
                    super.field2020[var10] = super.field2020[var10 + -1];
                }
                super.field2019[0] = arg2;
                super.field2018[0] = arg3;
                super.field2020[0] = 1;
                return;
            }
        }
        super.field2014 = 0;
        int var11 = 6 % ((arg0 - -60) / 60);
        super.field2019[0] = arg2;
        super.field2015 = 0;
        super.field2013 = 0;
        super.field2018[0] = arg3;
        super.field1900 = super.field2019[0] * 128 + arg4 * 64;
        super.field1892 = super.field2018[0] * 128 + arg4 * 64;
        if (super.field2011 != null) {
            super.field2011.method2058();
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/awt/Component;B)Lve;")
    public static final class162 method958(Component arg0, byte arg1) {
        ++field2151;
        if (arg1 <= 37) {
            method965();
        }
        return new class88(arg0);
    }

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "(B)I")
    public final int method908(byte arg0) {
        if (arg0 <= 84) {
            field2161 = 82;
        }
        ++field2147;
        if (this.field2137.field4100 != null) {
            class271 var2 = this.field2137.method1684(6);
            if (var2 != null && ~var2.field4106 != 0) {
                return var2.field4106;
            }
        }
        return ~this.field2137.field4106 != 0 ? this.field2137.field4106 : super.method908((byte) 94);
    }

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "(B)I")
    public final int method904(byte arg0) {
        if (arg0 < 16) {
            return -65;
        } else {
            ++field2140;
            if (this.field2137.field4100 != null) {
                class271 var2 = this.field2137.method1684(6);
                if (var2 != null && var2.field4144 != -1) {
                    return var2.field4144;
                }
            }
            return this.field2137.field4144;
        }
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)I")
    public final int method900(byte arg0) {
        ++field2136;
        if (arg0 < 11) {
            return 58;
        } else {
            if (this.field2137.field4100 != null) {
                class271 var2 = this.field2137.method1684(6);
                if (var2 != null && ~var2.field4112 != 0) {
                    return var2.field4112;
                }
            }
            return this.field2137.field4112;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILdr;I)Z")
    private final boolean method959(int arg0, class261 arg1, int arg2) {
        ++field2139;
        int var4 = arg0;
        class433 var5 = this.method902(26647);
        if (arg2 > -87) {
            return true;
        } else {
            class379 var6 = ~super.field1955 != 0 && ~super.field1935 == -1 ? class98.method629(super.field1955, (byte) -115) : null;
            class379 var7 = ~super.field1936 == 0 || super.field1933 && var6 != null ? null : class98.method629(super.field1936, (byte) -115);
            int var8 = var5.field6392;
            int var9 = var5.field6387;
            if (var8 != 0 || ~var9 != -1 || ~var5.field6393 != -1 || var5.field6376 != 0) {
                arg0 |= 7;
            }
            class292 var10 = super.field2017[0] = this.field2137.method1687(super.field1990, super.field1934, 117, var6, super.field1962, arg1, super.field1989, arg0, var7, super.field1947, super.field1941, super.field1928);
            if (var10 == null) {
                return false;
            } else {
                super.field1949 = var10.method1263();
                this.method901(var10, -1);
                int var11 = super.field1971.method2178(-14579);
                super.field1967 = 0;
                super.field1976 = 0;
                super.field1931 = 0;
                if (~var8 == -1 && ~var9 == -1) {
                    this.method894(26736, this.method911(0) << 7, this.method911(0) << 7, var11);
                } else {
                    this.method894(26736, var8, var9, var11);
                    if (~super.field1976 != -1) {
                        super.field2017[0].method1254(super.field1976);
                    }
                    if (~super.field1967 != -1) {
                        super.field2017[0].method1291(super.field1967);
                    }
                    if (super.field1931 != 0) {
                        super.field2017[0].method1266(0, super.field1931, 0);
                    }
                }
                super.field2017[1] = null;
                if (~super.field1938 != 0 && ~super.field1932 != 0) {
                    class195 var12 = class251.method1530(super.field1938, 71);
                    class292 var13 = var12.method1164(super.field1932, var4 | (var12.field2937 ? 7 : 2), super.field1992, arg1, super.field2005, false);
                    if (var13 != null) {
                        var13.method1266(0, -super.field1993, 0);
                        if (var12.field2937 && (~var8 != -1 || var9 != 0)) {
                            if (super.field1976 != 0) {
                                var13.method1254(super.field1976);
                            }
                            if (~super.field1967 != -1) {
                                var13.method1291(super.field1967);
                            }
                            if (super.field1931 != 0) {
                                var13.method1266(0, super.field1931, 0);
                            }
                        }
                        super.field2017[1] = var13;
                    }
                }
                super.field2017[2] = null;
                if (super.field2016 != null) {
                    if (super.field2016.field471 <= class26.field332) {
                        super.field2016 = null;
                    } else if (super.field2016.field466 <= class26.field332) {
                        class292 var14 = super.field2016.method220(arg1, 7 | var4, 14383);
                        if (var14 != null) {
                            var14.method1266(super.field2016.field464 - super.field1900, super.field2016.field460 - super.field1888, super.field2016.field473 - super.field1892);
                            if (~var11 != -1) {
                                var14.method1286(var11);
                            }
                            super.field2017[2] = var14;
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBI)V")
    public final void method960(int arg0, byte arg1, int arg2) {
        ++field2152;
        int var4 = super.field2019[0];
        int var5 = super.field2018[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (~arg2 == -2) {
            ++var5;
            ++var4;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (arg2 == 3) {
            --var5;
            ++var4;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (~arg2 == -6) {
            --var5;
            --var4;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (super.field1955 != -1 && ~class98.method629(super.field1955, (byte) -115).field5543 == -2) {
            super.field1955 = -1;
        }
        if (~arg2 == -8) {
            ++var5;
            --var4;
        }
        if (super.field1938 != -1) {
            class195 var6 = class251.method1530(super.field1938, 80);
            if (var6.field2949 && ~var6.field2950 != 0 && ~class98.method629(var6.field2950, (byte) -115).field5543 == -2) {
                super.field1938 = -1;
            }
        }
        if (arg1 == 59) {
            if (super.field2013 < 9) {
                ++super.field2013;
            }
            for (int var7 = super.field2013; var7 > 0; --var7) {
                super.field2019[var7] = super.field2019[var7 + -1];
                super.field2018[var7] = super.field2018[var7 + -1];
                super.field2020[var7] = super.field2020[var7 + -1];
            }
            super.field2019[0] = var4;
            super.field2018[0] = var5;
            super.field2020[0] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        ++field2150;
        if (this.field2137 != null) {
            if (super.field2021 || this.method959(0, arg0, -98)) {
                if (arg1 >= 114) {
                    this.method905(super.field2017, 1018, arg0, super.field2021);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        if (arg1 != 0) {
            this.method116((byte) -32);
        }
        ++field2142;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        if (arg0 > -45) {
            this.method900((byte) 37);
        }
        ++field2157;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "(B)Z")
    private final boolean method961(byte arg0) {
        int var2 = 77 % ((arg0 - -30) / 49);
        ++field2155;
        return this.field2137.field4132;
    }

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V")
    public static void method962(int arg0) {
        field2160 = null;
        if (arg0 != -1) {
            field2160 = null;
        }
        field2154 = null;
    }

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "(B)Z")
    public final boolean method963(byte arg0) {
        if (arg0 < 20) {
            this.method956((class271) null, 0);
        }
        ++field2145;
        return this.field2137 != null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)Lfi;")
    public static final class34 method964(int arg0, boolean arg1) {
        ++field2146;
        class34 var2 = (class34) class398.field5938.method1491((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class14.field177.method823(26, -20334, arg0);
            class34 var4 = new class34();
            if (var3 != null) {
                var4.method199((byte) -22, new class385(var3));
            }
            if (arg1) {
                field2138 = -84;
            }
            class398.field5938.method1488(128, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "()V")
    public static final void method965() {
        class100.method638(1, class56.field750);
    }
}
