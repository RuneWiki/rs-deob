import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class165 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Ljava/lang/String;")
    public String field2102;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field2105 = 0;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2107 = 4;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lub;")
    public static class18 field2100 = new class18();

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!ae", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2103++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1069(int arg0) {
        field2100 = null;
        if (arg0 != 100) {
            field2106 = 19;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
    public static final void method1070(boolean arg0, int arg1) {
        if (!arg0) {
            method1070(false, -48);
        }
        class24.field352 = arg1;
        class118.field1593 = 3;
        class50.field664 = -1;
        class298.field3833 = 100;
        field2101++;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class165(String arg0, int arg1) {
        this.field2102 = arg0;
        this.field2104 = arg1;
    }

    static {
        new class335("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }
}
