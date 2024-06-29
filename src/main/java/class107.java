import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class107 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lh;")
    public static class434 field1602 = new class434(15, 10);

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "[S")
    public static short[] field1604 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Lgd;")
    public static class206 field1605 = new class206("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "S")
    public static short field1606 = 1;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lgd;")
    public static class206 field1608;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Lh;")
    public static class434 field1609;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "Lr;")
    public static class110 field1607;

    static {
        new class206("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field1608 = new class206("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");
        field1609 = new class434(31, 8);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method660(byte arg0, int arg1) {
        class222.field2959 = -1;
        if (arg0 != 29) {
            method660((byte) 39, 48);
        }
        class432.field5889 = arg1;
        field1598++;
        class222.field2959 = -1;
        class346.method2132(0);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)C", line = 21)
    public static final char method661(int arg0, byte arg1) {
        if (arg0 != -2101) {
            return (char) 65535;
        }
        field1600++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class72.field985[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lwm;ILmg;)I", line = 50)
    public static final int method662(class364 arg0, int arg1, class91 arg2) {
        field1601++;
        if (arg1 != 255) {
            field1603 = 122;
        }
        if (arg2.field1322 != -1) {
            return arg2.field1322;
        }
        if (arg2.field1328 != -1) {
            class23 var3 = arg0.field4988.method1621(18318, arg0.method1999() ? arg2.field1328 : arg2.field1324);
            if (!var3.field302) {
                return var3.field295;
            }
        }
        return arg2.field1337;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 80)
    public static void method663(int arg0) {
        field1609 = null;
        field1605 = null;
        field1607 = null;
        field1604 = null;
        field1608 = null;
        field1602 = null;
        if (arg0 != -1) {
            method660((byte) 18, 41);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)V", line = 96)
    public static final void method664(int arg0, byte arg1) {
        class280.method1583((byte) 123);
        field1599++;
        class63.method427(88);
        class49.method350(true, 157286400, arg0);
        class464.method2731(class473.field6525, class172.field2358, class98.field1432, 300);
        class160.method936(class98.field1432, (byte) 122, class473.field6525);
        class6.method40(class471.field6498, -127);
        class98.method604(1413);
        class480.method2803((byte) -72);
        if (arg1 < 121) {
            return;
        }
        if (class18.field258 == 10) {
            class88.method566(false, false);
        } else if (class18.field258 == 30) {
            class119.method746(25, (byte) -128);
            return;
        } else if (class18.field258 == 5) {
            class23.method140(18, class473.field6525, class98.field1432);
            return;
        }
    }
}
