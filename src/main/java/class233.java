import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class233 extends class331 {

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
    public static boolean field3012 = false;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Lmq;")
    public static class78 field3013 = new class78(73, 2);

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "Lmq;")
    public static class78 field3016 = new class78(77, 3);

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Lmq;")
    public static class78 field3017 = new class78(97, 4);

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field3019 = 0;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[Ljaa;")
    public static class266[] field3018;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)I")
    public static final int method1468(int arg0, byte arg1) {
        ++field3010;
        int var2 = 0;
        if (~arg0 > -1 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 16;
        }
        if (arg1 != -37) {
            method1468(99, (byte) 111);
        }
        if (~arg0 <= -257) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (~arg0 <= -17) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (~arg0 <= -5) {
            var2 += 2;
            arg0 >>>= 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)I")
    public final int method1469(byte arg0) {
        ++field3015;
        if (arg0 >= -119) {
            field3016 = null;
        }
        return super.field4202;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field3014;
        if (arg1 != 1) {
            this.method1469((byte) 52);
        }
        return 3;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lts;)V")
    public class233(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(ILts;)V")
    public class233(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field3008;
        if (arg0 != -1959) {
            field3012 = true;
        }
        super.field4202 = this.method226((byte) 13);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
    public static void method1470(boolean arg0) {
        field3017 = null;
        field3013 = null;
        field3018 = null;
        field3016 = null;
        if (arg0) {
            method1470(true);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        if (arg0 <= 113) {
            field3016 = null;
        }
        super.field4202 = arg1;
        ++field3009;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        ++field3011;
        if (arg0 != 13) {
            this.method227(-120, 69);
        }
        return !super.field4203.method344((byte) -81) ? 0 : 1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZFIIIIZ)[[I")
    public static final int[][] method1471(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        ++field3007;
        int[][] var9 = new int[arg0][arg7];
        class703 var10 = new class703();
        var10.field9913 = (int) (arg3 * 4096.0F);
        var10.field9909 = arg4;
        var10.field9916 = arg6;
        if (arg2) {
            return null;
        } else {
            var10.field9915 = arg1;
            var10.field9906 = arg8;
            var10.method303(-97);
            class101.method679(arg7, 0, arg0);
            for (int var11 = 0; var11 < arg0; ++var11) {
                var10.method3901(var11, var9[var11], 90);
            }
            return var9;
        }
    }
}
