import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class237 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "Ljava/lang/String;")
    public String field3563;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "Ljava/lang/String;")
    public String field3565;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "Ljava/lang/String;")
    public String field3567;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "Ljn;")
    public static class134 field3566 = new class134(38, -1);

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 6)
    public static void method1614(byte arg0) {
        if (arg0 == -31) {
            field3566 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 27)
    public class237(String arg0, String arg1, String arg2) {
        this.field3563 = arg2;
        this.field3565 = arg0;
        this.field3567 = arg1;
    }
}
