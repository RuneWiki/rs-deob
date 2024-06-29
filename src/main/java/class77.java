import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class77 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lsg;")
    public static class169 field1446 = class165.method1060("Benutzername: ", 1536);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lsg;")
    public static class169 field1447 = class165.method1060("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 1536);

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lsg;")
    public static class169 field1448 = class165.method1060("Bitte entfernen Sie ", 1536);

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILig;)V")
    public static final void method470(int arg0, class79 arg1) {
        arg1.field1467 = false;
        if (arg0 != 0) {
            method471(-1);
        }
        if (arg1.field1468 != null) {
            arg1.field1468.field712 = 0;
        }
        field1453++;
        for (class79 var2 = arg1.method480(); var2 != null; var2 = arg1.method481()) {
            method470(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method471(int arg0) {
        field1448 = null;
        field1447 = null;
        int var1 = 26 / ((39 - arg0) / 54);
        field1446 = null;
    }
}
