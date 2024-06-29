import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class479 {

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Lpi;")
    public static class342 field7134 = new class342("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "J")
    public static long field7137 = 0L;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "[I")
    public static int[] field7136 = new int[5];

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field7138 = 0;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static void method2856(byte arg0) {
        field7136 = null;
        field7134 = null;
        if (arg0 != 19) {
            method2857(118, 59, false);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)V")
    public static final void method2857(int arg0, int arg1, boolean arg2) {
        field7135++;
        class54 var3 = class442.method2651(arg0, 16, -13208);
        var3.method480(0);
        if (!arg2) {
            method2856((byte) -38);
        }
        var3.field934 = arg1;
    }
}
