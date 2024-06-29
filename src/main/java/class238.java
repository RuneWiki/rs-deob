import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class238 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Z")
    public static boolean field3729 = false;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3728 = 0;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static volatile int field3732 = 0;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lvi;")
    public static class240 field3731;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 5)
    public static void method1702(int arg0) {
        if (arg0 != 7400) {
            field3731 = (class240) null;
        }
        field3731 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Ll;", line = 48)
    public static final class10 method1703(int arg0, int arg1) {
        class10 var2 = (class10) class332.field5174.method1351((long) arg1, 63);
        field3727++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field2252.method1813(arg1, 4, true);
        class10 var4 = new class10();
        if (var3 != null) {
            var4.method129(new class6(var3), false, arg1);
        }
        if (arg0 != 29555) {
            method1702(117);
        }
        class332.field5174.method1347(var4, (long) arg1, (byte) -108);
        return var4;
    }
}
