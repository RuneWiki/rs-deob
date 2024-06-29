import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class463 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Ltt;")
    public static class338 field6069 = new class338(53, -1);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Leba;")
    public static class550 field6070 = new class550(43, 8);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lwv;IB)Ljava/lang/String;")
    public static final String method2587(class423 arg0, int arg1, byte arg2) {
        field6068++;
        int var3 = 72 % ((62 - arg2) / 40);
        if (!client.method3858(arg0).method29(arg1, -119) && arg0.field5613 == null) {
            return null;
        } else if (arg0.field5564 == null || arg1 >= arg0.field5564.length || arg0.field5564[arg1] == null || arg0.field5564[arg1].trim().length() == 0) {
            return class452.field5967 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field5564[arg1];
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method2588(byte arg0) {
        field6069 = null;
        int var1 = -57 % ((arg0 + 33) / 36);
        field6070 = null;
    }
}
