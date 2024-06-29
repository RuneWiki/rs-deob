import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class307 {

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field4691 = -1;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "Z")
    public static boolean field4694 = false;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIB)V")
    public static final void method2011(int arg0, int arg1, int arg2, byte arg3) {
        field4690++;
        int var4 = class443.field6623.field594 * arg2 >> 8;
        if (var4 != 0 && arg1 != -1) {
            class3.method30(0, 9576, var4, false, arg1, class285.field4069);
            class217.field3129 = true;
        }
        if (arg3 < 25) {
            method2011(4, 9, 25, (byte) 43);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIZI)V")
    public static final void method2012(int arg0, int arg1, boolean arg2, int arg3) {
        class410.field6141.method1117(arg3, (byte) 12);
        if (!arg2) {
            field4691 = -19;
        }
        field4692++;
        class410.field6141.method1080(arg1, 126);
        class410.field6141.method1080(arg0, 124);
    }
}
