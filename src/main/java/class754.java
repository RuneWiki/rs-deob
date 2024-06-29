import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class754 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Ljava/lang/String;")
    public String field10518;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Ljava/lang/String;")
    public String field10514;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Ljava/lang/String;")
    public String field10519;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lan;")
    public static class182 field10516 = new class182(2, 7);

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lha;")
    public static class454 field10517;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lkha;")
    public static class687 field10515;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method4200(int arg0) {
        field10517 = null;
        if (arg0 == 2) {
            field10516 = null;
            field10515 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class754(String arg0, String arg1, String arg2) {
        this.field10518 = arg2;
        this.field10514 = arg0;
        this.field10519 = arg1;
    }
}
