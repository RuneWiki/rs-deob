import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class437 extends class61 {

    @OriginalMember(owner = "client!ql", name = "Sc", descriptor = "I")
    public static int field6288 = 0;

    @OriginalMember(owner = "client!ql", name = "Dc", descriptor = "I")
    public static int field6273 = 0;

    @OriginalMember(owner = "client!ql", name = "Ec", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!ql", name = "Fc", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!ql", name = "Gc", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!ql", name = "Hc", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!ql", name = "Ic", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!ql", name = "Jc", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!ql", name = "Kc", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!ql", name = "Lc", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!ql", name = "Mc", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!ql", name = "Nc", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!ql", name = "Oc", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!ql", name = "Pc", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!ql", name = "Qc", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!ql", name = "Rc", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!ql", name = "Tc", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!ql", name = "Vc", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ql", name = "Wc", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ql", name = "Uc", descriptor = "Llp;")
    public class221 field6290;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILaa;)Z", line = 3)
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        ++field6274;
        if (this.field6290 != null && this.method2734(65536, 0, arg3)) {
            class261 var5 = arg3.method1769();
            int var6 = super.field859.method2464(117);
            var5.method891(var6);
            var5.method888(super.field6197, super.field6191, super.field6192);
            for (int var7 = arg0; var7 < super.field946.length; ++var7) {
                if (super.field946[var7] != null && super.field946[var7].method516(arg1, arg2, var5, ~this.field6290.field2958 == -2)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Llp;I)V", line = 32)
    public final void method2733(class221 arg0, int arg1) {
        this.field6290 = arg0;
        ++field6292;
        if (arg1 > -55) {
            field6288 = -92;
        }
        if (super.field939 != null) {
            super.field939.method1012();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILaa;)Z", line = 50)
    private final boolean method2734(int arg0, int arg1, class281 arg2) {
        ++field6286;
        int var4 = arg0;
        class312 var5 = this.method402(0);
        class449 var6 = ~super.field931 != 0 && ~super.field880 == -1 ? class86.method599(false, super.field931) : null;
        class449 var7 = ~super.field928 == 0 || super.field861 && var6 != null ? null : class86.method599(false, super.field928);
        int var8 = var5.field4292;
        int var9 = var5.field4302;
        if (var8 != 0 || ~var9 != -1 || var5.field4287 != 0 || var5.field4308 != 0) {
            arg0 |= 7;
        }
        class75 var10 = super.field946[0] = this.field6290.method1406(super.field916, super.field896, var6, super.field887, arg2, super.field904, super.field925, arg0, super.field885, super.field900, var7, (byte) -9);
        if (var10 == null) {
            return false;
        } else {
            super.field902 = var10.method523();
            this.method408(111, var10);
            int var11 = super.field859.method2464(121);
            super.field882 = 0;
            super.field894 = 0;
            super.field892 = arg1;
            if (~var8 == -1 && ~var9 == -1) {
                this.method412(this.method410((byte) 83) << 7, -1, var11, this.method410((byte) 69) << 7);
            } else {
                this.method412(var8, -1, var11, var9);
                if (~super.field882 != -1) {
                    super.field946[0].method504(super.field882);
                }
                if (~super.field892 != -1) {
                    super.field946[0].method524(super.field892);
                }
                if (~super.field894 != -1) {
                    super.field946[0].method534(0, super.field894, 0);
                }
            }
            super.field946[1] = null;
            if (~super.field877 != 0 && super.field934 != -1) {
                class69 var12 = class221.method1405(super.field877, 87);
                class75 var13 = var12.method472(850, super.field934, super.field930, super.field924, arg2, var4 | (var12.field1070 ? 7 : 2));
                if (var13 != null) {
                    var13.method534(0, -super.field908, 0);
                    if (var12.field1070 && (~var8 != -1 || var9 != 0)) {
                        if (~super.field882 != -1) {
                            var13.method504(super.field882);
                        }
                        if (~super.field892 != -1) {
                            var13.method524(super.field892);
                        }
                        if (~super.field894 != -1) {
                            var13.method534(0, super.field894, 0);
                        }
                    }
                    super.field946[1] = var13;
                }
            }
            super.field946[2] = null;
            if (super.field953 != null) {
                if (~class35.field541 <= ~super.field945) {
                    super.field953 = null;
                }
                if (class35.field541 >= super.field943 && class35.field541 < super.field945) {
                    class75 var14 = super.field953.method134(arg2, var4 | 7, (byte) -107);
                    if (var14 != null) {
                        var14.method534(-super.field6197 + super.field950, -super.field6191 + super.field957, -super.field6192 + super.field951);
                        if (var11 != 0) {
                            var14.method507(var11);
                        }
                        super.field946[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)I", line = 163)
    public final int method600(boolean arg0) {
        if (!arg0) {
            method2735(83);
        }
        ++field6284;
        return super.field902;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Laa;I)Lcn;", line = 178)
    public final class300 method131(class281 arg0, int arg1) {
        ++field6287;
        if (this.field6290 != null && this.method2734(1024, 0, arg0)) {
            class261 var3 = arg0.method1769();
            int var4 = super.field859.method2464(-120);
            var3.method891(var4);
            if (arg1 <= 72) {
                this.field6290 = null;
            }
            var3.method888(super.field6197, super.field6191, super.field6192);
            class312 var5 = this.method402(0);
            class221 var6 = this.field6290.field2959 != null ? this.field6290.method1407(124) : this.field6290;
            if (class57.field813 && var6.field2926 && var5.field4268) {
                class449 var7 = ~super.field931 != 0 && ~super.field880 == -1 ? class86.method599(false, super.field931) : null;
                class449 var8 = ~super.field928 == 0 || super.field861 && var7 != null ? null : class86.method599(false, super.field928);
                class75 var9 = class176.method1175(super.field894, this.field6290.field2966 & 255, var4, this.field6290.field2972 & 65535, this.field6290.field2958, var8 == null ? var7 : var8, super.field882, var8 != null ? super.field885 : super.field896, super.field946[0], super.field892, this.field6290.field2944 & 255, super.field905, (byte) -126, this.field6290.field2924 & 65535, arg0);
                if (var9 != null) {
                    float var10 = arg0.method1802();
                    float var11 = arg0.method1767();
                    arg0.method1822(false);
                    arg0.method1805(var10, var11 - 150.0F);
                    var9.method514(var3, (class38) null, 0);
                    arg0.method1805(var10, var11);
                    arg0.method1822(true);
                }
            }
            class300 var12 = null;
            if (this.method2739(true)) {
                var12 = class8.method54((byte) -114, super.field946.length);
            }
            if (super.field939 == null) {
                arg0.method1770(super.field946, var3, var12 != null ? var12.field4152 : null, 0);
            } else {
                class260 var13 = super.field939.method1014();
                arg0.method1803(super.field946, var13, var3, var12 == null ? null : var12.field4152, 0);
            }
            this.method416(arg0, false, super.field946, -1);
            if (super.field946[2] != null) {
                if (~var4 != -1) {
                    super.field946[2].method507(var4);
                }
                super.field946[2].method534(-super.field950 + super.field6197, -super.field957 + super.field6191, -super.field951 + super.field6192);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I", line = 254)
    public final int method407(int arg0) {
        ++field6275;
        if (this.field6290.field2959 != null) {
            class221 var2 = this.field6290.method1407(-122);
            if (var2 != null && var2.field2928 != -1) {
                return var2.field2928;
            }
        }
        int var3 = 83 % ((5 - arg0) / 33);
        return ~this.field6290.field2928 != 0 ? this.field6290.field2928 : super.method407(-50);
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)I", line = 279)
    public final int method411(int arg0) {
        if (arg0 != -516) {
            this.method2736(23);
        }
        ++field6289;
        if (this.field6290.field2959 != null) {
            class221 var2 = this.field6290.method1407(-32);
            if (var2 != null && ~var2.field2947 != 0) {
                return var2.field2947;
            }
        }
        return this.field6290.field2947;
    }

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)I", line = 302)
    public static final int method2735(int arg0) {
        ++field6276;
        if (!class349.field4882 && class390.field5740 > 0) {
            return class389.field5708 && class293.field4056[81] && class390.field5740 > 2 ? ((class207) class167.field2393.field2720.field5369.field5369).field2804 : ((class207) class167.field2393.field2720.field5369).field2804;
        } else {
            int var1 = class349.field4883;
            int var2 = class162.field2269;
            int var3 = class377.field5380;
            int var4 = class156.field2206;
            int var5 = class340.field4753;
            if (~var1 < ~var3 && ~var1 > ~(var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; class390.field5740 > var7; ++var7) {
                    if (!class235.field3198) {
                        int var11 = (class390.field5740 - (var7 + 1)) * 16 + 31 + var4;
                        if (~var2 < ~(var11 - 13) && ~(var11 - -3) <= ~var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (-var7 + class390.field5740 + -1) * 16 + var4 + 33;
                        if (var2 > var12 + -13 && ~(var12 - -3) <= ~var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class29 var9 = new class29(class167.field2393);
                    for (class207 var10 = (class207) var9.method229(12398); var10 != null; var10 = (class207) var9.method227((byte) -85)) {
                        if (var6 == var8++) {
                            return var10.field2804;
                        }
                    }
                }
            }
            if (arg0 != 18117) {
                field6288 = 84;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)Z", line = 391)
    public final boolean method2736(int arg0) {
        ++field6283;
        if (this.field6290 == null) {
            return false;
        } else {
            return arg0 == 1;
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(Z)I", line = 406)
    public final int method413(boolean arg0) {
        ++field6285;
        if (this.field6290.field2959 != null) {
            class221 var2 = this.field6290.method1407(4);
            if (var2 != null && ~var2.field2936 != 0) {
                return var2.field2936;
            }
        }
        if (!arg0) {
            this.field6290 = null;
        }
        return this.field6290.field2936;
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(B)V", line = 438)
    public static final void method2737(byte arg0) {
        if (arg0 >= -35) {
            field6273 = 36;
        }
        ++field6291;
        if (class77.field1210 != null) {
            while (true) {
                while (~class189.field2624 > ~class126.field1775.length) {
                    class31 var1 = class126.field1775[class189.field2624];
                    if (var1 != null && var1.field480 == -1) {
                        if (class281.field3848 == null) {
                            class281.field3848 = class77.field1210.method476(-7633, var1.field474);
                        }
                        int var2 = class281.field3848.field5789;
                        if (var2 == -1) {
                            return;
                        }
                        class281.field3848 = null;
                        ++class189.field2624;
                        var1.field480 = var2;
                    } else {
                        ++class189.field2624;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZIILaa;ILqh;)V", line = 480)
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        if (arg0 != 0) {
            field6273 = -30;
        }
        ++field6282;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V", line = 491)
    public final void method135(byte arg0) {
        ++field6277;
        if (arg0 == -123) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Z", line = 502)
    public final boolean method137(int arg0) {
        ++field6278;
        if (arg0 != 0) {
            this.method137(-123);
        }
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "(I)V", line = 513)
    public static final void method2738(int arg0) {
        class393.field5747.method159(8);
        ++field6279;
        int var1 = class393.field5747.method163(8, -95);
        int var2 = -101 % ((arg0 - 18) / 34);
        if (class71.field1096 > var1) {
            for (int var3 = var1; ~var3 > ~class71.field1096; ++var3) {
                class376.field5368[class296.field4079++] = class280.field3837[var3];
            }
        }
        if (class71.field1096 < var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class71.field1096 = 0;
            for (int var4 = 0; ~var4 > ~var1; ++var4) {
                int var5 = class280.field3837[var4];
                class437 var6 = class445.field6422[var5];
                int var7 = class393.field5747.method163(1, -128);
                if (var7 == 0) {
                    class280.field3837[class71.field1096++] = var5;
                    var6.field874 = class35.field541;
                } else {
                    int var8 = class393.field5747.method163(2, -116);
                    if (var8 == 0) {
                        class280.field3837[class71.field1096++] = var5;
                        var6.field874 = class35.field541;
                        class243.field3364[class54.field795++] = var5;
                    } else if (~var8 == -2) {
                        class280.field3837[class71.field1096++] = var5;
                        var6.field874 = class35.field541;
                        int var9 = class393.field5747.method163(3, -118);
                        var6.method401(var9, 1, -12053);
                        int var10 = class393.field5747.method163(1, -110);
                        if (var10 == 1) {
                            class243.field3364[class54.field795++] = var5;
                        }
                    } else if (~var8 == -3) {
                        class280.field3837[class71.field1096++] = var5;
                        var6.field874 = class35.field541;
                        if (class393.field5747.method163(1, -103) != 1) {
                            int var11 = class393.field5747.method163(3, -122);
                            var6.method401(var11, 0, -12053);
                        } else {
                            int var12 = class393.field5747.method163(3, -104);
                            var6.method401(var12, 2, -12053);
                            int var13 = class393.field5747.method163(3, -102);
                            var6.method401(var13, 2, -12053);
                        }
                        int var14 = class393.field5747.method163(1, -106);
                        if (var14 == 1) {
                            class243.field3364[class54.field795++] = var5;
                        }
                    } else if (~var8 == -4) {
                        class376.field5368[class296.field4079++] = var5;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(Z)Z", line = 626)
    private final boolean method2739(boolean arg0) {
        if (!arg0) {
            method2737((byte) 48);
        }
        ++field6281;
        return this.field6290.field2903;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Laa;Z)V", line = 637)
    public final void method128(class281 arg0, boolean arg1) {
        ++field6280;
        if (this.field6290 != null) {
            if (arg1) {
                if (super.field941 || this.method2734(0, 0, arg0)) {
                    this.method416(arg0, super.field941, super.field946, -1);
                }
            }
        }
    }
}
