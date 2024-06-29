import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public abstract class class202 extends class6 {

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "[I")
    public static int[] field2842 = new int[3];

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Lwj;")
    public static class270 field2845 = new class270(20, -1);

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Lqp;")
    public static class466 field2846;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Ldr;")
    public static class504 field2840;

    static {
        new class466("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field2846 = new class466("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");
        new class466(null, "Dieses System darf nicht missbraucht werden!", null, null);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;", line = 8)
    public static final String method1256(int arg0, int arg1, String[] arg2, int arg3) {
        field2841++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg2[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = arg1;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I", line = 68)
    public static final int method1257(int arg0, int arg1) {
        if (arg1 < 12) {
            field2845 = null;
        }
        field2844++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V", line = 79)
    public static final void method1258(int arg0, int arg1, int arg2) {
        class343.field4944++;
        field2839++;
        class491.method2878((byte) 92, class480.field7019);
        class481.field7027.method2351(arg2, (byte) -69);
        class481.field7027.method2355(1686288168, arg1);
        if (arg0 != 0) {
            method1260(-118);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 97)
    public static final boolean method1259(String arg0, int arg1) {
        field2838++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 49 / ((arg1 - 20) / 40);
        for (int var3 = 0; var3 < class174.field2588; var3++) {
            if (arg0.equalsIgnoreCase(class258.field3597[var3])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class316.field4324.field6421);
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V", line = 128)
    public static void method1260(int arg0) {
        field2840 = null;
        field2842 = null;
        field2846 = null;
        field2845 = null;
        if (arg0 != -20950) {
            method1257(-104, -64);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V", line = 147)
    public class202(int arg0) {
        this.field2843 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z")
    public abstract boolean method1041(byte arg0);

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1039(int arg0);
}
