import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class7 extends RuntimeException {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Ljava/lang/String;")
    public String field81;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field82;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lqe;")
    public static class168 field78 = class66.method448(")4a=", 53);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lqe;")
    private static class168 field76 = class66.method448("Free world", 41);

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lqe;")
    public static class168 field80 = class66.method448("hint_headicons", 89);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lqe;")
    public static class168 field77 = class66.method448("huffman", -118);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lqe;")
    public static class168 field79 = field76;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lhh;")
    public static class121 field85;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lrd;")
    public static class207 field83;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[[B")
    public static byte[][] field84;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method31(boolean arg0) {
        field80 = null;
        field85 = null;
        field84 = null;
        field79 = null;
        field78 = null;
        field83 = null;
        if (!arg0) {
            field85 = null;
        }
        field77 = null;
        field76 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class7(Throwable arg0, String arg1) {
        this.field81 = arg1;
        this.field82 = arg0;
    }
}
