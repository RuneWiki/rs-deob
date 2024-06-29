import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class306 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Laq;")
    public static class340 field4807;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public abstract void method2057(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)[Lkq;")
    public static final class534[] method2058(byte arg0) {
        if (arg0 != 10) {
            method2063(0.18656127F, 74);
        }
        field4805++;
        if (class289.field4570 == null) {
            class534[] var1 = class304.method2054(class339.field5294, arg0 ^ 0xFFFFFF99);
            class534[] var2 = new class534[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class534 var8 = var1[var4];
                if ((var8.field7827 <= 0 || var8.field7827 >= 24) && var8.field7824 >= 800 && var8.field7825 >= 600 && (class491.field7438 >= 96 || class452.field7013 != 0 || var8.field7824 <= 1024 && var8.field7825 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class534 var10 = var2[var9];
                        if (var8.field7824 == var10.field7824 && var8.field7825 == var10.field7825) {
                            if (var8.field7827 > var10.field7827) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class289.field4570 = new class534[var3];
            class324.method2168(var2, 0, class289.field4570, 0, var3);
            int[] var5 = new int[class289.field4570.length];
            for (int var6 = 0; var6 < class289.field4570.length; var6++) {
                class534 var7 = class289.field4570[var6];
                var5[var6] = var7.field7825 * var7.field7824;
            }
            class304.method2053(var5, class289.field4570, -43);
        }
        return class289.field4570;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lhw;I)Lmw;")
    public static final class329 method2059(class208 arg0, int arg1) {
        field4809++;
        if (arg1 != 5) {
            method2065((byte) -3);
        }
        return new class329(arg0.method1456(13329), arg0.method1456(13329), arg0.method1456(13329), arg0.method1456(13329), arg0.method1456(13329), arg0.method1456(arg1 ^ 0x3414), arg0.method1456(13329), arg0.method1456(13329), arg0.method1452(arg1 - 2), arg0.method1445(22));
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lne;")
    public abstract class132 method2060(int arg0);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)[B")
    public abstract byte[] method2061(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public static final void method2062(byte arg0) {
        class310.field4844.method523(-1, 5);
        field4806++;
        class32.field333.method1130(5, false);
        class17.field178.method1027((byte) 28, 5);
        class454.field7029.method3005(500, 5);
        class6.field72.method2978(false, 5);
        class337.field5262.method2076(5, (byte) 88);
        class388.field5915.method1696(5, -1386);
        class85.field1242.method1975(5, -1);
        class197.field3037.method763(true, 5);
        class322.field5027.method599((byte) -116, 5);
        class19.field199.method2289(1, 5);
        class457.field7049.method659(-10066, 5);
        class453.field7020.method2742(5, 96);
        class274.field4353.method1168(11, 5);
        class360.field5583.method127(5, 9);
        class93.field1361.method839(0, 5);
        class187.field2727.method775(false, 5);
        class525.field7743.method553(5, true);
        class359.field5569.method1767(5, (byte) -90);
        class436.field6588.method344(-97, 5);
        class364.method2395(5, (byte) 98);
        class248.method1717(50, -30375);
        class332.method2214(5, 19060);
        class407.method2607(5, 0);
        class121.field1653.method2202(0, 5);
        class122.field1660.method2202(0, 5);
        class174.field2538.method2202(0, 5);
        if (arg0 < -11) {
            class316.field4933.method2202(0, 5);
            class420.field6380.method2202(0, 5);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(FI)F")
    public static final float method2063(float arg0, int arg1) {
        field4810++;
        return arg1 == -15 ? arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) : -0.11807136F;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)I")
    public abstract int method2064(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
    public static void method2065(byte arg0) {
        if (arg0 != -84) {
            method2065((byte) 63);
        }
        field4807 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lmn;I)V")
    public static final void method2066(class162 arg0, int arg1) {
        if (arg1 != -22123) {
            method2066(null, -20);
        }
        field4804++;
        class377.field5793 = arg0;
    }
}
