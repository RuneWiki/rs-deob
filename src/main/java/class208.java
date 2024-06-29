import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class208 extends class61 {

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "Lrm;")
    public class245 field3400;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field3392 = -1;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "[J")
    public static long[] field3391 = new long[500];

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Lwm;")
    public static class152 field3395 = class157.method1048("d-Broulement:", 109);

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "Lwm;")
    private static class152 field3398 = class157.method1048("Created gameworld", 123);

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Lwm;")
    public static class152 field3396 = field3398;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "Loe;")
    public static class127 field3394;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Lhk;", line = 22)
    public static final class303 method1400(byte arg0) {
        int var1 = 38 % ((arg0 - 40) / 42);
        field3399++;
        class303 var2 = (class303) class283.field4814.method333((byte) 86);
        if (var2 != null) {
            var2.method1880(-25368);
            var2.method402(0);
            return var2;
        }
        class303 var3;
        do {
            var3 = (class303) class125.field1753.method333((byte) 89);
            if (var3 == null) {
                return null;
            }
            if (var3.method2116((byte) -107) > class76.method507(-30994)) {
                return null;
            }
            var3.method1880(-25368);
            var3.method402(0);
        } while ((Long.MIN_VALUE & var3.field916) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILah;)[Leg;", line = 75)
    public static final class300[] method1401(int arg0, int arg1, int arg2, class205 arg3) {
        if (arg1 == 500) {
            field3397++;
            return class86.method566(arg0, arg3, arg2, arg1 - 499) ? class148.method936((byte) -124) : null;
        } else {
            return (class300[]) null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lrm;)V", line = 100)
    public class208(class245 arg0) {
        this.field3400 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V", line = 110)
    public static void method1402(int arg0) {
        field3398 = null;
        field3394 = null;
        field3396 = null;
        field3391 = null;
        field3395 = null;
        int var1 = 10 / ((arg0 - 52) / 61);
    }
}
