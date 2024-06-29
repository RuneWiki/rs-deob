import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class84 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
    public int[] field1102 = new int[100];

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[Lhb;")
    public class471[] field1106 = new class471[100];

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
    public int[] field1103 = new int[3];

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[Lnn;")
    public class263[] field1107 = new class263[8];

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lkk;")
    public static class114 field1101 = new class114("WTRC", 1);

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lh;")
    public static class434 field1105 = new class434(84, -1);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1104;

    static {
        new class206("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([III[II)V", line = 13)
    public static final void method530(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 != 1) {
            field1101 = null;
        }
        if (arg1 > arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if ((var7 + (var9 & 0x1)) > arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method530(arg0, var6 - 1, arg2, arg3, 1);
            method530(arg0, arg1, var6 + 1, arg3, 1);
        }
        field1099++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 68)
    public static void method531(int arg0) {
        if (arg0 != 32744) {
            method531(99);
        }
        field1101 = null;
        field1105 = null;
    }
}
