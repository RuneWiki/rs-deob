import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class class400 {

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "[I")
    public static int[] field5681;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Z")
    public static boolean field5683;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "[F")
    public static float[] field5682;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field5684;

    static {
        new class44("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field5681 = new int[5];
        field5683 = false;
        field5682 = new float[4];
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIIIII)V", line = 5)
    public static final void method2397(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= 6) {
            for (int var6 = arg1; var6 <= arg5; var6++) {
                class479.method2839(arg4, arg3, class271.field4078[var6], 89, arg2);
            }
            field5680++;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V", line = 26)
    public static void method2398(int arg0) {
        field5682 = null;
        field5681 = null;
        if (arg0 != 14104) {
            method2399(true, 81);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)I", line = 49)
    public static final int method2399(boolean arg0, int arg1) {
        field5679++;
        if (!arg0) {
            method2398(-82);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lac;Z)Lac;")
    public abstract class385 method2069(class385 arg0, boolean arg1);
}
