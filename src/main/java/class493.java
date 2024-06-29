import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class493 extends class129 {

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "Ltn;")
    public static class60 field6968;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "[J")
    public static long[] field6971;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "F")
    public static float field6969;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
    public static void method2861(byte arg0) {
        field6968 = null;
        field6971 = null;
        if (arg0 <= 101) {
            field6969 = -0.68076766F;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZLza;Lam;II)V")
    public static final void method2862(boolean arg0, class290 arg1, class455 arg2, int arg3, int arg4) {
        field6967++;
        class382.field5382.method2656(76);
        if (arg0) {
            field6969 = 0.587815F;
        }
        if (class282.field4159) {
            return;
        }
        for (class216 var5 = (class216) arg2.method2655(15152); var5 != null; var5 = (class216) arg2.method2660((byte) 67)) {
            class156 var6 = class245.field3553.method1316((byte) -68, var5.field3126);
            if (class511.method3050(var6, (byte) 54)) {
                boolean var7 = class31.method191(arg1, arg4, var5, var6, 27271, arg3);
                if (var7) {
                    class438.method2575(var5, var6, (byte) -46, arg1);
                }
            }
        }
    }

    static {
        new class530("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field6968 = new class60(41, 8);
        field6971 = new long[32];
    }
}
