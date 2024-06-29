import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class301 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field3830 = 0;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lws;")
    public static class333 field3832 = new class333();

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
    public static int[] field3834 = new int[32];

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1795(int arg0, int arg1, byte arg2) {
        if (arg2 <= 119) {
            return false;
        } else {
            field3831++;
            return class564.method2993(arg0, true, arg1) | (arg0 & 0x800) != 0 || class587.method3261(arg1, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method1796(int arg0) {
        if (arg0 >= -87) {
            field3834 = null;
        }
        field3834 = null;
        field3832 = null;
    }
}
