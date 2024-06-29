import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class137 {

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lqu;")
    public static class364 field1817 = new class364(5, 4);

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "Lnj;")
    public static class487 field1818 = new class487("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([II[Ljava/lang/Object;)V", line = 6)
    public static final void method840(int[] arg0, int arg1, Object[] arg2) {
        class304.method1872(arg2, arg1, arg0, arg0.length - 1, arg1 + 112);
        field1815++;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 19)
    public static void method841(int arg0) {
        field1817 = null;
        field1818 = null;
        int var1 = 64 % ((arg0 - 35) / 59);
    }
}
