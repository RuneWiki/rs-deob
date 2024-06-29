import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class360 extends class435 {

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "[[I")
    public static int[][] field4889;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Lao;")
    public static class191 field4890;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public int field4886;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public int field4888;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljk;B)Ljava/lang/String;")
    public static final String method2125(class450 arg0, byte arg1) {
        field4887++;
        if (client.method1253(arg0).method1401(-105) == 0) {
            return null;
        }
        if (arg1 != -7) {
            field4889 = null;
        }
        if (arg0.field6647 == null || arg0.field6647.trim().length() == 0) {
            return class94.field1134 ? "Hidden-use" : null;
        } else {
            return arg0.field6647;
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
    public static void method2126(int arg0) {
        field4890 = null;
        field4889 = null;
        if (arg0 != 3787) {
            method2126(-114);
        }
    }

    static {
        new class305("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        new class305("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field4889 = new int[128][128];
        field4890 = new class191(28, 4);
    }
}
