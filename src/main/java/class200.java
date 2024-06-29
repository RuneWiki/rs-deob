import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class200 extends class230 {

    @OriginalMember(owner = "client!lh", name = "lc", descriptor = "Lsb;")
    public static class110 field3160 = new class110(16);

    @OriginalMember(owner = "client!lh", name = "tc", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!lh", name = "sc", descriptor = "I")
    public static int field3167 = 0;

    @OriginalMember(owner = "client!lh", name = "qc", descriptor = "Ljava/lang/String;")
    public static String field3165 = "Starting 3d Library";

    @OriginalMember(owner = "client!lh", name = "yc", descriptor = "[[I")
    public static int[][] field3173 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!lh", name = "hc", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!lh", name = "ic", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!lh", name = "jc", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!lh", name = "kc", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!lh", name = "mc", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!lh", name = "nc", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!lh", name = "oc", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!lh", name = "pc", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!lh", name = "uc", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!lh", name = "vc", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!lh", name = "wc", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!lh", name = "xc", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!lh", name = "rc", descriptor = "Ljb;")
    public class188 field3166;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)I")
    public final int method1393(byte arg0) {
        ++field3158;
        if (~class297.field4695 != -1 && this.field3166.field3004 != null) {
            class188 var2 = this.field3166.method1314(-1);
            if (var2 != null && var2.field3032 != -1) {
                return var2.field3032;
            }
        }
        int var3 = 13 / ((arg0 - 75) / 47);
        return super.field3740;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)I")
    public static final int method1394(byte arg0, int arg1) {
        ++field3169;
        if (arg0 != -65) {
            field3172 = 76;
        }
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIIJILt;)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class268 arg10) {
        ++field3171;
        if (this.field3166 != null) {
            class165 var13 = ~super.field3827 != 0 && super.field3765 == 0 ? class208.method1458((byte) 97, super.field3827) : null;
            class165 var14 = ~super.field3793 == 0 || super.field3793 == this.method1636(0).field2405 && var13 != null ? null : class208.method1458((byte) 89, super.field3793);
            class158 var15 = this.field3166.method1304(-1, super.field3738, super.field3800, super.field3823, super.field3782, super.field3750, super.field3833, var14, var13, super.field3839);
            if (var15 != null) {
                super.field3811 = var15.method102();
                class188 var16 = this.field3166;
                if (var16.field3004 != null) {
                    var16 = var16.method1314(-1);
                }
                if (class113.field1624 && var16.field3041) {
                    class158 var17 = class95.method530(var14 == null ? super.field3782 : super.field3750, super.field3758, super.field3753, this.field3166.field3029, super.field3818, super.field3820, var15, var14 != null ? var14 : var13, arg0, this.field3166.field2995, this.field3166.field3059, this.field3166.field3037, (byte) -128, this.field3166.field3034);
                    var17.method101(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field3746);
                }
                this.method1639(var15, 0);
                class158 var18 = null;
                this.method1644(arg0, var15, 0);
                if (super.field3757 != -1 && ~super.field3772 != 0) {
                    class98 var19 = class79.method440(super.field3757, (byte) 14);
                    var18 = var19.method611(super.field3832, 13294, super.field3761, super.field3772);
                    if (var18 != null) {
                        var18.method838(0, -super.field3783, 0);
                        if (var19.field1317) {
                            if (~class137.field2189 != -1) {
                                var18.method820(class137.field2189);
                            }
                            if (~class182.field2898 != -1) {
                                var18.method844(class182.field2898);
                            }
                            if (class3.field48 != 0) {
                                var18.method838(0, class3.field48, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class125) var15).method853(var18);
                }
                if (this.field3166.field3034 == 1) {
                    var15.field2535 = true;
                }
                var15.method101(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3746);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public static void method1395(byte arg0) {
        field3160 = null;
        int var1 = 15 % ((arg0 - -20) / 53);
        field3173 = null;
        field3165 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "()I")
    public final int method102() {
        ++field3159;
        return super.field3811;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3163;
        if (this.field3166 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjb;)V")
    public final void method1396(byte arg0, class188 arg1) {
        this.field3166 = arg1;
        int var3 = -37 % ((-11 - arg0) / 51);
        ++field3156;
        if (super.field3746 != null) {
            super.field3746.method1800();
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
    public static final void method1397(boolean arg0, int arg1) {
        if (arg1 >= 0) {
            field3168 = 25;
        }
        class52.field674 = arg0;
        ++field3170;
        class54.field687 = !class226.method1599((byte) 124);
    }

    @OriginalMember(owner = "client!lh", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3162;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(BI)Z")
    public static final boolean method1398(byte arg0, int arg1) {
        ++field3161;
        if (arg0 != 35) {
            method1397(false, -18);
        }
        class187.field2991 = true;
        class242.field3987 = 65535 & arg1 - -1;
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3157;
        if (arg1 != 12874) {
            method1394((byte) -74, 31);
        }
        if (arg3 >= class116.field1653 && ~arg5 >= ~class114.field1634 && ~class117.field1656 >= ~arg0 && arg7 <= class132.field2105) {
            class147.method1018(arg5, arg4, arg2, arg3, arg7, (byte) -126, arg0, arg6);
        } else {
            class278.method1857(arg0, arg3, arg4, 2, arg5, arg2, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Z")
    public final boolean method1400(int arg0) {
        ++field3164;
        if (arg0 <= 63) {
            field3165 = null;
        }
        return this.field3166 != null;
    }
}
