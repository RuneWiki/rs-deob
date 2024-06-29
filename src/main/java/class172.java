import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class172 extends class108 {

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Ljava/lang/String;")
    public String field2499;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[[I")
    public static int[][] field2498 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "J")
    public static long field2500;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[Lha;")
    public static class116[] field2496;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1185(byte arg0) {
        field2496 = null;
        if (arg0 > -91) {
            field2498 = null;
        }
        field2498 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    public static final int method1186(int arg0, int arg1) {
        if (arg0 != 255) {
            method1185((byte) 104);
        }
        field2497++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class172() {
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class172(String arg0) {
        this.field2499 = arg0;
    }

    static {
        new class567("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
    }
}
