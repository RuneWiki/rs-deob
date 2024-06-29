import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class112 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[S")
    public static short[] field1904 = new short[256];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field1902 = 0;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lwa;")
    private static class75 field1908 = class66.method560("Loaded update list", false);

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lwa;")
    public static class75 field1912 = class66.method560("Nehmen", false);

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
    public static int[] field1910 = new int[200];

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lwa;")
    public static class75 field1911 = field1908;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
    public static int[] field1905;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 10)
    public static void method868(int arg0) {
        field1910 = null;
        field1912 = null;
        field1908 = null;
        field1904 = null;
        field1905 = null;
        if (arg0 == 30507) {
            field1911 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lwa;Lcb;I)Lva;", line = 25)
    public static final class137 method869(class75 arg0, class267 arg1, int arg2) {
        field1903++;
        int var3 = arg1.method1915(-15621, arg0);
        if (var3 == -1) {
            return new class137(0);
        }
        int[] var4 = arg1.method1903(100, var3);
        class137 var5 = new class137(var4.length);
        if (arg2 != 8958) {
            return (class137) null;
        }
        for (int var6 = 0; var6 < var5.field2344; var6++) {
            class60 var7 = new class60(arg1.method1911(var3, var4[var6], -72));
            var5.field2350[var6] = var7.method532(-1);
            var5.field2349[var6] = var7.method511(-128);
            var5.field2341[var6] = (short) var7.method485((byte) -2);
            var5.field2352[var6] = (short) var7.method485((byte) -2);
            var5.field2340[var6] = var7.method505(arg2 - 8703);
        }
        return var5;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIZIIIIIII)Z", line = 91)
    public static final boolean method870(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1907++;
        if (arg2 < 101) {
            method869((class75) null, (class267) null, 25);
        }
        if (class279.field4831.method739(0) == 2) {
            return class240.method1752(arg6, arg9, arg0, arg7, arg10, -11105, arg11, arg4, arg8, arg1, arg3, arg5);
        } else if (class279.field4831.method739(0) <= 2) {
            return class188.method1420(arg8, arg0, arg4, arg11, arg3, arg6, arg9, arg7, arg5, arg1, 3, arg10);
        } else {
            return class217.method1592(arg0, arg10, arg4, arg5, arg1, arg6, arg3, arg9, arg8, -11, arg11, arg7, class279.field4831.method739(0));
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([BB)V")
    public abstract void method178(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)[B")
    public abstract byte[] method179(byte arg0);
}
