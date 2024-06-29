import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class463 extends class386 implements class529 {

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "Lbi;")
    public class335 field6818;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "Z")
    private boolean field6806;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "Lbg;")
    public static class324 field6812 = new class324(72, 6);

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 4)
    public final void method39(int arg0) {
        ++field6805;
        if (arg0 > -18) {
            this.field6818 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(Lya;I)Lfk;", line = 15)
    public final class462 method38(class38 arg0, int arg1) {
        ++field6808;
        class471 var3 = this.field6818.method2042(super.field5676, true, arg0, super.field5697, 2048, (byte) 119, false);
        if (var3 == null) {
            return null;
        } else {
            class122 var4 = arg0.method362();
            var4.method249(super.field5697 - -super.field5674, super.field5686, super.field5676 - -super.field5675);
            class462 var5 = null;
            if (this.field6806) {
                var5 = class482.method2908(1, (byte) -95);
            }
            if (arg1 >= -87) {
                this.field6818 = null;
            }
            if (this.field6818.field4660 == null) {
                var3.method457(var4, var5 == null ? null : var5.field6800[0], 0);
            } else {
                class88 var6 = this.field6818.field4660.method1331();
                arg0.method324(var3, var6, var4, var5 == null ? null : var5.field6800[0], 0);
            }
            int var7 = super.field5697 >> 7;
            int var8 = super.field5676 >> 7;
            this.field6818.method2050(true, var8, 28146, var3, var7, arg0, var8, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Z", line = 57)
    public static final boolean method2776(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            field6812 = null;
        }
        ++field6816;
        return (33 & arg1) != 0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I", line = 70)
    public final int method22(byte arg0) {
        ++field6811;
        if (arg0 != -70) {
            field6812 = null;
        }
        return this.field6818.field4672;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLya;)V", line = 86)
    public final void method26(boolean arg0, class38 arg1) {
        if (!arg0) {
            field6812 = null;
        }
        this.field6818.method2052(arg0, arg1);
        ++field6820;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Z", line = 100)
    public final boolean method30(int arg0) {
        ++field6815;
        if (arg0 != 10869) {
            this.field6818 = null;
        }
        return this.field6818.method2048(-1);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)I", line = 116)
    public final int method228(boolean arg0) {
        if (arg0) {
            return 55;
        } else {
            ++field6804;
            return this.field6818.method2044((byte) -117);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)I", line = 127)
    public final int method27(int arg0) {
        ++field6809;
        int var2 = 89 % ((arg0 - 39) / 41);
        return this.field6818.field4650;
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V", line = 137)
    public static void method2777(int arg0) {
        field6812 = null;
        if (arg0 != 6) {
            field6812 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZIIZII)V", line = 153)
    public static final void method2778(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field6807;
        class76.field1039 = arg3;
        if (!arg4) {
            field6812 = null;
        }
        class318.field4514 = arg0;
        class258.field3805 = arg2;
        class283.field4121 = arg6;
        class85.field1158 = arg5;
        if (arg1 && class258.field3805 >= 100) {
            class161.field2268 = class85.field1158 * 128 - -64;
            class486.field7138 = class76.field1039 * 128 + 64;
            class487.field7162 = class66.method643(class161.field2268, 49, class525.field7714, class486.field7138) + -class318.field4514;
        }
        class462.field6802 = 2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lya;I)V", line = 178)
    public final void method31(class38 arg0, int arg1) {
        if (arg1 != -12694) {
            this.field6806 = true;
        }
        this.field6818.method2046(arg1 ^ -274838, arg0);
        ++field6814;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lvu;Lvu;I)V", line = 189)
    public static final void method2779(class223 arg0, class223 arg1, int arg2) {
        int var3 = 83 % ((-47 - arg2) / 37);
        if (arg1.field3269 != null) {
            arg1.method1525((byte) 87);
        }
        ++field6813;
        arg1.field3269 = arg0.field3269;
        arg1.field3275 = arg0;
        arg1.field3269.field3275 = arg1;
        arg1.field3275.field3269 = arg1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lya;II)Lt;", line = 206)
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        ++field6810;
        int var4 = -112 % ((arg2 - 54) / 56);
        return this.field6818.method2042(0, false, arg0, 0, arg1, (byte) 120, false);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lya;Lrd;IIIIIZIIIIII)V", line = 216)
    public class463(class38 arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class14.method89(arg12, (byte) 58, arg11));
        this.field6818 = new class335(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field6806 = ~arg1.field3200 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILya;I)Z", line = 225)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field6819;
        class471 var5 = this.field6818.method2042(super.field5676, false, arg2, super.field5697, 131072, (byte) 122, false);
        if (arg1 != 0) {
            this.field6818 = null;
        }
        if (var5 == null) {
            return false;
        } else {
            class122 var6 = arg2.method362();
            var6.method249(super.field5697 - -super.field5674, super.field5686, super.field5676 + super.field5675);
            return var5.method443(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Lya;I)V", line = 246)
    public final void method35(class38 arg0, int arg1) {
        ++field6817;
        if (arg1 < 53) {
            this.field6818 = null;
        }
        class471 var3 = this.field6818.method2042(super.field5676, true, arg0, super.field5697, 262144, (byte) 126, false);
        if (var3 != null) {
            int var4 = super.field5697 >> 7;
            int var5 = super.field5676 >> 7;
            this.field6818.method2050(false, var5, 28146, var3, var4, arg0, var5, var4);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)I", line = 268)
    public final int method28(boolean arg0) {
        if (!arg0) {
            this.field6818 = null;
        }
        ++field6821;
        return this.field6818.field4668;
    }
}
