import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class183 {

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "J")
    public static long field2399 = 0L;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lkg;")
    public static class179 field2396 = new class179(67, 2);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lla;")
    public static class316 field2401;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lqn;")
    public static class47 field2402;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field2396 = null;
        field2401 = null;
        if (arg0 != 67) {
            method1158(8, -72, -49, -72, 72, 25, -17);
        }
        field2402 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lqn;B)V")
    public static final void method1156(class47 arg0, byte arg1) {
        if (arg1 != 102) {
            method1155(17);
        }
        class323.field4095 = arg0;
        field2397++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
    public static final void method1157(int arg0, int arg1) {
        field2398++;
        if (arg0 != -1979328921) {
            field2396 = null;
        }
        if (class325.field4122 == 1) {
            class25.field361 = arg1;
        } else if (class325.field4122 == 2 || class325.field4122 == 3) {
            class320.field4062 = arg1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class496 var7 = (class496) class214.field2754.method2097((byte) 86); var7 != null; var7 = (class496) class214.field2754.method2091(-1)) {
            if (var7.field7200 <= class163.field2065) {
                var7.method603(arg1 + 1979328921);
            } else {
                class275.method1621(arg4 >> 1, arg3, arg0, (var7.field7212 << 7) + 64, var7.field7207, 25587, arg5 >> 1, (var7.field7204 << 7) + 64, var7.field7202 * 2);
                class91.field1116.method1852(class46.field558[1] + arg6, -32458, class46.field558[0] + arg2, 0, var7.field7205, var7.field7208 | 0xFF000000);
            }
        }
        if (arg1 != -1979328921) {
            method1155(36);
        }
        field2400++;
    }
}
