import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class569 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lkg;III)V")
    public static final void method3190(class57 arg0, int arg1, int arg2, int arg3) {
        long var4 = class238.field3050[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field759 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field756[arg0.field759++] = class256.field3175[var8 - 1].field8621;
            var6 += 16L;
        }
        for (int var9 = arg0.field759; var9 < 4; var9++) {
            arg0.field756[var9] = null;
        }
    }

    static {
        new class344("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field7954 = 0;
    }
}
