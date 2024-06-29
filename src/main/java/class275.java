import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class275 {

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "S")
    public static short field3832 = 32767;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field3831 = 0;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lnq;")
    public static class268 field3833;

    static {
        new class442("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field3834 = -1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1792(byte arg0) {
        if (arg0 != 77) {
            method1794(false);
        }
        field3830++;
        class25.field457.method905((byte) 5);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIB)V", line = 16)
    public static final void method1793(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = class52.field731 * arg0 >> 8;
        int var5 = 68 % ((arg3 + 13) / 58);
        field3827++;
        if (var4 != 0 && arg2 != -1) {
            class170.method1122(var4, 1, 0, class410.field5803, false, arg2);
            class429.field6078 = true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 48)
    public static void method1794(boolean arg0) {
        if (!arg0) {
            field3831 = -11;
        }
        field3833 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lwn;", line = 59)
    public static final class431 method1795(int arg0, int arg1) {
        field3828++;
        class431 var2 = (class431) class360.field4922.method904(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class30.field495.method1745(arg0, (byte) 74, arg1);
        class431 var4 = new class431();
        if (var3 != null) {
            var4.method2718(new class11(var3), (byte) -29, arg0);
        }
        class360.field4922.method902((long) arg0, (byte) 112, var4);
        return var4;
    }
}
