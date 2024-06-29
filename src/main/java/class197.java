import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class197 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lvh;")
    public static class62 field3006 = new class62(260);

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field3009 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)Ldh;", line = 12)
    public static final class190 method1374(byte arg0, int arg1) {
        field3004++;
        class190 var2 = (class190) class347.field5503.method380(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -61) {
            method1377(60);
        }
        byte[] var3 = class119.field1651.method100(class321.method2239(arg1, (byte) -15), class140.method963(false, arg1), (byte) -107);
        class190 var4 = new class190();
        if (var3 != null) {
            var4.method1299(12182, new class143(var3));
        }
        class347.field5503.method377((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 40)
    public static void method1375(byte arg0) {
        field3006 = null;
        if (arg0 >= -42) {
            method1376((byte) 95);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V", line = 52)
    public static final void method1376(byte arg0) {
        if (arg0 != 16) {
            field3006 = (class62) null;
        }
        class352.field5612.method378(0);
        class252.field3986.method378(0);
        field3008++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)[Lpa;", line = 67)
    public static final class2[] method1377(int arg0) {
        class2[] var1 = new class2[class10.field101];
        if (arg0 != -23251) {
            field3009 = 5;
        }
        for (int var2 = 0; var2 < class10.field101; var2++) {
            int var3 = class259.field4093[var2] * class245.field3855[var2];
            byte[] var4 = class14.field145[var2];
            if (class203.field3082[var2]) {
                byte[] var7 = class279.field4392[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class77.method492(class261.method1840(255, var7[var9]) << 24, class251.field3978[class261.method1840(var4[var9], 255)]);
                }
                if (class272.field4317) {
                    var1[var2] = new class157(class122.field1683, class253.field4004, class110.field1518[var2], class33.field392[var2], class245.field3855[var2], class259.field4093[var2], var8);
                } else {
                    var1[var2] = new class155(class122.field1683, class253.field4004, class110.field1518[var2], class33.field392[var2], class245.field3855[var2], class259.field4093[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class251.field3978[class261.method1840(var4[var6], 255)];
                }
                if (class272.field4317) {
                    var1[var2] = new class200(class122.field1683, class253.field4004, class110.field1518[var2], class33.field392[var2], class245.field3855[var2], class259.field4093[var2], var5);
                } else {
                    var1[var2] = new class158(class122.field1683, class253.field4004, class110.field1518[var2], class33.field392[var2], class245.field3855[var2], class259.field4093[var2], var5);
                }
            }
        }
        field3007++;
        class99.method627(3735);
        return var1;
    }
}
