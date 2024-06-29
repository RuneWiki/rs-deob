import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class323 extends class512 {

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "F")
    public static float field5062;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Lqs;")
    public static class496 field5064;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public static void method2036(boolean arg0) {
        field5064 = null;
        if (arg0) {
            field5064 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class323() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        ++field5063;
        int[] var3 = super.field7494.method232(arg0, true);
        int var4 = -98 % ((arg1 - 43) / 48);
        if (super.field7494.field474) {
            int[][] var5 = this.method3012(arg0, 64, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; var9 < class402.field6113; ++var9) {
                var3[var9] = (var7[var9] + var8[var9] + var6[var9]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2037(String arg0, int arg1) {
        ++field5065;
        if (arg1 != -1) {
            method2036(true);
        }
        return arg0.length() - -1;
    }

    static {
        new class306("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }
}
