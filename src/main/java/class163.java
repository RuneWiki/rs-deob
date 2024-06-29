import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class163 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2880 = 0;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[Lao;")
    public static class200[] field2882 = new class200[4];

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    public static boolean field2883 = false;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILcg;BLcg;)Lti;", line = 9)
    public static final class244 method1295(int arg0, int arg1, class49 arg2, byte arg3, class49 arg4) {
        field2879++;
        if (arg3 != 38) {
            method1296((byte) -53);
        }
        return class325.method2262(arg0, (byte) -57, arg2, arg1) ? class79.method722(true, arg4.method441(false, arg1, arg0)) : null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 24)
    public static final void method1296(byte arg0) {
        class119.field2067 = 0;
        field2881++;
        class34.field489 = 0;
        class241.method1690((byte) 47);
        class142.method1146(-3);
        class330.method2288(-16);
        class176.method1364(1630955528);
        for (int var1 = 0; var1 < class34.field489; var1++) {
            int var2 = class180.field3037[var1];
            if (class181.field3045 != class135.field2359[var2].field2029) {
                if (class135.field2359[var2].field3483 > 0) {
                    class30.method282(class135.field2359[var2], -1);
                }
                class135.field2359[var2] = null;
            }
        }
        if (arg0 != 105) {
            method1296((byte) 123);
        }
        if (class308.field4906 != class276.field4398.field5353) {
            throw new RuntimeException("gpp1 pos:" + class276.field4398.field5353 + " psize:" + class308.field4906);
        }
        for (int var3 = 0; var3 < class291.field4664; var3++) {
            if (class135.field2359[class119.field2064[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class291.field4664);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V", line = 83)
    public static void method1297(byte arg0) {
        field2882 = null;
        if (arg0 != 97) {
            method1298((byte) -103);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)Lna;", line = 107)
    public static final class30 method1298(byte arg0) {
        if (arg0 != -8) {
            field2883 = false;
        }
        field2884++;
        class30 var1 = (class30) class253.field4074.method849(128);
        if (var1 != null) {
            var1.method2195(-1);
            var1.method1067(40000);
            return var1;
        }
        class30 var2;
        do {
            var2 = (class30) class135.field2357.method849(128);
            if (var2 == null) {
                return null;
            }
            if (var2.method281(55) > class306.method2102(-289)) {
                return null;
            }
            var2.method2195(-1);
            var2.method1067(arg0 + 40008);
        } while ((Long.MIN_VALUE & var2.field2214) == 0L);
        return var2;
    }
}
