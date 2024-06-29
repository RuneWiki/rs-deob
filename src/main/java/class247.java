import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class247 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "[I")
    public static int[] field3654;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lef;")
    public static class311 field3655;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Ldk;")
    public static class326 field3657;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[[I")
    public static int[][] field3658;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method1547(int arg0) {
        field3658 = null;
        field3654 = null;
        int var1 = -112 / ((-arg0 - 31) / 39);
        field3657 = null;
        field3655 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static final void method1548(byte arg0) {
        if (arg0 <= 61) {
            field3657 = null;
        }
        field3653++;
        if (class164.field2427 == null) {
            return;
        }
        if (class164.field2427.field5253 == 1) {
            class164.field2427 = null;
            return;
        }
        if (class164.field2427.field5253 == 2) {
            class491.method2880(class277.field4076, 2, class277.field4085, -4);
            class164.field2427 = null;
            return;
        }
    }

    static {
        new class326("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field3654 = new int[] { 1, -1, -1, 1 };
        field3655 = new class311(3, 15);
        field3657 = new class326("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");
    }
}
