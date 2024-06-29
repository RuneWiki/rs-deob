import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class71 {

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!jv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1491++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIB)Z")
    public static final boolean method787(int arg0, int arg1, byte arg2) {
        if (arg2 != 121) {
            field1489 = 17;
        }
        field1490++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIZIJIILom;)V")
    public static final void method788(int arg0, int arg1, boolean arg2, int arg3, long arg4, int arg5, int arg6, class344 arg7) {
        class585.field8450 = arg3;
        if (arg1 != 2207) {
            field1489 = 104;
        }
        field1489 = arg5;
        class339.field5051 = arg2;
        class577.field8380 = 1;
        class47.field1136 = arg7;
        field1488++;
        class399.field5805 = arg6;
        class486.field6961 = arg0;
        class673.field9587 = arg4;
        class540.field7540 = 10000;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZILlk;)V")
    public static final void method789(int arg0, boolean arg1, int arg2, class545 arg3) {
        if (!arg1) {
            field1489 = -94;
        }
        field1487++;
        if (class65.field1435) {
            class445 var4 = class200.field3105 == -1 ? null : client.field4124.method980(89, class200.field3105);
            if (client.method1825(arg3).method3529((byte) 11) && (class489.field7001 & 0x20) != 0 && (var4 == null || arg3.method3137(true, var4.field6413, class200.field3105) != var4.field6413)) {
                class643.field9235++;
                class631.method3604(57, arg3.field7755, arg3.field7702, 0L, class578.field8409, arg3.field7697, (byte) -114, true, class177.field2892 + " -> " + arg3.field7613, class97.field1726, false);
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class388.method2394(1, arg3, var5);
            if (var9 != null) {
                class631.method3604(1006, arg3.field7755, arg3.field7702, (long) (var5 + 1), var9, arg3.field7697, (byte) -65, true, arg3.field7613, class687.method3862(arg3, 10579, var5), false);
                class268.field3952++;
            }
        }
        String var6 = class701.method3910(arg3, (byte) -17);
        if (var6 != null) {
            class631.method3604(2, arg3.field7755, arg3.field7702, 0L, var6, arg3.field7697, (byte) -45, true, arg3.field7613, arg3.field7593, false);
            class7.field518++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class388.method2394(1, arg3, var7);
            if (var8 != null) {
                class631.method3604(10, arg3.field7755, arg3.field7702, (long) (var7 + 1), var8, arg3.field7697, (byte) -84, true, arg3.field7613, class687.method3862(arg3, 10579, var7), false);
                class268.field3952++;
            }
        }
        if (!client.method1825(arg3).method3531((byte) -99)) {
            return;
        }
        class186.field2997++;
        if (arg3.field7643 == null) {
            class631.method3604(46, arg3.field7755, arg3.field7702, 0L, class265.field3884.method1733(255, class140.field2466), arg3.field7697, (byte) -70, true, "", -1, false);
        } else {
            class631.method3604(46, arg3.field7755, arg3.field7702, 0L, arg3.field7643, arg3.field7697, (byte) -39, true, "", -1, false);
        }
    }
}
