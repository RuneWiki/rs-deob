import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class15 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field234 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Lbd;")
    public static class162 field235 = class17.method142(0, "Versteckt");

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "S")
    public static short field236 = 1;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Z")
    public static boolean field233;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 4)
    public static void method120(byte arg0) {
        field235 = null;
        if (arg0 != -27) {
            method121(75, 70);
        }
        field234 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V", line = 33)
    public static final void method121(int arg0, int arg1) {
        class172.field2984 = arg1;
        field237++;
        class255.field4226 = 50;
        if (arg0 != 1) {
            method121(-18, -32);
        }
    }
}
