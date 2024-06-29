import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class504 extends class223 {

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public int field7471 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public int field7468 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public int field7473 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public int field7470 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public int field7472 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public int field7469 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    public int field7477 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public int field7467 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "Laq;")
    public class111 field7476;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Lgk;")
    public static class331 field7474 = new class331("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "[[I")
    public static int[][] field7478 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "Lwi;")
    public static class325 field7479;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)Z")
    public final boolean method3013(int arg0, int arg1, int arg2) {
        field7475++;
        if (arg1 != -15997) {
            return false;
        } else if (arg2 >= this.field7467 && this.field7468 >= arg2 && arg0 >= this.field7473 && arg0 <= this.field7471) {
            return true;
        } else {
            return arg2 >= this.field7470 && this.field7477 >= arg2 && arg0 >= this.field7472 && this.field7469 >= arg0;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static void method3014(int arg0) {
        field7478 = null;
        field7479 = null;
        if (arg0 < -106) {
            field7474 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Laq;)V")
    public class504(class111 arg0) {
        this.field7476 = arg0;
    }

    static {
        new class331("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }
}
