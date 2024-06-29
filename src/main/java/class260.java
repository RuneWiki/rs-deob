import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class260 {

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lol;")
    public static class187 field3616;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lkl;")
    public static class55 field3619;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "J")
    public long field3615;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Luj;")
    public class260 field3612;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Luj;")
    public class260 field3617;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "[I")
    public static int[] field3621;

    static {
        new class466("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        new class466(" days.", " Tage.", " jours.", " dias.");
        field3618 = -1;
        field3616 = new class187("", 11);
        field3619 = new class55(2, 4, 4, 0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method1564(int arg0) {
        field3613++;
        if (this.field3617 == null) {
            return false;
        } else {
            if (arg0 != 4) {
                this.method1565(-60);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 33)
    public final void method1565(int arg0) {
        field3614++;
        if (this.field3617 == null) {
            return;
        }
        this.field3617.field3612 = this.field3612;
        this.field3612.field3617 = this.field3617;
        if (arg0 != 0) {
            this.field3612 = null;
        }
        this.field3617 = null;
        this.field3612 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V", line = 52)
    public static void method1566(byte arg0) {
        if (arg0 != -123) {
            field3621 = null;
        }
        field3621 = null;
        field3616 = null;
        field3619 = null;
    }
}
