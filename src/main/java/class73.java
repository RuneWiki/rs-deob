import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class73 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field1007 = 0;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "Ll;")
    public static class127 field1011;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILsm;)Ljava/lang/String;", line = 5)
    public static final String method513(int arg0, class477 arg1) {
        if (arg0 == 0) {
            field1010++;
            return arg1.field7037 == null || arg1.field7037.length() <= 0 ? arg1.field7028 : arg1.field7028 + class145.field2180.method2103(class30.field430, (byte) 34) + arg1.field7037;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 28)
    public static void method514(byte arg0) {
        field1011 = null;
        if (arg0 > -68) {
            method513(62, null);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 40)
    public static final void method515(int arg0, int arg1, int arg2, String arg3, String arg4, String arg5) {
        class273.method1702(arg3, (byte) -117, arg1, arg2, arg4, -1, null, arg5);
        field1008++;
        if (arg0 <= 124) {
            method514((byte) 72);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIZZ)Lok;", line = 51)
    public static final class74 method516(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field1009++;
        class292 var5 = null;
        if (arg2 != -1) {
            return null;
        }
        if (class95.field1478 != null) {
            var5 = new class292(arg1, class95.field1478, class75.field1059[arg1], 1000000);
        }
        class112.field1717[arg1] = class37.field504.method353(var5, arg1, class529.field7794, 96);
        if (arg4) {
            class112.field1717[arg1].method2583(-13122);
        }
        return new class74(class112.field1717[arg1], arg3, arg0);
    }
}
