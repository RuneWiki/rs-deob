import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class351 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public int field5557 = 0;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public int field5564 = 2048;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public int field5565 = 2048;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public int field5566 = 0;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5559 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field5561 = 0;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5560 = "K";

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lpi;II)V", line = 8)
    public final void method2444(class336 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method2364(-9069);
            if (var4 == 0) {
                if (arg2 >= -86) {
                    this.field5557 = 95;
                }
                field5558++;
                return;
            }
            this.method2447(-2, arg0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZI)V", line = 26)
    public static final void method2445(int arg0, boolean arg1, int arg2) {
        class30 var3 = class99.method857((byte) -85, arg0, 1);
        var3.method277(arg1);
        field5562++;
        var3.field438 = arg2;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 44)
    public static final void method2446(int arg0) {
        class329.field5247 = true;
        if (arg0 <= 12) {
            field5559 = (String[]) null;
        }
        field5555++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILpi;II)V", line = 59)
    private final void method2447(int arg0, class336 arg1, int arg2, int arg3) {
        if (~arg3 == arg0) {
            this.field5557 = arg1.method2364(-9069);
        } else if (arg3 == 2) {
            this.field5564 = arg1.method2339((byte) -46);
        } else if (arg3 == 3) {
            this.field5565 = arg1.method2339((byte) -46);
        } else if (arg3 == 4) {
            this.field5566 = arg1.method2326(51);
        }
        field5563++;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 93)
    public static final void method2448(int arg0) {
        class113.field1884++;
        if (arg0 <= 82) {
            method2448(102);
        }
        field5556++;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 115)
    public static void method2449(int arg0) {
        if (arg0 == 2048) {
            field5560 = null;
            field5559 = null;
        }
    }
}
