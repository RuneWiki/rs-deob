import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class142 extends class184 {

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        field1834++;
        if (arg1 != 578) {
            this.method6(-98, 11);
        }
        return class347.field4461;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
    public class142() {
        super(0, true);
    }

    static {
        new class335("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        new class335(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
    }
}
