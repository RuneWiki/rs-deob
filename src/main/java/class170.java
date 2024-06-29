import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class170 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Z")
    public static boolean field2953 = false;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2959 = 0;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "F")
    public static float field2960;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BZB)Ljava/lang/Object;", line = 6)
    public static final Object method1310(byte[] arg0, boolean arg1, byte arg2) {
        field2955++;
        if (arg2 < 53) {
            return (Object) null;
        } else if (arg0 == null) {
            return null;
        } else {
            if (arg0.length > 136 && !class142.field2528) {
                try {
                    class13 var3 = (class13) Class.forName("me").getDeclaredConstructor().newInstance();
                    var3.method112(119, arg0);
                    return var3;
                } catch (Throwable var5) {
                    class142.field2528 = true;
                }
            }
            return arg1 ? class303.method2064(arg0, (byte) 115) : arg0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)Z", line = 44)
    public static final boolean method1311(int arg0, byte arg1) {
        if (arg1 != 6) {
            return true;
        }
        field2954++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lob;I)Lob;", line = 79)
    public static final class78 method1312(class78 arg0, int arg1) {
        field2957++;
        if (~arg0.field1371 != arg1) {
            return class61.method419((byte) 28, arg0.field1371);
        }
        int var2 = arg0.field1235 >>> 16;
        class224 var3 = new class224(class137.field2440);
        for (class172 var4 = (class172) var3.method1621(0); var4 != null; var4 = (class172) var3.method1624(true)) {
            if (var4.field2985 == var2) {
                return class61.method419((byte) 28, (int) var4.field2701);
            }
        }
        return null;
    }
}
