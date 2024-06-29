import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class70 {

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lkc;")
    public static class157 field1015;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[B")
    public byte[] field1013;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[S")
    public short[] field1014;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[S")
    public short[] field1016;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[S")
    public short[] field1017;

    static {
        new class157("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        new class157("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field1015 = new class157("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 3)
    public static void method566(int arg0) {
        if (arg0 != -1389) {
            method566(38);
        }
        field1015 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ldk;Ll;I)V", line = 13)
    public static final void method567(class421 arg0, class127 arg1, int arg2) {
        class423.field6147 = arg1;
        class399.field5723 = arg0;
        field1011++;
        if (arg2 != 28806) {
            method567(null, null, -27);
        }
    }
}
