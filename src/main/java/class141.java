import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class141 extends class529 {

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public volatile int field1908 = -1;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "Ljava/lang/String;")
    public volatile String field1910;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field1907 = 0;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "Llt;")
    public static class227 field1911;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Lmt;")
    public static class321 field1909;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static void method856(int arg0) {
        field1911 = null;
        if (arg0 != -1) {
            method856(120);
        }
        field1909 = null;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class141(String arg0) {
        this.field1910 = arg0;
    }

    static {
        new class46("", 76);
    }
}
