import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class566 {

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lvt;")
    public static class344 field7924;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Luv;")
    public static class3 field7925;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Ljr;")
    public static class441 field7926;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static final void method3171(byte arg0) {
        if (arg0 != 65) {
            method3172(-9, 121, -118);
        }
        field7923++;
        for (class338 var1 = (class338) class239.field3052.method3188((byte) -100); var1 != null; var1 = (class338) class239.field3052.method3182((byte) -71)) {
            class35 var2 = var1.field4724;
            if (var2.field545) {
                var1.method589(-8880);
                var2.method209(arg0 ^ 0x40);
            } else if (class7.field61 >= var2.field521) {
                var2.method212((byte) 49, class153.field1999);
                if (var2.field545) {
                    var1.method589(-8880);
                } else {
                    class523.method2925(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
    public static final boolean method3172(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method3172(114, -93, -100);
        }
        field7922++;
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
    public static void method3173(byte arg0) {
        field7924 = null;
        field7925 = null;
        field7926 = null;
        if (arg0 != 91) {
            method3172(-93, 51, 47);
        }
    }

    static {
        new class344("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field7924 = new class344(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
        field7925 = new class3(30, 8);
    }
}
