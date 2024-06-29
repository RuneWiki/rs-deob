import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class61 {

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Z")
    public boolean field1068 = true;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lpi;")
    public static class342 field1069 = new class342("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[Lge;")
    public static class499[] field1072 = new class499[6];

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "J")
    public static long field1071 = 0L;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Z")
    public static boolean field1073 = false;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "C")
    private char field1064;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lgv;")
    public static class56 field1070;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Ljava/lang/String;")
    public String field1065;

    static {
        new class342("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lcu;I)V", line = 3)
    public final void method530(class145 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1063((byte) 122);
            if (var3 == 0) {
                field1067++;
                if (arg1 != -1) {
                    this.field1068 = false;
                    return;
                }
                return;
            }
            this.method531(var3, -125, arg0);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILcu;)V", line = 25)
    private final void method531(int arg0, int arg1, class145 arg2) {
        field1066++;
        if (arg1 > -124) {
            this.method530(null, -35);
        }
        if (arg0 == 1) {
            this.field1064 = class305.method1999(arg2.method1093(15), (byte) 35);
        } else if (arg0 == 2) {
            this.field1062 = arg2.method1070(-32387);
        } else if (arg0 == 4) {
            this.field1068 = false;
        } else if (arg0 == 5) {
            this.field1065 = arg2.method1101((byte) -93);
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Z", line = 57)
    public final boolean method532(int arg0) {
        field1063++;
        if (arg0 == -7509) {
            return this.field1064 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 68)
    public static void method533(byte arg0) {
        field1069 = null;
        field1070 = null;
        field1072 = null;
        int var1 = 59 / ((arg0 + 27) / 37);
    }
}
