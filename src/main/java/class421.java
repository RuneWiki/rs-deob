import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class421 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V")
    public static final void method2461(byte arg0, int arg1) {
        field6045++;
        class73.method547(true);
        class427.method2507(arg0 + 26090);
        class239.method1434(arg0 ^ 0xFFFFFF81, true, arg1);
        class198.method1230(class123.field2027, class345.field5116, 126, class472.field7225);
        class67.method454(false, class345.field5116, class472.field7225);
        class87.method612((byte) 85, class480.field7336);
        class511.method3058((byte) 38);
        class119.method831(0);
        if (arg0 != -28) {
            method2463(-25, true);
        }
        if (client.field2992 == 10) {
            class41.method290(arg0 ^ 0x4DB9, false);
        } else if (client.field2992 == 30) {
            class189.method1196(25, -12254);
        } else if (client.field2992 == 5) {
            class114.method818(class472.field7225, 123, class345.field5116);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)V")
    public static final void method2462(int arg0, int arg1, int arg2, int arg3) {
        field6044++;
        class64 var4 = class230.method1387(arg1, (byte) 40, arg2);
        var4.method441((byte) 58);
        var4.field1059 = arg0;
        var4.field1051 = arg3;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2463(int arg0, boolean arg1) {
        if (arg1) {
            field6042 = 90;
        }
        field6041++;
        return arg0 >= 12 && arg0 <= 17;
    }

    static {
        new class423("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }
}
