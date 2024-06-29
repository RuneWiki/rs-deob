import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class379 {

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field5338 = new Random();

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Ltq;")
    public static class376 field5340;

    static {
        new class362("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method2442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5336++;
        class20 var5 = class369.method2351((byte) 81, 8, arg4);
        var5.method146(100);
        var5.field258 = arg2;
        var5.field252 = arg1;
        var5.field255 = arg3;
        if (arg0 > -36) {
            field5338 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 30)
    public static void method2443(byte arg0) {
        field5340 = null;
        if (arg0 > -105) {
            field5338 = null;
        }
        field5338 = null;
    }
}
