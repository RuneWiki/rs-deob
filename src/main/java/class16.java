import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class16 extends class337 {

    @OriginalMember(owner = "client!l", name = "p", descriptor = "[Z")
    public static boolean[] field183 = new boolean[100];

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field182 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 4)
    public static void method112(byte arg0) {
        field182 = null;
        int var1 = -79 % ((10 - arg0) / 57);
        field183 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 17)
    public static final void method113(int arg0, int arg1) {
        if (arg1 == 27766) {
            field184++;
            class338 var2 = class230.method1580(12, -1332166328, arg0);
            var2.method2052(100);
        }
    }
}
