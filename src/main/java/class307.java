import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class307 extends class46 {

    @OriginalMember(owner = "client!vd", name = "wc", descriptor = "I")
    public static int field4963 = 0;

    @OriginalMember(owner = "client!vd", name = "Dc", descriptor = "Lhf;")
    public static class221 field4970 = new class221();

    @OriginalMember(owner = "client!vd", name = "sc", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!vd", name = "uc", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!vd", name = "vc", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!vd", name = "xc", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!vd", name = "yc", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!vd", name = "zc", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!vd", name = "Ac", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!vd", name = "Bc", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!vd", name = "Cc", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!vd", name = "Ec", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!vd", name = "Gc", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!vd", name = "tc", descriptor = "Lvl;")
    public class54 field4960;

    @OriginalMember(owner = "client!vd", name = "Fc", descriptor = "Li;")
    public static class74 field4972;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIII)V")
    public final void method930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4962;
        if (this.field4960 != null) {
            if (!super.field752) {
                class163 var6 = super.field761 != -1 && ~super.field791 == -1 ? class34.method211(super.field761, 3) : null;
                class163 var7 = super.field782 == -1 || super.field782 == this.method282(-1399).field3072 && var6 != null ? null : class34.method211(super.field782, 3);
                class242 var8 = this.field4960.method342(super.field738, super.field719, var7, super.field731, super.field763, true, super.field756, var6, super.field799, super.field784);
                if (var8 == null) {
                    return;
                }
                this.method280((class242) null, 116, var8);
            }
            if (super.field769 != null) {
                super.field769.method1033(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
    public static void method2075(int arg0) {
        if (arg0 != -105) {
            field4963 = -98;
        }
        field4970 = null;
        field4972 = null;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)Z")
    public final boolean method287(byte arg0) {
        if (arg0 != -86) {
            this.field4960 = null;
        }
        ++field4969;
        return this.field4960 != null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(BI)V")
    public static final void method2076(byte arg0, int arg1) {
        ++field4966;
        if (class161.field2621 == null) {
            class161.field2621 = new byte[4][104][104];
        }
        int var2 = 0;
        if (arg1 != 4) {
            method2075(67);
        }
        while (~var2 > -5) {
            for (int var3 = 0; ~var3 > -105; ++var3) {
                for (int var4 = 0; ~var4 > -105; ++var4) {
                    class161.field2621[var2][var3][var4] = arg0;
                }
            }
            ++var2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)I")
    public final int method281(boolean arg0) {
        ++field4971;
        if (this.field4960.field904 != null) {
            class54 var2 = this.field4960.method343(-1);
            if (var2 != null && ~var2.field899 != 0) {
                return var2.field899;
            }
        }
        if (arg0) {
            return 23;
        } else {
            return ~this.field4960.field899 != 0 ? this.field4960.field899 : super.method281(false);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIIJILge;)V")
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class139 arg10) {
        ++field4959;
        if (this.field4960 != null) {
            class163 var13 = super.field761 != -1 && ~super.field791 == -1 ? class34.method211(super.field761, 3) : null;
            class163 var14 = ~super.field782 == 0 || super.field782 == this.method282(-1399).field3072 && var13 != null ? null : class34.method211(super.field782, 3);
            class242 var15 = this.field4960.method342(super.field738, super.field719, var14, super.field731, super.field763, true, super.field756, var13, super.field799, super.field784);
            if (var15 != null) {
                super.field721 = var15.method860();
                class54 var16 = this.field4960;
                if (var16.field904 != null) {
                    var16 = var16.method343(-1);
                }
                if (class68.field1142 && var16.field938) {
                    class242 var17 = class71.method491(var15, this.field4960.field953, super.field789, var14 == null ? var13 : var14, super.field771, this.field4960.field915, this.field4960.field929, var14 == null ? super.field719 : super.field756, arg0, super.field794, super.field715, (byte) 122, this.field4960.field906, this.field4960.field965);
                    var17.method852(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field769);
                }
                class242 var18 = null;
                this.method284((byte) 15, var15);
                this.method286(arg0, var15, 24158);
                if (super.field757 != -1 && ~super.field747 != 0) {
                    class84 var19 = class258.method1847(-118, super.field757);
                    var18 = var19.method592(super.field742, -79, super.field747, super.field767);
                    if (var18 != null) {
                        var18.method836(0, -super.field727, 0);
                        if (var19.field1407) {
                            if (class219.field3695 != 0) {
                                var18.method840(class219.field3695);
                            }
                            if (class200.field3227 != 0) {
                                var18.method863(class200.field3227);
                            }
                            if (~class9.field182 != -1) {
                                var18.method836(0, class9.field182, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class112) var15).method865(var18);
                }
                this.method280(var18, 45, var15);
                if (this.field4960.field915 == 1) {
                    var15.field4072 = true;
                }
                var15.method852(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field769);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)I")
    public final int method292(int arg0) {
        ++field4961;
        if (arg0 != -1) {
            return 88;
        } else {
            if (this.field4960.field904 != null) {
                class54 var2 = this.field4960.method343(arg0);
                if (var2 != null && var2.field959 != -1) {
                    return var2.field959;
                }
            }
            return super.field785;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()I")
    public final int method860() {
        ++field4964;
        return super.field721;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)V")
    public static final void method2077(int arg0, int arg1, int arg2, int arg3) {
        ++field4965;
        if (arg3 <= 84) {
            method2076((byte) -77, 42);
        }
        if (~arg2 == -1003) {
            class226.method1603(arg1, arg0, 10, (byte) -121);
        } else if (arg2 != 1007) {
            if (~arg2 == -1013) {
                class226.method1603(arg1, arg0, 12, (byte) -109);
            } else {
                if (arg2 != 1011) {
                    if (~arg2 == -1005) {
                        class226.method1603(arg1, arg0, 14, (byte) -112);
                        return;
                    }
                } else {
                    class226.method1603(arg1, arg0, 13, (byte) -101);
                }
            }
        } else {
            class226.method1603(arg1, arg0, 11, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!vd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (super.field769 != null) {
            super.field769.method1025();
        }
        ++field4968;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILvl;)V")
    public final void method2078(int arg0, class54 arg1) {
        ++field4967;
        this.field4960 = arg1;
        if (super.field769 != null) {
            super.field769.method1019();
        }
        if (arg0 < 47) {
            this.field4960 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)I")
    public final int method288(int arg0) {
        ++field4973;
        if (arg0 != -10420) {
            field4970 = null;
        }
        if (this.field4960.field904 != null) {
            class54 var2 = this.field4960.method343(-1);
            if (var2 != null && var2.field921 != -1) {
                return var2.field921;
            }
        }
        return this.field4960.field921;
    }
}
