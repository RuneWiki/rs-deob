import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class522 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[I")
    public static int[] field7647;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[[Z")
    public static boolean[][] field7649;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILor;Ljava/lang/Object;)V")
    public static final void method3103(int arg0, class173 arg1, Object arg2) {
        field7648++;
        if (arg1.field2614 == null) {
            return;
        }
        if (arg0 != 8) {
            method3103(-22, null, null);
        }
        for (int var3 = 0; var3 < 50 && arg1.field2614.peekEvent() != null; var3++) {
            class334.method2047(1L, arg0 - 8);
        }
        if (arg2 != null) {
            arg1.field2614.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method3104(byte arg0) {
        if (arg0 < 31) {
            method3104((byte) -72);
        }
        field7649 = null;
        field7647 = null;
    }

    static {
        new class157("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        new class157("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field7647 = new int[256];
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7647[var0] = var1;
        }
        field7649 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };
        new class157("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field7650 = 0;
    }
}
