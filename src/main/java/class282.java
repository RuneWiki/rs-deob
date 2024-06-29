import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class282 extends class406 {

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lwq;")
    public class92 field3989 = new class92();

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lon;")
    public static final class184 method1863(int arg0, int arg1) {
        field3987++;
        int var2 = arg0 >> 16;
        if (arg1 != -25835) {
            field3988 = 20;
        }
        int var3 = arg0 & 0xFFFF;
        if (class98.field1194[var2] == null || class98.field1194[var2][var3] == null) {
            boolean var4 = class98.method545(var2, (byte) 11);
            if (!var4) {
                return null;
            }
        }
        return class98.field1194[var2][var3];
    }

    static {
        new class362("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
