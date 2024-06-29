import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class27 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lpn;")
    public static class72 field362;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
    public static int[] field364;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "[Lkp;")
    public static class10[] field365;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Laj;")
    public static class77 field361;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Z")
    public static boolean field359;

    static {
        new class40("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field362 = new class72(31, 3);
        field363 = 1;
        field364 = new int[14];
        field365 = new class10[4];
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 5)
    public static void method148(int arg0) {
        if (arg0 != -31796) {
            method148(-70);
        }
        field365 = null;
        field364 = null;
        field361 = null;
        field362 = null;
    }
}
