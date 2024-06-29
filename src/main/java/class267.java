import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class267 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Lhn;")
    public static class509 field4084 = new class509(110, -1);

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lob;")
    public static class521 field4088 = new class521(44, 4);

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Luf;")
    public static class314 field4087;

    static {
        new class234("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 3)
    public static final void method1775(String arg0, boolean arg1, int arg2) {
        field4086++;
        if (arg0 == null) {
            return;
        }
        if (class327.field4923 >= 100) {
            class358.method2249(0, class344.field5092.method1635(class224.field3673, (byte) -65));
            return;
        }
        String var3 = class38.method286(arg0, true);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class327.field4923; var4++) {
            String var8 = class38.method286(class257.field3933[var4], true);
            if (var8 != null && var8.equals(var3)) {
                class358.method2249(arg2 ^ 0x6FCB, arg0 + class453.field6606.method1635(class224.field3673, (byte) 121));
                return;
            }
            if (class210.field3435[var4] != null) {
                String var9 = class38.method286(class210.field3435[var4], true);
                if (var9 != null && var9.equals(var3)) {
                    class358.method2249(0, arg0 + class453.field6606.method1635(class224.field3673, (byte) -35));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class64.field785; var5++) {
            String var6 = class38.method286(class221.field3622[var5], true);
            if (var6 != null && var6.equals(var3)) {
                class358.method2249(0, class173.field2590.method1635(class224.field3673, (byte) 124) + arg0 + class26.field324.method1635(class224.field3673, (byte) 126));
                return;
            }
            if (class501.field7207[var5] != null) {
                String var7 = class38.method286(class501.field7207[var5], true);
                if (var7 != null && var7.equals(var3)) {
                    class358.method2249(arg2 ^ 0x6FCB, class173.field2590.method1635(class224.field3673, (byte) -40) + arg0 + class26.field324.method1635(class224.field3673, (byte) -8));
                    return;
                }
            }
        }
        if (class38.method286(class398.field5947.field2660, true).equals(var3)) {
            class358.method2249(0, class313.field4708.method1635(class224.field3673, (byte) 126));
            return;
        }
        if (arg2 != 28619) {
            field4085 = 61;
        }
        class338.field5033++;
        class74.method640(-29627, class122.field1837);
        class71.field1020.method1545(class4.method10(arg0, arg2 ^ 0x6F82) + 1, -93);
        class71.field1020.method1534(arg0, false);
        class71.field1020.method1545(arg1 ? 1 : 0, -43);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 101)
    public static void method1776(byte arg0) {
        if (arg0 > -48) {
            field4084 = null;
        }
        field4088 = null;
        field4084 = null;
        field4087 = null;
    }
}
