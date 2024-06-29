import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class535 {

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public int field7866;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "Ljava/lang/String;")
    public String field7861;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "[I")
    public static int[] field7863;

    static {
        new class306("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field7865 = 0;
    }

    @OriginalMember(owner = "client!wv", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field7864++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 22)
    public static void method3171(byte arg0) {
        field7863 = null;
        if (arg0 != 7) {
            method3172(-60, 100);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V", line = 38)
    public static final void method3172(int arg0, int arg1) {
        if (arg0 != -18072) {
            field7863 = null;
        }
        field7862++;
        class266 var2 = class308.method1961(true, arg1, 7);
        var2.method1778(17991);
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 58)
    public class535(String arg0, int arg1) {
        this.field7866 = arg1;
        this.field7861 = arg0;
    }
}
