import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class607 {

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "[B")
    public byte[] field8729;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "[S")
    public short[] field8730;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "[S")
    public short[] field8731;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "[S")
    public short[] field8734;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3453(int arg0) {
        int var1 = 109 / ((-arg0 - 74) / 38);
        field8733++;
        class190.field2967.method936(-68);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIILrj;Z)V", line = 19)
    public static final void method3454(int arg0, int arg1, int arg2, int arg3, class693 arg4, boolean arg5) {
        field8732++;
        if (arg4.field9822 == -1 && arg4.field9821 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class525.field7713.field5995 * arg4.field9825 >> 8;
        if (arg4.field9820 < arg0) {
            var6 += arg0 - arg4.field9820;
        } else if (arg0 < arg4.field9841) {
            var6 += arg4.field9841 - arg0;
        }
        if (arg1 > arg4.field9838) {
            var6 += arg1 - arg4.field9838;
        } else if (arg1 < arg4.field9827) {
            var6 += arg4.field9827 - arg1;
        }
        if (arg4.field9824 == 0 || var6 - 256 > arg4.field9824 || class525.field7713.field5995 == 0 || arg4.field9817 != arg2) {
            if (arg4.field9843 != null) {
                class387.field5675.method3092(arg4.field9843);
                arg4.field9834 = null;
                arg4.field9843 = null;
                arg4.field9840 = null;
            }
            if (arg4.field9818 != null) {
                class387.field5675.method3092(arg4.field9818);
                arg4.field9818 = null;
                arg4.field9842 = null;
                arg4.field9823 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field9824 - var6) * var7 / arg4.field9824;
        class103.field1708.method1108(85);
        int var9 = 8192;
        int var10 = (arg4.field9841 + arg4.field9820) / 2 - arg0;
        int var11 = (arg4.field9838 + arg4.field9827) / 2 - arg1;
        if (var10 != 0 || var11 != 0) {
            int var12 = -class432.field6220 - ((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var12 > 8192) {
                var12 = 16384 - var12;
            }
            int var13;
            if (var6 <= 0) {
                var13 = 8192;
            } else if (var6 >= 4096) {
                var13 = 16384;
            } else {
                var13 = var6 * 8192 / 4096 + 8192;
            }
            var9 = (16384 - var13 >> 1) + var12 * var13 / 8192;
        }
        if (arg5) {
            return;
        }
        if (arg4.field9843 != null) {
            arg4.field9843.method3650(var8);
            arg4.field9843.method3658(var9);
        } else if (arg4.field9822 >= 0) {
            int var14 = arg4.field9830 == 256 && arg4.field9835 == 256 ? 256 : class410.method2450(arg4.field9835, arg4.field9830, arg5);
            if (arg4.field9832) {
                if (arg4.field9834 == null) {
                    arg4.field9834 = class459.method2665(class445.field6444, arg4.field9822);
                }
                if (arg4.field9834 != null) {
                    if (arg4.field9840 == null) {
                        arg4.field9840 = arg4.field9834.method2663(new int[] { 22050 });
                    }
                    if (arg4.field9840 != null) {
                        class652 var18 = class652.method3663(arg4.field9840, var14, var8 << 6, var9);
                        var18.method3644(-1);
                        class387.field5675.method3088(var18);
                        arg4.field9843 = var18;
                    }
                }
            } else {
                class146 var15 = class146.method1121(class233.field3455, arg4.field9822, 0);
                if (var15 != null) {
                    class95 var16 = var15.method1120().method723(class211.field3228);
                    class652 var17 = class652.method3663(var16, var14, var8 << 6, var9);
                    var17.method3644(-1);
                    class387.field5675.method3088(var17);
                    arg4.field9843 = var17;
                }
            }
        }
        if (arg4.field9818 != null) {
            arg4.field9818.method3650(var8);
            arg4.field9818.method3658(var9);
            if (!arg4.field9818.method2555(19742)) {
                arg4.field9842 = null;
                arg4.field9823 = null;
                arg4.field9818 = null;
            }
        } else if (arg4.field9821 != null && (arg4.field9837 -= arg3) <= 0) {
            int var19 = arg4.field9830 == 256 && arg4.field9835 == 256 ? 256 : (int) ((double) (arg4.field9830 - arg4.field9835) * Math.random()) + arg4.field9835;
            if (!arg4.field9847) {
                int var20 = (int) ((double) arg4.field9821.length * Math.random());
                class146 var21 = class146.method1121(class233.field3455, arg4.field9821[var20], 0);
                if (var21 != null) {
                    class95 var22 = var21.method1120().method723(class211.field3228);
                    class652 var23 = class652.method3663(var22, var19, var8 << 6, var9);
                    var23.method3644(0);
                    class387.field5675.method3088(var23);
                    arg4.field9837 = arg4.field9829 + (int) (Math.random() * (double) (arg4.field9844 - arg4.field9829));
                    arg4.field9818 = var23;
                    return;
                }
                return;
            }
            if (arg4.field9842 == null) {
                int var24 = (int) (Math.random() * (double) arg4.field9821.length);
                arg4.field9842 = class459.method2665(class445.field6444, arg4.field9821[var24]);
            }
            if (arg4.field9842 != null) {
                if (arg4.field9823 == null) {
                    arg4.field9823 = arg4.field9842.method2663(new int[] { 22050 });
                }
                if (arg4.field9823 != null) {
                    class652 var25 = class652.method3663(arg4.field9823, var19, var8 << 6, var9);
                    var25.method3644(0);
                    class387.field5675.method3088(var25);
                    arg4.field9837 = (int) ((double) (arg4.field9844 - arg4.field9829) * Math.random()) + arg4.field9829;
                    arg4.field9818 = var25;
                    return;
                }
            }
        }
    }
}
