import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class439 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field6559 = 0;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field6560 = 0;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lvv;")
    public static class313 field6558 = new class313(66, 5);

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field6563 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lvv;")
    public static class313 field6565;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[Lo;")
    public static class138[] field6564;

    static {
        new class306("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field6565 = new class313(110, -1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2653(boolean arg0) {
        field6558 = null;
        field6565 = null;
        if (!arg0) {
            method2654(102, -54, -48, -24, -35, -43, -84);
        }
        field6564 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)V", line = 24)
    public static final void method2654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6561++;
        class506.field7374 = arg2;
        class111.field1960 = arg6;
        class69.field1189 = arg1;
        class437.field6531 = arg3;
        int var7 = -107 % ((76 - arg4) / 36);
        class426.field6408 = arg5;
        class100.field1665 = arg0;
    }
}
