import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class162 extends RuntimeException {

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Ljava/lang/String;")
    public String field2963;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2962;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Lhh;")
    private static class163 field2961 = class137.method1065("Checking for updates )2 ", 17);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lhh;")
    public static class163 field2960 = field2961;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Loj;")
    public static class17 field2964 = new class17(50);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static final void method1181(int arg0) {
        if (arg0 != 38) {
            method1181(107);
        }
        field2959++;
        while (true) {
            class128 var1 = class250.field4395;
            class103 var2;
            synchronized (class250.field4395) {
                var2 = (class103) class256.field4490.method1019((byte) -5);
            }
            if (var2 == null) {
                return;
            }
            var2.field1970.method144(false, true, var2.field1981, (int) var2.field2641, var2.field1976);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2964 = null;
        field2961 = null;
        int var1 = 55 / ((77 - arg0) / 48);
        field2960 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class162(Throwable arg0, String arg1) {
        this.field2963 = arg1;
        this.field2962 = arg0;
    }
}
