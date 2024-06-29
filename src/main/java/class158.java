import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class158 {

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field2451 = 0;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
    public static boolean field2447 = false;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "[I")
    public static int[] field2454 = new int[14];

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lug;")
    public static class253 field2445;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Lug;")
    public static class253 field2456;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1146(boolean arg0) {
        field2456 = null;
        field2454 = null;
        field2445 = null;
        if (!arg0) {
            field2455 = -32;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lvl;I)Ljava/lang/String;", line = 19)
    public static final String method1147(class6 arg0, int arg1) {
        field2450++;
        if (arg1 != -8748) {
            field2454 = (int[]) null;
        }
        return class153.method1117(32767, 6264, arg0);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I", line = 33)
    public static final int method1148(int arg0, byte arg1) {
        field2449++;
        if (arg1 < 126) {
            field2447 = true;
        }
        return arg0 & 0xFF;
    }
}
