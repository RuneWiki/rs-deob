import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class318 {

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public int field4554 = 2048;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public int field4556 = 0;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public int field4552 = 0;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public int field4548 = 2048;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field4550 = 0;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4553 = null;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4555;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I", line = 4)
    public static final int method1993(byte arg0) {
        field4551++;
        return arg0 <= 51 ? -3 : 6;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lti;IB)V", line = 21)
    private final void method1994(class303 arg0, int arg1, byte arg2) {
        field4547++;
        if (arg2 >= -47) {
            return;
        }
        if (arg1 == 1) {
            this.field4556 = arg0.method1918((byte) 76);
        } else if (arg1 == 2) {
            this.field4554 = arg0.method1868(0);
        } else if (arg1 == 3) {
            this.field4548 = arg0.method1868(0);
            return;
        } else if (arg1 == 4) {
            this.field4552 = arg0.method1901(126);
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 49)
    public static void method1995(byte arg0) {
        field4555 = null;
        if (arg0 >= -40) {
            method1995((byte) -75);
        }
        field4553 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lti;Z)V", line = 71)
    public final void method1996(class303 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1918((byte) -101);
            if (var3 == 0) {
                field4549++;
                if (arg1) {
                    this.method1994(null, -66, (byte) -122);
                    return;
                }
                return;
            }
            this.method1994(arg0, var3, (byte) -126);
        }
    }
}
