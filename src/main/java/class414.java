import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class414 {

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field6076 = 1;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "F")
    public static float field6074 = 0.25F;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lfg;")
    public static class83 field6079;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "C")
    public char field6078;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lje;")
    public static class275 field6075;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
    public static int[] field6080;

    static {
        new class83("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field6079 = new class83("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLlh;)V", line = 5)
    public final void method2479(byte arg0, class365 arg1) {
        if (arg0 > -121) {
            return;
        }
        field6073++;
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                return;
            }
            this.method2481(var3, -8, arg1);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 43)
    public static void method2480(int arg0) {
        field6075 = null;
        if (arg0 != 2) {
            field6075 = null;
        }
        field6079 = null;
        field6080 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILlh;)V", line = 55)
    private final void method2481(int arg0, int arg1, class365 arg2) {
        int var4 = -72 % ((arg1 - 47) / 43);
        if (arg0 == 1) {
            this.field6078 = class376.method2168(arg2.method2081((byte) 101), (byte) -128);
        } else if (arg0 == 2) {
            this.field6076 = 0;
        }
        field6077++;
    }
}
