import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class288 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "J")
    public long field4555 = 0L;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lag;")
    public static class97 field4558 = new class97();

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field4566 = 0;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4564 = null;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Z")
    public static boolean field4568 = false;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lnk;")
    public static class11 field4563;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Ltk;")
    public class219 field4553;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Ltk;")
    public class219 field4557;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[I")
    public static int[] field4565;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method1929(byte arg0) {
        if (arg0 > 53) {
            field4564 = null;
            field4565 = null;
            field4563 = null;
            field4558 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1930(int arg0, String arg1) {
        field4554++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class247.field3707; var2++) {
            if (arg1.equalsIgnoreCase(class62.field1003[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method1931(int arg0) {
        field4560++;
        class161.field2332.method257(false);
        class54.field824.method257(false);
        class24.field316.method257(false);
        if (arg0 != 0) {
            field4566 = 75;
        }
    }
}
