import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class149 extends class499 {

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Ljava/lang/String;")
    public String field2096;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Ljava/lang/String;")
    public String field2097;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Z")
    public boolean field2100;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Z")
    public boolean field2099;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "J")
    public long field2105;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "Lfg;")
    public static class83 field2104 = new class83("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!em", name = "y", descriptor = "Lfg;")
    public static class83 field2107 = new class83("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!em", name = "z", descriptor = "Lfg;")
    public static class83 field2108 = new class83("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!em", name = "A", descriptor = "Z")
    public static boolean field2109;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "[[I")
    public static int[][] field2110;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 6)
    public static void method948(int arg0) {
        field2107 = null;
        field2108 = null;
        if (arg0 != 20846) {
            method948(120);
        }
        field2104 = null;
        field2110 = null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 36)
    public class149(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field2101 = arg4;
        this.field2102 = arg3;
        this.field2096 = arg0;
        this.field2098 = arg2;
        this.field2097 = arg1;
        this.field2106 = arg6;
        this.field2103 = arg7;
        this.field2100 = arg8;
        this.field2099 = arg9;
        this.field2105 = arg5;
    }
}
