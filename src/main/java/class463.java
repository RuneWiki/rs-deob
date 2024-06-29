import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class463 extends class423 {

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "[I")
    public static int[] field6827 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "Lvq;")
    public static class24 field6830 = new class24(34, 2);

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public int field6829;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public int field6831;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public int field6832;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public int field6834;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "Lva;")
    public class58 field6828;

    static {
        new class409("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field6835 = 0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZZLjava/lang/String;JLjava/lang/String;BII)V", line = 14)
    public static final void method2862(int arg0, int arg1, boolean arg2, boolean arg3, String arg4, long arg5, String arg6, byte arg7, int arg8, int arg9) {
        field6833++;
        if (arg7 >= -91) {
            method2863(false);
        }
        if (!class286.field4210 && class237.field3532 < 500) {
            int var11 = arg0 == -1 ? class392.field5703 : arg0;
            class375 var12 = new class375(arg4, arg6, var11, arg8, arg5, arg9, arg1, arg3, arg2);
            class138.field1885.method2484(0, var12);
            class237.field3532++;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)V", line = 36)
    public static void method2863(boolean arg0) {
        field6827 = null;
        field6830 = null;
        if (arg0) {
            field6835 = 124;
        }
    }
}
