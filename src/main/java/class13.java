import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 extends class155 {

    @OriginalMember(owner = "client!be", name = "Lc", descriptor = "I")
    public int field237 = -1;

    @OriginalMember(owner = "client!be", name = "Uc", descriptor = "I")
    public int field246 = 0;

    @OriginalMember(owner = "client!be", name = "Jc", descriptor = "I")
    public int field235 = 0;

    @OriginalMember(owner = "client!be", name = "Oc", descriptor = "Z")
    public boolean field240 = false;

    @OriginalMember(owner = "client!be", name = "ad", descriptor = "I")
    public int field252 = 0;

    @OriginalMember(owner = "client!be", name = "Rc", descriptor = "I")
    public int field243 = -1;

    @OriginalMember(owner = "client!be", name = "id", descriptor = "I")
    public int field260 = 0;

    @OriginalMember(owner = "client!be", name = "dd", descriptor = "I")
    public int field255 = 0;

    @OriginalMember(owner = "client!be", name = "Yc", descriptor = "Lc;")
    public static class15 field250 = new class15(4096);

    @OriginalMember(owner = "client!be", name = "jd", descriptor = "Lke;")
    public static class74 field261 = null;

    @OriginalMember(owner = "client!be", name = "hd", descriptor = "Ltd;")
    private static class136 field259 = class145.method1172("Connection timed out)3", 45);

    @OriginalMember(owner = "client!be", name = "ld", descriptor = "Ltd;")
    public static class136 field263 = field259;

    @OriginalMember(owner = "client!be", name = "kd", descriptor = "Ltd;")
    public static class136 field262 = class145.method1172("(U5", 45);

    @OriginalMember(owner = "client!be", name = "md", descriptor = "Ltd;")
    public static class136 field264 = class145.method1172("m", 45);

    @OriginalMember(owner = "client!be", name = "Hc", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!be", name = "Ic", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!be", name = "Kc", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!be", name = "Mc", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!be", name = "Nc", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!be", name = "Pc", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!be", name = "Qc", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!be", name = "Sc", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!be", name = "Tc", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!be", name = "Vc", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!be", name = "Wc", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!be", name = "Zc", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!be", name = "bd", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!be", name = "ed", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!be", name = "fd", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!be", name = "nd", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!be", name = "od", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!be", name = "Xc", descriptor = "Ltd;")
    public class136 field249;

    @OriginalMember(owner = "client!be", name = "cd", descriptor = "Lda;")
    public class23 field254;

    @OriginalMember(owner = "client!be", name = "gd", descriptor = "Lob;")
    public class99 field258;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)Lnb;")
    public static final class92 method89(byte arg0) {
        ++field239;
        class92 var1 = new class92();
        var1.field2169 = class124.field2887[0];
        if (arg0 <= 40) {
            return null;
        } else {
            var1.field2170 = class3.field59[0];
            var1.field2168 = class64.field1381;
            var1.field2163 = class65.field1408[0];
            var1.field2165 = class71.field1511[0];
            var1.field2164 = class96.field2252;
            var1.field2167 = class127.field2953;
            var1.field2166 = class81.field1905[0];
            class124.method957(115);
            return var1;
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)V")
    public static final void method90(boolean arg0) {
        if (!arg0) {
            ++field234;
            for (class43 var1 = (class43) class71.field1492.method512(0); var1 != null; var1 = (class43) class71.field1492.method520((byte) 53)) {
                if (var1.field995 != null) {
                    class55.field1228.method789(var1.field995);
                    var1.field995 = null;
                }
                if (var1.field980 != null) {
                    class55.field1228.method789(var1.field980);
                    var1.field980 = null;
                }
            }
            class71.field1492.method507(-114);
        }
    }

    @OriginalMember(owner = "client!be", name = "i", descriptor = "(I)Z")
    public final boolean method91(int arg0) {
        ++field251;
        if (arg0 <= 41) {
            this.method93(16);
        }
        return this.field258 != null;
    }

    @OriginalMember(owner = "client!be", name = "j", descriptor = "(I)V")
    public static final void method92(int arg0) {
        class16 var1 = (class16) class41.field958.method512(arg0);
        ++field247;
        while (var1 != null) {
            if (~var1.field320 != 0) {
                var1.method674(32);
            } else {
                var1.field317 = 0;
                class136.method1096(30370, var1);
            }
            var1 = (class16) class41.field958.method520((byte) 57);
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)Lda;")
    public final class23 method93(int arg0) {
        int var2 = -92 / ((18 - arg0) / 63);
        ++field242;
        if (this.field258 == null) {
            return null;
        } else {
            class116 var3 = ~super.field3585 != 0 && ~super.field3598 == -1 ? class29.method252(true, super.field3585) : null;
            class116 var4 = super.field3594 == -1 || this.field240 || ~super.field3594 == ~super.field3556 && var3 != null ? null : class29.method252(true, super.field3594);
            class23 var5 = this.field258.method797(super.field3546, -126, var3, var4, super.field3543);
            if (var5 == null) {
                return null;
            } else {
                var5.method195();
                super.field3605 = var5.field2607;
                if (!this.field240 && ~super.field3579 != 0 && super.field3551 != -1) {
                    class23 var6 = class151.method1191(super.field3579, 13).method246(-129, super.field3551);
                    if (var6 != null) {
                        var6.method191(0, -super.field3567, 0);
                        class23[] var7 = new class23[] { var5, var6 };
                        var5 = new class23(var7, 2);
                    }
                }
                if (!this.field240 && this.field254 != null) {
                    if (class44.field1013 >= this.field246) {
                        this.field254 = null;
                    }
                    if (this.field260 <= class44.field1013 && ~class44.field1013 > ~this.field246) {
                        class23 var8 = this.field254;
                        var8.method191(-super.field3580 + this.field257, this.field244 - this.field248, -super.field3578 + this.field256);
                        class23[] var9 = new class23[] { var5, var8 };
                        if (super.field3538 != 512) {
                            if (super.field3538 == 1024) {
                                var8.method202();
                                var8.method202();
                            } else if (super.field3538 == 1536) {
                                var8.method202();
                            }
                        } else {
                            var8.method202();
                            var8.method202();
                            var8.method202();
                        }
                        var5 = new class23(var9, 2);
                        if (~super.field3538 != -513) {
                            if (super.field3538 != 1024) {
                                if (super.field3538 == 1536) {
                                    var8.method202();
                                    var8.method202();
                                    var8.method202();
                                }
                            } else {
                                var8.method202();
                                var8.method202();
                            }
                        } else {
                            var8.method202();
                        }
                        var8.method191(-this.field257 + super.field3580, -this.field244 + this.field248, -this.field256 + super.field3578);
                    }
                }
                var5.field486 = true;
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
    public static final void method94(byte arg0) {
        ++field266;
        if (arg0 <= -6) {
            int var1 = class81.field1943.method706(class145.field3352);
            for (int var2 = 0; ~class14.field274 < ~var2; ++var2) {
                int var6 = class81.field1943.method706(class69.method508(var2, (byte) -89));
                if (var6 > var1) {
                    var1 = var6;
                }
            }
            var1 += 8;
            int var3 = class14.field274 * 15 + 21;
            class38.field892 = var1;
            class96.field2267 = true;
            class128.field3088 = class14.field274 * 15 + 22;
            int var4 = -(var1 / 2) + class146.field3379;
            if (var1 + var4 > 765) {
                var4 = -var1 + 765;
            }
            int var5 = class8.field142;
            if (var3 + var5 > 503) {
                var5 = -var3 + 503;
            }
            if (~var4 > -1) {
                var4 = 0;
            }
            class49.field1125 = var4;
            if (~var5 > -1) {
                var5 = 0;
            }
            class65.field1394 = var5;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILsb;)V")
    public final void method95(int arg0, class127 arg1) {
        arg1.field2995 = 0;
        ++field253;
        int var3 = -1;
        int[] var4 = new int[12];
        int var5 = arg1.method1011(58);
        this.field237 = arg1.method996(arg0 + -11);
        this.field243 = arg1.method996(4);
        this.field252 = 0;
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg1.method1011(70);
            if (~var7 == -1) {
                var4[var6] = 0;
            } else {
                int var8 = arg1.method1011(110);
                var4[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var4[0] == 65535) {
                    var3 = arg1.method1020(false);
                    break;
                }
                if (~var4[var6] <= -513) {
                    int var12 = class63.method472(var4[var6] + -512, (byte) 115).field2756;
                    if (~var12 != -1) {
                        this.field252 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        int var10 = 0;
        if (arg0 != 15) {
            method89((byte) 91);
        }
        while (~var10 > -6) {
            int var11 = arg1.method1011(54);
            if (~var11 > -1 || var11 >= class19.field385[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
            ++var10;
        }
        super.field3556 = arg1.method1020(false);
        if (~super.field3556 == -65536) {
            super.field3556 = -1;
        }
        super.field3573 = arg1.method1020(false);
        if (super.field3573 == 65535) {
            super.field3573 = -1;
        }
        super.field3592 = super.field3573;
        super.field3575 = arg1.method1020(false);
        if (super.field3575 == 65535) {
            super.field3575 = -1;
        }
        super.field3599 = arg1.method1020(false);
        if (~super.field3599 == -65536) {
            super.field3599 = -1;
        }
        super.field3608 = arg1.method1020(false);
        if (super.field3608 == 65535) {
            super.field3608 = -1;
        }
        super.field3541 = arg1.method1020(false);
        if (~super.field3541 == -65536) {
            super.field3541 = -1;
        }
        super.field3558 = arg1.method1020(false);
        if (~super.field3558 == -65536) {
            super.field3558 = -1;
        }
        this.field249 = class11.method74(arg0 + -8276, arg1.method1014(false)).method1102(-1);
        this.field255 = arg1.method1011(27);
        this.field235 = arg1.method1020(false);
        if (this.field258 == null) {
            this.field258 = new class99();
        }
        this.field258.method804(var9, var4, 0, var5 == 1, var3);
    }

    @OriginalMember(owner = "client!be", name = "k", descriptor = "(I)V")
    public static void method96(int arg0) {
        field261 = null;
        field262 = null;
        field264 = null;
        field259 = null;
        field250 = null;
        if (arg0 != 11116) {
            field261 = null;
        }
        field263 = null;
    }
}
