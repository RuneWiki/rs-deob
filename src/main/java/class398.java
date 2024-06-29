import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class398 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lkc;")
    public static class157 field5708 = new class157("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lmg;")
    public static class530 field5713;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[[[B")
    public static byte[][][] field5712;

    static {
        new class157("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field5714 = 0;
        field5713 = new class530();
        new class157("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIIZ)Z", line = 9)
    public static final boolean method2357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field5715++;
        int var9 = class81.field1158.field263[arg0];
        int var10 = class81.field1158.field257[0];
        if (var9 < 0 || var9 >= class9.field111 || var10 < 0 || class192.field2809 <= var10) {
            return false;
        } else if (arg5 >= 0 && arg5 < class9.field111 && arg1 >= 0 && class192.field2809 > arg1) {
            int var11 = class295.method1710(var10, arg1, arg8, var9, class264.field3553[class81.field1158.field6279], arg6, class19.field284, arg7, arg5, arg3, arg2, class81.field1158.method116(8569), arg4, -116, class104.field1707);
            if (var11 < 1) {
                return false;
            }
            class71.field1023 = class104.field1707[var11 - 1];
            class506.field7400 = class19.field284[var11 - 1];
            class192.field2807 = false;
            class296.method1719(arg0 ^ 0x2);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 37)
    public static void method2358(int arg0) {
        field5712 = null;
        if (arg0 != 0) {
            method2358(116);
        }
        field5708 = null;
        field5713 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(CB)Z", line = 50)
    public static final boolean method2359(char arg0, byte arg1) {
        field5710++;
        if (arg1 != -51) {
            field5712 = null;
        }
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class224.field3172;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([Lo;I)V", line = 86)
    public static final void method2360(class359[] arg0, int arg1) {
        class33.field515 = arg0.length;
        field5709++;
        class271.field3684 = new class359[class33.field515 + 10];
        class288.field3907 = new int[class33.field515 + 10];
        class57.method371(arg0, 0, class271.field3684, arg1, class33.field515);
        for (int var2 = 0; var2 < class33.field515; var2++) {
            class288.field3907[var2] = class271.field3684[var2].method207();
        }
        for (int var3 = class33.field515; var3 < class271.field3684.length; var3++) {
            class288.field3907[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 111)
    public static final void method2361(int arg0) {
        class517.method3078(~arg0);
        field5711++;
        if (arg0 != -256) {
            field5713 = null;
        }
        class287.method1649(841283500);
    }
}
