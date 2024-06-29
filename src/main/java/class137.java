import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class137 extends class448 {

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[I")
    public int[] field2308;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "[I")
    public int[] field2316;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Llo;")
    public static class306 field2309 = new class306("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!be", name = "n", descriptor = "[I")
    public static int[] field2313 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lnk;")
    public static class326 field2315 = new class326(59, -1);

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lo;")
    public static class138 field2314;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1028(boolean arg0) {
        class21.method112((byte) -12);
        field2306++;
        class91.method633(2, false, 22050, class510.field7403.field5094);
        class177.field2811 = class442.method2662(0, class419.field6342, 22050, class270.field4495, -1);
        class177.field2811.method527(class37.field547, -125);
        class429.field6435 = class442.method2662(1, class419.field6342, 2048, class270.field4495, -1);
        if (!arg0) {
            field2313 = null;
        }
        class429.field6435.method527(class510.field7455, -124);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)Z", line = 20)
    public static final boolean method1029(int arg0, boolean arg1) {
        field2310++;
        if (arg1) {
            method1030(-84, -80);
        }
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I", line = 33)
    public static final int method1030(int arg0, int arg1) {
        if (arg0 < 15) {
            return 105;
        } else {
            field2311++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 67)
    public static void method1031(int arg0) {
        if (arg0 != 6271) {
            field2309 = null;
        }
        field2315 = null;
        field2314 = null;
        field2313 = null;
        field2309 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(II[I[I)V", line = 79)
    public class137(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2308 = arg2;
        this.field2316 = arg3;
    }
}
