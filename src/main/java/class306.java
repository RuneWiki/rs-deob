import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class306 {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "[I")
    public static int[] field4895 = new int[2048];

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4893 = 0;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[Lpl;")
    public static class111[] field4891;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 6)
    public static final void method2178(byte arg0) {
        if (arg0 >= -61) {
            field4891 = (class111[]) null;
        }
        class175.field2806++;
        field4894++;
        class36.field520.method2228(108, 16547);
        class36.field520.method1712(class275.method2052((byte) -115), -95);
        class36.field520.method1729(class298.field4779, 206);
        class36.field520.method1729(class252.field4266, 206);
        class36.field520.method1712(class267.field4482, -123);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 23)
    public static final void method2179(String arg0, int arg1) {
        field4892++;
        if (arg1 != 5348) {
            method2179((String) null, 3);
        }
        if (!arg0.equals("")) {
            class206.field3257++;
            class36.field520.method2228(193, 16547);
            class36.field520.method1712(class163.method1261(arg1 - 5347, arg0), -73);
            class36.field520.method1709(arg0, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILth;)V", line = 41)
    public static final void method2180(int arg0, class57 arg1) {
        field4896++;
        if (arg0 != 2048) {
            field4893 = -45;
        }
        class118.field1992 = arg1;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V", line = 52)
    public static void method2181(byte arg0) {
        field4895 = null;
        if (arg0 == 43) {
            field4891 = null;
        }
    }
}
