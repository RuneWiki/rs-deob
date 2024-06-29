import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class29 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static volatile int field504 = -1;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lic;")
    public static class160 field506 = new class160(64);

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field508 = "Loading interfaces - ";

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[I")
    public static int[] field509 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method256(byte arg0, String arg1) {
        field510++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 > -25) {
            return -114L;
        } else {
            for (int var5 = 0; var5 < var2; var5++) {
                var3 = (var3 << 5) + (((long) arg1.charAt(var5)) - var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIZILla;II)V")
    public static final void method257(int arg0, int arg1, boolean arg2, int arg3, class171 arg4, int arg5, int arg6) {
        if (!arg2) {
            field502++;
            class77.method624(arg4.field2887, -13057, arg6, arg0, arg4.field2849, arg1, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
    public static final void method258(int arg0, int arg1) {
        if (arg0 == 2) {
            field503++;
            class204.field3287.method1163(arg1, false);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method259(int arg0) {
        if (arg0 == 0) {
            field506 = null;
            field508 = null;
            field509 = null;
        }
    }
}
