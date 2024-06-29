import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class214 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Lada;")
    public static class144 field3162;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1409(int arg0) {
        field3162 = null;
        if (arg0 <= 109) {
            field3162 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIIIIII)I")
    public static final int method1410(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg3;
            arg3 = var7;
        }
        field3158++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg4;
        }
        if (arg0) {
            field3162 = null;
        }
        if (var8 == 1) {
            return arg5;
        } else if (var8 == 2) {
            return 1 - (arg2 - 7) - arg4;
        } else {
            return 1 + 7 - arg3 - arg5;
        }
    }

    static {
        new class572("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field3159 = 765;
        field3160 = 0;
        field3162 = new class144(10, 5);
    }
}
