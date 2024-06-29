import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class332 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lva;")
    public static class500 field4256 = new class500(0, 0);

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4261 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public int field4258;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lwu;")
    public static class557 field4260;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 4)
    public static void method1926(int arg0) {
        if (arg0 == 0) {
            field4256 = null;
            field4260 = null;
            field4261 = null;
        }
    }
}
