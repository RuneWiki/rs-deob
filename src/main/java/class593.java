import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class593 extends class62 {

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Lada;")
    public static class144 field8767;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class593() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        field8769++;
        return arg1 == 656024161 ? class200.field2965 : null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method3517(byte arg0) {
        if (arg0 == -43) {
            field8767 = null;
        }
    }

    static {
        new class572("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field8767 = new class144(29, 5);
        field8768 = -2;
    }
}
