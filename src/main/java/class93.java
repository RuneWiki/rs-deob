import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class93 extends RuntimeException {

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1194;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Ljava/lang/String;")
    public String field1191;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "[I")
    public static int[] field1192;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Lup;")
    public static class150 field1189;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "Lsm;")
    public static class156 field1195;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method551(int arg0) {
        field1192 = null;
        if (arg0 != 24731) {
            field1192 = null;
        }
        field1189 = null;
        field1195 = null;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class93(Throwable arg0, String arg1) {
        this.field1194 = arg0;
        this.field1191 = arg1;
    }

    static {
        new class349("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field1192 = new int[13];
    }
}
