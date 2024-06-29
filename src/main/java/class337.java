import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class337 {

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "Lki;")
    public static class498 field4739;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "Llt;")
    public static class475 field4740;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "[Llo;")
    public static class528[] field4741;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "Lwt;")
    public static class202 field4742;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "Z")
    public static boolean field4745;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "[[I")
    public static int[][] field4746;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "J")
    public long field4736;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lkp;")
    public class337 field4735;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Lkp;")
    public class337 field4737;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "[Lf;")
    public static class529[] field4733;

    static {
        new class475("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field4739 = new class498(1, 3);
        field4740 = new class475("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");
        field4741 = new class528[14];
        field4742 = new class202("", 14);
        field4743 = -1;
        field4745 = false;
        field4746 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 6)
    public static void method2048(int arg0) {
        field4742 = null;
        field4746 = null;
        field4739 = null;
        if (arg0 == 0) {
            field4741 = null;
            field4740 = null;
            field4733 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V", line = 22)
    public final void method2049(int arg0) {
        field4734++;
        if (arg0 > -49) {
            this.field4737 = null;
        }
        if (this.field4735 != null) {
            this.field4735.field4737 = this.field4737;
            this.field4737.field4735 = this.field4735;
            this.field4735 = null;
            this.field4737 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)Z", line = 42)
    public final boolean method2050(int arg0) {
        field4738++;
        if (arg0 != 1) {
            method2048(117);
        }
        return this.field4735 != null;
    }
}
