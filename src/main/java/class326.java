import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class326 {

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
    public static int[] field4899 = new int[128];

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lth;")
    public static class57 field4898 = new class57(64);

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field4901 = 0;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Lph;")
    public static class361 field4900;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method2253(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4896++;
        class95 var5 = class227.method1699(arg4, -1855723168, arg1);
        var5.method738((byte) -116);
        var5.field1328 = arg3;
        var5.field1331 = arg0;
        var5.field1329 = arg2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I", line = 21)
    public static final int method2254(int arg0, int arg1) {
        if (arg0 == 64) {
            field4897++;
            return arg1 >>> 10;
        } else {
            return 116;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V", line = 33)
    public static void method2255(boolean arg0) {
        if (arg0) {
            field4901 = 42;
        }
        field4898 = null;
        field4900 = null;
        field4899 = null;
    }
}
