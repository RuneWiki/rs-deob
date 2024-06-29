import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class63 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Ljava/lang/String;")
    public static String field945 = "Loaded sprites";

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field946 = 0;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Lde;")
    public static class364 field948;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
    public static final void method555() {
        for (int var0 = 0; var0 < class355.field5261; var0++) {
            class407 var1 = class13.field211[var0];
            class347.method2299(var1);
            class13.field211[var0] = null;
        }
        class355.field5261 = 0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIB)Z")
    public static final boolean method556(int arg0, int arg1, byte arg2) {
        field950++;
        if (arg2 != -101) {
            method556(11, -51, (byte) -107);
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        class212 var3 = class372.method2447(arg1, (byte) 18);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1393(arg0, true);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public static void method557(byte arg0) {
        field945 = null;
        if (arg0 == 25) {
            field948 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZ)V")
    public static final void method558(int arg0, boolean arg1) {
        if (!arg1) {
            field948 = null;
        }
        field951++;
        if (class381.field5579 == arg0) {
            return;
        }
        if (class381.field5579 == 0) {
            class14.method101(4);
        }
        if (arg0 == 40) {
            class273.method1808(false);
        }
        if (arg0 != 40 && class160.field2080 != null) {
            class160.field2080.method2360((byte) 123);
            class160.field2080 = null;
        }
        if (class381.field5579 == 25 || class381.field5579 == 28) {
            class90.field1225.field2501 = 2;
            class184.field2475.field2501 = 2;
            class132.field1733.field2501 = 2;
            class289.field4332.field2501 = 2;
            class60.field924.field2501 = 2;
            class112.field1440.field2501 = 2;
            class100.field1323.field2501 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class129.field1684 = 1;
            class21.field385 = 1;
            class238.field3326 = 0;
            class438.field6355 = 0;
            class265.field3924 = 0;
            class149.method1030(true, true);
            class90.field1225.field2501 = 1;
            class184.field2475.field2501 = 1;
            class132.field1733.field2501 = 1;
            class289.field4332.field2501 = 1;
            class60.field924.field2501 = 1;
            class112.field1440.field2501 = 1;
            class100.field1323.field2501 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class443.method2762(2);
        }
        if (arg0 == 5) {
            class423.method2660(class126.field1647, class118.field1532, 32245);
        } else {
            class41.method301(true);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class381.field5579 == 5 || class381.field5579 == 10 || class381.field5579 == 28;
        if (var3 != var2) {
            if (var2) {
                class400.field5855 = class162.field2139;
                if (class154.field1961 == 0) {
                    class173.method1153(2, 13422);
                } else {
                    class441.method2758(0, 2, class162.field2139, class388.field5677, 78, false, 255);
                }
                class305.field4565.method359(false, 0);
            } else {
                class173.method1153(2, 13422);
                class305.field4565.method359(true, 0);
                if (class427.field6212 != null) {
                    class427.field6212.method2722(27277);
                    class427.field6212 = null;
                }
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class126.field1647.method522();
        }
        class381.field5579 = arg0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)Lmi;")
    public static final class178 method559(int arg0, byte arg1) {
        field947++;
        class51 var2 = class223.field3073;
        class178 var4;
        synchronized (class223.field3073) {
            if (arg1 >= -94) {
                return null;
            }
            var4 = (class178) class223.field3073.method378((byte) 28, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class184.field2465.method1235(16, false, arg0);
        class178 var6 = new class178();
        if (var5 != null) {
            var6.method1174((byte) -89, new class341(var5));
        }
        class51 var7 = class223.field3073;
        synchronized (class223.field3073) {
            class223.field3073.method367((long) arg0, var6, true);
            return var6;
        }
    }
}
