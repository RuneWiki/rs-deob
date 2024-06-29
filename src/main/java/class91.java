import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class91 extends class419 {

    @OriginalMember(owner = "client!ur", name = "Gc", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!ur", name = "Hc", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ur", name = "Jc", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ur", name = "Kc", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ur", name = "Mc", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ur", name = "Nc", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ur", name = "Oc", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ur", name = "Pc", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ur", name = "Qc", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ur", name = "Rc", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ur", name = "Sc", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ur", name = "Tc", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ur", name = "Uc", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ur", name = "Vc", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ur", name = "Wc", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ur", name = "Xc", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ur", name = "Yc", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ur", name = "Lc", descriptor = "Lce;")
    public class345 field1035;

    @OriginalMember(owner = "client!ur", name = "Ic", descriptor = "Lho;")
    public static class359 field1032;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)I")
    public final int method495(byte arg0) {
        ++field1033;
        if (this.field1035.field4672 != null) {
            class345 var2 = this.field1035.method2026(-1);
            if (var2 != null && var2.field4669 != -1) {
                return var2.field4669;
            }
        }
        if (arg0 <= 32) {
            field1047 = 29;
        }
        return this.field1035.field4669;
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)I")
    public final int method76(int arg0) {
        ++field1043;
        return arg0 != 20765 ? 14 : super.field6079;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lvm;I)V")
    public final void method352(class322 arg0, int arg1) {
        ++field1048;
        if (arg1 != 0) {
            field1032 = null;
        }
        if (this.field1035 != null) {
            if (super.field6117 || this.method499(0, arg0, (byte) -116)) {
                this.method2608(super.field6117, (byte) 115, arg0, super.field6120);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lam;B)V")
    public static final void method496(class286 arg0, byte arg1) {
        class390.field5594 = arg0;
        ++field1036;
        if (arg1 != -91) {
            field1047 = 81;
        }
        class80.field886 = class390.field5594.method1691(4, 0);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
    public final void method346(int arg0) {
        if (arg0 <= -13) {
            ++field1037;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "(I)Z")
    public final boolean method497(int arg0) {
        if (arg0 != -1) {
            this.field1035 = null;
        }
        ++field1031;
        return this.field1035 != null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIILvm;)Z")
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        ++field1038;
        if (this.field1035 != null && this.method499(65536, arg3, (byte) -115)) {
            class247 var5 = arg3.method1650();
            int var6 = super.field6075.method2690(arg0 + 5694);
            var5.method751(var6);
            var5.method747(super.field152, super.field150, super.field154);
            for (int var7 = 0; ~super.field6120.length < ~var7; ++var7) {
                if (super.field6120[var7] != null) {
                    return super.field6120[var7].method2300(arg1, arg2, var5, ~this.field1035.field4624 == -2);
                }
            }
            if (arg0 != -23563) {
                this.method500((byte) 2);
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "(I)Z")
    private final boolean method498(int arg0) {
        if (arg0 != -23707) {
            this.method76(-108);
        }
        ++field1040;
        return this.field1035.field4660;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIIILai;ILvm;)V")
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        if (arg1 <= 36) {
            field1032 = null;
        }
        ++field1042;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILvm;B)Z")
    private final boolean method499(int arg0, class322 arg1, byte arg2) {
        ++field1041;
        int var4 = arg0;
        class70 var5 = this.method2606(0);
        class208 var6 = ~super.field6073 != 0 && super.field6036 == 0 ? class193.method1037(2, super.field6073) : null;
        class208 var7 = ~super.field6100 == 0 || super.field6056 && var6 != null ? null : class193.method1037(28, super.field6100);
        int var8 = var5.field773;
        int var9 = var5.field771;
        if (var8 != 0 || ~var9 != -1 || ~var5.field737 != -1 || ~var5.field752 != -1) {
            arg0 |= 7;
        }
        class396 var10 = super.field6120[0] = this.field1035.method2023(super.field6074, 8, arg0, arg1, var6, super.field6058, super.field6030, super.field6040, super.field6033, super.field6094, super.field6051, var7);
        if (var10 == null) {
            return false;
        } else {
            super.field6079 = var10.method2299();
            this.method2602((byte) -127, var10);
            int var11 = super.field6075.method2690(-17869);
            super.field6041 = 0;
            super.field6053 = 0;
            super.field6065 = 0;
            if (arg2 >= -81) {
                return false;
            } else {
                if (var8 == 0 && var9 == 0) {
                    this.method2609((byte) -110, this.method857((byte) -106) << 7, var11, this.method857((byte) -106) << 7);
                } else {
                    this.method2609((byte) -110, var8, var11, var9);
                    if (super.field6041 != 0) {
                        super.field6120[0].method2317(super.field6041);
                    }
                    if (~super.field6053 != -1) {
                        super.field6120[0].method2266(super.field6053);
                    }
                    if (~super.field6065 != -1) {
                        super.field6120[0].method2286(0, super.field6065, 0);
                    }
                }
                super.field6120[1] = null;
                if (super.field6027 != -1 && ~super.field6039 != 0) {
                    class393 var12 = class220.method1186((byte) -110, super.field6027);
                    class396 var13 = var12.method2446(super.field6083, super.field6039, arg1, (byte) 2, super.field6068, (!var12.field5651 ? 2 : 7) | var4);
                    if (var13 != null) {
                        var13.method2286(0, -super.field6091, 0);
                        if (var12.field5651 && (~var8 != -1 || ~var9 != -1)) {
                            if (super.field6041 != 0) {
                                var13.method2317(super.field6041);
                            }
                            if (super.field6053 != 0) {
                                var13.method2266(super.field6053);
                            }
                            if (super.field6065 != 0) {
                                var13.method2286(0, super.field6065, 0);
                            }
                        }
                        super.field6120[1] = var13;
                    }
                }
                super.field6120[2] = null;
                if (super.field6114 != null) {
                    if (super.field6124 <= class234.field3224) {
                        super.field6114 = null;
                    }
                    if (~super.field6110 >= ~class234.field3224 && ~super.field6124 < ~class234.field3224) {
                        class396 var14 = super.field6114.method349(arg1, -24206, 7 | var4);
                        if (var14 != null) {
                            var14.method2286(-super.field152 + super.field6113, -super.field150 + super.field6107, -super.field154 + super.field6125);
                            if (~var11 != -1) {
                                var14.method2269(var11);
                            }
                            super.field6120[2] = var14;
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lvm;Z)Ldn;")
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field1044;
        if (this.field1035 != null && this.method499(1024, arg0, (byte) -103)) {
            class247 var3 = arg0.method1650();
            int var4 = super.field6075.method2690(-17869);
            var3.method751(var4);
            var3.method742(super.field152, super.field150, super.field154);
            class70 var5 = this.method2606(0);
            class345 var6 = this.field1035.field4672 != null ? this.field1035.method2026(-1) : this.field1035;
            if (class405.field5900 && var6.field4649 && var5.field765) {
                class208 var7 = ~super.field6073 != 0 && super.field6036 == 0 ? class193.method1037(40, super.field6073) : null;
                class208 var8 = ~super.field6100 == 0 || super.field6056 && var7 != null ? null : class193.method1037(110, super.field6100);
                class396 var9 = class421.method2622(var8 != null ? var8 : var7, 255 & this.field1035.field4634, this.field1035.field4666 & 65535, var8 == null ? super.field6033 : super.field6030, super.field6065, super.field6053, 255 & this.field1035.field4641, this.field1035.field4630 & 65535, arg0, this.field1035.field4624, var4, super.field6120[0], super.field6041, 13079, super.field6049);
                if (var9 != null) {
                    float var10 = arg0.method1564();
                    float var11 = arg0.method1641();
                    arg0.method1571(false);
                    arg0.method1583(var10, var11 - 150.0F);
                    var9.method2284(var3, (class447) null, 0);
                    arg0.method1583(var10, var11);
                    arg0.method1571(true);
                }
            }
            class321 var12 = null;
            if (this.method498(-23707)) {
                var12 = class204.method1110(258, super.field6120.length);
            }
            if (super.field6115 == null) {
                arg0.method1581(super.field6120, var3, var12 != null ? var12.field4293 : null, 0);
            } else {
                class366 var13 = super.field6115.method917();
                arg0.method1559(super.field6120, var13, var3, var12 != null ? var12.field4293 : null, 0);
            }
            this.method2608(arg1, (byte) 120, arg0, super.field6120);
            if (super.field6120[2] != null) {
                if (~var4 != -1) {
                    super.field6120[2].method2269(var4);
                }
                super.field6120[2].method2286(-super.field6113 + super.field152, super.field150 - super.field6107, -super.field6125 + super.field154);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)Z")
    public final boolean method345(byte arg0) {
        ++field1045;
        return arg0 != -72;
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "(B)I")
    public final int method500(byte arg0) {
        if (arg0 != -83) {
            this.method352((class322) null, -75);
        }
        ++field1039;
        if (this.field1035.field4672 != null) {
            class345 var2 = this.field1035.method2026(arg0 ^ 82);
            if (var2 != null && var2.field4639 != -1) {
                return var2.field4639;
            }
        }
        return this.field1035.field4639;
    }

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "(I)I")
    public final int method501(int arg0) {
        ++field1046;
        if (this.field1035.field4672 != null) {
            class345 var2 = this.field1035.method2026(arg0 + -256);
            if (var2 != null && ~var2.field4691 != 0) {
                return var2.field4691;
            }
        }
        if (arg0 != 255) {
            return 88;
        } else {
            return this.field1035.field4691 == -1 ? super.method501(255) : this.field1035.field4691;
        }
    }

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "(B)V")
    public static void method502(byte arg0) {
        field1032 = null;
        if (arg0 != 54) {
            method496((class286) null, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lce;I)V")
    public final void method503(class345 arg0, int arg1) {
        ++field1034;
        this.field1035 = arg0;
        if (arg1 == -31893) {
            if (super.field6115 != null) {
                super.field6115.method912();
            }
        }
    }
}
