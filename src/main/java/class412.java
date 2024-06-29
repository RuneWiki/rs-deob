import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class412 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Z")
    public static boolean field6162;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[F")
    public static float[] field6160;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lpi;")
    public static class342 field6161;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lpi;")
    public static class342 field6163;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lqa;")
    public static class162 field6158;

    static {
        new class342("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field6156 = -1;
        field6162 = false;
        field6160 = new float[4];
        field6157 = 0;
        field6161 = new class342("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
        field6164 = 205;
        field6163 = new class342("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V", line = 7)
    public static final void method2495(int arg0, int arg1, byte arg2) {
        field6155++;
        if (arg2 <= 115) {
            method2497(112);
        }
        class307.field4691 = arg1 - class509.field7519;
        class151.field2403 = arg0 - class509.field7503;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)Lag;", line = 21)
    public static final class480 method2496(int arg0, int arg1, int arg2) {
        class429 var3 = class380.field5761[arg0][arg1][arg2];
        return var3 == null || var3.field6366 == null ? null : var3.field6366;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 28)
    public static void method2497(int arg0) {
        if (arg0 > 35) {
            field6163 = null;
            field6160 = null;
            field6161 = null;
            field6158 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII)V", line = 47)
    public static final void method2498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 <= arg5; var6++) {
            class179.method1269(class21.field430[var6], arg4, arg1, arg0, 26985);
        }
        if (arg2 != 0) {
            method2498(79, 45, 54, 122, 49, -103);
        }
        field6159++;
    }
}
