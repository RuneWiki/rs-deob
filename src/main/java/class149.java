import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class149 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
    public static boolean field1921 = true;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1923 = 0;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lmba;")
    public static class203 field1922 = new class203();

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method877(byte[] arg0, boolean arg1, int arg2) {
        field1924++;
        if (arg0 == null) {
            return null;
        } else if (arg2 < 103) {
            return null;
        } else {
            if (arg0.length > 136 && !class163.field2174) {
                try {
                    class282 var3 = (class282) Class.forName("cl").getDeclaredConstructor().newInstance();
                    var3.method428(-1, arg0);
                    return var3;
                } catch (Throwable var4) {
                    class163.field2174 = true;
                }
            }
            return arg1 ? class292.method1815(arg0, (byte) -85) : arg0;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method878(byte arg0) {
        if (arg0 != 114) {
            field1923 = 28;
        }
        field1922 = null;
    }
}
