import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class42 extends class354 {

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public int field677 = (int) (class375.method2397((byte) -75) / 1000L);

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "S")
    public short field678;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Ljava/lang/String;")
    public String field674;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field676 = 0;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "[I")
    public static int[] field675 = new int[2];

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public static void method280(byte arg0) {
        field675 = null;
        if (arg0 != 26) {
            field676 = -25;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class42(String arg0, int arg1) {
        this.field678 = (short) arg1;
        this.field674 = arg0;
    }

    static {
        new class179("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        new class179("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}
