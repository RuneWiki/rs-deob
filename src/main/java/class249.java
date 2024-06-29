import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class249 extends class135 {

    @OriginalMember(owner = "client!uj", name = "wc", descriptor = "I")
    public int field3815 = -1;

    @OriginalMember(owner = "client!uj", name = "xc", descriptor = "I")
    public int field3816 = -1;

    @OriginalMember(owner = "client!uj", name = "Ec", descriptor = "I")
    public static int field3823 = 0;

    @OriginalMember(owner = "client!uj", name = "Cc", descriptor = "I")
    public static int field3821 = 1338;

    @OriginalMember(owner = "client!uj", name = "uc", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!uj", name = "vc", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!uj", name = "yc", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!uj", name = "zc", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!uj", name = "Bc", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!uj", name = "Dc", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!uj", name = "Fc", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!uj", name = "Gc", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!uj", name = "Hc", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!uj", name = "Ic", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!uj", name = "Jc", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!uj", name = "Kc", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!uj", name = "Lc", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!uj", name = "Mc", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!uj", name = "Nc", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!uj", name = "Oc", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!uj", name = "Pc", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!uj", name = "Ac", descriptor = "Lat;")
    public class245 field3819;

    static {
        new class423((String) null, "geschickt werden.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V", line = 4)
    public final void method168(int arg0) {
        int var2 = 89 % ((arg0 - -53) / 62);
        ++field3824;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)Z", line = 14)
    public final boolean method164(int arg0) {
        if (arg0 != 0) {
            this.method899((byte) 65);
        }
        ++field3822;
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(B)I", line = 27)
    public final int method899(byte arg0) {
        ++field3814;
        if (this.field3819.field3703 != null) {
            class245 var2 = this.field3819.method1477(class273.field4144, -12819);
            if (var2 != null && var2.field3688 != -1) {
                return var2.field3688;
            }
        }
        if (arg0 <= 19) {
            return -52;
        } else {
            return this.field3819.field3688 != -1 ? this.field3819.field3688 : super.method899((byte) 127);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lqq;BII)Z", line = 50)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        ++field3834;
        if (this.field3819 != null && this.method1508(131072, arg0, 76)) {
            class496 var5 = arg0.method1976();
            int var6 = super.field2211.method1302(arg1 + 16427);
            var5.method194(var6);
            var5.method201(super.field3218, super.field3214, super.field3222);
            for (int var7 = 0; ~var7 > ~super.field2235.length; ++var7) {
                if (super.field2235[var7] != null && super.field2235[var7].method495(arg2, arg3, var5, this.field3819.field3707 == 1)) {
                    return true;
                }
            }
            if (arg1 != -44) {
                this.field3816 = 95;
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)Z", line = 84)
    private final boolean method1502(int arg0) {
        if (arg0 != 29489) {
            this.method330(11);
        }
        ++field3825;
        return this.field3819.field3694;
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)I", line = 95)
    public final int method333(int arg0) {
        ++field3826;
        return arg0 != 0 ? -96 : super.field2156;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIIIZ)V", line = 106)
    public final void method1503(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3830;
        super.field3217 = (byte) arg0;
        if (super.field2174 != -1 && ~class429.field6302.method106(-86, super.field2174).field1525 == -2) {
            super.field2174 = -1;
        }
        if (super.field2172 != -1) {
            class29 var7 = class201.field3192.method1250(super.field2172, 108);
            if (var7.field382 && ~var7.field373 != 0 && ~class429.field6302.method106(arg1 + 6, var7.field373).field1525 == -2) {
                super.field2172 = -1;
            }
        }
        if (arg1 != -98) {
            this.field3815 = -87;
        }
        if (~super.field2170 != 0) {
            class29 var8 = class201.field3192.method1250(super.field2170, arg1 ^ -4);
            if (var8.field382 && ~var8.field373 != 0 && ~class429.field6302.method106(arg1 + 15, var8.field373).field1525 == -2) {
                super.field2170 = -1;
            }
        }
        if (!arg5) {
            int var9 = -super.field2232[0] + arg4;
            int var10 = -super.field2239[0] + arg2;
            if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && ~var10 >= -9) {
                if (super.field2231 < 9) {
                    ++super.field2231;
                }
                for (int var11 = super.field2231; ~var11 < -1; --var11) {
                    super.field2232[var11] = super.field2232[var11 + -1];
                    super.field2239[var11] = super.field2239[var11 + -1];
                    super.field2234[var11] = super.field2234[var11 + -1];
                }
                super.field2232[0] = arg4;
                super.field2234[0] = 1;
                super.field2239[0] = arg2;
                return;
            }
        }
        super.field2232[0] = arg4;
        super.field2230 = 0;
        super.field2231 = 0;
        super.field2233 = 0;
        super.field2239[0] = arg2;
        super.field3218 = (super.field2232[0] << 7) + (arg3 << 6);
        super.field3222 = (super.field2239[0] << 7) + (arg3 << 6);
        if (super.field2238 != null) {
            super.field2238.method2887();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[[[Loh;)V", line = 188)
    public static final void method1504(int arg0, class268[][][] arg1) {
        ++field3827;
        for (int var2 = arg0; ~var2 > ~arg1.length; ++var2) {
            class268[][] var3 = arg1[var2];
            for (int var4 = 0; var3.length > var4; ++var4) {
                for (int var5 = 0; var5 < var3[var4].length; ++var5) {
                    class268 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4042 instanceof class185) {
                            ((class185) var6.field4042).method163(8793);
                        }
                        if (var6.field4052 instanceof class185) {
                            ((class185) var6.field4052).method163(arg0 ^ 8793);
                        }
                        if (var6.field4051 instanceof class185) {
                            ((class185) var6.field4051).method163(8793);
                        }
                        if (var6.field4059 instanceof class185) {
                            ((class185) var6.field4059).method163(arg0 + 8793);
                        }
                        if (var6.field4063 instanceof class185) {
                            ((class185) var6.field4063).method163(8793);
                        }
                        for (class297 var7 = var6.field4045; var7 != null; var7 = var7.field4500) {
                            class205 var8 = var7.field4505;
                            if (var8 instanceof class185) {
                                ((class185) var8).method163(8793);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)I", line = 258)
    public final int method330(int arg0) {
        ++field3828;
        if (arg0 <= 38) {
            this.method168(-50);
        }
        if (this.field3819.field3703 != null) {
            class245 var2 = this.field3819.method1477(class273.field4144, -12819);
            if (var2 != null && var2.field3677 != -1) {
                return var2.field3677;
            }
        }
        return this.field3819.field3677;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(ZLqq;)V", line = 281)
    public final void method172(boolean arg0, class318 arg1) {
        ++field3831;
        if (this.field3819 != null) {
            if (super.field2237 || this.method1508(0, arg1, 123)) {
                if (arg0) {
                    this.method1505((byte) -34);
                }
                this.method894(arg1, super.field2235, super.field2237, 0);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)I", line = 306)
    public final int method334(int arg0) {
        ++field3832;
        if (this.field3819.field3703 != null) {
            class245 var2 = this.field3819.method1477(class273.field4144, -12819);
            if (var2 != null && ~var2.field3740 != 0) {
                return var2.field3740;
            }
        }
        if (arg0 >= -127) {
            this.field3819 = null;
        }
        return this.field3819.field3740;
    }

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "(B)Z", line = 333)
    public final boolean method1505(byte arg0) {
        ++field3818;
        if (this.field3819 == null) {
            return false;
        } else {
            return arg0 == 97;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)V", line = 348)
    public final void method1506(int arg0, int arg1, int arg2) {
        ++field3833;
        int var4 = super.field2232[arg2];
        int var5 = super.field2239[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (~arg0 == -6) {
            --var5;
            --var4;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (super.field2174 != -1 && class429.field6302.method106(-83, super.field2174).field1525 == 1) {
            super.field2174 = -1;
        }
        if (arg0 == 7) {
            ++var5;
            --var4;
        }
        if (super.field2172 != -1) {
            class29 var6 = class201.field3192.method1250(super.field2172, 94);
            if (var6.field382 && var6.field373 != -1 && class429.field6302.method106(arg2 + -85, var6.field373).field1525 == 1) {
                super.field2172 = -1;
            }
        }
        if (super.field2170 != -1) {
            class29 var7 = class201.field3192.method1250(super.field2170, 121);
            if (var7.field382 && var7.field373 != -1 && class429.field6302.method106(-94, var7.field373).field1525 == 1) {
                super.field2170 = -1;
            }
        }
        if (super.field2231 < 9) {
            ++super.field2231;
        }
        for (int var8 = super.field2231; var8 > 0; --var8) {
            super.field2232[var8] = super.field2232[var8 - 1];
            super.field2239[var8] = super.field2239[var8 + -1];
            super.field2234[var8] = super.field2234[var8 + -1];
        }
        super.field2232[0] = var4;
        super.field2239[0] = var5;
        super.field2234[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLqq;)Lkm;", line = 443)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field3820;
        if (this.field3819 != null && this.method1508(2048, arg1, 75)) {
            class496 var3 = arg1.method1976();
            int var4 = super.field2211.method1302(16383);
            var3.method194(var4);
            var3.method201(super.field3218, super.field3214, super.field3222);
            class14 var5 = this.method892((byte) -110);
            class245 var6 = this.field3819.field3703 == null ? this.field3819 : this.field3819.method1477(class273.field4144, -12819);
            if (class463.field7116.field2953 && var6.field3675 && var5.field171) {
                class87 var7 = ~super.field2174 != 0 && super.field2188 == 0 ? class429.field6302.method106(-113, super.field2174) : null;
                class87 var8 = ~super.field2201 == 0 || super.field2196 && var7 != null ? null : class429.field6302.method106(-126, super.field2201);
                class198 var9 = class50.method354(this.field3819.field3719 & 65535, super.field2185, this.field3819.field3746 & 255, var8 != null ? var8 : var7, this.field3819.field3715 & 65535, this.field3819.field3707, var8 != null ? super.field2194 : super.field2141, var4, super.field2143, super.field2215, this.field3819.field3726 & 255, super.field2192, super.field2235[0], (byte) -103, arg1);
                if (var9 != null) {
                    float var10 = arg1.method1984();
                    float var11 = arg1.method1968();
                    arg1.method1895(false);
                    arg1.method1993(var10, var11 + -150.0F);
                    var9.method461(var3, (class346) null, 0);
                    arg1.method1993(var10, var11);
                    arg1.method1895(true);
                }
            }
            class227 var12 = null;
            if (this.method1502(29489)) {
                var12 = class145.method951(super.field2235.length, 0);
            }
            if (arg0 >= -11) {
                this.method330(105);
            }
            if (super.field2238 == null) {
                arg1.method1978(super.field2235, var3, var12 == null ? null : var12.field3476, 0);
            } else {
                class372 var13 = super.field2238.method2882();
                arg1.method1913(super.field2235, var13, var3, var12 == null ? null : var12.field3476, 0);
            }
            this.method894(arg1, super.field2235, false, 0);
            if (super.field2235[2] != null) {
                if (var4 != 0) {
                    super.field2235[2].method476(var4);
                }
                super.field2235[2].method508(-super.field2236.field2308 + super.field3218, -super.field2236.field2296 + super.field3214, -super.field2236.field2304 + super.field3222);
            }
            super.field2154 = class338.field5055;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 520)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        ++field3817;
        if (arg4) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLat;)V", line = 536)
    public final void method1507(byte arg0, class245 arg1) {
        ++field3829;
        if (arg0 != -86) {
            this.method164(125);
        }
        this.field3819 = arg1;
        if (super.field2238 != null) {
            super.field2238.method2887();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILqq;I)Z", line = 556)
    private final boolean method1508(int arg0, class318 arg1, int arg2) {
        ++field3813;
        int var4 = arg0;
        if (arg2 <= 61) {
            this.method164(15);
        }
        class14 var5 = this.method892((byte) -110);
        class87 var6 = super.field2174 != -1 && ~super.field2188 == -1 ? class429.field6302.method106(-118, super.field2174) : null;
        class87 var7 = super.field2201 == -1 || super.field2196 && var6 != null ? null : class429.field6302.method106(-104, super.field2201);
        int var8 = var5.field176;
        int var9 = var5.field179;
        if (~var8 != -1 || ~var9 != -1 || var5.field156 != 0 || var5.field198 != 0) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field2214 != -1 && class369.field5424 >= super.field2198 && ~class369.field5424 > ~super.field2213;
        if (var10) {
            arg0 |= 524288;
        }
        class198 var11 = super.field2235[0] = this.field3819.method1471(arg1, arg0, var7, super.field2150, super.field2186, class429.field6302, super.field2205, super.field2206, super.field2141, var6, super.field2199, class511.field7740, (byte) 100, class273.field4144, super.field2194);
        if (var11 == null) {
            return false;
        } else {
            super.field2156 = var11.method492();
            this.method900(var11, 0);
            int var12 = super.field2211.method1302(16383);
            if (~var8 == -1 && var9 == 0) {
                this.method898(this.method337(0) << 7, 0, 0, var12, this.method337(0) << 7, (byte) -67);
            } else {
                this.method898(var8, var5.field191, var5.field200, var12, var9, (byte) -67);
                if (~super.field2215 != -1) {
                    super.field2235[0].method470(super.field2215);
                }
                if (~super.field2143 != -1) {
                    super.field2235[0].method467(super.field2143);
                }
                if (~super.field2185 != -1) {
                    super.field2235[0].method508(0, super.field2185, 0);
                }
            }
            if (var10) {
                var11.method486(super.field2138, super.field2220, super.field2219, 255 & super.field2214);
            }
            if (~super.field2172 != 0 && ~super.field2180 != 0) {
                class29 var13 = class201.field3192.method1250(super.field2172, -95);
                boolean var14 = var13.field365 == 3 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field2178 != -1) {
                        var15 = var4 | 5;
                    }
                    if (~super.field2225 != -1) {
                        var15 |= 2;
                    }
                }
                class198 var16 = super.field2235[1] = var13.method152(arg1, class429.field6302, super.field2207, super.field2187, 3, var15, super.field2180);
                if (var16 != null) {
                    if (~super.field2225 != -1) {
                        var16.method508(0, -super.field2225 << 0, 0);
                    }
                    if (super.field2178 != 0) {
                        var16.method476(super.field2178 * 2048);
                    }
                    if (var14) {
                        if (super.field2215 != 0) {
                            var16.method470(super.field2215);
                        }
                        if (super.field2143 != 0) {
                            var16.method467(super.field2143);
                        }
                        if (~super.field2185 != -1) {
                            var16.method508(0, super.field2185, 0);
                        }
                    }
                }
            } else {
                super.field2235[1] = null;
            }
            if (~super.field2170 != 0 && ~super.field2137 != 0) {
                class29 var17 = class201.field3192.method1250(super.field2170, 95);
                boolean var18 = var17.field365 == 3 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (super.field2163 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field2169 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class198 var20 = super.field2235[3] = var17.method145(class429.field6302, super.field2137, 127, super.field2176, super.field2165, arg1, var19);
                if (var20 != null) {
                    if (super.field2169 != 0) {
                        var20.method508(0, -super.field2169 << 0, 0);
                    }
                    if (super.field2163 != 0) {
                        var20.method476(super.field2163 * 2048);
                    }
                    if (var18) {
                        if (~super.field2215 != -1) {
                            var20.method470(super.field2215);
                        }
                        if (super.field2143 != 0) {
                            var20.method467(super.field2143);
                        }
                        if (~super.field2185 != -1) {
                            var20.method508(0, super.field2185, 0);
                        }
                    }
                }
            } else {
                super.field2235[3] = null;
            }
            super.field2235[2] = null;
            if (super.field2236 != null) {
                if (super.field2236.field2302 > class369.field5424) {
                    if (~super.field2236.field2301 >= ~class369.field5424) {
                        class198 var21 = super.field2236.method936(false, arg1, var4 | 7);
                        if (var21 != null) {
                            var21.method508(-super.field3218 + super.field2236.field2308, -super.field3214 + super.field2236.field2296, super.field2236.field2304 - super.field3222);
                            if (var12 != 0) {
                                var21.method476(var12);
                            }
                            super.field2235[2] = var21;
                        }
                    }
                } else {
                    super.field2236 = null;
                }
            }
            return true;
        }
    }
}
