import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class466 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lat;")
    public static class412 field6560 = new class412();

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field6562 = 0;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lsl;")
    public static class422 field6563;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lfa;")
    public static class371 field6564;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lct;")
    public static class285 field6565;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lui;")
    public static class451 field6566;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIII)Las;")
    public static final class15 method2736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6559++;
        long var7 = (long) arg4 * 76724863L ^ (long) arg6 * 475427L ^ (long) arg3 * 97549L ^ (long) arg1 * 67481L ^ (long) arg0 * 986053L ^ (long) arg5 * 32147369L;
        class15 var9 = (class15) class151.field2117.method2393(-125, var7);
        if (arg2 <= 71) {
            field6564 = null;
        }
        if (var9 == null) {
            class15 var10 = class336.field5036.method512(arg1, arg3, arg6, arg0, arg5, arg4);
            class151.field2117.method2395(0, var10, var7);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZC)C")
    public static final char method2737(int arg0, boolean arg1, char arg2) {
        field6558++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            if (!arg1) {
                method2736(127, 38, -38, 91, 111, 97, -46);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static void method2738(boolean arg0) {
        field6565 = null;
        field6560 = null;
        field6564 = null;
        field6563 = null;
        field6566 = null;
        if (!arg0) {
            field6565 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILmn;)Lmn;")
    public abstract class40 method2467(int arg0, class40 arg1);

    static {
        new class332("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field6563 = new class422("", 13);
        field6564 = new class371(8);
        field6565 = new class285(75, 4);
        new class332("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }
}
