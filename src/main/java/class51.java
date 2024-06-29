import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class51 extends class108 {

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "Lfea;")
    public class47 field755 = new class47();

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
    public static int field758 = 0;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "Lgp;")
    public static class561 field759;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static void method439(int arg0) {
        if (arg0 < 81) {
            method439(11);
        }
        field759 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I[BB)I")
    public static final int method440(int arg0, byte[] arg1, byte arg2) {
        field756++;
        return arg2 <= 73 ? 124 : class386.method2346(arg0, arg1, -101, 0);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method441(byte arg0, String arg1) {
        int var2 = 95 / ((arg0 + 12) / 60);
        field757++;
        return arg1.length() + 1;
    }

    static {
        new class567("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }
}
