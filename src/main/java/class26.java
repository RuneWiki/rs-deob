import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class26 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "[I")
    public static int[] field335 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field338 = "Loading title screen - ";

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Lhl;")
    public static class108 field337 = new class108(0, -1);

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field340 = "Loading fonts - ";

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lcb;")
    public static class37 field339 = class128.method869(10);

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field341 = -1;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[Lng;")
    public static class245[] field342;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 15)
    public static void method205(boolean arg0) {
        field335 = null;
        field337 = null;
        field340 = null;
        field342 = null;
        field339 = null;
        field338 = null;
        if (arg0) {
            method205(false);
        }
    }
}
