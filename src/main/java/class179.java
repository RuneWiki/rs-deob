import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class179 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lpd;")
    public static class296 field2672;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
    public static boolean field2673;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[Lje;)V")
    public static final void method1239(int arg0, int arg1, class178[] arg2) {
        field2671++;
        if (arg0 != -7) {
            method1239(-128, 123, (class178[]) null);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class178 var4 = arg2[var3];
            if (var4 != null && var4.field2580 == arg1 && !client.method2771(var4)) {
                if (var4.field2655 == 0) {
                    method1239(-7, var4.field2631, arg2);
                    if (var4.field2548 != null) {
                        method1239(-7, var4.field2631, var4.field2548);
                    }
                    class468 var5 = (class468) class466.field6564.method2305((long) var4.field2631, (byte) 40);
                    if (var5 != null) {
                        class424.method2500(arg0 ^ 0xFFFFFFF8, var5.field6584);
                    }
                }
                if (var4.field2655 == 6 && var4.field2616 != -1) {
                    class356 var6 = class170.field2423.method1586(var4.field2616, (byte) 36);
                    if (var6 != null) {
                        var4.field2535 += class269.field3987;
                        while (var4.field2535 > var6.field5421[var4.field2568]) {
                            var4.field2535 -= var6.field5421[var4.field2568];
                            var4.field2568++;
                            if (var4.field2568 >= var6.field5389.length) {
                                var4.field2568 -= var6.field5414;
                                if (var4.field2568 < 0 || var4.field2568 >= var6.field5389.length) {
                                    var4.field2568 = 0;
                                }
                            }
                            var4.field2563 = var4.field2568 + 1;
                            if (var4.field2563 >= var6.field5389.length) {
                                var4.field2563 -= var6.field5414;
                                if (var4.field2563 < 0 || var6.field5389.length <= var4.field2563) {
                                    var4.field2563 = -1;
                                }
                            }
                            class205.method1396(arg0 ^ 0xFFFFFFB5, var4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public static void method1240(boolean arg0) {
        field2672 = null;
        if (arg0) {
            field2673 = true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
    public static final Object method1241(byte arg0, boolean arg1, byte[] arg2) {
        field2670++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class72.field978) {
            try {
                class158 var3 = (class158) Class.forName("eq").getDeclaredConstructor().newInstance();
                var3.method1081((byte) 2, arg2);
                return var3;
            } catch (Throwable var4) {
                class72.field978 = true;
            }
        }
        if (arg0 == 121) {
            return arg1 ? class171.method1181(95, arg2) : arg2;
        } else {
            return null;
        }
    }

    static {
        new class332("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        new class332("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field2672 = new class296();
        field2674 = 0;
        field2673 = true;
    }
}
