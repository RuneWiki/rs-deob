import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class247 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field4040 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4041 = " ";

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Z")
    public static boolean field4046 = false;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field4042 = 0;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4044 = 0;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field4047 = -1;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lth;")
    public static class57 field4045;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 7)
    public static void method1906(int arg0) {
        if (arg0 != -1) {
            field4041 = (String) null;
        }
        field4041 = null;
        field4045 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Lan;", line = 18)
    public static final class87 method1907(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class87 var4 = var3.field538;
            var3.field538 = null;
            return var4;
        }
    }
}
