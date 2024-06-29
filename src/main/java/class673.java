import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class673 extends class133 {

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "I")
    public static int field9466;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "Lnu;")
    public static class619 field9465;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IBI)Loga;", line = 8)
    public static final class502 method3745(int arg0, byte arg1, int arg2) {
        field9466++;
        class502 var3 = new class502();
        var3.field6954 = arg0 + 5 + 1;
        var3.field6941 = -1;
        var3.field6935 = -1;
        var3.field6948 = arg2 + 5 + 1;
        var3.field6957 = new int[var3.field6954][var3.field6948];
        if (arg1 >= -82) {
            return null;
        } else {
            var3.method2913(2097152);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)V", line = 27)
    public static void method3746(int arg0) {
        int var1 = 77 / (-arg0 / 42);
        field9465 = null;
    }
}
