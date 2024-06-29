import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class357 extends class132 {

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lvg;")
    public static class622 field5274 = new class622(42, -2);

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lcr;")
    public static class162 field5280;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Llr;B)V")
    public static final void method2200(class311 arg0, byte arg1) {
        arg0.method1941(-126);
        ++field5275;
        int var2 = class478.field6850;
        class71 var3 = class321.field4681 = class35.field551[var2] = new class71();
        var3.field7405 = var2;
        if (arg1 != 9) {
            method2202(99, -4, (byte[]) null, -109, false, -128);
        }
        int var4 = arg0.method1946(30, (byte) 121);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (268423812 & var4) >> 14;
        int var7 = var4 & 16383;
        var3.field7430[0] = -class397.field6005 + var6;
        var3.field7895 = (var3.field7430[0] << 9) - -(var3.method422((byte) -84) << 8);
        var3.field7429[0] = var7 - class403.field6049;
        var3.field7896 = (var3.field7429[0] << 9) + (var3.method422((byte) 55) << 8);
        class49.field779 = var3.field7905 = var3.field7900 = var5;
        if (class125.method898(117, var3.field7430[0], var3.field7429[0])) {
            ++var3.field7900;
        }
        if (class46.field715[var2] != null) {
            var3.method419(false, class46.field715[var2]);
        }
        class416.field6150 = 0;
        class35.field554[class416.field6150++] = var2;
        class1.field2[var2] = 0;
        class688.field9713 = 0;
        for (int var8 = 1; ~var8 > -2049; ++var8) {
            if (var2 != var8) {
                int var9 = arg0.method1946(18, (byte) 123);
                int var10 = var9 >> 16;
                int var11 = (var9 & 65413) >> 8;
                int var12 = var9 & 255;
                class143 var13 = class262.field3402[var8] = new class143();
                var13.field2063 = 0;
                var13.field2062 = -1;
                var13.field2064 = false;
                var13.field2065 = (var10 << 28) + (var11 << 14) + var12;
                class448.field6498[class688.field9713++] = var8;
                class1.field2[var8] = 0;
            }
        }
        arg0.method1935((byte) -127);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIZ)Lmv;")
    public static final class295 method2201(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != -5400) {
            field5274 = null;
        }
        ++field5276;
        class19 var4 = null;
        if (class687.field9702 != null) {
            var4 = new class19(arg0, class687.field9702, class496.field7024[arg0], 1000000);
        }
        class81.field1311[arg0] = class550.field8096.method2288(true, var4, class552.field8124, arg0);
        class81.field1311[arg0].method3499((byte) 120);
        return new class295(class81.field1311[arg0], arg3, arg2);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZII)V")
    public final void method939(int arg0, boolean arg1, int arg2, int arg3) {
        ++field5279;
        int var5 = this.method942(17686) * super.field1909.field2337 / 10000;
        class332.field4821.method700(arg3, arg2 + 2, var5, super.field1909.field2332 + -2, ((class100) super.field1909).field1519, 0);
        class332.field4821.method700(arg3 - -var5, arg2 - -2, -var5 + super.field1909.field2337, super.field1909.field2332 + -2, 0, 0);
        if (arg0 != 24626) {
            field5280 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIII)V")
    public final void method945(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg2 < -25) {
            ++field5281;
            class332.field4821.method633(arg1 + -2, arg3, super.field1909.field2337 + 4, super.field1909.field2332 + 2, ((class100) super.field1909).field1521, 0);
            class332.field4821.method633(arg1 + -1, arg3 + 1, super.field1909.field2337 + 2, super.field1909.field2332, 0, 0);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lmv;Lmv;Liaa;)V")
    public class357(class295 arg0, class295 arg1, class100 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II[BIZI)V")
    public static final void method2202(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, int arg5) {
        ++field5277;
        if (~arg1 < ~arg3) {
            int var6 = -arg3 + arg1 >> 2;
            if (arg4) {
                field5274 = null;
            }
            int var7 = arg0 + arg3;
            while (true) {
                --var6;
                if (~var6 > -1) {
                    int var8 = 3 & -arg3 + arg1;
                    while (true) {
                        --var8;
                        if (var8 < 0) {
                            return;
                        }
                        arg2[var7++] = 1;
                    }
                }
                arg2[var7++] = 1;
                arg2[var7++] = 1;
                arg2[var7++] = 1;
                arg2[var7++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public static void method2203(byte arg0) {
        field5274 = null;
        field5280 = null;
        if (arg0 != 1) {
            field5274 = null;
        }
    }
}
