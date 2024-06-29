import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class14 extends class43 {

    @OriginalMember(owner = "client!as", name = "k", descriptor = "Lbb;")
    public class270 field171 = new class270();

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lwo;")
    public static class285 field174;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "Lwo;")
    public static class285 field175;

    static {
        new class72("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZBIILaq;)V", line = 3)
    public static final void method83(boolean arg0, byte arg1, int arg2, int arg3, class453 arg4) {
        field173++;
        int var5 = arg4.field6377;
        int var6 = arg4.field6432;
        if (arg4.field6456 == 0) {
            arg4.field6377 = arg4.field6390;
        } else if (arg4.field6456 == 1) {
            arg4.field6377 = arg3 - arg4.field6390;
        } else if (arg4.field6456 == 2) {
            arg4.field6377 = arg4.field6390 * arg3 >> 14;
        }
        if (arg4.field6407 == 0) {
            arg4.field6432 = arg4.field6363;
        } else if (arg4.field6407 == 1) {
            arg4.field6432 = arg2 - arg4.field6363;
        } else if (arg4.field6407 == 2) {
            arg4.field6432 = arg4.field6363 * arg2 >> 14;
        }
        if (arg4.field6456 == 4) {
            arg4.field6377 = arg4.field6432 * arg4.field6395 / arg4.field6346;
        }
        if (arg4.field6407 == 4) {
            arg4.field6432 = arg4.field6377 * arg4.field6346 / arg4.field6395;
        }
        if (class186.field2151 && (client.method2696(arg4).field4847 != 0 || arg4.field6383 == 0)) {
            if (arg4.field6432 < 5 && arg4.field6377 < 5) {
                arg4.field6377 = 5;
                arg4.field6432 = 5;
            } else {
                if (arg4.field6377 <= 0) {
                    arg4.field6377 = 5;
                }
                if (arg4.field6432 <= 0) {
                    arg4.field6432 = 5;
                }
            }
        }
        if (arg4.field6415 == 1337) {
            class336.field4583 = arg4;
        }
        if (arg0 && arg4.field6448 != null && (arg4.field6377 != var5 || arg4.field6432 != var6)) {
            class221 var7 = new class221();
            var7.field2735 = arg4.field6448;
            var7.field2732 = arg4;
            class302.field4054.method1696(false, var7);
        }
        if (arg1 != -80) {
            field175 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V", line = 98)
    public static void method84(int arg0) {
        field175 = null;
        field174 = null;
        if (arg0 < 7) {
            field174 = null;
        }
    }
}
