import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class154 extends class145 {

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    private int field2344 = 4096;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "Lac;")
    public static class216 field2340;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "Lrk;")
    public static class427 field2342;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "[I")
    public static int[] field2341;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public static void method1181(boolean arg0) {
        field2340 = null;
        if (arg0) {
            field2341 = null;
            field2342 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lrk;Lrk;I)I")
    public static final int method1182(class427 arg0, class427 arg1, int arg2) {
        ++field2339;
        int var3 = arg2;
        if (arg1.method2635(class14.field107, (byte) -62)) {
            var3 = arg2 + 1;
        }
        if (arg1.method2635(class398.field5563, (byte) -74)) {
            ++var3;
        }
        if (arg1.method2635(class128.field1805, (byte) 122)) {
            ++var3;
        }
        if (arg0.method2635(class14.field107, (byte) -71)) {
            ++var3;
        }
        if (arg0.method2635(class398.field5563, (byte) 108)) {
            ++var3;
        }
        if (arg0.method2635(class128.field1805, (byte) 49)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class154() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2344 = arg0.method1853(-75);
        }
        int var4 = -123 % ((arg1 - 11) / 52);
        ++field2343;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2336;
        int[] var3 = super.field2218.method1614(86, arg0);
        int var4 = -60 / ((arg1 - 16) / 49);
        if (super.field2218.field3396) {
            int[] var5 = this.method1119(0, 0, arg0 + -1 & class402.field5610);
            int[] var6 = this.method1119(0, 0, arg0);
            int[] var7 = this.method1119(0, 0, class402.field5610 & arg0 + 1);
            for (int var8 = 0; class156.field2364 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field2344;
                int var10 = (var6[class40.field606 & var8 + 1] - var6[class40.field606 & var8 + -1]) * this.field2344;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var13 - -var14 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = ~var15 != -1 ? 16777216 / var15 : 0;
                var3[var8] = -var16 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
    public static final void method1183(int arg0, int arg1) {
        if (arg0 == -1) {
            ++field2335;
            class450 var2 = class59.method540(2, arg1, arg0 ^ -1001);
            var2.method2798(arg0 ^ 664528977);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 > -49) {
            method1181(true);
        }
        ++field2338;
        class128 var10 = null;
        for (class128 var11 = (class128) class399.field5584.method1240((byte) -97); var11 != null; var11 = (class128) class399.field5584.method1245(1)) {
            if (var11.field1808 == arg2 && ~var11.field1827 == ~arg6 && ~var11.field1816 == ~arg7 && ~var11.field1819 == ~arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class128();
            var10.field1808 = arg2;
            var10.field1827 = arg6;
            var10.field1816 = arg7;
            var10.field1819 = arg1;
            class3.method14(49, var10);
            class399.field5584.method1249(var10, (byte) -121);
        }
        var10.field1818 = arg9;
        var10.field1804 = arg4;
        var10.field1822 = arg0;
        var10.field1806 = arg5;
        var10.field1812 = arg8;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)I")
    public static final int method1185(int arg0, byte arg1, int arg2) {
        int var3 = 116 % ((arg1 - -11) / 62);
        if (arg2 < arg0) {
            int var4 = arg2;
            arg2 = arg0;
            arg0 = var4;
        }
        ++field2337;
        while (~arg0 != -1) {
            int var5 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var5;
        }
        return arg2;
    }
}
