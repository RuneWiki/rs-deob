import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 extends class499 {

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "[Lau;")
    public static class517[] field165 = new class517[30];

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Lgd;")
    public static class224 field169;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Lji;")
    public static class433 field170;

    static {
        new class83("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field168 = 0;
        field169 = new class224(16);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lqa;Lco;III)V", line = 5)
    public static final void method114(class162 arg0, class76 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class469.field6860) {
            class61 var5 = class385.field5410[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field824 != null && var5.field824.method399(false)) {
                arg1.method394(0, 0, var5.field824, class234.field3248, arg0, true, true);
            }
        }
        if (arg4 < class469.field6860) {
            class61 var6 = class385.field5410[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field824 != null && var6.field824.method399(false)) {
                arg1.method394(class234.field3248, 0, var6.field824, 0, arg0, true, true);
            }
        }
        if (arg3 < class469.field6860 && arg4 < class472.field6900) {
            class61 var7 = class385.field5410[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field824 != null && var7.field824.method399(false)) {
                arg1.method394(class234.field3248, 0, var7.field824, class234.field3248, arg0, true, true);
            }
        }
        if (arg3 < class469.field6860 && arg4 > 0) {
            class61 var8 = class385.field5410[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field824 != null && var8.field824.method399(false)) {
                arg1.method394(-class234.field3248, 0, var8.field824, class234.field3248, arg0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 56)
    public static void method115(int arg0) {
        field169 = null;
        field170 = null;
        field165 = null;
        if (arg0 < 30) {
            field170 = null;
        }
    }
}
