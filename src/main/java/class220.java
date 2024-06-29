import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class220 {

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3085 = 0;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "Z")
    public static boolean field3084 = false;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3089 = new String[200];

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3090;

    static {
        new class368("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z", line = 4)
    public static final boolean method1458(int arg0) {
        field3087++;
        if (arg0 != 0) {
            method1459((byte) 36);
        }
        if (class95.field1316) {
            try {
                if ((Boolean) class9.method49(class122.field1839.field1086, "showingVideoAd", arg0 - 118)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 24)
    public static final void method1459(byte arg0) {
        for (int var1 = 0; var1 < class53.field674; var1++) {
            int var2 = class228.field3187[var1];
            class419 var3 = class428.field5951[var2];
            if (var3 != null) {
                class75.method581(var3, (byte) -56, var3.field5807.field3278);
            }
        }
        if (arg0 > -106) {
            field3090 = null;
        }
        field3086++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIII)V", line = 69)
    public static final void method1460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 <= class42.field543 && class143.field2090 <= arg4) {
            boolean var6;
            if (class80.field1119 > arg5) {
                var6 = false;
                arg5 = class80.field1119;
            } else if (class430.field6003 < arg5) {
                var6 = false;
                arg5 = class430.field6003;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg2 < class80.field1119) {
                arg2 = class80.field1119;
                var7 = false;
            } else if (arg2 <= class430.field6003) {
                var7 = true;
            } else {
                var7 = false;
                arg2 = class430.field6003;
            }
            if (arg3 < class143.field2090) {
                arg3 = class143.field2090;
            } else {
                class149.method1112(arg1, arg2, 8, arg5, class83.field1157[arg3++]);
            }
            if (arg4 > class42.field543) {
                arg4 = class42.field543;
            } else {
                class149.method1112(arg1, arg2, 8, arg5, class83.field1157[arg4--]);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg4; var8++) {
                    int[] var9 = class83.field1157[var8];
                    var9[arg5] = var9[arg2] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg3; var11 <= arg4; var11++) {
                    class83.field1157[var11][arg5] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg3; var10 <= arg4; var10++) {
                    class83.field1157[var10][arg2] = arg1;
                }
            }
        }
        field3088++;
        if (arg0 != -17336) {
            field3083 = -45;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)V", line = 176)
    public static void method1461(byte arg0) {
        int var1 = -15 / ((43 - arg0) / 63);
        field3090 = null;
        field3089 = null;
    }
}
