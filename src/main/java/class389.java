import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class389 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Lqu;")
    public static class219 field5926 = new class219(40, 3);

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "Lbi;")
    public static class104 field5928 = new class104(10, -2);

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Lru;")
    public static class177 field5929 = new class177(32);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5927;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)Lmo;")
    public static final class371 method2493(boolean arg0, int arg1) {
        field5925++;
        class371 var2 = (class371) class242.field3933.method2191((byte) -73, (long) arg1);
        if (!arg0) {
            field5928 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class452.field7016.method1004(0, false, arg1);
        class371 var4 = new class371();
        if (var3 != null) {
            var4.method2416(arg1, (byte) -70, new class208(var3));
        }
        class242.field3933.method2188(-127, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static void method2494(int arg0) {
        field5928 = null;
        if (arg0 != 10) {
            field5928 = null;
        }
        field5929 = null;
        field5926 = null;
        field5927 = null;
    }
}
