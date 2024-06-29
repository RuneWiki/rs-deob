import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class203 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lhc;")
    public static class368 field2887 = new class368("glow1:", "", "", "");

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Ljm;")
    public static class162 field2889 = new class162();

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[[Z")
    public static boolean[][] field2890 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
    public static int[] field2892 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lle;")
    public static class65 field2891 = new class65(128);

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field2893 = 500;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method1386(byte arg0) {
        field2889 = null;
        if (arg0 >= 100) {
            field2891 = null;
            field2887 = null;
            field2890 = null;
            field2892 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1387(int arg0, String arg1, String arg2, int arg3) {
        field2888++;
        class339.field4592 = arg3;
        class54.field689 = arg1;
        class129.field1952 = arg2;
        if (class129.field1952.equals("") || class54.field689.equals("")) {
            class310.field4205 = 3;
        } else if (class399.field5517 == -1) {
            class83.field1139 = 0;
            class393.field5452 = 1;
            class304.field4145 = 0;
            class310.field4205 = -3;
            class366 var4 = new class366(128);
            var4.method2280(10, 1537846408);
            var4.method2261((int) (Math.random() * 9.9999999E7D), arg0 - 100000175);
            var4.method2256(class264.method1689(class129.field1952, (byte) 110), -125);
            var4.method2261((int) ((double) arg0 * Math.random()), -176);
            var4.method2285(class54.field689, (byte) -97);
            var4.method2261((int) (Math.random() * 9.9999999E7D), arg0 ^ 0xFA0A1FAF);
            var4.method2269(class103.field1419, (byte) -121, class267.field3665);
            class88.field1232.field5048 = 0;
            class88.field1232.method2280(24, arg0 + 1437846409);
            class88.field1232.method2280(var4.field5048 + 2, 1537846408);
            class88.field1232.method2275(-109, 565);
            class88.field1232.method2301(var4.field5048, var4.field5076, (byte) -79, 0);
        } else {
            class19.method114(0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static final void method1388(int arg0) {
        field2886++;
        if (class428.field5953 != -1) {
            class24.method144(class428.field5953, -1, -1, (byte) -30, false);
            class428.field5953 = -1;
        }
        if (arg0 < 35) {
            field2892 = null;
        }
    }
}
