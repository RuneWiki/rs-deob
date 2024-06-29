import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class286 {

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field4097 = 50;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4093 = new String[field4097];

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
    public static int[] field4094 = new int[field4097];

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[I")
    public static int[] field4099 = new int[field4097];

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "[I")
    public static int[] field4098 = new int[field4097];

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[I")
    public static int[] field4095 = new int[field4097];

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field4101 = 0;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[I")
    public static int[] field4092 = new int[field4097];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
    public static int[] field4091 = new int[field4097];

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 9)
    public static void method1848(byte arg0) {
        field4099 = null;
        field4093 = null;
        field4095 = null;
        field4094 = null;
        field4098 = null;
        if (arg0 == 120) {
            field4091 = null;
            field4092 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V", line = 27)
    public static final void method1849(byte arg0) {
        if (arg0 < 11) {
            field4094 = null;
        }
        class535 var1 = class645.field8686;
        synchronized (class645.field8686) {
            class645.field8686.method3103(-11294);
        }
        field4102++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z", line = 45)
    public static final boolean method1850(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field4092 = null;
        }
        field4096++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 62)
    public static final void method1851(int arg0) {
        class592.field8097 = null;
        class554.field7641 = null;
        field4100++;
        if (arg0 != 2647) {
            method1851(-46);
        }
    }
}
