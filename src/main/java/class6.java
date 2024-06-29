import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class6 extends class525 {

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lgk;")
    public static class338 field36;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Ltq;")
    public static class452 field37;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method16(long arg0, int arg1) {
        field34++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            int var6 = -74 / ((arg1 + 20) / 46);
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                char var10 = class288.field4271[(int) (var8 - (arg0 * 37L))];
                if (var10 == '_') {
                    int var11 = var7.length() - 1;
                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                    var10 = ' ';
                }
                var7.append(var10);
            }
            var7.reverse();
            var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
            return var7.toString();
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method17(int arg0);

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
    public static final void method18(int arg0) {
        class102.field1577 = -1;
        field33++;
        class112.field1651 = -1;
        class17.field186 = -1;
        class213.field3219 = 0;
        if (arg0 > -114) {
            method18(-10);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
    public class6(int arg0) {
        this.field32 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)Z")
    public abstract boolean method19(byte arg0);

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
    public static void method20(int arg0) {
        if (arg0 != 37) {
            method18(-88);
        }
        field37 = null;
        field36 = null;
    }

    static {
        new class44("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        new class44("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }
}
