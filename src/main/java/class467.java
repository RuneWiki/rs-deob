import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class467 {

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "Ljv;")
    public static class73 field6280 = new class73("", 11);

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "Ldb;")
    public static class298 field6282 = new class298(14, -2);

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "[Ld;")
    public static class139[] field6283;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 5)
    public static void method2634(int arg0) {
        field6280 = null;
        if (arg0 != -2) {
            method2634(62);
        }
        field6282 = null;
        field6283 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILgba;)Lgba;", line = 29)
    public static final class625 method2635(int arg0, class625 arg1) {
        field6281++;
        class625 var2 = client.method1702(arg1);
        if (var2 == null) {
            var2 = arg1.field8319;
        }
        int var3 = -102 % ((arg0 + 61) / 42);
        return var2;
    }
}
