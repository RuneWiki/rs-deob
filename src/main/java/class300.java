import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class300 extends class206 {

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public int field5134;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public int field5138;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5128 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Lwa;")
    private static class75 field5131 = class66.method560("Allocated memory", false);

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Lwa;")
    public static class75 field5133 = field5131;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "Lwa;")
    public static class75 field5136 = class66.method560("", false);

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Lwa;")
    public static class75 field5132 = class66.method560("k", false);

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Lwa;")
    public static class75 field5130 = class66.method560("(Z", false);

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 12)
    public static void method2066(boolean arg0) {
        field5132 = null;
        if (!arg0) {
            return;
        }
        field5128 = null;
        field5133 = null;
        field5130 = null;
        field5136 = null;
        field5131 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V", line = 57)
    public class300(int arg0, int arg1) {
        this.field5134 = arg1;
        this.field5138 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)Z", line = 70)
    public static final boolean method2067(int arg0) {
        field5135++;
        return arg0 == -12461;
    }
}
