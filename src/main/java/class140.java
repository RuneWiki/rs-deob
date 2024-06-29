import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class140 extends class442 {

    @OriginalMember(owner = "client!su", name = "m", descriptor = "Lgk;")
    public static class331 field1985;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "Lgk;")
    public static class331 field1987;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "F")
    public static float field1986;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)V")
    public static final void method1046(boolean arg0, int arg1) {
        field1984++;
        if (arg0) {
            if (class64.field761 != -1) {
                class185.method1295(0, class64.field761);
            }
            for (class305 var2 = (class305) class49.field545.method880((byte) -23); var2 != null; var2 = (class305) class49.field545.method879((byte) -20)) {
                if (!var2.method1524(-104)) {
                    var2 = (class305) class49.field545.method880((byte) -23);
                    if (var2 == null) {
                        break;
                    }
                }
                class349.method2103(true, var2, false, -80);
            }
            class64.field761 = -1;
            class49.field545 = new class106(8);
            class324.method2003(-19181);
            class64.field761 = class530.field7769;
            class351.method2116((byte) -112, false);
            class448.method2716(-11712);
            class41.method412(class64.field761);
        }
        class441.method2692(0);
        class86.field1177 = -1;
        class328.method2020(class74.field1011, (byte) 127);
        class435.field6375 = new class364();
        class435.field6375.field1777[0] = class397.field5828 / 2;
        class435.field6375.field6334 = class457.field6713 * 128 / 2;
        class435.field6375.field6335 = class397.field5828 * 128 / 2;
        class435.field6375.field1778[0] = class457.field6713 / 2;
        class486.field7138 = 0;
        class161.field2268 = 0;
        int var3 = 125 % ((arg1 - 16) / 46);
        if (class462.field6802 == 2) {
            class486.field7138 = class76.field1039 << 7;
            class161.field2268 = class85.field1158 << 7;
        } else {
            class306.method1901(true);
        }
        class284.method1815((byte) -36);
        if (class161.field2268 == 0 || class486.field7138 == 0) {
            class432.method2619((byte) 78, 10);
        } else {
            class120.method943(-12319);
            class432.method2619((byte) -125, 28);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)I")
    public static final int method1047(int arg0, int arg1) {
        if (arg0 != 9921) {
            field1986 = -2.019924F;
        }
        field1983++;
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)V")
    public static final void method1048(byte arg0) {
        class224.field3288++;
        class32.method258(-114, class151.field2146);
        field1981++;
        class472.field6970.method611((byte) 67, class276.field4070);
        int var1 = -3 / ((14 - arg0) / 47);
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(B)V")
    public static void method1049(byte arg0) {
        if (arg0 > 105) {
            field1985 = null;
            field1987 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Luu;IZ)V")
    public static final void method1050(class188 arg0, int arg1, boolean arg2) {
        field1982++;
        int var3 = arg0.field2694 == 0 ? arg0.field2711 : arg0.field2694;
        int var4 = ~arg0.field2712 == arg1 ? arg0.field2672 : arg0.field2712;
        class176.method1233(var3, var4, class123.field1803[arg0.field2678 >> 16], 22611, arg0.field2678, arg2);
        if (arg0.field2758 != null) {
            class176.method1233(var3, var4, arg0.field2758, arg1 + 22612, arg0.field2678, arg2);
        }
        class305 var5 = (class305) class49.field545.method875((long) arg0.field2678, 123);
        if (var5 != null) {
            class391.method2400(-1, arg2, var4, var5.field4333, var3);
        }
    }

    static {
        new class331("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field1985 = new class331("Drop", "Fallen lassen", "Poser", "Largar");
        new class331("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field1987 = new class331("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");
        field1988 = -1;
    }
}
