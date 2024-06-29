import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class439 {

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Lgf;")
    public static class180 field79 = new class180("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "S")
    public static short field80 = 256;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field81;

    static {
        new class180("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBI)V", line = 4)
    public static final void method41(int arg0, int arg1, byte arg2, int arg3) {
        field81++;
        class151 var4 = class526.field7726[arg3][arg1];
        if (arg2 != 55) {
            method42(true, 105, (byte) 69, -78);
        }
        class18.method167((byte) 41, var4 == null ? class340.field5201 : var4, arg0);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(II)V", line = 27)
    public class5(int arg0, int arg1) {
        this.field77 = arg1;
        this.field78 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZIBI)I", line = 42)
    public static final int method42(boolean arg0, int arg1, byte arg2, int arg3) {
        field76++;
        if (arg2 > -118) {
            method42(true, 33, (byte) -115, 115);
        }
        class78 var4 = class192.method1311(arg3, arg0, -29496);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field1302.length; var6++) {
                if (var4.field1306[var6] == arg1) {
                    var5 += var4.field1302[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 76)
    public static void method43(int arg0) {
        if (arg0 != 0) {
            field79 = null;
        }
        field79 = null;
    }
}
