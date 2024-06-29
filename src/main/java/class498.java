import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class498 extends class319 {

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "F")
    public static float field7311 = 1.0F;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "Ls;")
    public static class186 field7310 = new class186(3, 6);

    @OriginalMember(owner = "client!gn", name = "R", descriptor = "Lbj;")
    public static class162 field7312 = new class162(60, -1);

    @OriginalMember(owner = "client!gn", name = "U", descriptor = "[I")
    public static int[] field7315 = new int[200];

    @OriginalMember(owner = "client!gn", name = "S", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!gn", name = "T", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!gn", name = "V", descriptor = "I")
    public static int field7316;

    static {
        new class309("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 3)
    public static void method3007(int arg0) {
        field7315 = null;
        if (arg0 == 200) {
            field7312 = null;
            field7310 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Lne;", line = 16)
    public static final class210 method3008(int arg0, int arg1, int arg2) {
        class234 var3 = class518.field7511[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3605;
    }
}
