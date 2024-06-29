import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class64 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Luf;")
    public static class168 field855 = class148.method1019(-1720, "<col=ff9040>");

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Luf;")
    public static class168 field862 = class148.method1019(-1720, "Abbrechen");

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Luf;")
    public static class168 field860 = class148.method1019(-1720, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Luf;")
    private static class168 field859 = class148.method1019(-1720, "Loaded config");

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Luf;")
    public static class168 field857 = field859;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lej;")
    public static class204 field856 = new class204(100);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V", line = 7)
    public static final void method367(int arg0, int arg1, int arg2, int arg3) {
        field858++;
        int var4 = 67 / ((-arg2 - 21) / 33);
        class242 var5 = class263.method1834(arg3, 2, arg1);
        if (var5 != null && var5.field4062 != null) {
            class182 var6 = new class182();
            var6.field2928 = var5;
            var6.field2919 = var5.field4062;
            class177.method1270(var6, (byte) -31);
        }
        class298.field5055 = arg0;
        class280.field4710 = arg3;
        class111.field1740 = true;
        class156.field2466 = arg1;
        client.method2011((byte) -59, var5);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)V", line = 41)
    public static final void method368(int arg0, int arg1, int arg2, int arg3) {
        class127 var4 = class92.field1424[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class40 var5 = var4.field1979;
        if (var5 != null) {
            var5.field496 = var5.field496 * arg3 / 16;
            var5.field505 = var5.field505 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 71)
    public static void method369(int arg0) {
        field856 = null;
        field862 = null;
        field860 = null;
        if (arg0 == 100) {
            field855 = null;
            field857 = null;
            field859 = null;
        }
    }
}
