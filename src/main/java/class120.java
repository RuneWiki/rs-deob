import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class120 {

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Loh;")
    public static class258 field2114 = class153.method1046(")1a2)1m", 117);

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
    public static int[] field2116 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Loh;")
    public static class258 field2117 = class153.method1046("", 118);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Loh;")
    public static class258 field2111 = class153.method1046("cookieprefix", 126);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field2120 = 2;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Loh;")
    private static class258 field2113 = class153.method1046("", 119);

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Loh;")
    public static class258 field2119 = field2113;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Z")
    public static boolean field2123 = false;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2112;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[Ldb;")
    public static class41[] field2122;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2118++;
        if (class241.field4189 <= arg1 && arg1 <= class94.field1654) {
            int var5 = class203.method1347(class75.field1314, arg0, 1, class206.field3562);
            int var6 = class203.method1347(class75.field1314, arg3, 1, class206.field3562);
            class168.method1115(var6, (byte) 12, var5, arg4, arg1);
        }
        int var7 = -54 % ((-arg2 - 53) / 43);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)V", line = 65)
    public static final void method877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2121++;
        int var6 = -84 / ((70 - arg4) / 53);
        for (int var7 = arg0; var7 <= arg2; var7++) {
            class19.method126(7, arg1, class154.field2638[var7], arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 98)
    public static void method878(int arg0) {
        field2119 = null;
        field2113 = null;
        field2122 = null;
        field2114 = null;
        field2117 = null;
        field2116 = null;
        field2112 = null;
        if (arg0 != 19688) {
            field2114 = (class258) null;
        }
        field2111 = null;
    }
}
