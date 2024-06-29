import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class616 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Ljn;")
    public class490 field8719 = new class490();

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Z")
    public boolean field8726 = false;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field8714 = 16777215;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[S")
    public static short[] field8715 = new short[256];

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lbv;")
    public static class567 field8717 = new class567("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[Led;")
    public static class115[] field8718 = new class115[5];

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
    public static int[] field8721;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "[I")
    public static int[] field8723;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public int field8724;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public int field8725;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Lhca;")
    public static class179 field8722;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method3492(String arg0, byte arg1) {
        field8716++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 < 32) {
            method3492(null, (byte) -28);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method3493(int arg0) {
        field8715 = null;
        field8722 = null;
        field8721 = null;
        field8718 = null;
        if (arg0 == 2953) {
            field8717 = null;
            field8723 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < field8718.length; var0++) {
            field8718[var0] = new class115();
        }
        field8721 = new int[1000];
        field8723 = new int[1];
        new class567("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }
}
