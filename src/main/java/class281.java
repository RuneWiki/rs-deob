import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class281 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[[I")
    public static int[][] field4136 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
    public static int[] field4139 = new int[1024];

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Ldk;")
    public static class326 field4146 = new class326("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "B")
    public byte field4138;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "J")
    public static long field4137;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Ljava/lang/String;")
    public String field4141;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Ljava/lang/String;")
    public String field4142;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Ljava/lang/String;")
    public String field4144;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Ljava/lang/String;")
    public String field4145;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method1777(byte arg0) {
        field4146 = null;
        if (arg0 != 31) {
            method1779((byte) 78, -112);
        }
        field4136 = null;
        field4139 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Ljd;")
    public static final class139 method1778(int arg0, int arg1) {
        field4135++;
        if (arg1 != -31451) {
            field4137 = 37L;
        }
        if (arg0 == 0) {
            return new class255();
        } else if (arg0 == 1) {
            return new class330();
        } else if (arg0 == 2) {
            return new class427();
        } else if (arg0 == 3) {
            return new class33();
        } else if (arg0 == 4) {
            return new class5();
        } else if (arg0 == 5) {
            return new class177();
        } else if (arg0 == 6) {
            return new class446();
        } else if (arg0 == 7) {
            return new class252();
        } else if (arg0 == 8) {
            return new class78();
        } else if (arg0 == 9) {
            return new class62();
        } else if (arg0 == 10) {
            return new class197();
        } else if (arg0 == 11) {
            return new class99();
        } else if (arg0 == 12) {
            return new class172();
        } else if (arg0 == 13) {
            return new class226();
        } else if (arg0 == 14) {
            return new class77();
        } else if (arg0 == 15) {
            return new class69();
        } else if (arg0 == 16) {
            return new class40();
        } else if (arg0 == 17) {
            return new class248();
        } else if (arg0 == 18) {
            return new class116();
        } else if (arg0 == 19) {
            return new class267();
        } else if (arg0 == 20) {
            return new class52();
        } else if (arg0 == 21) {
            return new class386();
        } else if (arg0 == 22) {
            return new class199();
        } else if (arg0 == 23) {
            return new class118();
        } else if (arg0 == 24) {
            return new class63();
        } else if (arg0 == 25) {
            return new class200();
        } else if (arg0 == 26) {
            return new class388();
        } else if (arg0 == 27) {
            return new class163();
        } else if (arg0 == 28) {
            return new class144();
        } else if (arg0 == 29) {
            return new class8();
        } else if (arg0 == 30) {
            return new class268();
        } else if (arg0 == 31) {
            return new class473();
        } else if (arg0 == 32) {
            return new class474();
        } else if (arg0 == 33) {
            return new class126();
        } else if (arg0 == 34) {
            return new class437();
        } else if (arg0 == 35) {
            return new class328();
        } else if (arg0 == 36) {
            return new class418();
        } else if (arg0 == 37) {
            return new class487();
        } else if (arg0 == 38) {
            return new class34();
        } else if (arg0 == 39) {
            return new class195();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)I")
    public static final int method1779(byte arg0, int arg1) {
        if (arg0 != 66) {
            method1777((byte) 55);
        }
        field4147++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I")
    public static final int method1780(int arg0, int arg1) {
        int var2 = 54 % ((arg0 - 34) / 39);
        field4140++;
        return arg1 >>> 10;
    }
}
