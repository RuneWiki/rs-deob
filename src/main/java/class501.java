import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class501 {

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Z")
    public static boolean field6948 = false;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "Lpaa;")
    public static class317 field6952;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Lim;")
    public static class353 field6953;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Llw;")
    public static class618 field6954;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "[Lsa;")
    public static class544[] field6947;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
    public static void method2798(int arg0) {
        field6953 = null;
        field6952 = null;
        field6954 = null;
        if (arg0 != -7917) {
            method2799(null, 126);
        }
        field6947 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2799(String arg0, int arg1) {
        field6950++;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = 0;
        if (arg1 != 3) {
            return 18;
        }
        while (var4 < var2) {
            char var5 = arg0.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
            var4++;
        }
        return var3;
    }

    static {
        new class344("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field6952 = new class317(13, 3);
    }
}
