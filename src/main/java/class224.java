import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class224 extends class529 {

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "Z")
    public boolean field3762 = false;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public int field3759 = -1;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "Lss;")
    public static class213 field3760 = new class213("K", "T", "K", "K");

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "Lbi;")
    public static class104 field3766;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "Z")
    public static boolean field3767;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
    public static void method1622(byte arg0) {
        if (arg0 >= -13) {
            field3767 = true;
        }
        field3760 = null;
        field3766 = null;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V")
    public class224(int arg0) {
        this.field3759 = arg0;
    }

    static {
        new class213("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field3766 = new class104(8, 14);
    }
}
