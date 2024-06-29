import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class163 extends class162 {

    @OriginalMember(owner = "client!qc", name = "Pc", descriptor = "Luc;")
    public static class51 field2221 = new class51(64);

    @OriginalMember(owner = "client!qc", name = "Rc", descriptor = "I")
    public static int field2223 = 0;

    @OriginalMember(owner = "client!qc", name = "Sc", descriptor = "[I")
    public static int[] field2224 = new int[50];

    @OriginalMember(owner = "client!qc", name = "Vc", descriptor = "I")
    public static int field2227 = 20;

    @OriginalMember(owner = "client!qc", name = "Wc", descriptor = "I")
    public static int field2228 = 0;

    @OriginalMember(owner = "client!qc", name = "Bc", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!qc", name = "Cc", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!qc", name = "Dc", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!qc", name = "Ec", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!qc", name = "Fc", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!qc", name = "Gc", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!qc", name = "Hc", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!qc", name = "Ic", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!qc", name = "Jc", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!qc", name = "Kc", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!qc", name = "Lc", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!qc", name = "Mc", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!qc", name = "Nc", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!qc", name = "Oc", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!qc", name = "Tc", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!qc", name = "Uc", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!qc", name = "Xc", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!qc", name = "Ac", descriptor = "Llc;")
    public class189 field2206;

    @OriginalMember(owner = "client!qc", name = "Qc", descriptor = "Luh;")
    public static class414 field2222;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I", line = 4)
    public final int method1087(byte arg0) {
        ++field2217;
        if (arg0 != 73) {
            this.method1092(-26);
        }
        if (this.field2206.field2575 != null) {
            class189 var2 = this.field2206.method1253(-1);
            if (var2 != null && ~var2.field2594 != 0) {
                return var2.field2594;
            }
        }
        return this.field2206.field2594;
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)Z", line = 24)
    public final boolean method1100(int arg0) {
        if (arg0 != 8129) {
            field2224 = null;
        }
        ++field2226;
        return this.field2206 != null;
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V", line = 38)
    public final void method114(int arg0) {
        if (arg0 != 2) {
            field2224 = null;
        }
        ++field2225;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)V", line = 53)
    public static final void method1101(int arg0) {
        ++field2216;
        if (class290.field4380 != null) {
            class290.field4380.method2360((byte) -77);
            class290.field4380 = null;
        }
        class452.method2808(0);
        class322.method2118();
        for (int var1 = 0; var1 < 4; ++var1) {
            class420.field6108[var1].method1850(false);
        }
        class149.method1030(false, true);
        System.gc();
        class173.method1153(2, arg0 + 13422);
        class60.field919 = false;
        class400.field5855 = -1;
        class60.method533(true, -118);
        class62.field940 = 0;
        class236.field3292 = 0;
        class359.field5314 = 0;
        class48.field743 = false;
        class90.field1223 = arg0;
        for (int var2 = 0; ~var2 > ~class349.field5195.length; ++var2) {
            class349.field5195[var2] = null;
        }
        class402.field5869 = 0;
        class93.field1274 = 0;
        for (int var3 = 0; var3 < 2048; ++var3) {
            class176.field2382[var3] = null;
            class329.field4858[var3] = null;
        }
        for (int var4 = 0; ~var4 > -32769; ++var4) {
            class388.field5670[var4] = null;
        }
        class267.field3962.method2825(55);
        class24.method214((byte) 62);
        class416.field6024 = 0;
        class107.method809(arg0 ^ -95);
        class331.method2167((byte) 112);
        class145.method1004(-118);
        class296.method2009((byte) -14, true);
        try {
            class177.method1170(117, "loggedout", class63.field948.field5381);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "(I)Z", line = 124)
    private final boolean method1102(int arg0) {
        if (arg0 != 0) {
            field2223 = 31;
        }
        ++field2209;
        return this.field2206.field2630;
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)I", line = 136)
    public final int method1089(byte arg0) {
        ++field2218;
        if (this.field2206.field2575 != null) {
            class189 var2 = this.field2206.method1253(-1);
            if (var2 != null && ~var2.field2619 != 0) {
                return var2.field2619;
            }
        }
        if (arg0 != -120) {
            method1103(-105);
        }
        return this.field2206.field2619;
    }

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "(I)V", line = 158)
    public static void method1103(int arg0) {
        field2221 = null;
        if (arg0 > -86) {
            field2227 = 84;
        }
        field2222 = null;
        field2224 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Li;", line = 172)
    public static final class299 method1104(byte arg0, int arg1) {
        ++field2213;
        class299 var2 = (class299) class194.field2693.method378((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 != 73) {
            return null;
        } else {
            byte[] var3 = class251.field3689.method1235(35, false, arg1);
            class299 var4 = new class299();
            if (var3 != null) {
                var4.method2027(59, new class341(var3));
            }
            var4.method2030(arg0 ^ -80);
            class194.field2693.method367((long) arg1, var4, true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILtj;BIZLkm;I)V", line = 202)
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        int var8 = -49 / ((46 - arg2) / 45);
        ++field2215;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(ZI)Lef;", line = 214)
    public static final class290 method1105(boolean arg0, int arg1) {
        ++field2214;
        class51 var2 = class185.field2526;
        class290 var3;
        synchronized (class185.field2526) {
            var3 = (class290) class185.field2526.method378((byte) 28, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class93.field1275.method1235(32, false, arg1);
            class290 var5 = new class290();
            if (var4 != null) {
                var5.method1977(new class341(var4), (byte) 62);
            }
            var5.method1971((byte) -128);
            class51 var6 = class185.field2526;
            synchronized (class185.field2526) {
                class185.field2526.method367((long) arg1, var5, arg0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Llc;B)V", line = 240)
    public final void method1106(class189 arg0, byte arg1) {
        ++field2208;
        if (arg1 != -125) {
            this.method1107(10, (class298) null, 68);
        }
        this.field2206 = arg0;
        if (super.field2187 != null) {
            super.field2187.method2600();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ltj;I)Lri;", line = 255)
    public final class372 method118(class298 arg0, int arg1) {
        ++field2229;
        if (this.field2206 != null && this.method1107(1024, arg0, 0)) {
            class118 var3 = arg0.method519();
            int var4 = super.field2164.method698((byte) 93);
            var3.method273(var4);
            var3.method271(super.field5921, super.field5932, super.field5930);
            class290 var5 = this.method1084(-24211);
            class189 var6 = this.field2206.field2575 == null ? this.field2206 : this.field2206.method1253(arg1 ^ -18631);
            if (class354.field5256 && var6.field2580 && var5.field4377) {
                class233 var7 = ~super.field2148 != 0 && ~super.field2151 == -1 ? class73.method597(super.field2148, -1) : null;
                class233 var8 = ~super.field2143 == 0 || super.field2178 && var7 != null ? null : class73.method597(super.field2143, arg1 ^ -18631);
                class257 var9 = class233.method1519(this.field2206.field2592 & 65535, super.field2157, var8 == null ? var7 : var8, this.field2206.field2627 & 65535, 255 & this.field2206.field2623, var8 != null ? super.field2167 : super.field2144, this.field2206.field2590, super.field2186[0], super.field2126, arg0, this.field2206.field2631 & 255, 74, super.field2137, super.field2116, var4);
                if (var9 != null) {
                    float var10 = arg0.method458();
                    float var11 = arg0.method428();
                    arg0.method499(false);
                    arg0.method481(var10, var11 - 150.0F);
                    var9.method1661(var3, (class137) null, 0);
                    arg0.method481(var10, var11);
                    arg0.method499(true);
                }
            }
            class372 var12 = null;
            if (arg1 != 18630) {
                field2222 = null;
            }
            if (this.method1102(0)) {
                var12 = class384.method2492(super.field2186.length, (byte) 116);
            }
            if (super.field2187 != null) {
                class305 var13 = super.field2187.method2597();
                arg0.method464(super.field2186, var13, var3, var12 != null ? var12.field5481 : null, 0);
            } else {
                arg0.method480(super.field2186, var3, var12 == null ? null : var12.field5481, 0);
            }
            this.method1086(false, super.field2186, arg0, (byte) 105);
            if (super.field2186[2] != null) {
                if (~var4 != -1) {
                    super.field2186[2].method1673(var4);
                }
                super.field2186[2].method1659(super.field5921 - super.field2194, -super.field2205 + super.field5932, -super.field2199 + super.field5930);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I", line = 331)
    public final int method1092(int arg0) {
        ++field2220;
        if (arg0 != -1) {
            return 25;
        } else {
            if (this.field2206.field2575 != null) {
                class189 var2 = this.field2206.method1253(arg0);
                if (var2 != null && ~var2.field2640 != 0) {
                    return var2.field2640;
                }
            }
            return ~this.field2206.field2640 != 0 ? this.field2206.field2640 : super.method1092(arg0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)I", line = 353)
    public final int method345(int arg0) {
        ++field2210;
        if (arg0 < 14) {
            field2228 = -43;
        }
        return super.field2169;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILtj;I)Z", line = 364)
    private final boolean method1107(int arg0, class298 arg1, int arg2) {
        ++field2212;
        int var4 = arg0;
        class290 var5 = this.method1084(-24211);
        if (arg2 != 0) {
            this.method1089((byte) -95);
        }
        class233 var6 = super.field2148 != -1 && ~super.field2151 == -1 ? class73.method597(super.field2148, -1) : null;
        class233 var7 = super.field2143 == -1 || super.field2178 && var6 != null ? null : class73.method597(super.field2143, -1);
        int var8 = var5.field4393;
        int var9 = var5.field4361;
        if (~var8 != -1 || var9 != 0 || var5.field4358 != 0 || var5.field4348 != 0) {
            arg0 |= 7;
        }
        class257 var10 = super.field2186[0] = this.field2206.method1254(super.field2120, super.field2167, var6, super.field2163, super.field2162, -28592, arg0, super.field2132, super.field2161, super.field2144, var7, arg1);
        if (var10 == null) {
            return false;
        } else {
            super.field2169 = var10.method1688();
            this.method1099(var10, arg2 ^ 22432);
            int var11 = super.field2164.method698((byte) 90);
            super.field2137 = 0;
            super.field2116 = 0;
            super.field2126 = 0;
            if (~var8 == -1 && var9 == 0) {
                this.method1097(this.method1091((byte) 54) << 7, arg2 + 19387, var11, this.method1091((byte) -120) << 7);
            } else {
                this.method1097(var8, 19387, var11, var9);
                if (~super.field2137 != -1) {
                    super.field2186[0].method1687(super.field2137);
                }
                if (super.field2126 != 0) {
                    super.field2186[0].method1693(super.field2126);
                }
                if (super.field2116 != 0) {
                    super.field2186[0].method1659(0, super.field2116, 0);
                }
            }
            super.field2186[1] = null;
            if (~super.field2142 != 0 && super.field2113 != -1) {
                class235 var12 = class263.method1762(super.field2142, false);
                class257 var13 = var12.method1524(super.field2165, (var12.field3272 ? 7 : 2) | var4, 41, arg1, super.field2117, super.field2113);
                if (var13 != null) {
                    var13.method1659(0, -super.field2135, 0);
                    if (var12.field3272 && (var8 != 0 || ~var9 != -1)) {
                        if (super.field2137 != 0) {
                            var13.method1687(super.field2137);
                        }
                        if (super.field2126 != 0) {
                            var13.method1693(super.field2126);
                        }
                        if (super.field2116 != 0) {
                            var13.method1659(0, super.field2116, 0);
                        }
                    }
                    super.field2186[1] = var13;
                }
            }
            super.field2186[2] = null;
            if (super.field2204 != null) {
                if (super.field2195 <= class231.field3179) {
                    super.field2204 = null;
                }
                if (~class231.field3179 <= ~super.field2193 && ~super.field2195 < ~class231.field3179) {
                    class257 var14 = super.field2204.method117(arg1, 7 | var4, (byte) 100);
                    if (var14 != null) {
                        var14.method1659(super.field2194 - super.field5921, super.field2205 - super.field5932, -super.field5930 + super.field2199);
                        if (var11 != 0) {
                            var14.method1673(var11);
                        }
                        super.field2186[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLtj;)V", line = 480)
    public final void method126(byte arg0, class298 arg1) {
        ++field2211;
        if (this.field2206 != null) {
            if (arg0 == 50) {
                if (super.field2188 || this.method1107(0, arg1, arg0 ^ 50)) {
                    this.method1086(super.field2188, super.field2186, arg1, (byte) 93);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILtj;II)Z", line = 506)
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        ++field2219;
        if (this.field2206 != null && this.method1107(65536, arg1, 0)) {
            class118 var5 = arg1.method519();
            int var6 = super.field2164.method698((byte) -119);
            var5.method273(var6);
            var5.method274(super.field5921, super.field5932, super.field5930);
            for (int var7 = arg3; ~var7 > ~super.field2186.length; ++var7) {
                if (super.field2186[var7] != null) {
                    return super.field2186[var7].method1698(arg2, arg0, var5, ~this.field2206.field2590 == -2);
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Z", line = 534)
    public final boolean method107(byte arg0) {
        ++field2207;
        return arg0 < 119;
    }
}
