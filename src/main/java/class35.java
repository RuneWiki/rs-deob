import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class35 {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lo;")
    public static class332 field437 = new class332(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Lo;")
    public static class332 field439 = new class332("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Z")
    public static boolean field442 = false;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lct;")
    public static class285 field440 = new class285(22, 2);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "J")
    public long field436;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lfi;")
    public class35 field434;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lfi;")
    public class35 field435;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "[I")
    public static int[] field441;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 5)
    public static void method281(int arg0) {
        field439 = null;
        field441 = null;
        if (arg0 != 2) {
            method281(61);
        }
        field437 = null;
        field440 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Z", line = 34)
    public final boolean method282(int arg0) {
        if (arg0 <= 73) {
            return false;
        } else {
            field432++;
            return this.field435 != null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 49)
    public final void method283(int arg0) {
        field438++;
        if (this.field435 == null) {
            return;
        }
        this.field435.field434 = this.field434;
        this.field434.field435 = this.field435;
        if (arg0 != 2) {
            method281(27);
        }
        this.field435 = null;
        this.field434 = null;
    }
}
