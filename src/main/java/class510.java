import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class510 extends class400 {

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    private int field7104;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
    private int field7101;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    private int field7106;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    private int field7111;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
    private int field7107;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
    private int field7109;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    private int field7099;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    private int field7102;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    public static int field7110 = 0;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "Lwg;")
    public static class58 field7112;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "Lim;")
    public static class353 field7114;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "Lim;")
    public static class353 field7115;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "Z")
    public static boolean field7116;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "Lrn;")
    public static class307 field7108;

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field7104 = arg0;
        this.field7101 = arg1;
        this.field7106 = arg7;
        this.field7111 = arg2;
        this.field7107 = arg5;
        this.field7109 = arg3;
        this.field7099 = arg6;
        this.field7102 = arg4;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
    public static void method2850(int arg0) {
        field7115 = null;
        if (arg0 == 5) {
            field7112 = null;
            field7114 = null;
            field7108 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIB)V")
    public final void method1098(int arg0, int arg1, byte arg2) {
        ++field7103;
        int var4 = this.field7104 * arg1 >> 12;
        int var5 = this.field7101 * arg0 >> 12;
        int var6 = this.field7111 * arg1 >> 12;
        int var7 = this.field7109 * arg0 >> 12;
        int var8 = this.field7102 * arg1 >> 12;
        int var9 = this.field7107 * arg0 >> 12;
        int var10 = this.field7099 * arg1 >> 12;
        int var11 = this.field7106 * arg0 >> 12;
        if (arg2 == -81) {
            class96.method532(var7, var9, var4, var10, var5, super.field5481, var11, var6, var8, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(III)V")
    public final void method1099(int arg0, int arg1, int arg2) {
        if (arg1 != 4095) {
            this.method1099(120, -52, -66);
        }
        ++field7100;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)V")
    public final void method1096(int arg0, int arg1, int arg2) {
        ++field7105;
        int var4 = -16 % ((23 - arg2) / 33);
    }

    static {
        new class344("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field7112 = new class58(64);
        field7114 = new class353(13, -1);
        field7115 = new class353(5, -2);
        new class344("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field7116 = false;
    }
}
