import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class311 extends class445 {

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "S")
    public short field4101;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lgd;")
    public static class206 field4099 = new class206("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Lr;")
    public static class110 field4106;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Ljd;")
    public static class139 field4105;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "[I")
    public static int[] field4102;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4098;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
    public static final void method1709(int arg0, int arg1) {
        field4100++;
        if (arg0 != 710) {
            return;
        }
        class413.method2477(-64);
        int var2 = class458.field6219.method1221(arg1, (byte) 99).field2151;
        if (var2 == 0) {
            return;
        }
        int var3 = class38.field562.field4585[arg1];
        if (var2 == 5) {
            class208.field2811 = var3;
        }
        if (var2 == 6) {
            class484.field6698 = var3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
    public static void method1710(boolean arg0) {
        field4099 = null;
        if (arg0) {
            method1709(13, -52);
        }
        field4098 = null;
        field4102 = null;
        field4105 = null;
        field4106 = null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
    public static final int method1711(int arg0, int arg1) {
        if (arg0 != 23045) {
            method1709(-88, -23);
        }
        field4103++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class311() {
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(S)V")
    public class311(short arg0) {
        this.field4101 = arg0;
    }

    static {
        new class206("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field4104 = -1;
    }
}
