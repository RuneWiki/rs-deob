import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class136 {

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "[I")
    public int[] field1693;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "[I")
    public int[] field1694;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "[Z")
    public static boolean[] field1692 = new boolean[100];

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "[[B")
    public static byte[][] field1696;

    static {
        new class474("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 3)
    public static void method828(int arg0) {
        if (arg0 != 14955) {
            field1692 = null;
        }
        field1692 = null;
        field1696 = null;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(I)V", line = 25)
    public class136(int arg0) {
        this.field1695 = arg0;
        this.field1693 = new int[this.field1695];
        this.field1694 = new int[this.field1695];
    }
}
