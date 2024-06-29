import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class400 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field5373 = -1;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lvj;")
    public static class304 field5372 = new class304("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method2329(int arg0) {
        if (arg0 != -1) {
            method2329(-38);
        }
        field5372 = null;
    }
}
