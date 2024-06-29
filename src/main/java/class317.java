import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class317 extends class162 {

    @OriginalMember(owner = "client!kg", name = "Bc", descriptor = "I")
    public int field4637 = -1;

    @OriginalMember(owner = "client!kg", name = "Ac", descriptor = "B")
    private byte field4636 = 0;

    @OriginalMember(owner = "client!kg", name = "Cc", descriptor = "Z")
    public boolean field4638 = false;

    @OriginalMember(owner = "client!kg", name = "Qc", descriptor = "I")
    public int field4652 = -1;

    @OriginalMember(owner = "client!kg", name = "Yc", descriptor = "I")
    public int field4660 = 0;

    @OriginalMember(owner = "client!kg", name = "Ec", descriptor = "I")
    public int field4640 = -1;

    @OriginalMember(owner = "client!kg", name = "Jc", descriptor = "B")
    private byte field4645 = 0;

    @OriginalMember(owner = "client!kg", name = "bd", descriptor = "I")
    public int field4663 = 0;

    @OriginalMember(owner = "client!kg", name = "Zc", descriptor = "I")
    public int field4661 = 0;

    @OriginalMember(owner = "client!kg", name = "Vc", descriptor = "I")
    public int field4657 = -1;

    @OriginalMember(owner = "client!kg", name = "dd", descriptor = "I")
    public int field4665 = -1;

    @OriginalMember(owner = "client!kg", name = "Wc", descriptor = "I")
    public int field4658 = -1;

    @OriginalMember(owner = "client!kg", name = "hd", descriptor = "I")
    public int field4669 = -1;

    @OriginalMember(owner = "client!kg", name = "ad", descriptor = "I")
    public int field4662 = 0;

    @OriginalMember(owner = "client!kg", name = "id", descriptor = "I")
    public int field4670 = 0;

    @OriginalMember(owner = "client!kg", name = "kd", descriptor = "I")
    public int field4672 = 255;

    @OriginalMember(owner = "client!kg", name = "Uc", descriptor = "I")
    public static int field4656 = 0;

    @OriginalMember(owner = "client!kg", name = "Dc", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!kg", name = "Fc", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!kg", name = "Gc", descriptor = "I")
    private int field4642;

    @OriginalMember(owner = "client!kg", name = "Hc", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!kg", name = "Kc", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!kg", name = "Lc", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!kg", name = "Mc", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!kg", name = "Nc", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!kg", name = "Pc", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!kg", name = "Rc", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!kg", name = "Sc", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!kg", name = "Tc", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!kg", name = "Xc", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!kg", name = "cd", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!kg", name = "ed", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!kg", name = "fd", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!kg", name = "gd", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!kg", name = "ld", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!kg", name = "Ic", descriptor = "Lrj;")
    public class436 field4644;

    @OriginalMember(owner = "client!kg", name = "Oc", descriptor = "Ljava/lang/String;")
    public String field4650;

    @OriginalMember(owner = "client!kg", name = "jd", descriptor = "Ljava/lang/String;")
    public String field4671;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lqb;Lug;ILtj;IIII)V")
    private final void method2075(class257 arg0, class118 arg1, int arg2, class298 arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4659;
        int var9 = arg2 * arg2 + arg7 * arg7;
        if (arg6 >= ~var9 && arg5 >= var9) {
            int var10 = 16383 & (int) (Math.atan2((double) arg7, (double) arg2) * 2607.5945876176133D);
            class257 var11 = class7.method43(super.field5921, super.field2126, arg4, super.field5930, arg3, super.field5932, arg0, super.field2116, (byte) 104, super.field2137, var10);
            if (var11 != null) {
                arg3.method499(false);
                var11.method1661(arg1, (class137) null, 0);
                arg3.method499(true);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(B)I")
    public final int method1089(byte arg0) {
        ++field4646;
        if (arg0 != -120) {
            this.method126((byte) -3, (class298) null);
        }
        return this.field4642;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZ)V")
    public final void method2076(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        super.method1095(arg4, -10, arg3, arg2, arg0, this.method1091((byte) -83));
        ++field4648;
        int var6 = 56 % ((-80 - arg1) / 44);
    }

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "(I)Z")
    public final boolean method2077(int arg0) {
        ++field4639;
        if (this.field4644 == null) {
            return false;
        } else {
            if (arg0 != 8129) {
                this.field4652 = -109;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
    public final int method1087(byte arg0) {
        ++field4653;
        return arg0 != 73 ? 121 : -1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method2078(int arg0, boolean arg1) {
        ++field4666;
        String var3 = "";
        if (class16.field271 != null) {
            var3 = var3 + class16.field271[this.field4636];
        }
        if (class95.field1299 != null && class95.field1299[this.field4636] != -1) {
            class244 var4 = class93.method752((byte) 22, class95.field1299[this.field4636]);
            if (var4.field3422 == 's') {
                var3 = var3 + var4.method1588((byte) 85, this.field4645 & 255);
            } else {
                class266.method1780(1, "gdn1", new Throwable());
                class95.field1299[this.field4636] = -1;
            }
        }
        if (arg0 != 2047) {
            this.method2079(-69, (class341) null);
        }
        String var5;
        if (!arg1) {
            var5 = var3 + this.field4650;
        } else {
            var5 = var3 + this.field4671;
        }
        if (class179.field2401 != null) {
            var5 = var5 + class179.field2401[this.field4636];
        }
        return var5;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILtj;BIZLkm;I)V")
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        ++field4649;
        int var8 = 105 % ((46 - arg2) / 45);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLtj;)V")
    public final void method126(byte arg0, class298 arg1) {
        ++field4654;
        if (this.field4644 != null) {
            if (super.field2188 || this.method2080(0, arg0 + -177, arg1)) {
                this.method1086(super.field2188, super.field2186, arg1, (byte) 118);
                if (arg0 != 50) {
                    this.method2076(38, 117, 103, -74, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(B)I")
    public final int method1091(byte arg0) {
        ++field4651;
        int var2 = -22 % ((arg0 - -35) / 47);
        return this.field4644 != null && ~this.field4644.field6329 != 0 ? class43.method309((byte) 2, this.field4644.field6329).field2590 : super.method1091((byte) 81);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILfb;)V")
    public final void method2079(int arg0, class341 arg1) {
        ++field4647;
        arg1.field5049 = 0;
        int var3 = arg1.method2233((byte) 104);
        int var4 = var3 & 1;
        boolean var5 = ~(var3 & 2) != -1;
        boolean var6 = ~(4 & var3) != -1;
        int var7 = super.method1091((byte) 26);
        this.method1088(true, (var3 >> 3 & 7) + 1);
        this.field4636 = (byte) (3 & var3 >> 6);
        super.field5921 += (this.method1091((byte) 30) + -var7) * 64;
        super.field5930 += 64 * (this.method1091((byte) 104) - var7);
        this.field4645 = arg1.method2211(255);
        this.field4657 = arg1.method2211(255);
        this.field4637 = arg1.method2211(255);
        int var8 = -1;
        this.field4663 = 0;
        int[] var9 = new int[12];
        for (int var10 = 0; ~var10 > -13; ++var10) {
            int var11 = arg1.method2233((byte) 104);
            if (var11 == 0) {
                var9[var10] = 0;
            } else {
                int var12 = arg1.method2233((byte) 104);
                int var13 = (var11 << 8) + var12;
                if (var10 == 0 && var13 == 65535) {
                    var8 = arg1.method2239(-1076227960);
                    this.field4663 = arg1.method2233((byte) 104);
                    break;
                }
                if (~var13 <= -32769) {
                    int var27 = class384.field5620[var13 - 32768];
                    var9[var10] = class258.method1708(var27, 1073741824);
                    int var28 = class129.method915(126, var27).field2038;
                    if (~var28 != -1) {
                        this.field4663 = var28;
                    }
                } else {
                    var9[var10] = class258.method1708(Integer.MIN_VALUE, var13 + -256);
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; ++var15) {
            int var26 = arg1.method2233((byte) 104);
            if (~var26 > -1 || class444.field6408[var15].length <= var26) {
                var26 = 0;
            }
            var14[var15] = var26;
        }
        this.field4642 = arg1.method2239(-1076227960);
        this.field4671 = arg1.method2261((byte) 87);
        if (var5) {
            this.field4650 = arg1.method2261((byte) 96);
        } else {
            this.field4650 = this.field4671;
        }
        if (arg0 > -29) {
            this.method2075((class257) null, (class118) null, -26, (class298) null, -49, -98, 12, 44);
        }
        this.field4661 = arg1.method2233((byte) 104);
        if (var6) {
            this.field4662 = arg1.method2239(-1076227960);
            this.field4652 = -1;
            this.field4670 = this.field4661;
        } else {
            this.field4662 = 0;
            this.field4670 = arg1.method2233((byte) 104);
            this.field4652 = arg1.method2233((byte) 104);
            if (this.field4652 == 255) {
                this.field4652 = -1;
            }
        }
        int var16 = this.field4660;
        this.field4660 = arg1.method2233((byte) 104);
        if (~this.field4660 != -1) {
            int var17 = this.field4669;
            int var18 = this.field4658;
            int var19 = this.field4665;
            int var20 = this.field4640;
            int var21 = this.field4672;
            this.field4669 = arg1.method2239(-1076227960);
            this.field4658 = arg1.method2239(-1076227960);
            this.field4665 = arg1.method2239(-1076227960);
            this.field4640 = arg1.method2239(-1076227960);
            this.field4672 = arg1.method2233((byte) 104);
            if (~this.field4660 != ~var16 || ~this.field4669 != ~var17 || ~this.field4658 != ~var18 || this.field4665 != var19 || this.field4640 != var20 || ~this.field4672 != ~var21) {
                class441.method2757(this, 2436);
            }
        } else {
            class356.method2336((byte) -46, this);
        }
        if (this.field4644 == null) {
            this.field4644 = new class436();
        }
        int var22 = this.field4644.field6329;
        int[] var23 = this.field4644.field6340;
        this.field4644.method2726(true, var9, var14, this.method1089((byte) -120), ~var4 == -2, var8);
        if (~var8 != ~var22) {
            super.field5921 = super.field2190[0] * 128 - -(this.method1091((byte) -95) * 64);
            super.field5930 = super.field2189[0] * 128 + 64 * this.method1091((byte) -82);
        }
        if (super.field2183 == 2047 && var23 != null) {
            for (int var24 = 0; var24 < var14.length; ++var24) {
                if (var14[var24] != var23[var24]) {
                    class117.method856(1107);
                    break;
                }
            }
        }
        if (super.field2187 != null) {
            super.field2187.method2600();
        }
        if (~super.field2143 != 0 && super.field2178) {
            class290 var25 = this.method1084(-24211);
            if (!var25.method1972((byte) -47, super.field2143)) {
                super.field2143 = -1;
                super.field2178 = false;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILtj;)Z")
    private final boolean method2080(int arg0, int arg1, class298 arg2) {
        ++field4664;
        int var4 = arg0;
        class290 var5 = this.method1084(-24211);
        class233 var6 = super.field2148 != -1 && ~super.field2151 == -1 ? class73.method597(super.field2148, -1) : null;
        class233 var7 = ~super.field2143 == 0 || this.field4638 || super.field2178 && var6 != null ? null : class73.method597(super.field2143, -1);
        int var8 = var5.field4393;
        if (arg1 >= -106) {
            return false;
        } else {
            int var9 = var5.field4361;
            if (var8 != 0 || var9 != 0 || var5.field4358 != 0 || var5.field4348 != 0) {
                arg0 |= 7;
            }
            super.field2186[0] = this.field4644.method2727((byte) -84, super.field2163, super.field2167, true, arg2, super.field2132, super.field2144, super.field2161, super.field2120, super.field2162, arg0, var6, var7);
            int var10 = class439.method2746((byte) 92);
            if (class393.field5727 < 96 && var10 > 50) {
                class116.method849((byte) -56);
            }
            if (~class173.field2353 != -1 && ~var10 > -51) {
                int var11 = -var10 + 50;
                while (var11 > class389.field5690) {
                    class318.field4677[class389.field5690] = new byte[102400];
                    ++class389.field5690;
                }
                while (var11 < class389.field5690) {
                    --class389.field5690;
                    class318.field4677[class389.field5690] = null;
                }
            } else if (~class173.field2353 != -1) {
                class389.field5690 = 0;
                class318.field4677 = new byte[50][];
            }
            if (super.field2186[0] == null) {
                return false;
            } else {
                super.field2169 = super.field2186[0].method1688();
                this.method1099(super.field2186[0], 22432);
                int var12 = super.field2164.method698((byte) 76);
                super.field2116 = 0;
                super.field2137 = 0;
                super.field2126 = 0;
                if (var8 == 0 && ~var9 == -1) {
                    this.method1097(this.method1091((byte) -99) << 7, 19387, var12, this.method1091((byte) -86) << 7);
                } else {
                    this.method1097(var8, 19387, var12, var9);
                    if (super.field2137 != 0) {
                        super.field2186[0].method1687(super.field2137);
                    }
                    if (~super.field2126 != -1) {
                        super.field2186[0].method1693(super.field2126);
                    }
                    if (super.field2116 != 0) {
                        super.field2186[0].method1659(0, super.field2116, 0);
                    }
                }
                super.field2186[1] = null;
                if (!this.field4638 && ~super.field2142 != 0 && super.field2113 != -1) {
                    class235 var13 = class263.method1762(super.field2142, false);
                    class257 var14 = var13.method1524(super.field2165, (!var13.field3272 ? 2 : 7) | var4, 5, arg2, super.field2117, super.field2113);
                    if (var14 != null) {
                        var14.method1659(0, -super.field2135, 0);
                        if (var13.field3272 && (var8 != 0 || var9 != 0)) {
                            if (~super.field2137 != -1) {
                                var14.method1687(super.field2137);
                            }
                            if (~super.field2126 != -1) {
                                var14.method1693(super.field2126);
                            }
                            if (~super.field2116 != -1) {
                                var14.method1659(0, super.field2116, 0);
                            }
                        }
                        super.field2186[1] = var14;
                    }
                }
                super.field2186[2] = null;
                if (!this.field4638 && super.field2204 != null) {
                    if (class231.field3179 >= super.field2195) {
                        super.field2204 = null;
                    }
                    if (~super.field2193 >= ~class231.field3179 && ~super.field2195 < ~class231.field3179) {
                        class257 var15 = super.field2204.method117(arg2, var4 | 7, (byte) 44);
                        if (var15 != null) {
                            var15.method1659(-super.field5921 + super.field2194, -super.field5932 + super.field2205, -super.field5930 + super.field2199);
                            if (var12 != 0) {
                                var15.method1673(16383 & -var12);
                            }
                            super.field2186[2] = var15;
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)I")
    public final int method345(int arg0) {
        ++field4667;
        if (arg0 <= 14) {
            this.method118((class298) null, -107);
        }
        return super.field2169;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILtj;II)Z")
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        ++field4643;
        if (this.field4644 != null && this.method2080(65536, -128, arg1)) {
            class118 var5 = arg1.method519();
            int var6 = super.field2164.method698((byte) -45);
            var5.method273(var6);
            var5.method274(super.field5921, super.field5932, super.field5930);
            for (int var7 = arg3; ~super.field2186.length < ~var7; ++var7) {
                if (super.field2186[var7] != null) {
                    return super.field2186[var7].method1698(arg2, arg0, var5, true);
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ltj;I)Lri;")
    public final class372 method118(class298 arg0, int arg1) {
        ++field4641;
        if (this.field4644 != null && this.method2080(1024, -119, arg0)) {
            class118 var3 = arg0.method519();
            int var4 = super.field2164.method698((byte) 67);
            var3.method273(var4);
            var3.method271(super.field5921, super.field5932, super.field5930);
            float var5 = arg0.method458();
            float var6 = arg0.method428();
            if (class354.field5256) {
                class290 var7 = this.method1084(-24211);
                if (var7.field4377 && (this.field4644.field6329 == -1 || class43.method309((byte) 2, this.field4644.field6329).field2580)) {
                    class233 var8 = ~super.field2148 != 0 && ~super.field2151 == -1 ? class73.method597(super.field2148, -1) : null;
                    class233 var9 = super.field2143 == -1 || this.field4638 || super.field2178 && var8 != null ? null : class73.method597(super.field2143, -1);
                    class257 var10 = class233.method1519(0, super.field2157, var9 != null ? var9 : var8, 0, 160, var9 != null ? super.field2167 : super.field2144, 1, super.field2186[0], super.field2126, arg0, 240, 70, super.field2137, super.field2116, var4);
                    if (var10 != null) {
                        arg0.method481(var5, var6 - 128.0F);
                        arg0.method499(false);
                        var10.method1661(var3, (class137) null, 0);
                        arg0.method499(true);
                    }
                }
            }
            if (arg1 != 18630) {
                return null;
            } else {
                if (class383.field5609 == this) {
                    arg0.method481(var5, var6 - 144.0F);
                    var3.method274(super.field5921, super.field5932, super.field5930);
                    for (int var11 = class349.field5195.length + -1; var11 >= 0; --var11) {
                        class198 var12 = class349.field5195[var11];
                        if (var12 != null && var12.field2731 != -1) {
                            if (var12.field2741 == 1 && ~var12.field2729 <= -1 && ~class388.field5670.length < ~var12.field2729) {
                                class163 var13 = class388.field5670[var12.field2729];
                                if (var13 != null) {
                                    int var14 = var13.field5921 / 32 + -(class383.field5609.field5921 / 32);
                                    int var15 = var13.field5930 / 32 + -(class383.field5609.field5930 / 32);
                                    this.method2075(super.field2186[0], var3, var15, arg0, var12.field2731, 360000, -17, var14);
                                }
                            }
                            if (~var12.field2741 == -3) {
                                int var16 = (-class236.field3292 + var12.field2739) * 4 + 2 + -(class383.field5609.field5921 / 32);
                                int var17 = (-class90.field1223 + var12.field2734) * 4 + 2 - class383.field5609.field5930 / 32;
                                int var18 = var12.field2733 * 4;
                                int var19 = var18 * var18;
                                this.method2075(super.field2186[0], var3, var17, arg0, var12.field2731, var19, -17, var16);
                            }
                            if (~var12.field2741 == -11 && ~var12.field2729 <= -1 && var12.field2729 < class176.field2382.length) {
                                class317 var20 = class176.field2382[var12.field2729];
                                if (var20 != null) {
                                    int var21 = var20.field5921 / 32 + -(class383.field5609.field5921 / 32);
                                    int var22 = var20.field5930 / 32 - class383.field5609.field5930 / 32;
                                    this.method2075(super.field2186[0], var3, var22, arg0, var12.field2731, 360000, -17, var21);
                                }
                            }
                        }
                    }
                    var3.method273(var4);
                    var3.method271(super.field5921, super.field5932, super.field5930);
                }
                arg0.method481(var5, var6);
                class372 var23 = class384.method2492(super.field2186.length, (byte) 94);
                if (super.field2187 == null) {
                    arg0.method480(super.field2186, var3, var23.field5481, class383.field5609 != this ? 0 : 1);
                } else {
                    class305 var24 = super.field2187.method2597();
                    arg0.method464(super.field2186, var24, var3, var23.field5481, class383.field5609 == this ? 1 : 0);
                }
                this.method1086(false, super.field2186, arg0, (byte) 118);
                if (super.field2186[2] != null) {
                    if (~var4 != -1) {
                        super.field2186[2].method1673(var4);
                    }
                    super.field2186[2].method1659(-super.field2194 + super.field5921, -super.field2205 + super.field5932, -super.field2199 + super.field5930);
                }
                return var23;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (arg0 != 2) {
            this.method1087((byte) -25);
        }
        ++field4673;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    public final String method2081(boolean arg0, int arg1) {
        ++field4668;
        if (arg1 != 1) {
            this.method114(3);
        }
        return !arg0 ? this.field4650 : this.field4671;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        ++field4655;
        return arg0 <= 119;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIII)V")
    public static final void method2082(int arg0, int arg1, int arg2, int arg3) {
        if (class50.field777 != null) {
            class50.field777[arg0][arg1] = (arg3 & 2040) << 21 | arg2 & 16777215;
        }
    }
}
