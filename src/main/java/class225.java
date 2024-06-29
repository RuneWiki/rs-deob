import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class225 implements class454 {

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "Lcb;")
    private class544 field3225;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "Ljava/lang/String;")
    private String field3227;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "Lke;")
    public static class622 field3229 = new class622(59, 2);

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "[I")
    public static int[] field3230 = new int[8];

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "Lke;")
    public static class622 field3231;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1555(String arg0, String arg1, int arg2, String arg3) {
        field3224++;
        int var4 = arg0.indexOf(arg3);
        if (arg2 != 0) {
            return null;
        }
        while (var4 != -1) {
            arg0 = arg0.substring(0, var4) + arg1 + arg0.substring(var4 + arg3.length());
            var4 = arg0.indexOf(arg3, arg1.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V")
    public static void method1556(byte arg0) {
        if (arg0 >= 106) {
            field3229 = null;
            field3230 = null;
            field3231 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)Lbja;")
    public final class34 method1557(int arg0) {
        if (arg0 != -29120) {
            field3230 = null;
        }
        field3228++;
        return class34.field449;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)I")
    public final int method1558(int arg0) {
        int var2 = 46 / ((44 - arg0) / 57);
        field3226++;
        return this.field3225.method3156((byte) -51, this.field3227) ? 100 : this.field3225.method3148(-67, this.field3227);
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lcb;Ljava/lang/String;)V")
    public class225(class544 arg0, String arg1) {
        this.field3225 = arg0;
        this.field3227 = arg1;
    }
}
