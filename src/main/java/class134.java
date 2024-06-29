import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class134 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Ljava/lang/String;")
    public String field2104;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Ljava/lang/String;")
    public String field2100;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Ljava/lang/String;")
    public String field2099;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Ldk;")
    public static class508 field2102;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)J")
    public static final long method1064(int arg0) {
        field2103++;
        if (arg0 != -8839) {
            method1066(121, null);
        }
        return class184.field2629.method2080(112);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method1065(byte arg0) {
        field2102 = null;
        if (arg0 != -82) {
            method1065((byte) -43);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1066(int arg0, String arg1) {
        field2101++;
        if (arg1.equals("")) {
            return;
        }
        class84.field1530++;
        class135 var2 = class273.method1801(class459.field6629, class744.field10422, 2);
        var2.field2109.method263((byte) -89, class552.method3233((byte) -63, arg1));
        var2.field2109.method287((byte) 0, arg1);
        if (arg0 != -7884) {
            field2102 = null;
        }
        class539.method3178(var2, -18925);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class134(String arg0, String arg1, String arg2) {
        this.field2104 = arg1;
        this.field2100 = arg0;
        this.field2099 = arg2;
    }
}
