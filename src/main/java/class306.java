import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class306 {

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4378 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field4385 = 0;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4389 = "K";

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public int field4374;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field4379;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field4380;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "[I")
    public static int[] field4387;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)V")
    public static final void method1917(byte arg0, int arg1) {
        class35.field344 = arg1;
        if (arg0 >= -112) {
            return;
        }
        field4381++;
        class331 var2 = class193.field2629;
        synchronized (class193.field2629) {
            class193.field2629.method2043(-29);
        }
        class331 var3 = client.field2307;
        synchronized (client.field2307) {
            client.field2307.method2043(-23);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method1918(byte arg0) {
        field4389 = null;
        field4387 = null;
        if (arg0 != -26) {
            field4385 = 101;
        }
        field4378 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
    public static final void method1919(int arg0, boolean arg1) {
        field4386++;
        if (class30.field272 == 0) {
            class443.field6477.method1670(481, arg0);
        } else {
            class246.field3349 = arg0;
        }
        if (arg1) {
            field4385 = -124;
        }
    }
}
