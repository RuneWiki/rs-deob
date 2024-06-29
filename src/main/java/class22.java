import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class22 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Z")
    public static boolean field335 = false;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field332 = -1;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field337 = 0;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field341 = 0;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Laj;")
    public static class210 field340;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lvf;")
    public static class42 field339;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 21)
    public static void method130(int arg0) {
        field339 = null;
        if (arg0 != -16357) {
            field338 = 20;
        }
        field340 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[BI)I", line = 40)
    public static final int method131(int arg0, byte[] arg1, int arg2) {
        field333++;
        int var3 = -51 / ((arg2) / 34);
        return class206.method1505(arg1, arg0, -6399, 0);
    }
}
