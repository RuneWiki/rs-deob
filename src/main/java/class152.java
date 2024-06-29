import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class152 extends class499 {

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lwo;")
    public class522 field2134 = new class522();

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lfg;")
    public static class83 field2133 = new class83("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field2136 = 0;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lrs;")
    public static class462 field2135;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lmr;")
    public static class95 field2137;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILna;)V", line = 5)
    public static final void method959(int arg0, class35 arg1) {
        class383.field5391[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 8)
    public static void method960(int arg0) {
        field2133 = null;
        field2135 = null;
        if (arg0 != 0) {
            method960(-43);
        }
        field2137 = null;
    }
}
