import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class27 extends Exception {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lkca;")
    public static class73 field286;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Z")
    public static volatile boolean field292;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lfv;")
    public static class104 field288;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lmu;")
    public static class253 field287;

    static {
        new class474("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field286 = new class73(52, -1);
        field289 = -1;
        field290 = 0;
        field292 = false;
        field291 = 328;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZZB)V", line = 4)
    public static final void method157(boolean arg0, boolean arg1, byte arg2) {
        field284++;
        if (arg1) {
            class141.field1734++;
            class63.method446(122);
        }
        if (arg0) {
            class364.field5519++;
            class434.method2710(-30);
        }
        if (arg2 != 2) {
            field291 = 18;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILew;BLba;II)V", line = 29)
    public static final void method158(int arg0, class425 arg1, byte arg2, class327 arg3, int arg4, int arg5) {
        field285++;
        if (arg3 != null && arg2 > 45) {
            arg1.method2661(arg3.method1374(), arg3.method1352(), arg0, arg5, arg3.method1360(), arg3.method1349(), arg3.method1379(), arg4, arg3.method1383(), (byte) 103, arg3.method1402());
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IC)C", line = 48)
    public static final char method159(int arg0, char arg1) {
        if (arg0 != -214) {
            method157(false, false, (byte) 64);
        }
        field283++;
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 456)
    public static void method160(int arg0) {
        if (arg0 != -1) {
            field290 = 83;
        }
        field286 = null;
        field288 = null;
        field287 = null;
    }
}
