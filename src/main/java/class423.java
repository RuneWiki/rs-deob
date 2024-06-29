import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class423 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "J")
    public static long field6234 = 0L;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
    public static boolean field6233 = true;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static volatile int field6235 = -1;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field6237 = "Prepared sound engine";

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field6238 = 2;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 8)
    public static void method2699(byte arg0) {
        int var1 = -33 / ((arg0 + 6) / 32);
        field6237 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z", line = 26)
    public static final boolean method2700(int arg0) {
        field6236++;
        if (arg0 != 2) {
            method2699((byte) -18);
        }
        return class315.field4609;
    }
}
