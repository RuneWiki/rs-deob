import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class248 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3880;

    static {
        new class234("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)[Lri;", line = 4)
    public static final class75[] method1676(byte arg0) {
        field3880++;
        return arg0 == 94 ? new class75[] { class518.field7543, class518.field7546, class518.field7547, class518.field7548, class518.field7549, class518.field7550, class518.field7551, class518.field7552, class518.field7553, class518.field7554, class518.field7555, class518.field7556 } : null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1677(int arg0) {
        field3879++;
        if (class120.field1806.length() == 0 || arg0 <= 18) {
            return;
        }
        class6.method33((byte) 15, "--> " + class120.field1806);
        class447.method2742(false, class120.field1806, 3825);
        class484.field6963 = 0;
        class120.field1806 = "";
        class232.field3750 = 0;
    }
}
