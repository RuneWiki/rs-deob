import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class304 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field4141 = -50;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4142;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[Z")
    public static boolean[] field4148;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Lij;")
    public static class316 field4146;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lha;")
    public static class48 field4144;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[[[Lr;")
    public static class63[][][] field4147;

    static {
        new class368("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field4145 = 0;
        field4143 = 0;
        field4142 = new Color[] { new Color(9179409), new Color(16777215) };
        field4148 = new boolean[8];
        field4149 = 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1840(int arg0) {
        int var1 = 0;
        if (arg0 != -29348) {
            field4148 = null;
        }
        while (class302.field4122.length > var1) {
            for (int var2 = 0; var2 < class302.field4122[0].length; var2++) {
                for (int var3 = 0; var3 < class302.field4122[0][0].length; var3++) {
                    class302.field4122[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
        field4139++;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 39)
    public static void method1841(int arg0) {
        field4144 = null;
        field4148 = null;
        field4147 = null;
        if (arg0 != 18394) {
            method1841(36);
        }
        field4146 = null;
        field4142 = null;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I", line = 60)
    public static final int method1842(int arg0) {
        field4140++;
        if ((double) class333.field4498 == 3.0D) {
            return 37;
        } else if ((double) class333.field4498 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 29688) {
                field4144 = null;
            }
            if ((double) class333.field4498 == 6.0D) {
                return 75;
            } else if ((double) class333.field4498 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }
}
