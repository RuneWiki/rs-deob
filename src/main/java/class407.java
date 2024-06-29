import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class407 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public static int[] field5713 = new int[5];

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lus;")
    public static class1 field5714 = new class1(50, 6);

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Ldk;")
    public static class326 field5715 = new class326("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lb;")
    public static class201 field5716;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lkj;")
    public static class366 field5712;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method2408(boolean arg0) {
        field5716 = null;
        field5715 = null;
        field5712 = null;
        if (!arg0) {
            field5713 = null;
            field5714 = null;
        }
    }
}
