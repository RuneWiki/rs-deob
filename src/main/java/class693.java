import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class693 {

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "Lll;")
    public static class384 field9223;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
    public static int[] field9221;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)I", line = 4)
    public static final int method3780(int arg0, int arg1, int arg2) {
        field9226++;
        if (arg2 != -441893025) {
            method3780(-21, -75, 58);
        }
        int var3 = arg0 >> 31 & arg1 - 1;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V", line = 19)
    public static void method3781(int arg0) {
        if (arg0 != -441893025) {
            method3780(79, 79, 103);
        }
        field9223 = null;
        field9221 = null;
    }
}
